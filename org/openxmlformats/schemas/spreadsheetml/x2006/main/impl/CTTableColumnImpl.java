package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXmlColumnPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTTableColumnImpl extends XmlComplexContentImpl implements CTTableColumn {

   private static final QName CALCULATEDCOLUMNFORMULA$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "calculatedColumnFormula");
   private static final QName TOTALSROWFORMULA$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "totalsRowFormula");
   private static final QName XMLCOLUMNPR$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "xmlColumnPr");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName ID$8 = new QName("", "id");
   private static final QName UNIQUENAME$10 = new QName("", "uniqueName");
   private static final QName NAME$12 = new QName("", "name");
   private static final QName TOTALSROWFUNCTION$14 = new QName("", "totalsRowFunction");
   private static final QName TOTALSROWLABEL$16 = new QName("", "totalsRowLabel");
   private static final QName QUERYTABLEFIELDID$18 = new QName("", "queryTableFieldId");
   private static final QName HEADERROWDXFID$20 = new QName("", "headerRowDxfId");
   private static final QName DATADXFID$22 = new QName("", "dataDxfId");
   private static final QName TOTALSROWDXFID$24 = new QName("", "totalsRowDxfId");
   private static final QName HEADERROWCELLSTYLE$26 = new QName("", "headerRowCellStyle");
   private static final QName DATACELLSTYLE$28 = new QName("", "dataCellStyle");
   private static final QName TOTALSROWCELLSTYLE$30 = new QName("", "totalsRowCellStyle");


   public CTTableColumnImpl(SchemaType var1) {
      super(var1);
   }

   public CTTableFormula getCalculatedColumnFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableFormula var2 = null;
         var2 = (CTTableFormula)this.get_store().find_element_user(CALCULATEDCOLUMNFORMULA$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCalculatedColumnFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CALCULATEDCOLUMNFORMULA$0) != 0;
      }
   }

   public void setCalculatedColumnFormula(CTTableFormula var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableFormula var3 = null;
         var3 = (CTTableFormula)this.get_store().find_element_user(CALCULATEDCOLUMNFORMULA$0, 0);
         if(var3 == null) {
            var3 = (CTTableFormula)this.get_store().add_element_user(CALCULATEDCOLUMNFORMULA$0);
         }

         var3.set(var1);
      }
   }

   public CTTableFormula addNewCalculatedColumnFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableFormula var2 = null;
         var2 = (CTTableFormula)this.get_store().add_element_user(CALCULATEDCOLUMNFORMULA$0);
         return var2;
      }
   }

   public void unsetCalculatedColumnFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CALCULATEDCOLUMNFORMULA$0, 0);
      }
   }

   public CTTableFormula getTotalsRowFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableFormula var2 = null;
         var2 = (CTTableFormula)this.get_store().find_element_user(TOTALSROWFORMULA$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTotalsRowFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOTALSROWFORMULA$2) != 0;
      }
   }

   public void setTotalsRowFormula(CTTableFormula var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableFormula var3 = null;
         var3 = (CTTableFormula)this.get_store().find_element_user(TOTALSROWFORMULA$2, 0);
         if(var3 == null) {
            var3 = (CTTableFormula)this.get_store().add_element_user(TOTALSROWFORMULA$2);
         }

         var3.set(var1);
      }
   }

   public CTTableFormula addNewTotalsRowFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTableFormula var2 = null;
         var2 = (CTTableFormula)this.get_store().add_element_user(TOTALSROWFORMULA$2);
         return var2;
      }
   }

   public void unsetTotalsRowFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOTALSROWFORMULA$2, 0);
      }
   }

   public CTXmlColumnPr getXmlColumnPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlColumnPr var2 = null;
         var2 = (CTXmlColumnPr)this.get_store().find_element_user(XMLCOLUMNPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetXmlColumnPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(XMLCOLUMNPR$4) != 0;
      }
   }

   public void setXmlColumnPr(CTXmlColumnPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlColumnPr var3 = null;
         var3 = (CTXmlColumnPr)this.get_store().find_element_user(XMLCOLUMNPR$4, 0);
         if(var3 == null) {
            var3 = (CTXmlColumnPr)this.get_store().add_element_user(XMLCOLUMNPR$4);
         }

         var3.set(var1);
      }
   }

   public CTXmlColumnPr addNewXmlColumnPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTXmlColumnPr var2 = null;
         var2 = (CTXmlColumnPr)this.get_store().add_element_user(XMLCOLUMNPR$4);
         return var2;
      }
   }

   public void unsetXmlColumnPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(XMLCOLUMNPR$4, 0);
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

   public long getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$8);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$8);
         return var2;
      }
   }

   public void setId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ID$8);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ID$8);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ID$8);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ID$8);
         }

         var3.set(var1);
      }
   }

   public String getUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNIQUENAME$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(UNIQUENAME$10);
         return var2;
      }
   }

   public boolean isSetUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNIQUENAME$10) != null;
      }
   }

   public void setUniqueName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNIQUENAME$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNIQUENAME$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetUniqueName(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(UNIQUENAME$10);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(UNIQUENAME$10);
         }

         var3.set(var1);
      }
   }

   public void unsetUniqueName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNIQUENAME$10);
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

   public STTotalsRowFunction$Enum getTotalsRowFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWFUNCTION$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TOTALSROWFUNCTION$14);
         }

         return var2 == null?null:(STTotalsRowFunction$Enum)var2.getEnumValue();
      }
   }

   public STTotalsRowFunction xgetTotalsRowFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTotalsRowFunction var2 = null;
         var2 = (STTotalsRowFunction)this.get_store().find_attribute_user(TOTALSROWFUNCTION$14);
         if(var2 == null) {
            var2 = (STTotalsRowFunction)this.get_default_attribute_value(TOTALSROWFUNCTION$14);
         }

         return var2;
      }
   }

   public boolean isSetTotalsRowFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWFUNCTION$14) != null;
      }
   }

   public void setTotalsRowFunction(STTotalsRowFunction$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWFUNCTION$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWFUNCTION$14);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTotalsRowFunction(STTotalsRowFunction var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTotalsRowFunction var3 = null;
         var3 = (STTotalsRowFunction)this.get_store().find_attribute_user(TOTALSROWFUNCTION$14);
         if(var3 == null) {
            var3 = (STTotalsRowFunction)this.get_store().add_attribute_user(TOTALSROWFUNCTION$14);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowFunction() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWFUNCTION$14);
      }
   }

   public String getTotalsRowLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWLABEL$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetTotalsRowLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(TOTALSROWLABEL$16);
         return var2;
      }
   }

   public boolean isSetTotalsRowLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWLABEL$16) != null;
      }
   }

   public void setTotalsRowLabel(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWLABEL$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWLABEL$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTotalsRowLabel(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(TOTALSROWLABEL$16);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(TOTALSROWLABEL$16);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowLabel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWLABEL$16);
      }
   }

   public long getQueryTableFieldId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(QUERYTABLEFIELDID$18);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetQueryTableFieldId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(QUERYTABLEFIELDID$18);
         return var2;
      }
   }

   public boolean isSetQueryTableFieldId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(QUERYTABLEFIELDID$18) != null;
      }
   }

   public void setQueryTableFieldId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(QUERYTABLEFIELDID$18);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(QUERYTABLEFIELDID$18);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetQueryTableFieldId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(QUERYTABLEFIELDID$18);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(QUERYTABLEFIELDID$18);
         }

         var3.set(var1);
      }
   }

   public void unsetQueryTableFieldId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(QUERYTABLEFIELDID$18);
      }
   }

   public long getHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWDXFID$20);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(HEADERROWDXFID$20);
         return var2;
      }
   }

   public boolean isSetHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADERROWDXFID$20) != null;
      }
   }

   public void setHeaderRowDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWDXFID$20);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(HEADERROWDXFID$20);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetHeaderRowDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(HEADERROWDXFID$20);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(HEADERROWDXFID$20);
         }

         var3.set(var1);
      }
   }

   public void unsetHeaderRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADERROWDXFID$20);
      }
   }

   public long getDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATADXFID$22);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(DATADXFID$22);
         return var2;
      }
   }

   public boolean isSetDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATADXFID$22) != null;
      }
   }

   public void setDataDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DATADXFID$22);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DATADXFID$22);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDataDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(DATADXFID$22);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(DATADXFID$22);
         }

         var3.set(var1);
      }
   }

   public void unsetDataDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATADXFID$22);
      }
   }

   public long getTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWDXFID$24);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(TOTALSROWDXFID$24);
         return var2;
      }
   }

   public boolean isSetTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWDXFID$24) != null;
      }
   }

   public void setTotalsRowDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWDXFID$24);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWDXFID$24);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTotalsRowDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(TOTALSROWDXFID$24);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(TOTALSROWDXFID$24);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWDXFID$24);
      }
   }

   public String getHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
         return var2;
      }
   }

   public boolean isSetHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HEADERROWCELLSTYLE$26) != null;
      }
   }

   public void setHeaderRowCellStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HEADERROWCELLSTYLE$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHeaderRowCellStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(HEADERROWCELLSTYLE$26);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(HEADERROWCELLSTYLE$26);
         }

         var3.set(var1);
      }
   }

   public void unsetHeaderRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HEADERROWCELLSTYLE$26);
      }
   }

   public String getDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DATACELLSTYLE$28);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(DATACELLSTYLE$28);
         return var2;
      }
   }

   public boolean isSetDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DATACELLSTYLE$28) != null;
      }
   }

   public void setDataCellStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DATACELLSTYLE$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DATACELLSTYLE$28);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDataCellStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(DATACELLSTYLE$28);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(DATACELLSTYLE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetDataCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DATACELLSTYLE$28);
      }
   }

   public String getTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
         return var2;
      }
   }

   public boolean isSetTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$30) != null;
      }
   }

   public void setTotalsRowCellStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOTALSROWCELLSTYLE$30);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTotalsRowCellStyle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(TOTALSROWCELLSTYLE$30);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(TOTALSROWCELLSTYLE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetTotalsRowCellStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOTALSROWCELLSTYLE$30);
      }
   }

}
