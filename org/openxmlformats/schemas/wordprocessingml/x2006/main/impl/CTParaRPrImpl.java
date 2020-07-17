package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPrChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun;

public class CTParaRPrImpl extends XmlComplexContentImpl implements CTParaRPr {

   private static final QName INS$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
   private static final QName DEL$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
   private static final QName MOVEFROM$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFrom");
   private static final QName MOVETO$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveTo");
   private static final QName RSTYLE$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rStyle");
   private static final QName RFONTS$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rFonts");
   private static final QName B$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "b");
   private static final QName BCS$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bCs");
   private static final QName I$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "i");
   private static final QName ICS$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "iCs");
   private static final QName CAPS$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "caps");
   private static final QName SMALLCAPS$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "smallCaps");
   private static final QName STRIKE$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "strike");
   private static final QName DSTRIKE$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dstrike");
   private static final QName OUTLINE$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "outline");
   private static final QName SHADOW$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shadow");
   private static final QName EMBOSS$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "emboss");
   private static final QName IMPRINT$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "imprint");
   private static final QName NOPROOF$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noProof");
   private static final QName SNAPTOGRID$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "snapToGrid");
   private static final QName VANISH$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vanish");
   private static final QName WEBHIDDEN$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "webHidden");
   private static final QName COLOR$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "color");
   private static final QName SPACING$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "spacing");
   private static final QName W$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
   private static final QName KERN$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "kern");
   private static final QName POSITION$52 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "position");
   private static final QName SZ$54 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sz");
   private static final QName SZCS$56 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "szCs");
   private static final QName HIGHLIGHT$58 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "highlight");
   private static final QName U$60 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "u");
   private static final QName EFFECT$62 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "effect");
   private static final QName BDR$64 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bdr");
   private static final QName SHD$66 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
   private static final QName FITTEXT$68 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fitText");
   private static final QName VERTALIGN$70 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vertAlign");
   private static final QName RTL$72 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rtl");
   private static final QName CS$74 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cs");
   private static final QName EM$76 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "em");
   private static final QName LANG$78 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lang");
   private static final QName EASTASIANLAYOUT$80 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsianLayout");
   private static final QName SPECVANISH$82 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "specVanish");
   private static final QName OMATH$84 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "oMath");
   private static final QName RPRCHANGE$86 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPrChange");


   public CTParaRPrImpl(SchemaType var1) {
      super(var1);
   }

   public CTTrackChange getIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(INS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INS$0) != 0;
      }
   }

   public void setIns(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(INS$0, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(INS$0);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(INS$0);
         return var2;
      }
   }

   public void unsetIns() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INS$0, 0);
      }
   }

   public CTTrackChange getDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(DEL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEL$2) != 0;
      }
   }

   public void setDel(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(DEL$2, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(DEL$2);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(DEL$2);
         return var2;
      }
   }

   public void unsetDel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEL$2, 0);
      }
   }

   public CTTrackChange getMoveFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(MOVEFROM$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMoveFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVEFROM$4) != 0;
      }
   }

   public void setMoveFrom(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(MOVEFROM$4, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(MOVEFROM$4);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewMoveFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(MOVEFROM$4);
         return var2;
      }
   }

   public void unsetMoveFrom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVEFROM$4, 0);
      }
   }

   public CTTrackChange getMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().find_element_user(MOVETO$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MOVETO$6) != 0;
      }
   }

   public void setMoveTo(CTTrackChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var3 = null;
         var3 = (CTTrackChange)this.get_store().find_element_user(MOVETO$6, 0);
         if(var3 == null) {
            var3 = (CTTrackChange)this.get_store().add_element_user(MOVETO$6);
         }

         var3.set(var1);
      }
   }

   public CTTrackChange addNewMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChange var2 = null;
         var2 = (CTTrackChange)this.get_store().add_element_user(MOVETO$6);
         return var2;
      }
   }

   public void unsetMoveTo() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MOVETO$6, 0);
      }
   }

   public CTString getRStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(RSTYLE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RSTYLE$8) != 0;
      }
   }

   public void setRStyle(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(RSTYLE$8, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(RSTYLE$8);
         }

         var3.set(var1);
      }
   }

   public CTString addNewRStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(RSTYLE$8);
         return var2;
      }
   }

   public void unsetRStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RSTYLE$8, 0);
      }
   }

   public CTFonts getRFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFonts var2 = null;
         var2 = (CTFonts)this.get_store().find_element_user(RFONTS$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RFONTS$10) != 0;
      }
   }

   public void setRFonts(CTFonts var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFonts var3 = null;
         var3 = (CTFonts)this.get_store().find_element_user(RFONTS$10, 0);
         if(var3 == null) {
            var3 = (CTFonts)this.get_store().add_element_user(RFONTS$10);
         }

         var3.set(var1);
      }
   }

   public CTFonts addNewRFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFonts var2 = null;
         var2 = (CTFonts)this.get_store().add_element_user(RFONTS$10);
         return var2;
      }
   }

   public void unsetRFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RFONTS$10, 0);
      }
   }

   public CTOnOff getB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(B$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(B$12) != 0;
      }
   }

   public void setB(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(B$12, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(B$12);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(B$12);
         return var2;
      }
   }

   public void unsetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(B$12, 0);
      }
   }

   public CTOnOff getBCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BCS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BCS$14) != 0;
      }
   }

   public void setBCs(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BCS$14, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BCS$14);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BCS$14);
         return var2;
      }
   }

   public void unsetBCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BCS$14, 0);
      }
   }

   public CTOnOff getI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(I$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(I$16) != 0;
      }
   }

   public void setI(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(I$16, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(I$16);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(I$16);
         return var2;
      }
   }

   public void unsetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(I$16, 0);
      }
   }

   public CTOnOff getICs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(ICS$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetICs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ICS$18) != 0;
      }
   }

   public void setICs(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ICS$18, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(ICS$18);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewICs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ICS$18);
         return var2;
      }
   }

   public void unsetICs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ICS$18, 0);
      }
   }

   public CTOnOff getCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(CAPS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CAPS$20) != 0;
      }
   }

   public void setCaps(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(CAPS$20, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(CAPS$20);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(CAPS$20);
         return var2;
      }
   }

   public void unsetCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CAPS$20, 0);
      }
   }

   public CTOnOff getSmallCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SMALLCAPS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmallCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMALLCAPS$22) != 0;
      }
   }

   public void setSmallCaps(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SMALLCAPS$22, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SMALLCAPS$22);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSmallCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SMALLCAPS$22);
         return var2;
      }
   }

   public void unsetSmallCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMALLCAPS$22, 0);
      }
   }

   public CTOnOff getStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(STRIKE$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRIKE$24) != 0;
      }
   }

   public void setStrike(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(STRIKE$24, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(STRIKE$24);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(STRIKE$24);
         return var2;
      }
   }

   public void unsetStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRIKE$24, 0);
      }
   }

   public CTOnOff getDstrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DSTRIKE$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDstrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DSTRIKE$26) != 0;
      }
   }

   public void setDstrike(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DSTRIKE$26, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DSTRIKE$26);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDstrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DSTRIKE$26);
         return var2;
      }
   }

   public void unsetDstrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DSTRIKE$26, 0);
      }
   }

   public CTOnOff getOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(OUTLINE$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OUTLINE$28) != 0;
      }
   }

   public void setOutline(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(OUTLINE$28, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(OUTLINE$28);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(OUTLINE$28);
         return var2;
      }
   }

   public void unsetOutline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OUTLINE$28, 0);
      }
   }

   public CTOnOff getShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SHADOW$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHADOW$30) != 0;
      }
   }

   public void setShadow(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SHADOW$30, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SHADOW$30);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SHADOW$30);
         return var2;
      }
   }

   public void unsetShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHADOW$30, 0);
      }
   }

   public CTOnOff getEmboss() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(EMBOSS$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEmboss() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EMBOSS$32) != 0;
      }
   }

   public void setEmboss(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(EMBOSS$32, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(EMBOSS$32);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewEmboss() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(EMBOSS$32);
         return var2;
      }
   }

   public void unsetEmboss() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EMBOSS$32, 0);
      }
   }

   public CTOnOff getImprint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(IMPRINT$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetImprint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IMPRINT$34) != 0;
      }
   }

   public void setImprint(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(IMPRINT$34, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(IMPRINT$34);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewImprint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(IMPRINT$34);
         return var2;
      }
   }

   public void unsetImprint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IMPRINT$34, 0);
      }
   }

   public CTOnOff getNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(NOPROOF$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOPROOF$36) != 0;
      }
   }

   public void setNoProof(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(NOPROOF$36, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(NOPROOF$36);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(NOPROOF$36);
         return var2;
      }
   }

   public void unsetNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOPROOF$36, 0);
      }
   }

   public CTOnOff getSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SNAPTOGRID$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SNAPTOGRID$38) != 0;
      }
   }

   public void setSnapToGrid(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SNAPTOGRID$38, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SNAPTOGRID$38);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SNAPTOGRID$38);
         return var2;
      }
   }

   public void unsetSnapToGrid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SNAPTOGRID$38, 0);
      }
   }

   public CTOnOff getVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(VANISH$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VANISH$40) != 0;
      }
   }

   public void setVanish(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(VANISH$40, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(VANISH$40);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(VANISH$40);
         return var2;
      }
   }

   public void unsetVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VANISH$40, 0);
      }
   }

   public CTOnOff getWebHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(WEBHIDDEN$42, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWebHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WEBHIDDEN$42) != 0;
      }
   }

   public void setWebHidden(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(WEBHIDDEN$42, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(WEBHIDDEN$42);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewWebHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(WEBHIDDEN$42);
         return var2;
      }
   }

   public void unsetWebHidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WEBHIDDEN$42, 0);
      }
   }

   public CTColor getColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(COLOR$44, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COLOR$44) != 0;
      }
   }

   public void setColor(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(COLOR$44, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(COLOR$44);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(COLOR$44);
         return var2;
      }
   }

   public void unsetColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COLOR$44, 0);
      }
   }

   public CTSignedTwipsMeasure getSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignedTwipsMeasure var2 = null;
         var2 = (CTSignedTwipsMeasure)this.get_store().find_element_user(SPACING$46, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPACING$46) != 0;
      }
   }

   public void setSpacing(CTSignedTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignedTwipsMeasure var3 = null;
         var3 = (CTSignedTwipsMeasure)this.get_store().find_element_user(SPACING$46, 0);
         if(var3 == null) {
            var3 = (CTSignedTwipsMeasure)this.get_store().add_element_user(SPACING$46);
         }

         var3.set(var1);
      }
   }

   public CTSignedTwipsMeasure addNewSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignedTwipsMeasure var2 = null;
         var2 = (CTSignedTwipsMeasure)this.get_store().add_element_user(SPACING$46);
         return var2;
      }
   }

   public void unsetSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPACING$46, 0);
      }
   }

   public CTTextScale getW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextScale var2 = null;
         var2 = (CTTextScale)this.get_store().find_element_user(W$48, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(W$48) != 0;
      }
   }

   public void setW(CTTextScale var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextScale var3 = null;
         var3 = (CTTextScale)this.get_store().find_element_user(W$48, 0);
         if(var3 == null) {
            var3 = (CTTextScale)this.get_store().add_element_user(W$48);
         }

         var3.set(var1);
      }
   }

   public CTTextScale addNewW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextScale var2 = null;
         var2 = (CTTextScale)this.get_store().add_element_user(W$48);
         return var2;
      }
   }

   public void unsetW() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(W$48, 0);
      }
   }

   public CTHpsMeasure getKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().find_element_user(KERN$50, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KERN$50) != 0;
      }
   }

   public void setKern(CTHpsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var3 = null;
         var3 = (CTHpsMeasure)this.get_store().find_element_user(KERN$50, 0);
         if(var3 == null) {
            var3 = (CTHpsMeasure)this.get_store().add_element_user(KERN$50);
         }

         var3.set(var1);
      }
   }

   public CTHpsMeasure addNewKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().add_element_user(KERN$50);
         return var2;
      }
   }

   public void unsetKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KERN$50, 0);
      }
   }

   public CTSignedHpsMeasure getPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignedHpsMeasure var2 = null;
         var2 = (CTSignedHpsMeasure)this.get_store().find_element_user(POSITION$52, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(POSITION$52) != 0;
      }
   }

   public void setPosition(CTSignedHpsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignedHpsMeasure var3 = null;
         var3 = (CTSignedHpsMeasure)this.get_store().find_element_user(POSITION$52, 0);
         if(var3 == null) {
            var3 = (CTSignedHpsMeasure)this.get_store().add_element_user(POSITION$52);
         }

         var3.set(var1);
      }
   }

   public CTSignedHpsMeasure addNewPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignedHpsMeasure var2 = null;
         var2 = (CTSignedHpsMeasure)this.get_store().add_element_user(POSITION$52);
         return var2;
      }
   }

   public void unsetPosition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(POSITION$52, 0);
      }
   }

   public CTHpsMeasure getSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().find_element_user(SZ$54, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SZ$54) != 0;
      }
   }

   public void setSz(CTHpsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var3 = null;
         var3 = (CTHpsMeasure)this.get_store().find_element_user(SZ$54, 0);
         if(var3 == null) {
            var3 = (CTHpsMeasure)this.get_store().add_element_user(SZ$54);
         }

         var3.set(var1);
      }
   }

   public CTHpsMeasure addNewSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().add_element_user(SZ$54);
         return var2;
      }
   }

   public void unsetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SZ$54, 0);
      }
   }

   public CTHpsMeasure getSzCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().find_element_user(SZCS$56, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSzCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SZCS$56) != 0;
      }
   }

   public void setSzCs(CTHpsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var3 = null;
         var3 = (CTHpsMeasure)this.get_store().find_element_user(SZCS$56, 0);
         if(var3 == null) {
            var3 = (CTHpsMeasure)this.get_store().add_element_user(SZCS$56);
         }

         var3.set(var1);
      }
   }

   public CTHpsMeasure addNewSzCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHpsMeasure var2 = null;
         var2 = (CTHpsMeasure)this.get_store().add_element_user(SZCS$56);
         return var2;
      }
   }

   public void unsetSzCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SZCS$56, 0);
      }
   }

   public CTHighlight getHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHighlight var2 = null;
         var2 = (CTHighlight)this.get_store().find_element_user(HIGHLIGHT$58, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIGHLIGHT$58) != 0;
      }
   }

   public void setHighlight(CTHighlight var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHighlight var3 = null;
         var3 = (CTHighlight)this.get_store().find_element_user(HIGHLIGHT$58, 0);
         if(var3 == null) {
            var3 = (CTHighlight)this.get_store().add_element_user(HIGHLIGHT$58);
         }

         var3.set(var1);
      }
   }

   public CTHighlight addNewHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHighlight var2 = null;
         var2 = (CTHighlight)this.get_store().add_element_user(HIGHLIGHT$58);
         return var2;
      }
   }

   public void unsetHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIGHLIGHT$58, 0);
      }
   }

   public CTUnderline getU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderline var2 = null;
         var2 = (CTUnderline)this.get_store().find_element_user(U$60, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(U$60) != 0;
      }
   }

   public void setU(CTUnderline var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderline var3 = null;
         var3 = (CTUnderline)this.get_store().find_element_user(U$60, 0);
         if(var3 == null) {
            var3 = (CTUnderline)this.get_store().add_element_user(U$60);
         }

         var3.set(var1);
      }
   }

   public CTUnderline addNewU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTUnderline var2 = null;
         var2 = (CTUnderline)this.get_store().add_element_user(U$60);
         return var2;
      }
   }

   public void unsetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(U$60, 0);
      }
   }

   public CTTextEffect getEffect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextEffect var2 = null;
         var2 = (CTTextEffect)this.get_store().find_element_user(EFFECT$62, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECT$62) != 0;
      }
   }

   public void setEffect(CTTextEffect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextEffect var3 = null;
         var3 = (CTTextEffect)this.get_store().find_element_user(EFFECT$62, 0);
         if(var3 == null) {
            var3 = (CTTextEffect)this.get_store().add_element_user(EFFECT$62);
         }

         var3.set(var1);
      }
   }

   public CTTextEffect addNewEffect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextEffect var2 = null;
         var2 = (CTTextEffect)this.get_store().add_element_user(EFFECT$62);
         return var2;
      }
   }

   public void unsetEffect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECT$62, 0);
      }
   }

   public CTBorder getBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().find_element_user(BDR$64, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BDR$64) != 0;
      }
   }

   public void setBdr(CTBorder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BDR$64, 0);
         if(var3 == null) {
            var3 = (CTBorder)this.get_store().add_element_user(BDR$64);
         }

         var3.set(var1);
      }
   }

   public CTBorder addNewBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BDR$64);
         return var2;
      }
   }

   public void unsetBdr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BDR$64, 0);
      }
   }

   public CTShd getShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().find_element_user(SHD$66, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHD$66) != 0;
      }
   }

   public void setShd(CTShd var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var3 = null;
         var3 = (CTShd)this.get_store().find_element_user(SHD$66, 0);
         if(var3 == null) {
            var3 = (CTShd)this.get_store().add_element_user(SHD$66);
         }

         var3.set(var1);
      }
   }

   public CTShd addNewShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShd var2 = null;
         var2 = (CTShd)this.get_store().add_element_user(SHD$66);
         return var2;
      }
   }

   public void unsetShd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHD$66, 0);
      }
   }

   public CTFitText getFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFitText var2 = null;
         var2 = (CTFitText)this.get_store().find_element_user(FITTEXT$68, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FITTEXT$68) != 0;
      }
   }

   public void setFitText(CTFitText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFitText var3 = null;
         var3 = (CTFitText)this.get_store().find_element_user(FITTEXT$68, 0);
         if(var3 == null) {
            var3 = (CTFitText)this.get_store().add_element_user(FITTEXT$68);
         }

         var3.set(var1);
      }
   }

   public CTFitText addNewFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFitText var2 = null;
         var2 = (CTFitText)this.get_store().add_element_user(FITTEXT$68);
         return var2;
      }
   }

   public void unsetFitText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FITTEXT$68, 0);
      }
   }

   public CTVerticalAlignRun getVertAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignRun var2 = null;
         var2 = (CTVerticalAlignRun)this.get_store().find_element_user(VERTALIGN$70, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVertAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VERTALIGN$70) != 0;
      }
   }

   public void setVertAlign(CTVerticalAlignRun var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignRun var3 = null;
         var3 = (CTVerticalAlignRun)this.get_store().find_element_user(VERTALIGN$70, 0);
         if(var3 == null) {
            var3 = (CTVerticalAlignRun)this.get_store().add_element_user(VERTALIGN$70);
         }

         var3.set(var1);
      }
   }

   public CTVerticalAlignRun addNewVertAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVerticalAlignRun var2 = null;
         var2 = (CTVerticalAlignRun)this.get_store().add_element_user(VERTALIGN$70);
         return var2;
      }
   }

   public void unsetVertAlign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VERTALIGN$70, 0);
      }
   }

   public CTOnOff getRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(RTL$72, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RTL$72) != 0;
      }
   }

   public void setRtl(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(RTL$72, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(RTL$72);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(RTL$72);
         return var2;
      }
   }

   public void unsetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RTL$72, 0);
      }
   }

   public CTOnOff getCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(CS$74, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CS$74) != 0;
      }
   }

   public void setCs(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(CS$74, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(CS$74);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(CS$74);
         return var2;
      }
   }

   public void unsetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CS$74, 0);
      }
   }

   public CTEm getEm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEm var2 = null;
         var2 = (CTEm)this.get_store().find_element_user(EM$76, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EM$76) != 0;
      }
   }

   public void setEm(CTEm var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEm var3 = null;
         var3 = (CTEm)this.get_store().find_element_user(EM$76, 0);
         if(var3 == null) {
            var3 = (CTEm)this.get_store().add_element_user(EM$76);
         }

         var3.set(var1);
      }
   }

   public CTEm addNewEm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEm var2 = null;
         var2 = (CTEm)this.get_store().add_element_user(EM$76);
         return var2;
      }
   }

   public void unsetEm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EM$76, 0);
      }
   }

   public CTLanguage getLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLanguage var2 = null;
         var2 = (CTLanguage)this.get_store().find_element_user(LANG$78, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LANG$78) != 0;
      }
   }

   public void setLang(CTLanguage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLanguage var3 = null;
         var3 = (CTLanguage)this.get_store().find_element_user(LANG$78, 0);
         if(var3 == null) {
            var3 = (CTLanguage)this.get_store().add_element_user(LANG$78);
         }

         var3.set(var1);
      }
   }

   public CTLanguage addNewLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLanguage var2 = null;
         var2 = (CTLanguage)this.get_store().add_element_user(LANG$78);
         return var2;
      }
   }

   public void unsetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LANG$78, 0);
      }
   }

   public CTEastAsianLayout getEastAsianLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEastAsianLayout var2 = null;
         var2 = (CTEastAsianLayout)this.get_store().find_element_user(EASTASIANLAYOUT$80, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEastAsianLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EASTASIANLAYOUT$80) != 0;
      }
   }

   public void setEastAsianLayout(CTEastAsianLayout var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEastAsianLayout var3 = null;
         var3 = (CTEastAsianLayout)this.get_store().find_element_user(EASTASIANLAYOUT$80, 0);
         if(var3 == null) {
            var3 = (CTEastAsianLayout)this.get_store().add_element_user(EASTASIANLAYOUT$80);
         }

         var3.set(var1);
      }
   }

   public CTEastAsianLayout addNewEastAsianLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEastAsianLayout var2 = null;
         var2 = (CTEastAsianLayout)this.get_store().add_element_user(EASTASIANLAYOUT$80);
         return var2;
      }
   }

   public void unsetEastAsianLayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EASTASIANLAYOUT$80, 0);
      }
   }

   public CTOnOff getSpecVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SPECVANISH$82, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpecVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPECVANISH$82) != 0;
      }
   }

   public void setSpecVanish(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SPECVANISH$82, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SPECVANISH$82);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSpecVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SPECVANISH$82);
         return var2;
      }
   }

   public void unsetSpecVanish() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPECVANISH$82, 0);
      }
   }

   public CTOnOff getOMath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(OMATH$84, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetOMath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OMATH$84) != 0;
      }
   }

   public void setOMath(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(OMATH$84, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(OMATH$84);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewOMath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(OMATH$84);
         return var2;
      }
   }

   public void unsetOMath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OMATH$84, 0);
      }
   }

   public CTParaRPrChange getRPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTParaRPrChange var2 = null;
         var2 = (CTParaRPrChange)this.get_store().find_element_user(RPRCHANGE$86, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPRCHANGE$86) != 0;
      }
   }

   public void setRPrChange(CTParaRPrChange var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTParaRPrChange var3 = null;
         var3 = (CTParaRPrChange)this.get_store().find_element_user(RPRCHANGE$86, 0);
         if(var3 == null) {
            var3 = (CTParaRPrChange)this.get_store().add_element_user(RPRCHANGE$86);
         }

         var3.set(var1);
      }
   }

   public CTParaRPrChange addNewRPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTParaRPrChange var2 = null;
         var2 = (CTParaRPrChange)this.get_store().add_element_user(RPRCHANGE$86);
         return var2;
      }
   }

   public void unsetRPrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPRCHANGE$86, 0);
      }
   }

}
