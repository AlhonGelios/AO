package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItem;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STItemType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTItemImpl extends XmlComplexContentImpl implements CTItem {

   private static final QName N$0 = new QName("", "n");
   private static final QName T$2 = new QName("", "t");
   private static final QName H$4 = new QName("", "h");
   private static final QName S$6 = new QName("", "s");
   private static final QName SD$8 = new QName("", "sd");
   private static final QName F$10 = new QName("", "f");
   private static final QName M$12 = new QName("", "m");
   private static final QName C$14 = new QName("", "c");
   private static final QName X$16 = new QName("", "x");
   private static final QName D$18 = new QName("", "d");
   private static final QName E$20 = new QName("", "e");


   public CTItemImpl(SchemaType var1) {
      super(var1);
   }

   public String getN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(N$0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(N$0);
         return var2;
      }
   }

   public boolean isSetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(N$0) != null;
      }
   }

   public void setN(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(N$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(N$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetN(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(N$0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(N$0);
         }

         var3.set(var1);
      }
   }

   public void unsetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(N$0);
      }
   }

   public STItemType.Enum getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(T$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(T$2);
         }

         return var2 == null?null:(STItemType.Enum)var2.getEnumValue();
      }
   }

   public STItemType xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STItemType var2 = null;
         var2 = (STItemType)this.get_store().find_attribute_user(T$2);
         if(var2 == null) {
            var2 = (STItemType)this.get_default_attribute_value(T$2);
         }

         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(T$2) != null;
      }
   }

   public void setT(STItemType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(T$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(T$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetT(STItemType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STItemType var3 = null;
         var3 = (STItemType)this.get_store().find_attribute_user(T$2);
         if(var3 == null) {
            var3 = (STItemType)this.get_store().add_attribute_user(T$2);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(T$2);
      }
   }

   public boolean getH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(H$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(H$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(H$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(H$4);
         }

         return var2;
      }
   }

   public boolean isSetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(H$4) != null;
      }
   }

   public void setH(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(H$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(H$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetH(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(H$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(H$4);
         }

         var3.set(var1);
      }
   }

   public void unsetH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(H$4);
      }
   }

   public boolean getS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(S$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(S$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(S$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(S$6);
         }

         return var2;
      }
   }

   public boolean isSetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(S$6) != null;
      }
   }

   public void setS(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(S$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(S$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetS(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(S$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(S$6);
         }

         var3.set(var1);
      }
   }

   public void unsetS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(S$6);
      }
   }

   public boolean getSd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SD$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SD$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SD$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SD$8);
         }

         return var2;
      }
   }

   public boolean isSetSd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SD$8) != null;
      }
   }

   public void setSd(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SD$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SD$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSd(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SD$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SD$8);
         }

         var3.set(var1);
      }
   }

   public void unsetSd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SD$8);
      }
   }

   public boolean getF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(F$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(F$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(F$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(F$10);
         }

         return var2;
      }
   }

   public boolean isSetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(F$10) != null;
      }
   }

   public void setF(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(F$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(F$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetF(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(F$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(F$10);
         }

         var3.set(var1);
      }
   }

   public void unsetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(F$10);
      }
   }

   public boolean getM() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(M$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(M$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetM() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(M$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(M$12);
         }

         return var2;
      }
   }

   public boolean isSetM() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(M$12) != null;
      }
   }

   public void setM(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(M$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(M$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetM(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(M$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(M$12);
         }

         var3.set(var1);
      }
   }

   public void unsetM() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(M$12);
      }
   }

   public boolean getC() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(C$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(C$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetC() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(C$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(C$14);
         }

         return var2;
      }
   }

   public boolean isSetC() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(C$14) != null;
      }
   }

   public void setC(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(C$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(C$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetC(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(C$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(C$14);
         }

         var3.set(var1);
      }
   }

   public void unsetC() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(C$14);
      }
   }

   public long getX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(X$16);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(X$16);
         return var2;
      }
   }

   public boolean isSetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(X$16) != null;
      }
   }

   public void setX(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(X$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(X$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetX(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(X$16);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(X$16);
         }

         var3.set(var1);
      }
   }

   public void unsetX() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(X$16);
      }
   }

   public boolean getD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(D$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(D$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(D$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(D$18);
         }

         return var2;
      }
   }

   public boolean isSetD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(D$18) != null;
      }
   }

   public void setD(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(D$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(D$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetD(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(D$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(D$18);
         }

         var3.set(var1);
      }
   }

   public void unsetD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(D$18);
      }
   }

   public boolean getE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(E$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(E$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(E$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(E$20);
         }

         return var2;
      }
   }

   public boolean isSetE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(E$20) != null;
      }
   }

   public void setE(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(E$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(E$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetE(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(E$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(E$20);
         }

         var3.set(var1);
      }
   }

   public void unsetE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(E$20);
      }
   }

}
