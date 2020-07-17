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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet;
import org.w3c.dom.Node;

public interface ChartsheetDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ChartsheetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("chartsheet99dedoctype");


   CTChartsheet getChartsheet();

   void setChartsheet(CTChartsheet var1);

   CTChartsheet addNewChartsheet();


   public static final class Factory {

      public static ChartsheetDocument newInstance() {
         return (ChartsheetDocument)POIXMLTypeLoader.newInstance(ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument newInstance(XmlOptions var0) {
         return (ChartsheetDocument)POIXMLTypeLoader.newInstance(ChartsheetDocument.type, var0);
      }

      public static ChartsheetDocument parse(String var0) throws XmlException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(File var0) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(URL var0) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(InputStream var0) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(Reader var0) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(XMLStreamReader var0) throws XmlException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(Node var0) throws XmlException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static ChartsheetDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static ChartsheetDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ChartsheetDocument)POIXMLTypeLoader.parse(var0, ChartsheetDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ChartsheetDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ChartsheetDocument.type, var1);
      }

   }
}
