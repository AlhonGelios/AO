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

public interface CTTableStyleInfo extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableStyleInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablestyleinfo499atype");


   String getName();

   STXstring xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   void unsetName();

   boolean getShowFirstColumn();

   XmlBoolean xgetShowFirstColumn();

   boolean isSetShowFirstColumn();

   void setShowFirstColumn(boolean var1);

   void xsetShowFirstColumn(XmlBoolean var1);

   void unsetShowFirstColumn();

   boolean getShowLastColumn();

   XmlBoolean xgetShowLastColumn();

   boolean isSetShowLastColumn();

   void setShowLastColumn(boolean var1);

   void xsetShowLastColumn(XmlBoolean var1);

   void unsetShowLastColumn();

   boolean getShowRowStripes();

   XmlBoolean xgetShowRowStripes();

   boolean isSetShowRowStripes();

   void setShowRowStripes(boolean var1);

   void xsetShowRowStripes(XmlBoolean var1);

   void unsetShowRowStripes();

   boolean getShowColumnStripes();

   XmlBoolean xgetShowColumnStripes();

   boolean isSetShowColumnStripes();

   void setShowColumnStripes(boolean var1);

   void xsetShowColumnStripes(XmlBoolean var1);

   void unsetShowColumnStripes();


   public static final class Factory {

      public static CTTableStyleInfo newInstance() {
         return (CTTableStyleInfo)POIXMLTypeLoader.newInstance(CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo newInstance(XmlOptions var0) {
         return (CTTableStyleInfo)POIXMLTypeLoader.newInstance(CTTableStyleInfo.type, var0);
      }

      public static CTTableStyleInfo parse(String var0) throws XmlException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(File var0) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(URL var0) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(InputStream var0) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(Reader var0) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(XMLStreamReader var0) throws XmlException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(Node var0) throws XmlException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static CTTableStyleInfo parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static CTTableStyleInfo parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableStyleInfo)POIXMLTypeLoader.parse(var0, CTTableStyleInfo.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleInfo.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleInfo.type, var1);
      }

   }
}
