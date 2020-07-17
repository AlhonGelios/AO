package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrameNonVisual;

public class CTGraphicalObjectFrameNonVisualImpl extends XmlComplexContentImpl implements CTGraphicalObjectFrameNonVisual {

   private static final QName CNVPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cNvPr");
   private static final QName CNVGRAPHICFRAMEPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cNvGraphicFramePr");


   public CTGraphicalObjectFrameNonVisualImpl(SchemaType var1) {
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

   public CTNonVisualGraphicFrameProperties getCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var2 = null;
         var2 = (CTNonVisualGraphicFrameProperties)this.get_store().find_element_user(CNVGRAPHICFRAMEPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCNvGraphicFramePr(CTNonVisualGraphicFrameProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var3 = null;
         var3 = (CTNonVisualGraphicFrameProperties)this.get_store().find_element_user(CNVGRAPHICFRAMEPR$2, 0);
         if(var3 == null) {
            var3 = (CTNonVisualGraphicFrameProperties)this.get_store().add_element_user(CNVGRAPHICFRAMEPR$2);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var2 = null;
         var2 = (CTNonVisualGraphicFrameProperties)this.get_store().add_element_user(CNVGRAPHICFRAMEPR$2);
         return var2;
      }
   }

}
