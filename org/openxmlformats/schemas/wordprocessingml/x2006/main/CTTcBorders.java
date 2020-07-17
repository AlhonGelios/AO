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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.w3c.dom.Node;

public interface CTTcBorders extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTcBorders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttcbordersa5fatype");


   CTBorder getTop();

   boolean isSetTop();

   void setTop(CTBorder var1);

   CTBorder addNewTop();

   void unsetTop();

   CTBorder getLeft();

   boolean isSetLeft();

   void setLeft(CTBorder var1);

   CTBorder addNewLeft();

   void unsetLeft();

   CTBorder getBottom();

   boolean isSetBottom();

   void setBottom(CTBorder var1);

   CTBorder addNewBottom();

   void unsetBottom();

   CTBorder getRight();

   boolean isSetRight();

   void setRight(CTBorder var1);

   CTBorder addNewRight();

   void unsetRight();

   CTBorder getInsideH();

   boolean isSetInsideH();

   void setInsideH(CTBorder var1);

   CTBorder addNewInsideH();

   void unsetInsideH();

   CTBorder getInsideV();

   boolean isSetInsideV();

   void setInsideV(CTBorder var1);

   CTBorder addNewInsideV();

   void unsetInsideV();

   CTBorder getTl2Br();

   boolean isSetTl2Br();

   void setTl2Br(CTBorder var1);

   CTBorder addNewTl2Br();

   void unsetTl2Br();

   CTBorder getTr2Bl();

   boolean isSetTr2Bl();

   void setTr2Bl(CTBorder var1);

   CTBorder addNewTr2Bl();

   void unsetTr2Bl();


   public static final class Factory {

      public static CTTcBorders newInstance() {
         return (CTTcBorders)POIXMLTypeLoader.newInstance(CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders newInstance(XmlOptions var0) {
         return (CTTcBorders)POIXMLTypeLoader.newInstance(CTTcBorders.type, var0);
      }

      public static CTTcBorders parse(String var0) throws XmlException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(File var0) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(URL var0) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(InputStream var0) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(Reader var0) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(XMLStreamReader var0) throws XmlException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(Node var0) throws XmlException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static CTTcBorders parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static CTTcBorders parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTcBorders)POIXMLTypeLoader.parse(var0, CTTcBorders.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcBorders.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTcBorders.type, var1);
      }

   }
}
