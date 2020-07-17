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
import org.apache.xmlbeans.XmlHexBinary;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STHexBinary3 extends XmlHexBinary {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHexBinary3.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthexbinary314e2type");



   public static final class Factory {

      public static STHexBinary3 newValue(Object var0) {
         return (STHexBinary3)STHexBinary3.type.newValue(var0);
      }

      public static STHexBinary3 newInstance() {
         return (STHexBinary3)POIXMLTypeLoader.newInstance(STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 newInstance(XmlOptions var0) {
         return (STHexBinary3)POIXMLTypeLoader.newInstance(STHexBinary3.type, var0);
      }

      public static STHexBinary3 parse(String var0) throws XmlException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(String var0, XmlOptions var1) throws XmlException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(File var0) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(URL var0) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(InputStream var0) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(Reader var0) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(XMLStreamReader var0) throws XmlException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(Node var0) throws XmlException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static STHexBinary3 parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static STHexBinary3 parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHexBinary3)POIXMLTypeLoader.parse(var0, STHexBinary3.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHexBinary3.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHexBinary3.type, var1);
      }

   }
}
