package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedName;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalDefinedNames;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTExternalDefinedNamesImpl.1DefinedNameList;

public class CTExternalDefinedNamesImpl extends XmlComplexContentImpl implements CTExternalDefinedNames {

   private static final QName DEFINEDNAME$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "definedName");


   public CTExternalDefinedNamesImpl(SchemaType var1) {
      super(var1);
   }

   public List getDefinedNameList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DefinedNameList(this);
      }
   }

   public CTExternalDefinedName[] getDefinedNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DEFINEDNAME$0, var2);
         CTExternalDefinedName[] var3 = new CTExternalDefinedName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTExternalDefinedName getDefinedNameArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedName var3 = null;
         var3 = (CTExternalDefinedName)this.get_store().find_element_user(DEFINEDNAME$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDefinedNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFINEDNAME$0);
      }
   }

   public void setDefinedNameArray(CTExternalDefinedName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DEFINEDNAME$0);
      }
   }

   public void setDefinedNameArray(int var1, CTExternalDefinedName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedName var4 = null;
         var4 = (CTExternalDefinedName)this.get_store().find_element_user(DEFINEDNAME$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTExternalDefinedName insertNewDefinedName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedName var3 = null;
         var3 = (CTExternalDefinedName)this.get_store().insert_element_user(DEFINEDNAME$0, var1);
         return var3;
      }
   }

   public CTExternalDefinedName addNewDefinedName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalDefinedName var2 = null;
         var2 = (CTExternalDefinedName)this.get_store().add_element_user(DEFINEDNAME$0);
         return var2;
      }
   }

   public void removeDefinedName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFINEDNAME$0, var1);
      }
   }

}
