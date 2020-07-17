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
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STPositiveCoordinate extends XmlLong {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STPositiveCoordinate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stpositivecoordinatecbfctype");



   public static final class Factory {

      public static STPositiveCoordinate newValue(Object var0) {
         return (STPositiveCoordinate)STPositiveCoordinate.type.newValue(var0);
      }

      public static STPositiveCoordinate newInstance() {
         return (STPositiveCoordinate)POIXMLTypeLoader.newInstance(STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate newInstance(XmlOptions var0) {
         return (STPositiveCoordinate)POIXMLTypeLoader.newInstance(STPositiveCoordinate.type, var0);
      }

      public static STPositiveCoordinate parse(String var0) throws XmlException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(String var0, XmlOptions var1) throws XmlException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(File var0) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(URL var0) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(InputStream var0) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(Reader var0) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(XMLStreamReader var0) throws XmlException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(Node var0) throws XmlException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(Node var0, XmlOptions var1) throws XmlException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static STPositiveCoordinate parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static STPositiveCoordinate parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STPositiveCoordinate)POIXMLTypeLoader.parse(var0, STPositiveCoordinate.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveCoordinate.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STPositiveCoordinate.type, var1);
      }

   }
}
