package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public class EscherClientDataRecord extends EscherRecord {

   public static final short RECORD_ID = -4079;
   public static final String RECORD_DESCRIPTION = "MsofbtClientData";
   private byte[] remainingData;


   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, offset);
      int pos = offset + 8;
      this.remainingData = new byte[bytesRemaining];
      System.arraycopy(data, pos, this.remainingData, 0, bytesRemaining);
      return 8 + bytesRemaining;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      if(this.remainingData == null) {
         this.remainingData = new byte[0];
      }

      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      LittleEndian.putInt(data, offset + 4, this.remainingData.length);
      System.arraycopy(this.remainingData, 0, data, offset + 8, this.remainingData.length);
      int pos = offset + 8 + this.remainingData.length;
      listener.afterRecordSerialize(pos, this.getRecordId(), pos - offset, this);
      return pos - offset;
   }

   public int getRecordSize() {
      return 8 + (this.remainingData == null?0:this.remainingData.length);
   }

   public short getRecordId() {
      return (short)-4079;
   }

   public String getRecordName() {
      return "ClientData";
   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      String extraData = HexDump.dump(this.getRemainingData(), 0L, 0);
      return this.getClass().getName() + ":" + nl + "  RecordId: 0x" + HexDump.toHex((short)-4079) + nl + "  Version: 0x" + HexDump.toHex(this.getVersion()) + nl + "  Instance: 0x" + HexDump.toHex(this.getInstance()) + nl + "  Extra Data:" + nl + extraData;
   }

   public String toXml(String tab) {
      String extraData = HexDump.dump(this.getRemainingData(), 0L, 0).trim();
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<ExtraData>").append(extraData).append("</ExtraData>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

   public byte[] getRemainingData() {
      return this.remainingData;
   }

   public void setRemainingData(byte[] remainingData) {
      this.remainingData = remainingData == null?new byte[0]:(byte[])remainingData.clone();
   }
}
