package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrameNonVisual;

public class CTGraphicalObjectFrameImpl extends XmlComplexContentImpl implements CTGraphicalObjectFrame {

   private static final QName NVGRAPHICFRAMEPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvGraphicFramePr");
   private static final QName XFRM$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "xfrm");
   private static final QName GRAPHIC$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");


   public CTGraphicalObjectFrameImpl(SchemaType var1) {
      super(var1);
   }

   public CTGraphicalObjectFrameNonVisual getNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrameNonVisual var2 = null;
         var2 = (CTGraphicalObjectFrameNonVisual)this.get_store().find_element_user(NVGRAPHICFRAMEPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNvGraphicFramePr(CTGraphicalObjectFrameNonVisual var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrameNonVisual var3 = null;
         var3 = (CTGraphicalObjectFrameNonVisual)this.get_store().find_element_user(NVGRAPHICFRAMEPR$0, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObjectFrameNonVisual)this.get_store().add_element_user(NVGRAPHICFRAMEPR$0);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObjectFrameNonVisual addNewNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObjectFrameNonVisual var2 = null;
         var2 = (CTGraphicalObjectFrameNonVisual)this.get_store().add_element_user(NVGRAPHICFRAMEPR$0);
         return var2;
      }
   }

   public CTTransform2D getXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTransform2D var2 = null;
         var2 = (CTTransform2D)this.get_store().find_element_user(XFRM$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setXfrm(CTTransform2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTransform2D var3 = null;
         var3 = (CTTransform2D)this.get_store().find_element_user(XFRM$2, 0);
         if(var3 == null) {
            var3 = (CTTransform2D)this.get_store().add_element_user(XFRM$2);
         }

         var3.set(var1);
      }
   }

   public CTTransform2D addNewXfrm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTransform2D var2 = null;
         var2 = (CTTransform2D)this.get_store().add_element_user(XFRM$2);
         return var2;
      }
   }

   public CTGraphicalObject getGraphic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var2 = null;
         var2 = (CTGraphicalObject)this.get_store().find_element_user(GRAPHIC$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setGraphic(CTGraphicalObject var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var3 = null;
         var3 = (CTGraphicalObject)this.get_store().find_element_user(GRAPHIC$4, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObject)this.get_store().add_element_user(GRAPHIC$4);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObject addNewGraphic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var2 = null;
         var2 = (CTGraphicalObject)this.get_store().add_element_user(GRAPHIC$4);
         return var2;
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

}
