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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTFontName extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFontName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfontname2dc3type");


   String getVal();

   STXstring xgetVal();

   void setVal(String var1);

   void xsetVal(STXstring var1);


   public static final class Factory {

      public static CTFontName newInstance() {
         return (CTFontName)POIXMLTypeLoader.newInstance(CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName newInstance(XmlOptions var0) {
         return (CTFontName)POIXMLTypeLoader.newInstance(CTFontName.type, var0);
      }

      public static CTFontName parse(String var0) throws XmlException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(File var0) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(URL var0) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(InputStream var0) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(Reader var0) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(XMLStreamReader var0) throws XmlException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(Node var0) throws XmlException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static CTFontName parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, (XmlOptions)null);
      }

      public static CTFontName parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFontName)POIXMLTypeLoader.parse(var0, CTFontName.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontName.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontName.type, var1);
      }

   }
}
