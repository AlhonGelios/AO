package org.apache.commons.collections4.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class PermutationIterator implements Iterator {

   private int[] keys;
   private Map objectMap;
   private boolean[] direction;
   private List nextPermutation;


   public PermutationIterator(Collection coll) {
      if(coll == null) {
         throw new NullPointerException("The collection must not be null");
      } else {
         this.keys = new int[coll.size()];
         this.direction = new boolean[coll.size()];
         Arrays.fill(this.direction, false);
         int value = 1;
         this.objectMap = new HashMap();

         for(Iterator i$ = coll.iterator(); i$.hasNext(); this.keys[value - 1] = value++) {
            Object e = i$.next();
            this.objectMap.put(Integer.valueOf(value), e);
         }

         this.nextPermutation = new ArrayList(coll);
      }
   }

   public boolean hasNext() {
      return this.nextPermutation != null;
   }

   public List next() {
      if(!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         int indexOfLargestMobileInteger = -1;
         int largestKey = -1;

         int offset;
         for(offset = 0; offset < this.keys.length; ++offset) {
            if((this.direction[offset] && offset < this.keys.length - 1 && this.keys[offset] > this.keys[offset + 1] || !this.direction[offset] && offset > 0 && this.keys[offset] > this.keys[offset - 1]) && this.keys[offset] > largestKey) {
               largestKey = this.keys[offset];
               indexOfLargestMobileInteger = offset;
            }
         }

         if(largestKey == -1) {
            List var8 = this.nextPermutation;
            this.nextPermutation = null;
            return var8;
         } else {
            offset = this.direction[indexOfLargestMobileInteger]?1:-1;
            int tmpKey = this.keys[indexOfLargestMobileInteger];
            this.keys[indexOfLargestMobileInteger] = this.keys[indexOfLargestMobileInteger + offset];
            this.keys[indexOfLargestMobileInteger + offset] = tmpKey;
            boolean tmpDirection = this.direction[indexOfLargestMobileInteger];
            this.direction[indexOfLargestMobileInteger] = this.direction[indexOfLargestMobileInteger + offset];
            this.direction[indexOfLargestMobileInteger + offset] = tmpDirection;
            ArrayList nextP = new ArrayList();

            for(int result = 0; result < this.keys.length; ++result) {
               if(this.keys[result] > largestKey) {
                  this.direction[result] = !this.direction[result];
               }

               nextP.add(this.objectMap.get(Integer.valueOf(this.keys[result])));
            }

            List var9 = this.nextPermutation;
            this.nextPermutation = nextP;
            return var9;
         }
      }
   }

   public void remove() {
      throw new UnsupportedOperationException("remove() is not supported");
   }
}
