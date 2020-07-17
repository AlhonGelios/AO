package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationSheet;

final class XSSFEvaluationCell implements EvaluationCell {

   private final EvaluationSheet _evalSheet;
   private final XSSFCell _cell;


   public XSSFEvaluationCell(XSSFCell cell, XSSFEvaluationSheet evaluationSheet) {
      this._cell = cell;
      this._evalSheet = evaluationSheet;
   }

   public XSSFEvaluationCell(XSSFCell cell) {
      this(cell, new XSSFEvaluationSheet(cell.getSheet()));
   }

   public Object getIdentityKey() {
      return this._cell;
   }

   public XSSFCell getXSSFCell() {
      return this._cell;
   }

   public boolean getBooleanCellValue() {
      return this._cell.getBooleanCellValue();
   }

   public int getCellType() {
      return this._cell.getCellType();
   }

   public CellType getCellTypeEnum() {
      return this._cell.getCellTypeEnum();
   }

   public int getColumnIndex() {
      return this._cell.getColumnIndex();
   }

   public int getErrorCellValue() {
      return this._cell.getErrorCellValue();
   }

   public double getNumericCellValue() {
      return this._cell.getNumericCellValue();
   }

   public int getRowIndex() {
      return this._cell.getRowIndex();
   }

   public EvaluationSheet getSheet() {
      return this._evalSheet;
   }

   public String getStringCellValue() {
      return this._cell.getRichStringCellValue().getString();
   }

   public int getCachedFormulaResultType() {
      return this._cell.getCachedFormulaResultType();
   }

   @Internal(
      since = "POI 3.15 beta 3"
   )
   public CellType getCachedFormulaResultTypeEnum() {
      return this._cell.getCachedFormulaResultTypeEnum();
   }
}
