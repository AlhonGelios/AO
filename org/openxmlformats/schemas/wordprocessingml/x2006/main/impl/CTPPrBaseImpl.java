package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCnf;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFramePr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPBdr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrBase;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTabs;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextAlignment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextDirection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextboxTightWrap;

public class CTPPrBaseImpl extends XmlComplexContentImpl implements CTPPrBase {

   private static final QName PSTYLE$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pStyle");
   private static final QName KEEPNEXT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "keepNext");
   private static final QName KEEPLINES$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "keepLines");
   private static final QName PAGEBREAKBEFORE$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pageBreakBefore");
   private static final QName FRAMEPR$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "framePr");
   private static final QName WIDOWCONTROL$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "widowControl");
   private static final QName NUMPR$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numPr");
   private static final QName SUPPRESSLINENUMBERS$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "suppressLineNumbers");
   private static final QName PBDR$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pBdr");
   private static final QName SHD$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
   private static final QName TABS$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tabs");
   private static final QName SUPPRESSAUTOHYPHENS$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "suppressAutoHyphens");
   private static final QName KINSOKU$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "kinsoku");
   private static final QName WORDWRAP$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "wordWrap");
   private static final QName OVERFLOWPUNCT$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "overflowPunct");
   private static final QName TOPLINEPUNCT$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "topLinePunct");
   private static final QName AUTOSPACEDE$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoSpaceDE");
   private static final QName AUTOSPACEDN$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoSpaceDN");
   private static final QName BIDI$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bidi");
   private static final QName ADJUSTRIGHTIND$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "adjustRightInd");
   private static final QName SNAPTOGRID$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "snapToGrid");
   private static final QName SPACING$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "spacing");
   private static final QName IND$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ind");
   private static final QName CONTEXTUALSPACING$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "contextualSpacing");
   private static final QName MIRRORINDENTS$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mirrorIndents");
   private static final QName SUPPRESSOVERLAP$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "suppressOverlap");
   private static final QName JC$52 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "jc");
   private static final QName TEXTDIRECTION$54 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textDirection");
   private static final QName TEXTALIGNMENT$56 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textAlignment");
   private static final QName TEXTBOXTIGHTWRAP$58 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "textboxTightWrap");
   private static final QName OUTLINELVL$60 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "outlineLvl");
   private static final QName DIVID$62 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "divId");
   private static final QName CNFSTYLE$64 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cnfStyle");


   public CTPPrBaseImpl(SchemaType var1) {
      super(var1);
   }

   public CTString getPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(PSTYLE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PSTYLE$0) != 0;
      }
   }

   public void setPStyle(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(PSTYLE$0, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(PSTYLE$0);
         }

         var3.set(var1);
      }
   }

   public CTString addNewPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(PSTYLE$0);
         return var2;
      }
   }

   public void unsetPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PSTYLE$0, 0);
      }
   }

   public CTOnOff getKeepNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(KEEPNEXT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKeepNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KEEPNEXT$2) != 0;
      }
   }

   public void setKeepNext(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(KEEPNEXT$2, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(KEEPNEXT$2);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewKeepNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(KEEPNEXT$2);
         return var2;
      }
   }

   public void unsetKeepNext() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KEEPNEXT$2, 0);
      }
   }

   public CTOnOff getKeepLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(KEEPLINES$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKeepLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KEEPLINES$4) != 0;
      }
   }

   public void setKeepLines(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(KEEPLINES$4, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(KEEPLINES$4);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewKeepLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(KEEPLINES$4);
         return var2;
      }
   }

   public void unsetKeepLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KEEPLINES$4, 0);
      }
   }

   public CTOnOff getPageBreakBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PAGEBREAKBEFORE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPageBreakBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PAGEBREAKBEFORE$6) != 0;
      }
   }

   public void setPageBreakBefore(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PAGEBREAKBEFORE$6, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PAGEBREAKBEFORE$6);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPageBreakBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PAGEBREAKBEFORE$6);
         return var2;
      }
   }

   public void unsetPageBreakBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PAGEBREAKBEFORE$6, 0);
      }
   }

   public CTFramePr getFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFramePr var2 = null;
         var2 = (CTFramePr)this.get_store().find_element_user(FRAMEPR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FRAMEPR$8) != 0;
      }
   }

   public void setFramePr(CTFramePr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFramePr var3 = null;
         var3 = (CTFramePr)this.get_store().find_element_user(FRAMEPR$8, 0);
         if(var3 == null) {
            var3 = (CTFramePr)this.get_store().add_element_user(FRAMEPR$8);
         }

         var3.set(var1);
      }
   }

   public CTFramePr addNewFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFramePr var2 = null;
         var2 = (CTFramePr)this.get_store().add_element_user(FRAMEPR$8);
         return var2;
      }
   }

   public void unsetFramePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FRAMEPR$8, 0);
      }
   }

   public CTOnOff getWidowControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(WIDOWCONTROL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWidowControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WIDOWCONTROL$10) != 0;
      }
   }

   public void setWidowControl(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(WIDOWCONTROL$10, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(WIDOWCONTROL$10);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewWidowControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(WIDOWCONTROL$10);
         return var2;
      }
   }

   public void unsetWidowControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WIDOWCONTROL$10, 0);
      }
   }

   public CTNumPr getNumPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPr var2 = null;
         var2 = (CTNumPr)this.get_store().find_element_user(NUMPR$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMPR$12) != 0;
      }
   }

   public void setNumPr(CTNumPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPr var3 = null;
         var3 = (CTNumPr)this.get_store().find_element_user(NUMPR$12, 0);
         if(var3 == null) {
            var3 = (CTNumPr)this.get_store().add_element_user(NUMPR$12);
         }

         var3.set(var1);
      }
   }

   public CTNumPr addNewNumPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumPr var2 = null;
         var2 = (CTNumPr)this.get_store().add_element_user(NUMPR$12);
         return var2;
      }
   }

   public void unsetNumPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMPR$12, 0);
      }
   }

   public CTOnOff getSuppressLineNumbers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SUPPRESSLINENUMBERS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSuppressLineNumbers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SUPPRESSLINENUMBERS$14) != 0;
      }
   }

   public void setSuppressLineNumbers(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SUPPRESSLINENUMBERS$14, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SUPPRESSLINENUMBERS$14);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSuppressLineNumbers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SUPPRESSLINENUMBERS$14);
         return var2;
      }
   }

   public void unsetSuppressLineNumbers() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SUPPRESSLINENUMBERS$14, 0);
      }
   }

   public CTPBdr getPBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPBdr var2 = null;
         var2 = (CTPBdr)this.get_store().find_element_user(PBDR$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PBDR$16) != 0;
      }
   }

   public void setPBdr(CTPBdr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPBdr var3 = null;
         var3 = (CTPBdr)this.get_store().find_element_user(PBDR$16, 0);
         if(var3 == null) {
            var3 = (CTPBdr)this.get_store().add_element_user(PBDR$16);
         }

         var3.set(var1);
      }
   }

   public CTPBdr addNewPBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPBdr var2 = null;
         var2 = (CTPBdr)this.get_store().add_element_user(PBDR$16);
         return var2;
      }
   }

   public void unsetPBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PBDR$16, 0);
      }
   }

   public CTShd getShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().find_element_user(SHD$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHD$18) != 0;
      }
   }

   public void setShd(CTShd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var3 = null;
         var3 = (CTShd)this.get_store().find_element_user(SHD$18, 0);
         if(var3 == null) {
            var3 = (CTShd)this.get_store().add_element_user(SHD$18);
         }

         var3.set(var1);
      }
   }

   public CTShd addNewShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().add_element_user(SHD$18);
         return var2;
      }
   }

   public void unsetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHD$18, 0);
      }
   }

   public CTTabs getTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabs var2 = null;
         var2 = (CTTabs)this.get_store().find_element_user(TABS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABS$20) != 0;
      }
   }

   public void setTabs(CTTabs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabs var3 = null;
         var3 = (CTTabs)this.get_store().find_element_user(TABS$20, 0);
         if(var3 == null) {
            var3 = (CTTabs)this.get_store().add_element_user(TABS$20);
         }

         var3.set(var1);
      }
   }

   public CTTabs addNewTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTabs var2 = null;
         var2 = (CTTabs)this.get_store().add_element_user(TABS$20);
         return var2;
      }
   }

   public void unsetTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABS$20, 0);
      }
   }

   public CTOnOff getSuppressAutoHyphens() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SUPPRESSAUTOHYPHENS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSuppressAutoHyphens() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SUPPRESSAUTOHYPHENS$22) != 0;
      }
   }

   public void setSuppressAutoHyphens(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SUPPRESSAUTOHYPHENS$22, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SUPPRESSAUTOHYPHENS$22);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSuppressAutoHyphens() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SUPPRESSAUTOHYPHENS$22);
         return var2;
      }
   }

   public void unsetSuppressAutoHyphens() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SUPPRESSAUTOHYPHENS$22, 0);
      }
   }

   public CTOnOff getKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(KINSOKU$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KINSOKU$24) != 0;
      }
   }

   public void setKinsoku(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(KINSOKU$24, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(KINSOKU$24);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(KINSOKU$24);
         return var2;
      }
   }

   public void unsetKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KINSOKU$24, 0);
      }
   }

   public CTOnOff getWordWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(WORDWRAP$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWordWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WORDWRAP$26) != 0;
      }
   }

   public void setWordWrap(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(WORDWRAP$26, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(WORDWRAP$26);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewWordWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(WORDWRAP$26);
         return var2;
      }
   }

   public void unsetWordWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WORDWRAP$26, 0);
      }
   }

   public CTOnOff getOverflowPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(OVERFLOWPUNCT$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOverflowPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OVERFLOWPUNCT$28) != 0;
      }
   }

   public void setOverflowPunct(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(OVERFLOWPUNCT$28, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(OVERFLOWPUNCT$28);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewOverflowPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(OVERFLOWPUNCT$28);
         return var2;
      }
   }

   public void unsetOverflowPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OVERFLOWPUNCT$28, 0);
      }
   }

   public CTOnOff getTopLinePunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(TOPLINEPUNCT$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTopLinePunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TOPLINEPUNCT$30) != 0;
      }
   }

   public void setTopLinePunct(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(TOPLINEPUNCT$30, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(TOPLINEPUNCT$30);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewTopLinePunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(TOPLINEPUNCT$30);
         return var2;
      }
   }

   public void unsetTopLinePunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TOPLINEPUNCT$30, 0);
      }
   }

   public CTOnOff getAutoSpaceDE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(AUTOSPACEDE$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoSpaceDE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOSPACEDE$32) != 0;
      }
   }

   public void setAutoSpaceDE(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(AUTOSPACEDE$32, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(AUTOSPACEDE$32);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAutoSpaceDE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(AUTOSPACEDE$32);
         return var2;
      }
   }

   public void unsetAutoSpaceDE() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOSPACEDE$32, 0);
      }
   }

   public CTOnOff getAutoSpaceDN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(AUTOSPACEDN$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoSpaceDN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOSPACEDN$34) != 0;
      }
   }

   public void setAutoSpaceDN(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(AUTOSPACEDN$34, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(AUTOSPACEDN$34);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAutoSpaceDN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(AUTOSPACEDN$34);
         return var2;
      }
   }

   public void unsetAutoSpaceDN() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOSPACEDN$34, 0);
      }
   }

   public CTOnOff getBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BIDI$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BIDI$36) != 0;
      }
   }

   public void setBidi(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BIDI$36, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BIDI$36);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BIDI$36);
         return var2;
      }
   }

   public void unsetBidi() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BIDI$36, 0);
      }
   }

   public CTOnOff getAdjustRightInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(ADJUSTRIGHTIND$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAdjustRightInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ADJUSTRIGHTIND$38) != 0;
      }
   }

   public void setAdjustRightInd(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ADJUSTRIGHTIND$38, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(ADJUSTRIGHTIND$38);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAdjustRightInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ADJUSTRIGHTIND$38);
         return var2;
      }
   }

   public void unsetAdjustRightInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ADJUSTRIGHTIND$38, 0);
      }
   }

   public CTOnOff getSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SNAPTOGRID$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SNAPTOGRID$40) != 0;
      }
   }

   public void setSnapToGrid(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SNAPTOGRID$40, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SNAPTOGRID$40);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SNAPTOGRID$40);
         return var2;
      }
   }

   public void unsetSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SNAPTOGRID$40, 0);
      }
   }

   public CTSpacing getSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSpacing var2 = null;
         var2 = (CTSpacing)this.get_store().find_element_user(SPACING$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPACING$42) != 0;
      }
   }

   public void setSpacing(CTSpacing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSpacing var3 = null;
         var3 = (CTSpacing)this.get_store().find_element_user(SPACING$42, 0);
         if(var3 == null) {
            var3 = (CTSpacing)this.get_store().add_element_user(SPACING$42);
         }

         var3.set(var1);
      }
   }

   public CTSpacing addNewSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSpacing var2 = null;
         var2 = (CTSpacing)this.get_store().add_element_user(SPACING$42);
         return var2;
      }
   }

   public void unsetSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPACING$42, 0);
      }
   }

   public CTInd getInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInd var2 = null;
         var2 = (CTInd)this.get_store().find_element_user(IND$44, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IND$44) != 0;
      }
   }

   public void setInd(CTInd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInd var3 = null;
         var3 = (CTInd)this.get_store().find_element_user(IND$44, 0);
         if(var3 == null) {
            var3 = (CTInd)this.get_store().add_element_user(IND$44);
         }

         var3.set(var1);
      }
   }

   public CTInd addNewInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInd var2 = null;
         var2 = (CTInd)this.get_store().add_element_user(IND$44);
         return var2;
      }
   }

   public void unsetInd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IND$44, 0);
      }
   }

   public CTOnOff getContextualSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(CONTEXTUALSPACING$46, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetContextualSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONTEXTUALSPACING$46) != 0;
      }
   }

   public void setContextualSpacing(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(CONTEXTUALSPACING$46, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(CONTEXTUALSPACING$46);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewContextualSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(CONTEXTUALSPACING$46);
         return var2;
      }
   }

   public void unsetContextualSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONTEXTUALSPACING$46, 0);
      }
   }

   public CTOnOff getMirrorIndents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(MIRRORINDENTS$48, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMirrorIndents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MIRRORINDENTS$48) != 0;
      }
   }

   public void setMirrorIndents(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(MIRRORINDENTS$48, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(MIRRORINDENTS$48);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewMirrorIndents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(MIRRORINDENTS$48);
         return var2;
      }
   }

   public void unsetMirrorIndents() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MIRRORINDENTS$48, 0);
      }
   }

   public CTOnOff getSuppressOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SUPPRESSOVERLAP$50, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSuppressOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SUPPRESSOVERLAP$50) != 0;
      }
   }

   public void setSuppressOverlap(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SUPPRESSOVERLAP$50, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SUPPRESSOVERLAP$50);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSuppressOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SUPPRESSOVERLAP$50);
         return var2;
      }
   }

   public void unsetSuppressOverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SUPPRESSOVERLAP$50, 0);
      }
   }

   public CTJc getJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().find_element_user(JC$52, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(JC$52) != 0;
      }
   }

   public void setJc(CTJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var3 = null;
         var3 = (CTJc)this.get_store().find_element_user(JC$52, 0);
         if(var3 == null) {
            var3 = (CTJc)this.get_store().add_element_user(JC$52);
         }

         var3.set(var1);
      }
   }

   public CTJc addNewJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().add_element_user(JC$52);
         return var2;
      }
   }

   public void unsetJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(JC$52, 0);
      }
   }

   public CTTextDirection getTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var2 = null;
         var2 = (CTTextDirection)this.get_store().find_element_user(TEXTDIRECTION$54, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTDIRECTION$54) != 0;
      }
   }

   public void setTextDirection(CTTextDirection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var3 = null;
         var3 = (CTTextDirection)this.get_store().find_element_user(TEXTDIRECTION$54, 0);
         if(var3 == null) {
            var3 = (CTTextDirection)this.get_store().add_element_user(TEXTDIRECTION$54);
         }

         var3.set(var1);
      }
   }

   public CTTextDirection addNewTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextDirection var2 = null;
         var2 = (CTTextDirection)this.get_store().add_element_user(TEXTDIRECTION$54);
         return var2;
      }
   }

   public void unsetTextDirection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTDIRECTION$54, 0);
      }
   }

   public CTTextAlignment getTextAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextAlignment var2 = null;
         var2 = (CTTextAlignment)this.get_store().find_element_user(TEXTALIGNMENT$56, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTextAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTALIGNMENT$56) != 0;
      }
   }

   public void setTextAlignment(CTTextAlignment var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextAlignment var3 = null;
         var3 = (CTTextAlignment)this.get_store().find_element_user(TEXTALIGNMENT$56, 0);
         if(var3 == null) {
            var3 = (CTTextAlignment)this.get_store().add_element_user(TEXTALIGNMENT$56);
         }

         var3.set(var1);
      }
   }

   public CTTextAlignment addNewTextAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextAlignment var2 = null;
         var2 = (CTTextAlignment)this.get_store().add_element_user(TEXTALIGNMENT$56);
         return var2;
      }
   }

   public void unsetTextAlignment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTALIGNMENT$56, 0);
      }
   }

   public CTTextboxTightWrap getTextboxTightWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextboxTightWrap var2 = null;
         var2 = (CTTextboxTightWrap)this.get_store().find_element_user(TEXTBOXTIGHTWRAP$58, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTextboxTightWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTBOXTIGHTWRAP$58) != 0;
      }
   }

   public void setTextboxTightWrap(CTTextboxTightWrap var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextboxTightWrap var3 = null;
         var3 = (CTTextboxTightWrap)this.get_store().find_element_user(TEXTBOXTIGHTWRAP$58, 0);
         if(var3 == null) {
            var3 = (CTTextboxTightWrap)this.get_store().add_element_user(TEXTBOXTIGHTWRAP$58);
         }

         var3.set(var1);
      }
   }

   public CTTextboxTightWrap addNewTextboxTightWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextboxTightWrap var2 = null;
         var2 = (CTTextboxTightWrap)this.get_store().add_element_user(TEXTBOXTIGHTWRAP$58);
         return var2;
      }
   }

   public void unsetTextboxTightWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTBOXTIGHTWRAP$58, 0);
      }
   }

   public CTDecimalNumber getOutlineLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(OUTLINELVL$60, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOutlineLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OUTLINELVL$60) != 0;
      }
   }

   public void setOutlineLvl(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(OUTLINELVL$60, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(OUTLINELVL$60);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewOutlineLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(OUTLINELVL$60);
         return var2;
      }
   }

   public void unsetOutlineLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OUTLINELVL$60, 0);
      }
   }

   public CTDecimalNumber getDivId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(DIVID$62, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDivId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIVID$62) != 0;
      }
   }

   public void setDivId(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(DIVID$62, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(DIVID$62);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewDivId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(DIVID$62);
         return var2;
      }
   }

   public void unsetDivId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIVID$62, 0);
      }
   }

   public CTCnf getCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var2 = null;
         var2 = (CTCnf)this.get_store().find_element_user(CNFSTYLE$64, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CNFSTYLE$64) != 0;
      }
   }

   public void setCnfStyle(CTCnf var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var3 = null;
         var3 = (CTCnf)this.get_store().find_element_user(CNFSTYLE$64, 0);
         if(var3 == null) {
            var3 = (CTCnf)this.get_store().add_element_user(CNFSTYLE$64);
         }

         var3.set(var1);
      }
   }

   public CTCnf addNewCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCnf var2 = null;
         var2 = (CTCnf)this.get_store().add_element_user(CNFSTYLE$64);
         return var2;
      }
   }

   public void unsetCnfStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CNFSTYLE$64, 0);
      }
   }

}
