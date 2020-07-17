package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CRLValuesType;
import org.etsi.uri.x01903.v13.OCSPValuesType;
import org.etsi.uri.x01903.v13.OtherCertStatusValuesType;
import org.etsi.uri.x01903.v13.RevocationValuesType;

public class RevocationValuesTypeImpl extends XmlComplexContentImpl implements RevocationValuesType {

   private static final QName CRLVALUES$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CRLValues");
   private static final QName OCSPVALUES$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OCSPValues");
   private static final QName OTHERVALUES$4 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OtherValues");
   private static final QName ID$6 = new QName("", "Id");


   public RevocationValuesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public CRLValuesType getCRLValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLValuesType var2 = null;
         var2 = (CRLValuesType)this.get_store().find_element_user(CRLVALUES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCRLValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CRLVALUES$0) != 0;
      }
   }

   public void setCRLValues(CRLValuesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLValuesType var3 = null;
         var3 = (CRLValuesType)this.get_store().find_element_user(CRLVALUES$0, 0);
         if(var3 == null) {
            var3 = (CRLValuesType)this.get_store().add_element_user(CRLVALUES$0);
         }

         var3.set(var1);
      }
   }

   public CRLValuesType addNewCRLValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLValuesType var2 = null;
         var2 = (CRLValuesType)this.get_store().add_element_user(CRLVALUES$0);
         return var2;
      }
   }

   public void unsetCRLValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CRLVALUES$0, 0);
      }
   }

   public OCSPValuesType getOCSPValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPValuesType var2 = null;
         var2 = (OCSPValuesType)this.get_store().find_element_user(OCSPVALUES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOCSPValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OCSPVALUES$2) != 0;
      }
   }

   public void setOCSPValues(OCSPValuesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPValuesType var3 = null;
         var3 = (OCSPValuesType)this.get_store().find_element_user(OCSPVALUES$2, 0);
         if(var3 == null) {
            var3 = (OCSPValuesType)this.get_store().add_element_user(OCSPVALUES$2);
         }

         var3.set(var1);
      }
   }

   public OCSPValuesType addNewOCSPValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPValuesType var2 = null;
         var2 = (OCSPValuesType)this.get_store().add_element_user(OCSPVALUES$2);
         return var2;
      }
   }

   public void unsetOCSPValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OCSPVALUES$2, 0);
      }
   }

   public OtherCertStatusValuesType getOtherValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OtherCertStatusValuesType var2 = null;
         var2 = (OtherCertStatusValuesType)this.get_store().find_element_user(OTHERVALUES$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOtherValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OTHERVALUES$4) != 0;
      }
   }

   public void setOtherValues(OtherCertStatusValuesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OtherCertStatusValuesType var3 = null;
         var3 = (OtherCertStatusValuesType)this.get_store().find_element_user(OTHERVALUES$4, 0);
         if(var3 == null) {
            var3 = (OtherCertStatusValuesType)this.get_store().add_element_user(OTHERVALUES$4);
         }

         var3.set(var1);
      }
   }

   public OtherCertStatusValuesType addNewOtherValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OtherCertStatusValuesType var2 = null;
         var2 = (OtherCertStatusValuesType)this.get_store().add_element_user(OTHERVALUES$4);
         return var2;
      }
   }

   public void unsetOtherValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OTHERVALUES$4, 0);
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
