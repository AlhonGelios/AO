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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxisUnit;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTChartLines;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrossBetween;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTCrosses;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDispUnits;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumFmt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickLblPos;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTickMark;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTitle;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.w3c.dom.Node;

public interface CTValAx extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTValAx.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctvalaxd06etype");


   CTUnsignedInt getAxId();

   void setAxId(CTUnsignedInt var1);

   CTUnsignedInt addNewAxId();

   CTScaling getScaling();

   void setScaling(CTScaling var1);

   CTScaling addNewScaling();

   CTBoolean getDelete();

   boolean isSetDelete();

   void setDelete(CTBoolean var1);

   CTBoolean addNewDelete();

   void unsetDelete();

   CTAxPos getAxPos();

   void setAxPos(CTAxPos var1);

   CTAxPos addNewAxPos();

   CTChartLines getMajorGridlines();

   boolean isSetMajorGridlines();

   void setMajorGridlines(CTChartLines var1);

   CTChartLines addNewMajorGridlines();

   void unsetMajorGridlines();

   CTChartLines getMinorGridlines();

   boolean isSetMinorGridlines();

   void setMinorGridlines(CTChartLines var1);

   CTChartLines addNewMinorGridlines();

   void unsetMinorGridlines();

   CTTitle getTitle();

   boolean isSetTitle();

   void setTitle(CTTitle var1);

   CTTitle addNewTitle();

   void unsetTitle();

   CTNumFmt getNumFmt();

   boolean isSetNumFmt();

   void setNumFmt(CTNumFmt var1);

   CTNumFmt addNewNumFmt();

   void unsetNumFmt();

   CTTickMark getMajorTickMark();

   boolean isSetMajorTickMark();

   void setMajorTickMark(CTTickMark var1);

   CTTickMark addNewMajorTickMark();

   void unsetMajorTickMark();

   CTTickMark getMinorTickMark();

   boolean isSetMinorTickMark();

   void setMinorTickMark(CTTickMark var1);

   CTTickMark addNewMinorTickMark();

   void unsetMinorTickMark();

   CTTickLblPos getTickLblPos();

   boolean isSetTickLblPos();

   void setTickLblPos(CTTickLblPos var1);

   CTTickLblPos addNewTickLblPos();

   void unsetTickLblPos();

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

   CTUnsignedInt getCrossAx();

   void setCrossAx(CTUnsignedInt var1);

   CTUnsignedInt addNewCrossAx();

   CTCrosses getCrosses();

   boolean isSetCrosses();

   void setCrosses(CTCrosses var1);

   CTCrosses addNewCrosses();

   void unsetCrosses();

   CTDouble getCrossesAt();

   boolean isSetCrossesAt();

   void setCrossesAt(CTDouble var1);

   CTDouble addNewCrossesAt();

   void unsetCrossesAt();

   CTCrossBetween getCrossBetween();

   boolean isSetCrossBetween();

   void setCrossBetween(CTCrossBetween var1);

   CTCrossBetween addNewCrossBetween();

   void unsetCrossBetween();

   CTAxisUnit getMajorUnit();

   boolean isSetMajorUnit();

   void setMajorUnit(CTAxisUnit var1);

   CTAxisUnit addNewMajorUnit();

   void unsetMajorUnit();

   CTAxisUnit getMinorUnit();

   boolean isSetMinorUnit();

   void setMinorUnit(CTAxisUnit var1);

   CTAxisUnit addNewMinorUnit();

   void unsetMinorUnit();

   CTDispUnits getDispUnits();

   boolean isSetDispUnits();

   void setDispUnits(CTDispUnits var1);

   CTDispUnits addNewDispUnits();

   void unsetDispUnits();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTValAx newInstance() {
         return (CTValAx)POIXMLTypeLoader.newInstance(CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx newInstance(XmlOptions var0) {
         return (CTValAx)POIXMLTypeLoader.newInstance(CTValAx.type, var0);
      }

      public static CTValAx parse(String var0) throws XmlException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(String var0, XmlOptions var1) throws XmlException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(File var0) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(URL var0) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(InputStream var0) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(Reader var0) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(XMLStreamReader var0) throws XmlException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(Node var0) throws XmlException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static CTValAx parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, (XmlOptions)null);
      }

      public static CTValAx parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTValAx)POIXMLTypeLoader.parse(var0, CTValAx.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTValAx.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTValAx.type, var1);
      }

   }
}
