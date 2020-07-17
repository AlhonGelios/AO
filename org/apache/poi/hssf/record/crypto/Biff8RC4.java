package org.apache.poi.hssf.record.crypto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.crypto.Biff8Cipher;
import org.apache.poi.hssf.record.crypto.Biff8RC4Key;

final class Biff8RC4 implements Biff8Cipher {

   private static final int RC4_REKEYING_INTERVAL = 1024;
   private Cipher _rc4;
   private int _streamPos;
   private int _nextRC4BlockStart;
   private int _currentKeyIndex;
   private boolean _shouldSkipEncryptionOnCurrentRecord;
   private final Biff8RC4Key _key;
   private ByteBuffer _buffer;


   public Biff8RC4(int initialOffset, Biff8RC4Key key) {
      this._buffer = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
      if(initialOffset >= 1024) {
         throw new RuntimeException("initialOffset (" + initialOffset + ")>" + 1024 + " not supported yet");
      } else {
         this._key = key;
         this._rc4 = this._key.getCipher();
         this._streamPos = 0;
         this.rekeyForNextBlock();
         this._streamPos = initialOffset;
         this._shouldSkipEncryptionOnCurrentRecord = false;
         this.encryptBytes(new byte[initialOffset], 0, initialOffset);
      }
   }

   private void rekeyForNextBlock() {
      this._currentKeyIndex = this._streamPos / 1024;
      this._key.initCipherForBlock(this._rc4, this._currentKeyIndex);
      this._nextRC4BlockStart = (this._currentKeyIndex + 1) * 1024;
   }

   private void encryptBytes(byte[] data, int offset, int bytesToRead) {
      if(bytesToRead != 0) {
         if(this._shouldSkipEncryptionOnCurrentRecord) {
            byte[] e = new byte[bytesToRead];
            System.arraycopy(data, offset, e, 0, bytesToRead);
            data = e;
            offset = 0;
         }

         try {
            this._rc4.update(data, offset, bytesToRead, data, offset);
         } catch (ShortBufferException var5) {
            throw new EncryptedDocumentException("input buffer too small", var5);
         }
      }
   }

   public void startRecord(int currentSid) {
      this._shouldSkipEncryptionOnCurrentRecord = isNeverEncryptedRecord(currentSid);
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
      this.xor(this._buffer.array(), 0, 2);
   }

   public void xor(byte[] buf, int pOffset, int pLen) {
      int nLeftInBlock = this._nextRC4BlockStart - this._streamPos;
      if(pLen <= nLeftInBlock) {
         this.encryptBytes(buf, pOffset, pLen);
         this._streamPos += pLen;
      } else {
         int offset = pOffset;
         int len = pLen;
         if(pLen > nLeftInBlock) {
            if(nLeftInBlock > 0) {
               this.encryptBytes(buf, pOffset, nLeftInBlock);
               this._streamPos += nLeftInBlock;
               offset = pOffset + nLeftInBlock;
               len = pLen - nLeftInBlock;
            }

            this.rekeyForNextBlock();
         }

         while(len > 1024) {
            this.encryptBytes(buf, offset, 1024);
            this._streamPos += 1024;
            offset += 1024;
            len -= 1024;
            this.rekeyForNextBlock();
         }

         this.encryptBytes(buf, offset, len);
         this._streamPos += len;
      }
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

   public void setNextRecordSize(int recordSize) {}
}
