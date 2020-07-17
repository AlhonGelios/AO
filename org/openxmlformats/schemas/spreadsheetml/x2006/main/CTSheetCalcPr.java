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

public interface CTSheetCalcPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSheetCalcPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsheetcalcprc6d5type");


   boolean getFullCalcOnLoad();

   XmlBoolean xgetFullCalcOnLoad();

   boolean isSetFullCalcOnLoad();

   void setFullCalcOnLoad(boolean var1);

   void xsetFullCalcOnLoad(XmlBoolean var1);

   void unsetFullCalcOnLoad();


   public static final class Factory {

      public static CTSheetCalcPr newInstance() {
         return (CTSheetCalcPr)POIXMLTypeLoader.newInstance(CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr newInstance(XmlOptions var0) {
         return (CTSheetCalcPr)POIXMLTypeLoader.newInstance(CTSheetCalcPr.type, var0);
      }

      public static CTSheetCalcPr parse(String var0) throws XmlException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(File var0) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(URL var0) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(Reader var0) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(Node var0) throws XmlException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static CTSheetCalcPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static CTSheetCalcPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSheetCalcPr)POIXMLTypeLoader.parse(var0, CTSheetCalcPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetCalcPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSheetCalcPr.type, var1);
      }

   }
}
