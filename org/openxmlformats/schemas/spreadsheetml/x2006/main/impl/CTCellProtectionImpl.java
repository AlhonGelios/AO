package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellProtection;

public class CTCellProtectionImpl extends XmlComplexContentImpl implements CTCellProtection {

   private static final QName LOCKED$0 = new QName("", "locked");
   private static final QName HIDDEN$2 = new QName("", "hidden");


   public CTCellProtectionImpl(SchemaType var1) {
      super(var1);
   }

   public boolean getLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCKED$0);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LOCKED$0);
         return var2;
      }
   }

   public boolean isSetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCKED$0) != null;
      }
   }

   public void setLocked(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCKED$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCKED$0);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLocked(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LOCKED$0);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LOCKED$0);
         }

         var3.set(var1);
      }
   }

   public void unsetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCKED$0);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$2);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$2);
         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$2) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$2);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$2);
      }
   }

}
