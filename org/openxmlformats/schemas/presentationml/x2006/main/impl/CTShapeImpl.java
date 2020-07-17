package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShapeNonVisual;

public class CTShapeImpl extends XmlComplexContentImpl implements CTShape {

   private static final QName NVSPPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "nvSpPr");
   private static final QName SPPR$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "spPr");
   private static final QName STYLE$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "style");
   private static final QName TXBODY$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "txBody");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName USEBGFILL$10 = new QName("", "useBgFill");


   public CTShapeImpl(SchemaType var1) {
      super(var1);
   }

   public CTShapeNonVisual getNvSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeNonVisual var2 = null;
         var2 = (CTShapeNonVisual)this.get_store().find_element_user(NVSPPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNvSpPr(CTShapeNonVisual var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeNonVisual var3 = null;
         var3 = (CTShapeNonVisual)this.get_store().find_element_user(NVSPPR$0, 0);
         if(var3 == null) {
            var3 = (CTShapeNonVisual)this.get_store().add_element_user(NVSPPR$0);
         }

         var3.set(var1);
      }
   }

   public CTShapeNonVisual addNewNvSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeNonVisual var2 = null;
         var2 = (CTShapeNonVisual)this.get_store().add_element_user(NVSPPR$0);
         return var2;
      }
   }

   public CTShapeProperties getSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().find_element_user(SPPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSpPr(CTShapeProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var3 = null;
         var3 = (CTShapeProperties)this.get_store().find_element_user(SPPR$2, 0);
         if(var3 == null) {
            var3 = (CTShapeProperties)this.get_store().add_element_user(SPPR$2);
         }

         var3.set(var1);
      }
   }

   public CTShapeProperties addNewSpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeProperties var2 = null;
         var2 = (CTShapeProperties)this.get_store().add_element_user(SPPR$2);
         return var2;
      }
   }

   public CTShapeStyle getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var2 = null;
         var2 = (CTShapeStyle)this.get_store().find_element_user(STYLE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLE$4) != 0;
      }
   }

   public void setStyle(CTShapeStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var3 = null;
         var3 = (CTShapeStyle)this.get_store().find_element_user(STYLE$4, 0);
         if(var3 == null) {
            var3 = (CTShapeStyle)this.get_store().add_element_user(STYLE$4);
         }

         var3.set(var1);
      }
   }

   public CTShapeStyle addNewStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeStyle var2 = null;
         var2 = (CTShapeStyle)this.get_store().add_element_user(STYLE$4);
         return var2;
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLE$4, 0);
      }
   }

   public CTTextBody getTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(TXBODY$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXBODY$6) != 0;
      }
   }

   public void setTxBody(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(TXBODY$6, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(TXBODY$6);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(TXBODY$6);
         return var2;
      }
   }

   public void unsetTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXBODY$6, 0);
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

   public boolean getUseBgFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USEBGFILL$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USEBGFILL$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUseBgFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USEBGFILL$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USEBGFILL$10);
         }

         return var2;
      }
   }

   public boolean isSetUseBgFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USEBGFILL$10) != null;
      }
   }

   public void setUseBgFill(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USEBGFILL$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USEBGFILL$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUseBgFill(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USEBGFILL$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USEBGFILL$10);
         }

         var3.set(var1);
      }
   }

   public void unsetUseBgFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USEBGFILL$10);
      }
   }

}
