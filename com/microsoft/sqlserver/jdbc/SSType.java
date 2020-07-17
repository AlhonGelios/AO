package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.JDBCType;
import java.util.EnumMap;
import java.util.EnumSet;

enum SSType {

   UNKNOWN("UNKNOWN", 0, SSType.Category.UNKNOWN, "unknown", JDBCType.UNKNOWN),
   TINYINT("TINYINT", 1, SSType.Category.NUMERIC, "tinyint", JDBCType.TINYINT),
   BIT("BIT", 2, SSType.Category.NUMERIC, "bit", JDBCType.BIT),
   SMALLINT("SMALLINT", 3, SSType.Category.NUMERIC, "smallint", JDBCType.SMALLINT),
   INTEGER("INTEGER", 4, SSType.Category.NUMERIC, "int", JDBCType.INTEGER),
   BIGINT("BIGINT", 5, SSType.Category.NUMERIC, "bigint", JDBCType.BIGINT),
   FLOAT("FLOAT", 6, SSType.Category.NUMERIC, "float", JDBCType.DOUBLE),
   REAL("REAL", 7, SSType.Category.NUMERIC, "real", JDBCType.REAL),
   SMALLDATETIME("SMALLDATETIME", 8, SSType.Category.DATETIME, "smalldatetime", JDBCType.TIMESTAMP),
   DATETIME("DATETIME", 9, SSType.Category.DATETIME, "datetime", JDBCType.TIMESTAMP),
   DATE("DATE", 10, SSType.Category.DATE, "date", JDBCType.DATE),
   TIME("TIME", 11, SSType.Category.TIME, "time", JDBCType.TIME),
   DATETIME2("DATETIME2", 12, SSType.Category.DATETIME2, "datetime2", JDBCType.TIMESTAMP),
   DATETIMEOFFSET("DATETIMEOFFSET", 13, SSType.Category.DATETIMEOFFSET, "datetimeoffset", JDBCType.DATETIMEOFFSET),
   SMALLMONEY("SMALLMONEY", 14, SSType.Category.NUMERIC, "smallmoney", JDBCType.DECIMAL),
   MONEY("MONEY", 15, SSType.Category.NUMERIC, "money", JDBCType.DECIMAL),
   CHAR("CHAR", 16, SSType.Category.CHARACTER, "char", JDBCType.CHAR),
   VARCHAR("VARCHAR", 17, SSType.Category.CHARACTER, "varchar", JDBCType.VARCHAR),
   VARCHARMAX("VARCHARMAX", 18, SSType.Category.LONG_CHARACTER, "varchar", JDBCType.LONGVARCHAR),
   TEXT("TEXT", 19, SSType.Category.LONG_CHARACTER, "text", JDBCType.LONGVARCHAR),
   NCHAR("NCHAR", 20, SSType.Category.NCHARACTER, "nchar", JDBCType.NCHAR),
   NVARCHAR("NVARCHAR", 21, SSType.Category.NCHARACTER, "nvarchar", JDBCType.NVARCHAR),
   NVARCHARMAX("NVARCHARMAX", 22, SSType.Category.LONG_NCHARACTER, "nvarchar", JDBCType.LONGNVARCHAR),
   NTEXT("NTEXT", 23, SSType.Category.LONG_NCHARACTER, "ntext", JDBCType.LONGNVARCHAR),
   BINARY("BINARY", 24, SSType.Category.BINARY, "binary", JDBCType.BINARY),
   VARBINARY("VARBINARY", 25, SSType.Category.BINARY, "varbinary", JDBCType.VARBINARY),
   VARBINARYMAX("VARBINARYMAX", 26, SSType.Category.LONG_BINARY, "varbinary", JDBCType.LONGVARBINARY),
   IMAGE("IMAGE", 27, SSType.Category.LONG_BINARY, "image", JDBCType.LONGVARBINARY),
   DECIMAL("DECIMAL", 28, SSType.Category.NUMERIC, "decimal", JDBCType.DECIMAL),
   NUMERIC("NUMERIC", 29, SSType.Category.NUMERIC, "numeric", JDBCType.NUMERIC),
   GUID("GUID", 30, SSType.Category.GUID, "uniqueidentifier", JDBCType.CHAR),
   SQL_VARIANT("SQL_VARIANT", 31, SSType.Category.VARIANT, "sql_variant", JDBCType.VARCHAR),
   UDT("UDT", 32, SSType.Category.UDT, "udt", JDBCType.VARBINARY),
   XML("XML", 33, SSType.Category.XML, "xml", JDBCType.LONGNVARCHAR),
   TIMESTAMP("TIMESTAMP", 34, SSType.Category.TIMESTAMP, "timestamp", JDBCType.BINARY);
   final SSType.Category category;
   private final String name;
   private final JDBCType jdbcType;
   // $FF: synthetic field
   private static final SSType[] $VALUES = new SSType[]{UNKNOWN, TINYINT, BIT, SMALLINT, INTEGER, BIGINT, FLOAT, REAL, SMALLDATETIME, DATETIME, DATE, TIME, DATETIME2, DATETIMEOFFSET, SMALLMONEY, MONEY, CHAR, VARCHAR, VARCHARMAX, TEXT, NCHAR, NVARCHAR, NVARCHARMAX, NTEXT, BINARY, VARBINARY, VARBINARYMAX, IMAGE, DECIMAL, NUMERIC, GUID, SQL_VARIANT, UDT, XML, TIMESTAMP};


   private SSType(String var1, int var2, SSType.Category var3, String var4, JDBCType var5) {
      this.category = var3;
      this.name = var4;
      this.jdbcType = var5;
   }

   public String toString() {
      return this.name;
   }

   final JDBCType getJDBCType() {
      return this.jdbcType;
   }

   boolean convertsTo(JDBCType var1) {
      return SSType.GetterConversion.converts(this, var1);
   }


   static enum GetterConversion {

      NUMERIC("NUMERIC", 0, SSType.Category.NUMERIC, EnumSet.of(JDBCType.Category.NUMERIC, JDBCType.Category.CHARACTER, JDBCType.Category.BINARY)),
      DATETIME("DATETIME", 1, SSType.Category.DATETIME, EnumSet.of(JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER, JDBCType.Category.BINARY)),
      DATETIME2("DATETIME2", 2, SSType.Category.DATETIME2, EnumSet.of(JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER)),
      DATE("DATE", 3, SSType.Category.DATE, EnumSet.of(JDBCType.Category.DATE, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER)),
      TIME("TIME", 4, SSType.Category.TIME, EnumSet.of(JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER)),
      DATETIMEOFFSET("DATETIMEOFFSET", 5, SSType.Category.DATETIMEOFFSET, EnumSet.of(JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.DATETIMEOFFSET, JDBCType.Category.CHARACTER)),
      CHARACTER("CHARACTER", 6, SSType.Category.CHARACTER, EnumSet.of(JDBCType.Category.NUMERIC, new JDBCType.Category[]{JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.BINARY})),
      LONG_CHARACTER("LONG_CHARACTER", 7, SSType.Category.LONG_CHARACTER, EnumSet.of(JDBCType.Category.NUMERIC, new JDBCType.Category[]{JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.BINARY, JDBCType.Category.CLOB})),
      NCHARACTER("NCHARACTER", 8, SSType.Category.NCHARACTER, EnumSet.of(JDBCType.Category.NUMERIC, new JDBCType.Category[]{JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.BINARY, JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP})),
      LONG_NCHARACTER("LONG_NCHARACTER", 9, SSType.Category.LONG_NCHARACTER, EnumSet.of(JDBCType.Category.NUMERIC, new JDBCType.Category[]{JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.BINARY, JDBCType.Category.DATE, JDBCType.Category.TIME, JDBCType.Category.TIMESTAMP, JDBCType.Category.CLOB, JDBCType.Category.NCLOB})),
      BINARY("BINARY", 10, SSType.Category.BINARY, EnumSet.of(JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER)),
      LONG_BINARY("LONG_BINARY", 11, SSType.Category.LONG_BINARY, EnumSet.of(JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY, JDBCType.Category.CHARACTER, JDBCType.Category.LONG_CHARACTER, JDBCType.Category.BLOB)),
      TIMESTAMP("TIMESTAMP", 12, SSType.Category.TIMESTAMP, EnumSet.of(JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY, JDBCType.Category.CHARACTER)),
      XML("XML", 13, SSType.Category.XML, EnumSet.of(JDBCType.Category.CHARACTER, new JDBCType.Category[]{JDBCType.Category.LONG_CHARACTER, JDBCType.Category.CLOB, JDBCType.Category.NCHARACTER, JDBCType.Category.LONG_NCHARACTER, JDBCType.Category.NCLOB, JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY, JDBCType.Category.BLOB, JDBCType.Category.SQLXML})),
      UDT("UDT", 14, SSType.Category.UDT, EnumSet.of(JDBCType.Category.BINARY, JDBCType.Category.LONG_BINARY, JDBCType.Category.CHARACTER)),
      GUID("GUID", 15, SSType.Category.GUID, EnumSet.of(JDBCType.Category.BINARY, JDBCType.Category.CHARACTER));
      private final SSType.Category from;
      private final EnumSet to;
      private static final EnumMap conversionMap = new EnumMap(SSType.Category.class);
      // $FF: synthetic field
      private static final SSType.GetterConversion[] $VALUES = new SSType.GetterConversion[]{NUMERIC, DATETIME, DATETIME2, DATE, TIME, DATETIMEOFFSET, CHARACTER, LONG_CHARACTER, NCHARACTER, LONG_NCHARACTER, BINARY, LONG_BINARY, TIMESTAMP, XML, UDT, GUID};


      private GetterConversion(String var1, int var2, SSType.Category var3, EnumSet var4) {
         this.from = var3;
         this.to = var4;
      }

      static final boolean converts(SSType var0, JDBCType var1) {
         return ((EnumSet)conversionMap.get(var0.category)).contains(var1.category);
      }

      static {
         SSType.Category[] var0 = SSType.Category.values();
         int var1 = var0.length;

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            SSType.Category var3 = var0[var2];
            conversionMap.put(var3, EnumSet.noneOf(JDBCType.Category.class));
         }

         SSType.GetterConversion[] var4 = values();
         var1 = var4.length;

         for(var2 = 0; var2 < var1; ++var2) {
            SSType.GetterConversion var5 = var4[var2];
            ((EnumSet)conversionMap.get(var5.from)).addAll(var5.to);
         }

      }
   }

   static enum Category {

      BINARY("BINARY", 0),
      CHARACTER("CHARACTER", 1),
      DATE("DATE", 2),
      DATETIME("DATETIME", 3),
      DATETIME2("DATETIME2", 4),
      DATETIMEOFFSET("DATETIMEOFFSET", 5),
      GUID("GUID", 6),
      LONG_BINARY("LONG_BINARY", 7),
      LONG_CHARACTER("LONG_CHARACTER", 8),
      LONG_NCHARACTER("LONG_NCHARACTER", 9),
      NCHARACTER("NCHARACTER", 10),
      NUMERIC("NUMERIC", 11),
      UNKNOWN("UNKNOWN", 12),
      TIME("TIME", 13),
      TIMESTAMP("TIMESTAMP", 14),
      UDT("UDT", 15),
      VARIANT("VARIANT", 16),
      XML("XML", 17);
      // $FF: synthetic field
      private static final SSType.Category[] $VALUES = new SSType.Category[]{BINARY, CHARACTER, DATE, DATETIME, DATETIME2, DATETIMEOFFSET, GUID, LONG_BINARY, LONG_CHARACTER, LONG_NCHARACTER, NCHARACTER, NUMERIC, UNKNOWN, TIME, TIMESTAMP, UDT, VARIANT, XML};


      private Category(String var1, int var2) {}

   }
}
