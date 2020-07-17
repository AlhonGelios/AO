package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTWorksheetImpl.1ColsList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTWorksheetImpl.1ConditionalFormattingList;

public class CTWorksheetImpl extends XmlComplexContentImpl implements CTWorksheet {

   private static final QName SHEETPR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr");
   private static final QName DIMENSION$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dimension");
   private static final QName SHEETVIEWS$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews");
   private static final QName SHEETFORMATPR$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetFormatPr");
   private static final QName COLS$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cols");
   private static final QName SHEETDATA$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetData");
   private static final QName SHEETCALCPR$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetCalcPr");
   private static final QName SHEETPROTECTION$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
   private static final QName PROTECTEDRANGES$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "protectedRanges");
   private static final QName SCENARIOS$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "scenarios");
   private static final QName AUTOFILTER$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
   private static final QName SORTSTATE$22 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
   private static final QName DATACONSOLIDATE$24 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataConsolidate");
   private static final QName CUSTOMSHEETVIEWS$26 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
   private static final QName MERGECELLS$28 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mergeCells");
   private static final QName PHONETICPR$30 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr");
   private static final QName CONDITIONALFORMATTING$32 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormatting");
   private static final QName DATAVALIDATIONS$34 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataValidations");
   private static final QName HYPERLINKS$36 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "hyperlinks");
   private static final QName PRINTOPTIONS$38 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions");
   private static final QName PAGEMARGINS$40 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
   private static final QName PAGESETUP$42 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
   private static final QName HEADERFOOTER$44 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
   private static final QName ROWBREAKS$46 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowBreaks");
   private static final QName COLBREAKS$48 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colBreaks");
   private static final QName CUSTOMPROPERTIES$50 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customProperties");
   private static final QName CELLWATCHES$52 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cellWatches");
   private static final QName IGNOREDERRORS$54 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ignoredErrors");
   private static final QName SMARTTAGS$56 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "smartTags");
   private static final QName DRAWING$58 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
   private static final QName LEGACYDRAWING$60 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
   private static final QName LEGACYDRAWINGHF$62 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
   private static final QName PICTURE$64 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "picture");
   private static final QName OLEOBJECTS$66 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObjects");
   private static final QName CONTROLS$68 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "controls");
   private static final QName WEBPUBLISHITEMS$70 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishItems");
   private static final QName TABLEPARTS$72 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableParts");
   private static final QName EXTLST$74 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTWorksheetImpl(SchemaType var1) {
      super(var1);
   }

   public CTSheetPr getSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetPr var2 = null;
         var2 = (CTSheetPr)this.get_store().find_element_user(SHEETPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETPR$0) != 0;
      }
   }

   public void setSheetPr(CTSheetPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetPr var3 = null;
         var3 = (CTSheetPr)this.get_store().find_element_user(SHEETPR$0, 0);
         if(var3 == null) {
            var3 = (CTSheetPr)this.get_store().add_element_user(SHEETPR$0);
         }

         var3.set(var1);
      }
   }

   public CTSheetPr addNewSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetPr var2 = null;
         var2 = (CTSheetPr)this.get_store().add_element_user(SHEETPR$0);
         return var2;
      }
   }

   public void unsetSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETPR$0, 0);
      }
   }

   public CTSheetDimension getDimension() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetDimension var2 = null;
         var2 = (CTSheetDimension)this.get_store().find_element_user(DIMENSION$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDimension() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIMENSION$2) != 0;
      }
   }

   public void setDimension(CTSheetDimension var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetDimension var3 = null;
         var3 = (CTSheetDimension)this.get_store().find_element_user(DIMENSION$2, 0);
         if(var3 == null) {
            var3 = (CTSheetDimension)this.get_store().add_element_user(DIMENSION$2);
         }

         var3.set(var1);
      }
   }

   public CTSheetDimension addNewDimension() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetDimension var2 = null;
         var2 = (CTSheetDimension)this.get_store().add_element_user(DIMENSION$2);
         return var2;
      }
   }

   public void unsetDimension() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIMENSION$2, 0);
      }
   }

   public CTSheetViews getSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetViews var2 = null;
         var2 = (CTSheetViews)this.get_store().find_element_user(SHEETVIEWS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETVIEWS$4) != 0;
      }
   }

   public void setSheetViews(CTSheetViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetViews var3 = null;
         var3 = (CTSheetViews)this.get_store().find_element_user(SHEETVIEWS$4, 0);
         if(var3 == null) {
            var3 = (CTSheetViews)this.get_store().add_element_user(SHEETVIEWS$4);
         }

         var3.set(var1);
      }
   }

   public CTSheetViews addNewSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetViews var2 = null;
         var2 = (CTSheetViews)this.get_store().add_element_user(SHEETVIEWS$4);
         return var2;
      }
   }

   public void unsetSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETVIEWS$4, 0);
      }
   }

   public CTSheetFormatPr getSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetFormatPr var2 = null;
         var2 = (CTSheetFormatPr)this.get_store().find_element_user(SHEETFORMATPR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETFORMATPR$6) != 0;
      }
   }

   public void setSheetFormatPr(CTSheetFormatPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetFormatPr var3 = null;
         var3 = (CTSheetFormatPr)this.get_store().find_element_user(SHEETFORMATPR$6, 0);
         if(var3 == null) {
            var3 = (CTSheetFormatPr)this.get_store().add_element_user(SHEETFORMATPR$6);
         }

         var3.set(var1);
      }
   }

   public CTSheetFormatPr addNewSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetFormatPr var2 = null;
         var2 = (CTSheetFormatPr)this.get_store().add_element_user(SHEETFORMATPR$6);
         return var2;
      }
   }

   public void unsetSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETFORMATPR$6, 0);
      }
   }

   public List getColsList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ColsList(this);
      }
   }

   public CTCols[] getColsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COLS$8, var2);
         CTCols[] var3 = new CTCols[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCols getColsArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCols var3 = null;
         var3 = (CTCols)this.get_store().find_element_user(COLS$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfColsArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLS$8);
      }
   }

   public void setColsArray(CTCols[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COLS$8);
      }
   }

   public void setColsArray(int var1, CTCols var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCols var4 = null;
         var4 = (CTCols)this.get_store().find_element_user(COLS$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCols insertNewCols(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCols var3 = null;
         var3 = (CTCols)this.get_store().insert_element_user(COLS$8, var1);
         return var3;
      }
   }

   public CTCols addNewCols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCols var2 = null;
         var2 = (CTCols)this.get_store().add_element_user(COLS$8);
         return var2;
      }
   }

   public void removeCols(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLS$8, var1);
      }
   }

   public CTSheetData getSheetData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetData var2 = null;
         var2 = (CTSheetData)this.get_store().find_element_user(SHEETDATA$10, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSheetData(CTSheetData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetData var3 = null;
         var3 = (CTSheetData)this.get_store().find_element_user(SHEETDATA$10, 0);
         if(var3 == null) {
            var3 = (CTSheetData)this.get_store().add_element_user(SHEETDATA$10);
         }

         var3.set(var1);
      }
   }

   public CTSheetData addNewSheetData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetData var2 = null;
         var2 = (CTSheetData)this.get_store().add_element_user(SHEETDATA$10);
         return var2;
      }
   }

   public CTSheetCalcPr getSheetCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetCalcPr var2 = null;
         var2 = (CTSheetCalcPr)this.get_store().find_element_user(SHEETCALCPR$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETCALCPR$12) != 0;
      }
   }

   public void setSheetCalcPr(CTSheetCalcPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetCalcPr var3 = null;
         var3 = (CTSheetCalcPr)this.get_store().find_element_user(SHEETCALCPR$12, 0);
         if(var3 == null) {
            var3 = (CTSheetCalcPr)this.get_store().add_element_user(SHEETCALCPR$12);
         }

         var3.set(var1);
      }
   }

   public CTSheetCalcPr addNewSheetCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetCalcPr var2 = null;
         var2 = (CTSheetCalcPr)this.get_store().add_element_user(SHEETCALCPR$12);
         return var2;
      }
   }

   public void unsetSheetCalcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETCALCPR$12, 0);
      }
   }

   public CTSheetProtection getSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetProtection var2 = null;
         var2 = (CTSheetProtection)this.get_store().find_element_user(SHEETPROTECTION$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETPROTECTION$14) != 0;
      }
   }

   public void setSheetProtection(CTSheetProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetProtection var3 = null;
         var3 = (CTSheetProtection)this.get_store().find_element_user(SHEETPROTECTION$14, 0);
         if(var3 == null) {
            var3 = (CTSheetProtection)this.get_store().add_element_user(SHEETPROTECTION$14);
         }

         var3.set(var1);
      }
   }

   public CTSheetProtection addNewSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetProtection var2 = null;
         var2 = (CTSheetProtection)this.get_store().add_element_user(SHEETPROTECTION$14);
         return var2;
      }
   }

   public void unsetSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETPROTECTION$14, 0);
      }
   }

   public CTProtectedRanges getProtectedRanges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProtectedRanges var2 = null;
         var2 = (CTProtectedRanges)this.get_store().find_element_user(PROTECTEDRANGES$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtectedRanges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTEDRANGES$16) != 0;
      }
   }

   public void setProtectedRanges(CTProtectedRanges var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProtectedRanges var3 = null;
         var3 = (CTProtectedRanges)this.get_store().find_element_user(PROTECTEDRANGES$16, 0);
         if(var3 == null) {
            var3 = (CTProtectedRanges)this.get_store().add_element_user(PROTECTEDRANGES$16);
         }

         var3.set(var1);
      }
   }

   public CTProtectedRanges addNewProtectedRanges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProtectedRanges var2 = null;
         var2 = (CTProtectedRanges)this.get_store().add_element_user(PROTECTEDRANGES$16);
         return var2;
      }
   }

   public void unsetProtectedRanges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTEDRANGES$16, 0);
      }
   }

   public CTScenarios getScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScenarios var2 = null;
         var2 = (CTScenarios)this.get_store().find_element_user(SCENARIOS$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCENARIOS$18) != 0;
      }
   }

   public void setScenarios(CTScenarios var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScenarios var3 = null;
         var3 = (CTScenarios)this.get_store().find_element_user(SCENARIOS$18, 0);
         if(var3 == null) {
            var3 = (CTScenarios)this.get_store().add_element_user(SCENARIOS$18);
         }

         var3.set(var1);
      }
   }

   public CTScenarios addNewScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScenarios var2 = null;
         var2 = (CTScenarios)this.get_store().add_element_user(SCENARIOS$18);
         return var2;
      }
   }

   public void unsetScenarios() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCENARIOS$18, 0);
      }
   }

   public CTAutoFilter getAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoFilter var2 = null;
         var2 = (CTAutoFilter)this.get_store().find_element_user(AUTOFILTER$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOFILTER$20) != 0;
      }
   }

   public void setAutoFilter(CTAutoFilter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoFilter var3 = null;
         var3 = (CTAutoFilter)this.get_store().find_element_user(AUTOFILTER$20, 0);
         if(var3 == null) {
            var3 = (CTAutoFilter)this.get_store().add_element_user(AUTOFILTER$20);
         }

         var3.set(var1);
      }
   }

   public CTAutoFilter addNewAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoFilter var2 = null;
         var2 = (CTAutoFilter)this.get_store().add_element_user(AUTOFILTER$20);
         return var2;
      }
   }

   public void unsetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOFILTER$20, 0);
      }
   }

   public CTSortState getSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var2 = null;
         var2 = (CTSortState)this.get_store().find_element_user(SORTSTATE$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SORTSTATE$22) != 0;
      }
   }

   public void setSortState(CTSortState var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var3 = null;
         var3 = (CTSortState)this.get_store().find_element_user(SORTSTATE$22, 0);
         if(var3 == null) {
            var3 = (CTSortState)this.get_store().add_element_user(SORTSTATE$22);
         }

         var3.set(var1);
      }
   }

   public CTSortState addNewSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var2 = null;
         var2 = (CTSortState)this.get_store().add_element_user(SORTSTATE$22);
         return var2;
      }
   }

   public void unsetSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SORTSTATE$22, 0);
      }
   }

   public CTDataConsolidate getDataConsolidate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataConsolidate var2 = null;
         var2 = (CTDataConsolidate)this.get_store().find_element_user(DATACONSOLIDATE$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDataConsolidate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATACONSOLIDATE$24) != 0;
      }
   }

   public void setDataConsolidate(CTDataConsolidate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataConsolidate var3 = null;
         var3 = (CTDataConsolidate)this.get_store().find_element_user(DATACONSOLIDATE$24, 0);
         if(var3 == null) {
            var3 = (CTDataConsolidate)this.get_store().add_element_user(DATACONSOLIDATE$24);
         }

         var3.set(var1);
      }
   }

   public CTDataConsolidate addNewDataConsolidate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataConsolidate var2 = null;
         var2 = (CTDataConsolidate)this.get_store().add_element_user(DATACONSOLIDATE$24);
         return var2;
      }
   }

   public void unsetDataConsolidate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATACONSOLIDATE$24, 0);
      }
   }

   public CTCustomSheetViews getCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomSheetViews var2 = null;
         var2 = (CTCustomSheetViews)this.get_store().find_element_user(CUSTOMSHEETVIEWS$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMSHEETVIEWS$26) != 0;
      }
   }

   public void setCustomSheetViews(CTCustomSheetViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomSheetViews var3 = null;
         var3 = (CTCustomSheetViews)this.get_store().find_element_user(CUSTOMSHEETVIEWS$26, 0);
         if(var3 == null) {
            var3 = (CTCustomSheetViews)this.get_store().add_element_user(CUSTOMSHEETVIEWS$26);
         }

         var3.set(var1);
      }
   }

   public CTCustomSheetViews addNewCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomSheetViews var2 = null;
         var2 = (CTCustomSheetViews)this.get_store().add_element_user(CUSTOMSHEETVIEWS$26);
         return var2;
      }
   }

   public void unsetCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMSHEETVIEWS$26, 0);
      }
   }

   public CTMergeCells getMergeCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMergeCells var2 = null;
         var2 = (CTMergeCells)this.get_store().find_element_user(MERGECELLS$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMergeCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MERGECELLS$28) != 0;
      }
   }

   public void setMergeCells(CTMergeCells var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMergeCells var3 = null;
         var3 = (CTMergeCells)this.get_store().find_element_user(MERGECELLS$28, 0);
         if(var3 == null) {
            var3 = (CTMergeCells)this.get_store().add_element_user(MERGECELLS$28);
         }

         var3.set(var1);
      }
   }

   public CTMergeCells addNewMergeCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMergeCells var2 = null;
         var2 = (CTMergeCells)this.get_store().add_element_user(MERGECELLS$28);
         return var2;
      }
   }

   public void unsetMergeCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MERGECELLS$28, 0);
      }
   }

   public CTPhoneticPr getPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticPr var2 = null;
         var2 = (CTPhoneticPr)this.get_store().find_element_user(PHONETICPR$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PHONETICPR$30) != 0;
      }
   }

   public void setPhoneticPr(CTPhoneticPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticPr var3 = null;
         var3 = (CTPhoneticPr)this.get_store().find_element_user(PHONETICPR$30, 0);
         if(var3 == null) {
            var3 = (CTPhoneticPr)this.get_store().add_element_user(PHONETICPR$30);
         }

         var3.set(var1);
      }
   }

   public CTPhoneticPr addNewPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticPr var2 = null;
         var2 = (CTPhoneticPr)this.get_store().add_element_user(PHONETICPR$30);
         return var2;
      }
   }

   public void unsetPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PHONETICPR$30, 0);
      }
   }

   public List getConditionalFormattingList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ConditionalFormattingList(this);
      }
   }

   public CTConditionalFormatting[] getConditionalFormattingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CONDITIONALFORMATTING$32, var2);
         CTConditionalFormatting[] var3 = new CTConditionalFormatting[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTConditionalFormatting getConditionalFormattingArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormatting var3 = null;
         var3 = (CTConditionalFormatting)this.get_store().find_element_user(CONDITIONALFORMATTING$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfConditionalFormattingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONDITIONALFORMATTING$32);
      }
   }

   public void setConditionalFormattingArray(CTConditionalFormatting[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CONDITIONALFORMATTING$32);
      }
   }

   public void setConditionalFormattingArray(int var1, CTConditionalFormatting var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormatting var4 = null;
         var4 = (CTConditionalFormatting)this.get_store().find_element_user(CONDITIONALFORMATTING$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTConditionalFormatting insertNewConditionalFormatting(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormatting var3 = null;
         var3 = (CTConditionalFormatting)this.get_store().insert_element_user(CONDITIONALFORMATTING$32, var1);
         return var3;
      }
   }

   public CTConditionalFormatting addNewConditionalFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormatting var2 = null;
         var2 = (CTConditionalFormatting)this.get_store().add_element_user(CONDITIONALFORMATTING$32);
         return var2;
      }
   }

   public void removeConditionalFormatting(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONDITIONALFORMATTING$32, var1);
      }
   }

   public CTDataValidations getDataValidations() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidations var2 = null;
         var2 = (CTDataValidations)this.get_store().find_element_user(DATAVALIDATIONS$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDataValidations() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATAVALIDATIONS$34) != 0;
      }
   }

   public void setDataValidations(CTDataValidations var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidations var3 = null;
         var3 = (CTDataValidations)this.get_store().find_element_user(DATAVALIDATIONS$34, 0);
         if(var3 == null) {
            var3 = (CTDataValidations)this.get_store().add_element_user(DATAVALIDATIONS$34);
         }

         var3.set(var1);
      }
   }

   public CTDataValidations addNewDataValidations() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidations var2 = null;
         var2 = (CTDataValidations)this.get_store().add_element_user(DATAVALIDATIONS$34);
         return var2;
      }
   }

   public void unsetDataValidations() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATAVALIDATIONS$34, 0);
      }
   }

   public CTHyperlinks getHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlinks var2 = null;
         var2 = (CTHyperlinks)this.get_store().find_element_user(HYPERLINKS$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HYPERLINKS$36) != 0;
      }
   }

   public void setHyperlinks(CTHyperlinks var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlinks var3 = null;
         var3 = (CTHyperlinks)this.get_store().find_element_user(HYPERLINKS$36, 0);
         if(var3 == null) {
            var3 = (CTHyperlinks)this.get_store().add_element_user(HYPERLINKS$36);
         }

         var3.set(var1);
      }
   }

   public CTHyperlinks addNewHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlinks var2 = null;
         var2 = (CTHyperlinks)this.get_store().add_element_user(HYPERLINKS$36);
         return var2;
      }
   }

   public void unsetHyperlinks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HYPERLINKS$36, 0);
      }
   }

   public CTPrintOptions getPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintOptions var2 = null;
         var2 = (CTPrintOptions)this.get_store().find_element_user(PRINTOPTIONS$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTOPTIONS$38) != 0;
      }
   }

   public void setPrintOptions(CTPrintOptions var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintOptions var3 = null;
         var3 = (CTPrintOptions)this.get_store().find_element_user(PRINTOPTIONS$38, 0);
         if(var3 == null) {
            var3 = (CTPrintOptions)this.get_store().add_element_user(PRINTOPTIONS$38);
         }

         var3.set(var1);
      }
   }

   public CTPrintOptions addNewPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintOptions var2 = null;
         var2 = (CTPrintOptions)this.get_store().add_element_user(PRINTOPTIONS$38);
         return var2;
      }
   }

   public void unsetPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTOPTIONS$38, 0);
      }
   }

   public CTPageMargins getPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGEMARGINS$40) != 0;
      }
   }

   public void setPageMargins(CTPageMargins var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var3 = null;
         var3 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$40, 0);
         if(var3 == null) {
            var3 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$40);
         }

         var3.set(var1);
      }
   }

   public CTPageMargins addNewPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$40);
         return var2;
      }
   }

   public void unsetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGEMARGINS$40, 0);
      }
   }

   public CTPageSetup getPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var2 = null;
         var2 = (CTPageSetup)this.get_store().find_element_user(PAGESETUP$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESETUP$42) != 0;
      }
   }

   public void setPageSetup(CTPageSetup var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var3 = null;
         var3 = (CTPageSetup)this.get_store().find_element_user(PAGESETUP$42, 0);
         if(var3 == null) {
            var3 = (CTPageSetup)this.get_store().add_element_user(PAGESETUP$42);
         }

         var3.set(var1);
      }
   }

   public CTPageSetup addNewPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var2 = null;
         var2 = (CTPageSetup)this.get_store().add_element_user(PAGESETUP$42);
         return var2;
      }
   }

   public void unsetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESETUP$42, 0);
      }
   }

   public CTHeaderFooter getHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$44, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADERFOOTER$44) != 0;
      }
   }

   public void setHeaderFooter(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$44, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$44);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$44);
         return var2;
      }
   }

   public void unsetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADERFOOTER$44, 0);
      }
   }

   public CTPageBreak getRowBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBreak var2 = null;
         var2 = (CTPageBreak)this.get_store().find_element_user(ROWBREAKS$46, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRowBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROWBREAKS$46) != 0;
      }
   }

   public void setRowBreaks(CTPageBreak var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBreak var3 = null;
         var3 = (CTPageBreak)this.get_store().find_element_user(ROWBREAKS$46, 0);
         if(var3 == null) {
            var3 = (CTPageBreak)this.get_store().add_element_user(ROWBREAKS$46);
         }

         var3.set(var1);
      }
   }

   public CTPageBreak addNewRowBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBreak var2 = null;
         var2 = (CTPageBreak)this.get_store().add_element_user(ROWBREAKS$46);
         return var2;
      }
   }

   public void unsetRowBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROWBREAKS$46, 0);
      }
   }

   public CTPageBreak getColBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBreak var2 = null;
         var2 = (CTPageBreak)this.get_store().find_element_user(COLBREAKS$48, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLBREAKS$48) != 0;
      }
   }

   public void setColBreaks(CTPageBreak var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBreak var3 = null;
         var3 = (CTPageBreak)this.get_store().find_element_user(COLBREAKS$48, 0);
         if(var3 == null) {
            var3 = (CTPageBreak)this.get_store().add_element_user(COLBREAKS$48);
         }

         var3.set(var1);
      }
   }

   public CTPageBreak addNewColBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBreak var2 = null;
         var2 = (CTPageBreak)this.get_store().add_element_user(COLBREAKS$48);
         return var2;
      }
   }

   public void unsetColBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLBREAKS$48, 0);
      }
   }

   public CTCustomProperties getCustomProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomProperties var2 = null;
         var2 = (CTCustomProperties)this.get_store().find_element_user(CUSTOMPROPERTIES$50, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMPROPERTIES$50) != 0;
      }
   }

   public void setCustomProperties(CTCustomProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomProperties var3 = null;
         var3 = (CTCustomProperties)this.get_store().find_element_user(CUSTOMPROPERTIES$50, 0);
         if(var3 == null) {
            var3 = (CTCustomProperties)this.get_store().add_element_user(CUSTOMPROPERTIES$50);
         }

         var3.set(var1);
      }
   }

   public CTCustomProperties addNewCustomProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomProperties var2 = null;
         var2 = (CTCustomProperties)this.get_store().add_element_user(CUSTOMPROPERTIES$50);
         return var2;
      }
   }

   public void unsetCustomProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMPROPERTIES$50, 0);
      }
   }

   public CTCellWatches getCellWatches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellWatches var2 = null;
         var2 = (CTCellWatches)this.get_store().find_element_user(CELLWATCHES$52, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCellWatches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CELLWATCHES$52) != 0;
      }
   }

   public void setCellWatches(CTCellWatches var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellWatches var3 = null;
         var3 = (CTCellWatches)this.get_store().find_element_user(CELLWATCHES$52, 0);
         if(var3 == null) {
            var3 = (CTCellWatches)this.get_store().add_element_user(CELLWATCHES$52);
         }

         var3.set(var1);
      }
   }

   public CTCellWatches addNewCellWatches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCellWatches var2 = null;
         var2 = (CTCellWatches)this.get_store().add_element_user(CELLWATCHES$52);
         return var2;
      }
   }

   public void unsetCellWatches() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CELLWATCHES$52, 0);
      }
   }

   public CTIgnoredErrors getIgnoredErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredErrors var2 = null;
         var2 = (CTIgnoredErrors)this.get_store().find_element_user(IGNOREDERRORS$54, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIgnoredErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IGNOREDERRORS$54) != 0;
      }
   }

   public void setIgnoredErrors(CTIgnoredErrors var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredErrors var3 = null;
         var3 = (CTIgnoredErrors)this.get_store().find_element_user(IGNOREDERRORS$54, 0);
         if(var3 == null) {
            var3 = (CTIgnoredErrors)this.get_store().add_element_user(IGNOREDERRORS$54);
         }

         var3.set(var1);
      }
   }

   public CTIgnoredErrors addNewIgnoredErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIgnoredErrors var2 = null;
         var2 = (CTIgnoredErrors)this.get_store().add_element_user(IGNOREDERRORS$54);
         return var2;
      }
   }

   public void unsetIgnoredErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IGNOREDERRORS$54, 0);
      }
   }

   public CTSmartTags getSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTags var2 = null;
         var2 = (CTSmartTags)this.get_store().find_element_user(SMARTTAGS$56, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMARTTAGS$56) != 0;
      }
   }

   public void setSmartTags(CTSmartTags var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTags var3 = null;
         var3 = (CTSmartTags)this.get_store().find_element_user(SMARTTAGS$56, 0);
         if(var3 == null) {
            var3 = (CTSmartTags)this.get_store().add_element_user(SMARTTAGS$56);
         }

         var3.set(var1);
      }
   }

   public CTSmartTags addNewSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTags var2 = null;
         var2 = (CTSmartTags)this.get_store().add_element_user(SMARTTAGS$56);
         return var2;
      }
   }

   public void unsetSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMARTTAGS$56, 0);
      }
   }

   public CTDrawing getDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().find_element_user(DRAWING$58, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWING$58) != 0;
      }
   }

   public void setDrawing(CTDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var3 = null;
         var3 = (CTDrawing)this.get_store().find_element_user(DRAWING$58, 0);
         if(var3 == null) {
            var3 = (CTDrawing)this.get_store().add_element_user(DRAWING$58);
         }

         var3.set(var1);
      }
   }

   public CTDrawing addNewDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().add_element_user(DRAWING$58);
         return var2;
      }
   }

   public void unsetDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWING$58, 0);
      }
   }

   public CTLegacyDrawing getLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWING$60, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWING$60) != 0;
      }
   }

   public void setLegacyDrawing(CTLegacyDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var3 = null;
         var3 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWING$60, 0);
         if(var3 == null) {
            var3 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWING$60);
         }

         var3.set(var1);
      }
   }

   public CTLegacyDrawing addNewLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWING$60);
         return var2;
      }
   }

   public void unsetLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWING$60, 0);
      }
   }

   public CTLegacyDrawing getLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWINGHF$62, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWINGHF$62) != 0;
      }
   }

   public void setLegacyDrawingHF(CTLegacyDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var3 = null;
         var3 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWINGHF$62, 0);
         if(var3 == null) {
            var3 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWINGHF$62);
         }

         var3.set(var1);
      }
   }

   public CTLegacyDrawing addNewLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWINGHF$62);
         return var2;
      }
   }

   public void unsetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWINGHF$62, 0);
      }
   }

   public CTSheetBackgroundPicture getPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetBackgroundPicture var2 = null;
         var2 = (CTSheetBackgroundPicture)this.get_store().find_element_user(PICTURE$64, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PICTURE$64) != 0;
      }
   }

   public void setPicture(CTSheetBackgroundPicture var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetBackgroundPicture var3 = null;
         var3 = (CTSheetBackgroundPicture)this.get_store().find_element_user(PICTURE$64, 0);
         if(var3 == null) {
            var3 = (CTSheetBackgroundPicture)this.get_store().add_element_user(PICTURE$64);
         }

         var3.set(var1);
      }
   }

   public CTSheetBackgroundPicture addNewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetBackgroundPicture var2 = null;
         var2 = (CTSheetBackgroundPicture)this.get_store().add_element_user(PICTURE$64);
         return var2;
      }
   }

   public void unsetPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PICTURE$64, 0);
      }
   }

   public CTOleObjects getOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleObjects var2 = null;
         var2 = (CTOleObjects)this.get_store().find_element_user(OLEOBJECTS$66, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OLEOBJECTS$66) != 0;
      }
   }

   public void setOleObjects(CTOleObjects var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleObjects var3 = null;
         var3 = (CTOleObjects)this.get_store().find_element_user(OLEOBJECTS$66, 0);
         if(var3 == null) {
            var3 = (CTOleObjects)this.get_store().add_element_user(OLEOBJECTS$66);
         }

         var3.set(var1);
      }
   }

   public CTOleObjects addNewOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleObjects var2 = null;
         var2 = (CTOleObjects)this.get_store().add_element_user(OLEOBJECTS$66);
         return var2;
      }
   }

   public void unsetOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OLEOBJECTS$66, 0);
      }
   }

   public CTControls getControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControls var2 = null;
         var2 = (CTControls)this.get_store().find_element_user(CONTROLS$68, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONTROLS$68) != 0;
      }
   }

   public void setControls(CTControls var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControls var3 = null;
         var3 = (CTControls)this.get_store().find_element_user(CONTROLS$68, 0);
         if(var3 == null) {
            var3 = (CTControls)this.get_store().add_element_user(CONTROLS$68);
         }

         var3.set(var1);
      }
   }

   public CTControls addNewControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControls var2 = null;
         var2 = (CTControls)this.get_store().add_element_user(CONTROLS$68);
         return var2;
      }
   }

   public void unsetControls() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONTROLS$68, 0);
      }
   }

   public CTWebPublishItems getWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishItems var2 = null;
         var2 = (CTWebPublishItems)this.get_store().find_element_user(WEBPUBLISHITEMS$70, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WEBPUBLISHITEMS$70) != 0;
      }
   }

   public void setWebPublishItems(CTWebPublishItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishItems var3 = null;
         var3 = (CTWebPublishItems)this.get_store().find_element_user(WEBPUBLISHITEMS$70, 0);
         if(var3 == null) {
            var3 = (CTWebPublishItems)this.get_store().add_element_user(WEBPUBLISHITEMS$70);
         }

         var3.set(var1);
      }
   }

   public CTWebPublishItems addNewWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishItems var2 = null;
         var2 = (CTWebPublishItems)this.get_store().add_element_user(WEBPUBLISHITEMS$70);
         return var2;
      }
   }

   public void unsetWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WEBPUBLISHITEMS$70, 0);
      }
   }

   public CTTableParts getTableParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableParts var2 = null;
         var2 = (CTTableParts)this.get_store().find_element_user(TABLEPARTS$72, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTableParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLEPARTS$72) != 0;
      }
   }

   public void setTableParts(CTTableParts var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableParts var3 = null;
         var3 = (CTTableParts)this.get_store().find_element_user(TABLEPARTS$72, 0);
         if(var3 == null) {
            var3 = (CTTableParts)this.get_store().add_element_user(TABLEPARTS$72);
         }

         var3.set(var1);
      }
   }

   public CTTableParts addNewTableParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableParts var2 = null;
         var2 = (CTTableParts)this.get_store().add_element_user(TABLEPARTS$72);
         return var2;
      }
   }

   public void unsetTableParts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLEPARTS$72, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$74, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$74) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$74, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$74);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$74);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$74, 0);
      }
   }

}
