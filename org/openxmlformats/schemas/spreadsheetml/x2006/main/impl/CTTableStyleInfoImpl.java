package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTTableStyleInfoImpl extends XmlComplexContentImpl implements CTTableStyleInfo {

   private static final QName NAME$0 = new QName("", "name");
   private static final QName SHOWFIRSTCOLUMN$2 = new QName("", "showFirstColumn");
   private static final QName SHOWLASTCOLUMN$4 = new QName("", "showLastColumn");
   private static final QName SHOWROWSTRIPES$6 = new QName("", "showRowStripes");
   private static final QName SHOWCOLUMNSTRIPES$8 = new QName("", "showColumnStripes");


   public CTTableStyleInfoImpl(SchemaType var1) {
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

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$0);
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

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$0);
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

   public boolean getShowFirstColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowFirstColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
         return var2;
      }
   }

   public boolean isSetShowFirstColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWFIRSTCOLUMN$2) != null;
      }
   }

   public void setShowFirstColumn(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWFIRSTCOLUMN$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowFirstColumn(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWFIRSTCOLUMN$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWFIRSTCOLUMN$2);
         }

         var3.set(var1);
      }
   }

   public void unsetShowFirstColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWFIRSTCOLUMN$2);
      }
   }

   public boolean getShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWLASTCOLUMN$4);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWLASTCOLUMN$4);
         return var2;
      }
   }

   public boolean isSetShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWLASTCOLUMN$4) != null;
      }
   }

   public void setShowLastColumn(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWLASTCOLUMN$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWLASTCOLUMN$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowLastColumn(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWLASTCOLUMN$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWLASTCOLUMN$4);
         }

         var3.set(var1);
      }
   }

   public void unsetShowLastColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWLASTCOLUMN$4);
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

   public boolean getShowColumnStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowColumnStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
         return var2;
      }
   }

   public boolean isSetShowColumnStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8) != null;
      }
   }

   public void setShowColumnStripes(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWCOLUMNSTRIPES$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowColumnStripes(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCOLUMNSTRIPES$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWCOLUMNSTRIPES$8);
         }

         var3.set(var1);
      }
   }

   public void unsetShowColumnStripes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWCOLUMNSTRIPES$8);
      }
   }

}
