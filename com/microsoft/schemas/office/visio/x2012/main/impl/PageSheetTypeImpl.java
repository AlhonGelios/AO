package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.PageSheetType;
import com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;

public class PageSheetTypeImpl extends SheetTypeImpl implements PageSheetType {

   private static final QName UNIQUEID$0 = new QName("", "UniqueID");


   public PageSheetTypeImpl(SchemaType var1) {
      super(var1);
   }

   public String getUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEID$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(UNIQUEID$0);
         return var2;
      }
   }

   public boolean isSetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUEID$0) != null;
      }
   }

   public void setUniqueID(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEID$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUEID$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUniqueID(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(UNIQUEID$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(UNIQUEID$0);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUEID$0);
      }
   }

}
