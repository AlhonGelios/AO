package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType;

public class CTBrImpl extends XmlComplexContentImpl implements CTBr {

   private static final QName TYPE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
   private static final QName CLEAR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "clear");


   public CTBrImpl(SchemaType var1) {
      super(var1);
   }

   public STBrType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         return var2 == null?null:(STBrType.Enum)var2.getEnumValue();
      }
   }

   public STBrType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBrType var2 = null;
         var2 = (STBrType)this.get_store().find_attribute_user(TYPE$0);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$0) != null;
      }
   }

   public void setType(STBrType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STBrType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBrType var3 = null;
         var3 = (STBrType)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (STBrType)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$0);
      }
   }

   public STBrClear.Enum getClear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CLEAR$2);
         return var2 == null?null:(STBrClear.Enum)var2.getEnumValue();
      }
   }

   public STBrClear xgetClear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBrClear var2 = null;
         var2 = (STBrClear)this.get_store().find_attribute_user(CLEAR$2);
         return var2;
      }
   }

   public boolean isSetClear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CLEAR$2) != null;
      }
   }

   public void setClear(STBrClear.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CLEAR$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CLEAR$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetClear(STBrClear var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBrClear var3 = null;
         var3 = (STBrClear)this.get_store().find_attribute_user(CLEAR$2);
         if(var3 == null) {
            var3 = (STBrClear)this.get_store().add_attribute_user(CLEAR$2);
         }

         var3.set(var1);
      }
   }

   public void unsetClear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CLEAR$2);
      }
   }

}
