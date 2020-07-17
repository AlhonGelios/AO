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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;
import org.w3c.dom.Node;

public interface ThemeDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ThemeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("themefd26doctype");


   CTOfficeStyleSheet getTheme();

   void setTheme(CTOfficeStyleSheet var1);

   CTOfficeStyleSheet addNewTheme();


   public static final class Factory {

      public static ThemeDocument newInstance() {
         return (ThemeDocument)POIXMLTypeLoader.newInstance(ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument newInstance(XmlOptions var0) {
         return (ThemeDocument)POIXMLTypeLoader.newInstance(ThemeDocument.type, var0);
      }

      public static ThemeDocument parse(String var0) throws XmlException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(File var0) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(URL var0) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(InputStream var0) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(Reader var0) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(XMLStreamReader var0) throws XmlException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(Node var0) throws XmlException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static ThemeDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static ThemeDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ThemeDocument)POIXMLTypeLoader.parse(var0, ThemeDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ThemeDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ThemeDocument.type, var1);
      }

   }
}
