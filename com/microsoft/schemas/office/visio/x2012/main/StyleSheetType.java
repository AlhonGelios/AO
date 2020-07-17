package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.SheetType;
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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface StyleSheetType extends SheetType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(StyleSheetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stylesheettypeebcbtype");


   long getID();

   XmlUnsignedInt xgetID();

   void setID(long var1);

   void xsetID(XmlUnsignedInt var1);

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();

   String getNameU();

   XmlString xgetNameU();

   boolean isSetNameU();

   void setNameU(String var1);

   void xsetNameU(XmlString var1);

   void unsetNameU();

   boolean getIsCustomName();

   XmlBoolean xgetIsCustomName();

   boolean isSetIsCustomName();

   void setIsCustomName(boolean var1);

   void xsetIsCustomName(XmlBoolean var1);

   void unsetIsCustomName();

   boolean getIsCustomNameU();

   XmlBoolean xgetIsCustomNameU();

   boolean isSetIsCustomNameU();

   void setIsCustomNameU(boolean var1);

   void xsetIsCustomNameU(XmlBoolean var1);

   void unsetIsCustomNameU();


   public static final class Factory {

      public static StyleSheetType newInstance() {
         return (StyleSheetType)POIXMLTypeLoader.newInstance(StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType newInstance(XmlOptions var0) {
         return (StyleSheetType)POIXMLTypeLoader.newInstance(StyleSheetType.type, var0);
      }

      public static StyleSheetType parse(String var0) throws XmlException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(String var0, XmlOptions var1) throws XmlException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(File var0) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(URL var0) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(InputStream var0) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(Reader var0) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(XMLStreamReader var0) throws XmlException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(Node var0) throws XmlException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(Node var0, XmlOptions var1) throws XmlException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static StyleSheetType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static StyleSheetType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (StyleSheetType)POIXMLTypeLoader.parse(var0, StyleSheetType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StyleSheetType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, StyleSheetType.type, var1);
      }

   }
}
