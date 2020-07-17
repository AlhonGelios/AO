package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.SldDocument;

public class SldDocumentImpl extends XmlComplexContentImpl implements SldDocument {

   private static final QName SLD$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sld");


   public SldDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTSlide getSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlide var2 = null;
         var2 = (CTSlide)this.get_store().find_element_user(SLD$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setSld(CTSlide var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlide var3 = null;
         var3 = (CTSlide)this.get_store().find_element_user(SLD$0, 0);
         if(var3 == null) {
            var3 = (CTSlide)this.get_store().add_element_user(SLD$0);
         }

         var3.set(var1);
      }
   }

   public CTSlide addNewSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlide var2 = null;
         var2 = (CTSlide)this.get_store().add_element_user(SLD$0);
         return var2;
      }
   }

}
