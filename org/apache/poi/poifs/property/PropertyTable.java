package org.apache.poi.poifs.property;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.poifs.property.PropertyFactory;
import org.apache.poi.poifs.property.PropertyTableBase;
import org.apache.poi.poifs.storage.BlockWritable;
import org.apache.poi.poifs.storage.HeaderBlock;
import org.apache.poi.poifs.storage.PropertyBlock;
import org.apache.poi.poifs.storage.RawDataBlockList;

public final class PropertyTable extends PropertyTableBase implements BlockWritable {

   private POIFSBigBlockSize _bigBigBlockSize;
   private BlockWritable[] _blocks;


   public PropertyTable(HeaderBlock headerBlock) {
      super(headerBlock);
      this._bigBigBlockSize = headerBlock.getBigBlockSize();
      this._blocks = null;
   }

   public PropertyTable(HeaderBlock headerBlock, RawDataBlockList blockList) throws IOException {
      super(headerBlock, PropertyFactory.convertToProperties(blockList.fetchBlocks(headerBlock.getPropertyStart(), -1)));
      this._bigBigBlockSize = headerBlock.getBigBlockSize();
      this._blocks = null;
   }

   public void preWrite() {
      Property[] properties = (Property[])this._properties.toArray(new Property[this._properties.size()]);

      int k;
      for(k = 0; k < properties.length; ++k) {
         properties[k].setIndex(k);
      }

      this._blocks = PropertyBlock.createPropertyBlockArray(this._bigBigBlockSize, this._properties);

      for(k = 0; k < properties.length; ++k) {
         properties[k].preWrite();
      }

   }

   public int countBlocks() {
      return this._blocks == null?0:this._blocks.length;
   }

   public void writeBlocks(OutputStream stream) throws IOException {
      if(this._blocks != null) {
         for(int j = 0; j < this._blocks.length; ++j) {
            this._blocks[j].writeBlocks(stream);
         }
      }

   }
}
