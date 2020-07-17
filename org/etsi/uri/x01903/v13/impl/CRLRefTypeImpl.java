package org.etsi.uri.x01903.v13.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CRLIdentifierType;
import org.etsi.uri.x01903.v13.CRLRefType;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;

public class CRLRefTypeImpl extends XmlComplexContentImpl implements CRLRefType {

   private static final QName DIGESTALGANDVALUE$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "DigestAlgAndValue");
   private static final QName CRLIDENTIFIER$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CRLIdentifier");


   public CRLRefTypeImpl(SchemaType var1) {
      super(var1);
   }

   public DigestAlgAndValueType getDigestAlgAndValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var2 = null;
         var2 = (DigestAlgAndValueType)this.get_store().find_element_user(DIGESTALGANDVALUE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDigestAlgAndValue(DigestAlgAndValueType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var3 = null;
         var3 = (DigestAlgAndValueType)this.get_store().find_element_user(DIGESTALGANDVALUE$0, 0);
         if(var3 == null) {
            var3 = (DigestAlgAndValueType)this.get_store().add_element_user(DIGESTALGANDVALUE$0);
         }

         var3.set(var1);
      }
   }

   public DigestAlgAndValueType addNewDigestAlgAndValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DigestAlgAndValueType var2 = null;
         var2 = (DigestAlgAndValueType)this.get_store().add_element_user(DIGESTALGANDVALUE$0);
         return var2;
      }
   }

   public CRLIdentifierType getCRLIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLIdentifierType var2 = null;
         var2 = (CRLIdentifierType)this.get_store().find_element_user(CRLIDENTIFIER$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCRLIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CRLIDENTIFIER$2) != 0;
      }
   }

   public void setCRLIdentifier(CRLIdentifierType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLIdentifierType var3 = null;
         var3 = (CRLIdentifierType)this.get_store().find_element_user(CRLIDENTIFIER$2, 0);
         if(var3 == null) {
            var3 = (CRLIdentifierType)this.get_store().add_element_user(CRLIDENTIFIER$2);
         }

         var3.set(var1);
      }
   }

   public CRLIdentifierType addNewCRLIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CRLIdentifierType var2 = null;
         var2 = (CRLIdentifierType)this.get_store().add_element_user(CRLIDENTIFIER$2);
         return var2;
      }
   }

   public void unsetCRLIdentifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CRLIDENTIFIER$2, 0);
      }
   }

}
