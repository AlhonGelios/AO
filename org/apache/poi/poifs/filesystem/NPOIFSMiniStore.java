package org.apache.poi.poifs.filesystem;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.filesystem.BlockStore;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.NPOIFSStream;
import org.apache.poi.poifs.property.RootProperty;
import org.apache.poi.poifs.storage.BATBlock;
import org.apache.poi.poifs.storage.BlockAllocationTableWriter;
import org.apache.poi.poifs.storage.HeaderBlock;

public class NPOIFSMiniStore extends BlockStore {

   private NPOIFSFileSystem _filesystem;
   private NPOIFSStream _mini_stream;
   private List _sbat_blocks;
   private HeaderBlock _header;
   private RootProperty _root;


   protected NPOIFSMiniStore(NPOIFSFileSystem filesystem, RootProperty root, List sbats, HeaderBlock header) {
      this._filesystem = filesystem;
      this._sbat_blocks = sbats;
      this._header = header;
      this._root = root;
      this._mini_stream = new NPOIFSStream(filesystem, root.getStartBlock());
   }

   protected ByteBuffer getBlockAt(int offset) throws IOException {
      int byteOffset = offset * 64;
      int bigBlockNumber = byteOffset / this._filesystem.getBigBlockSize();
      int bigBlockOffset = byteOffset % this._filesystem.getBigBlockSize();
      Iterator it = this._mini_stream.getBlockIterator();

      for(int dataBlock = 0; dataBlock < bigBlockNumber; ++dataBlock) {
         it.next();
      }

      ByteBuffer var8 = (ByteBuffer)it.next();
      if(var8 == null) {
         throw new IndexOutOfBoundsException("Big block " + bigBlockNumber + " outside stream");
      } else {
         var8.position(var8.position() + bigBlockOffset);
         ByteBuffer miniBuffer = var8.slice();
         miniBuffer.limit(64);
         return miniBuffer;
      }
   }

   protected ByteBuffer createBlockIfNeeded(int offset) throws IOException {
      boolean firstInStore = false;
      if(this._mini_stream.getStartBlock() == -2) {
         firstInStore = true;
      }

      if(!firstInStore) {
         try {
            return this.getBlockAt(offset);
         } catch (IndexOutOfBoundsException var7) {
            ;
         }
      }

      int newBigBlock = this._filesystem.getFreeBlock();
      this._filesystem.createBlockIfNeeded(newBigBlock);
      if(firstInStore) {
         this._filesystem._get_property_table().getRoot().setStartBlock(newBigBlock);
         this._mini_stream = new NPOIFSStream(this._filesystem, newBigBlock);
      } else {
         BlockStore.ChainLoopDetector loopDetector = this._filesystem.getChainLoopDetector();
         int block = this._mini_stream.getStartBlock();

         while(true) {
            loopDetector.claim(block);
            int next = this._filesystem.getNextBlock(block);
            if(next == -2) {
               this._filesystem.setNextBlock(block, newBigBlock);
               break;
            }

            block = next;
         }
      }

      this._filesystem.setNextBlock(newBigBlock, -2);
      return this.createBlockIfNeeded(offset);
   }

   protected BATBlock.BATBlockAndIndex getBATBlockAndIndex(int offset) {
      return BATBlock.getSBATBlockAndIndex(offset, this._header, this._sbat_blocks);
   }

   protected int getNextBlock(int offset) {
      BATBlock.BATBlockAndIndex bai = this.getBATBlockAndIndex(offset);
      return bai.getBlock().getValueAt(bai.getIndex());
   }

   protected void setNextBlock(int offset, int nextBlock) {
      BATBlock.BATBlockAndIndex bai = this.getBATBlockAndIndex(offset);
      bai.getBlock().setValueAt(bai.getIndex(), nextBlock);
   }

   protected int getFreeBlock() throws IOException {
      int sectorsPerSBAT = this._filesystem.getBigBlockSizeDetails().getBATEntriesPerBlock();
      int offset = 0;

      int batOffset;
      for(int newSBAT = 0; newSBAT < this._sbat_blocks.size(); ++newSBAT) {
         BATBlock batForSBAT = (BATBlock)this._sbat_blocks.get(newSBAT);
         if(batForSBAT.hasFreeSectors()) {
            for(int loopDetector = 0; loopDetector < sectorsPerSBAT; ++loopDetector) {
               batOffset = batForSBAT.getValueAt(loopDetector);
               if(batOffset == -1) {
                  return offset + loopDetector;
               }
            }
         }

         offset += sectorsPerSBAT;
      }

      BATBlock var8 = BATBlock.createEmptyBATBlock(this._filesystem.getBigBlockSizeDetails(), false);
      int var9 = this._filesystem.getFreeBlock();
      var8.setOurBlockIndex(var9);
      if(this._header.getSBATCount() == 0) {
         this._header.setSBATStart(var9);
         this._header.setSBATBlockCount(1);
      } else {
         BlockStore.ChainLoopDetector var10 = this._filesystem.getChainLoopDetector();
         batOffset = this._header.getSBATStart();

         while(true) {
            var10.claim(batOffset);
            int nextBat = this._filesystem.getNextBlock(batOffset);
            if(nextBat == -2) {
               this._filesystem.setNextBlock(batOffset, var9);
               this._header.setSBATBlockCount(this._header.getSBATCount() + 1);
               break;
            }

            batOffset = nextBat;
         }
      }

      this._filesystem.setNextBlock(var9, -2);
      this._sbat_blocks.add(var8);
      return offset;
   }

   protected BlockStore.ChainLoopDetector getChainLoopDetector() throws IOException {
      return new BlockStore.ChainLoopDetector((long)this._root.getSize());
   }

   protected int getBlockStoreBlockSize() {
      return 64;
   }

   protected void syncWithDataSource() throws IOException {
      int blocksUsed = 0;
      Iterator i$ = this._sbat_blocks.iterator();

      while(i$.hasNext()) {
         BATBlock sbat = (BATBlock)i$.next();
         ByteBuffer block = this._filesystem.getBlockAt(sbat.getOurBlockIndex());
         BlockAllocationTableWriter.writeBlock(sbat, block);
         if(!sbat.hasFreeSectors()) {
            blocksUsed += this._filesystem.getBigBlockSizeDetails().getBATEntriesPerBlock();
         } else {
            blocksUsed += sbat.getUsedSectors(false);
         }
      }

      this._filesystem._get_property_table().getRoot().setSize(blocksUsed);
   }
}
