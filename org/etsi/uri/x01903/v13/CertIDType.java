package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.w3.x2000.x09.xmldsig.X509IssuerSerialType;
import org.w3c.dom.Node;

public interface CertIDType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CertIDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("certidtypee64dtype");


   DigestAlgAndValueType getCertDigest();

   void setCertDigest(DigestAlgAndValueType var1);

   DigestAlgAndValueType addNewCertDigest();

   X509IssuerSerialType getIssuerSerial();

   void setIssuerSerial(X509IssuerSerialType var1);

   X509IssuerSerialType addNewIssuerSerial();

   String getURI();

   XmlAnyURI xgetURI();

   boolean isSetURI();

   void setURI(String var1);

   void xsetURI(XmlAnyURI var1);

   void unsetURI();


   public static final class Factory {

      public static CertIDType newInstance() {
         return (CertIDType)POIXMLTypeLoader.newInstance(CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType newInstance(XmlOptions var0) {
         return (CertIDType)POIXMLTypeLoader.newInstance(CertIDType.type, var0);
      }

      public static CertIDType parse(String var0) throws XmlException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(String var0, XmlOptions var1) throws XmlException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(File var0) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(URL var0) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(InputStream var0) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(Reader var0) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(XMLStreamReader var0) throws XmlException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(Node var0) throws XmlException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static CertIDType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, (XmlOptions)null);
      }

      public static CertIDType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CertIDType)POIXMLTypeLoader.parse(var0, CertIDType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CertIDType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CertIDType.type, var1);
      }

   }
}
