package org.apache.poi.hssf.record;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ddf.DefaultEscherRecordFactory;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.NullEscherSerializationListener;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.util.LazilyConcatenatedByteArray;
import org.apache.poi.util.LittleEndian;

public abstract class AbstractEscherHolderRecord extends Record implements Cloneable {

   private static boolean DESERIALISE;
   private final List escherRecords = new ArrayList();
   private final LazilyConcatenatedByteArray rawDataContainer = new LazilyConcatenatedByteArray();


   public AbstractEscherHolderRecord() {}

   public AbstractEscherHolderRecord(RecordInputStream in) {
      if(!DESERIALISE) {
         this.rawDataContainer.concatenate(in.readRemainder());
      } else {
         byte[] data = in.readAllContinuedRemainder();
         this.convertToEscherRecords(0, data.length, data);
      }

   }

   protected void convertRawBytesToEscherRecords() {
      if(!DESERIALISE) {
         byte[] rawData = this.getRawData();
         this.convertToEscherRecords(0, rawData.length, rawData);
      }

   }

   private void convertToEscherRecords(int offset, int size, byte[] data) {
      this.escherRecords.clear();
      DefaultEscherRecordFactory recordFactory = new DefaultEscherRecordFactory();

      int bytesRead;
      for(int pos = offset; pos < offset + size; pos += bytesRead) {
         EscherRecord r = recordFactory.createRecord(data, pos);
         bytesRead = r.fillFields(data, pos, recordFactory);
         this.escherRecords.add(r);
      }

   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      String nl = System.getProperty("line.separator");
      buffer.append('[' + this.getRecordName() + ']' + nl);
      if(this.escherRecords.size() == 0) {
         buffer.append("No Escher Records Decoded" + nl);
      }

      Iterator i$ = this.escherRecords.iterator();

      while(i$.hasNext()) {
         EscherRecord r = (EscherRecord)i$.next();
         buffer.append(r.toString());
      }

      buffer.append("[/" + this.getRecordName() + ']' + nl);
      return buffer.toString();
   }

   protected abstract String getRecordName();

   public int serialize(int offset, byte[] data) {
      LittleEndian.putShort(data, 0 + offset, this.getSid());
      LittleEndian.putShort(data, 2 + offset, (short)(this.getRecordSize() - 4));
      byte[] rawData = this.getRawData();
      if(this.escherRecords.size() == 0 && rawData != null) {
         LittleEndian.putShort(data, 0 + offset, this.getSid());
         LittleEndian.putShort(data, 2 + offset, (short)(this.getRecordSize() - 4));
         System.arraycopy(rawData, 0, data, 4 + offset, rawData.length);
         return rawData.length + 4;
      } else {
         LittleEndian.putShort(data, 0 + offset, this.getSid());
         LittleEndian.putShort(data, 2 + offset, (short)(this.getRecordSize() - 4));
         int pos = offset + 4;

         EscherRecord r;
         for(Iterator i$ = this.escherRecords.iterator(); i$.hasNext(); pos += r.serialize(pos, data, new NullEscherSerializationListener())) {
            r = (EscherRecord)i$.next();
         }

         return this.getRecordSize();
      }
   }

   public int getRecordSize() {
      byte[] rawData = this.getRawData();
      if(this.escherRecords.size() == 0 && rawData != null) {
         return rawData.length;
      } else {
         int size = 0;

         EscherRecord r;
         for(Iterator i$ = this.escherRecords.iterator(); i$.hasNext(); size += r.getRecordSize()) {
            r = (EscherRecord)i$.next();
         }

         return size;
      }
   }

   public abstract short getSid();

   public AbstractEscherHolderRecord clone() {
      return (AbstractEscherHolderRecord)this.cloneViaReserialise();
   }

   public void addEscherRecord(int index, EscherRecord element) {
      this.escherRecords.add(index, element);
   }

   public boolean addEscherRecord(EscherRecord element) {
      return this.escherRecords.add(element);
   }

   public List getEscherRecords() {
      return this.escherRecords;
   }

   public void clearEscherRecords() {
      this.escherRecords.clear();
   }

   public EscherContainerRecord getEscherContainer() {
      Iterator i$ = this.escherRecords.iterator();

      EscherRecord er;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         er = (EscherRecord)i$.next();
      } while(!(er instanceof EscherContainerRecord));

      return (EscherContainerRecord)er;
   }

   public EscherRecord findFirstWithId(short id) {
      return this.findFirstWithId(id, this.getEscherRecords());
   }

   private EscherRecord findFirstWithId(short id, List records) {
      Iterator i$ = records.iterator();

      EscherRecord r;
      do {
         if(!i$.hasNext()) {
            i$ = records.iterator();

            while(i$.hasNext()) {
               r = (EscherRecord)i$.next();
               if(r.isContainerRecord()) {
                  EscherRecord found = this.findFirstWithId(id, r.getChildRecords());
                  if(found != null) {
                     return found;
                  }
               }
            }

            return null;
         }

         r = (EscherRecord)i$.next();
      } while(r.getRecordId() != id);

      return r;
   }

   public EscherRecord getEscherRecord(int index) {
      return (EscherRecord)this.escherRecords.get(index);
   }

   public void join(AbstractEscherHolderRecord record) {
      this.rawDataContainer.concatenate(record.getRawData());
   }

   public void processContinueRecord(byte[] record) {
      this.rawDataContainer.concatenate(record);
   }

   public byte[] getRawData() {
      return this.rawDataContainer.toArray();
   }

   public void setRawData(byte[] rawData) {
      this.rawDataContainer.clear();
      this.rawDataContainer.concatenate(rawData);
   }

   public void decode() {
      if(null == this.escherRecords || 0 == this.escherRecords.size()) {
         byte[] rawData = this.getRawData();
         this.convertToEscherRecords(0, rawData.length, rawData);
      }

   }

   static {
      try {
         DESERIALISE = System.getProperty("poi.deserialize.escher") != null;
      } catch (SecurityException var1) {
         DESERIALISE = false;
      }

   }
}
