package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFontId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticAlignment$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPhoneticType$Enum;

public class CTPhoneticPrImpl extends XmlComplexContentImpl implements CTPhoneticPr {

   private static final QName FONTID$0 = new QName("", "fontId");
   private static final QName TYPE$2 = new QName("", "type");
   private static final QName ALIGNMENT$4 = new QName("", "alignment");


   public CTPhoneticPrImpl(SchemaType var1) {
      super(var1);
   }

   public long getFontId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FONTID$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STFontId xgetFontId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFontId var2 = null;
         var2 = (STFontId)this.get_store().find_attribute_user(FONTID$0);
         return var2;
      }
   }

   public void setFontId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FONTID$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FONTID$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFontId(STFontId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFontId var3 = null;
         var3 = (STFontId)this.get_store().find_attribute_user(FONTID$0);
         if(var3 == null) {
            var3 = (STFontId)this.get_store().add_attribute_user(FONTID$0);
         }

         var3.set(var1);
      }
   }

   public STPhoneticType$Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TYPE$2);
         }

         return var2 == null?null:(STPhoneticType$Enum)var2.getEnumValue();
      }
   }

   public STPhoneticType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPhoneticType var2 = null;
         var2 = (STPhoneticType)this.get_store().find_attribute_user(TYPE$2);
         if(var2 == null) {
            var2 = (STPhoneticType)this.get_default_attribute_value(TYPE$2);
         }

         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$2) != null;
      }
   }

   public void setType(STPhoneticType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STPhoneticType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPhoneticType var3 = null;
         var3 = (STPhoneticType)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (STPhoneticType)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$2);
      }
   }

   public STPhoneticAlignment$Enum getAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALIGNMENT$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ALIGNMENT$4);
         }

         return var2 == null?null:(STPhoneticAlignment$Enum)var2.getEnumValue();
      }
   }

   public STPhoneticAlignment xgetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPhoneticAlignment var2 = null;
         var2 = (STPhoneticAlignment)this.get_store().find_attribute_user(ALIGNMENT$4);
         if(var2 == null) {
            var2 = (STPhoneticAlignment)this.get_default_attribute_value(ALIGNMENT$4);
         }

         return var2;
      }
   }

   public boolean isSetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALIGNMENT$4) != null;
      }
   }

   public void setAlignment(STPhoneticAlignment$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALIGNMENT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALIGNMENT$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlignment(STPhoneticAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPhoneticAlignment var3 = null;
         var3 = (STPhoneticAlignment)this.get_store().find_attribute_user(ALIGNMENT$4);
         if(var3 == null) {
            var3 = (STPhoneticAlignment)this.get_store().add_attribute_user(ALIGNMENT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALIGNMENT$4);
      }
   }

}
