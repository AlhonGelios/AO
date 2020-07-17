package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout;
import org.openxmlformats.schemas.presentationml.x2006.main.SldLayoutDocument;

public class SldLayoutDocumentImpl extends XmlComplexContentImpl implements SldLayoutDocument {

   private static final QName SLDLAYOUT$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldLayout");


   public SldLayoutDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSlideLayout getSldLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideLayout var2 = null;
         var2 = (CTSlideLayout)this.get_store().find_element_user(SLDLAYOUT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSldLayout(CTSlideLayout var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideLayout var3 = null;
         var3 = (CTSlideLayout)this.get_store().find_element_user(SLDLAYOUT$0, 0);
         if(var3 == null) {
            var3 = (CTSlideLayout)this.get_store().add_element_user(SLDLAYOUT$0);
         }

         var3.set(var1);
      }
   }

   public CTSlideLayout addNewSldLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideLayout var2 = null;
         var2 = (CTSlideLayout)this.get_store().add_element_user(SLDLAYOUT$0);
         return var2;
      }
   }

}
