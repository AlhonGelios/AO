package org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualGraphicFrameProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTEffectExtent;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosH;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTPosV;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapNone;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapSquare;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapThrough;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTight;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTWrapTopBottom;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.STWrapDistance;

public class CTAnchorImpl extends XmlComplexContentImpl implements CTAnchor {

   private static final QName SIMPLEPOS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "simplePos");
   private static final QName POSITIONH$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "positionH");
   private static final QName POSITIONV$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "positionV");
   private static final QName EXTENT$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "extent");
   private static final QName EFFECTEXTENT$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "effectExtent");
   private static final QName WRAPNONE$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapNone");
   private static final QName WRAPSQUARE$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapSquare");
   private static final QName WRAPTIGHT$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapTight");
   private static final QName WRAPTHROUGH$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapThrough");
   private static final QName WRAPTOPANDBOTTOM$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wrapTopAndBottom");
   private static final QName DOCPR$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "docPr");
   private static final QName CNVGRAPHICFRAMEPR$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "cNvGraphicFramePr");
   private static final QName GRAPHIC$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
   private static final QName DISTT$26 = new QName("", "distT");
   private static final QName DISTB$28 = new QName("", "distB");
   private static final QName DISTL$30 = new QName("", "distL");
   private static final QName DISTR$32 = new QName("", "distR");
   private static final QName SIMPLEPOS2$34 = new QName("", "simplePos");
   private static final QName RELATIVEHEIGHT$36 = new QName("", "relativeHeight");
   private static final QName BEHINDDOC$38 = new QName("", "behindDoc");
   private static final QName LOCKED$40 = new QName("", "locked");
   private static final QName LAYOUTINCELL$42 = new QName("", "layoutInCell");
   private static final QName HIDDEN$44 = new QName("", "hidden");
   private static final QName ALLOWOVERLAP$46 = new QName("", "allowOverlap");


   public CTAnchorImpl(SchemaType var1) {
      super(var1);
   }

   public CTPoint2D getSimplePos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().find_element_user(SIMPLEPOS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSimplePos(CTPoint2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var3 = null;
         var3 = (CTPoint2D)this.get_store().find_element_user(SIMPLEPOS$0, 0);
         if(var3 == null) {
            var3 = (CTPoint2D)this.get_store().add_element_user(SIMPLEPOS$0);
         }

         var3.set(var1);
      }
   }

   public CTPoint2D addNewSimplePos() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPoint2D var2 = null;
         var2 = (CTPoint2D)this.get_store().add_element_user(SIMPLEPOS$0);
         return var2;
      }
   }

   public CTPosH getPositionH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPosH var2 = null;
         var2 = (CTPosH)this.get_store().find_element_user(POSITIONH$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPositionH(CTPosH var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPosH var3 = null;
         var3 = (CTPosH)this.get_store().find_element_user(POSITIONH$2, 0);
         if(var3 == null) {
            var3 = (CTPosH)this.get_store().add_element_user(POSITIONH$2);
         }

         var3.set(var1);
      }
   }

   public CTPosH addNewPositionH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPosH var2 = null;
         var2 = (CTPosH)this.get_store().add_element_user(POSITIONH$2);
         return var2;
      }
   }

   public CTPosV getPositionV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPosV var2 = null;
         var2 = (CTPosV)this.get_store().find_element_user(POSITIONV$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPositionV(CTPosV var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPosV var3 = null;
         var3 = (CTPosV)this.get_store().find_element_user(POSITIONV$4, 0);
         if(var3 == null) {
            var3 = (CTPosV)this.get_store().add_element_user(POSITIONV$4);
         }

         var3.set(var1);
      }
   }

   public CTPosV addNewPositionV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPosV var2 = null;
         var2 = (CTPosV)this.get_store().add_element_user(POSITIONV$4);
         return var2;
      }
   }

   public CTPositiveSize2D getExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().find_element_user(EXTENT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public void setExtent(CTPositiveSize2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var3 = null;
         var3 = (CTPositiveSize2D)this.get_store().find_element_user(EXTENT$6, 0);
         if(var3 == null) {
            var3 = (CTPositiveSize2D)this.get_store().add_element_user(EXTENT$6);
         }

         var3.set(var1);
      }
   }

   public CTPositiveSize2D addNewExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().add_element_user(EXTENT$6);
         return var2;
      }
   }

   public CTEffectExtent getEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectExtent var2 = null;
         var2 = (CTEffectExtent)this.get_store().find_element_user(EFFECTEXTENT$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTEXTENT$8) != 0;
      }
   }

   public void setEffectExtent(CTEffectExtent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectExtent var3 = null;
         var3 = (CTEffectExtent)this.get_store().find_element_user(EFFECTEXTENT$8, 0);
         if(var3 == null) {
            var3 = (CTEffectExtent)this.get_store().add_element_user(EFFECTEXTENT$8);
         }

         var3.set(var1);
      }
   }

   public CTEffectExtent addNewEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectExtent var2 = null;
         var2 = (CTEffectExtent)this.get_store().add_element_user(EFFECTEXTENT$8);
         return var2;
      }
   }

   public void unsetEffectExtent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTEXTENT$8, 0);
      }
   }

   public CTWrapNone getWrapNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapNone var2 = null;
         var2 = (CTWrapNone)this.get_store().find_element_user(WRAPNONE$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWrapNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRAPNONE$10) != 0;
      }
   }

   public void setWrapNone(CTWrapNone var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapNone var3 = null;
         var3 = (CTWrapNone)this.get_store().find_element_user(WRAPNONE$10, 0);
         if(var3 == null) {
            var3 = (CTWrapNone)this.get_store().add_element_user(WRAPNONE$10);
         }

         var3.set(var1);
      }
   }

   public CTWrapNone addNewWrapNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapNone var2 = null;
         var2 = (CTWrapNone)this.get_store().add_element_user(WRAPNONE$10);
         return var2;
      }
   }

   public void unsetWrapNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRAPNONE$10, 0);
      }
   }

   public CTWrapSquare getWrapSquare() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapSquare var2 = null;
         var2 = (CTWrapSquare)this.get_store().find_element_user(WRAPSQUARE$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWrapSquare() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRAPSQUARE$12) != 0;
      }
   }

   public void setWrapSquare(CTWrapSquare var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapSquare var3 = null;
         var3 = (CTWrapSquare)this.get_store().find_element_user(WRAPSQUARE$12, 0);
         if(var3 == null) {
            var3 = (CTWrapSquare)this.get_store().add_element_user(WRAPSQUARE$12);
         }

         var3.set(var1);
      }
   }

   public CTWrapSquare addNewWrapSquare() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapSquare var2 = null;
         var2 = (CTWrapSquare)this.get_store().add_element_user(WRAPSQUARE$12);
         return var2;
      }
   }

   public void unsetWrapSquare() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRAPSQUARE$12, 0);
      }
   }

   public CTWrapTight getWrapTight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapTight var2 = null;
         var2 = (CTWrapTight)this.get_store().find_element_user(WRAPTIGHT$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWrapTight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRAPTIGHT$14) != 0;
      }
   }

   public void setWrapTight(CTWrapTight var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapTight var3 = null;
         var3 = (CTWrapTight)this.get_store().find_element_user(WRAPTIGHT$14, 0);
         if(var3 == null) {
            var3 = (CTWrapTight)this.get_store().add_element_user(WRAPTIGHT$14);
         }

         var3.set(var1);
      }
   }

   public CTWrapTight addNewWrapTight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapTight var2 = null;
         var2 = (CTWrapTight)this.get_store().add_element_user(WRAPTIGHT$14);
         return var2;
      }
   }

   public void unsetWrapTight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRAPTIGHT$14, 0);
      }
   }

   public CTWrapThrough getWrapThrough() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapThrough var2 = null;
         var2 = (CTWrapThrough)this.get_store().find_element_user(WRAPTHROUGH$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWrapThrough() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRAPTHROUGH$16) != 0;
      }
   }

   public void setWrapThrough(CTWrapThrough var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapThrough var3 = null;
         var3 = (CTWrapThrough)this.get_store().find_element_user(WRAPTHROUGH$16, 0);
         if(var3 == null) {
            var3 = (CTWrapThrough)this.get_store().add_element_user(WRAPTHROUGH$16);
         }

         var3.set(var1);
      }
   }

   public CTWrapThrough addNewWrapThrough() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapThrough var2 = null;
         var2 = (CTWrapThrough)this.get_store().add_element_user(WRAPTHROUGH$16);
         return var2;
      }
   }

   public void unsetWrapThrough() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRAPTHROUGH$16, 0);
      }
   }

   public CTWrapTopBottom getWrapTopAndBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapTopBottom var2 = null;
         var2 = (CTWrapTopBottom)this.get_store().find_element_user(WRAPTOPANDBOTTOM$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWrapTopAndBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRAPTOPANDBOTTOM$18) != 0;
      }
   }

   public void setWrapTopAndBottom(CTWrapTopBottom var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapTopBottom var3 = null;
         var3 = (CTWrapTopBottom)this.get_store().find_element_user(WRAPTOPANDBOTTOM$18, 0);
         if(var3 == null) {
            var3 = (CTWrapTopBottom)this.get_store().add_element_user(WRAPTOPANDBOTTOM$18);
         }

         var3.set(var1);
      }
   }

   public CTWrapTopBottom addNewWrapTopAndBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrapTopBottom var2 = null;
         var2 = (CTWrapTopBottom)this.get_store().add_element_user(WRAPTOPANDBOTTOM$18);
         return var2;
      }
   }

   public void unsetWrapTopAndBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRAPTOPANDBOTTOM$18, 0);
      }
   }

   public CTNonVisualDrawingProps getDocPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var2 = null;
         var2 = (CTNonVisualDrawingProps)this.get_store().find_element_user(DOCPR$20, 0);
         return var2 == null?null:var2;
      }
   }

   public void setDocPr(CTNonVisualDrawingProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var3 = null;
         var3 = (CTNonVisualDrawingProps)this.get_store().find_element_user(DOCPR$20, 0);
         if(var3 == null) {
            var3 = (CTNonVisualDrawingProps)this.get_store().add_element_user(DOCPR$20);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualDrawingProps addNewDocPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualDrawingProps var2 = null;
         var2 = (CTNonVisualDrawingProps)this.get_store().add_element_user(DOCPR$20);
         return var2;
      }
   }

   public CTNonVisualGraphicFrameProperties getCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var2 = null;
         var2 = (CTNonVisualGraphicFrameProperties)this.get_store().find_element_user(CNVGRAPHICFRAMEPR$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CNVGRAPHICFRAMEPR$22) != 0;
      }
   }

   public void setCNvGraphicFramePr(CTNonVisualGraphicFrameProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var3 = null;
         var3 = (CTNonVisualGraphicFrameProperties)this.get_store().find_element_user(CNVGRAPHICFRAMEPR$22, 0);
         if(var3 == null) {
            var3 = (CTNonVisualGraphicFrameProperties)this.get_store().add_element_user(CNVGRAPHICFRAMEPR$22);
         }

         var3.set(var1);
      }
   }

   public CTNonVisualGraphicFrameProperties addNewCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNonVisualGraphicFrameProperties var2 = null;
         var2 = (CTNonVisualGraphicFrameProperties)this.get_store().add_element_user(CNVGRAPHICFRAMEPR$22);
         return var2;
      }
   }

   public void unsetCNvGraphicFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CNVGRAPHICFRAMEPR$22, 0);
      }
   }

   public CTGraphicalObject getGraphic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var2 = null;
         var2 = (CTGraphicalObject)this.get_store().find_element_user(GRAPHIC$24, 0);
         return var2 == null?null:var2;
      }
   }

   public void setGraphic(CTGraphicalObject var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var3 = null;
         var3 = (CTGraphicalObject)this.get_store().find_element_user(GRAPHIC$24, 0);
         if(var3 == null) {
            var3 = (CTGraphicalObject)this.get_store().add_element_user(GRAPHIC$24);
         }

         var3.set(var1);
      }
   }

   public CTGraphicalObject addNewGraphic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGraphicalObject var2 = null;
         var2 = (CTGraphicalObject)this.get_store().add_element_user(GRAPHIC$24);
         return var2;
      }
   }

   public long getDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTT$26);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTT$26);
         return var2;
      }
   }

   public boolean isSetDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTT$26) != null;
      }
   }

   public void setDistT(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTT$26);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTT$26);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistT(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTT$26);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetDistT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTT$26);
      }
   }

   public long getDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTB$28);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTB$28);
         return var2;
      }
   }

   public boolean isSetDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTB$28) != null;
      }
   }

   public void setDistB(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTB$28);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTB$28);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistB(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTB$28);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTB$28);
         }

         var3.set(var1);
      }
   }

   public void unsetDistB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTB$28);
      }
   }

   public long getDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTL$30);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTL$30);
         return var2;
      }
   }

   public boolean isSetDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTL$30) != null;
      }
   }

   public void setDistL(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTL$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTL$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistL(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTL$30);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTL$30);
         }

         var3.set(var1);
      }
   }

   public void unsetDistL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTL$30);
      }
   }

   public long getDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISTR$32);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STWrapDistance xgetDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var2 = null;
         var2 = (STWrapDistance)this.get_store().find_attribute_user(DISTR$32);
         return var2;
      }
   }

   public boolean isSetDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISTR$32) != null;
      }
   }

   public void setDistR(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DISTR$32);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DISTR$32);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDistR(STWrapDistance var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STWrapDistance var3 = null;
         var3 = (STWrapDistance)this.get_store().find_attribute_user(DISTR$32);
         if(var3 == null) {
            var3 = (STWrapDistance)this.get_store().add_attribute_user(DISTR$32);
         }

         var3.set(var1);
      }
   }

   public void unsetDistR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISTR$32);
      }
   }

   public boolean getSimplePos2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SIMPLEPOS2$34);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSimplePos2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SIMPLEPOS2$34);
         return var2;
      }
   }

   public boolean isSetSimplePos2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SIMPLEPOS2$34) != null;
      }
   }

   public void setSimplePos2(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SIMPLEPOS2$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SIMPLEPOS2$34);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSimplePos2(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SIMPLEPOS2$34);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SIMPLEPOS2$34);
         }

         var3.set(var1);
      }
   }

   public void unsetSimplePos2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SIMPLEPOS2$34);
      }
   }

   public long getRelativeHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RELATIVEHEIGHT$36);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetRelativeHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(RELATIVEHEIGHT$36);
         return var2;
      }
   }

   public void setRelativeHeight(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(RELATIVEHEIGHT$36);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(RELATIVEHEIGHT$36);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetRelativeHeight(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(RELATIVEHEIGHT$36);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(RELATIVEHEIGHT$36);
         }

         var3.set(var1);
      }
   }

   public boolean getBehindDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BEHINDDOC$38);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBehindDoc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BEHINDDOC$38);
         return var2;
      }
   }

   public void setBehindDoc(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BEHINDDOC$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BEHINDDOC$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBehindDoc(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BEHINDDOC$38);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BEHINDDOC$38);
         }

         var3.set(var1);
      }
   }

   public boolean getLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LOCKED$40);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLocked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LOCKED$40);
         return var2;
      }
   }

   public void setLocked(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LOCKED$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LOCKED$40);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLocked(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LOCKED$40);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LOCKED$40);
         }

         var3.set(var1);
      }
   }

   public boolean getLayoutInCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LAYOUTINCELL$42);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLayoutInCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LAYOUTINCELL$42);
         return var2;
      }
   }

   public void setLayoutInCell(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LAYOUTINCELL$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LAYOUTINCELL$42);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLayoutInCell(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LAYOUTINCELL$42);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LAYOUTINCELL$42);
         }

         var3.set(var1);
      }
   }

   public boolean getHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$44);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$44);
         return var2;
      }
   }

   public boolean isSetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDEN$44) != null;
      }
   }

   public void setHidden(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDEN$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDEN$44);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHidden(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDEN$44);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDEN$44);
         }

         var3.set(var1);
      }
   }

   public void unsetHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDEN$44);
      }
   }

   public boolean getAllowOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWOVERLAP$46);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAllowOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ALLOWOVERLAP$46);
         return var2;
      }
   }

   public void setAllowOverlap(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWOVERLAP$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWOVERLAP$46);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAllowOverlap(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ALLOWOVERLAP$46);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ALLOWOVERLAP$46);
         }

         var3.set(var1);
      }
   }

}
