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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterSer;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScatterStyle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.w3c.dom.Node;

public interface CTScatterChart extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTScatterChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctscatterchart2bfctype");


   CTScatterStyle getScatterStyle();

   void setScatterStyle(CTScatterStyle var1);

   CTScatterStyle addNewScatterStyle();

   CTBoolean getVaryColors();

   boolean isSetVaryColors();

   void setVaryColors(CTBoolean var1);

   CTBoolean addNewVaryColors();

   void unsetVaryColors();

   List getSerList();

   CTScatterSer[] getSerArray();

   CTScatterSer getSerArray(int var1);

   int sizeOfSerArray();

   void setSerArray(CTScatterSer[] var1);

   void setSerArray(int var1, CTScatterSer var2);

   CTScatterSer insertNewSer(int var1);

   CTScatterSer addNewSer();

   void removeSer(int var1);

   CTDLbls getDLbls();

   boolean isSetDLbls();

   void setDLbls(CTDLbls var1);

   CTDLbls addNewDLbls();

   void unsetDLbls();

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

      public static CTScatterChart newInstance() {
         return (CTScatterChart)POIXMLTypeLoader.newInstance(CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart newInstance(XmlOptions var0) {
         return (CTScatterChart)POIXMLTypeLoader.newInstance(CTScatterChart.type, var0);
      }

      public static CTScatterChart parse(String var0) throws XmlException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(String var0, XmlOptions var1) throws XmlException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(File var0) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(URL var0) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(InputStream var0) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(Reader var0) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(XMLStreamReader var0) throws XmlException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(Node var0) throws XmlException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static CTScatterChart parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static CTScatterChart parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTScatterChart)POIXMLTypeLoader.parse(var0, CTScatterChart.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScatterChart.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScatterChart.type, var1);
      }

   }
}
