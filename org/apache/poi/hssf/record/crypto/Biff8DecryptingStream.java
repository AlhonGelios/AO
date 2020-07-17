package org.apache.poi.hssf.record.crypto;

import java.io.InputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.BiffHeaderInput;
import org.apache.poi.hssf.record.crypto.Biff8Cipher;
import org.apache.poi.hssf.record.crypto.Biff8EncryptionKey;
import org.apache.poi.hssf.record.crypto.Biff8RC4;
import org.apache.poi.hssf.record.crypto.Biff8RC4Key;
import org.apache.poi.hssf.record.crypto.Biff8XOR;
import org.apache.poi.hssf.record.crypto.Biff8XORKey;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianInputStream;

public final class Biff8DecryptingStream implements BiffHeaderInput, LittleEndianInput {

   private final LittleEndianInput _le;
   private final Biff8Cipher _cipher;


   public Biff8DecryptingStream(InputStream in, int initialOffset, Biff8EncryptionKey key) {
      if(key instanceof Biff8RC4Key) {
         this._cipher = new Biff8RC4(initialOffset, (Biff8RC4Key)key);
      } else {
         if(!(key instanceof Biff8XORKey)) {
            throw new EncryptedDocumentException("Crypto API not supported yet.");
         }

         this._cipher = new Biff8XOR(initialOffset, (Biff8XORKey)key);
      }

      if(in instanceof LittleEndianInput) {
         this._le = (LittleEndianInput)in;
      } else {
         this._le = new LittleEndianInputStream(in);
      }

   }

   public int available() {
      return this._le.available();
   }

   public int readRecordSID() {
      int sid = this._le.readUShort();
      this._cipher.skipTwoBytes();
      this._cipher.startRecord(sid);
      return sid;
   }

   public int readDataSize() {
      int dataSize = this._le.readUShort();
      this._cipher.skipTwoBytes();
      this._cipher.setNextRecordSize(dataSize);
      return dataSize;
   }

   public double readDouble() {
      long valueLongBits = this.readLong();
      double result = Double.longBitsToDouble(valueLongBits);
      if(Double.isNaN(result)) {
         throw new RuntimeException("Did not expect to read NaN");
      } else {
         return result;
      }
   }

   public void readFully(byte[] buf) {
      this.readFully(buf, 0, buf.length);
   }

   public void readFully(byte[] buf, int off, int len) {
      this._le.readFully(buf, off, len);
      this._cipher.xor(buf, off, len);
   }

   public int readUByte() {
      return this.readByte() & 255;
   }

   public byte readByte() {
      return (byte)this._cipher.xorByte(this._le.readUByte());
   }

   public int readUShort() {
      return this.readShort() & '\uffff';
   }

   public short readShort() {
      return (short)this._cipher.xorShort(this._le.readUShort());
   }

   public int readInt() {
      return this._cipher.xorInt(this._le.readInt());
   }

   public long readLong() {
      return this._cipher.xorLong(this._le.readLong());
   }
}
