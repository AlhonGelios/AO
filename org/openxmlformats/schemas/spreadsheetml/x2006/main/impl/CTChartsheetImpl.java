package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartsheet;
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

public class CTChartsheetImpl extends XmlComplexContentImpl implements CTChartsheet {

   private static final QName SHEETPR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr");
   private static final QName SHEETVIEWS$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews");
   private static final QName SHEETPROTECTION$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
   private static final QName CUSTOMSHEETVIEWS$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
   private static final QName PAGEMARGINS$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
   private static final QName PAGESETUP$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
   private static final QName HEADERFOOTER$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
   private static final QName DRAWING$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
   private static final QName LEGACYDRAWING$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
   private static final QName LEGACYDRAWINGHF$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
   private static final QName PICTURE$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "picture");
   private static final QName WEBPUBLISHITEMS$22 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "webPublishItems");
   private static final QName EXTLST$24 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTChartsheetImpl(SchemaType var1) {
      super(var1);
   }

   public CTChartsheetPr getSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetPr var2 = null;
         var2 = (CTChartsheetPr)this.get_store().find_element_user(SHEETPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETPR$0) != 0;
      }
   }

   public void setSheetPr(CTChartsheetPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetPr var3 = null;
         var3 = (CTChartsheetPr)this.get_store().find_element_user(SHEETPR$0, 0);
         if(var3 == null) {
            var3 = (CTChartsheetPr)this.get_store().add_element_user(SHEETPR$0);
         }

         var3.set(var1);
      }
   }

   public CTChartsheetPr addNewSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetPr var2 = null;
         var2 = (CTChartsheetPr)this.get_store().add_element_user(SHEETPR$0);
         return var2;
      }
   }

   public void unsetSheetPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETPR$0, 0);
      }
   }

   public CTChartsheetViews getSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetViews var2 = null;
         var2 = (CTChartsheetViews)this.get_store().find_element_user(SHEETVIEWS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSheetViews(CTChartsheetViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetViews var3 = null;
         var3 = (CTChartsheetViews)this.get_store().find_element_user(SHEETVIEWS$2, 0);
         if(var3 == null) {
            var3 = (CTChartsheetViews)this.get_store().add_element_user(SHEETVIEWS$2);
         }

         var3.set(var1);
      }
   }

   public CTChartsheetViews addNewSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetViews var2 = null;
         var2 = (CTChartsheetViews)this.get_store().add_element_user(SHEETVIEWS$2);
         return var2;
      }
   }

   public CTChartsheetProtection getSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetProtection var2 = null;
         var2 = (CTChartsheetProtection)this.get_store().find_element_user(SHEETPROTECTION$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETPROTECTION$4) != 0;
      }
   }

   public void setSheetProtection(CTChartsheetProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetProtection var3 = null;
         var3 = (CTChartsheetProtection)this.get_store().find_element_user(SHEETPROTECTION$4, 0);
         if(var3 == null) {
            var3 = (CTChartsheetProtection)this.get_store().add_element_user(SHEETPROTECTION$4);
         }

         var3.set(var1);
      }
   }

   public CTChartsheetProtection addNewSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartsheetProtection var2 = null;
         var2 = (CTChartsheetProtection)this.get_store().add_element_user(SHEETPROTECTION$4);
         return var2;
      }
   }

   public void unsetSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETPROTECTION$4, 0);
      }
   }

   public CTCustomChartsheetViews getCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomChartsheetViews var2 = null;
         var2 = (CTCustomChartsheetViews)this.get_store().find_element_user(CUSTOMSHEETVIEWS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMSHEETVIEWS$6) != 0;
      }
   }

   public void setCustomSheetViews(CTCustomChartsheetViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomChartsheetViews var3 = null;
         var3 = (CTCustomChartsheetViews)this.get_store().find_element_user(CUSTOMSHEETVIEWS$6, 0);
         if(var3 == null) {
            var3 = (CTCustomChartsheetViews)this.get_store().add_element_user(CUSTOMSHEETVIEWS$6);
         }

         var3.set(var1);
      }
   }

   public CTCustomChartsheetViews addNewCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomChartsheetViews var2 = null;
         var2 = (CTCustomChartsheetViews)this.get_store().add_element_user(CUSTOMSHEETVIEWS$6);
         return var2;
      }
   }

   public void unsetCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMSHEETVIEWS$6, 0);
      }
   }

   public CTPageMargins getPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGEMARGINS$8) != 0;
      }
   }

   public void setPageMargins(CTPageMargins var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var3 = null;
         var3 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$8, 0);
         if(var3 == null) {
            var3 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$8);
         }

         var3.set(var1);
      }
   }

   public CTPageMargins addNewPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$8);
         return var2;
      }
   }

   public void unsetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGEMARGINS$8, 0);
      }
   }

   public CTCsPageSetup getPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCsPageSetup var2 = null;
         var2 = (CTCsPageSetup)this.get_store().find_element_user(PAGESETUP$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESETUP$10) != 0;
      }
   }

   public void setPageSetup(CTCsPageSetup var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCsPageSetup var3 = null;
         var3 = (CTCsPageSetup)this.get_store().find_element_user(PAGESETUP$10, 0);
         if(var3 == null) {
            var3 = (CTCsPageSetup)this.get_store().add_element_user(PAGESETUP$10);
         }

         var3.set(var1);
      }
   }

   public CTCsPageSetup addNewPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCsPageSetup var2 = null;
         var2 = (CTCsPageSetup)this.get_store().add_element_user(PAGESETUP$10);
         return var2;
      }
   }

   public void unsetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESETUP$10, 0);
      }
   }

   public CTHeaderFooter getHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADERFOOTER$12) != 0;
      }
   }

   public void setHeaderFooter(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$12, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$12);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$12);
         return var2;
      }
   }

   public void unsetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADERFOOTER$12, 0);
      }
   }

   public CTDrawing getDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().find_element_user(DRAWING$14, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDrawing(CTDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var3 = null;
         var3 = (CTDrawing)this.get_store().find_element_user(DRAWING$14, 0);
         if(var3 == null) {
            var3 = (CTDrawing)this.get_store().add_element_user(DRAWING$14);
         }

         var3.set(var1);
      }
   }

   public CTDrawing addNewDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().add_element_user(DRAWING$14);
         return var2;
      }
   }

   public CTLegacyDrawing getLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWING$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWING$16) != 0;
      }
   }

   public void setLegacyDrawing(CTLegacyDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var3 = null;
         var3 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWING$16, 0);
         if(var3 == null) {
            var3 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWING$16);
         }

         var3.set(var1);
      }
   }

   public CTLegacyDrawing addNewLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWING$16);
         return var2;
      }
   }

   public void unsetLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWING$16, 0);
      }
   }

   public CTLegacyDrawing getLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWINGHF$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWINGHF$18) != 0;
      }
   }

   public void setLegacyDrawingHF(CTLegacyDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var3 = null;
         var3 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWINGHF$18, 0);
         if(var3 == null) {
            var3 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWINGHF$18);
         }

         var3.set(var1);
      }
   }

   public CTLegacyDrawing addNewLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWINGHF$18);
         return var2;
      }
   }

   public void unsetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWINGHF$18, 0);
      }
   }

   public CTSheetBackgroundPicture getPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetBackgroundPicture var2 = null;
         var2 = (CTSheetBackgroundPicture)this.get_store().find_element_user(PICTURE$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PICTURE$20) != 0;
      }
   }

   public void setPicture(CTSheetBackgroundPicture var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetBackgroundPicture var3 = null;
         var3 = (CTSheetBackgroundPicture)this.get_store().find_element_user(PICTURE$20, 0);
         if(var3 == null) {
            var3 = (CTSheetBackgroundPicture)this.get_store().add_element_user(PICTURE$20);
         }

         var3.set(var1);
      }
   }

   public CTSheetBackgroundPicture addNewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetBackgroundPicture var2 = null;
         var2 = (CTSheetBackgroundPicture)this.get_store().add_element_user(PICTURE$20);
         return var2;
      }
   }

   public void unsetPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PICTURE$20, 0);
      }
   }

   public CTWebPublishItems getWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishItems var2 = null;
         var2 = (CTWebPublishItems)this.get_store().find_element_user(WEBPUBLISHITEMS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WEBPUBLISHITEMS$22) != 0;
      }
   }

   public void setWebPublishItems(CTWebPublishItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishItems var3 = null;
         var3 = (CTWebPublishItems)this.get_store().find_element_user(WEBPUBLISHITEMS$22, 0);
         if(var3 == null) {
            var3 = (CTWebPublishItems)this.get_store().add_element_user(WEBPUBLISHITEMS$22);
         }

         var3.set(var1);
      }
   }

   public CTWebPublishItems addNewWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWebPublishItems var2 = null;
         var2 = (CTWebPublishItems)this.get_store().add_element_user(WEBPUBLISHITEMS$22);
         return var2;
      }
   }

   public void unsetWebPublishItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WEBPUBLISHITEMS$22, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$24) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$24, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$24);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$24);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$24, 0);
      }
   }

}
