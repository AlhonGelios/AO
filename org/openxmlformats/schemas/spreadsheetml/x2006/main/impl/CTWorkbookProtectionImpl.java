package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex;

public class CTWorkbookProtectionImpl extends XmlComplexContentImpl implements CTWorkbookProtection {

   private static final QName WORKBOOKPASSWORD$0 = new QName("", "workbookPassword");
   private static final QName REVISIONSPASSWORD$2 = new QName("", "revisionsPassword");
   private static final QName LOCKSTRUCTURE$4 = new QName("", "lockStructure");
   private static final QName LOCKWINDOWS$6 = new QName("", "lockWindows");
   private static final QName LOCKREVISION$8 = new QName("", "lockRevision");


   public CTWorkbookProtectionImpl(SchemaType var1) {
      super(var1);
   }

   public byte[] getWorkbookPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WORKBOOKPASSWORD$0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUnsignedShortHex xgetWorkbookPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedShortHex var2 = null;
         var2 = (STUnsignedShortHex)this.get_store().find_attribute_user(WORKBOOKPASSWORD$0);
         return var2;
      }
   }

   public boolean isSetWorkbookPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WORKBOOKPASSWORD$0) != null;
      }
   }

   public void setWorkbookPassword(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WORKBOOKPASSWORD$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WORKBOOKPASSWORD$0);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetWorkbookPassword(STUnsignedShortHex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedShortHex var3 = null;
         var3 = (STUnsignedShortHex)this.get_store().find_attribute_user(WORKBOOKPASSWORD$0);
         if(var3 == null) {
            var3 = (STUnsignedShortHex)this.get_store().add_attribute_user(WORKBOOKPASSWORD$0);
         }

         var3.set(var1);
      }
   }

   public void unsetWorkbookPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WORKBOOKPASSWORD$0);
      }
   }

   public byte[] getRevisionsPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REVISIONSPASSWORD$2);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STUnsignedShortHex xgetRevisionsPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedShortHex var2 = null;
         var2 = (STUnsignedShortHex)this.get_store().find_attribute_user(REVISIONSPASSWORD$2);
         return var2;
      }
   }

   public boolean isSetRevisionsPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REVISIONSPASSWORD$2) != null;
      }
   }

   public void setRevisionsPassword(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REVISIONSPASSWORD$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REVISIONSPASSWORD$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRevisionsPassword(STUnsignedShortHex var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUnsignedShortHex var3 = null;
         var3 = (STUnsignedShortHex)this.get_store().find_attribute_user(REVISIONSPASSWORD$2);
         if(var3 == null) {
            var3 = (STUnsignedShortHex)this.get_store().add_attribute_user(REVISIONSPASSWORD$2);
         }

         var3.set(var1);
      }
   }

   public void unsetRevisionsPassword() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REVISIONSPASSWORD$2);
      }
   }

   public boolean getLockStructure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCKSTRUCTURE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LOCKSTRUCTURE$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLockStructure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LOCKSTRUCTURE$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LOCKSTRUCTURE$4);
         }

         return var2;
      }
   }

   public boolean isSetLockStructure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCKSTRUCTURE$4) != null;
      }
   }

   public void setLockStructure(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCKSTRUCTURE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCKSTRUCTURE$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLockStructure(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LOCKSTRUCTURE$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LOCKSTRUCTURE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetLockStructure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCKSTRUCTURE$4);
      }
   }

   public boolean getLockWindows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCKWINDOWS$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LOCKWINDOWS$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLockWindows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LOCKWINDOWS$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LOCKWINDOWS$6);
         }

         return var2;
      }
   }

   public boolean isSetLockWindows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCKWINDOWS$6) != null;
      }
   }

   public void setLockWindows(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCKWINDOWS$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCKWINDOWS$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLockWindows(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LOCKWINDOWS$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LOCKWINDOWS$6);
         }

         var3.set(var1);
      }
   }

   public void unsetLockWindows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCKWINDOWS$6);
      }
   }

   public boolean getLockRevision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCKREVISION$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LOCKREVISION$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLockRevision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LOCKREVISION$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LOCKREVISION$8);
         }

         return var2;
      }
   }

   public boolean isSetLockRevision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LOCKREVISION$8) != null;
      }
   }

   public void setLockRevision(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCKREVISION$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCKREVISION$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLockRevision(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LOCKREVISION$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LOCKREVISION$8);
         }

         var3.set(var1);
      }
   }

   public void unsetLockRevision() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LOCKREVISION$8);
      }
   }

}
