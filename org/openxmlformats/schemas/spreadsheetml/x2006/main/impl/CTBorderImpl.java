package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr;

public class CTBorderImpl extends XmlComplexContentImpl implements CTBorder {

   private static final QName LEFT$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "left");
   private static final QName RIGHT$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "right");
   private static final QName TOP$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "top");
   private static final QName BOTTOM$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "bottom");
   private static final QName DIAGONAL$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "diagonal");
   private static final QName VERTICAL$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "vertical");
   private static final QName HORIZONTAL$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "horizontal");
   private static final QName DIAGONALUP$14 = new QName("", "diagonalUp");
   private static final QName DIAGONALDOWN$16 = new QName("", "diagonalDown");
   private static final QName OUTLINE$18 = new QName("", "outline");


   public CTBorderImpl(SchemaType var1) {
      super(var1);
   }

   public CTBorderPr getLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(LEFT$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEFT$0) != 0;
      }
   }

   public void setLeft(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(LEFT$0, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(LEFT$0);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(LEFT$0);
         return var2;
      }
   }

   public void unsetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEFT$0, 0);
      }
   }

   public CTBorderPr getRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(RIGHT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RIGHT$2) != 0;
      }
   }

   public void setRight(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(RIGHT$2, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(RIGHT$2);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(RIGHT$2);
         return var2;
      }
   }

   public void unsetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RIGHT$2, 0);
      }
   }

   public CTBorderPr getTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(TOP$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOP$4) != 0;
      }
   }

   public void setTop(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(TOP$4, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(TOP$4);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(TOP$4);
         return var2;
      }
   }

   public void unsetTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOP$4, 0);
      }
   }

   public CTBorderPr getBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(BOTTOM$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOTTOM$6) != 0;
      }
   }

   public void setBottom(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(BOTTOM$6, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(BOTTOM$6);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(BOTTOM$6);
         return var2;
      }
   }

   public void unsetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOTTOM$6, 0);
      }
   }

   public CTBorderPr getDiagonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(DIAGONAL$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDiagonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIAGONAL$8) != 0;
      }
   }

   public void setDiagonal(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(DIAGONAL$8, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(DIAGONAL$8);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewDiagonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(DIAGONAL$8);
         return var2;
      }
   }

   public void unsetDiagonal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIAGONAL$8, 0);
      }
   }

   public CTBorderPr getVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(VERTICAL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VERTICAL$10) != 0;
      }
   }

   public void setVertical(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(VERTICAL$10, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(VERTICAL$10);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(VERTICAL$10);
         return var2;
      }
   }

   public void unsetVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VERTICAL$10, 0);
      }
   }

   public CTBorderPr getHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().find_element_user(HORIZONTAL$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HORIZONTAL$12) != 0;
      }
   }

   public void setHorizontal(CTBorderPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var3 = null;
         var3 = (CTBorderPr)this.get_store().find_element_user(HORIZONTAL$12, 0);
         if(var3 == null) {
            var3 = (CTBorderPr)this.get_store().add_element_user(HORIZONTAL$12);
         }

         var3.set(var1);
      }
   }

   public CTBorderPr addNewHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorderPr var2 = null;
         var2 = (CTBorderPr)this.get_store().add_element_user(HORIZONTAL$12);
         return var2;
      }
   }

   public void unsetHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HORIZONTAL$12, 0);
      }
   }

   public boolean getDiagonalUp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIAGONALUP$14);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDiagonalUp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DIAGONALUP$14);
         return var2;
      }
   }

   public boolean isSetDiagonalUp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIAGONALUP$14) != null;
      }
   }

   public void setDiagonalUp(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIAGONALUP$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIAGONALUP$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDiagonalUp(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DIAGONALUP$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DIAGONALUP$14);
         }

         var3.set(var1);
      }
   }

   public void unsetDiagonalUp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIAGONALUP$14);
      }
   }

   public boolean getDiagonalDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIAGONALDOWN$16);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDiagonalDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DIAGONALDOWN$16);
         return var2;
      }
   }

   public boolean isSetDiagonalDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIAGONALDOWN$16) != null;
      }
   }

   public void setDiagonalDown(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIAGONALDOWN$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIAGONALDOWN$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDiagonalDown(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DIAGONALDOWN$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DIAGONALDOWN$16);
         }

         var3.set(var1);
      }
   }

   public void unsetDiagonalDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIAGONALDOWN$16);
      }
   }

   public boolean getOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINE$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINE$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(OUTLINE$18);
         }

         return var2;
      }
   }

   public boolean isSetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINE$18) != null;
      }
   }

   public void setOutline(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINE$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetOutline(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINE$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(OUTLINE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINE$18);
      }
   }

}
