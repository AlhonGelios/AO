package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFDDList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFData;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFHelpText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFStatusText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFTextInput;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMacroName;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1CalcOnExitList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1DdListList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1EnabledList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1EntryMacroList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1ExitMacroList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1HelpTextList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1NameList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1StatusTextList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTFFDataImpl.1TextInputList;

public class CTFFDataImpl extends XmlComplexContentImpl implements CTFFData {

   private static final QName NAME$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "name");
   private static final QName ENABLED$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "enabled");
   private static final QName CALCONEXIT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "calcOnExit");
   private static final QName ENTRYMACRO$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "entryMacro");
   private static final QName EXITMACRO$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "exitMacro");
   private static final QName HELPTEXT$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "helpText");
   private static final QName STATUSTEXT$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "statusText");
   private static final QName CHECKBOX$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "checkBox");
   private static final QName DDLIST$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ddList");
   private static final QName TEXTINPUT$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textInput");


   public CTFFDataImpl(SchemaType var1) {
      super(var1);
   }

   public List getNameList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NameList(this);
      }
   }

   public CTFFName[] getNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NAME$0, var2);
         CTFFName[] var3 = new CTFFName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFFName getNameArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFName var3 = null;
         var3 = (CTFFName)this.get_store().find_element_user(NAME$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNameArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NAME$0);
      }
   }

   public void setNameArray(CTFFName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NAME$0);
      }
   }

   public void setNameArray(int var1, CTFFName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFName var4 = null;
         var4 = (CTFFName)this.get_store().find_element_user(NAME$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFFName insertNewName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFName var3 = null;
         var3 = (CTFFName)this.get_store().insert_element_user(NAME$0, var1);
         return var3;
      }
   }

   public CTFFName addNewName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFName var2 = null;
         var2 = (CTFFName)this.get_store().add_element_user(NAME$0);
         return var2;
      }
   }

   public void removeName(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NAME$0, var1);
      }
   }

   public List getEnabledList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EnabledList(this);
      }
   }

   public CTOnOff[] getEnabledArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENABLED$2, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getEnabledArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ENABLED$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEnabledArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENABLED$2);
      }
   }

   public void setEnabledArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENABLED$2);
      }
   }

   public void setEnabledArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(ENABLED$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewEnabled(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(ENABLED$2, var1);
         return var3;
      }
   }

   public CTOnOff addNewEnabled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ENABLED$2);
         return var2;
      }
   }

   public void removeEnabled(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENABLED$2, var1);
      }
   }

   public List getCalcOnExitList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CalcOnExitList(this);
      }
   }

   public CTOnOff[] getCalcOnExitArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CALCONEXIT$4, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getCalcOnExitArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(CALCONEXIT$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCalcOnExitArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CALCONEXIT$4);
      }
   }

   public void setCalcOnExitArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CALCONEXIT$4);
      }
   }

   public void setCalcOnExitArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(CALCONEXIT$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewCalcOnExit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(CALCONEXIT$4, var1);
         return var3;
      }
   }

   public CTOnOff addNewCalcOnExit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(CALCONEXIT$4);
         return var2;
      }
   }

   public void removeCalcOnExit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CALCONEXIT$4, var1);
      }
   }

   public List getEntryMacroList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EntryMacroList(this);
      }
   }

   public CTMacroName[] getEntryMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENTRYMACRO$6, var2);
         CTMacroName[] var3 = new CTMacroName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMacroName getEntryMacroArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var3 = null;
         var3 = (CTMacroName)this.get_store().find_element_user(ENTRYMACRO$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEntryMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENTRYMACRO$6);
      }
   }

   public void setEntryMacroArray(CTMacroName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENTRYMACRO$6);
      }
   }

   public void setEntryMacroArray(int var1, CTMacroName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var4 = null;
         var4 = (CTMacroName)this.get_store().find_element_user(ENTRYMACRO$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMacroName insertNewEntryMacro(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var3 = null;
         var3 = (CTMacroName)this.get_store().insert_element_user(ENTRYMACRO$6, var1);
         return var3;
      }
   }

   public CTMacroName addNewEntryMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var2 = null;
         var2 = (CTMacroName)this.get_store().add_element_user(ENTRYMACRO$6);
         return var2;
      }
   }

   public void removeEntryMacro(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENTRYMACRO$6, var1);
      }
   }

   public List getExitMacroList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ExitMacroList(this);
      }
   }

   public CTMacroName[] getExitMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EXITMACRO$8, var2);
         CTMacroName[] var3 = new CTMacroName[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMacroName getExitMacroArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var3 = null;
         var3 = (CTMacroName)this.get_store().find_element_user(EXITMACRO$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfExitMacroArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXITMACRO$8);
      }
   }

   public void setExitMacroArray(CTMacroName[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EXITMACRO$8);
      }
   }

   public void setExitMacroArray(int var1, CTMacroName var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var4 = null;
         var4 = (CTMacroName)this.get_store().find_element_user(EXITMACRO$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMacroName insertNewExitMacro(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var3 = null;
         var3 = (CTMacroName)this.get_store().insert_element_user(EXITMACRO$8, var1);
         return var3;
      }
   }

   public CTMacroName addNewExitMacro() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMacroName var2 = null;
         var2 = (CTMacroName)this.get_store().add_element_user(EXITMACRO$8);
         return var2;
      }
   }

   public void removeExitMacro(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXITMACRO$8, var1);
      }
   }

   public List getHelpTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HelpTextList(this);
      }
   }

   public CTFFHelpText[] getHelpTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HELPTEXT$10, var2);
         CTFFHelpText[] var3 = new CTFFHelpText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFFHelpText getHelpTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFHelpText var3 = null;
         var3 = (CTFFHelpText)this.get_store().find_element_user(HELPTEXT$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHelpTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HELPTEXT$10);
      }
   }

   public void setHelpTextArray(CTFFHelpText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HELPTEXT$10);
      }
   }

   public void setHelpTextArray(int var1, CTFFHelpText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFHelpText var4 = null;
         var4 = (CTFFHelpText)this.get_store().find_element_user(HELPTEXT$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFFHelpText insertNewHelpText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFHelpText var3 = null;
         var3 = (CTFFHelpText)this.get_store().insert_element_user(HELPTEXT$10, var1);
         return var3;
      }
   }

   public CTFFHelpText addNewHelpText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFHelpText var2 = null;
         var2 = (CTFFHelpText)this.get_store().add_element_user(HELPTEXT$10);
         return var2;
      }
   }

   public void removeHelpText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HELPTEXT$10, var1);
      }
   }

   public List getStatusTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1StatusTextList(this);
      }
   }

   public CTFFStatusText[] getStatusTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(STATUSTEXT$12, var2);
         CTFFStatusText[] var3 = new CTFFStatusText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFFStatusText getStatusTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFStatusText var3 = null;
         var3 = (CTFFStatusText)this.get_store().find_element_user(STATUSTEXT$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfStatusTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STATUSTEXT$12);
      }
   }

   public void setStatusTextArray(CTFFStatusText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, STATUSTEXT$12);
      }
   }

   public void setStatusTextArray(int var1, CTFFStatusText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFStatusText var4 = null;
         var4 = (CTFFStatusText)this.get_store().find_element_user(STATUSTEXT$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFFStatusText insertNewStatusText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFStatusText var3 = null;
         var3 = (CTFFStatusText)this.get_store().insert_element_user(STATUSTEXT$12, var1);
         return var3;
      }
   }

   public CTFFStatusText addNewStatusText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFStatusText var2 = null;
         var2 = (CTFFStatusText)this.get_store().add_element_user(STATUSTEXT$12);
         return var2;
      }
   }

   public void removeStatusText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STATUSTEXT$12, var1);
      }
   }

   public List getCheckBoxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class CheckBoxList extends AbstractList {

            public CTFFCheckBox get(int var1) {
               return CTFFDataImpl.this.getCheckBoxArray(var1);
            }

            public CTFFCheckBox set(int var1, CTFFCheckBox var2) {
               CTFFCheckBox var3 = CTFFDataImpl.this.getCheckBoxArray(var1);
               CTFFDataImpl.this.setCheckBoxArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTFFCheckBox var2) {
               CTFFDataImpl.this.insertNewCheckBox(var1).set(var2);
            }

            public CTFFCheckBox remove(int var1) {
               CTFFCheckBox var2 = CTFFDataImpl.this.getCheckBoxArray(var1);
               CTFFDataImpl.this.removeCheckBox(var1);
               return var2;
            }

            public int size() {
               return CTFFDataImpl.this.sizeOfCheckBoxArray();
            }
         }

         return new CheckBoxList();
      }
   }

   public CTFFCheckBox[] getCheckBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CHECKBOX$14, var2);
         CTFFCheckBox[] var3 = new CTFFCheckBox[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFFCheckBox getCheckBoxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFCheckBox var3 = null;
         var3 = (CTFFCheckBox)this.get_store().find_element_user(CHECKBOX$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCheckBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHECKBOX$14);
      }
   }

   public void setCheckBoxArray(CTFFCheckBox[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CHECKBOX$14);
      }
   }

   public void setCheckBoxArray(int var1, CTFFCheckBox var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFCheckBox var4 = null;
         var4 = (CTFFCheckBox)this.get_store().find_element_user(CHECKBOX$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFFCheckBox insertNewCheckBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFCheckBox var3 = null;
         var3 = (CTFFCheckBox)this.get_store().insert_element_user(CHECKBOX$14, var1);
         return var3;
      }
   }

   public CTFFCheckBox addNewCheckBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFCheckBox var2 = null;
         var2 = (CTFFCheckBox)this.get_store().add_element_user(CHECKBOX$14);
         return var2;
      }
   }

   public void removeCheckBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHECKBOX$14, var1);
      }
   }

   public List getDdListList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DdListList(this);
      }
   }

   public CTFFDDList[] getDdListArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DDLIST$16, var2);
         CTFFDDList[] var3 = new CTFFDDList[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFFDDList getDdListArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFDDList var3 = null;
         var3 = (CTFFDDList)this.get_store().find_element_user(DDLIST$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDdListArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DDLIST$16);
      }
   }

   public void setDdListArray(CTFFDDList[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DDLIST$16);
      }
   }

   public void setDdListArray(int var1, CTFFDDList var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFDDList var4 = null;
         var4 = (CTFFDDList)this.get_store().find_element_user(DDLIST$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFFDDList insertNewDdList(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFDDList var3 = null;
         var3 = (CTFFDDList)this.get_store().insert_element_user(DDLIST$16, var1);
         return var3;
      }
   }

   public CTFFDDList addNewDdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFDDList var2 = null;
         var2 = (CTFFDDList)this.get_store().add_element_user(DDLIST$16);
         return var2;
      }
   }

   public void removeDdList(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DDLIST$16, var1);
      }
   }

   public List getTextInputList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextInputList(this);
      }
   }

   public CTFFTextInput[] getTextInputArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTINPUT$18, var2);
         CTFFTextInput[] var3 = new CTFFTextInput[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFFTextInput getTextInputArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFTextInput var3 = null;
         var3 = (CTFFTextInput)this.get_store().find_element_user(TEXTINPUT$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextInputArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTINPUT$18);
      }
   }

   public void setTextInputArray(CTFFTextInput[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTINPUT$18);
      }
   }

   public void setTextInputArray(int var1, CTFFTextInput var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFTextInput var4 = null;
         var4 = (CTFFTextInput)this.get_store().find_element_user(TEXTINPUT$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFFTextInput insertNewTextInput(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFTextInput var3 = null;
         var3 = (CTFFTextInput)this.get_store().insert_element_user(TEXTINPUT$18, var1);
         return var3;
      }
   }

   public CTFFTextInput addNewTextInput() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFFTextInput var2 = null;
         var2 = (CTFFTextInput)this.get_store().add_element_user(TEXTINPUT$18);
         return var2;
      }
   }

   public void removeTextInput(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTINPUT$18, var1);
      }
   }

}
