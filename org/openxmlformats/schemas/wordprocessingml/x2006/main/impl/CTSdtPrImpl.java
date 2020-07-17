package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1AliasList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1BibliographyList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1CitationList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1ComboBoxList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1DataBindingList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1DateList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1DocPartListList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1DocPartObjList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1DropDownListList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1EquationList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1GroupList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1IdList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1LockList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1PictureList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1PlaceholderList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1RPrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1RichTextList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1ShowingPlcHdrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1TagList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1TemporaryList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSdtPrImpl.1TextList;

public class CTSdtPrImpl extends XmlComplexContentImpl implements CTSdtPr {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
   private static final QName ALIAS$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alias");
   private static final QName LOCK$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lock");
   private static final QName PLACEHOLDER$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "placeholder");
   private static final QName SHOWINGPLCHDR$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "showingPlcHdr");
   private static final QName DATABINDING$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dataBinding");
   private static final QName TEMPORARY$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "temporary");
   private static final QName ID$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "id");
   private static final QName TAG$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tag");
   private static final QName EQUATION$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "equation");
   private static final QName COMBOBOX$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "comboBox");
   private static final QName DATE$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "date");
   private static final QName DOCPARTOBJ$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartObj");
   private static final QName DOCPARTLIST$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docPartList");
   private static final QName DROPDOWNLIST$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dropDownList");
   private static final QName PICTURE$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "picture");
   private static final QName RICHTEXT$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "richText");
   private static final QName TEXT$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "text");
   private static final QName CITATION$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "citation");
   private static final QName GROUP$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "group");
   private static final QName BIBLIOGRAPHY$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bibliography");


   public CTSdtPrImpl(SchemaType var1) {
      super(var1);
   }

   public List getRPrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RPrList(this);
      }
   }

   public CTRPr[] getRPrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RPR$0, var2);
         CTRPr[] var3 = new CTRPr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRPr getRPrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().find_element_user(RPR$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRPrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0);
      }
   }

   public void setRPrArray(CTRPr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RPR$0);
      }
   }

   public void setRPrArray(int var1, CTRPr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var4 = null;
         var4 = (CTRPr)this.get_store().find_element_user(RPR$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRPr insertNewRPr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().insert_element_user(RPR$0, var1);
         return var3;
      }
   }

   public CTRPr addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().add_element_user(RPR$0);
         return var2;
      }
   }

   public void removeRPr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, var1);
      }
   }

   public List getAliasList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AliasList(this);
      }
   }

   public CTString[] getAliasArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALIAS$2, var2);
         CTString[] var3 = new CTString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTString getAliasArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(ALIAS$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAliasArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALIAS$2);
      }
   }

   public void setAliasArray(CTString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALIAS$2);
      }
   }

   public void setAliasArray(int var1, CTString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var4 = null;
         var4 = (CTString)this.get_store().find_element_user(ALIAS$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTString insertNewAlias(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().insert_element_user(ALIAS$2, var1);
         return var3;
      }
   }

   public CTString addNewAlias() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(ALIAS$2);
         return var2;
      }
   }

   public void removeAlias(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALIAS$2, var1);
      }
   }

   public List getLockList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LockList(this);
      }
   }

   public CTLock[] getLockArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LOCK$4, var2);
         CTLock[] var3 = new CTLock[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLock getLockArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var3 = null;
         var3 = (CTLock)this.get_store().find_element_user(LOCK$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLockArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LOCK$4);
      }
   }

   public void setLockArray(CTLock[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LOCK$4);
      }
   }

   public void setLockArray(int var1, CTLock var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var4 = null;
         var4 = (CTLock)this.get_store().find_element_user(LOCK$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLock insertNewLock(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var3 = null;
         var3 = (CTLock)this.get_store().insert_element_user(LOCK$4, var1);
         return var3;
      }
   }

   public CTLock addNewLock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var2 = null;
         var2 = (CTLock)this.get_store().add_element_user(LOCK$4);
         return var2;
      }
   }

   public void removeLock(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LOCK$4, var1);
      }
   }

   public List getPlaceholderList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PlaceholderList(this);
      }
   }

   public CTPlaceholder[] getPlaceholderArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PLACEHOLDER$6, var2);
         CTPlaceholder[] var3 = new CTPlaceholder[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPlaceholder getPlaceholderArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var3 = null;
         var3 = (CTPlaceholder)this.get_store().find_element_user(PLACEHOLDER$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPlaceholderArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PLACEHOLDER$6);
      }
   }

   public void setPlaceholderArray(CTPlaceholder[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PLACEHOLDER$6);
      }
   }

   public void setPlaceholderArray(int var1, CTPlaceholder var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var4 = null;
         var4 = (CTPlaceholder)this.get_store().find_element_user(PLACEHOLDER$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPlaceholder insertNewPlaceholder(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var3 = null;
         var3 = (CTPlaceholder)this.get_store().insert_element_user(PLACEHOLDER$6, var1);
         return var3;
      }
   }

   public CTPlaceholder addNewPlaceholder() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var2 = null;
         var2 = (CTPlaceholder)this.get_store().add_element_user(PLACEHOLDER$6);
         return var2;
      }
   }

   public void removePlaceholder(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PLACEHOLDER$6, var1);
      }
   }

   public List getShowingPlcHdrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShowingPlcHdrList(this);
      }
   }

   public CTOnOff[] getShowingPlcHdrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHOWINGPLCHDR$8, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getShowingPlcHdrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SHOWINGPLCHDR$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShowingPlcHdrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHOWINGPLCHDR$8);
      }
   }

   public void setShowingPlcHdrArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHOWINGPLCHDR$8);
      }
   }

   public void setShowingPlcHdrArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(SHOWINGPLCHDR$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewShowingPlcHdr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(SHOWINGPLCHDR$8, var1);
         return var3;
      }
   }

   public CTOnOff addNewShowingPlcHdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SHOWINGPLCHDR$8);
         return var2;
      }
   }

   public void removeShowingPlcHdr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHOWINGPLCHDR$8, var1);
      }
   }

   public List getDataBindingList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DataBindingList(this);
      }
   }

   public CTDataBinding[] getDataBindingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATABINDING$10, var2);
         CTDataBinding[] var3 = new CTDataBinding[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDataBinding getDataBindingArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var3 = null;
         var3 = (CTDataBinding)this.get_store().find_element_user(DATABINDING$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDataBindingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATABINDING$10);
      }
   }

   public void setDataBindingArray(CTDataBinding[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATABINDING$10);
      }
   }

   public void setDataBindingArray(int var1, CTDataBinding var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var4 = null;
         var4 = (CTDataBinding)this.get_store().find_element_user(DATABINDING$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDataBinding insertNewDataBinding(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var3 = null;
         var3 = (CTDataBinding)this.get_store().insert_element_user(DATABINDING$10, var1);
         return var3;
      }
   }

   public CTDataBinding addNewDataBinding() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDataBinding var2 = null;
         var2 = (CTDataBinding)this.get_store().add_element_user(DATABINDING$10);
         return var2;
      }
   }

   public void removeDataBinding(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATABINDING$10, var1);
      }
   }

   public List getTemporaryList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TemporaryList(this);
      }
   }

   public CTOnOff[] getTemporaryArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEMPORARY$12, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getTemporaryArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(TEMPORARY$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTemporaryArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEMPORARY$12);
      }
   }

   public void setTemporaryArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEMPORARY$12);
      }
   }

   public void setTemporaryArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(TEMPORARY$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewTemporary(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(TEMPORARY$12, var1);
         return var3;
      }
   }

   public CTOnOff addNewTemporary() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(TEMPORARY$12);
         return var2;
      }
   }

   public void removeTemporary(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEMPORARY$12, var1);
      }
   }

   public List getIdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1IdList(this);
      }
   }

   public CTDecimalNumber[] getIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ID$14, var2);
         CTDecimalNumber[] var3 = new CTDecimalNumber[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDecimalNumber getIdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(ID$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ID$14);
      }
   }

   public void setIdArray(CTDecimalNumber[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ID$14);
      }
   }

   public void setIdArray(int var1, CTDecimalNumber var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var4 = null;
         var4 = (CTDecimalNumber)this.get_store().find_element_user(ID$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDecimalNumber insertNewId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().insert_element_user(ID$14, var1);
         return var3;
      }
   }

   public CTDecimalNumber addNewId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(ID$14);
         return var2;
      }
   }

   public void removeId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ID$14, var1);
      }
   }

   public List getTagList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TagList(this);
      }
   }

   public CTString[] getTagArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TAG$16, var2);
         CTString[] var3 = new CTString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTString getTagArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(TAG$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTagArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TAG$16);
      }
   }

   public void setTagArray(CTString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TAG$16);
      }
   }

   public void setTagArray(int var1, CTString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var4 = null;
         var4 = (CTString)this.get_store().find_element_user(TAG$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTString insertNewTag(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().insert_element_user(TAG$16, var1);
         return var3;
      }
   }

   public CTString addNewTag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(TAG$16);
         return var2;
      }
   }

   public void removeTag(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TAG$16, var1);
      }
   }

   public List getEquationList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EquationList(this);
      }
   }

   public CTEmpty[] getEquationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EQUATION$18, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getEquationArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(EQUATION$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEquationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EQUATION$18);
      }
   }

   public void setEquationArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EQUATION$18);
      }
   }

   public void setEquationArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(EQUATION$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewEquation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(EQUATION$18, var1);
         return var3;
      }
   }

   public CTEmpty addNewEquation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(EQUATION$18);
         return var2;
      }
   }

   public void removeEquation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EQUATION$18, var1);
      }
   }

   public List getComboBoxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ComboBoxList(this);
      }
   }

   public CTSdtComboBox[] getComboBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMBOBOX$20, var2);
         CTSdtComboBox[] var3 = new CTSdtComboBox[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtComboBox getComboBoxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtComboBox var3 = null;
         var3 = (CTSdtComboBox)this.get_store().find_element_user(COMBOBOX$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfComboBoxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMBOBOX$20);
      }
   }

   public void setComboBoxArray(CTSdtComboBox[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMBOBOX$20);
      }
   }

   public void setComboBoxArray(int var1, CTSdtComboBox var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtComboBox var4 = null;
         var4 = (CTSdtComboBox)this.get_store().find_element_user(COMBOBOX$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtComboBox insertNewComboBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtComboBox var3 = null;
         var3 = (CTSdtComboBox)this.get_store().insert_element_user(COMBOBOX$20, var1);
         return var3;
      }
   }

   public CTSdtComboBox addNewComboBox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtComboBox var2 = null;
         var2 = (CTSdtComboBox)this.get_store().add_element_user(COMBOBOX$20);
         return var2;
      }
   }

   public void removeComboBox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMBOBOX$20, var1);
      }
   }

   public List getDateList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DateList(this);
      }
   }

   public CTSdtDate[] getDateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DATE$22, var2);
         CTSdtDate[] var3 = new CTSdtDate[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtDate getDateArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDate var3 = null;
         var3 = (CTSdtDate)this.get_store().find_element_user(DATE$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDateArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DATE$22);
      }
   }

   public void setDateArray(CTSdtDate[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DATE$22);
      }
   }

   public void setDateArray(int var1, CTSdtDate var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDate var4 = null;
         var4 = (CTSdtDate)this.get_store().find_element_user(DATE$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtDate insertNewDate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDate var3 = null;
         var3 = (CTSdtDate)this.get_store().insert_element_user(DATE$22, var1);
         return var3;
      }
   }

   public CTSdtDate addNewDate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDate var2 = null;
         var2 = (CTSdtDate)this.get_store().add_element_user(DATE$22);
         return var2;
      }
   }

   public void removeDate(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DATE$22, var1);
      }
   }

   public List getDocPartObjList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DocPartObjList(this);
      }
   }

   public CTSdtDocPart[] getDocPartObjArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DOCPARTOBJ$24, var2);
         CTSdtDocPart[] var3 = new CTSdtDocPart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtDocPart getDocPartObjArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var3 = null;
         var3 = (CTSdtDocPart)this.get_store().find_element_user(DOCPARTOBJ$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDocPartObjArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCPARTOBJ$24);
      }
   }

   public void setDocPartObjArray(CTSdtDocPart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DOCPARTOBJ$24);
      }
   }

   public void setDocPartObjArray(int var1, CTSdtDocPart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var4 = null;
         var4 = (CTSdtDocPart)this.get_store().find_element_user(DOCPARTOBJ$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtDocPart insertNewDocPartObj(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var3 = null;
         var3 = (CTSdtDocPart)this.get_store().insert_element_user(DOCPARTOBJ$24, var1);
         return var3;
      }
   }

   public CTSdtDocPart addNewDocPartObj() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var2 = null;
         var2 = (CTSdtDocPart)this.get_store().add_element_user(DOCPARTOBJ$24);
         return var2;
      }
   }

   public void removeDocPartObj(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCPARTOBJ$24, var1);
      }
   }

   public List getDocPartListList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DocPartListList(this);
      }
   }

   public CTSdtDocPart[] getDocPartListArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DOCPARTLIST$26, var2);
         CTSdtDocPart[] var3 = new CTSdtDocPart[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtDocPart getDocPartListArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var3 = null;
         var3 = (CTSdtDocPart)this.get_store().find_element_user(DOCPARTLIST$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDocPartListArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCPARTLIST$26);
      }
   }

   public void setDocPartListArray(CTSdtDocPart[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DOCPARTLIST$26);
      }
   }

   public void setDocPartListArray(int var1, CTSdtDocPart var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var4 = null;
         var4 = (CTSdtDocPart)this.get_store().find_element_user(DOCPARTLIST$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtDocPart insertNewDocPartList(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var3 = null;
         var3 = (CTSdtDocPart)this.get_store().insert_element_user(DOCPARTLIST$26, var1);
         return var3;
      }
   }

   public CTSdtDocPart addNewDocPartList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDocPart var2 = null;
         var2 = (CTSdtDocPart)this.get_store().add_element_user(DOCPARTLIST$26);
         return var2;
      }
   }

   public void removeDocPartList(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCPARTLIST$26, var1);
      }
   }

   public List getDropDownListList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DropDownListList(this);
      }
   }

   public CTSdtDropDownList[] getDropDownListArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DROPDOWNLIST$28, var2);
         CTSdtDropDownList[] var3 = new CTSdtDropDownList[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtDropDownList getDropDownListArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDropDownList var3 = null;
         var3 = (CTSdtDropDownList)this.get_store().find_element_user(DROPDOWNLIST$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDropDownListArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DROPDOWNLIST$28);
      }
   }

   public void setDropDownListArray(CTSdtDropDownList[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DROPDOWNLIST$28);
      }
   }

   public void setDropDownListArray(int var1, CTSdtDropDownList var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDropDownList var4 = null;
         var4 = (CTSdtDropDownList)this.get_store().find_element_user(DROPDOWNLIST$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtDropDownList insertNewDropDownList(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDropDownList var3 = null;
         var3 = (CTSdtDropDownList)this.get_store().insert_element_user(DROPDOWNLIST$28, var1);
         return var3;
      }
   }

   public CTSdtDropDownList addNewDropDownList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtDropDownList var2 = null;
         var2 = (CTSdtDropDownList)this.get_store().add_element_user(DROPDOWNLIST$28);
         return var2;
      }
   }

   public void removeDropDownList(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DROPDOWNLIST$28, var1);
      }
   }

   public List getPictureList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PictureList(this);
      }
   }

   public CTEmpty[] getPictureArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PICTURE$30, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getPictureArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(PICTURE$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPictureArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PICTURE$30);
      }
   }

   public void setPictureArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PICTURE$30);
      }
   }

   public void setPictureArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(PICTURE$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewPicture(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(PICTURE$30, var1);
         return var3;
      }
   }

   public CTEmpty addNewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(PICTURE$30);
         return var2;
      }
   }

   public void removePicture(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PICTURE$30, var1);
      }
   }

   public List getRichTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RichTextList(this);
      }
   }

   public CTEmpty[] getRichTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RICHTEXT$32, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getRichTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(RICHTEXT$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRichTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RICHTEXT$32);
      }
   }

   public void setRichTextArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RICHTEXT$32);
      }
   }

   public void setRichTextArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(RICHTEXT$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewRichText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(RICHTEXT$32, var1);
         return var3;
      }
   }

   public CTEmpty addNewRichText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(RICHTEXT$32);
         return var2;
      }
   }

   public void removeRichText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RICHTEXT$32, var1);
      }
   }

   public List getTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextList(this);
      }
   }

   public CTSdtText[] getTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXT$34, var2);
         CTSdtText[] var3 = new CTSdtText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSdtText getTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtText var3 = null;
         var3 = (CTSdtText)this.get_store().find_element_user(TEXT$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXT$34);
      }
   }

   public void setTextArray(CTSdtText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXT$34);
      }
   }

   public void setTextArray(int var1, CTSdtText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtText var4 = null;
         var4 = (CTSdtText)this.get_store().find_element_user(TEXT$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSdtText insertNewText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtText var3 = null;
         var3 = (CTSdtText)this.get_store().insert_element_user(TEXT$34, var1);
         return var3;
      }
   }

   public CTSdtText addNewText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSdtText var2 = null;
         var2 = (CTSdtText)this.get_store().add_element_user(TEXT$34);
         return var2;
      }
   }

   public void removeText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXT$34, var1);
      }
   }

   public List getCitationList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CitationList(this);
      }
   }

   public CTEmpty[] getCitationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CITATION$36, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getCitationArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(CITATION$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCitationArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CITATION$36);
      }
   }

   public void setCitationArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CITATION$36);
      }
   }

   public void setCitationArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(CITATION$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewCitation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(CITATION$36, var1);
         return var3;
      }
   }

   public CTEmpty addNewCitation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(CITATION$36);
         return var2;
      }
   }

   public void removeCitation(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CITATION$36, var1);
      }
   }

   public List getGroupList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GroupList(this);
      }
   }

   public CTEmpty[] getGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GROUP$38, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getGroupArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(GROUP$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GROUP$38);
      }
   }

   public void setGroupArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GROUP$38);
      }
   }

   public void setGroupArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(GROUP$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewGroup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(GROUP$38, var1);
         return var3;
      }
   }

   public CTEmpty addNewGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(GROUP$38);
         return var2;
      }
   }

   public void removeGroup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GROUP$38, var1);
      }
   }

   public List getBibliographyList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BibliographyList(this);
      }
   }

   public CTEmpty[] getBibliographyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BIBLIOGRAPHY$40, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getBibliographyArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(BIBLIOGRAPHY$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBibliographyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BIBLIOGRAPHY$40);
      }
   }

   public void setBibliographyArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BIBLIOGRAPHY$40);
      }
   }

   public void setBibliographyArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(BIBLIOGRAPHY$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewBibliography(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(BIBLIOGRAPHY$40, var1);
         return var3;
      }
   }

   public CTEmpty addNewBibliography() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(BIBLIOGRAPHY$40);
         return var2;
      }
   }

   public void removeBibliography(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BIBLIOGRAPHY$40, var1);
      }
   }

}
