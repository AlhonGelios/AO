package org.apache.poi.hssf.record.crypto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.poi.hssf.record.crypto.Biff8Cipher;
import org.apache.poi.hssf.record.crypto.Biff8XORKey;

public class Biff8XOR implements Biff8Cipher {

   private final Biff8XORKey _key;
   private ByteBuffer _buffer;
   private boolean _shouldSkipEncryptionOnCurrentRecord;
   private final int _initialOffset;
   private int _dataLength;
   private int _xorArrayIndex;


   public Biff8XOR(int initialOffset, Biff8XORKey key) {
      this._buffer = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
      this._dataLength = 0;
      this._xorArrayIndex = 0;
      this._key = key;
      this._initialOffset = initialOffset;
   }

   public void startRecord(int currentSid) {
      this._shouldSkipEncryptionOnCurrentRecord = isNeverEncryptedRecord(currentSid);
   }

   public void setNextRecordSize(int recordSize) {
      this._xorArrayIndex = (this._initialOffset + this._dataLength + recordSize) % 16;
   }

   private static boolean isNeverEncryptedRecord(int sid) {
      switch(sid) {
      case 47:
      case 225:
      case 2057:
         return true;
      default:
         return false;
      }
   }

   public void skipTwoBytes() {
      this._dataLength += 2;
   }

   public void xor(byte[] buf, int pOffset, int pLen) {
      if(this._shouldSkipEncryptionOnCurrentRecord) {
         this._dataLength += pLen;
      } else {
         byte[] xorArray = this._key._secretKey.getEncoded();

         for(int i = 0; i < pLen; ++i) {
            byte value = buf[pOffset + i];
            value = rotateLeft(value, 3);
            value ^= xorArray[this._xorArrayIndex];
            buf[pOffset + i] = value;
            this._xorArrayIndex = (this._xorArrayIndex + 1) % 16;
            ++this._dataLength;
         }

      }
   }

   private static byte rotateLeft(byte bits, int shift) {
      return (byte)((bits & 255) << shift | (bits & 255) >>> 8 - shift);
   }

   public int xorByte(int rawVal) {
      this._buffer.put(0, (byte)rawVal);
      this.xor(this._buffer.array(), 0, 1);
      return this._buffer.get(0);
   }

   public int xorShort(int rawVal) {
      this._buffer.putShort(0, (short)rawVal);
      this.xor(this._buffer.array(), 0, 2);
      return this._buffer.getShort(0);
   }

   public int xorInt(int rawVal) {
      this._buffer.putInt(0, rawVal);
      this.xor(this._buffer.array(), 0, 4);
      return this._buffer.getInt(0);
   }

   public long xorLong(long rawVal) {
      this._buffer.putLong(0, rawVal);
      this.xor(this._buffer.array(), 0, 8);
      return this._buffer.getLong(0);
   }
}
