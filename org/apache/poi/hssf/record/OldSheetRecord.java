package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.CodepageRecord;
import org.apache.poi.hssf.record.OldStringRecord;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.util.HexDump;

public final class OldSheetRecord {

   public static final short sid = 133;
   private int field_1_position_of_BOF;
   private int field_2_visibility;
   private int field_3_type;
   private byte[] field_5_sheetname;
   private CodepageRecord codepage;


   public OldSheetRecord(RecordInputStream in) {
      this.field_1_position_of_BOF = in.readInt();
      this.field_2_visibility = in.readUByte();
      this.field_3_type = in.readUByte();
      int field_4_sheetname_length = in.readUByte();
      this.field_5_sheetname = new byte[field_4_sheetname_length];
      in.read(this.field_5_sheetname, 0, field_4_sheetname_length);
   }

   public void setCodePage(CodepageRecord codepage) {
      this.codepage = codepage;
   }

   public short getSid() {
      return (short)133;
   }

   public int getPositionOfBof() {
      return this.field_1_position_of_BOF;
   }

   public String getSheetname() {
      return OldStringRecord.getString(this.field_5_sheetname, this.codepage);
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[BOUNDSHEET]\n");
      buffer.append("    .bof        = ").append(HexDump.intToHex(this.getPositionOfBof())).append("\n");
      buffer.append("    .visibility = ").append(HexDump.shortToHex(this.field_2_visibility)).append("\n");
      buffer.append("    .type       = ").append(HexDump.byteToHex(this.field_3_type)).append("\n");
      buffer.append("    .sheetname  = ").append(this.getSheetname()).append("\n");
      buffer.append("[/BOUNDSHEET]\n");
      return buffer.toString();
   }
}
