package org.apache.poi.ss.formula;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;
import org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment;
import org.apache.poi.ss.formula.EvaluationCache;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationName;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.EvaluationTracker;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.FormulaCellCacheEntry;
import org.apache.poi.ss.formula.IEvaluationListener;
import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.OperationEvaluatorFactory;
import org.apache.poi.ss.formula.atp.AnalysisToolPak;
import org.apache.poi.ss.formula.eval.BlankEval;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.ExternalNameEval;
import org.apache.poi.ss.formula.eval.FunctionEval;
import org.apache.poi.ss.formula.eval.FunctionNameEval;
import org.apache.poi.ss.formula.eval.MissingArgEval;
import org.apache.poi.ss.formula.eval.NotImplementedException;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.Choose;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.functions.Function;
import org.apache.poi.ss.formula.functions.IfFunc;
import org.apache.poi.ss.formula.ptg.Area3DPtg;
import org.apache.poi.ss.formula.ptg.Area3DPxg;
import org.apache.poi.ss.formula.ptg.AreaErrPtg;
import org.apache.poi.ss.formula.ptg.AreaPtg;
import org.apache.poi.ss.formula.ptg.AttrPtg;
import org.apache.poi.ss.formula.ptg.BoolPtg;
import org.apache.poi.ss.formula.ptg.ControlPtg;
import org.apache.poi.ss.formula.ptg.DeletedArea3DPtg;
import org.apache.poi.ss.formula.ptg.DeletedRef3DPtg;
import org.apache.poi.ss.formula.ptg.ErrPtg;
import org.apache.poi.ss.formula.ptg.ExpPtg;
import org.apache.poi.ss.formula.ptg.FuncVarPtg;
import org.apache.poi.ss.formula.ptg.IntPtg;
import org.apache.poi.ss.formula.ptg.MemAreaPtg;
import org.apache.poi.ss.formula.ptg.MemErrPtg;
import org.apache.poi.ss.formula.ptg.MemFuncPtg;
import org.apache.poi.ss.formula.ptg.MissingArgPtg;
import org.apache.poi.ss.formula.ptg.NamePtg;
import org.apache.poi.ss.formula.ptg.NameXPtg;
import org.apache.poi.ss.formula.ptg.NameXPxg;
import org.apache.poi.ss.formula.ptg.NumberPtg;
import org.apache.poi.ss.formula.ptg.OperationPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.Ref3DPtg;
import org.apache.poi.ss.formula.ptg.Ref3DPxg;
import org.apache.poi.ss.formula.ptg.RefErrorPtg;
import org.apache.poi.ss.formula.ptg.RefPtg;
import org.apache.poi.ss.formula.ptg.StringPtg;
import org.apache.poi.ss.formula.ptg.UnionPtg;
import org.apache.poi.ss.formula.ptg.UnknownPtg;
import org.apache.poi.ss.formula.udf.AggregatingUDFFinder;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

@Internal
public final class WorkbookEvaluator {

   private static final POILogger LOG = POILogFactory.getLogger(WorkbookEvaluator.class);
   private final EvaluationWorkbook _workbook;
   private EvaluationCache _cache;
   private int _workbookIx;
   private final IEvaluationListener _evaluationListener;
   private final Map _sheetIndexesBySheet;
   private final Map _sheetIndexesByName;
   private CollaboratingWorkbooksEnvironment _collaboratingWorkbookEnvironment;
   private final IStabilityClassifier _stabilityClassifier;
   private final AggregatingUDFFinder _udfFinder;
   private boolean _ignoreMissingWorkbooks;
   private boolean dbgEvaluationOutputForNextEval;
   private final POILogger EVAL_LOG;
   private int dbgEvaluationOutputIndent;


   public WorkbookEvaluator(EvaluationWorkbook workbook, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      this(workbook, (IEvaluationListener)null, stabilityClassifier, udfFinder);
   }

   WorkbookEvaluator(EvaluationWorkbook workbook, IEvaluationListener evaluationListener, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      this._ignoreMissingWorkbooks = false;
      this.dbgEvaluationOutputForNextEval = false;
      this.EVAL_LOG = POILogFactory.getLogger("POI.FormulaEval");
      this.dbgEvaluationOutputIndent = -1;
      this._workbook = workbook;
      this._evaluationListener = evaluationListener;
      this._cache = new EvaluationCache(evaluationListener);
      this._sheetIndexesBySheet = new IdentityHashMap();
      this._sheetIndexesByName = new IdentityHashMap();
      this._collaboratingWorkbookEnvironment = CollaboratingWorkbooksEnvironment.EMPTY;
      this._workbookIx = 0;
      this._stabilityClassifier = stabilityClassifier;
      AggregatingUDFFinder defaultToolkit = workbook == null?null:(AggregatingUDFFinder)workbook.getUDFFinder();
      if(defaultToolkit != null && udfFinder != null) {
         defaultToolkit.add(udfFinder);
      }

      this._udfFinder = defaultToolkit;
   }

   String getSheetName(int sheetIndex) {
      return this._workbook.getSheetName(sheetIndex);
   }

   EvaluationSheet getSheet(int sheetIndex) {
      return this._workbook.getSheet(sheetIndex);
   }

   EvaluationWorkbook getWorkbook() {
      return this._workbook;
   }

   EvaluationName getName(String name, int sheetIndex) {
      EvaluationName evalName = this._workbook.getName(name, sheetIndex);
      return evalName;
   }

   private static boolean isDebugLogEnabled() {
      return LOG.check(1);
   }

   private static boolean isInfoLogEnabled() {
      return LOG.check(3);
   }

   private static void logDebug(String s) {
      if(isDebugLogEnabled()) {
         LOG.log(1, new Object[]{s});
      }

   }

   private static void logInfo(String s) {
      if(isInfoLogEnabled()) {
         LOG.log(3, new Object[]{s});
      }

   }

   void attachToEnvironment(CollaboratingWorkbooksEnvironment collaboratingWorkbooksEnvironment, EvaluationCache cache, int workbookIx) {
      this._collaboratingWorkbookEnvironment = collaboratingWorkbooksEnvironment;
      this._cache = cache;
      this._workbookIx = workbookIx;
   }

   CollaboratingWorkbooksEnvironment getEnvironment() {
      return this._collaboratingWorkbookEnvironment;
   }

   void detachFromEnvironment() {
      this._collaboratingWorkbookEnvironment = CollaboratingWorkbooksEnvironment.EMPTY;
      this._cache = new EvaluationCache(this._evaluationListener);
      this._workbookIx = 0;
   }

   WorkbookEvaluator getOtherWorkbookEvaluator(String workbookName) throws CollaboratingWorkbooksEnvironment.WorkbookNotFoundException {
      return this._collaboratingWorkbookEnvironment.getWorkbookEvaluator(workbookName);
   }

   IEvaluationListener getEvaluationListener() {
      return this._evaluationListener;
   }

   public void clearAllCachedResultValues() {
      this._cache.clear();
      this._sheetIndexesBySheet.clear();
      this._workbook.clearAllCachedResultValues();
   }

   public void notifyUpdateCell(EvaluationCell cell) {
      int sheetIndex = this.getSheetIndex(cell.getSheet());
      this._cache.notifyUpdateCell(this._workbookIx, sheetIndex, cell);
   }

   public void notifyDeleteCell(EvaluationCell cell) {
      int sheetIndex = this.getSheetIndex(cell.getSheet());
      this._cache.notifyDeleteCell(this._workbookIx, sheetIndex, cell);
   }

   private int getSheetIndex(EvaluationSheet sheet) {
      Integer result = (Integer)this._sheetIndexesBySheet.get(sheet);
      if(result == null) {
         int sheetIndex = this._workbook.getSheetIndex(sheet);
         if(sheetIndex < 0) {
            throw new RuntimeException("Specified sheet from a different book");
         }

         result = Integer.valueOf(sheetIndex);
         this._sheetIndexesBySheet.put(sheet, result);
      }

      return result.intValue();
   }

   public ValueEval evaluate(EvaluationCell srcCell) {
      int sheetIndex = this.getSheetIndex(srcCell.getSheet());
      return this.evaluateAny(srcCell, sheetIndex, srcCell.getRowIndex(), srcCell.getColumnIndex(), new EvaluationTracker(this._cache));
   }

   int getSheetIndex(String sheetName) {
      Integer result = (Integer)this._sheetIndexesByName.get(sheetName);
      if(result == null) {
         int sheetIndex = this._workbook.getSheetIndex(sheetName);
         if(sheetIndex < 0) {
            return -1;
         }

         result = Integer.valueOf(sheetIndex);
         this._sheetIndexesByName.put(sheetName, result);
      }

      return result.intValue();
   }

   int getSheetIndexByExternIndex(int externSheetIndex) {
      return this._workbook.convertFromExternSheetIndex(externSheetIndex);
   }

   private ValueEval evaluateAny(EvaluationCell srcCell, int sheetIndex, int rowIndex, int columnIndex, EvaluationTracker tracker) {
      boolean shouldCellDependencyBeRecorded = this._stabilityClassifier == null?true:!this._stabilityClassifier.isCellFinal(sheetIndex, rowIndex, columnIndex);
      if(srcCell != null && srcCell.getCellTypeEnum() == CellType.FORMULA) {
         FormulaCellCacheEntry cce1 = this._cache.getOrCreateFormulaCellEntry(srcCell);
         if(shouldCellDependencyBeRecorded || cce1.isInputSensitive()) {
            tracker.acceptFormulaDependency(cce1);
         }

         IEvaluationListener evalListener = this._evaluationListener;
         if(cce1.getValue() != null) {
            if(evalListener != null) {
               evalListener.onCacheHit(sheetIndex, rowIndex, columnIndex, cce1.getValue());
            }

            return cce1.getValue();
         } else if(!tracker.startEvaluate(cce1)) {
            return ErrorEval.CIRCULAR_REF_ERROR;
         } else {
            OperationEvaluationContext sheetName = new OperationEvaluationContext(this, this._workbook, sheetIndex, rowIndex, columnIndex, tracker);

            Object result;
            try {
               Ptg[] cr = this._workbook.getFormulaTokens(srcCell);
               if(evalListener == null) {
                  result = this.evaluateFormula(sheetName, cr);
               } else {
                  evalListener.onStartEvaluate(srcCell, cce1);
                  result = this.evaluateFormula(sheetName, cr);
                  evalListener.onEndEvaluate(cce1, (ValueEval)result);
               }

               tracker.updateCacheResult((ValueEval)result);
            } catch (NotImplementedException var16) {
               throw this.addExceptionInfo(var16, sheetIndex, rowIndex, columnIndex);
            } catch (RuntimeException var17) {
               if(!(var17.getCause() instanceof CollaboratingWorkbooksEnvironment.WorkbookNotFoundException) || !this._ignoreMissingWorkbooks) {
                  throw var17;
               }

               logInfo(var17.getCause().getMessage() + " - Continuing with cached value!");
               switch(WorkbookEvaluator.NamelessClass1964290286.$SwitchMap$org$apache$poi$ss$usermodel$CellType[srcCell.getCachedFormulaResultTypeEnum().ordinal()]) {
               case 1:
                  result = new NumberEval(srcCell.getNumericCellValue());
                  break;
               case 2:
                  result = new StringEval(srcCell.getStringCellValue());
                  break;
               case 3:
                  result = BlankEval.instance;
                  break;
               case 4:
                  result = BoolEval.valueOf(srcCell.getBooleanCellValue());
                  break;
               case 5:
                  result = ErrorEval.valueOf(srcCell.getErrorCellValue());
                  break;
               case 6:
               default:
                  throw new RuntimeException("Unexpected cell type \'" + srcCell.getCellTypeEnum() + "\' found!");
               }
            } finally {
               tracker.endEvaluate(cce1);
            }

            if(isDebugLogEnabled()) {
               String sheetName1 = this.getSheetName(sheetIndex);
               CellReference cr1 = new CellReference(rowIndex, columnIndex);
               logDebug("Evaluated " + sheetName1 + "!" + cr1.formatAsString() + " to " + result.toString());
            }

            return (ValueEval)result;
         }
      } else {
         ValueEval cce = getValueFromNonFormulaCell(srcCell);
         if(shouldCellDependencyBeRecorded) {
            tracker.acceptPlainValueDependency(this._workbookIx, sheetIndex, rowIndex, columnIndex, cce);
         }

         return cce;
      }
   }

   private NotImplementedException addExceptionInfo(NotImplementedException inner, int sheetIndex, int rowIndex, int columnIndex) {
      try {
         String e = this._workbook.getSheetName(sheetIndex);
         CellReference cr = new CellReference(e, rowIndex, columnIndex, false, false);
         String msg = "Error evaluating cell " + cr.formatAsString();
         return new NotImplementedException(msg, inner);
      } catch (Exception var8) {
         LOG.log(7, new Object[]{"Can\'t add exception info", var8});
         return inner;
      }
   }

   static ValueEval getValueFromNonFormulaCell(EvaluationCell cell) {
      if(cell == null) {
         return BlankEval.instance;
      } else {
         CellType cellType = cell.getCellTypeEnum();
         switch(WorkbookEvaluator.NamelessClass1964290286.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
         case 1:
            return new NumberEval(cell.getNumericCellValue());
         case 2:
            return new StringEval(cell.getStringCellValue());
         case 3:
            return BlankEval.instance;
         case 4:
            return BoolEval.valueOf(cell.getBooleanCellValue());
         case 5:
            return ErrorEval.valueOf(cell.getErrorCellValue());
         default:
            throw new RuntimeException("Unexpected cell type (" + cellType + ")");
         }
      }
   }

   @Internal
   ValueEval evaluateFormula(OperationEvaluationContext ec, Ptg[] ptgs) {
      String dbgIndentStr = "";
      if(this.dbgEvaluationOutputForNextEval) {
         this.dbgEvaluationOutputIndent = 1;
         this.dbgEvaluationOutputForNextEval = false;
      }

      if(this.dbgEvaluationOutputIndent > 0) {
         dbgIndentStr = "                                                                                                    ";
         dbgIndentStr = dbgIndentStr.substring(0, Math.min(dbgIndentStr.length(), this.dbgEvaluationOutputIndent * 2));
         this.EVAL_LOG.log(5, new Object[]{dbgIndentStr + "- evaluateFormula(\'" + ec.getRefEvaluatorForCurrentSheet().getSheetNameRange() + "\'/" + (new CellReference(ec.getRowIndex(), ec.getColumnIndex())).formatAsString() + "): " + Arrays.toString(ptgs).replaceAll("\\Qorg.apache.poi.ss.formula.ptg.\\E", "")});
         ++this.dbgEvaluationOutputIndent;
      }

      Stack stack = new Stack();
      int value = 0;

      for(int result = ptgs.length; value < result; ++value) {
         Object ptg = ptgs[value];
         if(this.dbgEvaluationOutputIndent > 0) {
            this.EVAL_LOG.log(3, new Object[]{dbgIndentStr + "  * ptg " + value + ": " + ptg});
         }

         int j;
         if(ptg instanceof AttrPtg) {
            AttrPtg opResult = (AttrPtg)ptg;
            if(opResult.isSum()) {
               ptg = FuncVarPtg.SUM;
            }

            ValueEval var20;
            if(opResult.isOptimizedChoose()) {
               var20 = (ValueEval)stack.pop();
               int[] var22 = opResult.getJumpTable();
               j = var22.length;

               int var24;
               try {
                  int var26 = Choose.evaluateFirstArg(var20, ec.getRowIndex(), ec.getColumnIndex());
                  if(var26 >= 1 && var26 <= j) {
                     var24 = var22[var26 - 1];
                  } else {
                     stack.push(ErrorEval.VALUE_INVALID);
                     var24 = opResult.getChooseFuncOffset() + 4;
                  }
               } catch (EvaluationException var14) {
                  stack.push(var14.getErrorEval());
                  var24 = opResult.getChooseFuncOffset() + 4;
               }

               var24 -= j * 2 + 2;
               value += countTokensToBeSkipped(ptgs, value, var24);
               continue;
            }

            if(opResult.isOptimizedIf()) {
               var20 = (ValueEval)stack.pop();

               boolean var21;
               try {
                  var21 = IfFunc.evaluateFirstArg(var20, ec.getRowIndex(), ec.getColumnIndex());
               } catch (EvaluationException var15) {
                  stack.push(var15.getErrorEval());
                  short var25 = opResult.getData();
                  value += countTokensToBeSkipped(ptgs, value, var25);
                  opResult = (AttrPtg)ptgs[value];
                  j = opResult.getData() + 1;
                  value += countTokensToBeSkipped(ptgs, value, j);
                  continue;
               }

               if(!var21) {
                  short var23 = opResult.getData();
                  value += countTokensToBeSkipped(ptgs, value, var23);
                  Ptg var27 = ptgs[value + 1];
                  if(ptgs[value] instanceof AttrPtg && var27 instanceof FuncVarPtg && ((FuncVarPtg)var27).getFunctionIndex() == 1) {
                     ++value;
                     stack.push(BoolEval.FALSE);
                  }
               }
               continue;
            }

            if(opResult.isSkip()) {
               int var19 = opResult.getData() + 1;
               value += countTokensToBeSkipped(ptgs, value, var19);
               if(stack.peek() == MissingArgEval.instance) {
                  stack.pop();
                  stack.push(BlankEval.instance);
               }
               continue;
            }
         }

         if(!(ptg instanceof ControlPtg) && !(ptg instanceof MemFuncPtg) && !(ptg instanceof MemAreaPtg) && !(ptg instanceof MemErrPtg)) {
            ValueEval var18;
            if(ptg instanceof OperationPtg) {
               OperationPtg optg = (OperationPtg)ptg;
               if(optg instanceof UnionPtg) {
                  continue;
               }

               int numops = optg.getNumberOfOperands();
               ValueEval[] ops = new ValueEval[numops];

               for(j = numops - 1; j >= 0; --j) {
                  ValueEval p = (ValueEval)stack.pop();
                  ops[j] = p;
               }

               var18 = OperationEvaluatorFactory.evaluate(optg, ops, ec);
            } else {
               var18 = this.getEvalForPtg((Ptg)ptg, ec);
            }

            if(var18 == null) {
               throw new RuntimeException("Evaluation result must not be null");
            }

            stack.push(var18);
            if(this.dbgEvaluationOutputIndent > 0) {
               this.EVAL_LOG.log(3, new Object[]{dbgIndentStr + "    = " + var18});
            }
         }
      }

      ValueEval var17 = (ValueEval)stack.pop();
      if(!stack.isEmpty()) {
         throw new IllegalStateException("evaluation stack not empty");
      } else {
         ValueEval var16 = dereferenceResult(var17, ec.getRowIndex(), ec.getColumnIndex());
         if(this.dbgEvaluationOutputIndent > 0) {
            this.EVAL_LOG.log(3, new Object[]{dbgIndentStr + "finshed eval of " + (new CellReference(ec.getRowIndex(), ec.getColumnIndex())).formatAsString() + ": " + var16});
            --this.dbgEvaluationOutputIndent;
            if(this.dbgEvaluationOutputIndent == 1) {
               this.dbgEvaluationOutputIndent = -1;
            }
         }

         return var16;
      }
   }

   private static int countTokensToBeSkipped(Ptg[] ptgs, int startIndex, int distInBytes) {
      int remBytes = distInBytes;
      int index = startIndex;

      do {
         if(remBytes == 0) {
            return index - startIndex;
         }

         ++index;
         remBytes -= ptgs[index].getSize();
         if(remBytes < 0) {
            throw new RuntimeException("Bad skip distance (wrong token size calculation).");
         }
      } while(index < ptgs.length);

      throw new RuntimeException("Skip distance too far (ran out of formula tokens).");
   }

   public static ValueEval dereferenceResult(ValueEval evaluationResult, int srcRowNum, int srcColNum) {
      ValueEval value;
      try {
         value = OperandResolver.getSingleValue(evaluationResult, srcRowNum, srcColNum);
      } catch (EvaluationException var5) {
         return var5.getErrorEval();
      }

      return (ValueEval)(value == BlankEval.instance?NumberEval.ZERO:value);
   }

   private ValueEval getEvalForPtg(Ptg ptg, OperationEvaluationContext ec) {
      if(ptg instanceof NamePtg) {
         NamePtg aptg2 = (NamePtg)ptg;
         EvaluationName nameRecord = this._workbook.getName(aptg2);
         return this.getEvalForNameRecord(nameRecord, ec);
      } else if(ptg instanceof NameXPtg) {
         return this.processNameEval(ec.getNameXEval((NameXPtg)ptg), ec);
      } else if(ptg instanceof NameXPxg) {
         return this.processNameEval(ec.getNameXEval((NameXPxg)ptg), ec);
      } else if(ptg instanceof IntPtg) {
         return new NumberEval((double)((IntPtg)ptg).getValue());
      } else if(ptg instanceof NumberPtg) {
         return new NumberEval(((NumberPtg)ptg).getValue());
      } else if(ptg instanceof StringPtg) {
         return new StringEval(((StringPtg)ptg).getValue());
      } else if(ptg instanceof BoolPtg) {
         return BoolEval.valueOf(((BoolPtg)ptg).getValue());
      } else if(ptg instanceof ErrPtg) {
         return ErrorEval.valueOf(((ErrPtg)ptg).getErrorCode());
      } else if(ptg instanceof MissingArgPtg) {
         return MissingArgEval.instance;
      } else if(!(ptg instanceof AreaErrPtg) && !(ptg instanceof RefErrorPtg) && !(ptg instanceof DeletedArea3DPtg) && !(ptg instanceof DeletedRef3DPtg)) {
         if(ptg instanceof Ref3DPtg) {
            return ec.getRef3DEval((Ref3DPtg)ptg);
         } else if(ptg instanceof Ref3DPxg) {
            return ec.getRef3DEval((Ref3DPxg)ptg);
         } else if(ptg instanceof Area3DPtg) {
            return ec.getArea3DEval((Area3DPtg)ptg);
         } else if(ptg instanceof Area3DPxg) {
            return ec.getArea3DEval((Area3DPxg)ptg);
         } else if(ptg instanceof RefPtg) {
            RefPtg aptg1 = (RefPtg)ptg;
            return ec.getRefEval(aptg1.getRow(), aptg1.getColumn());
         } else if(ptg instanceof AreaPtg) {
            AreaPtg aptg = (AreaPtg)ptg;
            return ec.getAreaEval(aptg.getFirstRow(), aptg.getFirstColumn(), aptg.getLastRow(), aptg.getLastColumn());
         } else if(ptg instanceof UnknownPtg) {
            throw new RuntimeException("UnknownPtg not allowed");
         } else if(ptg instanceof ExpPtg) {
            throw new RuntimeException("ExpPtg currently not supported");
         } else {
            throw new RuntimeException("Unexpected ptg class (" + ptg.getClass().getName() + ")");
         }
      } else {
         return ErrorEval.REF_INVALID;
      }
   }

   private ValueEval processNameEval(ValueEval eval, OperationEvaluationContext ec) {
      if(eval instanceof ExternalNameEval) {
         EvaluationName name = ((ExternalNameEval)eval).getName();
         return this.getEvalForNameRecord(name, ec);
      } else {
         return eval;
      }
   }

   private ValueEval getEvalForNameRecord(EvaluationName nameRecord, OperationEvaluationContext ec) {
      if(nameRecord.isFunctionName()) {
         return new FunctionNameEval(nameRecord.getNameText());
      } else if(nameRecord.hasFormula()) {
         return this.evaluateNameFormula(nameRecord.getNameDefinition(), ec);
      } else {
         throw new RuntimeException("Don\'t now how to evalate name \'" + nameRecord.getNameText() + "\'");
      }
   }

   ValueEval evaluateNameFormula(Ptg[] ptgs, OperationEvaluationContext ec) {
      return ptgs.length == 1?this.getEvalForPtg(ptgs[0], ec):this.evaluateFormula(ec, ptgs);
   }

   ValueEval evaluateReference(EvaluationSheet sheet, int sheetIndex, int rowIndex, int columnIndex, EvaluationTracker tracker) {
      EvaluationCell cell = sheet.getCell(rowIndex, columnIndex);
      return this.evaluateAny(cell, sheetIndex, rowIndex, columnIndex, tracker);
   }

   public FreeRefFunction findUserDefinedFunction(String functionName) {
      return this._udfFinder.findFunction(functionName);
   }

   public void setIgnoreMissingWorkbooks(boolean ignore) {
      this._ignoreMissingWorkbooks = ignore;
   }

   public boolean isIgnoreMissingWorkbooks() {
      return this._ignoreMissingWorkbooks;
   }

   public static Collection getSupportedFunctionNames() {
      TreeSet lst = new TreeSet();
      lst.addAll(FunctionEval.getSupportedFunctionNames());
      lst.addAll(AnalysisToolPak.getSupportedFunctionNames());
      return Collections.unmodifiableCollection(lst);
   }

   public static Collection getNotSupportedFunctionNames() {
      TreeSet lst = new TreeSet();
      lst.addAll(FunctionEval.getNotSupportedFunctionNames());
      lst.addAll(AnalysisToolPak.getNotSupportedFunctionNames());
      return Collections.unmodifiableCollection(lst);
   }

   public static void registerFunction(String name, FreeRefFunction func) {
      AnalysisToolPak.registerFunction(name, func);
   }

   public static void registerFunction(String name, Function func) {
      FunctionEval.registerFunction(name, func);
   }

   public void setDebugEvaluationOutputForNextEval(boolean value) {
      this.dbgEvaluationOutputForNextEval = value;
   }

   public boolean isDebugEvaluationOutputForNextEval() {
      return this.dbgEvaluationOutputForNextEval;
   }


   // $FF: synthetic class
   static class NamelessClass1964290286 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$CellType = new int[CellType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.NUMERIC.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.STRING.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BLANK.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BOOLEAN.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.ERROR.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.FORMULA.ordinal()] = 6;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
