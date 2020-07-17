package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLayout;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTManualLayout;

public class CTLayoutImpl extends XmlComplexContentImpl implements CTLayout {

   private static final QName MANUALLAYOUT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "manualLayout");
   private static final QName EXTLST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTLayoutImpl(SchemaType var1) {
      super(var1);
   }

   public CTManualLayout getManualLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTManualLayout var2 = null;
         var2 = (CTManualLayout)this.get_store().find_element_user(MANUALLAYOUT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetManualLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MANUALLAYOUT$0) != 0;
      }
   }

   public void setManualLayout(CTManualLayout var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTManualLayout var3 = null;
         var3 = (CTManualLayout)this.get_store().find_element_user(MANUALLAYOUT$0, 0);
         if(var3 == null) {
            var3 = (CTManualLayout)this.get_store().add_element_user(MANUALLAYOUT$0);
         }

         var3.set(var1);
      }
   }

   public CTManualLayout addNewManualLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTManualLayout var2 = null;
         var2 = (CTManualLayout)this.get_store().add_element_user(MANUALLAYOUT$0);
         return var2;
      }
   }

   public void unsetManualLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MANUALLAYOUT$0, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$2) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$2, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$2);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$2, 0);
      }
   }

}
