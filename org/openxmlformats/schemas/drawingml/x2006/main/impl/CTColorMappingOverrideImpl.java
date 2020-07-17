package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEmptyElement;

public class CTColorMappingOverrideImpl extends XmlComplexContentImpl implements CTColorMappingOverride {

   private static final QName MASTERCLRMAPPING$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "masterClrMapping");
   private static final QName OVERRIDECLRMAPPING$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "overrideClrMapping");


   public CTColorMappingOverrideImpl(SchemaType var1) {
      super(var1);
   }

   public CTEmptyElement getMasterClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmptyElement var2 = null;
         var2 = (CTEmptyElement)this.get_store().find_element_user(MASTERCLRMAPPING$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMasterClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MASTERCLRMAPPING$0) != 0;
      }
   }

   public void setMasterClrMapping(CTEmptyElement var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmptyElement var3 = null;
         var3 = (CTEmptyElement)this.get_store().find_element_user(MASTERCLRMAPPING$0, 0);
         if(var3 == null) {
            var3 = (CTEmptyElement)this.get_store().add_element_user(MASTERCLRMAPPING$0);
         }

         var3.set(var1);
      }
   }

   public CTEmptyElement addNewMasterClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmptyElement var2 = null;
         var2 = (CTEmptyElement)this.get_store().add_element_user(MASTERCLRMAPPING$0);
         return var2;
      }
   }

   public void unsetMasterClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MASTERCLRMAPPING$0, 0);
      }
   }

   public CTColorMapping getOverrideClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().find_element_user(OVERRIDECLRMAPPING$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOverrideClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OVERRIDECLRMAPPING$2) != 0;
      }
   }

   public void setOverrideClrMapping(CTColorMapping var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var3 = null;
         var3 = (CTColorMapping)this.get_store().find_element_user(OVERRIDECLRMAPPING$2, 0);
         if(var3 == null) {
            var3 = (CTColorMapping)this.get_store().add_element_user(OVERRIDECLRMAPPING$2);
         }

         var3.set(var1);
      }
   }

   public CTColorMapping addNewOverrideClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().add_element_user(OVERRIDECLRMAPPING$2);
         return var2;
      }
   }

   public void unsetOverrideClrMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OVERRIDECLRMAPPING$2, 0);
      }
   }

}
