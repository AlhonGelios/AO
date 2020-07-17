package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.NotesMasterDocument;

public class NotesMasterDocumentImpl extends XmlComplexContentImpl implements NotesMasterDocument {

   private static final QName NOTESMASTER$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesMaster");


   public NotesMasterDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTNotesMaster getNotesMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMaster var2 = null;
         var2 = (CTNotesMaster)this.get_store().find_element_user(NOTESMASTER$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNotesMaster(CTNotesMaster var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMaster var3 = null;
         var3 = (CTNotesMaster)this.get_store().find_element_user(NOTESMASTER$0, 0);
         if(var3 == null) {
            var3 = (CTNotesMaster)this.get_store().add_element_user(NOTESMASTER$0);
         }

         var3.set(var1);
      }
   }

   public CTNotesMaster addNewNotesMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMaster var2 = null;
         var2 = (CTNotesMaster)this.get_store().add_element_user(NOTESMASTER$0);
         return var2;
      }
   }

}
