package org.openxmlformats.schemas.drawingml.x2006.chart;

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

public interface CTPageMargins extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPageMargins.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpagemarginsb730type");


   double getL();

   XmlDouble xgetL();

   void setL(double var1);

   void xsetL(XmlDouble var1);

   double getR();

   XmlDouble xgetR();

   void setR(double var1);

   void xsetR(XmlDouble var1);

   double getT();

   XmlDouble xgetT();

   void setT(double var1);

   void xsetT(XmlDouble var1);

   double getB();

   XmlDouble xgetB();

   void setB(double var1);

   void xsetB(XmlDouble var1);

   double getHeader();

   XmlDouble xgetHeader();

   void setHeader(double var1);

   void xsetHeader(XmlDouble var1);

   double getFooter();

   XmlDouble xgetFooter();

   void setFooter(double var1);

   void xsetFooter(XmlDouble var1);


   public static final class Factory {

      public static CTPageMargins newInstance() {
         return (CTPageMargins)POIXMLTypeLoader.newInstance(CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins newInstance(XmlOptions var0) {
         return (CTPageMargins)POIXMLTypeLoader.newInstance(CTPageMargins.type, var0);
      }

      public static CTPageMargins parse(String var0) throws XmlException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(File var0) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(URL var0) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(InputStream var0) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(Reader var0) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(XMLStreamReader var0) throws XmlException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(Node var0) throws XmlException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static CTPageMargins parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static CTPageMargins parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPageMargins)POIXMLTypeLoader.parse(var0, CTPageMargins.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageMargins.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageMargins.type, var1);
      }

   }
}
