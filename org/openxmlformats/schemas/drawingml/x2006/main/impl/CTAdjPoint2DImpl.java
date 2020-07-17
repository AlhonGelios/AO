package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate;

public class CTAdjPoint2DImpl extends XmlComplexContentImpl implements CTAdjPoint2D {

   private static final QName X$0 = new QName("", "x");
   private static final QName Y$2 = new QName("", "y");


   public CTAdjPoint2DImpl(SchemaType var1) {
      super(var1);
   }

   public Object getX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(X$0);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STAdjCoordinate xgetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var2 = null;
         var2 = (STAdjCoordinate)this.get_store().find_attribute_user(X$0);
         return var2;
      }
   }

   public void setX(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(X$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(X$0);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetX(STAdjCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var3 = null;
         var3 = (STAdjCoordinate)this.get_store().find_attribute_user(X$0);
         if(var3 == null) {
            var3 = (STAdjCoordinate)this.get_store().add_attribute_user(X$0);
         }

         var3.set(var1);
      }
   }

   public Object getY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(Y$2);
         return var2 == null?null:var2.getObjectValue();
      }
   }

   public STAdjCoordinate xgetY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var2 = null;
         var2 = (STAdjCoordinate)this.get_store().find_attribute_user(Y$2);
         return var2;
      }
   }

   public void setY(Object var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(Y$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(Y$2);
         }

         var3.setObjectValue(var1);
      }
   }

   public void xsetY(STAdjCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAdjCoordinate var3 = null;
         var3 = (STAdjCoordinate)this.get_store().find_attribute_user(Y$2);
         if(var3 == null) {
            var3 = (STAdjCoordinate)this.get_store().add_attribute_user(Y$2);
         }

         var3.set(var1);
      }
   }

}
