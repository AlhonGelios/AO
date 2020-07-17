package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmarkRange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTMarkupRangeImpl;

public class CTBookmarkRangeImpl extends CTMarkupRangeImpl implements CTBookmarkRange {

   private static final QName COLFIRST$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colFirst");
   private static final QName COLLAST$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colLast");


   public CTBookmarkRangeImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getColFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLFIRST$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetColFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(COLFIRST$0);
         return var2;
      }
   }

   public boolean isSetColFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLFIRST$0) != null;
      }
   }

   public void setColFirst(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLFIRST$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLFIRST$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetColFirst(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(COLFIRST$0);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(COLFIRST$0);
         }

         var3.set(var1);
      }
   }

   public void unsetColFirst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLFIRST$0);
      }
   }

   public BigInteger getColLast() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLLAST$2);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetColLast() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(COLLAST$2);
         return var2;
      }
   }

   public boolean isSetColLast() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLLAST$2) != null;
      }
   }

   public void setColLast(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLLAST$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLLAST$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetColLast(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(COLLAST$2);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(COLLAST$2);
         }

         var3.set(var1);
      }
   }

   public void unsetColLast() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLLAST$2);
      }
   }

}
