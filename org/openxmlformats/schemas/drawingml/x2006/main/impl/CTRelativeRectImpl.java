package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;

public class CTRelativeRectImpl extends XmlComplexContentImpl implements CTRelativeRect {

   private static final QName L$0 = new QName("", "l");
   private static final QName T$2 = new QName("", "t");
   private static final QName R$4 = new QName("", "r");
   private static final QName B$6 = new QName("", "b");


   public CTRelativeRectImpl(SchemaType var1) {
      super(var1);
   }

   public int getL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(L$0);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(L$0);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(L$0);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(L$0);
         }

         return var2;
      }
   }

   public boolean isSetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(L$0) != null;
      }
   }

   public void setL(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(L$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(L$0);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetL(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(L$0);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(L$0);
         }

         var3.set(var1);
      }
   }

   public void unsetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(L$0);
      }
   }

   public int getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(T$2);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(T$2);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(T$2);
         }

         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(T$2) != null;
      }
   }

   public void setT(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$2);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetT(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(T$2);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(T$2);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(T$2);
      }
   }

   public int getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(R$4);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(R$4);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(R$4);
         }

         return var2;
      }
   }

   public boolean isSetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(R$4) != null;
      }
   }

   public void setR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R$4);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetR(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(R$4);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(R$4);
         }

         var3.set(var1);
      }
   }

   public void unsetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(R$4);
      }
   }

   public int getB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(B$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(B$6);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(B$6);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(B$6);
         }

         return var2;
      }
   }

   public boolean isSetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(B$6) != null;
      }
   }

   public void setB(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(B$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(B$6);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetB(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(B$6);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(B$6);
         }

         var3.set(var1);
      }
   }

   public void unsetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(B$6);
      }
   }

}
