package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblPrBaseImpl;

public class CTTblPrImpl extends CTTblPrBaseImpl implements CTTblPr {

   private static final QName TBLPRCHANGE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPrChange");


   public CTTblPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTTblPrChange getTblPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrChange var2 = null;
         var2 = (CTTblPrChange)this.get_store().find_element_user(TBLPRCHANGE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLPRCHANGE$0) != 0;
      }
   }

   public void setTblPrChange(CTTblPrChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrChange var3 = null;
         var3 = (CTTblPrChange)this.get_store().find_element_user(TBLPRCHANGE$0, 0);
         if(var3 == null) {
            var3 = (CTTblPrChange)this.get_store().add_element_user(TBLPRCHANGE$0);
         }

         var3.set(var1);
      }
   }

   public CTTblPrChange addNewTblPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrChange var2 = null;
         var2 = (CTTblPrChange)this.get_store().add_element_user(TBLPRCHANGE$0);
         return var2;
      }
   }

   public void unsetTblPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLPRCHANGE$0, 0);
      }
   }

}
