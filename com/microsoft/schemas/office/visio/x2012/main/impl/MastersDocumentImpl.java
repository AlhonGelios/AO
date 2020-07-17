package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.MastersDocument;
import com.microsoft.schemas.office.visio.x2012.main.MastersType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class MastersDocumentImpl extends XmlComplexContentImpl implements MastersDocument {

   private static final QName MASTERS$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Masters");


   public MastersDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public MastersType getMasters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MastersType var2 = null;
         var2 = (MastersType)this.get_store().find_element_user(MASTERS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setMasters(MastersType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MastersType var3 = null;
         var3 = (MastersType)this.get_store().find_element_user(MASTERS$0, 0);
         if(var3 == null) {
            var3 = (MastersType)this.get_store().add_element_user(MASTERS$0);
         }

         var3.set(var1);
      }
   }

   public MastersType addNewMasters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MastersType var2 = null;
         var2 = (MastersType)this.get_store().add_element_user(MASTERS$0);
         return var2;
      }
   }

}
