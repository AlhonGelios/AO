package org.apache.poi.poifs.storage;

import java.io.IOException;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.property.RootProperty;
import org.apache.poi.poifs.storage.BlockAllocationTableReader;
import org.apache.poi.poifs.storage.BlockList;
import org.apache.poi.poifs.storage.ListManagedBlock;
import org.apache.poi.poifs.storage.RawDataBlockList;
import org.apache.poi.poifs.storage.SmallDocumentBlock;
import org.apache.poi.poifs.storage.SmallDocumentBlockList;

public final class SmallBlockTableReader {

   private static BlockList prepareSmallDocumentBlocks(POIFSBigBlockSize bigBlockSize, RawDataBlockList blockList, RootProperty root, int sbatStart) throws IOException {
      ListManagedBlock[] smallBlockBlocks = blockList.fetchBlocks(root.getStartBlock(), -1);
      SmallDocumentBlockList list = new SmallDocumentBlockList(SmallDocumentBlock.extract(bigBlockSize, smallBlockBlocks));
      return list;
   }

   private static BlockAllocationTableReader prepareReader(POIFSBigBlockSize bigBlockSize, RawDataBlockList blockList, BlockList list, RootProperty root, int sbatStart) throws IOException {
      return new BlockAllocationTableReader(bigBlockSize, blockList.fetchBlocks(sbatStart, -1), list);
   }

   public static BlockAllocationTableReader _getSmallDocumentBlockReader(POIFSBigBlockSize bigBlockSize, RawDataBlockList blockList, RootProperty root, int sbatStart) throws IOException {
      BlockList list = prepareSmallDocumentBlocks(bigBlockSize, blockList, root, sbatStart);
      return prepareReader(bigBlockSize, blockList, list, root, sbatStart);
   }

   public static BlockList getSmallDocumentBlocks(POIFSBigBlockSize bigBlockSize, RawDataBlockList blockList, RootProperty root, int sbatStart) throws IOException {
      BlockList list = prepareSmallDocumentBlocks(bigBlockSize, blockList, root, sbatStart);
      prepareReader(bigBlockSize, blockList, list, root, sbatStart);
      return list;
   }
}
