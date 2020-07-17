package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.AnyType;
import org.etsi.uri.x01903.v13.CertificateValuesType;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.etsi.uri.x01903.v13.impl.CertificateValuesTypeImpl.1EncapsulatedX509CertificateList;
import org.etsi.uri.x01903.v13.impl.CertificateValuesTypeImpl.1OtherCertificateList;

public class CertificateValuesTypeImpl extends XmlComplexContentImpl implements CertificateValuesType {

   private static final QName ENCAPSULATEDX509CERTIFICATE$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "EncapsulatedX509Certificate");
   private static final QName OTHERCERTIFICATE$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "OtherCertificate");
   private static final QName ID$4 = new QName("", "Id");


   public CertificateValuesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getEncapsulatedX509CertificateList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EncapsulatedX509CertificateList(this);
      }
   }

   public EncapsulatedPKIDataType[] getEncapsulatedX509CertificateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENCAPSULATEDX509CERTIFICATE$0, var2);
         EncapsulatedPKIDataType[] var3 = new EncapsulatedPKIDataType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public EncapsulatedPKIDataType getEncapsulatedX509CertificateArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDX509CERTIFICATE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEncapsulatedX509CertificateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENCAPSULATEDX509CERTIFICATE$0);
      }
   }

   public void setEncapsulatedX509CertificateArray(EncapsulatedPKIDataType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENCAPSULATEDX509CERTIFICATE$0);
      }
   }

   public void setEncapsulatedX509CertificateArray(int var1, EncapsulatedPKIDataType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var4 = null;
         var4 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDX509CERTIFICATE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public EncapsulatedPKIDataType insertNewEncapsulatedX509Certificate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().insert_element_user(ENCAPSULATEDX509CERTIFICATE$0, var1);
         return var3;
      }
   }

   public EncapsulatedPKIDataType addNewEncapsulatedX509Certificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var2 = null;
         var2 = (EncapsulatedPKIDataType)this.get_store().add_element_user(ENCAPSULATEDX509CERTIFICATE$0);
         return var2;
      }
   }

   public void removeEncapsulatedX509Certificate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENCAPSULATEDX509CERTIFICATE$0, var1);
      }
   }

   public List getOtherCertificateList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OtherCertificateList(this);
      }
   }

   public AnyType[] getOtherCertificateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OTHERCERTIFICATE$2, var2);
         AnyType[] var3 = new AnyType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public AnyType getOtherCertificateArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var3 = null;
         var3 = (AnyType)this.get_store().find_element_user(OTHERCERTIFICATE$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOtherCertificateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OTHERCERTIFICATE$2);
      }
   }

   public void setOtherCertificateArray(AnyType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OTHERCERTIFICATE$2);
      }
   }

   public void setOtherCertificateArray(int var1, AnyType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var4 = null;
         var4 = (AnyType)this.get_store().find_element_user(OTHERCERTIFICATE$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public AnyType insertNewOtherCertificate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var3 = null;
         var3 = (AnyType)this.get_store().insert_element_user(OTHERCERTIFICATE$2, var1);
         return var3;
      }
   }

   public AnyType addNewOtherCertificate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var2 = null;
         var2 = (AnyType)this.get_store().add_element_user(OTHERCERTIFICATE$2);
         return var2;
      }
   }

   public void removeOtherCertificate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OTHERCERTIFICATE$2, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$4);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$4) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$4);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$4);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$4);
      }
   }

}
