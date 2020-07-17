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

public interface STTextSpacingPoint extends XmlInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STTextSpacingPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sttextspacingpointdd05type");



   public static final class Factory {

      public static STTextSpacingPoint newValue(Object var0) {
         return (STTextSpacingPoint)STTextSpacingPoint.type.newValue(var0);
      }

      public static STTextSpacingPoint newInstance() {
         return (STTextSpacingPoint)POIXMLTypeLoader.newInstance(STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint newInstance(XmlOptions var0) {
         return (STTextSpacingPoint)POIXMLTypeLoader.newInstance(STTextSpacingPoint.type, var0);
      }

      public static STTextSpacingPoint parse(String var0) throws XmlException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(String var0, XmlOptions var1) throws XmlException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(File var0) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(URL var0) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(InputStream var0) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(Reader var0) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(XMLStreamReader var0) throws XmlException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(Node var0) throws XmlException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(Node var0, XmlOptions var1) throws XmlException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static STTextSpacingPoint parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static STTextSpacingPoint parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STTextSpacingPoint)POIXMLTypeLoader.parse(var0, STTextSpacingPoint.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextSpacingPoint.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STTextSpacingPoint.type, var1);
      }

   }
}
