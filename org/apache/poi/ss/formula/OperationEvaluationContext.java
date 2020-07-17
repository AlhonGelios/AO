package org.apache.poi.ss.formula;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment;
import org.apache.poi.ss.formula.EvaluationName;
import org.apache.poi.ss.formula.EvaluationTracker;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.ExternSheetReferenceToken;
import org.apache.poi.ss.formula.FormulaParsingWorkbook;
import org.apache.poi.ss.formula.LazyAreaEval;
import org.apache.poi.ss.formula.LazyRefEval;
import org.apache.poi.ss.formula.SheetRangeEvaluator;
import org.apache.poi.ss.formula.SheetRefEvaluator;
import org.apache.poi.ss.formula.UserDefinedFunction;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.ExternalNameEval;
import org.apache.poi.ss.formula.eval.FunctionNameEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.Area3DPxg;
import org.apache.poi.ss.formula.ptg.NameXPtg;
import org.apache.poi.ss.formula.ptg.NameXPxg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.ptg.Ref3DPxg;
import org.apache.poi.ss.util.CellReference;

public final class OperationEvaluationContext {

   public static final FreeRefFunction UDF = UserDefinedFunction.instance;
   private final EvaluationWorkbook _workbook;
   private final int _sheetIndex;
   private final int _rowIndex;
   private final int _columnIndex;
   private final EvaluationTracker _tracker;
   private final WorkbookEvaluator _bookEvaluator;


   public OperationEvaluationContext(WorkbookEvaluator bookEvaluator, EvaluationWorkbook workbook, int sheetIndex, int srcRowNum, int srcColNum, EvaluationTracker tracker) {
      this._bookEvaluator = bookEvaluator;
      this._workbook = workbook;
      this._sheetIndex = sheetIndex;
      this._rowIndex = srcRowNum;
      this._columnIndex = srcColNum;
      this._tracker = tracker;
   }

   public EvaluationWorkbook getWorkbook() {
      return this._workbook;
   }

   public int getRowIndex() {
      return this._rowIndex;
   }

   public int getColumnIndex() {
      return this._columnIndex;
   }

   SheetRangeEvaluator createExternSheetRefEvaluator(ExternSheetReferenceToken ptg) {
      return this.createExternSheetRefEvaluator(ptg.getExternSheetIndex());
   }

   SheetRangeEvaluator createExternSheetRefEvaluator(String firstSheetName, String lastSheetName, int externalWorkbookNumber) {
      EvaluationWorkbook.ExternalSheet externalSheet = this._workbook.getExternalSheet(firstSheetName, lastSheetName, externalWorkbookNumber);
      return this.createExternSheetRefEvaluator(externalSheet);
   }

   SheetRangeEvaluator createExternSheetRefEvaluator(int externSheetIndex) {
      EvaluationWorkbook.ExternalSheet externalSheet = this._workbook.getExternalSheet(externSheetIndex);
      return this.createExternSheetRefEvaluator(externalSheet);
   }

   SheetRangeEvaluator createExternSheetRefEvaluator(EvaluationWorkbook.ExternalSheet externalSheet) {
      int otherLastSheetIndex = -1;
      WorkbookEvaluator targetEvaluator;
      int otherFirstSheetIndex;
      String evals;
      if(externalSheet != null && externalSheet.getWorkbookName() != null) {
         evals = externalSheet.getWorkbookName();

         try {
            targetEvaluator = this._bookEvaluator.getOtherWorkbookEvaluator(evals);
         } catch (CollaboratingWorkbooksEnvironment.WorkbookNotFoundException var8) {
            throw new RuntimeException(var8.getMessage(), var8);
         }

         otherFirstSheetIndex = targetEvaluator.getSheetIndex(externalSheet.getSheetName());
         if(externalSheet instanceof EvaluationWorkbook.ExternalSheetRange) {
            String i = ((EvaluationWorkbook.ExternalSheetRange)externalSheet).getLastSheetName();
            otherLastSheetIndex = targetEvaluator.getSheetIndex(i);
         }

         if(otherFirstSheetIndex < 0) {
            throw new RuntimeException("Invalid sheet name \'" + externalSheet.getSheetName() + "\' in bool \'" + evals + "\'.");
         }
      } else {
         targetEvaluator = this._bookEvaluator;
         if(externalSheet == null) {
            otherFirstSheetIndex = 0;
         } else {
            otherFirstSheetIndex = this._workbook.getSheetIndex(externalSheet.getSheetName());
         }

         if(externalSheet instanceof EvaluationWorkbook.ExternalSheetRange) {
            evals = ((EvaluationWorkbook.ExternalSheetRange)externalSheet).getLastSheetName();
            otherLastSheetIndex = this._workbook.getSheetIndex(evals);
         }
      }

      if(otherLastSheetIndex == -1) {
         otherLastSheetIndex = otherFirstSheetIndex;
      }

      SheetRefEvaluator[] var9 = new SheetRefEvaluator[otherLastSheetIndex - otherFirstSheetIndex + 1];

      for(int var10 = 0; var10 < var9.length; ++var10) {
         int otherSheetIndex = var10 + otherFirstSheetIndex;
         var9[var10] = new SheetRefEvaluator(targetEvaluator, this._tracker, otherSheetIndex);
      }

      return new SheetRangeEvaluator(otherFirstSheetIndex, otherLastSheetIndex, var9);
   }

   private SheetRefEvaluator createExternSheetRefEvaluator(String workbookName, String sheetName) {
      WorkbookEvaluator targetEvaluator;
      if(workbookName == null) {
         targetEvaluator = this._bookEvaluator;
      } else {
         if(sheetName == null) {
            throw new IllegalArgumentException("sheetName must not be null if workbookName is provided");
         }

         try {
            targetEvaluator = this._bookEvaluator.getOtherWorkbookEvaluator(workbookName);
         } catch (CollaboratingWorkbooksEnvironment.WorkbookNotFoundException var5) {
            return null;
         }
      }

      int otherSheetIndex = sheetName == null?this._sheetIndex:targetEvaluator.getSheetIndex(sheetName);
      return otherSheetIndex < 0?null:new SheetRefEvaluator(targetEvaluator, this._tracker, otherSheetIndex);
   }

   public SheetRangeEvaluator getRefEvaluatorForCurrentSheet() {
      SheetRefEvaluator sre = new SheetRefEvaluator(this._bookEvaluator, this._tracker, this._sheetIndex);
      return new SheetRangeEvaluator(this._sheetIndex, sre);
   }

   public ValueEval getDynamicReference(String workbookName, String sheetName, String refStrPart1, String refStrPart2, boolean isA1Style) {
      if(!isA1Style) {
         throw new RuntimeException("R1C1 style not supported yet");
      } else {
         SheetRefEvaluator se = this.createExternSheetRefEvaluator(workbookName, sheetName);
         if(se == null) {
            return ErrorEval.REF_INVALID;
         } else {
            SheetRangeEvaluator sre = new SheetRangeEvaluator(this._sheetIndex, se);
            SpreadsheetVersion ssVersion = ((FormulaParsingWorkbook)this._workbook).getSpreadsheetVersion();
            CellReference.NameType part1refType = classifyCellReference(refStrPart1, ssVersion);
            switch(OperationEvaluationContext.NamelessClass429670484.$SwitchMap$org$apache$poi$ss$util$CellReference$NameType[part1refType.ordinal()]) {
            case 1:
               return ErrorEval.REF_INVALID;
            case 2:
               EvaluationName part2refType = ((FormulaParsingWorkbook)this._workbook).getName(refStrPart1, this._sheetIndex);
               if(!part2refType.isRange()) {
                  throw new RuntimeException("Specified name \'" + refStrPart1 + "\' is not a range as expected.");
               }

               return this._bookEvaluator.evaluateNameFormula(part2refType.getNameDefinition(), this);
            default:
               if(refStrPart2 == null) {
                  switch(OperationEvaluationContext.NamelessClass429670484.$SwitchMap$org$apache$poi$ss$util$CellReference$NameType[part1refType.ordinal()]) {
                  case 3:
                  case 4:
                     return ErrorEval.REF_INVALID;
                  case 5:
                     CellReference part2refType2 = new CellReference(refStrPart1);
                     return new LazyRefEval(part2refType2.getRow(), part2refType2.getCol(), sre);
                  default:
                     throw new IllegalStateException("Unexpected reference classification of \'" + refStrPart1 + "\'.");
                  }
               } else {
                  CellReference.NameType part2refType1 = classifyCellReference(refStrPart1, ssVersion);
                  switch(OperationEvaluationContext.NamelessClass429670484.$SwitchMap$org$apache$poi$ss$util$CellReference$NameType[part2refType1.ordinal()]) {
                  case 1:
                     return ErrorEval.REF_INVALID;
                  case 2:
                     throw new RuntimeException("Cannot evaluate \'" + refStrPart1 + "\'. Indirect evaluation of defined names not supported yet");
                  default:
                     if(part2refType1 != part1refType) {
                        return ErrorEval.REF_INVALID;
                     } else {
                        int firstRow;
                        int firstCol;
                        int lastRow;
                        int lastCol;
                        switch(OperationEvaluationContext.NamelessClass429670484.$SwitchMap$org$apache$poi$ss$util$CellReference$NameType[part1refType.ordinal()]) {
                        case 3:
                           firstRow = 0;
                           if(part2refType1.equals(CellReference.NameType.COLUMN)) {
                              lastRow = ssVersion.getLastRowIndex();
                              firstCol = parseRowRef(refStrPart1);
                              lastCol = parseRowRef(refStrPart2);
                           } else {
                              lastRow = ssVersion.getLastRowIndex();
                              firstCol = parseColRef(refStrPart1);
                              lastCol = parseColRef(refStrPart2);
                           }
                           break;
                        case 4:
                           firstCol = 0;
                           if(part2refType1.equals(CellReference.NameType.ROW)) {
                              firstRow = parseColRef(refStrPart1);
                              lastRow = parseColRef(refStrPart2);
                              lastCol = ssVersion.getLastColumnIndex();
                           } else {
                              lastCol = ssVersion.getLastColumnIndex();
                              firstRow = parseRowRef(refStrPart1);
                              lastRow = parseRowRef(refStrPart2);
                           }
                           break;
                        case 5:
                           CellReference cr = new CellReference(refStrPart1);
                           firstRow = cr.getRow();
                           firstCol = cr.getCol();
                           cr = new CellReference(refStrPart2);
                           lastRow = cr.getRow();
                           lastCol = cr.getCol();
                           break;
                        default:
                           throw new IllegalStateException("Unexpected reference classification of \'" + refStrPart1 + "\'.");
                        }

                        return new LazyAreaEval(firstRow, firstCol, lastRow, lastCol, sre);
                     }
                  }
               }
            }
         }
      }
   }

   private static int parseRowRef(String refStrPart) {
      return CellReference.convertColStringToIndex(refStrPart);
   }

   private static int parseColRef(String refStrPart) {
      return Integer.parseInt(refStrPart) - 1;
   }

   private static CellReference.NameType classifyCellReference(String str, SpreadsheetVersion ssVersion) {
      int len = str.length();
      return len < 1?CellReference.NameType.BAD_CELL_OR_NAMED_RANGE:CellReference.classifyCellReference(str, ssVersion);
   }

   public FreeRefFunction findUserDefinedFunction(String functionName) {
      return this._bookEvaluator.findUserDefinedFunction(functionName);
   }

   public ValueEval getRefEval(int rowIndex, int columnIndex) {
      SheetRangeEvaluator sre = this.getRefEvaluatorForCurrentSheet();
      return new LazyRefEval(rowIndex, columnIndex, sre);
   }

   public ValueEval getRef3DEval(Ref3DPtg rptg) {
      SheetRangeEvaluator sre = this.createExternSheetRefEvaluator(rptg.getExternSheetIndex());
      return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);
   }

   public ValueEval getRef3DEval(Ref3DPxg rptg) {
      SheetRangeEvaluator sre = this.createExternSheetRefEvaluator(rptg.getSheetName(), rptg.getLastSheetName(), rptg.getExternalWorkbookNumber());
      return new LazyRefEval(rptg.getRow(), rptg.getColumn(), sre);
   }

   public ValueEval getAreaEval(int firstRowIndex, int firstColumnIndex, int lastRowIndex, int lastColumnIndex) {
      SheetRangeEvaluator sre = this.getRefEvaluatorForCurrentSheet();
      return new LazyAreaEval(firstRowIndex, firstColumnIndex, lastRowIndex, lastColumnIndex, sre);
   }

   public ValueEval getArea3DEval(Area3DPtg aptg) {
      SheetRangeEvaluator sre = this.createExternSheetRefEvaluator(aptg.getExternSheetIndex());
      return new LazyAreaEval(aptg.getFirstRow(), aptg.getFirstColumn(), aptg.getLastRow(), aptg.getLastColumn(), sre);
   }

   public ValueEval getArea3DEval(Area3DPxg aptg) {
      SheetRangeEvaluator sre = this.createExternSheetRefEvaluator(aptg.getSheetName(), aptg.getLastSheetName(), aptg.getExternalWorkbookNumber());
      return new LazyAreaEval(aptg.getFirstRow(), aptg.getFirstColumn(), aptg.getLastRow(), aptg.getLastColumn(), sre);
   }

   public ValueEval getNameXEval(NameXPtg nameXPtg) {
      EvaluationWorkbook.ExternalSheet externSheet = this._workbook.getExternalSheet(nameXPtg.getSheetRefIndex());
      if(externSheet != null && externSheet.getWorkbookName() != null) {
         String workbookName = externSheet.getWorkbookName();
         EvaluationWorkbook.ExternalName externName = this._workbook.getExternalName(nameXPtg.getSheetRefIndex(), nameXPtg.getNameIndex());
         return this.getExternalNameXEval(externName, workbookName);
      } else {
         return this.getLocalNameXEval(nameXPtg);
      }
   }

   public ValueEval getNameXEval(NameXPxg nameXPxg) {
      EvaluationWorkbook.ExternalSheet externSheet = this._workbook.getExternalSheet(nameXPxg.getSheetName(), (String)null, nameXPxg.getExternalWorkbookNumber());
      if(externSheet != null && externSheet.getWorkbookName() != null) {
         String workbookName = externSheet.getWorkbookName();
         EvaluationWorkbook.ExternalName externName = this._workbook.getExternalName(nameXPxg.getNameName(), nameXPxg.getSheetName(), nameXPxg.getExternalWorkbookNumber());
         return this.getExternalNameXEval(externName, workbookName);
      } else {
         return this.getLocalNameXEval(nameXPxg);
      }
   }

   private ValueEval getLocalNameXEval(NameXPxg nameXPxg) {
      int sIdx = -1;
      if(nameXPxg.getSheetName() != null) {
         sIdx = this._workbook.getSheetIndex(nameXPxg.getSheetName());
      }

      String name = nameXPxg.getNameName();
      EvaluationName evalName = this._workbook.getName(name, sIdx);
      return (ValueEval)(evalName != null?new ExternalNameEval(evalName):new FunctionNameEval(name));
   }

   private ValueEval getLocalNameXEval(NameXPtg nameXPtg) {
      String name = this._workbook.resolveNameXText(nameXPtg);
      int sheetNameAt = name.indexOf(33);
      EvaluationName evalName = null;
      if(sheetNameAt > -1) {
         String sheetName = name.substring(0, sheetNameAt);
         String nameName = name.substring(sheetNameAt + 1);
         evalName = this._workbook.getName(nameName, this._workbook.getSheetIndex(sheetName));
      } else {
         evalName = this._workbook.getName(name, -1);
      }

      return (ValueEval)(evalName != null?new ExternalNameEval(evalName):new FunctionNameEval(name));
   }

   public int getSheetIndex() {
      return this._sheetIndex;
   }

   private ValueEval getExternalNameXEval(EvaluationWorkbook.ExternalName externName, String workbookName) {
      try {
         WorkbookEvaluator wnfe = this._bookEvaluator.getOtherWorkbookEvaluator(workbookName);
         EvaluationName evaluationName = wnfe.getName(externName.getName(), externName.getIx() - 1);
         if(evaluationName != null && evaluationName.hasFormula()) {
            if(evaluationName.getNameDefinition().length > 1) {
               throw new RuntimeException("Complex name formulas not supported yet");
            }

            OperationEvaluationContext refWorkbookContext = new OperationEvaluationContext(wnfe, wnfe.getWorkbook(), -1, -1, -1, this._tracker);
            Ptg ptg = evaluationName.getNameDefinition()[0];
            if(ptg instanceof Ref3DPtg) {
               Ref3DPtg area3D3 = (Ref3DPtg)ptg;
               return refWorkbookContext.getRef3DEval(area3D3);
            }

            if(ptg instanceof Ref3DPxg) {
               Ref3DPxg area3D2 = (Ref3DPxg)ptg;
               return refWorkbookContext.getRef3DEval(area3D2);
            }

            if(ptg instanceof Area3DPtg) {
               Area3DPtg area3D1 = (Area3DPtg)ptg;
               return refWorkbookContext.getArea3DEval(area3D1);
            }

            if(ptg instanceof Area3DPxg) {
               Area3DPxg area3D = (Area3DPxg)ptg;
               return refWorkbookContext.getArea3DEval(area3D);
            }
         }

         return ErrorEval.REF_INVALID;
      } catch (CollaboratingWorkbooksEnvironment.WorkbookNotFoundException var8) {
         return ErrorEval.REF_INVALID;
      }
   }


   // $FF: synthetic class
   static class NamelessClass429670484 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$util$CellReference$NameType = new int[CellReference.NameType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$util$CellReference$NameType[CellReference.NameType.BAD_CELL_OR_NAMED_RANGE.ordinal()] = 1;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$util$CellReference$NameType[CellReference.NameType.NAMED_RANGE.ordinal()] = 2;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$util$CellReference$NameType[CellReference.NameType.COLUMN.ordinal()] = 3;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$util$CellReference$NameType[CellReference.NameType.ROW.ordinal()] = 4;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$util$CellReference$NameType[CellReference.NameType.CELL.ordinal()] = 5;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
