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

public interface STLineWidth extends STCoordinate32 {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLineWidth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlinewidth8313type");



   public static final class Factory {

      public static STLineWidth newValue(Object var0) {
         return (STLineWidth)STLineWidth.type.newValue(var0);
      }

      public static STLineWidth newInstance() {
         return (STLineWidth)POIXMLTypeLoader.newInstance(STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth newInstance(XmlOptions var0) {
         return (STLineWidth)POIXMLTypeLoader.newInstance(STLineWidth.type, var0);
      }

      public static STLineWidth parse(String var0) throws XmlException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(String var0, XmlOptions var1) throws XmlException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(File var0) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(URL var0) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(InputStream var0) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(Reader var0) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(XMLStreamReader var0) throws XmlException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(Node var0) throws XmlException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static STLineWidth parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static STLineWidth parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLineWidth)POIXMLTypeLoader.parse(var0, STLineWidth.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineWidth.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLineWidth.type, var1);
      }

   }
}
