package org.apache.poi.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.util.LittleEndianOutput;

public final class LittleEndianOutputStream extends FilterOutputStream implements LittleEndianOutput {

   public LittleEndianOutputStream(OutputStream out) {
      super(out);
   }

   public void writeByte(int v) {
      try {
         this.out.write(v);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void writeDouble(double v) {
      this.writeLong(Double.doubleToLongBits(v));
   }

   public void writeInt(int v) {
      int b3 = v >>> 24 & 255;
      int b2 = v >>> 16 & 255;
      int b1 = v >>> 8 & 255;
      int b0 = v >>> 0 & 255;

      try {
         this.out.write(b0);
         this.out.write(b1);
         this.out.write(b2);
         this.out.write(b3);
      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }
   }

   public void writeLong(long v) {
      this.writeInt((int)(v >> 0));
      this.writeInt((int)(v >> 32));
   }

   public void writeShort(int v) {
      int b1 = v >>> 8 & 255;
      int b0 = v >>> 0 & 255;

      try {
         this.out.write(b0);
         this.out.write(b1);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }

   public void write(byte[] b) {
      try {
         super.write(b);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void write(byte[] b, int off, int len) {
      try {
         super.write(b, off, len);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }
}
