package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;

public class CTTblBordersImpl extends XmlComplexContentImpl implements CTTblBorders {

   private static final QName TOP$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "top");
   private static final QName LEFT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
   private static final QName BOTTOM$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bottom");
   private static final QName RIGHT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");
   private static final QName INSIDEH$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "insideH");
   private static final QName INSIDEV$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "insideV");


   public CTTblBordersImpl(SchemaType var1) {
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

   public CTBorder getInsideH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(INSIDEH$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetInsideH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INSIDEH$8) != 0;
      }
   }

   public void setInsideH(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(INSIDEH$8, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(INSIDEH$8);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewInsideH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(INSIDEH$8);
         return var2;
      }
   }

   public void unsetInsideH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INSIDEH$8, 0);
      }
   }

   public CTBorder getInsideV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(INSIDEV$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetInsideV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INSIDEV$10) != 0;
      }
   }

   public void setInsideV(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(INSIDEV$10, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(INSIDEV$10);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewInsideV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(INSIDEV$10);
         return var2;
      }
   }

   public void unsetInsideV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INSIDEV$10, 0);
      }
   }

}
