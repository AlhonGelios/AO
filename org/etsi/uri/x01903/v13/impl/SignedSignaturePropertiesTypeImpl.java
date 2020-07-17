package org.etsi.uri.x01903.v13.impl;

import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.etsi.uri.x01903.v13.SignaturePolicyIdentifierType;
import org.etsi.uri.x01903.v13.SignatureProductionPlaceType;
import org.etsi.uri.x01903.v13.SignedSignaturePropertiesType;
import org.etsi.uri.x01903.v13.SignerRoleType;

public class SignedSignaturePropertiesTypeImpl extends XmlComplexContentImpl implements SignedSignaturePropertiesType {

   private static final QName SIGNINGTIME$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigningTime");
   private static final QName SIGNINGCERTIFICATE$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigningCertificate");
   private static final QName SIGNATUREPOLICYIDENTIFIER$4 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignaturePolicyIdentifier");
   private static final QName SIGNATUREPRODUCTIONPLACE$6 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignatureProductionPlace");
   private static final QName SIGNERROLE$8 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignerRole");
   private static final QName ID$10 = new QName("", "Id");


   public SignedSignaturePropertiesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public Calendar getSigningTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNINGTIME$0, 0);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetSigningTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_element_user(SIGNINGTIME$0, 0);
         return var2;
      }
   }

   public boolean isSetSigningTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNINGTIME$0) != 0;
      }
   }

   public void setSigningTime(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNINGTIME$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNINGTIME$0);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetSigningTime(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_element_user(SIGNINGTIME$0, 0);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_element_user(SIGNINGTIME$0);
         }

         var3.set((XmlObject)var1);
      }
   }

   public void unsetSigningTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNINGTIME$0, 0);
      }
   }

   public CertIDListType getSigningCertificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDListType var2 = null;
         var2 = (CertIDListType)this.get_store().find_element_user(SIGNINGCERTIFICATE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSigningCertificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNINGCERTIFICATE$2) != 0;
      }
   }

   public void setSigningCertificate(CertIDListType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDListType var3 = null;
         var3 = (CertIDListType)this.get_store().find_element_user(SIGNINGCERTIFICATE$2, 0);
         if(var3 == null) {
            var3 = (CertIDListType)this.get_store().add_element_user(SIGNINGCERTIFICATE$2);
         }

         var3.set(var1);
      }
   }

   public CertIDListType addNewSigningCertificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertIDListType var2 = null;
         var2 = (CertIDListType)this.get_store().add_element_user(SIGNINGCERTIFICATE$2);
         return var2;
      }
   }

   public void unsetSigningCertificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNINGCERTIFICATE$2, 0);
      }
   }

   public SignaturePolicyIdentifierType getSignaturePolicyIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignaturePolicyIdentifierType var2 = null;
         var2 = (SignaturePolicyIdentifierType)this.get_store().find_element_user(SIGNATUREPOLICYIDENTIFIER$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignaturePolicyIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNATUREPOLICYIDENTIFIER$4) != 0;
      }
   }

   public void setSignaturePolicyIdentifier(SignaturePolicyIdentifierType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignaturePolicyIdentifierType var3 = null;
         var3 = (SignaturePolicyIdentifierType)this.get_store().find_element_user(SIGNATUREPOLICYIDENTIFIER$4, 0);
         if(var3 == null) {
            var3 = (SignaturePolicyIdentifierType)this.get_store().add_element_user(SIGNATUREPOLICYIDENTIFIER$4);
         }

         var3.set(var1);
      }
   }

   public SignaturePolicyIdentifierType addNewSignaturePolicyIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignaturePolicyIdentifierType var2 = null;
         var2 = (SignaturePolicyIdentifierType)this.get_store().add_element_user(SIGNATUREPOLICYIDENTIFIER$4);
         return var2;
      }
   }

   public void unsetSignaturePolicyIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNATUREPOLICYIDENTIFIER$4, 0);
      }
   }

   public SignatureProductionPlaceType getSignatureProductionPlace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureProductionPlaceType var2 = null;
         var2 = (SignatureProductionPlaceType)this.get_store().find_element_user(SIGNATUREPRODUCTIONPLACE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignatureProductionPlace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNATUREPRODUCTIONPLACE$6) != 0;
      }
   }

   public void setSignatureProductionPlace(SignatureProductionPlaceType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureProductionPlaceType var3 = null;
         var3 = (SignatureProductionPlaceType)this.get_store().find_element_user(SIGNATUREPRODUCTIONPLACE$6, 0);
         if(var3 == null) {
            var3 = (SignatureProductionPlaceType)this.get_store().add_element_user(SIGNATUREPRODUCTIONPLACE$6);
         }

         var3.set(var1);
      }
   }

   public SignatureProductionPlaceType addNewSignatureProductionPlace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureProductionPlaceType var2 = null;
         var2 = (SignatureProductionPlaceType)this.get_store().add_element_user(SIGNATUREPRODUCTIONPLACE$6);
         return var2;
      }
   }

   public void unsetSignatureProductionPlace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNATUREPRODUCTIONPLACE$6, 0);
      }
   }

   public SignerRoleType getSignerRole() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignerRoleType var2 = null;
         var2 = (SignerRoleType)this.get_store().find_element_user(SIGNERROLE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignerRole() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNERROLE$8) != 0;
      }
   }

   public void setSignerRole(SignerRoleType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignerRoleType var3 = null;
         var3 = (SignerRoleType)this.get_store().find_element_user(SIGNERROLE$8, 0);
         if(var3 == null) {
            var3 = (SignerRoleType)this.get_store().add_element_user(SIGNERROLE$8);
         }

         var3.set(var1);
      }
   }

   public SignerRoleType addNewSignerRole() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignerRoleType var2 = null;
         var2 = (SignerRoleType)this.get_store().add_element_user(SIGNERROLE$8);
         return var2;
      }
   }

   public void unsetSignerRole() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNERROLE$8, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$10);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$10) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$10);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$10);
      }
   }

}
