package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCalcMode;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRefMode$Enum;
import org.w3c.dom.Node;

public interface CTCalcPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCalcPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcalcprd480type");


   long getCalcId();

   XmlUnsignedInt xgetCalcId();

   boolean isSetCalcId();

   void setCalcId(long var1);

   void xsetCalcId(XmlUnsignedInt var1);

   void unsetCalcId();

   STCalcMode.Enum getCalcMode();

   STCalcMode xgetCalcMode();

   boolean isSetCalcMode();

   void setCalcMode(STCalcMode.Enum var1);

   void xsetCalcMode(STCalcMode var1);

   void unsetCalcMode();

   boolean getFullCalcOnLoad();

   XmlBoolean xgetFullCalcOnLoad();

   boolean isSetFullCalcOnLoad();

   void setFullCalcOnLoad(boolean var1);

   void xsetFullCalcOnLoad(XmlBoolean var1);

   void unsetFullCalcOnLoad();

   STRefMode$Enum getRefMode();

   STRefMode xgetRefMode();

   boolean isSetRefMode();

   void setRefMode(STRefMode$Enum var1);

   void xsetRefMode(STRefMode var1);

   void unsetRefMode();

   boolean getIterate();

   XmlBoolean xgetIterate();

   boolean isSetIterate();

   void setIterate(boolean var1);

   void xsetIterate(XmlBoolean var1);

   void unsetIterate();

   long getIterateCount();

   XmlUnsignedInt xgetIterateCount();

   boolean isSetIterateCount();

   void setIterateCount(long var1);

   void xsetIterateCount(XmlUnsignedInt var1);

   void unsetIterateCount();

   double getIterateDelta();

   XmlDouble xgetIterateDelta();

   boolean isSetIterateDelta();

   void setIterateDelta(double var1);

   void xsetIterateDelta(XmlDouble var1);

   void unsetIterateDelta();

   boolean getFullPrecision();

   XmlBoolean xgetFullPrecision();

   boolean isSetFullPrecision();

   void setFullPrecision(boolean var1);

   void xsetFullPrecision(XmlBoolean var1);

   void unsetFullPrecision();

   boolean getCalcCompleted();

   XmlBoolean xgetCalcCompleted();

   boolean isSetCalcCompleted();

   void setCalcCompleted(boolean var1);

   void xsetCalcCompleted(XmlBoolean var1);

   void unsetCalcCompleted();

   boolean getCalcOnSave();

   XmlBoolean xgetCalcOnSave();

   boolean isSetCalcOnSave();

   void setCalcOnSave(boolean var1);

   void xsetCalcOnSave(XmlBoolean var1);

   void unsetCalcOnSave();

   boolean getConcurrentCalc();

   XmlBoolean xgetConcurrentCalc();

   boolean isSetConcurrentCalc();

   void setConcurrentCalc(boolean var1);

   void xsetConcurrentCalc(XmlBoolean var1);

   void unsetConcurrentCalc();

   long getConcurrentManualCount();

   XmlUnsignedInt xgetConcurrentManualCount();

   boolean isSetConcurrentManualCount();

   void setConcurrentManualCount(long var1);

   void xsetConcurrentManualCount(XmlUnsignedInt var1);

   void unsetConcurrentManualCount();

   boolean getForceFullCalc();

   XmlBoolean xgetForceFullCalc();

   boolean isSetForceFullCalc();

   void setForceFullCalc(boolean var1);

   void xsetForceFullCalc(XmlBoolean var1);

   void unsetForceFullCalc();


   public static final class Factory {

      public static CTCalcPr newInstance() {
         return (CTCalcPr)POIXMLTypeLoader.newInstance(CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr newInstance(XmlOptions var0) {
         return (CTCalcPr)POIXMLTypeLoader.newInstance(CTCalcPr.type, var0);
      }

      public static CTCalcPr parse(String var0) throws XmlException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(File var0) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(URL var0) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(InputStream var0) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(Reader var0) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(XMLStreamReader var0) throws XmlException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(Node var0) throws XmlException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static CTCalcPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static CTCalcPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCalcPr)POIXMLTypeLoader.parse(var0, CTCalcPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCalcPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCalcPr.type, var1);
      }

   }
}
