package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STLang extends XmlAnySimpleType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STLang.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stlanga02atype");


   Object getObjectValue();

   void setObjectValue(Object var1);

   Object objectValue();

   void objectSet(Object var1);

   SchemaType instanceType();


   public static final class Factory {

      public static STLang newValue(Object var0) {
         return (STLang)STLang.type.newValue(var0);
      }

      public static STLang newInstance() {
         return (STLang)POIXMLTypeLoader.newInstance(STLang.type, (XmlOptions)null);
      }

      public static STLang newInstance(XmlOptions var0) {
         return (STLang)POIXMLTypeLoader.newInstance(STLang.type, var0);
      }

      public static STLang parse(String var0) throws XmlException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(String var0, XmlOptions var1) throws XmlException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(File var0) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(URL var0) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(InputStream var0) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(Reader var0) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(XMLStreamReader var0) throws XmlException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(Node var0) throws XmlException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(Node var0, XmlOptions var1) throws XmlException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static STLang parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, (XmlOptions)null);
      }

      public static STLang parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STLang)POIXMLTypeLoader.parse(var0, STLang.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLang.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STLang.type, var1);
      }

   }
}
