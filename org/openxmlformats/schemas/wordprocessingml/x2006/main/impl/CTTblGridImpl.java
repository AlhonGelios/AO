package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGrid;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblGridChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTblGridBaseImpl;

public class CTTblGridImpl extends CTTblGridBaseImpl implements CTTblGrid {

   private static final QName TBLGRIDCHANGE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblGridChange");


   public CTTblGridImpl(SchemaType var1) {
      super(var1);
   }

   public CTTblGridChange getTblGridChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridChange var2 = null;
         var2 = (CTTblGridChange)this.get_store().find_element_user(TBLGRIDCHANGE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTblGridChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLGRIDCHANGE$0) != 0;
      }
   }

   public void setTblGridChange(CTTblGridChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridChange var3 = null;
         var3 = (CTTblGridChange)this.get_store().find_element_user(TBLGRIDCHANGE$0, 0);
         if(var3 == null) {
            var3 = (CTTblGridChange)this.get_store().add_element_user(TBLGRIDCHANGE$0);
         }

         var3.set(var1);
      }
   }

   public CTTblGridChange addNewTblGridChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblGridChange var2 = null;
         var2 = (CTTblGridChange)this.get_store().add_element_user(TBLGRIDCHANGE$0);
         return var2;
      }
   }

   public void unsetTblGridChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLGRIDCHANGE$0, 0);
      }
   }

}
