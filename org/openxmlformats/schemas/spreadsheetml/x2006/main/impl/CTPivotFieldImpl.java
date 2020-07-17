package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoSortScope;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STAxis;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFieldSortType$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTPivotFieldImpl extends XmlComplexContentImpl implements CTPivotField {

   private static final QName ITEMS$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "items");
   private static final QName AUTOSORTSCOPE$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoSortScope");
   private static final QName EXTLST$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName NAME$6 = new QName("", "name");
   private static final QName AXIS$8 = new QName("", "axis");
   private static final QName DATAFIELD$10 = new QName("", "dataField");
   private static final QName SUBTOTALCAPTION$12 = new QName("", "subtotalCaption");
   private static final QName SHOWDROPDOWNS$14 = new QName("", "showDropDowns");
   private static final QName HIDDENLEVEL$16 = new QName("", "hiddenLevel");
   private static final QName UNIQUEMEMBERPROPERTY$18 = new QName("", "uniqueMemberProperty");
   private static final QName COMPACT$20 = new QName("", "compact");
   private static final QName ALLDRILLED$22 = new QName("", "allDrilled");
   private static final QName NUMFMTID$24 = new QName("", "numFmtId");
   private static final QName OUTLINE$26 = new QName("", "outline");
   private static final QName SUBTOTALTOP$28 = new QName("", "subtotalTop");
   private static final QName DRAGTOROW$30 = new QName("", "dragToRow");
   private static final QName DRAGTOCOL$32 = new QName("", "dragToCol");
   private static final QName MULTIPLEITEMSELECTIONALLOWED$34 = new QName("", "multipleItemSelectionAllowed");
   private static final QName DRAGTOPAGE$36 = new QName("", "dragToPage");
   private static final QName DRAGTODATA$38 = new QName("", "dragToData");
   private static final QName DRAGOFF$40 = new QName("", "dragOff");
   private static final QName SHOWALL$42 = new QName("", "showAll");
   private static final QName INSERTBLANKROW$44 = new QName("", "insertBlankRow");
   private static final QName SERVERFIELD$46 = new QName("", "serverField");
   private static final QName INSERTPAGEBREAK$48 = new QName("", "insertPageBreak");
   private static final QName AUTOSHOW$50 = new QName("", "autoShow");
   private static final QName TOPAUTOSHOW$52 = new QName("", "topAutoShow");
   private static final QName HIDENEWITEMS$54 = new QName("", "hideNewItems");
   private static final QName MEASUREFILTER$56 = new QName("", "measureFilter");
   private static final QName INCLUDENEWITEMSINFILTER$58 = new QName("", "includeNewItemsInFilter");
   private static final QName ITEMPAGECOUNT$60 = new QName("", "itemPageCount");
   private static final QName SORTTYPE$62 = new QName("", "sortType");
   private static final QName DATASOURCESORT$64 = new QName("", "dataSourceSort");
   private static final QName NONAUTOSORTDEFAULT$66 = new QName("", "nonAutoSortDefault");
   private static final QName RANKBY$68 = new QName("", "rankBy");
   private static final QName DEFAULTSUBTOTAL$70 = new QName("", "defaultSubtotal");
   private static final QName SUMSUBTOTAL$72 = new QName("", "sumSubtotal");
   private static final QName COUNTASUBTOTAL$74 = new QName("", "countASubtotal");
   private static final QName AVGSUBTOTAL$76 = new QName("", "avgSubtotal");
   private static final QName MAXSUBTOTAL$78 = new QName("", "maxSubtotal");
   private static final QName MINSUBTOTAL$80 = new QName("", "minSubtotal");
   private static final QName PRODUCTSUBTOTAL$82 = new QName("", "productSubtotal");
   private static final QName COUNTSUBTOTAL$84 = new QName("", "countSubtotal");
   private static final QName STDDEVSUBTOTAL$86 = new QName("", "stdDevSubtotal");
   private static final QName STDDEVPSUBTOTAL$88 = new QName("", "stdDevPSubtotal");
   private static final QName VARSUBTOTAL$90 = new QName("", "varSubtotal");
   private static final QName VARPSUBTOTAL$92 = new QName("", "varPSubtotal");
   private static final QName SHOWPROPCELL$94 = new QName("", "showPropCell");
   private static final QName SHOWPROPTIP$96 = new QName("", "showPropTip");
   private static final QName SHOWPROPASCAPTION$98 = new QName("", "showPropAsCaption");
   private static final QName DEFAULTATTRIBUTEDRILLSTATE$100 = new QName("", "defaultAttributeDrillState");


   public CTPivotFieldImpl(SchemaType var1) {
      super(var1);
   }

   public CTItems getItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItems var2 = null;
         var2 = (CTItems)this.get_store().find_element_user(ITEMS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ITEMS$0) != 0;
      }
   }

   public void setItems(CTItems var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItems var3 = null;
         var3 = (CTItems)this.get_store().find_element_user(ITEMS$0, 0);
         if(var3 == null) {
            var3 = (CTItems)this.get_store().add_element_user(ITEMS$0);
         }

         var3.set(var1);
      }
   }

   public CTItems addNewItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTItems var2 = null;
         var2 = (CTItems)this.get_store().add_element_user(ITEMS$0);
         return var2;
      }
   }

   public void unsetItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ITEMS$0, 0);
      }
   }

   public CTAutoSortScope getAutoSortScope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoSortScope var2 = null;
         var2 = (CTAutoSortScope)this.get_store().find_element_user(AUTOSORTSCOPE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoSortScope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOSORTSCOPE$2) != 0;
      }
   }

   public void setAutoSortScope(CTAutoSortScope var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoSortScope var3 = null;
         var3 = (CTAutoSortScope)this.get_store().find_element_user(AUTOSORTSCOPE$2, 0);
         if(var3 == null) {
            var3 = (CTAutoSortScope)this.get_store().add_element_user(AUTOSORTSCOPE$2);
         }

         var3.set(var1);
      }
   }

   public CTAutoSortScope addNewAutoSortScope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoSortScope var2 = null;
         var2 = (CTAutoSortScope)this.get_store().add_element_user(AUTOSORTSCOPE$2);
         return var2;
      }
   }

   public void unsetAutoSortScope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOSORTSCOPE$2, 0);
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

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$6);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$6);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$6) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$6);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$6);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$6);
      }
   }

   public STAxis.Enum getAxis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AXIS$8);
         return var2 == null?null:(STAxis.Enum)var2.getEnumValue();
      }
   }

   public STAxis xgetAxis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAxis var2 = null;
         var2 = (STAxis)this.get_store().find_attribute_user(AXIS$8);
         return var2;
      }
   }

   public boolean isSetAxis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AXIS$8) != null;
      }
   }

   public void setAxis(STAxis.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AXIS$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AXIS$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAxis(STAxis var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAxis var3 = null;
         var3 = (STAxis)this.get_store().find_attribute_user(AXIS$8);
         if(var3 == null) {
            var3 = (STAxis)this.get_store().add_attribute_user(AXIS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetAxis() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AXIS$8);
      }
   }

   public boolean getDataField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATAFIELD$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DATAFIELD$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDataField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DATAFIELD$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DATAFIELD$10);
         }

         return var2;
      }
   }

   public boolean isSetDataField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATAFIELD$10) != null;
      }
   }

   public void setDataField(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATAFIELD$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATAFIELD$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDataField(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DATAFIELD$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DATAFIELD$10);
         }

         var3.set(var1);
      }
   }

   public void unsetDataField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATAFIELD$10);
      }
   }

   public String getSubtotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTALCAPTION$12);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetSubtotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(SUBTOTALCAPTION$12);
         return var2;
      }
   }

   public boolean isSetSubtotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUBTOTALCAPTION$12) != null;
      }
   }

   public void setSubtotalCaption(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTALCAPTION$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUBTOTALCAPTION$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSubtotalCaption(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(SUBTOTALCAPTION$12);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(SUBTOTALCAPTION$12);
         }

         var3.set(var1);
      }
   }

   public void unsetSubtotalCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUBTOTALCAPTION$12);
      }
   }

   public boolean getShowDropDowns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDROPDOWNS$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDROPDOWNS$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowDropDowns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDROPDOWNS$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWDROPDOWNS$14);
         }

         return var2;
      }
   }

   public boolean isSetShowDropDowns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDROPDOWNS$14) != null;
      }
   }

   public void setShowDropDowns(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDROPDOWNS$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDROPDOWNS$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowDropDowns(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDROPDOWNS$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWDROPDOWNS$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDropDowns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDROPDOWNS$14);
      }
   }

   public boolean getHiddenLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDDENLEVEL$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDDENLEVEL$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHiddenLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDDENLEVEL$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDDENLEVEL$16);
         }

         return var2;
      }
   }

   public boolean isSetHiddenLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDDENLEVEL$16) != null;
      }
   }

   public void setHiddenLevel(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDDENLEVEL$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDDENLEVEL$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHiddenLevel(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDDENLEVEL$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDDENLEVEL$16);
         }

         var3.set(var1);
      }
   }

   public void unsetHiddenLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDDENLEVEL$16);
      }
   }

   public String getUniqueMemberProperty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetUniqueMemberProperty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
         return var2;
      }
   }

   public boolean isSetUniqueMemberProperty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18) != null;
      }
   }

   public void setUniqueMemberProperty(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUEMEMBERPROPERTY$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUniqueMemberProperty(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(UNIQUEMEMBERPROPERTY$18);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(UNIQUEMEMBERPROPERTY$18);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueMemberProperty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUEMEMBERPROPERTY$18);
      }
   }

   public boolean getCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMPACT$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COMPACT$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COMPACT$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COMPACT$20);
         }

         return var2;
      }
   }

   public boolean isSetCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMPACT$20) != null;
      }
   }

   public void setCompact(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMPACT$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMPACT$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCompact(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COMPACT$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COMPACT$20);
         }

         var3.set(var1);
      }
   }

   public void unsetCompact() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMPACT$20);
      }
   }

   public boolean getAllDrilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLDRILLED$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ALLDRILLED$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAllDrilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ALLDRILLED$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ALLDRILLED$22);
         }

         return var2;
      }
   }

   public boolean isSetAllDrilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLDRILLED$22) != null;
      }
   }

   public void setAllDrilled(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLDRILLED$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLDRILLED$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAllDrilled(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ALLDRILLED$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ALLDRILLED$22);
         }

         var3.set(var1);
      }
   }

   public void unsetAllDrilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLDRILLED$22);
      }
   }

   public long getNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$24);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STNumFmtId xgetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var2 = null;
         var2 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$24);
         return var2;
      }
   }

   public boolean isSetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NUMFMTID$24) != null;
      }
   }

   public void setNumFmtId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(NUMFMTID$24);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(NUMFMTID$24);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetNumFmtId(STNumFmtId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STNumFmtId var3 = null;
         var3 = (STNumFmtId)this.get_store().find_attribute_user(NUMFMTID$24);
         if(var3 == null) {
            var3 = (STNumFmtId)this.get_store().add_attribute_user(NUMFMTID$24);
         }

         var3.set(var1);
      }
   }

   public void unsetNumFmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NUMFMTID$24);
      }
   }

   public boolean getOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OUTLINE$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OUTLINE$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINE$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(OUTLINE$26);
         }

         return var2;
      }
   }

   public boolean isSetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OUTLINE$26) != null;
      }
   }

   public void setOutline(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OUTLINE$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OUTLINE$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetOutline(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(OUTLINE$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(OUTLINE$26);
         }

         var3.set(var1);
      }
   }

   public void unsetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OUTLINE$26);
      }
   }

   public boolean getSubtotalTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTALTOP$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUBTOTALTOP$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSubtotalTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUBTOTALTOP$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUBTOTALTOP$28);
         }

         return var2;
      }
   }

   public boolean isSetSubtotalTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUBTOTALTOP$28) != null;
      }
   }

   public void setSubtotalTop(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUBTOTALTOP$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUBTOTALTOP$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSubtotalTop(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUBTOTALTOP$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUBTOTALTOP$28);
         }

         var3.set(var1);
      }
   }

   public void unsetSubtotalTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUBTOTALTOP$28);
      }
   }

   public boolean getDragToRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAGTOROW$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAGTOROW$30);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDragToRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTOROW$30);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAGTOROW$30);
         }

         return var2;
      }
   }

   public boolean isSetDragToRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAGTOROW$30) != null;
      }
   }

   public void setDragToRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAGTOROW$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAGTOROW$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDragToRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTOROW$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAGTOROW$30);
         }

         var3.set(var1);
      }
   }

   public void unsetDragToRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAGTOROW$30);
      }
   }

   public boolean getDragToCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAGTOCOL$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAGTOCOL$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDragToCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTOCOL$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAGTOCOL$32);
         }

         return var2;
      }
   }

   public boolean isSetDragToCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAGTOCOL$32) != null;
      }
   }

   public void setDragToCol(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAGTOCOL$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAGTOCOL$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDragToCol(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTOCOL$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAGTOCOL$32);
         }

         var3.set(var1);
      }
   }

   public void unsetDragToCol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAGTOCOL$32);
      }
   }

   public boolean getMultipleItemSelectionAllowed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MULTIPLEITEMSELECTIONALLOWED$34);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMultipleItemSelectionAllowed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MULTIPLEITEMSELECTIONALLOWED$34);
         }

         return var2;
      }
   }

   public boolean isSetMultipleItemSelectionAllowed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34) != null;
      }
   }

   public void setMultipleItemSelectionAllowed(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMultipleItemSelectionAllowed(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MULTIPLEITEMSELECTIONALLOWED$34);
         }

         var3.set(var1);
      }
   }

   public void unsetMultipleItemSelectionAllowed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MULTIPLEITEMSELECTIONALLOWED$34);
      }
   }

   public boolean getDragToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAGTOPAGE$36);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAGTOPAGE$36);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDragToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTOPAGE$36);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAGTOPAGE$36);
         }

         return var2;
      }
   }

   public boolean isSetDragToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAGTOPAGE$36) != null;
      }
   }

   public void setDragToPage(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAGTOPAGE$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAGTOPAGE$36);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDragToPage(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTOPAGE$36);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAGTOPAGE$36);
         }

         var3.set(var1);
      }
   }

   public void unsetDragToPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAGTOPAGE$36);
      }
   }

   public boolean getDragToData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAGTODATA$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAGTODATA$38);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDragToData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTODATA$38);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAGTODATA$38);
         }

         return var2;
      }
   }

   public boolean isSetDragToData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAGTODATA$38) != null;
      }
   }

   public void setDragToData(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAGTODATA$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAGTODATA$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDragToData(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAGTODATA$38);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAGTODATA$38);
         }

         var3.set(var1);
      }
   }

   public void unsetDragToData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAGTODATA$38);
      }
   }

   public boolean getDragOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DRAGOFF$40);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DRAGOFF$40);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDragOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DRAGOFF$40);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DRAGOFF$40);
         }

         return var2;
      }
   }

   public boolean isSetDragOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DRAGOFF$40) != null;
      }
   }

   public void setDragOff(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DRAGOFF$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DRAGOFF$40);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDragOff(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DRAGOFF$40);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DRAGOFF$40);
         }

         var3.set(var1);
      }
   }

   public void unsetDragOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DRAGOFF$40);
      }
   }

   public boolean getShowAll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWALL$42);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWALL$42);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowAll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWALL$42);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWALL$42);
         }

         return var2;
      }
   }

   public boolean isSetShowAll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWALL$42) != null;
      }
   }

   public void setShowAll(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWALL$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWALL$42);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowAll(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWALL$42);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWALL$42);
         }

         var3.set(var1);
      }
   }

   public void unsetShowAll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWALL$42);
      }
   }

   public boolean getInsertBlankRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTBLANKROW$44);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTBLANKROW$44);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertBlankRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTBLANKROW$44);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTBLANKROW$44);
         }

         return var2;
      }
   }

   public boolean isSetInsertBlankRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTBLANKROW$44) != null;
      }
   }

   public void setInsertBlankRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTBLANKROW$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTBLANKROW$44);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertBlankRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTBLANKROW$44);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTBLANKROW$44);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertBlankRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTBLANKROW$44);
      }
   }

   public boolean getServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SERVERFIELD$46);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SERVERFIELD$46);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SERVERFIELD$46);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SERVERFIELD$46);
         }

         return var2;
      }
   }

   public boolean isSetServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SERVERFIELD$46) != null;
      }
   }

   public void setServerField(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SERVERFIELD$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SERVERFIELD$46);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetServerField(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SERVERFIELD$46);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SERVERFIELD$46);
         }

         var3.set(var1);
      }
   }

   public void unsetServerField() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SERVERFIELD$46);
      }
   }

   public boolean getInsertPageBreak() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTPAGEBREAK$48);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTPAGEBREAK$48);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertPageBreak() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTPAGEBREAK$48);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTPAGEBREAK$48);
         }

         return var2;
      }
   }

   public boolean isSetInsertPageBreak() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTPAGEBREAK$48) != null;
      }
   }

   public void setInsertPageBreak(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTPAGEBREAK$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTPAGEBREAK$48);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertPageBreak(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTPAGEBREAK$48);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTPAGEBREAK$48);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertPageBreak() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTPAGEBREAK$48);
      }
   }

   public boolean getAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOSHOW$50);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AUTOSHOW$50);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOSHOW$50);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AUTOSHOW$50);
         }

         return var2;
      }
   }

   public boolean isSetAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOSHOW$50) != null;
      }
   }

   public void setAutoShow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOSHOW$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOSHOW$50);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoShow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOSHOW$50);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOSHOW$50);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOSHOW$50);
      }
   }

   public boolean getTopAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOPAUTOSHOW$52);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TOPAUTOSHOW$52);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTopAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TOPAUTOSHOW$52);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TOPAUTOSHOW$52);
         }

         return var2;
      }
   }

   public boolean isSetTopAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOPAUTOSHOW$52) != null;
      }
   }

   public void setTopAutoShow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOPAUTOSHOW$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOPAUTOSHOW$52);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTopAutoShow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TOPAUTOSHOW$52);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TOPAUTOSHOW$52);
         }

         var3.set(var1);
      }
   }

   public void unsetTopAutoShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOPAUTOSHOW$52);
      }
   }

   public boolean getHideNewItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HIDENEWITEMS$54);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HIDENEWITEMS$54);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHideNewItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HIDENEWITEMS$54);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(HIDENEWITEMS$54);
         }

         return var2;
      }
   }

   public boolean isSetHideNewItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HIDENEWITEMS$54) != null;
      }
   }

   public void setHideNewItems(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HIDENEWITEMS$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HIDENEWITEMS$54);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHideNewItems(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HIDENEWITEMS$54);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HIDENEWITEMS$54);
         }

         var3.set(var1);
      }
   }

   public void unsetHideNewItems() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HIDENEWITEMS$54);
      }
   }

   public boolean getMeasureFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MEASUREFILTER$56);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MEASUREFILTER$56);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMeasureFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MEASUREFILTER$56);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MEASUREFILTER$56);
         }

         return var2;
      }
   }

   public boolean isSetMeasureFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MEASUREFILTER$56) != null;
      }
   }

   public void setMeasureFilter(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MEASUREFILTER$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MEASUREFILTER$56);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMeasureFilter(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MEASUREFILTER$56);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MEASUREFILTER$56);
         }

         var3.set(var1);
      }
   }

   public void unsetMeasureFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MEASUREFILTER$56);
      }
   }

   public boolean getIncludeNewItemsInFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INCLUDENEWITEMSINFILTER$58);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIncludeNewItemsInFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INCLUDENEWITEMSINFILTER$58);
         }

         return var2;
      }
   }

   public boolean isSetIncludeNewItemsInFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58) != null;
      }
   }

   public void setIncludeNewItemsInFilter(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INCLUDENEWITEMSINFILTER$58);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIncludeNewItemsInFilter(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$58);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INCLUDENEWITEMSINFILTER$58);
         }

         var3.set(var1);
      }
   }

   public void unsetIncludeNewItemsInFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INCLUDENEWITEMSINFILTER$58);
      }
   }

   public long getItemPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ITEMPAGECOUNT$60);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ITEMPAGECOUNT$60);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetItemPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ITEMPAGECOUNT$60);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ITEMPAGECOUNT$60);
         }

         return var2;
      }
   }

   public boolean isSetItemPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ITEMPAGECOUNT$60) != null;
      }
   }

   public void setItemPageCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ITEMPAGECOUNT$60);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ITEMPAGECOUNT$60);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetItemPageCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ITEMPAGECOUNT$60);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ITEMPAGECOUNT$60);
         }

         var3.set(var1);
      }
   }

   public void unsetItemPageCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ITEMPAGECOUNT$60);
      }
   }

   public STFieldSortType$Enum getSortType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SORTTYPE$62);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SORTTYPE$62);
         }

         return var2 == null?null:(STFieldSortType$Enum)var2.getEnumValue();
      }
   }

   public STFieldSortType xgetSortType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFieldSortType var2 = null;
         var2 = (STFieldSortType)this.get_store().find_attribute_user(SORTTYPE$62);
         if(var2 == null) {
            var2 = (STFieldSortType)this.get_default_attribute_value(SORTTYPE$62);
         }

         return var2;
      }
   }

   public boolean isSetSortType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SORTTYPE$62) != null;
      }
   }

   public void setSortType(STFieldSortType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SORTTYPE$62);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SORTTYPE$62);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetSortType(STFieldSortType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFieldSortType var3 = null;
         var3 = (STFieldSortType)this.get_store().find_attribute_user(SORTTYPE$62);
         if(var3 == null) {
            var3 = (STFieldSortType)this.get_store().add_attribute_user(SORTTYPE$62);
         }

         var3.set(var1);
      }
   }

   public void unsetSortType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SORTTYPE$62);
      }
   }

   public boolean getDataSourceSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATASOURCESORT$64);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDataSourceSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DATASOURCESORT$64);
         return var2;
      }
   }

   public boolean isSetDataSourceSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATASOURCESORT$64) != null;
      }
   }

   public void setDataSourceSort(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATASOURCESORT$64);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATASOURCESORT$64);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDataSourceSort(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DATASOURCESORT$64);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DATASOURCESORT$64);
         }

         var3.set(var1);
      }
   }

   public void unsetDataSourceSort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATASOURCESORT$64);
      }
   }

   public boolean getNonAutoSortDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NONAUTOSORTDEFAULT$66);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNonAutoSortDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NONAUTOSORTDEFAULT$66);
         }

         return var2;
      }
   }

   public boolean isSetNonAutoSortDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NONAUTOSORTDEFAULT$66) != null;
      }
   }

   public void setNonAutoSortDefault(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NONAUTOSORTDEFAULT$66);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNonAutoSortDefault(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NONAUTOSORTDEFAULT$66);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NONAUTOSORTDEFAULT$66);
         }

         var3.set(var1);
      }
   }

   public void unsetNonAutoSortDefault() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NONAUTOSORTDEFAULT$66);
      }
   }

   public long getRankBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RANKBY$68);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetRankBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(RANKBY$68);
         return var2;
      }
   }

   public boolean isSetRankBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RANKBY$68) != null;
      }
   }

   public void setRankBy(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(RANKBY$68);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(RANKBY$68);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetRankBy(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(RANKBY$68);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(RANKBY$68);
         }

         var3.set(var1);
      }
   }

   public void unsetRankBy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RANKBY$68);
      }
   }

   public boolean getDefaultSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DEFAULTSUBTOTAL$70);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDefaultSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DEFAULTSUBTOTAL$70);
         }

         return var2;
      }
   }

   public boolean isSetDefaultSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTSUBTOTAL$70) != null;
      }
   }

   public void setDefaultSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTSUBTOTAL$70);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDefaultSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEFAULTSUBTOTAL$70);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEFAULTSUBTOTAL$70);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTSUBTOTAL$70);
      }
   }

   public boolean getSumSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SUMSUBTOTAL$72);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SUMSUBTOTAL$72);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSumSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SUMSUBTOTAL$72);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SUMSUBTOTAL$72);
         }

         return var2;
      }
   }

   public boolean isSetSumSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SUMSUBTOTAL$72) != null;
      }
   }

   public void setSumSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SUMSUBTOTAL$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SUMSUBTOTAL$72);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSumSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SUMSUBTOTAL$72);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SUMSUBTOTAL$72);
         }

         var3.set(var1);
      }
   }

   public void unsetSumSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SUMSUBTOTAL$72);
      }
   }

   public boolean getCountASubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNTASUBTOTAL$74);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COUNTASUBTOTAL$74);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCountASubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COUNTASUBTOTAL$74);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COUNTASUBTOTAL$74);
         }

         return var2;
      }
   }

   public boolean isSetCountASubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNTASUBTOTAL$74) != null;
      }
   }

   public void setCountASubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COUNTASUBTOTAL$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COUNTASUBTOTAL$74);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCountASubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COUNTASUBTOTAL$74);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COUNTASUBTOTAL$74);
         }

         var3.set(var1);
      }
   }

   public void unsetCountASubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNTASUBTOTAL$74);
      }
   }

   public boolean getAvgSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AVGSUBTOTAL$76);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AVGSUBTOTAL$76);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAvgSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AVGSUBTOTAL$76);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AVGSUBTOTAL$76);
         }

         return var2;
      }
   }

   public boolean isSetAvgSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AVGSUBTOTAL$76) != null;
      }
   }

   public void setAvgSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AVGSUBTOTAL$76);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AVGSUBTOTAL$76);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAvgSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AVGSUBTOTAL$76);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AVGSUBTOTAL$76);
         }

         var3.set(var1);
      }
   }

   public void unsetAvgSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AVGSUBTOTAL$76);
      }
   }

   public boolean getMaxSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MAXSUBTOTAL$78);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MAXSUBTOTAL$78);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMaxSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MAXSUBTOTAL$78);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MAXSUBTOTAL$78);
         }

         return var2;
      }
   }

   public boolean isSetMaxSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MAXSUBTOTAL$78) != null;
      }
   }

   public void setMaxSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MAXSUBTOTAL$78);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MAXSUBTOTAL$78);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMaxSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MAXSUBTOTAL$78);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MAXSUBTOTAL$78);
         }

         var3.set(var1);
      }
   }

   public void unsetMaxSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MAXSUBTOTAL$78);
      }
   }

   public boolean getMinSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINSUBTOTAL$80);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MINSUBTOTAL$80);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMinSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MINSUBTOTAL$80);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MINSUBTOTAL$80);
         }

         return var2;
      }
   }

   public boolean isSetMinSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINSUBTOTAL$80) != null;
      }
   }

   public void setMinSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MINSUBTOTAL$80);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MINSUBTOTAL$80);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMinSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MINSUBTOTAL$80);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MINSUBTOTAL$80);
         }

         var3.set(var1);
      }
   }

   public void unsetMinSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINSUBTOTAL$80);
      }
   }

   public boolean getProductSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PRODUCTSUBTOTAL$82);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetProductSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PRODUCTSUBTOTAL$82);
         }

         return var2;
      }
   }

   public boolean isSetProductSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRODUCTSUBTOTAL$82) != null;
      }
   }

   public void setProductSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRODUCTSUBTOTAL$82);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetProductSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRODUCTSUBTOTAL$82);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRODUCTSUBTOTAL$82);
         }

         var3.set(var1);
      }
   }

   public void unsetProductSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRODUCTSUBTOTAL$82);
      }
   }

   public boolean getCountSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COUNTSUBTOTAL$84);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COUNTSUBTOTAL$84);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCountSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COUNTSUBTOTAL$84);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COUNTSUBTOTAL$84);
         }

         return var2;
      }
   }

   public boolean isSetCountSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COUNTSUBTOTAL$84) != null;
      }
   }

   public void setCountSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COUNTSUBTOTAL$84);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COUNTSUBTOTAL$84);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCountSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COUNTSUBTOTAL$84);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COUNTSUBTOTAL$84);
         }

         var3.set(var1);
      }
   }

   public void unsetCountSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COUNTSUBTOTAL$84);
      }
   }

   public boolean getStdDevSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STDDEVSUBTOTAL$86);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STDDEVSUBTOTAL$86);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetStdDevSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(STDDEVSUBTOTAL$86);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(STDDEVSUBTOTAL$86);
         }

         return var2;
      }
   }

   public boolean isSetStdDevSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STDDEVSUBTOTAL$86) != null;
      }
   }

   public void setStdDevSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STDDEVSUBTOTAL$86);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STDDEVSUBTOTAL$86);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetStdDevSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(STDDEVSUBTOTAL$86);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(STDDEVSUBTOTAL$86);
         }

         var3.set(var1);
      }
   }

   public void unsetStdDevSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STDDEVSUBTOTAL$86);
      }
   }

   public boolean getStdDevPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STDDEVPSUBTOTAL$88);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetStdDevPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(STDDEVPSUBTOTAL$88);
         }

         return var2;
      }
   }

   public boolean isSetStdDevPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STDDEVPSUBTOTAL$88) != null;
      }
   }

   public void setStdDevPSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STDDEVPSUBTOTAL$88);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetStdDevPSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(STDDEVPSUBTOTAL$88);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(STDDEVPSUBTOTAL$88);
         }

         var3.set(var1);
      }
   }

   public void unsetStdDevPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STDDEVPSUBTOTAL$88);
      }
   }

   public boolean getVarSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VARSUBTOTAL$90);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VARSUBTOTAL$90);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetVarSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(VARSUBTOTAL$90);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(VARSUBTOTAL$90);
         }

         return var2;
      }
   }

   public boolean isSetVarSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VARSUBTOTAL$90) != null;
      }
   }

   public void setVarSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VARSUBTOTAL$90);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VARSUBTOTAL$90);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetVarSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(VARSUBTOTAL$90);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(VARSUBTOTAL$90);
         }

         var3.set(var1);
      }
   }

   public void unsetVarSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VARSUBTOTAL$90);
      }
   }

   public boolean getVarPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VARPSUBTOTAL$92);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VARPSUBTOTAL$92);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetVarPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(VARPSUBTOTAL$92);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(VARPSUBTOTAL$92);
         }

         return var2;
      }
   }

   public boolean isSetVarPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VARPSUBTOTAL$92) != null;
      }
   }

   public void setVarPSubtotal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VARPSUBTOTAL$92);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VARPSUBTOTAL$92);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetVarPSubtotal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(VARPSUBTOTAL$92);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(VARPSUBTOTAL$92);
         }

         var3.set(var1);
      }
   }

   public void unsetVarPSubtotal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VARPSUBTOTAL$92);
      }
   }

   public boolean getShowPropCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWPROPCELL$94);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWPROPCELL$94);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowPropCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPROPCELL$94);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWPROPCELL$94);
         }

         return var2;
      }
   }

   public boolean isSetShowPropCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWPROPCELL$94) != null;
      }
   }

   public void setShowPropCell(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWPROPCELL$94);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWPROPCELL$94);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowPropCell(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPROPCELL$94);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWPROPCELL$94);
         }

         var3.set(var1);
      }
   }

   public void unsetShowPropCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWPROPCELL$94);
      }
   }

   public boolean getShowPropTip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWPROPTIP$96);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWPROPTIP$96);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowPropTip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPROPTIP$96);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWPROPTIP$96);
         }

         return var2;
      }
   }

   public boolean isSetShowPropTip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWPROPTIP$96) != null;
      }
   }

   public void setShowPropTip(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWPROPTIP$96);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWPROPTIP$96);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowPropTip(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPROPTIP$96);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWPROPTIP$96);
         }

         var3.set(var1);
      }
   }

   public void unsetShowPropTip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWPROPTIP$96);
      }
   }

   public boolean getShowPropAsCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWPROPASCAPTION$98);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWPROPASCAPTION$98);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowPropAsCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPROPASCAPTION$98);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWPROPASCAPTION$98);
         }

         return var2;
      }
   }

   public boolean isSetShowPropAsCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWPROPASCAPTION$98) != null;
      }
   }

   public void setShowPropAsCaption(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWPROPASCAPTION$98);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWPROPASCAPTION$98);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowPropAsCaption(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWPROPASCAPTION$98);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWPROPASCAPTION$98);
         }

         var3.set(var1);
      }
   }

   public void unsetShowPropAsCaption() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWPROPASCAPTION$98);
      }
   }

   public boolean getDefaultAttributeDrillState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DEFAULTATTRIBUTEDRILLSTATE$100);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDefaultAttributeDrillState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DEFAULTATTRIBUTEDRILLSTATE$100);
         }

         return var2;
      }
   }

   public boolean isSetDefaultAttributeDrillState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100) != null;
      }
   }

   public void setDefaultAttributeDrillState(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDefaultAttributeDrillState(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEFAULTATTRIBUTEDRILLSTATE$100);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultAttributeDrillState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTATTRIBUTEDRILLSTATE$100);
      }
   }

}
