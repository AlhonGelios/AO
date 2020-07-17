package org.apache.poi.ss.util;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellRange;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.Internal;

@Internal
public final class SSCellRange implements CellRange {

   private final int _height;
   private final int _width;
   private final Cell[] _flattenedArray;
   private final int _firstRow;
   private final int _firstColumn;


   private SSCellRange(int firstRow, int firstColumn, int height, int width, Cell[] flattenedArray) {
      this._firstRow = firstRow;
      this._firstColumn = firstColumn;
      this._height = height;
      this._width = width;
      this._flattenedArray = (Cell[])flattenedArray.clone();
   }

   public static SSCellRange create(int firstRow, int firstColumn, int height, int width, List flattenedList, Class cellClass) {
      int nItems = flattenedList.size();
      if(height * width != nItems) {
         throw new IllegalArgumentException("Array size mismatch.");
      } else {
         Cell[] flattenedArray = (Cell[])((Cell[])Array.newInstance(cellClass, nItems));
         flattenedList.toArray(flattenedArray);
         return new SSCellRange(firstRow, firstColumn, height, width, flattenedArray);
      }
   }

   public int getHeight() {
      return this._height;
   }

   public int getWidth() {
      return this._width;
   }

   public int size() {
      return this._height * this._width;
   }

   public String getReferenceText() {
      CellRangeAddress cra = new CellRangeAddress(this._firstRow, this._firstRow + this._height - 1, this._firstColumn, this._firstColumn + this._width - 1);
      return cra.formatAsString();
   }

   public Cell getTopLeftCell() {
      return this._flattenedArray[0];
   }

   public Cell getCell(int relativeRowIndex, int relativeColumnIndex) {
      if(relativeRowIndex >= 0 && relativeRowIndex < this._height) {
         if(relativeColumnIndex >= 0 && relativeColumnIndex < this._width) {
            int flatIndex = this._width * relativeRowIndex + relativeColumnIndex;
            return this._flattenedArray[flatIndex];
         } else {
            throw new ArrayIndexOutOfBoundsException("Specified colummn " + relativeColumnIndex + " is outside the allowable range (0.." + (this._width - 1) + ").");
         }
      } else {
         throw new ArrayIndexOutOfBoundsException("Specified row " + relativeRowIndex + " is outside the allowable range (0.." + (this._height - 1) + ").");
      }
   }

   public Cell[] getFlattenedCells() {
      return (Cell[])this._flattenedArray.clone();
   }

   public Cell[][] getCells() {
      Class itemCls = this._flattenedArray.getClass();
      Cell[][] result = (Cell[][])((Cell[][])Array.newInstance(itemCls, this._height));
      itemCls = itemCls.getComponentType();

      for(int r = this._height - 1; r >= 0; --r) {
         Cell[] row = (Cell[])((Cell[])Array.newInstance(itemCls, this._width));
         int flatIndex = this._width * r;
         System.arraycopy(this._flattenedArray, flatIndex, row, 0, this._width);
      }

      return result;
   }

   public Iterator iterator() {
      return new SSCellRange.ArrayIterator(this._flattenedArray);
   }

   private static final class ArrayIterator implements Iterator {

      private final Object[] _array;
      private int _index;


      public ArrayIterator(Object[] array) {
         this._array = (Object[])array.clone();
         this._index = 0;
      }

      public boolean hasNext() {
         return this._index < this._array.length;
      }

      public Object next() {
         if(this._index >= this._array.length) {
            throw new NoSuchElementException(String.valueOf(this._index));
         } else {
            return this._array[this._index++];
         }
      }

      public void remove() {
         throw new UnsupportedOperationException("Cannot remove cells from this CellRange.");
      }
   }
}
