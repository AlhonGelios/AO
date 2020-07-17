package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLinearShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STTileFlipMode$Enum;

public class CTGradientFillPropertiesImpl extends XmlComplexContentImpl implements CTGradientFillProperties {

   private static final QName GSLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gsLst");
   private static final QName LIN$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lin");
   private static final QName PATH$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "path");
   private static final QName TILERECT$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tileRect");
   private static final QName FLIP$8 = new QName("", "flip");
   private static final QName ROTWITHSHAPE$10 = new QName("", "rotWithShape");


   public CTGradientFillPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTGradientStopList getGsLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStopList var2 = null;
         var2 = (CTGradientStopList)this.get_store().find_element_user(GSLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGsLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GSLST$0) != 0;
      }
   }

   public void setGsLst(CTGradientStopList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStopList var3 = null;
         var3 = (CTGradientStopList)this.get_store().find_element_user(GSLST$0, 0);
         if(var3 == null) {
            var3 = (CTGradientStopList)this.get_store().add_element_user(GSLST$0);
         }

         var3.set(var1);
      }
   }

   public CTGradientStopList addNewGsLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientStopList var2 = null;
         var2 = (CTGradientStopList)this.get_store().add_element_user(GSLST$0);
         return var2;
      }
   }

   public void unsetGsLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GSLST$0, 0);
      }
   }

   public CTLinearShadeProperties getLin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLinearShadeProperties var2 = null;
         var2 = (CTLinearShadeProperties)this.get_store().find_element_user(LIN$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LIN$2) != 0;
      }
   }

   public void setLin(CTLinearShadeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLinearShadeProperties var3 = null;
         var3 = (CTLinearShadeProperties)this.get_store().find_element_user(LIN$2, 0);
         if(var3 == null) {
            var3 = (CTLinearShadeProperties)this.get_store().add_element_user(LIN$2);
         }

         var3.set(var1);
      }
   }

   public CTLinearShadeProperties addNewLin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLinearShadeProperties var2 = null;
         var2 = (CTLinearShadeProperties)this.get_store().add_element_user(LIN$2);
         return var2;
      }
   }

   public void unsetLin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LIN$2, 0);
      }
   }

   public CTPathShadeProperties getPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPathShadeProperties var2 = null;
         var2 = (CTPathShadeProperties)this.get_store().find_element_user(PATH$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATH$4) != 0;
      }
   }

   public void setPath(CTPathShadeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPathShadeProperties var3 = null;
         var3 = (CTPathShadeProperties)this.get_store().find_element_user(PATH$4, 0);
         if(var3 == null) {
            var3 = (CTPathShadeProperties)this.get_store().add_element_user(PATH$4);
         }

         var3.set(var1);
      }
   }

   public CTPathShadeProperties addNewPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPathShadeProperties var2 = null;
         var2 = (CTPathShadeProperties)this.get_store().add_element_user(PATH$4);
         return var2;
      }
   }

   public void unsetPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATH$4, 0);
      }
   }

   public CTRelativeRect getTileRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().find_element_user(TILERECT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTileRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TILERECT$6) != 0;
      }
   }

   public void setTileRect(CTRelativeRect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var3 = null;
         var3 = (CTRelativeRect)this.get_store().find_element_user(TILERECT$6, 0);
         if(var3 == null) {
            var3 = (CTRelativeRect)this.get_store().add_element_user(TILERECT$6);
         }

         var3.set(var1);
      }
   }

   public CTRelativeRect addNewTileRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().add_element_user(TILERECT$6);
         return var2;
      }
   }

   public void unsetTileRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TILERECT$6, 0);
      }
   }

   public STTileFlipMode$Enum getFlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FLIP$8);
         return var2 == null?null:(STTileFlipMode$Enum)var2.getEnumValue();
      }
   }

   public STTileFlipMode xgetFlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTileFlipMode var2 = null;
         var2 = (STTileFlipMode)this.get_store().find_attribute_user(FLIP$8);
         return var2;
      }
   }

   public boolean isSetFlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FLIP$8) != null;
      }
   }

   public void setFlip(STTileFlipMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FLIP$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FLIP$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFlip(STTileFlipMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTileFlipMode var3 = null;
         var3 = (STTileFlipMode)this.get_store().find_attribute_user(FLIP$8);
         if(var3 == null) {
            var3 = (STTileFlipMode)this.get_store().add_attribute_user(FLIP$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FLIP$8);
      }
   }

   public boolean getRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROTWITHSHAPE$10);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ROTWITHSHAPE$10);
         return var2;
      }
   }

   public boolean isSetRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROTWITHSHAPE$10) != null;
      }
   }

   public void setRotWithShape(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROTWITHSHAPE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROTWITHSHAPE$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRotWithShape(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ROTWITHSHAPE$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ROTWITHSHAPE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetRotWithShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROTWITHSHAPE$10);
      }
   }

}
