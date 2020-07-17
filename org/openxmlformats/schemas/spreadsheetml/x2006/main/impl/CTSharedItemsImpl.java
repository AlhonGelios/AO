package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSharedItemsImpl.1BList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSharedItemsImpl.1DList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSharedItemsImpl.1EList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSharedItemsImpl.1MList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSharedItemsImpl.1NList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSharedItemsImpl.1SList;

public class CTSharedItemsImpl extends XmlComplexContentImpl implements CTSharedItems {

   private static final QName M$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "m");
   private static final QName N$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "n");
   private static final QName B$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "b");
   private static final QName E$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "e");
   private static final QName S$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "s");
   private static final QName D$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "d");
   private static final QName CONTAINSSEMIMIXEDTYPES$12 = new QName("", "containsSemiMixedTypes");
   private static final QName CONTAINSNONDATE$14 = new QName("", "containsNonDate");
   private static final QName CONTAINSDATE$16 = new QName("", "containsDate");
   private static final QName CONTAINSSTRING$18 = new QName("", "containsString");
   private static final QName CONTAINSBLANK$20 = new QName("", "containsBlank");
   private static final QName CONTAINSMIXEDTYPES$22 = new QName("", "containsMixedTypes");
   private static final QName CONTAINSNUMBER$24 = new QName("", "containsNumber");
   private static final QName CONTAINSINTEGER$26 = new QName("", "containsInteger");
   private static final QName MINVALUE$28 = new QName("", "minValue");
   private static final QName MAXVALUE$30 = new QName("", "maxValue");
   private static final QName MINDATE$32 = new QName("", "minDate");
   private static final QName MAXDATE$34 = new QName("", "maxDate");
   private static final QName COUNT$36 = new QName("", "count");
   private static final QName LONGTEXT$38 = new QName("", "longText");


   public CTSharedItemsImpl(SchemaType var1) {
      super(var1);
   }

   public List getMList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MList(this);
      }
   }

   public CTMissing[] getMArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(M$0, var2);
         CTMissing[] var3 = new CTMissing[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMissing getMArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMissing var3 = null;
         var3 = (CTMissing)this.get_store().find_element_user(M$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(M$0);
      }
   }

   public void setMArray(CTMissing[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, M$0);
      }
   }

   public void setMArray(int var1, CTMissing var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMissing var4 = null;
         var4 = (CTMissing)this.get_store().find_element_user(M$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMissing insertNewM(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMissing var3 = null;
         var3 = (CTMissing)this.get_store().insert_element_user(M$0, var1);
         return var3;
      }
   }

   public CTMissing addNewM() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMissing var2 = null;
         var2 = (CTMissing)this.get_store().add_element_user(M$0);
         return var2;
      }
   }

   public void removeM(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(M$0, var1);
      }
   }

   public List getNList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NList(this);
      }
   }

   public CTNumber[] getNArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(N$2, var2);
         CTNumber[] var3 = new CTNumber[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTNumber getNArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumber var3 = null;
         var3 = (CTNumber)this.get_store().find_element_user(N$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(N$2);
      }
   }

   public void setNArray(CTNumber[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, N$2);
      }
   }

   public void setNArray(int var1, CTNumber var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumber var4 = null;
         var4 = (CTNumber)this.get_store().find_element_user(N$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTNumber insertNewN(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumber var3 = null;
         var3 = (CTNumber)this.get_store().insert_element_user(N$2, var1);
         return var3;
      }
   }

   public CTNumber addNewN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumber var2 = null;
         var2 = (CTNumber)this.get_store().add_element_user(N$2);
         return var2;
      }
   }

   public void removeN(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(N$2, var1);
      }
   }

   public List getBList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BList(this);
      }
   }

   public CTBoolean[] getBArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(B$4, var2);
         CTBoolean[] var3 = new CTBoolean[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBoolean getBArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().find_element_user(B$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(B$4);
      }
   }

   public void setBArray(CTBoolean[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, B$4);
      }
   }

   public void setBArray(int var1, CTBoolean var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var4 = null;
         var4 = (CTBoolean)this.get_store().find_element_user(B$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBoolean insertNewB(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var3 = null;
         var3 = (CTBoolean)this.get_store().insert_element_user(B$4, var1);
         return var3;
      }
   }

   public CTBoolean addNewB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBoolean var2 = null;
         var2 = (CTBoolean)this.get_store().add_element_user(B$4);
         return var2;
      }
   }

   public void removeB(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(B$4, var1);
      }
   }

   public List getEList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EList(this);
      }
   }

   public CTError[] getEArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(E$6, var2);
         CTError[] var3 = new CTError[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTError getEArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTError var3 = null;
         var3 = (CTError)this.get_store().find_element_user(E$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(E$6);
      }
   }

   public void setEArray(CTError[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, E$6);
      }
   }

   public void setEArray(int var1, CTError var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTError var4 = null;
         var4 = (CTError)this.get_store().find_element_user(E$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTError insertNewE(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTError var3 = null;
         var3 = (CTError)this.get_store().insert_element_user(E$6, var1);
         return var3;
      }
   }

   public CTError addNewE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTError var2 = null;
         var2 = (CTError)this.get_store().add_element_user(E$6);
         return var2;
      }
   }

   public void removeE(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(E$6, var1);
      }
   }

   public List getSList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SList(this);
      }
   }

   public CTString[] getSArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(S$8, var2);
         CTString[] var3 = new CTString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTString getSArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(S$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(S$8);
      }
   }

   public void setSArray(CTString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, S$8);
      }
   }

   public void setSArray(int var1, CTString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var4 = null;
         var4 = (CTString)this.get_store().find_element_user(S$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTString insertNewS(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().insert_element_user(S$8, var1);
         return var3;
      }
   }

   public CTString addNewS() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(S$8);
         return var2;
      }
   }

   public void removeS(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(S$8, var1);
      }
   }

   public List getDList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DList(this);
      }
   }

   public CTDateTime[] getDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(D$10, var2);
         CTDateTime[] var3 = new CTDateTime[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDateTime getDArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateTime var3 = null;
         var3 = (CTDateTime)this.get_store().find_element_user(D$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(D$10);
      }
   }

   public void setDArray(CTDateTime[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, D$10);
      }
   }

   public void setDArray(int var1, CTDateTime var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateTime var4 = null;
         var4 = (CTDateTime)this.get_store().find_element_user(D$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDateTime insertNewD(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateTime var3 = null;
         var3 = (CTDateTime)this.get_store().insert_element_user(D$10, var1);
         return var3;
      }
   }

   public CTDateTime addNewD() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDateTime var2 = null;
         var2 = (CTDateTime)this.get_store().add_element_user(D$10);
         return var2;
      }
   }

   public void removeD(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(D$10, var1);
      }
   }

   public boolean getContainsSemiMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSSEMIMIXEDTYPES$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsSemiMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSSEMIMIXEDTYPES$12);
         }

         return var2;
      }
   }

   public boolean isSetContainsSemiMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12) != null;
      }
   }

   public void setContainsSemiMixedTypes(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsSemiMixedTypes(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSSEMIMIXEDTYPES$12);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsSemiMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSSEMIMIXEDTYPES$12);
      }
   }

   public boolean getContainsNonDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSNONDATE$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSNONDATE$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsNonDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSNONDATE$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSNONDATE$14);
         }

         return var2;
      }
   }

   public boolean isSetContainsNonDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSNONDATE$14) != null;
      }
   }

   public void setContainsNonDate(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSNONDATE$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSNONDATE$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsNonDate(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSNONDATE$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSNONDATE$14);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsNonDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSNONDATE$14);
      }
   }

   public boolean getContainsDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSDATE$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSDATE$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSDATE$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSDATE$16);
         }

         return var2;
      }
   }

   public boolean isSetContainsDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSDATE$16) != null;
      }
   }

   public void setContainsDate(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSDATE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSDATE$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsDate(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSDATE$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSDATE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSDATE$16);
      }
   }

   public boolean getContainsString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSSTRING$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSSTRING$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSSTRING$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSSTRING$18);
         }

         return var2;
      }
   }

   public boolean isSetContainsString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSSTRING$18) != null;
      }
   }

   public void setContainsString(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSSTRING$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSSTRING$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsString(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSSTRING$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSSTRING$18);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsString() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSSTRING$18);
      }
   }

   public boolean getContainsBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSBLANK$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSBLANK$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSBLANK$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSBLANK$20);
         }

         return var2;
      }
   }

   public boolean isSetContainsBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSBLANK$20) != null;
      }
   }

   public void setContainsBlank(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSBLANK$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSBLANK$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsBlank(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSBLANK$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSBLANK$20);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSBLANK$20);
      }
   }

   public boolean getContainsMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSMIXEDTYPES$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSMIXEDTYPES$22);
         }

         return var2;
      }
   }

   public boolean isSetContainsMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSMIXEDTYPES$22) != null;
      }
   }

   public void setContainsMixedTypes(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSMIXEDTYPES$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsMixedTypes(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSMIXEDTYPES$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSMIXEDTYPES$22);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsMixedTypes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSMIXEDTYPES$22);
      }
   }

   public boolean getContainsNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSNUMBER$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSNUMBER$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSNUMBER$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSNUMBER$24);
         }

         return var2;
      }
   }

   public boolean isSetContainsNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSNUMBER$24) != null;
      }
   }

   public void setContainsNumber(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSNUMBER$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSNUMBER$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsNumber(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSNUMBER$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSNUMBER$24);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsNumber() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSNUMBER$24);
      }
   }

   public boolean getContainsInteger() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSINTEGER$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONTAINSINTEGER$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetContainsInteger() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSINTEGER$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CONTAINSINTEGER$26);
         }

         return var2;
      }
   }

   public boolean isSetContainsInteger() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONTAINSINTEGER$26) != null;
      }
   }

   public void setContainsInteger(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONTAINSINTEGER$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONTAINSINTEGER$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetContainsInteger(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CONTAINSINTEGER$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CONTAINSINTEGER$26);
         }

         var3.set(var1);
      }
   }

   public void unsetContainsInteger() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONTAINSINTEGER$26);
      }
   }

   public double getMinValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINVALUE$28);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetMinValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(MINVALUE$28);
         return var2;
      }
   }

   public boolean isSetMinValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINVALUE$28) != null;
      }
   }

   public void setMinValue(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MINVALUE$28);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MINVALUE$28);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetMinValue(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(MINVALUE$28);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(MINVALUE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetMinValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINVALUE$28);
      }
   }

   public double getMaxValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAXVALUE$30);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetMaxValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(MAXVALUE$30);
         return var2;
      }
   }

   public boolean isSetMaxValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAXVALUE$30) != null;
      }
   }

   public void setMaxValue(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MAXVALUE$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MAXVALUE$30);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetMaxValue(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(MAXVALUE$30);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(MAXVALUE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetMaxValue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAXVALUE$30);
      }
   }

   public Calendar getMinDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINDATE$32);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetMinDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_attribute_user(MINDATE$32);
         return var2;
      }
   }

   public boolean isSetMinDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINDATE$32) != null;
      }
   }

   public void setMinDate(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MINDATE$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MINDATE$32);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetMinDate(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_attribute_user(MINDATE$32);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_attribute_user(MINDATE$32);
         }

         var3.set((XmlObject)var1);
      }
   }

   public void unsetMinDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINDATE$32);
      }
   }

   public Calendar getMaxDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAXDATE$34);
         return var2 == null?null:var2.getCalendarValue();
      }
   }

   public XmlDateTime xgetMaxDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var2 = null;
         var2 = (XmlDateTime)this.get_store().find_attribute_user(MAXDATE$34);
         return var2;
      }
   }

   public boolean isSetMaxDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAXDATE$34) != null;
      }
   }

   public void setMaxDate(Calendar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MAXDATE$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MAXDATE$34);
         }

         var3.setCalendarValue(var1);
      }
   }

   public void xsetMaxDate(XmlDateTime var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDateTime var3 = null;
         var3 = (XmlDateTime)this.get_store().find_attribute_user(MAXDATE$34);
         if(var3 == null) {
            var3 = (XmlDateTime)this.get_store().add_attribute_user(MAXDATE$34);
         }

         var3.set((XmlObject)var1);
      }
   }

   public void unsetMaxDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAXDATE$34);
      }
   }

   public long getCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNT$36);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$36);
         return var2;
      }
   }

   public boolean isSetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNT$36) != null;
      }
   }

   public void setCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COUNT$36);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COUNT$36);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COUNT$36);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COUNT$36);
         }

         var3.set(var1);
      }
   }

   public void unsetCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNT$36);
      }
   }

   public boolean getLongText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LONGTEXT$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LONGTEXT$38);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLongText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LONGTEXT$38);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LONGTEXT$38);
         }

         return var2;
      }
   }

   public boolean isSetLongText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LONGTEXT$38) != null;
      }
   }

   public void setLongText(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LONGTEXT$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LONGTEXT$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLongText(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LONGTEXT$38);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LONGTEXT$38);
         }

         var3.set(var1);
      }
   }

   public void unsetLongText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LONGTEXT$38);
      }
   }

}
