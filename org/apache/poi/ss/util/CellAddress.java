package org.apache.poi.ss.util;

import java.util.Locale;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellReference;

public class CellAddress implements Comparable {

   public static final CellAddress A1 = new CellAddress(0, 0);
   private final int _row;
   private final int _col;


   public CellAddress(int row, int column) {
      this._row = row;
      this._col = column;
   }

   public CellAddress(String address) {
      int length = address.length();

      int loc;
      for(loc = 0; loc < length; ++loc) {
         char sCol = address.charAt(loc);
         if(Character.isDigit(sCol)) {
            break;
         }
      }

      String var6 = address.substring(0, loc).toUpperCase(Locale.ROOT);
      String sRow = address.substring(loc);
      this._row = Integer.parseInt(sRow) - 1;
      this._col = CellReference.convertColStringToIndex(var6);
   }

   public CellAddress(CellReference reference) {
      this(reference.getRow(), reference.getCol());
   }

   public CellAddress(Cell cell) {
      this(cell.getRowIndex(), cell.getColumnIndex());
   }

   public int getRow() {
      return this._row;
   }

   public int getColumn() {
      return this._col;
   }

   public int compareTo(CellAddress other) {
      int r = this._row - other._row;
      if(r != 0) {
         return r;
      } else {
         r = this._col - other._col;
         return r != 0?r:0;
      }
   }

   public boolean equals(Object o) {
      if(this == o) {
         return true;
      } else if(!(o instanceof CellAddress)) {
         return false;
      } else {
         CellAddress other = (CellAddress)o;
         return this._row == other._row && this._col == other._col;
      }
   }

   public int hashCode() {
      return this._row + this._col << 16;
   }

   public String toString() {
      return this.formatAsString();
   }

   public String formatAsString() {
      return CellReference.convertNumToColString(this._col) + (this._row + 1);
   }

}
