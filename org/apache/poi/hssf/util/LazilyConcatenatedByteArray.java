package org.apache.poi.hssf.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LazilyConcatenatedByteArray {

   private final List arrays = new ArrayList(1);


   public void clear() {
      this.arrays.clear();
   }

   public void concatenate(byte[] array) {
      if(array == null) {
         throw new IllegalArgumentException("array cannot be null");
      } else {
         this.arrays.add(array);
      }
   }

   public byte[] toArray() {
      if(this.arrays.isEmpty()) {
         return null;
      } else {
         if(this.arrays.size() > 1) {
            int totalLength = 0;

            byte[] destPos;
            for(Iterator concatenated = this.arrays.iterator(); concatenated.hasNext(); totalLength += destPos.length) {
               destPos = (byte[])concatenated.next();
            }

            byte[] concatenated1 = new byte[totalLength];
            int destPos1 = 0;

            byte[] array;
            for(Iterator i$ = this.arrays.iterator(); i$.hasNext(); destPos1 += array.length) {
               array = (byte[])i$.next();
               System.arraycopy(array, 0, concatenated1, destPos1, array.length);
            }

            this.arrays.clear();
            this.arrays.add(concatenated1);
         }

         return (byte[])this.arrays.get(0);
      }
   }
}
