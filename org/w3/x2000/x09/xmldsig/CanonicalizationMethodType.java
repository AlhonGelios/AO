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

public interface CanonicalizationMethodType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CanonicalizationMethodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("canonicalizationmethodtypeec74type");


   String getAlgorithm();

   XmlAnyURI xgetAlgorithm();

   void setAlgorithm(String var1);

   void xsetAlgorithm(XmlAnyURI var1);


   public static final class Factory {

      public static CanonicalizationMethodType newInstance() {
         return (CanonicalizationMethodType)POIXMLTypeLoader.newInstance(CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType newInstance(XmlOptions var0) {
         return (CanonicalizationMethodType)POIXMLTypeLoader.newInstance(CanonicalizationMethodType.type, var0);
      }

      public static CanonicalizationMethodType parse(String var0) throws XmlException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(String var0, XmlOptions var1) throws XmlException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(File var0) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(URL var0) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(InputStream var0) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(Reader var0) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(XMLStreamReader var0) throws XmlException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(Node var0) throws XmlException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static CanonicalizationMethodType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static CanonicalizationMethodType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CanonicalizationMethodType)POIXMLTypeLoader.parse(var0, CanonicalizationMethodType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CanonicalizationMethodType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CanonicalizationMethodType.type, var1);
      }

   }
}
