package org.w3.x2000.x09.xmldsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.SignatureDocument;
import org.w3.x2000.x09.xmldsig.SignatureType;

public class SignatureDocumentImpl extends XmlComplexContentImpl implements SignatureDocument {

   private static final QName SIGNATURE$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");


   public SignatureDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public SignatureType getSignature() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureType var2 = null;
         var2 = (SignatureType)this.get_store().find_element_user(SIGNATURE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSignature(SignatureType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureType var3 = null;
         var3 = (SignatureType)this.get_store().find_element_user(SIGNATURE$0, 0);
         if(var3 == null) {
            var3 = (SignatureType)this.get_store().add_element_user(SIGNATURE$0);
         }

         var3.set(var1);
      }
   }

   public SignatureType addNewSignature() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureType var2 = null;
         var2 = (SignatureType)this.get_store().add_element_user(SIGNATURE$0);
         return var2;
      }
   }

}
