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
import org.etsi.uri.x01903.v13.AnyType;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.w3c.dom.Node;

public interface CertificateValuesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CertificateValuesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("certificatevaluestype5c75type");


   List getEncapsulatedX509CertificateList();

   EncapsulatedPKIDataType[] getEncapsulatedX509CertificateArray();

   EncapsulatedPKIDataType getEncapsulatedX509CertificateArray(int var1);

   int sizeOfEncapsulatedX509CertificateArray();

   void setEncapsulatedX509CertificateArray(EncapsulatedPKIDataType[] var1);

   void setEncapsulatedX509CertificateArray(int var1, EncapsulatedPKIDataType var2);

   EncapsulatedPKIDataType insertNewEncapsulatedX509Certificate(int var1);

   EncapsulatedPKIDataType addNewEncapsulatedX509Certificate();

   void removeEncapsulatedX509Certificate(int var1);

   List getOtherCertificateList();

   AnyType[] getOtherCertificateArray();

   AnyType getOtherCertificateArray(int var1);

   int sizeOfOtherCertificateArray();

   void setOtherCertificateArray(AnyType[] var1);

   void setOtherCertificateArray(int var1, AnyType var2);

   AnyType insertNewOtherCertificate(int var1);

   AnyType addNewOtherCertificate();

   void removeOtherCertificate(int var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static CertificateValuesType newInstance() {
         return (CertificateValuesType)POIXMLTypeLoader.newInstance(CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType newInstance(XmlOptions var0) {
         return (CertificateValuesType)POIXMLTypeLoader.newInstance(CertificateValuesType.type, var0);
      }

      public static CertificateValuesType parse(String var0) throws XmlException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(String var0, XmlOptions var1) throws XmlException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(File var0) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(URL var0) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(InputStream var0) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(Reader var0) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(XMLStreamReader var0) throws XmlException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(Node var0) throws XmlException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static CertificateValuesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static CertificateValuesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CertificateValuesType)POIXMLTypeLoader.parse(var0, CertificateValuesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CertificateValuesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CertificateValuesType.type, var1);
      }

   }
}
