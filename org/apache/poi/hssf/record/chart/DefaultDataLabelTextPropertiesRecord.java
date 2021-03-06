package org.apache.poi.hssf.record.chart;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndianOutput;

public final class DefaultDataLabelTextPropertiesRecord extends StandardRecord implements Cloneable {

   public static final short sid = 4132;
   private short field_1_categoryDataType;
   public static final short CATEGORY_DATA_TYPE_SHOW_LABELS_CHARACTERISTIC = 0;
   public static final short CATEGORY_DATA_TYPE_VALUE_AND_PERCENTAGE_CHARACTERISTIC = 1;
   public static final short CATEGORY_DATA_TYPE_ALL_TEXT_CHARACTERISTIC = 2;


   public DefaultDataLabelTextPropertiesRecord() {}

   public DefaultDataLabelTextPropertiesRecord(RecordInputStream in) {
      this.field_1_categoryDataType = in.readShort();
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[DEFAULTTEXT]\n");
      buffer.append("    .categoryDataType     = ").append("0x").append(HexDump.toHex(this.getCategoryDataType())).append(" (").append(this.getCategoryDataType()).append(" )");
      buffer.append(System.getProperty("line.separator"));
      buffer.append("[/DEFAULTTEXT]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this.field_1_categoryDataType);
   }

   protected int getDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)4132;
   }

   public DefaultDataLabelTextPropertiesRecord clone() {
      DefaultDataLabelTextPropertiesRecord rec = new DefaultDataLabelTextPropertiesRecord();
      rec.field_1_categoryDataType = this.field_1_categoryDataType;
      return rec;
   }

   public short getCategoryDataType() {
      return this.field_1_categoryDataType;
   }

   public void setCategoryDataType(short field_1_categoryDataType) {
      this.field_1_categoryDataType = field_1_categoryDataType;
   }
}
