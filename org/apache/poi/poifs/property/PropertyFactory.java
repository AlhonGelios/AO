package org.apache.poi.poifs.property;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.poifs.property.DirectoryProperty;
import org.apache.poi.poifs.property.DocumentProperty;
import org.apache.poi.poifs.property.RootProperty;
import org.apache.poi.poifs.storage.ListManagedBlock;

class PropertyFactory {

   static List convertToProperties(ListManagedBlock[] blocks) throws IOException {
      ArrayList properties = new ArrayList();

      for(int j = 0; j < blocks.length; ++j) {
         byte[] data = blocks[j].getData();
         convertToProperties(data, properties);
      }

      return properties;
   }

   static void convertToProperties(byte[] data, List properties) throws IOException {
      int property_count = data.length / 128;
      int offset = 0;

      for(int k = 0; k < property_count; ++k) {
         switch(data[offset + 66]) {
         case 1:
            properties.add(new DirectoryProperty(properties.size(), data, offset));
            break;
         case 2:
            properties.add(new DocumentProperty(properties.size(), data, offset));
            break;
         case 3:
         case 4:
         default:
            properties.add((Object)null);
            break;
         case 5:
            properties.add(new RootProperty(properties.size(), data, offset));
         }

         offset += 128;
      }

   }
}
