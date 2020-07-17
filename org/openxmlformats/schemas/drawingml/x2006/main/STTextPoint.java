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

public interface STTextPoint extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextpoint4284type");



   public static final class Factory {

      public static STTextPoint newValue(Object var0) {
         return (STTextPoint)STTextPoint.type.newValue(var0);
      }

      public static STTextPoint newInstance() {
         return (STTextPoint)POIXMLTypeLoader.newInstance(STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint newInstance(XmlOptions var0) {
         return (STTextPoint)POIXMLTypeLoader.newInstance(STTextPoint.type, var0);
      }

      public static STTextPoint parse(String var0) throws XmlException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(File var0) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(URL var0) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(InputStream var0) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(Reader var0) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(XMLStreamReader var0) throws XmlException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(Node var0) throws XmlException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static STTextPoint parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static STTextPoint parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextPoint)POIXMLTypeLoader.parse(var0, STTextPoint.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextPoint.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextPoint.type, var1);
      }

   }
}
