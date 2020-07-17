package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOuterShadowEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.STFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment;
import org.openxmlformats.schemas.drawingml.x2006.main.STRectAlignment$Enum;

public class CTOuterShadowEffectImpl extends XmlComplexContentImpl implements CTOuterShadowEffect {

   private static final QName SCRGBCLR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr");
   private static final QName SRGBCLR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr");
   private static final QName HSLCLR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr");
   private static final QName SYSCLR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr");
   private static final QName SCHEMECLR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr");
   private static final QName PRSTCLR$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr");
   private static final QName BLURRAD$12 = new QName("", "blurRad");
   private static final QName DIST$14 = new QName("", "dist");
   private static final QName DIR$16 = new QName("", "dir");
   private static final QName SX$18 = new QName("", "sx");
   private static final QName SY$20 = new QName("", "sy");
   private static final QName KX$22 = new QName("", "kx");
   private static final QName KY$24 = new QName("", "ky");
   private static final QName ALGN$26 = new QName("", "algn");
   private static final QName ROTWITHSHAPE$28 = new QName("", "rotWithShape");


   public CTOuterShadowEffectImpl(SchemaType var1) {
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

   public long getBlurRad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BLURRAD$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BLURRAD$12);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STPositiveCoordinate xgetBlurRad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var2 = null;
         var2 = (STPositiveCoordinate)this.get_store().find_attribute_user(BLURRAD$12);
         if(var2 == null) {
            var2 = (STPositiveCoordinate)this.get_default_attribute_value(BLURRAD$12);
         }

         return var2;
      }
   }

   public boolean isSetBlurRad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BLURRAD$12) != null;
      }
   }

   public void setBlurRad(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BLURRAD$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BLURRAD$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetBlurRad(STPositiveCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var3 = null;
         var3 = (STPositiveCoordinate)this.get_store().find_attribute_user(BLURRAD$12);
         if(var3 == null) {
            var3 = (STPositiveCoordinate)this.get_store().add_attribute_user(BLURRAD$12);
         }

         var3.set(var1);
      }
   }

   public void unsetBlurRad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BLURRAD$12);
      }
   }

   public long getDist() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIST$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DIST$14);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STPositiveCoordinate xgetDist() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var2 = null;
         var2 = (STPositiveCoordinate)this.get_store().find_attribute_user(DIST$14);
         if(var2 == null) {
            var2 = (STPositiveCoordinate)this.get_default_attribute_value(DIST$14);
         }

         return var2;
      }
   }

   public boolean isSetDist() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIST$14) != null;
      }
   }

   public void setDist(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DIST$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DIST$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDist(STPositiveCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var3 = null;
         var3 = (STPositiveCoordinate)this.get_store().find_attribute_user(DIST$14);
         if(var3 == null) {
            var3 = (STPositiveCoordinate)this.get_store().add_attribute_user(DIST$14);
         }

         var3.set(var1);
      }
   }

   public void unsetDist() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIST$14);
      }
   }

   public int getDir() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIR$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DIR$16);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveFixedAngle xgetDir() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedAngle var2 = null;
         var2 = (STPositiveFixedAngle)this.get_store().find_attribute_user(DIR$16);
         if(var2 == null) {
            var2 = (STPositiveFixedAngle)this.get_default_attribute_value(DIR$16);
         }

         return var2;
      }
   }

   public boolean isSetDir() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIR$16) != null;
      }
   }

   public void setDir(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIR$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIR$16);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetDir(STPositiveFixedAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedAngle var3 = null;
         var3 = (STPositiveFixedAngle)this.get_store().find_attribute_user(DIR$16);
         if(var3 == null) {
            var3 = (STPositiveFixedAngle)this.get_store().add_attribute_user(DIR$16);
         }

         var3.set(var1);
      }
   }

   public void unsetDir() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIR$16);
      }
   }

   public int getSx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SX$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SX$18);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetSx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(SX$18);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(SX$18);
         }

         return var2;
      }
   }

   public boolean isSetSx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SX$18) != null;
      }
   }

   public void setSx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SX$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SX$18);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSx(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(SX$18);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(SX$18);
         }

         var3.set(var1);
      }
   }

   public void unsetSx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SX$18);
      }
   }

   public int getSy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SY$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SY$20);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetSy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(SY$20);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(SY$20);
         }

         return var2;
      }
   }

   public boolean isSetSy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SY$20) != null;
      }
   }

   public void setSy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SY$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SY$20);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSy(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(SY$20);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(SY$20);
         }

         var3.set(var1);
      }
   }

   public void unsetSy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SY$20);
      }
   }

   public int getKx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(KX$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(KX$22);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STFixedAngle xgetKx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFixedAngle var2 = null;
         var2 = (STFixedAngle)this.get_store().find_attribute_user(KX$22);
         if(var2 == null) {
            var2 = (STFixedAngle)this.get_default_attribute_value(KX$22);
         }

         return var2;
      }
   }

   public boolean isSetKx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(KX$22) != null;
      }
   }

   public void setKx(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(KX$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(KX$22);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetKx(STFixedAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFixedAngle var3 = null;
         var3 = (STFixedAngle)this.get_store().find_attribute_user(KX$22);
         if(var3 == null) {
            var3 = (STFixedAngle)this.get_store().add_attribute_user(KX$22);
         }

         var3.set(var1);
      }
   }

   public void unsetKx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(KX$22);
      }
   }

   public int getKy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(KY$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(KY$24);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STFixedAngle xgetKy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFixedAngle var2 = null;
         var2 = (STFixedAngle)this.get_store().find_attribute_user(KY$24);
         if(var2 == null) {
            var2 = (STFixedAngle)this.get_default_attribute_value(KY$24);
         }

         return var2;
      }
   }

   public boolean isSetKy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(KY$24) != null;
      }
   }

   public void setKy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(KY$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(KY$24);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetKy(STFixedAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFixedAngle var3 = null;
         var3 = (STFixedAngle)this.get_store().find_attribute_user(KY$24);
         if(var3 == null) {
            var3 = (STFixedAngle)this.get_store().add_attribute_user(KY$24);
         }

         var3.set(var1);
      }
   }

   public void unsetKy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(KY$24);
      }
   }

   public STRectAlignment$Enum getAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGN$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ALGN$26);
         }

         return var2 == null?null:(STRectAlignment$Enum)var2.getEnumValue();
      }
   }

   public STRectAlignment xgetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRectAlignment var2 = null;
         var2 = (STRectAlignment)this.get_store().find_attribute_user(ALGN$26);
         if(var2 == null) {
            var2 = (STRectAlignment)this.get_default_attribute_value(ALGN$26);
         }

         return var2;
      }
   }

   public boolean isSetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALGN$26) != null;
      }
   }

   public void setAlgn(STRectAlignment$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGN$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGN$26);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlgn(STRectAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRectAlignment var3 = null;
         var3 = (STRectAlignment)this.get_store().find_attribute_user(ALGN$26);
         if(var3 == null) {
            var3 = (STRectAlignment)this.get_store().add_attribute_user(ALGN$26);
         }

         var3.set(var1);
      }
   }

   public void unsetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALGN$26);
      }
   }

   public boolean getRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROTWITHSHAPE$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ROTWITHSHAPE$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ROTWITHSHAPE$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ROTWITHSHAPE$28);
         }

         return var2;
      }
   }

   public boolean isSetRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROTWITHSHAPE$28) != null;
      }
   }

   public void setRotWithShape(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROTWITHSHAPE$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROTWITHSHAPE$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRotWithShape(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ROTWITHSHAPE$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ROTWITHSHAPE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROTWITHSHAPE$28);
      }
   }

}
