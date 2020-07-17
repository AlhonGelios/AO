package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageMargins;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPrintSettings;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRelId;

public class CTPrintSettingsImpl extends XmlComplexContentImpl implements CTPrintSettings {

   private static final QName HEADERFOOTER$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "headerFooter");
   private static final QName PAGEMARGINS$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pageMargins");
   private static final QName PAGESETUP$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "pageSetup");
   private static final QName LEGACYDRAWINGHF$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "legacyDrawingHF");


   public CTPrintSettingsImpl(SchemaType var1) {
      super(var1);
   }

   public CTHeaderFooter getHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADERFOOTER$0) != 0;
      }
   }

   public void setHeaderFooter(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HEADERFOOTER$0, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$0);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HEADERFOOTER$0);
         return var2;
      }
   }

   public void unsetHeaderFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADERFOOTER$0, 0);
      }
   }

   public CTPageMargins getPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGEMARGINS$2) != 0;
      }
   }

   public void setPageMargins(CTPageMargins var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var3 = null;
         var3 = (CTPageMargins)this.get_store().find_element_user(PAGEMARGINS$2, 0);
         if(var3 == null) {
            var3 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$2);
         }

         var3.set(var1);
      }
   }

   public CTPageMargins addNewPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMargins var2 = null;
         var2 = (CTPageMargins)this.get_store().add_element_user(PAGEMARGINS$2);
         return var2;
      }
   }

   public void unsetPageMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGEMARGINS$2, 0);
      }
   }

   public CTPageSetup getPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var2 = null;
         var2 = (CTPageSetup)this.get_store().find_element_user(PAGESETUP$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESETUP$4) != 0;
      }
   }

   public void setPageSetup(CTPageSetup var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var3 = null;
         var3 = (CTPageSetup)this.get_store().find_element_user(PAGESETUP$4, 0);
         if(var3 == null) {
            var3 = (CTPageSetup)this.get_store().add_element_user(PAGESETUP$4);
         }

         var3.set(var1);
      }
   }

   public CTPageSetup addNewPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetup var2 = null;
         var2 = (CTPageSetup)this.get_store().add_element_user(PAGESETUP$4);
         return var2;
      }
   }

   public void unsetPageSetup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESETUP$4, 0);
      }
   }

   public CTRelId getLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelId var2 = null;
         var2 = (CTRelId)this.get_store().find_element_user(LEGACYDRAWINGHF$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACYDRAWINGHF$6) != 0;
      }
   }

   public void setLegacyDrawingHF(CTRelId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelId var3 = null;
         var3 = (CTRelId)this.get_store().find_element_user(LEGACYDRAWINGHF$6, 0);
         if(var3 == null) {
            var3 = (CTRelId)this.get_store().add_element_user(LEGACYDRAWINGHF$6);
         }

         var3.set(var1);
      }
   }

   public CTRelId addNewLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelId var2 = null;
         var2 = (CTRelId)this.get_store().add_element_user(LEGACYDRAWINGHF$6);
         return var2;
      }
   }

   public void unsetLegacyDrawingHF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACYDRAWINGHF$6, 0);
      }
   }

}
