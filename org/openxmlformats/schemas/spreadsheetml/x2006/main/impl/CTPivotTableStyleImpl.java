package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle;

public class CTPivotTableStyleImpl extends XmlComplexContentImpl implements CTPivotTableStyle {

   private static final QName NAME$0 = new QName("", "name");
   private static final QName SHOWROWHEADERS$2 = new QName("", "showRowHeaders");
   private static final QName SHOWCOLHEADERS$4 = new QName("", "showColHeaders");
   private static final QName SHOWROWSTRIPES$6 = new QName("", "showRowStripes");
   private static final QName SHOWCOLSTRIPES$8 = new QName("", "showColStripes");
   private static final QName SHOWLASTCOLUMN$10 = new QName("", "showLastColumn");


   public CTPivotTableStyleImpl(SchemaType var1) {
      super(var1);
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$0);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$0) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$0);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$0);
      }
   }

   public boolean getShowRowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWROWHEADERS$2);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowRowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWROWHEADERS$2);
         return var2;
      }
   }

   public boolean isSetShowRowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWROWHEADERS$2) != null;
      }
   }

   public void setShowRowHeaders(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWROWHEADERS$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWROWHEADERS$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowRowHeaders(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWROWHEADERS$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWROWHEADERS$2);
         }

         var3.set(var1);
      }
   }

   public void unsetShowRowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWROWHEADERS$2);
      }
   }

   public boolean getShowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWCOLHEADERS$4);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCOLHEADERS$4);
         return var2;
      }
   }

   public boolean isSetShowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWCOLHEADERS$4) != null;
      }
   }

   public void setShowColHeaders(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWCOLHEADERS$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWCOLHEADERS$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowColHeaders(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCOLHEADERS$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWCOLHEADERS$4);
         }

         var3.set(var1);
      }
   }

   public void unsetShowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWCOLHEADERS$4);
      }
   }

   public boolean getShowRowStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWROWSTRIPES$6);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowRowStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWROWSTRIPES$6);
         return var2;
      }
   }

   public boolean isSetShowRowStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWROWSTRIPES$6) != null;
      }
   }

   public void setShowRowStripes(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWROWSTRIPES$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWROWSTRIPES$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowRowStripes(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWROWSTRIPES$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWROWSTRIPES$6);
         }

         var3.set(var1);
      }
   }

   public void unsetShowRowStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWROWSTRIPES$6);
      }
   }

   public boolean getShowColStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWCOLSTRIPES$8);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowColStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCOLSTRIPES$8);
         return var2;
      }
   }

   public boolean isSetShowColStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWCOLSTRIPES$8) != null;
      }
   }

   public void setShowColStripes(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWCOLSTRIPES$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWCOLSTRIPES$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowColStripes(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCOLSTRIPES$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWCOLSTRIPES$8);
         }

         var3.set(var1);
      }
   }

   public void unsetShowColStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWCOLSTRIPES$8);
      }
   }

   public boolean getShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWLASTCOLUMN$10);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWLASTCOLUMN$10);
         return var2;
      }
   }

   public boolean isSetShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWLASTCOLUMN$10) != null;
      }
   }

   public void setShowLastColumn(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWLASTCOLUMN$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWLASTCOLUMN$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowLastColumn(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWLASTCOLUMN$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWLASTCOLUMN$10);
         }

         var3.set(var1);
      }
   }

   public void unsetShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWLASTCOLUMN$10);
      }
   }

}
