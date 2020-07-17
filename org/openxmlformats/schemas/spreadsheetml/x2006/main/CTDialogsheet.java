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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews;
import org.w3c.dom.Node;

public interface CTDialogsheet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDialogsheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdialogsheet6f36type");


   CTSheetPr getSheetPr();

   boolean isSetSheetPr();

   void setSheetPr(CTSheetPr var1);

   CTSheetPr addNewSheetPr();

   void unsetSheetPr();

   CTSheetViews getSheetViews();

   boolean isSetSheetViews();

   void setSheetViews(CTSheetViews var1);

   CTSheetViews addNewSheetViews();

   void unsetSheetViews();

   CTSheetFormatPr getSheetFormatPr();

   boolean isSetSheetFormatPr();

   void setSheetFormatPr(CTSheetFormatPr var1);

   CTSheetFormatPr addNewSheetFormatPr();

   void unsetSheetFormatPr();

   CTSheetProtection getSheetProtection();

   boolean isSetSheetProtection();

   void setSheetProtection(CTSheetProtection var1);

   CTSheetProtection addNewSheetProtection();

   void unsetSheetProtection();

   CTCustomSheetViews getCustomSheetViews();

   boolean isSetCustomSheetViews();

   void setCustomSheetViews(CTCustomSheetViews var1);

   CTCustomSheetViews addNewCustomSheetViews();

   void unsetCustomSheetViews();

   CTPrintOptions getPrintOptions();

   boolean isSetPrintOptions();

   void setPrintOptions(CTPrintOptions var1);

   CTPrintOptions addNewPrintOptions();

   void unsetPrintOptions();

   CTPageMargins getPageMargins();

   boolean isSetPageMargins();

   void setPageMargins(CTPageMargins var1);

   CTPageMargins addNewPageMargins();

   void unsetPageMargins();

   CTPageSetup getPageSetup();

   boolean isSetPageSetup();

   void setPageSetup(CTPageSetup var1);

   CTPageSetup addNewPageSetup();

   void unsetPageSetup();

   CTHeaderFooter getHeaderFooter();

   boolean isSetHeaderFooter();

   void setHeaderFooter(CTHeaderFooter var1);

   CTHeaderFooter addNewHeaderFooter();

   void unsetHeaderFooter();

   CTDrawing getDrawing();

   boolean isSetDrawing();

   void setDrawing(CTDrawing var1);

   CTDrawing addNewDrawing();

   void unsetDrawing();

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

   CTOleObjects getOleObjects();

   boolean isSetOleObjects();

   void setOleObjects(CTOleObjects var1);

   CTOleObjects addNewOleObjects();

   void unsetOleObjects();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTDialogsheet newInstance() {
         return (CTDialogsheet)POIXMLTypeLoader.newInstance(CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet newInstance(XmlOptions var0) {
         return (CTDialogsheet)POIXMLTypeLoader.newInstance(CTDialogsheet.type, var0);
      }

      public static CTDialogsheet parse(String var0) throws XmlException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(File var0) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(URL var0) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(InputStream var0) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(Reader var0) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(XMLStreamReader var0) throws XmlException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(Node var0) throws XmlException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static CTDialogsheet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static CTDialogsheet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDialogsheet)POIXMLTypeLoader.parse(var0, CTDialogsheet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDialogsheet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDialogsheet.type, var1);
      }

   }
}
