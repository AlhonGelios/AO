package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTcPrInnerImpl;

public class CTTcPrImpl extends CTTcPrInnerImpl implements CTTcPr {

   private static final QName TCPRCHANGE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tcPrChange");


   public CTTcPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTTcPrChange getTcPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcPrChange var2 = null;
         var2 = (CTTcPrChange)this.get_store().find_element_user(TCPRCHANGE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTcPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TCPRCHANGE$0) != 0;
      }
   }

   public void setTcPrChange(CTTcPrChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcPrChange var3 = null;
         var3 = (CTTcPrChange)this.get_store().find_element_user(TCPRCHANGE$0, 0);
         if(var3 == null) {
            var3 = (CTTcPrChange)this.get_store().add_element_user(TCPRCHANGE$0);
         }

         var3.set(var1);
      }
   }

   public CTTcPrChange addNewTcPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTcPrChange var2 = null;
         var2 = (CTTcPrChange)this.get_store().add_element_user(TCPRCHANGE$0);
         return var2;
      }
   }

   public void unsetTcPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TCPRCHANGE$0, 0);
      }
   }

}
