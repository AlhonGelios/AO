package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEndnotes;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTEndnotesImpl.1EndnoteList;

public class CTEndnotesImpl extends XmlComplexContentImpl implements CTEndnotes {

   private static final QName ENDNOTE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnote");


   public CTEndnotesImpl(SchemaType var1) {
      super(var1);
   }

   public List getEndnoteList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EndnoteList(this);
      }
   }

   public CTFtnEdn[] getEndnoteArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENDNOTE$0, var2);
         CTFtnEdn[] var3 = new CTFtnEdn[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFtnEdn getEndnoteArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdn var3 = null;
         var3 = (CTFtnEdn)this.get_store().find_element_user(ENDNOTE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEndnoteArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDNOTE$0);
      }
   }

   public void setEndnoteArray(CTFtnEdn[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENDNOTE$0);
      }
   }

   public void setEndnoteArray(int var1, CTFtnEdn var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdn var4 = null;
         var4 = (CTFtnEdn)this.get_store().find_element_user(ENDNOTE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFtnEdn insertNewEndnote(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdn var3 = null;
         var3 = (CTFtnEdn)this.get_store().insert_element_user(ENDNOTE$0, var1);
         return var3;
      }
   }

   public CTFtnEdn addNewEndnote() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdn var2 = null;
         var2 = (CTFtnEdn)this.get_store().add_element_user(ENDNOTE$0);
         return var2;
      }
   }

   public void removeEndnote(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDNOTE$0, var1);
      }
   }

}
