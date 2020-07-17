package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.formula.BaseFormulaEvaluator;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.BaseXSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class XSSFFormulaEvaluator extends BaseXSSFFormulaEvaluator {

   private XSSFWorkbook _book;


   public XSSFFormulaEvaluator(XSSFWorkbook workbook) {
      this(workbook, (IStabilityClassifier)null, (UDFFinder)null);
   }

   private XSSFFormulaEvaluator(XSSFWorkbook workbook, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      this(workbook, new WorkbookEvaluator(XSSFEvaluationWorkbook.create(workbook), stabilityClassifier, udfFinder));
   }

   protected XSSFFormulaEvaluator(XSSFWorkbook workbook, WorkbookEvaluator bookEvaluator) {
      super(bookEvaluator);
      this._book = workbook;
   }

   public static XSSFFormulaEvaluator create(XSSFWorkbook workbook, IStabilityClassifier stabilityClassifier, UDFFinder udfFinder) {
      return new XSSFFormulaEvaluator(workbook, stabilityClassifier, udfFinder);
   }

   public static void evaluateAllFormulaCells(XSSFWorkbook wb) {
      BaseFormulaEvaluator.evaluateAllFormulaCells(wb);
   }

   public XSSFCell evaluateInCell(Cell cell) {
      return (XSSFCell)super.evaluateInCell(cell);
   }

   public void evaluateAll() {
      evaluateAllFormulaCells(this._book, this);
   }

   protected EvaluationCell toEvaluationCell(Cell cell) {
      if(!(cell instanceof XSSFCell)) {
         throw new IllegalArgumentException("Unexpected type of cell: " + cell.getClass() + "." + " Only XSSFCells can be evaluated.");
      } else {
         return new XSSFEvaluationCell((XSSFCell)cell);
      }
   }
}
