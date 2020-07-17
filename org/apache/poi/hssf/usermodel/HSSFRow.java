package org.apache.poi.hssf.usermodel;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.poi.hssf.record.CellValueRecordInterface;
import org.apache.poi.hssf.record.ExtendedFormatRecord;
import org.apache.poi.hssf.record.RowRecord;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.Configurator;

public final class HSSFRow implements Row, Comparable {

   public static final int INITIAL_CAPACITY = Configurator.getIntValue("HSSFRow.ColInitialCapacity", 5);
   private int rowNum;
   private HSSFCell[] cells;
   private final RowRecord row;
   private final HSSFWorkbook book;
   private final HSSFSheet sheet;


   HSSFRow(HSSFWorkbook book, HSSFSheet sheet, int rowNum) {
      this(book, sheet, new RowRecord(rowNum));
   }

   HSSFRow(HSSFWorkbook book, HSSFSheet sheet, RowRecord record) {
      this.book = book;
      this.sheet = sheet;
      this.row = record;
      this.setRowNum(record.getRowNumber());
      this.cells = new HSSFCell[record.getLastCol() + INITIAL_CAPACITY];
      record.setEmpty();
   }

   public HSSFCell createCell(int column) {
      return this.createCell(column, CellType.BLANK);
   }

   public HSSFCell createCell(int columnIndex, int type) {
      return this.createCell(columnIndex, CellType.forInt(type));
   }

   public HSSFCell createCell(int columnIndex, CellType type) {
      short shortCellNum = (short)columnIndex;
      if(columnIndex > 32767) {
         shortCellNum = (short)('\uffff' - columnIndex);
      }

      HSSFCell cell = new HSSFCell(this.book, this.sheet, this.getRowNum(), shortCellNum, type);
      this.addCell(cell);
      this.sheet.getSheet().addValueRecord(this.getRowNum(), cell.getCellValueRecord());
      return cell;
   }

   public void removeCell(Cell cell) {
      if(cell == null) {
         throw new IllegalArgumentException("cell must not be null");
      } else {
         this.removeCell((HSSFCell)cell, true);
      }
   }

   private void removeCell(HSSFCell cell, boolean alsoRemoveRecords) {
      int column = cell.getColumnIndex();
      if(column < 0) {
         throw new RuntimeException("Negative cell indexes not allowed");
      } else if(column < this.cells.length && cell == this.cells[column]) {
         if(cell.isPartOfArrayFormulaGroup()) {
            cell.notifyArrayFormulaChanging();
         }

         this.cells[column] = null;
         if(alsoRemoveRecords) {
            CellValueRecordInterface cval = cell.getCellValueRecord();
            this.sheet.getSheet().removeValueRecord(this.getRowNum(), cval);
         }

         if(cell.getColumnIndex() + 1 == this.row.getLastCol()) {
            this.row.setLastCol(this.calculateNewLastCellPlusOne(this.row.getLastCol()));
         }

         if(cell.getColumnIndex() == this.row.getFirstCol()) {
            this.row.setFirstCol(this.calculateNewFirstCell(this.row.getFirstCol()));
         }

      } else {
         throw new RuntimeException("Specified cell is not from this row");
      }
   }

   protected void removeAllCells() {
      for(int i = 0; i < this.cells.length; ++i) {
         if(this.cells[i] != null) {
            this.removeCell(this.cells[i], true);
         }
      }

      this.cells = new HSSFCell[INITIAL_CAPACITY];
   }

   HSSFCell createCellFromRecord(CellValueRecordInterface cell) {
      HSSFCell hcell = new HSSFCell(this.book, this.sheet, cell);
      this.addCell(hcell);
      short colIx = cell.getColumn();
      if(this.row.isEmpty()) {
         this.row.setFirstCol(colIx);
         this.row.setLastCol(colIx + 1);
      } else if(colIx < this.row.getFirstCol()) {
         this.row.setFirstCol(colIx);
      } else if(colIx > this.row.getLastCol()) {
         this.row.setLastCol(colIx + 1);
      }

      return hcell;
   }

   public void setRowNum(int rowIndex) {
      int maxrow = SpreadsheetVersion.EXCEL97.getLastRowIndex();
      if(rowIndex >= 0 && rowIndex <= maxrow) {
         this.rowNum = rowIndex;
         if(this.row != null) {
            this.row.setRowNumber(rowIndex);
         }

      } else {
         throw new IllegalArgumentException("Invalid row number (" + rowIndex + ") outside allowable range (0.." + maxrow + ")");
      }
   }

   public int getRowNum() {
      return this.rowNum;
   }

   public HSSFSheet getSheet() {
      return this.sheet;
   }

   public int getOutlineLevel() {
      return this.row.getOutlineLevel();
   }

   public void moveCell(HSSFCell cell, short newColumn) {
      if(this.cells.length > newColumn && this.cells[newColumn] != null) {
         throw new IllegalArgumentException("Asked to move cell to column " + newColumn + " but there\'s already a cell there");
      } else if(!this.cells[cell.getColumnIndex()].equals(cell)) {
         throw new IllegalArgumentException("Asked to move a cell, but it didn\'t belong to our row");
      } else {
         this.removeCell(cell, false);
         cell.updateCellNum(newColumn);
         this.addCell(cell);
      }
   }

   private void addCell(HSSFCell cell) {
      int column = cell.getColumnIndex();
      if(column >= this.cells.length) {
         HSSFCell[] oldCells = this.cells;
         int newSize = oldCells.length * 3 / 2 + 1;
         if(newSize < column + 1) {
            newSize = column + INITIAL_CAPACITY;
         }

         this.cells = new HSSFCell[newSize];
         System.arraycopy(oldCells, 0, this.cells, 0, oldCells.length);
      }

      this.cells[column] = cell;
      if(this.row.isEmpty() || column < this.row.getFirstCol()) {
         this.row.setFirstCol((short)column);
      }

      if(this.row.isEmpty() || column >= this.row.getLastCol()) {
         this.row.setLastCol((short)(column + 1));
      }

   }

   private HSSFCell retrieveCell(int cellIndex) {
      return cellIndex >= 0 && cellIndex < this.cells.length?this.cells[cellIndex]:null;
   }

   public HSSFCell getCell(int cellnum) {
      return this.getCell(cellnum, this.book.getMissingCellPolicy());
   }

   public HSSFCell getCell(int cellnum, Row.MissingCellPolicy policy) {
      HSSFCell cell = this.retrieveCell(cellnum);
      switch(HSSFRow.NamelessClass607520504.$SwitchMap$org$apache$poi$ss$usermodel$Row$MissingCellPolicy[policy.ordinal()]) {
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
      return this.row.isEmpty()?-1:(short)this.row.getFirstCol();
   }

   public short getLastCellNum() {
      return this.row.isEmpty()?-1:(short)this.row.getLastCol();
   }

   public int getPhysicalNumberOfCells() {
      int count = 0;

      for(int i = 0; i < this.cells.length; ++i) {
         if(this.cells[i] != null) {
            ++count;
         }
      }

      return count;
   }

   public void setHeight(short height) {
      if(height == -1) {
         this.row.setHeight((short)-32513);
         this.row.setBadFontHeight(false);
      } else {
         this.row.setBadFontHeight(true);
         this.row.setHeight(height);
      }

   }

   public void setZeroHeight(boolean zHeight) {
      this.row.setZeroHeight(zHeight);
   }

   public boolean getZeroHeight() {
      return this.row.getZeroHeight();
   }

   public void setHeightInPoints(float height) {
      if(height == -1.0F) {
         this.row.setHeight((short)-32513);
      } else {
         this.row.setBadFontHeight(true);
         this.row.setHeight((short)((int)(height * 20.0F)));
      }

   }

   public short getHeight() {
      short height = this.row.getHeight();
      if((height & '\u8000') != 0) {
         height = this.sheet.getSheet().getDefaultRowHeight();
      } else {
         height = (short)(height & 32767);
      }

      return height;
   }

   public float getHeightInPoints() {
      return (float)this.getHeight() / 20.0F;
   }

   protected RowRecord getRowRecord() {
      return this.row;
   }

   private int calculateNewLastCellPlusOne(int lastcell) {
      int cellIx = lastcell - 1;

      for(HSSFCell r = this.retrieveCell(cellIx); r == null; r = this.retrieveCell(cellIx)) {
         if(cellIx < 0) {
            return 0;
         }

         --cellIx;
      }

      return cellIx + 1;
   }

   private int calculateNewFirstCell(int firstcell) {
      int cellIx = firstcell + 1;

      for(HSSFCell r = this.retrieveCell(cellIx); r == null; r = this.retrieveCell(cellIx)) {
         if(cellIx <= this.cells.length) {
            return 0;
         }

         ++cellIx;
      }

      return cellIx;
   }

   public boolean isFormatted() {
      return this.row.getFormatted();
   }

   public HSSFCellStyle getRowStyle() {
      if(!this.isFormatted()) {
         return null;
      } else {
         short styleIndex = this.row.getXFIndex();
         ExtendedFormatRecord xf = this.book.getWorkbook().getExFormatAt(styleIndex);
         return new HSSFCellStyle(styleIndex, xf, this.book);
      }
   }

   public void setRowStyle(HSSFCellStyle style) {
      this.row.setFormatted(true);
      this.row.setXFIndex(style.getIndex());
   }

   public void setRowStyle(CellStyle style) {
      this.setRowStyle((HSSFCellStyle)style);
   }

   public Iterator cellIterator() {
      return new HSSFRow.CellIterator();
   }

   public Iterator iterator() {
      return this.cellIterator();
   }

   public int compareTo(HSSFRow other) {
      if(this.getSheet() != other.getSheet()) {
         throw new IllegalArgumentException("The compared rows must belong to the same sheet");
      } else {
         Integer thisRow = Integer.valueOf(this.getRowNum());
         Integer otherRow = Integer.valueOf(other.getRowNum());
         return thisRow.compareTo(otherRow);
      }
   }

   public boolean equals(Object obj) {
      if(!(obj instanceof HSSFRow)) {
         return false;
      } else {
         HSSFRow other = (HSSFRow)obj;
         return this.getRowNum() == other.getRowNum() && this.getSheet() == other.getSheet();
      }
   }

   public int hashCode() {
      return this.row.hashCode();
   }


   private class CellIterator implements Iterator {

      int thisId = -1;
      int nextId = -1;


      public CellIterator() {
         this.findNext();
      }

      public boolean hasNext() {
         return this.nextId < HSSFRow.this.cells.length;
      }

      public Cell next() {
         if(!this.hasNext()) {
            throw new NoSuchElementException("At last element");
         } else {
            HSSFCell cell = HSSFRow.this.cells[this.nextId];
            this.thisId = this.nextId;
            this.findNext();
            return cell;
         }
      }

      public void remove() {
         if(this.thisId == -1) {
            throw new IllegalStateException("remove() called before next()");
         } else {
            HSSFRow.this.cells[this.thisId] = null;
         }
      }

      private void findNext() {
         int i;
         for(i = this.nextId + 1; i < HSSFRow.this.cells.length && HSSFRow.this.cells[i] == null; ++i) {
            ;
         }

         this.nextId = i;
      }
   }

   // $FF: synthetic class
   static class NamelessClass607520504 {

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
}
