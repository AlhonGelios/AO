package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.collections4.Get;
import org.apache.commons.collections4.IterableGet;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.Put;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.collection.UnmodifiableCollection;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.map.EntrySetToMapIteratorAdapter;
import org.apache.commons.collections4.map.UnmodifiableEntrySet;
import org.apache.commons.collections4.set.UnmodifiableSet;

public class SplitMapUtils {

   public static IterableMap readableMap(Get get) {
      if(get == null) {
         throw new NullPointerException("Get must not be null");
      } else {
         return (IterableMap)(get instanceof Map?(get instanceof IterableMap?(IterableMap)get:MapUtils.iterableMap((Map)get)):new SplitMapUtils.WrappedGet(get, (SplitMapUtils.NamelessClass1118356505)null));
      }
   }

   public static Map writableMap(Put put) {
      if(put == null) {
         throw new NullPointerException("Put must not be null");
      } else {
         return (Map)(put instanceof Map?(Map)put:new SplitMapUtils.WrappedPut(put, (SplitMapUtils.NamelessClass1118356505)null));
      }
   }

   private static class WrappedGet implements IterableMap, Unmodifiable {

      private final Get get;


      private WrappedGet(Get get) {
         this.get = get;
      }

      public void clear() {
         throw new UnsupportedOperationException();
      }

      public boolean containsKey(Object key) {
         return this.get.containsKey(key);
      }

      public boolean containsValue(Object value) {
         return this.get.containsValue(value);
      }

      public Set entrySet() {
         return UnmodifiableEntrySet.unmodifiableEntrySet(this.get.entrySet());
      }

      public boolean equals(Object arg0) {
         return arg0 == this?true:arg0 instanceof SplitMapUtils.WrappedGet && ((SplitMapUtils.WrappedGet)arg0).get.equals(this.get);
      }

      public Object get(Object key) {
         return this.get.get(key);
      }

      public int hashCode() {
         return "WrappedGet".hashCode() << 4 | this.get.hashCode();
      }

      public boolean isEmpty() {
         return this.get.isEmpty();
      }

      public Set keySet() {
         return UnmodifiableSet.unmodifiableSet(this.get.keySet());
      }

      public Object put(Object key, Object value) {
         throw new UnsupportedOperationException();
      }

      public void putAll(Map t) {
         throw new UnsupportedOperationException();
      }

      public Object remove(Object key) {
         return this.get.remove(key);
      }

      public int size() {
         return this.get.size();
      }

      public Collection values() {
         return UnmodifiableCollection.unmodifiableCollection(this.get.values());
      }

      public MapIterator mapIterator() {
         Object it;
         if(this.get instanceof IterableGet) {
            it = ((IterableGet)this.get).mapIterator();
         } else {
            it = new EntrySetToMapIteratorAdapter(this.get.entrySet());
         }

         return UnmodifiableMapIterator.unmodifiableMapIterator((MapIterator)it);
      }

      // $FF: synthetic method
      WrappedGet(Get x0, SplitMapUtils.NamelessClass1118356505 x1) {
         this(x0);
      }
   }

   // $FF: synthetic class
   static class NamelessClass1118356505 {
   }

   private static class WrappedPut implements Map, Put {

      private final Put put;


      private WrappedPut(Put put) {
         this.put = put;
      }

      public void clear() {
         this.put.clear();
      }

      public boolean containsKey(Object key) {
         throw new UnsupportedOperationException();
      }

      public boolean containsValue(Object value) {
         throw new UnsupportedOperationException();
      }

      public Set entrySet() {
         throw new UnsupportedOperationException();
      }

      public boolean equals(Object obj) {
         return obj == this?true:obj instanceof SplitMapUtils.WrappedPut && ((SplitMapUtils.WrappedPut)obj).put.equals(this.put);
      }

      public Object get(Object key) {
         throw new UnsupportedOperationException();
      }

      public int hashCode() {
         return "WrappedPut".hashCode() << 4 | this.put.hashCode();
      }

      public boolean isEmpty() {
         throw new UnsupportedOperationException();
      }

      public Set keySet() {
         throw new UnsupportedOperationException();
      }

      public Object put(Object key, Object value) {
         return this.put.put(key, value);
      }

      public void putAll(Map t) {
         this.put.putAll(t);
      }

      public Object remove(Object key) {
         throw new UnsupportedOperationException();
      }

      public int size() {
         throw new UnsupportedOperationException();
      }

      public Collection values() {
         throw new UnsupportedOperationException();
      }

      // $FF: synthetic method
      WrappedPut(Put x0, SplitMapUtils.NamelessClass1118356505 x1) {
         this(x0);
      }
   }
}
