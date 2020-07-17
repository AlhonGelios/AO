package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletColorFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizeFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletTypefaceFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNoBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate32;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextIndent;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextMargin;

public class CTTextParagraphPropertiesImpl extends XmlComplexContentImpl implements CTTextParagraphProperties {

   private static final QName LNSPC$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lnSpc");
   private static final QName SPCBEF$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcBef");
   private static final QName SPCAFT$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spcAft");
   private static final QName BUCLRTX$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buClrTx");
   private static final QName BUCLR$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buClr");
   private static final QName BUSZTX$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buSzTx");
   private static final QName BUSZPCT$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buSzPct");
   private static final QName BUSZPTS$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buSzPts");
   private static final QName BUFONTTX$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buFontTx");
   private static final QName BUFONT$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buFont");
   private static final QName BUNONE$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buNone");
   private static final QName BUAUTONUM$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buAutoNum");
   private static final QName BUCHAR$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buChar");
   private static final QName BUBLIP$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "buBlip");
   private static final QName TABLST$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tabLst");
   private static final QName DEFRPR$30 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "defRPr");
   private static final QName EXTLST$32 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName MARL$34 = new QName("", "marL");
   private static final QName MARR$36 = new QName("", "marR");
   private static final QName LVL$38 = new QName("", "lvl");
   private static final QName INDENT$40 = new QName("", "indent");
   private static final QName ALGN$42 = new QName("", "algn");
   private static final QName DEFTABSZ$44 = new QName("", "defTabSz");
   private static final QName RTL$46 = new QName("", "rtl");
   private static final QName EALNBRK$48 = new QName("", "eaLnBrk");
   private static final QName FONTALGN$50 = new QName("", "fontAlgn");
   private static final QName LATINLNBRK$52 = new QName("", "latinLnBrk");
   private static final QName HANGINGPUNCT$54 = new QName("", "hangingPunct");


   public CTTextParagraphPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTTextSpacing getLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var2 = null;
         var2 = (CTTextSpacing)this.get_store().find_element_user(LNSPC$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LNSPC$0) != 0;
      }
   }

   public void setLnSpc(CTTextSpacing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var3 = null;
         var3 = (CTTextSpacing)this.get_store().find_element_user(LNSPC$0, 0);
         if(var3 == null) {
            var3 = (CTTextSpacing)this.get_store().add_element_user(LNSPC$0);
         }

         var3.set(var1);
      }
   }

   public CTTextSpacing addNewLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var2 = null;
         var2 = (CTTextSpacing)this.get_store().add_element_user(LNSPC$0);
         return var2;
      }
   }

   public void unsetLnSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LNSPC$0, 0);
      }
   }

   public CTTextSpacing getSpcBef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var2 = null;
         var2 = (CTTextSpacing)this.get_store().find_element_user(SPCBEF$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpcBef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPCBEF$2) != 0;
      }
   }

   public void setSpcBef(CTTextSpacing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var3 = null;
         var3 = (CTTextSpacing)this.get_store().find_element_user(SPCBEF$2, 0);
         if(var3 == null) {
            var3 = (CTTextSpacing)this.get_store().add_element_user(SPCBEF$2);
         }

         var3.set(var1);
      }
   }

   public CTTextSpacing addNewSpcBef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var2 = null;
         var2 = (CTTextSpacing)this.get_store().add_element_user(SPCBEF$2);
         return var2;
      }
   }

   public void unsetSpcBef() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPCBEF$2, 0);
      }
   }

   public CTTextSpacing getSpcAft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var2 = null;
         var2 = (CTTextSpacing)this.get_store().find_element_user(SPCAFT$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSpcAft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SPCAFT$4) != 0;
      }
   }

   public void setSpcAft(CTTextSpacing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var3 = null;
         var3 = (CTTextSpacing)this.get_store().find_element_user(SPCAFT$4, 0);
         if(var3 == null) {
            var3 = (CTTextSpacing)this.get_store().add_element_user(SPCAFT$4);
         }

         var3.set(var1);
      }
   }

   public CTTextSpacing addNewSpcAft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextSpacing var2 = null;
         var2 = (CTTextSpacing)this.get_store().add_element_user(SPCAFT$4);
         return var2;
      }
   }

   public void unsetSpcAft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SPCAFT$4, 0);
      }
   }

   public CTTextBulletColorFollowText getBuClrTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletColorFollowText var2 = null;
         var2 = (CTTextBulletColorFollowText)this.get_store().find_element_user(BUCLRTX$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuClrTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUCLRTX$6) != 0;
      }
   }

   public void setBuClrTx(CTTextBulletColorFollowText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletColorFollowText var3 = null;
         var3 = (CTTextBulletColorFollowText)this.get_store().find_element_user(BUCLRTX$6, 0);
         if(var3 == null) {
            var3 = (CTTextBulletColorFollowText)this.get_store().add_element_user(BUCLRTX$6);
         }

         var3.set(var1);
      }
   }

   public CTTextBulletColorFollowText addNewBuClrTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletColorFollowText var2 = null;
         var2 = (CTTextBulletColorFollowText)this.get_store().add_element_user(BUCLRTX$6);
         return var2;
      }
   }

   public void unsetBuClrTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUCLRTX$6, 0);
      }
   }

   public CTColor getBuClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(BUCLR$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUCLR$8) != 0;
      }
   }

   public void setBuClr(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(BUCLR$8, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(BUCLR$8);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewBuClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(BUCLR$8);
         return var2;
      }
   }

   public void unsetBuClr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUCLR$8, 0);
      }
   }

   public CTTextBulletSizeFollowText getBuSzTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizeFollowText var2 = null;
         var2 = (CTTextBulletSizeFollowText)this.get_store().find_element_user(BUSZTX$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuSzTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUSZTX$10) != 0;
      }
   }

   public void setBuSzTx(CTTextBulletSizeFollowText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizeFollowText var3 = null;
         var3 = (CTTextBulletSizeFollowText)this.get_store().find_element_user(BUSZTX$10, 0);
         if(var3 == null) {
            var3 = (CTTextBulletSizeFollowText)this.get_store().add_element_user(BUSZTX$10);
         }

         var3.set(var1);
      }
   }

   public CTTextBulletSizeFollowText addNewBuSzTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizeFollowText var2 = null;
         var2 = (CTTextBulletSizeFollowText)this.get_store().add_element_user(BUSZTX$10);
         return var2;
      }
   }

   public void unsetBuSzTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUSZTX$10, 0);
      }
   }

   public CTTextBulletSizePercent getBuSzPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizePercent var2 = null;
         var2 = (CTTextBulletSizePercent)this.get_store().find_element_user(BUSZPCT$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuSzPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUSZPCT$12) != 0;
      }
   }

   public void setBuSzPct(CTTextBulletSizePercent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizePercent var3 = null;
         var3 = (CTTextBulletSizePercent)this.get_store().find_element_user(BUSZPCT$12, 0);
         if(var3 == null) {
            var3 = (CTTextBulletSizePercent)this.get_store().add_element_user(BUSZPCT$12);
         }

         var3.set(var1);
      }
   }

   public CTTextBulletSizePercent addNewBuSzPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizePercent var2 = null;
         var2 = (CTTextBulletSizePercent)this.get_store().add_element_user(BUSZPCT$12);
         return var2;
      }
   }

   public void unsetBuSzPct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUSZPCT$12, 0);
      }
   }

   public CTTextBulletSizePoint getBuSzPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizePoint var2 = null;
         var2 = (CTTextBulletSizePoint)this.get_store().find_element_user(BUSZPTS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuSzPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUSZPTS$14) != 0;
      }
   }

   public void setBuSzPts(CTTextBulletSizePoint var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizePoint var3 = null;
         var3 = (CTTextBulletSizePoint)this.get_store().find_element_user(BUSZPTS$14, 0);
         if(var3 == null) {
            var3 = (CTTextBulletSizePoint)this.get_store().add_element_user(BUSZPTS$14);
         }

         var3.set(var1);
      }
   }

   public CTTextBulletSizePoint addNewBuSzPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletSizePoint var2 = null;
         var2 = (CTTextBulletSizePoint)this.get_store().add_element_user(BUSZPTS$14);
         return var2;
      }
   }

   public void unsetBuSzPts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUSZPTS$14, 0);
      }
   }

   public CTTextBulletTypefaceFollowText getBuFontTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletTypefaceFollowText var2 = null;
         var2 = (CTTextBulletTypefaceFollowText)this.get_store().find_element_user(BUFONTTX$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuFontTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUFONTTX$16) != 0;
      }
   }

   public void setBuFontTx(CTTextBulletTypefaceFollowText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletTypefaceFollowText var3 = null;
         var3 = (CTTextBulletTypefaceFollowText)this.get_store().find_element_user(BUFONTTX$16, 0);
         if(var3 == null) {
            var3 = (CTTextBulletTypefaceFollowText)this.get_store().add_element_user(BUFONTTX$16);
         }

         var3.set(var1);
      }
   }

   public CTTextBulletTypefaceFollowText addNewBuFontTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBulletTypefaceFollowText var2 = null;
         var2 = (CTTextBulletTypefaceFollowText)this.get_store().add_element_user(BUFONTTX$16);
         return var2;
      }
   }

   public void unsetBuFontTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUFONTTX$16, 0);
      }
   }

   public CTTextFont getBuFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(BUFONT$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUFONT$18) != 0;
      }
   }

   public void setBuFont(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(BUFONT$18, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(BUFONT$18);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewBuFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(BUFONT$18);
         return var2;
      }
   }

   public void unsetBuFont() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUFONT$18, 0);
      }
   }

   public CTTextNoBullet getBuNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNoBullet var2 = null;
         var2 = (CTTextNoBullet)this.get_store().find_element_user(BUNONE$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUNONE$20) != 0;
      }
   }

   public void setBuNone(CTTextNoBullet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNoBullet var3 = null;
         var3 = (CTTextNoBullet)this.get_store().find_element_user(BUNONE$20, 0);
         if(var3 == null) {
            var3 = (CTTextNoBullet)this.get_store().add_element_user(BUNONE$20);
         }

         var3.set(var1);
      }
   }

   public CTTextNoBullet addNewBuNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextNoBullet var2 = null;
         var2 = (CTTextNoBullet)this.get_store().add_element_user(BUNONE$20);
         return var2;
      }
   }

   public void unsetBuNone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUNONE$20, 0);
      }
   }

   public CTTextAutonumberBullet getBuAutoNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextAutonumberBullet var2 = null;
         var2 = (CTTextAutonumberBullet)this.get_store().find_element_user(BUAUTONUM$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuAutoNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUAUTONUM$22) != 0;
      }
   }

   public void setBuAutoNum(CTTextAutonumberBullet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextAutonumberBullet var3 = null;
         var3 = (CTTextAutonumberBullet)this.get_store().find_element_user(BUAUTONUM$22, 0);
         if(var3 == null) {
            var3 = (CTTextAutonumberBullet)this.get_store().add_element_user(BUAUTONUM$22);
         }

         var3.set(var1);
      }
   }

   public CTTextAutonumberBullet addNewBuAutoNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextAutonumberBullet var2 = null;
         var2 = (CTTextAutonumberBullet)this.get_store().add_element_user(BUAUTONUM$22);
         return var2;
      }
   }

   public void unsetBuAutoNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUAUTONUM$22, 0);
      }
   }

   public CTTextCharBullet getBuChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharBullet var2 = null;
         var2 = (CTTextCharBullet)this.get_store().find_element_user(BUCHAR$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUCHAR$24) != 0;
      }
   }

   public void setBuChar(CTTextCharBullet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharBullet var3 = null;
         var3 = (CTTextCharBullet)this.get_store().find_element_user(BUCHAR$24, 0);
         if(var3 == null) {
            var3 = (CTTextCharBullet)this.get_store().add_element_user(BUCHAR$24);
         }

         var3.set(var1);
      }
   }

   public CTTextCharBullet addNewBuChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharBullet var2 = null;
         var2 = (CTTextCharBullet)this.get_store().add_element_user(BUCHAR$24);
         return var2;
      }
   }

   public void unsetBuChar() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUCHAR$24, 0);
      }
   }

   public CTTextBlipBullet getBuBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBlipBullet var2 = null;
         var2 = (CTTextBlipBullet)this.get_store().find_element_user(BUBLIP$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBuBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BUBLIP$26) != 0;
      }
   }

   public void setBuBlip(CTTextBlipBullet var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBlipBullet var3 = null;
         var3 = (CTTextBlipBullet)this.get_store().find_element_user(BUBLIP$26, 0);
         if(var3 == null) {
            var3 = (CTTextBlipBullet)this.get_store().add_element_user(BUBLIP$26);
         }

         var3.set(var1);
      }
   }

   public CTTextBlipBullet addNewBuBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextBlipBullet var2 = null;
         var2 = (CTTextBlipBullet)this.get_store().add_element_user(BUBLIP$26);
         return var2;
      }
   }

   public void unsetBuBlip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BUBLIP$26, 0);
      }
   }

   public CTTextTabStopList getTabLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStopList var2 = null;
         var2 = (CTTextTabStopList)this.get_store().find_element_user(TABLST$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTabLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TABLST$28) != 0;
      }
   }

   public void setTabLst(CTTextTabStopList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStopList var3 = null;
         var3 = (CTTextTabStopList)this.get_store().find_element_user(TABLST$28, 0);
         if(var3 == null) {
            var3 = (CTTextTabStopList)this.get_store().add_element_user(TABLST$28);
         }

         var3.set(var1);
      }
   }

   public CTTextTabStopList addNewTabLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextTabStopList var2 = null;
         var2 = (CTTextTabStopList)this.get_store().add_element_user(TABLST$28);
         return var2;
      }
   }

   public void unsetTabLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TABLST$28, 0);
      }
   }

   public CTTextCharacterProperties getDefRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var2 = null;
         var2 = (CTTextCharacterProperties)this.get_store().find_element_user(DEFRPR$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFRPR$30) != 0;
      }
   }

   public void setDefRPr(CTTextCharacterProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var3 = null;
         var3 = (CTTextCharacterProperties)this.get_store().find_element_user(DEFRPR$30, 0);
         if(var3 == null) {
            var3 = (CTTextCharacterProperties)this.get_store().add_element_user(DEFRPR$30);
         }

         var3.set(var1);
      }
   }

   public CTTextCharacterProperties addNewDefRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextCharacterProperties var2 = null;
         var2 = (CTTextCharacterProperties)this.get_store().add_element_user(DEFRPR$30);
         return var2;
      }
   }

   public void unsetDefRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFRPR$30, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$32) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$32, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$32);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$32);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$32, 0);
      }
   }

   public int getMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MARL$34);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextMargin xgetMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextMargin var2 = null;
         var2 = (STTextMargin)this.get_store().find_attribute_user(MARL$34);
         return var2;
      }
   }

   public boolean isSetMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MARL$34) != null;
      }
   }

   public void setMarL(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MARL$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MARL$34);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMarL(STTextMargin var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextMargin var3 = null;
         var3 = (STTextMargin)this.get_store().find_attribute_user(MARL$34);
         if(var3 == null) {
            var3 = (STTextMargin)this.get_store().add_attribute_user(MARL$34);
         }

         var3.set(var1);
      }
   }

   public void unsetMarL() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MARL$34);
      }
   }

   public int getMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MARR$36);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextMargin xgetMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextMargin var2 = null;
         var2 = (STTextMargin)this.get_store().find_attribute_user(MARR$36);
         return var2;
      }
   }

   public boolean isSetMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MARR$36) != null;
      }
   }

   public void setMarR(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MARR$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MARR$36);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMarR(STTextMargin var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextMargin var3 = null;
         var3 = (STTextMargin)this.get_store().find_attribute_user(MARR$36);
         if(var3 == null) {
            var3 = (STTextMargin)this.get_store().add_attribute_user(MARR$36);
         }

         var3.set(var1);
      }
   }

   public void unsetMarR() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MARR$36);
      }
   }

   public int getLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LVL$38);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextIndentLevelType xgetLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextIndentLevelType var2 = null;
         var2 = (STTextIndentLevelType)this.get_store().find_attribute_user(LVL$38);
         return var2;
      }
   }

   public boolean isSetLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LVL$38) != null;
      }
   }

   public void setLvl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LVL$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LVL$38);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetLvl(STTextIndentLevelType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextIndentLevelType var3 = null;
         var3 = (STTextIndentLevelType)this.get_store().find_attribute_user(LVL$38);
         if(var3 == null) {
            var3 = (STTextIndentLevelType)this.get_store().add_attribute_user(LVL$38);
         }

         var3.set(var1);
      }
   }

   public void unsetLvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LVL$38);
      }
   }

   public int getIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INDENT$40);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextIndent xgetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextIndent var2 = null;
         var2 = (STTextIndent)this.get_store().find_attribute_user(INDENT$40);
         return var2;
      }
   }

   public boolean isSetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INDENT$40) != null;
      }
   }

   public void setIndent(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INDENT$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INDENT$40);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetIndent(STTextIndent var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextIndent var3 = null;
         var3 = (STTextIndent)this.get_store().find_attribute_user(INDENT$40);
         if(var3 == null) {
            var3 = (STTextIndent)this.get_store().add_attribute_user(INDENT$40);
         }

         var3.set(var1);
      }
   }

   public void unsetIndent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INDENT$40);
      }
   }

   public STTextAlignType.Enum getAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGN$42);
         return var2 == null?null:(STTextAlignType.Enum)var2.getEnumValue();
      }
   }

   public STTextAlignType xgetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAlignType var2 = null;
         var2 = (STTextAlignType)this.get_store().find_attribute_user(ALGN$42);
         return var2;
      }
   }

   public boolean isSetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALGN$42) != null;
      }
   }

   public void setAlgn(STTextAlignType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGN$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGN$42);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAlgn(STTextAlignType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextAlignType var3 = null;
         var3 = (STTextAlignType)this.get_store().find_attribute_user(ALGN$42);
         if(var3 == null) {
            var3 = (STTextAlignType)this.get_store().add_attribute_user(ALGN$42);
         }

         var3.set(var1);
      }
   }

   public void unsetAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALGN$42);
      }
   }

   public int getDefTabSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFTABSZ$44);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STCoordinate32 xgetDefTabSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var2 = null;
         var2 = (STCoordinate32)this.get_store().find_attribute_user(DEFTABSZ$44);
         return var2;
      }
   }

   public boolean isSetDefTabSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFTABSZ$44) != null;
      }
   }

   public void setDefTabSz(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFTABSZ$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFTABSZ$44);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetDefTabSz(STCoordinate32 var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCoordinate32 var3 = null;
         var3 = (STCoordinate32)this.get_store().find_attribute_user(DEFTABSZ$44);
         if(var3 == null) {
            var3 = (STCoordinate32)this.get_store().add_attribute_user(DEFTABSZ$44);
         }

         var3.set(var1);
      }
   }

   public void unsetDefTabSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFTABSZ$44);
      }
   }

   public boolean getRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RTL$46);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(RTL$46);
         return var2;
      }
   }

   public boolean isSetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RTL$46) != null;
      }
   }

   public void setRtl(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RTL$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RTL$46);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRtl(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(RTL$46);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(RTL$46);
         }

         var3.set(var1);
      }
   }

   public void unsetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RTL$46);
      }
   }

   public boolean getEaLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EALNBRK$48);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEaLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EALNBRK$48);
         return var2;
      }
   }

   public boolean isSetEaLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EALNBRK$48) != null;
      }
   }

   public void setEaLnBrk(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EALNBRK$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EALNBRK$48);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEaLnBrk(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EALNBRK$48);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EALNBRK$48);
         }

         var3.set(var1);
      }
   }

   public void unsetEaLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EALNBRK$48);
      }
   }

   public STTextFontAlignType.Enum getFontAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FONTALGN$50);
         return var2 == null?null:(STTextFontAlignType.Enum)var2.getEnumValue();
      }
   }

   public STTextFontAlignType xgetFontAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextFontAlignType var2 = null;
         var2 = (STTextFontAlignType)this.get_store().find_attribute_user(FONTALGN$50);
         return var2;
      }
   }

   public boolean isSetFontAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FONTALGN$50) != null;
      }
   }

   public void setFontAlgn(STTextFontAlignType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FONTALGN$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FONTALGN$50);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFontAlgn(STTextFontAlignType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextFontAlignType var3 = null;
         var3 = (STTextFontAlignType)this.get_store().find_attribute_user(FONTALGN$50);
         if(var3 == null) {
            var3 = (STTextFontAlignType)this.get_store().add_attribute_user(FONTALGN$50);
         }

         var3.set(var1);
      }
   }

   public void unsetFontAlgn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FONTALGN$50);
      }
   }

   public boolean getLatinLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LATINLNBRK$52);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetLatinLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(LATINLNBRK$52);
         return var2;
      }
   }

   public boolean isSetLatinLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LATINLNBRK$52) != null;
      }
   }

   public void setLatinLnBrk(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LATINLNBRK$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LATINLNBRK$52);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetLatinLnBrk(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(LATINLNBRK$52);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(LATINLNBRK$52);
         }

         var3.set(var1);
      }
   }

   public void unsetLatinLnBrk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LATINLNBRK$52);
      }
   }

   public boolean getHangingPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HANGINGPUNCT$54);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetHangingPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(HANGINGPUNCT$54);
         return var2;
      }
   }

   public boolean isSetHangingPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HANGINGPUNCT$54) != null;
      }
   }

   public void setHangingPunct(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HANGINGPUNCT$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HANGINGPUNCT$54);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetHangingPunct(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(HANGINGPUNCT$54);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(HANGINGPUNCT$54);
         }

         var3.set(var1);
      }
   }

   public void unsetHangingPunct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HANGINGPUNCT$54);
      }
   }

}
