package org.apache.poi.xssf.streaming;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFSheet;

public class SXSSFRow implements Row, Comparable {

   private static final Boolean UNDEFINED = null;
   private final SXSSFSheet _sheet;
   private final SortedMap _cells;
   private short _style;
   private short _height;
   private boolean _zHeight;
   private int _outlineLevel;
   private Boolean _hidden;
   private Boolean _collapsed;


   @Deprecated
   public SXSSFRow(SXSSFSheet sheet, int initialSize) {
      this(sheet);
   }

   public SXSSFRow(SXSSFSheet sheet) {
      this._cells = new TreeMap();
      this._style = -1;
      this._height = -1;
      this._zHeight = false;
      this._outlineLevel = 0;
      this._hidden = UNDEFINED;
      this._collapsed = UNDEFINED;
      this._sheet = sheet;
   }

   public Iterator allCellsIterator() {
      return new SXSSFRow.CellIterator();
   }

   public boolean hasCustomHeight() {
      return this._height != -1;
   }

   public int getOutlineLevel() {
      return this._outlineLevel;
   }

   void setOutlineLevel(int level) {
      this._outlineLevel = level;
   }

   public Boolean getHidden() {
      return this._hidden;
   }

   public void setHidden(Boolean hidden) {
      this._hidden = hidden;
   }

   public Boolean getCollapsed() {
      return this._collapsed;
   }

   public void setCollapsed(Boolean collapsed) {
      this._collapsed = collapsed;
   }

   public Iterator iterator() {
      return new SXSSFRow.FilledCellIterator();
   }

   public SXSSFCell createCell(int column) {
      return this.createCell(column, CellType.BLANK);
   }

   public SXSSFCell createCell(int column, int type) {
      return this.createCell(column, CellType.forInt(type));
   }

   public SXSSFCell createCell(int column, CellType type) {
      checkBounds(column);
      SXSSFCell cell = new SXSSFCell(this, type);
      this._cells.put(Integer.valueOf(column), cell);
      return cell;
   }

   private static void checkBounds(int cellIndex) {
      SpreadsheetVersion v = SpreadsheetVersion.EXCEL2007;
      int maxcol = SpreadsheetVersion.EXCEL2007.getLastColumnIndex();
      if(cellIndex < 0 || cellIndex > maxcol) {
         throw new IllegalArgumentException("Invalid column index (" + cellIndex + ").  Allowable column range for " + v.name() + " is (0.." + maxcol + ") or (\'A\'..\'" + v.getLastColumnName() + "\')");
      }
   }

   public void removeCell(Cell cell) {
      int index = this.getCellIndex((SXSSFCell)cell);
      this._cells.remove(Integer.valueOf(index));
   }

   int getCellIndex(SXSSFCell cell) {
      Iterator i$ = this._cells.entrySet().iterator();

      Entry entry;
      do {
         if(!i$.hasNext()) {
            return -1;
         }

         entry = (Entry)i$.next();
      } while(entry.getValue() != cell);

      return ((Integer)entry.getKey()).intValue();
   }

   public void setRowNum(int rowNum) {
      this._sheet.changeRowNum(this, rowNum);
   }

   public int getRowNum() {
      return this._sheet.getRowNum(this);
   }

   public SXSSFCell getCell(int cellnum) {
      Row.MissingCellPolicy policy = this._sheet.getWorkbook().getMissingCellPolicy();
      return this.getCell(cellnum, policy);
   }

   public SXSSFCell getCell(int cellnum, Row.MissingCellPolicy policy) {
      checkBounds(cellnum);
      SXSSFCell cell = (SXSSFCell)this._cells.get(Integer.valueOf(cellnum));
      switch(SXSSFRow.NamelessClass782093918.$SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[policy.ordinal()]) {
      case 1:
         return cell;
      case 2:
         boolean isBlank = cell != null && cell.getCellTypeEnum() == CellType.BLANK;
         return isBlank?null:cell;
      case 3:
         return cell == null?this.createCell(cellnum, CellType.BLANK):cell;
      default:
         throw new IllegalArgumentException("Illegal policy " + policy + " (" + policy.id + ")");
      }
   }

   public short getFirstCellNum() {
      try {
         return ((Integer)this._cells.firstKey()).shortValue();
      } catch (NoSuchElementException var2) {
         return (short)-1;
      }
   }

   public short getLastCellNum() {
      return this._cells.isEmpty()?-1:(short)(((Integer)this._cells.lastKey()).intValue() + 1);
   }

   public int getPhysicalNumberOfCells() {
      return this._cells.size();
   }

   public void setHeight(short height) {
      this._height = height;
   }

   public void setZeroHeight(boolean zHeight) {
      this._zHeight = zHeight;
   }

   public boolean getZeroHeight() {
      return this._zHeight;
   }

   public void setHeightInPoints(float height) {
      if(height == -1.0F) {
         this._height = -1;
      } else {
         this._height = (short)((int)(height * 20.0F));
      }

   }

   public short getHeight() {
      return (short)((int)(this._height == -1?this.getSheet().getDefaultRowHeightInPoints() * 20.0F:(float)this._height));
   }

   public float getHeightInPoints() {
      return (float)(this._height == -1?(double)this.getSheet().getDefaultRowHeightInPoints():(double)this._height / 20.0D);
   }

   public boolean isFormatted() {
      return this._style > -1;
   }

   public CellStyle getRowStyle() {
      return !this.isFormatted()?null:this.getSheet().getWorkbook().getCellStyleAt(this._style);
   }

   @Internal
   int getRowStyleIndex() {
      return this._style;
   }

   public void setRowStyle(CellStyle style) {
      if(style == null) {
         this._style = -1;
      } else {
         this._style = style.getIndex();
      }

   }

   public Iterator cellIterator() {
      return this.iterator();
   }

   public SXSSFSheet getSheet() {
      return this._sheet;
   }

   public int compareTo(SXSSFRow other) {
      if(this.getSheet() != other.getSheet()) {
         throw new IllegalArgumentException("The compared rows must belong to the same sheet");
      } else {
         Integer thisRow = Integer.valueOf(this.getRowNum());
         Integer otherRow = Integer.valueOf(other.getRowNum());
         return thisRow.compareTo(otherRow);
      }
   }

   public boolean equals(Object obj) {
      if(!(obj instanceof SXSSFRow)) {
         return false;
      } else {
         SXSSFRow other = (SXSSFRow)obj;
         return this.getRowNum() == other.getRowNum() && this.getSheet() == other.getSheet();
      }
   }

   public int hashCode() {
      return this._cells.hashCode();
   }


   // $FF: synthetic class
   static class NamelessClass782093918 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy = new int[Row.MissingCellPolicy.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[Row.MissingCellPolicy.RETURN_NULL_AND_BLANK.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[Row.MissingCellPolicy.RETURN_BLANK_AS_NULL.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[Row.MissingCellPolicy.CREATE_NULL_AS_BLANK.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public class FilledCellIterator implements Iterator {

      private final Iterator iter;


      public FilledCellIterator() {
         this.iter = SXSSFRow.this._cells.values().iterator();
      }

      public boolean hasNext() {
         return this.iter.hasNext();
      }

      public Cell next() throws NoSuchElementException {
         return (Cell)this.iter.next();
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }
   }

   public class CellIterator implements Iterator {

      final int maxColumn = SXSSFRow.this.getLastCellNum();
      int pos = 0;


      public boolean hasNext() {
         return this.pos < this.maxColumn;
      }

      public Cell next() throws NoSuchElementException {
         if(this.hasNext()) {
            return (Cell)SXSSFRow.this._cells.get(Integer.valueOf(this.pos++));
         } else {
            throw new NoSuchElementException();
         }
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }
   }
}
