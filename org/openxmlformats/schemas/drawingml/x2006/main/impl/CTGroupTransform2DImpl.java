package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STAngle;

public class CTGroupTransform2DImpl extends XmlComplexContentImpl implements CTGroupTransform2D {

   private static final QName OFF$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "off");
   private static final QName EXT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ext");
   private static final QName CHOFF$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "chOff");
   private static final QName CHEXT$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "chExt");
   private static final QName ROT$8 = new QName("", "rot");
   private static final QName FLIPH$10 = new QName("", "flipH");
   private static final QName FLIPV$12 = new QName("", "flipV");


   public CTGroupTransform2DImpl(SchemaType var1) {
      super(var1);
   }

   public CTPoint2D getOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().find_element_user(OFF$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OFF$0) != 0;
      }
   }

   public void setOff(CTPoint2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var3 = null;
         var3 = (CTPoint2D)this.get_store().find_element_user(OFF$0, 0);
         if(var3 == null) {
            var3 = (CTPoint2D)this.get_store().add_element_user(OFF$0);
         }

         var3.set(var1);
      }
   }

   public CTPoint2D addNewOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().add_element_user(OFF$0);
         return var2;
      }
   }

   public void unsetOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OFF$0, 0);
      }
   }

   public CTPositiveSize2D getExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().find_element_user(EXT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXT$2) != 0;
      }
   }

   public void setExt(CTPositiveSize2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var3 = null;
         var3 = (CTPositiveSize2D)this.get_store().find_element_user(EXT$2, 0);
         if(var3 == null) {
            var3 = (CTPositiveSize2D)this.get_store().add_element_user(EXT$2);
         }

         var3.set(var1);
      }
   }

   public CTPositiveSize2D addNewExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().add_element_user(EXT$2);
         return var2;
      }
   }

   public void unsetExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXT$2, 0);
      }
   }

   public CTPoint2D getChOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().find_element_user(CHOFF$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetChOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHOFF$4) != 0;
      }
   }

   public void setChOff(CTPoint2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var3 = null;
         var3 = (CTPoint2D)this.get_store().find_element_user(CHOFF$4, 0);
         if(var3 == null) {
            var3 = (CTPoint2D)this.get_store().add_element_user(CHOFF$4);
         }

         var3.set(var1);
      }
   }

   public CTPoint2D addNewChOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().add_element_user(CHOFF$4);
         return var2;
      }
   }

   public void unsetChOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHOFF$4, 0);
      }
   }

   public CTPositiveSize2D getChExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().find_element_user(CHEXT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetChExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHEXT$6) != 0;
      }
   }

   public void setChExt(CTPositiveSize2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var3 = null;
         var3 = (CTPositiveSize2D)this.get_store().find_element_user(CHEXT$6, 0);
         if(var3 == null) {
            var3 = (CTPositiveSize2D)this.get_store().add_element_user(CHEXT$6);
         }

         var3.set(var1);
      }
   }

   public CTPositiveSize2D addNewChExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().add_element_user(CHEXT$6);
         return var2;
      }
   }

   public void unsetChExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHEXT$6, 0);
      }
   }

   public int getRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROT$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ROT$8);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STAngle xgetRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAngle var2 = null;
         var2 = (STAngle)this.get_store().find_attribute_user(ROT$8);
         if(var2 == null) {
            var2 = (STAngle)this.get_default_attribute_value(ROT$8);
         }

         return var2;
      }
   }

   public boolean isSetRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROT$8) != null;
      }
   }

   public void setRot(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROT$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROT$8);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetRot(STAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAngle var3 = null;
         var3 = (STAngle)this.get_store().find_attribute_user(ROT$8);
         if(var3 == null) {
            var3 = (STAngle)this.get_store().add_attribute_user(ROT$8);
         }

         var3.set(var1);
      }
   }

   public void unsetRot() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROT$8);
      }
   }

   public boolean getFlipH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLIPH$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FLIPH$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFlipH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FLIPH$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FLIPH$10);
         }

         return var2;
      }
   }

   public boolean isSetFlipH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FLIPH$10) != null;
      }
   }

   public void setFlipH(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FLIPH$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FLIPH$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFlipH(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FLIPH$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FLIPH$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFlipH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FLIPH$10);
      }
   }

   public boolean getFlipV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLIPV$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FLIPV$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFlipV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FLIPV$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FLIPV$12);
         }

         return var2;
      }
   }

   public boolean isSetFlipV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FLIPV$12) != null;
      }
   }

   public void setFlipV(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FLIPV$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FLIPV$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFlipV(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FLIPV$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FLIPV$12);
         }

         var3.set(var1);
      }
   }

   public void unsetFlipV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FLIPV$12);
      }
   }

}
