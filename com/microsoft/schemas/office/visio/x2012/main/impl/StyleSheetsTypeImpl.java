package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.StyleSheetType;
import com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType;
import com.microsoft.schemas.office.visio.x2012.main.impl.StyleSheetsTypeImpl.1StyleSheetList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class StyleSheetsTypeImpl extends XmlComplexContentImpl implements StyleSheetsType {

   private static final QName STYLESHEET$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "StyleSheet");


   public StyleSheetsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public List getStyleSheetList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1StyleSheetList(this);
      }
   }

   public StyleSheetType[] getStyleSheetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(STYLESHEET$0, var2);
         StyleSheetType[] var3 = new StyleSheetType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public StyleSheetType getStyleSheetArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetType var3 = null;
         var3 = (StyleSheetType)this.get_store().find_element_user(STYLESHEET$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfStyleSheetArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLESHEET$0);
      }
   }

   public void setStyleSheetArray(StyleSheetType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, STYLESHEET$0);
      }
   }

   public void setStyleSheetArray(int var1, StyleSheetType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetType var4 = null;
         var4 = (StyleSheetType)this.get_store().find_element_user(STYLESHEET$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public StyleSheetType insertNewStyleSheet(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetType var3 = null;
         var3 = (StyleSheetType)this.get_store().insert_element_user(STYLESHEET$0, var1);
         return var3;
      }
   }

   public StyleSheetType addNewStyleSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         StyleSheetType var2 = null;
         var2 = (StyleSheetType)this.get_store().add_element_user(STYLESHEET$0);
         return var2;
      }
   }

   public void removeStyleSheet(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLESHEET$0, var1);
      }
   }

}
