package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnection;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectorLocking;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualConnectorProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;

public class CTNonVisualConnectorPropertiesImpl extends XmlComplexContentImpl implements CTNonVisualConnectorProperties {

   private static final QName CXNSPLOCKS$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cxnSpLocks");
   private static final QName STCXN$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "stCxn");
   private static final QName ENDCXN$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "endCxn");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");


   public CTNonVisualConnectorPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTConnectorLocking getCxnSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectorLocking var2 = null;
         var2 = (CTConnectorLocking)this.get_store().find_element_user(CXNSPLOCKS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCxnSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CXNSPLOCKS$0) != 0;
      }
   }

   public void setCxnSpLocks(CTConnectorLocking var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectorLocking var3 = null;
         var3 = (CTConnectorLocking)this.get_store().find_element_user(CXNSPLOCKS$0, 0);
         if(var3 == null) {
            var3 = (CTConnectorLocking)this.get_store().add_element_user(CXNSPLOCKS$0);
         }

         var3.set(var1);
      }
   }

   public CTConnectorLocking addNewCxnSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnectorLocking var2 = null;
         var2 = (CTConnectorLocking)this.get_store().add_element_user(CXNSPLOCKS$0);
         return var2;
      }
   }

   public void unsetCxnSpLocks() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CXNSPLOCKS$0, 0);
      }
   }

   public CTConnection getStCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnection var2 = null;
         var2 = (CTConnection)this.get_store().find_element_user(STCXN$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STCXN$2) != 0;
      }
   }

   public void setStCxn(CTConnection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnection var3 = null;
         var3 = (CTConnection)this.get_store().find_element_user(STCXN$2, 0);
         if(var3 == null) {
            var3 = (CTConnection)this.get_store().add_element_user(STCXN$2);
         }

         var3.set(var1);
      }
   }

   public CTConnection addNewStCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnection var2 = null;
         var2 = (CTConnection)this.get_store().add_element_user(STCXN$2);
         return var2;
      }
   }

   public void unsetStCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STCXN$2, 0);
      }
   }

   public CTConnection getEndCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnection var2 = null;
         var2 = (CTConnection)this.get_store().find_element_user(ENDCXN$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEndCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDCXN$4) != 0;
      }
   }

   public void setEndCxn(CTConnection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnection var3 = null;
         var3 = (CTConnection)this.get_store().find_element_user(ENDCXN$4, 0);
         if(var3 == null) {
            var3 = (CTConnection)this.get_store().add_element_user(ENDCXN$4);
         }

         var3.set(var1);
      }
   }

   public CTConnection addNewEndCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConnection var2 = null;
         var2 = (CTConnection)this.get_store().add_element_user(ENDCXN$4);
         return var2;
      }
   }

   public void unsetEndCxn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDCXN$4, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$6);
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
