package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfvo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfvoType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTCfvoImpl extends XmlComplexContentImpl implements CTCfvo {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName TYPE$2 = new QName("", "type");
   private static final QName VAL$4 = new QName("", "val");
   private static final QName GTE$6 = new QName("", "gte");


   public CTCfvoImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public STCfvoType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$2);
         return var2 == null?null:(STCfvoType.Enum)var2.getEnumValue();
      }
   }

   public STCfvoType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCfvoType var2 = null;
         var2 = (STCfvoType)this.get_store().find_attribute_user(TYPE$2);
         return var2;
      }
   }

   public void setType(STCfvoType.Enum var1) {
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

   public void xsetType(STCfvoType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCfvoType var3 = null;
         var3 = (STCfvoType)this.get_store().find_attribute_user(TYPE$2);
         if(var3 == null) {
            var3 = (STCfvoType)this.get_store().add_attribute_user(TYPE$2);
         }

         var3.set(var1);
      }
   }

   public String getVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VAL$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(VAL$4);
         return var2;
      }
   }

   public boolean isSetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VAL$4) != null;
      }
   }

   public void setVal(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VAL$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VAL$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetVal(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(VAL$4);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(VAL$4);
         }

         var3.set(var1);
      }
   }

   public void unsetVal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VAL$4);
      }
   }

   public boolean getGte() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GTE$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(GTE$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetGte() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(GTE$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(GTE$6);
         }

         return var2;
      }
   }

   public boolean isSetGte() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GTE$6) != null;
      }
   }

   public void setGte(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GTE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GTE$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetGte(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(GTE$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(GTE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetGte() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GTE$6);
      }
   }

}
