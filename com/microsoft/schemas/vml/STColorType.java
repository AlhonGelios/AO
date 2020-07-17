package com.microsoft.schemas.vml;

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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STColorType extends XmlString {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STColorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stcolortype99c1type");



   public static final class Factory {

      public static STColorType newValue(Object var0) {
         return (STColorType)STColorType.type.newValue(var0);
      }

      public static STColorType newInstance() {
         return (STColorType)POIXMLTypeLoader.newInstance(STColorType.type, (XmlOptions)null);
      }

      public static STColorType newInstance(XmlOptions var0) {
         return (STColorType)POIXMLTypeLoader.newInstance(STColorType.type, var0);
      }

      public static STColorType parse(String var0) throws XmlException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(String var0, XmlOptions var1) throws XmlException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(File var0) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(URL var0) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(InputStream var0) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(Reader var0) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(XMLStreamReader var0) throws XmlException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(Node var0) throws XmlException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(Node var0, XmlOptions var1) throws XmlException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static STColorType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, (XmlOptions)null);
      }

      public static STColorType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STColorType)POIXMLTypeLoader.parse(var0, STColorType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STColorType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STColorType.type, var1);
      }

   }
}
