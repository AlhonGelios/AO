package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingShapeProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShapeNonVisual;

public class CTShapeNonVisualImpl extends XmlComplexContentImpl implements CTShapeNonVisual {

   private static final QName CNVPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cNvPr");
   private static final QName CNVSPPR$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cNvSpPr");
   private static final QName NVPR$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvPr");


   public CTShapeNonVisualImpl(SchemaType var1) {
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

   public CTNonVisualDrawingShapeProps getCNvSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingShapeProps var2 = null;
         var2 = (CTNonVisualDrawingShapeProps)this.get_store().find_element_user(CNVSPPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCNvSpPr(CTNonVisualDrawingShapeProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingShapeProps var3 = null;
         var3 = (CTNonVisualDrawingShapeProps)this.get_store().find_element_user(CNVSPPR$2, 0);
         if(var3 == null) {
            var3 = (CTNonVisualDrawingShapeProps)this.get_store().add_element_user(CNVSPPR$2);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualDrawingShapeProps addNewCNvSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingShapeProps var2 = null;
         var2 = (CTNonVisualDrawingShapeProps)this.get_store().add_element_user(CNVSPPR$2);
         return var2;
      }
   }

   public CTApplicationNonVisualDrawingProps getNvPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTApplicationNonVisualDrawingProps var2 = null;
         var2 = (CTApplicationNonVisualDrawingProps)this.get_store().find_element_user(NVPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNvPr(CTApplicationNonVisualDrawingProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTApplicationNonVisualDrawingProps var3 = null;
         var3 = (CTApplicationNonVisualDrawingProps)this.get_store().find_element_user(NVPR$4, 0);
         if(var3 == null) {
            var3 = (CTApplicationNonVisualDrawingProps)this.get_store().add_element_user(NVPR$4);
         }

         var3.set(var1);
      }
   }

   public CTApplicationNonVisualDrawingProps addNewNvPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTApplicationNonVisualDrawingProps var2 = null;
         var2 = (CTApplicationNonVisualDrawingProps)this.get_store().add_element_user(NVPR$4);
         return var2;
      }
   }

}
