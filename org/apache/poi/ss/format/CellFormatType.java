package org.apache.poi.ss.format;

import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.format.CellElapsedFormatter;
import org.apache.poi.ss.format.CellFormatter;
import org.apache.poi.ss.format.CellGeneralFormatter;
import org.apache.poi.ss.format.CellNumberFormatter;
import org.apache.poi.ss.format.CellTextFormatter;

public enum CellFormatType {

   GENERAL("GENERAL", 0, null) {
      CellFormatter formatter(String pattern) {
         return new CellGeneralFormatter();
      }
      boolean isSpecial(char ch) {
         return false;
      }
   },
   NUMBER("NUMBER", 1, null) {
      boolean isSpecial(char ch) {
         return false;
      }
      CellFormatter formatter(String pattern) {
         return new CellNumberFormatter(pattern);
      }
   },
   DATE("DATE", 2, null) {
      boolean isSpecial(char ch) {
         return ch == 39 || ch <= 127 && Character.isLetter(ch);
      }
      CellFormatter formatter(String pattern) {
         return new CellDateFormatter(pattern);
      }
   },
   ELAPSED("ELAPSED", 3, null) {
      boolean isSpecial(char ch) {
         return false;
      }
      CellFormatter formatter(String pattern) {
         return new CellElapsedFormatter(pattern);
      }
   },
   TEXT("TEXT", 4, null) {
      boolean isSpecial(char ch) {
         return false;
      }
      CellFormatter formatter(String pattern) {
         return new CellTextFormatter(pattern);
      }
   };
   // $FF: synthetic field
   private static final CellFormatType[] $VALUES = new CellFormatType[]{GENERAL, NUMBER, DATE, ELAPSED, TEXT};


   private CellFormatType(String var1, int var2) {}

   abstract boolean isSpecial(char var1);

   abstract CellFormatter formatter(String var1);

   // $FF: synthetic method
   CellFormatType(String x0, int x1, Object x2) {
      this(x0, x1);
   }

}
