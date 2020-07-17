package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault;

public class CTPPrDefaultImpl extends XmlComplexContentImpl implements CTPPrDefault {

   private static final QName PPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");


   public CTPPrDefaultImpl(SchemaType var1) {
      super(var1);
   }

   public CTPPr getPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var2 = null;
         var2 = (CTPPr)this.get_store().find_element_user(PPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPR$0) != 0;
      }
   }

   public void setPPr(CTPPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var3 = null;
         var3 = (CTPPr)this.get_store().find_element_user(PPR$0, 0);
         if(var3 == null) {
            var3 = (CTPPr)this.get_store().add_element_user(PPR$0);
         }

         var3.set(var1);
      }
   }

   public CTPPr addNewPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var2 = null;
         var2 = (CTPPr)this.get_store().add_element_user(PPR$0);
         return var2;
      }
   }

   public void unsetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPR$0, 0);
      }
   }

}
