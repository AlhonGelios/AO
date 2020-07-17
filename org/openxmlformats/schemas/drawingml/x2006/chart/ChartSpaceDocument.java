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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartSpace;
import org.w3c.dom.Node;

public interface ChartSpaceDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ChartSpaceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("chartspace36e0doctype");


   CTChartSpace getChartSpace();

   void setChartSpace(CTChartSpace var1);

   CTChartSpace addNewChartSpace();


   public static final class Factory {

      public static ChartSpaceDocument newInstance() {
         return (ChartSpaceDocument)POIXMLTypeLoader.newInstance(ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument newInstance(XmlOptions var0) {
         return (ChartSpaceDocument)POIXMLTypeLoader.newInstance(ChartSpaceDocument.type, var0);
      }

      public static ChartSpaceDocument parse(String var0) throws XmlException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(File var0) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(URL var0) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(InputStream var0) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(Reader var0) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(XMLStreamReader var0) throws XmlException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(Node var0) throws XmlException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static ChartSpaceDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static ChartSpaceDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ChartSpaceDocument)POIXMLTypeLoader.parse(var0, ChartSpaceDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ChartSpaceDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ChartSpaceDocument.type, var1);
      }

   }
}
