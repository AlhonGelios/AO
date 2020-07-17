package org.apache.poi.hpsf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hpsf.CustomProperty;
import org.apache.poi.hpsf.MutableProperty;

public class CustomProperties extends HashMap {

   private final Map dictionaryIDToName = new HashMap();
   private final Map dictionaryNameToID = new HashMap();
   private boolean isPure = true;


   public CustomProperty put(String name, CustomProperty cp) {
      if(name == null) {
         this.isPure = false;
         return null;
      } else if(!name.equals(cp.getName())) {
         throw new IllegalArgumentException("Parameter \"name\" (" + name + ") and custom property\'s name (" + cp.getName() + ") do not match.");
      } else {
         Long idKey = Long.valueOf(cp.getID());
         Long oldID = (Long)this.dictionaryNameToID.get(name);
         this.dictionaryIDToName.remove(oldID);
         this.dictionaryNameToID.put(name, idKey);
         this.dictionaryIDToName.put(idKey, name);
         CustomProperty oldCp = (CustomProperty)super.remove(oldID);
         super.put(idKey, cp);
         return oldCp;
      }
   }

   private Object put(CustomProperty customProperty) throws ClassCastException {
      String name = customProperty.getName();
      Long oldId = (Long)this.dictionaryNameToID.get(name);
      if(oldId != null) {
         customProperty.setID(oldId.longValue());
      } else {
         long max = 1L;
         Iterator i$ = this.dictionaryIDToName.keySet().iterator();

         while(i$.hasNext()) {
            Long long1 = (Long)i$.next();
            long id = long1.longValue();
            if(id > max) {
               max = id;
            }
         }

         customProperty.setID(max + 1L);
      }

      return this.put(name, customProperty);
   }

   public Object remove(String name) {
      Long id = (Long)this.dictionaryNameToID.get(name);
      if(id == null) {
         return null;
      } else {
         this.dictionaryIDToName.remove(id);
         this.dictionaryNameToID.remove(name);
         return super.remove(id);
      }
   }

   public Object put(String name, String value) {
      MutableProperty p = new MutableProperty();
      p.setID(-1L);
      p.setType(31L);
      p.setValue(value);
      CustomProperty cp = new CustomProperty(p, name);
      return this.put(cp);
   }

   public Object put(String name, Long value) {
      MutableProperty p = new MutableProperty();
      p.setID(-1L);
      p.setType(20L);
      p.setValue(value);
      CustomProperty cp = new CustomProperty(p, name);
      return this.put(cp);
   }

   public Object put(String name, Double value) {
      MutableProperty p = new MutableProperty();
      p.setID(-1L);
      p.setType(5L);
      p.setValue(value);
      CustomProperty cp = new CustomProperty(p, name);
      return this.put(cp);
   }

   public Object put(String name, Integer value) {
      MutableProperty p = new MutableProperty();
      p.setID(-1L);
      p.setType(3L);
      p.setValue(value);
      CustomProperty cp = new CustomProperty(p, name);
      return this.put(cp);
   }

   public Object put(String name, Boolean value) {
      MutableProperty p = new MutableProperty();
      p.setID(-1L);
      p.setType(11L);
      p.setValue(value);
      CustomProperty cp = new CustomProperty(p, name);
      return this.put(cp);
   }

   public Object get(String name) {
      Long id = (Long)this.dictionaryNameToID.get(name);
      CustomProperty cp = (CustomProperty)super.get(id);
      return cp != null?cp.getValue():null;
   }

   public Object put(String name, java.util.Date value) {
      MutableProperty p = new MutableProperty();
      p.setID(-1L);
      p.setType(64L);
      p.setValue(value);
      CustomProperty cp = new CustomProperty(p, name);
      return this.put(cp);
   }

   public Set keySet() {
      return this.dictionaryNameToID.keySet();
   }

   public Set nameSet() {
      return this.dictionaryNameToID.keySet();
   }

   public Set idSet() {
      return this.dictionaryNameToID.keySet();
   }

   public void setCodepage(int codepage) {
      MutableProperty p = new MutableProperty();
      p.setID(1L);
      p.setType(2L);
      p.setValue(Integer.valueOf(codepage));
      this.put(new CustomProperty(p));
   }

   Map getDictionary() {
      return this.dictionaryIDToName;
   }

   public boolean containsKey(Object key) {
      return key instanceof Long?super.containsKey(key):(key instanceof String?super.containsKey(this.dictionaryNameToID.get(key)):false);
   }

   public boolean containsValue(Object value) {
      if(value instanceof CustomProperty) {
         return super.containsValue(value);
      } else {
         Iterator i$ = super.values().iterator();

         CustomProperty cp;
         do {
            if(!i$.hasNext()) {
               return false;
            }

            cp = (CustomProperty)i$.next();
         } while(cp.getValue() != value);

         return true;
      }
   }

   public int getCodepage() {
      int codepage = -1;
      Iterator i = this.values().iterator();

      while(codepage == -1 && i.hasNext()) {
         CustomProperty cp = (CustomProperty)i.next();
         if(cp.getID() == 1L) {
            codepage = ((Integer)cp.getValue()).intValue();
         }
      }

      return codepage;
   }

   public boolean isPure() {
      return this.isPure;
   }

   public void setPure(boolean isPure) {
      this.isPure = isPure;
   }
}
