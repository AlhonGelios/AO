package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColorScale;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataBar;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIconSet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCfType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STConditionalFormattingOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTimePeriod$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTCfRuleImpl.1FormulaList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTCfRuleImpl.2FormulaList;

public class CTCfRuleImpl extends XmlComplexContentImpl implements CTCfRule {

   private static final QName FORMULA$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula");
   private static final QName COLORSCALE$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "colorScale");
   private static final QName DATABAR$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dataBar");
   private static final QName ICONSET$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "iconSet");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName TYPE$10 = new QName("", "type");
   private static final QName DXFID$12 = new QName("", "dxfId");
   private static final QName PRIORITY$14 = new QName("", "priority");
   private static final QName STOPIFTRUE$16 = new QName("", "stopIfTrue");
   private static final QName ABOVEAVERAGE$18 = new QName("", "aboveAverage");
   private static final QName PERCENT$20 = new QName("", "percent");
   private static final QName BOTTOM$22 = new QName("", "bottom");
   private static final QName OPERATOR$24 = new QName("", "operator");
   private static final QName TEXT$26 = new QName("", "text");
   private static final QName TIMEPERIOD$28 = new QName("", "timePeriod");
   private static final QName RANK$30 = new QName("", "rank");
   private static final QName STDDEV$32 = new QName("", "stdDev");
   private static final QName EQUALAVERAGE$34 = new QName("", "equalAverage");


   public CTCfRuleImpl(SchemaType var1) {
      super(var1);
   }

   public List getFormulaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FormulaList(this);
      }
   }

   public String[] getFormulaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FORMULA$0, var2);
         String[] var3 = new String[var2.size()];
         int var4 = 0;

         for(int var5 = var2.size(); var4 < var5; ++var4) {
            var3[var4] = ((SimpleValue)var2.get(var4)).getStringValue();
         }

         return var3;
      }
   }

   public String getFormulaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FORMULA$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.getStringValue();
         }
      }
   }

   public List xgetFormulaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 2FormulaList(this);
      }
   }

   public STFormula[] xgetFormulaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FORMULA$0, var2);
         STFormula[] var3 = new STFormula[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public STFormula xgetFormulaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var3 = null;
         var3 = (STFormula)this.get_store().find_element_user(FORMULA$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFormulaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMULA$0);
      }
   }

   public void setFormulaArray(String[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FORMULA$0);
      }
   }

   public void setFormulaArray(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_element_user(FORMULA$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.setStringValue(var2);
         }
      }
   }

   public void xsetFormulaArray(STFormula[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FORMULA$0);
      }
   }

   public void xsetFormulaArray(int var1, STFormula var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var4 = null;
         var4 = (STFormula)this.get_store().find_element_user(FORMULA$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public void insertFormula(int var1, String var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = (SimpleValue)this.get_store().insert_element_user(FORMULA$0, var1);
         var4.setStringValue(var2);
      }
   }

   public void addFormula(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().add_element_user(FORMULA$0);
         var3.setStringValue(var1);
      }
   }

   public STFormula insertNewFormula(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var3 = null;
         var3 = (STFormula)this.get_store().insert_element_user(FORMULA$0, var1);
         return var3;
      }
   }

   public STFormula addNewFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var2 = null;
         var2 = (STFormula)this.get_store().add_element_user(FORMULA$0);
         return var2;
      }
   }

   public void removeFormula(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMULA$0, var1);
      }
   }

   public CTColorScale getColorScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorScale var2 = null;
         var2 = (CTColorScale)this.get_store().find_element_user(COLORSCALE$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColorScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLORSCALE$2) != 0;
      }
   }

   public void setColorScale(CTColorScale var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorScale var3 = null;
         var3 = (CTColorScale)this.get_store().find_element_user(COLORSCALE$2, 0);
         if(var3 == null) {
            var3 = (CTColorScale)this.get_store().add_element_user(COLORSCALE$2);
         }

         var3.set(var1);
      }
   }

   public CTColorScale addNewColorScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorScale var2 = null;
         var2 = (CTColorScale)this.get_store().add_element_user(COLORSCALE$2);
         return var2;
      }
   }

   public void unsetColorScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLORSCALE$2, 0);
      }
   }

   public CTDataBar getDataBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBar var2 = null;
         var2 = (CTDataBar)this.get_store().find_element_user(DATABAR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDataBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATABAR$4) != 0;
      }
   }

   public void setDataBar(CTDataBar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBar var3 = null;
         var3 = (CTDataBar)this.get_store().find_element_user(DATABAR$4, 0);
         if(var3 == null) {
            var3 = (CTDataBar)this.get_store().add_element_user(DATABAR$4);
         }

         var3.set(var1);
      }
   }

   public CTDataBar addNewDataBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBar var2 = null;
         var2 = (CTDataBar)this.get_store().add_element_user(DATABAR$4);
         return var2;
      }
   }

   public void unsetDataBar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATABAR$4, 0);
      }
   }

   public CTIconSet getIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIconSet var2 = null;
         var2 = (CTIconSet)this.get_store().find_element_user(ICONSET$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ICONSET$6) != 0;
      }
   }

   public void setIconSet(CTIconSet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIconSet var3 = null;
         var3 = (CTIconSet)this.get_store().find_element_user(ICONSET$6, 0);
         if(var3 == null) {
            var3 = (CTIconSet)this.get_store().add_element_user(ICONSET$6);
         }

         var3.set(var1);
      }
   }

   public CTIconSet addNewIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTIconSet var2 = null;
         var2 = (CTIconSet)this.get_store().add_element_user(ICONSET$6);
         return var2;
      }
   }

   public void unsetIconSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ICONSET$6, 0);
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

   public STCfType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$10);
         return var2 == null?null:(STCfType.Enum)var2.getEnumValue();
      }
   }

   public STCfType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCfType var2 = null;
         var2 = (STCfType)this.get_store().find_attribute_user(TYPE$10);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$10) != null;
      }
   }

   public void setType(STCfType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STCfType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCfType var3 = null;
         var3 = (STCfType)this.get_store().find_attribute_user(TYPE$10);
         if(var3 == null) {
            var3 = (STCfType)this.get_store().add_attribute_user(TYPE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$10);
      }
   }

   public long getDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DXFID$12);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STDxfId xgetDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var2 = null;
         var2 = (STDxfId)this.get_store().find_attribute_user(DXFID$12);
         return var2;
      }
   }

   public boolean isSetDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DXFID$12) != null;
      }
   }

   public void setDxfId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DXFID$12);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DXFID$12);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDxfId(STDxfId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDxfId var3 = null;
         var3 = (STDxfId)this.get_store().find_attribute_user(DXFID$12);
         if(var3 == null) {
            var3 = (STDxfId)this.get_store().add_attribute_user(DXFID$12);
         }

         var3.set(var1);
      }
   }

   public void unsetDxfId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DXFID$12);
      }
   }

   public int getPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRIORITY$14);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetPriority() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(PRIORITY$14);
         return var2;
      }
   }

   public void setPriority(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRIORITY$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRIORITY$14);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetPriority(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(PRIORITY$14);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(PRIORITY$14);
         }

         var3.set(var1);
      }
   }

   public boolean getStopIfTrue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STOPIFTRUE$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STOPIFTRUE$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetStopIfTrue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(STOPIFTRUE$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(STOPIFTRUE$16);
         }

         return var2;
      }
   }

   public boolean isSetStopIfTrue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STOPIFTRUE$16) != null;
      }
   }

   public void setStopIfTrue(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STOPIFTRUE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STOPIFTRUE$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetStopIfTrue(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(STOPIFTRUE$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(STOPIFTRUE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetStopIfTrue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STOPIFTRUE$16);
      }
   }

   public boolean getAboveAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ABOVEAVERAGE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ABOVEAVERAGE$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAboveAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ABOVEAVERAGE$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ABOVEAVERAGE$18);
         }

         return var2;
      }
   }

   public boolean isSetAboveAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ABOVEAVERAGE$18) != null;
      }
   }

   public void setAboveAverage(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ABOVEAVERAGE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ABOVEAVERAGE$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAboveAverage(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ABOVEAVERAGE$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ABOVEAVERAGE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetAboveAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ABOVEAVERAGE$18);
      }
   }

   public boolean getPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PERCENT$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PERCENT$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PERCENT$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PERCENT$20);
         }

         return var2;
      }
   }

   public boolean isSetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PERCENT$20) != null;
      }
   }

   public void setPercent(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PERCENT$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PERCENT$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPercent(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PERCENT$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PERCENT$20);
         }

         var3.set(var1);
      }
   }

   public void unsetPercent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PERCENT$20);
      }
   }

   public boolean getBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BOTTOM$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BOTTOM$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(BOTTOM$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(BOTTOM$22);
         }

         return var2;
      }
   }

   public boolean isSetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BOTTOM$22) != null;
      }
   }

   public void setBottom(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BOTTOM$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BOTTOM$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetBottom(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(BOTTOM$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(BOTTOM$22);
         }

         var3.set(var1);
      }
   }

   public void unsetBottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BOTTOM$22);
      }
   }

   public STConditionalFormattingOperator.Enum getOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPERATOR$24);
         return var2 == null?null:(STConditionalFormattingOperator.Enum)var2.getEnumValue();
      }
   }

   public STConditionalFormattingOperator xgetOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STConditionalFormattingOperator var2 = null;
         var2 = (STConditionalFormattingOperator)this.get_store().find_attribute_user(OPERATOR$24);
         return var2;
      }
   }

   public boolean isSetOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPERATOR$24) != null;
      }
   }

   public void setOperator(STConditionalFormattingOperator.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPERATOR$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPERATOR$24);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOperator(STConditionalFormattingOperator var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STConditionalFormattingOperator var3 = null;
         var3 = (STConditionalFormattingOperator)this.get_store().find_attribute_user(OPERATOR$24);
         if(var3 == null) {
            var3 = (STConditionalFormattingOperator)this.get_store().add_attribute_user(OPERATOR$24);
         }

         var3.set(var1);
      }
   }

   public void unsetOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPERATOR$24);
      }
   }

   public String getText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TEXT$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TEXT$26);
         return var2;
      }
   }

   public boolean isSetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TEXT$26) != null;
      }
   }

   public void setText(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TEXT$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TEXT$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetText(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TEXT$26);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TEXT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TEXT$26);
      }
   }

   public STTimePeriod$Enum getTimePeriod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TIMEPERIOD$28);
         return var2 == null?null:(STTimePeriod$Enum)var2.getEnumValue();
      }
   }

   public STTimePeriod xgetTimePeriod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTimePeriod var2 = null;
         var2 = (STTimePeriod)this.get_store().find_attribute_user(TIMEPERIOD$28);
         return var2;
      }
   }

   public boolean isSetTimePeriod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TIMEPERIOD$28) != null;
      }
   }

   public void setTimePeriod(STTimePeriod$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TIMEPERIOD$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TIMEPERIOD$28);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTimePeriod(STTimePeriod var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTimePeriod var3 = null;
         var3 = (STTimePeriod)this.get_store().find_attribute_user(TIMEPERIOD$28);
         if(var3 == null) {
            var3 = (STTimePeriod)this.get_store().add_attribute_user(TIMEPERIOD$28);
         }

         var3.set(var1);
      }
   }

   public void unsetTimePeriod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TIMEPERIOD$28);
      }
   }

   public long getRank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RANK$30);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetRank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(RANK$30);
         return var2;
      }
   }

   public boolean isSetRank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RANK$30) != null;
      }
   }

   public void setRank(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(RANK$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(RANK$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetRank(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(RANK$30);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(RANK$30);
         }

         var3.set(var1);
      }
   }

   public void unsetRank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RANK$30);
      }
   }

   public int getStdDev() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STDDEV$32);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetStdDev() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(STDDEV$32);
         return var2;
      }
   }

   public boolean isSetStdDev() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STDDEV$32) != null;
      }
   }

   public void setStdDev(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STDDEV$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STDDEV$32);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetStdDev(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(STDDEV$32);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(STDDEV$32);
         }

         var3.set(var1);
      }
   }

   public void unsetStdDev() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STDDEV$32);
      }
   }

   public boolean getEqualAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EQUALAVERAGE$34);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EQUALAVERAGE$34);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEqualAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EQUALAVERAGE$34);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(EQUALAVERAGE$34);
         }

         return var2;
      }
   }

   public boolean isSetEqualAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EQUALAVERAGE$34) != null;
      }
   }

   public void setEqualAverage(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EQUALAVERAGE$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EQUALAVERAGE$34);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEqualAverage(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EQUALAVERAGE$34);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EQUALAVERAGE$34);
         }

         var3.set(var1);
      }
   }

   public void unsetEqualAverage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EQUALAVERAGE$34);
      }
   }

}
