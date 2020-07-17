package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.MasterContentsDocument;
import com.microsoft.schemas.office.visio.x2012.main.PageContentsType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class MasterContentsDocumentImpl extends XmlComplexContentImpl implements MasterContentsDocument {

   private static final QName MASTERCONTENTS$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "MasterContents");


   public MasterContentsDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public PageContentsType getMasterContents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageContentsType var2 = null;
         var2 = (PageContentsType)this.get_store().find_element_user(MASTERCONTENTS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setMasterContents(PageContentsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageContentsType var3 = null;
         var3 = (PageContentsType)this.get_store().find_element_user(MASTERCONTENTS$0, 0);
         if(var3 == null) {
            var3 = (PageContentsType)this.get_store().add_element_user(MASTERCONTENTS$0);
         }

         var3.set(var1);
      }
   }

   public PageContentsType addNewMasterContents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageContentsType var2 = null;
         var2 = (PageContentsType)this.get_store().add_element_user(MASTERCONTENTS$0);
         return var2;
      }
   }

}
