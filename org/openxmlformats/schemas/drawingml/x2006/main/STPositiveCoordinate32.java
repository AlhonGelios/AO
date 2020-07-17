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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.w3c.dom.Node;

public interface STPositiveCoordinate32 extends STCoordinate32 {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPositiveCoordinate32.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpositivecoordinate321b9btype");



   public static final class Factory {

      public static STPositiveCoordinate32 newValue(Object var0) {
         return (STPositiveCoordinate32)STPositiveCoordinate32.type.newValue(var0);
      }

      public static STPositiveCoordinate32 newInstance() {
         return (STPositiveCoordinate32)POIXMLTypeLoader.newInstance(STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 newInstance(XmlOptions var0) {
         return (STPositiveCoordinate32)POIXMLTypeLoader.newInstance(STPositiveCoordinate32.type, var0);
      }

      public static STPositiveCoordinate32 parse(String var0) throws XmlException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(String var0, XmlOptions var1) throws XmlException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(File var0) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(URL var0) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(InputStream var0) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(Reader var0) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(XMLStreamReader var0) throws XmlException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(Node var0) throws XmlException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static STPositiveCoordinate32 parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate32 parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPositiveCoordinate32)POIXMLTypeLoader.parse(var0, STPositiveCoordinate32.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveCoordinate32.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveCoordinate32.type, var1);
      }

   }
}
