package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPrintOptions;

public class CTPrintOptionsImpl extends XmlComplexContentImpl implements CTPrintOptions {

   private static final QName HORIZONTALCENTERED$0 = new QName("", "horizontalCentered");
   private static final QName VERTICALCENTERED$2 = new QName("", "verticalCentered");
   private static final QName HEADINGS$4 = new QName("", "headings");
   private static final QName GRIDLINES$6 = new QName("", "gridLines");
   private static final QName GRIDLINESSET$8 = new QName("", "gridLinesSet");


   public CTPrintOptionsImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getHorizontalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTALCENTERED$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HORIZONTALCENTERED$0);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHorizontalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HORIZONTALCENTERED$0);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HORIZONTALCENTERED$0);
         }

         return var2;
      }
   }

   public boolean isSetHorizontalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HORIZONTALCENTERED$0) != null;
      }
   }

   public void setHorizontalCentered(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HORIZONTALCENTERED$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HORIZONTALCENTERED$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHorizontalCentered(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HORIZONTALCENTERED$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HORIZONTALCENTERED$0);
         }

         var3.set(var1);
      }
   }

   public void unsetHorizontalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HORIZONTALCENTERED$0);
      }
   }

   public boolean getVerticalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VERTICALCENTERED$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VERTICALCENTERED$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetVerticalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(VERTICALCENTERED$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(VERTICALCENTERED$2);
         }

         return var2;
      }
   }

   public boolean isSetVerticalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VERTICALCENTERED$2) != null;
      }
   }

   public void setVerticalCentered(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VERTICALCENTERED$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VERTICALCENTERED$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetVerticalCentered(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(VERTICALCENTERED$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(VERTICALCENTERED$2);
         }

         var3.set(var1);
      }
   }

   public void unsetVerticalCentered() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VERTICALCENTERED$2);
      }
   }

   public boolean getHeadings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADINGS$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HEADINGS$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHeadings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HEADINGS$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HEADINGS$4);
         }

         return var2;
      }
   }

   public boolean isSetHeadings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADINGS$4) != null;
      }
   }

   public void setHeadings(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HEADINGS$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HEADINGS$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHeadings(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HEADINGS$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HEADINGS$4);
         }

         var3.set(var1);
      }
   }

   public void unsetHeadings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADINGS$4);
      }
   }

   public boolean getGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GRIDLINES$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(GRIDLINES$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(GRIDLINES$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(GRIDLINES$6);
         }

         return var2;
      }
   }

   public boolean isSetGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GRIDLINES$6) != null;
      }
   }

   public void setGridLines(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GRIDLINES$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GRIDLINES$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetGridLines(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(GRIDLINES$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(GRIDLINES$6);
         }

         var3.set(var1);
      }
   }

   public void unsetGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GRIDLINES$6);
      }
   }

   public boolean getGridLinesSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GRIDLINESSET$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(GRIDLINESSET$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetGridLinesSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(GRIDLINESSET$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(GRIDLINESSET$8);
         }

         return var2;
      }
   }

   public boolean isSetGridLinesSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GRIDLINESSET$8) != null;
      }
   }

   public void setGridLinesSet(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GRIDLINESSET$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GRIDLINESSET$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetGridLinesSet(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(GRIDLINESSET$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(GRIDLINESSET$8);
         }

         var3.set(var1);
      }
   }

   public void unsetGridLinesSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GRIDLINESSET$8);
      }
   }

}
