package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide;
import org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula;
import org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName;

public class CTGeomGuideImpl extends XmlComplexContentImpl implements CTGeomGuide {

   private static final QName NAME$0 = new QName("", "name");
   private static final QName FMLA$2 = new QName("", "fmla");


   public CTGeomGuideImpl(SchemaType var1) {
      super(var1);
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGeomGuideName xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGeomGuideName var2 = null;
         var2 = (STGeomGuideName)this.get_store().find_attribute_user(NAME$0);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STGeomGuideName var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGeomGuideName var3 = null;
         var3 = (STGeomGuideName)this.get_store().find_attribute_user(NAME$0);
         if(var3 == null) {
            var3 = (STGeomGuideName)this.get_store().add_attribute_user(NAME$0);
         }

         var3.set(var1);
      }
   }

   public String getFmla() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FMLA$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGeomGuideFormula xgetFmla() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGeomGuideFormula var2 = null;
         var2 = (STGeomGuideFormula)this.get_store().find_attribute_user(FMLA$2);
         return var2;
      }
   }

   public void setFmla(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FMLA$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FMLA$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFmla(STGeomGuideFormula var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGeomGuideFormula var3 = null;
         var3 = (STGeomGuideFormula)this.get_store().find_attribute_user(FMLA$2);
         if(var3 == null) {
            var3 = (STGeomGuideFormula)this.get_store().add_attribute_user(FMLA$2);
         }

         var3.set(var1);
      }
   }

}
