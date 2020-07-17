package org.openxmlformats.schemas.drawingml.x2006.picture.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.picture.PicDocument;

public class PicDocumentImpl extends XmlComplexContentImpl implements PicDocument {

   private static final QName PIC$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/picture", "pic");


   public PicDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTPicture getPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var2 = null;
         var2 = (CTPicture)this.get_store().find_element_user(PIC$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setPic(CTPicture var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var3 = null;
         var3 = (CTPicture)this.get_store().find_element_user(PIC$0, 0);
         if(var3 == null) {
            var3 = (CTPicture)this.get_store().add_element_user(PIC$0);
         }

         var3.set(var1);
      }
   }

   public CTPicture addNewPic() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var2 = null;
         var2 = (CTPicture)this.get_store().add_element_user(PIC$0);
         return var2;
      }
   }

}
