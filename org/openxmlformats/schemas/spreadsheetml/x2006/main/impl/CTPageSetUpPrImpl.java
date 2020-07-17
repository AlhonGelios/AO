package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr;

public class CTPageSetUpPrImpl extends XmlComplexContentImpl implements CTPageSetUpPr {

   private static final QName AUTOPAGEBREAKS$0 = new QName("", "autoPageBreaks");
   private static final QName FITTOPAGE$2 = new QName("", "fitToPage");


   public CTPageSetUpPrImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getAutoPageBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOPAGEBREAKS$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AUTOPAGEBREAKS$0);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoPageBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOPAGEBREAKS$0);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AUTOPAGEBREAKS$0);
         }

         return var2;
      }
   }

   public boolean isSetAutoPageBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOPAGEBREAKS$0) != null;
      }
   }

   public void setAutoPageBreaks(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOPAGEBREAKS$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOPAGEBREAKS$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoPageBreaks(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOPAGEBREAKS$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOPAGEBREAKS$0);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoPageBreaks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOPAGEBREAKS$0);
      }
   }

   public boolean getFitToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FITTOPAGE$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FITTOPAGE$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFitToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FITTOPAGE$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FITTOPAGE$2);
         }

         return var2;
      }
   }

   public boolean isSetFitToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FITTOPAGE$2) != null;
      }
   }

   public void setFitToPage(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FITTOPAGE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FITTOPAGE$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFitToPage(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FITTOPAGE$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FITTOPAGE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetFitToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FITTOPAGE$2);
      }
   }

}
