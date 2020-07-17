package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;

public class CTSymImpl extends XmlComplexContentImpl implements CTSym {

   private static final QName FONT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "font");
   private static final QName CHAR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "char");


   public CTSymImpl(SchemaType var1) {
      super(var1);
   }

   public String getFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FONT$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(FONT$0);
         return var2;
      }
   }

   public boolean isSetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FONT$0) != null;
      }
   }

   public void setFont(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FONT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FONT$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFont(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(FONT$0);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(FONT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FONT$0);
      }
   }

   public byte[] getChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CHAR$2);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STShortHexNumber xgetChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShortHexNumber var2 = null;
         var2 = (STShortHexNumber)this.get_store().find_attribute_user(CHAR$2);
         return var2;
      }
   }

   public boolean isSetChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CHAR$2) != null;
      }
   }

   public void setChar(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CHAR$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CHAR$2);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetChar(STShortHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STShortHexNumber var3 = null;
         var3 = (STShortHexNumber)this.get_store().find_attribute_user(CHAR$2);
         if(var3 == null) {
            var3 = (STShortHexNumber)this.get_store().add_attribute_user(CHAR$2);
         }

         var3.set(var1);
      }
   }

   public void unsetChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CHAR$2);
      }
   }

}
