package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFEvaluationCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.util.Internal;

@Internal
final class HSSFEvaluationSheet implements EvaluationSheet {

   private final HSSFSheet _hs;


   public HSSFEvaluationSheet(HSSFSheet hs) {
      this._hs = hs;
   }

   public HSSFSheet getHSSFSheet() {
      return this._hs;
   }

   public EvaluationCell getCell(int rowIndex, int columnIndex) {
      HSSFRow row = this._hs.getRow(rowIndex);
      if(row == null) {
         return null;
      } else {
         HSSFCell cell = row.getCell(columnIndex);
         return cell == null?null:new HSSFEvaluationCell(cell, this);
      }
   }

   public void clearAllCachedResultValues() {}
}
