package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCustomSheetViews;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDialogsheet;
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

public class CTDialogsheetImpl extends XmlComplexContentImpl implements CTDialogsheet {

   private static final QName SHEETPR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetPr");
   private static final QName SHEETVIEWS$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetViews");
   private static final QName SHEETFORMATPR$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetFormatPr");
   private static final QName SHEETPROTECTION$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sheetProtection");
   private static final QName CUSTOMSHEETVIEWS$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "customSheetViews");
   private static final QName PRINTOPTIONS$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "printOptions");
   private static final QName PAGEMARGINS$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageMargins");
   private static final QName PAGESETUP$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetup");
   private static final QName HEADERFOOTER$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "headerFooter");
   private static final QName DRAWING$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "drawing");
   private static final QName LEGACYDRAWING$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawing");
   private static final QName LEGACYDRAWINGHF$22 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "legacyDrawingHF");
   private static final QName OLEOBJECTS$24 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleObjects");
   private static final QName EXTLST$26 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTDialogsheetImpl(SchemaType var1) {
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

   public CTSheetViews getSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetViews var2 = null;
         var2 = (CTSheetViews)this.get_store().find_element_user(SHEETVIEWS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETVIEWS$2) != 0;
      }
   }

   public void setSheetViews(CTSheetViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetViews var3 = null;
         var3 = (CTSheetViews)this.get_store().find_element_user(SHEETVIEWS$2, 0);
         if(var3 == null) {
            var3 = (CTSheetViews)this.get_store().add_element_user(SHEETVIEWS$2);
         }

         var3.set(var1);
      }
   }

   public CTSheetViews addNewSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetViews var2 = null;
         var2 = (CTSheetViews)this.get_store().add_element_user(SHEETVIEWS$2);
         return var2;
      }
   }

   public void unsetSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETVIEWS$2, 0);
      }
   }

   public CTSheetFormatPr getSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetFormatPr var2 = null;
         var2 = (CTSheetFormatPr)this.get_store().find_element_user(SHEETFORMATPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETFORMATPR$4) != 0;
      }
   }

   public void setSheetFormatPr(CTSheetFormatPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetFormatPr var3 = null;
         var3 = (CTSheetFormatPr)this.get_store().find_element_user(SHEETFORMATPR$4, 0);
         if(var3 == null) {
            var3 = (CTSheetFormatPr)this.get_store().add_element_user(SHEETFORMATPR$4);
         }

         var3.set(var1);
      }
   }

   public CTSheetFormatPr addNewSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetFormatPr var2 = null;
         var2 = (CTSheetFormatPr)this.get_store().add_element_user(SHEETFORMATPR$4);
         return var2;
      }
   }

   public void unsetSheetFormatPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETFORMATPR$4, 0);
      }
   }

   public CTSheetProtection getSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetProtection var2 = null;
         var2 = (CTSheetProtection)this.get_store().find_element_user(SHEETPROTECTION$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHEETPROTECTION$6) != 0;
      }
   }

   public void setSheetProtection(CTSheetProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetProtection var3 = null;
         var3 = (CTSheetProtection)this.get_store().find_element_user(SHEETPROTECTION$6, 0);
         if(var3 == null) {
            var3 = (CTSheetProtection)this.get_store().add_element_user(SHEETPROTECTION$6);
         }

         var3.set(var1);
      }
   }

   public CTSheetProtection addNewSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSheetProtection var2 = null;
         var2 = (CTSheetProtection)this.get_store().add_element_user(SHEETPROTECTION$6);
         return var2;
      }
   }

   public void unsetSheetProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHEETPROTECTION$6, 0);
      }
   }

   public CTCustomSheetViews getCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomSheetViews var2 = null;
         var2 = (CTCustomSheetViews)this.get_store().find_element_user(CUSTOMSHEETVIEWS$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMSHEETVIEWS$8) != 0;
      }
   }

   public void setCustomSheetViews(CTCustomSheetViews var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomSheetViews var3 = null;
         var3 = (CTCustomSheetViews)this.get_store().find_element_user(CUSTOMSHEETVIEWS$8, 0);
         if(var3 == null) {
            var3 = (CTCustomSheetViews)this.get_store().add_element_user(CUSTOMSHEETVIEWS$8);
         }

         var3.set(var1);
      }
   }

   public CTCustomSheetViews addNewCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomSheetViews var2 = null;
         var2 = (CTCustomSheetViews)this.get_store().add_element_user(CUSTOMSHEETVIEWS$8);
         return var2;
      }
   }

   public void unsetCustomSheetViews() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMSHEETVIEWS$8, 0);
      }
   }

   public CTPrintOptions getPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintOptions var2 = null;
         var2 = (CTPrintOptions)this.get_store().find_element_user(PRINTOPTIONS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTOPTIONS$10) != 0;
      }
   }

   public void setPrintOptions(CTPrintOptions var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintOptions var3 = null;
         var3 = (CTPrintOptions)this.get_store().find_element_user(PRINTOPTIONS$10, 0);
         if(var3 == null) {
            var3 = (CTPrintOptions)this.get_store().add_element_user(PRINTOPTIONS$10);
         }

         var3.set(var1);
      }
   }

   public CTPrintOptions addNewPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPrintOptions var2 = null;
         var2 = (CTPrintOptions)this.get_store().add_element_user(PRINTOPTIONS$10);
         return var2;
      }
   }

   public void unsetPrintOptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTOPTIONS$10, 0);
      }
   }

   public CTPageMargins getPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGEMARGINS$12) != 0;
      }
   }

   public void setPageMargins(CTPageMargins var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var3 = null;
         var3 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$12, 0);
         if(var3 == null) {
            var3 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$12);
         }

         var3.set(var1);
      }
   }

   public CTPageMargins addNewPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$12);
         return var2;
      }
   }

   public void unsetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGEMARGINS$12, 0);
      }
   }

   public CTPageSetup getPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var2 = null;
         var2 = (CTPageSetup)this.get_store().find_element_user(PAGESETUP$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESETUP$14) != 0;
      }
   }

   public void setPageSetup(CTPageSetup var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var3 = null;
         var3 = (CTPageSetup)this.get_store().find_element_user(PAGESETUP$14, 0);
         if(var3 == null) {
            var3 = (CTPageSetup)this.get_store().add_element_user(PAGESETUP$14);
         }

         var3.set(var1);
      }
   }

   public CTPageSetup addNewPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var2 = null;
         var2 = (CTPageSetup)this.get_store().add_element_user(PAGESETUP$14);
         return var2;
      }
   }

   public void unsetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESETUP$14, 0);
      }
   }

   public CTHeaderFooter getHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADERFOOTER$16) != 0;
      }
   }

   public void setHeaderFooter(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$16, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$16);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$16);
         return var2;
      }
   }

   public void unsetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADERFOOTER$16, 0);
      }
   }

   public CTDrawing getDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().find_element_user(DRAWING$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWING$18) != 0;
      }
   }

   public void setDrawing(CTDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var3 = null;
         var3 = (CTDrawing)this.get_store().find_element_user(DRAWING$18, 0);
         if(var3 == null) {
            var3 = (CTDrawing)this.get_store().add_element_user(DRAWING$18);
         }

         var3.set(var1);
      }
   }

   public CTDrawing addNewDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().add_element_user(DRAWING$18);
         return var2;
      }
   }

   public void unsetDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWING$18, 0);
      }
   }

   public CTLegacyDrawing getLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWING$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWING$20) != 0;
      }
   }

   public void setLegacyDrawing(CTLegacyDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var3 = null;
         var3 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWING$20, 0);
         if(var3 == null) {
            var3 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWING$20);
         }

         var3.set(var1);
      }
   }

   public CTLegacyDrawing addNewLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWING$20);
         return var2;
      }
   }

   public void unsetLegacyDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWING$20, 0);
      }
   }

   public CTLegacyDrawing getLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWINGHF$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWINGHF$22) != 0;
      }
   }

   public void setLegacyDrawingHF(CTLegacyDrawing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var3 = null;
         var3 = (CTLegacyDrawing)this.get_store().find_element_user(LEGACYDRAWINGHF$22, 0);
         if(var3 == null) {
            var3 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWINGHF$22);
         }

         var3.set(var1);
      }
   }

   public CTLegacyDrawing addNewLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLegacyDrawing var2 = null;
         var2 = (CTLegacyDrawing)this.get_store().add_element_user(LEGACYDRAWINGHF$22);
         return var2;
      }
   }

   public void unsetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWINGHF$22, 0);
      }
   }

   public CTOleObjects getOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleObjects var2 = null;
         var2 = (CTOleObjects)this.get_store().find_element_user(OLEOBJECTS$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OLEOBJECTS$24) != 0;
      }
   }

   public void setOleObjects(CTOleObjects var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleObjects var3 = null;
         var3 = (CTOleObjects)this.get_store().find_element_user(OLEOBJECTS$24, 0);
         if(var3 == null) {
            var3 = (CTOleObjects)this.get_store().add_element_user(OLEOBJECTS$24);
         }

         var3.set(var1);
      }
   }

   public CTOleObjects addNewOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleObjects var2 = null;
         var2 = (CTOleObjects)this.get_store().add_element_user(OLEOBJECTS$24);
         return var2;
      }
   }

   public void unsetOleObjects() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OLEOBJECTS$24, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$26) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$26, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$26);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$26);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$26, 0);
      }
   }

}
