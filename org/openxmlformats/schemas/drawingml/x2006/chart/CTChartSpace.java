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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExternalData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPivotSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTProtection;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStyle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTextLanguageID;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.w3c.dom.Node;

public interface CTChartSpace extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTChartSpace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctchartspacef9b4type");


   CTBoolean getDate1904();

   boolean isSetDate1904();

   void setDate1904(CTBoolean var1);

   CTBoolean addNewDate1904();

   void unsetDate1904();

   CTTextLanguageID getLang();

   boolean isSetLang();

   void setLang(CTTextLanguageID var1);

   CTTextLanguageID addNewLang();

   void unsetLang();

   CTBoolean getRoundedCorners();

   boolean isSetRoundedCorners();

   void setRoundedCorners(CTBoolean var1);

   CTBoolean addNewRoundedCorners();

   void unsetRoundedCorners();

   CTStyle getStyle();

   boolean isSetStyle();

   void setStyle(CTStyle var1);

   CTStyle addNewStyle();

   void unsetStyle();

   CTColorMapping getClrMapOvr();

   boolean isSetClrMapOvr();

   void setClrMapOvr(CTColorMapping var1);

   CTColorMapping addNewClrMapOvr();

   void unsetClrMapOvr();

   CTPivotSource getPivotSource();

   boolean isSetPivotSource();

   void setPivotSource(CTPivotSource var1);

   CTPivotSource addNewPivotSource();

   void unsetPivotSource();

   CTProtection getProtection();

   boolean isSetProtection();

   void setProtection(CTProtection var1);

   CTProtection addNewProtection();

   void unsetProtection();

   CTChart getChart();

   void setChart(CTChart var1);

   CTChart addNewChart();

   CTShapeProperties getSpPr();

   boolean isSetSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   void unsetSpPr();

   CTTextBody getTxPr();

   boolean isSetTxPr();

   void setTxPr(CTTextBody var1);

   CTTextBody addNewTxPr();

   void unsetTxPr();

   CTExternalData getExternalData();

   boolean isSetExternalData();

   void setExternalData(CTExternalData var1);

   CTExternalData addNewExternalData();

   void unsetExternalData();

   CTPrintSettings getPrintSettings();

   boolean isSetPrintSettings();

   void setPrintSettings(CTPrintSettings var1);

   CTPrintSettings addNewPrintSettings();

   void unsetPrintSettings();

   CTRelId getUserShapes();

   boolean isSetUserShapes();

   void setUserShapes(CTRelId var1);

   CTRelId addNewUserShapes();

   void unsetUserShapes();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTChartSpace newInstance() {
         return (CTChartSpace)POIXMLTypeLoader.newInstance(CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace newInstance(XmlOptions var0) {
         return (CTChartSpace)POIXMLTypeLoader.newInstance(CTChartSpace.type, var0);
      }

      public static CTChartSpace parse(String var0) throws XmlException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(String var0, XmlOptions var1) throws XmlException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(File var0) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(URL var0) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(InputStream var0) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(Reader var0) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(XMLStreamReader var0) throws XmlException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(Node var0) throws XmlException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static CTChartSpace parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static CTChartSpace parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTChartSpace)POIXMLTypeLoader.parse(var0, CTChartSpace.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTChartSpace.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTChartSpace.type, var1);
      }

   }
}
