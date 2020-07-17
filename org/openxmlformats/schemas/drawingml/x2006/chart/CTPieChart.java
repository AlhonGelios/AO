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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTFirstSliceAng;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer;
import org.w3c.dom.Node;

public interface CTPieChart extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPieChart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpiechartd34atype");


   CTBoolean getVaryColors();

   boolean isSetVaryColors();

   void setVaryColors(CTBoolean var1);

   CTBoolean addNewVaryColors();

   void unsetVaryColors();

   List getSerList();

   CTPieSer[] getSerArray();

   CTPieSer getSerArray(int var1);

   int sizeOfSerArray();

   void setSerArray(CTPieSer[] var1);

   void setSerArray(int var1, CTPieSer var2);

   CTPieSer insertNewSer(int var1);

   CTPieSer addNewSer();

   void removeSer(int var1);

   CTDLbls getDLbls();

   boolean isSetDLbls();

   void setDLbls(CTDLbls var1);

   CTDLbls addNewDLbls();

   void unsetDLbls();

   CTFirstSliceAng getFirstSliceAng();

   boolean isSetFirstSliceAng();

   void setFirstSliceAng(CTFirstSliceAng var1);

   CTFirstSliceAng addNewFirstSliceAng();

   void unsetFirstSliceAng();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTPieChart newInstance() {
         return (CTPieChart)POIXMLTypeLoader.newInstance(CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart newInstance(XmlOptions var0) {
         return (CTPieChart)POIXMLTypeLoader.newInstance(CTPieChart.type, var0);
      }

      public static CTPieChart parse(String var0) throws XmlException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(File var0) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(URL var0) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(InputStream var0) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(Reader var0) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(XMLStreamReader var0) throws XmlException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(Node var0) throws XmlException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static CTPieChart parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static CTPieChart parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPieChart)POIXMLTypeLoader.parse(var0, CTPieChart.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPieChart.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPieChart.type, var1);
      }

   }
}
