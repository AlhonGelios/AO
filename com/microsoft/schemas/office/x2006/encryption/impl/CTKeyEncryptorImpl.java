package com.microsoft.schemas.office.x2006.encryption.impl;

import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor;
import com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTKeyEncryptorImpl extends XmlComplexContentImpl implements CTKeyEncryptor {

   private static final QName ENCRYPTEDPASSWORDKEY$0 = new QName("http://schemas.microsoft.com/office/2006/keyEncryptor/password", "encryptedKey");
   private static final QName ENCRYPTEDCERTIFICATEKEY$2 = new QName("http://schemas.microsoft.com/office/2006/keyEncryptor/certificate", "encryptedKey");
   private static final QName URI$4 = new QName("", "uri");


   public CTKeyEncryptorImpl(SchemaType var1) {
      super(var1);
   }

   public CTPasswordKeyEncryptor getEncryptedPasswordKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPasswordKeyEncryptor var2 = null;
         var2 = (CTPasswordKeyEncryptor)this.get_store().find_element_user(ENCRYPTEDPASSWORDKEY$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEncryptedPasswordKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENCRYPTEDPASSWORDKEY$0) != 0;
      }
   }

   public void setEncryptedPasswordKey(CTPasswordKeyEncryptor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPasswordKeyEncryptor var3 = null;
         var3 = (CTPasswordKeyEncryptor)this.get_store().find_element_user(ENCRYPTEDPASSWORDKEY$0, 0);
         if(var3 == null) {
            var3 = (CTPasswordKeyEncryptor)this.get_store().add_element_user(ENCRYPTEDPASSWORDKEY$0);
         }

         var3.set(var1);
      }
   }

   public CTPasswordKeyEncryptor addNewEncryptedPasswordKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPasswordKeyEncryptor var2 = null;
         var2 = (CTPasswordKeyEncryptor)this.get_store().add_element_user(ENCRYPTEDPASSWORDKEY$0);
         return var2;
      }
   }

   public void unsetEncryptedPasswordKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENCRYPTEDPASSWORDKEY$0, 0);
      }
   }

   public CTCertificateKeyEncryptor getEncryptedCertificateKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCertificateKeyEncryptor var2 = null;
         var2 = (CTCertificateKeyEncryptor)this.get_store().find_element_user(ENCRYPTEDCERTIFICATEKEY$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEncryptedCertificateKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENCRYPTEDCERTIFICATEKEY$2) != 0;
      }
   }

   public void setEncryptedCertificateKey(CTCertificateKeyEncryptor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCertificateKeyEncryptor var3 = null;
         var3 = (CTCertificateKeyEncryptor)this.get_store().find_element_user(ENCRYPTEDCERTIFICATEKEY$2, 0);
         if(var3 == null) {
            var3 = (CTCertificateKeyEncryptor)this.get_store().add_element_user(ENCRYPTEDCERTIFICATEKEY$2);
         }

         var3.set(var1);
      }
   }

   public CTCertificateKeyEncryptor addNewEncryptedCertificateKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCertificateKeyEncryptor var2 = null;
         var2 = (CTCertificateKeyEncryptor)this.get_store().add_element_user(ENCRYPTEDCERTIFICATEKEY$2);
         return var2;
      }
   }

   public void unsetEncryptedCertificateKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENCRYPTEDCERTIFICATEKEY$2, 0);
      }
   }

   public CTKeyEncryptor.Uri.Enum getUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(URI$4);
         return var2 == null?null:(CTKeyEncryptor.Uri.Enum)var2.getEnumValue();
      }
   }

   public CTKeyEncryptor.Uri xgetUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptor.Uri var2 = null;
         var2 = (CTKeyEncryptor.Uri)this.get_store().find_attribute_user(URI$4);
         return var2;
      }
   }

   public boolean isSetUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(URI$4) != null;
      }
   }

   public void setUri(CTKeyEncryptor.Uri.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(URI$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(URI$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUri(CTKeyEncryptor.Uri var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptor.Uri var3 = null;
         var3 = (CTKeyEncryptor.Uri)this.get_store().find_attribute_user(URI$4);
         if(var3 == null) {
            var3 = (CTKeyEncryptor.Uri)this.get_store().add_attribute_user(URI$4);
         }

         var3.set(var1);
      }
   }

   public void unsetUri() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(URI$4);
      }
   }


   public static class UriImpl extends JavaStringEnumerationHolderEx implements CTKeyEncryptor.Uri {

      public UriImpl(SchemaType var1) {
         super(var1, false);
      }

      protected UriImpl(SchemaType var1, boolean var2) {
         super(var1, var2);
      }
   }
}
