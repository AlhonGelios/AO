package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance;

public class CTInlineImpl extends XmlComplexContentImpl implements CTInline {

   private static final QName EXTENT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "extent");
   private static final QName EFFECTEXTENT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "effectExtent");
   private static final QName DOCPR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "docPr");
   private static final QName CNVGRAPHICFRAMEPR$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "cNvGraphicFramePr");
   private static final QName GRAPHIC$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
   private static final QName DISTT$10 = new QName("", "distT");
   private static final QName DISTB$12 = new QName("", "distB");
   private static final QName DISTL$14 = new QName("", "distL");
   private static final QName DISTR$16 = new QName("", "distR");


   public CTInlineImpl(SchemaType var1) {
      super(var1);
   }

   public CTPositiveSize2D getExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().find_element_user(EXTENT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setExtent(CTPositiveSize2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var3 = null;
         var3 = (CTPositiveSize2D)this.get_store().find_element_user(EXTENT$0, 0);
         if(var3 == null) {
            var3 = (CTPositiveSize2D)this.get_store().add_element_user(EXTENT$0);
         }

         var3.set(var1);
      }
   }

   public CTPositiveSize2D addNewExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().add_element_user(EXTENT$0);
         return var2;
      }
   }

   public CTEffectExtent getEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectExtent var2 = null;
         var2 = (CTEffectExtent)this.get_store().find_element_user(EFFECTEXTENT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTEXTENT$2) != 0;
      }
   }

   public void setEffectExtent(CTEffectExtent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectExtent var3 = null;
         var3 = (CTEffectExtent)this.get_store().find_element_user(EFFECTEXTENT$2, 0);
         if(var3 == null) {
            var3 = (CTEffectExtent)this.get_store().add_element_user(EFFECTEXTENT$2);
         }

         var3.set(var1);
      }
   }

   public CTEffectExtent addNewEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectExtent var2 = null;
         var2 = (CTEffectExtent)this.get_store().add_element_user(EFFECTEXTENT$2);
         return var2;
      }
   }

   public void unsetEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTEXTENT$2, 0);
      }
   }

   public CTNonVisualDrawingProps getDocPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var2 = null;
         var2 = (CTNonVisualDrawingProps)this.get_store().find_element_user(DOCPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDocPr(CTNonVisualDrawingProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var3 = null;
         var3 = (CTNonVisualDrawingProps)this.get_store().find_element_user(DOCPR$4, 0);
         if(var3 == null) {
            var3 = (CTNonVisualDrawingProps)this.get_store().add_element_user(DOCPR$4);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualDrawingProps addNewDocPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var2 = null;
         var2 = (CTNonVisualDrawingProps)this.get_store().add_element_user(DOCPR$4);
         return var2;
      }
   }

   public CTNonVisualGraphicFrameProperties getCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var2 = null;
         var2 = (CTNonVisualGraphicFrameProperties)this.get_store().find_element_user(CNVGRAPHICFRAMEPR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CNVGRAPHICFRAMEPR$6) != 0;
      }
   }

   public void setCNvGraphicFramePr(CTNonVisualGraphicFrameProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var3 = null;
         var3 = (CTNonVisualGraphicFrameProperties)this.get_store().find_element_user(CNVGRAPHICFRAMEPR$6, 0);
         if(var3 == null) {
            var3 = (CTNonVisualGraphicFrameProperties)this.get_store().add_element_user(CNVGRAPHICFRAMEPR$6);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var2 = null;
         var2 = (CTNonVisualGraphicFrameProperties)this.get_store().add_element_user(CNVGRAPHICFRAMEPR$6);
         return var2;
      }
   }

   public void unsetCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CNVGRAPHICFRAMEPR$6, 0);
      }
   }

   public CTGraphicalObject getGraphic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var2 = null;
         var2 = (CTGraphicalObject)this.get_store().find_element_user(GRAPHIC$8, 0);
         return var2 == null?null:var2;
      }
   }

   public void setGraphic(CTGraphicalObject var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var3 = null;
         var3 = (CTGraphicalObject)this.get_store().find_element_user(GRAPHIC$8, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObject)this.get_store().add_element_user(GRAPHIC$8);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObject addNewGraphic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var2 = null;
         var2 = (CTGraphicalObject)this.get_store().add_element_user(GRAPHIC$8);
         return var2;
      }
   }

   public long getDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTT$10);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTT$10);
         return var2;
      }
   }

   public boolean isSetDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTT$10) != null;
      }
   }

   public void setDistT(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTT$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTT$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistT(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTT$10);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTT$10);
         }

         var3.set(var1);
      }
   }

   public void unsetDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTT$10);
      }
   }

   public long getDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTB$12);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTB$12);
         return var2;
      }
   }

   public boolean isSetDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTB$12) != null;
      }
   }

   public void setDistB(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTB$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTB$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistB(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTB$12);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTB$12);
         }

         var3.set(var1);
      }
   }

   public void unsetDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTB$12);
      }
   }

   public long getDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTL$14);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTL$14);
         return var2;
      }
   }

   public boolean isSetDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTL$14) != null;
      }
   }

   public void setDistL(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTL$14);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTL$14);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistL(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTL$14);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTL$14);
         }

         var3.set(var1);
      }
   }

   public void unsetDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTL$14);
      }
   }

   public long getDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTR$16);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTR$16);
         return var2;
      }
   }

   public boolean isSetDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTR$16) != null;
      }
   }

   public void setDistR(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTR$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTR$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistR(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTR$16);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTR$16);
         }

         var3.set(var1);
      }
   }

   public void unsetDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTR$16);
      }
   }

}
