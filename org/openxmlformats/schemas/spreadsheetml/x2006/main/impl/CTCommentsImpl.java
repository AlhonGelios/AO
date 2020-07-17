package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;

public class CTCommentsImpl extends XmlComplexContentImpl implements CTComments {

   private static final QName AUTHORS$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "authors");
   private static final QName COMMENTLIST$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "commentList");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTCommentsImpl(SchemaType var1) {
      super(var1);
   }

   public CTAuthors getAuthors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAuthors var2 = null;
         var2 = (CTAuthors)this.get_store().find_element_user(AUTHORS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setAuthors(CTAuthors var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAuthors var3 = null;
         var3 = (CTAuthors)this.get_store().find_element_user(AUTHORS$0, 0);
         if(var3 == null) {
            var3 = (CTAuthors)this.get_store().add_element_user(AUTHORS$0);
         }

         var3.set(var1);
      }
   }

   public CTAuthors addNewAuthors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAuthors var2 = null;
         var2 = (CTAuthors)this.get_store().add_element_user(AUTHORS$0);
         return var2;
      }
   }

   public CTCommentList getCommentList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentList var2 = null;
         var2 = (CTCommentList)this.get_store().find_element_user(COMMENTLIST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCommentList(CTCommentList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentList var3 = null;
         var3 = (CTCommentList)this.get_store().find_element_user(COMMENTLIST$2, 0);
         if(var3 == null) {
            var3 = (CTCommentList)this.get_store().add_element_user(COMMENTLIST$2);
         }

         var3.set(var1);
      }
   }

   public CTCommentList addNewCommentList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentList var2 = null;
         var2 = (CTCommentList)this.get_store().add_element_user(COMMENTLIST$2);
         return var2;
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

}
