package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentAuthorList;
import org.openxmlformats.schemas.presentationml.x2006.main.CmAuthorLstDocument;

public class CmAuthorLstDocumentImpl extends XmlComplexContentImpl implements CmAuthorLstDocument {

   private static final QName CMAUTHORLST$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmAuthorLst");


   public CmAuthorLstDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTCommentAuthorList getCmAuthorLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthorList var2 = null;
         var2 = (CTCommentAuthorList)this.get_store().find_element_user(CMAUTHORLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCmAuthorLst(CTCommentAuthorList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthorList var3 = null;
         var3 = (CTCommentAuthorList)this.get_store().find_element_user(CMAUTHORLST$0, 0);
         if(var3 == null) {
            var3 = (CTCommentAuthorList)this.get_store().add_element_user(CMAUTHORLST$0);
         }

         var3.set(var1);
      }
   }

   public CTCommentAuthorList addNewCmAuthorLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentAuthorList var2 = null;
         var2 = (CTCommentAuthorList)this.get_store().add_element_user(CMAUTHORLST$0);
         return var2;
      }
   }

}
