package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.vml.CTF;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTFImpl extends XmlComplexContentImpl implements CTF {

   private static final QName EQN$0 = new QName("", "eqn");


   public CTFImpl(SchemaType var1) {
      super(var1);
   }

   public String getEqn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EQN$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetEqn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(EQN$0);
         return var2;
      }
   }

   public boolean isSetEqn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EQN$0) != null;
      }
   }

   public void setEqn(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EQN$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EQN$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEqn(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(EQN$0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(EQN$0);
         }

         var3.set(var1);
      }
   }

   public void unsetEqn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EQN$0);
      }
   }

}
