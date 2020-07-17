package org.apache.poi.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.LittleEndianInput;

public class LittleEndianInputStream extends FilterInputStream implements LittleEndianInput {

   public LittleEndianInputStream(InputStream is) {
      super(is);
   }

   public int available() {
      try {
         return super.available();
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   public byte readByte() {
      return (byte)this.readUByte();
   }

   public int readUByte() {
      byte[] buf = new byte[1];

      try {
         checkEOF(this.read(buf), 1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }

      return LittleEndian.getUByte(buf);
   }

   public double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }

   public int readInt() {
      byte[] buf = new byte[4];

      try {
         checkEOF(this.read(buf), buf.length);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }

      return LittleEndian.getInt(buf);
   }

   public long readUInt() {
      long retNum = (long)this.readInt();
      return retNum & 4294967295L;
   }

   public long readLong() {
      byte[] buf = new byte[8];

      try {
         checkEOF(this.read(buf), 8);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }

      return LittleEndian.getLong(buf);
   }

   public short readShort() {
      return (short)this.readUShort();
   }

   public int readUShort() {
      byte[] buf = new byte[2];

      try {
         checkEOF(this.read(buf), 2);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }

      return LittleEndian.getUShort(buf);
   }

   private static void checkEOF(int actualBytes, int expectedBytes) {
      if(expectedBytes != 0 && (actualBytes == -1 || actualBytes != expectedBytes)) {
         throw new RuntimeException("Unexpected end-of-file");
      }
   }

   public void readFully(byte[] buf) {
      this.readFully(buf, 0, buf.length);
   }

   public void readFully(byte[] buf, int off, int len) {
      try {
         checkEOF(this.read(buf, off, len), len);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }
}
