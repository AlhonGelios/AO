package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumData;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;

public class CTNumDataSourceImpl extends XmlComplexContentImpl implements CTNumDataSource {

   private static final QName NUMREF$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numRef");
   private static final QName NUMLIT$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "numLit");


   public CTNumDataSourceImpl(SchemaType var1) {
      super(var1);
   }

   public CTNumRef getNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumRef var2 = null;
         var2 = (CTNumRef)this.get_store().find_element_user(NUMREF$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMREF$0) != 0;
      }
   }

   public void setNumRef(CTNumRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumRef var3 = null;
         var3 = (CTNumRef)this.get_store().find_element_user(NUMREF$0, 0);
         if(var3 == null) {
            var3 = (CTNumRef)this.get_store().add_element_user(NUMREF$0);
         }

         var3.set(var1);
      }
   }

   public CTNumRef addNewNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumRef var2 = null;
         var2 = (CTNumRef)this.get_store().add_element_user(NUMREF$0);
         return var2;
      }
   }

   public void unsetNumRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMREF$0, 0);
      }
   }

   public CTNumData getNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var2 = null;
         var2 = (CTNumData)this.get_store().find_element_user(NUMLIT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMLIT$2) != 0;
      }
   }

   public void setNumLit(CTNumData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var3 = null;
         var3 = (CTNumData)this.get_store().find_element_user(NUMLIT$2, 0);
         if(var3 == null) {
            var3 = (CTNumData)this.get_store().add_element_user(NUMLIT$2);
         }

         var3.set(var1);
      }
   }

   public CTNumData addNewNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumData var2 = null;
         var2 = (CTNumData)this.get_store().add_element_user(NUMLIT$2);
         return var2;
      }
   }

   public void unsetNumLit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMLIT$2, 0);
      }
   }

}
