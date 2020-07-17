package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.w3c.dom.Node;

public interface CTBorders extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBorders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctborders0d66type");


   List getBorderList();

   CTBorder[] getBorderArray();

   CTBorder getBorderArray(int var1);

   int sizeOfBorderArray();

   void setBorderArray(CTBorder[] var1);

   void setBorderArray(int var1, CTBorder var2);

   CTBorder insertNewBorder(int var1);

   CTBorder addNewBorder();

   void removeBorder(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTBorders newInstance() {
         return (CTBorders)POIXMLTypeLoader.newInstance(CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders newInstance(XmlOptions var0) {
         return (CTBorders)POIXMLTypeLoader.newInstance(CTBorders.type, var0);
      }

      public static CTBorders parse(String var0) throws XmlException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(File var0) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(URL var0) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(InputStream var0) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(Reader var0) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(XMLStreamReader var0) throws XmlException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(Node var0) throws XmlException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static CTBorders parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, (XmlOptions)null);
      }

      public static CTBorders parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBorders)POIXMLTypeLoader.parse(var0, CTBorders.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorders.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBorders.type, var1);
      }

   }
}
