package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrEx;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPrExChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblPrExBaseImpl;

public class CTTblPrExImpl extends CTTblPrExBaseImpl implements CTTblPrEx {

   private static final QName TBLPREXCHANGE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblPrExChange");


   public CTTblPrExImpl(SchemaType var1) {
      super(var1);
   }

   public CTTblPrExChange getTblPrExChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrExChange var2 = null;
         var2 = (CTTblPrExChange)this.get_store().find_element_user(TBLPREXCHANGE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblPrExChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLPREXCHANGE$0) != 0;
      }
   }

   public void setTblPrExChange(CTTblPrExChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrExChange var3 = null;
         var3 = (CTTblPrExChange)this.get_store().find_element_user(TBLPREXCHANGE$0, 0);
         if(var3 == null) {
            var3 = (CTTblPrExChange)this.get_store().add_element_user(TBLPREXCHANGE$0);
         }

         var3.set(var1);
      }
   }

   public CTTblPrExChange addNewTblPrExChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblPrExChange var2 = null;
         var2 = (CTTblPrExChange)this.get_store().add_element_user(TBLPREXCHANGE$0);
         return var2;
      }
   }

   public void unsetTblPrExChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLPREXCHANGE$0, 0);
      }
   }

}
