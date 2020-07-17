package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.storage.BlockListImpl;
import org.apache.poi.poifs.storage.ListManagedBlock;
import org.apache.poi.poifs.storage.RawDataBlock;

public class RawDataBlockList extends BlockListImpl {

   public RawDataBlockList(InputStream stream, POIFSBigBlockSize bigBlockSize) throws IOException {
      ArrayList blocks = new ArrayList();

      RawDataBlock block;
      do {
         block = new RawDataBlock(stream, bigBlockSize.getBigBlockSize());
         if(block.hasData()) {
            blocks.add(block);
         }
      } while(!block.eof());

      this.setBlocks((ListManagedBlock[])blocks.toArray(new RawDataBlock[blocks.size()]));
   }
}
