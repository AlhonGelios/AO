package org.apache.poi.poifs.storage;

import java.util.List;
import org.apache.poi.poifs.storage.BlockListImpl;
import org.apache.poi.poifs.storage.ListManagedBlock;
import org.apache.poi.poifs.storage.SmallDocumentBlock;

public class SmallDocumentBlockList extends BlockListImpl {

   public SmallDocumentBlockList(List blocks) {
      this.setBlocks((ListManagedBlock[])blocks.toArray(new SmallDocumentBlock[blocks.size()]));
   }
}
