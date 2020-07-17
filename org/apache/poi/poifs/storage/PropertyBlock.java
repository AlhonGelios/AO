package org.apache.poi.poifs.storage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.apache.poi.poifs.common.POIFSBigBlockSize;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.poifs.storage.BigBlock;
import org.apache.poi.poifs.storage.BlockWritable;

public final class PropertyBlock extends BigBlock {

   private Property[] _properties;


   private PropertyBlock(POIFSBigBlockSize bigBlockSize, Property[] properties, int offset) {
      super(bigBlockSize);
      this._properties = new Property[bigBlockSize.getPropertiesPerBlock()];

      for(int j = 0; j < this._properties.length; ++j) {
         this._properties[j] = properties[j + offset];
      }

   }

   public static BlockWritable[] createPropertyBlockArray(POIFSBigBlockSize bigBlockSize, List properties) {
      int _properties_per_block = bigBlockSize.getPropertiesPerBlock();
      int block_count = (properties.size() + _properties_per_block - 1) / _properties_per_block;
      Property[] to_be_written = new Property[block_count * _properties_per_block];
      System.arraycopy(properties.toArray(new Property[0]), 0, to_be_written, 0, properties.size());

      for(int rvalue = properties.size(); rvalue < to_be_written.length; ++rvalue) {
         to_be_written[rvalue] = new Property() {
            protected void preWrite() {}
            public boolean isDirectory() {
               return false;
            }
         };
      }

      BlockWritable[] var7 = new BlockWritable[block_count];

      for(int j = 0; j < block_count; ++j) {
         var7[j] = new PropertyBlock(bigBlockSize, to_be_written, j * _properties_per_block);
      }

      return var7;
   }

   void writeData(OutputStream stream) throws IOException {
      int _properties_per_block = this.bigBlockSize.getPropertiesPerBlock();

      for(int j = 0; j < _properties_per_block; ++j) {
         this._properties[j].writeData(stream);
      }

   }
}
