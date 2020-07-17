package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTCacheFieldsImpl.1CacheFieldList;

public class CTCacheFieldsImpl extends XmlComplexContentImpl implements CTCacheFields {

   private static final QName CACHEFIELD$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheField");
   private static final QName COUNT$2 = new QName("", "count");


   public CTCacheFieldsImpl(SchemaType var1) {
      super(var1);
   }

   public List getCacheFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CacheFieldList(this);
      }
   }

   public CTCacheField[] getCacheFieldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CACHEFIELD$0, var2);
         CTCacheField[] var3 = new CTCacheField[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCacheField getCacheFieldArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheField var3 = null;
         var3 = (CTCacheField)this.get_store().find_element_user(CACHEFIELD$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCacheFieldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CACHEFIELD$0);
      }
   }

   public void setCacheFieldArray(CTCacheField[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CACHEFIELD$0);
      }
   }

   public void setCacheFieldArray(int var1, CTCacheField var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheField var4 = null;
         var4 = (CTCacheField)this.get_store().find_element_user(CACHEFIELD$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCacheField insertNewCacheField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheField var3 = null;
         var3 = (CTCacheField)this.get_store().insert_element_user(CACHEFIELD$0, var1);
         return var3;
      }
   }

   public CTCacheField addNewCacheField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheField var2 = null;
         var2 = (CTCacheField)this.get_store().add_element_user(CACHEFIELD$0);
         return var2;
      }
   }

   public void removeCacheField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CACHEFIELD$0, var1);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$2);
         return var2;
      }
   }

   public boolean isSetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNT$2) != null;
      }
   }

   public void setCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COUNT$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COUNT$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$2);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COUNT$2);
         }

         var3.set(var1);
      }
   }

   public void unsetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNT$2);
      }
   }

}
