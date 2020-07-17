package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConsolidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheetSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class CTCacheSourceImpl extends XmlComplexContentImpl implements CTCacheSource {

   private static final QName WORKSHEETSOURCE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "worksheetSource");
   private static final QName CONSOLIDATION$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "consolidation");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName TYPE$6 = new QName("", "type");
   private static final QName CONNECTIONID$8 = new QName("", "connectionId");


   public CTCacheSourceImpl(SchemaType var1) {
      super(var1);
   }

   public CTWorksheetSource getWorksheetSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorksheetSource var2 = null;
         var2 = (CTWorksheetSource)this.get_store().find_element_user(WORKSHEETSOURCE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWorksheetSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WORKSHEETSOURCE$0) != 0;
      }
   }

   public void setWorksheetSource(CTWorksheetSource var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorksheetSource var3 = null;
         var3 = (CTWorksheetSource)this.get_store().find_element_user(WORKSHEETSOURCE$0, 0);
         if(var3 == null) {
            var3 = (CTWorksheetSource)this.get_store().add_element_user(WORKSHEETSOURCE$0);
         }

         var3.set(var1);
      }
   }

   public CTWorksheetSource addNewWorksheetSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWorksheetSource var2 = null;
         var2 = (CTWorksheetSource)this.get_store().add_element_user(WORKSHEETSOURCE$0);
         return var2;
      }
   }

   public void unsetWorksheetSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WORKSHEETSOURCE$0, 0);
      }
   }

   public CTConsolidation getConsolidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConsolidation var2 = null;
         var2 = (CTConsolidation)this.get_store().find_element_user(CONSOLIDATION$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetConsolidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONSOLIDATION$2) != 0;
      }
   }

   public void setConsolidation(CTConsolidation var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConsolidation var3 = null;
         var3 = (CTConsolidation)this.get_store().find_element_user(CONSOLIDATION$2, 0);
         if(var3 == null) {
            var3 = (CTConsolidation)this.get_store().add_element_user(CONSOLIDATION$2);
         }

         var3.set(var1);
      }
   }

   public CTConsolidation addNewConsolidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConsolidation var2 = null;
         var2 = (CTConsolidation)this.get_store().add_element_user(CONSOLIDATION$2);
         return var2;
      }
   }

   public void unsetConsolidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONSOLIDATION$2, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$4) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$4, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$4);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$4, 0);
      }
   }

   public STSourceType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$6);
         return var2 == null?null:(STSourceType.Enum)var2.getEnumValue();
      }
   }

   public STSourceType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSourceType var2 = null;
         var2 = (STSourceType)this.get_store().find_attribute_user(TYPE$6);
         return var2;
      }
   }

   public void setType(STSourceType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STSourceType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSourceType var3 = null;
         var3 = (STSourceType)this.get_store().find_attribute_user(TYPE$6);
         if(var3 == null) {
            var3 = (STSourceType)this.get_store().add_attribute_user(TYPE$6);
         }

         var3.set(var1);
      }
   }

   public long getConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTIONID$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONNECTIONID$8);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONNECTIONID$8);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(CONNECTIONID$8);
         }

         return var2;
      }
   }

   public boolean isSetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONNECTIONID$8) != null;
      }
   }

   public void setConnectionId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CONNECTIONID$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CONNECTIONID$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetConnectionId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONNECTIONID$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CONNECTIONID$8);
         }

         var3.set(var1);
      }
   }

   public void unsetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONNECTIONID$8);
      }
   }

}
