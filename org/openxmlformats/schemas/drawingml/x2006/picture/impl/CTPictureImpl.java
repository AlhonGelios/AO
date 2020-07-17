package org.openxmlformats.schemas.drawingml.x2006.picture.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPictureNonVisual;

public class CTPictureImpl extends XmlComplexContentImpl implements CTPicture {

   private static final QName NVPICPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/picture", "nvPicPr");
   private static final QName BLIPFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/picture", "blipFill");
   private static final QName SPPR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/picture", "spPr");


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

}
