package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerSQLXML;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.TemporalCompatibility;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Calendar;
import microsoft.sql.DateTimeOffset;

enum JavaType {

   INTEGER("INTEGER", 0, Integer.class, JDBCType.INTEGER),
   STRING("STRING", 1, String.class, JDBCType.CHAR),
   DATE("DATE", 2, Date.class, JDBCType.DATE),
   TIME("TIME", 3, Time.class, JDBCType.TIME),
   TIMESTAMP("TIMESTAMP", 4, Timestamp.class, JDBCType.TIMESTAMP),
   UTILDATE("UTILDATE", 5, java.util.Date.class, JDBCType.TIMESTAMP),
   CALENDAR("CALENDAR", 6, Calendar.class, JDBCType.TIMESTAMP),
   LOCALDATE("LOCALDATE", 7, getJavaClass("LocalDate"), JDBCType.DATE),
   LOCALTIME("LOCALTIME", 8, getJavaClass("LocalTime"), JDBCType.TIME),
   LOCALDATETIME("LOCALDATETIME", 9, getJavaClass("LocalDateTime"), JDBCType.TIMESTAMP),
   OFFSETTIME("OFFSETTIME", 10, getJavaClass("OffsetTime"), JDBCType.TIME_WITH_TIMEZONE),
   OFFSETDATETIME("OFFSETDATETIME", 11, getJavaClass("OffsetDateTime"), JDBCType.TIMESTAMP_WITH_TIMEZONE),
   DATETIMEOFFSET("DATETIMEOFFSET", 12, DateTimeOffset.class, JDBCType.DATETIMEOFFSET),
   BOOLEAN("BOOLEAN", 13, Boolean.class, JDBCType.BIT),
   BIGDECIMAL("BIGDECIMAL", 14, BigDecimal.class, JDBCType.DECIMAL),
   DOUBLE("DOUBLE", 15, Double.class, JDBCType.DOUBLE),
   FLOAT("FLOAT", 16, Float.class, JDBCType.REAL),
   SHORT("SHORT", 17, Short.class, JDBCType.SMALLINT),
   LONG("LONG", 18, Long.class, JDBCType.BIGINT),
   BIGINTEGER("BIGINTEGER", 19, BigInteger.class, JDBCType.BIGINT),
   BYTE("BYTE", 20, Byte.class, JDBCType.TINYINT),
   BYTEARRAY("BYTEARRAY", 21, byte[].class, JDBCType.BINARY),
   NCLOB("NCLOB", 22, NClob.class, JDBCType.NCLOB),
   CLOB("CLOB", 23, Clob.class, JDBCType.CLOB),
   BLOB("BLOB", 24, Blob.class, JDBCType.BLOB),
   INPUTSTREAM("INPUTSTREAM", 25, InputStream.class, JDBCType.UNKNOWN, null) {

      // $FF: synthetic field
      static final boolean $assertionsDisabled = !JavaType.class.desiredAssertionStatus();

      JDBCType getJDBCType(SSType var1, JDBCType var2) {
         JDBCType var3;
         if(SSType.UNKNOWN != var1) {
            switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[var1.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
               var3 = JDBCType.LONGVARCHAR;
               break;
            case 9:
            default:
               var3 = JDBCType.LONGVARBINARY;
            }
         } else {
            var3 = var2.isTextual()?JDBCType.LONGVARCHAR:JDBCType.LONGVARBINARY;
         }

         if(!$assertionsDisabled && null == var3) {
            throw new AssertionError();
         } else {
            return var3;
         }
      }
   },
   READER("READER", 26, Reader.class, JDBCType.LONGVARCHAR),
   SQLXML("SQLXML", 27, SQLServerSQLXML.class, JDBCType.SQLXML),
   OBJECT("OBJECT", 28, Object.class, JDBCType.UNKNOWN);
   private final Class javaClass;
   private final JDBCType jdbcTypeFromJavaType;
   private static double jvmVersion = 0.0D;
   // $FF: synthetic field
   private static final JavaType[] $VALUES = new JavaType[]{INTEGER, STRING, DATE, TIME, TIMESTAMP, UTILDATE, CALENDAR, LOCALDATE, LOCALTIME, LOCALDATETIME, OFFSETTIME, OFFSETDATETIME, DATETIMEOFFSET, BOOLEAN, BIGDECIMAL, DOUBLE, FLOAT, SHORT, LONG, BIGINTEGER, BYTE, BYTEARRAY, NCLOB, CLOB, BLOB, INPUTSTREAM, READER, SQLXML, OBJECT};


   private JavaType(String var1, int var2, Class var3, JDBCType var4) {
      this.javaClass = var3;
      this.jdbcTypeFromJavaType = var4;
   }

   static Class getJavaClass(String var0) {
      if(0.0D == jvmVersion) {
         try {
            String var1 = System.getProperty("java.specification.version");
            if(var1 != null) {
               jvmVersion = Double.parseDouble(var1);
            }
         } catch (NumberFormatException var2) {
            jvmVersion = 0.1D;
         }
      }

      return jvmVersion < 1.8D?TemporalCompatibility.class:(var0.equals("LocalDate")?LocalDate.class:(var0.equals("LocalTime")?LocalTime.class:(var0.equals("LocalDateTime")?LocalDateTime.class:(var0.equals("OffsetTime")?OffsetTime.class:(var0.equals("OffsetDateTime")?OffsetDateTime.class:TemporalCompatibility.class)))));
   }

   static JavaType of(Object var0) {
      if(null != var0) {
         JavaType[] var1 = values();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            JavaType var4 = var1[var3];
            if(var4.javaClass.isInstance(var0)) {
               return var4;
            }
         }
      }

      return OBJECT;
   }

   JDBCType getJDBCType(SSType var1, JDBCType var2) {
      return this.jdbcTypeFromJavaType;
   }

   // $FF: synthetic method
   JavaType(String var1, int var2, Class var3, JDBCType var4, Object var5) {
      this(var1, var2, var3, var4);
   }

}
