package org.w3.x2000.x09.xmldsig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface X509IssuerSerialType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(X509IssuerSerialType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("x509issuerserialtype7eb2type");


   String getX509IssuerName();

   XmlString xgetX509IssuerName();

   void setX509IssuerName(String var1);

   void xsetX509IssuerName(XmlString var1);

   BigInteger getX509SerialNumber();

   XmlInteger xgetX509SerialNumber();

   void setX509SerialNumber(BigInteger var1);

   void xsetX509SerialNumber(XmlInteger var1);


   public static final class Factory {

      public static X509IssuerSerialType newInstance() {
         return (X509IssuerSerialType)POIXMLTypeLoader.newInstance(X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType newInstance(XmlOptions var0) {
         return (X509IssuerSerialType)POIXMLTypeLoader.newInstance(X509IssuerSerialType.type, var0);
      }

      public static X509IssuerSerialType parse(String var0) throws XmlException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(String var0, XmlOptions var1) throws XmlException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(File var0) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(URL var0) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(InputStream var0) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(Reader var0) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(XMLStreamReader var0) throws XmlException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(Node var0) throws XmlException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(Node var0, XmlOptions var1) throws XmlException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static X509IssuerSerialType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static X509IssuerSerialType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (X509IssuerSerialType)POIXMLTypeLoader.parse(var0, X509IssuerSerialType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, X509IssuerSerialType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, X509IssuerSerialType.type, var1);
      }

   }
}
