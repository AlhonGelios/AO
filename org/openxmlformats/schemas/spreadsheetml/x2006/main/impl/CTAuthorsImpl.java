package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAuthors;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTAuthorsImpl.1AuthorList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTAuthorsImpl.2AuthorList;

public class CTAuthorsImpl extends XmlComplexContentImpl implements CTAuthors {

   private static final QName AUTHOR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "author");


   public CTAuthorsImpl(SchemaType var1) {
      super(var1);
   }

   public List getAuthorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AuthorList(this);
      }
   }

   public String[] getAuthorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTHOR$0, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getAuthorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(AUTHOR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetAuthorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2AuthorList(this);
      }
   }

   public STXstring[] xgetAuthorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(AUTHOR$0, var2);
         STXstring[] var3 = new STXstring[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STXstring xgetAuthorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_element_user(AUTHOR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAuthorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTHOR$0);
      }
   }

   public void setAuthorArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTHOR$0);
      }
   }

   public void setAuthorArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(AUTHOR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetAuthorArray(STXstring[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, AUTHOR$0);
      }
   }

   public void xsetAuthorArray(int var1, STXstring var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var4 = null;
         var4 = (STXstring)this.get_store().find_element_user(AUTHOR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertAuthor(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(AUTHOR$0, var1);
         var4.setStringValue(var2);
      }
   }

   public void addAuthor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(AUTHOR$0);
         var3.setStringValue(var1);
      }
   }

   public STXstring insertNewAuthor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().insert_element_user(AUTHOR$0, var1);
         return var3;
      }
   }

   public STXstring addNewAuthor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().add_element_user(AUTHOR$0);
         return var2;
      }
   }

   public void removeAuthor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTHOR$0, var1);
      }
   }

}
