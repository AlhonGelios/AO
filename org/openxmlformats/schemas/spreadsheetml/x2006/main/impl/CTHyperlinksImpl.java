package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlinks;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTHyperlinksImpl.1HyperlinkList;

public class CTHyperlinksImpl extends XmlComplexContentImpl implements CTHyperlinks {

   private static final QName HYPERLINK$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "hyperlink");


   public CTHyperlinksImpl(SchemaType var1) {
      super(var1);
   }

   public List getHyperlinkList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HyperlinkList(this);
      }
   }

   public CTHyperlink[] getHyperlinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HYPERLINK$0, var2);
         CTHyperlink[] var3 = new CTHyperlink[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHyperlink getHyperlinkArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().find_element_user(HYPERLINK$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHyperlinkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HYPERLINK$0);
      }
   }

   public void setHyperlinkArray(CTHyperlink[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HYPERLINK$0);
      }
   }

   public void setHyperlinkArray(int var1, CTHyperlink var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var4 = null;
         var4 = (CTHyperlink)this.get_store().find_element_user(HYPERLINK$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHyperlink insertNewHyperlink(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().insert_element_user(HYPERLINK$0, var1);
         return var3;
      }
   }

   public CTHyperlink addNewHyperlink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().add_element_user(HYPERLINK$0);
         return var2;
      }
   }

   public void removeHyperlink(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HYPERLINK$0, var1);
      }
   }

}
