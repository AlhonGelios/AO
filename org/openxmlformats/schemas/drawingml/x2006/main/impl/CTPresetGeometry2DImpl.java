package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuideList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STShapeType;

public class CTPresetGeometry2DImpl extends XmlComplexContentImpl implements CTPresetGeometry2D {

   private static final QName AVLST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "avLst");
   private static final QName PRST$2 = new QName("", "prst");


   public CTPresetGeometry2DImpl(SchemaType var1) {
      super(var1);
   }

   public CTGeomGuideList getAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var2 = null;
         var2 = (CTGeomGuideList)this.get_store().find_element_user(AVLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AVLST$0) != 0;
      }
   }

   public void setAvLst(CTGeomGuideList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var3 = null;
         var3 = (CTGeomGuideList)this.get_store().find_element_user(AVLST$0, 0);
         if(var3 == null) {
            var3 = (CTGeomGuideList)this.get_store().add_element_user(AVLST$0);
         }

         var3.set(var1);
      }
   }

   public CTGeomGuideList addNewAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGeomGuideList var2 = null;
         var2 = (CTGeomGuideList)this.get_store().add_element_user(AVLST$0);
         return var2;
      }
   }

   public void unsetAvLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AVLST$0, 0);
      }
   }

   public STShapeType.Enum getPrst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRST$2);
         return var2 == null?null:(STShapeType.Enum)var2.getEnumValue();
      }
   }

   public STShapeType xgetPrst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShapeType var2 = null;
         var2 = (STShapeType)this.get_store().find_attribute_user(PRST$2);
         return var2;
      }
   }

   public void setPrst(STShapeType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRST$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRST$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPrst(STShapeType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShapeType var3 = null;
         var3 = (STShapeType)this.get_store().find_attribute_user(PRST$2);
         if(var3 == null) {
            var3 = (STShapeType)this.get_store().add_attribute_user(PRST$2);
         }

         var3.set(var1);
      }
   }

}
