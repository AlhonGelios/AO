package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public class EscherSpRecord extends EscherRecord {

   public static final short RECORD_ID = -4086;
   public static final String RECORD_DESCRIPTION = "MsofbtSp";
   public static final int FLAG_GROUP = 1;
   public static final int FLAG_CHILD = 2;
   public static final int FLAG_PATRIARCH = 4;
   public static final int FLAG_DELETED = 8;
   public static final int FLAG_OLESHAPE = 16;
   public static final int FLAG_HAVEMASTER = 32;
   public static final int FLAG_FLIPHORIZ = 64;
   public static final int FLAG_FLIPVERT = 128;
   public static final int FLAG_CONNECTOR = 256;
   public static final int FLAG_HAVEANCHOR = 512;
   public static final int FLAG_BACKGROUND = 1024;
   public static final int FLAG_HASSHAPETYPE = 2048;
   private int field_1_shapeId;
   private int field_2_flags;


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      this.readHeader(data, offset);
      int pos = offset + 8;
      byte size = 0;
      this.field_1_shapeId = LittleEndian.getInt(data, pos + size);
      int size1 = size + 4;
      this.field_2_flags = LittleEndian.getInt(data, pos + size1);
      size1 += 4;
      return this.getRecordSize();
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      byte remainingBytes = 8;
      LittleEndian.putInt(data, offset + 4, remainingBytes);
      LittleEndian.putInt(data, offset + 8, this.field_1_shapeId);
      LittleEndian.putInt(data, offset + 12, this.field_2_flags);
      listener.afterRecordSerialize(offset + this.getRecordSize(), this.getRecordId(), this.getRecordSize(), this);
      return 16;
   }

   public int getRecordSize() {
      return 16;
   }

   public short getRecordId() {
      return (short)-4086;
   }

   public String getRecordName() {
      return "Sp";
   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      return this.getClass().getName() + ":" + nl + "  RecordId: 0x" + HexDump.toHex((short)-4086) + nl + "  Version: 0x" + HexDump.toHex(this.getVersion()) + nl + "  ShapeType: 0x" + HexDump.toHex(this.getShapeType()) + nl + "  ShapeId: " + this.field_1_shapeId + nl + "  Flags: " + this.decodeFlags(this.field_2_flags) + " (0x" + HexDump.toHex(this.field_2_flags) + ")" + nl;
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<ShapeType>0x").append(HexDump.toHex(this.getShapeType())).append("</ShapeType>\n").append(tab).append("\t").append("<ShapeId>").append(this.field_1_shapeId).append("</ShapeId>\n").append(tab).append("\t").append("<Flags>").append(this.decodeFlags(this.field_2_flags) + " (0x" + HexDump.toHex(this.field_2_flags) + ")").append("</Flags>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

   private String decodeFlags(int flags) {
      StringBuffer result = new StringBuffer();
      result.append((flags & 1) != 0?"|GROUP":"");
      result.append((flags & 2) != 0?"|CHILD":"");
      result.append((flags & 4) != 0?"|PATRIARCH":"");
      result.append((flags & 8) != 0?"|DELETED":"");
      result.append((flags & 16) != 0?"|OLESHAPE":"");
      result.append((flags & 32) != 0?"|HAVEMASTER":"");
      result.append((flags & 64) != 0?"|FLIPHORIZ":"");
      result.append((flags & 128) != 0?"|FLIPVERT":"");
      result.append((flags & 256) != 0?"|CONNECTOR":"");
      result.append((flags & 512) != 0?"|HAVEANCHOR":"");
      result.append((flags & 1024) != 0?"|BACKGROUND":"");
      result.append((flags & 2048) != 0?"|HASSHAPETYPE":"");
      if(result.length() > 0) {
         result.deleteCharAt(0);
      }

      return result.toString();
   }

   public int getShapeId() {
      return this.field_1_shapeId;
   }

   public void setShapeId(int field_1_shapeId) {
      this.field_1_shapeId = field_1_shapeId;
   }

   public int getFlags() {
      return this.field_2_flags;
   }

   public void setFlags(int field_2_flags) {
      this.field_2_flags = field_2_flags;
   }

   public short getShapeType() {
      return this.getInstance();
   }

   public void setShapeType(short value) {
      this.setInstance(value);
   }
}
