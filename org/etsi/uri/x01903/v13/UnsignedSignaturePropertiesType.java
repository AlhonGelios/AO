package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.CertificateValuesType;
import org.etsi.uri.x01903.v13.CompleteCertificateRefsType;
import org.etsi.uri.x01903.v13.CompleteRevocationRefsType;
import org.etsi.uri.x01903.v13.CounterSignatureType;
import org.etsi.uri.x01903.v13.RevocationValuesType;
import org.etsi.uri.x01903.v13.XAdESTimeStampType;
import org.w3c.dom.Node;

public interface UnsignedSignaturePropertiesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(UnsignedSignaturePropertiesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("unsignedsignaturepropertiestypecf32type");


   List getCounterSignatureList();

   CounterSignatureType[] getCounterSignatureArray();

   CounterSignatureType getCounterSignatureArray(int var1);

   int sizeOfCounterSignatureArray();

   void setCounterSignatureArray(CounterSignatureType[] var1);

   void setCounterSignatureArray(int var1, CounterSignatureType var2);

   CounterSignatureType insertNewCounterSignature(int var1);

   CounterSignatureType addNewCounterSignature();

   void removeCounterSignature(int var1);

   List getSignatureTimeStampList();

   XAdESTimeStampType[] getSignatureTimeStampArray();

   XAdESTimeStampType getSignatureTimeStampArray(int var1);

   int sizeOfSignatureTimeStampArray();

   void setSignatureTimeStampArray(XAdESTimeStampType[] var1);

   void setSignatureTimeStampArray(int var1, XAdESTimeStampType var2);

   XAdESTimeStampType insertNewSignatureTimeStamp(int var1);

   XAdESTimeStampType addNewSignatureTimeStamp();

   void removeSignatureTimeStamp(int var1);

   List getCompleteCertificateRefsList();

   CompleteCertificateRefsType[] getCompleteCertificateRefsArray();

   CompleteCertificateRefsType getCompleteCertificateRefsArray(int var1);

   int sizeOfCompleteCertificateRefsArray();

   void setCompleteCertificateRefsArray(CompleteCertificateRefsType[] var1);

   void setCompleteCertificateRefsArray(int var1, CompleteCertificateRefsType var2);

   CompleteCertificateRefsType insertNewCompleteCertificateRefs(int var1);

   CompleteCertificateRefsType addNewCompleteCertificateRefs();

   void removeCompleteCertificateRefs(int var1);

   List getCompleteRevocationRefsList();

   CompleteRevocationRefsType[] getCompleteRevocationRefsArray();

   CompleteRevocationRefsType getCompleteRevocationRefsArray(int var1);

   int sizeOfCompleteRevocationRefsArray();

   void setCompleteRevocationRefsArray(CompleteRevocationRefsType[] var1);

   void setCompleteRevocationRefsArray(int var1, CompleteRevocationRefsType var2);

   CompleteRevocationRefsType insertNewCompleteRevocationRefs(int var1);

   CompleteRevocationRefsType addNewCompleteRevocationRefs();

   void removeCompleteRevocationRefs(int var1);

   List getAttributeCertificateRefsList();

   CompleteCertificateRefsType[] getAttributeCertificateRefsArray();

   CompleteCertificateRefsType getAttributeCertificateRefsArray(int var1);

   int sizeOfAttributeCertificateRefsArray();

   void setAttributeCertificateRefsArray(CompleteCertificateRefsType[] var1);

   void setAttributeCertificateRefsArray(int var1, CompleteCertificateRefsType var2);

   CompleteCertificateRefsType insertNewAttributeCertificateRefs(int var1);

   CompleteCertificateRefsType addNewAttributeCertificateRefs();

   void removeAttributeCertificateRefs(int var1);

   List getAttributeRevocationRefsList();

   CompleteRevocationRefsType[] getAttributeRevocationRefsArray();

   CompleteRevocationRefsType getAttributeRevocationRefsArray(int var1);

   int sizeOfAttributeRevocationRefsArray();

   void setAttributeRevocationRefsArray(CompleteRevocationRefsType[] var1);

   void setAttributeRevocationRefsArray(int var1, CompleteRevocationRefsType var2);

   CompleteRevocationRefsType insertNewAttributeRevocationRefs(int var1);

   CompleteRevocationRefsType addNewAttributeRevocationRefs();

   void removeAttributeRevocationRefs(int var1);

   List getSigAndRefsTimeStampList();

   XAdESTimeStampType[] getSigAndRefsTimeStampArray();

   XAdESTimeStampType getSigAndRefsTimeStampArray(int var1);

   int sizeOfSigAndRefsTimeStampArray();

   void setSigAndRefsTimeStampArray(XAdESTimeStampType[] var1);

   void setSigAndRefsTimeStampArray(int var1, XAdESTimeStampType var2);

   XAdESTimeStampType insertNewSigAndRefsTimeStamp(int var1);

   XAdESTimeStampType addNewSigAndRefsTimeStamp();

   void removeSigAndRefsTimeStamp(int var1);

   List getRefsOnlyTimeStampList();

   XAdESTimeStampType[] getRefsOnlyTimeStampArray();

   XAdESTimeStampType getRefsOnlyTimeStampArray(int var1);

   int sizeOfRefsOnlyTimeStampArray();

   void setRefsOnlyTimeStampArray(XAdESTimeStampType[] var1);

   void setRefsOnlyTimeStampArray(int var1, XAdESTimeStampType var2);

   XAdESTimeStampType insertNewRefsOnlyTimeStamp(int var1);

   XAdESTimeStampType addNewRefsOnlyTimeStamp();

   void removeRefsOnlyTimeStamp(int var1);

   List getCertificateValuesList();

   CertificateValuesType[] getCertificateValuesArray();

   CertificateValuesType getCertificateValuesArray(int var1);

   int sizeOfCertificateValuesArray();

   void setCertificateValuesArray(CertificateValuesType[] var1);

   void setCertificateValuesArray(int var1, CertificateValuesType var2);

   CertificateValuesType insertNewCertificateValues(int var1);

   CertificateValuesType addNewCertificateValues();

   void removeCertificateValues(int var1);

   List getRevocationValuesList();

   RevocationValuesType[] getRevocationValuesArray();

   RevocationValuesType getRevocationValuesArray(int var1);

   int sizeOfRevocationValuesArray();

   void setRevocationValuesArray(RevocationValuesType[] var1);

   void setRevocationValuesArray(int var1, RevocationValuesType var2);

   RevocationValuesType insertNewRevocationValues(int var1);

   RevocationValuesType addNewRevocationValues();

   void removeRevocationValues(int var1);

   List getAttrAuthoritiesCertValuesList();

   CertificateValuesType[] getAttrAuthoritiesCertValuesArray();

   CertificateValuesType getAttrAuthoritiesCertValuesArray(int var1);

   int sizeOfAttrAuthoritiesCertValuesArray();

   void setAttrAuthoritiesCertValuesArray(CertificateValuesType[] var1);

   void setAttrAuthoritiesCertValuesArray(int var1, CertificateValuesType var2);

   CertificateValuesType insertNewAttrAuthoritiesCertValues(int var1);

   CertificateValuesType addNewAttrAuthoritiesCertValues();

   void removeAttrAuthoritiesCertValues(int var1);

   List getAttributeRevocationValuesList();

   RevocationValuesType[] getAttributeRevocationValuesArray();

   RevocationValuesType getAttributeRevocationValuesArray(int var1);

   int sizeOfAttributeRevocationValuesArray();

   void setAttributeRevocationValuesArray(RevocationValuesType[] var1);

   void setAttributeRevocationValuesArray(int var1, RevocationValuesType var2);

   RevocationValuesType insertNewAttributeRevocationValues(int var1);

   RevocationValuesType addNewAttributeRevocationValues();

   void removeAttributeRevocationValues(int var1);

   List getArchiveTimeStampList();

   XAdESTimeStampType[] getArchiveTimeStampArray();

   XAdESTimeStampType getArchiveTimeStampArray(int var1);

   int sizeOfArchiveTimeStampArray();

   void setArchiveTimeStampArray(XAdESTimeStampType[] var1);

   void setArchiveTimeStampArray(int var1, XAdESTimeStampType var2);

   XAdESTimeStampType insertNewArchiveTimeStamp(int var1);

   XAdESTimeStampType addNewArchiveTimeStamp();

   void removeArchiveTimeStamp(int var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static UnsignedSignaturePropertiesType newInstance() {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.newInstance(UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType newInstance(XmlOptions var0) {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.newInstance(UnsignedSignaturePropertiesType.type, var0);
      }

      public static UnsignedSignaturePropertiesType parse(String var0) throws XmlException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(String var0, XmlOptions var1) throws XmlException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(File var0) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(URL var0) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(InputStream var0) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(Reader var0) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(XMLStreamReader var0) throws XmlException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(Node var0) throws XmlException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static UnsignedSignaturePropertiesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedSignaturePropertiesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (UnsignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, UnsignedSignaturePropertiesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, UnsignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, UnsignedSignaturePropertiesType.type, var1);
      }

   }
}
