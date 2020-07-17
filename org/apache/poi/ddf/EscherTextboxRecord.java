package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.RecordFormatException;

public final class EscherTextboxRecord extends EscherRecord implements Cloneable {

   public static final short RECORD_ID = -4083;
   public static final String RECORD_DESCRIPTION = "msofbtClientTextbox";
   private static final byte[] NO_BYTES = new byte[0];
   private byte[] thedata;


   public EscherTextboxRecord() {
      this.thedata = NO_BYTES;
   }

   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, offset);
      this.thedata = new byte[bytesRemaining];
      System.arraycopy(data, offset + 8, this.thedata, 0, bytesRemaining);
      return bytesRemaining + 8;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      int remainingBytes = this.thedata.length;
      LittleEndian.putInt(data, offset + 4, remainingBytes);
      System.arraycopy(this.thedata, 0, data, offset + 8, this.thedata.length);
      int pos = offset + 8 + this.thedata.length;
      listener.afterRecordSerialize(pos, this.getRecordId(), pos - offset, this);
      int size = pos - offset;
      if(size != this.getRecordSize()) {
         throw new RecordFormatException(size + " bytes written but getRecordSize() reports " + this.getRecordSize());
      } else {
         return size;
      }
   }

   public byte[] getData() {
      return this.thedata;
   }

   public void setData(byte[] b, int start, int length) {
      this.thedata = new byte[length];
      System.arraycopy(b, start, this.thedata, 0, length);
   }

   public void setData(byte[] b) {
      this.setData(b, 0, b.length);
   }

   public int getRecordSize() {
      return 8 + this.thedata.length;
   }

   public EscherTextboxRecord clone() {
      EscherTextboxRecord etr = new EscherTextboxRecord();
      etr.setOptions(this.getOptions());
      etr.setRecordId(this.getRecordId());
      etr.thedata = (byte[])this.thedata.clone();
      return etr;
   }

   public String getRecordName() {
      return "ClientTextbox";
   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      String theDumpHex = "";

      try {
         if(this.thedata.length != 0) {
            theDumpHex = "  Extra Data:" + nl;
            theDumpHex = theDumpHex + HexDump.dump(this.thedata, 0L, 0);
         }
      } catch (Exception var4) {
         theDumpHex = "Error!!";
      }

      return this.getClass().getName() + ":" + nl + "  isContainer: " + this.isContainerRecord() + nl + "  version: 0x" + HexDump.toHex(this.getVersion()) + nl + "  instance: 0x" + HexDump.toHex(this.getInstance()) + nl + "  recordId: 0x" + HexDump.toHex(this.getRecordId()) + nl + "  numchildren: " + this.getChildRecords().size() + nl + theDumpHex;
   }

   public String toXml(String tab) {
      String theDumpHex = "";

      try {
         if(this.thedata.length != 0) {
            theDumpHex = theDumpHex + HexDump.dump(this.thedata, 0L, 0);
         }
      } catch (Exception var4) {
         theDumpHex = "Error!!";
      }

      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<ExtraData>").append(theDumpHex).append("</ExtraData>\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

}
