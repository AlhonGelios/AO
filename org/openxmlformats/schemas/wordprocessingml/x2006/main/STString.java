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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STString extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STString.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ststringa627type");



   public static final class Factory {

      public static STString newValue(Object var0) {
         return (STString)STString.type.newValue(var0);
      }

      public static STString newInstance() {
         return (STString)POIXMLTypeLoader.newInstance(STString.type, (XmlOptions)null);
      }

      public static STString newInstance(XmlOptions var0) {
         return (STString)POIXMLTypeLoader.newInstance(STString.type, var0);
      }

      public static STString parse(String var0) throws XmlException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(String var0, XmlOptions var1) throws XmlException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(File var0) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(URL var0) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(InputStream var0) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(Reader var0) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(XMLStreamReader var0) throws XmlException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(Node var0) throws XmlException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(Node var0, XmlOptions var1) throws XmlException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static STString parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, (XmlOptions)null);
      }

      public static STString parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STString)POIXMLTypeLoader.parse(var0, STString.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STString.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STString.type, var1);
      }

   }
}
