package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPictureLocking;

public class CTNonVisualPicturePropertiesImpl extends XmlComplexContentImpl implements CTNonVisualPictureProperties {

   private static final QName PICLOCKS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "picLocks");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName PREFERRELATIVERESIZE$4 = new QName("", "preferRelativeResize");


   public CTNonVisualPicturePropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTPictureLocking getPicLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPictureLocking var2 = null;
         var2 = (CTPictureLocking)this.get_store().find_element_user(PICLOCKS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPicLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PICLOCKS$0) != 0;
      }
   }

   public void setPicLocks(CTPictureLocking var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPictureLocking var3 = null;
         var3 = (CTPictureLocking)this.get_store().find_element_user(PICLOCKS$0, 0);
         if(var3 == null) {
            var3 = (CTPictureLocking)this.get_store().add_element_user(PICLOCKS$0);
         }

         var3.set(var1);
      }
   }

   public CTPictureLocking addNewPicLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPictureLocking var2 = null;
         var2 = (CTPictureLocking)this.get_store().add_element_user(PICLOCKS$0);
         return var2;
      }
   }

   public void unsetPicLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PICLOCKS$0, 0);
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

   public boolean getPreferRelativeResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PREFERRELATIVERESIZE$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPreferRelativeResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PREFERRELATIVERESIZE$4);
         }

         return var2;
      }
   }

   public boolean isSetPreferRelativeResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PREFERRELATIVERESIZE$4) != null;
      }
   }

   public void setPreferRelativeResize(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PREFERRELATIVERESIZE$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPreferRelativeResize(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PREFERRELATIVERESIZE$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PREFERRELATIVERESIZE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetPreferRelativeResize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PREFERRELATIVERESIZE$4);
      }
   }

}
