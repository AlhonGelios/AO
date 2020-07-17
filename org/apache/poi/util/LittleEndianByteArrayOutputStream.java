package org.apache.poi.util;

import org.apache.poi.util.DelayableLittleEndianOutput;
import org.apache.poi.util.LittleEndianOutput;

public final class LittleEndianByteArrayOutputStream implements LittleEndianOutput, DelayableLittleEndianOutput {

   private final byte[] _buf;
   private final int _endIndex;
   private int _writeIndex;


   public LittleEndianByteArrayOutputStream(byte[] buf, int startOffset, int maxWriteLen) {
      if(startOffset >= 0 && startOffset <= buf.length) {
         this._buf = buf;
         this._writeIndex = startOffset;
         this._endIndex = startOffset + maxWriteLen;
         if(this._endIndex < startOffset || this._endIndex > buf.length) {
            throw new IllegalArgumentException("calculated end index (" + this._endIndex + ") is out of allowable range (" + this._writeIndex + ".." + buf.length + ")");
         }
      } else {
         throw new IllegalArgumentException("Specified startOffset (" + startOffset + ") is out of allowable range (0.." + buf.length + ")");
      }
   }

   public LittleEndianByteArrayOutputStream(byte[] buf, int startOffset) {
      this(buf, startOffset, buf.length - startOffset);
   }

   private void checkPosition(int i) {
      if(i > this._endIndex - this._writeIndex) {
         throw new RuntimeException("Buffer overrun");
      }
   }

   public void writeByte(int v) {
      this.checkPosition(1);
      this._buf[this._writeIndex++] = (byte)v;
   }

   public void writeDouble(double v) {
      this.writeLong(Double.doubleToLongBits(v));
   }

   public void writeInt(int v) {
      this.checkPosition(4);
      int i = this._writeIndex;
      this._buf[i++] = (byte)(v >>> 0 & 255);
      this._buf[i++] = (byte)(v >>> 8 & 255);
      this._buf[i++] = (byte)(v >>> 16 & 255);
      this._buf[i++] = (byte)(v >>> 24 & 255);
      this._writeIndex = i;
   }

   public void writeLong(long v) {
      this.writeInt((int)(v >> 0));
      this.writeInt((int)(v >> 32));
   }

   public void writeShort(int v) {
      this.checkPosition(2);
      int i = this._writeIndex;
      this._buf[i++] = (byte)(v >>> 0 & 255);
      this._buf[i++] = (byte)(v >>> 8 & 255);
      this._writeIndex = i;
   }

   public void write(byte[] b) {
      int len = b.length;
      this.checkPosition(len);
      System.arraycopy(b, 0, this._buf, this._writeIndex, len);
      this._writeIndex += len;
   }

   public void write(byte[] b, int offset, int len) {
      this.checkPosition(len);
      System.arraycopy(b, offset, this._buf, this._writeIndex, len);
      this._writeIndex += len;
   }

   public int getWriteIndex() {
      return this._writeIndex;
   }

   public LittleEndianOutput createDelayedOutput(int size) {
      this.checkPosition(size);
      LittleEndianByteArrayOutputStream result = new LittleEndianByteArrayOutputStream(this._buf, this._writeIndex, size);
      this._writeIndex += size;
      return result;
   }
}
