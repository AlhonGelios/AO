package org.apache.commons.collections4.map;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.collections4.KeyValue;
import org.apache.commons.collections4.map.AbstractIterableMap;

public final class StaticBucketMap extends AbstractIterableMap {

   private static final int DEFAULT_BUCKETS = 255;
   private final StaticBucketMap.Node[] buckets;
   private final StaticBucketMap.Lock[] locks;


   public StaticBucketMap() {
      this(255);
   }

   public StaticBucketMap(int numBuckets) {
      int size = Math.max(17, numBuckets);
      if(size % 2 == 0) {
         --size;
      }

      this.buckets = new StaticBucketMap.Node[size];
      this.locks = new StaticBucketMap.Lock[size];

      for(int i = 0; i < size; ++i) {
         this.locks[i] = new StaticBucketMap.Lock((StaticBucketMap.NamelessClass824290570)null);
      }

   }

   private int getHash(Object key) {
      if(key == null) {
         return 0;
      } else {
         int hash = key.hashCode();
         hash += ~(hash << 15);
         hash ^= hash >>> 10;
         hash += hash << 3;
         hash ^= hash >>> 6;
         hash += ~(hash << 11);
         hash ^= hash >>> 16;
         hash %= this.buckets.length;
         return hash < 0?hash * -1:hash;
      }
   }

   public int size() {
      int cnt = 0;

      for(int i = 0; i < this.buckets.length; ++i) {
         synchronized(this.locks[i]) {
            cnt += this.locks[i].size;
         }
      }

      return cnt;
   }

   public boolean isEmpty() {
      return this.size() == 0;
   }

   public Object get(Object key) {
      int hash = this.getHash(key);
      synchronized(this.locks[hash]) {
         for(StaticBucketMap.Node n = this.buckets[hash]; n != null; n = n.next) {
            if(n.key == key || n.key != null && n.key.equals(key)) {
               return n.value;
            }
         }

         return null;
      }
   }

   public boolean containsKey(Object key) {
      int hash = this.getHash(key);
      synchronized(this.locks[hash]) {
         for(StaticBucketMap.Node n = this.buckets[hash]; n != null; n = n.next) {
            if(n.key == key || n.key != null && n.key.equals(key)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean containsValue(Object value) {
      for(int i = 0; i < this.buckets.length; ++i) {
         synchronized(this.locks[i]) {
            for(StaticBucketMap.Node n = this.buckets[i]; n != null; n = n.next) {
               if(n.value == value || n.value != null && n.value.equals(value)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public Object put(Object key, Object value) {
      int hash = this.getHash(key);
      synchronized(this.locks[hash]) {
         StaticBucketMap.Node n = this.buckets[hash];
         if(n == null) {
            n = new StaticBucketMap.Node((StaticBucketMap.NamelessClass824290570)null);
            n.key = key;
            n.value = value;
            this.buckets[hash] = n;
            ++this.locks[hash].size;
            return null;
         } else {
            StaticBucketMap.Node newNode;
            for(newNode = n; newNode != null; newNode = newNode.next) {
               n = newNode;
               if(newNode.key == key || newNode.key != null && newNode.key.equals(key)) {
                  Object returnVal = newNode.value;
                  newNode.value = value;
                  return returnVal;
               }
            }

            newNode = new StaticBucketMap.Node((StaticBucketMap.NamelessClass824290570)null);
            newNode.key = key;
            newNode.value = value;
            n.next = newNode;
            ++this.locks[hash].size;
            return null;
         }
      }
   }

   public Object remove(Object key) {
      int hash = this.getHash(key);
      synchronized(this.locks[hash]) {
         StaticBucketMap.Node n = this.buckets[hash];

         for(StaticBucketMap.Node prev = null; n != null; n = n.next) {
            if(n.key == key || n.key != null && n.key.equals(key)) {
               if(null == prev) {
                  this.buckets[hash] = n.next;
               } else {
                  prev.next = n.next;
               }

               --this.locks[hash].size;
               return n.value;
            }

            prev = n;
         }

         return null;
      }
   }

   public Set keySet() {
      return new StaticBucketMap.KeySet((StaticBucketMap.NamelessClass824290570)null);
   }

   public Collection values() {
      return new StaticBucketMap.Values((StaticBucketMap.NamelessClass824290570)null);
   }

   public Set entrySet() {
      return new StaticBucketMap.EntrySet((StaticBucketMap.NamelessClass824290570)null);
   }

   public void putAll(Map map) {
      Iterator i$ = map.entrySet().iterator();

      while(i$.hasNext()) {
         Entry entry = (Entry)i$.next();
         this.put(entry.getKey(), entry.getValue());
      }

   }

   public void clear() {
      for(int i = 0; i < this.buckets.length; ++i) {
         StaticBucketMap.Lock lock = this.locks[i];
         synchronized(lock) {
            this.buckets[i] = null;
            lock.size = 0;
         }
      }

   }

   public boolean equals(Object obj) {
      if(obj == this) {
         return true;
      } else if(!(obj instanceof Map)) {
         return false;
      } else {
         Map other = (Map)obj;
         return this.entrySet().equals(other.entrySet());
      }
   }

   public int hashCode() {
      int hashCode = 0;

      for(int i = 0; i < this.buckets.length; ++i) {
         synchronized(this.locks[i]) {
            for(StaticBucketMap.Node n = this.buckets[i]; n != null; n = n.next) {
               hashCode += n.hashCode();
            }
         }
      }

      return hashCode;
   }

   public void atomic(Runnable r) {
      if(r == null) {
         throw new NullPointerException();
      } else {
         this.atomic(r, 0);
      }
   }

   private void atomic(Runnable r, int bucket) {
      if(bucket >= this.buckets.length) {
         r.run();
      } else {
         synchronized(this.locks[bucket]) {
            this.atomic(r, bucket + 1);
         }
      }
   }

   private class Values extends AbstractCollection {

      private Values() {}

      public int size() {
         return StaticBucketMap.this.size();
      }

      public void clear() {
         StaticBucketMap.this.clear();
      }

      public Iterator iterator() {
         return StaticBucketMap.this.new ValueIterator((StaticBucketMap.NamelessClass824290570)null);
      }

      // $FF: synthetic method
      Values(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   private class KeyIterator extends StaticBucketMap.BaseIterator implements Iterator {

      private KeyIterator() {
         super((StaticBucketMap.NamelessClass824290570)null);
      }

      public Object next() {
         return this.nextEntry().getKey();
      }

      // $FF: synthetic method
      KeyIterator(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   // $FF: synthetic class
   static class NamelessClass824290570 {
   }

   private class BaseIterator {

      private final ArrayList current;
      private int bucket;
      private Entry last;


      private BaseIterator() {
         this.current = new ArrayList();
      }

      public boolean hasNext() {
         if(this.current.size() > 0) {
            return true;
         } else {
            while(this.bucket < StaticBucketMap.this.buckets.length) {
               synchronized(StaticBucketMap.this.locks[this.bucket]) {
                  for(StaticBucketMap.Node n = StaticBucketMap.this.buckets[this.bucket]; n != null; n = n.next) {
                     this.current.add(n);
                  }

                  ++this.bucket;
                  if(this.current.size() > 0) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      protected Entry nextEntry() {
         if(!this.hasNext()) {
            throw new NoSuchElementException();
         } else {
            this.last = (Entry)this.current.remove(this.current.size() - 1);
            return this.last;
         }
      }

      public void remove() {
         if(this.last == null) {
            throw new IllegalStateException();
         } else {
            StaticBucketMap.this.remove(this.last.getKey());
            this.last = null;
         }
      }

      // $FF: synthetic method
      BaseIterator(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   private class KeySet extends AbstractSet {

      private KeySet() {}

      public int size() {
         return StaticBucketMap.this.size();
      }

      public void clear() {
         StaticBucketMap.this.clear();
      }

      public Iterator iterator() {
         return StaticBucketMap.this.new KeyIterator((StaticBucketMap.NamelessClass824290570)null);
      }

      public boolean contains(Object obj) {
         return StaticBucketMap.this.containsKey(obj);
      }

      public boolean remove(Object obj) {
         int hash = StaticBucketMap.this.getHash(obj);
         synchronized(StaticBucketMap.this.locks[hash]) {
            for(StaticBucketMap.Node n = StaticBucketMap.this.buckets[hash]; n != null; n = n.next) {
               Object k = n.getKey();
               if(k == obj || k != null && k.equals(obj)) {
                  StaticBucketMap.this.remove(k);
                  return true;
               }
            }

            return false;
         }
      }

      // $FF: synthetic method
      KeySet(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   private class EntrySet extends AbstractSet {

      private EntrySet() {}

      public int size() {
         return StaticBucketMap.this.size();
      }

      public void clear() {
         StaticBucketMap.this.clear();
      }

      public Iterator iterator() {
         return StaticBucketMap.this.new EntryIterator((StaticBucketMap.NamelessClass824290570)null);
      }

      public boolean contains(Object obj) {
         Entry entry = (Entry)obj;
         int hash = StaticBucketMap.this.getHash(entry.getKey());
         synchronized(StaticBucketMap.this.locks[hash]) {
            for(StaticBucketMap.Node n = StaticBucketMap.this.buckets[hash]; n != null; n = n.next) {
               if(n.equals(entry)) {
                  return true;
               }
            }

            return false;
         }
      }

      public boolean remove(Object obj) {
         if(!(obj instanceof Entry)) {
            return false;
         } else {
            Entry entry = (Entry)obj;
            int hash = StaticBucketMap.this.getHash(entry.getKey());
            synchronized(StaticBucketMap.this.locks[hash]) {
               for(StaticBucketMap.Node n = StaticBucketMap.this.buckets[hash]; n != null; n = n.next) {
                  if(n.equals(entry)) {
                     StaticBucketMap.this.remove(n.getKey());
                     return true;
                  }
               }

               return false;
            }
         }
      }

      // $FF: synthetic method
      EntrySet(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   private static final class Node implements Entry, KeyValue {

      protected Object key;
      protected Object value;
      protected StaticBucketMap.Node next;


      private Node() {}

      public Object getKey() {
         return this.key;
      }

      public Object getValue() {
         return this.value;
      }

      public int hashCode() {
         return (this.key == null?0:this.key.hashCode()) ^ (this.value == null?0:this.value.hashCode());
      }

      public boolean equals(Object obj) {
         if(obj == this) {
            return true;
         } else if(!(obj instanceof Entry)) {
            return false;
         } else {
            boolean var10000;
            label44: {
               Entry e2 = (Entry)obj;
               if(this.key == null) {
                  if(e2.getKey() != null) {
                     break label44;
                  }
               } else if(!this.key.equals(e2.getKey())) {
                  break label44;
               }

               if(this.value == null) {
                  if(e2.getValue() != null) {
                     break label44;
                  }
               } else if(!this.value.equals(e2.getValue())) {
                  break label44;
               }

               var10000 = true;
               return var10000;
            }

            var10000 = false;
            return var10000;
         }
      }

      public Object setValue(Object obj) {
         Object retVal = this.value;
         this.value = obj;
         return retVal;
      }

      // $FF: synthetic method
      Node(StaticBucketMap.NamelessClass824290570 x0) {
         this();
      }
   }

   private class ValueIterator extends StaticBucketMap.BaseIterator implements Iterator {

      private ValueIterator() {
         super((StaticBucketMap.NamelessClass824290570)null);
      }

      public Object next() {
         return this.nextEntry().getValue();
      }

      // $FF: synthetic method
      ValueIterator(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   private class EntryIterator extends StaticBucketMap.BaseIterator implements Iterator {

      private EntryIterator() {
         super((StaticBucketMap.NamelessClass824290570)null);
      }

      public Entry next() {
         return this.nextEntry();
      }

      // $FF: synthetic method
      EntryIterator(StaticBucketMap.NamelessClass824290570 x1) {
         this();
      }
   }

   private static final class Lock {

      public int size;


      private Lock() {}

      // $FF: synthetic method
      Lock(StaticBucketMap.NamelessClass824290570 x0) {
         this();
      }
   }
}
