package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType;

public class CTPatternFillImpl extends XmlComplexContentImpl implements CTPatternFill {

   private static final QName FGCOLOR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "fgColor");
   private static final QName BGCOLOR$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bgColor");
   private static final QName PATTERNTYPE$4 = new QName("", "patternType");


   public CTPatternFillImpl(SchemaType var1) {
      super(var1);
   }

   public CTColor getFgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(FGCOLOR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FGCOLOR$0) != 0;
      }
   }

   public void setFgColor(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(FGCOLOR$0, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(FGCOLOR$0);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewFgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(FGCOLOR$0);
         return var2;
      }
   }

   public void unsetFgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FGCOLOR$0, 0);
      }
   }

   public CTColor getBgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(BGCOLOR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BGCOLOR$2) != 0;
      }
   }

   public void setBgColor(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(BGCOLOR$2, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(BGCOLOR$2);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewBgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(BGCOLOR$2);
         return var2;
      }
   }

   public void unsetBgColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BGCOLOR$2, 0);
      }
   }

   public STPatternType.Enum getPatternType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PATTERNTYPE$4);
         return var2 == null?null:(STPatternType.Enum)var2.getEnumValue();
      }
   }

   public STPatternType xgetPatternType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPatternType var2 = null;
         var2 = (STPatternType)this.get_store().find_attribute_user(PATTERNTYPE$4);
         return var2;
      }
   }

   public boolean isSetPatternType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PATTERNTYPE$4) != null;
      }
   }

   public void setPatternType(STPatternType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PATTERNTYPE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PATTERNTYPE$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPatternType(STPatternType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPatternType var3 = null;
         var3 = (STPatternType)this.get_store().find_attribute_user(PATTERNTYPE$4);
         if(var3 == null) {
            var3 = (STPatternType)this.get_store().add_attribute_user(PATTERNTYPE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetPatternType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PATTERNTYPE$4);
      }
   }

}
