package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent;

public class CTTextNormalAutofitImpl extends XmlComplexContentImpl implements CTTextNormalAutofit {

   private static final QName FONTSCALE$0 = new QName("", "fontScale");
   private static final QName LNSPCREDUCTION$2 = new QName("", "lnSpcReduction");


   public CTTextNormalAutofitImpl(SchemaType var1) {
      super(var1);
   }

   public int getFontScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FONTSCALE$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FONTSCALE$0);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextFontScalePercent xgetFontScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextFontScalePercent var2 = null;
         var2 = (STTextFontScalePercent)this.get_store().find_attribute_user(FONTSCALE$0);
         if(var2 == null) {
            var2 = (STTextFontScalePercent)this.get_default_attribute_value(FONTSCALE$0);
         }

         return var2;
      }
   }

   public boolean isSetFontScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FONTSCALE$0) != null;
      }
   }

   public void setFontScale(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FONTSCALE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FONTSCALE$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetFontScale(STTextFontScalePercent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextFontScalePercent var3 = null;
         var3 = (STTextFontScalePercent)this.get_store().find_attribute_user(FONTSCALE$0);
         if(var3 == null) {
            var3 = (STTextFontScalePercent)this.get_store().add_attribute_user(FONTSCALE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetFontScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FONTSCALE$0);
      }
   }

   public int getLnSpcReduction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LNSPCREDUCTION$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LNSPCREDUCTION$2);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextSpacingPercent xgetLnSpcReduction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextSpacingPercent var2 = null;
         var2 = (STTextSpacingPercent)this.get_store().find_attribute_user(LNSPCREDUCTION$2);
         if(var2 == null) {
            var2 = (STTextSpacingPercent)this.get_default_attribute_value(LNSPCREDUCTION$2);
         }

         return var2;
      }
   }

   public boolean isSetLnSpcReduction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LNSPCREDUCTION$2) != null;
      }
   }

   public void setLnSpcReduction(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LNSPCREDUCTION$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LNSPCREDUCTION$2);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetLnSpcReduction(STTextSpacingPercent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextSpacingPercent var3 = null;
         var3 = (STTextSpacingPercent)this.get_store().find_attribute_user(LNSPCREDUCTION$2);
         if(var3 == null) {
            var3 = (STTextSpacingPercent)this.get_store().add_attribute_user(LNSPCREDUCTION$2);
         }

         var3.set(var1);
      }
   }

   public void unsetLnSpcReduction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LNSPCREDUCTION$2);
      }
   }

}
