package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.BaseInputStream;
import com.microsoft.sqlserver.jdbc.InputStreamGetterArgs;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.ServerDTVImpl;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSReaderMark;
import java.io.IOException;

class PLPInputStream extends BaseInputStream {

   static final long PLP_NULL = -1L;
   static final long UNKNOWN_PLP_LEN = -2L;
   static final int PLP_TERMINATOR = 0;
   private static final byte[] EMPTY_PLP_BYTES = new byte[0];
   int payloadLength;
   private static final int PLP_EOS = -1;
   private int currentChunkRemain;
   private int markedChunkRemain;
   private int leftOverReadLimit = 0;
   private byte[] oneByteArray = new byte[1];


   static final boolean isNull(TDSReader var0) throws SQLServerException {
      TDSReaderMark var1 = var0.mark();

      boolean var2;
      try {
         var2 = null == makeTempStream(var0, false, (ServerDTVImpl)null);
      } finally {
         var0.reset(var1);
      }

      return var2;
   }

   static final PLPInputStream makeTempStream(TDSReader var0, boolean var1, ServerDTVImpl var2) throws SQLServerException {
      return makeStream(var0, var1, var1, var2);
   }

   static final PLPInputStream makeStream(TDSReader var0, InputStreamGetterArgs var1, ServerDTVImpl var2) throws SQLServerException {
      PLPInputStream var3 = makeStream(var0, var1.isAdaptive, var1.isStreaming, var2);
      if(null != var3) {
         var3.setLoggingInfo(var1.logContext);
      }

      return var3;
   }

   private static final PLPInputStream makeStream(TDSReader var0, boolean var1, boolean var2, ServerDTVImpl var3) throws SQLServerException {
      long var4 = var0.readLong();
      return -1L == var4?null:new PLPInputStream(var0, var4, var1, var2, var3);
   }

   PLPInputStream(TDSReader var1, long var2, boolean var4, boolean var5, ServerDTVImpl var6) throws SQLServerException {
      super(var1, var4, var5, var6);
      this.payloadLength = -2L != var2?(int)var2:-1;
      this.currentChunkRemain = this.markedChunkRemain = 0;
   }

   byte[] getBytes() throws SQLServerException {
      this.readBytesInternal((byte[])null, 0, 0);
      byte[] var1;
      if(-1 == this.currentChunkRemain) {
         var1 = EMPTY_PLP_BYTES;
      } else {
         var1 = new byte[-1 != this.payloadLength?this.payloadLength:this.currentChunkRemain];

         for(int var2 = 0; -1 != this.currentChunkRemain; var2 += this.readBytesInternal(var1, var2, this.currentChunkRemain)) {
            if(var1.length == var2) {
               byte[] var3 = new byte[var2 + this.currentChunkRemain];
               System.arraycopy(var1, 0, var3, 0, var2);
               var1 = var3;
            }
         }
      }

      try {
         this.close();
      } catch (IOException var4) {
         SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var4.getMessage(), (String)null, true);
      }

      return var1;
   }

   public long skip(long var1) throws IOException {
      this.checkClosed();
      if(var1 < 0L) {
         return 0L;
      } else {
         if(var1 > 2147483647L) {
            var1 = 2147483647L;
         }

         long var3 = (long)this.readBytes((byte[])null, 0, (int)var1);
         return -1L == var3?0L:var3;
      }
   }

   public int available() throws IOException {
      this.checkClosed();

      try {
         if(0 == this.currentChunkRemain) {
            this.readBytesInternal((byte[])null, 0, 0);
         }

         if(-1 == this.currentChunkRemain) {
            return 0;
         } else {
            int var1 = this.tdsReader.available();
            if(var1 > this.currentChunkRemain) {
               var1 = this.currentChunkRemain;
            }

            return var1;
         }
      } catch (SQLServerException var2) {
         throw new IOException(var2.getMessage());
      }
   }

   public int read() throws IOException {
      this.checkClosed();
      return -1 != this.readBytes(this.oneByteArray, 0, 1)?this.oneByteArray[0] & 255:-1;
   }

   public int read(byte[] var1) throws IOException {
      if(null == var1) {
         throw new NullPointerException();
      } else {
         this.checkClosed();
         return this.readBytes(var1, 0, var1.length);
      }
   }

   public int read(byte[] var1, int var2, int var3) throws IOException {
      if(null == var1) {
         throw new NullPointerException();
      } else if(var2 >= 0 && var3 >= 0 && var2 + var3 <= var1.length) {
         this.checkClosed();
         return this.readBytes(var1, var2, var3);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   int readBytes(byte[] var1, int var2, int var3) throws IOException {
      if(0 == var3) {
         return 0;
      } else {
         try {
            return this.readBytesInternal(var1, var2, var3);
         } catch (SQLServerException var5) {
            throw new IOException(var5.getMessage());
         }
      }
   }

   private int readBytesInternal(byte[] var1, int var2, int var3) throws SQLServerException {
      if(-1 == this.currentChunkRemain) {
         return -1;
      } else {
         int var4 = 0;

         while(true) {
            if(0 == this.currentChunkRemain) {
               this.currentChunkRemain = (int)this.tdsReader.readUnsignedInt();

               assert this.currentChunkRemain >= 0;

               if(0 == this.currentChunkRemain) {
                  this.currentChunkRemain = -1;
                  break;
               }
            }

            if(var4 == var3) {
               break;
            }

            int var5 = var3 - var4;
            if(var5 > this.currentChunkRemain) {
               var5 = this.currentChunkRemain;
            }

            if(null == var1) {
               this.tdsReader.skip(var5);
            } else {
               this.tdsReader.readBytes(var1, var2 + var4, var5);
            }

            var4 += var5;
            this.currentChunkRemain -= var5;
         }

         if(var4 > 0) {
            if(this.isReadLimitSet && this.leftOverReadLimit > 0) {
               this.leftOverReadLimit -= var4;
               if(this.leftOverReadLimit < 0) {
                  this.clearCurrentMark();
               }
            }

            return var4;
         } else {
            return -1 == this.currentChunkRemain?-1:0;
         }
      }
   }

   public void mark(int var1) {
      if(null != this.tdsReader && var1 > 0) {
         this.currentMark = this.tdsReader.mark();
         this.markedChunkRemain = this.currentChunkRemain;
         this.leftOverReadLimit = var1;
         this.setReadLimit(var1);
      }

   }

   public void close() throws IOException {
      if(null != this.tdsReader) {
         while(this.skip((long)this.tdsReader.getConnection().getTDSPacketSize()) != 0L) {
            ;
         }

         this.closeHelper();
      }
   }

   public void reset() throws IOException {
      this.resetHelper();
      this.leftOverReadLimit = this.readLimit;
      this.currentChunkRemain = this.markedChunkRemain;
   }

}
