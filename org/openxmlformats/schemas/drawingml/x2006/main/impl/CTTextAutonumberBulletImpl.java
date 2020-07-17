package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextBulletStartAtNum;

public class CTTextAutonumberBulletImpl extends XmlComplexContentImpl implements CTTextAutonumberBullet {

   private static final QName TYPE$0 = new QName("", "type");
   private static final QName STARTAT$2 = new QName("", "startAt");


   public CTTextAutonumberBulletImpl(SchemaType var1) {
      super(var1);
   }

   public STTextAutonumberScheme.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$0);
         return var2 == null?null:(STTextAutonumberScheme.Enum)var2.getEnumValue();
      }
   }

   public STTextAutonumberScheme xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAutonumberScheme var2 = null;
         var2 = (STTextAutonumberScheme)this.get_store().find_attribute_user(TYPE$0);
         return var2;
      }
   }

   public void setType(STTextAutonumberScheme.Enum var1) {
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

   public void xsetType(STTextAutonumberScheme var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAutonumberScheme var3 = null;
         var3 = (STTextAutonumberScheme)this.get_store().find_attribute_user(TYPE$0);
         if(var3 == null) {
            var3 = (STTextAutonumberScheme)this.get_store().add_attribute_user(TYPE$0);
         }

         var3.set(var1);
      }
   }

   public int getStartAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STARTAT$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STARTAT$2);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextBulletStartAtNum xgetStartAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextBulletStartAtNum var2 = null;
         var2 = (STTextBulletStartAtNum)this.get_store().find_attribute_user(STARTAT$2);
         if(var2 == null) {
            var2 = (STTextBulletStartAtNum)this.get_default_attribute_value(STARTAT$2);
         }

         return var2;
      }
   }

   public boolean isSetStartAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STARTAT$2) != null;
      }
   }

   public void setStartAt(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STARTAT$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STARTAT$2);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetStartAt(STTextBulletStartAtNum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextBulletStartAtNum var3 = null;
         var3 = (STTextBulletStartAtNum)this.get_store().find_attribute_user(STARTAT$2);
         if(var3 == null) {
            var3 = (STTextBulletStartAtNum)this.get_store().add_attribute_user(STARTAT$2);
         }

         var3.set(var1);
      }
   }

   public void unsetStartAt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STARTAT$2);
      }
   }

}
