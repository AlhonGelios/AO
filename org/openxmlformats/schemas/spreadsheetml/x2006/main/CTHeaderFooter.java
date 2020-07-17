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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTHeaderFooter extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTHeaderFooter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctheaderfooter90d1type");


   String getOddHeader();

   STXstring xgetOddHeader();

   boolean isSetOddHeader();

   void setOddHeader(String var1);

   void xsetOddHeader(STXstring var1);

   void unsetOddHeader();

   String getOddFooter();

   STXstring xgetOddFooter();

   boolean isSetOddFooter();

   void setOddFooter(String var1);

   void xsetOddFooter(STXstring var1);

   void unsetOddFooter();

   String getEvenHeader();

   STXstring xgetEvenHeader();

   boolean isSetEvenHeader();

   void setEvenHeader(String var1);

   void xsetEvenHeader(STXstring var1);

   void unsetEvenHeader();

   String getEvenFooter();

   STXstring xgetEvenFooter();

   boolean isSetEvenFooter();

   void setEvenFooter(String var1);

   void xsetEvenFooter(STXstring var1);

   void unsetEvenFooter();

   String getFirstHeader();

   STXstring xgetFirstHeader();

   boolean isSetFirstHeader();

   void setFirstHeader(String var1);

   void xsetFirstHeader(STXstring var1);

   void unsetFirstHeader();

   String getFirstFooter();

   STXstring xgetFirstFooter();

   boolean isSetFirstFooter();

   void setFirstFooter(String var1);

   void xsetFirstFooter(STXstring var1);

   void unsetFirstFooter();

   boolean getDifferentOddEven();

   XmlBoolean xgetDifferentOddEven();

   boolean isSetDifferentOddEven();

   void setDifferentOddEven(boolean var1);

   void xsetDifferentOddEven(XmlBoolean var1);

   void unsetDifferentOddEven();

   boolean getDifferentFirst();

   XmlBoolean xgetDifferentFirst();

   boolean isSetDifferentFirst();

   void setDifferentFirst(boolean var1);

   void xsetDifferentFirst(XmlBoolean var1);

   void unsetDifferentFirst();

   boolean getScaleWithDoc();

   XmlBoolean xgetScaleWithDoc();

   boolean isSetScaleWithDoc();

   void setScaleWithDoc(boolean var1);

   void xsetScaleWithDoc(XmlBoolean var1);

   void unsetScaleWithDoc();

   boolean getAlignWithMargins();

   XmlBoolean xgetAlignWithMargins();

   boolean isSetAlignWithMargins();

   void setAlignWithMargins(boolean var1);

   void xsetAlignWithMargins(XmlBoolean var1);

   void unsetAlignWithMargins();


   public static final class Factory {

      public static CTHeaderFooter newInstance() {
         return (CTHeaderFooter)POIXMLTypeLoader.newInstance(CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter newInstance(XmlOptions var0) {
         return (CTHeaderFooter)POIXMLTypeLoader.newInstance(CTHeaderFooter.type, var0);
      }

      public static CTHeaderFooter parse(String var0) throws XmlException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(String var0, XmlOptions var1) throws XmlException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(File var0) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(URL var0) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(InputStream var0) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(Reader var0) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(XMLStreamReader var0) throws XmlException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(Node var0) throws XmlException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static CTHeaderFooter parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static CTHeaderFooter parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTHeaderFooter)POIXMLTypeLoader.parse(var0, CTHeaderFooter.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHeaderFooter.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTHeaderFooter.type, var1);
      }

   }
}
