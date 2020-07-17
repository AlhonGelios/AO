package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;

public class CTNonVisualGroupDrawingShapePropsImpl extends XmlComplexContentImpl implements CTNonVisualGroupDrawingShapeProps {

   private static final QName GRPSPLOCKS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpSpLocks");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");


   public CTNonVisualGroupDrawingShapePropsImpl(SchemaType var1) {
      super(var1);
   }

   public CTGroupLocking getGrpSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupLocking var2 = null;
         var2 = (CTGroupLocking)this.get_store().find_element_user(GRPSPLOCKS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPSPLOCKS$0) != 0;
      }
   }

   public void setGrpSpLocks(CTGroupLocking var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupLocking var3 = null;
         var3 = (CTGroupLocking)this.get_store().find_element_user(GRPSPLOCKS$0, 0);
         if(var3 == null) {
            var3 = (CTGroupLocking)this.get_store().add_element_user(GRPSPLOCKS$0);
         }

         var3.set(var1);
      }
   }

   public CTGroupLocking addNewGrpSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupLocking var2 = null;
         var2 = (CTGroupLocking)this.get_store().add_element_user(GRPSPLOCKS$0);
         return var2;
      }
   }

   public void unsetGrpSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPSPLOCKS$0, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

}
