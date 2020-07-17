package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPathShadeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.STPathShadeType;

public class CTPathShadePropertiesImpl extends XmlComplexContentImpl implements CTPathShadeProperties {

   private static final QName FILLTORECT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillToRect");
   private static final QName PATH$2 = new QName("", "path");


   public CTPathShadePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTRelativeRect getFillToRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().find_element_user(FILLTORECT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFillToRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILLTORECT$0) != 0;
      }
   }

   public void setFillToRect(CTRelativeRect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var3 = null;
         var3 = (CTRelativeRect)this.get_store().find_element_user(FILLTORECT$0, 0);
         if(var3 == null) {
            var3 = (CTRelativeRect)this.get_store().add_element_user(FILLTORECT$0);
         }

         var3.set(var1);
      }
   }

   public CTRelativeRect addNewFillToRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().add_element_user(FILLTORECT$0);
         return var2;
      }
   }

   public void unsetFillToRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILLTORECT$0, 0);
      }
   }

   public STPathShadeType.Enum getPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PATH$2);
         return var2 == null?null:(STPathShadeType.Enum)var2.getEnumValue();
      }
   }

   public STPathShadeType xgetPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPathShadeType var2 = null;
         var2 = (STPathShadeType)this.get_store().find_attribute_user(PATH$2);
         return var2;
      }
   }

   public boolean isSetPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PATH$2) != null;
      }
   }

   public void setPath(STPathShadeType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PATH$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PATH$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPath(STPathShadeType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPathShadeType var3 = null;
         var3 = (STPathShadeType)this.get_store().find_attribute_user(PATH$2);
         if(var3 == null) {
            var3 = (STPathShadeType)this.get_store().add_attribute_user(PATH$2);
         }

         var3.set(var1);
      }
   }

   public void unsetPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PATH$2);
      }
   }

}
