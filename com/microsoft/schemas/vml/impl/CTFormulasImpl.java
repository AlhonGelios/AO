package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.vml.CTF;
import com.microsoft.schemas.vml.CTFormulas;
import com.microsoft.schemas.vml.impl.CTFormulasImpl.1FList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTFormulasImpl extends XmlComplexContentImpl implements CTFormulas {

   private static final QName F$0 = new QName("urn:schemas-microsoft-com:vml", "f");


   public CTFormulasImpl(SchemaType var1) {
      super(var1);
   }

   public List getFList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FList(this);
      }
   }

   public CTF[] getFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(F$0, var2);
         CTF[] var3 = new CTF[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTF getFArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var3 = null;
         var3 = (CTF)this.get_store().find_element_user(F$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(F$0);
      }
   }

   public void setFArray(CTF[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, F$0);
      }
   }

   public void setFArray(int var1, CTF var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var4 = null;
         var4 = (CTF)this.get_store().find_element_user(F$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTF insertNewF(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var3 = null;
         var3 = (CTF)this.get_store().insert_element_user(F$0, var1);
         return var3;
      }
   }

   public CTF addNewF() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTF var2 = null;
         var2 = (CTF)this.get_store().add_element_user(F$0);
         return var2;
      }
   }

   public void removeF(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(F$0, var1);
      }
   }

}
