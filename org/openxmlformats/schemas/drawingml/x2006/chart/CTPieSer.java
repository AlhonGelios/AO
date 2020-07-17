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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDPt;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTUnsignedInt;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.w3c.dom.Node;

public interface CTPieSer extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPieSer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpieser5248type");


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

   CTUnsignedInt getExplosion();

   boolean isSetExplosion();

   void setExplosion(CTUnsignedInt var1);

   CTUnsignedInt addNewExplosion();

   void unsetExplosion();

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

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTPieSer newInstance() {
         return (CTPieSer)POIXMLTypeLoader.newInstance(CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer newInstance(XmlOptions var0) {
         return (CTPieSer)POIXMLTypeLoader.newInstance(CTPieSer.type, var0);
      }

      public static CTPieSer parse(String var0) throws XmlException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(File var0) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(URL var0) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(InputStream var0) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(Reader var0) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(XMLStreamReader var0) throws XmlException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(Node var0) throws XmlException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static CTPieSer parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static CTPieSer parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPieSer)POIXMLTypeLoader.parse(var0, CTPieSer.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPieSer.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPieSer.type, var1);
      }

   }
}
