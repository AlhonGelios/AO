package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public class EscherChildAnchorRecord extends EscherRecord {

   public static final short RECORD_ID = -4081;
   public static final String RECORD_DESCRIPTION = "MsofbtChildAnchor";
   private int field_1_dx1;
   private int field_2_dy1;
   private int field_3_dx2;
   private int field_4_dy2;


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, offset);
      int pos = offset + 8;
      byte size = 0;
      int size1;
      switch(bytesRemaining) {
      case 8:
         this.field_1_dx1 = LittleEndian.getShort(data, pos + size);
         size1 = size + 2;
         this.field_2_dy1 = LittleEndian.getShort(data, pos + size1);
         size1 += 2;
         this.field_3_dx2 = LittleEndian.getShort(data, pos + size1);
         size1 += 2;
         this.field_4_dy2 = LittleEndian.getShort(data, pos + size1);
         size1 += 2;
         break;
      case 16:
         this.field_1_dx1 = LittleEndian.getInt(data, pos + size);
         size1 = size + 4;
         this.field_2_dy1 = LittleEndian.getInt(data, pos + size1);
         size1 += 4;
         this.field_3_dx2 = LittleEndian.getInt(data, pos + size1);
         size1 += 4;
         this.field_4_dy2 = LittleEndian.getInt(data, pos + size1);
         size1 += 4;
         break;
      default:
         throw new RuntimeException("Invalid EscherChildAnchorRecord - neither 8 nor 16 bytes.");
      }

      return 8 + size1;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      int pos = offset + 2;
      LittleEndian.putShort(data, pos, this.getRecordId());
      pos += 2;
      LittleEndian.putInt(data, pos, this.getRecordSize() - 8);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_1_dx1);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_2_dy1);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_3_dx2);
      pos += 4;
      LittleEndian.putInt(data, pos, this.field_4_dy2);
      pos += 4;
      listener.afterRecordSerialize(pos, this.getRecordId(), pos - offset, this);
      return pos - offset;
   }

   public int getRecordSize() {
      return 24;
   }

   public short getRecordId() {
      return (short)-4081;
   }

   public String getRecordName() {
      return "ChildAnchor";
   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      return this.getClass().getName() + ":" + nl + "  RecordId: 0x" + HexDump.toHex((short)-4081) + nl + "  Version: 0x" + HexDump.toHex(this.getVersion()) + nl + "  Instance: 0x" + HexDump.toHex(this.getInstance()) + nl + "  X1: " + this.field_1_dx1 + nl + "  Y1: " + this.field_2_dy1 + nl + "  X2: " + this.field_3_dx2 + nl + "  Y2: " + this.field_4_dy2 + nl;
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<X1>").append(this.field_1_dx1).append("</X1>\n").append(tab).append("\t").append("<Y1>").append(this.field_2_dy1).append("</Y1>\n").append(tab).append("\t").append("<X2>").append(this.field_3_dx2).append("</X2>\n").append(tab).append("\t").append("<Y2>").append(this.field_4_dy2).append("</Y2>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

   public int getDx1() {
      return this.field_1_dx1;
   }

   public void setDx1(int field_1_dx1) {
      this.field_1_dx1 = field_1_dx1;
   }

   public int getDy1() {
      return this.field_2_dy1;
   }

   public void setDy1(int field_2_dy1) {
      this.field_2_dy1 = field_2_dy1;
   }

   public int getDx2() {
      return this.field_3_dx2;
   }

   public void setDx2(int field_3_dx2) {
      this.field_3_dx2 = field_3_dx2;
   }

   public int getDy2() {
      return this.field_4_dy2;
   }

   public void setDy2(int field_4_dy2) {
      this.field_4_dy2 = field_4_dy2;
   }
}
