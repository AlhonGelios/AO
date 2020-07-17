package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public class EscherBlipRecord extends EscherRecord {

   public static final short RECORD_ID_START = -4072;
   public static final short RECORD_ID_END = -3817;
   public static final String RECORD_DESCRIPTION = "msofbtBlip";
   private static final int HEADER_SIZE = 8;
   protected byte[] field_pictureData;


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesAfterHeader = this.readHeader(data, offset);
      int pos = offset + 8;
      this.field_pictureData = new byte[bytesAfterHeader];
      System.arraycopy(data, pos, this.field_pictureData, 0, bytesAfterHeader);
      return bytesAfterHeader + 8;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      System.arraycopy(this.field_pictureData, 0, data, offset + 4, this.field_pictureData.length);
      listener.afterRecordSerialize(offset + 4 + this.field_pictureData.length, this.getRecordId(), this.field_pictureData.length + 4, this);
      return this.field_pictureData.length + 4;
   }

   public int getRecordSize() {
      return this.field_pictureData.length + 8;
   }

   public String getRecordName() {
      return "Blip";
   }

   public byte[] getPicturedata() {
      return this.field_pictureData;
   }

   public void setPictureData(byte[] pictureData) {
      if(pictureData == null) {
         throw new IllegalArgumentException("picture data can\'t be null");
      } else {
         this.field_pictureData = (byte[])pictureData.clone();
      }
   }

   public String toString() {
      String extraData = HexDump.toHex(this.field_pictureData, 32);
      return this.getClass().getName() + ":" + '\n' + "  RecordId: 0x" + HexDump.toHex(this.getRecordId()) + '\n' + "  Version: 0x" + HexDump.toHex(this.getVersion()) + '\n' + "  Instance: 0x" + HexDump.toHex(this.getInstance()) + '\n' + "  Extra Data:" + '\n' + extraData;
   }

   public String toXml(String tab) {
      String extraData = HexDump.toHex(this.field_pictureData, 32);
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<ExtraData>").append(extraData).append("</ExtraData>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }
}
