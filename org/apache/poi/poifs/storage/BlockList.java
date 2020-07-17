package org.apache.poi.poifs.storage;

import java.io.IOException;
import org.apache.poi.poifs.storage.BlockAllocationTableReader;
import org.apache.poi.poifs.storage.ListManagedBlock;

public interface BlockList {

   void zap(int var1);

   ListManagedBlock remove(int var1) throws IOException;

   ListManagedBlock[] fetchBlocks(int var1, int var2) throws IOException;

   void setBAT(BlockAllocationTableReader var1) throws IOException;

   int blockCount();
}
