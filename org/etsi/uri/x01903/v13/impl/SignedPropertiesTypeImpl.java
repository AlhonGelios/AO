package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.SignedDataObjectPropertiesType;
import org.etsi.uri.x01903.v13.SignedPropertiesType;
import org.etsi.uri.x01903.v13.SignedSignaturePropertiesType;

public class SignedPropertiesTypeImpl extends XmlComplexContentImpl implements SignedPropertiesType {

   private static final QName SIGNEDSIGNATUREPROPERTIES$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedSignatureProperties");
   private static final QName SIGNEDDATAOBJECTPROPERTIES$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedDataObjectProperties");
   private static final QName ID$4 = new QName("", "Id");


   public SignedPropertiesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public SignedSignaturePropertiesType getSignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedSignaturePropertiesType var2 = null;
         var2 = (SignedSignaturePropertiesType)this.get_store().find_element_user(SIGNEDSIGNATUREPROPERTIES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNEDSIGNATUREPROPERTIES$0) != 0;
      }
   }

   public void setSignedSignatureProperties(SignedSignaturePropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedSignaturePropertiesType var3 = null;
         var3 = (SignedSignaturePropertiesType)this.get_store().find_element_user(SIGNEDSIGNATUREPROPERTIES$0, 0);
         if(var3 == null) {
            var3 = (SignedSignaturePropertiesType)this.get_store().add_element_user(SIGNEDSIGNATUREPROPERTIES$0);
         }

         var3.set(var1);
      }
   }

   public SignedSignaturePropertiesType addNewSignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedSignaturePropertiesType var2 = null;
         var2 = (SignedSignaturePropertiesType)this.get_store().add_element_user(SIGNEDSIGNATUREPROPERTIES$0);
         return var2;
      }
   }

   public void unsetSignedSignatureProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNEDSIGNATUREPROPERTIES$0, 0);
      }
   }

   public SignedDataObjectPropertiesType getSignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedDataObjectPropertiesType var2 = null;
         var2 = (SignedDataObjectPropertiesType)this.get_store().find_element_user(SIGNEDDATAOBJECTPROPERTIES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNEDDATAOBJECTPROPERTIES$2) != 0;
      }
   }

   public void setSignedDataObjectProperties(SignedDataObjectPropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedDataObjectPropertiesType var3 = null;
         var3 = (SignedDataObjectPropertiesType)this.get_store().find_element_user(SIGNEDDATAOBJECTPROPERTIES$2, 0);
         if(var3 == null) {
            var3 = (SignedDataObjectPropertiesType)this.get_store().add_element_user(SIGNEDDATAOBJECTPROPERTIES$2);
         }

         var3.set(var1);
      }
   }

   public SignedDataObjectPropertiesType addNewSignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedDataObjectPropertiesType var2 = null;
         var2 = (SignedDataObjectPropertiesType)this.get_store().add_element_user(SIGNEDDATAOBJECTPROPERTIES$2);
         return var2;
      }
   }

   public void unsetSignedDataObjectProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNEDDATAOBJECTPROPERTIES$2, 0);
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
