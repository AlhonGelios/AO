package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtContentBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtEndPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr;

public class CTSdtBlockImpl extends XmlComplexContentImpl implements CTSdtBlock {

   private static final QName SDTPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdtPr");
   private static final QName SDTENDPR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdtEndPr");
   private static final QName SDTCONTENT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sdtContent");


   public CTSdtBlockImpl(SchemaType var1) {
      super(var1);
   }

   public CTSdtPr getSdtPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtPr var2 = null;
         var2 = (CTSdtPr)this.get_store().find_element_user(SDTPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSdtPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SDTPR$0) != 0;
      }
   }

   public void setSdtPr(CTSdtPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtPr var3 = null;
         var3 = (CTSdtPr)this.get_store().find_element_user(SDTPR$0, 0);
         if(var3 == null) {
            var3 = (CTSdtPr)this.get_store().add_element_user(SDTPR$0);
         }

         var3.set(var1);
      }
   }

   public CTSdtPr addNewSdtPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtPr var2 = null;
         var2 = (CTSdtPr)this.get_store().add_element_user(SDTPR$0);
         return var2;
      }
   }

   public void unsetSdtPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SDTPR$0, 0);
      }
   }

   public CTSdtEndPr getSdtEndPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtEndPr var2 = null;
         var2 = (CTSdtEndPr)this.get_store().find_element_user(SDTENDPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSdtEndPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SDTENDPR$2) != 0;
      }
   }

   public void setSdtEndPr(CTSdtEndPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtEndPr var3 = null;
         var3 = (CTSdtEndPr)this.get_store().find_element_user(SDTENDPR$2, 0);
         if(var3 == null) {
            var3 = (CTSdtEndPr)this.get_store().add_element_user(SDTENDPR$2);
         }

         var3.set(var1);
      }
   }

   public CTSdtEndPr addNewSdtEndPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtEndPr var2 = null;
         var2 = (CTSdtEndPr)this.get_store().add_element_user(SDTENDPR$2);
         return var2;
      }
   }

   public void unsetSdtEndPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SDTENDPR$2, 0);
      }
   }

   public CTSdtContentBlock getSdtContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtContentBlock var2 = null;
         var2 = (CTSdtContentBlock)this.get_store().find_element_user(SDTCONTENT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSdtContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SDTCONTENT$4) != 0;
      }
   }

   public void setSdtContent(CTSdtContentBlock var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtContentBlock var3 = null;
         var3 = (CTSdtContentBlock)this.get_store().find_element_user(SDTCONTENT$4, 0);
         if(var3 == null) {
            var3 = (CTSdtContentBlock)this.get_store().add_element_user(SDTCONTENT$4);
         }

         var3.set(var1);
      }
   }

   public CTSdtContentBlock addNewSdtContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtContentBlock var2 = null;
         var2 = (CTSdtContentBlock)this.get_store().add_element_user(SDTCONTENT$4);
         return var2;
      }
   }

   public void unsetSdtContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SDTCONTENT$4, 0);
      }
   }

}
