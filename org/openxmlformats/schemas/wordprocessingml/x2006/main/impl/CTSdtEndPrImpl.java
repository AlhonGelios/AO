package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtEndPrImpl.1RPrList;

public class CTSdtEndPrImpl extends XmlComplexContentImpl implements CTSdtEndPr {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");


   public CTSdtEndPrImpl(SchemaType var1) {
      super(var1);
   }

   public List getRPrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RPrList(this);
      }
   }

   public CTRPr[] getRPrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RPR$0, var2);
         CTRPr[] var3 = new CTRPr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRPr getRPrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().find_element_user(RPR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRPrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0);
      }
   }

   public void setRPrArray(CTRPr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RPR$0);
      }
   }

   public void setRPrArray(int var1, CTRPr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var4 = null;
         var4 = (CTRPr)this.get_store().find_element_user(RPR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRPr insertNewRPr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().insert_element_user(RPR$0, var1);
         return var3;
      }
   }

   public CTRPr addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().add_element_user(RPR$0);
         return var2;
      }
   }

   public void removeRPr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, var1);
      }
   }

}
