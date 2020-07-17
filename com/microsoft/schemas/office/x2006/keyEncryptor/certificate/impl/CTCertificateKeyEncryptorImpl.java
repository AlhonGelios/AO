package com.microsoft.schemas.office.x2006.keyEncryptor.certificate.impl;

import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTCertificateKeyEncryptorImpl extends XmlComplexContentImpl implements CTCertificateKeyEncryptor {

   private static final QName ENCRYPTEDKEYVALUE$0 = new QName("", "encryptedKeyValue");
   private static final QName X509CERTIFICATE$2 = new QName("", "X509Certificate");
   private static final QName CERTVERIFIER$4 = new QName("", "certVerifier");


   public CTCertificateKeyEncryptorImpl(SchemaType var1) {
      super(var1);
   }

   public byte[] getEncryptedKeyValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetEncryptedKeyValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
         return var2;
      }
   }

   public void setEncryptedKeyValue(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENCRYPTEDKEYVALUE$0);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetEncryptedKeyValue(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(ENCRYPTEDKEYVALUE$0);
         }

         var3.set(var1);
      }
   }

   public byte[] getX509Certificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(X509CERTIFICATE$2);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetX509Certificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(X509CERTIFICATE$2);
         return var2;
      }
   }

   public void setX509Certificate(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(X509CERTIFICATE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(X509CERTIFICATE$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetX509Certificate(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(X509CERTIFICATE$2);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(X509CERTIFICATE$2);
         }

         var3.set(var1);
      }
   }

   public byte[] getCertVerifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CERTVERIFIER$4);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetCertVerifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(CERTVERIFIER$4);
         return var2;
      }
   }

   public void setCertVerifier(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CERTVERIFIER$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CERTVERIFIER$4);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetCertVerifier(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(CERTVERIFIER$4);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(CERTVERIFIER$4);
         }

         var3.set(var1);
      }
   }

}
