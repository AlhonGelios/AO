package org.etsi.uri.x01903.v14.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CertificateValuesType;
import org.etsi.uri.x01903.v13.RevocationValuesType;
import org.etsi.uri.x01903.v14.ValidationDataType;

public class ValidationDataTypeImpl extends XmlComplexContentImpl implements ValidationDataType {

   private static final QName CERTIFICATEVALUES$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertificateValues");
   private static final QName REVOCATIONVALUES$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "RevocationValues");
   private static final QName ID$4 = new QName("", "Id");
   private static final QName URI$6 = new QName("", "URI");


   public ValidationDataTypeImpl(SchemaType var1) {
      super(var1);
   }

   public CertificateValuesType getCertificateValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var2 = null;
         var2 = (CertificateValuesType)this.get_store().find_element_user(CERTIFICATEVALUES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCertificateValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CERTIFICATEVALUES$0) != 0;
      }
   }

   public void setCertificateValues(CertificateValuesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var3 = null;
         var3 = (CertificateValuesType)this.get_store().find_element_user(CERTIFICATEVALUES$0, 0);
         if(var3 == null) {
            var3 = (CertificateValuesType)this.get_store().add_element_user(CERTIFICATEVALUES$0);
         }

         var3.set(var1);
      }
   }

   public CertificateValuesType addNewCertificateValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var2 = null;
         var2 = (CertificateValuesType)this.get_store().add_element_user(CERTIFICATEVALUES$0);
         return var2;
      }
   }

   public void unsetCertificateValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CERTIFICATEVALUES$0, 0);
      }
   }

   public RevocationValuesType getRevocationValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var2 = null;
         var2 = (RevocationValuesType)this.get_store().find_element_user(REVOCATIONVALUES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRevocationValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REVOCATIONVALUES$2) != 0;
      }
   }

   public void setRevocationValues(RevocationValuesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var3 = null;
         var3 = (RevocationValuesType)this.get_store().find_element_user(REVOCATIONVALUES$2, 0);
         if(var3 == null) {
            var3 = (RevocationValuesType)this.get_store().add_element_user(REVOCATIONVALUES$2);
         }

         var3.set(var1);
      }
   }

   public RevocationValuesType addNewRevocationValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var2 = null;
         var2 = (RevocationValuesType)this.get_store().add_element_user(REVOCATIONVALUES$2);
         return var2;
      }
   }

   public void unsetRevocationValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REVOCATIONVALUES$2, 0);
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

   public String getURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(URI$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_attribute_user(URI$6);
         return var2;
      }
   }

   public boolean isSetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(URI$6) != null;
      }
   }

   public void setURI(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(URI$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(URI$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetURI(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_attribute_user(URI$6);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_attribute_user(URI$6);
         }

         var3.set(var1);
      }
   }

   public void unsetURI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(URI$6);
      }
   }

}
