package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;

public class CTFFCheckBoxImpl extends XmlComplexContentImpl implements CTFFCheckBox {

   private static final QName SIZE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "size");
   private static final QName SIZEAUTO$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sizeAuto");
   private static final QName DEFAULT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "default");
   private static final QName CHECKED$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "checked");


   public CTFFCheckBoxImpl(SchemaType var1) {
      super(var1);
   }

   public CTHpsMeasure getSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().find_element_user(SIZE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIZE$0) != 0;
      }
   }

   public void setSize(CTHpsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var3 = null;
         var3 = (CTHpsMeasure)this.get_store().find_element_user(SIZE$0, 0);
         if(var3 == null) {
            var3 = (CTHpsMeasure)this.get_store().add_element_user(SIZE$0);
         }

         var3.set(var1);
      }
   }

   public CTHpsMeasure addNewSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().add_element_user(SIZE$0);
         return var2;
      }
   }

   public void unsetSize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIZE$0, 0);
      }
   }

   public CTOnOff getSizeAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SIZEAUTO$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSizeAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIZEAUTO$2) != 0;
      }
   }

   public void setSizeAuto(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SIZEAUTO$2, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SIZEAUTO$2);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSizeAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SIZEAUTO$2);
         return var2;
      }
   }

   public void unsetSizeAuto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIZEAUTO$2, 0);
      }
   }

   public CTOnOff getDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DEFAULT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFAULT$4) != 0;
      }
   }

   public void setDefault(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DEFAULT$4, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DEFAULT$4);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DEFAULT$4);
         return var2;
      }
   }

   public void unsetDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFAULT$4, 0);
      }
   }

   public CTOnOff getChecked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(CHECKED$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetChecked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHECKED$6) != 0;
      }
   }

   public void setChecked(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(CHECKED$6, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(CHECKED$6);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewChecked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(CHECKED$6);
         return var2;
      }
   }

   public void unsetChecked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHECKED$6, 0);
      }
   }

}
