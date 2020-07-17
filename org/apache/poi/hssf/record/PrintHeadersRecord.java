package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.StandardRecord;
import org.apache.poi.util.LittleEndianOutput;

public final class PrintHeadersRecord extends StandardRecord {

   public static final short sid = 42;
   private short field_1_print_headers;


   public PrintHeadersRecord() {}

   public PrintHeadersRecord(RecordInputStream in) {
      this.field_1_print_headers = in.readShort();
   }

   public void setPrintHeaders(boolean p) {
      if(p) {
         this.field_1_print_headers = 1;
      } else {
         this.field_1_print_headers = 0;
      }

   }

   public boolean getPrintHeaders() {
      return this.field_1_print_headers == 1;
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[PRINTHEADERS]\n");
      buffer.append("    .printheaders   = ").append(this.getPrintHeaders()).append("\n");
      buffer.append("[/PRINTHEADERS]\n");
      return buffer.toString();
   }

   public void serialize(LittleEndianOutput out) {
      out.writeShort(this.field_1_print_headers);
   }

   protected int getDataSize() {
      return 2;
   }

   public short getSid() {
      return (short)42;
   }

   public Object clone() {
      PrintHeadersRecord rec = new PrintHeadersRecord();
      rec.field_1_print_headers = this.field_1_print_headers;
      return rec;
   }
}
