package org.apache.poi.ss.usermodel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Locale;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelGeneralNumberFormat extends Format {

   private static final long serialVersionUID = 1L;
   private static final MathContext TO_10_SF = new MathContext(10, RoundingMode.HALF_UP);
   private final DecimalFormatSymbols decimalSymbols;
   private final DecimalFormat integerFormat;
   private final DecimalFormat decimalFormat;
   private final DecimalFormat scientificFormat;


   public ExcelGeneralNumberFormat(Locale locale) {
      this.decimalSymbols = DecimalFormatSymbols.getInstance(locale);
      this.scientificFormat = new DecimalFormat("0.#####E0", this.decimalSymbols);
      DataFormatter.setExcelStyleRoundingMode(this.scientificFormat);
      this.integerFormat = new DecimalFormat("#", this.decimalSymbols);
      DataFormatter.setExcelStyleRoundingMode(this.integerFormat);
      this.decimalFormat = new DecimalFormat("#.##########", this.decimalSymbols);
      DataFormatter.setExcelStyleRoundingMode(this.decimalFormat);
   }

   public StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) {
      if(!(number instanceof Number)) {
         return this.integerFormat.format(number, toAppendTo, pos);
      } else {
         double value = ((Number)number).doubleValue();
         if(!Double.isInfinite(value) && !Double.isNaN(value)) {
            double abs = Math.abs(value);
            if(abs < 1.0E11D && (abs > 1.0E-10D || abs <= 0.0D)) {
               if(Math.floor(value) != value && abs < 1.0E10D) {
                  double rounded = (new BigDecimal(value)).round(TO_10_SF).doubleValue();
                  return this.decimalFormat.format(rounded, toAppendTo, pos);
               } else {
                  return this.integerFormat.format(number, toAppendTo, pos);
               }
            } else {
               return this.scientificFormat.format(number, toAppendTo, pos);
            }
         } else {
            return this.integerFormat.format(number, toAppendTo, pos);
         }
      }
   }

   public Object parseObject(String source, ParsePosition pos) {
      throw new UnsupportedOperationException();
   }

}
