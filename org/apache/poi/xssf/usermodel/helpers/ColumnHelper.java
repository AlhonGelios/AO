package org.apache.poi.xssf.usermodel.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.util.CTColComparator;
import org.apache.poi.xssf.util.NumericRanges;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCol;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;

public class ColumnHelper {

   private CTWorksheet worksheet;


   public ColumnHelper(CTWorksheet worksheet) {
      this.worksheet = worksheet;
      this.cleanColumns();
   }

   public void cleanColumns() {
      TreeSet trackedCols = new TreeSet(CTColComparator.BY_MIN_MAX);
      CTCols newCols = CTCols.Factory.newInstance();
      CTCols[] colsArray = this.worksheet.getColsArray();
      boolean i = false;

      int var11;
      for(var11 = 0; var11 < colsArray.length; ++var11) {
         CTCols y = colsArray[var11];
         CTCol[] colArray = y.getColArray();
         CTCol[] arr$ = colArray;
         int len$ = colArray.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTCol col = arr$[i$];
            this.addCleanColIntoCols(newCols, col, trackedCols);
         }
      }

      for(int var12 = var11 - 1; var12 >= 0; --var12) {
         this.worksheet.removeCols(var12);
      }

      newCols.setColArray((CTCol[])trackedCols.toArray(new CTCol[trackedCols.size()]));
      this.worksheet.addNewCols();
      this.worksheet.setColsArray(0, newCols);
   }

   public CTCols addCleanColIntoCols(CTCols cols, CTCol newCol) {
      TreeSet trackedCols = new TreeSet(CTColComparator.BY_MIN_MAX);
      trackedCols.addAll(cols.getColList());
      this.addCleanColIntoCols(cols, newCol, trackedCols);
      cols.setColArray((CTCol[])trackedCols.toArray(new CTCol[0]));
      return cols;
   }

   private void addCleanColIntoCols(CTCols cols, CTCol newCol, TreeSet trackedCols) {
      List overlapping = this.getOverlappingCols(newCol, trackedCols);
      if(overlapping.isEmpty()) {
         trackedCols.add(this.cloneCol(cols, newCol));
      } else {
         trackedCols.removeAll(overlapping);
         Iterator i$ = overlapping.iterator();

         while(i$.hasNext()) {
            CTCol existing = (CTCol)i$.next();
            long[] overlap = this.getOverlap(newCol, existing);
            CTCol overlapCol = this.cloneCol(cols, existing, overlap);
            this.setColumnAttributes(newCol, overlapCol);
            trackedCols.add(overlapCol);
            CTCol beforeCol = existing.getMin() < newCol.getMin()?existing:newCol;
            long[] before = new long[]{Math.min(existing.getMin(), newCol.getMin()), overlap[0] - 1L};
            if(before[0] <= before[1]) {
               trackedCols.add(this.cloneCol(cols, beforeCol, before));
            }

            CTCol afterCol = existing.getMax() > newCol.getMax()?existing:newCol;
            long[] after = new long[]{overlap[1] + 1L, Math.max(existing.getMax(), newCol.getMax())};
            if(after[0] <= after[1]) {
               trackedCols.add(this.cloneCol(cols, afterCol, after));
            }
         }

      }
   }

   private CTCol cloneCol(CTCols cols, CTCol col, long[] newRange) {
      CTCol cloneCol = this.cloneCol(cols, col);
      cloneCol.setMin(newRange[0]);
      cloneCol.setMax(newRange[1]);
      return cloneCol;
   }

   private long[] getOverlap(CTCol col1, CTCol col2) {
      return this.getOverlappingRange(col1, col2);
   }

   private List getOverlappingCols(CTCol newCol, TreeSet trackedCols) {
      CTCol lower = (CTCol)trackedCols.lower(newCol);
      Object potentiallyOverlapping = lower == null?trackedCols:trackedCols.tailSet(lower, this.overlaps(lower, newCol));
      ArrayList overlapping = new ArrayList();
      Iterator i$ = ((NavigableSet)potentiallyOverlapping).iterator();

      while(i$.hasNext()) {
         CTCol existing = (CTCol)i$.next();
         if(!this.overlaps(newCol, existing)) {
            break;
         }

         overlapping.add(existing);
      }

      return overlapping;
   }

   private boolean overlaps(CTCol col1, CTCol col2) {
      return NumericRanges.getOverlappingType(this.toRange(col1), this.toRange(col2)) != -1;
   }

   private long[] getOverlappingRange(CTCol col1, CTCol col2) {
      return NumericRanges.getOverlappingRange(this.toRange(col1), this.toRange(col2));
   }

   private long[] toRange(CTCol col) {
      return new long[]{col.getMin(), col.getMax()};
   }

   public static void sortColumns(CTCols newCols) {
      CTCol[] colArray = newCols.getColArray();
      Arrays.sort(colArray, CTColComparator.BY_MIN_MAX);
      newCols.setColArray(colArray);
   }

   public CTCol cloneCol(CTCols cols, CTCol col) {
      CTCol newCol = cols.addNewCol();
      newCol.setMin(col.getMin());
      newCol.setMax(col.getMax());
      this.setColumnAttributes(col, newCol);
      return newCol;
   }

   public CTCol getColumn(long index, boolean splitColumns) {
      return this.getColumn1Based(index + 1L, splitColumns);
   }

   public CTCol getColumn1Based(long index1, boolean splitColumns) {
      CTCols cols = this.worksheet.getColsArray(0);
      CTCol[] colArray = cols.getColArray();
      CTCol[] arr$ = colArray;
      int len$ = colArray.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCol col = arr$[i$];
         long colMin = col.getMin();
         long colMax = col.getMax();
         if(colMin <= index1 && colMax >= index1) {
            if(splitColumns) {
               if(colMin < index1) {
                  this.insertCol(cols, colMin, index1 - 1L, new CTCol[]{col});
               }

               if(colMax > index1) {
                  this.insertCol(cols, index1 + 1L, colMax, new CTCol[]{col});
               }

               col.setMin(index1);
               col.setMax(index1);
            }

            return col;
         }
      }

      return null;
   }

   private CTCol insertCol(CTCols cols, long min, long max, CTCol[] colsWithAttributes) {
      return this.insertCol(cols, min, max, colsWithAttributes, false, (CTCol)null);
   }

   private CTCol insertCol(CTCols cols, long min, long max, CTCol[] colsWithAttributes, boolean ignoreExistsCheck, CTCol overrideColumn) {
      if(!ignoreExistsCheck && this.columnExists(cols, min, max)) {
         return null;
      } else {
         CTCol newCol = cols.insertNewCol(0);
         newCol.setMin(min);
         newCol.setMax(max);
         CTCol[] arr$ = colsWithAttributes;
         int len$ = colsWithAttributes.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTCol col = arr$[i$];
            this.setColumnAttributes(col, newCol);
         }

         if(overrideColumn != null) {
            this.setColumnAttributes(overrideColumn, newCol);
         }

         return newCol;
      }
   }

   public boolean columnExists(CTCols cols, long index) {
      return this.columnExists1Based(cols, index + 1L);
   }

   private boolean columnExists1Based(CTCols cols, long index1) {
      CTCol[] arr$ = cols.getColArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCol col = arr$[i$];
         if(col.getMin() == index1) {
            return true;
         }
      }

      return false;
   }

   public void setColumnAttributes(CTCol fromCol, CTCol toCol) {
      if(fromCol.isSetBestFit()) {
         toCol.setBestFit(fromCol.getBestFit());
      }

      if(fromCol.isSetCustomWidth()) {
         toCol.setCustomWidth(fromCol.getCustomWidth());
      }

      if(fromCol.isSetHidden()) {
         toCol.setHidden(fromCol.getHidden());
      }

      if(fromCol.isSetStyle()) {
         toCol.setStyle(fromCol.getStyle());
      }

      if(fromCol.isSetWidth()) {
         toCol.setWidth(fromCol.getWidth());
      }

      if(fromCol.isSetCollapsed()) {
         toCol.setCollapsed(fromCol.getCollapsed());
      }

      if(fromCol.isSetPhonetic()) {
         toCol.setPhonetic(fromCol.getPhonetic());
      }

      if(fromCol.isSetOutlineLevel()) {
         toCol.setOutlineLevel(fromCol.getOutlineLevel());
      }

      toCol.setCollapsed(fromCol.isSetCollapsed());
   }

   public void setColBestFit(long index, boolean bestFit) {
      CTCol col = this.getOrCreateColumn1Based(index + 1L, false);
      col.setBestFit(bestFit);
   }

   public void setCustomWidth(long index, boolean bestFit) {
      CTCol col = this.getOrCreateColumn1Based(index + 1L, true);
      col.setCustomWidth(bestFit);
   }

   public void setColWidth(long index, double width) {
      CTCol col = this.getOrCreateColumn1Based(index + 1L, true);
      col.setWidth(width);
   }

   public void setColHidden(long index, boolean hidden) {
      CTCol col = this.getOrCreateColumn1Based(index + 1L, true);
      col.setHidden(hidden);
   }

   protected CTCol getOrCreateColumn1Based(long index1, boolean splitColumns) {
      CTCol col = this.getColumn1Based(index1, splitColumns);
      if(col == null) {
         col = this.worksheet.getColsArray(0).addNewCol();
         col.setMin(index1);
         col.setMax(index1);
      }

      return col;
   }

   public void setColDefaultStyle(long index, CellStyle style) {
      this.setColDefaultStyle(index, style.getIndex());
   }

   public void setColDefaultStyle(long index, int styleId) {
      CTCol col = this.getOrCreateColumn1Based(index + 1L, true);
      col.setStyle((long)styleId);
   }

   public int getColDefaultStyle(long index) {
      return this.getColumn(index, false) != null?(int)this.getColumn(index, false).getStyle():-1;
   }

   private boolean columnExists(CTCols cols, long min, long max) {
      CTCol[] arr$ = cols.getColArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCol col = arr$[i$];
         if(col.getMin() == min && col.getMax() == max) {
            return true;
         }
      }

      return false;
   }

   public int getIndexOfColumn(CTCols cols, CTCol searchCol) {
      int i = 0;
      CTCol[] arr$ = cols.getColArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTCol col = arr$[i$];
         if(col.getMin() == searchCol.getMin() && col.getMax() == searchCol.getMax()) {
            return i;
         }

         ++i;
      }

      return -1;
   }
}
