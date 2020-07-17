package org.apache.poi.ss.formula;

import org.apache.poi.ss.formula.CellCacheEntry;
import org.apache.poi.ss.formula.FormulaCellCacheEntry;

final class FormulaCellCacheEntrySet {

   private static final FormulaCellCacheEntry[] EMPTY_ARRAY = new FormulaCellCacheEntry[0];
   private int _size;
   private FormulaCellCacheEntry[] _arr;


   public FormulaCellCacheEntrySet() {
      this._arr = EMPTY_ARRAY;
   }

   public FormulaCellCacheEntry[] toArray() {
      int nItems = this._size;
      if(nItems < 1) {
         return EMPTY_ARRAY;
      } else {
         FormulaCellCacheEntry[] result = new FormulaCellCacheEntry[nItems];
         int j = 0;

         for(int i = 0; i < this._arr.length; ++i) {
            FormulaCellCacheEntry cce = this._arr[i];
            if(cce != null) {
               result[j++] = cce;
            }
         }

         if(j != nItems) {
            throw new IllegalStateException("size mismatch");
         } else {
            return result;
         }
      }
   }

   public void add(CellCacheEntry cce) {
      if(this._size * 3 >= this._arr.length * 2) {
         FormulaCellCacheEntry[] prevArr = this._arr;
         FormulaCellCacheEntry[] newArr = new FormulaCellCacheEntry[4 + this._arr.length * 3 / 2];

         for(int i = 0; i < prevArr.length; ++i) {
            FormulaCellCacheEntry prevCce = this._arr[i];
            if(prevCce != null) {
               addInternal(newArr, prevCce);
            }
         }

         this._arr = newArr;
      }

      if(addInternal(this._arr, cce)) {
         ++this._size;
      }

   }

   private static boolean addInternal(CellCacheEntry[] arr, CellCacheEntry cce) {
      int startIx = Math.abs(cce.hashCode() % arr.length);

      int i;
      CellCacheEntry item;
      for(i = startIx; i < arr.length; ++i) {
         item = arr[i];
         if(item == cce) {
            return false;
         }

         if(item == null) {
            arr[i] = cce;
            return true;
         }
      }

      for(i = 0; i < startIx; ++i) {
         item = arr[i];
         if(item == cce) {
            return false;
         }

         if(item == null) {
            arr[i] = cce;
            return true;
         }
      }

      throw new IllegalStateException("No empty space found");
   }

   public boolean remove(CellCacheEntry cce) {
      FormulaCellCacheEntry[] arr = this._arr;
      if(this._size * 3 < this._arr.length && this._arr.length > 8) {
         boolean var8 = false;
         FormulaCellCacheEntry[] var9 = this._arr;
         FormulaCellCacheEntry[] var10 = new FormulaCellCacheEntry[this._arr.length / 2];

         for(int i1 = 0; i1 < var9.length; ++i1) {
            FormulaCellCacheEntry prevCce = this._arr[i1];
            if(prevCce != null) {
               if(prevCce == cce) {
                  var8 = true;
                  --this._size;
               } else {
                  addInternal(var10, prevCce);
               }
            }
         }

         this._arr = var10;
         return var8;
      } else {
         int startIx = Math.abs(cce.hashCode() % arr.length);

         int i;
         FormulaCellCacheEntry item;
         for(i = startIx; i < arr.length; ++i) {
            item = arr[i];
            if(item == cce) {
               arr[i] = null;
               --this._size;
               return true;
            }
         }

         for(i = 0; i < startIx; ++i) {
            item = arr[i];
            if(item == cce) {
               arr[i] = null;
               --this._size;
               return true;
            }
         }

         return false;
      }
   }

}
