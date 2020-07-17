package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect;
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate;

public class CTGeomRectImpl extends XmlComplexContentImpl implements CTGeomRect {

   private static final QName L$0 = new QName("", "l");
   private static final QName T$2 = new QName("", "t");
   private static final QName R$4 = new QName("", "r");
   private static final QName B$6 = new QName("", "b");


   public CTGeomRectImpl(SchemaType var1) {
      super(var1);
   }

   public Object getL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(L$0);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STAdjCoordinate xgetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var2 = null;
         var2 = (STAdjCoordinate)this.get_store().find_attribute_user(L$0);
         return var2;
      }
   }

   public void setL(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(L$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(L$0);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetL(STAdjCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var3 = null;
         var3 = (STAdjCoordinate)this.get_store().find_attribute_user(L$0);
         if(var3 == null) {
            var3 = (STAdjCoordinate)this.get_store().add_attribute_user(L$0);
         }

         var3.set(var1);
      }
   }

   public Object getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$2);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STAdjCoordinate xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var2 = null;
         var2 = (STAdjCoordinate)this.get_store().find_attribute_user(T$2);
         return var2;
      }
   }

   public void setT(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$2);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetT(STAdjCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var3 = null;
         var3 = (STAdjCoordinate)this.get_store().find_attribute_user(T$2);
         if(var3 == null) {
            var3 = (STAdjCoordinate)this.get_store().add_attribute_user(T$2);
         }

         var3.set(var1);
      }
   }

   public Object getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$4);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STAdjCoordinate xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var2 = null;
         var2 = (STAdjCoordinate)this.get_store().find_attribute_user(R$4);
         return var2;
      }
   }

   public void setR(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R$4);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetR(STAdjCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var3 = null;
         var3 = (STAdjCoordinate)this.get_store().find_attribute_user(R$4);
         if(var3 == null) {
            var3 = (STAdjCoordinate)this.get_store().add_attribute_user(R$4);
         }

         var3.set(var1);
      }
   }

   public Object getB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(B$6);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STAdjCoordinate xgetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var2 = null;
         var2 = (STAdjCoordinate)this.get_store().find_attribute_user(B$6);
         return var2;
      }
   }

   public void setB(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(B$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(B$6);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetB(STAdjCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var3 = null;
         var3 = (STAdjCoordinate)this.get_store().find_attribute_user(B$6);
         if(var3 == null) {
            var3 = (STAdjCoordinate)this.get_store().add_attribute_user(B$6);
         }

         var3.set(var1);
      }
   }

}
