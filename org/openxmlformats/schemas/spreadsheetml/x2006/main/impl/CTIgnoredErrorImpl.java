package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIgnoredError;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;

public class CTIgnoredErrorImpl extends XmlComplexContentImpl implements CTIgnoredError {

   private static final QName SQREF$0 = new QName("", "sqref");
   private static final QName EVALERROR$2 = new QName("", "evalError");
   private static final QName TWODIGITTEXTYEAR$4 = new QName("", "twoDigitTextYear");
   private static final QName NUMBERSTOREDASTEXT$6 = new QName("", "numberStoredAsText");
   private static final QName FORMULA$8 = new QName("", "formula");
   private static final QName FORMULARANGE$10 = new QName("", "formulaRange");
   private static final QName UNLOCKEDFORMULA$12 = new QName("", "unlockedFormula");
   private static final QName EMPTYCELLREFERENCE$14 = new QName("", "emptyCellReference");
   private static final QName LISTDATAVALIDATION$16 = new QName("", "listDataValidation");
   private static final QName CALCULATEDCOLUMN$18 = new QName("", "calculatedColumn");


   public CTIgnoredErrorImpl(SchemaType var1) {
      super(var1);
   }

   public List getSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SQREF$0);
         return var2 == null?null:var2.getListValue();
      }
   }

   public STSqref xgetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var2 = null;
         var2 = (STSqref)this.get_store().find_attribute_user(SQREF$0);
         return var2;
      }
   }

   public void setSqref(List var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SQREF$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SQREF$0);
         }

         var3.setListValue(var1);
      }
   }

   public void xsetSqref(STSqref var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var3 = null;
         var3 = (STSqref)this.get_store().find_attribute_user(SQREF$0);
         if(var3 == null) {
            var3 = (STSqref)this.get_store().add_attribute_user(SQREF$0);
         }

         var3.set(var1);
      }
   }

   public boolean getEvalError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EVALERROR$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EVALERROR$2);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEvalError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EVALERROR$2);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(EVALERROR$2);
         }

         return var2;
      }
   }

   public boolean isSetEvalError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EVALERROR$2) != null;
      }
   }

   public void setEvalError(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EVALERROR$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EVALERROR$2);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEvalError(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EVALERROR$2);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EVALERROR$2);
         }

         var3.set(var1);
      }
   }

   public void unsetEvalError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EVALERROR$2);
      }
   }

   public boolean getTwoDigitTextYear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TWODIGITTEXTYEAR$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTwoDigitTextYear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TWODIGITTEXTYEAR$4);
         }

         return var2;
      }
   }

   public boolean isSetTwoDigitTextYear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TWODIGITTEXTYEAR$4) != null;
      }
   }

   public void setTwoDigitTextYear(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TWODIGITTEXTYEAR$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTwoDigitTextYear(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TWODIGITTEXTYEAR$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TWODIGITTEXTYEAR$4);
         }

         var3.set(var1);
      }
   }

   public void unsetTwoDigitTextYear() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TWODIGITTEXTYEAR$4);
      }
   }

   public boolean getNumberStoredAsText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(NUMBERSTOREDASTEXT$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNumberStoredAsText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(NUMBERSTOREDASTEXT$6);
         }

         return var2;
      }
   }

   public boolean isSetNumberStoredAsText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NUMBERSTOREDASTEXT$6) != null;
      }
   }

   public void setNumberStoredAsText(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NUMBERSTOREDASTEXT$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNumberStoredAsText(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NUMBERSTOREDASTEXT$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NUMBERSTOREDASTEXT$6);
         }

         var3.set(var1);
      }
   }

   public void unsetNumberStoredAsText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NUMBERSTOREDASTEXT$6);
      }
   }

   public boolean getFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMULA$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FORMULA$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORMULA$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FORMULA$8);
         }

         return var2;
      }
   }

   public boolean isSetFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMULA$8) != null;
      }
   }

   public void setFormula(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMULA$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMULA$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFormula(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORMULA$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORMULA$8);
         }

         var3.set(var1);
      }
   }

   public void unsetFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMULA$8);
      }
   }

   public boolean getFormulaRange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMULARANGE$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FORMULARANGE$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetFormulaRange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(FORMULARANGE$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(FORMULARANGE$10);
         }

         return var2;
      }
   }

   public boolean isSetFormulaRange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMULARANGE$10) != null;
      }
   }

   public void setFormulaRange(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMULARANGE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMULARANGE$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetFormulaRange(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(FORMULARANGE$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(FORMULARANGE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetFormulaRange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMULARANGE$10);
      }
   }

   public boolean getUnlockedFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(UNLOCKEDFORMULA$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(UNLOCKEDFORMULA$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUnlockedFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(UNLOCKEDFORMULA$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(UNLOCKEDFORMULA$12);
         }

         return var2;
      }
   }

   public boolean isSetUnlockedFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(UNLOCKEDFORMULA$12) != null;
      }
   }

   public void setUnlockedFormula(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(UNLOCKEDFORMULA$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(UNLOCKEDFORMULA$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUnlockedFormula(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(UNLOCKEDFORMULA$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(UNLOCKEDFORMULA$12);
         }

         var3.set(var1);
      }
   }

   public void unsetUnlockedFormula() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(UNLOCKEDFORMULA$12);
      }
   }

   public boolean getEmptyCellReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EMPTYCELLREFERENCE$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEmptyCellReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(EMPTYCELLREFERENCE$14);
         }

         return var2;
      }
   }

   public boolean isSetEmptyCellReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EMPTYCELLREFERENCE$14) != null;
      }
   }

   public void setEmptyCellReference(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EMPTYCELLREFERENCE$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEmptyCellReference(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EMPTYCELLREFERENCE$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EMPTYCELLREFERENCE$14);
         }

         var3.set(var1);
      }
   }

   public void unsetEmptyCellReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EMPTYCELLREFERENCE$14);
      }
   }

   public boolean getListDataValidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LISTDATAVALIDATION$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LISTDATAVALIDATION$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetListDataValidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LISTDATAVALIDATION$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(LISTDATAVALIDATION$16);
         }

         return var2;
      }
   }

   public boolean isSetListDataValidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LISTDATAVALIDATION$16) != null;
      }
   }

   public void setListDataValidation(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LISTDATAVALIDATION$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LISTDATAVALIDATION$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetListDataValidation(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LISTDATAVALIDATION$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LISTDATAVALIDATION$16);
         }

         var3.set(var1);
      }
   }

   public void unsetListDataValidation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LISTDATAVALIDATION$16);
      }
   }

   public boolean getCalculatedColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CALCULATEDCOLUMN$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CALCULATEDCOLUMN$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCalculatedColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(CALCULATEDCOLUMN$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(CALCULATEDCOLUMN$18);
         }

         return var2;
      }
   }

   public boolean isSetCalculatedColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CALCULATEDCOLUMN$18) != null;
      }
   }

   public void setCalculatedColumn(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CALCULATEDCOLUMN$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CALCULATEDCOLUMN$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCalculatedColumn(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(CALCULATEDCOLUMN$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(CALCULATEDCOLUMN$18);
         }

         var3.set(var1);
      }
   }

   public void unsetCalculatedColumn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CALCULATEDCOLUMN$18);
      }
   }

}
