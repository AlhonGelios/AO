package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ActivityCorrelator;
import com.microsoft.sqlserver.jdbc.ActivityId;
import com.microsoft.sqlserver.jdbc.DDC;
import com.microsoft.sqlserver.jdbc.DriverError;
import com.microsoft.sqlserver.jdbc.GregorianChange;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.Nanos;
import com.microsoft.sqlserver.jdbc.ParameterUtils;
import com.microsoft.sqlserver.jdbc.SQLCollation;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLState;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.TDS;
import com.microsoft.sqlserver.jdbc.TDSChannel;
import com.microsoft.sqlserver.jdbc.TDSCommand;
import com.microsoft.sqlserver.jdbc.TDSType;
import com.microsoft.sqlserver.jdbc.UTC;
import com.microsoft.sqlserver.jdbc.Util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import microsoft.sql.DateTimeOffset;

final class TDSWriter {

   private static Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.TDS.Writer");
   private final String traceID;
   private final TDSChannel tdsChannel;
   private final SQLServerConnection con;
   private boolean dataIsLoggable = true;
   private TDSCommand command = null;
   private byte tdsMessageType;
   private volatile int sendResetConnection = 0;
   private int currentPacketSize = 0;
   private static final int TDS_PACKET_HEADER_SIZE = 8;
   private static final byte[] placeholderHeader = new byte[8];
   private byte[] valueBytes = new byte[256];
   private volatile int packetNum = 0;
   private static final int BYTES4 = 4;
   private static final int BYTES8 = 8;
   private static final int BYTES12 = 12;
   private static final int BYTES16 = 16;
   public static final int BIGDECIMAL_MAX_LENGTH = 17;
   private boolean isEOMSent = false;
   private ByteBuffer stagingBuffer;
   private ByteBuffer socketBuffer;
   private ByteBuffer logBuffer;


   public final String toString() {
      return this.traceID;
   }

   void setDataLoggable(boolean var1) {
      this.dataIsLoggable = var1;
   }

   boolean isEOMSent() {
      return this.isEOMSent;
   }

   TDSWriter(TDSChannel var1, SQLServerConnection var2) {
      this.tdsChannel = var1;
      this.con = var2;
      this.traceID = "TDSWriter@" + Integer.toHexString(this.hashCode()) + " (" + var2.toString() + ")";
   }

   void preparePacket() throws SQLServerException {
      if(this.tdsChannel.isLoggingPackets()) {
         Arrays.fill(this.logBuffer.array(), (byte)-2);
         this.logBuffer.clear();
      }

      this.writeBytes(placeholderHeader);
   }

   void writeMessageHeader() throws SQLServerException {
      if(1 == this.tdsMessageType || 14 == this.tdsMessageType || 3 == this.tdsMessageType) {
         boolean var1 = false;
         int var2 = 22;
         if((1 == this.tdsMessageType || 3 == this.tdsMessageType) && this.con.isDenaliOrLater() && !ActivityCorrelator.getCurrent().IsSentToServer() && Util.IsActivityTraceOn()) {
            var1 = true;
            var2 += 26;
         }

         this.writeInt(var2);
         this.writeInt(18);
         this.writeShort((short)2);
         this.writeBytes(this.con.getTransactionDescriptor());
         this.writeInt(1);
         if(var1) {
            this.writeInt(26);
            this.writeTraceHeaderData();
            ActivityCorrelator.setCurrentActivityIdSentFlag();
         }
      }

   }

   void writeTraceHeaderData() throws SQLServerException {
      ActivityId var1 = ActivityCorrelator.getCurrent();
      byte[] var2 = Util.asGuidByteArray(var1.getId());
      long var3 = var1.getSequence();
      this.writeShort((short)3);
      this.writeBytes(var2, 0, var2.length);
      this.writeInt((int)var3);
      if(logger.isLoggable(Level.FINER)) {
         logger.finer("Send Trace Header - ActivityID: " + var1.toString());
      }

   }

   void startMessage(TDSCommand var1, byte var2) throws SQLServerException {
      this.command = var1;
      this.tdsMessageType = var2;
      this.packetNum = 0;
      this.isEOMSent = false;
      this.dataIsLoggable = true;
      int var3 = this.con.getTDSPacketSize();
      if(this.currentPacketSize != var3) {
         this.socketBuffer = ByteBuffer.allocate(var3).order(ByteOrder.LITTLE_ENDIAN);
         this.stagingBuffer = ByteBuffer.allocate(var3).order(ByteOrder.LITTLE_ENDIAN);
         this.logBuffer = ByteBuffer.allocate(var3).order(ByteOrder.LITTLE_ENDIAN);
         this.currentPacketSize = var3;
      }

      this.socketBuffer.position(this.socketBuffer.limit());
      this.stagingBuffer.clear();
      this.preparePacket();
      this.writeMessageHeader();
   }

   final void endMessage() throws SQLServerException {
      if(logger.isLoggable(Level.FINEST)) {
         logger.finest(this.toString() + " Finishing TDS message");
      }

      this.writePacket(1);
   }

   final boolean ignoreMessage() throws SQLServerException {
      if(this.packetNum > 0) {
         assert !this.isEOMSent;

         if(logger.isLoggable(Level.FINER)) {
            logger.finest(this.toString() + " Finishing TDS message by sending ignore bit and end of message");
         }

         this.writePacket(3);
         return true;
      } else {
         return false;
      }
   }

   final void resetPooledConnection() {
      if(logger.isLoggable(Level.FINEST)) {
         logger.finest(this.toString() + " resetPooledConnection");
      }

      this.sendResetConnection = 8;
   }

   void writeByte(byte var1) throws SQLServerException {
      if(this.stagingBuffer.remaining() >= 1) {
         this.stagingBuffer.put(var1);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.put(var1);
            } else {
               this.logBuffer.position(this.logBuffer.position() + 1);
            }
         }
      } else {
         this.valueBytes[0] = var1;
         this.writeWrappedBytes(this.valueBytes, 1);
      }

   }

   void writeChar(char var1) throws SQLServerException {
      if(this.stagingBuffer.remaining() >= 2) {
         this.stagingBuffer.putChar(var1);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.putChar(var1);
            } else {
               this.logBuffer.position(this.logBuffer.position() + 2);
            }
         }
      } else {
         Util.writeShort((short)var1, this.valueBytes, 0);
         this.writeWrappedBytes(this.valueBytes, 2);
      }

   }

   void writeShort(short var1) throws SQLServerException {
      if(this.stagingBuffer.remaining() >= 2) {
         this.stagingBuffer.putShort(var1);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.putShort(var1);
            } else {
               this.logBuffer.position(this.logBuffer.position() + 2);
            }
         }
      } else {
         Util.writeShort(var1, this.valueBytes, 0);
         this.writeWrappedBytes(this.valueBytes, 2);
      }

   }

   void writeInt(int var1) throws SQLServerException {
      if(this.stagingBuffer.remaining() >= 4) {
         this.stagingBuffer.putInt(var1);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.putInt(var1);
            } else {
               this.logBuffer.position(this.logBuffer.position() + 4);
            }
         }
      } else {
         Util.writeInt(var1, this.valueBytes, 0);
         this.writeWrappedBytes(this.valueBytes, 4);
      }

   }

   void writeReal(Float var1) throws SQLServerException {
      this.writeInt(Float.floatToRawIntBits(var1.floatValue()));
   }

   void writeDouble(double var1) throws SQLServerException {
      if(this.stagingBuffer.remaining() >= 8) {
         this.stagingBuffer.putDouble(var1);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.putDouble(var1);
            } else {
               this.logBuffer.position(this.logBuffer.position() + 8);
            }
         }
      } else {
         long var3 = Double.doubleToLongBits(var1);
         long var5 = 255L;
         int var7 = 0;

         for(int var8 = 0; var8 < 8; ++var8) {
            this.writeByte((byte)((int)((var3 & var5) >> var7)));
            var7 += 8;
            var5 <<= 8;
         }
      }

   }

   void writeBigDecimal(BigDecimal var1, int var2, int var3) throws SQLServerException {
      boolean var4 = var1.signum() < 0;
      BigInteger var5 = var1.unscaledValue();
      if(var4) {
         var5 = var5.negate();
      }

      if(9 >= var3) {
         this.writeByte((byte)5);
         this.writeByte((byte)(var4?0:1));
         this.writeInt(var5.intValue());
      } else if(19 >= var3) {
         this.writeByte((byte)9);
         this.writeByte((byte)(var4?0:1));
         this.writeLong(var5.longValue());
      } else {
         byte var6;
         if(28 >= var3) {
            var6 = 12;
         } else {
            var6 = 16;
         }

         this.writeByte((byte)(var6 + 1));
         this.writeByte((byte)(var4?0:1));
         byte[] var7 = var5.toByteArray();
         if(var7.length > var6) {
            MessageFormat var12 = new MessageFormat(SQLServerException.getErrString("R_valueOutOfRange"));
            Object[] var13 = new Object[]{JDBCType.of(var2)};
            throw new SQLServerException(var12.format(var13), SQLState.DATA_EXCEPTION_LENGTH_MISMATCH, DriverError.NOT_SET, (Throwable)null);
         }

         byte[] var8 = new byte[var6];
         int var9 = var6 - var7.length;
         int var10 = 0;

         for(int var11 = var7.length - 1; var10 < var7.length; var8[var10++] = var7[var11--]) {
            ;
         }

         while(var10 < var9) {
            var8[var10] = 0;
            ++var10;
         }

         this.writeBytes(var8);
      }

   }

   void writeSmalldatetime(String var1) throws SQLServerException {
      GregorianCalendar var2 = this.initializeCalender(TimeZone.getDefault());
      long var3 = 0L;
      Timestamp var5 = Timestamp.valueOf(var1);
      var3 = var5.getTime();
      var2.setTimeInMillis(var3);
      int var6 = DDC.daysSinceBaseDate(var2.get(1), var2.get(6), 1900);
      int var7 = 1000 * var2.get(13) + '\uea60' * var2.get(12) + 3600000 * var2.get(11);
      if(86399999 <= var7) {
         ++var6;
         var7 = 0;
      }

      this.writeShort((short)var6);
      int var8 = var7 / 1000;
      int var9 = var8 / 60;
      var9 = (double)(var8 % 60) > 29.998D?var9 + 1:var9;
      this.writeShort((short)var9);
   }

   void writeDatetime(String var1) throws SQLServerException {
      GregorianCalendar var2 = this.initializeCalender(TimeZone.getDefault());
      long var3 = 0L;
      boolean var5 = false;
      Timestamp var6 = Timestamp.valueOf(var1);
      var3 = var6.getTime();
      int var11 = var6.getNanos();
      var2.setTimeInMillis(var3);
      int var7 = DDC.daysSinceBaseDate(var2.get(1), var2.get(6), 1900);
      int var8 = (var11 + 500000) / 1000000 + 1000 * var2.get(13) + '\uea60' * var2.get(12) + 3600000 * var2.get(11);
      if(86399999 <= var8) {
         ++var7;
         var8 = 0;
      }

      if(var7 >= DDC.daysSinceBaseDate(1753, 1, 1900) && var7 < DDC.daysSinceBaseDate(10000, 1, 1900)) {
         this.writeInt(var7);
         this.writeInt((3 * var8 + 5) / 10);
      } else {
         MessageFormat var9 = new MessageFormat(SQLServerException.getErrString("R_valueOutOfRange"));
         Object[] var10 = new Object[]{SSType.DATETIME};
         throw new SQLServerException(var9.format(var10), SQLState.DATA_EXCEPTION_DATETIME_FIELD_OVERFLOW, DriverError.NOT_SET, (Throwable)null);
      }
   }

   void writeDate(String var1) throws SQLServerException {
      GregorianCalendar var2 = this.initializeCalender(TimeZone.getDefault());
      long var3 = 0L;
      Date var5 = Date.valueOf(var1);
      var3 = var5.getTime();
      var2.setTimeInMillis(var3);
      this.writeScaledTemporal(var2, 0, 0, SSType.DATE);
   }

   void writeTime(Timestamp var1, int var2) throws SQLServerException {
      GregorianCalendar var3 = this.initializeCalender(TimeZone.getDefault());
      long var4 = 0L;
      boolean var6 = false;
      var4 = var1.getTime();
      int var7 = var1.getNanos();
      var3.setTimeInMillis(var4);
      this.writeScaledTemporal(var3, var7, var2, SSType.TIME);
   }

   void writeDateTimeOffset(Object var1, int var2, SSType var3) throws SQLServerException {
      GregorianCalendar var4 = null;
      TimeZone var5 = TimeZone.getDefault();
      long var6 = 0L;
      boolean var8 = false;
      boolean var9 = false;
      DateTimeOffset var10 = (DateTimeOffset)var1;
      var6 = var10.getTimestamp().getTime();
      int var12 = var10.getTimestamp().getNanos();
      int var13 = var10.getMinutesOffset();
      Object var11 = SSType.DATETIMEOFFSET == var3?UTC.timeZone:new SimpleTimeZone(var13 * 60 * 1000, "");
      var4 = new GregorianCalendar((TimeZone)var11, Locale.US);
      var4.setLenient(true);
      var4.clear();
      var4.setTimeInMillis(var6);
      this.writeScaledTemporal(var4, var12, var2, SSType.DATETIMEOFFSET);
      this.writeShort((short)var13);
   }

   void writeOffsetDateTimeWithTimezone(OffsetDateTime var1, int var2) throws SQLServerException {
      GregorianCalendar var3 = null;
      TimeZone var4 = TimeZone.getDefault();
      long var5 = 0L;
      boolean var7 = false;
      boolean var8 = false;

      int var12;
      try {
         var12 = var1.getOffset().getTotalSeconds() / 60;
      } catch (Exception var10) {
         throw new SQLServerException(SQLServerException.getErrString("R_zoneOffsetError"), (String)null, 0, (Throwable)null);
      }

      int var11 = var1.getNano();
      var4 = UTC.timeZone;
      String var9 = String.format("%04d", new Object[]{Integer.valueOf(var1.getYear())}) + '-' + var1.getMonthValue() + '-' + var1.getDayOfMonth() + ' ' + var1.getHour() + ':' + var1.getMinute() + ':' + var1.getSecond();
      var5 = Timestamp.valueOf(var9).getTime();
      var3 = this.initializeCalender(var4);
      var3.setTimeInMillis(var5);
      this.writeScaledTemporal(var3, var11, var2, SSType.DATETIMEOFFSET);
      this.writeShort((short)var12);
   }

   void writeOffsetTimeWithTimezone(OffsetTime var1, int var2) throws SQLServerException {
      GregorianCalendar var3 = null;
      TimeZone var4 = TimeZone.getDefault();
      long var5 = 0L;
      boolean var7 = false;
      boolean var8 = false;

      int var12;
      try {
         var12 = var1.getOffset().getTotalSeconds() / 60;
      } catch (Exception var10) {
         throw new SQLServerException(SQLServerException.getErrString("R_zoneOffsetError"), (String)null, 0, (Throwable)null);
      }

      int var11 = var1.getNano();
      var4 = UTC.timeZone;
      String var9 = "1970-01-01 " + var1.getHour() + ':' + var1.getMinute() + ':' + var1.getSecond();
      var5 = Timestamp.valueOf(var9).getTime();
      var3 = this.initializeCalender(var4);
      var3.setTimeInMillis(var5);
      this.writeScaledTemporal(var3, var11, var2, SSType.DATETIMEOFFSET);
      this.writeShort((short)var12);
   }

   void writeLong(long var1) throws SQLServerException {
      if(this.stagingBuffer.remaining() >= 8) {
         this.stagingBuffer.putLong(var1);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.putLong(var1);
            } else {
               this.logBuffer.position(this.logBuffer.position() + 8);
            }
         }
      } else {
         this.valueBytes[0] = (byte)((int)(var1 >> 0 & 255L));
         this.valueBytes[1] = (byte)((int)(var1 >> 8 & 255L));
         this.valueBytes[2] = (byte)((int)(var1 >> 16 & 255L));
         this.valueBytes[3] = (byte)((int)(var1 >> 24 & 255L));
         this.valueBytes[4] = (byte)((int)(var1 >> 32 & 255L));
         this.valueBytes[5] = (byte)((int)(var1 >> 40 & 255L));
         this.valueBytes[6] = (byte)((int)(var1 >> 48 & 255L));
         this.valueBytes[7] = (byte)((int)(var1 >> 56 & 255L));
         this.writeWrappedBytes(this.valueBytes, 8);
      }

   }

   void writeBytes(byte[] var1) throws SQLServerException {
      this.writeBytes(var1, 0, var1.length);
   }

   void writeBytes(byte[] var1, int var2, int var3) throws SQLServerException {
      assert var3 <= var1.length;

      int var4 = 0;
      if(logger.isLoggable(Level.FINEST)) {
         logger.finest(this.toString() + " Writing " + var3 + " bytes");
      }

      int var5;
      for(; (var5 = var3 - var4) > 0; var4 += var5) {
         if(0 == this.stagingBuffer.remaining()) {
            this.writePacket(0);
         }

         if(var5 > this.stagingBuffer.remaining()) {
            var5 = this.stagingBuffer.remaining();
         }

         this.stagingBuffer.put(var1, var2 + var4, var5);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.put(var1, var2 + var4, var5);
            } else {
               this.logBuffer.position(this.logBuffer.position() + var5);
            }
         }
      }

   }

   void writeWrappedBytes(byte[] var1, int var2) throws SQLServerException {
      assert var2 <= var1.length;

      assert this.stagingBuffer.remaining() < var2;

      assert var2 <= this.stagingBuffer.capacity();

      int var3 = this.stagingBuffer.remaining();
      if(var3 > 0) {
         this.stagingBuffer.put(var1, 0, var3);
         if(this.tdsChannel.isLoggingPackets()) {
            if(this.dataIsLoggable) {
               this.logBuffer.put(var1, 0, var3);
            } else {
               this.logBuffer.position(this.logBuffer.position() + var3);
            }
         }
      }

      this.writePacket(0);
      this.stagingBuffer.put(var1, var3, var2 - var3);
      if(this.tdsChannel.isLoggingPackets()) {
         if(this.dataIsLoggable) {
            this.logBuffer.put(var1, var3, var2 - var3);
         } else {
            this.logBuffer.position(this.logBuffer.position() + var3);
         }
      }

   }

   void writeString(String var1) throws SQLServerException {
      int var2 = 0;
      int var3 = var1.length();

      while(var2 < var3) {
         int var4 = 2 * (var3 - var2);
         if(var4 > this.valueBytes.length) {
            var4 = this.valueBytes.length;
         }

         int var5;
         char var6;
         for(var5 = 0; var5 < var4; this.valueBytes[var5++] = (byte)(var6 >> 8 & 255)) {
            var6 = var1.charAt(var2++);
            this.valueBytes[var5++] = (byte)(var6 >> 0 & 255);
         }

         this.writeBytes(this.valueBytes, 0, var5);
      }

   }

   void writeStream(InputStream var1, long var2, boolean var4) throws SQLServerException {
      assert -1L == var2 || var2 >= 0L;

      long var5 = 0L;
      byte[] var7 = new byte[4 * this.currentPacketSize];
      int var8 = 0;

      while(true) {
         int var9 = 0;

         while(true) {
            MessageFormat var10;
            Object[] var14;
            if(-1 != var8 && var9 < var7.length) {
               try {
                  var8 = var1.read(var7, var9, var7.length - var9);
               } catch (IOException var13) {
                  MessageFormat var11 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                  Object[] var12 = new Object[]{var13.toString()};
                  this.error(var11.format(var12), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET);
               }

               if(-1 != var8) {
                  if(var8 < 0 || var8 > var7.length - var9) {
                     var10 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                     var14 = new Object[]{SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
                     this.error(var10.format(var14), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET);
                  }

                  var9 += var8;
                  continue;
               }
            }

            if(var4) {
               this.writeInt(var9);
            }

            this.writeBytes(var7, 0, var9);
            var5 += (long)var9;
            if(-1 == var8 && var9 <= 0) {
               if(-1L != var2 && var5 != var2) {
                  var10 = new MessageFormat(SQLServerException.getErrString("R_mismatchedStreamLength"));
                  var14 = new Object[]{Long.valueOf(var2), Long.valueOf(var5)};
                  this.error(var10.format(var14), SQLState.DATA_EXCEPTION_LENGTH_MISMATCH, DriverError.NOT_SET);
               }

               return;
            }
            break;
         }
      }
   }

   void writeNonUnicodeReader(Reader var1, long var2, boolean var4, String var5) throws SQLServerException {
      assert -1L == var2 || var2 >= 0L;

      long var6 = 0L;
      char[] var8 = new char[this.currentPacketSize];
      byte[] var9 = new byte[this.currentPacketSize];
      int var10 = 0;

      while(true) {
         int var11 = 0;

         while(true) {
            MessageFormat var20;
            Object[] var21;
            if(-1 != var10 && var11 < var8.length) {
               try {
                  var10 = var1.read(var8, var11, var8.length - var11);
               } catch (IOException var17) {
                  MessageFormat var15 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                  Object[] var16 = new Object[]{var17.toString()};
                  this.error(var15.format(var16), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET);
               }

               if(-1 != var10) {
                  if(var10 < 0 || var10 > var8.length - var11) {
                     var20 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                     var21 = new Object[]{SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
                     this.error(var20.format(var21), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET);
                  }

                  var11 += var10;
                  continue;
               }
            }

            if(!var4) {
               this.writeInt(var11);

               for(int var14 = 0; var14 < var11; ++var14) {
                  try {
                     if(null == var5) {
                        var9[var14] = (byte)(var8[var14] & 255);
                     } else {
                        var9[var14] = (new String(var8[var14] + "")).getBytes(var5)[0];
                     }
                  } catch (UnsupportedEncodingException var18) {
                     throw new SQLServerException(SQLServerException.getErrString("R_encodingErrorWritingTDS"), var18);
                  }
               }

               this.writeBytes(var9, 0, var11);
            } else {
               int var12 = var11;
               if(0 != var11) {
                  var12 = var11 / 2;
               }

               String var13 = new String(var8);
               byte[] var19 = ParameterUtils.HexToBin(var13.trim());
               this.writeInt(var12);
               this.writeBytes(var19, 0, var12);
            }

            var6 += (long)var11;
            if(-1 == var10 && var11 <= 0) {
               if(-1L != var2 && var6 != var2) {
                  var20 = new MessageFormat(SQLServerException.getErrString("R_mismatchedStreamLength"));
                  var21 = new Object[]{Long.valueOf(var2), Long.valueOf(var6)};
                  this.error(var20.format(var21), SQLState.DATA_EXCEPTION_LENGTH_MISMATCH, DriverError.NOT_SET);
               }

               return;
            }
            break;
         }
      }
   }

   void writeReader(Reader var1, long var2, boolean var4) throws SQLServerException {
      assert -1L == var2 || var2 >= 0L;

      long var5 = 0L;
      char[] var7 = new char[2 * this.currentPacketSize];
      byte[] var8 = new byte[4 * this.currentPacketSize];
      int var9 = 0;

      while(true) {
         int var10 = 0;

         while(true) {
            MessageFormat var15;
            Object[] var16;
            if(-1 != var9 && var10 < var7.length) {
               try {
                  var9 = var1.read(var7, var10, var7.length - var10);
               } catch (IOException var14) {
                  MessageFormat var12 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                  Object[] var13 = new Object[]{var14.toString()};
                  this.error(var12.format(var13), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET);
               }

               if(-1 != var9) {
                  if(var9 < 0 || var9 > var7.length - var10) {
                     var15 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                     var16 = new Object[]{SQLServerException.getErrString("R_streamReadReturnedInvalidValue")};
                     this.error(var15.format(var16), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET);
                  }

                  var10 += var9;
                  continue;
               }
            }

            if(var4) {
               this.writeInt(2 * var10);
            }

            for(int var11 = 0; var11 < var10; ++var11) {
               var8[2 * var11] = (byte)(var7[var11] >> 0 & 255);
               var8[2 * var11 + 1] = (byte)(var7[var11] >> 8 & 255);
            }

            this.writeBytes(var8, 0, 2 * var10);
            var5 += (long)var10;
            if(-1 == var9 && var10 <= 0) {
               if(-1L != var2 && var5 != var2) {
                  var15 = new MessageFormat(SQLServerException.getErrString("R_mismatchedStreamLength"));
                  var16 = new Object[]{Long.valueOf(var2), Long.valueOf(var5)};
                  this.error(var15.format(var16), SQLState.DATA_EXCEPTION_LENGTH_MISMATCH, DriverError.NOT_SET);
               }

               return;
            }
            break;
         }
      }
   }

   GregorianCalendar initializeCalender(TimeZone var1) {
      GregorianCalendar var2 = null;
      var2 = new GregorianCalendar(var1, Locale.US);
      var2.setLenient(true);
      var2.clear();
      return var2;
   }

   final void error(String var1, SQLState var2, DriverError var3) throws SQLServerException {
      assert null != this.command;

      this.command.interrupt(var1);
      throw new SQLServerException(var1, var2, var3, (Throwable)null);
   }

   final boolean sendAttention() throws SQLServerException {
      if(this.packetNum > 0) {
         if(logger.isLoggable(Level.FINE)) {
            logger.fine(this + ": sending attention...");
         }

         ++this.tdsChannel.numMsgsSent;
         this.startMessage(this.command, (byte)6);
         this.endMessage();
         return true;
      } else {
         return false;
      }
   }

   private final void writePacket(int var1) throws SQLServerException {
      boolean var2 = 1 == (1 & var1);
      boolean var3 = 6 == this.tdsMessageType || (var1 & 2) == 2;
      if(null != this.command && !var3) {
         this.command.checkForInterrupt();
      }

      this.writePacketHeader(var1 | this.sendResetConnection);
      this.sendResetConnection = 0;
      this.flush(var2);
      if(var2) {
         this.flush(var2);
         this.isEOMSent = true;
         ++this.tdsChannel.numMsgsSent;
      }

      if(16 == this.tdsMessageType && 1 == this.packetNum && 0 == this.con.getNegotiatedEncryptionLevel()) {
         this.tdsChannel.disableSSL();
      }

      if(null != this.command && !var3 && var2) {
         this.command.onRequestComplete();
      }

   }

   private final void writePacketHeader(int var1) {
      int var2 = this.stagingBuffer.position();
      ++this.packetNum;
      this.stagingBuffer.put(0, this.tdsMessageType);
      this.stagingBuffer.put(1, (byte)var1);
      this.stagingBuffer.put(2, (byte)(var2 >> 8 & 255));
      this.stagingBuffer.put(3, (byte)(var2 >> 0 & 255));
      this.stagingBuffer.put(4, (byte)(this.tdsChannel.getSPID() >> 8 & 255));
      this.stagingBuffer.put(5, (byte)(this.tdsChannel.getSPID() >> 0 & 255));
      this.stagingBuffer.put(6, (byte)(this.packetNum % 256));
      this.stagingBuffer.put(7, (byte)0);
      if(this.tdsChannel.isLoggingPackets()) {
         this.logBuffer.put(0, this.tdsMessageType);
         this.logBuffer.put(1, (byte)var1);
         this.logBuffer.put(2, (byte)(var2 >> 8 & 255));
         this.logBuffer.put(3, (byte)(var2 >> 0 & 255));
         this.logBuffer.put(4, (byte)(this.tdsChannel.getSPID() >> 8 & 255));
         this.logBuffer.put(5, (byte)(this.tdsChannel.getSPID() >> 0 & 255));
         this.logBuffer.put(6, (byte)(this.packetNum % 256));
         this.logBuffer.put(7, (byte)0);
      }

   }

   void flush(boolean var1) throws SQLServerException {
      this.tdsChannel.write(this.socketBuffer.array(), this.socketBuffer.position(), this.socketBuffer.remaining());
      this.socketBuffer.position(this.socketBuffer.limit());
      if(this.stagingBuffer.position() >= 8) {
         ByteBuffer var2 = this.stagingBuffer;
         this.stagingBuffer = this.socketBuffer;
         this.socketBuffer = var2;
         this.socketBuffer.flip();
         this.stagingBuffer.clear();
         if(this.tdsChannel.isLoggingPackets()) {
            this.tdsChannel.logPacket(this.logBuffer.array(), 0, this.socketBuffer.limit(), this.toString() + " sending packet (" + this.socketBuffer.limit() + " bytes)");
         }

         if(!var1) {
            this.preparePacket();
         }

         this.tdsChannel.write(this.socketBuffer.array(), this.socketBuffer.position(), this.socketBuffer.remaining());
         this.socketBuffer.position(this.socketBuffer.limit());
      }

   }

   private void writeRPCNameValType(String var1, boolean var2, TDSType var3) throws SQLServerException {
      int var4 = 0;
      if(null != var1) {
         var4 = var1.length() + 1;
      }

      this.writeByte((byte)var4);
      if(var4 > 0) {
         this.writeChar('@');
         this.writeString(var1);
      }

      this.writeByte((byte)(var2?1:0));
      this.writeByte(var3.byteValue());
   }

   void writeRPCBit(String var1, Boolean var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.BITN);
      this.writeByte((byte)1);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)1);
         this.writeByte((byte)(var2.booleanValue()?1:0));
      }

   }

   void writeRPCByte(String var1, Byte var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.INTN);
      this.writeByte((byte)1);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)1);
         this.writeByte(var2.byteValue());
      }

   }

   void writeRPCShort(String var1, Short var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.INTN);
      this.writeByte((byte)2);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)2);
         this.writeShort(var2.shortValue());
      }

   }

   void writeRPCInt(String var1, Integer var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.INTN);
      this.writeByte((byte)4);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)4);
         this.writeInt(var2.intValue());
      }

   }

   void writeRPCLong(String var1, Long var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.INTN);
      this.writeByte((byte)8);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)8);
         this.writeLong(var2.longValue());
      }

   }

   void writeRPCReal(String var1, Float var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.FLOATN);
      if(null == var2) {
         this.writeByte((byte)4);
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)4);
         this.writeByte((byte)4);
         this.writeInt(Float.floatToRawIntBits(var2.floatValue()));
      }

   }

   void writeRPCDouble(String var1, Double var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.FLOATN);
      byte var4 = 8;
      this.writeByte((byte)var4);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)var4);
         long var5 = Double.doubleToLongBits(var2.doubleValue());
         long var7 = 255L;
         int var9 = 0;

         for(int var10 = 0; var10 < 8; ++var10) {
            this.writeByte((byte)((int)((var5 & var7) >> var9)));
            var9 += 8;
            var7 <<= 8;
         }
      }

   }

   void writeRPCBigDecimal(String var1, BigDecimal var2, int var3, boolean var4) throws SQLServerException {
      this.writeRPCNameValType(var1, var4, TDSType.DECIMALN);
      this.writeByte((byte)17);
      this.writeByte((byte)38);
      byte[] var5 = DDC.convertBigDecimalToBytes(var2, var3);
      this.writeBytes(var5, 0, var5.length);
   }

   void writeVMaxHeader(long var1, boolean var3, SQLCollation var4) throws SQLServerException {
      this.writeShort((short)-1);
      if(null != var4) {
         var4.writeCollation(this);
      }

      if(var3) {
         this.writeLong(-1L);
      } else if(-1L == var1) {
         this.writeLong(-2L);
      } else {
         this.writeLong(var1);
      }

   }

   void writeRPCStringUnicode(String var1) throws SQLServerException {
      this.writeRPCStringUnicode((String)null, var1, false, (SQLCollation)null);
   }

   void writeRPCStringUnicode(String var1, String var2, boolean var3, SQLCollation var4) throws SQLServerException {
      boolean var5 = var2 == null;
      int var6 = var5?0:2 * var2.length();
      boolean var7 = var6 <= 8000;
      if(null == var4) {
         var4 = this.con.getDatabaseCollation();
      }

      boolean var8 = !var7 || var3;
      if(var8) {
         this.writeRPCNameValType(var1, var3, TDSType.NVARCHAR);
         this.writeVMaxHeader((long)var6, var5, var4);
         if(!var5) {
            if(var6 > 0) {
               this.writeInt(var6);
               this.writeString(var2);
            }

            this.writeInt(0);
         }
      } else {
         if(var7) {
            this.writeRPCNameValType(var1, var3, TDSType.NVARCHAR);
            this.writeShort((short)8000);
         } else {
            this.writeRPCNameValType(var1, var3, TDSType.NTEXT);
            this.writeInt(Integer.MAX_VALUE);
         }

         var4.writeCollation(this);
         if(var5) {
            this.writeShort((short)-1);
         } else {
            if(var7) {
               this.writeShort((short)var6);
            } else {
               this.writeInt(var6);
            }

            if(0 != var6) {
               this.writeString(var2);
            }
         }
      }

   }

   void writeRPCByteArray(String var1, byte[] var2, boolean var3, JDBCType var4, SQLCollation var5) throws SQLServerException {
      boolean var6 = var2 == null;
      int var7 = var6?0:var2.length;
      boolean var8 = var7 <= 8000;
      boolean var9 = !var8 || var3;
      TDSType var10;
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var4.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      default:
         var10 = !var8 && !var9?TDSType.IMAGE:TDSType.BIGVARBINARY;
         var5 = null;
         break;
      case 5:
      case 6:
      case 7:
      case 8:
         var10 = !var8 && !var9?TDSType.TEXT:TDSType.BIGVARCHAR;
         if(null == var5) {
            var5 = this.con.getDatabaseCollation();
         }
         break;
      case 9:
      case 10:
      case 11:
      case 12:
         var10 = !var8 && !var9?TDSType.NTEXT:TDSType.NVARCHAR;
         if(null == var5) {
            var5 = this.con.getDatabaseCollation();
         }
      }

      this.writeRPCNameValType(var1, var3, var10);
      if(var9) {
         this.writeVMaxHeader((long)var7, var6, var5);
         if(!var6) {
            if(var7 > 0) {
               this.writeInt(var7);
               this.writeBytes(var2);
            }

            this.writeInt(0);
         }
      } else {
         if(var8) {
            this.writeShort((short)8000);
         } else {
            this.writeInt(Integer.MAX_VALUE);
         }

         if(null != var5) {
            var5.writeCollation(this);
         }

         if(var6) {
            this.writeShort((short)-1);
         } else {
            if(var8) {
               this.writeShort((short)var7);
            } else {
               this.writeInt(var7);
            }

            if(0 != var7) {
               this.writeBytes(var2);
            }
         }
      }

   }

   void writeRPCDateTime(String var1, GregorianCalendar var2, int var3, boolean var4) throws SQLServerException {
      assert var3 >= 0 && var3 < 1000000000 : "Invalid subNanoSeconds value: " + var3;

      assert var2 != null || var2 == null && var3 == 0 : "Invalid subNanoSeconds value when calendar is null: " + var3;

      this.writeRPCNameValType(var1, var4, TDSType.DATETIMEN);
      this.writeByte((byte)8);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)8);
         int var5 = DDC.daysSinceBaseDate(var2.get(1), var2.get(6), 1900);
         int var6 = (var3 + 500000) / 1000000 + 1000 * var2.get(13) + '\uea60' * var2.get(12) + 3600000 * var2.get(11);
         if(var6 >= 86399999) {
            ++var5;
            var6 = 0;
         }

         if(var5 >= DDC.daysSinceBaseDate(1753, 1, 1900) && var5 < DDC.daysSinceBaseDate(10000, 1, 1900)) {
            this.writeInt(var5);
            this.writeInt((3 * var6 + 5) / 10);
         } else {
            MessageFormat var7 = new MessageFormat(SQLServerException.getErrString("R_valueOutOfRange"));
            Object[] var8 = new Object[]{SSType.DATETIME};
            throw new SQLServerException(var7.format(var8), SQLState.DATA_EXCEPTION_DATETIME_FIELD_OVERFLOW, DriverError.NOT_SET, (Throwable)null);
         }
      }
   }

   void writeRPCTime(String var1, GregorianCalendar var2, int var3, int var4, boolean var5) throws SQLServerException {
      this.writeRPCNameValType(var1, var5, TDSType.TIMEN);
      this.writeByte((byte)var4);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)TDS.timeValueLength(var4));
         this.writeScaledTemporal(var2, var3, var4, SSType.TIME);
      }
   }

   void writeRPCDate(String var1, GregorianCalendar var2, boolean var3) throws SQLServerException {
      this.writeRPCNameValType(var1, var3, TDSType.DATEN);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)3);
         this.writeScaledTemporal(var2, 0, 0, SSType.DATE);
      }
   }

   void writeRPCDateTime2(String var1, GregorianCalendar var2, int var3, int var4, boolean var5) throws SQLServerException {
      this.writeRPCNameValType(var1, var5, TDSType.DATETIME2N);
      this.writeByte((byte)var4);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         this.writeByte((byte)TDS.datetime2ValueLength(var4));
         this.writeScaledTemporal(var2, var3, var4, SSType.DATETIME2);
      }
   }

   void writeRPCDateTimeOffset(String var1, GregorianCalendar var2, int var3, int var4, int var5, boolean var6) throws SQLServerException {
      this.writeRPCNameValType(var1, var6, TDSType.DATETIMEOFFSETN);
      this.writeByte((byte)var5);
      if(null == var2) {
         this.writeByte((byte)0);
      } else {
         assert 0 == var2.get(15);

         this.writeByte((byte)TDS.datetimeoffsetValueLength(var5));
         this.writeScaledTemporal(var2, var4, var5, SSType.DATETIMEOFFSET);
         this.writeShort((short)var3);
      }
   }

   private int getRoundedSubSecondNanos(int var1) {
      int var2 = (var1 + Nanos.PER_MAX_SCALE_INTERVAL / 2) / Nanos.PER_MAX_SCALE_INTERVAL * Nanos.PER_MAX_SCALE_INTERVAL;
      return var2;
   }

   private void writeScaledTemporal(GregorianCalendar var1, int var2, int var3, SSType var4) throws SQLServerException {
      assert this.con.isKatmaiOrLater();

      assert SSType.DATE == var4 || SSType.TIME == var4 || SSType.DATETIME2 == var4 || SSType.DATETIMEOFFSET == var4 : "Unexpected SSType: " + var4;

      int var5;
      if(SSType.TIME == var4 || SSType.DATETIME2 == var4 || SSType.DATETIMEOFFSET == var4) {
         assert var2 >= 0;

         assert var2 < 1000000000;

         assert var3 >= 0;

         assert var3 <= 7;

         var5 = var1.get(13) + 60 * var1.get(12) + 3600 * var1.get(11);
         long var6 = (long)Nanos.PER_MAX_SCALE_INTERVAL * (long)Math.pow(10.0D, (double)(7 - var3));
         long var8 = (1000000000L * (long)var5 + (long)this.getRoundedSubSecondNanos(var2) + var6 / 2L) / var6;
         if(86400000000000L / var6 == var8) {
            if(SSType.TIME == var4) {
               --var8;
            } else {
               assert SSType.DATETIME2 == var4 || SSType.DATETIMEOFFSET == var4 : "Unexpected SSType: " + var4;

               var1.add(13, 1);
               if(var1.get(1) <= 9999) {
                  var8 = 0L;
               } else {
                  var1.add(13, -1);
                  --var8;
               }
            }
         }

         int var10 = TDS.nanosSinceMidnightLength(var3);
         byte[] var11 = new byte[var10];

         for(int var12 = 0; var12 < var10; ++var12) {
            var11[var12] = (byte)((int)(var8 >> 8 * var12 & 255L));
         }

         this.writeBytes(var11);
      }

      if(SSType.DATE == var4 || SSType.DATETIME2 == var4 || SSType.DATETIMEOFFSET == var4) {
         if(var1.getTimeInMillis() < GregorianChange.STANDARD_CHANGE_DATE.getTime() || var1.getActualMaximum(6) < 365) {
            var5 = var1.get(1);
            int var13 = var1.get(2);
            int var7 = var1.get(5);
            var1.setGregorianChange(GregorianChange.PURE_CHANGE_DATE);
            var1.set(var5, var13, var7);
         }

         var5 = DDC.daysSinceBaseDate(var1.get(1), var1.get(6), 1);
         if(var5 < 0 || var5 >= DDC.daysSinceBaseDate(10000, 1, 1)) {
            MessageFormat var15 = new MessageFormat(SQLServerException.getErrString("R_valueOutOfRange"));
            Object[] var16 = new Object[]{var4};
            throw new SQLServerException(var15.format(var16), SQLState.DATA_EXCEPTION_DATETIME_FIELD_OVERFLOW, DriverError.NOT_SET, (Throwable)null);
         }

         byte[] var14 = new byte[]{(byte)(var5 >> 0 & 255), (byte)(var5 >> 8 & 255), (byte)(var5 >> 16 & 255)};
         this.writeBytes(var14);
      }

   }

   void writeRPCInputStream(String var1, InputStream var2, long var3, boolean var5, JDBCType var6, SQLCollation var7) throws SQLServerException {
      assert null != var2;

      assert -1L == var3 || var3 >= 0L;

      boolean var8 = -1L == var3 || var3 > 8000L;
      if(var8) {
         assert -1L == var3 || var3 <= 2147483647L;

         this.writeRPCNameValType(var1, var5, var6.isTextual()?TDSType.BIGVARCHAR:TDSType.BIGVARBINARY);
         this.writeVMaxHeader(var3, false, var6.isTextual()?var7:null);
      } else {
         if(-1L == var3) {
            ByteArrayOutputStream var9 = new ByteArrayOutputStream(8000);
            var3 = 0L;
            long var10 = 65535L * (long)this.con.getTDSPacketSize();

            int var13;
            try {
               for(byte[] var12 = new byte[8000]; var3 < var10 && -1 != (var13 = ((InputStream)var2).read(var12, 0, var12.length)); var3 += (long)var13) {
                  var9.write(var12);
               }
            } catch (IOException var14) {
               throw new SQLServerException(var14.getMessage(), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET, var14);
            }

            if(var3 >= var10) {
               MessageFormat var16 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
               Object[] var17 = new Object[]{Long.valueOf(var3)};
               SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var16.format(var17), "", true);
            }

            assert var3 <= 2147483647L;

            var2 = new ByteArrayInputStream(var9.toByteArray(), 0, (int)var3);
         }

         assert 0L <= var3 && var3 <= 2147483647L;

         boolean var15 = var3 <= 8000L;
         this.writeRPCNameValType(var1, var5, var6.isTextual()?(var15?TDSType.BIGVARCHAR:TDSType.TEXT):(var15?TDSType.BIGVARBINARY:TDSType.IMAGE));
         if(var15) {
            this.writeShort((short)8000);
            if(var6.isTextual()) {
               var7.writeCollation(this);
            }

            this.writeShort((short)((int)var3));
         } else {
            this.writeInt(Integer.MAX_VALUE);
            if(var6.isTextual()) {
               var7.writeCollation(this);
            }

            this.writeInt((int)var3);
         }
      }

      this.writeStream((InputStream)var2, var3, var8);
   }

   void writeRPCXML(String var1, InputStream var2, long var3, boolean var5) throws SQLServerException {
      assert -1L == var3 || var3 >= 0L;

      assert -1L == var3 || var3 <= 2147483647L;

      this.writeRPCNameValType(var1, var5, TDSType.XML);
      this.writeByte((byte)0);
      if(null == var2) {
         this.writeLong(-1L);
      } else if(-1L == var3) {
         this.writeLong(-2L);
      } else {
         this.writeLong(var3);
      }

      if(null != var2) {
         this.writeStream(var2, var3, true);
      }

   }

   void writeRPCReaderUnicode(String var1, Reader var2, long var3, boolean var5, SQLCollation var6) throws SQLServerException {
      assert null != var2;

      assert -1L == var3 || var3 >= 0L;

      if(null == var6) {
         var6 = this.con.getDatabaseCollation();
      }

      boolean var7 = -1L == var3 || var3 > 4000L;
      if(var7) {
         assert -1L == var3 || var3 <= 1073741823L;

         this.writeRPCNameValType(var1, var5, TDSType.NVARCHAR);
         this.writeVMaxHeader(-1L == var3?-1L:2L * var3, false, var6);
      } else {
         assert 0L <= var3 && var3 <= 1073741823L;

         boolean var8 = var3 <= 4000L;
         this.writeRPCNameValType(var1, var5, var8?TDSType.NVARCHAR:TDSType.NTEXT);
         if(var8) {
            this.writeShort((short)8000);
            var6.writeCollation(this);
            this.writeShort((short)((int)(2L * var3)));
         } else {
            this.writeInt(1073741823);
            var6.writeCollation(this);
            this.writeInt((int)(2L * var3));
         }
      }

      this.writeReader(var2, var3, var7);
   }

}
