package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;

enum Encoding {

   UNICODE("UNICODE", 0, "UTF-16LE", true, false),
   CP437("CP437", 1, "Cp437", false, false),
   CP850("CP850", 2, "Cp850", false, false),
   CP874("CP874", 3, "MS874", true, true),
   CP932("CP932", 4, "MS932", true, false),
   CP936("CP936", 5, "MS936", true, false),
   CP949("CP949", 6, "MS949", true, false),
   CP950("CP950", 7, "MS950", true, false),
   CP1250("CP1250", 8, "Cp1250", true, true),
   CP1251("CP1251", 9, "Cp1251", true, true),
   CP1252("CP1252", 10, "Cp1252", true, true),
   CP1253("CP1253", 11, "Cp1253", true, true),
   CP1254("CP1254", 12, "Cp1254", true, true),
   CP1255("CP1255", 13, "Cp1255", true, true),
   CP1256("CP1256", 14, "Cp1256", true, true),
   CP1257("CP1257", 15, "Cp1257", true, true),
   CP1258("CP1258", 16, "Cp1258", true, true);
   private final String charsetName;
   private final boolean supportsAsciiConversion;
   private final boolean hasAsciiCompatibleSBCS;
   private boolean jvmSupportConfirmed = false;
   // $FF: synthetic field
   private static final Encoding[] $VALUES = new Encoding[]{UNICODE, CP437, CP850, CP874, CP932, CP936, CP949, CP950, CP1250, CP1251, CP1252, CP1253, CP1254, CP1255, CP1256, CP1257, CP1258};


   private Encoding(String var1, int var2, String var3, boolean var4, boolean var5) {
      this.charsetName = var3;
      this.supportsAsciiConversion = var4;
      this.hasAsciiCompatibleSBCS = var5;
   }

   final Encoding checkSupported() throws UnsupportedEncodingException {
      if(!this.jvmSupportConfirmed) {
         try {
            " ".getBytes(this.charsetName);
         } catch (UnsupportedEncodingException var4) {
            MessageFormat var2 = new MessageFormat(SQLServerException.getErrString("R_codePageNotSupported"));
            Object[] var3 = new Object[]{this.charsetName};
            throw new UnsupportedEncodingException(var2.format(var3));
         }

         this.jvmSupportConfirmed = true;
      }

      return this;
   }

   final String charsetName() {
      return this.charsetName;
   }

   boolean supportsAsciiConversion() {
      return this.supportsAsciiConversion;
   }

   boolean hasAsciiCompatibleSBCS() {
      return this.hasAsciiCompatibleSBCS;
   }

}
