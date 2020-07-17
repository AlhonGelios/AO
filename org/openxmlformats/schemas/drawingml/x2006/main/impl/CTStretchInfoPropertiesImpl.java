package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRelativeRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStretchInfoProperties;

public class CTStretchInfoPropertiesImpl extends XmlComplexContentImpl implements CTStretchInfoProperties {

   private static final QName FILLRECT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRect");


   public CTStretchInfoPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTRelativeRect getFillRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().find_element_user(FILLRECT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFillRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILLRECT$0) != 0;
      }
   }

   public void setFillRect(CTRelativeRect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var3 = null;
         var3 = (CTRelativeRect)this.get_store().find_element_user(FILLRECT$0, 0);
         if(var3 == null) {
            var3 = (CTRelativeRect)this.get_store().add_element_user(FILLRECT$0);
         }

         var3.set(var1);
      }
   }

   public CTRelativeRect addNewFillRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRelativeRect var2 = null;
         var2 = (CTRelativeRect)this.get_store().add_element_user(FILLRECT$0);
         return var2;
      }
   }

   public void unsetFillRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILLRECT$0, 0);
      }
   }

}
