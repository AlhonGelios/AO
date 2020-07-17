package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument;

public class NumberingDocumentImpl extends XmlComplexContentImpl implements NumberingDocument {

   private static final QName NUMBERING$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numbering");


   public NumberingDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTNumbering getNumbering() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumbering var2 = null;
         var2 = (CTNumbering)this.get_store().find_element_user(NUMBERING$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNumbering(CTNumbering var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumbering var3 = null;
         var3 = (CTNumbering)this.get_store().find_element_user(NUMBERING$0, 0);
         if(var3 == null) {
            var3 = (CTNumbering)this.get_store().add_element_user(NUMBERING$0);
         }

         var3.set(var1);
      }
   }

   public CTNumbering addNewNumbering() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumbering var2 = null;
         var2 = (CTNumbering)this.get_store().add_element_user(NUMBERING$0);
         return var2;
      }
   }

}
