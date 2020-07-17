package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPictureNonVisual;

public class CTPictureImpl extends XmlComplexContentImpl implements CTPicture {

   private static final QName NVPICPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvPicPr");
   private static final QName BLIPFILL$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "blipFill");
   private static final QName SPPR$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "spPr");
   private static final QName STYLE$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "style");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");


   public CTPictureImpl(SchemaType var1) {
      super(var1);
   }

   public CTPictureNonVisual getNvPicPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPictureNonVisual var2 = null;
         var2 = (CTPictureNonVisual)this.get_store().find_element_user(NVPICPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNvPicPr(CTPictureNonVisual var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPictureNonVisual var3 = null;
         var3 = (CTPictureNonVisual)this.get_store().find_element_user(NVPICPR$0, 0);
         if(var3 == null) {
            var3 = (CTPictureNonVisual)this.get_store().add_element_user(NVPICPR$0);
         }

         var3.set(var1);
      }
   }

   public CTPictureNonVisual addNewNvPicPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPictureNonVisual var2 = null;
         var2 = (CTPictureNonVisual)this.get_store().add_element_user(NVPICPR$0);
         return var2;
      }
   }

   public CTBlipFillProperties getBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setBlipFill(CTBlipFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$2, 0);
         if(var3 == null) {
            var3 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$2);
         }

         var3.set(var1);
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$2);
         return var2;
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$4, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$4);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$4);
         return var2;
      }
   }

   public CTShapeStyle getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var2 = null;
         var2 = (CTShapeStyle)this.get_store().find_element_user(STYLE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLE$6) != 0;
      }
   }

   public void setStyle(CTShapeStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var3 = null;
         var3 = (CTShapeStyle)this.get_store().find_element_user(STYLE$6, 0);
         if(var3 == null) {
            var3 = (CTShapeStyle)this.get_store().add_element_user(STYLE$6);
         }

         var3.set(var1);
      }
   }

   public CTShapeStyle addNewStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var2 = null;
         var2 = (CTShapeStyle)this.get_store().add_element_user(STYLE$6);
         return var2;
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLE$6, 0);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$8);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$8, 0);
      }
   }

}
