package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.BaseInputStream;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

final class AsciiFilteredInputStream extends InputStream {

   private final InputStream containedStream;
   private static final byte[] ASCII_FILTER = new byte[256];


   AsciiFilteredInputStream(BaseInputStream var1) throws SQLServerException {
      if(BaseInputStream.logger.isLoggable(Level.FINER)) {
         BaseInputStream.logger.finer(var1.toString() + " wrapping in AsciiFilteredInputStream");
      }

      this.containedStream = var1;
   }

   public void close() throws IOException {
      this.containedStream.close();
   }

   public long skip(long var1) throws IOException {
      return this.containedStream.skip(var1);
   }

   public int available() throws IOException {
      return this.containedStream.available();
   }

   public int read() throws IOException {
      int var1 = this.containedStream.read();
      return var1 >= 0 && var1 <= 255?ASCII_FILTER[var1]:var1;
   }

   public int read(byte[] var1) throws IOException {
      int var2 = this.containedStream.read(var1);
      if(var2 > 0) {
         assert var2 <= var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            var1[var3] = ASCII_FILTER[var1[var3] & 255];
         }
      }

      return var2;
   }

   public int read(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.containedStream.read(var1, var2, var3);
      if(var4 > 0) {
         assert var2 + var4 <= var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            var1[var2 + var5] = ASCII_FILTER[var1[var2 + var5] & 255];
         }
      }

      return var4;
   }

   public boolean markSupported() {
      return this.containedStream.markSupported();
   }

   public void mark(int var1) {
      this.containedStream.mark(var1);
   }

   public void reset() throws IOException {
      this.containedStream.reset();
   }

   static {
      int var0;
      for(var0 = 0; var0 < 128; ++var0) {
         ASCII_FILTER[var0] = (byte)var0;
      }

      for(var0 = 128; var0 < 256; ++var0) {
         ASCII_FILTER[var0] = 63;
      }

   }
}
