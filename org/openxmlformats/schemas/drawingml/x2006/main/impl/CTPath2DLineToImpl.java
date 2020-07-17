package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo;

public class CTPath2DLineToImpl extends XmlComplexContentImpl implements CTPath2DLineTo {

   private static final QName PT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pt");


   public CTPath2DLineToImpl(SchemaType var1) {
      super(var1);
   }

   public CTAdjPoint2D getPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var2 = null;
         var2 = (CTAdjPoint2D)this.get_store().find_element_user(PT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPt(CTAdjPoint2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var3 = null;
         var3 = (CTAdjPoint2D)this.get_store().find_element_user(PT$0, 0);
         if(var3 == null) {
            var3 = (CTAdjPoint2D)this.get_store().add_element_user(PT$0);
         }

         var3.set(var1);
      }
   }

   public CTAdjPoint2D addNewPt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAdjPoint2D var2 = null;
         var2 = (CTAdjPoint2D)this.get_store().add_element_user(PT$0);
         return var2;
      }
   }

}
