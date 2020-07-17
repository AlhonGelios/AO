package org.apache.poi.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IntMapper {

   private List elements;
   private Map valueKeyMap;
   private static final int _default_size = 10;


   public IntMapper() {
      this(10);
   }

   public IntMapper(int initialCapacity) {
      this.elements = new ArrayList(initialCapacity);
      this.valueKeyMap = new HashMap(initialCapacity);
   }

   public boolean add(Object value) {
      int index = this.elements.size();
      this.elements.add(value);
      this.valueKeyMap.put(value, Integer.valueOf(index));
      return true;
   }

   public int size() {
      return this.elements.size();
   }

   public Object get(int index) {
      return this.elements.get(index);
   }

   public int getIndex(Object o) {
      Integer i = (Integer)this.valueKeyMap.get(o);
      return i == null?-1:i.intValue();
   }

   public Iterator iterator() {
      return this.elements.iterator();
   }
}
