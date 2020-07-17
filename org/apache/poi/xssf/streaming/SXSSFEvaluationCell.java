package org.apache.poi.xssf.streaming;

import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFEvaluationSheet;

final class SXSSFEvaluationCell implements EvaluationCell {

   private final EvaluationSheet _evalSheet;
   private final SXSSFCell _cell;


   public SXSSFEvaluationCell(SXSSFCell cell, SXSSFEvaluationSheet evaluationSheet) {
      this._cell = cell;
      this._evalSheet = evaluationSheet;
   }

   public SXSSFEvaluationCell(SXSSFCell cell) {
      this(cell, new SXSSFEvaluationSheet(cell.getSheet()));
   }

   public Object getIdentityKey() {
      return this._cell;
   }

   public SXSSFCell getSXSSFCell() {
      return this._cell;
   }

   public boolean getBooleanCellValue() {
      return this._cell.getBooleanCellValue();
   }

   public int getCellType() {
      return this._cell.getCellType();
   }

   @Internal(
      since = "POI 3.15 beta 3"
   )
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
