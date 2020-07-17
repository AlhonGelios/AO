package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStop;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedPercentage;

public class CTGradientStopImpl extends XmlComplexContentImpl implements CTGradientStop {

   private static final QName SCRGBCLR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr");
   private static final QName SRGBCLR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr");
   private static final QName HSLCLR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr");
   private static final QName SYSCLR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr");
   private static final QName SCHEMECLR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr");
   private static final QName PRSTCLR$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr");
   private static final QName POS$12 = new QName("", "pos");


   public CTGradientStopImpl(SchemaType var1) {
      super(var1);
   }

   public CTScRgbColor getScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScRgbColor var2 = null;
         var2 = (CTScRgbColor)this.get_store().find_element_user(SCRGBCLR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCRGBCLR$0) != 0;
      }
   }

   public void setScrgbClr(CTScRgbColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScRgbColor var3 = null;
         var3 = (CTScRgbColor)this.get_store().find_element_user(SCRGBCLR$0, 0);
         if(var3 == null) {
            var3 = (CTScRgbColor)this.get_store().add_element_user(SCRGBCLR$0);
         }

         var3.set(var1);
      }
   }

   public CTScRgbColor addNewScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScRgbColor var2 = null;
         var2 = (CTScRgbColor)this.get_store().add_element_user(SCRGBCLR$0);
         return var2;
      }
   }

   public void unsetScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCRGBCLR$0, 0);
      }
   }

   public CTSRgbColor getSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSRgbColor var2 = null;
         var2 = (CTSRgbColor)this.get_store().find_element_user(SRGBCLR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SRGBCLR$2) != 0;
      }
   }

   public void setSrgbClr(CTSRgbColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSRgbColor var3 = null;
         var3 = (CTSRgbColor)this.get_store().find_element_user(SRGBCLR$2, 0);
         if(var3 == null) {
            var3 = (CTSRgbColor)this.get_store().add_element_user(SRGBCLR$2);
         }

         var3.set(var1);
      }
   }

   public CTSRgbColor addNewSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSRgbColor var2 = null;
         var2 = (CTSRgbColor)this.get_store().add_element_user(SRGBCLR$2);
         return var2;
      }
   }

   public void unsetSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SRGBCLR$2, 0);
      }
   }

   public CTHslColor getHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHslColor var2 = null;
         var2 = (CTHslColor)this.get_store().find_element_user(HSLCLR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HSLCLR$4) != 0;
      }
   }

   public void setHslClr(CTHslColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHslColor var3 = null;
         var3 = (CTHslColor)this.get_store().find_element_user(HSLCLR$4, 0);
         if(var3 == null) {
            var3 = (CTHslColor)this.get_store().add_element_user(HSLCLR$4);
         }

         var3.set(var1);
      }
   }

   public CTHslColor addNewHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHslColor var2 = null;
         var2 = (CTHslColor)this.get_store().add_element_user(HSLCLR$4);
         return var2;
      }
   }

   public void unsetHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HSLCLR$4, 0);
      }
   }

   public CTSystemColor getSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSystemColor var2 = null;
         var2 = (CTSystemColor)this.get_store().find_element_user(SYSCLR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SYSCLR$6) != 0;
      }
   }

   public void setSysClr(CTSystemColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSystemColor var3 = null;
         var3 = (CTSystemColor)this.get_store().find_element_user(SYSCLR$6, 0);
         if(var3 == null) {
            var3 = (CTSystemColor)this.get_store().add_element_user(SYSCLR$6);
         }

         var3.set(var1);
      }
   }

   public CTSystemColor addNewSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSystemColor var2 = null;
         var2 = (CTSystemColor)this.get_store().add_element_user(SYSCLR$6);
         return var2;
      }
   }

   public void unsetSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SYSCLR$6, 0);
      }
   }

   public CTSchemeColor getSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemeColor var2 = null;
         var2 = (CTSchemeColor)this.get_store().find_element_user(SCHEMECLR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCHEMECLR$8) != 0;
      }
   }

   public void setSchemeClr(CTSchemeColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemeColor var3 = null;
         var3 = (CTSchemeColor)this.get_store().find_element_user(SCHEMECLR$8, 0);
         if(var3 == null) {
            var3 = (CTSchemeColor)this.get_store().add_element_user(SCHEMECLR$8);
         }

         var3.set(var1);
      }
   }

   public CTSchemeColor addNewSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemeColor var2 = null;
         var2 = (CTSchemeColor)this.get_store().add_element_user(SCHEMECLR$8);
         return var2;
      }
   }

   public void unsetSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCHEMECLR$8, 0);
      }
   }

   public CTPresetColor getPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetColor var2 = null;
         var2 = (CTPresetColor)this.get_store().find_element_user(PRSTCLR$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRSTCLR$10) != 0;
      }
   }

   public void setPrstClr(CTPresetColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetColor var3 = null;
         var3 = (CTPresetColor)this.get_store().find_element_user(PRSTCLR$10, 0);
         if(var3 == null) {
            var3 = (CTPresetColor)this.get_store().add_element_user(PRSTCLR$10);
         }

         var3.set(var1);
      }
   }

   public CTPresetColor addNewPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetColor var2 = null;
         var2 = (CTPresetColor)this.get_store().add_element_user(PRSTCLR$10);
         return var2;
      }
   }

   public void unsetPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRSTCLR$10, 0);
      }
   }

   public int getPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(POS$12);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveFixedPercentage xgetPos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedPercentage var2 = null;
         var2 = (STPositiveFixedPercentage)this.get_store().find_attribute_user(POS$12);
         return var2;
      }
   }

   public void setPos(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(POS$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(POS$12);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetPos(STPositiveFixedPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedPercentage var3 = null;
         var3 = (STPositiveFixedPercentage)this.get_store().find_attribute_user(POS$12);
         if(var3 == null) {
            var3 = (STPositiveFixedPercentage)this.get_store().add_attribute_user(POS$12);
         }

         var3.set(var1);
      }
   }

}
