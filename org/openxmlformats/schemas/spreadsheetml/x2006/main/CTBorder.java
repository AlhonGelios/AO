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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr;
import org.w3c.dom.Node;

public interface CTBorder extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBorder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctborderf935type");


   CTBorderPr getLeft();

   boolean isSetLeft();

   void setLeft(CTBorderPr var1);

   CTBorderPr addNewLeft();

   void unsetLeft();

   CTBorderPr getRight();

   boolean isSetRight();

   void setRight(CTBorderPr var1);

   CTBorderPr addNewRight();

   void unsetRight();

   CTBorderPr getTop();

   boolean isSetTop();

   void setTop(CTBorderPr var1);

   CTBorderPr addNewTop();

   void unsetTop();

   CTBorderPr getBottom();

   boolean isSetBottom();

   void setBottom(CTBorderPr var1);

   CTBorderPr addNewBottom();

   void unsetBottom();

   CTBorderPr getDiagonal();

   boolean isSetDiagonal();

   void setDiagonal(CTBorderPr var1);

   CTBorderPr addNewDiagonal();

   void unsetDiagonal();

   CTBorderPr getVertical();

   boolean isSetVertical();

   void setVertical(CTBorderPr var1);

   CTBorderPr addNewVertical();

   void unsetVertical();

   CTBorderPr getHorizontal();

   boolean isSetHorizontal();

   void setHorizontal(CTBorderPr var1);

   CTBorderPr addNewHorizontal();

   void unsetHorizontal();

   boolean getDiagonalUp();

   XmlBoolean xgetDiagonalUp();

   boolean isSetDiagonalUp();

   void setDiagonalUp(boolean var1);

   void xsetDiagonalUp(XmlBoolean var1);

   void unsetDiagonalUp();

   boolean getDiagonalDown();

   XmlBoolean xgetDiagonalDown();

   boolean isSetDiagonalDown();

   void setDiagonalDown(boolean var1);

   void xsetDiagonalDown(XmlBoolean var1);

   void unsetDiagonalDown();

   boolean getOutline();

   XmlBoolean xgetOutline();

   boolean isSetOutline();

   void setOutline(boolean var1);

   void xsetOutline(XmlBoolean var1);

   void unsetOutline();


   public static final class Factory {

      public static CTBorder newInstance() {
         return (CTBorder)POIXMLTypeLoader.newInstance(CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder newInstance(XmlOptions var0) {
         return (CTBorder)POIXMLTypeLoader.newInstance(CTBorder.type, var0);
      }

      public static CTBorder parse(String var0) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(File var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(URL var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(InputStream var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(Reader var0) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(XMLStreamReader var0) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(Node var0) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static CTBorder parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, (XmlOptions)null);
      }

      public static CTBorder parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBorder)POIXMLTypeLoader.parse(var0, CTBorder.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorder.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorder.type, var1);
      }

   }
}
