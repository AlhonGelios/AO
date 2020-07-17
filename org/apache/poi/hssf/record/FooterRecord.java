package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.HeaderFooterBase;
import org.apache.poi.hssf.record.RecordInputStream;

public final class FooterRecord extends HeaderFooterBase implements Cloneable {

   public static final short sid = 21;


   public FooterRecord(String text) {
      super(text);
   }

   public FooterRecord(RecordInputStream in) {
      super(in);
   }

   public String toString() {
      StringBuffer buffer = new StringBuffer();
      buffer.append("[FOOTER]\n");
      buffer.append("    .footer = ").append(this.getText()).append("\n");
      buffer.append("[/FOOTER]\n");
      return buffer.toString();
   }

   public short getSid() {
      return (short)21;
   }

   public FooterRecord clone() {
      return new FooterRecord(this.getText());
   }
}
