package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTChartFormats;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColHierarchiesUsage;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormats;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormats;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTLocation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotFilters;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchies;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableDefinition;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotTableStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowFields;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowHierarchiesUsage;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRowItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTPivotTableDefinitionImpl extends XmlComplexContentImpl implements CTPivotTableDefinition {

   private static final QName LOCATION$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "location");
   private static final QName PIVOTFIELDS$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotFields");
   private static final QName ROWFIELDS$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowFields");
   private static final QName ROWITEMS$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowItems");
   private static final QName COLFIELDS$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colFields");
   private static final QName COLITEMS$10 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colItems");
   private static final QName PAGEFIELDS$12 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageFields");
   private static final QName DATAFIELDS$14 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataFields");
   private static final QName FORMATS$16 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formats");
   private static final QName CONDITIONALFORMATS$18 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "conditionalFormats");
   private static final QName CHARTFORMATS$20 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "chartFormats");
   private static final QName PIVOTHIERARCHIES$22 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotHierarchies");
   private static final QName PIVOTTABLESTYLEINFO$24 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotTableStyleInfo");
   private static final QName FILTERS$26 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "filters");
   private static final QName ROWHIERARCHIESUSAGE$28 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "rowHierarchiesUsage");
   private static final QName COLHIERARCHIESUSAGE$30 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colHierarchiesUsage");
   private static final QName EXTLST$32 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName NAME$34 = new QName("", "name");
   private static final QName CACHEID$36 = new QName("", "cacheId");
   private static final QName DATAONROWS$38 = new QName("", "dataOnRows");
   private static final QName DATAPOSITION$40 = new QName("", "dataPosition");
   private static final QName AUTOFORMATID$42 = new QName("", "autoFormatId");
   private static final QName APPLYNUMBERFORMATS$44 = new QName("", "applyNumberFormats");
   private static final QName APPLYBORDERFORMATS$46 = new QName("", "applyBorderFormats");
   private static final QName APPLYFONTFORMATS$48 = new QName("", "applyFontFormats");
   private static final QName APPLYPATTERNFORMATS$50 = new QName("", "applyPatternFormats");
   private static final QName APPLYALIGNMENTFORMATS$52 = new QName("", "applyAlignmentFormats");
   private static final QName APPLYWIDTHHEIGHTFORMATS$54 = new QName("", "applyWidthHeightFormats");
   private static final QName DATACAPTION$56 = new QName("", "dataCaption");
   private static final QName GRANDTOTALCAPTION$58 = new QName("", "grandTotalCaption");
   private static final QName ERRORCAPTION$60 = new QName("", "errorCaption");
   private static final QName SHOWERROR$62 = new QName("", "showError");
   private static final QName MISSINGCAPTION$64 = new QName("", "missingCaption");
   private static final QName SHOWMISSING$66 = new QName("", "showMissing");
   private static final QName PAGESTYLE$68 = new QName("", "pageStyle");
   private static final QName PIVOTTABLESTYLE$70 = new QName("", "pivotTableStyle");
   private static final QName VACATEDSTYLE$72 = new QName("", "vacatedStyle");
   private static final QName TAG$74 = new QName("", "tag");
   private static final QName UPDATEDVERSION$76 = new QName("", "updatedVersion");
   private static final QName MINREFRESHABLEVERSION$78 = new QName("", "minRefreshableVersion");
   private static final QName ASTERISKTOTALS$80 = new QName("", "asteriskTotals");
   private static final QName SHOWITEMS$82 = new QName("", "showItems");
   private static final QName EDITDATA$84 = new QName("", "editData");
   private static final QName DISABLEFIELDLIST$86 = new QName("", "disableFieldList");
   private static final QName SHOWCALCMBRS$88 = new QName("", "showCalcMbrs");
   private static final QName VISUALTOTALS$90 = new QName("", "visualTotals");
   private static final QName SHOWMULTIPLELABEL$92 = new QName("", "showMultipleLabel");
   private static final QName SHOWDATADROPDOWN$94 = new QName("", "showDataDropDown");
   private static final QName SHOWDRILL$96 = new QName("", "showDrill");
   private static final QName PRINTDRILL$98 = new QName("", "printDrill");
   private static final QName SHOWMEMBERPROPERTYTIPS$100 = new QName("", "showMemberPropertyTips");
   private static final QName SHOWDATATIPS$102 = new QName("", "showDataTips");
   private static final QName ENABLEWIZARD$104 = new QName("", "enableWizard");
   private static final QName ENABLEDRILL$106 = new QName("", "enableDrill");
   private static final QName ENABLEFIELDPROPERTIES$108 = new QName("", "enableFieldProperties");
   private static final QName PRESERVEFORMATTING$110 = new QName("", "preserveFormatting");
   private static final QName USEAUTOFORMATTING$112 = new QName("", "useAutoFormatting");
   private static final QName PAGEWRAP$114 = new QName("", "pageWrap");
   private static final QName PAGEOVERTHENDOWN$116 = new QName("", "pageOverThenDown");
   private static final QName SUBTOTALHIDDENITEMS$118 = new QName("", "subtotalHiddenItems");
   private static final QName ROWGRANDTOTALS$120 = new QName("", "rowGrandTotals");
   private static final QName COLGRANDTOTALS$122 = new QName("", "colGrandTotals");
   private static final QName FIELDPRINTTITLES$124 = new QName("", "fieldPrintTitles");
   private static final QName ITEMPRINTTITLES$126 = new QName("", "itemPrintTitles");
   private static final QName MERGEITEM$128 = new QName("", "mergeItem");
   private static final QName SHOWDROPZONES$130 = new QName("", "showDropZones");
   private static final QName CREATEDVERSION$132 = new QName("", "createdVersion");
   private static final QName INDENT$134 = new QName("", "indent");
   private static final QName SHOWEMPTYROW$136 = new QName("", "showEmptyRow");
   private static final QName SHOWEMPTYCOL$138 = new QName("", "showEmptyCol");
   private static final QName SHOWHEADERS$140 = new QName("", "showHeaders");
   private static final QName COMPACT$142 = new QName("", "compact");
   private static final QName OUTLINE$144 = new QName("", "outline");
   private static final QName OUTLINEDATA$146 = new QName("", "outlineData");
   private static final QName COMPACTDATA$148 = new QName("", "compactData");
   private static final QName PUBLISHED$150 = new QName("", "published");
   private static final QName GRIDDROPZONES$152 = new QName("", "gridDropZones");
   private static final QName IMMERSIVE$154 = new QName("", "immersive");
   private static final QName MULTIPLEFIELDFILTERS$156 = new QName("", "multipleFieldFilters");
   private static final QName CHARTFORMAT$158 = new QName("", "chartFormat");
   private static final QName ROWHEADERCAPTION$160 = new QName("", "rowHeaderCaption");
   private static final QName COLHEADERCAPTION$162 = new QName("", "colHeaderCaption");
   private static final QName FIELDLISTSORTASCENDING$164 = new QName("", "fieldListSortAscending");
   private static final QName MDXSUBQUERIES$166 = new QName("", "mdxSubqueries");
   private static final QName CUSTOMLISTSORT$168 = new QName("", "customListSort");


   public CTPivotTableDefinitionImpl(SchemaType var1) {
      super(var1);
   }

   public CTLocation getLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLocation var2 = null;
         var2 = (CTLocation)this.get_store().find_element_user(LOCATION$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setLocation(CTLocation var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLocation var3 = null;
         var3 = (CTLocation)this.get_store().find_element_user(LOCATION$0, 0);
         if(var3 == null) {
            var3 = (CTLocation)this.get_store().add_element_user(LOCATION$0);
         }

         var3.set(var1);
      }
   }

   public CTLocation addNewLocation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLocation var2 = null;
         var2 = (CTLocation)this.get_store().add_element_user(LOCATION$0);
         return var2;
      }
   }

   public CTPivotFields getPivotFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFields var2 = null;
         var2 = (CTPivotFields)this.get_store().find_element_user(PIVOTFIELDS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPivotFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTFIELDS$2) != 0;
      }
   }

   public void setPivotFields(CTPivotFields var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFields var3 = null;
         var3 = (CTPivotFields)this.get_store().find_element_user(PIVOTFIELDS$2, 0);
         if(var3 == null) {
            var3 = (CTPivotFields)this.get_store().add_element_user(PIVOTFIELDS$2);
         }

         var3.set(var1);
      }
   }

   public CTPivotFields addNewPivotFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFields var2 = null;
         var2 = (CTPivotFields)this.get_store().add_element_user(PIVOTFIELDS$2);
         return var2;
      }
   }

   public void unsetPivotFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTFIELDS$2, 0);
      }
   }

   public CTRowFields getRowFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowFields var2 = null;
         var2 = (CTRowFields)this.get_store().find_element_user(ROWFIELDS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRowFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROWFIELDS$4) != 0;
      }
   }

   public void setRowFields(CTRowFields var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowFields var3 = null;
         var3 = (CTRowFields)this.get_store().find_element_user(ROWFIELDS$4, 0);
         if(var3 == null) {
            var3 = (CTRowFields)this.get_store().add_element_user(ROWFIELDS$4);
         }

         var3.set(var1);
      }
   }

   public CTRowFields addNewRowFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowFields var2 = null;
         var2 = (CTRowFields)this.get_store().add_element_user(ROWFIELDS$4);
         return var2;
      }
   }

   public void unsetRowFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROWFIELDS$4, 0);
      }
   }

   public CTRowItems getRowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowItems var2 = null;
         var2 = (CTRowItems)this.get_store().find_element_user(ROWITEMS$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROWITEMS$6) != 0;
      }
   }

   public void setRowItems(CTRowItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowItems var3 = null;
         var3 = (CTRowItems)this.get_store().find_element_user(ROWITEMS$6, 0);
         if(var3 == null) {
            var3 = (CTRowItems)this.get_store().add_element_user(ROWITEMS$6);
         }

         var3.set(var1);
      }
   }

   public CTRowItems addNewRowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowItems var2 = null;
         var2 = (CTRowItems)this.get_store().add_element_user(ROWITEMS$6);
         return var2;
      }
   }

   public void unsetRowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROWITEMS$6, 0);
      }
   }

   public CTColFields getColFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColFields var2 = null;
         var2 = (CTColFields)this.get_store().find_element_user(COLFIELDS$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLFIELDS$8) != 0;
      }
   }

   public void setColFields(CTColFields var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColFields var3 = null;
         var3 = (CTColFields)this.get_store().find_element_user(COLFIELDS$8, 0);
         if(var3 == null) {
            var3 = (CTColFields)this.get_store().add_element_user(COLFIELDS$8);
         }

         var3.set(var1);
      }
   }

   public CTColFields addNewColFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColFields var2 = null;
         var2 = (CTColFields)this.get_store().add_element_user(COLFIELDS$8);
         return var2;
      }
   }

   public void unsetColFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLFIELDS$8, 0);
      }
   }

   public CTColItems getColItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColItems var2 = null;
         var2 = (CTColItems)this.get_store().find_element_user(COLITEMS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLITEMS$10) != 0;
      }
   }

   public void setColItems(CTColItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColItems var3 = null;
         var3 = (CTColItems)this.get_store().find_element_user(COLITEMS$10, 0);
         if(var3 == null) {
            var3 = (CTColItems)this.get_store().add_element_user(COLITEMS$10);
         }

         var3.set(var1);
      }
   }

   public CTColItems addNewColItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColItems var2 = null;
         var2 = (CTColItems)this.get_store().add_element_user(COLITEMS$10);
         return var2;
      }
   }

   public void unsetColItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLITEMS$10, 0);
      }
   }

   public CTPageFields getPageFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageFields var2 = null;
         var2 = (CTPageFields)this.get_store().find_element_user(PAGEFIELDS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGEFIELDS$12) != 0;
      }
   }

   public void setPageFields(CTPageFields var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageFields var3 = null;
         var3 = (CTPageFields)this.get_store().find_element_user(PAGEFIELDS$12, 0);
         if(var3 == null) {
            var3 = (CTPageFields)this.get_store().add_element_user(PAGEFIELDS$12);
         }

         var3.set(var1);
      }
   }

   public CTPageFields addNewPageFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageFields var2 = null;
         var2 = (CTPageFields)this.get_store().add_element_user(PAGEFIELDS$12);
         return var2;
      }
   }

   public void unsetPageFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGEFIELDS$12, 0);
      }
   }

   public CTDataFields getDataFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataFields var2 = null;
         var2 = (CTDataFields)this.get_store().find_element_user(DATAFIELDS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDataFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATAFIELDS$14) != 0;
      }
   }

   public void setDataFields(CTDataFields var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataFields var3 = null;
         var3 = (CTDataFields)this.get_store().find_element_user(DATAFIELDS$14, 0);
         if(var3 == null) {
            var3 = (CTDataFields)this.get_store().add_element_user(DATAFIELDS$14);
         }

         var3.set(var1);
      }
   }

   public CTDataFields addNewDataFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataFields var2 = null;
         var2 = (CTDataFields)this.get_store().add_element_user(DATAFIELDS$14);
         return var2;
      }
   }

   public void unsetDataFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATAFIELDS$14, 0);
      }
   }

   public CTFormats getFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormats var2 = null;
         var2 = (CTFormats)this.get_store().find_element_user(FORMATS$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMATS$16) != 0;
      }
   }

   public void setFormats(CTFormats var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormats var3 = null;
         var3 = (CTFormats)this.get_store().find_element_user(FORMATS$16, 0);
         if(var3 == null) {
            var3 = (CTFormats)this.get_store().add_element_user(FORMATS$16);
         }

         var3.set(var1);
      }
   }

   public CTFormats addNewFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormats var2 = null;
         var2 = (CTFormats)this.get_store().add_element_user(FORMATS$16);
         return var2;
      }
   }

   public void unsetFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMATS$16, 0);
      }
   }

   public CTConditionalFormats getConditionalFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormats var2 = null;
         var2 = (CTConditionalFormats)this.get_store().find_element_user(CONDITIONALFORMATS$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetConditionalFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONDITIONALFORMATS$18) != 0;
      }
   }

   public void setConditionalFormats(CTConditionalFormats var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormats var3 = null;
         var3 = (CTConditionalFormats)this.get_store().find_element_user(CONDITIONALFORMATS$18, 0);
         if(var3 == null) {
            var3 = (CTConditionalFormats)this.get_store().add_element_user(CONDITIONALFORMATS$18);
         }

         var3.set(var1);
      }
   }

   public CTConditionalFormats addNewConditionalFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTConditionalFormats var2 = null;
         var2 = (CTConditionalFormats)this.get_store().add_element_user(CONDITIONALFORMATS$18);
         return var2;
      }
   }

   public void unsetConditionalFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONDITIONALFORMATS$18, 0);
      }
   }

   public CTChartFormats getChartFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartFormats var2 = null;
         var2 = (CTChartFormats)this.get_store().find_element_user(CHARTFORMATS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetChartFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHARTFORMATS$20) != 0;
      }
   }

   public void setChartFormats(CTChartFormats var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartFormats var3 = null;
         var3 = (CTChartFormats)this.get_store().find_element_user(CHARTFORMATS$20, 0);
         if(var3 == null) {
            var3 = (CTChartFormats)this.get_store().add_element_user(CHARTFORMATS$20);
         }

         var3.set(var1);
      }
   }

   public CTChartFormats addNewChartFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTChartFormats var2 = null;
         var2 = (CTChartFormats)this.get_store().add_element_user(CHARTFORMATS$20);
         return var2;
      }
   }

   public void unsetChartFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHARTFORMATS$20, 0);
      }
   }

   public CTPivotHierarchies getPivotHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotHierarchies var2 = null;
         var2 = (CTPivotHierarchies)this.get_store().find_element_user(PIVOTHIERARCHIES$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPivotHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTHIERARCHIES$22) != 0;
      }
   }

   public void setPivotHierarchies(CTPivotHierarchies var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotHierarchies var3 = null;
         var3 = (CTPivotHierarchies)this.get_store().find_element_user(PIVOTHIERARCHIES$22, 0);
         if(var3 == null) {
            var3 = (CTPivotHierarchies)this.get_store().add_element_user(PIVOTHIERARCHIES$22);
         }

         var3.set(var1);
      }
   }

   public CTPivotHierarchies addNewPivotHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotHierarchies var2 = null;
         var2 = (CTPivotHierarchies)this.get_store().add_element_user(PIVOTHIERARCHIES$22);
         return var2;
      }
   }

   public void unsetPivotHierarchies() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTHIERARCHIES$22, 0);
      }
   }

   public CTPivotTableStyle getPivotTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotTableStyle var2 = null;
         var2 = (CTPivotTableStyle)this.get_store().find_element_user(PIVOTTABLESTYLEINFO$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPivotTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTTABLESTYLEINFO$24) != 0;
      }
   }

   public void setPivotTableStyleInfo(CTPivotTableStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotTableStyle var3 = null;
         var3 = (CTPivotTableStyle)this.get_store().find_element_user(PIVOTTABLESTYLEINFO$24, 0);
         if(var3 == null) {
            var3 = (CTPivotTableStyle)this.get_store().add_element_user(PIVOTTABLESTYLEINFO$24);
         }

         var3.set(var1);
      }
   }

   public CTPivotTableStyle addNewPivotTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotTableStyle var2 = null;
         var2 = (CTPivotTableStyle)this.get_store().add_element_user(PIVOTTABLESTYLEINFO$24);
         return var2;
      }
   }

   public void unsetPivotTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTTABLESTYLEINFO$24, 0);
      }
   }

   public CTPivotFilters getFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFilters var2 = null;
         var2 = (CTPivotFilters)this.get_store().find_element_user(FILTERS$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILTERS$26) != 0;
      }
   }

   public void setFilters(CTPivotFilters var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFilters var3 = null;
         var3 = (CTPivotFilters)this.get_store().find_element_user(FILTERS$26, 0);
         if(var3 == null) {
            var3 = (CTPivotFilters)this.get_store().add_element_user(FILTERS$26);
         }

         var3.set(var1);
      }
   }

   public CTPivotFilters addNewFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotFilters var2 = null;
         var2 = (CTPivotFilters)this.get_store().add_element_user(FILTERS$26);
         return var2;
      }
   }

   public void unsetFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILTERS$26, 0);
      }
   }

   public CTRowHierarchiesUsage getRowHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowHierarchiesUsage var2 = null;
         var2 = (CTRowHierarchiesUsage)this.get_store().find_element_user(ROWHIERARCHIESUSAGE$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRowHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROWHIERARCHIESUSAGE$28) != 0;
      }
   }

   public void setRowHierarchiesUsage(CTRowHierarchiesUsage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowHierarchiesUsage var3 = null;
         var3 = (CTRowHierarchiesUsage)this.get_store().find_element_user(ROWHIERARCHIESUSAGE$28, 0);
         if(var3 == null) {
            var3 = (CTRowHierarchiesUsage)this.get_store().add_element_user(ROWHIERARCHIESUSAGE$28);
         }

         var3.set(var1);
      }
   }

   public CTRowHierarchiesUsage addNewRowHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRowHierarchiesUsage var2 = null;
         var2 = (CTRowHierarchiesUsage)this.get_store().add_element_user(ROWHIERARCHIESUSAGE$28);
         return var2;
      }
   }

   public void unsetRowHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROWHIERARCHIESUSAGE$28, 0);
      }
   }

   public CTColHierarchiesUsage getColHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColHierarchiesUsage var2 = null;
         var2 = (CTColHierarchiesUsage)this.get_store().find_element_user(COLHIERARCHIESUSAGE$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLHIERARCHIESUSAGE$30) != 0;
      }
   }

   public void setColHierarchiesUsage(CTColHierarchiesUsage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColHierarchiesUsage var3 = null;
         var3 = (CTColHierarchiesUsage)this.get_store().find_element_user(COLHIERARCHIESUSAGE$30, 0);
         if(var3 == null) {
            var3 = (CTColHierarchiesUsage)this.get_store().add_element_user(COLHIERARCHIESUSAGE$30);
         }

         var3.set(var1);
      }
   }

   public CTColHierarchiesUsage addNewColHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColHierarchiesUsage var2 = null;
         var2 = (CTColHierarchiesUsage)this.get_store().add_element_user(COLHIERARCHIESUSAGE$30);
         return var2;
      }
   }

   public void unsetColHierarchiesUsage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLHIERARCHIESUSAGE$30, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$32) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$32, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$32);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$32);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$32, 0);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$34);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$34);
         return var2;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$34);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$34);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$34);
         }

         var3.set(var1);
      }
   }

   public long getCacheId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CACHEID$36);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetCacheId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CACHEID$36);
         return var2;
      }
   }

   public void setCacheId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CACHEID$36);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CACHEID$36);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetCacheId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CACHEID$36);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CACHEID$36);
         }

         var3.set(var1);
      }
   }

   public boolean getDataOnRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATAONROWS$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DATAONROWS$38);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDataOnRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DATAONROWS$38);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DATAONROWS$38);
         }

         return var2;
      }
   }

   public boolean isSetDataOnRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATAONROWS$38) != null;
      }
   }

   public void setDataOnRows(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATAONROWS$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATAONROWS$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDataOnRows(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DATAONROWS$38);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DATAONROWS$38);
         }

         var3.set(var1);
      }
   }

   public void unsetDataOnRows() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATAONROWS$38);
      }
   }

   public long getDataPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATAPOSITION$40);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDataPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DATAPOSITION$40);
         return var2;
      }
   }

   public boolean isSetDataPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATAPOSITION$40) != null;
      }
   }

   public void setDataPosition(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DATAPOSITION$40);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DATAPOSITION$40);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDataPosition(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DATAPOSITION$40);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DATAPOSITION$40);
         }

         var3.set(var1);
      }
   }

   public void unsetDataPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATAPOSITION$40);
      }
   }

   public long getAutoFormatId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOFORMATID$42);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetAutoFormatId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(AUTOFORMATID$42);
         return var2;
      }
   }

   public boolean isSetAutoFormatId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOFORMATID$42) != null;
      }
   }

   public void setAutoFormatId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(AUTOFORMATID$42);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(AUTOFORMATID$42);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetAutoFormatId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(AUTOFORMATID$42);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(AUTOFORMATID$42);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoFormatId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOFORMATID$42);
      }
   }

   public boolean getApplyNumberFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyNumberFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
         return var2;
      }
   }

   public boolean isSetApplyNumberFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYNUMBERFORMATS$44) != null;
      }
   }

   public void setApplyNumberFormats(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYNUMBERFORMATS$44);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyNumberFormats(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYNUMBERFORMATS$44);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYNUMBERFORMATS$44);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyNumberFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYNUMBERFORMATS$44);
      }
   }

   public boolean getApplyBorderFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYBORDERFORMATS$46);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyBorderFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYBORDERFORMATS$46);
         return var2;
      }
   }

   public boolean isSetApplyBorderFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYBORDERFORMATS$46) != null;
      }
   }

   public void setApplyBorderFormats(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYBORDERFORMATS$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYBORDERFORMATS$46);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyBorderFormats(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYBORDERFORMATS$46);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYBORDERFORMATS$46);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyBorderFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYBORDERFORMATS$46);
      }
   }

   public boolean getApplyFontFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYFONTFORMATS$48);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyFontFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYFONTFORMATS$48);
         return var2;
      }
   }

   public boolean isSetApplyFontFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYFONTFORMATS$48) != null;
      }
   }

   public void setApplyFontFormats(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYFONTFORMATS$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYFONTFORMATS$48);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyFontFormats(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYFONTFORMATS$48);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYFONTFORMATS$48);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyFontFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYFONTFORMATS$48);
      }
   }

   public boolean getApplyPatternFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyPatternFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
         return var2;
      }
   }

   public boolean isSetApplyPatternFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYPATTERNFORMATS$50) != null;
      }
   }

   public void setApplyPatternFormats(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYPATTERNFORMATS$50);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyPatternFormats(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYPATTERNFORMATS$50);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYPATTERNFORMATS$50);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyPatternFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYPATTERNFORMATS$50);
      }
   }

   public boolean getApplyAlignmentFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyAlignmentFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
         return var2;
      }
   }

   public boolean isSetApplyAlignmentFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52) != null;
      }
   }

   public void setApplyAlignmentFormats(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYALIGNMENTFORMATS$52);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyAlignmentFormats(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYALIGNMENTFORMATS$52);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYALIGNMENTFORMATS$52);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyAlignmentFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYALIGNMENTFORMATS$52);
      }
   }

   public boolean getApplyWidthHeightFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetApplyWidthHeightFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
         return var2;
      }
   }

   public boolean isSetApplyWidthHeightFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54) != null;
      }
   }

   public void setApplyWidthHeightFormats(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetApplyWidthHeightFormats(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(APPLYWIDTHHEIGHTFORMATS$54);
         }

         var3.set(var1);
      }
   }

   public void unsetApplyWidthHeightFormats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(APPLYWIDTHHEIGHTFORMATS$54);
      }
   }

   public String getDataCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATACAPTION$56);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetDataCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(DATACAPTION$56);
         return var2;
      }
   }

   public void setDataCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATACAPTION$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATACAPTION$56);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDataCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(DATACAPTION$56);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(DATACAPTION$56);
         }

         var3.set(var1);
      }
   }

   public String getGrandTotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GRANDTOTALCAPTION$58);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetGrandTotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(GRANDTOTALCAPTION$58);
         return var2;
      }
   }

   public boolean isSetGrandTotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GRANDTOTALCAPTION$58) != null;
      }
   }

   public void setGrandTotalCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GRANDTOTALCAPTION$58);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GRANDTOTALCAPTION$58);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetGrandTotalCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(GRANDTOTALCAPTION$58);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(GRANDTOTALCAPTION$58);
         }

         var3.set(var1);
      }
   }

   public void unsetGrandTotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GRANDTOTALCAPTION$58);
      }
   }

   public String getErrorCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ERRORCAPTION$60);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetErrorCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(ERRORCAPTION$60);
         return var2;
      }
   }

   public boolean isSetErrorCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ERRORCAPTION$60) != null;
      }
   }

   public void setErrorCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ERRORCAPTION$60);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ERRORCAPTION$60);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetErrorCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(ERRORCAPTION$60);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(ERRORCAPTION$60);
         }

         var3.set(var1);
      }
   }

   public void unsetErrorCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ERRORCAPTION$60);
      }
   }

   public boolean getShowError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWERROR$62);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWERROR$62);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWERROR$62);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWERROR$62);
         }

         return var2;
      }
   }

   public boolean isSetShowError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWERROR$62) != null;
      }
   }

   public void setShowError(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWERROR$62);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWERROR$62);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowError(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWERROR$62);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWERROR$62);
         }

         var3.set(var1);
      }
   }

   public void unsetShowError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWERROR$62);
      }
   }

   public String getMissingCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MISSINGCAPTION$64);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetMissingCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(MISSINGCAPTION$64);
         return var2;
      }
   }

   public boolean isSetMissingCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MISSINGCAPTION$64) != null;
      }
   }

   public void setMissingCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MISSINGCAPTION$64);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MISSINGCAPTION$64);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMissingCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(MISSINGCAPTION$64);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(MISSINGCAPTION$64);
         }

         var3.set(var1);
      }
   }

   public void unsetMissingCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MISSINGCAPTION$64);
      }
   }

   public boolean getShowMissing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMISSING$66);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMISSING$66);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMissing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMISSING$66);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMISSING$66);
         }

         return var2;
      }
   }

   public boolean isSetShowMissing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMISSING$66) != null;
      }
   }

   public void setShowMissing(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMISSING$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMISSING$66);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMissing(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMISSING$66);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMISSING$66);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMissing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMISSING$66);
      }
   }

   public String getPageStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PAGESTYLE$68);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetPageStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(PAGESTYLE$68);
         return var2;
      }
   }

   public boolean isSetPageStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PAGESTYLE$68) != null;
      }
   }

   public void setPageStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PAGESTYLE$68);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PAGESTYLE$68);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPageStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(PAGESTYLE$68);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(PAGESTYLE$68);
         }

         var3.set(var1);
      }
   }

   public void unsetPageStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PAGESTYLE$68);
      }
   }

   public String getPivotTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PIVOTTABLESTYLE$70);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetPivotTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(PIVOTTABLESTYLE$70);
         return var2;
      }
   }

   public boolean isSetPivotTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PIVOTTABLESTYLE$70) != null;
      }
   }

   public void setPivotTableStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PIVOTTABLESTYLE$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PIVOTTABLESTYLE$70);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPivotTableStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(PIVOTTABLESTYLE$70);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(PIVOTTABLESTYLE$70);
         }

         var3.set(var1);
      }
   }

   public void unsetPivotTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PIVOTTABLESTYLE$70);
      }
   }

   public String getVacatedStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VACATEDSTYLE$72);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetVacatedStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(VACATEDSTYLE$72);
         return var2;
      }
   }

   public boolean isSetVacatedStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VACATEDSTYLE$72) != null;
      }
   }

   public void setVacatedStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VACATEDSTYLE$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VACATEDSTYLE$72);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetVacatedStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(VACATEDSTYLE$72);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(VACATEDSTYLE$72);
         }

         var3.set(var1);
      }
   }

   public void unsetVacatedStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VACATEDSTYLE$72);
      }
   }

   public String getTag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TAG$74);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetTag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(TAG$74);
         return var2;
      }
   }

   public boolean isSetTag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TAG$74) != null;
      }
   }

   public void setTag(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TAG$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TAG$74);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTag(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(TAG$74);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(TAG$74);
         }

         var3.set(var1);
      }
   }

   public void unsetTag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TAG$74);
      }
   }

   public short getUpdatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UPDATEDVERSION$76);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(UPDATEDVERSION$76);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetUpdatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(UPDATEDVERSION$76);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(UPDATEDVERSION$76);
         }

         return var2;
      }
   }

   public boolean isSetUpdatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UPDATEDVERSION$76) != null;
      }
   }

   public void setUpdatedVersion(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UPDATEDVERSION$76);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UPDATEDVERSION$76);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetUpdatedVersion(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(UPDATEDVERSION$76);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(UPDATEDVERSION$76);
         }

         var3.set(var1);
      }
   }

   public void unsetUpdatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UPDATEDVERSION$76);
      }
   }

   public short getMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MINREFRESHABLEVERSION$78);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(MINREFRESHABLEVERSION$78);
         }

         return var2;
      }
   }

   public boolean isSetMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINREFRESHABLEVERSION$78) != null;
      }
   }

   public void setMinRefreshableVersion(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MINREFRESHABLEVERSION$78);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetMinRefreshableVersion(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(MINREFRESHABLEVERSION$78);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(MINREFRESHABLEVERSION$78);
         }

         var3.set(var1);
      }
   }

   public void unsetMinRefreshableVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINREFRESHABLEVERSION$78);
      }
   }

   public boolean getAsteriskTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ASTERISKTOTALS$80);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ASTERISKTOTALS$80);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAsteriskTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ASTERISKTOTALS$80);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ASTERISKTOTALS$80);
         }

         return var2;
      }
   }

   public boolean isSetAsteriskTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ASTERISKTOTALS$80) != null;
      }
   }

   public void setAsteriskTotals(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ASTERISKTOTALS$80);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ASTERISKTOTALS$80);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAsteriskTotals(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ASTERISKTOTALS$80);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ASTERISKTOTALS$80);
         }

         var3.set(var1);
      }
   }

   public void unsetAsteriskTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ASTERISKTOTALS$80);
      }
   }

   public boolean getShowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWITEMS$82);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWITEMS$82);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWITEMS$82);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWITEMS$82);
         }

         return var2;
      }
   }

   public boolean isSetShowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWITEMS$82) != null;
      }
   }

   public void setShowItems(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWITEMS$82);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWITEMS$82);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowItems(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWITEMS$82);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWITEMS$82);
         }

         var3.set(var1);
      }
   }

   public void unsetShowItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWITEMS$82);
      }
   }

   public boolean getEditData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EDITDATA$84);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EDITDATA$84);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEditData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EDITDATA$84);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(EDITDATA$84);
         }

         return var2;
      }
   }

   public boolean isSetEditData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EDITDATA$84) != null;
      }
   }

   public void setEditData(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EDITDATA$84);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EDITDATA$84);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEditData(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EDITDATA$84);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EDITDATA$84);
         }

         var3.set(var1);
      }
   }

   public void unsetEditData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EDITDATA$84);
      }
   }

   public boolean getDisableFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISABLEFIELDLIST$86);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DISABLEFIELDLIST$86);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDisableFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DISABLEFIELDLIST$86);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DISABLEFIELDLIST$86);
         }

         return var2;
      }
   }

   public boolean isSetDisableFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DISABLEFIELDLIST$86) != null;
      }
   }

   public void setDisableFieldList(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DISABLEFIELDLIST$86);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DISABLEFIELDLIST$86);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDisableFieldList(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DISABLEFIELDLIST$86);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DISABLEFIELDLIST$86);
         }

         var3.set(var1);
      }
   }

   public void unsetDisableFieldList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DISABLEFIELDLIST$86);
      }
   }

   public boolean getShowCalcMbrs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWCALCMBRS$88);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWCALCMBRS$88);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowCalcMbrs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCALCMBRS$88);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWCALCMBRS$88);
         }

         return var2;
      }
   }

   public boolean isSetShowCalcMbrs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWCALCMBRS$88) != null;
      }
   }

   public void setShowCalcMbrs(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWCALCMBRS$88);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWCALCMBRS$88);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowCalcMbrs(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWCALCMBRS$88);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWCALCMBRS$88);
         }

         var3.set(var1);
      }
   }

   public void unsetShowCalcMbrs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWCALCMBRS$88);
      }
   }

   public boolean getVisualTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VISUALTOTALS$90);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VISUALTOTALS$90);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetVisualTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(VISUALTOTALS$90);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(VISUALTOTALS$90);
         }

         return var2;
      }
   }

   public boolean isSetVisualTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VISUALTOTALS$90) != null;
      }
   }

   public void setVisualTotals(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VISUALTOTALS$90);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VISUALTOTALS$90);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetVisualTotals(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(VISUALTOTALS$90);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(VISUALTOTALS$90);
         }

         var3.set(var1);
      }
   }

   public void unsetVisualTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VISUALTOTALS$90);
      }
   }

   public boolean getShowMultipleLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMULTIPLELABEL$92);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMultipleLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMULTIPLELABEL$92);
         }

         return var2;
      }
   }

   public boolean isSetShowMultipleLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMULTIPLELABEL$92) != null;
      }
   }

   public void setShowMultipleLabel(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMULTIPLELABEL$92);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMultipleLabel(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMULTIPLELABEL$92);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMULTIPLELABEL$92);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMultipleLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMULTIPLELABEL$92);
      }
   }

   public boolean getShowDataDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDATADROPDOWN$94);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDATADROPDOWN$94);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowDataDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDATADROPDOWN$94);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWDATADROPDOWN$94);
         }

         return var2;
      }
   }

   public boolean isSetShowDataDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDATADROPDOWN$94) != null;
      }
   }

   public void setShowDataDropDown(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDATADROPDOWN$94);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDATADROPDOWN$94);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowDataDropDown(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDATADROPDOWN$94);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWDATADROPDOWN$94);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDataDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDATADROPDOWN$94);
      }
   }

   public boolean getShowDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDRILL$96);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDRILL$96);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDRILL$96);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWDRILL$96);
         }

         return var2;
      }
   }

   public boolean isSetShowDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDRILL$96) != null;
      }
   }

   public void setShowDrill(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDRILL$96);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDRILL$96);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowDrill(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDRILL$96);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWDRILL$96);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDRILL$96);
      }
   }

   public boolean getPrintDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRINTDRILL$98);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PRINTDRILL$98);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPrintDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRINTDRILL$98);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PRINTDRILL$98);
         }

         return var2;
      }
   }

   public boolean isSetPrintDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRINTDRILL$98) != null;
      }
   }

   public void setPrintDrill(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRINTDRILL$98);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRINTDRILL$98);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPrintDrill(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRINTDRILL$98);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRINTDRILL$98);
         }

         var3.set(var1);
      }
   }

   public void unsetPrintDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRINTDRILL$98);
      }
   }

   public boolean getShowMemberPropertyTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMEMBERPROPERTYTIPS$100);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMemberPropertyTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMEMBERPROPERTYTIPS$100);
         }

         return var2;
      }
   }

   public boolean isSetShowMemberPropertyTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100) != null;
      }
   }

   public void setShowMemberPropertyTips(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMemberPropertyTips(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMEMBERPROPERTYTIPS$100);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMemberPropertyTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMEMBERPROPERTYTIPS$100);
      }
   }

   public boolean getShowDataTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDATATIPS$102);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDATATIPS$102);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowDataTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDATATIPS$102);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWDATATIPS$102);
         }

         return var2;
      }
   }

   public boolean isSetShowDataTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDATATIPS$102) != null;
      }
   }

   public void setShowDataTips(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDATATIPS$102);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDATATIPS$102);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowDataTips(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDATATIPS$102);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWDATATIPS$102);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDataTips() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDATATIPS$102);
      }
   }

   public boolean getEnableWizard() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENABLEWIZARD$104);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ENABLEWIZARD$104);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEnableWizard() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEWIZARD$104);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ENABLEWIZARD$104);
         }

         return var2;
      }
   }

   public boolean isSetEnableWizard() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENABLEWIZARD$104) != null;
      }
   }

   public void setEnableWizard(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENABLEWIZARD$104);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENABLEWIZARD$104);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEnableWizard(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEWIZARD$104);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ENABLEWIZARD$104);
         }

         var3.set(var1);
      }
   }

   public void unsetEnableWizard() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENABLEWIZARD$104);
      }
   }

   public boolean getEnableDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENABLEDRILL$106);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ENABLEDRILL$106);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEnableDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEDRILL$106);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ENABLEDRILL$106);
         }

         return var2;
      }
   }

   public boolean isSetEnableDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENABLEDRILL$106) != null;
      }
   }

   public void setEnableDrill(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENABLEDRILL$106);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENABLEDRILL$106);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEnableDrill(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEDRILL$106);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ENABLEDRILL$106);
         }

         var3.set(var1);
      }
   }

   public void unsetEnableDrill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENABLEDRILL$106);
      }
   }

   public boolean getEnableFieldProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ENABLEFIELDPROPERTIES$108);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEnableFieldProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ENABLEFIELDPROPERTIES$108);
         }

         return var2;
      }
   }

   public boolean isSetEnableFieldProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108) != null;
      }
   }

   public void setEnableFieldProperties(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENABLEFIELDPROPERTIES$108);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEnableFieldProperties(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEFIELDPROPERTIES$108);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ENABLEFIELDPROPERTIES$108);
         }

         var3.set(var1);
      }
   }

   public void unsetEnableFieldProperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENABLEFIELDPROPERTIES$108);
      }
   }

   public boolean getPreserveFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRESERVEFORMATTING$110);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PRESERVEFORMATTING$110);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPreserveFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVEFORMATTING$110);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PRESERVEFORMATTING$110);
         }

         return var2;
      }
   }

   public boolean isSetPreserveFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRESERVEFORMATTING$110) != null;
      }
   }

   public void setPreserveFormatting(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRESERVEFORMATTING$110);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRESERVEFORMATTING$110);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPreserveFormatting(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVEFORMATTING$110);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRESERVEFORMATTING$110);
         }

         var3.set(var1);
      }
   }

   public void unsetPreserveFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRESERVEFORMATTING$110);
      }
   }

   public boolean getUseAutoFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USEAUTOFORMATTING$112);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USEAUTOFORMATTING$112);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUseAutoFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USEAUTOFORMATTING$112);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USEAUTOFORMATTING$112);
         }

         return var2;
      }
   }

   public boolean isSetUseAutoFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USEAUTOFORMATTING$112) != null;
      }
   }

   public void setUseAutoFormatting(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USEAUTOFORMATTING$112);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USEAUTOFORMATTING$112);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUseAutoFormatting(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USEAUTOFORMATTING$112);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USEAUTOFORMATTING$112);
         }

         var3.set(var1);
      }
   }

   public void unsetUseAutoFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USEAUTOFORMATTING$112);
      }
   }

   public long getPageWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PAGEWRAP$114);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PAGEWRAP$114);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetPageWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(PAGEWRAP$114);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(PAGEWRAP$114);
         }

         return var2;
      }
   }

   public boolean isSetPageWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PAGEWRAP$114) != null;
      }
   }

   public void setPageWrap(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(PAGEWRAP$114);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(PAGEWRAP$114);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetPageWrap(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(PAGEWRAP$114);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(PAGEWRAP$114);
         }

         var3.set(var1);
      }
   }

   public void unsetPageWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PAGEWRAP$114);
      }
   }

   public boolean getPageOverThenDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PAGEOVERTHENDOWN$116);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPageOverThenDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PAGEOVERTHENDOWN$116);
         }

         return var2;
      }
   }

   public boolean isSetPageOverThenDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PAGEOVERTHENDOWN$116) != null;
      }
   }

   public void setPageOverThenDown(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PAGEOVERTHENDOWN$116);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPageOverThenDown(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PAGEOVERTHENDOWN$116);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PAGEOVERTHENDOWN$116);
         }

         var3.set(var1);
      }
   }

   public void unsetPageOverThenDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PAGEOVERTHENDOWN$116);
      }
   }

   public boolean getSubtotalHiddenItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUBTOTALHIDDENITEMS$118);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSubtotalHiddenItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUBTOTALHIDDENITEMS$118);
         }

         return var2;
      }
   }

   public boolean isSetSubtotalHiddenItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118) != null;
      }
   }

   public void setSubtotalHiddenItems(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUBTOTALHIDDENITEMS$118);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSubtotalHiddenItems(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUBTOTALHIDDENITEMS$118);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUBTOTALHIDDENITEMS$118);
         }

         var3.set(var1);
      }
   }

   public void unsetSubtotalHiddenItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUBTOTALHIDDENITEMS$118);
      }
   }

   public boolean getRowGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROWGRANDTOTALS$120);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ROWGRANDTOTALS$120);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRowGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ROWGRANDTOTALS$120);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ROWGRANDTOTALS$120);
         }

         return var2;
      }
   }

   public boolean isSetRowGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROWGRANDTOTALS$120) != null;
      }
   }

   public void setRowGrandTotals(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROWGRANDTOTALS$120);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROWGRANDTOTALS$120);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRowGrandTotals(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ROWGRANDTOTALS$120);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ROWGRANDTOTALS$120);
         }

         var3.set(var1);
      }
   }

   public void unsetRowGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROWGRANDTOTALS$120);
      }
   }

   public boolean getColGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLGRANDTOTALS$122);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COLGRANDTOTALS$122);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetColGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COLGRANDTOTALS$122);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COLGRANDTOTALS$122);
         }

         return var2;
      }
   }

   public boolean isSetColGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLGRANDTOTALS$122) != null;
      }
   }

   public void setColGrandTotals(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLGRANDTOTALS$122);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLGRANDTOTALS$122);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetColGrandTotals(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COLGRANDTOTALS$122);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COLGRANDTOTALS$122);
         }

         var3.set(var1);
      }
   }

   public void unsetColGrandTotals() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLGRANDTOTALS$122);
      }
   }

   public boolean getFieldPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIELDPRINTTITLES$124);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIELDPRINTTITLES$124);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFieldPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FIELDPRINTTITLES$124);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FIELDPRINTTITLES$124);
         }

         return var2;
      }
   }

   public boolean isSetFieldPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIELDPRINTTITLES$124) != null;
      }
   }

   public void setFieldPrintTitles(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIELDPRINTTITLES$124);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIELDPRINTTITLES$124);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFieldPrintTitles(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FIELDPRINTTITLES$124);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FIELDPRINTTITLES$124);
         }

         var3.set(var1);
      }
   }

   public void unsetFieldPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIELDPRINTTITLES$124);
      }
   }

   public boolean getItemPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ITEMPRINTTITLES$126);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ITEMPRINTTITLES$126);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetItemPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ITEMPRINTTITLES$126);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ITEMPRINTTITLES$126);
         }

         return var2;
      }
   }

   public boolean isSetItemPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ITEMPRINTTITLES$126) != null;
      }
   }

   public void setItemPrintTitles(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ITEMPRINTTITLES$126);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ITEMPRINTTITLES$126);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetItemPrintTitles(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ITEMPRINTTITLES$126);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ITEMPRINTTITLES$126);
         }

         var3.set(var1);
      }
   }

   public void unsetItemPrintTitles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ITEMPRINTTITLES$126);
      }
   }

   public boolean getMergeItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MERGEITEM$128);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MERGEITEM$128);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMergeItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MERGEITEM$128);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MERGEITEM$128);
         }

         return var2;
      }
   }

   public boolean isSetMergeItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MERGEITEM$128) != null;
      }
   }

   public void setMergeItem(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MERGEITEM$128);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MERGEITEM$128);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMergeItem(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MERGEITEM$128);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MERGEITEM$128);
         }

         var3.set(var1);
      }
   }

   public void unsetMergeItem() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MERGEITEM$128);
      }
   }

   public boolean getShowDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDROPZONES$130);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDROPZONES$130);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDROPZONES$130);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWDROPZONES$130);
         }

         return var2;
      }
   }

   public boolean isSetShowDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDROPZONES$130) != null;
      }
   }

   public void setShowDropZones(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDROPZONES$130);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDROPZONES$130);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowDropZones(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDROPZONES$130);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWDROPZONES$130);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDROPZONES$130);
      }
   }

   public short getCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CREATEDVERSION$132);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CREATEDVERSION$132);
         }

         return var2 == null?0:var2.getShortValue();
      }
   }

   public XmlUnsignedByte xgetCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var2 = null;
         var2 = (XmlUnsignedByte)this.get_store().find_attribute_user(CREATEDVERSION$132);
         if(var2 == null) {
            var2 = (XmlUnsignedByte)this.get_default_attribute_value(CREATEDVERSION$132);
         }

         return var2;
      }
   }

   public boolean isSetCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CREATEDVERSION$132) != null;
      }
   }

   public void setCreatedVersion(short var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CREATEDVERSION$132);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CREATEDVERSION$132);
         }

         var3.setShortValue(var1);
      }
   }

   public void xsetCreatedVersion(XmlUnsignedByte var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedByte var3 = null;
         var3 = (XmlUnsignedByte)this.get_store().find_attribute_user(CREATEDVERSION$132);
         if(var3 == null) {
            var3 = (XmlUnsignedByte)this.get_store().add_attribute_user(CREATEDVERSION$132);
         }

         var3.set(var1);
      }
   }

   public void unsetCreatedVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CREATEDVERSION$132);
      }
   }

   public long getIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INDENT$134);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INDENT$134);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(INDENT$134);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(INDENT$134);
         }

         return var2;
      }
   }

   public boolean isSetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INDENT$134) != null;
      }
   }

   public void setIndent(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(INDENT$134);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(INDENT$134);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetIndent(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(INDENT$134);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(INDENT$134);
         }

         var3.set(var1);
      }
   }

   public void unsetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INDENT$134);
      }
   }

   public boolean getShowEmptyRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWEMPTYROW$136);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWEMPTYROW$136);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowEmptyRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWEMPTYROW$136);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWEMPTYROW$136);
         }

         return var2;
      }
   }

   public boolean isSetShowEmptyRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWEMPTYROW$136) != null;
      }
   }

   public void setShowEmptyRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWEMPTYROW$136);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWEMPTYROW$136);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowEmptyRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWEMPTYROW$136);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWEMPTYROW$136);
         }

         var3.set(var1);
      }
   }

   public void unsetShowEmptyRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWEMPTYROW$136);
      }
   }

   public boolean getShowEmptyCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWEMPTYCOL$138);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWEMPTYCOL$138);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowEmptyCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWEMPTYCOL$138);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWEMPTYCOL$138);
         }

         return var2;
      }
   }

   public boolean isSetShowEmptyCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWEMPTYCOL$138) != null;
      }
   }

   public void setShowEmptyCol(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWEMPTYCOL$138);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWEMPTYCOL$138);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowEmptyCol(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWEMPTYCOL$138);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWEMPTYCOL$138);
         }

         var3.set(var1);
      }
   }

   public void unsetShowEmptyCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWEMPTYCOL$138);
      }
   }

   public boolean getShowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWHEADERS$140);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWHEADERS$140);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWHEADERS$140);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWHEADERS$140);
         }

         return var2;
      }
   }

   public boolean isSetShowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWHEADERS$140) != null;
      }
   }

   public void setShowHeaders(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWHEADERS$140);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWHEADERS$140);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowHeaders(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWHEADERS$140);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWHEADERS$140);
         }

         var3.set(var1);
      }
   }

   public void unsetShowHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWHEADERS$140);
      }
   }

   public boolean getCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMPACT$142);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COMPACT$142);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COMPACT$142);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COMPACT$142);
         }

         return var2;
      }
   }

   public boolean isSetCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMPACT$142) != null;
      }
   }

   public void setCompact(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMPACT$142);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMPACT$142);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCompact(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COMPACT$142);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COMPACT$142);
         }

         var3.set(var1);
      }
   }

   public void unsetCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMPACT$142);
      }
   }

   public boolean getOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINE$144);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINE$144);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINE$144);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(OUTLINE$144);
         }

         return var2;
      }
   }

   public boolean isSetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINE$144) != null;
      }
   }

   public void setOutline(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINE$144);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINE$144);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetOutline(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINE$144);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(OUTLINE$144);
         }

         var3.set(var1);
      }
   }

   public void unsetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINE$144);
      }
   }

   public boolean getOutlineData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINEDATA$146);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINEDATA$146);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetOutlineData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINEDATA$146);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(OUTLINEDATA$146);
         }

         return var2;
      }
   }

   public boolean isSetOutlineData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINEDATA$146) != null;
      }
   }

   public void setOutlineData(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINEDATA$146);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINEDATA$146);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetOutlineData(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINEDATA$146);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(OUTLINEDATA$146);
         }

         var3.set(var1);
      }
   }

   public void unsetOutlineData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINEDATA$146);
      }
   }

   public boolean getCompactData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMPACTDATA$148);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COMPACTDATA$148);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCompactData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COMPACTDATA$148);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COMPACTDATA$148);
         }

         return var2;
      }
   }

   public boolean isSetCompactData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMPACTDATA$148) != null;
      }
   }

   public void setCompactData(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMPACTDATA$148);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMPACTDATA$148);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCompactData(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COMPACTDATA$148);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COMPACTDATA$148);
         }

         var3.set(var1);
      }
   }

   public void unsetCompactData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMPACTDATA$148);
      }
   }

   public boolean getPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHED$150);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PUBLISHED$150);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHED$150);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PUBLISHED$150);
         }

         return var2;
      }
   }

   public boolean isSetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PUBLISHED$150) != null;
      }
   }

   public void setPublished(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHED$150);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PUBLISHED$150);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPublished(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHED$150);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PUBLISHED$150);
         }

         var3.set(var1);
      }
   }

   public void unsetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PUBLISHED$150);
      }
   }

   public boolean getGridDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GRIDDROPZONES$152);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(GRIDDROPZONES$152);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetGridDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(GRIDDROPZONES$152);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(GRIDDROPZONES$152);
         }

         return var2;
      }
   }

   public boolean isSetGridDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GRIDDROPZONES$152) != null;
      }
   }

   public void setGridDropZones(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GRIDDROPZONES$152);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GRIDDROPZONES$152);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetGridDropZones(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(GRIDDROPZONES$152);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(GRIDDROPZONES$152);
         }

         var3.set(var1);
      }
   }

   public void unsetGridDropZones() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GRIDDROPZONES$152);
      }
   }

   public boolean getImmersive() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IMMERSIVE$154);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(IMMERSIVE$154);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetImmersive() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(IMMERSIVE$154);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(IMMERSIVE$154);
         }

         return var2;
      }
   }

   public boolean isSetImmersive() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IMMERSIVE$154) != null;
      }
   }

   public void setImmersive(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(IMMERSIVE$154);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(IMMERSIVE$154);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetImmersive(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(IMMERSIVE$154);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(IMMERSIVE$154);
         }

         var3.set(var1);
      }
   }

   public void unsetImmersive() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IMMERSIVE$154);
      }
   }

   public boolean getMultipleFieldFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MULTIPLEFIELDFILTERS$156);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMultipleFieldFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MULTIPLEFIELDFILTERS$156);
         }

         return var2;
      }
   }

   public boolean isSetMultipleFieldFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156) != null;
      }
   }

   public void setMultipleFieldFilters(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MULTIPLEFIELDFILTERS$156);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMultipleFieldFilters(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MULTIPLEFIELDFILTERS$156);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MULTIPLEFIELDFILTERS$156);
         }

         var3.set(var1);
      }
   }

   public void unsetMultipleFieldFilters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MULTIPLEFIELDFILTERS$156);
      }
   }

   public long getChartFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CHARTFORMAT$158);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CHARTFORMAT$158);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetChartFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CHARTFORMAT$158);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(CHARTFORMAT$158);
         }

         return var2;
      }
   }

   public boolean isSetChartFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CHARTFORMAT$158) != null;
      }
   }

   public void setChartFormat(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CHARTFORMAT$158);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CHARTFORMAT$158);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetChartFormat(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CHARTFORMAT$158);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CHARTFORMAT$158);
         }

         var3.set(var1);
      }
   }

   public void unsetChartFormat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CHARTFORMAT$158);
      }
   }

   public String getRowHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ROWHEADERCAPTION$160);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetRowHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(ROWHEADERCAPTION$160);
         return var2;
      }
   }

   public boolean isSetRowHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ROWHEADERCAPTION$160) != null;
      }
   }

   public void setRowHeaderCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ROWHEADERCAPTION$160);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ROWHEADERCAPTION$160);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRowHeaderCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(ROWHEADERCAPTION$160);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(ROWHEADERCAPTION$160);
         }

         var3.set(var1);
      }
   }

   public void unsetRowHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ROWHEADERCAPTION$160);
      }
   }

   public String getColHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLHEADERCAPTION$162);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetColHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(COLHEADERCAPTION$162);
         return var2;
      }
   }

   public boolean isSetColHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLHEADERCAPTION$162) != null;
      }
   }

   public void setColHeaderCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COLHEADERCAPTION$162);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COLHEADERCAPTION$162);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetColHeaderCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(COLHEADERCAPTION$162);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(COLHEADERCAPTION$162);
         }

         var3.set(var1);
      }
   }

   public void unsetColHeaderCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLHEADERCAPTION$162);
      }
   }

   public boolean getFieldListSortAscending() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIELDLISTSORTASCENDING$164);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFieldListSortAscending() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FIELDLISTSORTASCENDING$164);
         }

         return var2;
      }
   }

   public boolean isSetFieldListSortAscending() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIELDLISTSORTASCENDING$164) != null;
      }
   }

   public void setFieldListSortAscending(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIELDLISTSORTASCENDING$164);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFieldListSortAscending(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FIELDLISTSORTASCENDING$164);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FIELDLISTSORTASCENDING$164);
         }

         var3.set(var1);
      }
   }

   public void unsetFieldListSortAscending() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIELDLISTSORTASCENDING$164);
      }
   }

   public boolean getMdxSubqueries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MDXSUBQUERIES$166);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MDXSUBQUERIES$166);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMdxSubqueries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MDXSUBQUERIES$166);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MDXSUBQUERIES$166);
         }

         return var2;
      }
   }

   public boolean isSetMdxSubqueries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MDXSUBQUERIES$166) != null;
      }
   }

   public void setMdxSubqueries(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MDXSUBQUERIES$166);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MDXSUBQUERIES$166);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMdxSubqueries(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MDXSUBQUERIES$166);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MDXSUBQUERIES$166);
         }

         var3.set(var1);
      }
   }

   public void unsetMdxSubqueries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MDXSUBQUERIES$166);
      }
   }

   public boolean getCustomListSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMLISTSORT$168);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CUSTOMLISTSORT$168);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCustomListSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMLISTSORT$168);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CUSTOMLISTSORT$168);
         }

         return var2;
      }
   }

   public boolean isSetCustomListSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CUSTOMLISTSORT$168) != null;
      }
   }

   public void setCustomListSort(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CUSTOMLISTSORT$168);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CUSTOMLISTSORT$168);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCustomListSort(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CUSTOMLISTSORT$168);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CUSTOMLISTSORT$168);
         }

         var3.set(var1);
      }
   }

   public void unsetCustomListSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CUSTOMLISTSORT$168);
      }
   }

}
