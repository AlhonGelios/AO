package com.microsoft.schemas.office.x2006.encryption.impl;

import com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity;
import com.microsoft.schemas.office.x2006.encryption.CTEncryption;
import com.microsoft.schemas.office.x2006.encryption.CTKeyData;
import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptors;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTEncryptionImpl extends XmlComplexContentImpl implements CTEncryption {

   private static final QName KEYDATA$0 = new QName("http://schemas.microsoft.com/office/2006/encryption", "keyData");
   private static final QName DATAINTEGRITY$2 = new QName("http://schemas.microsoft.com/office/2006/encryption", "dataIntegrity");
   private static final QName KEYENCRYPTORS$4 = new QName("http://schemas.microsoft.com/office/2006/encryption", "keyEncryptors");


   public CTEncryptionImpl(SchemaType var1) {
      super(var1);
   }

   public CTKeyData getKeyData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyData var2 = null;
         var2 = (CTKeyData)this.get_store().find_element_user(KEYDATA$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setKeyData(CTKeyData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyData var3 = null;
         var3 = (CTKeyData)this.get_store().find_element_user(KEYDATA$0, 0);
         if(var3 == null) {
            var3 = (CTKeyData)this.get_store().add_element_user(KEYDATA$0);
         }

         var3.set(var1);
      }
   }

   public CTKeyData addNewKeyData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyData var2 = null;
         var2 = (CTKeyData)this.get_store().add_element_user(KEYDATA$0);
         return var2;
      }
   }

   public CTDataIntegrity getDataIntegrity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataIntegrity var2 = null;
         var2 = (CTDataIntegrity)this.get_store().find_element_user(DATAINTEGRITY$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDataIntegrity(CTDataIntegrity var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataIntegrity var3 = null;
         var3 = (CTDataIntegrity)this.get_store().find_element_user(DATAINTEGRITY$2, 0);
         if(var3 == null) {
            var3 = (CTDataIntegrity)this.get_store().add_element_user(DATAINTEGRITY$2);
         }

         var3.set(var1);
      }
   }

   public CTDataIntegrity addNewDataIntegrity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataIntegrity var2 = null;
         var2 = (CTDataIntegrity)this.get_store().add_element_user(DATAINTEGRITY$2);
         return var2;
      }
   }

   public CTKeyEncryptors getKeyEncryptors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptors var2 = null;
         var2 = (CTKeyEncryptors)this.get_store().find_element_user(KEYENCRYPTORS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setKeyEncryptors(CTKeyEncryptors var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptors var3 = null;
         var3 = (CTKeyEncryptors)this.get_store().find_element_user(KEYENCRYPTORS$4, 0);
         if(var3 == null) {
            var3 = (CTKeyEncryptors)this.get_store().add_element_user(KEYENCRYPTORS$4);
         }

         var3.set(var1);
      }
   }

   public CTKeyEncryptors addNewKeyEncryptors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptors var2 = null;
         var2 = (CTKeyEncryptors)this.get_store().add_element_user(KEYENCRYPTORS$4);
         return var2;
      }
   }

}
