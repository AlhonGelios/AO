package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RefByType;
import com.microsoft.schemas.office.visio.x2012.main.impl.CellTypeImpl.1RefByList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CellTypeImpl extends XmlComplexContentImpl implements CellType {

   private static final QName REFBY$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "RefBy");
   private static final QName N$2 = new QName("", "N");
   private static final QName U$4 = new QName("", "U");
   private static final QName E$6 = new QName("", "E");
   private static final QName F$8 = new QName("", "F");
   private static final QName V$10 = new QName("", "V");


   public CellTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getRefByList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RefByList(this);
      }
   }

   public RefByType[] getRefByArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REFBY$0, var2);
         RefByType[] var3 = new RefByType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public RefByType getRefByArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RefByType var3 = null;
         var3 = (RefByType)this.get_store().find_element_user(REFBY$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRefByArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REFBY$0);
      }
   }

   public void setRefByArray(RefByType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REFBY$0);
      }
   }

   public void setRefByArray(int var1, RefByType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RefByType var4 = null;
         var4 = (RefByType)this.get_store().find_element_user(REFBY$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public RefByType insertNewRefBy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RefByType var3 = null;
         var3 = (RefByType)this.get_store().insert_element_user(REFBY$0, var1);
         return var3;
      }
   }

   public RefByType addNewRefBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         RefByType var2 = null;
         var2 = (RefByType)this.get_store().add_element_user(REFBY$0);
         return var2;
      }
   }

   public void removeRefBy(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REFBY$0, var1);
      }
   }

   public String getN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(N$2);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(N$2);
         return var2;
      }
   }

   public void setN(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(N$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(N$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetN(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(N$2);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(N$2);
         }

         var3.set(var1);
      }
   }

   public String getU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(U$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(U$4);
         return var2;
      }
   }

   public boolean isSetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(U$4) != null;
      }
   }

   public void setU(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(U$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(U$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetU(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(U$4);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(U$4);
         }

         var3.set(var1);
      }
   }

   public void unsetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(U$4);
      }
   }

   public String getE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(E$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(E$6);
         return var2;
      }
   }

   public boolean isSetE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(E$6) != null;
      }
   }

   public void setE(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(E$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(E$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetE(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(E$6);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(E$6);
         }

         var3.set(var1);
      }
   }

   public void unsetE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(E$6);
      }
   }

   public String getF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(F$8);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(F$8);
         return var2;
      }
   }

   public boolean isSetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(F$8) != null;
      }
   }

   public void setF(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(F$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(F$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetF(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(F$8);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(F$8);
         }

         var3.set(var1);
      }
   }

   public void unsetF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(F$8);
      }
   }

   public String getV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(V$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(V$10);
         return var2;
      }
   }

   public boolean isSetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(V$10) != null;
      }
   }

   public void setV(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(V$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(V$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetV(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(V$10);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(V$10);
         }

         var3.set(var1);
      }
   }

   public void unsetV() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(V$10);
      }
   }

}
