package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.storage.BlockWritable;

abstract class BigBlock implements BlockWritable {

   protected POIFSBigBlockSize bigBlockSize;


   protected BigBlock(POIFSBigBlockSize bigBlockSize) {
      this.bigBlockSize = bigBlockSize;
   }

   protected void doWriteData(OutputStream stream, byte[] data) throws IOException {
      stream.write(data);
   }

   abstract void writeData(OutputStream var1) throws IOException;

   public void writeBlocks(OutputStream stream) throws IOException {
      this.writeData(stream);
   }
}
