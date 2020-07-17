package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSingleXmlCells;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.SingleXmlCellsDocument;

public class SingleXmlCellsDocumentImpl extends XmlComplexContentImpl implements SingleXmlCellsDocument {

   private static final QName SINGLEXMLCELLS$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "singleXmlCells");


   public SingleXmlCellsDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSingleXmlCells getSingleXmlCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCells var2 = null;
         var2 = (CTSingleXmlCells)this.get_store().find_element_user(SINGLEXMLCELLS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSingleXmlCells(CTSingleXmlCells var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCells var3 = null;
         var3 = (CTSingleXmlCells)this.get_store().find_element_user(SINGLEXMLCELLS$0, 0);
         if(var3 == null) {
            var3 = (CTSingleXmlCells)this.get_store().add_element_user(SINGLEXMLCELLS$0);
         }

         var3.set(var1);
      }
   }

   public CTSingleXmlCells addNewSingleXmlCells() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSingleXmlCells var2 = null;
         var2 = (CTSingleXmlCells)this.get_store().add_element_user(SINGLEXMLCELLS$0);
         return var2;
      }
   }

}
