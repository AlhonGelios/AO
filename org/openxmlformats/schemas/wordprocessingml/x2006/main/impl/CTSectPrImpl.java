package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColumns;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnProps;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtrRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLineNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPageSz;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPaperSource;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSectPrImpl.1FooterReferenceList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSectPrImpl.1HeaderReferenceList;

public class CTSectPrImpl extends XmlComplexContentImpl implements CTSectPr {

   private static final QName HEADERREFERENCE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "headerReference");
   private static final QName FOOTERREFERENCE$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footerReference");
   private static final QName FOOTNOTEPR$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotePr");
   private static final QName ENDNOTEPR$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotePr");
   private static final QName TYPE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
   private static final QName PGSZ$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgSz");
   private static final QName PGMAR$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgMar");
   private static final QName PAPERSRC$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "paperSrc");
   private static final QName PGBORDERS$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgBorders");
   private static final QName LNNUMTYPE$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lnNumType");
   private static final QName PGNUMTYPE$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pgNumType");
   private static final QName COLS$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cols");
   private static final QName FORMPROT$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formProt");
   private static final QName VALIGN$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vAlign");
   private static final QName NOENDNOTE$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noEndnote");
   private static final QName TITLEPG$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "titlePg");
   private static final QName TEXTDIRECTION$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textDirection");
   private static final QName BIDI$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidi");
   private static final QName RTLGUTTER$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rtlGutter");
   private static final QName DOCGRID$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docGrid");
   private static final QName PRINTERSETTINGS$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printerSettings");
   private static final QName SECTPRCHANGE$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sectPrChange");
   private static final QName RSIDRPR$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidRPr");
   private static final QName RSIDDEL$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidDel");
   private static final QName RSIDR$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidR");
   private static final QName RSIDSECT$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsidSect");


   public CTSectPrImpl(SchemaType var1) {
      super(var1);
   }

   public List getHeaderReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HeaderReferenceList(this);
      }
   }

   public CTHdrFtrRef[] getHeaderReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HEADERREFERENCE$0, var2);
         CTHdrFtrRef[] var3 = new CTHdrFtrRef[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHdrFtrRef getHeaderReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var3 = null;
         var3 = (CTHdrFtrRef)this.get_store().find_element_user(HEADERREFERENCE$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHeaderReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HEADERREFERENCE$0);
      }
   }

   public void setHeaderReferenceArray(CTHdrFtrRef[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HEADERREFERENCE$0);
      }
   }

   public void setHeaderReferenceArray(int var1, CTHdrFtrRef var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var4 = null;
         var4 = (CTHdrFtrRef)this.get_store().find_element_user(HEADERREFERENCE$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHdrFtrRef insertNewHeaderReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var3 = null;
         var3 = (CTHdrFtrRef)this.get_store().insert_element_user(HEADERREFERENCE$0, var1);
         return var3;
      }
   }

   public CTHdrFtrRef addNewHeaderReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var2 = null;
         var2 = (CTHdrFtrRef)this.get_store().add_element_user(HEADERREFERENCE$0);
         return var2;
      }
   }

   public void removeHeaderReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HEADERREFERENCE$0, var1);
      }
   }

   public List getFooterReferenceList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FooterReferenceList(this);
      }
   }

   public CTHdrFtrRef[] getFooterReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FOOTERREFERENCE$2, var2);
         CTHdrFtrRef[] var3 = new CTHdrFtrRef[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHdrFtrRef getFooterReferenceArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var3 = null;
         var3 = (CTHdrFtrRef)this.get_store().find_element_user(FOOTERREFERENCE$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFooterReferenceArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FOOTERREFERENCE$2);
      }
   }

   public void setFooterReferenceArray(CTHdrFtrRef[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FOOTERREFERENCE$2);
      }
   }

   public void setFooterReferenceArray(int var1, CTHdrFtrRef var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var4 = null;
         var4 = (CTHdrFtrRef)this.get_store().find_element_user(FOOTERREFERENCE$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHdrFtrRef insertNewFooterReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var3 = null;
         var3 = (CTHdrFtrRef)this.get_store().insert_element_user(FOOTERREFERENCE$2, var1);
         return var3;
      }
   }

   public CTHdrFtrRef addNewFooterReference() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHdrFtrRef var2 = null;
         var2 = (CTHdrFtrRef)this.get_store().add_element_user(FOOTERREFERENCE$2);
         return var2;
      }
   }

   public void removeFooterReference(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FOOTERREFERENCE$2, var1);
      }
   }

   public CTFtnProps getFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnProps var2 = null;
         var2 = (CTFtnProps)this.get_store().find_element_user(FOOTNOTEPR$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FOOTNOTEPR$4) != 0;
      }
   }

   public void setFootnotePr(CTFtnProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnProps var3 = null;
         var3 = (CTFtnProps)this.get_store().find_element_user(FOOTNOTEPR$4, 0);
         if(var3 == null) {
            var3 = (CTFtnProps)this.get_store().add_element_user(FOOTNOTEPR$4);
         }

         var3.set(var1);
      }
   }

   public CTFtnProps addNewFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnProps var2 = null;
         var2 = (CTFtnProps)this.get_store().add_element_user(FOOTNOTEPR$4);
         return var2;
      }
   }

   public void unsetFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FOOTNOTEPR$4, 0);
      }
   }

   public CTEdnProps getEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEdnProps var2 = null;
         var2 = (CTEdnProps)this.get_store().find_element_user(ENDNOTEPR$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDNOTEPR$6) != 0;
      }
   }

   public void setEndnotePr(CTEdnProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEdnProps var3 = null;
         var3 = (CTEdnProps)this.get_store().find_element_user(ENDNOTEPR$6, 0);
         if(var3 == null) {
            var3 = (CTEdnProps)this.get_store().add_element_user(ENDNOTEPR$6);
         }

         var3.set(var1);
      }
   }

   public CTEdnProps addNewEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEdnProps var2 = null;
         var2 = (CTEdnProps)this.get_store().add_element_user(ENDNOTEPR$6);
         return var2;
      }
   }

   public void unsetEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDNOTEPR$6, 0);
      }
   }

   public CTSectType getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectType var2 = null;
         var2 = (CTSectType)this.get_store().find_element_user(TYPE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TYPE$8) != 0;
      }
   }

   public void setType(CTSectType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectType var3 = null;
         var3 = (CTSectType)this.get_store().find_element_user(TYPE$8, 0);
         if(var3 == null) {
            var3 = (CTSectType)this.get_store().add_element_user(TYPE$8);
         }

         var3.set(var1);
      }
   }

   public CTSectType addNewType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectType var2 = null;
         var2 = (CTSectType)this.get_store().add_element_user(TYPE$8);
         return var2;
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TYPE$8, 0);
      }
   }

   public CTPageSz getPgSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSz var2 = null;
         var2 = (CTPageSz)this.get_store().find_element_user(PGSZ$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPgSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PGSZ$10) != 0;
      }
   }

   public void setPgSz(CTPageSz var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSz var3 = null;
         var3 = (CTPageSz)this.get_store().find_element_user(PGSZ$10, 0);
         if(var3 == null) {
            var3 = (CTPageSz)this.get_store().add_element_user(PGSZ$10);
         }

         var3.set(var1);
      }
   }

   public CTPageSz addNewPgSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageSz var2 = null;
         var2 = (CTPageSz)this.get_store().add_element_user(PGSZ$10);
         return var2;
      }
   }

   public void unsetPgSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PGSZ$10, 0);
      }
   }

   public CTPageMar getPgMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMar var2 = null;
         var2 = (CTPageMar)this.get_store().find_element_user(PGMAR$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPgMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PGMAR$12) != 0;
      }
   }

   public void setPgMar(CTPageMar var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMar var3 = null;
         var3 = (CTPageMar)this.get_store().find_element_user(PGMAR$12, 0);
         if(var3 == null) {
            var3 = (CTPageMar)this.get_store().add_element_user(PGMAR$12);
         }

         var3.set(var1);
      }
   }

   public CTPageMar addNewPgMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageMar var2 = null;
         var2 = (CTPageMar)this.get_store().add_element_user(PGMAR$12);
         return var2;
      }
   }

   public void unsetPgMar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PGMAR$12, 0);
      }
   }

   public CTPaperSource getPaperSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPaperSource var2 = null;
         var2 = (CTPaperSource)this.get_store().find_element_user(PAPERSRC$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPaperSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAPERSRC$14) != 0;
      }
   }

   public void setPaperSrc(CTPaperSource var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPaperSource var3 = null;
         var3 = (CTPaperSource)this.get_store().find_element_user(PAPERSRC$14, 0);
         if(var3 == null) {
            var3 = (CTPaperSource)this.get_store().add_element_user(PAPERSRC$14);
         }

         var3.set(var1);
      }
   }

   public CTPaperSource addNewPaperSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPaperSource var2 = null;
         var2 = (CTPaperSource)this.get_store().add_element_user(PAPERSRC$14);
         return var2;
      }
   }

   public void unsetPaperSrc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAPERSRC$14, 0);
      }
   }

   public CTPageBorders getPgBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBorders var2 = null;
         var2 = (CTPageBorders)this.get_store().find_element_user(PGBORDERS$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPgBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PGBORDERS$16) != 0;
      }
   }

   public void setPgBorders(CTPageBorders var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBorders var3 = null;
         var3 = (CTPageBorders)this.get_store().find_element_user(PGBORDERS$16, 0);
         if(var3 == null) {
            var3 = (CTPageBorders)this.get_store().add_element_user(PGBORDERS$16);
         }

         var3.set(var1);
      }
   }

   public CTPageBorders addNewPgBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageBorders var2 = null;
         var2 = (CTPageBorders)this.get_store().add_element_user(PGBORDERS$16);
         return var2;
      }
   }

   public void unsetPgBorders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PGBORDERS$16, 0);
      }
   }

   public CTLineNumber getLnNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineNumber var2 = null;
         var2 = (CTLineNumber)this.get_store().find_element_user(LNNUMTYPE$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNNUMTYPE$18) != 0;
      }
   }

   public void setLnNumType(CTLineNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineNumber var3 = null;
         var3 = (CTLineNumber)this.get_store().find_element_user(LNNUMTYPE$18, 0);
         if(var3 == null) {
            var3 = (CTLineNumber)this.get_store().add_element_user(LNNUMTYPE$18);
         }

         var3.set(var1);
      }
   }

   public CTLineNumber addNewLnNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineNumber var2 = null;
         var2 = (CTLineNumber)this.get_store().add_element_user(LNNUMTYPE$18);
         return var2;
      }
   }

   public void unsetLnNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNNUMTYPE$18, 0);
      }
   }

   public CTPageNumber getPgNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageNumber var2 = null;
         var2 = (CTPageNumber)this.get_store().find_element_user(PGNUMTYPE$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPgNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PGNUMTYPE$20) != 0;
      }
   }

   public void setPgNumType(CTPageNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageNumber var3 = null;
         var3 = (CTPageNumber)this.get_store().find_element_user(PGNUMTYPE$20, 0);
         if(var3 == null) {
            var3 = (CTPageNumber)this.get_store().add_element_user(PGNUMTYPE$20);
         }

         var3.set(var1);
      }
   }

   public CTPageNumber addNewPgNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPageNumber var2 = null;
         var2 = (CTPageNumber)this.get_store().add_element_user(PGNUMTYPE$20);
         return var2;
      }
   }

   public void unsetPgNumType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PGNUMTYPE$20, 0);
      }
   }

   public CTColumns getCols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColumns var2 = null;
         var2 = (CTColumns)this.get_store().find_element_user(COLS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLS$22) != 0;
      }
   }

   public void setCols(CTColumns var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColumns var3 = null;
         var3 = (CTColumns)this.get_store().find_element_user(COLS$22, 0);
         if(var3 == null) {
            var3 = (CTColumns)this.get_store().add_element_user(COLS$22);
         }

         var3.set(var1);
      }
   }

   public CTColumns addNewCols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColumns var2 = null;
         var2 = (CTColumns)this.get_store().add_element_user(COLS$22);
         return var2;
      }
   }

   public void unsetCols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLS$22, 0);
      }
   }

   public CTOnOff getFormProt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(FORMPROT$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFormProt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMPROT$24) != 0;
      }
   }

   public void setFormProt(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(FORMPROT$24, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(FORMPROT$24);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewFormProt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(FORMPROT$24);
         return var2;
      }
   }

   public void unsetFormProt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMPROT$24, 0);
      }
   }

   public CTVerticalJc getVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalJc var2 = null;
         var2 = (CTVerticalJc)this.get_store().find_element_user(VALIGN$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VALIGN$26) != 0;
      }
   }

   public void setVAlign(CTVerticalJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalJc var3 = null;
         var3 = (CTVerticalJc)this.get_store().find_element_user(VALIGN$26, 0);
         if(var3 == null) {
            var3 = (CTVerticalJc)this.get_store().add_element_user(VALIGN$26);
         }

         var3.set(var1);
      }
   }

   public CTVerticalJc addNewVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalJc var2 = null;
         var2 = (CTVerticalJc)this.get_store().add_element_user(VALIGN$26);
         return var2;
      }
   }

   public void unsetVAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VALIGN$26, 0);
      }
   }

   public CTOnOff getNoEndnote() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(NOENDNOTE$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoEndnote() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOENDNOTE$28) != 0;
      }
   }

   public void setNoEndnote(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(NOENDNOTE$28, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(NOENDNOTE$28);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewNoEndnote() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(NOENDNOTE$28);
         return var2;
      }
   }

   public void unsetNoEndnote() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOENDNOTE$28, 0);
      }
   }

   public CTOnOff getTitlePg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(TITLEPG$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTitlePg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TITLEPG$30) != 0;
      }
   }

   public void setTitlePg(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(TITLEPG$30, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(TITLEPG$30);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewTitlePg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(TITLEPG$30);
         return var2;
      }
   }

   public void unsetTitlePg() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TITLEPG$30, 0);
      }
   }

   public CTTextDirection getTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var2 = null;
         var2 = (CTTextDirection)this.get_store().find_element_user(TEXTDIRECTION$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTDIRECTION$32) != 0;
      }
   }

   public void setTextDirection(CTTextDirection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var3 = null;
         var3 = (CTTextDirection)this.get_store().find_element_user(TEXTDIRECTION$32, 0);
         if(var3 == null) {
            var3 = (CTTextDirection)this.get_store().add_element_user(TEXTDIRECTION$32);
         }

         var3.set(var1);
      }
   }

   public CTTextDirection addNewTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var2 = null;
         var2 = (CTTextDirection)this.get_store().add_element_user(TEXTDIRECTION$32);
         return var2;
      }
   }

   public void unsetTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTDIRECTION$32, 0);
      }
   }

   public CTOnOff getBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BIDI$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BIDI$34) != 0;
      }
   }

   public void setBidi(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BIDI$34, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BIDI$34);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BIDI$34);
         return var2;
      }
   }

   public void unsetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BIDI$34, 0);
      }
   }

   public CTOnOff getRtlGutter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(RTLGUTTER$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRtlGutter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RTLGUTTER$36) != 0;
      }
   }

   public void setRtlGutter(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(RTLGUTTER$36, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(RTLGUTTER$36);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewRtlGutter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(RTLGUTTER$36);
         return var2;
      }
   }

   public void unsetRtlGutter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RTLGUTTER$36, 0);
      }
   }

   public CTDocGrid getDocGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocGrid var2 = null;
         var2 = (CTDocGrid)this.get_store().find_element_user(DOCGRID$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCGRID$38) != 0;
      }
   }

   public void setDocGrid(CTDocGrid var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocGrid var3 = null;
         var3 = (CTDocGrid)this.get_store().find_element_user(DOCGRID$38, 0);
         if(var3 == null) {
            var3 = (CTDocGrid)this.get_store().add_element_user(DOCGRID$38);
         }

         var3.set(var1);
      }
   }

   public CTDocGrid addNewDocGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocGrid var2 = null;
         var2 = (CTDocGrid)this.get_store().add_element_user(DOCGRID$38);
         return var2;
      }
   }

   public void unsetDocGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCGRID$38, 0);
      }
   }

   public CTRel getPrinterSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().find_element_user(PRINTERSETTINGS$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrinterSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTERSETTINGS$40) != 0;
      }
   }

   public void setPrinterSettings(CTRel var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().find_element_user(PRINTERSETTINGS$40, 0);
         if(var3 == null) {
            var3 = (CTRel)this.get_store().add_element_user(PRINTERSETTINGS$40);
         }

         var3.set(var1);
      }
   }

   public CTRel addNewPrinterSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().add_element_user(PRINTERSETTINGS$40);
         return var2;
      }
   }

   public void unsetPrinterSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTERSETTINGS$40, 0);
      }
   }

   public CTSectPrChange getSectPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectPrChange var2 = null;
         var2 = (CTSectPrChange)this.get_store().find_element_user(SECTPRCHANGE$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSectPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SECTPRCHANGE$42) != 0;
      }
   }

   public void setSectPrChange(CTSectPrChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectPrChange var3 = null;
         var3 = (CTSectPrChange)this.get_store().find_element_user(SECTPRCHANGE$42, 0);
         if(var3 == null) {
            var3 = (CTSectPrChange)this.get_store().add_element_user(SECTPRCHANGE$42);
         }

         var3.set(var1);
      }
   }

   public CTSectPrChange addNewSectPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSectPrChange var2 = null;
         var2 = (CTSectPrChange)this.get_store().add_element_user(SECTPRCHANGE$42);
         return var2;
      }
   }

   public void unsetSectPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SECTPRCHANGE$42, 0);
      }
   }

   public byte[] getRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDRPR$44);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDRPR$44);
         return var2;
      }
   }

   public boolean isSetRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDRPR$44) != null;
      }
   }

   public void setRsidRPr(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDRPR$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDRPR$44);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidRPr(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDRPR$44);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDRPR$44);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDRPR$44);
      }
   }

   public byte[] getRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDDEL$46);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDDEL$46);
         return var2;
      }
   }

   public boolean isSetRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDDEL$46) != null;
      }
   }

   public void setRsidDel(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDDEL$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDDEL$46);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidDel(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDDEL$46);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDDEL$46);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDDEL$46);
      }
   }

   public byte[] getRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDR$48);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDR$48);
         return var2;
      }
   }

   public boolean isSetRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDR$48) != null;
      }
   }

   public void setRsidR(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDR$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDR$48);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidR(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDR$48);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDR$48);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDR$48);
      }
   }

   public byte[] getRsidSect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RSIDSECT$50);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetRsidSect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDSECT$50);
         return var2;
      }
   }

   public boolean isSetRsidSect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RSIDSECT$50) != null;
      }
   }

   public void setRsidSect(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RSIDSECT$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RSIDSECT$50);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetRsidSect(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(RSIDSECT$50);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(RSIDSECT$50);
         }

         var3.set(var1);
      }
   }

   public void unsetRsidSect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RSIDSECT$50);
      }
   }

}
