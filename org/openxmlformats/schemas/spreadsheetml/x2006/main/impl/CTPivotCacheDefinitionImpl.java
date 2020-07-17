package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheHierarchies;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCacheSource;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCalculatedMembers;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDimensions;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureDimensionMaps;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMeasureGroups;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPCDKPIs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotCacheDefinition;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTupleCache;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTPivotCacheDefinitionImpl extends XmlComplexContentImpl implements CTPivotCacheDefinition {

   private static final QName CACHESOURCE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheSource");
   private static final QName CACHEFIELDS$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheFields");
   private static final QName CACHEHIERARCHIES$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cacheHierarchies");
   private static final QName KPIS$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "kpis");
   private static final QName TUPLECACHE$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tupleCache");
   private static final QName CALCULATEDITEMS$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedItems");
   private static final QName CALCULATEDMEMBERS$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedMembers");
   private static final QName DIMENSIONS$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dimensions");
   private static final QName MEASUREGROUPS$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "measureGroups");
   private static final QName MAPS$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "maps");
   private static final QName EXTLST$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName ID$22 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id");
   private static final QName INVALID$24 = new QName("", "invalid");
   private static final QName SAVEDATA$26 = new QName("", "saveData");
   private static final QName REFRESHONLOAD$28 = new QName("", "refreshOnLoad");
   private static final QName OPTIMIZEMEMORY$30 = new QName("", "optimizeMemory");
   private static final QName ENABLEREFRESH$32 = new QName("", "enableRefresh");
   private static final QName REFRESHEDBY$34 = new QName("", "refreshedBy");
   private static final QName REFRESHEDDATE$36 = new QName("", "refreshedDate");
   private static final QName BACKGROUNDQUERY$38 = new QName("", "backgroundQuery");
   private static final QName MISSINGITEMSLIMIT$40 = new QName("", "missingItemsLimit");
   private static final QName CREATEDVERSION$42 = new QName("", "createdVersion");
   private static final QName REFRESHEDVERSION$44 = new QName("", "refreshedVersion");
   private static final QName MINREFRESHABLEVERSION$46 = new QName("", "minRefreshableVersion");
   private static final QName RECORDCOUNT$48 = new QName("", "recordCount");
   private static final QName UPGRADEONREFRESH$50 = new QName("", "upgradeOnRefresh");
   private static final QName TUPLECACHE2$52 = new QName("", "tupleCache");
   private static final QName SUPPORTSUBQUERY$54 = new QName("", "supportSubquery");
   private static final QName SUPPORTADVANCEDDRILL$56 = new QName("", "supportAdvancedDrill");


   public CTPivotCacheDefinitionImpl(SchemaType var1) {
      super(var1);
   }

   public CTCacheSource getCacheSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheSource var2 = null;
         var2 = (CTCacheSource)this.get_store().find_element_user(CACHESOURCE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCacheSource(CTCacheSource var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheSource var3 = null;
         var3 = (CTCacheSource)this.get_store().find_element_user(CACHESOURCE$0, 0);
         if(var3 == null) {
            var3 = (CTCacheSource)this.get_store().add_element_user(CACHESOURCE$0);
         }

         var3.set(var1);
      }
   }

   public CTCacheSource addNewCacheSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheSource var2 = null;
         var2 = (CTCacheSource)this.get_store().add_element_user(CACHESOURCE$0);
         return var2;
      }
   }

   public CTCacheFields getCacheFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheFields var2 = null;
         var2 = (CTCacheFields)this.get_store().find_element_user(CACHEFIELDS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCacheFields(CTCacheFields var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheFields var3 = null;
         var3 = (CTCacheFields)this.get_store().find_element_user(CACHEFIELDS$2, 0);
         if(var3 == null) {
            var3 = (CTCacheFields)this.get_store().add_element_user(CACHEFIELDS$2);
         }

         var3.set(var1);
      }
   }

   public CTCacheFields addNewCacheFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheFields var2 = null;
         var2 = (CTCacheFields)this.get_store().add_element_user(CACHEFIELDS$2);
         return var2;
      }
   }

   public CTCacheHierarchies getCacheHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheHierarchies var2 = null;
         var2 = (CTCacheHierarchies)this.get_store().find_element_user(CACHEHIERARCHIES$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCacheHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CACHEHIERARCHIES$4) != 0;
      }
   }

   public void setCacheHierarchies(CTCacheHierarchies var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheHierarchies var3 = null;
         var3 = (CTCacheHierarchies)this.get_store().find_element_user(CACHEHIERARCHIES$4, 0);
         if(var3 == null) {
            var3 = (CTCacheHierarchies)this.get_store().add_element_user(CACHEHIERARCHIES$4);
         }

         var3.set(var1);
      }
   }

   public CTCacheHierarchies addNewCacheHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCacheHierarchies var2 = null;
         var2 = (CTCacheHierarchies)this.get_store().add_element_user(CACHEHIERARCHIES$4);
         return var2;
      }
   }

   public void unsetCacheHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CACHEHIERARCHIES$4, 0);
      }
   }

   public CTPCDKPIs getKpis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPCDKPIs var2 = null;
         var2 = (CTPCDKPIs)this.get_store().find_element_user(KPIS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKpis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KPIS$6) != 0;
      }
   }

   public void setKpis(CTPCDKPIs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPCDKPIs var3 = null;
         var3 = (CTPCDKPIs)this.get_store().find_element_user(KPIS$6, 0);
         if(var3 == null) {
            var3 = (CTPCDKPIs)this.get_store().add_element_user(KPIS$6);
         }

         var3.set(var1);
      }
   }

   public CTPCDKPIs addNewKpis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPCDKPIs var2 = null;
         var2 = (CTPCDKPIs)this.get_store().add_element_user(KPIS$6);
         return var2;
      }
   }

   public void unsetKpis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KPIS$6, 0);
      }
   }

   public CTTupleCache getTupleCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTupleCache var2 = null;
         var2 = (CTTupleCache)this.get_store().find_element_user(TUPLECACHE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTupleCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TUPLECACHE$8) != 0;
      }
   }

   public void setTupleCache(CTTupleCache var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTupleCache var3 = null;
         var3 = (CTTupleCache)this.get_store().find_element_user(TUPLECACHE$8, 0);
         if(var3 == null) {
            var3 = (CTTupleCache)this.get_store().add_element_user(TUPLECACHE$8);
         }

         var3.set(var1);
      }
   }

   public CTTupleCache addNewTupleCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTupleCache var2 = null;
         var2 = (CTTupleCache)this.get_store().add_element_user(TUPLECACHE$8);
         return var2;
      }
   }

   public void unsetTupleCache() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TUPLECACHE$8, 0);
      }
   }

   public CTCalculatedItems getCalculatedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalculatedItems var2 = null;
         var2 = (CTCalculatedItems)this.get_store().find_element_user(CALCULATEDITEMS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCalculatedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CALCULATEDITEMS$10) != 0;
      }
   }

   public void setCalculatedItems(CTCalculatedItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalculatedItems var3 = null;
         var3 = (CTCalculatedItems)this.get_store().find_element_user(CALCULATEDITEMS$10, 0);
         if(var3 == null) {
            var3 = (CTCalculatedItems)this.get_store().add_element_user(CALCULATEDITEMS$10);
         }

         var3.set(var1);
      }
   }

   public CTCalculatedItems addNewCalculatedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalculatedItems var2 = null;
         var2 = (CTCalculatedItems)this.get_store().add_element_user(CALCULATEDITEMS$10);
         return var2;
      }
   }

   public void unsetCalculatedItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CALCULATEDITEMS$10, 0);
      }
   }

   public CTCalculatedMembers getCalculatedMembers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalculatedMembers var2 = null;
         var2 = (CTCalculatedMembers)this.get_store().find_element_user(CALCULATEDMEMBERS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCalculatedMembers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CALCULATEDMEMBERS$12) != 0;
      }
   }

   public void setCalculatedMembers(CTCalculatedMembers var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalculatedMembers var3 = null;
         var3 = (CTCalculatedMembers)this.get_store().find_element_user(CALCULATEDMEMBERS$12, 0);
         if(var3 == null) {
            var3 = (CTCalculatedMembers)this.get_store().add_element_user(CALCULATEDMEMBERS$12);
         }

         var3.set(var1);
      }
   }

   public CTCalculatedMembers addNewCalculatedMembers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCalculatedMembers var2 = null;
         var2 = (CTCalculatedMembers)this.get_store().add_element_user(CALCULATEDMEMBERS$12);
         return var2;
      }
   }

   public void unsetCalculatedMembers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CALCULATEDMEMBERS$12, 0);
      }
   }

   public CTDimensions getDimensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDimensions var2 = null;
         var2 = (CTDimensions)this.get_store().find_element_user(DIMENSIONS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDimensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIMENSIONS$14) != 0;
      }
   }

   public void setDimensions(CTDimensions var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDimensions var3 = null;
         var3 = (CTDimensions)this.get_store().find_element_user(DIMENSIONS$14, 0);
         if(var3 == null) {
            var3 = (CTDimensions)this.get_store().add_element_user(DIMENSIONS$14);
         }

         var3.set(var1);
      }
   }

   public CTDimensions addNewDimensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDimensions var2 = null;
         var2 = (CTDimensions)this.get_store().add_element_user(DIMENSIONS$14);
         return var2;
      }
   }

   public void unsetDimensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIMENSIONS$14, 0);
      }
   }

   public CTMeasureGroups getMeasureGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMeasureGroups var2 = null;
         var2 = (CTMeasureGroups)this.get_store().find_element_user(MEASUREGROUPS$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMeasureGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MEASUREGROUPS$16) != 0;
      }
   }

   public void setMeasureGroups(CTMeasureGroups var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMeasureGroups var3 = null;
         var3 = (CTMeasureGroups)this.get_store().find_element_user(MEASUREGROUPS$16, 0);
         if(var3 == null) {
            var3 = (CTMeasureGroups)this.get_store().add_element_user(MEASUREGROUPS$16);
         }

         var3.set(var1);
      }
   }

   public CTMeasureGroups addNewMeasureGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMeasureGroups var2 = null;
         var2 = (CTMeasureGroups)this.get_store().add_element_user(MEASUREGROUPS$16);
         return var2;
      }
   }

   public void unsetMeasureGroups() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MEASUREGROUPS$16, 0);
      }
   }

   public CTMeasureDimensionMaps getMaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMeasureDimensionMaps var2 = null;
         var2 = (CTMeasureDimensionMaps)this.get_store().find_element_user(MAPS$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAPS$18) != 0;
      }
   }

   public void setMaps(CTMeasureDimensionMaps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMeasureDimensionMaps var3 = null;
         var3 = (CTMeasureDimensionMaps)this.get_store().find_element_user(MAPS$18, 0);
         if(var3 == null) {
            var3 = (CTMeasureDimensionMaps)this.get_store().add_element_user(MAPS$18);
         }

         var3.set(var1);
      }
   }

   public CTMeasureDimensionMaps addNewMaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMeasureDimensionMaps var2 = null;
         var2 = (CTMeasureDimensionMaps)this.get_store().add_element_user(MAPS$18);
         return var2;
      }
   }

   public void unsetMaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAPS$18, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$20) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$20, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$20);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$20);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$20, 0);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$22);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(ID$22);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$22) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$22);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(ID$22);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(ID$22);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$22);
      }
   }

   public boolean getInvalid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INVALID$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INVALID$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInvalid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INVALID$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INVALID$24);
         }

         return var2;
      }
   }

   public boolean isSetInvalid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INVALID$24) != null;
      }
   }

   public void setInvalid(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INVALID$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INVALID$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInvalid(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INVALID$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INVALID$24);
         }

         var3.set(var1);
      }
   }

   public void unsetInvalid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INVALID$24);
      }
   }

   public boolean getSaveData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SAVEDATA$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SAVEDATA$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSaveData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SAVEDATA$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SAVEDATA$26);
         }

         return var2;
      }
   }

   public boolean isSetSaveData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SAVEDATA$26) != null;
      }
   }

   public void setSaveData(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SAVEDATA$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SAVEDATA$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSaveData(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SAVEDATA$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SAVEDATA$26);
         }

         var3.set(var1);
      }
   }

   public void unsetSaveData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SAVEDATA$26);
      }
   }

   public boolean getRefreshOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFRESHONLOAD$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(REFRESHONLOAD$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRefreshOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(REFRESHONLOAD$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(REFRESHONLOAD$28);
         }

         return var2;
      }
   }

   public boolean isSetRefreshOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFRESHONLOAD$28) != null;
      }
   }

   public void setRefreshOnLoad(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REFRESHONLOAD$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REFRESHONLOAD$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRefreshOnLoad(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(REFRESHONLOAD$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(REFRESHONLOAD$28);
         }

         var3.set(var1);
      }
   }

   public void unsetRefreshOnLoad() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFRESHONLOAD$28);
      }
   }

   public boolean getOptimizeMemory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPTIMIZEMEMORY$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OPTIMIZEMEMORY$30);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetOptimizeMemory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(OPTIMIZEMEMORY$30);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(OPTIMIZEMEMORY$30);
         }

         return var2;
      }
   }

   public boolean isSetOptimizeMemory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPTIMIZEMEMORY$30) != null;
      }
   }

   public void setOptimizeMemory(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPTIMIZEMEMORY$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPTIMIZEMEMORY$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetOptimizeMemory(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(OPTIMIZEMEMORY$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(OPTIMIZEMEMORY$30);
         }

         var3.set(var1);
      }
   }

   public void unsetOptimizeMemory() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPTIMIZEMEMORY$30);
      }
   }

   public boolean getEnableRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENABLEREFRESH$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ENABLEREFRESH$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEnableRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEREFRESH$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ENABLEREFRESH$32);
         }

         return var2;
      }
   }

   public boolean isSetEnableRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENABLEREFRESH$32) != null;
      }
   }

   public void setEnableRefresh(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENABLEREFRESH$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENABLEREFRESH$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEnableRefresh(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEREFRESH$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ENABLEREFRESH$32);
         }

         var3.set(var1);
      }
   }

   public void unsetEnableRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENABLEREFRESH$32);
      }
   }

   public String getRefreshedBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFRESHEDBY$34);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetRefreshedBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(REFRESHEDBY$34);
         return var2;
      }
   }

   public boolean isSetRefreshedBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFRESHEDBY$34) != null;
      }
   }

   public void setRefreshedBy(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REFRESHEDBY$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REFRESHEDBY$34);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRefreshedBy(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(REFRESHEDBY$34);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(REFRESHEDBY$34);
         }

         var3.set(var1);
      }
   }

   public void unsetRefreshedBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFRESHEDBY$34);
      }
   }

   public double getRefreshedDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFRESHEDDATE$36);
         return var2 == null?0.0D:var2.getDoubleValue();
      }
   }

   public XmlDouble xgetRefreshedDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var2 = null;
         var2 = (XmlDouble)this.get_store().find_attribute_user(REFRESHEDDATE$36);
         return var2;
      }
   }

   public boolean isSetRefreshedDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFRESHEDDATE$36) != null;
      }
   }

   public void setRefreshedDate(double var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(REFRESHEDDATE$36);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(REFRESHEDDATE$36);
         }

         var4.setDoubleValue(var1);
      }
   }

   public void xsetRefreshedDate(XmlDouble var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlDouble var3 = null;
         var3 = (XmlDouble)this.get_store().find_attribute_user(REFRESHEDDATE$36);
         if(var3 == null) {
            var3 = (XmlDouble)this.get_store().add_attribute_user(REFRESHEDDATE$36);
         }

         var3.set(var1);
      }
   }

   public void unsetRefreshedDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFRESHEDDATE$36);
      }
   }

   public boolean getBackgroundQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BACKGROUNDQUERY$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BACKGROUNDQUERY$38);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBackgroundQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BACKGROUNDQUERY$38);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BACKGROUNDQUERY$38);
         }

         return var2;
      }
   }

   public boolean isSetBackgroundQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BACKGROUNDQUERY$38) != null;
      }
   }

   public void setBackgroundQuery(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BACKGROUNDQUERY$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BACKGROUNDQUERY$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBackgroundQuery(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BACKGROUNDQUERY$38);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BACKGROUNDQUERY$38);
         }

         var3.set(var1);
      }
   }

   public void unsetBackgroundQuery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BACKGROUNDQUERY$38);
      }
   }

   public long getMissingItemsLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetMissingItemsLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
         return var2;
      }
   }

   public boolean isSetMissingItemsLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MISSINGITEMSLIMIT$40) != null;
      }
   }

   public void setMissingItemsLimit(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(MISSINGITEMSLIMIT$40);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetMissingItemsLimit(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(MISSINGITEMSLIMIT$40);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(MISSINGITEMSLIMIT$40);
         }

         var3.set(var1);
      }
   }

   public void unsetMissingItemsLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MISSINGITEMSLIMIT$40);
      }
   }

   public short getCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CREATEDVERSION$42);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CREATEDVERSION$42);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(CREATEDVERSION$42);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(CREATEDVERSION$42);
         }

         return var2;
      }
   }

   public boolean isSetCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CREATEDVERSION$42) != null;
      }
   }

   public void setCreatedVersion(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CREATEDVERSION$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CREATEDVERSION$42);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetCreatedVersion(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(CREATEDVERSION$42);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(CREATEDVERSION$42);
         }

         var3.set(var1);
      }
   }

   public void unsetCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CREATEDVERSION$42);
      }
   }

   public short getRefreshedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REFRESHEDVERSION$44);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(REFRESHEDVERSION$44);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetRefreshedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(REFRESHEDVERSION$44);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(REFRESHEDVERSION$44);
         }

         return var2;
      }
   }

   public boolean isSetRefreshedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REFRESHEDVERSION$44) != null;
      }
   }

   public void setRefreshedVersion(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REFRESHEDVERSION$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REFRESHEDVERSION$44);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetRefreshedVersion(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(REFRESHEDVERSION$44);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(REFRESHEDVERSION$44);
         }

         var3.set(var1);
      }
   }

   public void unsetRefreshedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REFRESHEDVERSION$44);
      }
   }

   public short getMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MINREFRESHABLEVERSION$46);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(MINREFRESHABLEVERSION$46);
         }

         return var2;
      }
   }

   public boolean isSetMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINREFRESHABLEVERSION$46) != null;
      }
   }

   public void setMinRefreshableVersion(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MINREFRESHABLEVERSION$46);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetMinRefreshableVersion(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$46);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(MINREFRESHABLEVERSION$46);
         }

         var3.set(var1);
      }
   }

   public void unsetMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINREFRESHABLEVERSION$46);
      }
   }

   public long getRecordCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RECORDCOUNT$48);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetRecordCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(RECORDCOUNT$48);
         return var2;
      }
   }

   public boolean isSetRecordCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RECORDCOUNT$48) != null;
      }
   }

   public void setRecordCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(RECORDCOUNT$48);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(RECORDCOUNT$48);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetRecordCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(RECORDCOUNT$48);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(RECORDCOUNT$48);
         }

         var3.set(var1);
      }
   }

   public void unsetRecordCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RECORDCOUNT$48);
      }
   }

   public boolean getUpgradeOnRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UPGRADEONREFRESH$50);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(UPGRADEONREFRESH$50);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUpgradeOnRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(UPGRADEONREFRESH$50);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(UPGRADEONREFRESH$50);
         }

         return var2;
      }
   }

   public boolean isSetUpgradeOnRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UPGRADEONREFRESH$50) != null;
      }
   }

   public void setUpgradeOnRefresh(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UPGRADEONREFRESH$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UPGRADEONREFRESH$50);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUpgradeOnRefresh(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(UPGRADEONREFRESH$50);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(UPGRADEONREFRESH$50);
         }

         var3.set(var1);
      }
   }

   public void unsetUpgradeOnRefresh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UPGRADEONREFRESH$50);
      }
   }

   public boolean getTupleCache2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TUPLECACHE2$52);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TUPLECACHE2$52);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTupleCache2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TUPLECACHE2$52);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TUPLECACHE2$52);
         }

         return var2;
      }
   }

   public boolean isSetTupleCache2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TUPLECACHE2$52) != null;
      }
   }

   public void setTupleCache2(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TUPLECACHE2$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TUPLECACHE2$52);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTupleCache2(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TUPLECACHE2$52);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TUPLECACHE2$52);
         }

         var3.set(var1);
      }
   }

   public void unsetTupleCache2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TUPLECACHE2$52);
      }
   }

   public boolean getSupportSubquery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUPPORTSUBQUERY$54);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUPPORTSUBQUERY$54);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSupportSubquery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUPPORTSUBQUERY$54);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUPPORTSUBQUERY$54);
         }

         return var2;
      }
   }

   public boolean isSetSupportSubquery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUPPORTSUBQUERY$54) != null;
      }
   }

   public void setSupportSubquery(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUPPORTSUBQUERY$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUPPORTSUBQUERY$54);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSupportSubquery(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUPPORTSUBQUERY$54);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUPPORTSUBQUERY$54);
         }

         var3.set(var1);
      }
   }

   public void unsetSupportSubquery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUPPORTSUBQUERY$54);
      }
   }

   public boolean getSupportAdvancedDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUPPORTADVANCEDDRILL$56);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSupportAdvancedDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUPPORTADVANCEDDRILL$56);
         }

         return var2;
      }
   }

   public boolean isSetSupportAdvancedDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56) != null;
      }
   }

   public void setSupportAdvancedDrill(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUPPORTADVANCEDDRILL$56);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSupportAdvancedDrill(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUPPORTADVANCEDDRILL$56);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUPPORTADVANCEDDRILL$56);
         }

         var3.set(var1);
      }
   }

   public void unsetSupportAdvancedDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUPPORTADVANCEDDRILL$56);
      }
   }

}
