package org.apache.poi.hssf.record.chart;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class BeginRecord extends StandardRecord implements Cloneable {

   public static final short sid = 4147;


   public BeginRecord() {}

   public BeginRecord(RecordInputStream in) {}

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[BEGIN]\n");
      buffer.append("[/BEGIN]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {}

   protected int getDataSize() {
      return 0;
   }

   public short getSid() {
      return (short)4147;
   }

   public BeginRecord clone() {
      BeginRecord br = new BeginRecord();
      return br;
   }
}
