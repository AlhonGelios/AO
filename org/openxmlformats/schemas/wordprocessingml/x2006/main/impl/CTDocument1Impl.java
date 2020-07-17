package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTDocumentBaseImpl;

public class CTDocument1Impl extends CTDocumentBaseImpl implements CTDocument1 {

   private static final QName BODY$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "body");


   public CTDocument1Impl(SchemaType var1) {
      super(var1);
   }

   public CTBody getBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBody var2 = null;
         var2 = (CTBody)this.get_store().find_element_user(BODY$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BODY$0) != 0;
      }
   }

   public void setBody(CTBody var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBody var3 = null;
         var3 = (CTBody)this.get_store().find_element_user(BODY$0, 0);
         if(var3 == null) {
            var3 = (CTBody)this.get_store().add_element_user(BODY$0);
         }

         var3.set(var1);
      }
   }

   public CTBody addNewBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBody var2 = null;
         var2 = (CTBody)this.get_store().add_element_user(BODY$0);
         return var2;
      }
   }

   public void unsetBody() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BODY$0, 0);
      }
   }

}
