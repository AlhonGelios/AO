package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectFrameLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;

public class CTNonVisualGraphicFramePropertiesImpl extends XmlComplexContentImpl implements CTNonVisualGraphicFrameProperties {

   private static final QName GRAPHICFRAMELOCKS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphicFrameLocks");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");


   public CTNonVisualGraphicFramePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTGraphicalObjectFrameLocking getGraphicFrameLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrameLocking var2 = null;
         var2 = (CTGraphicalObjectFrameLocking)this.get_store().find_element_user(GRAPHICFRAMELOCKS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGraphicFrameLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRAPHICFRAMELOCKS$0) != 0;
      }
   }

   public void setGraphicFrameLocks(CTGraphicalObjectFrameLocking var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrameLocking var3 = null;
         var3 = (CTGraphicalObjectFrameLocking)this.get_store().find_element_user(GRAPHICFRAMELOCKS$0, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObjectFrameLocking)this.get_store().add_element_user(GRAPHICFRAMELOCKS$0);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObjectFrameLocking addNewGraphicFrameLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrameLocking var2 = null;
         var2 = (CTGraphicalObjectFrameLocking)this.get_store().add_element_user(GRAPHICFRAMELOCKS$0);
         return var2;
      }
   }

   public void unsetGraphicFrameLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRAPHICFRAMELOCKS$0, 0);
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
