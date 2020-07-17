package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSortState;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTableType$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTTableImpl extends XmlComplexContentImpl implements CTTable {

   private static final QName AUTOFILTER$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "autoFilter");
   private static final QName SORTSTATE$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "sortState");
   private static final QName TABLECOLUMNS$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableColumns");
   private static final QName TABLESTYLEINFO$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tableStyleInfo");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName ID$10 = new QName("", "id");
   private static final QName NAME$12 = new QName("", "name");
   private static final QName DISPLAYNAME$14 = new QName("", "displayName");
   private static final QName COMMENT$16 = new QName("", "comment");
   private static final QName REF$18 = new QName("", "ref");
   private static final QName TABLETYPE$20 = new QName("", "tableType");
   private static final QName HEADERROWCOUNT$22 = new QName("", "headerRowCount");
   private static final QName INSERTROW$24 = new QName("", "insertRow");
   private static final QName INSERTROWSHIFT$26 = new QName("", "insertRowShift");
   private static final QName TOTALSROWCOUNT$28 = new QName("", "totalsRowCount");
   private static final QName TOTALSROWSHOWN$30 = new QName("", "totalsRowShown");
   private static final QName PUBLISHED$32 = new QName("", "published");
   private static final QName HEADERROWDXFID$34 = new QName("", "headerRowDxfId");
   private static final QName DATADXFID$36 = new QName("", "dataDxfId");
   private static final QName TOTALSROWDXFID$38 = new QName("", "totalsRowDxfId");
   private static final QName HEADERROWBORDERDXFID$40 = new QName("", "headerRowBorderDxfId");
   private static final QName TABLEBORDERDXFID$42 = new QName("", "tableBorderDxfId");
   private static final QName TOTALSROWBORDERDXFID$44 = new QName("", "totalsRowBorderDxfId");
   private static final QName HEADERROWCELLSTYLE$46 = new QName("", "headerRowCellStyle");
   private static final QName DATACELLSTYLE$48 = new QName("", "dataCellStyle");
   private static final QName TOTALSROWCELLSTYLE$50 = new QName("", "totalsRowCellStyle");
   private static final QName CONNECTIONID$52 = new QName("", "connectionId");


   public CTTableImpl(SchemaType var1) {
      super(var1);
   }

   public CTAutoFilter getAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoFilter var2 = null;
         var2 = (CTAutoFilter)this.get_store().find_element_user(AUTOFILTER$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOFILTER$0) != 0;
      }
   }

   public void setAutoFilter(CTAutoFilter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoFilter var3 = null;
         var3 = (CTAutoFilter)this.get_store().find_element_user(AUTOFILTER$0, 0);
         if(var3 == null) {
            var3 = (CTAutoFilter)this.get_store().add_element_user(AUTOFILTER$0);
         }

         var3.set(var1);
      }
   }

   public CTAutoFilter addNewAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAutoFilter var2 = null;
         var2 = (CTAutoFilter)this.get_store().add_element_user(AUTOFILTER$0);
         return var2;
      }
   }

   public void unsetAutoFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOFILTER$0, 0);
      }
   }

   public CTSortState getSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var2 = null;
         var2 = (CTSortState)this.get_store().find_element_user(SORTSTATE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SORTSTATE$2) != 0;
      }
   }

   public void setSortState(CTSortState var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var3 = null;
         var3 = (CTSortState)this.get_store().find_element_user(SORTSTATE$2, 0);
         if(var3 == null) {
            var3 = (CTSortState)this.get_store().add_element_user(SORTSTATE$2);
         }

         var3.set(var1);
      }
   }

   public CTSortState addNewSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSortState var2 = null;
         var2 = (CTSortState)this.get_store().add_element_user(SORTSTATE$2);
         return var2;
      }
   }

   public void unsetSortState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SORTSTATE$2, 0);
      }
   }

   public CTTableColumns getTableColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumns var2 = null;
         var2 = (CTTableColumns)this.get_store().find_element_user(TABLECOLUMNS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public void setTableColumns(CTTableColumns var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumns var3 = null;
         var3 = (CTTableColumns)this.get_store().find_element_user(TABLECOLUMNS$4, 0);
         if(var3 == null) {
            var3 = (CTTableColumns)this.get_store().add_element_user(TABLECOLUMNS$4);
         }

         var3.set(var1);
      }
   }

   public CTTableColumns addNewTableColumns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableColumns var2 = null;
         var2 = (CTTableColumns)this.get_store().add_element_user(TABLECOLUMNS$4);
         return var2;
      }
   }

   public CTTableStyleInfo getTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleInfo var2 = null;
         var2 = (CTTableStyleInfo)this.get_store().find_element_user(TABLESTYLEINFO$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLESTYLEINFO$6) != 0;
      }
   }

   public void setTableStyleInfo(CTTableStyleInfo var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleInfo var3 = null;
         var3 = (CTTableStyleInfo)this.get_store().find_element_user(TABLESTYLEINFO$6, 0);
         if(var3 == null) {
            var3 = (CTTableStyleInfo)this.get_store().add_element_user(TABLESTYLEINFO$6);
         }

         var3.set(var1);
      }
   }

   public CTTableStyleInfo addNewTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableStyleInfo var2 = null;
         var2 = (CTTableStyleInfo)this.get_store().add_element_user(TABLESTYLEINFO$6);
         return var2;
      }
   }

   public void unsetTableStyleInfo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLESTYLEINFO$6, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$8);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$8, 0);
      }
   }

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$10);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$10);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$10);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$10);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$10);
         }

         var3.set(var1);
      }
   }

   public String getName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NAME$12);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(NAME$12);
         return var2;
      }
   }

   public boolean isSetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NAME$12) != null;
      }
   }

   public void setName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NAME$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NAME$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(NAME$12);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(NAME$12);
         }

         var3.set(var1);
      }
   }

   public void unsetName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NAME$12);
      }
   }

   public String getDisplayName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DISPLAYNAME$14);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetDisplayName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(DISPLAYNAME$14);
         return var2;
      }
   }

   public void setDisplayName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DISPLAYNAME$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DISPLAYNAME$14);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDisplayName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(DISPLAYNAME$14);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(DISPLAYNAME$14);
         }

         var3.set(var1);
      }
   }

   public String getComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMMENT$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(COMMENT$16);
         return var2;
      }
   }

   public boolean isSetComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMMENT$16) != null;
      }
   }

   public void setComment(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMMENT$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMMENT$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetComment(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(COMMENT$16);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(COMMENT$16);
         }

         var3.set(var1);
      }
   }

   public void unsetComment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMMENT$16);
      }
   }

   public String getRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REF$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(REF$18);
         return var2;
      }
   }

   public void setRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REF$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REF$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(REF$18);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(REF$18);
         }

         var3.set(var1);
      }
   }

   public STTableType$Enum getTableType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TABLETYPE$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TABLETYPE$20);
         }

         return var2 == null?null:(STTableType$Enum)var2.getEnumValue();
      }
   }

   public STTableType xgetTableType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTableType var2 = null;
         var2 = (STTableType)this.get_store().find_attribute_user(TABLETYPE$20);
         if(var2 == null) {
            var2 = (STTableType)this.get_default_attribute_value(TABLETYPE$20);
         }

         return var2;
      }
   }

   public boolean isSetTableType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TABLETYPE$20) != null;
      }
   }

   public void setTableType(STTableType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TABLETYPE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TABLETYPE$20);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTableType(STTableType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTableType var3 = null;
         var3 = (STTableType)this.get_store().find_attribute_user(TABLETYPE$20);
         if(var3 == null) {
            var3 = (STTableType)this.get_store().add_attribute_user(TABLETYPE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetTableType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TABLETYPE$20);
      }
   }

   public long getHeaderRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWCOUNT$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HEADERROWCOUNT$22);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetHeaderRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(HEADERROWCOUNT$22);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(HEADERROWCOUNT$22);
         }

         return var2;
      }
   }

   public boolean isSetHeaderRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADERROWCOUNT$22) != null;
      }
   }

   public void setHeaderRowCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWCOUNT$22);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HEADERROWCOUNT$22);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetHeaderRowCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(HEADERROWCOUNT$22);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(HEADERROWCOUNT$22);
         }

         var3.set(var1);
      }
   }

   public void unsetHeaderRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADERROWCOUNT$22);
      }
   }

   public boolean getInsertRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTROW$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTROW$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTROW$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTROW$24);
         }

         return var2;
      }
   }

   public boolean isSetInsertRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTROW$24) != null;
      }
   }

   public void setInsertRow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTROW$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTROW$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertRow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTROW$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTROW$24);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertRow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTROW$24);
      }
   }

   public boolean getInsertRowShift() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSERTROWSHIFT$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSERTROWSHIFT$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetInsertRowShift() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(INSERTROWSHIFT$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(INSERTROWSHIFT$26);
         }

         return var2;
      }
   }

   public boolean isSetInsertRowShift() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSERTROWSHIFT$26) != null;
      }
   }

   public void setInsertRowShift(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSERTROWSHIFT$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSERTROWSHIFT$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetInsertRowShift(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(INSERTROWSHIFT$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(INSERTROWSHIFT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetInsertRowShift() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSERTROWSHIFT$26);
      }
   }

   public long getTotalsRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWCOUNT$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TOTALSROWCOUNT$28);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetTotalsRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(TOTALSROWCOUNT$28);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(TOTALSROWCOUNT$28);
         }

         return var2;
      }
   }

   public boolean isSetTotalsRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWCOUNT$28) != null;
      }
   }

   public void setTotalsRowCount(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWCOUNT$28);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWCOUNT$28);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTotalsRowCount(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(TOTALSROWCOUNT$28);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(TOTALSROWCOUNT$28);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWCOUNT$28);
      }
   }

   public boolean getTotalsRowShown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWSHOWN$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TOTALSROWSHOWN$30);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTotalsRowShown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TOTALSROWSHOWN$30);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TOTALSROWSHOWN$30);
         }

         return var2;
      }
   }

   public boolean isSetTotalsRowShown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWSHOWN$30) != null;
      }
   }

   public void setTotalsRowShown(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWSHOWN$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWSHOWN$30);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTotalsRowShown(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TOTALSROWSHOWN$30);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TOTALSROWSHOWN$30);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowShown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWSHOWN$30);
      }
   }

   public boolean getPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHED$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PUBLISHED$32);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHED$32);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PUBLISHED$32);
         }

         return var2;
      }
   }

   public boolean isSetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PUBLISHED$32) != null;
      }
   }

   public void setPublished(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHED$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PUBLISHED$32);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPublished(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHED$32);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PUBLISHED$32);
         }

         var3.set(var1);
      }
   }

   public void unsetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PUBLISHED$32);
      }
   }

   public long getHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWDXFID$34);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(HEADERROWDXFID$34);
         return var2;
      }
   }

   public boolean isSetHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADERROWDXFID$34) != null;
      }
   }

   public void setHeaderRowDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWDXFID$34);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HEADERROWDXFID$34);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetHeaderRowDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(HEADERROWDXFID$34);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(HEADERROWDXFID$34);
         }

         var3.set(var1);
      }
   }

   public void unsetHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADERROWDXFID$34);
      }
   }

   public long getDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATADXFID$36);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(DATADXFID$36);
         return var2;
      }
   }

   public boolean isSetDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATADXFID$36) != null;
      }
   }

   public void setDataDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DATADXFID$36);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DATADXFID$36);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDataDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(DATADXFID$36);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(DATADXFID$36);
         }

         var3.set(var1);
      }
   }

   public void unsetDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATADXFID$36);
      }
   }

   public long getTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWDXFID$38);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(TOTALSROWDXFID$38);
         return var2;
      }
   }

   public boolean isSetTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWDXFID$38) != null;
      }
   }

   public void setTotalsRowDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWDXFID$38);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWDXFID$38);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTotalsRowDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(TOTALSROWDXFID$38);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(TOTALSROWDXFID$38);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWDXFID$38);
      }
   }

   public long getHeaderRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetHeaderRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
         return var2;
      }
   }

   public boolean isSetHeaderRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADERROWBORDERDXFID$40) != null;
      }
   }

   public void setHeaderRowBorderDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HEADERROWBORDERDXFID$40);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetHeaderRowBorderDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(HEADERROWBORDERDXFID$40);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(HEADERROWBORDERDXFID$40);
         }

         var3.set(var1);
      }
   }

   public void unsetHeaderRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADERROWBORDERDXFID$40);
      }
   }

   public long getTableBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TABLEBORDERDXFID$42);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetTableBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(TABLEBORDERDXFID$42);
         return var2;
      }
   }

   public boolean isSetTableBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TABLEBORDERDXFID$42) != null;
      }
   }

   public void setTableBorderDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TABLEBORDERDXFID$42);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TABLEBORDERDXFID$42);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTableBorderDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(TABLEBORDERDXFID$42);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(TABLEBORDERDXFID$42);
         }

         var3.set(var1);
      }
   }

   public void unsetTableBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TABLEBORDERDXFID$42);
      }
   }

   public long getTotalsRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetTotalsRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
         return var2;
      }
   }

   public boolean isSetTotalsRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWBORDERDXFID$44) != null;
      }
   }

   public void setTotalsRowBorderDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWBORDERDXFID$44);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTotalsRowBorderDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(TOTALSROWBORDERDXFID$44);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(TOTALSROWBORDERDXFID$44);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowBorderDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWBORDERDXFID$44);
      }
   }

   public String getHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
         return var2;
      }
   }

   public boolean isSetHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADERROWCELLSTYLE$46) != null;
      }
   }

   public void setHeaderRowCellStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HEADERROWCELLSTYLE$46);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHeaderRowCellStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$46);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(HEADERROWCELLSTYLE$46);
         }

         var3.set(var1);
      }
   }

   public void unsetHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADERROWCELLSTYLE$46);
      }
   }

   public String getDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATACELLSTYLE$48);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(DATACELLSTYLE$48);
         return var2;
      }
   }

   public boolean isSetDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATACELLSTYLE$48) != null;
      }
   }

   public void setDataCellStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATACELLSTYLE$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATACELLSTYLE$48);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDataCellStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(DATACELLSTYLE$48);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(DATACELLSTYLE$48);
         }

         var3.set(var1);
      }
   }

   public void unsetDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATACELLSTYLE$48);
      }
   }

   public String getTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
         return var2;
      }
   }

   public boolean isSetTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$50) != null;
      }
   }

   public void setTotalsRowCellStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWCELLSTYLE$50);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTotalsRowCellStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$50);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(TOTALSROWCELLSTYLE$50);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWCELLSTYLE$50);
      }
   }

   public long getConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTIONID$52);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONNECTIONID$52);
         return var2;
      }
   }

   public boolean isSetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONNECTIONID$52) != null;
      }
   }

   public void setConnectionId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(CONNECTIONID$52);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(CONNECTIONID$52);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetConnectionId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(CONNECTIONID$52);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(CONNECTIONID$52);
         }

         var3.set(var1);
      }
   }

   public void unsetConnectionId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONNECTIONID$52);
      }
   }

}
