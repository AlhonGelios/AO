package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class DBCellRecord extends StandardRecord implements Cloneable {

   public static final short sid = 215;
   public static final int BLOCK_SIZE = 32;
   private final int field_1_row_offset;
   private final short[] field_2_cell_offsets;


   DBCellRecord(int rowOffset, short[] cellOffsets) {
      this.field_1_row_offset = rowOffset;
      this.field_2_cell_offsets = cellOffsets;
   }

   public DBCellRecord(RecordInputStream in) {
      this.field_1_row_offset = in.readUShort();
      int size = in.remaining();
      this.field_2_cell_offsets = new short[size / 2];

      for(int i = 0; i < this.field_2_cell_offsets.length; ++i) {
         this.field_2_cell_offsets[i] = in.readShort();
      }

   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[DBCELL]\n");
      buffer.append("    .rowoffset = ").append(HexDump.intToHex(this.field_1_row_offset)).append("\n");

      for(int k = 0; k < this.field_2_cell_offsets.length; ++k) {
         buffer.append("    .cell_").append(k).append(" = ").append(HexDump.shortToHex(this.field_2_cell_offsets[k])).append("\n");
      }

      buffer.append("[/DBCELL]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeInt(this.field_1_row_offset);

      for(int k = 0; k < this.field_2_cell_offsets.length; ++k) {
         out.writeShort(this.field_2_cell_offsets[k]);
      }

   }

   protected int getDataSize() {
      return 4 + this.field_2_cell_offsets.length * 2;
   }

   public static int calculateSizeOfRecords(int nBlocks, int nRows) {
      return nBlocks * 8 + nRows * 2;
   }

   public short getSid() {
      return (short)215;
   }

   public DBCellRecord clone() {
      return this;
   }

   public static final class Builder {

      private short[] _cellOffsets = new short[4];
      private int _nCellOffsets;


      public void addCellOffset(int cellRefOffset) {
         if(this._cellOffsets.length <= this._nCellOffsets) {
            short[] temp = new short[this._nCellOffsets * 2];
            System.arraycopy(this._cellOffsets, 0, temp, 0, this._nCellOffsets);
            this._cellOffsets = temp;
         }

         this._cellOffsets[this._nCellOffsets] = (short)cellRefOffset;
         ++this._nCellOffsets;
      }

      public DBCellRecord build(int rowOffset) {
         short[] cellOffsets = new short[this._nCellOffsets];
         System.arraycopy(this._cellOffsets, 0, cellOffsets, 0, this._nCellOffsets);
         return new DBCellRecord(rowOffset, cellOffsets);
      }
   }
}
