package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber;

public class CTShdImpl extends XmlComplexContentImpl implements CTShd {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName COLOR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "color");
   private static final QName THEMECOLOR$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeColor");
   private static final QName THEMETINT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeTint");
   private static final QName THEMESHADE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeShade");
   private static final QName FILL$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fill");
   private static final QName THEMEFILL$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFill");
   private static final QName THEMEFILLTINT$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFillTint");
   private static final QName THEMEFILLSHADE$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFillShade");


   public CTShdImpl(SchemaType var1) {
      super(var1);
   }

   public STShd.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STShd.Enum)var2.getEnumValue();
      }
   }

   public STShd xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShd var2 = null;
         var2 = (STShd)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STShd.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVal(STShd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShd var3 = null;
         var3 = (STShd)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STShd)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

   public Object getColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLOR$2);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STHexColor xgetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHexColor var2 = null;
         var2 = (STHexColor)this.get_store().find_attribute_user(COLOR$2);
         return var2;
      }
   }

   public boolean isSetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLOR$2) != null;
      }
   }

   public void setColor(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLOR$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLOR$2);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetColor(STHexColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHexColor var3 = null;
         var3 = (STHexColor)this.get_store().find_attribute_user(COLOR$2);
         if(var3 == null) {
            var3 = (STHexColor)this.get_store().add_attribute_user(COLOR$2);
         }

         var3.set(var1);
      }
   }

   public void unsetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLOR$2);
      }
   }

   public STThemeColor$Enum getThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMECOLOR$4);
         return var2 == null?null:(STThemeColor$Enum)var2.getEnumValue();
      }
   }

   public STThemeColor xgetThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STThemeColor var2 = null;
         var2 = (STThemeColor)this.get_store().find_attribute_user(THEMECOLOR$4);
         return var2;
      }
   }

   public boolean isSetThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMECOLOR$4) != null;
      }
   }

   public void setThemeColor(STThemeColor$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMECOLOR$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMECOLOR$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetThemeColor(STThemeColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STThemeColor var3 = null;
         var3 = (STThemeColor)this.get_store().find_attribute_user(THEMECOLOR$4);
         if(var3 == null) {
            var3 = (STThemeColor)this.get_store().add_attribute_user(THEMECOLOR$4);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMECOLOR$4);
      }
   }

   public byte[] getThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMETINT$6);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUcharHexNumber xgetThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var2 = null;
         var2 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMETINT$6);
         return var2;
      }
   }

   public boolean isSetThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMETINT$6) != null;
      }
   }

   public void setThemeTint(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMETINT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMETINT$6);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetThemeTint(STUcharHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var3 = null;
         var3 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMETINT$6);
         if(var3 == null) {
            var3 = (STUcharHexNumber)this.get_store().add_attribute_user(THEMETINT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMETINT$6);
      }
   }

   public byte[] getThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMESHADE$8);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUcharHexNumber xgetThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var2 = null;
         var2 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMESHADE$8);
         return var2;
      }
   }

   public boolean isSetThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMESHADE$8) != null;
      }
   }

   public void setThemeShade(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMESHADE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMESHADE$8);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetThemeShade(STUcharHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var3 = null;
         var3 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMESHADE$8);
         if(var3 == null) {
            var3 = (STUcharHexNumber)this.get_store().add_attribute_user(THEMESHADE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMESHADE$8);
      }
   }

   public Object getFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILL$10);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STHexColor xgetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHexColor var2 = null;
         var2 = (STHexColor)this.get_store().find_attribute_user(FILL$10);
         return var2;
      }
   }

   public boolean isSetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILL$10) != null;
      }
   }

   public void setFill(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILL$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILL$10);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetFill(STHexColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHexColor var3 = null;
         var3 = (STHexColor)this.get_store().find_attribute_user(FILL$10);
         if(var3 == null) {
            var3 = (STHexColor)this.get_store().add_attribute_user(FILL$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILL$10);
      }
   }

   public STThemeColor$Enum getThemeFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMEFILL$12);
         return var2 == null?null:(STThemeColor$Enum)var2.getEnumValue();
      }
   }

   public STThemeColor xgetThemeFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STThemeColor var2 = null;
         var2 = (STThemeColor)this.get_store().find_attribute_user(THEMEFILL$12);
         return var2;
      }
   }

   public boolean isSetThemeFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMEFILL$12) != null;
      }
   }

   public void setThemeFill(STThemeColor$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMEFILL$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMEFILL$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetThemeFill(STThemeColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STThemeColor var3 = null;
         var3 = (STThemeColor)this.get_store().find_attribute_user(THEMEFILL$12);
         if(var3 == null) {
            var3 = (STThemeColor)this.get_store().add_attribute_user(THEMEFILL$12);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMEFILL$12);
      }
   }

   public byte[] getThemeFillTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMEFILLTINT$14);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUcharHexNumber xgetThemeFillTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var2 = null;
         var2 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMEFILLTINT$14);
         return var2;
      }
   }

   public boolean isSetThemeFillTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMEFILLTINT$14) != null;
      }
   }

   public void setThemeFillTint(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMEFILLTINT$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMEFILLTINT$14);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetThemeFillTint(STUcharHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var3 = null;
         var3 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMEFILLTINT$14);
         if(var3 == null) {
            var3 = (STUcharHexNumber)this.get_store().add_attribute_user(THEMEFILLTINT$14);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeFillTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMEFILLTINT$14);
      }
   }

   public byte[] getThemeFillShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMEFILLSHADE$16);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUcharHexNumber xgetThemeFillShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var2 = null;
         var2 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMEFILLSHADE$16);
         return var2;
      }
   }

   public boolean isSetThemeFillShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMEFILLSHADE$16) != null;
      }
   }

   public void setThemeFillShade(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMEFILLSHADE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMEFILLSHADE$16);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetThemeFillShade(STUcharHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var3 = null;
         var3 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMEFILLSHADE$16);
         if(var3 == null) {
            var3 = (STUcharHexNumber)this.get_store().add_attribute_user(THEMEFILLSHADE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeFillShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMEFILLSHADE$16);
      }
   }

}
