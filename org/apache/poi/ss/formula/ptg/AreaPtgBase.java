package org.apache.poi.ss.formula.ptg;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.ptg.AreaI;
import org.apache.poi.ss.formula.ptg.OperandPtg;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianOutput;

public abstract class AreaPtgBase extends OperandPtg implements AreaI {

   private int field_1_first_row;
   private int field_2_last_row;
   private int field_3_first_column;
   private int field_4_last_column;
   private static final BitField rowRelative = BitFieldFactory.getInstance('\u8000');
   private static final BitField colRelative = BitFieldFactory.getInstance(16384);
   private static final BitField columnMask = BitFieldFactory.getInstance(16383);


   protected final RuntimeException notImplemented() {
      return new RuntimeException("Coding Error: This method should never be called. This ptg should be converted");
   }

   protected AreaPtgBase() {}

   protected AreaPtgBase(AreaReference ar) {
      CellReference firstCell = ar.getFirstCell();
      CellReference lastCell = ar.getLastCell();
      this.setFirstRow(firstCell.getRow());
      this.setFirstColumn(firstCell.getCol() == -1?0:firstCell.getCol());
      this.setLastRow(lastCell.getRow());
      this.setLastColumn(lastCell.getCol() == -1?255:lastCell.getCol());
      this.setFirstColRelative(!firstCell.isColAbsolute());
      this.setLastColRelative(!lastCell.isColAbsolute());
      this.setFirstRowRelative(!firstCell.isRowAbsolute());
      this.setLastRowRelative(!lastCell.isRowAbsolute());
   }

   protected AreaPtgBase(int firstRow, int lastRow, int firstColumn, int lastColumn, boolean firstRowRelative, boolean lastRowRelative, boolean firstColRelative, boolean lastColRelative) {
      if(lastRow >= firstRow) {
         this.setFirstRow(firstRow);
         this.setLastRow(lastRow);
         this.setFirstRowRelative(firstRowRelative);
         this.setLastRowRelative(lastRowRelative);
      } else {
         this.setFirstRow(lastRow);
         this.setLastRow(firstRow);
         this.setFirstRowRelative(lastRowRelative);
         this.setLastRowRelative(firstRowRelative);
      }

      if(lastColumn >= firstColumn) {
         this.setFirstColumn(firstColumn);
         this.setLastColumn(lastColumn);
         this.setFirstColRelative(firstColRelative);
         this.setLastColRelative(lastColRelative);
      } else {
         this.setFirstColumn(lastColumn);
         this.setLastColumn(firstColumn);
         this.setFirstColRelative(lastColRelative);
         this.setLastColRelative(firstColRelative);
      }

   }

   public void sortTopLeftToBottomRight() {
      int firstCol;
      boolean firstColRel;
      if(this.getFirstRow() > this.getLastRow()) {
         firstCol = this.getFirstRow();
         firstColRel = this.isFirstRowRelative();
         this.setFirstRow(this.getLastRow());
         this.setFirstRowRelative(this.isLastRowRelative());
         this.setLastRow(firstCol);
         this.setLastRowRelative(firstColRel);
      }

      if(this.getFirstColumn() > this.getLastColumn()) {
         firstCol = this.getFirstColumn();
         firstColRel = this.isFirstColRelative();
         this.setFirstColumn(this.getLastColumn());
         this.setFirstColRelative(this.isLastColRelative());
         this.setLastColumn(firstCol);
         this.setLastColRelative(firstColRel);
      }

   }

   protected final void readCoordinates(LittleEndianInput in) {
      this.field_1_first_row = in.readUShort();
      this.field_2_last_row = in.readUShort();
      this.field_3_first_column = in.readUShort();
      this.field_4_last_column = in.readUShort();
   }

   protected final void writeCoordinates(LittleEndianOutput out) {
      out.writeShort(this.field_1_first_row);
      out.writeShort(this.field_2_last_row);
      out.writeShort(this.field_3_first_column);
      out.writeShort(this.field_4_last_column);
   }

   public final int getFirstRow() {
      return this.field_1_first_row;
   }

   public final void setFirstRow(int rowIx) {
      this.field_1_first_row = rowIx;
   }

   public final int getLastRow() {
      return this.field_2_last_row;
   }

   public final void setLastRow(int rowIx) {
      this.field_2_last_row = rowIx;
   }

   public final int getFirstColumn() {
      return columnMask.getValue(this.field_3_first_column);
   }

   public final short getFirstColumnRaw() {
      return (short)this.field_3_first_column;
   }

   public final boolean isFirstRowRelative() {
      return rowRelative.isSet(this.field_3_first_column);
   }

   public final void setFirstRowRelative(boolean rel) {
      this.field_3_first_column = rowRelative.setBoolean(this.field_3_first_column, rel);
   }

   public final boolean isFirstColRelative() {
      return colRelative.isSet(this.field_3_first_column);
   }

   public final void setFirstColRelative(boolean rel) {
      this.field_3_first_column = colRelative.setBoolean(this.field_3_first_column, rel);
   }

   public final void setFirstColumn(int colIx) {
      this.field_3_first_column = columnMask.setValue(this.field_3_first_column, colIx);
   }

   public final void setFirstColumnRaw(int column) {
      this.field_3_first_column = column;
   }

   public final int getLastColumn() {
      return columnMask.getValue(this.field_4_last_column);
   }

   public final short getLastColumnRaw() {
      return (short)this.field_4_last_column;
   }

   public final boolean isLastRowRelative() {
      return rowRelative.isSet(this.field_4_last_column);
   }

   public final void setLastRowRelative(boolean rel) {
      this.field_4_last_column = rowRelative.setBoolean(this.field_4_last_column, rel);
   }

   public final boolean isLastColRelative() {
      return colRelative.isSet(this.field_4_last_column);
   }

   public final void setLastColRelative(boolean rel) {
      this.field_4_last_column = colRelative.setBoolean(this.field_4_last_column, rel);
   }

   public final void setLastColumn(int colIx) {
      this.field_4_last_column = columnMask.setValue(this.field_4_last_column, colIx);
   }

   public final void setLastColumnRaw(short column) {
      this.field_4_last_column = column;
   }

   protected final String formatReferenceAsString() {
      CellReference topLeft = new CellReference(this.getFirstRow(), this.getFirstColumn(), !this.isFirstRowRelative(), !this.isFirstColRelative());
      CellReference botRight = new CellReference(this.getLastRow(), this.getLastColumn(), !this.isLastRowRelative(), !this.isLastColRelative());
      return AreaReference.isWholeColumnReference(SpreadsheetVersion.EXCEL97, topLeft, botRight)?(new AreaReference(topLeft, botRight)).formatAsString():topLeft.formatAsString() + ":" + botRight.formatAsString();
   }

   public String toFormulaString() {
      return this.formatReferenceAsString();
   }

   public byte getDefaultOperandClass() {
      return (byte)0;
   }

}
