package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;

public class CTSdtDocPartImpl extends XmlComplexContentImpl implements CTSdtDocPart {

   private static final QName DOCPARTGALLERY$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartGallery");
   private static final QName DOCPARTCATEGORY$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartCategory");
   private static final QName DOCPARTUNIQUE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartUnique");


   public CTSdtDocPartImpl(SchemaType var1) {
      super(var1);
   }

   public CTString getDocPartGallery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(DOCPARTGALLERY$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocPartGallery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCPARTGALLERY$0) != 0;
      }
   }

   public void setDocPartGallery(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(DOCPARTGALLERY$0, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(DOCPARTGALLERY$0);
         }

         var3.set(var1);
      }
   }

   public CTString addNewDocPartGallery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(DOCPARTGALLERY$0);
         return var2;
      }
   }

   public void unsetDocPartGallery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCPARTGALLERY$0, 0);
      }
   }

   public CTString getDocPartCategory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(DOCPARTCATEGORY$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocPartCategory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCPARTCATEGORY$2) != 0;
      }
   }

   public void setDocPartCategory(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(DOCPARTCATEGORY$2, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(DOCPARTCATEGORY$2);
         }

         var3.set(var1);
      }
   }

   public CTString addNewDocPartCategory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(DOCPARTCATEGORY$2);
         return var2;
      }
   }

   public void unsetDocPartCategory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCPARTCATEGORY$2, 0);
      }
   }

   public CTOnOff getDocPartUnique() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DOCPARTUNIQUE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocPartUnique() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCPARTUNIQUE$4) != 0;
      }
   }

   public void setDocPartUnique(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DOCPARTUNIQUE$4, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DOCPARTUNIQUE$4);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDocPartUnique() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DOCPARTUNIQUE$4);
         return var2;
      }
   }

   public void unsetDocPartUnique() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCPARTUNIQUE$4, 0);
      }
   }

}
