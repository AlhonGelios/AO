package org.apache.poi.ddf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;

public final class UnknownEscherRecord extends EscherRecord implements Cloneable {

   private static final byte[] NO_BYTES = new byte[0];
   private byte[] thedata;
   private List _childRecords;


   public UnknownEscherRecord() {
      this.thedata = NO_BYTES;
      this._childRecords = new ArrayList();
   }

   public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, offset);
      int avaliable = data.length - (offset + 8);
      if(bytesRemaining > avaliable) {
         bytesRemaining = avaliable;
      }

      if(!this.isContainerRecord()) {
         this.thedata = new byte[bytesRemaining];
         System.arraycopy(data, offset + 8, this.thedata, 0, bytesRemaining);
         return bytesRemaining + 8;
      } else {
         byte bytesWritten = 0;
         this.thedata = new byte[0];
         offset += 8;
         int bytesWritten1 = bytesWritten + 8;

         while(bytesRemaining > 0) {
            EscherRecord child = recordFactory.createRecord(data, offset);
            int childBytesWritten = child.fillFields(data, offset, recordFactory);
            bytesWritten1 += childBytesWritten;
            offset += childBytesWritten;
            bytesRemaining -= childBytesWritten;
            this.getChildRecords().add(child);
         }

         return bytesWritten1;
      }
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      int remainingBytes = this.thedata.length;

      EscherRecord i$;
      for(Iterator pos = this._childRecords.iterator(); pos.hasNext(); remainingBytes += i$.getRecordSize()) {
         i$ = (EscherRecord)pos.next();
      }

      LittleEndian.putInt(data, offset + 4, remainingBytes);
      System.arraycopy(this.thedata, 0, data, offset + 8, this.thedata.length);
      int pos1 = offset + 8 + this.thedata.length;

      EscherRecord r;
      for(Iterator i$1 = this._childRecords.iterator(); i$1.hasNext(); pos1 += r.serialize(pos1, data, listener)) {
         r = (EscherRecord)i$1.next();
      }

      listener.afterRecordSerialize(pos1, this.getRecordId(), pos1 - offset, this);
      return pos1 - offset;
   }

   public byte[] getData() {
      return this.thedata;
   }

   public int getRecordSize() {
      return 8 + this.thedata.length;
   }

   public List getChildRecords() {
      return this._childRecords;
   }

   public void setChildRecords(List childRecords) {
      this._childRecords = childRecords;
   }

   public UnknownEscherRecord clone() {
      UnknownEscherRecord uer = new UnknownEscherRecord();
      uer.thedata = (byte[])this.thedata.clone();
      uer.setOptions(this.getOptions());
      uer.setRecordId(this.getRecordId());
      return uer;
   }

   public String getRecordName() {
      return "Unknown 0x" + HexDump.toHex(this.getRecordId());
   }

   public String toString() {
      StringBuffer children = new StringBuffer();
      if(this.getChildRecords().size() > 0) {
         children.append("  children: \n");
         Iterator theDumpHex = this._childRecords.iterator();

         while(theDumpHex.hasNext()) {
            EscherRecord record = (EscherRecord)theDumpHex.next();
            children.append(record.toString());
            children.append('\n');
         }
      }

      String theDumpHex1 = HexDump.toHex(this.thedata, 32);
      return this.getClass().getName() + ":" + '\n' + "  isContainer: " + this.isContainerRecord() + '\n' + "  version: 0x" + HexDump.toHex(this.getVersion()) + '\n' + "  instance: 0x" + HexDump.toHex(this.getInstance()) + '\n' + "  recordId: 0x" + HexDump.toHex(this.getRecordId()) + '\n' + "  numchildren: " + this.getChildRecords().size() + '\n' + theDumpHex1 + children.toString();
   }

   public String toXml(String tab) {
      String theDumpHex = HexDump.toHex(this.thedata, 32);
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getClass().getSimpleName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance()))).append(tab).append("\t").append("<IsContainer>").append(this.isContainerRecord()).append("</IsContainer>\n").append(tab).append("\t").append("<Numchildren>").append(HexDump.toHex(this._childRecords.size())).append("</Numchildren>\n");
      Iterator iterator = this._childRecords.iterator();

      while(iterator.hasNext()) {
         EscherRecord record = (EscherRecord)iterator.next();
         builder.append(record.toXml(tab + "\t"));
      }

      builder.append(theDumpHex).append("\n");
      builder.append(tab).append("</").append(this.getClass().getSimpleName()).append(">\n");
      return builder.toString();
   }

   public void addChildRecord(EscherRecord childRecord) {
      this.getChildRecords().add(childRecord);
   }

}
