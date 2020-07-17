package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class CountryRecord extends StandardRecord {

   public static final short sid = 140;
   private short field_1_default_country;
   private short field_2_current_country;


   public CountryRecord() {}

   public CountryRecord(RecordInputStream in) {
      this.field_1_default_country = in.readShort();
      this.field_2_current_country = in.readShort();
   }

   public void setDefaultCountry(short country) {
      this.field_1_default_country = country;
   }

   public void setCurrentCountry(short country) {
      this.field_2_current_country = country;
   }

   public short getDefaultCountry() {
      return this.field_1_default_country;
   }

   public short getCurrentCountry() {
      return this.field_2_current_country;
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[COUNTRY]\n");
      buffer.append("    .defaultcountry  = ").append(Integer.toHexString(this.getDefaultCountry())).append("\n");
      buffer.append("    .currentcountry  = ").append(Integer.toHexString(this.getCurrentCountry())).append("\n");
      buffer.append("[/COUNTRY]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this.getDefaultCountry());
      out.writeShort(this.getCurrentCountry());
   }

   protected int getDataSize() {
      return 4;
   }

   public short getSid() {
      return (short)140;
   }
}
