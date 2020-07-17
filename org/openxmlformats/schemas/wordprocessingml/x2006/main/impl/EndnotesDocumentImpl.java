package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.EndnotesDocument;

public class EndnotesDocumentImpl extends XmlComplexContentImpl implements EndnotesDocument {

   private static final QName ENDNOTES$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotes");


   public EndnotesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTEndnotes getEndnotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEndnotes var2 = null;
         var2 = (CTEndnotes)this.get_store().find_element_user(ENDNOTES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setEndnotes(CTEndnotes var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEndnotes var3 = null;
         var3 = (CTEndnotes)this.get_store().find_element_user(ENDNOTES$0, 0);
         if(var3 == null) {
            var3 = (CTEndnotes)this.get_store().add_element_user(ENDNOTES$0);
         }

         var3.set(var1);
      }
   }

   public CTEndnotes addNewEndnotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEndnotes var2 = null;
         var2 = (CTEndnotes)this.get_store().add_element_user(ENDNOTES$0);
         return var2;
      }
   }

}
