package org.apache.poi.ss.formula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.util.CellReference;

final class FormulaUsedBlankCellSet {

   private final Map _sheetGroupsByBookSheet = new HashMap();


   public void addCell(int bookIndex, int sheetIndex, int rowIndex, int columnIndex) {
      FormulaUsedBlankCellSet.BlankCellSheetGroup sbcg = this.getSheetGroup(bookIndex, sheetIndex);
      sbcg.addCell(rowIndex, columnIndex);
   }

   private FormulaUsedBlankCellSet.BlankCellSheetGroup getSheetGroup(int bookIndex, int sheetIndex) {
      FormulaUsedBlankCellSet.BookSheetKey key = new FormulaUsedBlankCellSet.BookSheetKey(bookIndex, sheetIndex);
      FormulaUsedBlankCellSet.BlankCellSheetGroup result = (FormulaUsedBlankCellSet.BlankCellSheetGroup)this._sheetGroupsByBookSheet.get(key);
      if(result == null) {
         result = new FormulaUsedBlankCellSet.BlankCellSheetGroup();
         this._sheetGroupsByBookSheet.put(key, result);
      }

      return result;
   }

   public boolean containsCell(FormulaUsedBlankCellSet.BookSheetKey key, int rowIndex, int columnIndex) {
      FormulaUsedBlankCellSet.BlankCellSheetGroup bcsg = (FormulaUsedBlankCellSet.BlankCellSheetGroup)this._sheetGroupsByBookSheet.get(key);
      return bcsg == null?false:bcsg.containsCell(rowIndex, columnIndex);
   }

   public boolean isEmpty() {
      return this._sheetGroupsByBookSheet.isEmpty();
   }

   private static final class BlankCellRectangleGroup {

      private final int _firstRowIndex;
      private final int _firstColumnIndex;
      private final int _lastColumnIndex;
      private int _lastRowIndex;


      public BlankCellRectangleGroup(int firstRowIndex, int firstColumnIndex, int lastColumnIndex) {
         this._firstRowIndex = firstRowIndex;
         this._firstColumnIndex = firstColumnIndex;
         this._lastColumnIndex = lastColumnIndex;
         this._lastRowIndex = firstRowIndex;
      }

      public boolean containsCell(int rowIndex, int columnIndex) {
         return columnIndex < this._firstColumnIndex?false:(columnIndex > this._lastColumnIndex?false:(rowIndex < this._firstRowIndex?false:rowIndex <= this._lastRowIndex));
      }

      public boolean acceptRow(int rowIndex, int firstColumnIndex, int lastColumnIndex) {
         if(firstColumnIndex != this._firstColumnIndex) {
            return false;
         } else if(lastColumnIndex != this._lastColumnIndex) {
            return false;
         } else if(rowIndex != this._lastRowIndex + 1) {
            return false;
         } else {
            this._lastRowIndex = rowIndex;
            return true;
         }
      }

      public String toString() {
         StringBuffer sb = new StringBuffer(64);
         CellReference crA = new CellReference(this._firstRowIndex, this._firstColumnIndex, false, false);
         CellReference crB = new CellReference(this._lastRowIndex, this._lastColumnIndex, false, false);
         sb.append(this.getClass().getName());
         sb.append(" [").append(crA.formatAsString()).append(':').append(crB.formatAsString()).append("]");
         return sb.toString();
      }
   }

   public static final class BookSheetKey {

      private final int _bookIndex;
      private final int _sheetIndex;
      // $FF: synthetic field
      static final boolean $assertionsDisabled = !FormulaUsedBlankCellSet.class.desiredAssertionStatus();


      public BookSheetKey(int bookIndex, int sheetIndex) {
         this._bookIndex = bookIndex;
         this._sheetIndex = sheetIndex;
      }

      public int hashCode() {
         return this._bookIndex * 17 + this._sheetIndex;
      }

      public boolean equals(Object obj) {
         if(!$assertionsDisabled && !(obj instanceof FormulaUsedBlankCellSet.BookSheetKey)) {
            throw new AssertionError("these private cache key instances are only compared to themselves");
         } else {
            FormulaUsedBlankCellSet.BookSheetKey other = (FormulaUsedBlankCellSet.BookSheetKey)obj;
            return this._bookIndex == other._bookIndex && this._sheetIndex == other._sheetIndex;
         }
      }

   }

   private static final class BlankCellSheetGroup {

      private final List _rectangleGroups = new ArrayList();
      private int _currentRowIndex = -1;
      private int _firstColumnIndex;
      private int _lastColumnIndex;
      private FormulaUsedBlankCellSet.BlankCellRectangleGroup _currentRectangleGroup;


      public void addCell(int rowIndex, int columnIndex) {
         if(this._currentRowIndex == -1) {
            this._currentRowIndex = rowIndex;
            this._firstColumnIndex = columnIndex;
            this._lastColumnIndex = columnIndex;
         } else if(this._currentRowIndex == rowIndex && this._lastColumnIndex + 1 == columnIndex) {
            this._lastColumnIndex = columnIndex;
         } else {
            if(this._currentRectangleGroup == null) {
               this._currentRectangleGroup = new FormulaUsedBlankCellSet.BlankCellRectangleGroup(this._currentRowIndex, this._firstColumnIndex, this._lastColumnIndex);
            } else if(!this._currentRectangleGroup.acceptRow(this._currentRowIndex, this._firstColumnIndex, this._lastColumnIndex)) {
               this._rectangleGroups.add(this._currentRectangleGroup);
               this._currentRectangleGroup = new FormulaUsedBlankCellSet.BlankCellRectangleGroup(this._currentRowIndex, this._firstColumnIndex, this._lastColumnIndex);
            }

            this._currentRowIndex = rowIndex;
            this._firstColumnIndex = columnIndex;
            this._lastColumnIndex = columnIndex;
         }

      }

      public boolean containsCell(int rowIndex, int columnIndex) {
         for(int i = this._rectangleGroups.size() - 1; i >= 0; --i) {
            FormulaUsedBlankCellSet.BlankCellRectangleGroup bcrg = (FormulaUsedBlankCellSet.BlankCellRectangleGroup)this._rectangleGroups.get(i);
            if(bcrg.containsCell(rowIndex, columnIndex)) {
               return true;
            }
         }

         if(this._currentRectangleGroup != null && this._currentRectangleGroup.containsCell(rowIndex, columnIndex)) {
            return true;
         } else if(this._currentRowIndex != -1 && this._currentRowIndex == rowIndex && this._firstColumnIndex <= columnIndex && columnIndex <= this._lastColumnIndex) {
            return true;
         } else {
            return false;
         }
      }
   }
}
