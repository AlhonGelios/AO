package org.apache.poi.util;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.util.BitField;

public class BitFieldFactory {

   private static Map instances = new HashMap();


   public static BitField getInstance(int mask) {
      BitField f = (BitField)instances.get(Integer.valueOf(mask));
      if(f == null) {
         f = new BitField(mask);
         instances.put(Integer.valueOf(mask), f);
      }

      return f;
   }

}
