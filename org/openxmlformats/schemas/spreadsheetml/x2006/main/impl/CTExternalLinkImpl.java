package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDdeLink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalBook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExternalLink;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOleLink;

public class CTExternalLinkImpl extends XmlComplexContentImpl implements CTExternalLink {

   private static final QName EXTERNALBOOK$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "externalBook");
   private static final QName DDELINK$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "ddeLink");
   private static final QName OLELINK$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "oleLink");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");


   public CTExternalLinkImpl(SchemaType var1) {
      super(var1);
   }

   public CTExternalBook getExternalBook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalBook var2 = null;
         var2 = (CTExternalBook)this.get_store().find_element_user(EXTERNALBOOK$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExternalBook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTERNALBOOK$0) != 0;
      }
   }

   public void setExternalBook(CTExternalBook var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalBook var3 = null;
         var3 = (CTExternalBook)this.get_store().find_element_user(EXTERNALBOOK$0, 0);
         if(var3 == null) {
            var3 = (CTExternalBook)this.get_store().add_element_user(EXTERNALBOOK$0);
         }

         var3.set(var1);
      }
   }

   public CTExternalBook addNewExternalBook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExternalBook var2 = null;
         var2 = (CTExternalBook)this.get_store().add_element_user(EXTERNALBOOK$0);
         return var2;
      }
   }

   public void unsetExternalBook() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTERNALBOOK$0, 0);
      }
   }

   public CTDdeLink getDdeLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDdeLink var2 = null;
         var2 = (CTDdeLink)this.get_store().find_element_user(DDELINK$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDdeLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DDELINK$2) != 0;
      }
   }

   public void setDdeLink(CTDdeLink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDdeLink var3 = null;
         var3 = (CTDdeLink)this.get_store().find_element_user(DDELINK$2, 0);
         if(var3 == null) {
            var3 = (CTDdeLink)this.get_store().add_element_user(DDELINK$2);
         }

         var3.set(var1);
      }
   }

   public CTDdeLink addNewDdeLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDdeLink var2 = null;
         var2 = (CTDdeLink)this.get_store().add_element_user(DDELINK$2);
         return var2;
      }
   }

   public void unsetDdeLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DDELINK$2, 0);
      }
   }

   public CTOleLink getOleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleLink var2 = null;
         var2 = (CTOleLink)this.get_store().find_element_user(OLELINK$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OLELINK$4) != 0;
      }
   }

   public void setOleLink(CTOleLink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleLink var3 = null;
         var3 = (CTOleLink)this.get_store().find_element_user(OLELINK$4, 0);
         if(var3 == null) {
            var3 = (CTOleLink)this.get_store().add_element_user(OLELINK$4);
         }

         var3.set(var1);
      }
   }

   public CTOleLink addNewOleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOleLink var2 = null;
         var2 = (CTOleLink)this.get_store().add_element_user(OLELINK$4);
         return var2;
      }
   }

   public void unsetOleLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OLELINK$4, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

}
