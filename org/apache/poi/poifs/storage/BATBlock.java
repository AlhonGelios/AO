package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.storage.BigBlock;
import org.apache.poi.poifs.storage.HeaderBlock;
import org.apache.poi.util.LittleEndian;

public final class BATBlock extends BigBlock {

   private int[] _values;
   private boolean _has_free_sectors;
   private int ourBlockIndex;


   private BATBlock(POIFSBigBlockSize bigBlockSize) {
      super(bigBlockSize);
      int _entries_per_block = bigBlockSize.getBATEntriesPerBlock();
      this._values = new int[_entries_per_block];
      this._has_free_sectors = true;
      Arrays.fill(this._values, -1);
   }

   private BATBlock(POIFSBigBlockSize bigBlockSize, int[] entries, int start_index, int end_index) {
      this(bigBlockSize);

      for(int k = start_index; k < end_index; ++k) {
         this._values[k - start_index] = entries[k];
      }

      if(end_index - start_index == this._values.length) {
         this.recomputeFree();
      }

   }

   private void recomputeFree() {
      boolean hasFree = false;

      for(int k = 0; k < this._values.length; ++k) {
         if(this._values[k] == -1) {
            hasFree = true;
            break;
         }
      }

      this._has_free_sectors = hasFree;
   }

   public static BATBlock createBATBlock(POIFSBigBlockSize bigBlockSize, ByteBuffer data) {
      BATBlock block = new BATBlock(bigBlockSize);
      byte[] buffer = new byte[4];

      for(int i = 0; i < block._values.length; ++i) {
         data.get(buffer);
         block._values[i] = LittleEndian.getInt(buffer);
      }

      block.recomputeFree();
      return block;
   }

   public static BATBlock createEmptyBATBlock(POIFSBigBlockSize bigBlockSize, boolean isXBAT) {
      BATBlock block = new BATBlock(bigBlockSize);
      if(isXBAT) {
         block.setXBATChain(bigBlockSize, -2);
      }

      return block;
   }

   public static BATBlock[] createBATBlocks(POIFSBigBlockSize bigBlockSize, int[] entries) {
      int block_count = calculateStorageRequirements(bigBlockSize, entries.length);
      BATBlock[] blocks = new BATBlock[block_count];
      int index = 0;
      int remaining = entries.length;
      int _entries_per_block = bigBlockSize.getBATEntriesPerBlock();

      for(int j = 0; j < entries.length; j += _entries_per_block) {
         blocks[index++] = new BATBlock(bigBlockSize, entries, j, remaining > _entries_per_block?j + _entries_per_block:entries.length);
         remaining -= _entries_per_block;
      }

      return blocks;
   }

   public static BATBlock[] createXBATBlocks(POIFSBigBlockSize bigBlockSize, int[] entries, int startBlock) {
      int block_count = calculateXBATStorageRequirements(bigBlockSize, entries.length);
      BATBlock[] blocks = new BATBlock[block_count];
      int index = 0;
      int remaining = entries.length;
      int _entries_per_xbat_block = bigBlockSize.getXBATEntriesPerBlock();
      if(block_count != 0) {
         for(int j = 0; j < entries.length; j += _entries_per_xbat_block) {
            blocks[index++] = new BATBlock(bigBlockSize, entries, j, remaining > _entries_per_xbat_block?j + _entries_per_xbat_block:entries.length);
            remaining -= _entries_per_xbat_block;
         }

         for(index = 0; index < blocks.length - 1; ++index) {
            blocks[index].setXBATChain(bigBlockSize, startBlock + index + 1);
         }

         blocks[index].setXBATChain(bigBlockSize, -2);
      }

      return blocks;
   }

   public static int calculateStorageRequirements(POIFSBigBlockSize bigBlockSize, int entryCount) {
      int _entries_per_block = bigBlockSize.getBATEntriesPerBlock();
      return (entryCount + _entries_per_block - 1) / _entries_per_block;
   }

   public static int calculateXBATStorageRequirements(POIFSBigBlockSize bigBlockSize, int entryCount) {
      int _entries_per_xbat_block = bigBlockSize.getXBATEntriesPerBlock();
      return (entryCount + _entries_per_xbat_block - 1) / _entries_per_xbat_block;
   }

   public static long calculateMaximumSize(POIFSBigBlockSize bigBlockSize, int numBATs) {
      long size = 1L;
      size += (long)numBATs * (long)bigBlockSize.getBATEntriesPerBlock();
      return size * (long)bigBlockSize.getBigBlockSize();
   }

   public static long calculateMaximumSize(HeaderBlock header) {
      return calculateMaximumSize(header.getBigBlockSize(), header.getBATCount());
   }

   public static BATBlock.BATBlockAndIndex getBATBlockAndIndex(int offset, HeaderBlock header, List bats) {
      POIFSBigBlockSize bigBlockSize = header.getBigBlockSize();
      int entriesPerBlock = bigBlockSize.getBATEntriesPerBlock();
      int whichBAT = offset / entriesPerBlock;
      int index = offset % entriesPerBlock;
      return new BATBlock.BATBlockAndIndex(index, (BATBlock)bats.get(whichBAT), (BATBlock.NamelessClass1269506864)null);
   }

   public static BATBlock.BATBlockAndIndex getSBATBlockAndIndex(int offset, HeaderBlock header, List sbats) {
      POIFSBigBlockSize bigBlockSize = header.getBigBlockSize();
      int entriesPerBlock = bigBlockSize.getBATEntriesPerBlock();
      int whichSBAT = offset / entriesPerBlock;
      int index = offset % entriesPerBlock;
      return new BATBlock.BATBlockAndIndex(index, (BATBlock)sbats.get(whichSBAT), (BATBlock.NamelessClass1269506864)null);
   }

   private void setXBATChain(POIFSBigBlockSize bigBlockSize, int chainIndex) {
      int _entries_per_xbat_block = bigBlockSize.getXBATEntriesPerBlock();
      this._values[_entries_per_xbat_block] = chainIndex;
   }

   public boolean hasFreeSectors() {
      return this._has_free_sectors;
   }

   public int getUsedSectors(boolean isAnXBAT) {
      int usedSectors = 0;
      int toCheck = this._values.length;
      if(isAnXBAT) {
         --toCheck;
      }

      for(int k = 0; k < toCheck; ++k) {
         if(this._values[k] != -1) {
            ++usedSectors;
         }
      }

      return usedSectors;
   }

   public int getValueAt(int relativeOffset) {
      if(relativeOffset >= this._values.length) {
         throw new ArrayIndexOutOfBoundsException("Unable to fetch offset " + relativeOffset + " as the " + "BAT only contains " + this._values.length + " entries");
      } else {
         return this._values[relativeOffset];
      }
   }

   public void setValueAt(int relativeOffset, int value) {
      int oldValue = this._values[relativeOffset];
      this._values[relativeOffset] = value;
      if(value == -1) {
         this._has_free_sectors = true;
      } else {
         if(oldValue == -1) {
            this.recomputeFree();
         }

      }
   }

   public void setOurBlockIndex(int index) {
      this.ourBlockIndex = index;
   }

   public int getOurBlockIndex() {
      return this.ourBlockIndex;
   }

   void writeData(OutputStream stream) throws IOException {
      stream.write(this.serialize());
   }

   void writeData(ByteBuffer block) throws IOException {
      block.put(this.serialize());
   }

   private byte[] serialize() {
      byte[] data = new byte[this.bigBlockSize.getBigBlockSize()];
      int offset = 0;

      for(int i = 0; i < this._values.length; ++i) {
         LittleEndian.putInt(data, offset, this._values[i]);
         offset += 4;
      }

      return data;
   }

   public static class BATBlockAndIndex {

      private final int index;
      private final BATBlock block;


      private BATBlockAndIndex(int index, BATBlock block) {
         this.index = index;
         this.block = block;
      }

      public int getIndex() {
         return this.index;
      }

      public BATBlock getBlock() {
         return this.block;
      }

      // $FF: synthetic method
      BATBlockAndIndex(int x0, BATBlock x1, BATBlock.NamelessClass1269506864 x2) {
         this(x0, x1);
      }
   }

   // $FF: synthetic class
   static class NamelessClass1269506864 {
   }
}
