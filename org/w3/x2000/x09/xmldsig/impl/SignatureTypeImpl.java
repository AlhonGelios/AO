package org.w3.x2000.x09.xmldsig.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.KeyInfoType;
import org.w3.x2000.x09.xmldsig.ObjectType;
import org.w3.x2000.x09.xmldsig.SignatureType;
import org.w3.x2000.x09.xmldsig.SignatureValueType;
import org.w3.x2000.x09.xmldsig.SignedInfoType;
import org.w3.x2000.x09.xmldsig.impl.SignatureTypeImpl.1ObjectList;

public class SignatureTypeImpl extends XmlComplexContentImpl implements SignatureType {

   private static final QName SIGNEDINFO$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
   private static final QName SIGNATUREVALUE$2 = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
   private static final QName KEYINFO$4 = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
   private static final QName OBJECT$6 = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
   private static final QName ID$8 = new QName("", "Id");


   public SignatureTypeImpl(SchemaType var1) {
      super(var1);
   }

   public SignedInfoType getSignedInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedInfoType var2 = null;
         var2 = (SignedInfoType)this.get_store().find_element_user(SIGNEDINFO$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSignedInfo(SignedInfoType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedInfoType var3 = null;
         var3 = (SignedInfoType)this.get_store().find_element_user(SIGNEDINFO$0, 0);
         if(var3 == null) {
            var3 = (SignedInfoType)this.get_store().add_element_user(SIGNEDINFO$0);
         }

         var3.set(var1);
      }
   }

   public SignedInfoType addNewSignedInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignedInfoType var2 = null;
         var2 = (SignedInfoType)this.get_store().add_element_user(SIGNEDINFO$0);
         return var2;
      }
   }

   public SignatureValueType getSignatureValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureValueType var2 = null;
         var2 = (SignatureValueType)this.get_store().find_element_user(SIGNATUREVALUE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSignatureValue(SignatureValueType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureValueType var3 = null;
         var3 = (SignatureValueType)this.get_store().find_element_user(SIGNATUREVALUE$2, 0);
         if(var3 == null) {
            var3 = (SignatureValueType)this.get_store().add_element_user(SIGNATUREVALUE$2);
         }

         var3.set(var1);
      }
   }

   public SignatureValueType addNewSignatureValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureValueType var2 = null;
         var2 = (SignatureValueType)this.get_store().add_element_user(SIGNATUREVALUE$2);
         return var2;
      }
   }

   public KeyInfoType getKeyInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         KeyInfoType var2 = null;
         var2 = (KeyInfoType)this.get_store().find_element_user(KEYINFO$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKeyInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KEYINFO$4) != 0;
      }
   }

   public void setKeyInfo(KeyInfoType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         KeyInfoType var3 = null;
         var3 = (KeyInfoType)this.get_store().find_element_user(KEYINFO$4, 0);
         if(var3 == null) {
            var3 = (KeyInfoType)this.get_store().add_element_user(KEYINFO$4);
         }

         var3.set(var1);
      }
   }

   public KeyInfoType addNewKeyInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         KeyInfoType var2 = null;
         var2 = (KeyInfoType)this.get_store().add_element_user(KEYINFO$4);
         return var2;
      }
   }

   public void unsetKeyInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KEYINFO$4, 0);
      }
   }

   public List getObjectList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ObjectList(this);
      }
   }

   public ObjectType[] getObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OBJECT$6, var2);
         ObjectType[] var3 = new ObjectType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public ObjectType getObjectArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ObjectType var3 = null;
         var3 = (ObjectType)this.get_store().find_element_user(OBJECT$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OBJECT$6);
      }
   }

   public void setObjectArray(ObjectType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OBJECT$6);
      }
   }

   public void setObjectArray(int var1, ObjectType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ObjectType var4 = null;
         var4 = (ObjectType)this.get_store().find_element_user(OBJECT$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public ObjectType insertNewObject(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ObjectType var3 = null;
         var3 = (ObjectType)this.get_store().insert_element_user(OBJECT$6, var1);
         return var3;
      }
   }

   public ObjectType addNewObject() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ObjectType var2 = null;
         var2 = (ObjectType)this.get_store().add_element_user(OBJECT$6);
         return var2;
      }
   }

   public void removeObject(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OBJECT$6, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$8);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$8) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$8);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$8);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$8);
      }
   }

}
