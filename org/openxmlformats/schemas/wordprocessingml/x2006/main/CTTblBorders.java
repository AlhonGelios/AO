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

public interface CTTblBorders extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTblBorders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttblborders459ftype");


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


   public static final class Factory {

      public static CTTblBorders newInstance() {
         return (CTTblBorders)POIXMLTypeLoader.newInstance(CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders newInstance(XmlOptions var0) {
         return (CTTblBorders)POIXMLTypeLoader.newInstance(CTTblBorders.type, var0);
      }

      public static CTTblBorders parse(String var0) throws XmlException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(File var0) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(URL var0) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(InputStream var0) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(Reader var0) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(XMLStreamReader var0) throws XmlException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(Node var0) throws XmlException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static CTTblBorders parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static CTTblBorders parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTblBorders)POIXMLTypeLoader.parse(var0, CTTblBorders.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblBorders.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTblBorders.type, var1);
      }

   }
}
