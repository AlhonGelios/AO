package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.PagesType;
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

public interface PagesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PagesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("pages52f4doctype");


   PagesType getPages();

   void setPages(PagesType var1);

   PagesType addNewPages();


   public static final class Factory {

      public static PagesDocument newInstance() {
         return (PagesDocument)POIXMLTypeLoader.newInstance(PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument newInstance(XmlOptions var0) {
         return (PagesDocument)POIXMLTypeLoader.newInstance(PagesDocument.type, var0);
      }

      public static PagesDocument parse(String var0) throws XmlException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(File var0) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(URL var0) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(InputStream var0) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(Reader var0) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(XMLStreamReader var0) throws XmlException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(Node var0) throws XmlException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static PagesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static PagesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PagesDocument)POIXMLTypeLoader.parse(var0, PagesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PagesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PagesDocument.type, var1);
      }

   }
}
