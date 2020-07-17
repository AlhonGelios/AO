package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBackgroundFillStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrix;

public class CTStyleMatrixImpl extends XmlComplexContentImpl implements CTStyleMatrix {

   private static final QName FILLSTYLELST$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillStyleLst");
   private static final QName LNSTYLELST$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnStyleLst");
   private static final QName EFFECTSTYLELST$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectStyleLst");
   private static final QName BGFILLSTYLELST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bgFillStyleLst");
   private static final QName NAME$8 = new QName("", "name");


   public CTStyleMatrixImpl(SchemaType var1) {
      super(var1);
   }

   public CTFillStyleList getFillStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillStyleList var2 = null;
         var2 = (CTFillStyleList)this.get_store().find_element_user(FILLSTYLELST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setFillStyleLst(CTFillStyleList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillStyleList var3 = null;
         var3 = (CTFillStyleList)this.get_store().find_element_user(FILLSTYLELST$0, 0);
         if(var3 == null) {
            var3 = (CTFillStyleList)this.get_store().add_element_user(FILLSTYLELST$0);
         }

         var3.set(var1);
      }
   }

   public CTFillStyleList addNewFillStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillStyleList var2 = null;
         var2 = (CTFillStyleList)this.get_store().add_element_user(FILLSTYLELST$0);
         return var2;
      }
   }

   public CTLineStyleList getLnStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineStyleList var2 = null;
         var2 = (CTLineStyleList)this.get_store().find_element_user(LNSTYLELST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setLnStyleLst(CTLineStyleList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineStyleList var3 = null;
         var3 = (CTLineStyleList)this.get_store().find_element_user(LNSTYLELST$2, 0);
         if(var3 == null) {
            var3 = (CTLineStyleList)this.get_store().add_element_user(LNSTYLELST$2);
         }

         var3.set(var1);
      }
   }

   public CTLineStyleList addNewLnStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineStyleList var2 = null;
         var2 = (CTLineStyleList)this.get_store().add_element_user(LNSTYLELST$2);
         return var2;
      }
   }

   public CTEffectStyleList getEffectStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleList var2 = null;
         var2 = (CTEffectStyleList)this.get_store().find_element_user(EFFECTSTYLELST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setEffectStyleLst(CTEffectStyleList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleList var3 = null;
         var3 = (CTEffectStyleList)this.get_store().find_element_user(EFFECTSTYLELST$4, 0);
         if(var3 == null) {
            var3 = (CTEffectStyleList)this.get_store().add_element_user(EFFECTSTYLELST$4);
         }

         var3.set(var1);
      }
   }

   public CTEffectStyleList addNewEffectStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectStyleList var2 = null;
         var2 = (CTEffectStyleList)this.get_store().add_element_user(EFFECTSTYLELST$4);
         return var2;
      }
   }

   public CTBackgroundFillStyleList getBgFillStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackgroundFillStyleList var2 = null;
         var2 = (CTBackgroundFillStyleList)this.get_store().find_element_user(BGFILLSTYLELST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public void setBgFillStyleLst(CTBackgroundFillStyleList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackgroundFillStyleList var3 = null;
         var3 = (CTBackgroundFillStyleList)this.get_store().find_element_user(BGFILLSTYLELST$6, 0);
         if(var3 == null) {
            var3 = (CTBackgroundFillStyleList)this.get_store().add_element_user(BGFILLSTYLELST$6);
         }

         var3.set(var1);
      }
   }

   public CTBackgroundFillStyleList addNewBgFillStyleLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBackgroundFillStyleList var2 = null;
         var2 = (CTBackgroundFillStyleList)this.get_store().add_element_user(BGFILLSTYLELST$6);
         return var2;
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NAME$8);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(NAME$8);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(NAME$8);
         }

         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$8) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(NAME$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(NAME$8);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$8);
      }
   }

}
