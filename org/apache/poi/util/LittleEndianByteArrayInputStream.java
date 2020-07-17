package org.apache.poi.util;

import org.apache.poi.util.LittleEndianInput;

public final class LittleEndianByteArrayInputStream implements LittleEndianInput {

   private final byte[] _buf;
   private final int _endIndex;
   private int _readIndex;


   public LittleEndianByteArrayInputStream(byte[] buf, int startOffset, int maxReadLen) {
      this._buf = buf;
      this._readIndex = startOffset;
      this._endIndex = startOffset + maxReadLen;
   }

   public LittleEndianByteArrayInputStream(byte[] buf, int startOffset) {
      this(buf, startOffset, buf.length - startOffset);
   }

   public LittleEndianByteArrayInputStream(byte[] buf) {
      this(buf, 0, buf.length);
   }

   public int available() {
      return this._endIndex - this._readIndex;
   }

   private void checkPosition(int i) {
      if(i > this._endIndex - this._readIndex) {
         throw new RuntimeException("Buffer overrun");
      }
   }

   public int getReadIndex() {
      return this._readIndex;
   }

   public byte readByte() {
      this.checkPosition(1);
      return this._buf[this._readIndex++];
   }

   public int readInt() {
      this.checkPosition(4);
      int i = this._readIndex;
      int b0 = this._buf[i++] & 255;
      int b1 = this._buf[i++] & 255;
      int b2 = this._buf[i++] & 255;
      int b3 = this._buf[i++] & 255;
      this._readIndex = i;
      return (b3 << 24) + (b2 << 16) + (b1 << 8) + (b0 << 0);
   }

   public long readLong() {
      this.checkPosition(8);
      int i = this._readIndex;
      int b0 = this._buf[i++] & 255;
      int b1 = this._buf[i++] & 255;
      int b2 = this._buf[i++] & 255;
      int b3 = this._buf[i++] & 255;
      int b4 = this._buf[i++] & 255;
      int b5 = this._buf[i++] & 255;
      int b6 = this._buf[i++] & 255;
      int b7 = this._buf[i++] & 255;
      this._readIndex = i;
      return ((long)b7 << 56) + ((long)b6 << 48) + ((long)b5 << 40) + ((long)b4 << 32) + ((long)b3 << 24) + (long)(b2 << 16) + (long)(b1 << 8) + (long)(b0 << 0);
   }

   public short readShort() {
      return (short)this.readUShort();
   }

   public int readUByte() {
      this.checkPosition(1);
      return this._buf[this._readIndex++] & 255;
   }

   public int readUShort() {
      this.checkPosition(2);
      int i = this._readIndex;
      int b0 = this._buf[i++] & 255;
      int b1 = this._buf[i++] & 255;
      this._readIndex = i;
      return (b1 << 8) + (b0 << 0);
   }

   public void readFully(byte[] buf, int off, int len) {
      this.checkPosition(len);
      System.arraycopy(this._buf, this._readIndex, buf, off, len);
      this._readIndex += len;
   }

   public void readFully(byte[] buf) {
      this.readFully(buf, 0, buf.length);
   }

   public double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }
}
