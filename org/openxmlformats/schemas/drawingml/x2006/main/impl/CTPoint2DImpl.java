package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;

public class CTPoint2DImpl extends XmlComplexContentImpl implements CTPoint2D {

   private static final QName X$0 = new QName("", "x");
   private static final QName Y$2 = new QName("", "y");


   public CTPoint2DImpl(SchemaType var1) {
      super(var1);
   }

   public long getX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(X$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCoordinate xgetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var2 = null;
         var2 = (STCoordinate)this.get_store().find_attribute_user(X$0);
         return var2;
      }
   }

   public void setX(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(X$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(X$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetX(STCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var3 = null;
         var3 = (STCoordinate)this.get_store().find_attribute_user(X$0);
         if(var3 == null) {
            var3 = (STCoordinate)this.get_store().add_attribute_user(X$0);
         }

         var3.set(var1);
      }
   }

   public long getY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(Y$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STCoordinate xgetY() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var2 = null;
         var2 = (STCoordinate)this.get_store().find_attribute_user(Y$2);
         return var2;
      }
   }

   public void setY(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(Y$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(Y$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetY(STCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate var3 = null;
         var3 = (STCoordinate)this.get_store().find_attribute_user(Y$2);
         if(var3 == null) {
            var3 = (STCoordinate)this.get_store().add_attribute_user(Y$2);
         }

         var3.set(var1);
      }
   }

}
