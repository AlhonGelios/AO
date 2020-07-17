package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.PageType;
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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface PagesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PagesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pagestypef2e7type");


   List getPageList();

   PageType[] getPageArray();

   PageType getPageArray(int var1);

   int sizeOfPageArray();

   void setPageArray(PageType[] var1);

   void setPageArray(int var1, PageType var2);

   PageType insertNewPage(int var1);

   PageType addNewPage();

   void removePage(int var1);


   public static final class Factory {

      public static PagesType newInstance() {
         return (PagesType)POIXMLTypeLoader.newInstance(PagesType.type, (XmlOptions)null);
      }

      public static PagesType newInstance(XmlOptions var0) {
         return (PagesType)POIXMLTypeLoader.newInstance(PagesType.type, var0);
      }

      public static PagesType parse(String var0) throws XmlException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(String var0, XmlOptions var1) throws XmlException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(File var0) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(URL var0) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(InputStream var0) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(Reader var0) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(XMLStreamReader var0) throws XmlException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(Node var0) throws XmlException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static PagesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, (XmlOptions)null);
      }

      public static PagesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PagesType)POIXMLTypeLoader.parse(var0, PagesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PagesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PagesType.type, var1);
      }

   }
}
