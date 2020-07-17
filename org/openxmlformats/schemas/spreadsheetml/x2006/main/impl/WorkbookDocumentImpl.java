package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class WorkbookDocumentImpl extends XmlComplexContentImpl implements WorkbookDocument {

   private static final QName WORKBOOK$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "workbook");


   public WorkbookDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTWorkbook getWorkbook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbook var2 = null;
         var2 = (CTWorkbook)this.get_store().find_element_user(WORKBOOK$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setWorkbook(CTWorkbook var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbook var3 = null;
         var3 = (CTWorkbook)this.get_store().find_element_user(WORKBOOK$0, 0);
         if(var3 == null) {
            var3 = (CTWorkbook)this.get_store().add_element_user(WORKBOOK$0);
         }

         var3.set(var1);
      }
   }

   public CTWorkbook addNewWorkbook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorkbook var2 = null;
         var2 = (CTWorkbook)this.get_store().add_element_user(WORKBOOK$0);
         return var2;
      }
   }

}
