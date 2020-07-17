package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.NotesDocument;

public class NotesDocumentImpl extends XmlComplexContentImpl implements NotesDocument {

   private static final QName NOTES$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notes");


   public NotesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTNotesSlide getNotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesSlide var2 = null;
         var2 = (CTNotesSlide)this.get_store().find_element_user(NOTES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNotes(CTNotesSlide var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesSlide var3 = null;
         var3 = (CTNotesSlide)this.get_store().find_element_user(NOTES$0, 0);
         if(var3 == null) {
            var3 = (CTNotesSlide)this.get_store().add_element_user(NOTES$0);
         }

         var3.set(var1);
      }
   }

   public CTNotesSlide addNewNotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesSlide var2 = null;
         var2 = (CTNotesSlide)this.get_store().add_element_user(NOTES$0);
         return var2;
      }
   }

}
