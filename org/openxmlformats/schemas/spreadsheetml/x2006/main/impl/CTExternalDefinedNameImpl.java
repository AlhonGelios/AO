package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTExternalDefinedNameImpl extends XmlComplexContentImpl implements CTExternalDefinedName {

   private static final QName NAME$0 = new QName("", "name");
   private static final QName REFERSTO$2 = new QName("", "refersTo");
   private static final QName SHEETID$4 = new QName("", "sheetId");


   public CTExternalDefinedNameImpl(SchemaType var1) {
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

   public String getRefersTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFERSTO$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetRefersTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(REFERSTO$2);
         return var2;
      }
   }

   public boolean isSetRefersTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFERSTO$2) != null;
      }
   }

   public void setRefersTo(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REFERSTO$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REFERSTO$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRefersTo(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(REFERSTO$2);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(REFERSTO$2);
         }

         var3.set(var1);
      }
   }

   public void unsetRefersTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFERSTO$2);
      }
   }

   public long getSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHEETID$4);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(SHEETID$4);
         return var2;
      }
   }

   public boolean isSetSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHEETID$4) != null;
      }
   }

   public void setSheetId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(SHEETID$4);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(SHEETID$4);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetSheetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(SHEETID$4);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(SHEETID$4);
         }

         var3.set(var1);
      }
   }

   public void unsetSheetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHEETID$4);
      }
   }

}
