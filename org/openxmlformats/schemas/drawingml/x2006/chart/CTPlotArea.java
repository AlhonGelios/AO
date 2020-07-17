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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTArea3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBar3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBubbleChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDTable;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDateAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDoughnutChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLine3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTOfPieChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRadarChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerAx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStockChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface3DChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSurfaceChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.w3c.dom.Node;

public interface CTPlotArea extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPlotArea.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctplotarea106etype");


   CTLayout getLayout();

   boolean isSetLayout();

   void setLayout(CTLayout var1);

   CTLayout addNewLayout();

   void unsetLayout();

   List getAreaChartList();

   CTAreaChart[] getAreaChartArray();

   CTAreaChart getAreaChartArray(int var1);

   int sizeOfAreaChartArray();

   void setAreaChartArray(CTAreaChart[] var1);

   void setAreaChartArray(int var1, CTAreaChart var2);

   CTAreaChart insertNewAreaChart(int var1);

   CTAreaChart addNewAreaChart();

   void removeAreaChart(int var1);

   List getArea3DChartList();

   CTArea3DChart[] getArea3DChartArray();

   CTArea3DChart getArea3DChartArray(int var1);

   int sizeOfArea3DChartArray();

   void setArea3DChartArray(CTArea3DChart[] var1);

   void setArea3DChartArray(int var1, CTArea3DChart var2);

   CTArea3DChart insertNewArea3DChart(int var1);

   CTArea3DChart addNewArea3DChart();

   void removeArea3DChart(int var1);

   List getLineChartList();

   CTLineChart[] getLineChartArray();

   CTLineChart getLineChartArray(int var1);

   int sizeOfLineChartArray();

   void setLineChartArray(CTLineChart[] var1);

   void setLineChartArray(int var1, CTLineChart var2);

   CTLineChart insertNewLineChart(int var1);

   CTLineChart addNewLineChart();

   void removeLineChart(int var1);

   List getLine3DChartList();

   CTLine3DChart[] getLine3DChartArray();

   CTLine3DChart getLine3DChartArray(int var1);

   int sizeOfLine3DChartArray();

   void setLine3DChartArray(CTLine3DChart[] var1);

   void setLine3DChartArray(int var1, CTLine3DChart var2);

   CTLine3DChart insertNewLine3DChart(int var1);

   CTLine3DChart addNewLine3DChart();

   void removeLine3DChart(int var1);

   List getStockChartList();

   CTStockChart[] getStockChartArray();

   CTStockChart getStockChartArray(int var1);

   int sizeOfStockChartArray();

   void setStockChartArray(CTStockChart[] var1);

   void setStockChartArray(int var1, CTStockChart var2);

   CTStockChart insertNewStockChart(int var1);

   CTStockChart addNewStockChart();

   void removeStockChart(int var1);

   List getRadarChartList();

   CTRadarChart[] getRadarChartArray();

   CTRadarChart getRadarChartArray(int var1);

   int sizeOfRadarChartArray();

   void setRadarChartArray(CTRadarChart[] var1);

   void setRadarChartArray(int var1, CTRadarChart var2);

   CTRadarChart insertNewRadarChart(int var1);

   CTRadarChart addNewRadarChart();

   void removeRadarChart(int var1);

   List getScatterChartList();

   CTScatterChart[] getScatterChartArray();

   CTScatterChart getScatterChartArray(int var1);

   int sizeOfScatterChartArray();

   void setScatterChartArray(CTScatterChart[] var1);

   void setScatterChartArray(int var1, CTScatterChart var2);

   CTScatterChart insertNewScatterChart(int var1);

   CTScatterChart addNewScatterChart();

   void removeScatterChart(int var1);

   List getPieChartList();

   CTPieChart[] getPieChartArray();

   CTPieChart getPieChartArray(int var1);

   int sizeOfPieChartArray();

   void setPieChartArray(CTPieChart[] var1);

   void setPieChartArray(int var1, CTPieChart var2);

   CTPieChart insertNewPieChart(int var1);

   CTPieChart addNewPieChart();

   void removePieChart(int var1);

   List getPie3DChartList();

   CTPie3DChart[] getPie3DChartArray();

   CTPie3DChart getPie3DChartArray(int var1);

   int sizeOfPie3DChartArray();

   void setPie3DChartArray(CTPie3DChart[] var1);

   void setPie3DChartArray(int var1, CTPie3DChart var2);

   CTPie3DChart insertNewPie3DChart(int var1);

   CTPie3DChart addNewPie3DChart();

   void removePie3DChart(int var1);

   List getDoughnutChartList();

   CTDoughnutChart[] getDoughnutChartArray();

   CTDoughnutChart getDoughnutChartArray(int var1);

   int sizeOfDoughnutChartArray();

   void setDoughnutChartArray(CTDoughnutChart[] var1);

   void setDoughnutChartArray(int var1, CTDoughnutChart var2);

   CTDoughnutChart insertNewDoughnutChart(int var1);

   CTDoughnutChart addNewDoughnutChart();

   void removeDoughnutChart(int var1);

   List getBarChartList();

   CTBarChart[] getBarChartArray();

   CTBarChart getBarChartArray(int var1);

   int sizeOfBarChartArray();

   void setBarChartArray(CTBarChart[] var1);

   void setBarChartArray(int var1, CTBarChart var2);

   CTBarChart insertNewBarChart(int var1);

   CTBarChart addNewBarChart();

   void removeBarChart(int var1);

   List getBar3DChartList();

   CTBar3DChart[] getBar3DChartArray();

   CTBar3DChart getBar3DChartArray(int var1);

   int sizeOfBar3DChartArray();

   void setBar3DChartArray(CTBar3DChart[] var1);

   void setBar3DChartArray(int var1, CTBar3DChart var2);

   CTBar3DChart insertNewBar3DChart(int var1);

   CTBar3DChart addNewBar3DChart();

   void removeBar3DChart(int var1);

   List getOfPieChartList();

   CTOfPieChart[] getOfPieChartArray();

   CTOfPieChart getOfPieChartArray(int var1);

   int sizeOfOfPieChartArray();

   void setOfPieChartArray(CTOfPieChart[] var1);

   void setOfPieChartArray(int var1, CTOfPieChart var2);

   CTOfPieChart insertNewOfPieChart(int var1);

   CTOfPieChart addNewOfPieChart();

   void removeOfPieChart(int var1);

   List getSurfaceChartList();

   CTSurfaceChart[] getSurfaceChartArray();

   CTSurfaceChart getSurfaceChartArray(int var1);

   int sizeOfSurfaceChartArray();

   void setSurfaceChartArray(CTSurfaceChart[] var1);

   void setSurfaceChartArray(int var1, CTSurfaceChart var2);

   CTSurfaceChart insertNewSurfaceChart(int var1);

   CTSurfaceChart addNewSurfaceChart();

   void removeSurfaceChart(int var1);

   List getSurface3DChartList();

   CTSurface3DChart[] getSurface3DChartArray();

   CTSurface3DChart getSurface3DChartArray(int var1);

   int sizeOfSurface3DChartArray();

   void setSurface3DChartArray(CTSurface3DChart[] var1);

   void setSurface3DChartArray(int var1, CTSurface3DChart var2);

   CTSurface3DChart insertNewSurface3DChart(int var1);

   CTSurface3DChart addNewSurface3DChart();

   void removeSurface3DChart(int var1);

   List getBubbleChartList();

   CTBubbleChart[] getBubbleChartArray();

   CTBubbleChart getBubbleChartArray(int var1);

   int sizeOfBubbleChartArray();

   void setBubbleChartArray(CTBubbleChart[] var1);

   void setBubbleChartArray(int var1, CTBubbleChart var2);

   CTBubbleChart insertNewBubbleChart(int var1);

   CTBubbleChart addNewBubbleChart();

   void removeBubbleChart(int var1);

   List getValAxList();

   CTValAx[] getValAxArray();

   CTValAx getValAxArray(int var1);

   int sizeOfValAxArray();

   void setValAxArray(CTValAx[] var1);

   void setValAxArray(int var1, CTValAx var2);

   CTValAx insertNewValAx(int var1);

   CTValAx addNewValAx();

   void removeValAx(int var1);

   List getCatAxList();

   CTCatAx[] getCatAxArray();

   CTCatAx getCatAxArray(int var1);

   int sizeOfCatAxArray();

   void setCatAxArray(CTCatAx[] var1);

   void setCatAxArray(int var1, CTCatAx var2);

   CTCatAx insertNewCatAx(int var1);

   CTCatAx addNewCatAx();

   void removeCatAx(int var1);

   List getDateAxList();

   CTDateAx[] getDateAxArray();

   CTDateAx getDateAxArray(int var1);

   int sizeOfDateAxArray();

   void setDateAxArray(CTDateAx[] var1);

   void setDateAxArray(int var1, CTDateAx var2);

   CTDateAx insertNewDateAx(int var1);

   CTDateAx addNewDateAx();

   void removeDateAx(int var1);

   List getSerAxList();

   CTSerAx[] getSerAxArray();

   CTSerAx getSerAxArray(int var1);

   int sizeOfSerAxArray();

   void setSerAxArray(CTSerAx[] var1);

   void setSerAxArray(int var1, CTSerAx var2);

   CTSerAx insertNewSerAx(int var1);

   CTSerAx addNewSerAx();

   void removeSerAx(int var1);

   CTDTable getDTable();

   boolean isSetDTable();

   void setDTable(CTDTable var1);

   CTDTable addNewDTable();

   void unsetDTable();

   CTShapeProperties getSpPr();

   boolean isSetSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   void unsetSpPr();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTPlotArea newInstance() {
         return (CTPlotArea)POIXMLTypeLoader.newInstance(CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea newInstance(XmlOptions var0) {
         return (CTPlotArea)POIXMLTypeLoader.newInstance(CTPlotArea.type, var0);
      }

      public static CTPlotArea parse(String var0) throws XmlException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(File var0) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(URL var0) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(InputStream var0) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(Reader var0) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(XMLStreamReader var0) throws XmlException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(Node var0) throws XmlException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static CTPlotArea parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static CTPlotArea parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPlotArea)POIXMLTypeLoader.parse(var0, CTPlotArea.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPlotArea.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPlotArea.type, var1);
      }

   }
}
