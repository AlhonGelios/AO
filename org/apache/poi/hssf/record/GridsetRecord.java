package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class GridsetRecord extends StandardRecord implements Cloneable {

   public static final short sid = 130;
   public short field_1_gridset_flag;


   public GridsetRecord() {}

   public GridsetRecord(RecordInputStream in) {
      this.field_1_gridset_flag = in.readShort();
   }

   public void setGridset(boolean gridset) {
      if(gridset) {
         this.field_1_gridset_flag = 1;
      } else {
         this.field_1_gridset_flag = 0;
      }

   }

   public boolean getGridset() {
      return this.field_1_gridset_flag == 1;
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[GRIDSET]\n");
      buffer.append("    .gridset        = ").append(this.getGridset()).append("\n");
      buffer.append("[/GRIDSET]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this.field_1_gridset_flag);
   }

   protected int getDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)130;
   }

   public GridsetRecord clone() {
      GridsetRecord rec = new GridsetRecord();
      rec.field_1_gridset_flag = this.field_1_gridset_flag;
      return rec;
   }
}
