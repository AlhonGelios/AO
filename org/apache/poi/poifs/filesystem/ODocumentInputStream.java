package org.apache.poi.poifs.filesystem;

import java.io.IOException;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.OPOIFSDocument;
import org.apache.poi.poifs.storage.DataInputBlock;

public final class ODocumentInputStream extends DocumentInputStream {

   private int _current_offset;
   private int _marked_offset;
   private int _document_size;
   private boolean _closed;
   private OPOIFSDocument _document;
   private DataInputBlock _currentBlock;


   public ODocumentInputStream(DocumentEntry document) throws IOException {
      if(!(document instanceof DocumentNode)) {
         throw new IOException("Cannot open internal document storage");
      } else {
         DocumentNode documentNode = (DocumentNode)document;
         if(documentNode.getDocument() == null) {
            throw new IOException("Cannot open internal document storage");
         } else {
            this._current_offset = 0;
            this._marked_offset = 0;
            this._document_size = document.getSize();
            this._closed = false;
            this._document = documentNode.getDocument();
            this._currentBlock = this.getDataInputBlock(0);
         }
      }
   }

   public ODocumentInputStream(OPOIFSDocument document) {
      this._current_offset = 0;
      this._marked_offset = 0;
      this._document_size = document.getSize();
      this._closed = false;
      this._document = document;
      this._currentBlock = this.getDataInputBlock(0);
   }

   public int available() {
      if(this._closed) {
         throw new IllegalStateException("cannot perform requested operation on a closed stream");
      } else {
         return this._document_size - this._current_offset;
      }
   }

   public void close() {
      this._closed = true;
   }

   public void mark(int ignoredReadlimit) {
      this._marked_offset = this._current_offset;
   }

   private DataInputBlock getDataInputBlock(int offset) {
      return this._document.getDataInputBlock(offset);
   }

   public int read() throws IOException {
      this.dieIfClosed();
      if(this.atEOD()) {
         return -1;
      } else {
         int result = this._currentBlock.readUByte();
         ++this._current_offset;
         if(this._currentBlock.available() < 1) {
            this._currentBlock = this.getDataInputBlock(this._current_offset);
         }

         return result;
      }
   }

   public int read(byte[] b, int off, int len) throws IOException {
      this.dieIfClosed();
      if(b == null) {
         throw new IllegalArgumentException("buffer must not be null");
      } else if(off >= 0 && len >= 0 && b.length >= off + len) {
         if(len == 0) {
            return 0;
         } else if(this.atEOD()) {
            return -1;
         } else {
            int limit = Math.min(this.available(), len);
            this.readFully(b, off, limit);
            return limit;
         }
      } else {
         throw new IndexOutOfBoundsException("can\'t read past buffer boundaries");
      }
   }

   public void reset() {
      this._current_offset = this._marked_offset;
      this._currentBlock = this.getDataInputBlock(this._current_offset);
   }

   public long skip(long n) throws IOException {
      this.dieIfClosed();
      if(n < 0L) {
         return 0L;
      } else {
         int new_offset = this._current_offset + (int)n;
         if(new_offset < this._current_offset) {
            new_offset = this._document_size;
         } else if(new_offset > this._document_size) {
            new_offset = this._document_size;
         }

         long rval = (long)(new_offset - this._current_offset);
         this._current_offset = new_offset;
         this._currentBlock = this.getDataInputBlock(this._current_offset);
         return rval;
      }
   }

   private void dieIfClosed() throws IOException {
      if(this._closed) {
         throw new IOException("cannot perform requested operation on a closed stream");
      }
   }

   private boolean atEOD() {
      return this._current_offset == this._document_size;
   }

   private void checkAvaliable(int requestedSize) {
      if(this._closed) {
         throw new IllegalStateException("cannot perform requested operation on a closed stream");
      } else if(requestedSize > this._document_size - this._current_offset) {
         throw new RuntimeException("Buffer underrun - requested " + requestedSize + " bytes but " + (this._document_size - this._current_offset) + " was available");
      }
   }

   public byte readByte() {
      return (byte)this.readUByte();
   }

   public double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }

   public short readShort() {
      return (short)this.readUShort();
   }

   public void readFully(byte[] buf, int off, int len) {
      this.checkAvaliable(len);
      int blockAvailable = this._currentBlock.available();
      if(blockAvailable > len) {
         this._currentBlock.readFully(buf, off, len);
         this._current_offset += len;
      } else {
         int remaining = len;
         int writePos = off;

         while(remaining > 0) {
            boolean blockIsExpiring = remaining >= blockAvailable;
            int reqSize;
            if(blockIsExpiring) {
               reqSize = blockAvailable;
            } else {
               reqSize = remaining;
            }

            this._currentBlock.readFully(buf, writePos, reqSize);
            remaining -= reqSize;
            writePos += reqSize;
            this._current_offset += reqSize;
            if(blockIsExpiring) {
               if(this._current_offset == this._document_size) {
                  if(remaining > 0) {
                     throw new IllegalStateException("reached end of document stream unexpectedly");
                  }

                  this._currentBlock = null;
                  break;
               }

               this._currentBlock = this.getDataInputBlock(this._current_offset);
               blockAvailable = this._currentBlock.available();
            }
         }

      }
   }

   public long readLong() {
      this.checkAvaliable(8);
      int blockAvailable = this._currentBlock.available();
      long result;
      if(blockAvailable > 8) {
         result = this._currentBlock.readLongLE();
      } else {
         DataInputBlock nextBlock = this.getDataInputBlock(this._current_offset + blockAvailable);
         if(blockAvailable == 8) {
            result = this._currentBlock.readLongLE();
         } else {
            result = nextBlock.readLongLE(this._currentBlock, blockAvailable);
         }

         this._currentBlock = nextBlock;
      }

      this._current_offset += 8;
      return result;
   }

   public int readInt() {
      this.checkAvaliable(4);
      int blockAvailable = this._currentBlock.available();
      int result;
      if(blockAvailable > 4) {
         result = this._currentBlock.readIntLE();
      } else {
         DataInputBlock nextBlock = this.getDataInputBlock(this._current_offset + blockAvailable);
         if(blockAvailable == 4) {
            result = this._currentBlock.readIntLE();
         } else {
            result = nextBlock.readIntLE(this._currentBlock, blockAvailable);
         }

         this._currentBlock = nextBlock;
      }

      this._current_offset += 4;
      return result;
   }

   public int readUShort() {
      this.checkAvaliable(2);
      int blockAvailable = this._currentBlock.available();
      int result;
      if(blockAvailable > 2) {
         result = this._currentBlock.readUShortLE();
      } else {
         DataInputBlock nextBlock = this.getDataInputBlock(this._current_offset + blockAvailable);
         if(blockAvailable == 2) {
            result = this._currentBlock.readUShortLE();
         } else {
            result = nextBlock.readUShortLE(this._currentBlock);
         }

         this._currentBlock = nextBlock;
      }

      this._current_offset += 2;
      return result;
   }

   public int readUByte() {
      this.checkAvaliable(1);
      int result = this._currentBlock.readUByte();
      ++this._current_offset;
      if(this._currentBlock.available() < 1) {
         this._currentBlock = this.getDataInputBlock(this._current_offset);
      }

      return result;
   }
}
