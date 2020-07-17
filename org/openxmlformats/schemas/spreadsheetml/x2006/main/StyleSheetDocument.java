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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet;
import org.w3c.dom.Node;

public interface StyleSheetDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(StyleSheetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stylesheet5d8bdoctype");


   CTStylesheet getStyleSheet();

   void setStyleSheet(CTStylesheet var1);

   CTStylesheet addNewStyleSheet();


   public static final class Factory {

      public static StyleSheetDocument newInstance() {
         return (StyleSheetDocument)POIXMLTypeLoader.newInstance(StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument newInstance(XmlOptions var0) {
         return (StyleSheetDocument)POIXMLTypeLoader.newInstance(StyleSheetDocument.type, var0);
      }

      public static StyleSheetDocument parse(String var0) throws XmlException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(File var0) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(URL var0) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(InputStream var0) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(Reader var0) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(XMLStreamReader var0) throws XmlException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(Node var0) throws XmlException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static StyleSheetDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static StyleSheetDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (StyleSheetDocument)POIXMLTypeLoader.parse(var0, StyleSheetDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StyleSheetDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StyleSheetDocument.type, var1);
      }

   }
}
