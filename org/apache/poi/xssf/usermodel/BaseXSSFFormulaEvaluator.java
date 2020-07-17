package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.formula.BaseFormulaEvaluator;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.eval.BoolEval;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

public abstract class BaseXSSFFormulaEvaluator extends BaseFormulaEvaluator {

   protected BaseXSSFFormulaEvaluator(WorkbookEvaluator bookEvaluator) {
      super(bookEvaluator);
   }

   protected RichTextString createRichTextString(String str) {
      return new XSSFRichTextString(str);
   }

   public void notifySetFormula(Cell cell) {
      this._bookEvaluator.notifyUpdateCell(new XSSFEvaluationCell((XSSFCell)cell));
   }

   public void notifyDeleteCell(Cell cell) {
      this._bookEvaluator.notifyDeleteCell(new XSSFEvaluationCell((XSSFCell)cell));
   }

   public void notifyUpdateCell(Cell cell) {
      this._bookEvaluator.notifyUpdateCell(new XSSFEvaluationCell((XSSFCell)cell));
   }

   protected abstract EvaluationCell toEvaluationCell(Cell var1);

   protected CellValue evaluateFormulaCellValue(Cell cell) {
      EvaluationCell evalCell = this.toEvaluationCell(cell);
      ValueEval eval = this._bookEvaluator.evaluate(evalCell);
      if(eval instanceof NumberEval) {
         NumberEval ne2 = (NumberEval)eval;
         return new CellValue(ne2.getNumberValue());
      } else if(eval instanceof BoolEval) {
         BoolEval ne1 = (BoolEval)eval;
         return CellValue.valueOf(ne1.getBooleanValue());
      } else if(eval instanceof StringEval) {
         StringEval ne = (StringEval)eval;
         return new CellValue(ne.getStringValue());
      } else if(eval instanceof ErrorEval) {
         return CellValue.getError(((ErrorEval)eval).getErrorCode());
      } else {
         throw new RuntimeException("Unexpected eval class (" + eval.getClass().getName() + ")");
      }
   }
}
