package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTOutlinePr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetUpPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STRef;

public class CTSheetPrImpl extends XmlComplexContentImpl implements CTSheetPr {

   private static final QName TABCOLOR$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "tabColor");
   private static final QName OUTLINEPR$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "outlinePr");
   private static final QName PAGESETUPPR$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pageSetUpPr");
   private static final QName SYNCHORIZONTAL$6 = new QName("", "syncHorizontal");
   private static final QName SYNCVERTICAL$8 = new QName("", "syncVertical");
   private static final QName SYNCREF$10 = new QName("", "syncRef");
   private static final QName TRANSITIONEVALUATION$12 = new QName("", "transitionEvaluation");
   private static final QName TRANSITIONENTRY$14 = new QName("", "transitionEntry");
   private static final QName PUBLISHED$16 = new QName("", "published");
   private static final QName CODENAME$18 = new QName("", "codeName");
   private static final QName FILTERMODE$20 = new QName("", "filterMode");
   private static final QName ENABLEFORMATCONDITIONSCALCULATION$22 = new QName("", "enableFormatConditionsCalculation");


   public CTSheetPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTColor getTabColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(TABCOLOR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTabColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABCOLOR$0) != 0;
      }
   }

   public void setTabColor(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(TABCOLOR$0, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(TABCOLOR$0);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewTabColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(TABCOLOR$0);
         return var2;
      }
   }

   public void unsetTabColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABCOLOR$0, 0);
      }
   }

   public CTOutlinePr getOutlinePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOutlinePr var2 = null;
         var2 = (CTOutlinePr)this.get_store().find_element_user(OUTLINEPR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOutlinePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OUTLINEPR$2) != 0;
      }
   }

   public void setOutlinePr(CTOutlinePr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOutlinePr var3 = null;
         var3 = (CTOutlinePr)this.get_store().find_element_user(OUTLINEPR$2, 0);
         if(var3 == null) {
            var3 = (CTOutlinePr)this.get_store().add_element_user(OUTLINEPR$2);
         }

         var3.set(var1);
      }
   }

   public CTOutlinePr addNewOutlinePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOutlinePr var2 = null;
         var2 = (CTOutlinePr)this.get_store().add_element_user(OUTLINEPR$2);
         return var2;
      }
   }

   public void unsetOutlinePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OUTLINEPR$2, 0);
      }
   }

   public CTPageSetUpPr getPageSetUpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetUpPr var2 = null;
         var2 = (CTPageSetUpPr)this.get_store().find_element_user(PAGESETUPPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageSetUpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGESETUPPR$4) != 0;
      }
   }

   public void setPageSetUpPr(CTPageSetUpPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetUpPr var3 = null;
         var3 = (CTPageSetUpPr)this.get_store().find_element_user(PAGESETUPPR$4, 0);
         if(var3 == null) {
            var3 = (CTPageSetUpPr)this.get_store().add_element_user(PAGESETUPPR$4);
         }

         var3.set(var1);
      }
   }

   public CTPageSetUpPr addNewPageSetUpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSetUpPr var2 = null;
         var2 = (CTPageSetUpPr)this.get_store().add_element_user(PAGESETUPPR$4);
         return var2;
      }
   }

   public void unsetPageSetUpPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGESETUPPR$4, 0);
      }
   }

   public boolean getSyncHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SYNCHORIZONTAL$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SYNCHORIZONTAL$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSyncHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SYNCHORIZONTAL$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SYNCHORIZONTAL$6);
         }

         return var2;
      }
   }

   public boolean isSetSyncHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SYNCHORIZONTAL$6) != null;
      }
   }

   public void setSyncHorizontal(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SYNCHORIZONTAL$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SYNCHORIZONTAL$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSyncHorizontal(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SYNCHORIZONTAL$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SYNCHORIZONTAL$6);
         }

         var3.set(var1);
      }
   }

   public void unsetSyncHorizontal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SYNCHORIZONTAL$6);
      }
   }

   public boolean getSyncVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SYNCVERTICAL$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SYNCVERTICAL$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSyncVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SYNCVERTICAL$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SYNCVERTICAL$8);
         }

         return var2;
      }
   }

   public boolean isSetSyncVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SYNCVERTICAL$8) != null;
      }
   }

   public void setSyncVertical(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SYNCVERTICAL$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SYNCVERTICAL$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSyncVertical(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SYNCVERTICAL$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SYNCVERTICAL$8);
         }

         var3.set(var1);
      }
   }

   public void unsetSyncVertical() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SYNCVERTICAL$8);
      }
   }

   public String getSyncRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SYNCREF$10);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRef xgetSyncRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var2 = null;
         var2 = (STRef)this.get_store().find_attribute_user(SYNCREF$10);
         return var2;
      }
   }

   public boolean isSetSyncRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SYNCREF$10) != null;
      }
   }

   public void setSyncRef(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SYNCREF$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SYNCREF$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSyncRef(STRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRef var3 = null;
         var3 = (STRef)this.get_store().find_attribute_user(SYNCREF$10);
         if(var3 == null) {
            var3 = (STRef)this.get_store().add_attribute_user(SYNCREF$10);
         }

         var3.set(var1);
      }
   }

   public void unsetSyncRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SYNCREF$10);
      }
   }

   public boolean getTransitionEvaluation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TRANSITIONEVALUATION$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TRANSITIONEVALUATION$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTransitionEvaluation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TRANSITIONEVALUATION$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TRANSITIONEVALUATION$12);
         }

         return var2;
      }
   }

   public boolean isSetTransitionEvaluation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TRANSITIONEVALUATION$12) != null;
      }
   }

   public void setTransitionEvaluation(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TRANSITIONEVALUATION$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TRANSITIONEVALUATION$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTransitionEvaluation(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TRANSITIONEVALUATION$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TRANSITIONEVALUATION$12);
         }

         var3.set(var1);
      }
   }

   public void unsetTransitionEvaluation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TRANSITIONEVALUATION$12);
      }
   }

   public boolean getTransitionEntry() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TRANSITIONENTRY$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TRANSITIONENTRY$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTransitionEntry() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TRANSITIONENTRY$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TRANSITIONENTRY$14);
         }

         return var2;
      }
   }

   public boolean isSetTransitionEntry() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TRANSITIONENTRY$14) != null;
      }
   }

   public void setTransitionEntry(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TRANSITIONENTRY$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TRANSITIONENTRY$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTransitionEntry(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TRANSITIONENTRY$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TRANSITIONENTRY$14);
         }

         var3.set(var1);
      }
   }

   public void unsetTransitionEntry() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TRANSITIONENTRY$14);
      }
   }

   public boolean getPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHED$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PUBLISHED$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHED$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PUBLISHED$16);
         }

         return var2;
      }
   }

   public boolean isSetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PUBLISHED$16) != null;
      }
   }

   public void setPublished(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PUBLISHED$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PUBLISHED$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPublished(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PUBLISHED$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PUBLISHED$16);
         }

         var3.set(var1);
      }
   }

   public void unsetPublished() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PUBLISHED$16);
      }
   }

   public String getCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CODENAME$18);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CODENAME$18);
         return var2;
      }
   }

   public boolean isSetCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CODENAME$18) != null;
      }
   }

   public void setCodeName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CODENAME$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CODENAME$18);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCodeName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CODENAME$18);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CODENAME$18);
         }

         var3.set(var1);
      }
   }

   public void unsetCodeName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CODENAME$18);
      }
   }

   public boolean getFilterMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILTERMODE$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FILTERMODE$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFilterMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FILTERMODE$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FILTERMODE$20);
         }

         return var2;
      }
   }

   public boolean isSetFilterMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILTERMODE$20) != null;
      }
   }

   public void setFilterMode(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILTERMODE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILTERMODE$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFilterMode(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FILTERMODE$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FILTERMODE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetFilterMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILTERMODE$20);
      }
   }

   public boolean getEnableFormatConditionsCalculation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ENABLEFORMATCONDITIONSCALCULATION$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEnableFormatConditionsCalculation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ENABLEFORMATCONDITIONSCALCULATION$22);
         }

         return var2;
      }
   }

   public boolean isSetEnableFormatConditionsCalculation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22) != null;
      }
   }

   public void setEnableFormatConditionsCalculation(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEnableFormatConditionsCalculation(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ENABLEFORMATCONDITIONSCALCULATION$22);
         }

         var3.set(var1);
      }
   }

   public void unsetEnableFormatConditionsCalculation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENABLEFORMATCONDITIONSCALCULATION$22);
      }
   }

}
