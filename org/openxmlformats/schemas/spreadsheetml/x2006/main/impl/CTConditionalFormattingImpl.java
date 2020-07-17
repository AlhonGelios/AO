package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTConditionalFormattingImpl.1CfRuleList;

public class CTConditionalFormattingImpl extends XmlComplexContentImpl implements CTConditionalFormatting {

   private static final QName CFRULE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfRule");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName PIVOT$4 = new QName("", "pivot");
   private static final QName SQREF$6 = new QName("", "sqref");


   public CTConditionalFormattingImpl(SchemaType var1) {
      super(var1);
   }

   public List getCfRuleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CfRuleList(this);
      }
   }

   public CTCfRule[] getCfRuleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CFRULE$0, var2);
         CTCfRule[] var3 = new CTCfRule[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCfRule getCfRuleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfRule var3 = null;
         var3 = (CTCfRule)this.get_store().find_element_user(CFRULE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCfRuleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CFRULE$0);
      }
   }

   public void setCfRuleArray(CTCfRule[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CFRULE$0);
      }
   }

   public void setCfRuleArray(int var1, CTCfRule var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfRule var4 = null;
         var4 = (CTCfRule)this.get_store().find_element_user(CFRULE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCfRule insertNewCfRule(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfRule var3 = null;
         var3 = (CTCfRule)this.get_store().insert_element_user(CFRULE$0, var1);
         return var3;
      }
   }

   public CTCfRule addNewCfRule() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCfRule var2 = null;
         var2 = (CTCfRule)this.get_store().add_element_user(CFRULE$0);
         return var2;
      }
   }

   public void removeCfRule(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CFRULE$0, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public boolean getPivot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PIVOT$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PIVOT$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPivot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PIVOT$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PIVOT$4);
         }

         return var2;
      }
   }

   public boolean isSetPivot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PIVOT$4) != null;
      }
   }

   public void setPivot(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PIVOT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PIVOT$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPivot(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PIVOT$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PIVOT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetPivot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PIVOT$4);
      }
   }

   public List getSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SQREF$6);
         return var2 == null?null:var2.getListValue();
      }
   }

   public STSqref xgetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var2 = null;
         var2 = (STSqref)this.get_store().find_attribute_user(SQREF$6);
         return var2;
      }
   }

   public boolean isSetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SQREF$6) != null;
      }
   }

   public void setSqref(List var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SQREF$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SQREF$6);
         }

         var3.setListValue(var1);
      }
   }

   public void xsetSqref(STSqref var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var3 = null;
         var3 = (STSqref)this.get_store().find_attribute_user(SQREF$6);
         if(var3 == null) {
            var3 = (STSqref)this.get_store().add_attribute_user(SQREF$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SQREF$6);
      }
   }

}
