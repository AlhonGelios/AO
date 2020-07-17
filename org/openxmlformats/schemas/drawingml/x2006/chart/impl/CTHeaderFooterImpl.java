package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTHeaderFooter;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;

public class CTHeaderFooterImpl extends XmlComplexContentImpl implements CTHeaderFooter {

   private static final QName ODDHEADER$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "oddHeader");
   private static final QName ODDFOOTER$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "oddFooter");
   private static final QName EVENHEADER$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "evenHeader");
   private static final QName EVENFOOTER$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "evenFooter");
   private static final QName FIRSTHEADER$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "firstHeader");
   private static final QName FIRSTFOOTER$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "firstFooter");
   private static final QName ALIGNWITHMARGINS$12 = new QName("", "alignWithMargins");
   private static final QName DIFFERENTODDEVEN$14 = new QName("", "differentOddEven");
   private static final QName DIFFERENTFIRST$16 = new QName("", "differentFirst");


   public CTHeaderFooterImpl(SchemaType var1) {
      super(var1);
   }

   public String getOddHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ODDHEADER$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetOddHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(ODDHEADER$0, 0);
         return var2;
      }
   }

   public boolean isSetOddHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ODDHEADER$0) != 0;
      }
   }

   public void setOddHeader(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ODDHEADER$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(ODDHEADER$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOddHeader(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(ODDHEADER$0, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(ODDHEADER$0);
         }

         var3.set(var1);
      }
   }

   public void unsetOddHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ODDHEADER$0, 0);
      }
   }

   public String getOddFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(ODDFOOTER$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetOddFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(ODDFOOTER$2, 0);
         return var2;
      }
   }

   public boolean isSetOddFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ODDFOOTER$2) != 0;
      }
   }

   public void setOddFooter(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(ODDFOOTER$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(ODDFOOTER$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOddFooter(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(ODDFOOTER$2, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(ODDFOOTER$2);
         }

         var3.set(var1);
      }
   }

   public void unsetOddFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ODDFOOTER$2, 0);
      }
   }

   public String getEvenHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(EVENHEADER$4, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetEvenHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(EVENHEADER$4, 0);
         return var2;
      }
   }

   public boolean isSetEvenHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EVENHEADER$4) != 0;
      }
   }

   public void setEvenHeader(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(EVENHEADER$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(EVENHEADER$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEvenHeader(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(EVENHEADER$4, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(EVENHEADER$4);
         }

         var3.set(var1);
      }
   }

   public void unsetEvenHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EVENHEADER$4, 0);
      }
   }

   public String getEvenFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(EVENFOOTER$6, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetEvenFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(EVENFOOTER$6, 0);
         return var2;
      }
   }

   public boolean isSetEvenFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EVENFOOTER$6) != 0;
      }
   }

   public void setEvenFooter(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(EVENFOOTER$6, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(EVENFOOTER$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEvenFooter(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(EVENFOOTER$6, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(EVENFOOTER$6);
         }

         var3.set(var1);
      }
   }

   public void unsetEvenFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EVENFOOTER$6, 0);
      }
   }

   public String getFirstHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FIRSTHEADER$8, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetFirstHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(FIRSTHEADER$8, 0);
         return var2;
      }
   }

   public boolean isSetFirstHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIRSTHEADER$8) != 0;
      }
   }

   public void setFirstHeader(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FIRSTHEADER$8, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FIRSTHEADER$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFirstHeader(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(FIRSTHEADER$8, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(FIRSTHEADER$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIRSTHEADER$8, 0);
      }
   }

   public String getFirstFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FIRSTFOOTER$10, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetFirstFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(FIRSTFOOTER$10, 0);
         return var2;
      }
   }

   public boolean isSetFirstFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FIRSTFOOTER$10) != 0;
      }
   }

   public void setFirstFooter(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FIRSTFOOTER$10, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FIRSTFOOTER$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFirstFooter(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(FIRSTFOOTER$10, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(FIRSTFOOTER$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FIRSTFOOTER$10, 0);
      }
   }

   public boolean getAlignWithMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALIGNWITHMARGINS$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ALIGNWITHMARGINS$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAlignWithMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ALIGNWITHMARGINS$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ALIGNWITHMARGINS$12);
         }

         return var2;
      }
   }

   public boolean isSetAlignWithMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALIGNWITHMARGINS$12) != null;
      }
   }

   public void setAlignWithMargins(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALIGNWITHMARGINS$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALIGNWITHMARGINS$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAlignWithMargins(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ALIGNWITHMARGINS$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ALIGNWITHMARGINS$12);
         }

         var3.set(var1);
      }
   }

   public void unsetAlignWithMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALIGNWITHMARGINS$12);
      }
   }

   public boolean getDifferentOddEven() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIFFERENTODDEVEN$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DIFFERENTODDEVEN$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDifferentOddEven() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DIFFERENTODDEVEN$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DIFFERENTODDEVEN$14);
         }

         return var2;
      }
   }

   public boolean isSetDifferentOddEven() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIFFERENTODDEVEN$14) != null;
      }
   }

   public void setDifferentOddEven(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIFFERENTODDEVEN$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIFFERENTODDEVEN$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDifferentOddEven(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DIFFERENTODDEVEN$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DIFFERENTODDEVEN$14);
         }

         var3.set(var1);
      }
   }

   public void unsetDifferentOddEven() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIFFERENTODDEVEN$14);
      }
   }

   public boolean getDifferentFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIFFERENTFIRST$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DIFFERENTFIRST$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDifferentFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DIFFERENTFIRST$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DIFFERENTFIRST$16);
         }

         return var2;
      }
   }

   public boolean isSetDifferentFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIFFERENTFIRST$16) != null;
      }
   }

   public void setDifferentFirst(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIFFERENTFIRST$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIFFERENTFIRST$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDifferentFirst(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DIFFERENTFIRST$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DIFFERENTFIRST$16);
         }

         var3.set(var1);
      }
   }

   public void unsetDifferentFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIFFERENTFIRST$16);
      }
   }

}
