package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle;

public class CTBorderPrImpl extends XmlComplexContentImpl implements CTBorderPr {

   private static final QName COLOR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "color");
   private static final QName STYLE$2 = new QName("", "style");


   public CTBorderPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTColor getColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(COLOR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLOR$0) != 0;
      }
   }

   public void setColor(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(COLOR$0, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(COLOR$0);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(COLOR$0);
         return var2;
      }
   }

   public void unsetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLOR$0, 0);
      }
   }

   public STBorderStyle.Enum getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLE$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STYLE$2);
         }

         return var2 == null?null:(STBorderStyle.Enum)var2.getEnumValue();
      }
   }

   public STBorderStyle xgetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBorderStyle var2 = null;
         var2 = (STBorderStyle)this.get_store().find_attribute_user(STYLE$2);
         if(var2 == null) {
            var2 = (STBorderStyle)this.get_default_attribute_value(STYLE$2);
         }

         return var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLE$2) != null;
      }
   }

   public void setStyle(STBorderStyle.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStyle(STBorderStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBorderStyle var3 = null;
         var3 = (STBorderStyle)this.get_store().find_attribute_user(STYLE$2);
         if(var3 == null) {
            var3 = (STBorderStyle)this.get_store().add_attribute_user(STYLE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLE$2);
      }
   }

}
