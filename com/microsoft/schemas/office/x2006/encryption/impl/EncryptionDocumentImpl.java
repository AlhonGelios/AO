package com.microsoft.schemas.office.x2006.encryption.impl;

import com.microsoft.schemas.office.x2006.encryption.CTEncryption;
import com.microsoft.schemas.office.x2006.encryption.EncryptionDocument;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class EncryptionDocumentImpl extends XmlComplexContentImpl implements EncryptionDocument {

   private static final QName ENCRYPTION$0 = new QName("http://schemas.microsoft.com/office/2006/encryption", "encryption");


   public EncryptionDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTEncryption getEncryption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEncryption var2 = null;
         var2 = (CTEncryption)this.get_store().find_element_user(ENCRYPTION$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setEncryption(CTEncryption var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEncryption var3 = null;
         var3 = (CTEncryption)this.get_store().find_element_user(ENCRYPTION$0, 0);
         if(var3 == null) {
            var3 = (CTEncryption)this.get_store().add_element_user(ENCRYPTION$0);
         }

         var3.set(var1);
      }
   }

   public CTEncryption addNewEncryption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEncryption var2 = null;
         var2 = (CTEncryption)this.get_store().add_element_user(ENCRYPTION$0);
         return var2;
      }
   }

}
