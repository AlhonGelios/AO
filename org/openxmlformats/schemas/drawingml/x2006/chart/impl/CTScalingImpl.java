package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTDouble;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTOrientation;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;

public class CTScalingImpl extends XmlComplexContentImpl implements CTScaling {

   private static final QName LOGBASE$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "logBase");
   private static final QName ORIENTATION$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "orientation");
   private static final QName MAX$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "max");
   private static final QName MIN$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "min");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "extLst");


   public CTScalingImpl(SchemaType var1) {
      super(var1);
   }

   public CTLogBase getLogBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLogBase var2 = null;
         var2 = (CTLogBase)this.get_store().find_element_user(LOGBASE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLogBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LOGBASE$0) != 0;
      }
   }

   public void setLogBase(CTLogBase var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLogBase var3 = null;
         var3 = (CTLogBase)this.get_store().find_element_user(LOGBASE$0, 0);
         if(var3 == null) {
            var3 = (CTLogBase)this.get_store().add_element_user(LOGBASE$0);
         }

         var3.set(var1);
      }
   }

   public CTLogBase addNewLogBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLogBase var2 = null;
         var2 = (CTLogBase)this.get_store().add_element_user(LOGBASE$0);
         return var2;
      }
   }

   public void unsetLogBase() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LOGBASE$0, 0);
      }
   }

   public CTOrientation getOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOrientation var2 = null;
         var2 = (CTOrientation)this.get_store().find_element_user(ORIENTATION$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ORIENTATION$2) != 0;
      }
   }

   public void setOrientation(CTOrientation var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOrientation var3 = null;
         var3 = (CTOrientation)this.get_store().find_element_user(ORIENTATION$2, 0);
         if(var3 == null) {
            var3 = (CTOrientation)this.get_store().add_element_user(ORIENTATION$2);
         }

         var3.set(var1);
      }
   }

   public CTOrientation addNewOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOrientation var2 = null;
         var2 = (CTOrientation)this.get_store().add_element_user(ORIENTATION$2);
         return var2;
      }
   }

   public void unsetOrientation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ORIENTATION$2, 0);
      }
   }

   public CTDouble getMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(MAX$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAX$4) != 0;
      }
   }

   public void setMax(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(MAX$4, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(MAX$4);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(MAX$4);
         return var2;
      }
   }

   public void unsetMax() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAX$4, 0);
      }
   }

   public CTDouble getMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().find_element_user(MIN$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MIN$6) != 0;
      }
   }

   public void setMin(CTDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var3 = null;
         var3 = (CTDouble)this.get_store().find_element_user(MIN$6, 0);
         if(var3 == null) {
            var3 = (CTDouble)this.get_store().add_element_user(MIN$6);
         }

         var3.set(var1);
      }
   }

   public CTDouble addNewMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDouble var2 = null;
         var2 = (CTDouble)this.get_store().add_element_user(MIN$6);
         return var2;
      }
   }

   public void unsetMin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MIN$6, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$8, 0);
      }
   }

}
