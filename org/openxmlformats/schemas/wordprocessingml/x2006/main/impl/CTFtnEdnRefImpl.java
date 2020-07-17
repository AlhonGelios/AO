package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

public class CTFtnEdnRefImpl extends XmlComplexContentImpl implements CTFtnEdnRef {

   private static final QName CUSTOMMARKFOLLOWS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customMarkFollows");
   private static final QName ID$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "id");


   public CTFtnEdnRefImpl(SchemaType var1) {
      super(var1);
   }

   public STOnOff.Enum getCustomMarkFollows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMMARKFOLLOWS$0);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetCustomMarkFollows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(CUSTOMMARKFOLLOWS$0);
         return var2;
      }
   }

   public boolean isSetCustomMarkFollows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMMARKFOLLOWS$0) != null;
      }
   }

   public void setCustomMarkFollows(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMMARKFOLLOWS$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMMARKFOLLOWS$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCustomMarkFollows(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(CUSTOMMARKFOLLOWS$0);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(CUSTOMMARKFOLLOWS$0);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomMarkFollows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMMARKFOLLOWS$0);
      }
   }

   public BigInteger getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public void setId(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetId(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

}
