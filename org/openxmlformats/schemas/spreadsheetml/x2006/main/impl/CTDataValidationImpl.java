package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationErrorStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationImeMode$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationOperator;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STDataValidationType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormula;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;

public class CTDataValidationImpl extends XmlComplexContentImpl implements CTDataValidation {

   private static final QName FORMULA1$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula1");
   private static final QName FORMULA2$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "formula2");
   private static final QName TYPE$4 = new QName("", "type");
   private static final QName ERRORSTYLE$6 = new QName("", "errorStyle");
   private static final QName IMEMODE$8 = new QName("", "imeMode");
   private static final QName OPERATOR$10 = new QName("", "operator");
   private static final QName ALLOWBLANK$12 = new QName("", "allowBlank");
   private static final QName SHOWDROPDOWN$14 = new QName("", "showDropDown");
   private static final QName SHOWINPUTMESSAGE$16 = new QName("", "showInputMessage");
   private static final QName SHOWERRORMESSAGE$18 = new QName("", "showErrorMessage");
   private static final QName ERRORTITLE$20 = new QName("", "errorTitle");
   private static final QName ERROR$22 = new QName("", "error");
   private static final QName PROMPTTITLE$24 = new QName("", "promptTitle");
   private static final QName PROMPT$26 = new QName("", "prompt");
   private static final QName SQREF$28 = new QName("", "sqref");


   public CTDataValidationImpl(SchemaType var1) {
      super(var1);
   }

   public String getFormula1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FORMULA1$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STFormula xgetFormula1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var2 = null;
         var2 = (STFormula)this.get_store().find_element_user(FORMULA1$0, 0);
         return var2;
      }
   }

   public boolean isSetFormula1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMULA1$0) != 0;
      }
   }

   public void setFormula1(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FORMULA1$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FORMULA1$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormula1(STFormula var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var3 = null;
         var3 = (STFormula)this.get_store().find_element_user(FORMULA1$0, 0);
         if(var3 == null) {
            var3 = (STFormula)this.get_store().add_element_user(FORMULA1$0);
         }

         var3.set(var1);
      }
   }

   public void unsetFormula1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMULA1$0, 0);
      }
   }

   public String getFormula2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(FORMULA2$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STFormula xgetFormula2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var2 = null;
         var2 = (STFormula)this.get_store().find_element_user(FORMULA2$2, 0);
         return var2;
      }
   }

   public boolean isSetFormula2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMULA2$2) != 0;
      }
   }

   public void setFormula2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(FORMULA2$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(FORMULA2$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFormula2(STFormula var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STFormula var3 = null;
         var3 = (STFormula)this.get_store().find_element_user(FORMULA2$2, 0);
         if(var3 == null) {
            var3 = (STFormula)this.get_store().add_element_user(FORMULA2$2);
         }

         var3.set(var1);
      }
   }

   public void unsetFormula2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMULA2$2, 0);
      }
   }

   public STDataValidationType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TYPE$4);
         }

         return var2 == null?null:(STDataValidationType.Enum)var2.getEnumValue();
      }
   }

   public STDataValidationType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationType var2 = null;
         var2 = (STDataValidationType)this.get_store().find_attribute_user(TYPE$4);
         if(var2 == null) {
            var2 = (STDataValidationType)this.get_default_attribute_value(TYPE$4);
         }

         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$4) != null;
      }
   }

   public void setType(STDataValidationType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STDataValidationType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationType var3 = null;
         var3 = (STDataValidationType)this.get_store().find_attribute_user(TYPE$4);
         if(var3 == null) {
            var3 = (STDataValidationType)this.get_store().add_attribute_user(TYPE$4);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$4);
      }
   }

   public STDataValidationErrorStyle.Enum getErrorStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ERRORSTYLE$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ERRORSTYLE$6);
         }

         return var2 == null?null:(STDataValidationErrorStyle.Enum)var2.getEnumValue();
      }
   }

   public STDataValidationErrorStyle xgetErrorStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationErrorStyle var2 = null;
         var2 = (STDataValidationErrorStyle)this.get_store().find_attribute_user(ERRORSTYLE$6);
         if(var2 == null) {
            var2 = (STDataValidationErrorStyle)this.get_default_attribute_value(ERRORSTYLE$6);
         }

         return var2;
      }
   }

   public boolean isSetErrorStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ERRORSTYLE$6) != null;
      }
   }

   public void setErrorStyle(STDataValidationErrorStyle.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ERRORSTYLE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ERRORSTYLE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetErrorStyle(STDataValidationErrorStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationErrorStyle var3 = null;
         var3 = (STDataValidationErrorStyle)this.get_store().find_attribute_user(ERRORSTYLE$6);
         if(var3 == null) {
            var3 = (STDataValidationErrorStyle)this.get_store().add_attribute_user(ERRORSTYLE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetErrorStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ERRORSTYLE$6);
      }
   }

   public STDataValidationImeMode$Enum getImeMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(IMEMODE$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(IMEMODE$8);
         }

         return var2 == null?null:(STDataValidationImeMode$Enum)var2.getEnumValue();
      }
   }

   public STDataValidationImeMode xgetImeMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationImeMode var2 = null;
         var2 = (STDataValidationImeMode)this.get_store().find_attribute_user(IMEMODE$8);
         if(var2 == null) {
            var2 = (STDataValidationImeMode)this.get_default_attribute_value(IMEMODE$8);
         }

         return var2;
      }
   }

   public boolean isSetImeMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(IMEMODE$8) != null;
      }
   }

   public void setImeMode(STDataValidationImeMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(IMEMODE$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(IMEMODE$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetImeMode(STDataValidationImeMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationImeMode var3 = null;
         var3 = (STDataValidationImeMode)this.get_store().find_attribute_user(IMEMODE$8);
         if(var3 == null) {
            var3 = (STDataValidationImeMode)this.get_store().add_attribute_user(IMEMODE$8);
         }

         var3.set(var1);
      }
   }

   public void unsetImeMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(IMEMODE$8);
      }
   }

   public STDataValidationOperator.Enum getOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPERATOR$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(OPERATOR$10);
         }

         return var2 == null?null:(STDataValidationOperator.Enum)var2.getEnumValue();
      }
   }

   public STDataValidationOperator xgetOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationOperator var2 = null;
         var2 = (STDataValidationOperator)this.get_store().find_attribute_user(OPERATOR$10);
         if(var2 == null) {
            var2 = (STDataValidationOperator)this.get_default_attribute_value(OPERATOR$10);
         }

         return var2;
      }
   }

   public boolean isSetOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPERATOR$10) != null;
      }
   }

   public void setOperator(STDataValidationOperator.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPERATOR$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPERATOR$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOperator(STDataValidationOperator var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDataValidationOperator var3 = null;
         var3 = (STDataValidationOperator)this.get_store().find_attribute_user(OPERATOR$10);
         if(var3 == null) {
            var3 = (STDataValidationOperator)this.get_store().add_attribute_user(OPERATOR$10);
         }

         var3.set(var1);
      }
   }

   public void unsetOperator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPERATOR$10);
      }
   }

   public boolean getAllowBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWBLANK$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ALLOWBLANK$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAllowBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ALLOWBLANK$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ALLOWBLANK$12);
         }

         return var2;
      }
   }

   public boolean isSetAllowBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLOWBLANK$12) != null;
      }
   }

   public void setAllowBlank(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWBLANK$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWBLANK$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAllowBlank(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ALLOWBLANK$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ALLOWBLANK$12);
         }

         var3.set(var1);
      }
   }

   public void unsetAllowBlank() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLOWBLANK$12);
      }
   }

   public boolean getShowDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWDROPDOWN$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWDROPDOWN$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDROPDOWN$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWDROPDOWN$14);
         }

         return var2;
      }
   }

   public boolean isSetShowDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWDROPDOWN$14) != null;
      }
   }

   public void setShowDropDown(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWDROPDOWN$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWDROPDOWN$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowDropDown(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWDROPDOWN$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWDROPDOWN$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShowDropDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWDROPDOWN$14);
      }
   }

   public boolean getShowInputMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWINPUTMESSAGE$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowInputMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWINPUTMESSAGE$16);
         }

         return var2;
      }
   }

   public boolean isSetShowInputMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWINPUTMESSAGE$16) != null;
      }
   }

   public void setShowInputMessage(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWINPUTMESSAGE$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowInputMessage(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWINPUTMESSAGE$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWINPUTMESSAGE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetShowInputMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWINPUTMESSAGE$16);
      }
   }

   public boolean getShowErrorMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWERRORMESSAGE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWERRORMESSAGE$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowErrorMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWERRORMESSAGE$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWERRORMESSAGE$18);
         }

         return var2;
      }
   }

   public boolean isSetShowErrorMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWERRORMESSAGE$18) != null;
      }
   }

   public void setShowErrorMessage(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWERRORMESSAGE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWERRORMESSAGE$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowErrorMessage(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWERRORMESSAGE$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWERRORMESSAGE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetShowErrorMessage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWERRORMESSAGE$18);
      }
   }

   public String getErrorTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ERRORTITLE$20);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetErrorTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(ERRORTITLE$20);
         return var2;
      }
   }

   public boolean isSetErrorTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ERRORTITLE$20) != null;
      }
   }

   public void setErrorTitle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ERRORTITLE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ERRORTITLE$20);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetErrorTitle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(ERRORTITLE$20);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(ERRORTITLE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetErrorTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ERRORTITLE$20);
      }
   }

   public String getError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ERROR$22);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(ERROR$22);
         return var2;
      }
   }

   public boolean isSetError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ERROR$22) != null;
      }
   }

   public void setError(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ERROR$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ERROR$22);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetError(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(ERROR$22);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(ERROR$22);
         }

         var3.set(var1);
      }
   }

   public void unsetError() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ERROR$22);
      }
   }

   public String getPromptTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PROMPTTITLE$24);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetPromptTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(PROMPTTITLE$24);
         return var2;
      }
   }

   public boolean isSetPromptTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PROMPTTITLE$24) != null;
      }
   }

   public void setPromptTitle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PROMPTTITLE$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PROMPTTITLE$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPromptTitle(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(PROMPTTITLE$24);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(PROMPTTITLE$24);
         }

         var3.set(var1);
      }
   }

   public void unsetPromptTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PROMPTTITLE$24);
      }
   }

   public String getPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PROMPT$26);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STXstring xgetPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var2 = null;
         var2 = (STXstring)this.get_store().find_attribute_user(PROMPT$26);
         return var2;
      }
   }

   public boolean isSetPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PROMPT$26) != null;
      }
   }

   public void setPrompt(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PROMPT$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PROMPT$26);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPrompt(STXstring var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STXstring var3 = null;
         var3 = (STXstring)this.get_store().find_attribute_user(PROMPT$26);
         if(var3 == null) {
            var3 = (STXstring)this.get_store().add_attribute_user(PROMPT$26);
         }

         var3.set(var1);
      }
   }

   public void unsetPrompt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PROMPT$26);
      }
   }

   public List getSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SQREF$28);
         return var2 == null?null:var2.getListValue();
      }
   }

   public STSqref xgetSqref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var2 = null;
         var2 = (STSqref)this.get_store().find_attribute_user(SQREF$28);
         return var2;
      }
   }

   public void setSqref(List var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SQREF$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SQREF$28);
         }

         var3.setListValue(var1);
      }
   }

   public void xsetSqref(STSqref var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSqref var3 = null;
         var3 = (STSqref)this.get_store().find_attribute_user(SQREF$28);
         if(var3 == null) {
            var3 = (STSqref)this.get_store().add_attribute_user(SQREF$28);
         }

         var3.set(var1);
      }
   }

}
