package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields;

public class CTDataFieldsImpl extends XmlComplexContentImpl implements CTDataFields {

   private static final QName DATAFIELD$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataField");
   private static final QName COUNT$2 = new QName("", "count");


   public CTDataFieldsImpl(SchemaType var1) {
      super(var1);
   }

   public List getDataFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class DataFieldList extends AbstractList {

            public CTDataField get(int var1) {
               return CTDataFieldsImpl.this.getDataFieldArray(var1);
            }

            public CTDataField set(int var1, CTDataField var2) {
               CTDataField var3 = CTDataFieldsImpl.this.getDataFieldArray(var1);
               CTDataFieldsImpl.this.setDataFieldArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTDataField var2) {
               CTDataFieldsImpl.this.insertNewDataField(var1).set(var2);
            }

            public CTDataField remove(int var1) {
               CTDataField var2 = CTDataFieldsImpl.this.getDataFieldArray(var1);
               CTDataFieldsImpl.this.removeDataField(var1);
               return var2;
            }

            public int size() {
               return CTDataFieldsImpl.this.sizeOfDataFieldArray();
            }
         }

         return new DataFieldList();
      }
   }

   public CTDataField[] getDataFieldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATAFIELD$0, var2);
         CTDataField[] var3 = new CTDataField[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDataField getDataFieldArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataField var3 = null;
         var3 = (CTDataField)this.get_store().find_element_user(DATAFIELD$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDataFieldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATAFIELD$0);
      }
   }

   public void setDataFieldArray(CTDataField[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATAFIELD$0);
      }
   }

   public void setDataFieldArray(int var1, CTDataField var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataField var4 = null;
         var4 = (CTDataField)this.get_store().find_element_user(DATAFIELD$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDataField insertNewDataField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataField var3 = null;
         var3 = (CTDataField)this.get_store().insert_element_user(DATAFIELD$0, var1);
         return var3;
      }
   }

   public CTDataField addNewDataField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataField var2 = null;
         var2 = (CTDataField)this.get_store().add_element_user(DATAFIELD$0);
         return var2;
      }
   }

   public void removeDataField(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATAFIELD$0, var1);
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
