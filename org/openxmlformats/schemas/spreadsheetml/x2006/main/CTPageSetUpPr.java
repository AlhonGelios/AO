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
import org.w3c.dom.Node;

public interface CTPageSetUpPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPageSetUpPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpagesetuppr24cftype");


   boolean getAutoPageBreaks();

   XmlBoolean xgetAutoPageBreaks();

   boolean isSetAutoPageBreaks();

   void setAutoPageBreaks(boolean var1);

   void xsetAutoPageBreaks(XmlBoolean var1);

   void unsetAutoPageBreaks();

   boolean getFitToPage();

   XmlBoolean xgetFitToPage();

   boolean isSetFitToPage();

   void setFitToPage(boolean var1);

   void xsetFitToPage(XmlBoolean var1);

   void unsetFitToPage();


   public static final class Factory {

      public static CTPageSetUpPr newInstance() {
         return (CTPageSetUpPr)POIXMLTypeLoader.newInstance(CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr newInstance(XmlOptions var0) {
         return (CTPageSetUpPr)POIXMLTypeLoader.newInstance(CTPageSetUpPr.type, var0);
      }

      public static CTPageSetUpPr parse(String var0) throws XmlException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(File var0) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(URL var0) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(InputStream var0) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(Reader var0) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(XMLStreamReader var0) throws XmlException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(Node var0) throws XmlException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static CTPageSetUpPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static CTPageSetUpPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPageSetUpPr)POIXMLTypeLoader.parse(var0, CTPageSetUpPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageSetUpPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPageSetUpPr.type, var1);
      }

   }
}
