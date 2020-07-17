package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReference;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalReferences;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTExternalReferencesImpl.1ExternalReferenceList;

public class CTExternalReferencesImpl extends XmlComplexContentImpl implements CTExternalReferences {

   private static final QName EXTERNALREFERENCE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalReference");


   public CTExternalReferencesImpl(SchemaType var1) {
      super(var1);
   }

   public List getExternalReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ExternalReferenceList(this);
      }
   }

   public CTExternalReference[] getExternalReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EXTERNALREFERENCE$0, var2);
         CTExternalReference[] var3 = new CTExternalReference[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTExternalReference getExternalReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReference var3 = null;
         var3 = (CTExternalReference)this.get_store().find_element_user(EXTERNALREFERENCE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfExternalReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTERNALREFERENCE$0);
      }
   }

   public void setExternalReferenceArray(CTExternalReference[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EXTERNALREFERENCE$0);
      }
   }

   public void setExternalReferenceArray(int var1, CTExternalReference var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReference var4 = null;
         var4 = (CTExternalReference)this.get_store().find_element_user(EXTERNALREFERENCE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTExternalReference insertNewExternalReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReference var3 = null;
         var3 = (CTExternalReference)this.get_store().insert_element_user(EXTERNALREFERENCE$0, var1);
         return var3;
      }
   }

   public CTExternalReference addNewExternalReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalReference var2 = null;
         var2 = (CTExternalReference)this.get_store().add_element_user(EXTERNALREFERENCE$0);
         return var2;
      }
   }

   public void removeExternalReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTERNALREFERENCE$0, var1);
      }
   }

}
