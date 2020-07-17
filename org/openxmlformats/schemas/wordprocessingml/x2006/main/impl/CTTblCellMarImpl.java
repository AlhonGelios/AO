package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;

public class CTTblCellMarImpl extends XmlComplexContentImpl implements CTTblCellMar {

   private static final QName TOP$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "top");
   private static final QName LEFT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
   private static final QName BOTTOM$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bottom");
   private static final QName RIGHT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");


   public CTTblCellMarImpl(SchemaType var1) {
      super(var1);
   }

   public CTTblWidth getTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(TOP$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOP$0) != 0;
      }
   }

   public void setTop(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TOP$0, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(TOP$0);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TOP$0);
         return var2;
      }
   }

   public void unsetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOP$0, 0);
      }
   }

   public CTTblWidth getLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(LEFT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEFT$2) != 0;
      }
   }

   public void setLeft(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(LEFT$2, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(LEFT$2);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(LEFT$2);
         return var2;
      }
   }

   public void unsetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEFT$2, 0);
      }
   }

   public CTTblWidth getBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(BOTTOM$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOTTOM$4) != 0;
      }
   }

   public void setBottom(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(BOTTOM$4, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(BOTTOM$4);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(BOTTOM$4);
         return var2;
      }
   }

   public void unsetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOTTOM$4, 0);
      }
   }

   public CTTblWidth getRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().find_element_user(RIGHT$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RIGHT$6) != 0;
      }
   }

   public void setRight(CTTblWidth var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(RIGHT$6, 0);
         if(var3 == null) {
            var3 = (CTTblWidth)this.get_store().add_element_user(RIGHT$6);
         }

         var3.set(var1);
      }
   }

   public CTTblWidth addNewRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(RIGHT$6);
         return var2;
      }
   }

   public void unsetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RIGHT$6, 0);
      }
   }

}
