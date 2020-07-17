package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFootnotes;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FootnotesDocument;

public class FootnotesDocumentImpl extends XmlComplexContentImpl implements FootnotesDocument {

   private static final QName FOOTNOTES$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotes");


   public FootnotesDocumentImpl(SchemaType var1) {
      super(var1);
   }

   public CTFootnotes getFootnotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFootnotes var2 = null;
         var2 = (CTFootnotes)this.get_store().find_element_user(FOOTNOTES$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFootnotes(CTFootnotes var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFootnotes var3 = null;
         var3 = (CTFootnotes)this.get_store().find_element_user(FOOTNOTES$0, 0);
         if(var3 == null) {
            var3 = (CTFootnotes)this.get_store().add_element_user(FOOTNOTES$0);
         }

         var3.set(var1);
      }
   }

   public CTFootnotes addNewFootnotes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFootnotes var2 = null;
         var2 = (CTFootnotes)this.get_store().add_element_user(FOOTNOTES$0);
         return var2;
      }
   }

}
