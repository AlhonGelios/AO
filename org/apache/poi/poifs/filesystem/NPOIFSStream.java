package org.apache.poi.poifs.filesystem;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.poi.poifs.filesystem.BlockStore;

public class NPOIFSStream implements Iterable {

   private BlockStore blockStore;
   private int startBlock;
   private OutputStream outStream;


   public NPOIFSStream(BlockStore blockStore, int startBlock) {
      this.blockStore = blockStore;
      this.startBlock = startBlock;
   }

   public NPOIFSStream(BlockStore blockStore) {
      this.blockStore = blockStore;
      this.startBlock = -2;
   }

   public int getStartBlock() {
      return this.startBlock;
   }

   public Iterator iterator() {
      return this.getBlockIterator();
   }

   public Iterator getBlockIterator() {
      if(this.startBlock == -2) {
         throw new IllegalStateException("Can\'t read from a new stream before it has been written to");
      } else {
         return new NPOIFSStream.StreamBlockByteBufferIterator(this.startBlock);
      }
   }

   public void updateContents(byte[] contents) throws IOException {
      OutputStream os = this.getOutputStream();
      os.write(contents);
      os.close();
   }

   public OutputStream getOutputStream() throws IOException {
      if(this.outStream == null) {
         this.outStream = new NPOIFSStream.StreamBlockByteBuffer();
      }

      return this.outStream;
   }

   public void free() throws IOException {
      BlockStore.ChainLoopDetector loopDetector = this.blockStore.getChainLoopDetector();
      this.free(loopDetector);
   }

   private void free(BlockStore.ChainLoopDetector loopDetector) {
      int nextBlock = this.startBlock;

      while(nextBlock != -2) {
         int thisBlock = nextBlock;
         loopDetector.claim(nextBlock);
         nextBlock = this.blockStore.getNextBlock(nextBlock);
         this.blockStore.setNextBlock(thisBlock, -1);
      }

      this.startBlock = -2;
   }

   protected class StreamBlockByteBufferIterator implements Iterator {

      private BlockStore.ChainLoopDetector loopDetector;
      private int nextBlock;


      protected StreamBlockByteBufferIterator(int firstBlock) {
         this.nextBlock = firstBlock;

         try {
            this.loopDetector = NPOIFSStream.this.blockStore.getChainLoopDetector();
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      }

      public boolean hasNext() {
         return this.nextBlock != -2;
      }

      public ByteBuffer next() {
         if(this.nextBlock == -2) {
            throw new IndexOutOfBoundsException("Can\'t read past the end of the stream");
         } else {
            try {
               this.loopDetector.claim(this.nextBlock);
               ByteBuffer e = NPOIFSStream.this.blockStore.getBlockAt(this.nextBlock);
               this.nextBlock = NPOIFSStream.this.blockStore.getNextBlock(this.nextBlock);
               return e;
            } catch (IOException var2) {
               throw new RuntimeException(var2);
            }
         }
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }
   }

   protected class StreamBlockByteBuffer extends OutputStream {

      byte[] oneByte = new byte[1];
      ByteBuffer buffer;
      BlockStore.ChainLoopDetector loopDetector;
      int prevBlock;
      int nextBlock;


      protected StreamBlockByteBuffer() throws IOException {
         this.loopDetector = NPOIFSStream.this.blockStore.getChainLoopDetector();
         this.prevBlock = -2;
         this.nextBlock = NPOIFSStream.this.startBlock;
      }

      protected void createBlockIfNeeded() throws IOException {
         if(this.buffer == null || !this.buffer.hasRemaining()) {
            int thisBlock = this.nextBlock;
            if(thisBlock == -2) {
               thisBlock = NPOIFSStream.this.blockStore.getFreeBlock();
               this.loopDetector.claim(thisBlock);
               this.nextBlock = -2;
               if(this.prevBlock != -2) {
                  NPOIFSStream.this.blockStore.setNextBlock(this.prevBlock, thisBlock);
               }

               NPOIFSStream.this.blockStore.setNextBlock(thisBlock, -2);
               if(NPOIFSStream.this.startBlock == -2) {
                  NPOIFSStream.this.startBlock = thisBlock;
               }
            } else {
               this.loopDetector.claim(thisBlock);
               this.nextBlock = NPOIFSStream.this.blockStore.getNextBlock(thisBlock);
            }

            this.buffer = NPOIFSStream.this.blockStore.createBlockIfNeeded(thisBlock);
            this.prevBlock = thisBlock;
         }
      }

      public void write(int b) throws IOException {
         this.oneByte[0] = (byte)(b & 255);
         this.write(this.oneByte);
      }

      public void write(byte[] b, int off, int len) throws IOException {
         if(off >= 0 && off <= b.length && len >= 0 && off + len <= b.length && off + len >= 0) {
            if(len != 0) {
               do {
                  this.createBlockIfNeeded();
                  int writeBytes = Math.min(this.buffer.remaining(), len);
                  this.buffer.put(b, off, writeBytes);
                  off += writeBytes;
                  len -= writeBytes;
               } while(len > 0);

            }
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public void close() throws IOException {
         NPOIFSStream toFree = new NPOIFSStream(NPOIFSStream.this.blockStore, this.nextBlock);
         toFree.free(this.loopDetector);
         if(this.prevBlock != -2) {
            NPOIFSStream.this.blockStore.setNextBlock(this.prevBlock, -2);
         }

      }
   }
}
