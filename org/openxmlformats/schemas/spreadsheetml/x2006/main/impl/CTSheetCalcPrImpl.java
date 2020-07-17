package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetCalcPr;

public class CTSheetCalcPrImpl extends XmlComplexContentImpl implements CTSheetCalcPr {

   private static final QName FULLCALCONLOAD$0 = new QName("", "fullCalcOnLoad");


   public CTSheetCalcPrImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FULLCALCONLOAD$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FULLCALCONLOAD$0);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FULLCALCONLOAD$0);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FULLCALCONLOAD$0);
         }

         return var2;
      }
   }

   public boolean isSetFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FULLCALCONLOAD$0) != null;
      }
   }

   public void setFullCalcOnLoad(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FULLCALCONLOAD$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FULLCALCONLOAD$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFullCalcOnLoad(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FULLCALCONLOAD$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FULLCALCONLOAD$0);
         }

         var3.set(var1);
      }
   }

   public void unsetFullCalcOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FULLCALCONLOAD$0);
      }
   }

}
