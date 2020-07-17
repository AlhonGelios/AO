package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalcCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;

public class CTCalcCellImpl extends XmlComplexContentImpl implements CTCalcCell {

   private static final QName R$0 = new QName("", "r");
   private static final QName I$2 = new QName("", "i");
   private static final QName S$4 = new QName("", "s");
   private static final QName L$6 = new QName("", "l");
   private static final QName T$8 = new QName("", "t");
   private static final QName A$10 = new QName("", "a");


   public CTCalcCellImpl(SchemaType var1) {
      super(var1);
   }

   public String getR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(R$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(R$0);
         return var2;
      }
   }

   public void setR(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(R$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(R$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetR(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(R$0);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(R$0);
         }

         var3.set(var1);
      }
   }

   public int getI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(I$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(I$2);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(I$2);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(I$2);
         }

         return var2;
      }
   }

   public boolean isSetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(I$2) != null;
      }
   }

   public void setI(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(I$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(I$2);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetI(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(I$2);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(I$2);
         }

         var3.set(var1);
      }
   }

   public void unsetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(I$2);
      }
   }

   public boolean getS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(S$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(S$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(S$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(S$4);
         }

         return var2;
      }
   }

   public boolean isSetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(S$4) != null;
      }
   }

   public void setS(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(S$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(S$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetS(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(S$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(S$4);
         }

         var3.set(var1);
      }
   }

   public void unsetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(S$4);
      }
   }

   public boolean getL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(L$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(L$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(L$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(L$6);
         }

         return var2;
      }
   }

   public boolean isSetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(L$6) != null;
      }
   }

   public void setL(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(L$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(L$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetL(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(L$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(L$6);
         }

         var3.set(var1);
      }
   }

   public void unsetL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(L$6);
      }
   }

   public boolean getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(T$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(T$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(T$8);
         }

         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(T$8) != null;
      }
   }

   public void setT(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetT(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(T$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(T$8);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(T$8);
      }
   }

   public boolean getA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(A$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(A$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(A$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(A$10);
         }

         return var2;
      }
   }

   public boolean isSetA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(A$10) != null;
      }
   }

   public void setA(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(A$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(A$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetA(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(A$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(A$10);
         }

         var3.set(var1);
      }
   }

   public void unsetA() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(A$10);
      }
   }

}
