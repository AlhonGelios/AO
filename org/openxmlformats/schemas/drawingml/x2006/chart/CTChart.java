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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDispBlanksAs;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotFmts;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSurface;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTView3D;
import org.w3c.dom.Node;

public interface CTChart extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctchartc108type");


   CTTitle getTitle();

   boolean isSetTitle();

   void setTitle(CTTitle var1);

   CTTitle addNewTitle();

   void unsetTitle();

   CTBoolean getAutoTitleDeleted();

   boolean isSetAutoTitleDeleted();

   void setAutoTitleDeleted(CTBoolean var1);

   CTBoolean addNewAutoTitleDeleted();

   void unsetAutoTitleDeleted();

   CTPivotFmts getPivotFmts();

   boolean isSetPivotFmts();

   void setPivotFmts(CTPivotFmts var1);

   CTPivotFmts addNewPivotFmts();

   void unsetPivotFmts();

   CTView3D getView3D();

   boolean isSetView3D();

   void setView3D(CTView3D var1);

   CTView3D addNewView3D();

   void unsetView3D();

   CTSurface getFloor();

   boolean isSetFloor();

   void setFloor(CTSurface var1);

   CTSurface addNewFloor();

   void unsetFloor();

   CTSurface getSideWall();

   boolean isSetSideWall();

   void setSideWall(CTSurface var1);

   CTSurface addNewSideWall();

   void unsetSideWall();

   CTSurface getBackWall();

   boolean isSetBackWall();

   void setBackWall(CTSurface var1);

   CTSurface addNewBackWall();

   void unsetBackWall();

   CTPlotArea getPlotArea();

   void setPlotArea(CTPlotArea var1);

   CTPlotArea addNewPlotArea();

   CTLegend getLegend();

   boolean isSetLegend();

   void setLegend(CTLegend var1);

   CTLegend addNewLegend();

   void unsetLegend();

   CTBoolean getPlotVisOnly();

   boolean isSetPlotVisOnly();

   void setPlotVisOnly(CTBoolean var1);

   CTBoolean addNewPlotVisOnly();

   void unsetPlotVisOnly();

   CTDispBlanksAs getDispBlanksAs();

   boolean isSetDispBlanksAs();

   void setDispBlanksAs(CTDispBlanksAs var1);

   CTDispBlanksAs addNewDispBlanksAs();

   void unsetDispBlanksAs();

   CTBoolean getShowDLblsOverMax();

   boolean isSetShowDLblsOverMax();

   void setShowDLblsOverMax(CTBoolean var1);

   CTBoolean addNewShowDLblsOverMax();

   void unsetShowDLblsOverMax();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTChart newInstance() {
         return (CTChart)POIXMLTypeLoader.newInstance(CTChart.type, (XmlOptions)null);
      }

      public static CTChart newInstance(XmlOptions var0) {
         return (CTChart)POIXMLTypeLoader.newInstance(CTChart.type, var0);
      }

      public static CTChart parse(String var0) throws XmlException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(String var0, XmlOptions var1) throws XmlException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(File var0) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(URL var0) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(InputStream var0) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(Reader var0) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(XMLStreamReader var0) throws XmlException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(Node var0) throws XmlException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static CTChart parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, (XmlOptions)null);
      }

      public static CTChart parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTChart)POIXMLTypeLoader.parse(var0, CTChart.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTChart.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTChart.type, var1);
      }

   }
}
