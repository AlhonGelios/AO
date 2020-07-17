package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTColFieldsImpl.1FieldList;

public class CTColFieldsImpl extends XmlComplexContentImpl implements CTColFields {

   private static final QName FIELD$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "field");
   private static final QName COUNT$2 = new QName("", "count");


   public CTColFieldsImpl(SchemaType var1) {
      super(var1);
   }

   public List getFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FieldList(this);
      }
   }

   public CTField[] getFieldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FIELD$0, var2);
         CTField[] var3 = new CTField[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTField getFieldArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTField var3 = null;
         var3 = (CTField)this.get_store().find_element_user(FIELD$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFieldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIELD$0);
      }
   }

   public void setFieldArray(CTField[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FIELD$0);
      }
   }

   public void setFieldArray(int var1, CTField var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTField var4 = null;
         var4 = (CTField)this.get_store().find_element_user(FIELD$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTField insertNewField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTField var3 = null;
         var3 = (CTField)this.get_store().insert_element_user(FIELD$0, var1);
         return var3;
      }
   }

   public CTField addNewField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTField var2 = null;
         var2 = (CTField)this.get_store().add_element_user(FIELD$0);
         return var2;
      }
   }

   public void removeField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIELD$0, var1);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COUNT$2);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$2);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(COUNT$2);
         }

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
