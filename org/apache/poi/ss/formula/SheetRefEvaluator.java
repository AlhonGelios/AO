package org.apache.poi.ss.formula;

import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.EvaluationTracker;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.ptg.FuncVarPtg;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.CellType;

final class SheetRefEvaluator {

   private final WorkbookEvaluator _bookEvaluator;
   private final EvaluationTracker _tracker;
   private final int _sheetIndex;
   private EvaluationSheet _sheet;


   public SheetRefEvaluator(WorkbookEvaluator bookEvaluator, EvaluationTracker tracker, int sheetIndex) {
      if(sheetIndex < 0) {
         throw new IllegalArgumentException("Invalid sheetIndex: " + sheetIndex + ".");
      } else {
         this._bookEvaluator = bookEvaluator;
         this._tracker = tracker;
         this._sheetIndex = sheetIndex;
      }
   }

   public String getSheetName() {
      return this._bookEvaluator.getSheetName(this._sheetIndex);
   }

   public ValueEval getEvalForCell(int rowIndex, int columnIndex) {
      return this._bookEvaluator.evaluateReference(this.getSheet(), this._sheetIndex, rowIndex, columnIndex, this._tracker);
   }

   private EvaluationSheet getSheet() {
      if(this._sheet == null) {
         this._sheet = this._bookEvaluator.getSheet(this._sheetIndex);
      }

      return this._sheet;
   }

   public boolean isSubTotal(int rowIndex, int columnIndex) {
      boolean subtotal = false;
      EvaluationCell cell = this.getSheet().getCell(rowIndex, columnIndex);
      if(cell != null && cell.getCellTypeEnum() == CellType.FORMULA) {
         EvaluationWorkbook wb = this._bookEvaluator.getWorkbook();
         Ptg[] arr$ = wb.getFormulaTokens(cell);
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Ptg ptg = arr$[i$];
            if(ptg instanceof FuncVarPtg) {
               FuncVarPtg f = (FuncVarPtg)ptg;
               if("SUBTOTAL".equals(f.getName())) {
                  subtotal = true;
                  break;
               }
            }
         }
      }

      return subtotal;
   }
}
