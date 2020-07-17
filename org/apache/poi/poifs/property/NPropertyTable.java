package org.apache.poi.poifs.property;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.NPOIFSStream;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.poifs.property.PropertyFactory;
import org.apache.poi.poifs.property.PropertyTableBase;
import org.apache.poi.poifs.storage.HeaderBlock;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class NPropertyTable extends PropertyTableBase {

   private static final POILogger _logger = POILogFactory.getLogger(NPropertyTable.class);
   private POIFSBigBlockSize _bigBigBlockSize;


   public NPropertyTable(HeaderBlock headerBlock) {
      super(headerBlock);
      this._bigBigBlockSize = headerBlock.getBigBlockSize();
   }

   public NPropertyTable(HeaderBlock headerBlock, NPOIFSFileSystem filesystem) throws IOException {
      super(headerBlock, buildProperties((new NPOIFSStream(filesystem, headerBlock.getPropertyStart())).iterator(), headerBlock.getBigBlockSize()));
      this._bigBigBlockSize = headerBlock.getBigBlockSize();
   }

   private static List buildProperties(Iterator dataSource, POIFSBigBlockSize bigBlockSize) throws IOException {
      ArrayList properties;
      byte[] data;
      for(properties = new ArrayList(); dataSource.hasNext(); PropertyFactory.convertToProperties(data, properties)) {
         ByteBuffer bb = (ByteBuffer)dataSource.next();
         if(bb.hasArray() && bb.arrayOffset() == 0 && bb.array().length == bigBlockSize.getBigBlockSize()) {
            data = bb.array();
         } else {
            data = new byte[bigBlockSize.getBigBlockSize()];
            int toRead = data.length;
            if(bb.remaining() < bigBlockSize.getBigBlockSize()) {
               _logger.log(5, new Object[]{"Short Property Block, ", Integer.valueOf(bb.remaining()), " bytes instead of the expected " + bigBlockSize.getBigBlockSize()});
               toRead = bb.remaining();
            }

            bb.get(data, 0, toRead);
         }
      }

      return properties;
   }

   public int countBlocks() {
      long rawSize = (long)(this._properties.size() * 128);
      int blkSize = this._bigBigBlockSize.getBigBlockSize();
      int numBlocks = (int)(rawSize / (long)blkSize);
      if(rawSize % (long)blkSize != 0L) {
         ++numBlocks;
      }

      return numBlocks;
   }

   public void preWrite() {
      ArrayList pList = new ArrayList();
      int i = 0;
      Iterator i$ = this._properties.iterator();

      Property p;
      while(i$.hasNext()) {
         p = (Property)i$.next();
         if(p != null) {
            p.setIndex(i++);
            pList.add(p);
         }
      }

      i$ = pList.iterator();

      while(i$.hasNext()) {
         p = (Property)i$.next();
         p.preWrite();
      }

   }

   public void write(NPOIFSStream stream) throws IOException {
      OutputStream os = stream.getOutputStream();
      Iterator i$ = this._properties.iterator();

      while(i$.hasNext()) {
         Property property = (Property)i$.next();
         if(property != null) {
            property.writeData(os);
         }
      }

      os.close();
      if(this.getStartBlock() != stream.getStartBlock()) {
         this.setStartBlock(stream.getStartBlock());
      }

   }

}
