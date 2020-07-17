package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.UnsignedDataObjectPropertiesType;
import org.etsi.uri.x01903.v13.UnsignedPropertiesType;
import org.etsi.uri.x01903.v13.UnsignedSignaturePropertiesType;

public class UnsignedPropertiesTypeImpl extends XmlComplexContentImpl implements UnsignedPropertiesType {

   private static final QName UNSIGNEDSIGNATUREPROPERTIES$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "UnsignedSignatureProperties");
   private static final QName UNSIGNEDDATAOBJECTPROPERTIES$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "UnsignedDataObjectProperties");
   private static final QName ID$4 = new QName("", "Id");


   public UnsignedPropertiesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public UnsignedSignaturePropertiesType getUnsignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedSignaturePropertiesType var2 = null;
         var2 = (UnsignedSignaturePropertiesType)this.get_store().find_element_user(UNSIGNEDSIGNATUREPROPERTIES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUnsignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UNSIGNEDSIGNATUREPROPERTIES$0) != 0;
      }
   }

   public void setUnsignedSignatureProperties(UnsignedSignaturePropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedSignaturePropertiesType var3 = null;
         var3 = (UnsignedSignaturePropertiesType)this.get_store().find_element_user(UNSIGNEDSIGNATUREPROPERTIES$0, 0);
         if(var3 == null) {
            var3 = (UnsignedSignaturePropertiesType)this.get_store().add_element_user(UNSIGNEDSIGNATUREPROPERTIES$0);
         }

         var3.set(var1);
      }
   }

   public UnsignedSignaturePropertiesType addNewUnsignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedSignaturePropertiesType var2 = null;
         var2 = (UnsignedSignaturePropertiesType)this.get_store().add_element_user(UNSIGNEDSIGNATUREPROPERTIES$0);
         return var2;
      }
   }

   public void unsetUnsignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UNSIGNEDSIGNATUREPROPERTIES$0, 0);
      }
   }

   public UnsignedDataObjectPropertiesType getUnsignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedDataObjectPropertiesType var2 = null;
         var2 = (UnsignedDataObjectPropertiesType)this.get_store().find_element_user(UNSIGNEDDATAOBJECTPROPERTIES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUnsignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UNSIGNEDDATAOBJECTPROPERTIES$2) != 0;
      }
   }

   public void setUnsignedDataObjectProperties(UnsignedDataObjectPropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedDataObjectPropertiesType var3 = null;
         var3 = (UnsignedDataObjectPropertiesType)this.get_store().find_element_user(UNSIGNEDDATAOBJECTPROPERTIES$2, 0);
         if(var3 == null) {
            var3 = (UnsignedDataObjectPropertiesType)this.get_store().add_element_user(UNSIGNEDDATAOBJECTPROPERTIES$2);
         }

         var3.set(var1);
      }
   }

   public UnsignedDataObjectPropertiesType addNewUnsignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedDataObjectPropertiesType var2 = null;
         var2 = (UnsignedDataObjectPropertiesType)this.get_store().add_element_user(UNSIGNEDDATAOBJECTPROPERTIES$2);
         return var2;
      }
   }

   public void unsetUnsignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UNSIGNEDDATAOBJECTPROPERTIES$2, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$4);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$4) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$4);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$4);
      }
   }

}
