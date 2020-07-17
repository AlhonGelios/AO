package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellWatches;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCols;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTControls;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomProperties;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataConsolidate;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredErrors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLegacyDrawing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMergeCells;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleObjects;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageBreak;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTProtectedRanges;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTScenarios;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetBackgroundPicture;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetData;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetDimension;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetFormatPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSmartTags;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableParts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWebPublishItems;
import org.w3c.dom.Node;

public interface CTWorksheet extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTWorksheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctworksheet530dtype");


   CTSheetPr getSheetPr();

   boolean isSetSheetPr();

   void setSheetPr(CTSheetPr var1);

   CTSheetPr addNewSheetPr();

   void unsetSheetPr();

   CTSheetDimension getDimension();

   boolean isSetDimension();

   void setDimension(CTSheetDimension var1);

   CTSheetDimension addNewDimension();

   void unsetDimension();

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

   List getColsList();

   CTCols[] getColsArray();

   CTCols getColsArray(int var1);

   int sizeOfColsArray();

   void setColsArray(CTCols[] var1);

   void setColsArray(int var1, CTCols var2);

   CTCols insertNewCols(int var1);

   CTCols addNewCols();

   void removeCols(int var1);

   CTSheetData getSheetData();

   void setSheetData(CTSheetData var1);

   CTSheetData addNewSheetData();

   CTSheetCalcPr getSheetCalcPr();

   boolean isSetSheetCalcPr();

   void setSheetCalcPr(CTSheetCalcPr var1);

   CTSheetCalcPr addNewSheetCalcPr();

   void unsetSheetCalcPr();

   CTSheetProtection getSheetProtection();

   boolean isSetSheetProtection();

   void setSheetProtection(CTSheetProtection var1);

   CTSheetProtection addNewSheetProtection();

   void unsetSheetProtection();

   CTProtectedRanges getProtectedRanges();

   boolean isSetProtectedRanges();

   void setProtectedRanges(CTProtectedRanges var1);

   CTProtectedRanges addNewProtectedRanges();

   void unsetProtectedRanges();

   CTScenarios getScenarios();

   boolean isSetScenarios();

   void setScenarios(CTScenarios var1);

   CTScenarios addNewScenarios();

   void unsetScenarios();

   CTAutoFilter getAutoFilter();

   boolean isSetAutoFilter();

   void setAutoFilter(CTAutoFilter var1);

   CTAutoFilter addNewAutoFilter();

   void unsetAutoFilter();

   CTSortState getSortState();

   boolean isSetSortState();

   void setSortState(CTSortState var1);

   CTSortState addNewSortState();

   void unsetSortState();

   CTDataConsolidate getDataConsolidate();

   boolean isSetDataConsolidate();

   void setDataConsolidate(CTDataConsolidate var1);

   CTDataConsolidate addNewDataConsolidate();

   void unsetDataConsolidate();

   CTCustomSheetViews getCustomSheetViews();

   boolean isSetCustomSheetViews();

   void setCustomSheetViews(CTCustomSheetViews var1);

   CTCustomSheetViews addNewCustomSheetViews();

   void unsetCustomSheetViews();

   CTMergeCells getMergeCells();

   boolean isSetMergeCells();

   void setMergeCells(CTMergeCells var1);

   CTMergeCells addNewMergeCells();

   void unsetMergeCells();

   CTPhoneticPr getPhoneticPr();

   boolean isSetPhoneticPr();

   void setPhoneticPr(CTPhoneticPr var1);

   CTPhoneticPr addNewPhoneticPr();

   void unsetPhoneticPr();

   List getConditionalFormattingList();

   CTConditionalFormatting[] getConditionalFormattingArray();

   CTConditionalFormatting getConditionalFormattingArray(int var1);

   int sizeOfConditionalFormattingArray();

   void setConditionalFormattingArray(CTConditionalFormatting[] var1);

   void setConditionalFormattingArray(int var1, CTConditionalFormatting var2);

   CTConditionalFormatting insertNewConditionalFormatting(int var1);

   CTConditionalFormatting addNewConditionalFormatting();

   void removeConditionalFormatting(int var1);

   CTDataValidations getDataValidations();

   boolean isSetDataValidations();

   void setDataValidations(CTDataValidations var1);

   CTDataValidations addNewDataValidations();

   void unsetDataValidations();

   CTHyperlinks getHyperlinks();

   boolean isSetHyperlinks();

   void setHyperlinks(CTHyperlinks var1);

   CTHyperlinks addNewHyperlinks();

   void unsetHyperlinks();

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

   CTPageBreak getRowBreaks();

   boolean isSetRowBreaks();

   void setRowBreaks(CTPageBreak var1);

   CTPageBreak addNewRowBreaks();

   void unsetRowBreaks();

   CTPageBreak getColBreaks();

   boolean isSetColBreaks();

   void setColBreaks(CTPageBreak var1);

   CTPageBreak addNewColBreaks();

   void unsetColBreaks();

   CTCustomProperties getCustomProperties();

   boolean isSetCustomProperties();

   void setCustomProperties(CTCustomProperties var1);

   CTCustomProperties addNewCustomProperties();

   void unsetCustomProperties();

   CTCellWatches getCellWatches();

   boolean isSetCellWatches();

   void setCellWatches(CTCellWatches var1);

   CTCellWatches addNewCellWatches();

   void unsetCellWatches();

   CTIgnoredErrors getIgnoredErrors();

   boolean isSetIgnoredErrors();

   void setIgnoredErrors(CTIgnoredErrors var1);

   CTIgnoredErrors addNewIgnoredErrors();

   void unsetIgnoredErrors();

   CTSmartTags getSmartTags();

   boolean isSetSmartTags();

   void setSmartTags(CTSmartTags var1);

   CTSmartTags addNewSmartTags();

   void unsetSmartTags();

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

   CTSheetBackgroundPicture getPicture();

   boolean isSetPicture();

   void setPicture(CTSheetBackgroundPicture var1);

   CTSheetBackgroundPicture addNewPicture();

   void unsetPicture();

   CTOleObjects getOleObjects();

   boolean isSetOleObjects();

   void setOleObjects(CTOleObjects var1);

   CTOleObjects addNewOleObjects();

   void unsetOleObjects();

   CTControls getControls();

   boolean isSetControls();

   void setControls(CTControls var1);

   CTControls addNewControls();

   void unsetControls();

   CTWebPublishItems getWebPublishItems();

   boolean isSetWebPublishItems();

   void setWebPublishItems(CTWebPublishItems var1);

   CTWebPublishItems addNewWebPublishItems();

   void unsetWebPublishItems();

   CTTableParts getTableParts();

   boolean isSetTableParts();

   void setTableParts(CTTableParts var1);

   CTTableParts addNewTableParts();

   void unsetTableParts();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTWorksheet newInstance() {
         return (CTWorksheet)POIXMLTypeLoader.newInstance(CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet newInstance(XmlOptions var0) {
         return (CTWorksheet)POIXMLTypeLoader.newInstance(CTWorksheet.type, var0);
      }

      public static CTWorksheet parse(String var0) throws XmlException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(String var0, XmlOptions var1) throws XmlException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(File var0) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(URL var0) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(InputStream var0) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(Reader var0) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(XMLStreamReader var0) throws XmlException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(Node var0) throws XmlException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static CTWorksheet parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static CTWorksheet parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTWorksheet)POIXMLTypeLoader.parse(var0, CTWorksheet.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorksheet.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTWorksheet.type, var1);
      }

   }
}
