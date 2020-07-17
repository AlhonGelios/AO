package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.InterfaceHdrRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class InterfaceEndRecord extends StandardRecord {

   public static final short sid = 226;
   public static final InterfaceEndRecord instance = new InterfaceEndRecord();


   public static Record create(RecordInputStream in) {
      switch(in.remaining()) {
      case 0:
         return instance;
      case 2:
         return new InterfaceHdrRecord(in);
      default:
         throw new RecordFormatException("Invalid record data size: " + in.remaining());
      }
   }

   public String toString() {
      return "[INTERFACEEND/]\n";
   }

   public void serialize(LittleEndianOutput out) {}

   protected int getDataSize() {
      return 0;
   }

   public short getSid() {
      return (short)226;
   }

}
