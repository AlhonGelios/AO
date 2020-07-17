package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle;

public class CTLinearShadePropertiesImpl extends XmlComplexContentImpl implements CTLinearShadeProperties {

   private static final QName ANG$0 = new QName("", "ang");
   private static final QName SCALED$2 = new QName("", "scaled");


   public CTLinearShadePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public int getAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ANG$0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveFixedAngle xgetAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedAngle var2 = null;
         var2 = (STPositiveFixedAngle)this.get_store().find_attribute_user(ANG$0);
         return var2;
      }
   }

   public boolean isSetAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ANG$0) != null;
      }
   }

   public void setAng(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ANG$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ANG$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetAng(STPositiveFixedAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedAngle var3 = null;
         var3 = (STPositiveFixedAngle)this.get_store().find_attribute_user(ANG$0);
         if(var3 == null) {
            var3 = (STPositiveFixedAngle)this.get_store().add_attribute_user(ANG$0);
         }

         var3.set(var1);
      }
   }

   public void unsetAng() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ANG$0);
      }
   }

   public boolean getScaled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SCALED$2);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetScaled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SCALED$2);
         return var2;
      }
   }

   public boolean isSetScaled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SCALED$2) != null;
      }
   }

   public void setScaled(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SCALED$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SCALED$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetScaled(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SCALED$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SCALED$2);
         }

         var3.set(var1);
      }
   }

   public void unsetScaled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SCALED$2);
      }
   }

}
