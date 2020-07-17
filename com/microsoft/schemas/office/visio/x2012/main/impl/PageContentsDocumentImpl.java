package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.PageContentsDocument;
import com.microsoft.schemas.office.visio.x2012.main.PageContentsType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class PageContentsDocumentImpl extends XmlComplexContentImpl implements PageContentsDocument {

   private static final QName PAGECONTENTS$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "PageContents");


   public PageContentsDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public PageContentsType getPageContents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageContentsType var2 = null;
         var2 = (PageContentsType)this.get_store().find_element_user(PAGECONTENTS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPageContents(PageContentsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageContentsType var3 = null;
         var3 = (PageContentsType)this.get_store().find_element_user(PAGECONTENTS$0, 0);
         if(var3 == null) {
            var3 = (PageContentsType)this.get_store().add_element_user(PAGECONTENTS$0);
         }

         var3.set(var1);
      }
   }

   public PageContentsType addNewPageContents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageContentsType var2 = null;
         var2 = (PageContentsType)this.get_store().add_element_user(PAGECONTENTS$0);
         return var2;
      }
   }

}
