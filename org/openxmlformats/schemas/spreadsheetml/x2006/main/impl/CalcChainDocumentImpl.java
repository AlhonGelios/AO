package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcChain;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CalcChainDocument;

public class CalcChainDocumentImpl extends XmlComplexContentImpl implements CalcChainDocument {

   private static final QName CALCCHAIN$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calcChain");


   public CalcChainDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTCalcChain getCalcChain() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcChain var2 = null;
         var2 = (CTCalcChain)this.get_store().find_element_user(CALCCHAIN$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCalcChain(CTCalcChain var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcChain var3 = null;
         var3 = (CTCalcChain)this.get_store().find_element_user(CALCCHAIN$0, 0);
         if(var3 == null) {
            var3 = (CTCalcChain)this.get_store().add_element_user(CALCCHAIN$0);
         }

         var3.set(var1);
      }
   }

   public CTCalcChain addNewCalcChain() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalcChain var2 = null;
         var2 = (CTCalcChain)this.get_store().add_element_user(CALCCHAIN$0);
         return var2;
      }
   }

}
