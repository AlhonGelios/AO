package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTTx;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;

public class CTTxImpl extends XmlComplexContentImpl implements CTTx {

   private static final QName STRREF$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strRef");
   private static final QName RICH$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "rich");


   public CTTxImpl(SchemaType var1) {
      super(var1);
   }

   public CTStrRef getStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrRef var2 = null;
         var2 = (CTStrRef)this.get_store().find_element_user(STRREF$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRREF$0) != 0;
      }
   }

   public void setStrRef(CTStrRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrRef var3 = null;
         var3 = (CTStrRef)this.get_store().find_element_user(STRREF$0, 0);
         if(var3 == null) {
            var3 = (CTStrRef)this.get_store().add_element_user(STRREF$0);
         }

         var3.set(var1);
      }
   }

   public CTStrRef addNewStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStrRef var2 = null;
         var2 = (CTStrRef)this.get_store().add_element_user(STRREF$0);
         return var2;
      }
   }

   public void unsetStrRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRREF$0, 0);
      }
   }

   public CTTextBody getRich() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().find_element_user(RICH$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRich() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RICH$2) != 0;
      }
   }

   public void setRich(CTTextBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var3 = null;
         var3 = (CTTextBody)this.get_store().find_element_user(RICH$2, 0);
         if(var3 == null) {
            var3 = (CTTextBody)this.get_store().add_element_user(RICH$2);
         }

         var3.set(var1);
      }
   }

   public CTTextBody addNewRich() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBody var2 = null;
         var2 = (CTTextBody)this.get_store().add_element_user(RICH$2);
         return var2;
      }
   }

   public void unsetRich() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RICH$2, 0);
      }
   }

}
