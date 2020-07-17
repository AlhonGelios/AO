package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType;
import com.microsoft.schemas.office.visio.x2012.main.MasterType;
import com.microsoft.schemas.office.visio.x2012.main.MastersType;
import com.microsoft.schemas.office.visio.x2012.main.impl.MastersTypeImpl.1MasterList;
import com.microsoft.schemas.office.visio.x2012.main.impl.MastersTypeImpl.1MasterShortcutList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class MastersTypeImpl extends XmlComplexContentImpl implements MastersType {

   private static final QName MASTER$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Master");
   private static final QName MASTERSHORTCUT$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "MasterShortcut");


   public MastersTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getMasterList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MasterList(this);
      }
   }

   public MasterType[] getMasterArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MASTER$0, var2);
         MasterType[] var3 = new MasterType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public MasterType getMasterArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterType var3 = null;
         var3 = (MasterType)this.get_store().find_element_user(MASTER$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMasterArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MASTER$0);
      }
   }

   public void setMasterArray(MasterType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MASTER$0);
      }
   }

   public void setMasterArray(int var1, MasterType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterType var4 = null;
         var4 = (MasterType)this.get_store().find_element_user(MASTER$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public MasterType insertNewMaster(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterType var3 = null;
         var3 = (MasterType)this.get_store().insert_element_user(MASTER$0, var1);
         return var3;
      }
   }

   public MasterType addNewMaster() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterType var2 = null;
         var2 = (MasterType)this.get_store().add_element_user(MASTER$0);
         return var2;
      }
   }

   public void removeMaster(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MASTER$0, var1);
      }
   }

   public List getMasterShortcutList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MasterShortcutList(this);
      }
   }

   public MasterShortcutType[] getMasterShortcutArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MASTERSHORTCUT$2, var2);
         MasterShortcutType[] var3 = new MasterShortcutType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public MasterShortcutType getMasterShortcutArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterShortcutType var3 = null;
         var3 = (MasterShortcutType)this.get_store().find_element_user(MASTERSHORTCUT$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMasterShortcutArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MASTERSHORTCUT$2);
      }
   }

   public void setMasterShortcutArray(MasterShortcutType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MASTERSHORTCUT$2);
      }
   }

   public void setMasterShortcutArray(int var1, MasterShortcutType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterShortcutType var4 = null;
         var4 = (MasterShortcutType)this.get_store().find_element_user(MASTERSHORTCUT$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public MasterShortcutType insertNewMasterShortcut(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterShortcutType var3 = null;
         var3 = (MasterShortcutType)this.get_store().insert_element_user(MASTERSHORTCUT$2, var1);
         return var3;
      }
   }

   public MasterShortcutType addNewMasterShortcut() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         MasterShortcutType var2 = null;
         var2 = (MasterShortcutType)this.get_store().add_element_user(MASTERSHORTCUT$2);
         return var2;
      }
   }

   public void removeMasterShortcut(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MASTERSHORTCUT$2, var1);
      }
   }

}
