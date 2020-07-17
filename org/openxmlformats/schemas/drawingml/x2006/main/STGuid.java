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
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STGuid extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STGuid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stguidd0f4type");



   public static final class Factory {

      public static STGuid newValue(Object var0) {
         return (STGuid)STGuid.type.newValue(var0);
      }

      public static STGuid newInstance() {
         return (STGuid)POIXMLTypeLoader.newInstance(STGuid.type, (XmlOptions)null);
      }

      public static STGuid newInstance(XmlOptions var0) {
         return (STGuid)POIXMLTypeLoader.newInstance(STGuid.type, var0);
      }

      public static STGuid parse(String var0) throws XmlException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(String var0, XmlOptions var1) throws XmlException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(File var0) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(URL var0) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(InputStream var0) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(Reader var0) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(XMLStreamReader var0) throws XmlException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(Node var0) throws XmlException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(Node var0, XmlOptions var1) throws XmlException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static STGuid parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, (XmlOptions)null);
      }

      public static STGuid parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STGuid)POIXMLTypeLoader.parse(var0, STGuid.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STGuid.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STGuid.type, var1);
      }

   }
}
