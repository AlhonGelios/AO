package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingShapeProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeLocking;

public class CTNonVisualDrawingShapePropsImpl extends XmlComplexContentImpl implements CTNonVisualDrawingShapeProps {

   private static final QName SPLOCKS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spLocks");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName TXBOX$4 = new QName("", "txBox");


   public CTNonVisualDrawingShapePropsImpl(SchemaType var1) {
      super(var1);
   }

   public CTShapeLocking getSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeLocking var2 = null;
         var2 = (CTShapeLocking)this.get_store().find_element_user(SPLOCKS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPLOCKS$0) != 0;
      }
   }

   public void setSpLocks(CTShapeLocking var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeLocking var3 = null;
         var3 = (CTShapeLocking)this.get_store().find_element_user(SPLOCKS$0, 0);
         if(var3 == null) {
            var3 = (CTShapeLocking)this.get_store().add_element_user(SPLOCKS$0);
         }

         var3.set(var1);
      }
   }

   public CTShapeLocking addNewSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeLocking var2 = null;
         var2 = (CTShapeLocking)this.get_store().add_element_user(SPLOCKS$0);
         return var2;
      }
   }

   public void unsetSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPLOCKS$0, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

   public boolean getTxBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TXBOX$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TXBOX$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTxBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TXBOX$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TXBOX$4);
         }

         return var2;
      }
   }

   public boolean isSetTxBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TXBOX$4) != null;
      }
   }

   public void setTxBox(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TXBOX$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TXBOX$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTxBox(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TXBOX$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TXBOX$4);
         }

         var3.set(var1);
      }
   }

   public void unsetTxBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TXBOX$4);
      }
   }

}
