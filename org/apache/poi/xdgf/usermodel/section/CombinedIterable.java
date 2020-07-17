package org.apache.poi.xdgf.usermodel.section;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.Map.Entry;

public class CombinedIterable implements Iterable {

   final SortedMap _baseItems;
   final SortedMap _masterItems;


   public CombinedIterable(SortedMap baseItems, SortedMap masterItems) {
      this._baseItems = baseItems;
      this._masterItems = masterItems;
   }

   public Iterator iterator() {
      final Iterator vmasterI;
      if(this._masterItems != null) {
         vmasterI = this._masterItems.entrySet().iterator();
      } else {
         Set empty = Collections.emptySet();
         vmasterI = empty.iterator();
      }

      return new Iterator() {

         Long lastI = Long.valueOf(Long.MIN_VALUE);
         Entry currentBase = null;
         Entry currentMaster = null;
         Iterator baseI;
         Iterator masterI;

         {
            this.baseI = CombinedIterable.this._baseItems.entrySet().iterator();
            this.masterI = vmasterI;
         }
         public boolean hasNext() {
            return this.currentBase != null || this.currentMaster != null || this.baseI.hasNext() || this.masterI.hasNext();
         }
         public Object next() {
            long baseIdx = Long.MAX_VALUE;
            long masterIdx = Long.MAX_VALUE;
            if(this.currentBase == null) {
               while(this.baseI.hasNext()) {
                  this.currentBase = (Entry)this.baseI.next();
                  if(((Long)this.currentBase.getKey()).longValue() > this.lastI.longValue()) {
                     baseIdx = ((Long)this.currentBase.getKey()).longValue();
                     break;
                  }
               }
            } else {
               baseIdx = ((Long)this.currentBase.getKey()).longValue();
            }

            if(this.currentMaster == null) {
               while(this.masterI.hasNext()) {
                  this.currentMaster = (Entry)this.masterI.next();
                  if(((Long)this.currentMaster.getKey()).longValue() > this.lastI.longValue()) {
                     masterIdx = ((Long)this.currentMaster.getKey()).longValue();
                     break;
                  }
               }
            } else {
               masterIdx = ((Long)this.currentMaster.getKey()).longValue();
            }

            Object val;
            if(this.currentBase != null) {
               if(baseIdx <= masterIdx) {
                  this.lastI = Long.valueOf(baseIdx);
                  val = this.currentBase.getValue();
                  if(masterIdx == baseIdx) {
                     this.currentMaster = null;
                  }

                  this.currentBase = null;
               } else {
                  this.lastI = Long.valueOf(masterIdx);
                  val = this.currentMaster.getValue();
                  this.currentMaster = null;
               }
            } else {
               if(this.currentMaster == null) {
                  throw new NoSuchElementException();
               }

               this.lastI = (Long)this.currentMaster.getKey();
               val = this.currentMaster.getValue();
               this.currentMaster = null;
            }

            return val;
         }
         public void remove() {
            throw new UnsupportedOperationException();
         }
      };
   }
}
