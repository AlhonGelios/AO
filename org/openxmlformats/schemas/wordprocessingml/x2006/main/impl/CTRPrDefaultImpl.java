package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault;

public class CTRPrDefaultImpl extends XmlComplexContentImpl implements CTRPrDefault {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");


   public CTRPrDefaultImpl(SchemaType var1) {
      super(var1);
   }

   public CTRPr getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().find_element_user(RPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0) != 0;
      }
   }

   public void setRPr(CTRPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().find_element_user(RPR$0, 0);
         if(var3 == null) {
            var3 = (CTRPr)this.get_store().add_element_user(RPR$0);
         }

         var3.set(var1);
      }
   }

   public CTRPr addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().add_element_user(RPR$0);
         return var2;
      }
   }

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, 0);
      }
   }

}
