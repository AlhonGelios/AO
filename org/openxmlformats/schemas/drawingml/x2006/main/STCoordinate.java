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

public interface STCoordinate extends XmlLong {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STCoordinate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcoordinatefae3type");



   public static final class Factory {

      public static STCoordinate newValue(Object var0) {
         return (STCoordinate)STCoordinate.type.newValue(var0);
      }

      public static STCoordinate newInstance() {
         return (STCoordinate)POIXMLTypeLoader.newInstance(STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate newInstance(XmlOptions var0) {
         return (STCoordinate)POIXMLTypeLoader.newInstance(STCoordinate.type, var0);
      }

      public static STCoordinate parse(String var0) throws XmlException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(String var0, XmlOptions var1) throws XmlException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(File var0) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(URL var0) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(InputStream var0) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(Reader var0) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(XMLStreamReader var0) throws XmlException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(Node var0) throws XmlException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(Node var0, XmlOptions var1) throws XmlException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static STCoordinate parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static STCoordinate parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STCoordinate)POIXMLTypeLoader.parse(var0, STCoordinate.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCoordinate.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STCoordinate.type, var1);
      }

   }
}
