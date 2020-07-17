package org.apache.poi.xssf.streaming;

import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFEvaluationCell;
import org.apache.poi.xssf.streaming.SXSSFEvaluationSheet;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.BaseXSSFEvaluationWorkbook;

@Internal
public final class SXSSFEvaluationWorkbook extends BaseXSSFEvaluationWorkbook {

   private final SXSSFWorkbook _uBook;


   public static SXSSFEvaluationWorkbook create(SXSSFWorkbook book) {
      return book == null?null:new SXSSFEvaluationWorkbook(book);
   }

   private SXSSFEvaluationWorkbook(SXSSFWorkbook book) {
      super(book.getXSSFWorkbook());
      this._uBook = book;
   }

   public int getSheetIndex(EvaluationSheet evalSheet) {
      SXSSFSheet sheet = ((SXSSFEvaluationSheet)evalSheet).getSXSSFSheet();
      return this._uBook.getSheetIndex((Sheet)sheet);
   }

   public EvaluationSheet getSheet(int sheetIndex) {
      return new SXSSFEvaluationSheet(this._uBook.getSheetAt(sheetIndex));
   }

   public Ptg[] getFormulaTokens(EvaluationCell evalCell) {
      SXSSFCell cell = ((SXSSFEvaluationCell)evalCell).getSXSSFCell();
      return FormulaParser.parse(cell.getCellFormula(), this, FormulaType.CELL, this._uBook.getSheetIndex((Sheet)cell.getSheet()));
   }
}
