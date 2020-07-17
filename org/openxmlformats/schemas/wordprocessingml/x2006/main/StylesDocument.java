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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.w3c.dom.Node;

public interface StylesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(StylesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("styles2732doctype");


   CTStyles getStyles();

   void setStyles(CTStyles var1);

   CTStyles addNewStyles();


   public static final class Factory {

      public static StylesDocument newInstance() {
         return (StylesDocument)POIXMLTypeLoader.newInstance(StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument newInstance(XmlOptions var0) {
         return (StylesDocument)POIXMLTypeLoader.newInstance(StylesDocument.type, var0);
      }

      public static StylesDocument parse(String var0) throws XmlException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(File var0) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(URL var0) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(InputStream var0) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(Reader var0) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(XMLStreamReader var0) throws XmlException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(Node var0) throws XmlException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static StylesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static StylesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (StylesDocument)POIXMLTypeLoader.parse(var0, StylesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StylesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StylesDocument.type, var1);
      }

   }
}
