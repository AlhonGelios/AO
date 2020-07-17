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
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCsPageSetup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomChartsheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems;
import org.w3c.dom.Node;

public interface CTChartsheet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTChartsheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctchartsheetf68atype");


   CTChartsheetPr getSheetPr();

   boolean isSetSheetPr();

   void setSheetPr(CTChartsheetPr var1);

   CTChartsheetPr addNewSheetPr();

   void unsetSheetPr();

   CTChartsheetViews getSheetViews();

   void setSheetViews(CTChartsheetViews var1);

   CTChartsheetViews addNewSheetViews();

   CTChartsheetProtection getSheetProtection();

   boolean isSetSheetProtection();

   void setSheetProtection(CTChartsheetProtection var1);

   CTChartsheetProtection addNewSheetProtection();

   void unsetSheetProtection();

   CTCustomChartsheetViews getCustomSheetViews();

   boolean isSetCustomSheetViews();

   void setCustomSheetViews(CTCustomChartsheetViews var1);

   CTCustomChartsheetViews addNewCustomSheetViews();

   void unsetCustomSheetViews();

   CTPageMargins getPageMargins();

   boolean isSetPageMargins();

   void setPageMargins(CTPageMargins var1);

   CTPageMargins addNewPageMargins();

   void unsetPageMargins();

   CTCsPageSetup getPageSetup();

   boolean isSetPageSetup();

   void setPageSetup(CTCsPageSetup var1);

   CTCsPageSetup addNewPageSetup();

   void unsetPageSetup();

   CTHeaderFooter getHeaderFooter();

   boolean isSetHeaderFooter();

   void setHeaderFooter(CTHeaderFooter var1);

   CTHeaderFooter addNewHeaderFooter();

   void unsetHeaderFooter();

   CTDrawing getDrawing();

   void setDrawing(CTDrawing var1);

   CTDrawing addNewDrawing();

   CTLegacyDrawing getLegacyDrawing();

   boolean isSetLegacyDrawing();

   void setLegacyDrawing(CTLegacyDrawing var1);

   CTLegacyDrawing addNewLegacyDrawing();

   void unsetLegacyDrawing();

   CTLegacyDrawing getLegacyDrawingHF();

   boolean isSetLegacyDrawingHF();

   void setLegacyDrawingHF(CTLegacyDrawing var1);

   CTLegacyDrawing addNewLegacyDrawingHF();

   void unsetLegacyDrawingHF();

   CTSheetBackgroundPicture getPicture();

   boolean isSetPicture();

   void setPicture(CTSheetBackgroundPicture var1);

   CTSheetBackgroundPicture addNewPicture();

   void unsetPicture();

   CTWebPublishItems getWebPublishItems();

   boolean isSetWebPublishItems();

   void setWebPublishItems(CTWebPublishItems var1);

   CTWebPublishItems addNewWebPublishItems();

   void unsetWebPublishItems();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTChartsheet newInstance() {
         return (CTChartsheet)POIXMLTypeLoader.newInstance(CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet newInstance(XmlOptions var0) {
         return (CTChartsheet)POIXMLTypeLoader.newInstance(CTChartsheet.type, var0);
      }

      public static CTChartsheet parse(String var0) throws XmlException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(File var0) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(URL var0) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(InputStream var0) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(Reader var0) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(XMLStreamReader var0) throws XmlException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(Node var0) throws XmlException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static CTChartsheet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static CTChartsheet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTChartsheet)POIXMLTypeLoader.parse(var0, CTChartsheet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTChartsheet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTChartsheet.type, var1);
      }

   }
}
