package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl;

public class CTTrPrImpl extends CTTrPrBaseImpl implements CTTrPr {

   private static final QName INS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
   private static final QName DEL$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
   private static final QName TRPRCHANGE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trPrChange");


   public CTTrPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTTrackChange getIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(INS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INS$0) != 0;
      }
   }

   public void setIns(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(INS$0, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(INS$0);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(INS$0);
         return var2;
      }
   }

   public void unsetIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INS$0, 0);
      }
   }

   public CTTrackChange getDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(DEL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEL$2) != 0;
      }
   }

   public void setDel(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(DEL$2, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(DEL$2);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(DEL$2);
         return var2;
      }
   }

   public void unsetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEL$2, 0);
      }
   }

   public CTTrPrChange getTrPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrPrChange var2 = null;
         var2 = (CTTrPrChange)this.get_store().find_element_user(TRPRCHANGE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTrPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRPRCHANGE$4) != 0;
      }
   }

   public void setTrPrChange(CTTrPrChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrPrChange var3 = null;
         var3 = (CTTrPrChange)this.get_store().find_element_user(TRPRCHANGE$4, 0);
         if(var3 == null) {
            var3 = (CTTrPrChange)this.get_store().add_element_user(TRPRCHANGE$4);
         }

         var3.set(var1);
      }
   }

   public CTTrPrChange addNewTrPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrPrChange var2 = null;
         var2 = (CTTrPrChange)this.get_store().add_element_user(TRPRCHANGE$4);
         return var2;
      }
   }

   public void unsetTrPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRPRCHANGE$4, 0);
      }
   }

}
