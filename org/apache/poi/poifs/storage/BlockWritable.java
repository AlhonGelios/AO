package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.OutputStream;

public interface BlockWritable {

   void writeBlocks(OutputStream var1) throws IOException;
}
