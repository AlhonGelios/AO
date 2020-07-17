package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.text.MessageFormat;

enum TDSType {

   BIT1("BIT1", 0, 50),
   INT8("INT8", 1, 127),
   INT4("INT4", 2, 56),
   INT2("INT2", 3, 52),
   INT1("INT1", 4, 48),
   FLOAT4("FLOAT4", 5, 59),
   FLOAT8("FLOAT8", 6, 62),
   DATETIME4("DATETIME4", 7, 58),
   DATETIME8("DATETIME8", 8, 61),
   MONEY4("MONEY4", 9, 122),
   MONEY8("MONEY8", 10, 60),
   BITN("BITN", 11, 104),
   INTN("INTN", 12, 38),
   DECIMALN("DECIMALN", 13, 106),
   NUMERICN("NUMERICN", 14, 108),
   FLOATN("FLOATN", 15, 109),
   MONEYN("MONEYN", 16, 110),
   DATETIMEN("DATETIMEN", 17, 111),
   GUID("GUID", 18, 36),
   DATEN("DATEN", 19, 40),
   TIMEN("TIMEN", 20, 41),
   DATETIME2N("DATETIME2N", 21, 42),
   DATETIMEOFFSETN("DATETIMEOFFSETN", 22, 43),
   BIGCHAR("BIGCHAR", 23, 175),
   BIGVARCHAR("BIGVARCHAR", 24, 167),
   BIGBINARY("BIGBINARY", 25, 173),
   BIGVARBINARY("BIGVARBINARY", 26, 165),
   NCHAR("NCHAR", 27, 239),
   NVARCHAR("NVARCHAR", 28, 231),
   IMAGE("IMAGE", 29, 34),
   TEXT("TEXT", 30, 35),
   NTEXT("NTEXT", 31, 99),
   UDT("UDT", 32, 240),
   XML("XML", 33, 241),
   SQL_VARIANT("SQL_VARIANT", 34, 98);
   private final int intValue;
   private static final int MAXELEMENTS = 256;
   private static final TDSType[] valuesTypes = new TDSType[256];
   // $FF: synthetic field
   private static final TDSType[] $VALUES = new TDSType[]{BIT1, INT8, INT4, INT2, INT1, FLOAT4, FLOAT8, DATETIME4, DATETIME8, MONEY4, MONEY8, BITN, INTN, DECIMALN, NUMERICN, FLOATN, MONEYN, DATETIMEN, GUID, DATEN, TIMEN, DATETIME2N, DATETIMEOFFSETN, BIGCHAR, BIGVARCHAR, BIGBINARY, BIGVARBINARY, NCHAR, NVARCHAR, IMAGE, TEXT, NTEXT, UDT, XML, SQL_VARIANT};


   byte byteValue() {
      return (byte)this.intValue;
   }

   private TDSType(String var1, int var2, int var3) {
      this.intValue = var3;
   }

   static TDSType valueOf(int var0) throws IllegalArgumentException {
      TDSType var1;
      if(0 <= var0 && var0 < valuesTypes.length && null != (var1 = valuesTypes[var0])) {
         return var1;
      } else {
         MessageFormat var2 = new MessageFormat(SQLServerException.getErrString("R_unknownSSType"));
         Object[] var3 = new Object[]{new Integer(var0)};
         throw new IllegalArgumentException(var2.format(var3));
      }
   }

   static {
      TDSType[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         TDSType var3 = var0[var2];
         valuesTypes[var3.intValue] = var3;
      }

   }
}
