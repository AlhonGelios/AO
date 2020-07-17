package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherBlipRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public class EscherBitmapBlip extends EscherBlipRecord {

   public static final short RECORD_ID_JPEG = -4067;
   public static final short RECORD_ID_PNG = -4066;
   public static final short RECORD_ID_DIB = -4065;
   private static final int HEADER_SIZE = 8;
   private final byte[] field_1_UID = new byte[16];
   private byte field_2_marker = -1;


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesAfterHeader = this.readHeader(data, offset);
      int pos = offset + 8;
      System.arraycopy(data, pos, this.field_1_UID, 0, 16);
      pos += 16;
      this.field_2_marker = data[pos];
      ++pos;
      this.field_pictureData = new byte[bytesAfterHeader - 17];
      System.arraycopy(data, pos, this.field_pictureData, 0, this.field_pictureData.length);
      return bytesAfterHeader + 8;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      LittleEndian.putInt(data, offset + 4, this.getRecordSize() - 8);
      int pos = offset + 8;
      System.arraycopy(this.field_1_UID, 0, data, pos, 16);
      data[pos + 16] = this.field_2_marker;
      System.arraycopy(this.field_pictureData, 0, data, pos + 17, this.field_pictureData.length);
      listener.afterRecordSerialize(offset + this.getRecordSize(), this.getRecordId(), this.getRecordSize(), this);
      return 25 + this.field_pictureData.length;
   }

   public int getRecordSize() {
      return 25 + this.field_pictureData.length;
   }

   public byte[] getUID() {
      return this.field_1_UID;
   }

   public void setUID(byte[] field_1_UID) {
      if(field_1_UID != null && field_1_UID.length == 16) {
         System.arraycopy(field_1_UID, 0, this.field_1_UID, 0, 16);
      } else {
         throw new IllegalArgumentException("field_1_UID must be byte[16]");
      }
   }

   public byte getMarker() {
      return this.field_2_marker;
   }

   public void setMarker(byte field_2_marker) {
      this.field_2_marker = field_2_marker;
   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      String extraData = HexDump.dump(this.field_pictureData, 0L, 0);
      return this.getClass().getName() + ":" + nl + "  RecordId: 0x" + HexDump.toHex(this.getRecordId()) + nl + "  Version: 0x" + HexDump.toHex(this.getVersion()) + nl + "  Instance: 0x" + HexDump.toHex(this.getInstance()) + nl + "  UID: 0x" + HexDump.toHex(this.field_1_UID) + nl + "  Marker: 0x" + HexDump.toHex(this.field_2_marker) + nl + "  Extra Data:" + nl + extraData;
   }

   public String toXml(String tab) {
      String extraData = HexDump.dump(this.field_pictureData, 0L, 0);
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<UID>0x").append(HexDump.toHex(this.field_1_UID)).append("</UID>\n").append(tab).append("\t").append("<Marker>0x").append(HexDump.toHex(this.field_2_marker)).append("</Marker>\n").append(tab).append("\t").append("<ExtraData>").append(extraData).append("</ExtraData>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }
}
