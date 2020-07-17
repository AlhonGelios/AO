package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRuby;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSym;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1AnnotationRefList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1BrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1CommentReferenceList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1ContinuationSeparatorList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1CrList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1DayLongList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1DayShortList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1DelInstrTextList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1DelTextList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1DrawingList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1EndnoteRefList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1EndnoteReferenceList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1FldCharList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1FootnoteRefList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1FootnoteReferenceList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1InstrTextList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1LastRenderedPageBreakList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1MonthLongList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1MonthShortList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1NoBreakHyphenList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1ObjectList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1PgNumList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1PictList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1PtabList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1RubyList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1SeparatorList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1SoftHyphenList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1SymList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1TList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1TabList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1YearLongList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTRImpl.1YearShortList;

public class CTRImpl extends XmlComplexContentImpl implements CTR {

   private static final QName RPR$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
   private static final QName BR$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "br");
   private static final QName T$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "t");
   private static final QName DELTEXT$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "delText");
   private static final QName INSTRTEXT$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "instrText");
   private static final QName DELINSTRTEXT$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "delInstrText");
   private static final QName NOBREAKHYPHEN$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noBreakHyphen");
   private static final QName SOFTHYPHEN$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "softHyphen");
   private static final QName DAYSHORT$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dayShort");
   private static final QName MONTHSHORT$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "monthShort");
   private static final QName YEARSHORT$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "yearShort");
   private static final QName DAYLONG$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dayLong");
   private static final QName MONTHLONG$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "monthLong");
   private static final QName YEARLONG$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "yearLong");
   private static final QName ANNOTATIONREF$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "annotationRef");
   private static final QName FOOTNOTEREF$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnoteRef");
   private static final QName ENDNOTEREF$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnoteRef");
   private static final QName SEPARATOR$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "separator");
   private static final QName CONTINUATIONSEPARATOR$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "continuationSeparator");
   private static final QName SYM$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sym");
   private static final QName PGNUM$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgNum");
   private static final QName CR$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cr");
   private static final QName TAB$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tab");
   private static final QName OBJECT$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "object");
   private static final QName PICT$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pict");
   private static final QName FLDCHAR$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fldChar");
   private static final QName RUBY$52 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ruby");
   private static final QName FOOTNOTEREFERENCE$54 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnoteReference");
   private static final QName ENDNOTEREFERENCE$56 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnoteReference");
   private static final QName COMMENTREFERENCE$58 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentReference");
   private static final QName DRAWING$60 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawing");
   private static final QName PTAB$62 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ptab");
   private static final QName LASTRENDEREDPAGEBREAK$64 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lastRenderedPageBreak");
   private static final QName RSIDRPR$66 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRPr");
   private static final QName RSIDDEL$68 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidDel");
   private static final QName RSIDR$70 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidR");


   public CTRImpl(SchemaType var1) {
      super(var1);
   }

   public CTRPr getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().find_element_user(RPR$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$0) != 0;
      }
   }

   public void setRPr(CTRPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().find_element_user(RPR$0, 0);
         if(var3 == null) {
            var3 = (CTRPr)this.get_store().add_element_user(RPR$0);
         }

         var3.set(var1);
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

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$0, 0);
      }
   }

   public List getBrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BrList(this);
      }
   }

   public CTBr[] getBrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BR$2, var2);
         CTBr[] var3 = new CTBr[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBr getBrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBr var3 = null;
         var3 = (CTBr)this.get_store().find_element_user(BR$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BR$2);
      }
   }

   public void setBrArray(CTBr[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BR$2);
      }
   }

   public void setBrArray(int var1, CTBr var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBr var4 = null;
         var4 = (CTBr)this.get_store().find_element_user(BR$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBr insertNewBr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBr var3 = null;
         var3 = (CTBr)this.get_store().insert_element_user(BR$2, var1);
         return var3;
      }
   }

   public CTBr addNewBr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBr var2 = null;
         var2 = (CTBr)this.get_store().add_element_user(BR$2);
         return var2;
      }
   }

   public void removeBr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BR$2, var1);
      }
   }

   public List getTList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TList(this);
      }
   }

   public CTText[] getTArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(T$4, var2);
         CTText[] var3 = new CTText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTText getTArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().find_element_user(T$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(T$4);
      }
   }

   public void setTArray(CTText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, T$4);
      }
   }

   public void setTArray(int var1, CTText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var4 = null;
         var4 = (CTText)this.get_store().find_element_user(T$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTText insertNewT(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().insert_element_user(T$4, var1);
         return var3;
      }
   }

   public CTText addNewT() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var2 = null;
         var2 = (CTText)this.get_store().add_element_user(T$4);
         return var2;
      }
   }

   public void removeT(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(T$4, var1);
      }
   }

   public List getDelTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DelTextList(this);
      }
   }

   public CTText[] getDelTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DELTEXT$6, var2);
         CTText[] var3 = new CTText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTText getDelTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().find_element_user(DELTEXT$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDelTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DELTEXT$6);
      }
   }

   public void setDelTextArray(CTText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DELTEXT$6);
      }
   }

   public void setDelTextArray(int var1, CTText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var4 = null;
         var4 = (CTText)this.get_store().find_element_user(DELTEXT$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTText insertNewDelText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().insert_element_user(DELTEXT$6, var1);
         return var3;
      }
   }

   public CTText addNewDelText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var2 = null;
         var2 = (CTText)this.get_store().add_element_user(DELTEXT$6);
         return var2;
      }
   }

   public void removeDelText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DELTEXT$6, var1);
      }
   }

   public List getInstrTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1InstrTextList(this);
      }
   }

   public CTText[] getInstrTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INSTRTEXT$8, var2);
         CTText[] var3 = new CTText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTText getInstrTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().find_element_user(INSTRTEXT$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfInstrTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INSTRTEXT$8);
      }
   }

   public void setInstrTextArray(CTText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INSTRTEXT$8);
      }
   }

   public void setInstrTextArray(int var1, CTText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var4 = null;
         var4 = (CTText)this.get_store().find_element_user(INSTRTEXT$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTText insertNewInstrText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().insert_element_user(INSTRTEXT$8, var1);
         return var3;
      }
   }

   public CTText addNewInstrText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var2 = null;
         var2 = (CTText)this.get_store().add_element_user(INSTRTEXT$8);
         return var2;
      }
   }

   public void removeInstrText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INSTRTEXT$8, var1);
      }
   }

   public List getDelInstrTextList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DelInstrTextList(this);
      }
   }

   public CTText[] getDelInstrTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DELINSTRTEXT$10, var2);
         CTText[] var3 = new CTText[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTText getDelInstrTextArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().find_element_user(DELINSTRTEXT$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDelInstrTextArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DELINSTRTEXT$10);
      }
   }

   public void setDelInstrTextArray(CTText[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DELINSTRTEXT$10);
      }
   }

   public void setDelInstrTextArray(int var1, CTText var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var4 = null;
         var4 = (CTText)this.get_store().find_element_user(DELINSTRTEXT$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTText insertNewDelInstrText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var3 = null;
         var3 = (CTText)this.get_store().insert_element_user(DELINSTRTEXT$10, var1);
         return var3;
      }
   }

   public CTText addNewDelInstrText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTText var2 = null;
         var2 = (CTText)this.get_store().add_element_user(DELINSTRTEXT$10);
         return var2;
      }
   }

   public void removeDelInstrText(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DELINSTRTEXT$10, var1);
      }
   }

   public List getNoBreakHyphenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1NoBreakHyphenList(this);
      }
   }

   public CTEmpty[] getNoBreakHyphenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(NOBREAKHYPHEN$12, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getNoBreakHyphenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(NOBREAKHYPHEN$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfNoBreakHyphenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOBREAKHYPHEN$12);
      }
   }

   public void setNoBreakHyphenArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, NOBREAKHYPHEN$12);
      }
   }

   public void setNoBreakHyphenArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(NOBREAKHYPHEN$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewNoBreakHyphen(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(NOBREAKHYPHEN$12, var1);
         return var3;
      }
   }

   public CTEmpty addNewNoBreakHyphen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(NOBREAKHYPHEN$12);
         return var2;
      }
   }

   public void removeNoBreakHyphen(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOBREAKHYPHEN$12, var1);
      }
   }

   public List getSoftHyphenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SoftHyphenList(this);
      }
   }

   public CTEmpty[] getSoftHyphenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SOFTHYPHEN$14, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getSoftHyphenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(SOFTHYPHEN$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSoftHyphenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOFTHYPHEN$14);
      }
   }

   public void setSoftHyphenArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SOFTHYPHEN$14);
      }
   }

   public void setSoftHyphenArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(SOFTHYPHEN$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewSoftHyphen(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(SOFTHYPHEN$14, var1);
         return var3;
      }
   }

   public CTEmpty addNewSoftHyphen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(SOFTHYPHEN$14);
         return var2;
      }
   }

   public void removeSoftHyphen(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOFTHYPHEN$14, var1);
      }
   }

   public List getDayShortList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DayShortList(this);
      }
   }

   public CTEmpty[] getDayShortArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DAYSHORT$16, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getDayShortArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(DAYSHORT$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDayShortArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DAYSHORT$16);
      }
   }

   public void setDayShortArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DAYSHORT$16);
      }
   }

   public void setDayShortArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(DAYSHORT$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewDayShort(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(DAYSHORT$16, var1);
         return var3;
      }
   }

   public CTEmpty addNewDayShort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(DAYSHORT$16);
         return var2;
      }
   }

   public void removeDayShort(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DAYSHORT$16, var1);
      }
   }

   public List getMonthShortList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MonthShortList(this);
      }
   }

   public CTEmpty[] getMonthShortArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MONTHSHORT$18, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getMonthShortArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(MONTHSHORT$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMonthShortArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MONTHSHORT$18);
      }
   }

   public void setMonthShortArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MONTHSHORT$18);
      }
   }

   public void setMonthShortArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(MONTHSHORT$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewMonthShort(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(MONTHSHORT$18, var1);
         return var3;
      }
   }

   public CTEmpty addNewMonthShort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(MONTHSHORT$18);
         return var2;
      }
   }

   public void removeMonthShort(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MONTHSHORT$18, var1);
      }
   }

   public List getYearShortList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1YearShortList(this);
      }
   }

   public CTEmpty[] getYearShortArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(YEARSHORT$20, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getYearShortArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(YEARSHORT$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfYearShortArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(YEARSHORT$20);
      }
   }

   public void setYearShortArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, YEARSHORT$20);
      }
   }

   public void setYearShortArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(YEARSHORT$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewYearShort(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(YEARSHORT$20, var1);
         return var3;
      }
   }

   public CTEmpty addNewYearShort() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(YEARSHORT$20);
         return var2;
      }
   }

   public void removeYearShort(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(YEARSHORT$20, var1);
      }
   }

   public List getDayLongList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DayLongList(this);
      }
   }

   public CTEmpty[] getDayLongArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DAYLONG$22, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getDayLongArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(DAYLONG$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDayLongArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DAYLONG$22);
      }
   }

   public void setDayLongArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DAYLONG$22);
      }
   }

   public void setDayLongArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(DAYLONG$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewDayLong(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(DAYLONG$22, var1);
         return var3;
      }
   }

   public CTEmpty addNewDayLong() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(DAYLONG$22);
         return var2;
      }
   }

   public void removeDayLong(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DAYLONG$22, var1);
      }
   }

   public List getMonthLongList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1MonthLongList(this);
      }
   }

   public CTEmpty[] getMonthLongArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(MONTHLONG$24, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getMonthLongArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(MONTHLONG$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfMonthLongArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MONTHLONG$24);
      }
   }

   public void setMonthLongArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, MONTHLONG$24);
      }
   }

   public void setMonthLongArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(MONTHLONG$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewMonthLong(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(MONTHLONG$24, var1);
         return var3;
      }
   }

   public CTEmpty addNewMonthLong() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(MONTHLONG$24);
         return var2;
      }
   }

   public void removeMonthLong(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MONTHLONG$24, var1);
      }
   }

   public List getYearLongList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1YearLongList(this);
      }
   }

   public CTEmpty[] getYearLongArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(YEARLONG$26, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getYearLongArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(YEARLONG$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfYearLongArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(YEARLONG$26);
      }
   }

   public void setYearLongArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, YEARLONG$26);
      }
   }

   public void setYearLongArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(YEARLONG$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewYearLong(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(YEARLONG$26, var1);
         return var3;
      }
   }

   public CTEmpty addNewYearLong() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(YEARLONG$26);
         return var2;
      }
   }

   public void removeYearLong(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(YEARLONG$26, var1);
      }
   }

   public List getAnnotationRefList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AnnotationRefList(this);
      }
   }

   public CTEmpty[] getAnnotationRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ANNOTATIONREF$28, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getAnnotationRefArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(ANNOTATIONREF$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAnnotationRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ANNOTATIONREF$28);
      }
   }

   public void setAnnotationRefArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ANNOTATIONREF$28);
      }
   }

   public void setAnnotationRefArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(ANNOTATIONREF$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewAnnotationRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(ANNOTATIONREF$28, var1);
         return var3;
      }
   }

   public CTEmpty addNewAnnotationRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(ANNOTATIONREF$28);
         return var2;
      }
   }

   public void removeAnnotationRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ANNOTATIONREF$28, var1);
      }
   }

   public List getFootnoteRefList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FootnoteRefList(this);
      }
   }

   public CTEmpty[] getFootnoteRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FOOTNOTEREF$30, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getFootnoteRefArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(FOOTNOTEREF$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFootnoteRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FOOTNOTEREF$30);
      }
   }

   public void setFootnoteRefArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FOOTNOTEREF$30);
      }
   }

   public void setFootnoteRefArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(FOOTNOTEREF$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewFootnoteRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(FOOTNOTEREF$30, var1);
         return var3;
      }
   }

   public CTEmpty addNewFootnoteRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(FOOTNOTEREF$30);
         return var2;
      }
   }

   public void removeFootnoteRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FOOTNOTEREF$30, var1);
      }
   }

   public List getEndnoteRefList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EndnoteRefList(this);
      }
   }

   public CTEmpty[] getEndnoteRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENDNOTEREF$32, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getEndnoteRefArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(ENDNOTEREF$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEndnoteRefArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDNOTEREF$32);
      }
   }

   public void setEndnoteRefArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENDNOTEREF$32);
      }
   }

   public void setEndnoteRefArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(ENDNOTEREF$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewEndnoteRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(ENDNOTEREF$32, var1);
         return var3;
      }
   }

   public CTEmpty addNewEndnoteRef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(ENDNOTEREF$32);
         return var2;
      }
   }

   public void removeEndnoteRef(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDNOTEREF$32, var1);
      }
   }

   public List getSeparatorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SeparatorList(this);
      }
   }

   public CTEmpty[] getSeparatorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SEPARATOR$34, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getSeparatorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(SEPARATOR$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSeparatorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SEPARATOR$34);
      }
   }

   public void setSeparatorArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SEPARATOR$34);
      }
   }

   public void setSeparatorArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(SEPARATOR$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewSeparator(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(SEPARATOR$34, var1);
         return var3;
      }
   }

   public CTEmpty addNewSeparator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(SEPARATOR$34);
         return var2;
      }
   }

   public void removeSeparator(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SEPARATOR$34, var1);
      }
   }

   public List getContinuationSeparatorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ContinuationSeparatorList(this);
      }
   }

   public CTEmpty[] getContinuationSeparatorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CONTINUATIONSEPARATOR$36, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getContinuationSeparatorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(CONTINUATIONSEPARATOR$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfContinuationSeparatorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONTINUATIONSEPARATOR$36);
      }
   }

   public void setContinuationSeparatorArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CONTINUATIONSEPARATOR$36);
      }
   }

   public void setContinuationSeparatorArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(CONTINUATIONSEPARATOR$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewContinuationSeparator(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(CONTINUATIONSEPARATOR$36, var1);
         return var3;
      }
   }

   public CTEmpty addNewContinuationSeparator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(CONTINUATIONSEPARATOR$36);
         return var2;
      }
   }

   public void removeContinuationSeparator(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONTINUATIONSEPARATOR$36, var1);
      }
   }

   public List getSymList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SymList(this);
      }
   }

   public CTSym[] getSymArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SYM$38, var2);
         CTSym[] var3 = new CTSym[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSym getSymArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSym var3 = null;
         var3 = (CTSym)this.get_store().find_element_user(SYM$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSymArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SYM$38);
      }
   }

   public void setSymArray(CTSym[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SYM$38);
      }
   }

   public void setSymArray(int var1, CTSym var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSym var4 = null;
         var4 = (CTSym)this.get_store().find_element_user(SYM$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSym insertNewSym(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSym var3 = null;
         var3 = (CTSym)this.get_store().insert_element_user(SYM$38, var1);
         return var3;
      }
   }

   public CTSym addNewSym() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSym var2 = null;
         var2 = (CTSym)this.get_store().add_element_user(SYM$38);
         return var2;
      }
   }

   public void removeSym(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SYM$38, var1);
      }
   }

   public List getPgNumList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PgNumList(this);
      }
   }

   public CTEmpty[] getPgNumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PGNUM$40, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getPgNumArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(PGNUM$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPgNumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PGNUM$40);
      }
   }

   public void setPgNumArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PGNUM$40);
      }
   }

   public void setPgNumArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(PGNUM$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewPgNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(PGNUM$40, var1);
         return var3;
      }
   }

   public CTEmpty addNewPgNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(PGNUM$40);
         return var2;
      }
   }

   public void removePgNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PGNUM$40, var1);
      }
   }

   public List getCrList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CrList(this);
      }
   }

   public CTEmpty[] getCrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CR$42, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getCrArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(CR$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCrArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CR$42);
      }
   }

   public void setCrArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CR$42);
      }
   }

   public void setCrArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(CR$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewCr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(CR$42, var1);
         return var3;
      }
   }

   public CTEmpty addNewCr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(CR$42);
         return var2;
      }
   }

   public void removeCr(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CR$42, var1);
      }
   }

   public List getTabList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TabList(this);
      }
   }

   public CTEmpty[] getTabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TAB$44, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getTabArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(TAB$44, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TAB$44);
      }
   }

   public void setTabArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TAB$44);
      }
   }

   public void setTabArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(TAB$44, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewTab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(TAB$44, var1);
         return var3;
      }
   }

   public CTEmpty addNewTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(TAB$44);
         return var2;
      }
   }

   public void removeTab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TAB$44, var1);
      }
   }

   public List getObjectList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ObjectList(this);
      }
   }

   public CTObject[] getObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OBJECT$46, var2);
         CTObject[] var3 = new CTObject[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTObject getObjectArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObject var3 = null;
         var3 = (CTObject)this.get_store().find_element_user(OBJECT$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfObjectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OBJECT$46);
      }
   }

   public void setObjectArray(CTObject[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OBJECT$46);
      }
   }

   public void setObjectArray(int var1, CTObject var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObject var4 = null;
         var4 = (CTObject)this.get_store().find_element_user(OBJECT$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTObject insertNewObject(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObject var3 = null;
         var3 = (CTObject)this.get_store().insert_element_user(OBJECT$46, var1);
         return var3;
      }
   }

   public CTObject addNewObject() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTObject var2 = null;
         var2 = (CTObject)this.get_store().add_element_user(OBJECT$46);
         return var2;
      }
   }

   public void removeObject(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OBJECT$46, var1);
      }
   }

   public List getPictList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PictList(this);
      }
   }

   public CTPicture[] getPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PICT$48, var2);
         CTPicture[] var3 = new CTPicture[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPicture getPictArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var3 = null;
         var3 = (CTPicture)this.get_store().find_element_user(PICT$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPictArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PICT$48);
      }
   }

   public void setPictArray(CTPicture[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PICT$48);
      }
   }

   public void setPictArray(int var1, CTPicture var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var4 = null;
         var4 = (CTPicture)this.get_store().find_element_user(PICT$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPicture insertNewPict(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var3 = null;
         var3 = (CTPicture)this.get_store().insert_element_user(PICT$48, var1);
         return var3;
      }
   }

   public CTPicture addNewPict() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPicture var2 = null;
         var2 = (CTPicture)this.get_store().add_element_user(PICT$48);
         return var2;
      }
   }

   public void removePict(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PICT$48, var1);
      }
   }

   public List getFldCharList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FldCharList(this);
      }
   }

   public CTFldChar[] getFldCharArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FLDCHAR$50, var2);
         CTFldChar[] var3 = new CTFldChar[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFldChar getFldCharArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFldChar var3 = null;
         var3 = (CTFldChar)this.get_store().find_element_user(FLDCHAR$50, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFldCharArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FLDCHAR$50);
      }
   }

   public void setFldCharArray(CTFldChar[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FLDCHAR$50);
      }
   }

   public void setFldCharArray(int var1, CTFldChar var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFldChar var4 = null;
         var4 = (CTFldChar)this.get_store().find_element_user(FLDCHAR$50, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFldChar insertNewFldChar(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFldChar var3 = null;
         var3 = (CTFldChar)this.get_store().insert_element_user(FLDCHAR$50, var1);
         return var3;
      }
   }

   public CTFldChar addNewFldChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFldChar var2 = null;
         var2 = (CTFldChar)this.get_store().add_element_user(FLDCHAR$50);
         return var2;
      }
   }

   public void removeFldChar(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FLDCHAR$50, var1);
      }
   }

   public List getRubyList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RubyList(this);
      }
   }

   public CTRuby[] getRubyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RUBY$52, var2);
         CTRuby[] var3 = new CTRuby[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRuby getRubyArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRuby var3 = null;
         var3 = (CTRuby)this.get_store().find_element_user(RUBY$52, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRubyArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RUBY$52);
      }
   }

   public void setRubyArray(CTRuby[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RUBY$52);
      }
   }

   public void setRubyArray(int var1, CTRuby var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRuby var4 = null;
         var4 = (CTRuby)this.get_store().find_element_user(RUBY$52, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRuby insertNewRuby(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRuby var3 = null;
         var3 = (CTRuby)this.get_store().insert_element_user(RUBY$52, var1);
         return var3;
      }
   }

   public CTRuby addNewRuby() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRuby var2 = null;
         var2 = (CTRuby)this.get_store().add_element_user(RUBY$52);
         return var2;
      }
   }

   public void removeRuby(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RUBY$52, var1);
      }
   }

   public List getFootnoteReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FootnoteReferenceList(this);
      }
   }

   public CTFtnEdnRef[] getFootnoteReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FOOTNOTEREFERENCE$54, var2);
         CTFtnEdnRef[] var3 = new CTFtnEdnRef[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFtnEdnRef getFootnoteReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var3 = null;
         var3 = (CTFtnEdnRef)this.get_store().find_element_user(FOOTNOTEREFERENCE$54, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFootnoteReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FOOTNOTEREFERENCE$54);
      }
   }

   public void setFootnoteReferenceArray(CTFtnEdnRef[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FOOTNOTEREFERENCE$54);
      }
   }

   public void setFootnoteReferenceArray(int var1, CTFtnEdnRef var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var4 = null;
         var4 = (CTFtnEdnRef)this.get_store().find_element_user(FOOTNOTEREFERENCE$54, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFtnEdnRef insertNewFootnoteReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var3 = null;
         var3 = (CTFtnEdnRef)this.get_store().insert_element_user(FOOTNOTEREFERENCE$54, var1);
         return var3;
      }
   }

   public CTFtnEdnRef addNewFootnoteReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var2 = null;
         var2 = (CTFtnEdnRef)this.get_store().add_element_user(FOOTNOTEREFERENCE$54);
         return var2;
      }
   }

   public void removeFootnoteReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FOOTNOTEREFERENCE$54, var1);
      }
   }

   public List getEndnoteReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1EndnoteReferenceList(this);
      }
   }

   public CTFtnEdnRef[] getEndnoteReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ENDNOTEREFERENCE$56, var2);
         CTFtnEdnRef[] var3 = new CTFtnEdnRef[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFtnEdnRef getEndnoteReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var3 = null;
         var3 = (CTFtnEdnRef)this.get_store().find_element_user(ENDNOTEREFERENCE$56, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfEndnoteReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDNOTEREFERENCE$56);
      }
   }

   public void setEndnoteReferenceArray(CTFtnEdnRef[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ENDNOTEREFERENCE$56);
      }
   }

   public void setEndnoteReferenceArray(int var1, CTFtnEdnRef var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var4 = null;
         var4 = (CTFtnEdnRef)this.get_store().find_element_user(ENDNOTEREFERENCE$56, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFtnEdnRef insertNewEndnoteReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var3 = null;
         var3 = (CTFtnEdnRef)this.get_store().insert_element_user(ENDNOTEREFERENCE$56, var1);
         return var3;
      }
   }

   public CTFtnEdnRef addNewEndnoteReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnEdnRef var2 = null;
         var2 = (CTFtnEdnRef)this.get_store().add_element_user(ENDNOTEREFERENCE$56);
         return var2;
      }
   }

   public void removeEndnoteReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDNOTEREFERENCE$56, var1);
      }
   }

   public List getCommentReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CommentReferenceList(this);
      }
   }

   public CTMarkup[] getCommentReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMMENTREFERENCE$58, var2);
         CTMarkup[] var3 = new CTMarkup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTMarkup getCommentReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().find_element_user(COMMENTREFERENCE$58, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCommentReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMMENTREFERENCE$58);
      }
   }

   public void setCommentReferenceArray(CTMarkup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMMENTREFERENCE$58);
      }
   }

   public void setCommentReferenceArray(int var1, CTMarkup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var4 = null;
         var4 = (CTMarkup)this.get_store().find_element_user(COMMENTREFERENCE$58, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTMarkup insertNewCommentReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var3 = null;
         var3 = (CTMarkup)this.get_store().insert_element_user(COMMENTREFERENCE$58, var1);
         return var3;
      }
   }

   public CTMarkup addNewCommentReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMarkup var2 = null;
         var2 = (CTMarkup)this.get_store().add_element_user(COMMENTREFERENCE$58);
         return var2;
      }
   }

   public void removeCommentReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMMENTREFERENCE$58, var1);
      }
   }

   public List getDrawingList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DrawingList(this);
      }
   }

   public CTDrawing[] getDrawingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DRAWING$60, var2);
         CTDrawing[] var3 = new CTDrawing[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDrawing getDrawingArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var3 = null;
         var3 = (CTDrawing)this.get_store().find_element_user(DRAWING$60, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDrawingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWING$60);
      }
   }

   public void setDrawingArray(CTDrawing[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DRAWING$60);
      }
   }

   public void setDrawingArray(int var1, CTDrawing var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var4 = null;
         var4 = (CTDrawing)this.get_store().find_element_user(DRAWING$60, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDrawing insertNewDrawing(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var3 = null;
         var3 = (CTDrawing)this.get_store().insert_element_user(DRAWING$60, var1);
         return var3;
      }
   }

   public CTDrawing addNewDrawing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDrawing var2 = null;
         var2 = (CTDrawing)this.get_store().add_element_user(DRAWING$60);
         return var2;
      }
   }

   public void removeDrawing(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWING$60, var1);
      }
   }

   public List getPtabList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PtabList(this);
      }
   }

   public CTPTab[] getPtabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PTAB$62, var2);
         CTPTab[] var3 = new CTPTab[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPTab getPtabArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPTab var3 = null;
         var3 = (CTPTab)this.get_store().find_element_user(PTAB$62, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPtabArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PTAB$62);
      }
   }

   public void setPtabArray(CTPTab[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PTAB$62);
      }
   }

   public void setPtabArray(int var1, CTPTab var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPTab var4 = null;
         var4 = (CTPTab)this.get_store().find_element_user(PTAB$62, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPTab insertNewPtab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPTab var3 = null;
         var3 = (CTPTab)this.get_store().insert_element_user(PTAB$62, var1);
         return var3;
      }
   }

   public CTPTab addNewPtab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPTab var2 = null;
         var2 = (CTPTab)this.get_store().add_element_user(PTAB$62);
         return var2;
      }
   }

   public void removePtab(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PTAB$62, var1);
      }
   }

   public List getLastRenderedPageBreakList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LastRenderedPageBreakList(this);
      }
   }

   public CTEmpty[] getLastRenderedPageBreakArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LASTRENDEREDPAGEBREAK$64, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getLastRenderedPageBreakArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(LASTRENDEREDPAGEBREAK$64, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLastRenderedPageBreakArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LASTRENDEREDPAGEBREAK$64);
      }
   }

   public void setLastRenderedPageBreakArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LASTRENDEREDPAGEBREAK$64);
      }
   }

   public void setLastRenderedPageBreakArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(LASTRENDEREDPAGEBREAK$64, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewLastRenderedPageBreak(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(LASTRENDEREDPAGEBREAK$64, var1);
         return var3;
      }
   }

   public CTEmpty addNewLastRenderedPageBreak() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(LASTRENDEREDPAGEBREAK$64);
         return var2;
      }
   }

   public void removeLastRenderedPageBreak(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LASTRENDEREDPAGEBREAK$64, var1);
      }
   }

   public byte[] getRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDRPR$66);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDRPR$66);
         return var2;
      }
   }

   public boolean isSetRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDRPR$66) != null;
      }
   }

   public void setRsidRPr(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDRPR$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDRPR$66);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidRPr(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDRPR$66);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDRPR$66);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDRPR$66);
      }
   }

   public byte[] getRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDDEL$68);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDDEL$68);
         return var2;
      }
   }

   public boolean isSetRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDDEL$68) != null;
      }
   }

   public void setRsidDel(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDDEL$68);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDDEL$68);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidDel(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDDEL$68);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDDEL$68);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDDEL$68);
      }
   }

   public byte[] getRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDR$70);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDR$70);
         return var2;
      }
   }

   public boolean isSetRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDR$70) != null;
      }
   }

   public void setRsidR(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDR$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDR$70);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidR(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDR$70);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDR$70);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDR$70);
      }
   }

}
