package org.w3.x2000.x09.xmldsig;

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
import org.w3c.dom.Node;

public interface DigestMethodType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DigestMethodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("digestmethodtype5ce0type");


   String getAlgorithm();

   XmlAnyURI xgetAlgorithm();

   void setAlgorithm(String var1);

   void xsetAlgorithm(XmlAnyURI var1);


   public static final class Factory {

      public static DigestMethodType newInstance() {
         return (DigestMethodType)POIXMLTypeLoader.newInstance(DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType newInstance(XmlOptions var0) {
         return (DigestMethodType)POIXMLTypeLoader.newInstance(DigestMethodType.type, var0);
      }

      public static DigestMethodType parse(String var0) throws XmlException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(String var0, XmlOptions var1) throws XmlException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(File var0) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(URL var0) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(InputStream var0) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(Reader var0) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(XMLStreamReader var0) throws XmlException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(Node var0) throws XmlException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(Node var0, XmlOptions var1) throws XmlException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static DigestMethodType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static DigestMethodType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (DigestMethodType)POIXMLTypeLoader.parse(var0, DigestMethodType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DigestMethodType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DigestMethodType.type, var1);
      }

   }
}
