package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTControl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPictureBaseImpl;

public class CTPictureImpl extends CTPictureBaseImpl implements CTPicture {

   private static final QName MOVIE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "movie");
   private static final QName CONTROL$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "control");


   public CTPictureImpl(SchemaType var1) {
      super(var1);
   }

   public CTRel getMovie() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().find_element_user(MOVIE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMovie() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVIE$0) != 0;
      }
   }

   public void setMovie(CTRel var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().find_element_user(MOVIE$0, 0);
         if(var3 == null) {
            var3 = (CTRel)this.get_store().add_element_user(MOVIE$0);
         }

         var3.set(var1);
      }
   }

   public CTRel addNewMovie() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().add_element_user(MOVIE$0);
         return var2;
      }
   }

   public void unsetMovie() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVIE$0, 0);
      }
   }

   public CTControl getControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControl var2 = null;
         var2 = (CTControl)this.get_store().find_element_user(CONTROL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONTROL$2) != 0;
      }
   }

   public void setControl(CTControl var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControl var3 = null;
         var3 = (CTControl)this.get_store().find_element_user(CONTROL$2, 0);
         if(var3 == null) {
            var3 = (CTControl)this.get_store().add_element_user(CONTROL$2);
         }

         var3.set(var1);
      }
   }

   public CTControl addNewControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTControl var2 = null;
         var2 = (CTControl)this.get_store().add_element_user(CONTROL$2);
         return var2;
      }
   }

   public void unsetControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONTROL$2, 0);
      }
   }

}
