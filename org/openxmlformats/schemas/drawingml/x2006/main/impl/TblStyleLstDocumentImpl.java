package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.TblStyleLstDocument;

public class TblStyleLstDocumentImpl extends XmlComplexContentImpl implements TblStyleLstDocument {

   private static final QName TBLSTYLELST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tblStyleLst");


   public TblStyleLstDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTTableStyleList getTblStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleList var2 = null;
         var2 = (CTTableStyleList)this.get_store().find_element_user(TBLSTYLELST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTblStyleLst(CTTableStyleList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleList var3 = null;
         var3 = (CTTableStyleList)this.get_store().find_element_user(TBLSTYLELST$0, 0);
         if(var3 == null) {
            var3 = (CTTableStyleList)this.get_store().add_element_user(TBLSTYLELST$0);
         }

         var3.set(var1);
      }
   }

   public CTTableStyleList addNewTblStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleList var2 = null;
         var2 = (CTTableStyleList)this.get_store().add_element_user(TBLSTYLELST$0);
         return var2;
      }
   }

}
