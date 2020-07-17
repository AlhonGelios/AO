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
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendEntry;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegendPos;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.w3c.dom.Node;

public interface CTLegend extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLegend.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlegenda54ftype");


   CTLegendPos getLegendPos();

   boolean isSetLegendPos();

   void setLegendPos(CTLegendPos var1);

   CTLegendPos addNewLegendPos();

   void unsetLegendPos();

   List getLegendEntryList();

   CTLegendEntry[] getLegendEntryArray();

   CTLegendEntry getLegendEntryArray(int var1);

   int sizeOfLegendEntryArray();

   void setLegendEntryArray(CTLegendEntry[] var1);

   void setLegendEntryArray(int var1, CTLegendEntry var2);

   CTLegendEntry insertNewLegendEntry(int var1);

   CTLegendEntry addNewLegendEntry();

   void removeLegendEntry(int var1);

   CTLayout getLayout();

   boolean isSetLayout();

   void setLayout(CTLayout var1);

   CTLayout addNewLayout();

   void unsetLayout();

   CTBoolean getOverlay();

   boolean isSetOverlay();

   void setOverlay(CTBoolean var1);

   CTBoolean addNewOverlay();

   void unsetOverlay();

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

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTLegend newInstance() {
         return (CTLegend)POIXMLTypeLoader.newInstance(CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend newInstance(XmlOptions var0) {
         return (CTLegend)POIXMLTypeLoader.newInstance(CTLegend.type, var0);
      }

      public static CTLegend parse(String var0) throws XmlException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(File var0) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(URL var0) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(InputStream var0) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(Reader var0) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(XMLStreamReader var0) throws XmlException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(Node var0) throws XmlException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static CTLegend parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, (XmlOptions)null);
      }

      public static CTLegend parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLegend)POIXMLTypeLoader.parse(var0, CTLegend.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLegend.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLegend.type, var1);
      }

   }
}
