package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTItemsImpl.1ItemList;

public class CTItemsImpl extends XmlComplexContentImpl implements CTItems {

   private static final QName ITEM$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "item");
   private static final QName COUNT$2 = new QName("", "count");


   public CTItemsImpl(SchemaType var1) {
      super(var1);
   }

   public List getItemList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ItemList(this);
      }
   }

   public CTItem[] getItemArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ITEM$0, var2);
         CTItem[] var3 = new CTItem[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTItem getItemArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItem var3 = null;
         var3 = (CTItem)this.get_store().find_element_user(ITEM$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfItemArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ITEM$0);
      }
   }

   public void setItemArray(CTItem[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ITEM$0);
      }
   }

   public void setItemArray(int var1, CTItem var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItem var4 = null;
         var4 = (CTItem)this.get_store().find_element_user(ITEM$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTItem insertNewItem(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItem var3 = null;
         var3 = (CTItem)this.get_store().insert_element_user(ITEM$0, var1);
         return var3;
      }
   }

   public CTItem addNewItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItem var2 = null;
         var2 = (CTItem)this.get_store().add_element_user(ITEM$0);
         return var2;
      }
   }

   public void removeItem(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ITEM$0, var1);
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
