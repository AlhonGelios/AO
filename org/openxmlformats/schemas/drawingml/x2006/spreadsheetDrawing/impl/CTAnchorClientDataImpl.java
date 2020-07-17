package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTAnchorClientData;

public class CTAnchorClientDataImpl extends XmlComplexContentImpl implements CTAnchorClientData {

   private static final QName FLOCKSWITHSHEET$0 = new QName("", "fLocksWithSheet");
   private static final QName FPRINTSWITHSHEET$2 = new QName("", "fPrintsWithSheet");


   public CTAnchorClientDataImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getFLocksWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLOCKSWITHSHEET$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FLOCKSWITHSHEET$0);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFLocksWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FLOCKSWITHSHEET$0);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FLOCKSWITHSHEET$0);
         }

         return var2;
      }
   }

   public boolean isSetFLocksWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FLOCKSWITHSHEET$0) != null;
      }
   }

   public void setFLocksWithSheet(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FLOCKSWITHSHEET$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FLOCKSWITHSHEET$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFLocksWithSheet(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FLOCKSWITHSHEET$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FLOCKSWITHSHEET$0);
         }

         var3.set(var1);
      }
   }

   public void unsetFLocksWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FLOCKSWITHSHEET$0);
      }
   }

   public boolean getFPrintsWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FPRINTSWITHSHEET$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FPRINTSWITHSHEET$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFPrintsWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FPRINTSWITHSHEET$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FPRINTSWITHSHEET$2);
         }

         return var2;
      }
   }

   public boolean isSetFPrintsWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FPRINTSWITHSHEET$2) != null;
      }
   }

   public void setFPrintsWithSheet(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FPRINTSWITHSHEET$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FPRINTSWITHSHEET$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFPrintsWithSheet(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FPRINTSWITHSHEET$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FPRINTSWITHSHEET$2);
         }

         var3.set(var1);
      }
   }

   public void unsetFPrintsWithSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FPRINTSWITHSHEET$2);
      }
   }

}
