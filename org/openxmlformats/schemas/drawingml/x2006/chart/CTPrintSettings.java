package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId;
import org.w3c.dom.Node;

public interface CTPrintSettings extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPrintSettings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctprintsettings61b6type");


   CTHeaderFooter getHeaderFooter();

   boolean isSetHeaderFooter();

   void setHeaderFooter(CTHeaderFooter var1);

   CTHeaderFooter addNewHeaderFooter();

   void unsetHeaderFooter();

   CTPageMargins getPageMargins();

   boolean isSetPageMargins();

   void setPageMargins(CTPageMargins var1);

   CTPageMargins addNewPageMargins();

   void unsetPageMargins();

   CTPageSetup getPageSetup();

   boolean isSetPageSetup();

   void setPageSetup(CTPageSetup var1);

   CTPageSetup addNewPageSetup();

   void unsetPageSetup();

   CTRelId getLegacyDrawingHF();

   boolean isSetLegacyDrawingHF();

   void setLegacyDrawingHF(CTRelId var1);

   CTRelId addNewLegacyDrawingHF();

   void unsetLegacyDrawingHF();


   public static final class Factory {

      public static CTPrintSettings newInstance() {
         return (CTPrintSettings)POIXMLTypeLoader.newInstance(CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings newInstance(XmlOptions var0) {
         return (CTPrintSettings)POIXMLTypeLoader.newInstance(CTPrintSettings.type, var0);
      }

      public static CTPrintSettings parse(String var0) throws XmlException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(File var0) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(URL var0) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(InputStream var0) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(Reader var0) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(XMLStreamReader var0) throws XmlException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(Node var0) throws XmlException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static CTPrintSettings parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static CTPrintSettings parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPrintSettings)POIXMLTypeLoader.parse(var0, CTPrintSettings.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPrintSettings.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPrintSettings.type, var1);
      }

   }
}
