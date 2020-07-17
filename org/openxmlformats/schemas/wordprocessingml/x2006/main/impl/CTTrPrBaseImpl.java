package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1CantSplitList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1CnfStyleList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1DivIdList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1GridAfterList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1GridBeforeList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1HiddenList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1JcList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1TblCellSpacingList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1TblHeaderList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1TrHeightList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1WAfterList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTTrPrBaseImpl.1WBeforeList;

public class CTTrPrBaseImpl extends XmlComplexContentImpl implements CTTrPrBase {

   private static final QName CNFSTYLE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cnfStyle");
   private static final QName DIVID$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "divId");
   private static final QName GRIDBEFORE$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridBefore");
   private static final QName GRIDAFTER$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gridAfter");
   private static final QName WBEFORE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "wBefore");
   private static final QName WAFTER$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "wAfter");
   private static final QName CANTSPLIT$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cantSplit");
   private static final QName TRHEIGHT$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trHeight");
   private static final QName TBLHEADER$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblHeader");
   private static final QName TBLCELLSPACING$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tblCellSpacing");
   private static final QName JC$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
   private static final QName HIDDEN$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hidden");


   public CTTrPrBaseImpl(SchemaType var1) {
      super(var1);
   }

   public List getCnfStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CnfStyleList(this);
      }
   }

   public CTCnf[] getCnfStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CNFSTYLE$0, var2);
         CTCnf[] var3 = new CTCnf[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCnf getCnfStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var3 = null;
         var3 = (CTCnf)this.get_store().find_element_user(CNFSTYLE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCnfStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CNFSTYLE$0);
      }
   }

   public void setCnfStyleArray(CTCnf[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CNFSTYLE$0);
      }
   }

   public void setCnfStyleArray(int var1, CTCnf var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var4 = null;
         var4 = (CTCnf)this.get_store().find_element_user(CNFSTYLE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCnf insertNewCnfStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var3 = null;
         var3 = (CTCnf)this.get_store().insert_element_user(CNFSTYLE$0, var1);
         return var3;
      }
   }

   public CTCnf addNewCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var2 = null;
         var2 = (CTCnf)this.get_store().add_element_user(CNFSTYLE$0);
         return var2;
      }
   }

   public void removeCnfStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CNFSTYLE$0, var1);
      }
   }

   public List getDivIdList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DivIdList(this);
      }
   }

   public CTDecimalNumber[] getDivIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DIVID$2, var2);
         CTDecimalNumber[] var3 = new CTDecimalNumber[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDecimalNumber getDivIdArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(DIVID$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDivIdArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIVID$2);
      }
   }

   public void setDivIdArray(CTDecimalNumber[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DIVID$2);
      }
   }

   public void setDivIdArray(int var1, CTDecimalNumber var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var4 = null;
         var4 = (CTDecimalNumber)this.get_store().find_element_user(DIVID$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDecimalNumber insertNewDivId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().insert_element_user(DIVID$2, var1);
         return var3;
      }
   }

   public CTDecimalNumber addNewDivId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(DIVID$2);
         return var2;
      }
   }

   public void removeDivId(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIVID$2, var1);
      }
   }

   public List getGridBeforeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GridBeforeList(this);
      }
   }

   public CTDecimalNumber[] getGridBeforeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRIDBEFORE$4, var2);
         CTDecimalNumber[] var3 = new CTDecimalNumber[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDecimalNumber getGridBeforeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(GRIDBEFORE$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGridBeforeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRIDBEFORE$4);
      }
   }

   public void setGridBeforeArray(CTDecimalNumber[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRIDBEFORE$4);
      }
   }

   public void setGridBeforeArray(int var1, CTDecimalNumber var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var4 = null;
         var4 = (CTDecimalNumber)this.get_store().find_element_user(GRIDBEFORE$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDecimalNumber insertNewGridBefore(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().insert_element_user(GRIDBEFORE$4, var1);
         return var3;
      }
   }

   public CTDecimalNumber addNewGridBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(GRIDBEFORE$4);
         return var2;
      }
   }

   public void removeGridBefore(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRIDBEFORE$4, var1);
      }
   }

   public List getGridAfterList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GridAfterList(this);
      }
   }

   public CTDecimalNumber[] getGridAfterArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRIDAFTER$6, var2);
         CTDecimalNumber[] var3 = new CTDecimalNumber[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDecimalNumber getGridAfterArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(GRIDAFTER$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGridAfterArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRIDAFTER$6);
      }
   }

   public void setGridAfterArray(CTDecimalNumber[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRIDAFTER$6);
      }
   }

   public void setGridAfterArray(int var1, CTDecimalNumber var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var4 = null;
         var4 = (CTDecimalNumber)this.get_store().find_element_user(GRIDAFTER$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDecimalNumber insertNewGridAfter(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().insert_element_user(GRIDAFTER$6, var1);
         return var3;
      }
   }

   public CTDecimalNumber addNewGridAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(GRIDAFTER$6);
         return var2;
      }
   }

   public void removeGridAfter(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRIDAFTER$6, var1);
      }
   }

   public List getWBeforeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1WBeforeList(this);
      }
   }

   public CTTblWidth[] getWBeforeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(WBEFORE$8, var2);
         CTTblWidth[] var3 = new CTTblWidth[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTblWidth getWBeforeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(WBEFORE$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfWBeforeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WBEFORE$8);
      }
   }

   public void setWBeforeArray(CTTblWidth[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, WBEFORE$8);
      }
   }

   public void setWBeforeArray(int var1, CTTblWidth var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var4 = null;
         var4 = (CTTblWidth)this.get_store().find_element_user(WBEFORE$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTblWidth insertNewWBefore(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().insert_element_user(WBEFORE$8, var1);
         return var3;
      }
   }

   public CTTblWidth addNewWBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(WBEFORE$8);
         return var2;
      }
   }

   public void removeWBefore(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WBEFORE$8, var1);
      }
   }

   public List getWAfterList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1WAfterList(this);
      }
   }

   public CTTblWidth[] getWAfterArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(WAFTER$10, var2);
         CTTblWidth[] var3 = new CTTblWidth[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTblWidth getWAfterArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(WAFTER$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfWAfterArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WAFTER$10);
      }
   }

   public void setWAfterArray(CTTblWidth[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, WAFTER$10);
      }
   }

   public void setWAfterArray(int var1, CTTblWidth var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var4 = null;
         var4 = (CTTblWidth)this.get_store().find_element_user(WAFTER$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTblWidth insertNewWAfter(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().insert_element_user(WAFTER$10, var1);
         return var3;
      }
   }

   public CTTblWidth addNewWAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(WAFTER$10);
         return var2;
      }
   }

   public void removeWAfter(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WAFTER$10, var1);
      }
   }

   public List getCantSplitList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CantSplitList(this);
      }
   }

   public CTOnOff[] getCantSplitArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CANTSPLIT$12, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getCantSplitArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(CANTSPLIT$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCantSplitArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CANTSPLIT$12);
      }
   }

   public void setCantSplitArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CANTSPLIT$12);
      }
   }

   public void setCantSplitArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(CANTSPLIT$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewCantSplit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(CANTSPLIT$12, var1);
         return var3;
      }
   }

   public CTOnOff addNewCantSplit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(CANTSPLIT$12);
         return var2;
      }
   }

   public void removeCantSplit(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CANTSPLIT$12, var1);
      }
   }

   public List getTrHeightList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TrHeightList(this);
      }
   }

   public CTHeight[] getTrHeightArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TRHEIGHT$14, var2);
         CTHeight[] var3 = new CTHeight[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHeight getTrHeightArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeight var3 = null;
         var3 = (CTHeight)this.get_store().find_element_user(TRHEIGHT$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTrHeightArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRHEIGHT$14);
      }
   }

   public void setTrHeightArray(CTHeight[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TRHEIGHT$14);
      }
   }

   public void setTrHeightArray(int var1, CTHeight var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeight var4 = null;
         var4 = (CTHeight)this.get_store().find_element_user(TRHEIGHT$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHeight insertNewTrHeight(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeight var3 = null;
         var3 = (CTHeight)this.get_store().insert_element_user(TRHEIGHT$14, var1);
         return var3;
      }
   }

   public CTHeight addNewTrHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeight var2 = null;
         var2 = (CTHeight)this.get_store().add_element_user(TRHEIGHT$14);
         return var2;
      }
   }

   public void removeTrHeight(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRHEIGHT$14, var1);
      }
   }

   public List getTblHeaderList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TblHeaderList(this);
      }
   }

   public CTOnOff[] getTblHeaderArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TBLHEADER$16, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getTblHeaderArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(TBLHEADER$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTblHeaderArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLHEADER$16);
      }
   }

   public void setTblHeaderArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TBLHEADER$16);
      }
   }

   public void setTblHeaderArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(TBLHEADER$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewTblHeader(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(TBLHEADER$16, var1);
         return var3;
      }
   }

   public CTOnOff addNewTblHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(TBLHEADER$16);
         return var2;
      }
   }

   public void removeTblHeader(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLHEADER$16, var1);
      }
   }

   public List getTblCellSpacingList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TblCellSpacingList(this);
      }
   }

   public CTTblWidth[] getTblCellSpacingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TBLCELLSPACING$18, var2);
         CTTblWidth[] var3 = new CTTblWidth[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTblWidth getTblCellSpacingArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().find_element_user(TBLCELLSPACING$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTblCellSpacingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TBLCELLSPACING$18);
      }
   }

   public void setTblCellSpacingArray(CTTblWidth[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TBLCELLSPACING$18);
      }
   }

   public void setTblCellSpacingArray(int var1, CTTblWidth var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var4 = null;
         var4 = (CTTblWidth)this.get_store().find_element_user(TBLCELLSPACING$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTblWidth insertNewTblCellSpacing(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var3 = null;
         var3 = (CTTblWidth)this.get_store().insert_element_user(TBLCELLSPACING$18, var1);
         return var3;
      }
   }

   public CTTblWidth addNewTblCellSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTblWidth var2 = null;
         var2 = (CTTblWidth)this.get_store().add_element_user(TBLCELLSPACING$18);
         return var2;
      }
   }

   public void removeTblCellSpacing(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TBLCELLSPACING$18, var1);
      }
   }

   public List getJcList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1JcList(this);
      }
   }

   public CTJc[] getJcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(JC$20, var2);
         CTJc[] var3 = new CTJc[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTJc getJcArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var3 = null;
         var3 = (CTJc)this.get_store().find_element_user(JC$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfJcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(JC$20);
      }
   }

   public void setJcArray(CTJc[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, JC$20);
      }
   }

   public void setJcArray(int var1, CTJc var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var4 = null;
         var4 = (CTJc)this.get_store().find_element_user(JC$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTJc insertNewJc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var3 = null;
         var3 = (CTJc)this.get_store().insert_element_user(JC$20, var1);
         return var3;
      }
   }

   public CTJc addNewJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().add_element_user(JC$20);
         return var2;
      }
   }

   public void removeJc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(JC$20, var1);
      }
   }

   public List getHiddenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HiddenList(this);
      }
   }

   public CTOnOff[] getHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HIDDEN$22, var2);
         CTOnOff[] var3 = new CTOnOff[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOnOff getHiddenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(HIDDEN$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHiddenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIDDEN$22);
      }
   }

   public void setHiddenArray(CTOnOff[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HIDDEN$22);
      }
   }

   public void setHiddenArray(int var1, CTOnOff var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var4 = null;
         var4 = (CTOnOff)this.get_store().find_element_user(HIDDEN$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOnOff insertNewHidden(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().insert_element_user(HIDDEN$22, var1);
         return var3;
      }
   }

   public CTOnOff addNewHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(HIDDEN$22);
         return var2;
      }
   }

   public void removeHidden(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIDDEN$22, var1);
      }
   }

}
