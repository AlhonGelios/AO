package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr;

public class CTOutlinePrImpl extends XmlComplexContentImpl implements CTOutlinePr {

   private static final QName APPLYSTYLES$0 = new QName("", "applyStyles");
   private static final QName SUMMARYBELOW$2 = new QName("", "summaryBelow");
   private static final QName SUMMARYRIGHT$4 = new QName("", "summaryRight");
   private static final QName SHOWOUTLINESYMBOLS$6 = new QName("", "showOutlineSymbols");


   public CTOutlinePrImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getApplyStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYSTYLES$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(APPLYSTYLES$0);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYSTYLES$0);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(APPLYSTYLES$0);
         }

         return var2;
      }
   }

   public boolean isSetApplyStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYSTYLES$0) != null;
      }
   }

   public void setApplyStyles(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYSTYLES$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYSTYLES$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyStyles(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYSTYLES$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYSTYLES$0);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYSTYLES$0);
      }
   }

   public boolean getSummaryBelow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUMMARYBELOW$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUMMARYBELOW$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSummaryBelow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUMMARYBELOW$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUMMARYBELOW$2);
         }

         return var2;
      }
   }

   public boolean isSetSummaryBelow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUMMARYBELOW$2) != null;
      }
   }

   public void setSummaryBelow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUMMARYBELOW$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUMMARYBELOW$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSummaryBelow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUMMARYBELOW$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUMMARYBELOW$2);
         }

         var3.set(var1);
      }
   }

   public void unsetSummaryBelow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUMMARYBELOW$2);
      }
   }

   public boolean getSummaryRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUMMARYRIGHT$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUMMARYRIGHT$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSummaryRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUMMARYRIGHT$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUMMARYRIGHT$4);
         }

         return var2;
      }
   }

   public boolean isSetSummaryRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUMMARYRIGHT$4) != null;
      }
   }

   public void setSummaryRight(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUMMARYRIGHT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUMMARYRIGHT$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSummaryRight(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUMMARYRIGHT$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUMMARYRIGHT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetSummaryRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUMMARYRIGHT$4);
      }
   }

   public boolean getShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWOUTLINESYMBOLS$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWOUTLINESYMBOLS$6);
         }

         return var2;
      }
   }

   public boolean isSetShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6) != null;
      }
   }

   public void setShowOutlineSymbols(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWOUTLINESYMBOLS$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowOutlineSymbols(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWOUTLINESYMBOLS$6);
         }

         var3.set(var1);
      }
   }

   public void unsetShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWOUTLINESYMBOLS$6);
      }
   }

}
