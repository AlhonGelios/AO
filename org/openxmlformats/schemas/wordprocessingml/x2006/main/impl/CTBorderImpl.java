package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STEighthPointMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STPointMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber;

public class CTBorderImpl extends XmlComplexContentImpl implements CTBorder {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName COLOR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "color");
   private static final QName THEMECOLOR$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeColor");
   private static final QName THEMETINT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeTint");
   private static final QName THEMESHADE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeShade");
   private static final QName SZ$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sz");
   private static final QName SPACE$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "space");
   private static final QName SHADOW$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shadow");
   private static final QName FRAME$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "frame");


   public CTBorderImpl(SchemaType var1) {
      super(var1);
   }

   public STBorder.Enum getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:(STBorder.Enum)var2.getEnumValue();
      }
   }

   public STBorder xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBorder var2 = null;
         var2 = (STBorder)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(STBorder.Enum var1) {
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

   public void xsetVal(STBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBorder var3 = null;
         var3 = (STBorder)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STBorder)this.get_store().add_attribute_user(VAL$0);
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

   public BigInteger getSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SZ$10);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STEighthPointMeasure xgetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STEighthPointMeasure var2 = null;
         var2 = (STEighthPointMeasure)this.get_store().find_attribute_user(SZ$10);
         return var2;
      }
   }

   public boolean isSetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SZ$10) != null;
      }
   }

   public void setSz(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SZ$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SZ$10);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetSz(STEighthPointMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STEighthPointMeasure var3 = null;
         var3 = (STEighthPointMeasure)this.get_store().find_attribute_user(SZ$10);
         if(var3 == null) {
            var3 = (STEighthPointMeasure)this.get_store().add_attribute_user(SZ$10);
         }

         var3.set(var1);
      }
   }

   public void unsetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SZ$10);
      }
   }

   public BigInteger getSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPACE$12);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STPointMeasure xgetSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPointMeasure var2 = null;
         var2 = (STPointMeasure)this.get_store().find_attribute_user(SPACE$12);
         return var2;
      }
   }

   public boolean isSetSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPACE$12) != null;
      }
   }

   public void setSpace(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPACE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPACE$12);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetSpace(STPointMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPointMeasure var3 = null;
         var3 = (STPointMeasure)this.get_store().find_attribute_user(SPACE$12);
         if(var3 == null) {
            var3 = (STPointMeasure)this.get_store().add_attribute_user(SPACE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPACE$12);
      }
   }

   public STOnOff.Enum getShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHADOW$14);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(SHADOW$14);
         return var2;
      }
   }

   public boolean isSetShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHADOW$14) != null;
      }
   }

   public void setShadow(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHADOW$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHADOW$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetShadow(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(SHADOW$14);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(SHADOW$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHADOW$14);
      }
   }

   public STOnOff.Enum getFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FRAME$16);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(FRAME$16);
         return var2;
      }
   }

   public boolean isSetFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FRAME$16) != null;
      }
   }

   public void setFrame(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FRAME$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FRAME$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFrame(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(FRAME$16);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(FRAME$16);
         }

         var3.set(var1);
      }
   }

   public void unsetFrame() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FRAME$16);
      }
   }

}
