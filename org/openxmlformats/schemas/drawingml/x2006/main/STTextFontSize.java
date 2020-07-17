package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STTextFontSize extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextFontSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextfontsizeb3a8type");



   public static final class Factory {

      public static STTextFontSize newValue(Object var0) {
         return (STTextFontSize)STTextFontSize.type.newValue(var0);
      }

      public static STTextFontSize newInstance() {
         return (STTextFontSize)POIXMLTypeLoader.newInstance(STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize newInstance(XmlOptions var0) {
         return (STTextFontSize)POIXMLTypeLoader.newInstance(STTextFontSize.type, var0);
      }

      public static STTextFontSize parse(String var0) throws XmlException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(File var0) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(URL var0) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(InputStream var0) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(Reader var0) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(XMLStreamReader var0) throws XmlException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(Node var0) throws XmlException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static STTextFontSize parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static STTextFontSize parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextFontSize)POIXMLTypeLoader.parse(var0, STTextFontSize.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextFontSize.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextFontSize.type, var1);
      }

   }
}
