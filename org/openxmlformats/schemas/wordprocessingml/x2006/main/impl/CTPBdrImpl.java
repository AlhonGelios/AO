package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPBdr;

public class CTPBdrImpl extends XmlComplexContentImpl implements CTPBdr {

   private static final QName TOP$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "top");
   private static final QName LEFT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
   private static final QName BOTTOM$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bottom");
   private static final QName RIGHT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");
   private static final QName BETWEEN$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "between");
   private static final QName BAR$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bar");


   public CTPBdrImpl(SchemaType var1) {
      super(var1);
   }

   public CTBorder getTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(TOP$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOP$0) != 0;
      }
   }

   public void setTop(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(TOP$0, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(TOP$0);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(TOP$0);
         return var2;
      }
   }

   public void unsetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOP$0, 0);
      }
   }

   public CTBorder getLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(LEFT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEFT$2) != 0;
      }
   }

   public void setLeft(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(LEFT$2, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(LEFT$2);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(LEFT$2);
         return var2;
      }
   }

   public void unsetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEFT$2, 0);
      }
   }

   public CTBorder getBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(BOTTOM$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOTTOM$4) != 0;
      }
   }

   public void setBottom(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BOTTOM$4, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(BOTTOM$4);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BOTTOM$4);
         return var2;
      }
   }

   public void unsetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOTTOM$4, 0);
      }
   }

   public CTBorder getRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(RIGHT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RIGHT$6) != 0;
      }
   }

   public void setRight(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(RIGHT$6, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(RIGHT$6);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(RIGHT$6);
         return var2;
      }
   }

   public void unsetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RIGHT$6, 0);
      }
   }

   public CTBorder getBetween() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(BETWEEN$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBetween() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BETWEEN$8) != 0;
      }
   }

   public void setBetween(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BETWEEN$8, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(BETWEEN$8);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewBetween() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BETWEEN$8);
         return var2;
      }
   }

   public void unsetBetween() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BETWEEN$8, 0);
      }
   }

   public CTBorder getBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(BAR$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BAR$10) != 0;
      }
   }

   public void setBar(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BAR$10, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(BAR$10);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BAR$10);
         return var2;
      }
   }

   public void unsetBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BAR$10, 0);
      }
   }

}
