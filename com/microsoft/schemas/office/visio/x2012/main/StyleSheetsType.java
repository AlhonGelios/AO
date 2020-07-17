package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.StyleSheetType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface StyleSheetsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(StyleSheetsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stylesheetstypeb706type");


   List getStyleSheetList();

   StyleSheetType[] getStyleSheetArray();

   StyleSheetType getStyleSheetArray(int var1);

   int sizeOfStyleSheetArray();

   void setStyleSheetArray(StyleSheetType[] var1);

   void setStyleSheetArray(int var1, StyleSheetType var2);

   StyleSheetType insertNewStyleSheet(int var1);

   StyleSheetType addNewStyleSheet();

   void removeStyleSheet(int var1);


   public static final class Factory {

      public static StyleSheetsType newInstance() {
         return (StyleSheetsType)POIXMLTypeLoader.newInstance(StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType newInstance(XmlOptions var0) {
         return (StyleSheetsType)POIXMLTypeLoader.newInstance(StyleSheetsType.type, var0);
      }

      public static StyleSheetsType parse(String var0) throws XmlException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(String var0, XmlOptions var1) throws XmlException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(File var0) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(URL var0) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(InputStream var0) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(Reader var0) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(XMLStreamReader var0) throws XmlException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(Node var0) throws XmlException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static StyleSheetsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static StyleSheetsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (StyleSheetsType)POIXMLTypeLoader.parse(var0, StyleSheetsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StyleSheetsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StyleSheetsType.type, var1);
      }

   }
}
