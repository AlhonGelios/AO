package org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPictureNonVisual;

public class CTPictureImpl extends XmlComplexContentImpl implements CTPicture {

   private static final QName NVPICPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "nvPicPr");
   private static final QName BLIPFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "blipFill");
   private static final QName SPPR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "spPr");
   private static final QName STYLE$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing", "style");
   private static final QName MACRO$8 = new QName("", "macro");
   private static final QName FPUBLISHED$10 = new QName("", "fPublished");


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

   public String getMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MACRO$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MACRO$8);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(MACRO$8);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(MACRO$8);
         }

         return var2;
      }
   }

   public boolean isSetMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MACRO$8) != null;
      }
   }

   public void setMacro(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MACRO$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MACRO$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMacro(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(MACRO$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(MACRO$8);
         }

         var3.set(var1);
      }
   }

   public void unsetMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MACRO$8);
      }
   }

   public boolean getFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FPUBLISHED$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FPUBLISHED$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FPUBLISHED$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FPUBLISHED$10);
         }

         return var2;
      }
   }

   public boolean isSetFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FPUBLISHED$10) != null;
      }
   }

   public void setFPublished(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FPUBLISHED$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FPUBLISHED$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFPublished(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FPUBLISHED$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FPUBLISHED$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FPUBLISHED$10);
      }
   }

}
