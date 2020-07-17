package com.microsoft.schemas.office.x2006.encryption.impl;

import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptors;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTKeyEncryptorsImpl extends XmlComplexContentImpl implements CTKeyEncryptors {

   private static final QName KEYENCRYPTOR$0 = new QName("http://schemas.microsoft.com/office/2006/encryption", "keyEncryptor");


   public CTKeyEncryptorsImpl(SchemaType var1) {
      super(var1);
   }

   public List getKeyEncryptorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class KeyEncryptorList extends AbstractList {

            public CTKeyEncryptor get(int var1) {
               return CTKeyEncryptorsImpl.this.getKeyEncryptorArray(var1);
            }

            public CTKeyEncryptor set(int var1, CTKeyEncryptor var2) {
               CTKeyEncryptor var3 = CTKeyEncryptorsImpl.this.getKeyEncryptorArray(var1);
               CTKeyEncryptorsImpl.this.setKeyEncryptorArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTKeyEncryptor var2) {
               CTKeyEncryptorsImpl.this.insertNewKeyEncryptor(var1).set(var2);
            }

            public CTKeyEncryptor remove(int var1) {
               CTKeyEncryptor var2 = CTKeyEncryptorsImpl.this.getKeyEncryptorArray(var1);
               CTKeyEncryptorsImpl.this.removeKeyEncryptor(var1);
               return var2;
            }

            public int size() {
               return CTKeyEncryptorsImpl.this.sizeOfKeyEncryptorArray();
            }
         }

         return new KeyEncryptorList();
      }
   }

   public CTKeyEncryptor[] getKeyEncryptorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(KEYENCRYPTOR$0, var2);
         CTKeyEncryptor[] var3 = new CTKeyEncryptor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTKeyEncryptor getKeyEncryptorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptor var3 = null;
         var3 = (CTKeyEncryptor)this.get_store().find_element_user(KEYENCRYPTOR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfKeyEncryptorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KEYENCRYPTOR$0);
      }
   }

   public void setKeyEncryptorArray(CTKeyEncryptor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, KEYENCRYPTOR$0);
      }
   }

   public void setKeyEncryptorArray(int var1, CTKeyEncryptor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptor var4 = null;
         var4 = (CTKeyEncryptor)this.get_store().find_element_user(KEYENCRYPTOR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTKeyEncryptor insertNewKeyEncryptor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptor var3 = null;
         var3 = (CTKeyEncryptor)this.get_store().insert_element_user(KEYENCRYPTOR$0, var1);
         return var3;
      }
   }

   public CTKeyEncryptor addNewKeyEncryptor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKeyEncryptor var2 = null;
         var2 = (CTKeyEncryptor)this.get_store().add_element_user(KEYENCRYPTOR$0);
         return var2;
      }
   }

   public void removeKeyEncryptor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KEYENCRYPTOR$0, var1);
      }
   }

}
