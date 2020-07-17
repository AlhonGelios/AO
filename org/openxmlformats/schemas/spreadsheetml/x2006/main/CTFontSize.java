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
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTFontSize extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFontSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfontsizeb3b9type");


   double getVal();

   XmlDouble xgetVal();

   void setVal(double var1);

   void xsetVal(XmlDouble var1);


   public static final class Factory {

      public static CTFontSize newInstance() {
         return (CTFontSize)POIXMLTypeLoader.newInstance(CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize newInstance(XmlOptions var0) {
         return (CTFontSize)POIXMLTypeLoader.newInstance(CTFontSize.type, var0);
      }

      public static CTFontSize parse(String var0) throws XmlException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(File var0) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(URL var0) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(InputStream var0) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(Reader var0) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(XMLStreamReader var0) throws XmlException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(Node var0) throws XmlException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static CTFontSize parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static CTFontSize parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFontSize)POIXMLTypeLoader.parse(var0, CTFontSize.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontSize.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFontSize.type, var1);
      }

   }
}
