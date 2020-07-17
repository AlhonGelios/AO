package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;

public class CTShapeStyleImpl extends XmlComplexContentImpl implements CTShapeStyle {

   private static final QName LNREF$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnRef");
   private static final QName FILLREF$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillRef");
   private static final QName EFFECTREF$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectRef");
   private static final QName FONTREF$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fontRef");


   public CTShapeStyleImpl(SchemaType var1) {
      super(var1);
   }

   public CTStyleMatrixReference getLnRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().find_element_user(LNREF$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setLnRef(CTStyleMatrixReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var3 = null;
         var3 = (CTStyleMatrixReference)this.get_store().find_element_user(LNREF$0, 0);
         if(var3 == null) {
            var3 = (CTStyleMatrixReference)this.get_store().add_element_user(LNREF$0);
         }

         var3.set(var1);
      }
   }

   public CTStyleMatrixReference addNewLnRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().add_element_user(LNREF$0);
         return var2;
      }
   }

   public CTStyleMatrixReference getFillRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().find_element_user(FILLREF$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFillRef(CTStyleMatrixReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var3 = null;
         var3 = (CTStyleMatrixReference)this.get_store().find_element_user(FILLREF$2, 0);
         if(var3 == null) {
            var3 = (CTStyleMatrixReference)this.get_store().add_element_user(FILLREF$2);
         }

         var3.set(var1);
      }
   }

   public CTStyleMatrixReference addNewFillRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().add_element_user(FILLREF$2);
         return var2;
      }
   }

   public CTStyleMatrixReference getEffectRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().find_element_user(EFFECTREF$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setEffectRef(CTStyleMatrixReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var3 = null;
         var3 = (CTStyleMatrixReference)this.get_store().find_element_user(EFFECTREF$4, 0);
         if(var3 == null) {
            var3 = (CTStyleMatrixReference)this.get_store().add_element_user(EFFECTREF$4);
         }

         var3.set(var1);
      }
   }

   public CTStyleMatrixReference addNewEffectRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStyleMatrixReference var2 = null;
         var2 = (CTStyleMatrixReference)this.get_store().add_element_user(EFFECTREF$4);
         return var2;
      }
   }

   public CTFontReference getFontRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontReference var2 = null;
         var2 = (CTFontReference)this.get_store().find_element_user(FONTREF$6, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFontRef(CTFontReference var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontReference var3 = null;
         var3 = (CTFontReference)this.get_store().find_element_user(FONTREF$6, 0);
         if(var3 == null) {
            var3 = (CTFontReference)this.get_store().add_element_user(FONTREF$6);
         }

         var3.set(var1);
      }
   }

   public CTFontReference addNewFontRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFontReference var2 = null;
         var2 = (CTFontReference)this.get_store().add_element_user(FONTREF$6);
         return var2;
      }
   }

}
