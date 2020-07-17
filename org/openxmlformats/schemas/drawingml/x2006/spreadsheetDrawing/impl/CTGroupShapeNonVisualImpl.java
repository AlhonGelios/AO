package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGroupDrawingShapeProps;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGroupShapeNonVisual;

public class CTGroupShapeNonVisualImpl extends XmlComplexContentImpl implements CTGroupShapeNonVisual {

   private static final QName CNVPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cNvPr");
   private static final QName CNVGRPSPPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "cNvGrpSpPr");


   public CTGroupShapeNonVisualImpl(SchemaType var1) {
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

   public CTNonVisualGroupDrawingShapeProps getCNvGrpSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGroupDrawingShapeProps var2 = null;
         var2 = (CTNonVisualGroupDrawingShapeProps)this.get_store().find_element_user(CNVGRPSPPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCNvGrpSpPr(CTNonVisualGroupDrawingShapeProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGroupDrawingShapeProps var3 = null;
         var3 = (CTNonVisualGroupDrawingShapeProps)this.get_store().find_element_user(CNVGRPSPPR$2, 0);
         if(var3 == null) {
            var3 = (CTNonVisualGroupDrawingShapeProps)this.get_store().add_element_user(CNVGRPSPPR$2);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualGroupDrawingShapeProps addNewCNvGrpSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGroupDrawingShapeProps var2 = null;
         var2 = (CTNonVisualGroupDrawingShapeProps)this.get_store().add_element_user(CNVGRPSPPR$2);
         return var2;
      }
   }

}
