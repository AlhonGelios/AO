package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class WorksheetDocumentImpl extends XmlComplexContentImpl implements WorksheetDocument {

   private static final QName WORKSHEET$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "worksheet");


   public WorksheetDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTWorksheet getWorksheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorksheet var2 = null;
         var2 = (CTWorksheet)this.get_store().find_element_user(WORKSHEET$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setWorksheet(CTWorksheet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorksheet var3 = null;
         var3 = (CTWorksheet)this.get_store().find_element_user(WORKSHEET$0, 0);
         if(var3 == null) {
            var3 = (CTWorksheet)this.get_store().add_element_user(WORKSHEET$0);
         }

         var3.set(var1);
      }
   }

   public CTWorksheet addNewWorksheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorksheet var2 = null;
         var2 = (CTWorksheet)this.get_store().add_element_user(WORKSHEET$0);
         return var2;
      }
   }

}
