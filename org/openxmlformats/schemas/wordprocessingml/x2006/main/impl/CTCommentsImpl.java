package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComments;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTCommentsImpl.1CommentList;

public class CTCommentsImpl extends XmlComplexContentImpl implements CTComments {

   private static final QName COMMENT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "comment");


   public CTCommentsImpl(SchemaType var1) {
      super(var1);
   }

   public List getCommentList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CommentList(this);
      }
   }

   public CTComment[] getCommentArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMMENT$0, var2);
         CTComment[] var3 = new CTComment[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTComment getCommentArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var3 = null;
         var3 = (CTComment)this.get_store().find_element_user(COMMENT$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCommentArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMMENT$0);
      }
   }

   public void setCommentArray(CTComment[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMMENT$0);
      }
   }

   public void setCommentArray(int var1, CTComment var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var4 = null;
         var4 = (CTComment)this.get_store().find_element_user(COMMENT$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTComment insertNewComment(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var3 = null;
         var3 = (CTComment)this.get_store().insert_element_user(COMMENT$0, var1);
         return var3;
      }
   }

   public CTComment addNewComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComment var2 = null;
         var2 = (CTComment)this.get_store().add_element_user(COMMENT$0);
         return var2;
      }
   }

   public void removeComment(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMMENT$0, var1);
      }
   }

}
