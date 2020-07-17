package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;

public class CTRegularTextRunImpl extends XmlComplexContentImpl implements CTRegularTextRun {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rPr");
   private static final QName T$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "t");


   public CTRegularTextRunImpl(SchemaType var1) {
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

   public String getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(T$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(T$2, 0);
         return var2;
      }
   }

   public void setT(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(T$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(T$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetT(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(T$2, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(T$2);
         }

         var3.set(var1);
      }
   }

}
