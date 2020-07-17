package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTileInfoProperties;

public class CTBlipFillPropertiesImpl extends XmlComplexContentImpl implements CTBlipFillProperties {

   private static final QName BLIP$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blip");
   private static final QName SRCRECT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "srcRect");
   private static final QName TILE$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tile");
   private static final QName STRETCH$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "stretch");
   private static final QName DPI$8 = new QName("", "dpi");
   private static final QName ROTWITHSHAPE$10 = new QName("", "rotWithShape");


   public CTBlipFillPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTBlip getBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlip var2 = null;
         var2 = (CTBlip)this.get_store().find_element_user(BLIP$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIP$0) != 0;
      }
   }

   public void setBlip(CTBlip var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlip var3 = null;
         var3 = (CTBlip)this.get_store().find_element_user(BLIP$0, 0);
         if(var3 == null) {
            var3 = (CTBlip)this.get_store().add_element_user(BLIP$0);
         }

         var3.set(var1);
      }
   }

   public CTBlip addNewBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlip var2 = null;
         var2 = (CTBlip)this.get_store().add_element_user(BLIP$0);
         return var2;
      }
   }

   public void unsetBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIP$0, 0);
      }
   }

   public CTRelativeRect getSrcRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().find_element_user(SRCRECT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSrcRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SRCRECT$2) != 0;
      }
   }

   public void setSrcRect(CTRelativeRect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var3 = null;
         var3 = (CTRelativeRect)this.get_store().find_element_user(SRCRECT$2, 0);
         if(var3 == null) {
            var3 = (CTRelativeRect)this.get_store().add_element_user(SRCRECT$2);
         }

         var3.set(var1);
      }
   }

   public CTRelativeRect addNewSrcRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().add_element_user(SRCRECT$2);
         return var2;
      }
   }

   public void unsetSrcRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SRCRECT$2, 0);
      }
   }

   public CTTileInfoProperties getTile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTileInfoProperties var2 = null;
         var2 = (CTTileInfoProperties)this.get_store().find_element_user(TILE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TILE$4) != 0;
      }
   }

   public void setTile(CTTileInfoProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTileInfoProperties var3 = null;
         var3 = (CTTileInfoProperties)this.get_store().find_element_user(TILE$4, 0);
         if(var3 == null) {
            var3 = (CTTileInfoProperties)this.get_store().add_element_user(TILE$4);
         }

         var3.set(var1);
      }
   }

   public CTTileInfoProperties addNewTile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTileInfoProperties var2 = null;
         var2 = (CTTileInfoProperties)this.get_store().add_element_user(TILE$4);
         return var2;
      }
   }

   public void unsetTile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TILE$4, 0);
      }
   }

   public CTStretchInfoProperties getStretch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStretchInfoProperties var2 = null;
         var2 = (CTStretchInfoProperties)this.get_store().find_element_user(STRETCH$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStretch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRETCH$6) != 0;
      }
   }

   public void setStretch(CTStretchInfoProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStretchInfoProperties var3 = null;
         var3 = (CTStretchInfoProperties)this.get_store().find_element_user(STRETCH$6, 0);
         if(var3 == null) {
            var3 = (CTStretchInfoProperties)this.get_store().add_element_user(STRETCH$6);
         }

         var3.set(var1);
      }
   }

   public CTStretchInfoProperties addNewStretch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStretchInfoProperties var2 = null;
         var2 = (CTStretchInfoProperties)this.get_store().add_element_user(STRETCH$6);
         return var2;
      }
   }

   public void unsetStretch() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRETCH$6, 0);
      }
   }

   public long getDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DPI$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DPI$8);
         return var2;
      }
   }

   public boolean isSetDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DPI$8) != null;
      }
   }

   public void setDpi(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DPI$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DPI$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDpi(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DPI$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DPI$8);
         }

         var3.set(var1);
      }
   }

   public void unsetDpi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DPI$8);
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
