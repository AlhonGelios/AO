package org.apache.poi.ddf;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherRecordFactory;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class EscherContainerRecord extends EscherRecord {

   public static final short DGG_CONTAINER = -4096;
   public static final short BSTORE_CONTAINER = -4095;
   public static final short DG_CONTAINER = -4094;
   public static final short SPGR_CONTAINER = -4093;
   public static final short SP_CONTAINER = -4092;
   public static final short SOLVER_CONTAINER = -4091;
   private static final POILogger log = POILogFactory.getLogger(EscherContainerRecord.class);
   private int _remainingLength;
   private final List _childRecords = new ArrayList();


   public int fillFields(byte[] data, int pOffset, EscherRecordFactory recordFactory) {
      int bytesRemaining = this.readHeader(data, pOffset);
      int bytesWritten = 8;
      int offset = pOffset + 8;

      while(bytesRemaining > 0 && offset < data.length) {
         EscherRecord child = recordFactory.createRecord(data, offset);
         int childBytesWritten = child.fillFields(data, offset, recordFactory);
         bytesWritten += childBytesWritten;
         offset += childBytesWritten;
         bytesRemaining -= childBytesWritten;
         this.addChildRecord(child);
         if(offset >= data.length && bytesRemaining > 0) {
            this._remainingLength = bytesRemaining;
            if(log.check(5)) {
               log.log(5, new Object[]{"Not enough Escher data: " + bytesRemaining + " bytes remaining but no space left"});
            }
         }
      }

      return bytesWritten;
   }

   public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
      listener.beforeRecordSerialize(offset, this.getRecordId(), this);
      LittleEndian.putShort(data, offset, this.getOptions());
      LittleEndian.putShort(data, offset + 2, this.getRecordId());
      int remainingBytes = 0;

      Iterator iterator;
      EscherRecord pos;
      for(iterator = this._childRecords.iterator(); iterator.hasNext(); remainingBytes += pos.getRecordSize()) {
         pos = (EscherRecord)iterator.next();
      }

      remainingBytes += this._remainingLength;
      LittleEndian.putInt(data, offset + 4, remainingBytes);
      int pos1 = offset + 8;

      EscherRecord r;
      for(iterator = this._childRecords.iterator(); iterator.hasNext(); pos1 += r.serialize(pos1, data, listener)) {
         r = (EscherRecord)iterator.next();
      }

      listener.afterRecordSerialize(pos1, this.getRecordId(), pos1 - offset, this);
      return pos1 - offset;
   }

   public int getRecordSize() {
      int childRecordsSize = 0;

      EscherRecord r;
      for(Iterator iterator = this._childRecords.iterator(); iterator.hasNext(); childRecordsSize += r.getRecordSize()) {
         r = (EscherRecord)iterator.next();
      }

      return 8 + childRecordsSize;
   }

   public boolean hasChildOfType(short recordId) {
      Iterator iterator = this._childRecords.iterator();

      EscherRecord r;
      do {
         if(!iterator.hasNext()) {
            return false;
         }

         r = (EscherRecord)iterator.next();
      } while(r.getRecordId() != recordId);

      return true;
   }

   public EscherRecord getChild(int index) {
      return (EscherRecord)this._childRecords.get(index);
   }

   public List getChildRecords() {
      return new ArrayList(this._childRecords);
   }

   public Iterator getChildIterator() {
      return Collections.unmodifiableList(this._childRecords).iterator();
   }

   public void setChildRecords(List childRecords) {
      if(childRecords == this._childRecords) {
         throw new IllegalStateException("Child records private data member has escaped");
      } else {
         this._childRecords.clear();
         this._childRecords.addAll(childRecords);
      }
   }

   public boolean removeChildRecord(EscherRecord toBeRemoved) {
      return this._childRecords.remove(toBeRemoved);
   }

   public List getChildContainers() {
      ArrayList containers = new ArrayList();
      Iterator iterator = this._childRecords.iterator();

      while(iterator.hasNext()) {
         EscherRecord r = (EscherRecord)iterator.next();
         if(r instanceof EscherContainerRecord) {
            containers.add((EscherContainerRecord)r);
         }
      }

      return containers;
   }

   public String getRecordName() {
      switch(this.getRecordId()) {
      case -4096:
         return "DggContainer";
      case -4095:
         return "BStoreContainer";
      case -4094:
         return "DgContainer";
      case -4093:
         return "SpgrContainer";
      case -4092:
         return "SpContainer";
      case -4091:
         return "SolverContainer";
      default:
         return "Container 0x" + HexDump.toHex(this.getRecordId());
      }
   }

   public void display(PrintWriter w, int indent) {
      super.display(w, indent);
      Iterator iterator = this._childRecords.iterator();

      while(iterator.hasNext()) {
         EscherRecord escherRecord = (EscherRecord)iterator.next();
         escherRecord.display(w, indent + 1);
      }

   }

   public void addChildRecord(EscherRecord record) {
      this._childRecords.add(record);
   }

   public void addChildBefore(EscherRecord record, int insertBeforeRecordId) {
      int idx = 0;

      for(Iterator i$ = this._childRecords.iterator(); i$.hasNext(); ++idx) {
         EscherRecord rec = (EscherRecord)i$.next();
         if(rec.getRecordId() == (short)insertBeforeRecordId) {
            break;
         }
      }

      this._childRecords.add(idx, record);
   }

   public String toString() {
      String nl = System.getProperty("line.separator");
      StringBuffer children = new StringBuffer();
      if(this._childRecords.size() > 0) {
         children.append("  children: " + nl);
         int count = 0;

         for(Iterator iterator = this._childRecords.iterator(); iterator.hasNext(); ++count) {
            EscherRecord record = (EscherRecord)iterator.next();
            children.append("   Child " + count + ":" + nl);
            String childResult = String.valueOf(record);
            childResult = childResult.replaceAll("\n", "\n    ");
            children.append("    ");
            children.append(childResult);
            children.append(nl);
         }
      }

      return this.getClass().getName() + " (" + this.getRecordName() + "):" + nl + "  isContainer: " + this.isContainerRecord() + nl + "  version: 0x" + HexDump.toHex(this.getVersion()) + nl + "  instance: 0x" + HexDump.toHex(this.getInstance()) + nl + "  recordId: 0x" + HexDump.toHex(this.getRecordId()) + nl + "  numchildren: " + this._childRecords.size() + nl + children.toString();
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append(this.formatXmlRecordHeader(this.getRecordName(), HexDump.toHex(this.getRecordId()), HexDump.toHex(this.getVersion()), HexDump.toHex(this.getInstance())));
      Iterator iterator = this._childRecords.iterator();

      while(iterator.hasNext()) {
         EscherRecord record = (EscherRecord)iterator.next();
         builder.append(record.toXml(tab + "\t"));
      }

      builder.append(tab).append("</").append(this.getRecordName()).append(">\n");
      return builder.toString();
   }

   public EscherRecord getChildById(short recordId) {
      Iterator i$ = this._childRecords.iterator();

      EscherRecord childRecord;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         childRecord = (EscherRecord)i$.next();
      } while(childRecord.getRecordId() != recordId);

      return childRecord;
   }

   public void getRecordsById(short recordId, List out) {
      Iterator iterator = this._childRecords.iterator();

      while(iterator.hasNext()) {
         EscherRecord r = (EscherRecord)iterator.next();
         if(r instanceof EscherContainerRecord) {
            EscherContainerRecord c = (EscherContainerRecord)r;
            c.getRecordsById(recordId, out);
         } else if(r.getRecordId() == recordId) {
            out.add(r);
         }
      }

   }

}
