package org.apache.poi.xssf.usermodel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.ss.formula.EvaluationCell;
import org.apache.poi.ss.formula.EvaluationSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

@Internal
final class XSSFEvaluationSheet implements EvaluationSheet {

   private final XSSFSheet _xs;
   private Map _cellCache;


   public XSSFEvaluationSheet(XSSFSheet sheet) {
      this._xs = sheet;
   }

   public XSSFSheet getXSSFSheet() {
      return this._xs;
   }

   public void clearAllCachedResultValues() {
      this._cellCache = null;
   }

   public EvaluationCell getCell(int rowIndex, int columnIndex) {
      if(this._cellCache == null) {
         this._cellCache = new HashMap(this._xs.getLastRowNum() * 3);
         Iterator key = this._xs.iterator();

         while(key.hasNext()) {
            Row evalcell = (Row)key.next();
            int row = evalcell.getRowNum();
            Iterator cell = evalcell.iterator();

            while(cell.hasNext()) {
               Cell cell1 = (Cell)cell.next();
               XSSFEvaluationSheet.CellKey key1 = new XSSFEvaluationSheet.CellKey(row, cell1.getColumnIndex());
               XSSFEvaluationCell evalcell1 = new XSSFEvaluationCell((XSSFCell)cell1, this);
               this._cellCache.put(key1, evalcell1);
            }
         }
      }

      XSSFEvaluationSheet.CellKey key2 = new XSSFEvaluationSheet.CellKey(rowIndex, columnIndex);
      Object evalcell2 = (EvaluationCell)this._cellCache.get(key2);
      if(evalcell2 == null) {
         XSSFRow row1 = this._xs.getRow(rowIndex);
         if(row1 == null) {
            return null;
         }

         XSSFCell cell2 = row1.getCell(columnIndex);
         if(cell2 == null) {
            return null;
         }

         evalcell2 = new XSSFEvaluationCell(cell2, this);
         this._cellCache.put(key2, evalcell2);
      }

      return (EvaluationCell)evalcell2;
   }

   private static class CellKey {

      private final int _row;
      private final int _col;
      private int _hash = -1;


      protected CellKey(int row, int col) {
         this._row = row;
         this._col = col;
      }

      public int hashCode() {
         if(this._hash == -1) {
            this._hash = (629 + this._row) * 37 + this._col;
         }

         return this._hash;
      }

      public boolean equals(Object obj) {
         if(!(obj instanceof XSSFEvaluationSheet.CellKey)) {
            return false;
         } else {
            XSSFEvaluationSheet.CellKey oKey = (XSSFEvaluationSheet.CellKey)obj;
            return this._row == oKey._row && this._col == oKey._col;
         }
      }
   }
}
