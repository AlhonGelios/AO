package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.etsi.uri.x01903.v13.OCSPIdentifierType;
import org.etsi.uri.x01903.v13.OCSPRefType;

public class OCSPRefTypeImpl extends XmlComplexContentImpl implements OCSPRefType {

   private static final QName OCSPIDENTIFIER$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OCSPIdentifier");
   private static final QName DIGESTALGANDVALUE$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "DigestAlgAndValue");


   public OCSPRefTypeImpl(SchemaType var1) {
      super(var1);
   }

   public OCSPIdentifierType getOCSPIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPIdentifierType var2 = null;
         var2 = (OCSPIdentifierType)this.get_store().find_element_user(OCSPIDENTIFIER$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setOCSPIdentifier(OCSPIdentifierType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPIdentifierType var3 = null;
         var3 = (OCSPIdentifierType)this.get_store().find_element_user(OCSPIDENTIFIER$0, 0);
         if(var3 == null) {
            var3 = (OCSPIdentifierType)this.get_store().add_element_user(OCSPIDENTIFIER$0);
         }

         var3.set(var1);
      }
   }

   public OCSPIdentifierType addNewOCSPIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         OCSPIdentifierType var2 = null;
         var2 = (OCSPIdentifierType)this.get_store().add_element_user(OCSPIDENTIFIER$0);
         return var2;
      }
   }

   public DigestAlgAndValueType getDigestAlgAndValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var2 = null;
         var2 = (DigestAlgAndValueType)this.get_store().find_element_user(DIGESTALGANDVALUE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDigestAlgAndValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIGESTALGANDVALUE$2) != 0;
      }
   }

   public void setDigestAlgAndValue(DigestAlgAndValueType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var3 = null;
         var3 = (DigestAlgAndValueType)this.get_store().find_element_user(DIGESTALGANDVALUE$2, 0);
         if(var3 == null) {
            var3 = (DigestAlgAndValueType)this.get_store().add_element_user(DIGESTALGANDVALUE$2);
         }

         var3.set(var1);
      }
   }

   public DigestAlgAndValueType addNewDigestAlgAndValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var2 = null;
         var2 = (DigestAlgAndValueType)this.get_store().add_element_user(DIGESTALGANDVALUE$2);
         return var2;
      }
   }

   public void unsetDigestAlgAndValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIGESTALGANDVALUE$2, 0);
      }
   }

}
