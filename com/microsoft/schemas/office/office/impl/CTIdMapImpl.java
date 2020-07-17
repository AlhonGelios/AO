package com.microsoft.schemas.office.office.impl;

import com.microsoft.schemas.office.office.CTIdMap;
import com.microsoft.schemas.vml.STExt;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTIdMapImpl extends XmlComplexContentImpl implements CTIdMap {

   private static final QName EXT$0 = new QName("urn:schemas-microsoft-com:vml", "ext");
   private static final QName DATA$2 = new QName("", "data");


   public CTIdMapImpl(SchemaType var1) {
      super(var1);
   }

   public STExt.Enum getExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EXT$0);
         return var2 == null?null:(STExt.Enum)var2.getEnumValue();
      }
   }

   public STExt xgetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STExt var2 = null;
         var2 = (STExt)this.get_store().find_attribute_user(EXT$0);
         return var2;
      }
   }

   public boolean isSetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EXT$0) != null;
      }
   }

   public void setExt(STExt.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EXT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EXT$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetExt(STExt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STExt var3 = null;
         var3 = (STExt)this.get_store().find_attribute_user(EXT$0);
         if(var3 == null) {
            var3 = (STExt)this.get_store().add_attribute_user(EXT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EXT$0);
      }
   }

   public String getData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATA$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(DATA$2);
         return var2;
      }
   }

   public boolean isSetData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATA$2) != null;
      }
   }

   public void setData(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATA$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATA$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetData(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(DATA$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(DATA$2);
         }

         var3.set(var1);
      }
   }

   public void unsetData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATA$2);
      }
   }

}
