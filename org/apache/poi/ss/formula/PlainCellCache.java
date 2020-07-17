package org.apache.poi.ss.formula;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.formula.PlainValueCellCacheEntry;

final class PlainCellCache {

   private Map _plainValueEntriesByLoc = new HashMap();


   public void put(PlainCellCache.Loc key, PlainValueCellCacheEntry cce) {
      this._plainValueEntriesByLoc.put(key, cce);
   }

   public void clear() {
      this._plainValueEntriesByLoc.clear();
   }

   public PlainValueCellCacheEntry get(PlainCellCache.Loc key) {
      return (PlainValueCellCacheEntry)this._plainValueEntriesByLoc.get(key);
   }

   public void remove(PlainCellCache.Loc key) {
      this._plainValueEntriesByLoc.remove(key);
   }

   public static final class Loc {

      private final long _bookSheetColumn;
      private final int _rowIndex;
      // $FF: synthetic field
      static final boolean $assertionsDisabled = !PlainCellCache.class.desiredAssertionStatus();


      public Loc(int bookIndex, int sheetIndex, int rowIndex, int columnIndex) {
         this._bookSheetColumn = toBookSheetColumn(bookIndex, sheetIndex, columnIndex);
         this._rowIndex = rowIndex;
      }

      public static long toBookSheetColumn(int bookIndex, int sheetIndex, int columnIndex) {
         return (((long)bookIndex & 65535L) << 48) + (((long)sheetIndex & 65535L) << 32) + (((long)columnIndex & 65535L) << 0);
      }

      public Loc(long bookSheetColumn, int rowIndex) {
         this._bookSheetColumn = bookSheetColumn;
         this._rowIndex = rowIndex;
      }

      public int hashCode() {
         return (int)(this._bookSheetColumn ^ this._bookSheetColumn >>> 32) + 17 * this._rowIndex;
      }

      public boolean equals(Object obj) {
         if(!$assertionsDisabled && !(obj instanceof PlainCellCache.Loc)) {
            throw new AssertionError("these package-private cache key instances are only compared to themselves");
         } else {
            PlainCellCache.Loc other = (PlainCellCache.Loc)obj;
            return this._bookSheetColumn == other._bookSheetColumn && this._rowIndex == other._rowIndex;
         }
      }

      public int getRowIndex() {
         return this._rowIndex;
      }

      public int getColumnIndex() {
         return (int)(this._bookSheetColumn & 65535L);
      }

      public int getSheetIndex() {
         return (int)(this._bookSheetColumn >> 32 & 65535L);
      }

      public int getBookIndex() {
         return (int)(this._bookSheetColumn >> 48 & 65535L);
      }

   }
}
