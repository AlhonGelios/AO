package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;

public class CTTableCellImpl extends XmlComplexContentImpl implements CTTableCell {

   private static final QName TXBODY$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "txBody");
   private static final QName TCPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tcPr");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName ROWSPAN$6 = new QName("", "rowSpan");
   private static final QName GRIDSPAN$8 = new QName("", "gridSpan");
   private static final QName HMERGE$10 = new QName("", "hMerge");
   private static final QName VMERGE$12 = new QName("", "vMerge");


   public CTTableCellImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextBody getTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(TXBODY$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXBODY$0) != 0;
      }
   }

   public void setTxBody(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(TXBODY$0, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(TXBODY$0);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(TXBODY$0);
         return var2;
      }
   }

   public void unsetTxBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXBODY$0, 0);
      }
   }

   public CTTableCellProperties getTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCellProperties var2 = null;
         var2 = (CTTableCellProperties)this.get_store().find_element_user(TCPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCPR$2) != 0;
      }
   }

   public void setTcPr(CTTableCellProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCellProperties var3 = null;
         var3 = (CTTableCellProperties)this.get_store().find_element_user(TCPR$2, 0);
         if(var3 == null) {
            var3 = (CTTableCellProperties)this.get_store().add_element_user(TCPR$2);
         }

         var3.set(var1);
      }
   }

   public CTTableCellProperties addNewTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableCellProperties var2 = null;
         var2 = (CTTableCellProperties)this.get_store().add_element_user(TCPR$2);
         return var2;
      }
   }

   public void unsetTcPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCPR$2, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public int getRowSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROWSPAN$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ROWSPAN$6);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetRowSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(ROWSPAN$6);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(ROWSPAN$6);
         }

         return var2;
      }
   }

   public boolean isSetRowSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROWSPAN$6) != null;
      }
   }

   public void setRowSpan(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROWSPAN$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROWSPAN$6);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetRowSpan(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(ROWSPAN$6);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(ROWSPAN$6);
         }

         var3.set(var1);
      }
   }

   public void unsetRowSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROWSPAN$6);
      }
   }

   public int getGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GRIDSPAN$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(GRIDSPAN$8);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(GRIDSPAN$8);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(GRIDSPAN$8);
         }

         return var2;
      }
   }

   public boolean isSetGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GRIDSPAN$8) != null;
      }
   }

   public void setGridSpan(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GRIDSPAN$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GRIDSPAN$8);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetGridSpan(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(GRIDSPAN$8);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(GRIDSPAN$8);
         }

         var3.set(var1);
      }
   }

   public void unsetGridSpan() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GRIDSPAN$8);
      }
   }

   public boolean getHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HMERGE$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HMERGE$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HMERGE$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HMERGE$10);
         }

         return var2;
      }
   }

   public boolean isSetHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HMERGE$10) != null;
      }
   }

   public void setHMerge(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HMERGE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HMERGE$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHMerge(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HMERGE$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HMERGE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetHMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HMERGE$10);
      }
   }

   public boolean getVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VMERGE$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VMERGE$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(VMERGE$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(VMERGE$12);
         }

         return var2;
      }
   }

   public boolean isSetVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VMERGE$12) != null;
      }
   }

   public void setVMerge(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VMERGE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VMERGE$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetVMerge(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(VMERGE$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(VMERGE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetVMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VMERGE$12);
      }
   }

}
