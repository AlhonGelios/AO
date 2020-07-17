package org.apache.poi.hssf.record;

import java.io.UnsupportedEncodingException;
import org.apache.poi.hssf.record.CodepageRecord;
import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.util.CodePageUtil;

public final class OldStringRecord {

   public static final short biff2_sid = 7;
   public static final short biff345_sid = 519;
   private short sid;
   private short field_1_string_len;
   private byte[] field_2_bytes;
   private CodepageRecord codepage;


   public OldStringRecord(RecordInputStream in) {
      this.sid = in.getSid();
      if(in.getSid() == 7) {
         this.field_1_string_len = (short)in.readUByte();
      } else {
         this.field_1_string_len = in.readShort();
      }

      this.field_2_bytes = new byte[this.field_1_string_len];
      in.read(this.field_2_bytes, 0, this.field_1_string_len);
   }

   public boolean isBiff2() {
      return this.sid == 7;
   }

   public short getSid() {
      return this.sid;
   }

   public void setCodePage(CodepageRecord codepage) {
      this.codepage = codepage;
   }

   public String getString() {
      return getString(this.field_2_bytes, this.codepage);
   }

   protected static String getString(byte[] data, CodepageRecord codepage) {
      int cp = 28591;
      if(codepage != null) {
         cp = codepage.getCodepage() & '\uffff';
      }

      try {
         return CodePageUtil.getStringFromCodePage(data, cp);
      } catch (UnsupportedEncodingException var4) {
         throw new IllegalArgumentException("Unsupported codepage requested", var4);
      }
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[OLD STRING]\n");
      buffer.append("    .string            = ").append(this.getString()).append("\n");
      buffer.append("[/OLD STRING]\n");
      return buffer.toString();
   }
}
