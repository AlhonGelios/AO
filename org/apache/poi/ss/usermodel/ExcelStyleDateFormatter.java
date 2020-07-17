package org.apache.poi.ss.usermodel;

import java.math.RoundingMode;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.util.LocaleUtil;

public class ExcelStyleDateFormatter extends SimpleDateFormat {

   public static final char MMMMM_START_SYMBOL = '\ue001';
   public static final char MMMMM_TRUNCATE_SYMBOL = '\ue002';
   public static final char H_BRACKET_SYMBOL = '\ue010';
   public static final char HH_BRACKET_SYMBOL = '\ue011';
   public static final char M_BRACKET_SYMBOL = '\ue012';
   public static final char MM_BRACKET_SYMBOL = '\ue013';
   public static final char S_BRACKET_SYMBOL = '\ue014';
   public static final char SS_BRACKET_SYMBOL = '\ue015';
   public static final char L_BRACKET_SYMBOL = '\ue016';
   public static final char LL_BRACKET_SYMBOL = '\ue017';
   private static final DecimalFormat format1digit;
   private static final DecimalFormat format2digits;
   private static final DecimalFormat format3digit;
   private static final DecimalFormat format4digits;
   private double dateToBeFormatted;


   public ExcelStyleDateFormatter(String pattern) {
      super(processFormatPattern(pattern), LocaleUtil.getUserLocale());
      this.setTimeZone(LocaleUtil.getUserTimeZone());
      this.dateToBeFormatted = 0.0D;
   }

   public ExcelStyleDateFormatter(String pattern, DateFormatSymbols formatSymbols) {
      super(processFormatPattern(pattern), formatSymbols);
      this.setTimeZone(LocaleUtil.getUserTimeZone());
      this.dateToBeFormatted = 0.0D;
   }

   public ExcelStyleDateFormatter(String pattern, Locale locale) {
      super(processFormatPattern(pattern), locale);
      this.setTimeZone(LocaleUtil.getUserTimeZone());
      this.dateToBeFormatted = 0.0D;
   }

   private static String processFormatPattern(String f) {
      String t = f.replaceAll("MMMMM", "MMM");
      t = t.replaceAll("\\[H\\]", String.valueOf('\ue010'));
      t = t.replaceAll("\\[HH\\]", String.valueOf('\ue011'));
      t = t.replaceAll("\\[m\\]", String.valueOf('\ue012'));
      t = t.replaceAll("\\[mm\\]", String.valueOf('\ue013'));
      t = t.replaceAll("\\[s\\]", String.valueOf('\ue014'));
      t = t.replaceAll("\\[ss\\]", String.valueOf('\ue015'));
      t = t.replaceAll("s.000", "s.SSS");
      t = t.replaceAll("s.00", "s.");
      t = t.replaceAll("s.0", "s.");
      return t;
   }

   public void setDateToBeFormatted(double date) {
      this.dateToBeFormatted = date;
   }

   public StringBuffer format(Date date, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition) {
      String s = super.format(date, paramStringBuffer, paramFieldPosition).toString();
      if(s.indexOf('\ue001') != -1) {
         s = s.replaceAll("(\\w)\\w+", "$1");
      }

      float millisTemp;
      if(s.indexOf('\ue010') != -1 || s.indexOf('\ue011') != -1) {
         millisTemp = (float)this.dateToBeFormatted * 24.0F;
         s = s.replaceAll(String.valueOf('\ue010'), format1digit.format((double)millisTemp));
         s = s.replaceAll(String.valueOf('\ue011'), format2digits.format((double)millisTemp));
      }

      if(s.indexOf('\ue012') != -1 || s.indexOf('\ue013') != -1) {
         millisTemp = (float)this.dateToBeFormatted * 24.0F * 60.0F;
         s = s.replaceAll(String.valueOf('\ue012'), format1digit.format((double)millisTemp));
         s = s.replaceAll(String.valueOf('\ue013'), format2digits.format((double)millisTemp));
      }

      if(s.indexOf('\ue014') != -1 || s.indexOf('\ue015') != -1) {
         millisTemp = (float)(this.dateToBeFormatted * 24.0D * 60.0D * 60.0D);
         s = s.replaceAll(String.valueOf('\ue014'), format1digit.format((double)millisTemp));
         s = s.replaceAll(String.valueOf('\ue015'), format2digits.format((double)millisTemp));
      }

      if(s.indexOf('\ue016') != -1 || s.indexOf('\ue017') != -1) {
         millisTemp = (float)((this.dateToBeFormatted - Math.floor(this.dateToBeFormatted)) * 24.0D * 60.0D * 60.0D);
         float millis = millisTemp - (float)((int)millisTemp);
         s = s.replaceAll(String.valueOf('\ue016'), format3digit.format((double)(millis * 10.0F)));
         s = s.replaceAll(String.valueOf('\ue017'), format4digits.format((double)(millis * 100.0F)));
      }

      return new StringBuffer(s);
   }

   public boolean equals(Object o) {
      if(!(o instanceof ExcelStyleDateFormatter)) {
         return false;
      } else {
         ExcelStyleDateFormatter other = (ExcelStyleDateFormatter)o;
         return this.dateToBeFormatted == other.dateToBeFormatted;
      }
   }

   public int hashCode() {
      return (new Double(this.dateToBeFormatted)).hashCode();
   }

   static {
      DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(Locale.ROOT);
      format1digit = new DecimalFormat("0", dfs);
      format2digits = new DecimalFormat("00", dfs);
      format3digit = new DecimalFormat("0", dfs);
      format4digits = new DecimalFormat("00", dfs);
      DataFormatter.setExcelStyleRoundingMode(format1digit, RoundingMode.DOWN);
      DataFormatter.setExcelStyleRoundingMode(format2digits, RoundingMode.DOWN);
      DataFormatter.setExcelStyleRoundingMode(format3digit);
      DataFormatter.setExcelStyleRoundingMode(format4digits);
   }
}
