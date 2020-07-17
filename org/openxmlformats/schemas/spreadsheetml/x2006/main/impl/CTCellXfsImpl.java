package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTCellXfsImpl.1XfList;

public class CTCellXfsImpl extends XmlComplexContentImpl implements CTCellXfs {

   private static final QName XF$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "xf");
   private static final QName COUNT$2 = new QName("", "count");


   public CTCellXfsImpl(SchemaType var1) {
      super(var1);
   }

   public List getXfList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1XfList(this);
      }
   }

   public CTXf[] getXfArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(XF$0, var2);
         CTXf[] var3 = new CTXf[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTXf getXfArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXf var3 = null;
         var3 = (CTXf)this.get_store().find_element_user(XF$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfXfArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XF$0);
      }
   }

   public void setXfArray(CTXf[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, XF$0);
      }
   }

   public void setXfArray(int var1, CTXf var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXf var4 = null;
         var4 = (CTXf)this.get_store().find_element_user(XF$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTXf insertNewXf(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXf var3 = null;
         var3 = (CTXf)this.get_store().insert_element_user(XF$0, var1);
         return var3;
      }
   }

   public CTXf addNewXf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXf var2 = null;
         var2 = (CTXf)this.get_store().add_element_user(XF$0);
         return var2;
      }
   }

   public void removeXf(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XF$0, var1);
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
