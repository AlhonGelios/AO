package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineFillGroupWrapper;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextUnderlineLineFollowText;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextCapsType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontSize;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextLanguageID;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextNonNegativePoint;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextPoint;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType;

public class CTTextCharacterPropertiesImpl extends XmlComplexContentImpl implements CTTextCharacterProperties {

   private static final QName LN$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ln");
   private static final QName NOFILL$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "noFill");
   private static final QName SOLIDFILL$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "solidFill");
   private static final QName GRADFILL$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gradFill");
   private static final QName BLIPFILL$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blipFill");
   private static final QName PATTFILL$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "pattFill");
   private static final QName GRPFILL$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grpFill");
   private static final QName EFFECTLST$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectLst");
   private static final QName EFFECTDAG$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "effectDag");
   private static final QName HIGHLIGHT$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "highlight");
   private static final QName ULNTX$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uLnTx");
   private static final QName ULN$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uLn");
   private static final QName UFILLTX$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uFillTx");
   private static final QName UFILL$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "uFill");
   private static final QName LATIN$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "latin");
   private static final QName EA$30 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "ea");
   private static final QName CS$32 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "cs");
   private static final QName SYM$34 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sym");
   private static final QName HLINKCLICK$36 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkClick");
   private static final QName HLINKMOUSEOVER$38 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hlinkMouseOver");
   private static final QName EXTLST$40 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName KUMIMOJI$42 = new QName("", "kumimoji");
   private static final QName LANG$44 = new QName("", "lang");
   private static final QName ALTLANG$46 = new QName("", "altLang");
   private static final QName SZ$48 = new QName("", "sz");
   private static final QName B$50 = new QName("", "b");
   private static final QName I$52 = new QName("", "i");
   private static final QName U$54 = new QName("", "u");
   private static final QName STRIKE$56 = new QName("", "strike");
   private static final QName KERN$58 = new QName("", "kern");
   private static final QName CAP$60 = new QName("", "cap");
   private static final QName SPC$62 = new QName("", "spc");
   private static final QName NORMALIZEH$64 = new QName("", "normalizeH");
   private static final QName BASELINE$66 = new QName("", "baseline");
   private static final QName NOPROOF$68 = new QName("", "noProof");
   private static final QName DIRTY$70 = new QName("", "dirty");
   private static final QName ERR$72 = new QName("", "err");
   private static final QName SMTCLEAN$74 = new QName("", "smtClean");
   private static final QName SMTID$76 = new QName("", "smtId");
   private static final QName BMK$78 = new QName("", "bmk");


   public CTTextCharacterPropertiesImpl(SchemaType var1) {
      super(var1);
   }

   public CTLineProperties getLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(LN$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LN$0) != 0;
      }
   }

   public void setLn(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(LN$0, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(LN$0);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(LN$0);
         return var2;
      }
   }

   public void unsetLn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LN$0, 0);
      }
   }

   public CTNoFillProperties getNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOFILL$2) != 0;
      }
   }

   public void setNoFill(CTNoFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var3 = null;
         var3 = (CTNoFillProperties)this.get_store().find_element_user(NOFILL$2, 0);
         if(var3 == null) {
            var3 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$2);
         }

         var3.set(var1);
      }
   }

   public CTNoFillProperties addNewNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNoFillProperties var2 = null;
         var2 = (CTNoFillProperties)this.get_store().add_element_user(NOFILL$2);
         return var2;
      }
   }

   public void unsetNoFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOFILL$2, 0);
      }
   }

   public CTSolidColorFillProperties getSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SOLIDFILL$4) != 0;
      }
   }

   public void setSolidFill(CTSolidColorFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var3 = null;
         var3 = (CTSolidColorFillProperties)this.get_store().find_element_user(SOLIDFILL$4, 0);
         if(var3 == null) {
            var3 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$4);
         }

         var3.set(var1);
      }
   }

   public CTSolidColorFillProperties addNewSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSolidColorFillProperties var2 = null;
         var2 = (CTSolidColorFillProperties)this.get_store().add_element_user(SOLIDFILL$4);
         return var2;
      }
   }

   public void unsetSolidFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SOLIDFILL$4, 0);
      }
   }

   public CTGradientFillProperties getGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRADFILL$6) != 0;
      }
   }

   public void setGradFill(CTGradientFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var3 = null;
         var3 = (CTGradientFillProperties)this.get_store().find_element_user(GRADFILL$6, 0);
         if(var3 == null) {
            var3 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$6);
         }

         var3.set(var1);
      }
   }

   public CTGradientFillProperties addNewGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGradientFillProperties var2 = null;
         var2 = (CTGradientFillProperties)this.get_store().add_element_user(GRADFILL$6);
         return var2;
      }
   }

   public void unsetGradFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRADFILL$6, 0);
      }
   }

   public CTBlipFillProperties getBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLIPFILL$8) != 0;
      }
   }

   public void setBlipFill(CTBlipFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var3 = null;
         var3 = (CTBlipFillProperties)this.get_store().find_element_user(BLIPFILL$8, 0);
         if(var3 == null) {
            var3 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$8);
         }

         var3.set(var1);
      }
   }

   public CTBlipFillProperties addNewBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlipFillProperties var2 = null;
         var2 = (CTBlipFillProperties)this.get_store().add_element_user(BLIPFILL$8);
         return var2;
      }
   }

   public void unsetBlipFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLIPFILL$8, 0);
      }
   }

   public CTPatternFillProperties getPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATTFILL$10) != 0;
      }
   }

   public void setPattFill(CTPatternFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var3 = null;
         var3 = (CTPatternFillProperties)this.get_store().find_element_user(PATTFILL$10, 0);
         if(var3 == null) {
            var3 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$10);
         }

         var3.set(var1);
      }
   }

   public CTPatternFillProperties addNewPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPatternFillProperties var2 = null;
         var2 = (CTPatternFillProperties)this.get_store().add_element_user(PATTFILL$10);
         return var2;
      }
   }

   public void unsetPattFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATTFILL$10, 0);
      }
   }

   public CTGroupFillProperties getGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRPFILL$12) != 0;
      }
   }

   public void setGrpFill(CTGroupFillProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var3 = null;
         var3 = (CTGroupFillProperties)this.get_store().find_element_user(GRPFILL$12, 0);
         if(var3 == null) {
            var3 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$12);
         }

         var3.set(var1);
      }
   }

   public CTGroupFillProperties addNewGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroupFillProperties var2 = null;
         var2 = (CTGroupFillProperties)this.get_store().add_element_user(GRPFILL$12);
         return var2;
      }
   }

   public void unsetGrpFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRPFILL$12, 0);
      }
   }

   public CTEffectList getEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTLST$14) != 0;
      }
   }

   public void setEffectLst(CTEffectList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var3 = null;
         var3 = (CTEffectList)this.get_store().find_element_user(EFFECTLST$14, 0);
         if(var3 == null) {
            var3 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTEffectList addNewEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectList var2 = null;
         var2 = (CTEffectList)this.get_store().add_element_user(EFFECTLST$14);
         return var2;
      }
   }

   public void unsetEffectLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTLST$14, 0);
      }
   }

   public CTEffectContainer getEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EFFECTDAG$16) != 0;
      }
   }

   public void setEffectDag(CTEffectContainer var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var3 = null;
         var3 = (CTEffectContainer)this.get_store().find_element_user(EFFECTDAG$16, 0);
         if(var3 == null) {
            var3 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$16);
         }

         var3.set(var1);
      }
   }

   public CTEffectContainer addNewEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEffectContainer var2 = null;
         var2 = (CTEffectContainer)this.get_store().add_element_user(EFFECTDAG$16);
         return var2;
      }
   }

   public void unsetEffectDag() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EFFECTDAG$16, 0);
      }
   }

   public CTColor getHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().find_element_user(HIGHLIGHT$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIGHLIGHT$18) != 0;
      }
   }

   public void setHighlight(CTColor var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var3 = null;
         var3 = (CTColor)this.get_store().find_element_user(HIGHLIGHT$18, 0);
         if(var3 == null) {
            var3 = (CTColor)this.get_store().add_element_user(HIGHLIGHT$18);
         }

         var3.set(var1);
      }
   }

   public CTColor addNewHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColor var2 = null;
         var2 = (CTColor)this.get_store().add_element_user(HIGHLIGHT$18);
         return var2;
      }
   }

   public void unsetHighlight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIGHLIGHT$18, 0);
      }
   }

   public CTTextUnderlineLineFollowText getULnTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineLineFollowText var2 = null;
         var2 = (CTTextUnderlineLineFollowText)this.get_store().find_element_user(ULNTX$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetULnTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ULNTX$20) != 0;
      }
   }

   public void setULnTx(CTTextUnderlineLineFollowText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineLineFollowText var3 = null;
         var3 = (CTTextUnderlineLineFollowText)this.get_store().find_element_user(ULNTX$20, 0);
         if(var3 == null) {
            var3 = (CTTextUnderlineLineFollowText)this.get_store().add_element_user(ULNTX$20);
         }

         var3.set(var1);
      }
   }

   public CTTextUnderlineLineFollowText addNewULnTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineLineFollowText var2 = null;
         var2 = (CTTextUnderlineLineFollowText)this.get_store().add_element_user(ULNTX$20);
         return var2;
      }
   }

   public void unsetULnTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ULNTX$20, 0);
      }
   }

   public CTLineProperties getULn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().find_element_user(ULN$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetULn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ULN$22) != 0;
      }
   }

   public void setULn(CTLineProperties var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var3 = null;
         var3 = (CTLineProperties)this.get_store().find_element_user(ULN$22, 0);
         if(var3 == null) {
            var3 = (CTLineProperties)this.get_store().add_element_user(ULN$22);
         }

         var3.set(var1);
      }
   }

   public CTLineProperties addNewULn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLineProperties var2 = null;
         var2 = (CTLineProperties)this.get_store().add_element_user(ULN$22);
         return var2;
      }
   }

   public void unsetULn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ULN$22, 0);
      }
   }

   public CTTextUnderlineFillFollowText getUFillTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineFillFollowText var2 = null;
         var2 = (CTTextUnderlineFillFollowText)this.get_store().find_element_user(UFILLTX$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUFillTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UFILLTX$24) != 0;
      }
   }

   public void setUFillTx(CTTextUnderlineFillFollowText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineFillFollowText var3 = null;
         var3 = (CTTextUnderlineFillFollowText)this.get_store().find_element_user(UFILLTX$24, 0);
         if(var3 == null) {
            var3 = (CTTextUnderlineFillFollowText)this.get_store().add_element_user(UFILLTX$24);
         }

         var3.set(var1);
      }
   }

   public CTTextUnderlineFillFollowText addNewUFillTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineFillFollowText var2 = null;
         var2 = (CTTextUnderlineFillFollowText)this.get_store().add_element_user(UFILLTX$24);
         return var2;
      }
   }

   public void unsetUFillTx() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UFILLTX$24, 0);
      }
   }

   public CTTextUnderlineFillGroupWrapper getUFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineFillGroupWrapper var2 = null;
         var2 = (CTTextUnderlineFillGroupWrapper)this.get_store().find_element_user(UFILL$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UFILL$26) != 0;
      }
   }

   public void setUFill(CTTextUnderlineFillGroupWrapper var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineFillGroupWrapper var3 = null;
         var3 = (CTTextUnderlineFillGroupWrapper)this.get_store().find_element_user(UFILL$26, 0);
         if(var3 == null) {
            var3 = (CTTextUnderlineFillGroupWrapper)this.get_store().add_element_user(UFILL$26);
         }

         var3.set(var1);
      }
   }

   public CTTextUnderlineFillGroupWrapper addNewUFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextUnderlineFillGroupWrapper var2 = null;
         var2 = (CTTextUnderlineFillGroupWrapper)this.get_store().add_element_user(UFILL$26);
         return var2;
      }
   }

   public void unsetUFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UFILL$26, 0);
      }
   }

   public CTTextFont getLatin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(LATIN$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLatin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LATIN$28) != 0;
      }
   }

   public void setLatin(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(LATIN$28, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(LATIN$28);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewLatin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(LATIN$28);
         return var2;
      }
   }

   public void unsetLatin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LATIN$28, 0);
      }
   }

   public CTTextFont getEa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(EA$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EA$30) != 0;
      }
   }

   public void setEa(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(EA$30, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(EA$30);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewEa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(EA$30);
         return var2;
      }
   }

   public void unsetEa() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EA$30, 0);
      }
   }

   public CTTextFont getCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(CS$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CS$32) != 0;
      }
   }

   public void setCs(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(CS$32, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(CS$32);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(CS$32);
         return var2;
      }
   }

   public void unsetCs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CS$32, 0);
      }
   }

   public CTTextFont getSym() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().find_element_user(SYM$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSym() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SYM$34) != 0;
      }
   }

   public void setSym(CTTextFont var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var3 = null;
         var3 = (CTTextFont)this.get_store().find_element_user(SYM$34, 0);
         if(var3 == null) {
            var3 = (CTTextFont)this.get_store().add_element_user(SYM$34);
         }

         var3.set(var1);
      }
   }

   public CTTextFont addNewSym() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextFont var2 = null;
         var2 = (CTTextFont)this.get_store().add_element_user(SYM$34);
         return var2;
      }
   }

   public void unsetSym() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SYM$34, 0);
      }
   }

   public CTHyperlink getHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().find_element_user(HLINKCLICK$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HLINKCLICK$36) != 0;
      }
   }

   public void setHlinkClick(CTHyperlink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().find_element_user(HLINKCLICK$36, 0);
         if(var3 == null) {
            var3 = (CTHyperlink)this.get_store().add_element_user(HLINKCLICK$36);
         }

         var3.set(var1);
      }
   }

   public CTHyperlink addNewHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().add_element_user(HLINKCLICK$36);
         return var2;
      }
   }

   public void unsetHlinkClick() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HLINKCLICK$36, 0);
      }
   }

   public CTHyperlink getHlinkMouseOver() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().find_element_user(HLINKMOUSEOVER$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHlinkMouseOver() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HLINKMOUSEOVER$38) != 0;
      }
   }

   public void setHlinkMouseOver(CTHyperlink var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var3 = null;
         var3 = (CTHyperlink)this.get_store().find_element_user(HLINKMOUSEOVER$38, 0);
         if(var3 == null) {
            var3 = (CTHyperlink)this.get_store().add_element_user(HLINKMOUSEOVER$38);
         }

         var3.set(var1);
      }
   }

   public CTHyperlink addNewHlinkMouseOver() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHyperlink var2 = null;
         var2 = (CTHyperlink)this.get_store().add_element_user(HLINKMOUSEOVER$38);
         return var2;
      }
   }

   public void unsetHlinkMouseOver() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HLINKMOUSEOVER$38, 0);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$40) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$40, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$40);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$40);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$40, 0);
      }
   }

   public boolean getKumimoji() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(KUMIMOJI$42);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetKumimoji() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(KUMIMOJI$42);
         return var2;
      }
   }

   public boolean isSetKumimoji() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(KUMIMOJI$42) != null;
      }
   }

   public void setKumimoji(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(KUMIMOJI$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(KUMIMOJI$42);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetKumimoji(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(KUMIMOJI$42);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(KUMIMOJI$42);
         }

         var3.set(var1);
      }
   }

   public void unsetKumimoji() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(KUMIMOJI$42);
      }
   }

   public String getLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LANG$44);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STTextLanguageID xgetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextLanguageID var2 = null;
         var2 = (STTextLanguageID)this.get_store().find_attribute_user(LANG$44);
         return var2;
      }
   }

   public boolean isSetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LANG$44) != null;
      }
   }

   public void setLang(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LANG$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LANG$44);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLang(STTextLanguageID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextLanguageID var3 = null;
         var3 = (STTextLanguageID)this.get_store().find_attribute_user(LANG$44);
         if(var3 == null) {
            var3 = (STTextLanguageID)this.get_store().add_attribute_user(LANG$44);
         }

         var3.set(var1);
      }
   }

   public void unsetLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LANG$44);
      }
   }

   public String getAltLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALTLANG$46);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STTextLanguageID xgetAltLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextLanguageID var2 = null;
         var2 = (STTextLanguageID)this.get_store().find_attribute_user(ALTLANG$46);
         return var2;
      }
   }

   public boolean isSetAltLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALTLANG$46) != null;
      }
   }

   public void setAltLang(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALTLANG$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALTLANG$46);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAltLang(STTextLanguageID var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextLanguageID var3 = null;
         var3 = (STTextLanguageID)this.get_store().find_attribute_user(ALTLANG$46);
         if(var3 == null) {
            var3 = (STTextLanguageID)this.get_store().add_attribute_user(ALTLANG$46);
         }

         var3.set(var1);
      }
   }

   public void unsetAltLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALTLANG$46);
      }
   }

   public int getSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SZ$48);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextFontSize xgetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextFontSize var2 = null;
         var2 = (STTextFontSize)this.get_store().find_attribute_user(SZ$48);
         return var2;
      }
   }

   public boolean isSetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SZ$48) != null;
      }
   }

   public void setSz(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SZ$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SZ$48);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSz(STTextFontSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextFontSize var3 = null;
         var3 = (STTextFontSize)this.get_store().find_attribute_user(SZ$48);
         if(var3 == null) {
            var3 = (STTextFontSize)this.get_store().add_attribute_user(SZ$48);
         }

         var3.set(var1);
      }
   }

   public void unsetSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SZ$48);
      }
   }

   public boolean getB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(B$50);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(B$50);
         return var2;
      }
   }

   public boolean isSetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(B$50) != null;
      }
   }

   public void setB(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(B$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(B$50);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetB(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(B$50);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(B$50);
         }

         var3.set(var1);
      }
   }

   public void unsetB() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(B$50);
      }
   }

   public boolean getI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(I$52);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(I$52);
         return var2;
      }
   }

   public boolean isSetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(I$52) != null;
      }
   }

   public void setI(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(I$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(I$52);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetI(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(I$52);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(I$52);
         }

         var3.set(var1);
      }
   }

   public void unsetI() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(I$52);
      }
   }

   public STTextUnderlineType.Enum getU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(U$54);
         return var2 == null?null:(STTextUnderlineType.Enum)var2.getEnumValue();
      }
   }

   public STTextUnderlineType xgetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextUnderlineType var2 = null;
         var2 = (STTextUnderlineType)this.get_store().find_attribute_user(U$54);
         return var2;
      }
   }

   public boolean isSetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(U$54) != null;
      }
   }

   public void setU(STTextUnderlineType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(U$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(U$54);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetU(STTextUnderlineType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextUnderlineType var3 = null;
         var3 = (STTextUnderlineType)this.get_store().find_attribute_user(U$54);
         if(var3 == null) {
            var3 = (STTextUnderlineType)this.get_store().add_attribute_user(U$54);
         }

         var3.set(var1);
      }
   }

   public void unsetU() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(U$54);
      }
   }

   public STTextStrikeType.Enum getStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STRIKE$56);
         return var2 == null?null:(STTextStrikeType.Enum)var2.getEnumValue();
      }
   }

   public STTextStrikeType xgetStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextStrikeType var2 = null;
         var2 = (STTextStrikeType)this.get_store().find_attribute_user(STRIKE$56);
         return var2;
      }
   }

   public boolean isSetStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STRIKE$56) != null;
      }
   }

   public void setStrike(STTextStrikeType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STRIKE$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STRIKE$56);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStrike(STTextStrikeType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextStrikeType var3 = null;
         var3 = (STTextStrikeType)this.get_store().find_attribute_user(STRIKE$56);
         if(var3 == null) {
            var3 = (STTextStrikeType)this.get_store().add_attribute_user(STRIKE$56);
         }

         var3.set(var1);
      }
   }

   public void unsetStrike() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STRIKE$56);
      }
   }

   public int getKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(KERN$58);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextNonNegativePoint xgetKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextNonNegativePoint var2 = null;
         var2 = (STTextNonNegativePoint)this.get_store().find_attribute_user(KERN$58);
         return var2;
      }
   }

   public boolean isSetKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(KERN$58) != null;
      }
   }

   public void setKern(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(KERN$58);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(KERN$58);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetKern(STTextNonNegativePoint var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextNonNegativePoint var3 = null;
         var3 = (STTextNonNegativePoint)this.get_store().find_attribute_user(KERN$58);
         if(var3 == null) {
            var3 = (STTextNonNegativePoint)this.get_store().add_attribute_user(KERN$58);
         }

         var3.set(var1);
      }
   }

   public void unsetKern() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(KERN$58);
      }
   }

   public STTextCapsType.Enum getCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CAP$60);
         return var2 == null?null:(STTextCapsType.Enum)var2.getEnumValue();
      }
   }

   public STTextCapsType xgetCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextCapsType var2 = null;
         var2 = (STTextCapsType)this.get_store().find_attribute_user(CAP$60);
         return var2;
      }
   }

   public boolean isSetCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CAP$60) != null;
      }
   }

   public void setCap(STTextCapsType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CAP$60);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CAP$60);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCap(STTextCapsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextCapsType var3 = null;
         var3 = (STTextCapsType)this.get_store().find_attribute_user(CAP$60);
         if(var3 == null) {
            var3 = (STTextCapsType)this.get_store().add_attribute_user(CAP$60);
         }

         var3.set(var1);
      }
   }

   public void unsetCap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CAP$60);
      }
   }

   public int getSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPC$62);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STTextPoint xgetSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextPoint var2 = null;
         var2 = (STTextPoint)this.get_store().find_attribute_user(SPC$62);
         return var2;
      }
   }

   public boolean isSetSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPC$62) != null;
      }
   }

   public void setSpc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPC$62);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPC$62);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSpc(STTextPoint var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTextPoint var3 = null;
         var3 = (STTextPoint)this.get_store().find_attribute_user(SPC$62);
         if(var3 == null) {
            var3 = (STTextPoint)this.get_store().add_attribute_user(SPC$62);
         }

         var3.set(var1);
      }
   }

   public void unsetSpc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPC$62);
      }
   }

   public boolean getNormalizeH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NORMALIZEH$64);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNormalizeH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NORMALIZEH$64);
         return var2;
      }
   }

   public boolean isSetNormalizeH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NORMALIZEH$64) != null;
      }
   }

   public void setNormalizeH(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NORMALIZEH$64);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NORMALIZEH$64);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNormalizeH(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NORMALIZEH$64);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NORMALIZEH$64);
         }

         var3.set(var1);
      }
   }

   public void unsetNormalizeH() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NORMALIZEH$64);
      }
   }

   public int getBaseline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BASELINE$66);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetBaseline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(BASELINE$66);
         return var2;
      }
   }

   public boolean isSetBaseline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BASELINE$66) != null;
      }
   }

   public void setBaseline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BASELINE$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BASELINE$66);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetBaseline(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(BASELINE$66);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(BASELINE$66);
         }

         var3.set(var1);
      }
   }

   public void unsetBaseline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BASELINE$66);
      }
   }

   public boolean getNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(NOPROOF$68);
         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(NOPROOF$68);
         return var2;
      }
   }

   public boolean isSetNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(NOPROOF$68) != null;
      }
   }

   public void setNoProof(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(NOPROOF$68);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(NOPROOF$68);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetNoProof(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(NOPROOF$68);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(NOPROOF$68);
         }

         var3.set(var1);
      }
   }

   public void unsetNoProof() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(NOPROOF$68);
      }
   }

   public boolean getDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DIRTY$70);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DIRTY$70);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DIRTY$70);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DIRTY$70);
         }

         return var2;
      }
   }

   public boolean isSetDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DIRTY$70) != null;
      }
   }

   public void setDirty(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DIRTY$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DIRTY$70);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDirty(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DIRTY$70);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DIRTY$70);
         }

         var3.set(var1);
      }
   }

   public void unsetDirty() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DIRTY$70);
      }
   }

   public boolean getErr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ERR$72);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ERR$72);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetErr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ERR$72);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ERR$72);
         }

         return var2;
      }
   }

   public boolean isSetErr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ERR$72) != null;
      }
   }

   public void setErr(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ERR$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ERR$72);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetErr(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ERR$72);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ERR$72);
         }

         var3.set(var1);
      }
   }

   public void unsetErr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ERR$72);
      }
   }

   public boolean getSmtClean() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SMTCLEAN$74);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SMTCLEAN$74);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSmtClean() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SMTCLEAN$74);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SMTCLEAN$74);
         }

         return var2;
      }
   }

   public boolean isSetSmtClean() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SMTCLEAN$74) != null;
      }
   }

   public void setSmtClean(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SMTCLEAN$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SMTCLEAN$74);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSmtClean(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SMTCLEAN$74);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SMTCLEAN$74);
         }

         var3.set(var1);
      }
   }

   public void unsetSmtClean() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SMTCLEAN$74);
      }
   }

   public long getSmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SMTID$76);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SMTID$76);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetSmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(SMTID$76);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(SMTID$76);
         }

         return var2;
      }
   }

   public boolean isSetSmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SMTID$76) != null;
      }
   }

   public void setSmtId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(SMTID$76);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(SMTID$76);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetSmtId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(SMTID$76);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(SMTID$76);
         }

         var3.set(var1);
      }
   }

   public void unsetSmtId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SMTID$76);
      }
   }

   public String getBmk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BMK$78);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBmk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BMK$78);
         return var2;
      }
   }

   public boolean isSetBmk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BMK$78) != null;
      }
   }

   public void setBmk(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BMK$78);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BMK$78);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBmk(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BMK$78);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BMK$78);
         }

         var3.set(var1);
      }
   }

   public void unsetBmk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BMK$78);
      }
   }

}
