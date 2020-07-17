package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTDrawingImpl.1AnchorList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTDrawingImpl.1InlineList;

public class CTDrawingImpl extends XmlComplexContentImpl implements CTDrawing {

   private static final QName ANCHOR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "anchor");
   private static final QName INLINE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "inline");


   public CTDrawingImpl(SchemaType var1) {
      super(var1);
   }

   public List getAnchorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AnchorList(this);
      }
   }

   public CTAnchor[] getAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ANCHOR$0, var2);
         CTAnchor[] var3 = new CTAnchor[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAnchor getAnchorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchor var3 = null;
         var3 = (CTAnchor)this.get_store().find_element_user(ANCHOR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAnchorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ANCHOR$0);
      }
   }

   public void setAnchorArray(CTAnchor[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ANCHOR$0);
      }
   }

   public void setAnchorArray(int var1, CTAnchor var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchor var4 = null;
         var4 = (CTAnchor)this.get_store().find_element_user(ANCHOR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAnchor insertNewAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchor var3 = null;
         var3 = (CTAnchor)this.get_store().insert_element_user(ANCHOR$0, var1);
         return var3;
      }
   }

   public CTAnchor addNewAnchor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchor var2 = null;
         var2 = (CTAnchor)this.get_store().add_element_user(ANCHOR$0);
         return var2;
      }
   }

   public void removeAnchor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ANCHOR$0, var1);
      }
   }

   public List getInlineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1InlineList(this);
      }
   }

   public CTInline[] getInlineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INLINE$2, var2);
         CTInline[] var3 = new CTInline[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTInline getInlineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInline var3 = null;
         var3 = (CTInline)this.get_store().find_element_user(INLINE$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfInlineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INLINE$2);
      }
   }

   public void setInlineArray(CTInline[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INLINE$2);
      }
   }

   public void setInlineArray(int var1, CTInline var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInline var4 = null;
         var4 = (CTInline)this.get_store().find_element_user(INLINE$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTInline insertNewInline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInline var3 = null;
         var3 = (CTInline)this.get_store().insert_element_user(INLINE$2, var1);
         return var3;
      }
   }

   public CTInline addNewInline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInline var2 = null;
         var2 = (CTInline)this.get_store().add_element_user(INLINE$2);
         return var2;
      }
   }

   public void removeInline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INLINE$2, var1);
      }
   }

}
