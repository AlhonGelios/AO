package org.apache.poi.ss.format;

import java.util.logging.Logger;

public abstract class CellFormatter {

   protected final String format;
   static final Logger logger = Logger.getLogger(CellFormatter.class.getName());


   public CellFormatter(String format) {
      this.format = format;
   }

   public abstract void formatValue(StringBuffer var1, Object var2);

   public abstract void simpleValue(StringBuffer var1, Object var2);

   public String format(Object value) {
      StringBuffer sb = new StringBuffer();
      this.formatValue(sb, value);
      return sb.toString();
   }

   public String simpleFormat(Object value) {
      StringBuffer sb = new StringBuffer();
      this.simpleValue(sb, value);
      return sb.toString();
   }

   static String quote(String str) {
      return '\"' + str + '\"';
   }

}
