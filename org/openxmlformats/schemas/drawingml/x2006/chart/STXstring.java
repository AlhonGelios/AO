package org.openxmlformats.schemas.drawingml.x2006.chart;

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

public interface STXstring extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STXstring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stxstringb8cdtype");



   public static final class Factory {

      public static STXstring newValue(Object var0) {
         return (STXstring)STXstring.type.newValue(var0);
      }

      public static STXstring newInstance() {
         return (STXstring)POIXMLTypeLoader.newInstance(STXstring.type, (XmlOptions)null);
      }

      public static STXstring newInstance(XmlOptions var0) {
         return (STXstring)POIXMLTypeLoader.newInstance(STXstring.type, var0);
      }

      public static STXstring parse(String var0) throws XmlException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(String var0, XmlOptions var1) throws XmlException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(File var0) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(URL var0) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(InputStream var0) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(Reader var0) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(XMLStreamReader var0) throws XmlException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(Node var0) throws XmlException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(Node var0, XmlOptions var1) throws XmlException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static STXstring parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, (XmlOptions)null);
      }

      public static STXstring parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STXstring)POIXMLTypeLoader.parse(var0, STXstring.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STXstring.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STXstring.type, var1);
      }

   }
}
