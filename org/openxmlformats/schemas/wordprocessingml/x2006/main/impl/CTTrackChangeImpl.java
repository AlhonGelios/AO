package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDateTime;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTMarkupImpl;

public class CTTrackChangeImpl extends CTMarkupImpl implements CTTrackChange {

   private static final QName AUTHOR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "author");
   private static final QName DATE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "date");


   public CTTrackChangeImpl(SchemaType var1) {
      super(var1);
   }

   public String getAuthor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTHOR$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetAuthor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(AUTHOR$0);
         return var2;
      }
   }

   public void setAuthor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTHOR$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTHOR$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAuthor(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(AUTHOR$0);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(AUTHOR$0);
         }

         var3.set(var1);
      }
   }

   public Calendar getDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATE$2);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public STDateTime xgetDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDateTime var2 = null;
         var2 = (STDateTime)this.get_store().find_attribute_user(DATE$2);
         return var2;
      }
   }

   public boolean isSetDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATE$2) != null;
      }
   }

   public void setDate(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATE$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATE$2);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetDate(STDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDateTime var3 = null;
         var3 = (STDateTime)this.get_store().find_attribute_user(DATE$2);
         if(var3 == null) {
            var3 = (STDateTime)this.get_store().add_attribute_user(DATE$2);
         }

         var3.set(var1);
      }
   }

   public void unsetDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATE$2);
      }
   }

}
