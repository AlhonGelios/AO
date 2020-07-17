package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.AsciiFilteredInputStream;
import com.microsoft.sqlserver.jdbc.AsciiFilteredUnicodeInputStream;
import com.microsoft.sqlserver.jdbc.BaseInputStream;
import com.microsoft.sqlserver.jdbc.GregorianChange;
import com.microsoft.sqlserver.jdbc.InputStreamGetterArgs;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerBlob;
import com.microsoft.sqlserver.jdbc.SQLServerClob;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerNClob;
import com.microsoft.sqlserver.jdbc.SQLServerSQLXML;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.StreamType;
import com.microsoft.sqlserver.jdbc.TypeInfo;
import com.microsoft.sqlserver.jdbc.UTC;
import com.microsoft.sqlserver.jdbc.Util;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import microsoft.sql.DateTimeOffset;

final class DDC {

   private static final BigInteger maxRPCDecimalValue = new BigInteger("99999999999999999999999999999999999999");


   static final Object convertIntegerToObject(int var0, int var1, JDBCType var2, StreamType var3) {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
      case 1:
         return new Integer(var0);
      case 2:
      case 3:
         return new Short((short)var0);
      case 4:
      case 5:
         return new Boolean(0 != var0);
      case 6:
         return new Long((long)var0);
      case 7:
      case 8:
         return new BigDecimal(Integer.toString(var0));
      case 9:
      case 10:
         return new Double((double)var0);
      case 11:
         return new Float((float)var0);
      case 12:
         return convertIntToBytes(var0, var1);
      default:
         return Integer.toString(var0);
      }
   }

   static final Object convertLongToObject(long var0, JDBCType var2, StreamType var3) {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
      case 1:
         return new Integer((int)var0);
      case 2:
      case 3:
         return new Short((short)((int)var0));
      case 4:
      case 5:
         return new Boolean(0L != var0);
      case 6:
         return new Long(var0);
      case 7:
      case 8:
         return new BigDecimal(Long.toString(var0));
      case 9:
      case 10:
         return new Double((double)var0);
      case 11:
         return new Float((float)var0);
      case 12:
         return convertLongToBytes(var0);
      default:
         return Long.toString(var0);
      }
   }

   static final byte[] convertIntToBytes(int var0, int var1) {
      byte[] var2 = new byte[var1];

      for(int var3 = var1; var3-- > 0; var0 >>= 8) {
         var2[var3] = (byte)(var0 & 255);
      }

      return var2;
   }

   static final Object convertFloatToObject(float var0, JDBCType var1, StreamType var2) {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var1.ordinal()]) {
      case 1:
         return new Integer((int)var0);
      case 2:
      case 3:
         return new Short((short)((int)var0));
      case 4:
      case 5:
         return new Boolean(0 != Float.compare(0.0F, var0));
      case 6:
         return new Long((long)var0);
      case 7:
      case 8:
         return new BigDecimal(Float.toString(var0));
      case 9:
      case 10:
         return new Double((new Float(var0)).doubleValue());
      case 11:
         return new Float(var0);
      case 12:
         return convertIntToBytes(Float.floatToRawIntBits(var0), 4);
      default:
         return Float.toString(var0);
      }
   }

   static final byte[] convertLongToBytes(long var0) {
      byte[] var2 = new byte[8];

      for(int var3 = 8; var3-- > 0; var0 >>= 8) {
         var2[var3] = (byte)((int)(var0 & 255L));
      }

      return var2;
   }

   static final Object convertDoubleToObject(double var0, JDBCType var2, StreamType var3) {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
      case 1:
         return new Integer((int)var0);
      case 2:
      case 3:
         return new Short((short)((int)var0));
      case 4:
      case 5:
         return new Boolean(0 != Double.compare(0.0D, var0));
      case 6:
         return new Long((long)var0);
      case 7:
      case 8:
         return new BigDecimal(Double.toString(var0));
      case 9:
      case 10:
         return new Double(var0);
      case 11:
         return new Float((new Double(var0)).floatValue());
      case 12:
         return convertLongToBytes(Double.doubleToRawLongBits(var0));
      default:
         return Double.toString(var0);
      }
   }

   static final byte[] convertBigDecimalToBytes(BigDecimal var0, int var1) {
      byte[] var2;
      if(var0 == null) {
         var2 = new byte[]{(byte)var1, (byte)0};
      } else {
         boolean var3 = var0.signum() < 0;
         if(var0.scale() < 0) {
            var0 = var0.setScale(0);
         }

         BigInteger var4 = var0.unscaledValue();
         if(var3) {
            var4 = var4.negate();
         }

         byte[] var5 = var4.toByteArray();
         var2 = new byte[var5.length + 3];
         byte var6 = 0;
         int var8 = var6 + 1;
         var2[var6] = (byte)var0.scale();
         var2[var8++] = (byte)(var5.length + 1);
         var2[var8++] = (byte)(var3?0:1);

         for(int var7 = var5.length - 1; var7 >= 0; --var7) {
            var2[var8++] = var5[var7];
         }
      }

      return var2;
   }

   static final Object convertBigDecimalToObject(BigDecimal var0, JDBCType var1, StreamType var2) {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var1.ordinal()]) {
      case 1:
         return new Integer(var0.intValue());
      case 2:
      case 3:
         return new Short(var0.shortValue());
      case 4:
      case 5:
         return new Boolean(0 != var0.compareTo(BigDecimal.valueOf(0L)));
      case 6:
         return new Long(var0.longValue());
      case 7:
      case 8:
         return var0;
      case 9:
      case 10:
         return new Double(var0.doubleValue());
      case 11:
         return new Float(var0.floatValue());
      case 12:
         return convertBigDecimalToBytes(var0, var0.scale());
      default:
         return var0.toString();
      }
   }

   static final Object convertStringToObject(String var0, String var1, JDBCType var2, StreamType var3) throws UnsupportedEncodingException, IllegalArgumentException {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
      case 1:
         return Integer.valueOf(var0.trim());
      case 2:
      case 3:
         return Short.valueOf(var0.trim());
      case 4:
      case 5:
         String var4 = var0.trim();
         return 1 == var4.length()?Boolean.valueOf(49 == var4.charAt(0)):Boolean.valueOf(var4);
      case 6:
         return Long.valueOf(var0.trim());
      case 7:
      case 8:
         return new BigDecimal(var0.trim());
      case 9:
      case 10:
         return Double.valueOf(var0.trim());
      case 11:
         return Float.valueOf(var0.trim());
      case 12:
         return var0.getBytes(var1);
      case 13:
         return Timestamp.valueOf(var0.trim());
      case 14:
         return Date.valueOf(getDatePart(var0.trim()));
      case 15:
         Timestamp var5 = Timestamp.valueOf("1970-01-01 " + getTimePart(var0.trim()));
         GregorianCalendar var6 = new GregorianCalendar(Locale.US);
         var6.clear();
         var6.setTimeInMillis(var5.getTime());
         if(var5.getNanos() % 1000000 >= 500000) {
            var6.add(14, 1);
         }

         var6.set(1970, 0, 1);
         return new Time(var6.getTimeInMillis());
      default:
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$StreamType[var3.ordinal()]) {
         case 1:
            return new StringReader(var0);
         case 2:
            return new ByteArrayInputStream(var0.getBytes("US-ASCII"));
         case 3:
            return new ByteArrayInputStream(var0.getBytes());
         default:
            return var0;
         }
      }
   }

   static final Object convertStreamToObject(BaseInputStream var0, TypeInfo var1, JDBCType var2, InputStreamGetterArgs var3) throws SQLServerException {
      if(null == var0) {
         return null;
      } else {
         assert null != var1;

         assert null != var3;

         SSType var4 = var1.getSSType();

         MessageFormat var6;
         try {
            switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
            case 12:
            case 25:
            case 26:
            case 27:
               if(StreamType.BINARY == var3.streamType) {
                  return var0;
               } else {
                  if(JDBCType.BLOB == var2) {
                     return new SQLServerBlob(var0);
                  }

                  return var0.getBytes();
               }
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
               if(SSType.BINARY != var4 && SSType.VARBINARY != var4 && SSType.VARBINARYMAX != var4 && SSType.TIMESTAMP != var4 && SSType.IMAGE != var4 && SSType.UDT != var4) {
                  if(StreamType.ASCII == var3.streamType) {
                     if(var1.supportsFastAsciiConversion()) {
                        return new AsciiFilteredInputStream(var0);
                     } else {
                        if(var3.isAdaptive) {
                           return AsciiFilteredUnicodeInputStream.MakeAsciiFilteredUnicodeInputStream(var0, new BufferedReader(new InputStreamReader(var0, var1.getCharset())));
                        }

                        return new ByteArrayInputStream((new String(var0.getBytes(), var1.getCharset())).getBytes("US-ASCII"));
                     }
                  } else if(StreamType.CHARACTER != var3.streamType && StreamType.NCHARACTER != var3.streamType) {
                     return convertStringToObject(new String(var0.getBytes(), var1.getCharset()), var1.getCharset(), var2, var3.streamType);
                  } else {
                     if(var3.isAdaptive) {
                        return new BufferedReader(new InputStreamReader(var0, var1.getCharset()));
                     }

                     return new StringReader(new String(var0.getBytes(), var1.getCharset()));
                  }
               } else if(StreamType.ASCII == var3.streamType) {
                  return var0;
               } else {
                  assert StreamType.CHARACTER == var3.streamType || StreamType.NONE == var3.streamType;

                  byte[] var5 = var0.getBytes();
                  String var9 = Util.bytesToHexString(var5, var5.length);
                  if(StreamType.NONE == var3.streamType) {
                     return var9;
                  }

                  return new StringReader(var9);
               }
            case 22:
               return new SQLServerClob(var0, var1);
            case 23:
               return new SQLServerNClob(var0, var1);
            case 24:
               return new SQLServerSQLXML(var0, var3, var1);
            }
         } catch (IllegalArgumentException var7) {
            var6 = new MessageFormat(SQLServerException.getErrString("R_errorConvertingValue"));
            throw new SQLServerException(var6.format(new Object[]{var1.getSSType(), var2}), (String)null, 0, var7);
         } catch (UnsupportedEncodingException var8) {
            var6 = new MessageFormat(SQLServerException.getErrString("R_errorConvertingValue"));
            throw new SQLServerException(var6.format(new Object[]{var1.getSSType(), var2}), (String)null, 0, var8);
         }
      }
   }

   private static final String getDatePart(String var0) {
      int var1 = var0.indexOf(32);
      return -1 == var1?var0:var0.substring(0, var1);
   }

   private static final String getTimePart(String var0) {
      int var1 = var0.indexOf(32);
      return -1 == var1?var0:var0.substring(var1 + 1);
   }

   private static String fractionalSecondsString(long var0, int var2) {
      assert 0L <= var0 && var0 < 1000000000L;

      assert 0 <= var2 && var2 <= 7;

      return 0 == var2?"":BigDecimal.valueOf(var0 % 1000000000L, 9).setScale(var2).toPlainString().substring(1);
   }

   static final Object convertTemporalToObject(JDBCType var0, SSType var1, Calendar var2, int var3, long var4, int var6) {
      TimeZone var7 = null != var2?var2.getTimeZone():TimeZone.getDefault();
      TimeZone var8 = SSType.DATETIMEOFFSET == var1?UTC.timeZone:var7;
      boolean var9 = false;
      GregorianCalendar var10 = new GregorianCalendar(var8, Locale.US);
      var10.setLenient(true);
      var10.clear();
      int var11;
      int var12;
      int var18;
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[var1.ordinal()]) {
      case 1:
         var10.set(1900, 0, 1, 0, 0, 0);
         var10.set(14, (int)(var4 / 1000000L));
         var18 = (int)(var4 % 1000000000L);
         break;
      case 2:
      case 3:
      case 4:
         if(var3 >= GregorianChange.DAYS_SINCE_BASE_DATE_HINT) {
            var10.set(1, 0, 1 + var3 + GregorianChange.EXTRA_DAYS_TO_BE_ADDED, 0, 0, 0);
            var10.set(14, (int)(var4 / 1000000L));
         } else {
            var10.setGregorianChange(GregorianChange.PURE_CHANGE_DATE);
            var10.set(1, 0, 1 + var3, 0, 0, 0);
            var10.set(14, (int)(var4 / 1000000L));
            var11 = var10.get(1);
            var12 = var10.get(2);
            int var13 = var10.get(5);
            int var14 = var10.get(11);
            int var15 = var10.get(12);
            int var16 = var10.get(13);
            int var17 = var10.get(14);
            var10.setGregorianChange(GregorianChange.STANDARD_CHANGE_DATE);
            var10.set(var11, var12, var13, var14, var15, var16);
            var10.set(14, var17);
         }

         if(SSType.DATETIMEOFFSET == var1 && !var8.hasSameRules(var7)) {
            GregorianCalendar var19 = new GregorianCalendar(var7, Locale.US);
            var19.clear();
            var19.setTimeInMillis(var10.getTimeInMillis());
            var10 = var19;
         }

         var18 = (int)(var4 % 1000000000L);
         break;
      case 5:
         var10.set(1900, 0, 1 + var3, 0, 0, 0);
         var10.set(14, (int)var4);
         var18 = (int)(var4 * 1000000L % 1000000000L);
         break;
      default:
         throw new AssertionError("Unexpected SSType: " + var1);
      }

      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType$Category[var0.category.ordinal()]) {
      case 1:
         var10.set(11, 0);
         var10.set(12, 0);
         var10.set(13, 0);
         var10.set(14, 0);
         return new Date(var10.getTimeInMillis());
      case 2:
         if(var18 % 1000000 >= 500000) {
            var10.add(14, 1);
         }

         var10.set(1970, 0, 1);
         return new Time(var10.getTimeInMillis());
      case 3:
         Timestamp var20 = new Timestamp(var10.getTimeInMillis());
         var20.setNanos(var18);
         return var20;
      case 4:
         assert SSType.DATETIMEOFFSET == var1;

         var11 = var2.get(15);

         assert 0 == var11 % '\uea60';

         Timestamp var21 = new Timestamp(var10.getTimeInMillis());
         var21.setNanos(var18);
         return DateTimeOffset.valueOf(var21, var11 / '\uea60');
      case 5:
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[var1.ordinal()]) {
         case 1:
            return String.format(Locale.US, "%1$tT%2$s", new Object[]{var10, fractionalSecondsString((long)var18, var6)});
         case 2:
            return String.format(Locale.US, "%1$tF", new Object[]{var10});
         case 3:
            return String.format(Locale.US, "%1$tF %1$tT%2$s", new Object[]{var10, fractionalSecondsString((long)var18, var6)});
         case 4:
            var11 = var2.get(15);

            assert 0 == var11 % '\uea60';

            var12 = Math.abs(var11 / '\uea60');
            return String.format(Locale.US, "%1$tF %1$tT%2$s %3$c%4$02d:%5$02d", new Object[]{var10, fractionalSecondsString((long)var18, var6), Character.valueOf((char)(var11 >= 0?'+':'-')), Integer.valueOf(var12 / 60), Integer.valueOf(var12 % 60)});
         case 5:
            return (new Timestamp(var10.getTimeInMillis())).toString();
         default:
            throw new AssertionError("Unexpected SSType: " + var1);
         }
      default:
         throw new AssertionError("Unexpected JDBCType: " + var0);
      }
   }

   static int daysSinceBaseDate(int var0, int var1, int var2) {
      assert var0 >= 1;

      assert var2 >= 1;

      assert var1 >= 1;

      return var1 - 1 + (var0 - var2) * 365 + leapDaysBeforeYear(var0) - leapDaysBeforeYear(var2);
   }

   private static int leapDaysBeforeYear(int var0) {
      assert var0 >= 1;

      return (var0 - 1) / 4 - (var0 - 1) / 100 + (var0 - 1) / 400;
   }

   static final boolean exceedsMaxRPCDecimalPrecisionOrScale(BigDecimal var0) {
      if(null == var0) {
         return false;
      } else if(var0.scale() > 38) {
         return true;
      } else {
         BigInteger var1 = var0.scale() < 0?var0.setScale(0).unscaledValue():var0.unscaledValue();
         if(var0.signum() < 0) {
            var1 = var1.negate();
         }

         return var1.compareTo(maxRPCDecimalValue) > 0;
      }
   }

   static String convertReaderToString(Reader var0, int var1) throws SQLServerException {
      assert -1 == var1 || var1 >= 0;

      if(null == var0) {
         return null;
      } else if(0 == var1) {
         return "";
      } else {
         try {
            StringBuilder var2 = new StringBuilder(-1 != var1?var1:4000);

            int var9;
            for(char[] var8 = new char[-1 != var1 && var1 < 4000?var1:4000]; (var9 = var0.read(var8, 0, var8.length)) > 0; var2.append(var8, 0, var9)) {
               if(var9 > var8.length) {
                  MessageFormat var5 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                  Object[] var6 = new Object[]{SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
                  SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var5.format(var6), "", true);
               }
            }

            return var2.toString();
         } catch (IOException var7) {
            MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
            Object[] var4 = new Object[]{var7.toString()};
            SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var3.format(var4), "", true);
            return null;
         }
      }
   }

}
