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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTErrBars;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTrendline;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.w3c.dom.Node;

public interface CTLineSer extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLineSer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlineserd01atype");


   CTUnsignedInt getIdx();

   void setIdx(CTUnsignedInt var1);

   CTUnsignedInt addNewIdx();

   CTUnsignedInt getOrder();

   void setOrder(CTUnsignedInt var1);

   CTUnsignedInt addNewOrder();

   CTSerTx getTx();

   boolean isSetTx();

   void setTx(CTSerTx var1);

   CTSerTx addNewTx();

   void unsetTx();

   CTShapeProperties getSpPr();

   boolean isSetSpPr();

   void setSpPr(CTShapeProperties var1);

   CTShapeProperties addNewSpPr();

   void unsetSpPr();

   CTMarker getMarker();

   boolean isSetMarker();

   void setMarker(CTMarker var1);

   CTMarker addNewMarker();

   void unsetMarker();

   List getDPtList();

   CTDPt[] getDPtArray();

   CTDPt getDPtArray(int var1);

   int sizeOfDPtArray();

   void setDPtArray(CTDPt[] var1);

   void setDPtArray(int var1, CTDPt var2);

   CTDPt insertNewDPt(int var1);

   CTDPt addNewDPt();

   void removeDPt(int var1);

   CTDLbls getDLbls();

   boolean isSetDLbls();

   void setDLbls(CTDLbls var1);

   CTDLbls addNewDLbls();

   void unsetDLbls();

   List getTrendlineList();

   CTTrendline[] getTrendlineArray();

   CTTrendline getTrendlineArray(int var1);

   int sizeOfTrendlineArray();

   void setTrendlineArray(CTTrendline[] var1);

   void setTrendlineArray(int var1, CTTrendline var2);

   CTTrendline insertNewTrendline(int var1);

   CTTrendline addNewTrendline();

   void removeTrendline(int var1);

   CTErrBars getErrBars();

   boolean isSetErrBars();

   void setErrBars(CTErrBars var1);

   CTErrBars addNewErrBars();

   void unsetErrBars();

   CTAxDataSource getCat();

   boolean isSetCat();

   void setCat(CTAxDataSource var1);

   CTAxDataSource addNewCat();

   void unsetCat();

   CTNumDataSource getVal();

   boolean isSetVal();

   void setVal(CTNumDataSource var1);

   CTNumDataSource addNewVal();

   void unsetVal();

   CTBoolean getSmooth();

   boolean isSetSmooth();

   void setSmooth(CTBoolean var1);

   CTBoolean addNewSmooth();

   void unsetSmooth();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTLineSer newInstance() {
         return (CTLineSer)POIXMLTypeLoader.newInstance(CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer newInstance(XmlOptions var0) {
         return (CTLineSer)POIXMLTypeLoader.newInstance(CTLineSer.type, var0);
      }

      public static CTLineSer parse(String var0) throws XmlException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(File var0) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(URL var0) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(InputStream var0) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(Reader var0) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(XMLStreamReader var0) throws XmlException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(Node var0) throws XmlException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static CTLineSer parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static CTLineSer parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLineSer)POIXMLTypeLoader.parse(var0, CTLineSer.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineSer.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLineSer.type, var1);
      }

   }
}
