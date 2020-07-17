package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTwipsMeasure;

public class CTIndImpl extends XmlComplexContentImpl implements CTInd {

   private static final QName LEFT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "left");
   private static final QName LEFTCHARS$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "leftChars");
   private static final QName RIGHT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "right");
   private static final QName RIGHTCHARS$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rightChars");
   private static final QName HANGING$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hanging");
   private static final QName HANGINGCHARS$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hangingChars");
   private static final QName FIRSTLINE$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "firstLine");
   private static final QName FIRSTLINECHARS$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "firstLineChars");


   public CTIndImpl(SchemaType var1) {
      super(var1);
   }

   public BigInteger getLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEFT$0);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STSignedTwipsMeasure xgetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var2 = null;
         var2 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(LEFT$0);
         return var2;
      }
   }

   public boolean isSetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LEFT$0) != null;
      }
   }

   public void setLeft(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LEFT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LEFT$0);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetLeft(STSignedTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var3 = null;
         var3 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(LEFT$0);
         if(var3 == null) {
            var3 = (STSignedTwipsMeasure)this.get_store().add_attribute_user(LEFT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LEFT$0);
      }
   }

   public BigInteger getLeftChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LEFTCHARS$2);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetLeftChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(LEFTCHARS$2);
         return var2;
      }
   }

   public boolean isSetLeftChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LEFTCHARS$2) != null;
      }
   }

   public void setLeftChars(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LEFTCHARS$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LEFTCHARS$2);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetLeftChars(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(LEFTCHARS$2);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(LEFTCHARS$2);
         }

         var3.set(var1);
      }
   }

   public void unsetLeftChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LEFTCHARS$2);
      }
   }

   public BigInteger getRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RIGHT$4);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STSignedTwipsMeasure xgetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var2 = null;
         var2 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(RIGHT$4);
         return var2;
      }
   }

   public boolean isSetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RIGHT$4) != null;
      }
   }

   public void setRight(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RIGHT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RIGHT$4);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetRight(STSignedTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignedTwipsMeasure var3 = null;
         var3 = (STSignedTwipsMeasure)this.get_store().find_attribute_user(RIGHT$4);
         if(var3 == null) {
            var3 = (STSignedTwipsMeasure)this.get_store().add_attribute_user(RIGHT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetRight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RIGHT$4);
      }
   }

   public BigInteger getRightChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RIGHTCHARS$6);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetRightChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(RIGHTCHARS$6);
         return var2;
      }
   }

   public boolean isSetRightChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RIGHTCHARS$6) != null;
      }
   }

   public void setRightChars(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RIGHTCHARS$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RIGHTCHARS$6);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetRightChars(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(RIGHTCHARS$6);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(RIGHTCHARS$6);
         }

         var3.set(var1);
      }
   }

   public void unsetRightChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RIGHTCHARS$6);
      }
   }

   public BigInteger getHanging() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HANGING$8);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetHanging() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(HANGING$8);
         return var2;
      }
   }

   public boolean isSetHanging() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HANGING$8) != null;
      }
   }

   public void setHanging(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HANGING$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HANGING$8);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetHanging(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(HANGING$8);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(HANGING$8);
         }

         var3.set(var1);
      }
   }

   public void unsetHanging() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HANGING$8);
      }
   }

   public BigInteger getHangingChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HANGINGCHARS$10);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetHangingChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(HANGINGCHARS$10);
         return var2;
      }
   }

   public boolean isSetHangingChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HANGINGCHARS$10) != null;
      }
   }

   public void setHangingChars(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HANGINGCHARS$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HANGINGCHARS$10);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetHangingChars(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(HANGINGCHARS$10);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(HANGINGCHARS$10);
         }

         var3.set(var1);
      }
   }

   public void unsetHangingChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HANGINGCHARS$10);
      }
   }

   public BigInteger getFirstLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTLINE$12);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STTwipsMeasure xgetFirstLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var2 = null;
         var2 = (STTwipsMeasure)this.get_store().find_attribute_user(FIRSTLINE$12);
         return var2;
      }
   }

   public boolean isSetFirstLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTLINE$12) != null;
      }
   }

   public void setFirstLine(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIRSTLINE$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIRSTLINE$12);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetFirstLine(STTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTwipsMeasure var3 = null;
         var3 = (STTwipsMeasure)this.get_store().find_attribute_user(FIRSTLINE$12);
         if(var3 == null) {
            var3 = (STTwipsMeasure)this.get_store().add_attribute_user(FIRSTLINE$12);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTLINE$12);
      }
   }

   public BigInteger getFirstLineChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTLINECHARS$14);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetFirstLineChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(FIRSTLINECHARS$14);
         return var2;
      }
   }

   public boolean isSetFirstLineChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTLINECHARS$14) != null;
      }
   }

   public void setFirstLineChars(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIRSTLINECHARS$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIRSTLINECHARS$14);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetFirstLineChars(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(FIRSTLINECHARS$14);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(FIRSTLINECHARS$14);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstLineChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTLINECHARS$14);
      }
   }

}
