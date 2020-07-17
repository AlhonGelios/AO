package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.PageType;
import com.microsoft.schemas.office.visio.x2012.main.PagesType;
import com.microsoft.schemas.office.visio.x2012.main.impl.PagesTypeImpl.1PageList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class PagesTypeImpl extends XmlComplexContentImpl implements PagesType {

   private static final QName PAGE$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "Page");


   public PagesTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getPageList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PageList(this);
      }
   }

   public PageType[] getPageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PAGE$0, var2);
         PageType[] var3 = new PageType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public PageType getPageArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageType var3 = null;
         var3 = (PageType)this.get_store().find_element_user(PAGE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGE$0);
      }
   }

   public void setPageArray(PageType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PAGE$0);
      }
   }

   public void setPageArray(int var1, PageType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageType var4 = null;
         var4 = (PageType)this.get_store().find_element_user(PAGE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public PageType insertNewPage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageType var3 = null;
         var3 = (PageType)this.get_store().insert_element_user(PAGE$0, var1);
         return var3;
      }
   }

   public PageType addNewPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         PageType var2 = null;
         var2 = (PageType)this.get_store().add_element_user(PAGE$0);
         return var2;
      }
   }

   public void removePage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGE$0, var1);
      }
   }

}
