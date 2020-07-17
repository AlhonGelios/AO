package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontCollection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSystemColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STOnOffStyleType;

public class CTTableStyleTextStyleImpl extends XmlComplexContentImpl implements CTTableStyleTextStyle {

   private static final QName FONT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "font");
   private static final QName FONTREF$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fontRef");
   private static final QName SCRGBCLR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "scrgbClr");
   private static final QName SRGBCLR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srgbClr");
   private static final QName HSLCLR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hslClr");
   private static final QName SYSCLR$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sysClr");
   private static final QName SCHEMECLR$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "schemeClr");
   private static final QName PRSTCLR$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "prstClr");
   private static final QName EXTLST$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName B$18 = new QName("", "b");
   private static final QName I$20 = new QName("", "i");


   public CTTableStyleTextStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTFontCollection getFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var2 = null;
         var2 = (CTFontCollection)this.get_store().find_element_user(FONT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FONT$0) != 0;
      }
   }

   public void setFont(CTFontCollection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var3 = null;
         var3 = (CTFontCollection)this.get_store().find_element_user(FONT$0, 0);
         if(var3 == null) {
            var3 = (CTFontCollection)this.get_store().add_element_user(FONT$0);
         }

         var3.set(var1);
      }
   }

   public CTFontCollection addNewFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontCollection var2 = null;
         var2 = (CTFontCollection)this.get_store().add_element_user(FONT$0);
         return var2;
      }
   }

   public void unsetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FONT$0, 0);
      }
   }

   public CTFontReference getFontRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontReference var2 = null;
         var2 = (CTFontReference)this.get_store().find_element_user(FONTREF$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFontRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FONTREF$2) != 0;
      }
   }

   public void setFontRef(CTFontReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontReference var3 = null;
         var3 = (CTFontReference)this.get_store().find_element_user(FONTREF$2, 0);
         if(var3 == null) {
            var3 = (CTFontReference)this.get_store().add_element_user(FONTREF$2);
         }

         var3.set(var1);
      }
   }

   public CTFontReference addNewFontRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontReference var2 = null;
         var2 = (CTFontReference)this.get_store().add_element_user(FONTREF$2);
         return var2;
      }
   }

   public void unsetFontRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FONTREF$2, 0);
      }
   }

   public CTScRgbColor getScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScRgbColor var2 = null;
         var2 = (CTScRgbColor)this.get_store().find_element_user(SCRGBCLR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCRGBCLR$4) != 0;
      }
   }

   public void setScrgbClr(CTScRgbColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScRgbColor var3 = null;
         var3 = (CTScRgbColor)this.get_store().find_element_user(SCRGBCLR$4, 0);
         if(var3 == null) {
            var3 = (CTScRgbColor)this.get_store().add_element_user(SCRGBCLR$4);
         }

         var3.set(var1);
      }
   }

   public CTScRgbColor addNewScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTScRgbColor var2 = null;
         var2 = (CTScRgbColor)this.get_store().add_element_user(SCRGBCLR$4);
         return var2;
      }
   }

   public void unsetScrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCRGBCLR$4, 0);
      }
   }

   public CTSRgbColor getSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSRgbColor var2 = null;
         var2 = (CTSRgbColor)this.get_store().find_element_user(SRGBCLR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SRGBCLR$6) != 0;
      }
   }

   public void setSrgbClr(CTSRgbColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSRgbColor var3 = null;
         var3 = (CTSRgbColor)this.get_store().find_element_user(SRGBCLR$6, 0);
         if(var3 == null) {
            var3 = (CTSRgbColor)this.get_store().add_element_user(SRGBCLR$6);
         }

         var3.set(var1);
      }
   }

   public CTSRgbColor addNewSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSRgbColor var2 = null;
         var2 = (CTSRgbColor)this.get_store().add_element_user(SRGBCLR$6);
         return var2;
      }
   }

   public void unsetSrgbClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SRGBCLR$6, 0);
      }
   }

   public CTHslColor getHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHslColor var2 = null;
         var2 = (CTHslColor)this.get_store().find_element_user(HSLCLR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HSLCLR$8) != 0;
      }
   }

   public void setHslClr(CTHslColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHslColor var3 = null;
         var3 = (CTHslColor)this.get_store().find_element_user(HSLCLR$8, 0);
         if(var3 == null) {
            var3 = (CTHslColor)this.get_store().add_element_user(HSLCLR$8);
         }

         var3.set(var1);
      }
   }

   public CTHslColor addNewHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHslColor var2 = null;
         var2 = (CTHslColor)this.get_store().add_element_user(HSLCLR$8);
         return var2;
      }
   }

   public void unsetHslClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HSLCLR$8, 0);
      }
   }

   public CTSystemColor getSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSystemColor var2 = null;
         var2 = (CTSystemColor)this.get_store().find_element_user(SYSCLR$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SYSCLR$10) != 0;
      }
   }

   public void setSysClr(CTSystemColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSystemColor var3 = null;
         var3 = (CTSystemColor)this.get_store().find_element_user(SYSCLR$10, 0);
         if(var3 == null) {
            var3 = (CTSystemColor)this.get_store().add_element_user(SYSCLR$10);
         }

         var3.set(var1);
      }
   }

   public CTSystemColor addNewSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSystemColor var2 = null;
         var2 = (CTSystemColor)this.get_store().add_element_user(SYSCLR$10);
         return var2;
      }
   }

   public void unsetSysClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SYSCLR$10, 0);
      }
   }

   public CTSchemeColor getSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemeColor var2 = null;
         var2 = (CTSchemeColor)this.get_store().find_element_user(SCHEMECLR$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCHEMECLR$12) != 0;
      }
   }

   public void setSchemeClr(CTSchemeColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemeColor var3 = null;
         var3 = (CTSchemeColor)this.get_store().find_element_user(SCHEMECLR$12, 0);
         if(var3 == null) {
            var3 = (CTSchemeColor)this.get_store().add_element_user(SCHEMECLR$12);
         }

         var3.set(var1);
      }
   }

   public CTSchemeColor addNewSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemeColor var2 = null;
         var2 = (CTSchemeColor)this.get_store().add_element_user(SCHEMECLR$12);
         return var2;
      }
   }

   public void unsetSchemeClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCHEMECLR$12, 0);
      }
   }

   public CTPresetColor getPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetColor var2 = null;
         var2 = (CTPresetColor)this.get_store().find_element_user(PRSTCLR$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRSTCLR$14) != 0;
      }
   }

   public void setPrstClr(CTPresetColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetColor var3 = null;
         var3 = (CTPresetColor)this.get_store().find_element_user(PRSTCLR$14, 0);
         if(var3 == null) {
            var3 = (CTPresetColor)this.get_store().add_element_user(PRSTCLR$14);
         }

         var3.set(var1);
      }
   }

   public CTPresetColor addNewPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPresetColor var2 = null;
         var2 = (CTPresetColor)this.get_store().add_element_user(PRSTCLR$14);
         return var2;
      }
   }

   public void unsetPrstClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRSTCLR$14, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$16) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$16, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$16);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$16);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$16, 0);
      }
   }

   public STOnOffStyleType.Enum getB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(B$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(B$18);
         }

         return var2 == null?null:(STOnOffStyleType.Enum)var2.getEnumValue();
      }
   }

   public STOnOffStyleType xgetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOffStyleType var2 = null;
         var2 = (STOnOffStyleType)this.get_store().find_attribute_user(B$18);
         if(var2 == null) {
            var2 = (STOnOffStyleType)this.get_default_attribute_value(B$18);
         }

         return var2;
      }
   }

   public boolean isSetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(B$18) != null;
      }
   }

   public void setB(STOnOffStyleType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(B$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(B$18);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetB(STOnOffStyleType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOffStyleType var3 = null;
         var3 = (STOnOffStyleType)this.get_store().find_attribute_user(B$18);
         if(var3 == null) {
            var3 = (STOnOffStyleType)this.get_store().add_attribute_user(B$18);
         }

         var3.set(var1);
      }
   }

   public void unsetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(B$18);
      }
   }

   public STOnOffStyleType.Enum getI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(I$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(I$20);
         }

         return var2 == null?null:(STOnOffStyleType.Enum)var2.getEnumValue();
      }
   }

   public STOnOffStyleType xgetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOffStyleType var2 = null;
         var2 = (STOnOffStyleType)this.get_store().find_attribute_user(I$20);
         if(var2 == null) {
            var2 = (STOnOffStyleType)this.get_default_attribute_value(I$20);
         }

         return var2;
      }
   }

   public boolean isSetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(I$20) != null;
      }
   }

   public void setI(STOnOffStyleType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(I$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(I$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetI(STOnOffStyleType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOffStyleType var3 = null;
         var3 = (STOnOffStyleType)this.get_store().find_attribute_user(I$20);
         if(var3 == null) {
            var3 = (STOnOffStyleType)this.get_store().add_attribute_user(I$20);
         }

         var3.set(var1);
      }
   }

   public void unsetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(I$20);
      }
   }

}
