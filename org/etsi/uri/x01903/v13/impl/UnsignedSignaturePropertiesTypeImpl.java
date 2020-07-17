package org.etsi.uri.x01903.v13.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.etsi.uri.x01903.v13.CertificateValuesType;
import org.etsi.uri.x01903.v13.CompleteCertificateRefsType;
import org.etsi.uri.x01903.v13.CompleteRevocationRefsType;
import org.etsi.uri.x01903.v13.CounterSignatureType;
import org.etsi.uri.x01903.v13.RevocationValuesType;
import org.etsi.uri.x01903.v13.UnsignedSignaturePropertiesType;
import org.etsi.uri.x01903.v13.XAdESTimeStampType;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1ArchiveTimeStampList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1AttrAuthoritiesCertValuesList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1AttributeCertificateRefsList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1AttributeRevocationRefsList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1AttributeRevocationValuesList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1CertificateValuesList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1CompleteCertificateRefsList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1CompleteRevocationRefsList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1CounterSignatureList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1RefsOnlyTimeStampList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1RevocationValuesList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1SigAndRefsTimeStampList;
import org.etsi.uri.x01903.v13.impl.UnsignedSignaturePropertiesTypeImpl.1SignatureTimeStampList;

public class UnsignedSignaturePropertiesTypeImpl extends XmlComplexContentImpl implements UnsignedSignaturePropertiesType {

   private static final QName COUNTERSIGNATURE$0 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CounterSignature");
   private static final QName SIGNATURETIMESTAMP$2 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignatureTimeStamp");
   private static final QName COMPLETECERTIFICATEREFS$4 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteCertificateRefs");
   private static final QName COMPLETEREVOCATIONREFS$6 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteRevocationRefs");
   private static final QName ATTRIBUTECERTIFICATEREFS$8 = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeCertificateRefs");
   private static final QName ATTRIBUTEREVOCATIONREFS$10 = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationRefs");
   private static final QName SIGANDREFSTIMESTAMP$12 = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigAndRefsTimeStamp");
   private static final QName REFSONLYTIMESTAMP$14 = new QName("http://uri.etsi.org/01903/v1.3.2#", "RefsOnlyTimeStamp");
   private static final QName CERTIFICATEVALUES$16 = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertificateValues");
   private static final QName REVOCATIONVALUES$18 = new QName("http://uri.etsi.org/01903/v1.3.2#", "RevocationValues");
   private static final QName ATTRAUTHORITIESCERTVALUES$20 = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttrAuthoritiesCertValues");
   private static final QName ATTRIBUTEREVOCATIONVALUES$22 = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationValues");
   private static final QName ARCHIVETIMESTAMP$24 = new QName("http://uri.etsi.org/01903/v1.3.2#", "ArchiveTimeStamp");
   private static final QName ID$26 = new QName("", "Id");


   public UnsignedSignaturePropertiesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getCounterSignatureList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CounterSignatureList(this);
      }
   }

   public CounterSignatureType[] getCounterSignatureArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COUNTERSIGNATURE$0, var2);
         CounterSignatureType[] var3 = new CounterSignatureType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CounterSignatureType getCounterSignatureArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CounterSignatureType var3 = null;
         var3 = (CounterSignatureType)this.get_store().find_element_user(COUNTERSIGNATURE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCounterSignatureArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COUNTERSIGNATURE$0);
      }
   }

   public void setCounterSignatureArray(CounterSignatureType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COUNTERSIGNATURE$0);
      }
   }

   public void setCounterSignatureArray(int var1, CounterSignatureType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CounterSignatureType var4 = null;
         var4 = (CounterSignatureType)this.get_store().find_element_user(COUNTERSIGNATURE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CounterSignatureType insertNewCounterSignature(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CounterSignatureType var3 = null;
         var3 = (CounterSignatureType)this.get_store().insert_element_user(COUNTERSIGNATURE$0, var1);
         return var3;
      }
   }

   public CounterSignatureType addNewCounterSignature() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CounterSignatureType var2 = null;
         var2 = (CounterSignatureType)this.get_store().add_element_user(COUNTERSIGNATURE$0);
         return var2;
      }
   }

   public void removeCounterSignature(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COUNTERSIGNATURE$0, var1);
      }
   }

   public List getSignatureTimeStampList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SignatureTimeStampList(this);
      }
   }

   public XAdESTimeStampType[] getSignatureTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SIGNATURETIMESTAMP$2, var2);
         XAdESTimeStampType[] var3 = new XAdESTimeStampType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XAdESTimeStampType getSignatureTimeStampArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().find_element_user(SIGNATURETIMESTAMP$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSignatureTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNATURETIMESTAMP$2);
      }
   }

   public void setSignatureTimeStampArray(XAdESTimeStampType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SIGNATURETIMESTAMP$2);
      }
   }

   public void setSignatureTimeStampArray(int var1, XAdESTimeStampType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var4 = null;
         var4 = (XAdESTimeStampType)this.get_store().find_element_user(SIGNATURETIMESTAMP$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public XAdESTimeStampType insertNewSignatureTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().insert_element_user(SIGNATURETIMESTAMP$2, var1);
         return var3;
      }
   }

   public XAdESTimeStampType addNewSignatureTimeStamp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var2 = null;
         var2 = (XAdESTimeStampType)this.get_store().add_element_user(SIGNATURETIMESTAMP$2);
         return var2;
      }
   }

   public void removeSignatureTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNATURETIMESTAMP$2, var1);
      }
   }

   public List getCompleteCertificateRefsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CompleteCertificateRefsList(this);
      }
   }

   public CompleteCertificateRefsType[] getCompleteCertificateRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMPLETECERTIFICATEREFS$4, var2);
         CompleteCertificateRefsType[] var3 = new CompleteCertificateRefsType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CompleteCertificateRefsType getCompleteCertificateRefsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var3 = null;
         var3 = (CompleteCertificateRefsType)this.get_store().find_element_user(COMPLETECERTIFICATEREFS$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCompleteCertificateRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMPLETECERTIFICATEREFS$4);
      }
   }

   public void setCompleteCertificateRefsArray(CompleteCertificateRefsType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMPLETECERTIFICATEREFS$4);
      }
   }

   public void setCompleteCertificateRefsArray(int var1, CompleteCertificateRefsType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var4 = null;
         var4 = (CompleteCertificateRefsType)this.get_store().find_element_user(COMPLETECERTIFICATEREFS$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CompleteCertificateRefsType insertNewCompleteCertificateRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var3 = null;
         var3 = (CompleteCertificateRefsType)this.get_store().insert_element_user(COMPLETECERTIFICATEREFS$4, var1);
         return var3;
      }
   }

   public CompleteCertificateRefsType addNewCompleteCertificateRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var2 = null;
         var2 = (CompleteCertificateRefsType)this.get_store().add_element_user(COMPLETECERTIFICATEREFS$4);
         return var2;
      }
   }

   public void removeCompleteCertificateRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMPLETECERTIFICATEREFS$4, var1);
      }
   }

   public List getCompleteRevocationRefsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CompleteRevocationRefsList(this);
      }
   }

   public CompleteRevocationRefsType[] getCompleteRevocationRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMPLETEREVOCATIONREFS$6, var2);
         CompleteRevocationRefsType[] var3 = new CompleteRevocationRefsType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CompleteRevocationRefsType getCompleteRevocationRefsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var3 = null;
         var3 = (CompleteRevocationRefsType)this.get_store().find_element_user(COMPLETEREVOCATIONREFS$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCompleteRevocationRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMPLETEREVOCATIONREFS$6);
      }
   }

   public void setCompleteRevocationRefsArray(CompleteRevocationRefsType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMPLETEREVOCATIONREFS$6);
      }
   }

   public void setCompleteRevocationRefsArray(int var1, CompleteRevocationRefsType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var4 = null;
         var4 = (CompleteRevocationRefsType)this.get_store().find_element_user(COMPLETEREVOCATIONREFS$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CompleteRevocationRefsType insertNewCompleteRevocationRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var3 = null;
         var3 = (CompleteRevocationRefsType)this.get_store().insert_element_user(COMPLETEREVOCATIONREFS$6, var1);
         return var3;
      }
   }

   public CompleteRevocationRefsType addNewCompleteRevocationRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var2 = null;
         var2 = (CompleteRevocationRefsType)this.get_store().add_element_user(COMPLETEREVOCATIONREFS$6);
         return var2;
      }
   }

   public void removeCompleteRevocationRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMPLETEREVOCATIONREFS$6, var1);
      }
   }

   public List getAttributeCertificateRefsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AttributeCertificateRefsList(this);
      }
   }

   public CompleteCertificateRefsType[] getAttributeCertificateRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ATTRIBUTECERTIFICATEREFS$8, var2);
         CompleteCertificateRefsType[] var3 = new CompleteCertificateRefsType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CompleteCertificateRefsType getAttributeCertificateRefsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var3 = null;
         var3 = (CompleteCertificateRefsType)this.get_store().find_element_user(ATTRIBUTECERTIFICATEREFS$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAttributeCertificateRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTRIBUTECERTIFICATEREFS$8);
      }
   }

   public void setAttributeCertificateRefsArray(CompleteCertificateRefsType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ATTRIBUTECERTIFICATEREFS$8);
      }
   }

   public void setAttributeCertificateRefsArray(int var1, CompleteCertificateRefsType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var4 = null;
         var4 = (CompleteCertificateRefsType)this.get_store().find_element_user(ATTRIBUTECERTIFICATEREFS$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CompleteCertificateRefsType insertNewAttributeCertificateRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var3 = null;
         var3 = (CompleteCertificateRefsType)this.get_store().insert_element_user(ATTRIBUTECERTIFICATEREFS$8, var1);
         return var3;
      }
   }

   public CompleteCertificateRefsType addNewAttributeCertificateRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteCertificateRefsType var2 = null;
         var2 = (CompleteCertificateRefsType)this.get_store().add_element_user(ATTRIBUTECERTIFICATEREFS$8);
         return var2;
      }
   }

   public void removeAttributeCertificateRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTRIBUTECERTIFICATEREFS$8, var1);
      }
   }

   public List getAttributeRevocationRefsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AttributeRevocationRefsList(this);
      }
   }

   public CompleteRevocationRefsType[] getAttributeRevocationRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ATTRIBUTEREVOCATIONREFS$10, var2);
         CompleteRevocationRefsType[] var3 = new CompleteRevocationRefsType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CompleteRevocationRefsType getAttributeRevocationRefsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var3 = null;
         var3 = (CompleteRevocationRefsType)this.get_store().find_element_user(ATTRIBUTEREVOCATIONREFS$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAttributeRevocationRefsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTRIBUTEREVOCATIONREFS$10);
      }
   }

   public void setAttributeRevocationRefsArray(CompleteRevocationRefsType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ATTRIBUTEREVOCATIONREFS$10);
      }
   }

   public void setAttributeRevocationRefsArray(int var1, CompleteRevocationRefsType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var4 = null;
         var4 = (CompleteRevocationRefsType)this.get_store().find_element_user(ATTRIBUTEREVOCATIONREFS$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CompleteRevocationRefsType insertNewAttributeRevocationRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var3 = null;
         var3 = (CompleteRevocationRefsType)this.get_store().insert_element_user(ATTRIBUTEREVOCATIONREFS$10, var1);
         return var3;
      }
   }

   public CompleteRevocationRefsType addNewAttributeRevocationRefs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CompleteRevocationRefsType var2 = null;
         var2 = (CompleteRevocationRefsType)this.get_store().add_element_user(ATTRIBUTEREVOCATIONREFS$10);
         return var2;
      }
   }

   public void removeAttributeRevocationRefs(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTRIBUTEREVOCATIONREFS$10, var1);
      }
   }

   public List getSigAndRefsTimeStampList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SigAndRefsTimeStampList(this);
      }
   }

   public XAdESTimeStampType[] getSigAndRefsTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SIGANDREFSTIMESTAMP$12, var2);
         XAdESTimeStampType[] var3 = new XAdESTimeStampType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XAdESTimeStampType getSigAndRefsTimeStampArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().find_element_user(SIGANDREFSTIMESTAMP$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSigAndRefsTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGANDREFSTIMESTAMP$12);
      }
   }

   public void setSigAndRefsTimeStampArray(XAdESTimeStampType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SIGANDREFSTIMESTAMP$12);
      }
   }

   public void setSigAndRefsTimeStampArray(int var1, XAdESTimeStampType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var4 = null;
         var4 = (XAdESTimeStampType)this.get_store().find_element_user(SIGANDREFSTIMESTAMP$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public XAdESTimeStampType insertNewSigAndRefsTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().insert_element_user(SIGANDREFSTIMESTAMP$12, var1);
         return var3;
      }
   }

   public XAdESTimeStampType addNewSigAndRefsTimeStamp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var2 = null;
         var2 = (XAdESTimeStampType)this.get_store().add_element_user(SIGANDREFSTIMESTAMP$12);
         return var2;
      }
   }

   public void removeSigAndRefsTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGANDREFSTIMESTAMP$12, var1);
      }
   }

   public List getRefsOnlyTimeStampList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RefsOnlyTimeStampList(this);
      }
   }

   public XAdESTimeStampType[] getRefsOnlyTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REFSONLYTIMESTAMP$14, var2);
         XAdESTimeStampType[] var3 = new XAdESTimeStampType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XAdESTimeStampType getRefsOnlyTimeStampArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().find_element_user(REFSONLYTIMESTAMP$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRefsOnlyTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REFSONLYTIMESTAMP$14);
      }
   }

   public void setRefsOnlyTimeStampArray(XAdESTimeStampType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REFSONLYTIMESTAMP$14);
      }
   }

   public void setRefsOnlyTimeStampArray(int var1, XAdESTimeStampType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var4 = null;
         var4 = (XAdESTimeStampType)this.get_store().find_element_user(REFSONLYTIMESTAMP$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public XAdESTimeStampType insertNewRefsOnlyTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().insert_element_user(REFSONLYTIMESTAMP$14, var1);
         return var3;
      }
   }

   public XAdESTimeStampType addNewRefsOnlyTimeStamp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var2 = null;
         var2 = (XAdESTimeStampType)this.get_store().add_element_user(REFSONLYTIMESTAMP$14);
         return var2;
      }
   }

   public void removeRefsOnlyTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REFSONLYTIMESTAMP$14, var1);
      }
   }

   public List getCertificateValuesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CertificateValuesList(this);
      }
   }

   public CertificateValuesType[] getCertificateValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CERTIFICATEVALUES$16, var2);
         CertificateValuesType[] var3 = new CertificateValuesType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CertificateValuesType getCertificateValuesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var3 = null;
         var3 = (CertificateValuesType)this.get_store().find_element_user(CERTIFICATEVALUES$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCertificateValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CERTIFICATEVALUES$16);
      }
   }

   public void setCertificateValuesArray(CertificateValuesType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CERTIFICATEVALUES$16);
      }
   }

   public void setCertificateValuesArray(int var1, CertificateValuesType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var4 = null;
         var4 = (CertificateValuesType)this.get_store().find_element_user(CERTIFICATEVALUES$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CertificateValuesType insertNewCertificateValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var3 = null;
         var3 = (CertificateValuesType)this.get_store().insert_element_user(CERTIFICATEVALUES$16, var1);
         return var3;
      }
   }

   public CertificateValuesType addNewCertificateValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var2 = null;
         var2 = (CertificateValuesType)this.get_store().add_element_user(CERTIFICATEVALUES$16);
         return var2;
      }
   }

   public void removeCertificateValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CERTIFICATEVALUES$16, var1);
      }
   }

   public List getRevocationValuesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RevocationValuesList(this);
      }
   }

   public RevocationValuesType[] getRevocationValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REVOCATIONVALUES$18, var2);
         RevocationValuesType[] var3 = new RevocationValuesType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public RevocationValuesType getRevocationValuesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var3 = null;
         var3 = (RevocationValuesType)this.get_store().find_element_user(REVOCATIONVALUES$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRevocationValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REVOCATIONVALUES$18);
      }
   }

   public void setRevocationValuesArray(RevocationValuesType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REVOCATIONVALUES$18);
      }
   }

   public void setRevocationValuesArray(int var1, RevocationValuesType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var4 = null;
         var4 = (RevocationValuesType)this.get_store().find_element_user(REVOCATIONVALUES$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public RevocationValuesType insertNewRevocationValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var3 = null;
         var3 = (RevocationValuesType)this.get_store().insert_element_user(REVOCATIONVALUES$18, var1);
         return var3;
      }
   }

   public RevocationValuesType addNewRevocationValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var2 = null;
         var2 = (RevocationValuesType)this.get_store().add_element_user(REVOCATIONVALUES$18);
         return var2;
      }
   }

   public void removeRevocationValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REVOCATIONVALUES$18, var1);
      }
   }

   public List getAttrAuthoritiesCertValuesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AttrAuthoritiesCertValuesList(this);
      }
   }

   public CertificateValuesType[] getAttrAuthoritiesCertValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ATTRAUTHORITIESCERTVALUES$20, var2);
         CertificateValuesType[] var3 = new CertificateValuesType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CertificateValuesType getAttrAuthoritiesCertValuesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var3 = null;
         var3 = (CertificateValuesType)this.get_store().find_element_user(ATTRAUTHORITIESCERTVALUES$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAttrAuthoritiesCertValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTRAUTHORITIESCERTVALUES$20);
      }
   }

   public void setAttrAuthoritiesCertValuesArray(CertificateValuesType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ATTRAUTHORITIESCERTVALUES$20);
      }
   }

   public void setAttrAuthoritiesCertValuesArray(int var1, CertificateValuesType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var4 = null;
         var4 = (CertificateValuesType)this.get_store().find_element_user(ATTRAUTHORITIESCERTVALUES$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CertificateValuesType insertNewAttrAuthoritiesCertValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var3 = null;
         var3 = (CertificateValuesType)this.get_store().insert_element_user(ATTRAUTHORITIESCERTVALUES$20, var1);
         return var3;
      }
   }

   public CertificateValuesType addNewAttrAuthoritiesCertValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CertificateValuesType var2 = null;
         var2 = (CertificateValuesType)this.get_store().add_element_user(ATTRAUTHORITIESCERTVALUES$20);
         return var2;
      }
   }

   public void removeAttrAuthoritiesCertValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTRAUTHORITIESCERTVALUES$20, var1);
      }
   }

   public List getAttributeRevocationValuesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AttributeRevocationValuesList(this);
      }
   }

   public RevocationValuesType[] getAttributeRevocationValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ATTRIBUTEREVOCATIONVALUES$22, var2);
         RevocationValuesType[] var3 = new RevocationValuesType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public RevocationValuesType getAttributeRevocationValuesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var3 = null;
         var3 = (RevocationValuesType)this.get_store().find_element_user(ATTRIBUTEREVOCATIONVALUES$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAttributeRevocationValuesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTRIBUTEREVOCATIONVALUES$22);
      }
   }

   public void setAttributeRevocationValuesArray(RevocationValuesType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ATTRIBUTEREVOCATIONVALUES$22);
      }
   }

   public void setAttributeRevocationValuesArray(int var1, RevocationValuesType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var4 = null;
         var4 = (RevocationValuesType)this.get_store().find_element_user(ATTRIBUTEREVOCATIONVALUES$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public RevocationValuesType insertNewAttributeRevocationValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var3 = null;
         var3 = (RevocationValuesType)this.get_store().insert_element_user(ATTRIBUTEREVOCATIONVALUES$22, var1);
         return var3;
      }
   }

   public RevocationValuesType addNewAttributeRevocationValues() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RevocationValuesType var2 = null;
         var2 = (RevocationValuesType)this.get_store().add_element_user(ATTRIBUTEREVOCATIONVALUES$22);
         return var2;
      }
   }

   public void removeAttributeRevocationValues(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTRIBUTEREVOCATIONVALUES$22, var1);
      }
   }

   public List getArchiveTimeStampList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ArchiveTimeStampList(this);
      }
   }

   public XAdESTimeStampType[] getArchiveTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ARCHIVETIMESTAMP$24, var2);
         XAdESTimeStampType[] var3 = new XAdESTimeStampType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public XAdESTimeStampType getArchiveTimeStampArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().find_element_user(ARCHIVETIMESTAMP$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfArchiveTimeStampArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ARCHIVETIMESTAMP$24);
      }
   }

   public void setArchiveTimeStampArray(XAdESTimeStampType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ARCHIVETIMESTAMP$24);
      }
   }

   public void setArchiveTimeStampArray(int var1, XAdESTimeStampType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var4 = null;
         var4 = (XAdESTimeStampType)this.get_store().find_element_user(ARCHIVETIMESTAMP$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public XAdESTimeStampType insertNewArchiveTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var3 = null;
         var3 = (XAdESTimeStampType)this.get_store().insert_element_user(ARCHIVETIMESTAMP$24, var1);
         return var3;
      }
   }

   public XAdESTimeStampType addNewArchiveTimeStamp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XAdESTimeStampType var2 = null;
         var2 = (XAdESTimeStampType)this.get_store().add_element_user(ARCHIVETIMESTAMP$24);
         return var2;
      }
   }

   public void removeArchiveTimeStamp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ARCHIVETIMESTAMP$24, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlID xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var2 = null;
         var2 = (XmlID)this.get_store().find_attribute_user(ID$26);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$26) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlID var3 = null;
         var3 = (XmlID)this.get_store().find_attribute_user(ID$26);
         if(var3 == null) {
            var3 = (XmlID)this.get_store().add_attribute_user(ID$26);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$26);
      }
   }

}
