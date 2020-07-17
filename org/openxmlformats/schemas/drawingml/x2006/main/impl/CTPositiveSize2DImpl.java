package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveCoordinate;

public class CTPositiveSize2DImpl extends XmlComplexContentImpl implements CTPositiveSize2D {

   private static final QName CX$0 = new QName("", "cx");
   private static final QName CY$2 = new QName("", "cy");


   public CTPositiveSize2DImpl(SchemaType var1) {
      super(var1);
   }

   public long getCx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CX$0);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STPositiveCoordinate xgetCx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var2 = null;
         var2 = (STPositiveCoordinate)this.get_store().find_attribute_user(CX$0);
         return var2;
      }
   }

   public void setCx(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CX$0);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CX$0);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCx(STPositiveCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var3 = null;
         var3 = (STPositiveCoordinate)this.get_store().find_attribute_user(CX$0);
         if(var3 == null) {
            var3 = (STPositiveCoordinate)this.get_store().add_attribute_user(CX$0);
         }

         var3.set(var1);
      }
   }

   public long getCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CY$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STPositiveCoordinate xgetCy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var2 = null;
         var2 = (STPositiveCoordinate)this.get_store().find_attribute_user(CY$2);
         return var2;
      }
   }

   public void setCy(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CY$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CY$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCy(STPositiveCoordinate var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveCoordinate var3 = null;
         var3 = (STPositiveCoordinate)this.get_store().find_attribute_user(CY$2);
         if(var3 == null) {
            var3 = (STPositiveCoordinate)this.get_store().add_attribute_user(CY$2);
         }

         var3.set(var1);
      }
   }

}
