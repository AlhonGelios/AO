package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRPrElt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTREltImpl extends XmlComplexContentImpl implements CTRElt {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rPr");
   private static final QName T$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "t");


   public CTREltImpl(SchemaType var1) {
      super(var1);
   }

   public CTRPrElt getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPrElt var2 = null;
         var2 = (CTRPrElt)this.get_store().find_element_user(RPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0) != 0;
      }
   }

   public void setRPr(CTRPrElt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPrElt var3 = null;
         var3 = (CTRPrElt)this.get_store().find_element_user(RPR$0, 0);
         if(var3 == null) {
            var3 = (CTRPrElt)this.get_store().add_element_user(RPR$0);
         }

         var3.set(var1);
      }
   }

   public CTRPrElt addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPrElt var2 = null;
         var2 = (CTRPrElt)this.get_store().add_element_user(RPR$0);
         return var2;
      }
   }

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, 0);
      }
   }

   public String getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(T$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(T$2, 0);
         return var2;
      }
   }

   public void setT(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(T$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(T$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetT(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(T$2, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(T$2);
         }

         var3.set(var1);
      }
   }

}
