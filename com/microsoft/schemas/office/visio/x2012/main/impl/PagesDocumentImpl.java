package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.PagesDocument;
import com.microsoft.schemas.office.visio.x2012.main.PagesType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class PagesDocumentImpl extends XmlComplexContentImpl implements PagesDocument {

   private static final QName PAGES$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Pages");


   public PagesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public PagesType getPages() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PagesType var2 = null;
         var2 = (PagesType)this.get_store().find_element_user(PAGES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPages(PagesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PagesType var3 = null;
         var3 = (PagesType)this.get_store().find_element_user(PAGES$0, 0);
         if(var3 == null) {
            var3 = (PagesType)this.get_store().add_element_user(PAGES$0);
         }

         var3.set(var1);
      }
   }

   public PagesType addNewPages() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PagesType var2 = null;
         var2 = (PagesType)this.get_store().add_element_user(PAGES$0);
         return var2;
      }
   }

}
