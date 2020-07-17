package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlackWhiteMode$Enum;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackgroundProperties;

public class CTBackgroundImpl extends XmlComplexContentImpl implements CTBackground {

   private static final QName BGPR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bgPr");
   private static final QName BGREF$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "bgRef");
   private static final QName BWMODE$4 = new QName("", "bwMode");


   public CTBackgroundImpl(SchemaType var1) {
      super(var1);
   }

   public CTBackgroundProperties getBgPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackgroundProperties var2 = null;
         var2 = (CTBackgroundProperties)this.get_store().find_element_user(BGPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBgPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BGPR$0) != 0;
      }
   }

   public void setBgPr(CTBackgroundProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackgroundProperties var3 = null;
         var3 = (CTBackgroundProperties)this.get_store().find_element_user(BGPR$0, 0);
         if(var3 == null) {
            var3 = (CTBackgroundProperties)this.get_store().add_element_user(BGPR$0);
         }

         var3.set(var1);
      }
   }

   public CTBackgroundProperties addNewBgPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackgroundProperties var2 = null;
         var2 = (CTBackgroundProperties)this.get_store().add_element_user(BGPR$0);
         return var2;
      }
   }

   public void unsetBgPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BGPR$0, 0);
      }
   }

   public CTStyleMatrixReference getBgRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().find_element_user(BGREF$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBgRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BGREF$2) != 0;
      }
   }

   public void setBgRef(CTStyleMatrixReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var3 = null;
         var3 = (CTStyleMatrixReference)this.get_store().find_element_user(BGREF$2, 0);
         if(var3 == null) {
            var3 = (CTStyleMatrixReference)this.get_store().add_element_user(BGREF$2);
         }

         var3.set(var1);
      }
   }

   public CTStyleMatrixReference addNewBgRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().add_element_user(BGREF$2);
         return var2;
      }
   }

   public void unsetBgRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BGREF$2, 0);
      }
   }

   public STBlackWhiteMode$Enum getBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BWMODE$4);
         }

         return var2 == null?null:(STBlackWhiteMode$Enum)var2.getEnumValue();
      }
   }

   public STBlackWhiteMode xgetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlackWhiteMode var2 = null;
         var2 = (STBlackWhiteMode)this.get_store().find_attribute_user(BWMODE$4);
         if(var2 == null) {
            var2 = (STBlackWhiteMode)this.get_default_attribute_value(BWMODE$4);
         }

         return var2;
      }
   }

   public boolean isSetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BWMODE$4) != null;
      }
   }

   public void setBwMode(STBlackWhiteMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BWMODE$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBwMode(STBlackWhiteMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlackWhiteMode var3 = null;
         var3 = (STBlackWhiteMode)this.get_store().find_attribute_user(BWMODE$4);
         if(var3 == null) {
            var3 = (STBlackWhiteMode)this.get_store().add_attribute_user(BWMODE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetBwMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BWMODE$4);
      }
   }

}
