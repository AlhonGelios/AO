package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.TableDocument;

public class TableDocumentImpl extends XmlComplexContentImpl implements TableDocument {

   private static final QName TABLE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "table");


   public TableDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTTable getTable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTable var2 = null;
         var2 = (CTTable)this.get_store().find_element_user(TABLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTable(CTTable var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTable var3 = null;
         var3 = (CTTable)this.get_store().find_element_user(TABLE$0, 0);
         if(var3 == null) {
            var3 = (CTTable)this.get_store().add_element_user(TABLE$0);
         }

         var3.set(var1);
      }
   }

   public CTTable addNewTable() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTable var2 = null;
         var2 = (CTTable)this.get_store().add_element_user(TABLE$0);
         return var2;
      }
   }

}
