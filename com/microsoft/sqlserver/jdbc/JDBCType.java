package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.Util;
import java.text.MessageFormat;
import java.util.EnumMap;
import java.util.EnumSet;

enum JDBCType {

   UNKNOWN("UNKNOWN", 0, JDBCType.Category.UNKNOWN, 999, "java.lang.Object"),
   ARRAY("ARRAY", 1, JDBCType.Category.UNKNOWN, 2003, "java.lang.Object"),
   BIGINT("BIGINT", 2, JDBCType.Category.NUMERIC, -5, "java.lang.Long"),
   BINARY("BINARY", 3, JDBCType.Category.BINARY, -2, "[B"),
   BIT("BIT", 4, JDBCType.Category.NUMERIC, -7, "java.lang.Boolean"),
   BLOB("BLOB", 5, JDBCType.Category.BLOB, 2004, "java.sql.Blob"),
   BOOLEAN("BOOLEAN", 6, JDBCType.Category.NUMERIC, 16, "java.lang.Boolean"),
   CHAR("CHAR", 7, JDBCType.Category.CHARACTER, 1, "java.lang.String"),
   CLOB("CLOB", 8, JDBCType.Category.CLOB, 2005, "java.sql.Clob"),
   DATALINK("DATALINK", 9, JDBCType.Category.UNKNOWN, 70, "java.lang.Object"),
   DATE("DATE", 10, JDBCType.Category.DATE, 91, "java.sql.Date"),
   DATETIMEOFFSET("DATETIMEOFFSET", 11, JDBCType.Category.DATETIMEOFFSET, -155, "microsoft.sql.DateTimeOffset"),
   DECIMAL("DECIMAL", 12, JDBCType.Category.NUMERIC, 3, "java.math.BigDecimal"),
   DISTINCT("DISTINCT", 13, JDBCType.Category.UNKNOWN, 2001, "java.lang.Object"),
   DOUBLE("DOUBLE", 14, JDBCType.Category.NUMERIC, 8, "java.lang.Double"),
   FLOAT("FLOAT", 15, JDBCType.Category.NUMERIC, 6, "java.lang.Double"),
   INTEGER("INTEGER", 16, JDBCType.Category.NUMERIC, 4, "java.lang.Integer"),
   JAVA_OBJECT("JAVA_OBJECT", 17, JDBCType.Category.UNKNOWN, 2000, "java.lang.Object"),
   LONGNVARCHAR("LONGNVARCHAR", 18, JDBCType.Category.LONG_NCHARACTER, -16, "java.lang.String"),
   LONGVARBINARY("LONGVARBINARY", 19, JDBCType.Category.LONG_BINARY, -4, "[B"),
   LONGVARCHAR("LONGVARCHAR", 20, JDBCType.Category.LONG_CHARACTER, -1, "java.lang.String"),
   NCHAR("NCHAR", 21, JDBCType.Category.NCHARACTER, -15, "java.lang.String"),
   NCLOB("NCLOB", 22, JDBCType.Category.NCLOB, 2011, "java.sql.NClob"),
   NULL("NULL", 23, JDBCType.Category.UNKNOWN, 0, "java.lang.Object"),
   NUMERIC("NUMERIC", 24, JDBCType.Category.NUMERIC, 2, "java.math.BigDecimal"),
   NVARCHAR("NVARCHAR", 25, JDBCType.Category.NCHARACTER, -9, "java.lang.String"),
   OTHER("OTHER", 26, JDBCType.Category.UNKNOWN, 1111, "java.lang.Object"),
   REAL("REAL", 27, JDBCType.Category.NUMERIC, 7, "java.lang.Float"),
   REF("REF", 28, JDBCType.Category.UNKNOWN, 2006, "java.lang.Object"),
   ROWID("ROWID", 29, JDBCType.Category.UNKNOWN, -8, "java.lang.Object"),
   SMALLINT("SMALLINT", 30, JDBCType.Category.NUMERIC, 5, "java.lang.Short"),
   SQLXML("SQLXML", 31, JDBCType.Category.SQLXML, 2009, "java.lang.Object"),
   STRUCT("STRUCT", 32, JDBCType.Category.UNKNOWN, 2002, "java.lang.Object"),
   TIME("TIME", 33, JDBCType.Category.TIME, 92, "java.sql.Time"),
   TIME_WITH_TIMEZONE("TIME_WITH_TIMEZONE", 34, JDBCType.Category.TIME_WITH_TIMEZONE, 2013, "java.time.OffsetTime"),
   TIMESTAMP("TIMESTAMP", 35, JDBCType.Category.TIMESTAMP, 93, "java.sql.Timestamp"),
   TIMESTAMP_WITH_TIMEZONE("TIMESTAMP_WITH_TIMEZONE", 36, JDBCType.Category.TIMESTAMP_WITH_TIMEZONE, 2014, "java.time.OffsetDateTime"),
   TINYINT("TINYINT", 37, JDBCType.Category.NUMERIC, -6, "java.lang.Short"),
   VARBINARY("VARBINARY", 38, JDBCType.Category.BINARY, -3, "[B"),
   VARCHAR("VARCHAR", 39, JDBCType.Category.CHARACTER, 12, "java.lang.String");
   final JDBCType.Category category;
   private final int intValue;
   private final String className;
   private static final EnumSet signedTypes = EnumSet.of(SMALLINT, new JDBCType[]{INTEGER, BIGINT, REAL, FLOAT, DOUBLE, DECIMAL, NUMERIC});
   private static final EnumSet binaryTypes = EnumSet.of(BINARY, VARBINARY, LONGVARBINARY, BLOB);
   private static final EnumSet textualCategories = EnumSet.of(JDBCType.Category.CHARACTER, new JDBCType.Category[]{JDBCType.Category.LONG_CHARACTER, JDBCType.Category.CLOB, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.NCLOB});
   // $FF: synthetic field
   private static final JDBCType[] $VALUES = new JDBCType[]{UNKNOWN, ARRAY, BIGINT, BINARY, BIT, BLOB, BOOLEAN, CHAR, CLOB, DATALINK, DATE, DATETIMEOFFSET, DECIMAL, DISTINCT, DOUBLE, FLOAT, INTEGER, JAVA_OBJECT, LONGNVARCHAR, LONGVARBINARY, LONGVARCHAR, NCHAR, NCLOB, NULL, NUMERIC, NVARCHAR, OTHER, REAL, REF, ROWID, SMALLINT, SQLXML, STRUCT, TIME, TIME_WITH_TIMEZONE, TIMESTAMP, TIMESTAMP_WITH_TIMEZONE, TINYINT, VARBINARY, VARCHAR};


   final String className() {
      return this.className;
   }

   private JDBCType(String var1, int var2, JDBCType.Category var3, int var4, String var5) {
      this.category = var3;
      this.intValue = var4;
      this.className = var5;
   }

   public int getIntValue() {
      return this.intValue;
   }

   boolean convertsTo(JDBCType var1) {
      return JDBCType.SetterConversion.converts(this, var1);
   }

   boolean convertsTo(SSType var1) {
      return JDBCType.UpdaterConversion.converts(this, var1);
   }

   static JDBCType of(int var0) throws SQLServerException {
      JDBCType[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         JDBCType var4 = var1[var3];
         if(var4.intValue == var0) {
            return var4;
         }
      }

      MessageFormat var5 = new MessageFormat(SQLServerException.getErrString("R_unknownJDBCType"));
      Object[] var6 = new Object[]{Integer.valueOf(var0)};
      SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var5.format(var6), (String)null, true);
      return UNKNOWN;
   }

   boolean isSigned() {
      return signedTypes.contains(this);
   }

   boolean isBinary() {
      return binaryTypes.contains(this);
   }

   boolean isTextual() {
      return textualCategories.contains(this.category);
   }

   boolean isUnsupported() {
      return JDBCType.Category.UNKNOWN == this.category;
   }

   int asJavaSqlType() {
      if(Util.SYSTEM_SPEC_VERSION.equals("1.5")) {
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[this.ordinal()]) {
         case 1:
            return 1;
         case 2:
            return 12;
         case 3:
            return -1;
         case 4:
            return 2005;
         case 5:
            return 1111;
         case 6:
            return 12;
         default:
            return this.intValue;
         }
      } else {
         return this.intValue;
      }
   }


   static enum UpdaterConversion {

      CHARACTER("CHARACTER", 0, JDBCType.Category.CHARACTER, EnumSet.of(SSType.Category.NUMERIC, new SSType.Category[]{SSType.Category.DATE, SSType.Category.TIME, SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER, SSType.Category.XML, SSType.Category.BINARY, SSType.Category.LONG_BINARY, SSType.Category.UDT, SSType.Category.GUID, SSType.Category.TIMESTAMP})),
      LONG_CHARACTER("LONG_CHARACTER", 1, JDBCType.Category.LONG_CHARACTER, EnumSet.of(SSType.Category.CHARACTER, new SSType.Category[]{SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER, SSType.Category.XML, SSType.Category.BINARY, SSType.Category.LONG_BINARY})),
      CLOB("CLOB", 2, JDBCType.Category.CLOB, EnumSet.of(SSType.Category.LONG_CHARACTER, SSType.Category.LONG_NCHARACTER, SSType.Category.XML)),
      NCHARACTER("NCHARACTER", 3, JDBCType.Category.NCHARACTER, EnumSet.of(SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER, SSType.Category.XML)),
      LONG_NCHARACTER("LONG_NCHARACTER", 4, JDBCType.Category.LONG_NCHARACTER, EnumSet.of(SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER, SSType.Category.XML)),
      NCLOB("NCLOB", 5, JDBCType.Category.NCLOB, EnumSet.of(SSType.Category.LONG_NCHARACTER, SSType.Category.XML)),
      BINARY("BINARY", 6, JDBCType.Category.BINARY, EnumSet.of(SSType.Category.NUMERIC, new SSType.Category[]{SSType.Category.DATETIME, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER, SSType.Category.XML, SSType.Category.BINARY, SSType.Category.LONG_BINARY, SSType.Category.UDT, SSType.Category.TIMESTAMP, SSType.Category.GUID})),
      LONG_BINARY("LONG_BINARY", 7, JDBCType.Category.LONG_BINARY, EnumSet.of(SSType.Category.XML, SSType.Category.BINARY, SSType.Category.LONG_BINARY, SSType.Category.UDT)),
      BLOB("BLOB", 8, JDBCType.Category.BLOB, EnumSet.of(SSType.Category.LONG_BINARY, SSType.Category.XML)),
      SQLXML("SQLXML", 9, JDBCType.Category.SQLXML, EnumSet.of(SSType.Category.XML)),
      NUMERIC("NUMERIC", 10, JDBCType.Category.NUMERIC, EnumSet.of(SSType.Category.NUMERIC, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER)),
      DATE("DATE", 11, JDBCType.Category.DATE, EnumSet.of(SSType.Category.DATE, new SSType.Category[]{SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER})),
      TIME("TIME", 12, JDBCType.Category.TIME, EnumSet.of(SSType.Category.TIME, new SSType.Category[]{SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER})),
      TIMESTAMP("TIMESTAMP", 13, JDBCType.Category.TIMESTAMP, EnumSet.of(SSType.Category.DATE, new SSType.Category[]{SSType.Category.TIME, SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER})),
      DATETIMEOFFSET("DATETIMEOFFSET", 14, JDBCType.Category.DATETIMEOFFSET, EnumSet.of(SSType.Category.DATE, new SSType.Category[]{SSType.Category.TIME, SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER})),
      TIME_WITH_TIMEZONE("TIME_WITH_TIMEZONE", 15, JDBCType.Category.TIME_WITH_TIMEZONE, EnumSet.of(SSType.Category.TIME, new SSType.Category[]{SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER})),
      TIMESTAMP_WITH_TIMEZONE("TIMESTAMP_WITH_TIMEZONE", 16, JDBCType.Category.TIMESTAMP_WITH_TIMEZONE, EnumSet.of(SSType.Category.DATE, new SSType.Category[]{SSType.Category.TIME, SSType.Category.DATETIME, SSType.Category.DATETIME2, SSType.Category.DATETIMEOFFSET, SSType.Category.CHARACTER, SSType.Category.LONG_CHARACTER, SSType.Category.NCHARACTER, SSType.Category.LONG_NCHARACTER}));
      private final JDBCType.Category from;
      private final EnumSet to;
      private static final EnumMap conversionMap = new EnumMap(JDBCType.Category.class);
      // $FF: synthetic field
      private static final JDBCType.UpdaterConversion[] $VALUES = new JDBCType.UpdaterConversion[]{CHARACTER, LONG_CHARACTER, CLOB, NCHARACTER, LONG_NCHARACTER, NCLOB, BINARY, LONG_BINARY, BLOB, SQLXML, NUMERIC, DATE, TIME, TIMESTAMP, DATETIMEOFFSET, TIME_WITH_TIMEZONE, TIMESTAMP_WITH_TIMEZONE};


      private UpdaterConversion(String var1, int var2, JDBCType.Category var3, EnumSet var4) {
         this.from = var3;
         this.to = var4;
      }

      static boolean converts(JDBCType var0, SSType var1) {
         return ((EnumSet)conversionMap.get(var0.category)).contains(var1.category);
      }

      static {
         JDBCType.Category[] var0 = JDBCType.Category.values();
         int var1 = var0.length;

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            JDBCType.Category var3 = var0[var2];
            conversionMap.put(var3, EnumSet.noneOf(SSType.Category.class));
         }

         JDBCType.UpdaterConversion[] var4 = values();
         var1 = var4.length;

         for(var2 = 0; var2 < var1; ++var2) {
            JDBCType.UpdaterConversion var5 = var4[var2];
            ((EnumSet)conversionMap.get(var5.from)).addAll(var5.to);
         }

      }
   }

   static enum SetterConversion {

      CHARACTER("CHARACTER", 0, JDBCType.Category.CHARACTER, EnumSet.of(JDBCType.Category.NUMERIC, new JDBCType.Category[]{JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.DATETIMEOFFSET, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY})),
      LONG_CHARACTER("LONG_CHARACTER", 1, JDBCType.Category.LONG_CHARACTER, EnumSet.of(JDBCType.Category.CHARACTER, new JDBCType.Category[]{JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY})),
      CLOB("CLOB", 2, JDBCType.Category.CLOB, EnumSet.of(JDBCType.Category.CLOB, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.LONG_NCHARACTER)),
      NCHARACTER("NCHARACTER", 3, JDBCType.Category.NCHARACTER, EnumSet.of(JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.NCLOB)),
      LONG_NCHARACTER("LONG_NCHARACTER", 4, JDBCType.Category.LONG_NCHARACTER, EnumSet.of(JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER)),
      NCLOB("NCLOB", 5, JDBCType.Category.NCLOB, EnumSet.of(JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.NCLOB)),
      BINARY("BINARY", 6, JDBCType.Category.BINARY, EnumSet.of(JDBCType.Category.NUMERIC, new JDBCType.Category[]{JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY, JDBCType.Category.BLOB})),
      LONG_BINARY("LONG_BINARY", 7, JDBCType.Category.LONG_BINARY, EnumSet.of(JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY)),
      BLOB("BLOB", 8, JDBCType.Category.BLOB, EnumSet.of(JDBCType.Category.LONG_BINARY, JDBCType.Category.BLOB)),
      NUMERIC("NUMERIC", 9, JDBCType.Category.NUMERIC, EnumSet.of(JDBCType.Category.NUMERIC, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER)),
      DATE("DATE", 10, JDBCType.Category.DATE, EnumSet.of(JDBCType.Category.DATE, new JDBCType.Category[]{JDBCType.Category.TIMESTAMP, JDBCType.Category.DATETIMEOFFSET, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER})),
      TIME("TIME", 11, JDBCType.Category.TIME, EnumSet.of(JDBCType.Category.TIME, new JDBCType.Category[]{JDBCType.Category.TIMESTAMP, JDBCType.Category.DATETIMEOFFSET, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER})),
      TIMESTAMP("TIMESTAMP", 12, JDBCType.Category.TIMESTAMP, EnumSet.of(JDBCType.Category.DATE, new JDBCType.Category[]{JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.DATETIMEOFFSET, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER})),
      TIME_WITH_TIMEZONE("TIME_WITH_TIMEZONE", 13, JDBCType.Category.TIME_WITH_TIMEZONE, EnumSet.of(JDBCType.Category.TIME_WITH_TIMEZONE, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER)),
      TIMESTAMP_WITH_TIMEZONE("TIMESTAMP_WITH_TIMEZONE", 14, JDBCType.Category.TIMESTAMP_WITH_TIMEZONE, EnumSet.of(JDBCType.Category.TIMESTAMP_WITH_TIMEZONE, new JDBCType.Category[]{JDBCType.Category.TIME_WITH_TIMEZONE, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER})),
      DATETIMEOFFSET("DATETIMEOFFSET", 15, JDBCType.Category.DATETIMEOFFSET, EnumSet.of(JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.DATETIMEOFFSET)),
      SQLXML("SQLXML", 16, JDBCType.Category.SQLXML, EnumSet.of(JDBCType.Category.SQLXML));
      private final JDBCType.Category from;
      private final EnumSet to;
      private static final EnumMap conversionMap = new EnumMap(JDBCType.Category.class);
      // $FF: synthetic field
      private static final JDBCType.SetterConversion[] $VALUES = new JDBCType.SetterConversion[]{CHARACTER, LONG_CHARACTER, CLOB, NCHARACTER, LONG_NCHARACTER, NCLOB, BINARY, LONG_BINARY, BLOB, NUMERIC, DATE, TIME, TIMESTAMP, TIME_WITH_TIMEZONE, TIMESTAMP_WITH_TIMEZONE, DATETIMEOFFSET, SQLXML};


      private SetterConversion(String var1, int var2, JDBCType.Category var3, EnumSet var4) {
         this.from = var3;
         this.to = var4;
      }

      static boolean converts(JDBCType var0, JDBCType var1) {
         return ((EnumSet)conversionMap.get(var0.category)).contains(var1.category);
      }

      static {
         JDBCType.Category[] var0 = JDBCType.Category.values();
         int var1 = var0.length;

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            JDBCType.Category var3 = var0[var2];
            conversionMap.put(var3, EnumSet.noneOf(JDBCType.Category.class));
         }

         JDBCType.SetterConversion[] var4 = values();
         var1 = var4.length;

         for(var2 = 0; var2 < var1; ++var2) {
            JDBCType.SetterConversion var5 = var4[var2];
            ((EnumSet)conversionMap.get(var5.from)).addAll(var5.to);
         }

      }
   }

   static enum Category {

      CHARACTER("CHARACTER", 0),
      LONG_CHARACTER("LONG_CHARACTER", 1),
      CLOB("CLOB", 2),
      NCHARACTER("NCHARACTER", 3),
      LONG_NCHARACTER("LONG_NCHARACTER", 4),
      NCLOB("NCLOB", 5),
      BINARY("BINARY", 6),
      LONG_BINARY("LONG_BINARY", 7),
      BLOB("BLOB", 8),
      NUMERIC("NUMERIC", 9),
      DATE("DATE", 10),
      TIME("TIME", 11),
      TIMESTAMP("TIMESTAMP", 12),
      TIME_WITH_TIMEZONE("TIME_WITH_TIMEZONE", 13),
      TIMESTAMP_WITH_TIMEZONE("TIMESTAMP_WITH_TIMEZONE", 14),
      DATETIMEOFFSET("DATETIMEOFFSET", 15),
      SQLXML("SQLXML", 16),
      UNKNOWN("UNKNOWN", 17);
      // $FF: synthetic field
      private static final JDBCType.Category[] $VALUES = new JDBCType.Category[]{CHARACTER, LONG_CHARACTER, CLOB, NCHARACTER, LONG_NCHARACTER, NCLOB, BINARY, LONG_BINARY, BLOB, NUMERIC, DATE, TIME, TIMESTAMP, TIME_WITH_TIMEZONE, TIMESTAMP_WITH_TIMEZONE, DATETIMEOFFSET, SQLXML, UNKNOWN};


      private Category(String var1, int var2) {}

   }
}
