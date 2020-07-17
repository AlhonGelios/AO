package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelSuffix;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLevelText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvlLegacy;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

public class CTLvlImpl extends XmlComplexContentImpl implements CTLvl {

   private static final QName START$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "start");
   private static final QName NUMFMT$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numFmt");
   private static final QName LVLRESTART$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlRestart");
   private static final QName PSTYLE$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pStyle");
   private static final QName ISLGL$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "isLgl");
   private static final QName SUFF$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "suff");
   private static final QName LVLTEXT$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlText");
   private static final QName LVLPICBULLETID$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlPicBulletId");
   private static final QName LEGACY$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "legacy");
   private static final QName LVLJC$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lvlJc");
   private static final QName PPR$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pPr");
   private static final QName RPR$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rPr");
   private static final QName ILVL$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ilvl");
   private static final QName TPLC$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tplc");
   private static final QName TENTATIVE$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "tentative");


   public CTLvlImpl(SchemaType var1) {
      super(var1);
   }

   public CTDecimalNumber getStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(START$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(START$0) != 0;
      }
   }

   public void setStart(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(START$0, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(START$0);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(START$0);
         return var2;
      }
   }

   public void unsetStart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(START$0, 0);
      }
   }

   public CTNumFmt getNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var2 = null;
         var2 = (CTNumFmt)this.get_store().find_element_user(NUMFMT$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NUMFMT$2) != 0;
      }
   }

   public void setNumFmt(CTNumFmt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var3 = null;
         var3 = (CTNumFmt)this.get_store().find_element_user(NUMFMT$2, 0);
         if(var3 == null) {
            var3 = (CTNumFmt)this.get_store().add_element_user(NUMFMT$2);
         }

         var3.set(var1);
      }
   }

   public CTNumFmt addNewNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNumFmt var2 = null;
         var2 = (CTNumFmt)this.get_store().add_element_user(NUMFMT$2);
         return var2;
      }
   }

   public void unsetNumFmt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NUMFMT$2, 0);
      }
   }

   public CTDecimalNumber getLvlRestart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(LVLRESTART$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvlRestart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVLRESTART$4) != 0;
      }
   }

   public void setLvlRestart(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(LVLRESTART$4, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(LVLRESTART$4);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewLvlRestart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(LVLRESTART$4);
         return var2;
      }
   }

   public void unsetLvlRestart() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVLRESTART$4, 0);
      }
   }

   public CTString getPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(PSTYLE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PSTYLE$6) != 0;
      }
   }

   public void setPStyle(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(PSTYLE$6, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(PSTYLE$6);
         }

         var3.set(var1);
      }
   }

   public CTString addNewPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(PSTYLE$6);
         return var2;
      }
   }

   public void unsetPStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PSTYLE$6, 0);
      }
   }

   public CTOnOff getIsLgl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(ISLGL$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIsLgl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ISLGL$8) != 0;
      }
   }

   public void setIsLgl(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ISLGL$8, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(ISLGL$8);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewIsLgl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ISLGL$8);
         return var2;
      }
   }

   public void unsetIsLgl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ISLGL$8, 0);
      }
   }

   public CTLevelSuffix getSuff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLevelSuffix var2 = null;
         var2 = (CTLevelSuffix)this.get_store().find_element_user(SUFF$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSuff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SUFF$10) != 0;
      }
   }

   public void setSuff(CTLevelSuffix var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLevelSuffix var3 = null;
         var3 = (CTLevelSuffix)this.get_store().find_element_user(SUFF$10, 0);
         if(var3 == null) {
            var3 = (CTLevelSuffix)this.get_store().add_element_user(SUFF$10);
         }

         var3.set(var1);
      }
   }

   public CTLevelSuffix addNewSuff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLevelSuffix var2 = null;
         var2 = (CTLevelSuffix)this.get_store().add_element_user(SUFF$10);
         return var2;
      }
   }

   public void unsetSuff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SUFF$10, 0);
      }
   }

   public CTLevelText getLvlText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLevelText var2 = null;
         var2 = (CTLevelText)this.get_store().find_element_user(LVLTEXT$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvlText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVLTEXT$12) != 0;
      }
   }

   public void setLvlText(CTLevelText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLevelText var3 = null;
         var3 = (CTLevelText)this.get_store().find_element_user(LVLTEXT$12, 0);
         if(var3 == null) {
            var3 = (CTLevelText)this.get_store().add_element_user(LVLTEXT$12);
         }

         var3.set(var1);
      }
   }

   public CTLevelText addNewLvlText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLevelText var2 = null;
         var2 = (CTLevelText)this.get_store().add_element_user(LVLTEXT$12);
         return var2;
      }
   }

   public void unsetLvlText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVLTEXT$12, 0);
      }
   }

   public CTDecimalNumber getLvlPicBulletId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(LVLPICBULLETID$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvlPicBulletId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVLPICBULLETID$14) != 0;
      }
   }

   public void setLvlPicBulletId(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(LVLPICBULLETID$14, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(LVLPICBULLETID$14);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewLvlPicBulletId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(LVLPICBULLETID$14);
         return var2;
      }
   }

   public void unsetLvlPicBulletId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVLPICBULLETID$14, 0);
      }
   }

   public CTLvlLegacy getLegacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvlLegacy var2 = null;
         var2 = (CTLvlLegacy)this.get_store().find_element_user(LEGACY$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLegacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LEGACY$16) != 0;
      }
   }

   public void setLegacy(CTLvlLegacy var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvlLegacy var3 = null;
         var3 = (CTLvlLegacy)this.get_store().find_element_user(LEGACY$16, 0);
         if(var3 == null) {
            var3 = (CTLvlLegacy)this.get_store().add_element_user(LEGACY$16);
         }

         var3.set(var1);
      }
   }

   public CTLvlLegacy addNewLegacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLvlLegacy var2 = null;
         var2 = (CTLvlLegacy)this.get_store().add_element_user(LEGACY$16);
         return var2;
      }
   }

   public void unsetLegacy() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LEGACY$16, 0);
      }
   }

   public CTJc getLvlJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().find_element_user(LVLJC$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLvlJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LVLJC$18) != 0;
      }
   }

   public void setLvlJc(CTJc var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var3 = null;
         var3 = (CTJc)this.get_store().find_element_user(LVLJC$18, 0);
         if(var3 == null) {
            var3 = (CTJc)this.get_store().add_element_user(LVLJC$18);
         }

         var3.set(var1);
      }
   }

   public CTJc addNewLvlJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTJc var2 = null;
         var2 = (CTJc)this.get_store().add_element_user(LVLJC$18);
         return var2;
      }
   }

   public void unsetLvlJc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LVLJC$18, 0);
      }
   }

   public CTPPr getPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var2 = null;
         var2 = (CTPPr)this.get_store().find_element_user(PPR$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PPR$20) != 0;
      }
   }

   public void setPPr(CTPPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var3 = null;
         var3 = (CTPPr)this.get_store().find_element_user(PPR$20, 0);
         if(var3 == null) {
            var3 = (CTPPr)this.get_store().add_element_user(PPR$20);
         }

         var3.set(var1);
      }
   }

   public CTPPr addNewPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPPr var2 = null;
         var2 = (CTPPr)this.get_store().add_element_user(PPR$20);
         return var2;
      }
   }

   public void unsetPPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PPR$20, 0);
      }
   }

   public CTRPr getRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().find_element_user(RPR$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RPR$22) != 0;
      }
   }

   public void setRPr(CTRPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var3 = null;
         var3 = (CTRPr)this.get_store().find_element_user(RPR$22, 0);
         if(var3 == null) {
            var3 = (CTRPr)this.get_store().add_element_user(RPR$22);
         }

         var3.set(var1);
      }
   }

   public CTRPr addNewRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRPr var2 = null;
         var2 = (CTRPr)this.get_store().add_element_user(RPR$22);
         return var2;
      }
   }

   public void unsetRPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RPR$22, 0);
      }
   }

   public BigInteger getIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ILVL$24);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetIlvl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(ILVL$24);
         return var2;
      }
   }

   public void setIlvl(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ILVL$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ILVL$24);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetIlvl(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(ILVL$24);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(ILVL$24);
         }

         var3.set(var1);
      }
   }

   public byte[] getTplc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TPLC$26);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetTplc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(TPLC$26);
         return var2;
      }
   }

   public boolean isSetTplc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TPLC$26) != null;
      }
   }

   public void setTplc(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TPLC$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TPLC$26);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetTplc(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(TPLC$26);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(TPLC$26);
         }

         var3.set(var1);
      }
   }

   public void unsetTplc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TPLC$26);
      }
   }

   public STOnOff.Enum getTentative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TENTATIVE$28);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetTentative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(TENTATIVE$28);
         return var2;
      }
   }

   public boolean isSetTentative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TENTATIVE$28) != null;
      }
   }

   public void setTentative(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TENTATIVE$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TENTATIVE$28);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetTentative(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(TENTATIVE$28);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(TENTATIVE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetTentative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TENTATIVE$28);
      }
   }

}
