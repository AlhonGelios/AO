package org.apache.poi.poifs.storage;


public final class DataInputBlock {

   private final byte[] _buf;
   private int _readIndex;
   private int _maxIndex;


   DataInputBlock(byte[] data, int startOffset) {
      this._buf = data;
      this._readIndex = startOffset;
      this._maxIndex = this._buf.length;
   }

   public int available() {
      return this._maxIndex - this._readIndex;
   }

   public int readUByte() {
      return this._buf[this._readIndex++] & 255;
   }

   public int readUShortLE() {
      int i = this._readIndex;
      int b0 = this._buf[i++] & 255;
      int b1 = this._buf[i++] & 255;
      this._readIndex = i;
      return (b1 << 8) + (b0 << 0);
   }

   public int readUShortLE(DataInputBlock prevBlock) {
      int i = prevBlock._buf.length - 1;
      int b0 = prevBlock._buf[i] & 255;
      int b1 = this._buf[this._readIndex++] & 255;
      return (b1 << 8) + (b0 << 0);
   }

   public int readIntLE() {
      int i = this._readIndex;
      int b0 = this._buf[i++] & 255;
      int b1 = this._buf[i++] & 255;
      int b2 = this._buf[i++] & 255;
      int b3 = this._buf[i++] & 255;
      this._readIndex = i;
      return (b3 << 24) + (b2 << 16) + (b1 << 8) + (b0 << 0);
   }

   public int readIntLE(DataInputBlock prevBlock, int prevBlockAvailable) {
      byte[] buf = new byte[4];
      this.readSpanning(prevBlock, prevBlockAvailable, buf);
      int b0 = buf[0] & 255;
      int b1 = buf[1] & 255;
      int b2 = buf[2] & 255;
      int b3 = buf[3] & 255;
      return (b3 << 24) + (b2 << 16) + (b1 << 8) + (b0 << 0);
   }

   public long readLongLE() {
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

   public long readLongLE(DataInputBlock prevBlock, int prevBlockAvailable) {
      byte[] buf = new byte[8];
      this.readSpanning(prevBlock, prevBlockAvailable, buf);
      int b0 = buf[0] & 255;
      int b1 = buf[1] & 255;
      int b2 = buf[2] & 255;
      int b3 = buf[3] & 255;
      int b4 = buf[4] & 255;
      int b5 = buf[5] & 255;
      int b6 = buf[6] & 255;
      int b7 = buf[7] & 255;
      return ((long)b7 << 56) + ((long)b6 << 48) + ((long)b5 << 40) + ((long)b4 << 32) + ((long)b3 << 24) + (long)(b2 << 16) + (long)(b1 << 8) + (long)(b0 << 0);
   }

   private void readSpanning(DataInputBlock prevBlock, int prevBlockAvailable, byte[] buf) {
      System.arraycopy(prevBlock._buf, prevBlock._readIndex, buf, 0, prevBlockAvailable);
      int secondReadLen = buf.length - prevBlockAvailable;
      System.arraycopy(this._buf, 0, buf, prevBlockAvailable, secondReadLen);
      this._readIndex = secondReadLen;
   }

   public void readFully(byte[] buf, int off, int len) {
      System.arraycopy(this._buf, this._readIndex, buf, off, len);
      this._readIndex += len;
   }
}
