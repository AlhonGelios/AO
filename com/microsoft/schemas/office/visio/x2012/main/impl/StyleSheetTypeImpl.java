package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.StyleSheetType;
import com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;

public class StyleSheetTypeImpl extends SheetTypeImpl implements StyleSheetType {

   private static final QName ID$0 = new QName("", "ID");
   private static final QName NAME$2 = new QName("", "Name");
   private static final QName NAMEU$4 = new QName("", "NameU");
   private static final QName ISCUSTOMNAME$6 = new QName("", "IsCustomName");
   private static final QName ISCUSTOMNAMEU$8 = new QName("", "IsCustomNameU");


   public StyleSheetTypeImpl(SchemaType var1) {
      super(var1);
   }

   public long getID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$0);
         return var2;
      }
   }

   public void setID(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetID(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$0);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$0);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$2);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$2) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$2);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$2);
      }
   }

   public String getNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAMEU$4);
         return var2;
      }
   }

   public boolean isSetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAMEU$4) != null;
      }
   }

   public void setNameU(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAMEU$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAMEU$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetNameU(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAMEU$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAMEU$4);
         }

         var3.set(var1);
      }
   }

   public void unsetNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAMEU$4);
      }
   }

   public boolean getIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$6);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$6);
         return var2;
      }
   }

   public boolean isSetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAME$6) != null;
      }
   }

   public void setIsCustomName(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAME$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAME$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomName(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAME$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAME$6);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAME$6);
      }
   }

   public boolean getIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$8);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$8);
         return var2;
      }
   }

   public boolean isSetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISCUSTOMNAMEU$8) != null;
      }
   }

   public void setIsCustomNameU(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISCUSTOMNAMEU$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISCUSTOMNAMEU$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsCustomNameU(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISCUSTOMNAMEU$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISCUSTOMNAMEU$8);
         }

         var3.set(var1);
      }
   }

   public void unsetIsCustomNameU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISCUSTOMNAMEU$8);
      }
   }

}
