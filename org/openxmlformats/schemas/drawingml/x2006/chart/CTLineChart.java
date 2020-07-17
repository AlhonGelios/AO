package org.openxmlformats.schemas.drawingml.x2006.chart;

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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTGrouping;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUpDownBars;
import org.w3c.dom.Node;

public interface CTLineChart extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLineChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlinechart249ctype");


   CTGrouping getGrouping();

   void setGrouping(CTGrouping var1);

   CTGrouping addNewGrouping();

   CTBoolean getVaryColors();

   boolean isSetVaryColors();

   void setVaryColors(CTBoolean var1);

   CTBoolean addNewVaryColors();

   void unsetVaryColors();

   List getSerList();

   CTLineSer[] getSerArray();

   CTLineSer getSerArray(int var1);

   int sizeOfSerArray();

   void setSerArray(CTLineSer[] var1);

   void setSerArray(int var1, CTLineSer var2);

   CTLineSer insertNewSer(int var1);

   CTLineSer addNewSer();

   void removeSer(int var1);

   CTDLbls getDLbls();

   boolean isSetDLbls();

   void setDLbls(CTDLbls var1);

   CTDLbls addNewDLbls();

   void unsetDLbls();

   CTChartLines getDropLines();

   boolean isSetDropLines();

   void setDropLines(CTChartLines var1);

   CTChartLines addNewDropLines();

   void unsetDropLines();

   CTChartLines getHiLowLines();

   boolean isSetHiLowLines();

   void setHiLowLines(CTChartLines var1);

   CTChartLines addNewHiLowLines();

   void unsetHiLowLines();

   CTUpDownBars getUpDownBars();

   boolean isSetUpDownBars();

   void setUpDownBars(CTUpDownBars var1);

   CTUpDownBars addNewUpDownBars();

   void unsetUpDownBars();

   CTBoolean getMarker();

   boolean isSetMarker();

   void setMarker(CTBoolean var1);

   CTBoolean addNewMarker();

   void unsetMarker();

   CTBoolean getSmooth();

   boolean isSetSmooth();

   void setSmooth(CTBoolean var1);

   CTBoolean addNewSmooth();

   void unsetSmooth();

   List getAxIdList();

   CTUnsignedInt[] getAxIdArray();

   CTUnsignedInt getAxIdArray(int var1);

   int sizeOfAxIdArray();

   void setAxIdArray(CTUnsignedInt[] var1);

   void setAxIdArray(int var1, CTUnsignedInt var2);

   CTUnsignedInt insertNewAxId(int var1);

   CTUnsignedInt addNewAxId();

   void removeAxId(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTLineChart newInstance() {
         return (CTLineChart)POIXMLTypeLoader.newInstance(CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart newInstance(XmlOptions var0) {
         return (CTLineChart)POIXMLTypeLoader.newInstance(CTLineChart.type, var0);
      }

      public static CTLineChart parse(String var0) throws XmlException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(File var0) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(URL var0) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(InputStream var0) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(Reader var0) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(XMLStreamReader var0) throws XmlException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(Node var0) throws XmlException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static CTLineChart parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static CTLineChart parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLineChart)POIXMLTypeLoader.parse(var0, CTLineChart.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineChart.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineChart.type, var1);
      }

   }
}
