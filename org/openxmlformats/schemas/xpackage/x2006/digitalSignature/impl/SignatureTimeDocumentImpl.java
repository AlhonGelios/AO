package org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTSignatureTime;
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.SignatureTimeDocument;

public class SignatureTimeDocumentImpl extends XmlComplexContentImpl implements SignatureTimeDocument {

   private static final QName SIGNATURETIME$0 = new QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "SignatureTime");


   public SignatureTimeDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSignatureTime getSignatureTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureTime var2 = null;
         var2 = (CTSignatureTime)this.get_store().find_element_user(SIGNATURETIME$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSignatureTime(CTSignatureTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureTime var3 = null;
         var3 = (CTSignatureTime)this.get_store().find_element_user(SIGNATURETIME$0, 0);
         if(var3 == null) {
            var3 = (CTSignatureTime)this.get_store().add_element_user(SIGNATURETIME$0);
         }

         var3.set(var1);
      }
   }

   public CTSignatureTime addNewSignatureTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureTime var2 = null;
         var2 = (CTSignatureTime)this.get_store().add_element_user(SIGNATURETIME$0);
         return var2;
      }
   }

}
