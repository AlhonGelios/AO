package com.microsoft.schemas.office.x2006.encryption.impl;

import com.microsoft.schemas.office.x2006.encryption.CTKeyData;
import com.microsoft.schemas.office.x2006.encryption.STBlockSize;
import com.microsoft.schemas.office.x2006.encryption.STCipherAlgorithm;
import com.microsoft.schemas.office.x2006.encryption.STCipherChaining;
import com.microsoft.schemas.office.x2006.encryption.STHashAlgorithm;
import com.microsoft.schemas.office.x2006.encryption.STHashSize;
import com.microsoft.schemas.office.x2006.encryption.STKeyBits;
import com.microsoft.schemas.office.x2006.encryption.STSaltSize;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTKeyDataImpl extends XmlComplexContentImpl implements CTKeyData {

   private static final QName SALTSIZE$0 = new QName("", "saltSize");
   private static final QName BLOCKSIZE$2 = new QName("", "blockSize");
   private static final QName KEYBITS$4 = new QName("", "keyBits");
   private static final QName HASHSIZE$6 = new QName("", "hashSize");
   private static final QName CIPHERALGORITHM$8 = new QName("", "cipherAlgorithm");
   private static final QName CIPHERCHAINING$10 = new QName("", "cipherChaining");
   private static final QName HASHALGORITHM$12 = new QName("", "hashAlgorithm");
   private static final QName SALTVALUE$14 = new QName("", "saltValue");


   public CTKeyDataImpl(SchemaType var1) {
      super(var1);
   }

   public int getSaltSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SALTSIZE$0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STSaltSize xgetSaltSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSaltSize var2 = null;
         var2 = (STSaltSize)this.get_store().find_attribute_user(SALTSIZE$0);
         return var2;
      }
   }

   public void setSaltSize(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SALTSIZE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SALTSIZE$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSaltSize(STSaltSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSaltSize var3 = null;
         var3 = (STSaltSize)this.get_store().find_attribute_user(SALTSIZE$0);
         if(var3 == null) {
            var3 = (STSaltSize)this.get_store().add_attribute_user(SALTSIZE$0);
         }

         var3.set(var1);
      }
   }

   public int getBlockSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BLOCKSIZE$2);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STBlockSize xgetBlockSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlockSize var2 = null;
         var2 = (STBlockSize)this.get_store().find_attribute_user(BLOCKSIZE$2);
         return var2;
      }
   }

   public void setBlockSize(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BLOCKSIZE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BLOCKSIZE$2);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetBlockSize(STBlockSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlockSize var3 = null;
         var3 = (STBlockSize)this.get_store().find_attribute_user(BLOCKSIZE$2);
         if(var3 == null) {
            var3 = (STBlockSize)this.get_store().add_attribute_user(BLOCKSIZE$2);
         }

         var3.set(var1);
      }
   }

   public long getKeyBits() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(KEYBITS$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STKeyBits xgetKeyBits() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STKeyBits var2 = null;
         var2 = (STKeyBits)this.get_store().find_attribute_user(KEYBITS$4);
         return var2;
      }
   }

   public void setKeyBits(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(KEYBITS$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(KEYBITS$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetKeyBits(STKeyBits var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STKeyBits var3 = null;
         var3 = (STKeyBits)this.get_store().find_attribute_user(KEYBITS$4);
         if(var3 == null) {
            var3 = (STKeyBits)this.get_store().add_attribute_user(KEYBITS$4);
         }

         var3.set(var1);
      }
   }

   public int getHashSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HASHSIZE$6);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STHashSize xgetHashSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHashSize var2 = null;
         var2 = (STHashSize)this.get_store().find_attribute_user(HASHSIZE$6);
         return var2;
      }
   }

   public void setHashSize(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HASHSIZE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HASHSIZE$6);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetHashSize(STHashSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHashSize var3 = null;
         var3 = (STHashSize)this.get_store().find_attribute_user(HASHSIZE$6);
         if(var3 == null) {
            var3 = (STHashSize)this.get_store().add_attribute_user(HASHSIZE$6);
         }

         var3.set(var1);
      }
   }

   public STCipherAlgorithm.Enum getCipherAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CIPHERALGORITHM$8);
         return var2 == null?null:(STCipherAlgorithm.Enum)var2.getEnumValue();
      }
   }

   public STCipherAlgorithm xgetCipherAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCipherAlgorithm var2 = null;
         var2 = (STCipherAlgorithm)this.get_store().find_attribute_user(CIPHERALGORITHM$8);
         return var2;
      }
   }

   public void setCipherAlgorithm(STCipherAlgorithm.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CIPHERALGORITHM$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CIPHERALGORITHM$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCipherAlgorithm(STCipherAlgorithm var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCipherAlgorithm var3 = null;
         var3 = (STCipherAlgorithm)this.get_store().find_attribute_user(CIPHERALGORITHM$8);
         if(var3 == null) {
            var3 = (STCipherAlgorithm)this.get_store().add_attribute_user(CIPHERALGORITHM$8);
         }

         var3.set(var1);
      }
   }

   public STCipherChaining.Enum getCipherChaining() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CIPHERCHAINING$10);
         return var2 == null?null:(STCipherChaining.Enum)var2.getEnumValue();
      }
   }

   public STCipherChaining xgetCipherChaining() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCipherChaining var2 = null;
         var2 = (STCipherChaining)this.get_store().find_attribute_user(CIPHERCHAINING$10);
         return var2;
      }
   }

   public void setCipherChaining(STCipherChaining.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CIPHERCHAINING$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CIPHERCHAINING$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCipherChaining(STCipherChaining var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCipherChaining var3 = null;
         var3 = (STCipherChaining)this.get_store().find_attribute_user(CIPHERCHAINING$10);
         if(var3 == null) {
            var3 = (STCipherChaining)this.get_store().add_attribute_user(CIPHERCHAINING$10);
         }

         var3.set(var1);
      }
   }

   public STHashAlgorithm.Enum getHashAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HASHALGORITHM$12);
         return var2 == null?null:(STHashAlgorithm.Enum)var2.getEnumValue();
      }
   }

   public STHashAlgorithm xgetHashAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHashAlgorithm var2 = null;
         var2 = (STHashAlgorithm)this.get_store().find_attribute_user(HASHALGORITHM$12);
         return var2;
      }
   }

   public void setHashAlgorithm(STHashAlgorithm.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HASHALGORITHM$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HASHALGORITHM$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHashAlgorithm(STHashAlgorithm var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHashAlgorithm var3 = null;
         var3 = (STHashAlgorithm)this.get_store().find_attribute_user(HASHALGORITHM$12);
         if(var3 == null) {
            var3 = (STHashAlgorithm)this.get_store().add_attribute_user(HASHALGORITHM$12);
         }

         var3.set(var1);
      }
   }

   public byte[] getSaltValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SALTVALUE$14);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetSaltValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(SALTVALUE$14);
         return var2;
      }
   }

   public void setSaltValue(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SALTVALUE$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SALTVALUE$14);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetSaltValue(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(SALTVALUE$14);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(SALTVALUE$14);
         }

         var3.set(var1);
      }
   }

}
