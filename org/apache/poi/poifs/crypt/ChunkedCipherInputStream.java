package org.apache.poi.poifs.crypt;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndianInput;
import org.apache.poi.util.LittleEndianInputStream;

@Internal
public abstract class ChunkedCipherInputStream extends LittleEndianInputStream {

   private final int chunkSize;
   private final int chunkMask;
   private final int chunkBits;
   private int _lastIndex = 0;
   private long _pos = 0L;
   private long _size;
   private byte[] _chunk;
   private Cipher _cipher;


   public ChunkedCipherInputStream(LittleEndianInput stream, long size, int chunkSize) throws GeneralSecurityException {
      super((InputStream)stream);
      this._size = size;
      this.chunkSize = chunkSize;
      this.chunkMask = chunkSize - 1;
      this.chunkBits = Integer.bitCount(this.chunkMask);
      this._cipher = this.initCipherForBlock((Cipher)null, 0);
   }

   protected abstract Cipher initCipherForBlock(Cipher var1, int var2) throws GeneralSecurityException;

   public int read() throws IOException {
      byte[] b = new byte[1];
      return this.read(b) == 1?b[0]:-1;
   }

   public int read(byte[] b, int off, int len) throws IOException {
      int total = 0;
      if(this.available() <= 0) {
         return -1;
      } else {
         int count;
         for(; len > 0; total += count) {
            if(this._chunk == null) {
               try {
                  this._chunk = this.nextChunk();
               } catch (GeneralSecurityException var7) {
                  throw new EncryptedDocumentException(var7.getMessage(), var7);
               }
            }

            count = (int)((long)this.chunkSize - (this._pos & (long)this.chunkMask));
            int avail = this.available();
            if(avail == 0) {
               return total;
            }

            count = Math.min(avail, Math.min(count, len));
            System.arraycopy(this._chunk, (int)(this._pos & (long)this.chunkMask), b, off, count);
            off += count;
            len -= count;
            this._pos += (long)count;
            if((this._pos & (long)this.chunkMask) == 0L) {
               this._chunk = null;
            }
         }

         return total;
      }
   }

   public long skip(long n) throws IOException {
      long start = this._pos;
      long skip = Math.min((long)this.available(), n);
      if(((this._pos + skip ^ start) & (long)(~this.chunkMask)) != 0L) {
         this._chunk = null;
      }

      this._pos += skip;
      return skip;
   }

   public int available() {
      return (int)(this._size - this._pos);
   }

   public boolean markSupported() {
      return false;
   }

   public synchronized void mark(int readlimit) {
      throw new UnsupportedOperationException();
   }

   public synchronized void reset() throws IOException {
      throw new UnsupportedOperationException();
   }

   private byte[] nextChunk() throws GeneralSecurityException, IOException {
      int index = (int)(this._pos >> this.chunkBits);
      this.initCipherForBlock(this._cipher, index);
      if(this._lastIndex != index) {
         super.skip((long)(index - this._lastIndex << this.chunkBits));
      }

      byte[] block = new byte[Math.min(super.available(), this.chunkSize)];
      super.read(block, 0, block.length);
      this._lastIndex = index + 1;
      return this._cipher.doFinal(block);
   }
}
