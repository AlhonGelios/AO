package org.w3.x2000.x09.xmldsig.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.w3.x2000.x09.xmldsig.CanonicalizationMethodType;
import org.w3.x2000.x09.xmldsig.ReferenceType;
import org.w3.x2000.x09.xmldsig.SignatureMethodType;
import org.w3.x2000.x09.xmldsig.SignedInfoType;
import org.w3.x2000.x09.xmldsig.impl.SignedInfoTypeImpl.1ReferenceList;

public class SignedInfoTypeImpl extends XmlComplexContentImpl implements SignedInfoType {

   private static final QName CANONICALIZATIONMETHOD$0 = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
   private static final QName SIGNATUREMETHOD$2 = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
   private static final QName REFERENCE$4 = new QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
   private static final QName ID$6 = new QName("", "Id");


   public SignedInfoTypeImpl(SchemaType var1) {
      super(var1);
   }

   public CanonicalizationMethodType getCanonicalizationMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CanonicalizationMethodType var2 = null;
         var2 = (CanonicalizationMethodType)this.get_store().find_element_user(CANONICALIZATIONMETHOD$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCanonicalizationMethod(CanonicalizationMethodType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CanonicalizationMethodType var3 = null;
         var3 = (CanonicalizationMethodType)this.get_store().find_element_user(CANONICALIZATIONMETHOD$0, 0);
         if(var3 == null) {
            var3 = (CanonicalizationMethodType)this.get_store().add_element_user(CANONICALIZATIONMETHOD$0);
         }

         var3.set(var1);
      }
   }

   public CanonicalizationMethodType addNewCanonicalizationMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CanonicalizationMethodType var2 = null;
         var2 = (CanonicalizationMethodType)this.get_store().add_element_user(CANONICALIZATIONMETHOD$0);
         return var2;
      }
   }

   public SignatureMethodType getSignatureMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureMethodType var2 = null;
         var2 = (SignatureMethodType)this.get_store().find_element_user(SIGNATUREMETHOD$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSignatureMethod(SignatureMethodType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureMethodType var3 = null;
         var3 = (SignatureMethodType)this.get_store().find_element_user(SIGNATUREMETHOD$2, 0);
         if(var3 == null) {
            var3 = (SignatureMethodType)this.get_store().add_element_user(SIGNATUREMETHOD$2);
         }

         var3.set(var1);
      }
   }

   public SignatureMethodType addNewSignatureMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SignatureMethodType var2 = null;
         var2 = (SignatureMethodType)this.get_store().add_element_user(SIGNATUREMETHOD$2);
         return var2;
      }
   }

   public List getReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ReferenceList(this);
      }
   }

   public ReferenceType[] getReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REFERENCE$4, var2);
         ReferenceType[] var3 = new ReferenceType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public ReferenceType getReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceType var3 = null;
         var3 = (ReferenceType)this.get_store().find_element_user(REFERENCE$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REFERENCE$4);
      }
   }

   public void setReferenceArray(ReferenceType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REFERENCE$4);
      }
   }

   public void setReferenceArray(int var1, ReferenceType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceType var4 = null;
         var4 = (ReferenceType)this.get_store().find_element_user(REFERENCE$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public ReferenceType insertNewReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceType var3 = null;
         var3 = (ReferenceType)this.get_store().insert_element_user(REFERENCE$4, var1);
         return var3;
      }
   }

   public ReferenceType addNewReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceType var2 = null;
         var2 = (ReferenceType)this.get_store().add_element_user(REFERENCE$4);
         return var2;
      }
   }

   public void removeReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REFERENCE$4, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$6) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$6);
      }
   }

}
