package org.openxmlformats.schemas.drawingml.x2006.chart.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;
import org.openxmlformats.schemas.drawingml.x2006.chart.STXstring;

public class CTSerTxImpl extends XmlComplexContentImpl implements CTSerTx {

   private static final QName STRREF$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "strRef");
   private static final QName V$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/chart", "v");


   public CTSerTxImpl(SchemaType var1) {
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

   public String getV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(V$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(V$2, 0);
         return var2;
      }
   }

   public boolean isSetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(V$2) != 0;
      }
   }

   public void setV(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(V$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(V$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetV(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(V$2, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(V$2);
         }

         var3.set(var1);
      }
   }

   public void unsetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(V$2, 0);
      }
   }

}
