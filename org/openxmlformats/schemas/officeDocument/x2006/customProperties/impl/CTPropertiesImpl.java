package org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;

public class CTPropertiesImpl extends XmlComplexContentImpl implements CTProperties {

   private static final QName PROPERTY$0 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/custom-properties", "property");


   public CTPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public List getPropertyList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class PropertyList extends AbstractList {

            public CTProperty get(int var1) {
               return CTPropertiesImpl.this.getPropertyArray(var1);
            }

            public CTProperty set(int var1, CTProperty var2) {
               CTProperty var3 = CTPropertiesImpl.this.getPropertyArray(var1);
               CTPropertiesImpl.this.setPropertyArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTProperty var2) {
               CTPropertiesImpl.this.insertNewProperty(var1).set(var2);
            }

            public CTProperty remove(int var1) {
               CTProperty var2 = CTPropertiesImpl.this.getPropertyArray(var1);
               CTPropertiesImpl.this.removeProperty(var1);
               return var2;
            }

            public int size() {
               return CTPropertiesImpl.this.sizeOfPropertyArray();
            }
         }

         return new PropertyList();
      }
   }

   public CTProperty[] getPropertyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PROPERTY$0, var2);
         CTProperty[] var3 = new CTProperty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTProperty getPropertyArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperty var3 = null;
         var3 = (CTProperty)this.get_store().find_element_user(PROPERTY$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPropertyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROPERTY$0);
      }
   }

   public void setPropertyArray(CTProperty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PROPERTY$0);
      }
   }

   public void setPropertyArray(int var1, CTProperty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperty var4 = null;
         var4 = (CTProperty)this.get_store().find_element_user(PROPERTY$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTProperty insertNewProperty(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperty var3 = null;
         var3 = (CTProperty)this.get_store().insert_element_user(PROPERTY$0, var1);
         return var3;
      }
   }

   public CTProperty addNewProperty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProperty var2 = null;
         var2 = (CTProperty)this.get_store().add_element_user(PROPERTY$0);
         return var2;
      }
   }

   public void removeProperty(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROPERTY$0, var1);
      }
   }

}
