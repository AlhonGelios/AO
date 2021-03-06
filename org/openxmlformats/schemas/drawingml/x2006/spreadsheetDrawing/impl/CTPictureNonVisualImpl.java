package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPictureNonVisual;

public class CTPictureNonVisualImpl extends XmlComplexContentImpl implements CTPictureNonVisual {

   private static final QName CNVPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cNvPr");
   private static final QName CNVPICPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cNvPicPr");


   public CTPictureNonVisualImpl(SchemaType var1) {
      super(var1);
   }

   public CTNonVisualDrawingProps getCNvPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var2 = null;
         var2 = (CTNonVisualDrawingProps)this.get_store().find_element_user(CNVPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCNvPr(CTNonVisualDrawingProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var3 = null;
         var3 = (CTNonVisualDrawingProps)this.get_store().find_element_user(CNVPR$0, 0);
         if(var3 == null) {
            var3 = (CTNonVisualDrawingProps)this.get_store().add_element_user(CNVPR$0);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualDrawingProps addNewCNvPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var2 = null;
         var2 = (CTNonVisualDrawingProps)this.get_store().add_element_user(CNVPR$0);
         return var2;
      }
   }

   public CTNonVisualPictureProperties getCNvPicPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualPictureProperties var2 = null;
         var2 = (CTNonVisualPictureProperties)this.get_store().find_element_user(CNVPICPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCNvPicPr(CTNonVisualPictureProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualPictureProperties var3 = null;
         var3 = (CTNonVisualPictureProperties)this.get_store().find_element_user(CNVPICPR$2, 0);
         if(var3 == null) {
            var3 = (CTNonVisualPictureProperties)this.get_store().add_element_user(CNVPICPR$2);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualPictureProperties addNewCNvPicPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualPictureProperties var2 = null;
         var2 = (CTNonVisualPictureProperties)this.get_store().add_element_user(CNVPICPR$2);
         return var2;
      }
   }

}
