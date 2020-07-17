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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTPrintOptions extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPrintOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctprintoptions943atype");


   boolean getHorizontalCentered();

   XmlBoolean xgetHorizontalCentered();

   boolean isSetHorizontalCentered();

   void setHorizontalCentered(boolean var1);

   void xsetHorizontalCentered(XmlBoolean var1);

   void unsetHorizontalCentered();

   boolean getVerticalCentered();

   XmlBoolean xgetVerticalCentered();

   boolean isSetVerticalCentered();

   void setVerticalCentered(boolean var1);

   void xsetVerticalCentered(XmlBoolean var1);

   void unsetVerticalCentered();

   boolean getHeadings();

   XmlBoolean xgetHeadings();

   boolean isSetHeadings();

   void setHeadings(boolean var1);

   void xsetHeadings(XmlBoolean var1);

   void unsetHeadings();

   boolean getGridLines();

   XmlBoolean xgetGridLines();

   boolean isSetGridLines();

   void setGridLines(boolean var1);

   void xsetGridLines(XmlBoolean var1);

   void unsetGridLines();

   boolean getGridLinesSet();

   XmlBoolean xgetGridLinesSet();

   boolean isSetGridLinesSet();

   void setGridLinesSet(boolean var1);

   void xsetGridLinesSet(XmlBoolean var1);

   void unsetGridLinesSet();


   public static final class Factory {

      public static CTPrintOptions newInstance() {
         return (CTPrintOptions)POIXMLTypeLoader.newInstance(CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions newInstance(XmlOptions var0) {
         return (CTPrintOptions)POIXMLTypeLoader.newInstance(CTPrintOptions.type, var0);
      }

      public static CTPrintOptions parse(String var0) throws XmlException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(File var0) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(URL var0) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(InputStream var0) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(Reader var0) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(XMLStreamReader var0) throws XmlException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(Node var0) throws XmlException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static CTPrintOptions parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static CTPrintOptions parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPrintOptions)POIXMLTypeLoader.parse(var0, CTPrintOptions.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPrintOptions.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPrintOptions.type, var1);
      }

   }
}
