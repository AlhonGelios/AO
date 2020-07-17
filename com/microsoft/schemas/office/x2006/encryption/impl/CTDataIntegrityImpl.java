package com.microsoft.schemas.office.x2006.encryption.impl;

import com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTDataIntegrityImpl extends XmlComplexContentImpl implements CTDataIntegrity {

   private static final QName ENCRYPTEDHMACKEY$0 = new QName("", "encryptedHmacKey");
   private static final QName ENCRYPTEDHMACVALUE$2 = new QName("", "encryptedHmacValue");


   public CTDataIntegrityImpl(SchemaType var1) {
      super(var1);
   }

   public byte[] getEncryptedHmacKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetEncryptedHmacKey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
         return var2;
      }
   }

   public void setEncryptedHmacKey(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENCRYPTEDHMACKEY$0);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetEncryptedHmacKey(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(ENCRYPTEDHMACKEY$0);
         }

         var3.set(var1);
      }
   }

   public byte[] getEncryptedHmacValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetEncryptedHmacValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
         return var2;
      }
   }

   public void setEncryptedHmacValue(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENCRYPTEDHMACVALUE$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetEncryptedHmacValue(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(ENCRYPTEDHMACVALUE$2);
         }

         var3.set(var1);
      }
   }

}
