package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.QualifyingPropertiesType;
import org.etsi.uri.x01903.v13.SignedPropertiesType;
import org.etsi.uri.x01903.v13.UnsignedPropertiesType;

public class QualifyingPropertiesTypeImpl extends XmlComplexContentImpl implements QualifyingPropertiesType {

   private static final QName SIGNEDPROPERTIES$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedProperties");
   private static final QName UNSIGNEDPROPERTIES$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "UnsignedProperties");
   private static final QName TARGET$4 = new QName("", "Target");
   private static final QName ID$6 = new QName("", "Id");


   public QualifyingPropertiesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public SignedPropertiesType getSignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedPropertiesType var2 = null;
         var2 = (SignedPropertiesType)this.get_store().find_element_user(SIGNEDPROPERTIES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNEDPROPERTIES$0) != 0;
      }
   }

   public void setSignedProperties(SignedPropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedPropertiesType var3 = null;
         var3 = (SignedPropertiesType)this.get_store().find_element_user(SIGNEDPROPERTIES$0, 0);
         if(var3 == null) {
            var3 = (SignedPropertiesType)this.get_store().add_element_user(SIGNEDPROPERTIES$0);
         }

         var3.set(var1);
      }
   }

   public SignedPropertiesType addNewSignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedPropertiesType var2 = null;
         var2 = (SignedPropertiesType)this.get_store().add_element_user(SIGNEDPROPERTIES$0);
         return var2;
      }
   }

   public void unsetSignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNEDPROPERTIES$0, 0);
      }
   }

   public UnsignedPropertiesType getUnsignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedPropertiesType var2 = null;
         var2 = (UnsignedPropertiesType)this.get_store().find_element_user(UNSIGNEDPROPERTIES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUnsignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UNSIGNEDPROPERTIES$2) != 0;
      }
   }

   public void setUnsignedProperties(UnsignedPropertiesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedPropertiesType var3 = null;
         var3 = (UnsignedPropertiesType)this.get_store().find_element_user(UNSIGNEDPROPERTIES$2, 0);
         if(var3 == null) {
            var3 = (UnsignedPropertiesType)this.get_store().add_element_user(UNSIGNEDPROPERTIES$2);
         }

         var3.set(var1);
      }
   }

   public UnsignedPropertiesType addNewUnsignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         UnsignedPropertiesType var2 = null;
         var2 = (UnsignedPropertiesType)this.get_store().add_element_user(UNSIGNEDPROPERTIES$2);
         return var2;
      }
   }

   public void unsetUnsignedProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UNSIGNEDPROPERTIES$2, 0);
      }
   }

   public String getTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TARGET$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(TARGET$4);
         return var2;
      }
   }

   public void setTarget(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TARGET$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TARGET$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTarget(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(TARGET$4);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(TARGET$4);
         }

         var3.set(var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$6) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$6);
      }
   }

}
