package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlHexBinary;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STLangCode extends XmlHexBinary {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLangCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlangcode02bdtype");



   public static final class Factory {

      public static STLangCode newValue(Object var0) {
         return (STLangCode)STLangCode.type.newValue(var0);
      }

      public static STLangCode newInstance() {
         return (STLangCode)POIXMLTypeLoader.newInstance(STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode newInstance(XmlOptions var0) {
         return (STLangCode)POIXMLTypeLoader.newInstance(STLangCode.type, var0);
      }

      public static STLangCode parse(String var0) throws XmlException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(String var0, XmlOptions var1) throws XmlException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(File var0) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(URL var0) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(InputStream var0) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(Reader var0) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(XMLStreamReader var0) throws XmlException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(Node var0) throws XmlException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static STLangCode parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, (XmlOptions)null);
      }

      public static STLangCode parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLangCode)POIXMLTypeLoader.parse(var0, STLangCode.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLangCode.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLangCode.type, var1);
      }

   }
}
