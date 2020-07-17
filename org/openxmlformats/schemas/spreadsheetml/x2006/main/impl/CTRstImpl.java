package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPhoneticRun;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRElt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTRstImpl.1RList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTRstImpl.1RPhList;

public class CTRstImpl extends XmlComplexContentImpl implements CTRst {

   private static final QName T$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "t");
   private static final QName R$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "r");
   private static final QName RPH$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rPh");
   private static final QName PHONETICPR$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "phoneticPr");


   public CTRstImpl(SchemaType var1) {
      super(var1);
   }

   public String getT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(T$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_element_user(T$0, 0);
         return var2;
      }
   }

   public boolean isSetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(T$0) != 0;
      }
   }

   public void setT(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(T$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(T$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetT(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(T$0, 0);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_element_user(T$0);
         }

         var3.set(var1);
      }
   }

   public void unsetT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(T$0, 0);
      }
   }

   public List getRList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RList(this);
      }
   }

   public CTRElt[] getRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(R$2, var2);
         CTRElt[] var3 = new CTRElt[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRElt getRArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRElt var3 = null;
         var3 = (CTRElt)this.get_store().find_element_user(R$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(R$2);
      }
   }

   public void setRArray(CTRElt[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, R$2);
      }
   }

   public void setRArray(int var1, CTRElt var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRElt var4 = null;
         var4 = (CTRElt)this.get_store().find_element_user(R$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRElt insertNewR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRElt var3 = null;
         var3 = (CTRElt)this.get_store().insert_element_user(R$2, var1);
         return var3;
      }
   }

   public CTRElt addNewR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRElt var2 = null;
         var2 = (CTRElt)this.get_store().add_element_user(R$2);
         return var2;
      }
   }

   public void removeR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(R$2, var1);
      }
   }

   public List getRPhList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RPhList(this);
      }
   }

   public CTPhoneticRun[] getRPhArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RPH$4, var2);
         CTPhoneticRun[] var3 = new CTPhoneticRun[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPhoneticRun getRPhArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticRun var3 = null;
         var3 = (CTPhoneticRun)this.get_store().find_element_user(RPH$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRPhArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPH$4);
      }
   }

   public void setRPhArray(CTPhoneticRun[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RPH$4);
      }
   }

   public void setRPhArray(int var1, CTPhoneticRun var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticRun var4 = null;
         var4 = (CTPhoneticRun)this.get_store().find_element_user(RPH$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPhoneticRun insertNewRPh(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticRun var3 = null;
         var3 = (CTPhoneticRun)this.get_store().insert_element_user(RPH$4, var1);
         return var3;
      }
   }

   public CTPhoneticRun addNewRPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticRun var2 = null;
         var2 = (CTPhoneticRun)this.get_store().add_element_user(RPH$4);
         return var2;
      }
   }

   public void removeRPh(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPH$4, var1);
      }
   }

   public CTPhoneticPr getPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticPr var2 = null;
         var2 = (CTPhoneticPr)this.get_store().find_element_user(PHONETICPR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PHONETICPR$6) != 0;
      }
   }

   public void setPhoneticPr(CTPhoneticPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticPr var3 = null;
         var3 = (CTPhoneticPr)this.get_store().find_element_user(PHONETICPR$6, 0);
         if(var3 == null) {
            var3 = (CTPhoneticPr)this.get_store().add_element_user(PHONETICPR$6);
         }

         var3.set(var1);
      }
   }

   public CTPhoneticPr addNewPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhoneticPr var2 = null;
         var2 = (CTPhoneticPr)this.get_store().add_element_user(PHONETICPR$6);
         return var2;
      }
   }

   public void unsetPhoneticPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PHONETICPR$6, 0);
      }
   }

}
