package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocumentBase;

public class CTDocumentBaseImpl extends XmlComplexContentImpl implements CTDocumentBase {

   private static final QName BACKGROUND$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "background");


   public CTDocumentBaseImpl(SchemaType var1) {
      super(var1);
   }

   public CTBackground getBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackground var2 = null;
         var2 = (CTBackground)this.get_store().find_element_user(BACKGROUND$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BACKGROUND$0) != 0;
      }
   }

   public void setBackground(CTBackground var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackground var3 = null;
         var3 = (CTBackground)this.get_store().find_element_user(BACKGROUND$0, 0);
         if(var3 == null) {
            var3 = (CTBackground)this.get_store().add_element_user(BACKGROUND$0);
         }

         var3.set(var1);
      }
   }

   public CTBackground addNewBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackground var2 = null;
         var2 = (CTBackground)this.get_store().add_element_user(BACKGROUND$0);
         return var2;
      }
   }

   public void unsetBackground() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BACKGROUND$0, 0);
      }
   }

}
