package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextField;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STGuid;

public class CTTextFieldImpl extends XmlComplexContentImpl implements CTTextField {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rPr");
   private static final QName PPR$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pPr");
   private static final QName T$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "t");
   private static final QName ID$6 = new QName("", "id");
   private static final QName TYPE$8 = new QName("", "type");


   public CTTextFieldImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextCharacterProperties getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var2 = null;
         var2 = (CTTextCharacterProperties)this.get_store().find_element_user(RPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0) != 0;
      }
   }

   public void setRPr(CTTextCharacterProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var3 = null;
         var3 = (CTTextCharacterProperties)this.get_store().find_element_user(RPR$0, 0);
         if(var3 == null) {
            var3 = (CTTextCharacterProperties)this.get_store().add_element_user(RPR$0);
         }

         var3.set(var1);
      }
   }

   public CTTextCharacterProperties addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var2 = null;
         var2 = (CTTextCharacterProperties)this.get_store().add_element_user(RPR$0);
         return var2;
      }
   }

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, 0);
      }
   }

   public CTTextParagraphProperties getPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().find_element_user(PPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPR$2) != 0;
      }
   }

   public void setPPr(CTTextParagraphProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var3 = null;
         var3 = (CTTextParagraphProperties)this.get_store().find_element_user(PPR$2, 0);
         if(var3 == null) {
            var3 = (CTTextParagraphProperties)this.get_store().add_element_user(PPR$2);
         }

         var3.set(var1);
      }
   }

   public CTTextParagraphProperties addNewPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextParagraphProperties var2 = null;
         var2 = (CTTextParagraphProperties)this.get_store().add_element_user(PPR$2);
         return var2;
      }
   }

   public void unsetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPR$2, 0);
      }
   }

   public String getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(T$4, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(T$4, 0);
         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(T$4) != 0;
      }
   }

   public void setT(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(T$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(T$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetT(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(T$4, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(T$4);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(T$4, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STGuid xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var2 = null;
         var2 = (STGuid)this.get_store().find_attribute_user(ID$6);
         return var2;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STGuid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STGuid var3 = null;
         var3 = (STGuid)this.get_store().find_attribute_user(ID$6);
         if(var3 == null) {
            var3 = (STGuid)this.get_store().add_attribute_user(ID$6);
         }

         var3.set(var1);
      }
   }

   public String getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TYPE$8);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$8) != null;
      }
   }

   public void setType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetType(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TYPE$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TYPE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$8);
      }
   }

}
