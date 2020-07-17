package org.apache.poi.xssf.streaming;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.util.Internal;

@Internal
class AutoSizeColumnTracker {

   private final int defaultCharWidth;
   private final DataFormatter dataFormatter = new DataFormatter();
   private final Map maxColumnWidths = new HashMap();
   private final Set untrackedColumns = new HashSet();
   private boolean trackAllColumns = false;


   public AutoSizeColumnTracker(Sheet sheet) {
      this.defaultCharWidth = SheetUtil.getDefaultCharWidth(sheet.getWorkbook());
   }

   public SortedSet getTrackedColumns() {
      TreeSet sorted = new TreeSet(this.maxColumnWidths.keySet());
      return Collections.unmodifiableSortedSet(sorted);
   }

   public boolean isColumnTracked(int column) {
      return this.trackAllColumns || this.maxColumnWidths.containsKey(Integer.valueOf(column));
   }

   public boolean isAllColumnsTracked() {
      return this.trackAllColumns;
   }

   public void trackAllColumns() {
      this.trackAllColumns = true;
      this.untrackedColumns.clear();
   }

   public void untrackAllColumns() {
      this.trackAllColumns = false;
      this.maxColumnWidths.clear();
      this.untrackedColumns.clear();
   }

   public void trackColumns(Collection columns) {
      Iterator i$ = columns.iterator();

      while(i$.hasNext()) {
         int column = ((Integer)i$.next()).intValue();
         this.trackColumn(column);
      }

   }

   public boolean trackColumn(int column) {
      this.untrackedColumns.remove(Integer.valueOf(column));
      if(!this.maxColumnWidths.containsKey(Integer.valueOf(column))) {
         this.maxColumnWidths.put(Integer.valueOf(column), new AutoSizeColumnTracker.ColumnWidthPair());
         return true;
      } else {
         return false;
      }
   }

   private boolean implicitlyTrackColumn(int column) {
      if(!this.untrackedColumns.contains(Integer.valueOf(column))) {
         this.trackColumn(column);
         return true;
      } else {
         return false;
      }
   }

   public boolean untrackColumns(Collection columns) {
      this.untrackedColumns.addAll(columns);
      return this.maxColumnWidths.keySet().removeAll(columns);
   }

   public boolean untrackColumn(int column) {
      this.untrackedColumns.add(Integer.valueOf(column));
      return this.maxColumnWidths.keySet().remove(Integer.valueOf(column));
   }

   public int getBestFitColumnWidth(int column, boolean useMergedCells) {
      if(!this.maxColumnWidths.containsKey(Integer.valueOf(column))) {
         IllegalStateException width1;
         if(!this.trackAllColumns) {
            width1 = new IllegalStateException("Column was never explicitly tracked and isAllColumnsTracked() is false (trackAllColumns() was never called or untrackAllColumns() was called after trackAllColumns() was called).");
            throw new IllegalStateException("Cannot get best fit column width on untracked column " + column + ". " + "Either explicitly track the column or track all columns.", width1);
         }

         if(!this.implicitlyTrackColumn(column)) {
            width1 = new IllegalStateException("Column was explicitly untracked after trackAllColumns() was called.");
            throw new IllegalStateException("Cannot get best fit column width on explicitly untracked column " + column + ". " + "Either explicitly track the column or track all columns.", width1);
         }
      }

      double width = ((AutoSizeColumnTracker.ColumnWidthPair)this.maxColumnWidths.get(Integer.valueOf(column))).getMaxColumnWidth(useMergedCells);
      return (int)(256.0D * width);
   }

   public void updateColumnWidths(Row row) {
      this.implicitlyTrackColumnsInRow(row);
      Iterator i$;
      int column;
      if(this.maxColumnWidths.size() < row.getPhysicalNumberOfCells()) {
         i$ = this.maxColumnWidths.entrySet().iterator();

         while(i$.hasNext()) {
            Entry cell = (Entry)i$.next();
            column = ((Integer)cell.getKey()).intValue();
            Cell pair = row.getCell(column);
            if(pair != null) {
               AutoSizeColumnTracker.ColumnWidthPair pair1 = (AutoSizeColumnTracker.ColumnWidthPair)cell.getValue();
               this.updateColumnWidth(pair, pair1);
            }
         }
      } else {
         i$ = row.iterator();

         while(i$.hasNext()) {
            Cell cell1 = (Cell)i$.next();
            column = cell1.getColumnIndex();
            if(this.maxColumnWidths.containsKey(Integer.valueOf(column))) {
               AutoSizeColumnTracker.ColumnWidthPair pair2 = (AutoSizeColumnTracker.ColumnWidthPair)this.maxColumnWidths.get(Integer.valueOf(column));
               this.updateColumnWidth(cell1, pair2);
            }
         }
      }

   }

   private void implicitlyTrackColumnsInRow(Row row) {
      if(this.trackAllColumns) {
         Iterator i$ = row.iterator();

         while(i$.hasNext()) {
            Cell cell = (Cell)i$.next();
            int column = cell.getColumnIndex();
            this.implicitlyTrackColumn(column);
         }
      }

   }

   private void updateColumnWidth(Cell cell, AutoSizeColumnTracker.ColumnWidthPair pair) {
      double unmergedWidth = SheetUtil.getCellWidth(cell, this.defaultCharWidth, this.dataFormatter, false);
      double mergedWidth = SheetUtil.getCellWidth(cell, this.defaultCharWidth, this.dataFormatter, true);
      pair.setMaxColumnWidths(unmergedWidth, mergedWidth);
   }

   private static class ColumnWidthPair {

      private double withSkipMergedCells;
      private double withUseMergedCells;


      public ColumnWidthPair() {
         this(-1.0D, -1.0D);
      }

      public ColumnWidthPair(double columnWidthSkipMergedCells, double columnWidthUseMergedCells) {
         this.withSkipMergedCells = columnWidthSkipMergedCells;
         this.withUseMergedCells = columnWidthUseMergedCells;
      }

      public double getMaxColumnWidth(boolean useMergedCells) {
         return useMergedCells?this.withUseMergedCells:this.withSkipMergedCells;
      }

      public void setMaxColumnWidths(double unmergedWidth, double mergedWidth) {
         this.withUseMergedCells = Math.max(this.withUseMergedCells, mergedWidth);
         this.withSkipMergedCells = Math.max(this.withUseMergedCells, unmergedWidth);
      }
   }
}
