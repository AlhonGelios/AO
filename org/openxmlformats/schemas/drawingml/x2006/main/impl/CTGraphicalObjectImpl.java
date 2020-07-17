package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;

public class CTGraphicalObjectImpl extends XmlComplexContentImpl implements CTGraphicalObject {

   private static final QName GRAPHICDATA$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphicData");


   public CTGraphicalObjectImpl(SchemaType var1) {
      super(var1);
   }

   public CTGraphicalObjectData getGraphicData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectData var2 = null;
         var2 = (CTGraphicalObjectData)this.get_store().find_element_user(GRAPHICDATA$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setGraphicData(CTGraphicalObjectData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectData var3 = null;
         var3 = (CTGraphicalObjectData)this.get_store().find_element_user(GRAPHICDATA$0, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObjectData)this.get_store().add_element_user(GRAPHICDATA$0);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObjectData addNewGraphicData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectData var2 = null;
         var2 = (CTGraphicalObjectData)this.get_store().add_element_user(GRAPHICDATA$0);
         return var2;
      }
   }

}
