package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComments;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CommentsDocument;

public class CommentsDocumentImpl extends XmlComplexContentImpl implements CommentsDocument {

   private static final QName COMMENTS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "comments");


   public CommentsDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTComments getComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComments var2 = null;
         var2 = (CTComments)this.get_store().find_element_user(COMMENTS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setComments(CTComments var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComments var3 = null;
         var3 = (CTComments)this.get_store().find_element_user(COMMENTS$0, 0);
         if(var3 == null) {
            var3 = (CTComments)this.get_store().add_element_user(COMMENTS$0);
         }

         var3.set(var1);
      }
   }

   public CTComments addNewComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComments var2 = null;
         var2 = (CTComments)this.get_store().add_element_user(COMMENTS$0);
         return var2;
      }
   }

}
