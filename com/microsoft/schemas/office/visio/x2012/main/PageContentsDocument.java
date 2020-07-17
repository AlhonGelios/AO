package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.PageContentsType;
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
import org.w3c.dom.Node;

public interface PageContentsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PageContentsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pagecontentsfc8bdoctype");


   PageContentsType getPageContents();

   void setPageContents(PageContentsType var1);

   PageContentsType addNewPageContents();


   public static final class Factory {

      public static PageContentsDocument newInstance() {
         return (PageContentsDocument)POIXMLTypeLoader.newInstance(PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument newInstance(XmlOptions var0) {
         return (PageContentsDocument)POIXMLTypeLoader.newInstance(PageContentsDocument.type, var0);
      }

      public static PageContentsDocument parse(String var0) throws XmlException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(File var0) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(URL var0) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(InputStream var0) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(Reader var0) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(XMLStreamReader var0) throws XmlException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(Node var0) throws XmlException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static PageContentsDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static PageContentsDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PageContentsDocument)POIXMLTypeLoader.parse(var0, PageContentsDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageContentsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PageContentsDocument.type, var1);
      }

   }
}
