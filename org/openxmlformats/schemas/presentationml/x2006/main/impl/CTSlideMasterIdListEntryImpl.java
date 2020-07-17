package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideMasterId;

public class CTSlideMasterIdListEntryImpl extends XmlComplexContentImpl implements CTSlideMasterIdListEntry {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName ID$2 = new QName("", "id");
   private static final QName ID2$4 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");


   public CTSlideMasterIdListEntryImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STSlideMasterId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideMasterId var2 = null;
         var2 = (STSlideMasterId)this.get_store().find_attribute_user(ID$2);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$2) != null;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$2);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$2);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(STSlideMasterId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideMasterId var3 = null;
         var3 = (STSlideMasterId)this.get_store().find_attribute_user(ID$2);
         if(var3 == null) {
            var3 = (STSlideMasterId)this.get_store().add_attribute_user(ID$2);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$2);
      }
   }

   public String getId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID2$4);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID2$4);
         return var2;
      }
   }

   public void setId2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID2$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID2$4);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId2(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID2$4);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID2$4);
         }

         var3.set(var1);
      }
   }

}
