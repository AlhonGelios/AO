package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.filesystem.BATManaged;
import org.apache.poi.poifs.storage.BATBlock;
import org.apache.poi.poifs.storage.BlockWritable;
import org.apache.poi.poifs.storage.HeaderBlockWriter;
import org.apache.poi.util.IntList;

public final class BlockAllocationTableWriter implements BlockWritable, BATManaged {

   private IntList _entries;
   private BATBlock[] _blocks;
   private int _start_block;
   private POIFSBigBlockSize _bigBlockSize;


   public BlockAllocationTableWriter(POIFSBigBlockSize bigBlockSize) {
      this._bigBlockSize = bigBlockSize;
      this._start_block = -2;
      this._entries = new IntList();
      this._blocks = new BATBlock[0];
   }

   public int createBlocks() {
      int xbat_blocks = 0;
      int bat_blocks = 0;

      while(true) {
         int startBlock = BATBlock.calculateStorageRequirements(this._bigBlockSize, bat_blocks + xbat_blocks + this._entries.size());
         int calculated_xbat_blocks = HeaderBlockWriter.calculateXBATStorageRequirements(this._bigBlockSize, startBlock);
         if(bat_blocks == startBlock && xbat_blocks == calculated_xbat_blocks) {
            startBlock = this.allocateSpace(bat_blocks);
            this.allocateSpace(xbat_blocks);
            this.simpleCreateBlocks();
            return startBlock;
         }

         bat_blocks = startBlock;
         xbat_blocks = calculated_xbat_blocks;
      }
   }

   public int allocateSpace(int blockCount) {
      int startBlock = this._entries.size();
      if(blockCount > 0) {
         int limit = blockCount - 1;
         int index = startBlock + 1;

         for(int k = 0; k < limit; ++k) {
            this._entries.add(index++);
         }

         this._entries.add(-2);
      }

      return startBlock;
   }

   public int getStartBlock() {
      return this._start_block;
   }

   void simpleCreateBlocks() {
      this._blocks = BATBlock.createBATBlocks(this._bigBlockSize, this._entries.toArray());
   }

   public void writeBlocks(OutputStream stream) throws IOException {
      for(int j = 0; j < this._blocks.length; ++j) {
         this._blocks[j].writeBlocks(stream);
      }

   }

   public static void writeBlock(BATBlock bat, ByteBuffer block) throws IOException {
      bat.writeData(block);
   }

   public int countBlocks() {
      return this._blocks.length;
   }

   public void setStartBlock(int start_block) {
      this._start_block = start_block;
   }
}
