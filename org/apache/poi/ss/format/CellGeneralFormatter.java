package org.apache.poi.ss.format;

import java.util.Formatter;
import java.util.Locale;
import org.apache.poi.ss.format.CellFormatter;
import org.apache.poi.util.LocaleUtil;

public class CellGeneralFormatter extends CellFormatter {

   public CellGeneralFormatter() {
      super("General");
   }

   public void formatValue(StringBuffer toAppendTo, Object value) {
      if(value instanceof Number) {
         double val = ((Number)value).doubleValue();
         if(val == 0.0D) {
            toAppendTo.append('0');
            return;
         }

         double exp = Math.log10(Math.abs(val));
         boolean stripZeros = true;
         String fmt;
         if(exp <= 10.0D && exp >= -9.0D) {
            if((double)((long)val) != val) {
               fmt = "%1.9f";
            } else {
               fmt = "%1.0f";
               stripZeros = false;
            }
         } else {
            fmt = "%1.5E";
         }

         Formatter formatter = new Formatter(toAppendTo, LocaleUtil.getUserLocale());

         try {
            formatter.format(LocaleUtil.getUserLocale(), fmt, new Object[]{value});
         } finally {
            formatter.close();
         }

         if(stripZeros) {
            int removeFrom;
            if(fmt.endsWith("E")) {
               removeFrom = toAppendTo.lastIndexOf("E") - 1;
            } else {
               removeFrom = toAppendTo.length() - 1;
            }

            while(toAppendTo.charAt(removeFrom) == 48) {
               toAppendTo.deleteCharAt(removeFrom--);
            }

            if(toAppendTo.charAt(removeFrom) == 46) {
               toAppendTo.deleteCharAt(removeFrom--);
            }
         }
      } else if(value instanceof Boolean) {
         toAppendTo.append(value.toString().toUpperCase(Locale.ROOT));
      } else {
         toAppendTo.append(value.toString());
      }

   }

   public void simpleValue(StringBuffer toAppendTo, Object value) {
      this.formatValue(toAppendTo, value);
   }
}
