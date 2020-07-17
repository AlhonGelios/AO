package org.apache.poi.poifs.crypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentOutputStream;
import org.apache.poi.poifs.filesystem.POIFSWriterEvent;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.TempFile;

@Internal
public abstract class ChunkedCipherOutputStream extends FilterOutputStream {

   private static final POILogger logger = POILogFactory.getLogger(ChunkedCipherOutputStream.class);
   protected final int chunkSize;
   protected final int chunkMask;
   protected final int chunkBits;
   private final byte[] _chunk;
   private final File fileOut;
   private final DirectoryNode dir;
   private long _pos = 0L;
   private Cipher _cipher;


   public ChunkedCipherOutputStream(DirectoryNode dir, int chunkSize) throws IOException, GeneralSecurityException {
      super((OutputStream)null);
      this.chunkSize = chunkSize;
      this.chunkMask = chunkSize - 1;
      this.chunkBits = Integer.bitCount(this.chunkMask);
      this._chunk = new byte[chunkSize];
      this.fileOut = TempFile.createTempFile("encrypted_package", "crypt");
      this.fileOut.deleteOnExit();
      this.out = new FileOutputStream(this.fileOut);
      this.dir = dir;
      this._cipher = this.initCipherForBlock((Cipher)null, 0, false);
   }

   protected abstract Cipher initCipherForBlock(Cipher var1, int var2, boolean var3) throws GeneralSecurityException;

   protected abstract void calculateChecksum(File var1, int var2) throws GeneralSecurityException, IOException;

   protected abstract void createEncryptionInfoEntry(DirectoryNode var1, File var2) throws IOException, GeneralSecurityException;

   public void write(int b) throws IOException {
      this.write(new byte[]{(byte)b});
   }

   public void write(byte[] b) throws IOException {
      this.write(b, 0, b.length);
   }

   public void write(byte[] b, int off, int len) throws IOException {
      if(len != 0) {
         if(len >= 0 && b.length >= off + len) {
            while(len > 0) {
               int posInChunk = (int)(this._pos & (long)this.chunkMask);
               int nextLen = Math.min(this.chunkSize - posInChunk, len);
               System.arraycopy(b, off, this._chunk, posInChunk, nextLen);
               this._pos += (long)nextLen;
               off += nextLen;
               len -= nextLen;
               if((this._pos & (long)this.chunkMask) == 0L) {
                  try {
                     this.writeChunk();
                  } catch (GeneralSecurityException var7) {
                     throw new IOException(var7);
                  }
               }
            }

         } else {
            throw new IOException("not enough bytes in your input buffer");
         }
      }
   }

   protected void writeChunk() throws IOException, GeneralSecurityException {
      int posInChunk = (int)(this._pos & (long)this.chunkMask);
      int index = (int)(this._pos >> this.chunkBits);
      boolean lastChunk;
      if(posInChunk == 0) {
         --index;
         posInChunk = this.chunkSize;
         lastChunk = false;
      } else {
         lastChunk = true;
      }

      this._cipher = this.initCipherForBlock(this._cipher, index, lastChunk);
      int ciLen = this._cipher.doFinal(this._chunk, 0, posInChunk, this._chunk);
      this.out.write(this._chunk, 0, ciLen);
   }

   public void close() throws IOException {
      try {
         this.writeChunk();
         super.close();
         int e = (int)(this.fileOut.length() + 8L);
         this.calculateChecksum(this.fileOut, (int)this._pos);
         this.dir.createDocument("EncryptedPackage", e, new ChunkedCipherOutputStream.EncryptedPackageWriter((ChunkedCipherOutputStream.NamelessClass1468591342)null));
         this.createEncryptionInfoEntry(this.dir, this.fileOut);
      } catch (GeneralSecurityException var2) {
         throw new IOException(var2);
      }
   }


   // $FF: synthetic class
   static class NamelessClass1468591342 {
   }

   private class EncryptedPackageWriter implements POIFSWriterListener {

      private EncryptedPackageWriter() {}

      public void processPOIFSWriterEvent(POIFSWriterEvent event) {
         try {
            DocumentOutputStream e = event.getStream();
            byte[] buf = new byte[ChunkedCipherOutputStream.this.chunkSize];
            LittleEndian.putLong(buf, 0, ChunkedCipherOutputStream.this._pos);
            e.write(buf, 0, 8);
            FileInputStream fis = new FileInputStream(ChunkedCipherOutputStream.this.fileOut);

            int readBytes;
            while((readBytes = fis.read(buf)) != -1) {
               e.write(buf, 0, readBytes);
            }

            fis.close();
            e.close();
            if(!ChunkedCipherOutputStream.this.fileOut.delete()) {
               ChunkedCipherOutputStream.logger.log(7, new Object[]{"Can\'t delete temporary encryption file: " + ChunkedCipherOutputStream.this.fileOut});
            }

         } catch (IOException var6) {
            throw new EncryptedDocumentException(var6);
         }
      }

      // $FF: synthetic method
      EncryptedPackageWriter(ChunkedCipherOutputStream.NamelessClass1468591342 x1) {
         this();
      }
   }
}
