package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CRLRefsType;
import org.etsi.uri.x01903.v13.CompleteRevocationRefsType;
import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.etsi.uri.x01903.v13.OtherCertStatusRefsType;

public class CompleteRevocationRefsTypeImpl extends XmlComplexContentImpl implements CompleteRevocationRefsType {

   private static final QName CRLREFS$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CRLRefs");
   private static final QName OCSPREFS$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OCSPRefs");
   private static final QName OTHERREFS$4 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OtherRefs");
   private static final QName ID$6 = new QName("", "Id");


   public CompleteRevocationRefsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public CRLRefsType getCRLRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefsType var2 = null;
         var2 = (CRLRefsType)this.get_store().find_element_user(CRLREFS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCRLRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CRLREFS$0) != 0;
      }
   }

   public void setCRLRefs(CRLRefsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefsType var3 = null;
         var3 = (CRLRefsType)this.get_store().find_element_user(CRLREFS$0, 0);
         if(var3 == null) {
            var3 = (CRLRefsType)this.get_store().add_element_user(CRLREFS$0);
         }

         var3.set(var1);
      }
   }

   public CRLRefsType addNewCRLRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLRefsType var2 = null;
         var2 = (CRLRefsType)this.get_store().add_element_user(CRLREFS$0);
         return var2;
      }
   }

   public void unsetCRLRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CRLREFS$0, 0);
      }
   }

   public OCSPRefsType getOCSPRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefsType var2 = null;
         var2 = (OCSPRefsType)this.get_store().find_element_user(OCSPREFS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOCSPRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OCSPREFS$2) != 0;
      }
   }

   public void setOCSPRefs(OCSPRefsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefsType var3 = null;
         var3 = (OCSPRefsType)this.get_store().find_element_user(OCSPREFS$2, 0);
         if(var3 == null) {
            var3 = (OCSPRefsType)this.get_store().add_element_user(OCSPREFS$2);
         }

         var3.set(var1);
      }
   }

   public OCSPRefsType addNewOCSPRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPRefsType var2 = null;
         var2 = (OCSPRefsType)this.get_store().add_element_user(OCSPREFS$2);
         return var2;
      }
   }

   public void unsetOCSPRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OCSPREFS$2, 0);
      }
   }

   public OtherCertStatusRefsType getOtherRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OtherCertStatusRefsType var2 = null;
         var2 = (OtherCertStatusRefsType)this.get_store().find_element_user(OTHERREFS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOtherRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OTHERREFS$4) != 0;
      }
   }

   public void setOtherRefs(OtherCertStatusRefsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OtherCertStatusRefsType var3 = null;
         var3 = (OtherCertStatusRefsType)this.get_store().find_element_user(OTHERREFS$4, 0);
         if(var3 == null) {
            var3 = (OtherCertStatusRefsType)this.get_store().add_element_user(OTHERREFS$4);
         }

         var3.set(var1);
      }
   }

   public OtherCertStatusRefsType addNewOtherRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OtherCertStatusRefsType var2 = null;
         var2 = (OtherCertStatusRefsType)this.get_store().add_element_user(OTHERREFS$4);
         return var2;
      }
   }

   public void unsetOtherRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OTHERREFS$4, 0);
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
