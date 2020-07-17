package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STThemeColor$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUcharHexNumber;

public class CTColorImpl extends XmlComplexContentImpl implements CTColor {

   private static final QName VAL$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
   private static final QName THEMECOLOR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeColor");
   private static final QName THEMETINT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeTint");
   private static final QName THEMESHADE$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeShade");


   public CTColorImpl(SchemaType var1) {
      super(var1);
   }

   public Object getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STHexColor xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHexColor var2 = null;
         var2 = (STHexColor)this.get_store().find_attribute_user(VAL$0);
         return var2;
      }
   }

   public void setVal(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$0);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetVal(STHexColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHexColor var3 = null;
         var3 = (STHexColor)this.get_store().find_attribute_user(VAL$0);
         if(var3 == null) {
            var3 = (STHexColor)this.get_store().add_attribute_user(VAL$0);
         }

         var3.set(var1);
      }
   }

   public STThemeColor$Enum getThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMECOLOR$2);
         return var2 == null?null:(STThemeColor$Enum)var2.getEnumValue();
      }
   }

   public STThemeColor xgetThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STThemeColor var2 = null;
         var2 = (STThemeColor)this.get_store().find_attribute_user(THEMECOLOR$2);
         return var2;
      }
   }

   public boolean isSetThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMECOLOR$2) != null;
      }
   }

   public void setThemeColor(STThemeColor$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMECOLOR$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMECOLOR$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetThemeColor(STThemeColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STThemeColor var3 = null;
         var3 = (STThemeColor)this.get_store().find_attribute_user(THEMECOLOR$2);
         if(var3 == null) {
            var3 = (STThemeColor)this.get_store().add_attribute_user(THEMECOLOR$2);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMECOLOR$2);
      }
   }

   public byte[] getThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMETINT$4);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUcharHexNumber xgetThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var2 = null;
         var2 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMETINT$4);
         return var2;
      }
   }

   public boolean isSetThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMETINT$4) != null;
      }
   }

   public void setThemeTint(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMETINT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMETINT$4);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetThemeTint(STUcharHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var3 = null;
         var3 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMETINT$4);
         if(var3 == null) {
            var3 = (STUcharHexNumber)this.get_store().add_attribute_user(THEMETINT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMETINT$4);
      }
   }

   public byte[] getThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(THEMESHADE$6);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUcharHexNumber xgetThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var2 = null;
         var2 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMESHADE$6);
         return var2;
      }
   }

   public boolean isSetThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(THEMESHADE$6) != null;
      }
   }

   public void setThemeShade(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(THEMESHADE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(THEMESHADE$6);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetThemeShade(STUcharHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUcharHexNumber var3 = null;
         var3 = (STUcharHexNumber)this.get_store().find_attribute_user(THEMESHADE$6);
         if(var3 == null) {
            var3 = (STUcharHexNumber)this.get_store().add_attribute_user(THEMESHADE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetThemeShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(THEMESHADE$6);
      }
   }

}
