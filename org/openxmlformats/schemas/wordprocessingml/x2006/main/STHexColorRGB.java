package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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

public interface STHexColorRGB extends XmlHexBinary {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STHexColorRGB.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sthexcolorrgbd59dtype");



   public static final class Factory {

      public static STHexColorRGB newValue(Object var0) {
         return (STHexColorRGB)STHexColorRGB.type.newValue(var0);
      }

      public static STHexColorRGB newInstance() {
         return (STHexColorRGB)POIXMLTypeLoader.newInstance(STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB newInstance(XmlOptions var0) {
         return (STHexColorRGB)POIXMLTypeLoader.newInstance(STHexColorRGB.type, var0);
      }

      public static STHexColorRGB parse(String var0) throws XmlException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(String var0, XmlOptions var1) throws XmlException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(File var0) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(URL var0) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(InputStream var0) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(Reader var0) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(XMLStreamReader var0) throws XmlException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(Node var0) throws XmlException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(Node var0, XmlOptions var1) throws XmlException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static STHexColorRGB parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static STHexColorRGB parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STHexColorRGB)POIXMLTypeLoader.parse(var0, STHexColorRGB.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHexColorRGB.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STHexColorRGB.type, var1);
      }

   }
}
