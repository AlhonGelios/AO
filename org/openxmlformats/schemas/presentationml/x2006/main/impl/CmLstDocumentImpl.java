package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.presentationml.x2006.main.CmLstDocument;

public class CmLstDocumentImpl extends XmlComplexContentImpl implements CmLstDocument {

   private static final QName CMLST$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cmLst");


   public CmLstDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTCommentList getCmLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentList var2 = null;
         var2 = (CTCommentList)this.get_store().find_element_user(CMLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCmLst(CTCommentList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentList var3 = null;
         var3 = (CTCommentList)this.get_store().find_element_user(CMLST$0, 0);
         if(var3 == null) {
            var3 = (CTCommentList)this.get_store().add_element_user(CMLST$0);
         }

         var3.set(var1);
      }
   }

   public CTCommentList addNewCmLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommentList var2 = null;
         var2 = (CTCommentList)this.get_store().add_element_user(CMLST$0);
         return var2;
      }
   }

}
