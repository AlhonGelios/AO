package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault;

public class CTDocDefaultsImpl extends XmlComplexContentImpl implements CTDocDefaults {

   private static final QName RPRDEFAULT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPrDefault");
   private static final QName PPRDEFAULT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPrDefault");


   public CTDocDefaultsImpl(SchemaType var1) {
      super(var1);
   }

   public CTRPrDefault getRPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPrDefault var2 = null;
         var2 = (CTRPrDefault)this.get_store().find_element_user(RPRDEFAULT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPRDEFAULT$0) != 0;
      }
   }

   public void setRPrDefault(CTRPrDefault var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPrDefault var3 = null;
         var3 = (CTRPrDefault)this.get_store().find_element_user(RPRDEFAULT$0, 0);
         if(var3 == null) {
            var3 = (CTRPrDefault)this.get_store().add_element_user(RPRDEFAULT$0);
         }

         var3.set(var1);
      }
   }

   public CTRPrDefault addNewRPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPrDefault var2 = null;
         var2 = (CTRPrDefault)this.get_store().add_element_user(RPRDEFAULT$0);
         return var2;
      }
   }

   public void unsetRPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPRDEFAULT$0, 0);
      }
   }

   public CTPPrDefault getPPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPrDefault var2 = null;
         var2 = (CTPPrDefault)this.get_store().find_element_user(PPRDEFAULT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPRDEFAULT$2) != 0;
      }
   }

   public void setPPrDefault(CTPPrDefault var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPrDefault var3 = null;
         var3 = (CTPPrDefault)this.get_store().find_element_user(PPRDEFAULT$2, 0);
         if(var3 == null) {
            var3 = (CTPPrDefault)this.get_store().add_element_user(PPRDEFAULT$2);
         }

         var3.set(var1);
      }
   }

   public CTPPrDefault addNewPPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPrDefault var2 = null;
         var2 = (CTPPrDefault)this.get_store().add_element_user(PPRDEFAULT$2);
         return var2;
      }
   }

   public void unsetPPrDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPRDEFAULT$2, 0);
      }
   }

}
