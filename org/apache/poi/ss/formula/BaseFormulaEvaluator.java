package org.apache.poi.ss.formula;

import java.util.Iterator;
import java.util.Map;
import org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.WorkbookEvaluatorProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public abstract class BaseFormulaEvaluator implements FormulaEvaluator, WorkbookEvaluatorProvider {

   protected final WorkbookEvaluator _bookEvaluator;


   protected BaseFormulaEvaluator(WorkbookEvaluator bookEvaluator) {
      this._bookEvaluator = bookEvaluator;
   }

   public static void setupEnvironment(String[] workbookNames, BaseFormulaEvaluator[] evaluators) {
      WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluators.length];

      for(int i = 0; i < wbEvals.length; ++i) {
         wbEvals[i] = evaluators[i]._bookEvaluator;
      }

      CollaboratingWorkbooksEnvironment.setup(workbookNames, wbEvals);
   }

   public void setupReferencedWorkbooks(Map evaluators) {
      CollaboratingWorkbooksEnvironment.setupFormulaEvaluator(evaluators);
   }

   public WorkbookEvaluator _getWorkbookEvaluator() {
      return this._bookEvaluator;
   }

   public void clearAllCachedResultValues() {
      this._bookEvaluator.clearAllCachedResultValues();
   }

   public CellValue evaluate(Cell cell) {
      if(cell == null) {
         return null;
      } else {
         switch(BaseFormulaEvaluator.NamelessClass724996777.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cell.getCellTypeEnum().ordinal()]) {
         case 1:
            return CellValue.valueOf(cell.getBooleanCellValue());
         case 2:
            return CellValue.getError(cell.getErrorCellValue());
         case 3:
            return this.evaluateFormulaCellValue(cell);
         case 4:
            return new CellValue(cell.getNumericCellValue());
         case 5:
            return new CellValue(cell.getRichStringCellValue().getString());
         case 6:
            return null;
         default:
            throw new IllegalStateException("Bad cell type (" + cell.getCellTypeEnum() + ")");
         }
      }
   }

   public Cell evaluateInCell(Cell cell) {
      if(cell == null) {
         return null;
      } else {
         if(cell.getCellTypeEnum() == CellType.FORMULA) {
            CellValue cv = this.evaluateFormulaCellValue(cell);
            this.setCellValue(cell, cv);
            setCellType(cell, cv);
         }

         return cell;
      }
   }

   protected abstract CellValue evaluateFormulaCellValue(Cell var1);

   public int evaluateFormulaCell(Cell cell) {
      return this.evaluateFormulaCellEnum(cell).getCode();
   }

   public CellType evaluateFormulaCellEnum(Cell cell) {
      if(cell != null && cell.getCellTypeEnum() == CellType.FORMULA) {
         CellValue cv = this.evaluateFormulaCellValue(cell);
         this.setCellValue(cell, cv);
         return cv.getCellTypeEnum();
      } else {
         return CellType._NONE;
      }
   }

   protected static void setCellType(Cell cell, CellValue cv) {
      CellType cellType = cv.getCellTypeEnum();
      switch(BaseFormulaEvaluator.NamelessClass724996777.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
      case 2:
      case 4:
      case 5:
         cell.setCellType(cellType);
         return;
      case 3:
         throw new IllegalArgumentException("This should never happen. Formulas should have already been evaluated.");
      case 6:
         throw new IllegalArgumentException("This should never happen. Blanks eventually get translated to zero.");
      default:
         throw new IllegalStateException("Unexpected cell value type (" + cellType + ")");
      }
   }

   protected abstract RichTextString createRichTextString(String var1);

   protected void setCellValue(Cell cell, CellValue cv) {
      CellType cellType = cv.getCellTypeEnum();
      switch(BaseFormulaEvaluator.NamelessClass724996777.$SwitchMap$org$apache$poi$ss$usermodel$CellType[cellType.ordinal()]) {
      case 1:
         cell.setCellValue(cv.getBooleanValue());
         break;
      case 2:
         cell.setCellErrorValue(cv.getErrorValue());
         break;
      case 3:
      case 6:
      default:
         throw new IllegalStateException("Unexpected cell value type (" + cellType + ")");
      case 4:
         cell.setCellValue(cv.getNumberValue());
         break;
      case 5:
         cell.setCellValue(this.createRichTextString(cv.getStringValue()));
      }

   }

   public static void evaluateAllFormulaCells(Workbook wb) {
      FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
      evaluateAllFormulaCells(wb, evaluator);
   }

   protected static void evaluateAllFormulaCells(Workbook wb, FormulaEvaluator evaluator) {
      for(int i = 0; i < wb.getNumberOfSheets(); ++i) {
         Sheet sheet = wb.getSheetAt(i);
         Iterator i$ = sheet.iterator();

         while(i$.hasNext()) {
            Row r = (Row)i$.next();
            Iterator i$1 = r.iterator();

            while(i$1.hasNext()) {
               Cell c = (Cell)i$1.next();
               if(c.getCellTypeEnum() == CellType.FORMULA) {
                  evaluator.evaluateFormulaCellEnum(c);
               }
            }
         }
      }

   }

   public void setIgnoreMissingWorkbooks(boolean ignore) {
      this._bookEvaluator.setIgnoreMissingWorkbooks(ignore);
   }

   public void setDebugEvaluationOutputForNextEval(boolean value) {
      this._bookEvaluator.setDebugEvaluationOutputForNextEval(value);
   }

   // $FF: synthetic class
   static class NamelessClass724996777 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$CellType = new int[CellType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BOOLEAN.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.ERROR.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.FORMULA.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.NUMERIC.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.STRING.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$CellType[CellType.BLANK.ordinal()] = 6;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
