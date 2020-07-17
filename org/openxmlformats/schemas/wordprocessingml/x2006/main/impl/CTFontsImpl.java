package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHint$Enum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTheme;

public class CTFontsImpl extends XmlComplexContentImpl implements CTFonts {

   private static final QName HINT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hint");
   private static final QName ASCII$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ascii");
   private static final QName HANSI$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hAnsi");
   private static final QName EASTASIA$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsia");
   private static final QName CS$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cs");
   private static final QName ASCIITHEME$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "asciiTheme");
   private static final QName HANSITHEME$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hAnsiTheme");
   private static final QName EASTASIATHEME$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsiaTheme");
   private static final QName CSTHEME$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cstheme");


   public CTFontsImpl(SchemaType var1) {
      super(var1);
   }

   public STHint$Enum getHint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HINT$0);
         return var2 == null?null:(STHint$Enum)var2.getEnumValue();
      }
   }

   public STHint xgetHint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHint var2 = null;
         var2 = (STHint)this.get_store().find_attribute_user(HINT$0);
         return var2;
      }
   }

   public boolean isSetHint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HINT$0) != null;
      }
   }

   public void setHint(STHint$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HINT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HINT$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHint(STHint var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHint var3 = null;
         var3 = (STHint)this.get_store().find_attribute_user(HINT$0);
         if(var3 == null) {
            var3 = (STHint)this.get_store().add_attribute_user(HINT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetHint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HINT$0);
      }
   }

   public String getAscii() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ASCII$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetAscii() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(ASCII$2);
         return var2;
      }
   }

   public boolean isSetAscii() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ASCII$2) != null;
      }
   }

   public void setAscii(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ASCII$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ASCII$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAscii(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(ASCII$2);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(ASCII$2);
         }

         var3.set(var1);
      }
   }

   public void unsetAscii() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ASCII$2);
      }
   }

   public String getHAnsi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HANSI$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetHAnsi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(HANSI$4);
         return var2;
      }
   }

   public boolean isSetHAnsi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HANSI$4) != null;
      }
   }

   public void setHAnsi(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HANSI$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HANSI$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHAnsi(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(HANSI$4);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(HANSI$4);
         }

         var3.set(var1);
      }
   }

   public void unsetHAnsi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HANSI$4);
      }
   }

   public String getEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EASTASIA$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(EASTASIA$6);
         return var2;
      }
   }

   public boolean isSetEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EASTASIA$6) != null;
      }
   }

   public void setEastAsia(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EASTASIA$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EASTASIA$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEastAsia(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(EASTASIA$6);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(EASTASIA$6);
         }

         var3.set(var1);
      }
   }

   public void unsetEastAsia() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EASTASIA$6);
      }
   }

   public String getCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CS$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(CS$8);
         return var2;
      }
   }

   public boolean isSetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CS$8) != null;
      }
   }

   public void setCs(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CS$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CS$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCs(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(CS$8);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(CS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CS$8);
      }
   }

   public STTheme.Enum getAsciiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ASCIITHEME$10);
         return var2 == null?null:(STTheme.Enum)var2.getEnumValue();
      }
   }

   public STTheme xgetAsciiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var2 = null;
         var2 = (STTheme)this.get_store().find_attribute_user(ASCIITHEME$10);
         return var2;
      }
   }

   public boolean isSetAsciiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ASCIITHEME$10) != null;
      }
   }

   public void setAsciiTheme(STTheme.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ASCIITHEME$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ASCIITHEME$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAsciiTheme(STTheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var3 = null;
         var3 = (STTheme)this.get_store().find_attribute_user(ASCIITHEME$10);
         if(var3 == null) {
            var3 = (STTheme)this.get_store().add_attribute_user(ASCIITHEME$10);
         }

         var3.set(var1);
      }
   }

   public void unsetAsciiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ASCIITHEME$10);
      }
   }

   public STTheme.Enum getHAnsiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HANSITHEME$12);
         return var2 == null?null:(STTheme.Enum)var2.getEnumValue();
      }
   }

   public STTheme xgetHAnsiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var2 = null;
         var2 = (STTheme)this.get_store().find_attribute_user(HANSITHEME$12);
         return var2;
      }
   }

   public boolean isSetHAnsiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HANSITHEME$12) != null;
      }
   }

   public void setHAnsiTheme(STTheme.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HANSITHEME$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HANSITHEME$12);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHAnsiTheme(STTheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var3 = null;
         var3 = (STTheme)this.get_store().find_attribute_user(HANSITHEME$12);
         if(var3 == null) {
            var3 = (STTheme)this.get_store().add_attribute_user(HANSITHEME$12);
         }

         var3.set(var1);
      }
   }

   public void unsetHAnsiTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HANSITHEME$12);
      }
   }

   public STTheme.Enum getEastAsiaTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EASTASIATHEME$14);
         return var2 == null?null:(STTheme.Enum)var2.getEnumValue();
      }
   }

   public STTheme xgetEastAsiaTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var2 = null;
         var2 = (STTheme)this.get_store().find_attribute_user(EASTASIATHEME$14);
         return var2;
      }
   }

   public boolean isSetEastAsiaTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EASTASIATHEME$14) != null;
      }
   }

   public void setEastAsiaTheme(STTheme.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EASTASIATHEME$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EASTASIATHEME$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEastAsiaTheme(STTheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var3 = null;
         var3 = (STTheme)this.get_store().find_attribute_user(EASTASIATHEME$14);
         if(var3 == null) {
            var3 = (STTheme)this.get_store().add_attribute_user(EASTASIATHEME$14);
         }

         var3.set(var1);
      }
   }

   public void unsetEastAsiaTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EASTASIATHEME$14);
      }
   }

   public STTheme.Enum getCstheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CSTHEME$16);
         return var2 == null?null:(STTheme.Enum)var2.getEnumValue();
      }
   }

   public STTheme xgetCstheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var2 = null;
         var2 = (STTheme)this.get_store().find_attribute_user(CSTHEME$16);
         return var2;
      }
   }

   public boolean isSetCstheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CSTHEME$16) != null;
      }
   }

   public void setCstheme(STTheme.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CSTHEME$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CSTHEME$16);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCstheme(STTheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTheme var3 = null;
         var3 = (STTheme)this.get_store().find_attribute_user(CSTHEME$16);
         if(var3 == null) {
            var3 = (STTheme)this.get_store().add_attribute_user(CSTHEME$16);
         }

         var3.set(var1);
      }
   }

   public void unsetCstheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CSTHEME$16);
      }
   }

}
