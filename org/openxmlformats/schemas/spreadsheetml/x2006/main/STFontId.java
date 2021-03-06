package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STFontId extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STFontId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stfontid9d63type");



   public static final class Factory {

      public static STFontId newValue(Object var0) {
         return (STFontId)STFontId.type.newValue(var0);
      }

      public static STFontId newInstance() {
         return (STFontId)POIXMLTypeLoader.newInstance(STFontId.type, (XmlOptions)null);
      }

      public static STFontId newInstance(XmlOptions var0) {
         return (STFontId)POIXMLTypeLoader.newInstance(STFontId.type, var0);
      }

      public static STFontId parse(String var0) throws XmlException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(String var0, XmlOptions var1) throws XmlException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(File var0) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(URL var0) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(InputStream var0) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(Reader var0) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(XMLStreamReader var0) throws XmlException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(Node var0) throws XmlException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(Node var0, XmlOptions var1) throws XmlException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static STFontId parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, (XmlOptions)null);
      }

      public static STFontId parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STFontId)POIXMLTypeLoader.parse(var0, STFontId.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFontId.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STFontId.type, var1);
      }

   }
}
