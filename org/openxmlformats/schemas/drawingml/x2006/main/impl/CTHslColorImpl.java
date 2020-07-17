package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHslColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STPositiveFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1AlphaList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1AlphaModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1AlphaOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1BlueList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1BlueModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1BlueOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1CompList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1GammaList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1GrayList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1GreenList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1GreenModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1GreenOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1HueList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1HueModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1HueOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1InvGammaList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1InvList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1LumList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1LumModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1LumOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1RedList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1RedModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1RedOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1SatList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1SatModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1SatOffList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1ShadeList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTHslColorImpl.1TintList;

public class CTHslColorImpl extends XmlComplexContentImpl implements CTHslColor {

   private static final QName TINT$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint");
   private static final QName SHADE$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "shade");
   private static final QName COMP$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "comp");
   private static final QName INV$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "inv");
   private static final QName GRAY$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gray");
   private static final QName ALPHA$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alpha");
   private static final QName ALPHAOFF$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaOff");
   private static final QName ALPHAMOD$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod");
   private static final QName HUE$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hue");
   private static final QName HUEOFF$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueOff");
   private static final QName HUEMOD$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueMod");
   private static final QName SAT$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sat");
   private static final QName SATOFF$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satOff");
   private static final QName SATMOD$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satMod");
   private static final QName LUM$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum");
   private static final QName LUMOFF$30 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumOff");
   private static final QName LUMMOD$32 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumMod");
   private static final QName RED$34 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "red");
   private static final QName REDOFF$36 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redOff");
   private static final QName REDMOD$38 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redMod");
   private static final QName GREEN$40 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "green");
   private static final QName GREENOFF$42 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenOff");
   private static final QName GREENMOD$44 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenMod");
   private static final QName BLUE$46 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blue");
   private static final QName BLUEOFF$48 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueOff");
   private static final QName BLUEMOD$50 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueMod");
   private static final QName GAMMA$52 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gamma");
   private static final QName INVGAMMA$54 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "invGamma");
   private static final QName HUE2$56 = new QName("", "hue");
   private static final QName SAT2$58 = new QName("", "sat");
   private static final QName LUM2$60 = new QName("", "lum");


   public CTHslColorImpl(SchemaType var1) {
      super(var1);
   }

   public List getTintList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TintList(this);
      }
   }

   public CTPositiveFixedPercentage[] getTintArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TINT$0, var2);
         CTPositiveFixedPercentage[] var3 = new CTPositiveFixedPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPositiveFixedPercentage getTintArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var3 = null;
         var3 = (CTPositiveFixedPercentage)this.get_store().find_element_user(TINT$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTintArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TINT$0);
      }
   }

   public void setTintArray(CTPositiveFixedPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TINT$0);
      }
   }

   public void setTintArray(int var1, CTPositiveFixedPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var4 = null;
         var4 = (CTPositiveFixedPercentage)this.get_store().find_element_user(TINT$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPositiveFixedPercentage insertNewTint(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var3 = null;
         var3 = (CTPositiveFixedPercentage)this.get_store().insert_element_user(TINT$0, var1);
         return var3;
      }
   }

   public CTPositiveFixedPercentage addNewTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var2 = null;
         var2 = (CTPositiveFixedPercentage)this.get_store().add_element_user(TINT$0);
         return var2;
      }
   }

   public void removeTint(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TINT$0, var1);
      }
   }

   public List getShadeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShadeList(this);
      }
   }

   public CTPositiveFixedPercentage[] getShadeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHADE$2, var2);
         CTPositiveFixedPercentage[] var3 = new CTPositiveFixedPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPositiveFixedPercentage getShadeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var3 = null;
         var3 = (CTPositiveFixedPercentage)this.get_store().find_element_user(SHADE$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShadeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHADE$2);
      }
   }

   public void setShadeArray(CTPositiveFixedPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHADE$2);
      }
   }

   public void setShadeArray(int var1, CTPositiveFixedPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var4 = null;
         var4 = (CTPositiveFixedPercentage)this.get_store().find_element_user(SHADE$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPositiveFixedPercentage insertNewShade(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var3 = null;
         var3 = (CTPositiveFixedPercentage)this.get_store().insert_element_user(SHADE$2, var1);
         return var3;
      }
   }

   public CTPositiveFixedPercentage addNewShade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var2 = null;
         var2 = (CTPositiveFixedPercentage)this.get_store().add_element_user(SHADE$2);
         return var2;
      }
   }

   public void removeShade(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHADE$2, var1);
      }
   }

   public List getCompList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CompList(this);
      }
   }

   public CTComplementTransform[] getCompArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(COMP$4, var2);
         CTComplementTransform[] var3 = new CTComplementTransform[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTComplementTransform getCompArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComplementTransform var3 = null;
         var3 = (CTComplementTransform)this.get_store().find_element_user(COMP$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCompArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMP$4);
      }
   }

   public void setCompArray(CTComplementTransform[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, COMP$4);
      }
   }

   public void setCompArray(int var1, CTComplementTransform var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComplementTransform var4 = null;
         var4 = (CTComplementTransform)this.get_store().find_element_user(COMP$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTComplementTransform insertNewComp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComplementTransform var3 = null;
         var3 = (CTComplementTransform)this.get_store().insert_element_user(COMP$4, var1);
         return var3;
      }
   }

   public CTComplementTransform addNewComp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTComplementTransform var2 = null;
         var2 = (CTComplementTransform)this.get_store().add_element_user(COMP$4);
         return var2;
      }
   }

   public void removeComp(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMP$4, var1);
      }
   }

   public List getInvList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1InvList(this);
      }
   }

   public CTInverseTransform[] getInvArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INV$6, var2);
         CTInverseTransform[] var3 = new CTInverseTransform[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTInverseTransform getInvArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseTransform var3 = null;
         var3 = (CTInverseTransform)this.get_store().find_element_user(INV$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfInvArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INV$6);
      }
   }

   public void setInvArray(CTInverseTransform[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INV$6);
      }
   }

   public void setInvArray(int var1, CTInverseTransform var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseTransform var4 = null;
         var4 = (CTInverseTransform)this.get_store().find_element_user(INV$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTInverseTransform insertNewInv(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseTransform var3 = null;
         var3 = (CTInverseTransform)this.get_store().insert_element_user(INV$6, var1);
         return var3;
      }
   }

   public CTInverseTransform addNewInv() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseTransform var2 = null;
         var2 = (CTInverseTransform)this.get_store().add_element_user(INV$6);
         return var2;
      }
   }

   public void removeInv(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INV$6, var1);
      }
   }

   public List getGrayList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GrayList(this);
      }
   }

   public CTGrayscaleTransform[] getGrayArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRAY$8, var2);
         CTGrayscaleTransform[] var3 = new CTGrayscaleTransform[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGrayscaleTransform getGrayArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleTransform var3 = null;
         var3 = (CTGrayscaleTransform)this.get_store().find_element_user(GRAY$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGrayArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRAY$8);
      }
   }

   public void setGrayArray(CTGrayscaleTransform[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRAY$8);
      }
   }

   public void setGrayArray(int var1, CTGrayscaleTransform var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleTransform var4 = null;
         var4 = (CTGrayscaleTransform)this.get_store().find_element_user(GRAY$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGrayscaleTransform insertNewGray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleTransform var3 = null;
         var3 = (CTGrayscaleTransform)this.get_store().insert_element_user(GRAY$8, var1);
         return var3;
      }
   }

   public CTGrayscaleTransform addNewGray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleTransform var2 = null;
         var2 = (CTGrayscaleTransform)this.get_store().add_element_user(GRAY$8);
         return var2;
      }
   }

   public void removeGray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRAY$8, var1);
      }
   }

   public List getAlphaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaList(this);
      }
   }

   public CTPositiveFixedPercentage[] getAlphaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHA$10, var2);
         CTPositiveFixedPercentage[] var3 = new CTPositiveFixedPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPositiveFixedPercentage getAlphaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var3 = null;
         var3 = (CTPositiveFixedPercentage)this.get_store().find_element_user(ALPHA$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHA$10);
      }
   }

   public void setAlphaArray(CTPositiveFixedPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHA$10);
      }
   }

   public void setAlphaArray(int var1, CTPositiveFixedPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var4 = null;
         var4 = (CTPositiveFixedPercentage)this.get_store().find_element_user(ALPHA$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPositiveFixedPercentage insertNewAlpha(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var3 = null;
         var3 = (CTPositiveFixedPercentage)this.get_store().insert_element_user(ALPHA$10, var1);
         return var3;
      }
   }

   public CTPositiveFixedPercentage addNewAlpha() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedPercentage var2 = null;
         var2 = (CTPositiveFixedPercentage)this.get_store().add_element_user(ALPHA$10);
         return var2;
      }
   }

   public void removeAlpha(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHA$10, var1);
      }
   }

   public List getAlphaOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaOffList(this);
      }
   }

   public CTFixedPercentage[] getAlphaOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAOFF$12, var2);
         CTFixedPercentage[] var3 = new CTFixedPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFixedPercentage getAlphaOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFixedPercentage var3 = null;
         var3 = (CTFixedPercentage)this.get_store().find_element_user(ALPHAOFF$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHAOFF$12);
      }
   }

   public void setAlphaOffArray(CTFixedPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAOFF$12);
      }
   }

   public void setAlphaOffArray(int var1, CTFixedPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFixedPercentage var4 = null;
         var4 = (CTFixedPercentage)this.get_store().find_element_user(ALPHAOFF$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFixedPercentage insertNewAlphaOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFixedPercentage var3 = null;
         var3 = (CTFixedPercentage)this.get_store().insert_element_user(ALPHAOFF$12, var1);
         return var3;
      }
   }

   public CTFixedPercentage addNewAlphaOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFixedPercentage var2 = null;
         var2 = (CTFixedPercentage)this.get_store().add_element_user(ALPHAOFF$12);
         return var2;
      }
   }

   public void removeAlphaOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAOFF$12, var1);
      }
   }

   public List getAlphaModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaModList(this);
      }
   }

   public CTPositivePercentage[] getAlphaModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAMOD$14, var2);
         CTPositivePercentage[] var3 = new CTPositivePercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPositivePercentage getAlphaModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var3 = null;
         var3 = (CTPositivePercentage)this.get_store().find_element_user(ALPHAMOD$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHAMOD$14);
      }
   }

   public void setAlphaModArray(CTPositivePercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAMOD$14);
      }
   }

   public void setAlphaModArray(int var1, CTPositivePercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var4 = null;
         var4 = (CTPositivePercentage)this.get_store().find_element_user(ALPHAMOD$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPositivePercentage insertNewAlphaMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var3 = null;
         var3 = (CTPositivePercentage)this.get_store().insert_element_user(ALPHAMOD$14, var1);
         return var3;
      }
   }

   public CTPositivePercentage addNewAlphaMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var2 = null;
         var2 = (CTPositivePercentage)this.get_store().add_element_user(ALPHAMOD$14);
         return var2;
      }
   }

   public void removeAlphaMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAMOD$14, var1);
      }
   }

   public List getHueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HueList(this);
      }
   }

   public CTPositiveFixedAngle[] getHueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HUE$16, var2);
         CTPositiveFixedAngle[] var3 = new CTPositiveFixedAngle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPositiveFixedAngle getHueArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedAngle var3 = null;
         var3 = (CTPositiveFixedAngle)this.get_store().find_element_user(HUE$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HUE$16);
      }
   }

   public void setHueArray(CTPositiveFixedAngle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HUE$16);
      }
   }

   public void setHueArray(int var1, CTPositiveFixedAngle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedAngle var4 = null;
         var4 = (CTPositiveFixedAngle)this.get_store().find_element_user(HUE$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPositiveFixedAngle insertNewHue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedAngle var3 = null;
         var3 = (CTPositiveFixedAngle)this.get_store().insert_element_user(HUE$16, var1);
         return var3;
      }
   }

   public CTPositiveFixedAngle addNewHue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveFixedAngle var2 = null;
         var2 = (CTPositiveFixedAngle)this.get_store().add_element_user(HUE$16);
         return var2;
      }
   }

   public void removeHue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HUE$16, var1);
      }
   }

   public List getHueOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HueOffList(this);
      }
   }

   public CTAngle[] getHueOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HUEOFF$18, var2);
         CTAngle[] var3 = new CTAngle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAngle getHueOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAngle var3 = null;
         var3 = (CTAngle)this.get_store().find_element_user(HUEOFF$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHueOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HUEOFF$18);
      }
   }

   public void setHueOffArray(CTAngle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HUEOFF$18);
      }
   }

   public void setHueOffArray(int var1, CTAngle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAngle var4 = null;
         var4 = (CTAngle)this.get_store().find_element_user(HUEOFF$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAngle insertNewHueOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAngle var3 = null;
         var3 = (CTAngle)this.get_store().insert_element_user(HUEOFF$18, var1);
         return var3;
      }
   }

   public CTAngle addNewHueOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAngle var2 = null;
         var2 = (CTAngle)this.get_store().add_element_user(HUEOFF$18);
         return var2;
      }
   }

   public void removeHueOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HUEOFF$18, var1);
      }
   }

   public List getHueModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HueModList(this);
      }
   }

   public CTPositivePercentage[] getHueModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HUEMOD$20, var2);
         CTPositivePercentage[] var3 = new CTPositivePercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPositivePercentage getHueModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var3 = null;
         var3 = (CTPositivePercentage)this.get_store().find_element_user(HUEMOD$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHueModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HUEMOD$20);
      }
   }

   public void setHueModArray(CTPositivePercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HUEMOD$20);
      }
   }

   public void setHueModArray(int var1, CTPositivePercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var4 = null;
         var4 = (CTPositivePercentage)this.get_store().find_element_user(HUEMOD$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPositivePercentage insertNewHueMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var3 = null;
         var3 = (CTPositivePercentage)this.get_store().insert_element_user(HUEMOD$20, var1);
         return var3;
      }
   }

   public CTPositivePercentage addNewHueMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositivePercentage var2 = null;
         var2 = (CTPositivePercentage)this.get_store().add_element_user(HUEMOD$20);
         return var2;
      }
   }

   public void removeHueMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HUEMOD$20, var1);
      }
   }

   public List getSatList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SatList(this);
      }
   }

   public CTPercentage[] getSatArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SAT$22, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getSatArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(SAT$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSatArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAT$22);
      }
   }

   public void setSatArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SAT$22);
      }
   }

   public void setSatArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(SAT$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewSat(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(SAT$22, var1);
         return var3;
      }
   }

   public CTPercentage addNewSat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(SAT$22);
         return var2;
      }
   }

   public void removeSat(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAT$22, var1);
      }
   }

   public List getSatOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SatOffList(this);
      }
   }

   public CTPercentage[] getSatOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SATOFF$24, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getSatOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(SATOFF$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSatOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SATOFF$24);
      }
   }

   public void setSatOffArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SATOFF$24);
      }
   }

   public void setSatOffArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(SATOFF$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewSatOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(SATOFF$24, var1);
         return var3;
      }
   }

   public CTPercentage addNewSatOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(SATOFF$24);
         return var2;
      }
   }

   public void removeSatOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SATOFF$24, var1);
      }
   }

   public List getSatModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SatModList(this);
      }
   }

   public CTPercentage[] getSatModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SATMOD$26, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getSatModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(SATMOD$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSatModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SATMOD$26);
      }
   }

   public void setSatModArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SATMOD$26);
      }
   }

   public void setSatModArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(SATMOD$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewSatMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(SATMOD$26, var1);
         return var3;
      }
   }

   public CTPercentage addNewSatMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(SATMOD$26);
         return var2;
      }
   }

   public void removeSatMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SATMOD$26, var1);
      }
   }

   public List getLumList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LumList(this);
      }
   }

   public CTPercentage[] getLumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LUM$28, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getLumArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(LUM$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LUM$28);
      }
   }

   public void setLumArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LUM$28);
      }
   }

   public void setLumArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(LUM$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewLum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(LUM$28, var1);
         return var3;
      }
   }

   public CTPercentage addNewLum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(LUM$28);
         return var2;
      }
   }

   public void removeLum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LUM$28, var1);
      }
   }

   public List getLumOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LumOffList(this);
      }
   }

   public CTPercentage[] getLumOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LUMOFF$30, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getLumOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(LUMOFF$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLumOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LUMOFF$30);
      }
   }

   public void setLumOffArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LUMOFF$30);
      }
   }

   public void setLumOffArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(LUMOFF$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewLumOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(LUMOFF$30, var1);
         return var3;
      }
   }

   public CTPercentage addNewLumOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(LUMOFF$30);
         return var2;
      }
   }

   public void removeLumOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LUMOFF$30, var1);
      }
   }

   public List getLumModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LumModList(this);
      }
   }

   public CTPercentage[] getLumModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LUMMOD$32, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getLumModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(LUMMOD$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLumModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LUMMOD$32);
      }
   }

   public void setLumModArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LUMMOD$32);
      }
   }

   public void setLumModArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(LUMMOD$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewLumMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(LUMMOD$32, var1);
         return var3;
      }
   }

   public CTPercentage addNewLumMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(LUMMOD$32);
         return var2;
      }
   }

   public void removeLumMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LUMMOD$32, var1);
      }
   }

   public List getRedList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RedList(this);
      }
   }

   public CTPercentage[] getRedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RED$34, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getRedArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(RED$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRedArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RED$34);
      }
   }

   public void setRedArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RED$34);
      }
   }

   public void setRedArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(RED$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewRed(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(RED$34, var1);
         return var3;
      }
   }

   public CTPercentage addNewRed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(RED$34);
         return var2;
      }
   }

   public void removeRed(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RED$34, var1);
      }
   }

   public List getRedOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RedOffList(this);
      }
   }

   public CTPercentage[] getRedOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REDOFF$36, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getRedOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(REDOFF$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRedOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REDOFF$36);
      }
   }

   public void setRedOffArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REDOFF$36);
      }
   }

   public void setRedOffArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(REDOFF$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewRedOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(REDOFF$36, var1);
         return var3;
      }
   }

   public CTPercentage addNewRedOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(REDOFF$36);
         return var2;
      }
   }

   public void removeRedOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REDOFF$36, var1);
      }
   }

   public List getRedModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RedModList(this);
      }
   }

   public CTPercentage[] getRedModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(REDMOD$38, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getRedModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(REDMOD$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRedModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REDMOD$38);
      }
   }

   public void setRedModArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, REDMOD$38);
      }
   }

   public void setRedModArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(REDMOD$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewRedMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(REDMOD$38, var1);
         return var3;
      }
   }

   public CTPercentage addNewRedMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(REDMOD$38);
         return var2;
      }
   }

   public void removeRedMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REDMOD$38, var1);
      }
   }

   public List getGreenList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GreenList(this);
      }
   }

   public CTPercentage[] getGreenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GREEN$40, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getGreenArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(GREEN$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGreenArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GREEN$40);
      }
   }

   public void setGreenArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GREEN$40);
      }
   }

   public void setGreenArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(GREEN$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewGreen(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(GREEN$40, var1);
         return var3;
      }
   }

   public CTPercentage addNewGreen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(GREEN$40);
         return var2;
      }
   }

   public void removeGreen(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GREEN$40, var1);
      }
   }

   public List getGreenOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GreenOffList(this);
      }
   }

   public CTPercentage[] getGreenOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GREENOFF$42, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getGreenOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(GREENOFF$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGreenOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GREENOFF$42);
      }
   }

   public void setGreenOffArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GREENOFF$42);
      }
   }

   public void setGreenOffArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(GREENOFF$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewGreenOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(GREENOFF$42, var1);
         return var3;
      }
   }

   public CTPercentage addNewGreenOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(GREENOFF$42);
         return var2;
      }
   }

   public void removeGreenOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GREENOFF$42, var1);
      }
   }

   public List getGreenModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GreenModList(this);
      }
   }

   public CTPercentage[] getGreenModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GREENMOD$44, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getGreenModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(GREENMOD$44, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGreenModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GREENMOD$44);
      }
   }

   public void setGreenModArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GREENMOD$44);
      }
   }

   public void setGreenModArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(GREENMOD$44, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewGreenMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(GREENMOD$44, var1);
         return var3;
      }
   }

   public CTPercentage addNewGreenMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(GREENMOD$44);
         return var2;
      }
   }

   public void removeGreenMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GREENMOD$44, var1);
      }
   }

   public List getBlueList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BlueList(this);
      }
   }

   public CTPercentage[] getBlueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BLUE$46, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getBlueArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(BLUE$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBlueArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLUE$46);
      }
   }

   public void setBlueArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BLUE$46);
      }
   }

   public void setBlueArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(BLUE$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewBlue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(BLUE$46, var1);
         return var3;
      }
   }

   public CTPercentage addNewBlue() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(BLUE$46);
         return var2;
      }
   }

   public void removeBlue(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLUE$46, var1);
      }
   }

   public List getBlueOffList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BlueOffList(this);
      }
   }

   public CTPercentage[] getBlueOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BLUEOFF$48, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getBlueOffArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(BLUEOFF$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBlueOffArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLUEOFF$48);
      }
   }

   public void setBlueOffArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BLUEOFF$48);
      }
   }

   public void setBlueOffArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(BLUEOFF$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewBlueOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(BLUEOFF$48, var1);
         return var3;
      }
   }

   public CTPercentage addNewBlueOff() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(BLUEOFF$48);
         return var2;
      }
   }

   public void removeBlueOff(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLUEOFF$48, var1);
      }
   }

   public List getBlueModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BlueModList(this);
      }
   }

   public CTPercentage[] getBlueModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BLUEMOD$50, var2);
         CTPercentage[] var3 = new CTPercentage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPercentage getBlueModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().find_element_user(BLUEMOD$50, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBlueModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLUEMOD$50);
      }
   }

   public void setBlueModArray(CTPercentage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BLUEMOD$50);
      }
   }

   public void setBlueModArray(int var1, CTPercentage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var4 = null;
         var4 = (CTPercentage)this.get_store().find_element_user(BLUEMOD$50, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPercentage insertNewBlueMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var3 = null;
         var3 = (CTPercentage)this.get_store().insert_element_user(BLUEMOD$50, var1);
         return var3;
      }
   }

   public CTPercentage addNewBlueMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPercentage var2 = null;
         var2 = (CTPercentage)this.get_store().add_element_user(BLUEMOD$50);
         return var2;
      }
   }

   public void removeBlueMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLUEMOD$50, var1);
      }
   }

   public List getGammaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GammaList(this);
      }
   }

   public CTGammaTransform[] getGammaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GAMMA$52, var2);
         CTGammaTransform[] var3 = new CTGammaTransform[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGammaTransform getGammaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGammaTransform var3 = null;
         var3 = (CTGammaTransform)this.get_store().find_element_user(GAMMA$52, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGammaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GAMMA$52);
      }
   }

   public void setGammaArray(CTGammaTransform[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GAMMA$52);
      }
   }

   public void setGammaArray(int var1, CTGammaTransform var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGammaTransform var4 = null;
         var4 = (CTGammaTransform)this.get_store().find_element_user(GAMMA$52, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGammaTransform insertNewGamma(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGammaTransform var3 = null;
         var3 = (CTGammaTransform)this.get_store().insert_element_user(GAMMA$52, var1);
         return var3;
      }
   }

   public CTGammaTransform addNewGamma() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGammaTransform var2 = null;
         var2 = (CTGammaTransform)this.get_store().add_element_user(GAMMA$52);
         return var2;
      }
   }

   public void removeGamma(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GAMMA$52, var1);
      }
   }

   public List getInvGammaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1InvGammaList(this);
      }
   }

   public CTInverseGammaTransform[] getInvGammaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INVGAMMA$54, var2);
         CTInverseGammaTransform[] var3 = new CTInverseGammaTransform[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTInverseGammaTransform getInvGammaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseGammaTransform var3 = null;
         var3 = (CTInverseGammaTransform)this.get_store().find_element_user(INVGAMMA$54, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfInvGammaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INVGAMMA$54);
      }
   }

   public void setInvGammaArray(CTInverseGammaTransform[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INVGAMMA$54);
      }
   }

   public void setInvGammaArray(int var1, CTInverseGammaTransform var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseGammaTransform var4 = null;
         var4 = (CTInverseGammaTransform)this.get_store().find_element_user(INVGAMMA$54, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTInverseGammaTransform insertNewInvGamma(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseGammaTransform var3 = null;
         var3 = (CTInverseGammaTransform)this.get_store().insert_element_user(INVGAMMA$54, var1);
         return var3;
      }
   }

   public CTInverseGammaTransform addNewInvGamma() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInverseGammaTransform var2 = null;
         var2 = (CTInverseGammaTransform)this.get_store().add_element_user(INVGAMMA$54);
         return var2;
      }
   }

   public void removeInvGamma(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INVGAMMA$54, var1);
      }
   }

   public int getHue2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HUE2$56);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveFixedAngle xgetHue2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedAngle var2 = null;
         var2 = (STPositiveFixedAngle)this.get_store().find_attribute_user(HUE2$56);
         return var2;
      }
   }

   public void setHue2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HUE2$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HUE2$56);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetHue2(STPositiveFixedAngle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveFixedAngle var3 = null;
         var3 = (STPositiveFixedAngle)this.get_store().find_attribute_user(HUE2$56);
         if(var3 == null) {
            var3 = (STPositiveFixedAngle)this.get_store().add_attribute_user(HUE2$56);
         }

         var3.set(var1);
      }
   }

   public int getSat2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SAT2$58);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetSat2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(SAT2$58);
         return var2;
      }
   }

   public void setSat2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SAT2$58);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SAT2$58);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSat2(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(SAT2$58);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(SAT2$58);
         }

         var3.set(var1);
      }
   }

   public int getLum2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LUM2$60);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetLum2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(LUM2$60);
         return var2;
      }
   }

   public void setLum2(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LUM2$60);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LUM2$60);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetLum2(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(LUM2$60);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(LUM2$60);
         }

         var3.set(var1);
      }
   }

}
