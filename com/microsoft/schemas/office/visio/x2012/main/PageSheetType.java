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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface PageSheetType extends SheetType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PageSheetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pagesheettype679btype");


   String getUniqueID();

   XmlString xgetUniqueID();

   boolean isSetUniqueID();

   void setUniqueID(String var1);

   void xsetUniqueID(XmlString var1);

   void unsetUniqueID();


   public static final class Factory {

      public static PageSheetType newInstance() {
         return (PageSheetType)POIXMLTypeLoader.newInstance(PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType newInstance(XmlOptions var0) {
         return (PageSheetType)POIXMLTypeLoader.newInstance(PageSheetType.type, var0);
      }

      public static PageSheetType parse(String var0) throws XmlException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(String var0, XmlOptions var1) throws XmlException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(File var0) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(URL var0) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(InputStream var0) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(Reader var0) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(XMLStreamReader var0) throws XmlException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(Node var0) throws XmlException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(Node var0, XmlOptions var1) throws XmlException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static PageSheetType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static PageSheetType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PageSheetType)POIXMLTypeLoader.parse(var0, PageSheetType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageSheetType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageSheetType.type, var1);
      }

   }
}
