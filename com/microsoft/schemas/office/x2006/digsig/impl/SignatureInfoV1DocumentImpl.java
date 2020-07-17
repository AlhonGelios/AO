package com.microsoft.schemas.office.x2006.digsig.impl;

import com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1;
import com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class SignatureInfoV1DocumentImpl extends XmlComplexContentImpl implements SignatureInfoV1Document {

   private static final QName SIGNATUREINFOV1$0 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureInfoV1");


   public SignatureInfoV1DocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSignatureInfoV1 getSignatureInfoV1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureInfoV1 var2 = null;
         var2 = (CTSignatureInfoV1)this.get_store().find_element_user(SIGNATUREINFOV1$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSignatureInfoV1(CTSignatureInfoV1 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureInfoV1 var3 = null;
         var3 = (CTSignatureInfoV1)this.get_store().find_element_user(SIGNATUREINFOV1$0, 0);
         if(var3 == null) {
            var3 = (CTSignatureInfoV1)this.get_store().add_element_user(SIGNATUREINFOV1$0);
         }

         var3.set(var1);
      }
   }

   public CTSignatureInfoV1 addNewSignatureInfoV1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureInfoV1 var2 = null;
         var2 = (CTSignatureInfoV1)this.get_store().add_element_user(SIGNATUREINFOV1$0);
         return var2;
      }
   }

}
