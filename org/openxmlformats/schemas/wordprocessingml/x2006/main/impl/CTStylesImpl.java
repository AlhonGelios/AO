package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLatentStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTStylesImpl.1StyleList;

public class CTStylesImpl extends XmlComplexContentImpl implements CTStyles {

   private static final QName DOCDEFAULTS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docDefaults");
   private static final QName LATENTSTYLES$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "latentStyles");
   private static final QName STYLE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "style");


   public CTStylesImpl(SchemaType var1) {
      super(var1);
   }

   public CTDocDefaults getDocDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocDefaults var2 = null;
         var2 = (CTDocDefaults)this.get_store().find_element_user(DOCDEFAULTS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCDEFAULTS$0) != 0;
      }
   }

   public void setDocDefaults(CTDocDefaults var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocDefaults var3 = null;
         var3 = (CTDocDefaults)this.get_store().find_element_user(DOCDEFAULTS$0, 0);
         if(var3 == null) {
            var3 = (CTDocDefaults)this.get_store().add_element_user(DOCDEFAULTS$0);
         }

         var3.set(var1);
      }
   }

   public CTDocDefaults addNewDocDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocDefaults var2 = null;
         var2 = (CTDocDefaults)this.get_store().add_element_user(DOCDEFAULTS$0);
         return var2;
      }
   }

   public void unsetDocDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCDEFAULTS$0, 0);
      }
   }

   public CTLatentStyles getLatentStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLatentStyles var2 = null;
         var2 = (CTLatentStyles)this.get_store().find_element_user(LATENTSTYLES$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLatentStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LATENTSTYLES$2) != 0;
      }
   }

   public void setLatentStyles(CTLatentStyles var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLatentStyles var3 = null;
         var3 = (CTLatentStyles)this.get_store().find_element_user(LATENTSTYLES$2, 0);
         if(var3 == null) {
            var3 = (CTLatentStyles)this.get_store().add_element_user(LATENTSTYLES$2);
         }

         var3.set(var1);
      }
   }

   public CTLatentStyles addNewLatentStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLatentStyles var2 = null;
         var2 = (CTLatentStyles)this.get_store().add_element_user(LATENTSTYLES$2);
         return var2;
      }
   }

   public void unsetLatentStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LATENTSTYLES$2, 0);
      }
   }

   public List getStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1StyleList(this);
      }
   }

   public CTStyle[] getStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(STYLE$4, var2);
         CTStyle[] var3 = new CTStyle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTStyle getStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var3 = null;
         var3 = (CTStyle)this.get_store().find_element_user(STYLE$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLE$4);
      }
   }

   public void setStyleArray(CTStyle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, STYLE$4);
      }
   }

   public void setStyleArray(int var1, CTStyle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var4 = null;
         var4 = (CTStyle)this.get_store().find_element_user(STYLE$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTStyle insertNewStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var3 = null;
         var3 = (CTStyle)this.get_store().insert_element_user(STYLE$4, var1);
         return var3;
      }
   }

   public CTStyle addNewStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyle var2 = null;
         var2 = (CTStyle)this.get_store().add_element_user(STYLE$4);
         return var2;
      }
   }

   public void removeStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLE$4, var1);
      }
   }

}
