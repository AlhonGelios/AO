package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.filesystem.BATManaged;
import org.apache.poi.poifs.filesystem.OPOIFSDocument;
import org.apache.poi.poifs.property.RootProperty;
import org.apache.poi.poifs.storage.BlockAllocationTableWriter;
import org.apache.poi.poifs.storage.BlockWritable;
import org.apache.poi.poifs.storage.SmallDocumentBlock;

public class SmallBlockTableWriter implements BlockWritable, BATManaged {

   private BlockAllocationTableWriter _sbat;
   private List _small_blocks;
   private int _big_block_count;
   private RootProperty _root;


   public SmallBlockTableWriter(POIFSBigBlockSize bigBlockSize, List documents, RootProperty root) {
      this._sbat = new BlockAllocationTableWriter(bigBlockSize);
      this._small_blocks = new ArrayList();
      this._root = root;
      Iterator i$ = documents.iterator();

      while(i$.hasNext()) {
         OPOIFSDocument doc = (OPOIFSDocument)i$.next();
         SmallDocumentBlock[] blocks = doc.getSmallBlocks();
         if(blocks.length != 0) {
            doc.setStartBlock(this._sbat.allocateSpace(blocks.length));

            for(int j = 0; j < blocks.length; ++j) {
               this._small_blocks.add(blocks[j]);
            }
         } else {
            doc.setStartBlock(-2);
         }
      }

      this._sbat.simpleCreateBlocks();
      this._root.setSize(this._small_blocks.size());
      this._big_block_count = SmallDocumentBlock.fill(bigBlockSize, this._small_blocks);
   }

   public int getSBATBlockCount() {
      return (this._big_block_count + 15) / 16;
   }

   public BlockAllocationTableWriter getSBAT() {
      return this._sbat;
   }

   public int countBlocks() {
      return this._big_block_count;
   }

   public void setStartBlock(int start_block) {
      this._root.setStartBlock(start_block);
   }

   public void writeBlocks(OutputStream stream) throws IOException {
      Iterator i$ = this._small_blocks.iterator();

      while(i$.hasNext()) {
         BlockWritable block = (BlockWritable)i$.next();
         block.writeBlocks(stream);
      }

   }
}
