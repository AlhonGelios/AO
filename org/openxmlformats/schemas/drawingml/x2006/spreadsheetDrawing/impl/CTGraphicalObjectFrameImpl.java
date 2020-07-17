package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTGraphicalObjectFrameNonVisual;

public class CTGraphicalObjectFrameImpl extends XmlComplexContentImpl implements CTGraphicalObjectFrame {

   private static final QName NVGRAPHICFRAMEPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "nvGraphicFramePr");
   private static final QName XFRM$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "xfrm");
   private static final QName GRAPHIC$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "graphic");
   private static final QName MACRO$6 = new QName("", "macro");
   private static final QName FPUBLISHED$8 = new QName("", "fPublished");


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

   public String getMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MACRO$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(MACRO$6);
         return var2;
      }
   }

   public boolean isSetMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MACRO$6) != null;
      }
   }

   public void setMacro(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MACRO$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MACRO$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMacro(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(MACRO$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(MACRO$6);
         }

         var3.set(var1);
      }
   }

   public void unsetMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MACRO$6);
      }
   }

   public boolean getFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FPUBLISHED$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FPUBLISHED$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FPUBLISHED$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FPUBLISHED$8);
         }

         return var2;
      }
   }

   public boolean isSetFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FPUBLISHED$8) != null;
      }
   }

   public void setFPublished(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FPUBLISHED$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FPUBLISHED$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFPublished(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FPUBLISHED$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FPUBLISHED$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FPUBLISHED$8);
      }
   }

}
