package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthor;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList;
import org.openxmlformats.schemas.presentationml.x2006.main.impl.CTCommentAuthorListImpl.1CmAuthorList;

public class CTCommentAuthorListImpl extends XmlComplexContentImpl implements CTCommentAuthorList {

   private static final QName CMAUTHOR$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmAuthor");


   public CTCommentAuthorListImpl(SchemaType var1) {
      super(var1);
   }

   public List getCmAuthorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CmAuthorList(this);
      }
   }

   public CTCommentAuthor[] getCmAuthorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CMAUTHOR$0, var2);
         CTCommentAuthor[] var3 = new CTCommentAuthor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCommentAuthor getCmAuthorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthor var3 = null;
         var3 = (CTCommentAuthor)this.get_store().find_element_user(CMAUTHOR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCmAuthorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CMAUTHOR$0);
      }
   }

   public void setCmAuthorArray(CTCommentAuthor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CMAUTHOR$0);
      }
   }

   public void setCmAuthorArray(int var1, CTCommentAuthor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthor var4 = null;
         var4 = (CTCommentAuthor)this.get_store().find_element_user(CMAUTHOR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCommentAuthor insertNewCmAuthor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthor var3 = null;
         var3 = (CTCommentAuthor)this.get_store().insert_element_user(CMAUTHOR$0, var1);
         return var3;
      }
   }

   public CTCommentAuthor addNewCmAuthor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthor var2 = null;
         var2 = (CTCommentAuthor)this.get_store().add_element_user(CMAUTHOR$0);
         return var2;
      }
   }

   public void removeCmAuthor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CMAUTHOR$0, var1);
      }
   }

}
