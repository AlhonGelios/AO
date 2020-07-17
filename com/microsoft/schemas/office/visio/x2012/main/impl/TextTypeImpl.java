package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.CpType;
import com.microsoft.schemas.office.visio.x2012.main.FldType;
import com.microsoft.schemas.office.visio.x2012.main.PpType;
import com.microsoft.schemas.office.visio.x2012.main.TextType;
import com.microsoft.schemas.office.visio.x2012.main.TpType;
import com.microsoft.schemas.office.visio.x2012.main.impl.TextTypeImpl.1CpList;
import com.microsoft.schemas.office.visio.x2012.main.impl.TextTypeImpl.1FldList;
import com.microsoft.schemas.office.visio.x2012.main.impl.TextTypeImpl.1PpList;
import com.microsoft.schemas.office.visio.x2012.main.impl.TextTypeImpl.1TpList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class TextTypeImpl extends XmlComplexContentImpl implements TextType {

   private static final QName CP$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "cp");
   private static final QName PP$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "pp");
   private static final QName TP$4 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "tp");
   private static final QName FLD$6 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "fld");


   public TextTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getCpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CpList(this);
      }
   }

   public CpType[] getCpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CP$0, var2);
         CpType[] var3 = new CpType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CpType getCpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CpType var3 = null;
         var3 = (CpType)this.get_store().find_element_user(CP$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CP$0);
      }
   }

   public void setCpArray(CpType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CP$0);
      }
   }

   public void setCpArray(int var1, CpType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CpType var4 = null;
         var4 = (CpType)this.get_store().find_element_user(CP$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CpType insertNewCp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CpType var3 = null;
         var3 = (CpType)this.get_store().insert_element_user(CP$0, var1);
         return var3;
      }
   }

   public CpType addNewCp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CpType var2 = null;
         var2 = (CpType)this.get_store().add_element_user(CP$0);
         return var2;
      }
   }

   public void removeCp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CP$0, var1);
      }
   }

   public List getPpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PpList(this);
      }
   }

   public PpType[] getPpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PP$2, var2);
         PpType[] var3 = new PpType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public PpType getPpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PpType var3 = null;
         var3 = (PpType)this.get_store().find_element_user(PP$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PP$2);
      }
   }

   public void setPpArray(PpType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PP$2);
      }
   }

   public void setPpArray(int var1, PpType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PpType var4 = null;
         var4 = (PpType)this.get_store().find_element_user(PP$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public PpType insertNewPp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PpType var3 = null;
         var3 = (PpType)this.get_store().insert_element_user(PP$2, var1);
         return var3;
      }
   }

   public PpType addNewPp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PpType var2 = null;
         var2 = (PpType)this.get_store().add_element_user(PP$2);
         return var2;
      }
   }

   public void removePp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PP$2, var1);
      }
   }

   public List getTpList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TpList(this);
      }
   }

   public TpType[] getTpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TP$4, var2);
         TpType[] var3 = new TpType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public TpType getTpArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TpType var3 = null;
         var3 = (TpType)this.get_store().find_element_user(TP$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTpArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TP$4);
      }
   }

   public void setTpArray(TpType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TP$4);
      }
   }

   public void setTpArray(int var1, TpType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TpType var4 = null;
         var4 = (TpType)this.get_store().find_element_user(TP$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public TpType insertNewTp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TpType var3 = null;
         var3 = (TpType)this.get_store().insert_element_user(TP$4, var1);
         return var3;
      }
   }

   public TpType addNewTp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         TpType var2 = null;
         var2 = (TpType)this.get_store().add_element_user(TP$4);
         return var2;
      }
   }

   public void removeTp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TP$4, var1);
      }
   }

   public List getFldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FldList(this);
      }
   }

   public FldType[] getFldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FLD$6, var2);
         FldType[] var3 = new FldType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public FldType getFldArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FldType var3 = null;
         var3 = (FldType)this.get_store().find_element_user(FLD$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFldArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLD$6);
      }
   }

   public void setFldArray(FldType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FLD$6);
      }
   }

   public void setFldArray(int var1, FldType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FldType var4 = null;
         var4 = (FldType)this.get_store().find_element_user(FLD$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public FldType insertNewFld(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FldType var3 = null;
         var3 = (FldType)this.get_store().insert_element_user(FLD$6, var1);
         return var3;
      }
   }

   public FldType addNewFld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         FldType var2 = null;
         var2 = (FldType)this.get_store().add_element_user(FLD$6);
         return var2;
      }
   }

   public void removeFld(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLD$6, var1);
      }
   }

}
