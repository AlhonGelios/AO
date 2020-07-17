package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPicBullet;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTNumberingImpl.1AbstractNumList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTNumberingImpl.1NumList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTNumberingImpl.1NumPicBulletList;

public class CTNumberingImpl extends XmlComplexContentImpl implements CTNumbering {

   private static final QName NUMPICBULLET$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numPicBullet");
   private static final QName ABSTRACTNUM$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "abstractNum");
   private static final QName NUM$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "num");
   private static final QName NUMIDMACATCLEANUP$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numIdMacAtCleanup");


   public CTNumberingImpl(SchemaType var1) {
      super(var1);
   }

   public List getNumPicBulletList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NumPicBulletList(this);
      }
   }

   public CTNumPicBullet[] getNumPicBulletArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NUMPICBULLET$0, var2);
         CTNumPicBullet[] var3 = new CTNumPicBullet[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNumPicBullet getNumPicBulletArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPicBullet var3 = null;
         var3 = (CTNumPicBullet)this.get_store().find_element_user(NUMPICBULLET$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNumPicBulletArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMPICBULLET$0);
      }
   }

   public void setNumPicBulletArray(CTNumPicBullet[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NUMPICBULLET$0);
      }
   }

   public void setNumPicBulletArray(int var1, CTNumPicBullet var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPicBullet var4 = null;
         var4 = (CTNumPicBullet)this.get_store().find_element_user(NUMPICBULLET$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNumPicBullet insertNewNumPicBullet(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPicBullet var3 = null;
         var3 = (CTNumPicBullet)this.get_store().insert_element_user(NUMPICBULLET$0, var1);
         return var3;
      }
   }

   public CTNumPicBullet addNewNumPicBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPicBullet var2 = null;
         var2 = (CTNumPicBullet)this.get_store().add_element_user(NUMPICBULLET$0);
         return var2;
      }
   }

   public void removeNumPicBullet(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMPICBULLET$0, var1);
      }
   }

   public List getAbstractNumList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AbstractNumList(this);
      }
   }

   public CTAbstractNum[] getAbstractNumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ABSTRACTNUM$2, var2);
         CTAbstractNum[] var3 = new CTAbstractNum[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAbstractNum getAbstractNumArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbstractNum var3 = null;
         var3 = (CTAbstractNum)this.get_store().find_element_user(ABSTRACTNUM$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAbstractNumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ABSTRACTNUM$2);
      }
   }

   public void setAbstractNumArray(CTAbstractNum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ABSTRACTNUM$2);
      }
   }

   public void setAbstractNumArray(int var1, CTAbstractNum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbstractNum var4 = null;
         var4 = (CTAbstractNum)this.get_store().find_element_user(ABSTRACTNUM$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAbstractNum insertNewAbstractNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbstractNum var3 = null;
         var3 = (CTAbstractNum)this.get_store().insert_element_user(ABSTRACTNUM$2, var1);
         return var3;
      }
   }

   public CTAbstractNum addNewAbstractNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAbstractNum var2 = null;
         var2 = (CTAbstractNum)this.get_store().add_element_user(ABSTRACTNUM$2);
         return var2;
      }
   }

   public void removeAbstractNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ABSTRACTNUM$2, var1);
      }
   }

   public List getNumList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NumList(this);
      }
   }

   public CTNum[] getNumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NUM$4, var2);
         CTNum[] var3 = new CTNum[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNum getNumArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNum var3 = null;
         var3 = (CTNum)this.get_store().find_element_user(NUM$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUM$4);
      }
   }

   public void setNumArray(CTNum[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NUM$4);
      }
   }

   public void setNumArray(int var1, CTNum var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNum var4 = null;
         var4 = (CTNum)this.get_store().find_element_user(NUM$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNum insertNewNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNum var3 = null;
         var3 = (CTNum)this.get_store().insert_element_user(NUM$4, var1);
         return var3;
      }
   }

   public CTNum addNewNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNum var2 = null;
         var2 = (CTNum)this.get_store().add_element_user(NUM$4);
         return var2;
      }
   }

   public void removeNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUM$4, var1);
      }
   }

   public CTDecimalNumber getNumIdMacAtCleanup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(NUMIDMACATCLEANUP$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumIdMacAtCleanup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMIDMACATCLEANUP$6) != 0;
      }
   }

   public void setNumIdMacAtCleanup(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(NUMIDMACATCLEANUP$6, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(NUMIDMACATCLEANUP$6);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewNumIdMacAtCleanup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(NUMIDMACATCLEANUP$6);
         return var2;
      }
   }

   public void unsetNumIdMacAtCleanup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMIDMACATCLEANUP$6, 0);
      }
   }

}
