package org.apache.poi.hssf.record.chart;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class PlotAreaRecord extends StandardRecord {

   public static final short sid = 4149;


   public PlotAreaRecord() {}

   public PlotAreaRecord(RecordInputStream in) {}

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[PLOTAREA]\n");
      buffer.append("[/PLOTAREA]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {}

   protected int getDataSize() {
      return 0;
   }

   public short getSid() {
      return (short)4149;
   }

   public Object clone() {
      PlotAreaRecord rec = new PlotAreaRecord();
      return rec;
   }
}
