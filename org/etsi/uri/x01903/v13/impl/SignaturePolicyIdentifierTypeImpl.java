package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.SignaturePolicyIdType;
import org.etsi.uri.x01903.v13.SignaturePolicyIdentifierType;

public class SignaturePolicyIdentifierTypeImpl extends XmlComplexContentImpl implements SignaturePolicyIdentifierType {

   private static final QName SIGNATUREPOLICYID$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignaturePolicyId");
   private static final QName SIGNATUREPOLICYIMPLIED$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignaturePolicyImplied");


   public SignaturePolicyIdentifierTypeImpl(SchemaType var1) {
      super(var1);
   }

   public SignaturePolicyIdType getSignaturePolicyId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignaturePolicyIdType var2 = null;
         var2 = (SignaturePolicyIdType)this.get_store().find_element_user(SIGNATUREPOLICYID$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignaturePolicyId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNATUREPOLICYID$0) != 0;
      }
   }

   public void setSignaturePolicyId(SignaturePolicyIdType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignaturePolicyIdType var3 = null;
         var3 = (SignaturePolicyIdType)this.get_store().find_element_user(SIGNATUREPOLICYID$0, 0);
         if(var3 == null) {
            var3 = (SignaturePolicyIdType)this.get_store().add_element_user(SIGNATUREPOLICYID$0);
         }

         var3.set(var1);
      }
   }

   public SignaturePolicyIdType addNewSignaturePolicyId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignaturePolicyIdType var2 = null;
         var2 = (SignaturePolicyIdType)this.get_store().add_element_user(SIGNATUREPOLICYID$0);
         return var2;
      }
   }

   public void unsetSignaturePolicyId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNATUREPOLICYID$0, 0);
      }
   }

   public XmlObject getSignaturePolicyImplied() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlObject var2 = null;
         var2 = (XmlObject)this.get_store().find_element_user(SIGNATUREPOLICYIMPLIED$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSignaturePolicyImplied() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNATUREPOLICYIMPLIED$2) != 0;
      }
   }

   public void setSignaturePolicyImplied(XmlObject var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlObject var3 = null;
         var3 = (XmlObject)this.get_store().find_element_user(SIGNATUREPOLICYIMPLIED$2, 0);
         if(var3 == null) {
            var3 = (XmlObject)this.get_store().add_element_user(SIGNATUREPOLICYIMPLIED$2);
         }

         var3.set(var1);
      }
   }

   public XmlObject addNewSignaturePolicyImplied() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlObject var2 = null;
         var2 = (XmlObject)this.get_store().add_element_user(SIGNATUREPOLICYIMPLIED$2);
         return var2;
      }
   }

   public void unsetSignaturePolicyImplied() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNATUREPOLICYIMPLIED$2, 0);
      }
   }

}
