package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidations;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTDataValidationsImpl.1DataValidationList;

public class CTDataValidationsImpl extends XmlComplexContentImpl implements CTDataValidations {

   private static final QName DATAVALIDATION$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataValidation");
   private static final QName DISABLEPROMPTS$2 = new QName("", "disablePrompts");
   private static final QName XWINDOW$4 = new QName("", "xWindow");
   private static final QName YWINDOW$6 = new QName("", "yWindow");
   private static final QName COUNT$8 = new QName("", "count");


   public CTDataValidationsImpl(SchemaType var1) {
      super(var1);
   }

   public List getDataValidationList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DataValidationList(this);
      }
   }

   public CTDataValidation[] getDataValidationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATAVALIDATION$0, var2);
         CTDataValidation[] var3 = new CTDataValidation[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDataValidation getDataValidationArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidation var3 = null;
         var3 = (CTDataValidation)this.get_store().find_element_user(DATAVALIDATION$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDataValidationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATAVALIDATION$0);
      }
   }

   public void setDataValidationArray(CTDataValidation[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATAVALIDATION$0);
      }
   }

   public void setDataValidationArray(int var1, CTDataValidation var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidation var4 = null;
         var4 = (CTDataValidation)this.get_store().find_element_user(DATAVALIDATION$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDataValidation insertNewDataValidation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidation var3 = null;
         var3 = (CTDataValidation)this.get_store().insert_element_user(DATAVALIDATION$0, var1);
         return var3;
      }
   }

   public CTDataValidation addNewDataValidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataValidation var2 = null;
         var2 = (CTDataValidation)this.get_store().add_element_user(DATAVALIDATION$0);
         return var2;
      }
   }

   public void removeDataValidation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATAVALIDATION$0, var1);
      }
   }

   public boolean getDisablePrompts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISABLEPROMPTS$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DISABLEPROMPTS$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDisablePrompts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DISABLEPROMPTS$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DISABLEPROMPTS$2);
         }

         return var2;
      }
   }

   public boolean isSetDisablePrompts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISABLEPROMPTS$2) != null;
      }
   }

   public void setDisablePrompts(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DISABLEPROMPTS$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DISABLEPROMPTS$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDisablePrompts(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DISABLEPROMPTS$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DISABLEPROMPTS$2);
         }

         var3.set(var1);
      }
   }

   public void unsetDisablePrompts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISABLEPROMPTS$2);
      }
   }

   public long getXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XWINDOW$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(XWINDOW$4);
         return var2;
      }
   }

   public boolean isSetXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XWINDOW$4) != null;
      }
   }

   public void setXWindow(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(XWINDOW$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(XWINDOW$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetXWindow(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(XWINDOW$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(XWINDOW$4);
         }

         var3.set(var1);
      }
   }

   public void unsetXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XWINDOW$4);
      }
   }

   public long getYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(YWINDOW$6);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(YWINDOW$6);
         return var2;
      }
   }

   public boolean isSetYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(YWINDOW$6) != null;
      }
   }

   public void setYWindow(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(YWINDOW$6);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(YWINDOW$6);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetYWindow(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(YWINDOW$6);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(YWINDOW$6);
         }

         var3.set(var1);
      }
   }

   public void unsetYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(YWINDOW$6);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$8);
         return var2;
      }
   }

   public boolean isSetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNT$8) != null;
      }
   }

   public void setCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COUNT$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COUNT$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COUNT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNT$8);
      }
   }

}
