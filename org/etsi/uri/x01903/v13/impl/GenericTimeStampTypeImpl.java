package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.AnyType;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.etsi.uri.x01903.v13.GenericTimeStampType;
import org.etsi.uri.x01903.v13.IncludeType;
import org.etsi.uri.x01903.v13.ReferenceInfoType;
import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl.1EncapsulatedTimeStampList;
import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl.1IncludeList;
import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl.1ReferenceInfoList;
import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl.1XMLTimeStampList;
import org.w3.x2000.x09.xmldsig.CanonicalizationMethodType;

public class GenericTimeStampTypeImpl extends XmlComplexContentImpl implements GenericTimeStampType {

   private static final QName INCLUDE$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "Include");
   private static final QName REFERENCEINFO$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "ReferenceInfo");
   private static final QName CANONICALIZATIONMETHOD$4 = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
   private static final QName ENCAPSULATEDTIMESTAMP$6 = new QName("http://uri.etsi.org/01903/v1.3.2#", "EncapsulatedTimeStamp");
   private static final QName XMLTIMESTAMP$8 = new QName("http://uri.etsi.org/01903/v1.3.2#", "XMLTimeStamp");
   private static final QName ID$10 = new QName("", "Id");


   public GenericTimeStampTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getIncludeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1IncludeList(this);
      }
   }

   public IncludeType[] getIncludeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INCLUDE$0, var2);
         IncludeType[] var3 = new IncludeType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public IncludeType getIncludeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IncludeType var3 = null;
         var3 = (IncludeType)this.get_store().find_element_user(INCLUDE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfIncludeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INCLUDE$0);
      }
   }

   public void setIncludeArray(IncludeType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INCLUDE$0);
      }
   }

   public void setIncludeArray(int var1, IncludeType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IncludeType var4 = null;
         var4 = (IncludeType)this.get_store().find_element_user(INCLUDE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public IncludeType insertNewInclude(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IncludeType var3 = null;
         var3 = (IncludeType)this.get_store().insert_element_user(INCLUDE$0, var1);
         return var3;
      }
   }

   public IncludeType addNewInclude() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         IncludeType var2 = null;
         var2 = (IncludeType)this.get_store().add_element_user(INCLUDE$0);
         return var2;
      }
   }

   public void removeInclude(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INCLUDE$0, var1);
      }
   }

   public List getReferenceInfoList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ReferenceInfoList(this);
      }
   }

   public ReferenceInfoType[] getReferenceInfoArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REFERENCEINFO$2, var2);
         ReferenceInfoType[] var3 = new ReferenceInfoType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public ReferenceInfoType getReferenceInfoArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceInfoType var3 = null;
         var3 = (ReferenceInfoType)this.get_store().find_element_user(REFERENCEINFO$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfReferenceInfoArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REFERENCEINFO$2);
      }
   }

   public void setReferenceInfoArray(ReferenceInfoType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REFERENCEINFO$2);
      }
   }

   public void setReferenceInfoArray(int var1, ReferenceInfoType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceInfoType var4 = null;
         var4 = (ReferenceInfoType)this.get_store().find_element_user(REFERENCEINFO$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public ReferenceInfoType insertNewReferenceInfo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceInfoType var3 = null;
         var3 = (ReferenceInfoType)this.get_store().insert_element_user(REFERENCEINFO$2, var1);
         return var3;
      }
   }

   public ReferenceInfoType addNewReferenceInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ReferenceInfoType var2 = null;
         var2 = (ReferenceInfoType)this.get_store().add_element_user(REFERENCEINFO$2);
         return var2;
      }
   }

   public void removeReferenceInfo(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REFERENCEINFO$2, var1);
      }
   }

   public CanonicalizationMethodType getCanonicalizationMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CanonicalizationMethodType var2 = null;
         var2 = (CanonicalizationMethodType)this.get_store().find_element_user(CANONICALIZATIONMETHOD$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCanonicalizationMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CANONICALIZATIONMETHOD$4) != 0;
      }
   }

   public void setCanonicalizationMethod(CanonicalizationMethodType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CanonicalizationMethodType var3 = null;
         var3 = (CanonicalizationMethodType)this.get_store().find_element_user(CANONICALIZATIONMETHOD$4, 0);
         if(var3 == null) {
            var3 = (CanonicalizationMethodType)this.get_store().add_element_user(CANONICALIZATIONMETHOD$4);
         }

         var3.set(var1);
      }
   }

   public CanonicalizationMethodType addNewCanonicalizationMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CanonicalizationMethodType var2 = null;
         var2 = (CanonicalizationMethodType)this.get_store().add_element_user(CANONICALIZATIONMETHOD$4);
         return var2;
      }
   }

   public void unsetCanonicalizationMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CANONICALIZATIONMETHOD$4, 0);
      }
   }

   public List getEncapsulatedTimeStampList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EncapsulatedTimeStampList(this);
      }
   }

   public EncapsulatedPKIDataType[] getEncapsulatedTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENCAPSULATEDTIMESTAMP$6, var2);
         EncapsulatedPKIDataType[] var3 = new EncapsulatedPKIDataType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public EncapsulatedPKIDataType getEncapsulatedTimeStampArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDTIMESTAMP$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEncapsulatedTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENCAPSULATEDTIMESTAMP$6);
      }
   }

   public void setEncapsulatedTimeStampArray(EncapsulatedPKIDataType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENCAPSULATEDTIMESTAMP$6);
      }
   }

   public void setEncapsulatedTimeStampArray(int var1, EncapsulatedPKIDataType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var4 = null;
         var4 = (EncapsulatedPKIDataType)this.get_store().find_element_user(ENCAPSULATEDTIMESTAMP$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public EncapsulatedPKIDataType insertNewEncapsulatedTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var3 = null;
         var3 = (EncapsulatedPKIDataType)this.get_store().insert_element_user(ENCAPSULATEDTIMESTAMP$6, var1);
         return var3;
      }
   }

   public EncapsulatedPKIDataType addNewEncapsulatedTimeStamp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         EncapsulatedPKIDataType var2 = null;
         var2 = (EncapsulatedPKIDataType)this.get_store().add_element_user(ENCAPSULATEDTIMESTAMP$6);
         return var2;
      }
   }

   public void removeEncapsulatedTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENCAPSULATEDTIMESTAMP$6, var1);
      }
   }

   public List getXMLTimeStampList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1XMLTimeStampList(this);
      }
   }

   public AnyType[] getXMLTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(XMLTIMESTAMP$8, var2);
         AnyType[] var3 = new AnyType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public AnyType getXMLTimeStampArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var3 = null;
         var3 = (AnyType)this.get_store().find_element_user(XMLTIMESTAMP$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfXMLTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XMLTIMESTAMP$8);
      }
   }

   public void setXMLTimeStampArray(AnyType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, XMLTIMESTAMP$8);
      }
   }

   public void setXMLTimeStampArray(int var1, AnyType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var4 = null;
         var4 = (AnyType)this.get_store().find_element_user(XMLTIMESTAMP$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public AnyType insertNewXMLTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var3 = null;
         var3 = (AnyType)this.get_store().insert_element_user(XMLTIMESTAMP$8, var1);
         return var3;
      }
   }

   public AnyType addNewXMLTimeStamp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AnyType var2 = null;
         var2 = (AnyType)this.get_store().add_element_user(XMLTIMESTAMP$8);
         return var2;
      }
   }

   public void removeXMLTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XMLTIMESTAMP$8, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$10);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$10) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$10);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$10);
      }
   }

}
