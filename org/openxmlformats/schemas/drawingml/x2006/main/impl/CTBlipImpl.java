package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression$Enum;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaBiLevelList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaCeilingList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaFloorList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaInvList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaModFixList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaModList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1AlphaReplList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1BiLevelList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1BlurList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1ClrChangeList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1ClrReplList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1DuotoneList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1FillOverlayList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1GraysclList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1HslList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1LumList;
import org.openxmlformats.schemas.drawingml.x2006.main.impl.CTBlipImpl.1TintList;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;

public class CTBlipImpl extends XmlComplexContentImpl implements CTBlip {

   private static final QName ALPHABILEVEL$0 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaBiLevel");
   private static final QName ALPHACEILING$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaCeiling");
   private static final QName ALPHAFLOOR$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaFloor");
   private static final QName ALPHAINV$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaInv");
   private static final QName ALPHAMOD$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod");
   private static final QName ALPHAMODFIX$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaModFix");
   private static final QName ALPHAREPL$12 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaRepl");
   private static final QName BILEVEL$14 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "biLevel");
   private static final QName BLUR$16 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blur");
   private static final QName CLRCHANGE$18 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrChange");
   private static final QName CLRREPL$20 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "clrRepl");
   private static final QName DUOTONE$22 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "duotone");
   private static final QName FILLOVERLAY$24 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "fillOverlay");
   private static final QName GRAYSCL$26 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "grayscl");
   private static final QName HSL$28 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hsl");
   private static final QName LUM$30 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum");
   private static final QName TINT$32 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint");
   private static final QName EXTLST$34 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
   private static final QName EMBED$36 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "embed");
   private static final QName LINK$38 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "link");
   private static final QName CSTATE$40 = new QName("", "cstate");


   public CTBlipImpl(SchemaType var1) {
      super(var1);
   }

   public List getAlphaBiLevelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaBiLevelList(this);
      }
   }

   public CTAlphaBiLevelEffect[] getAlphaBiLevelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHABILEVEL$0, var2);
         CTAlphaBiLevelEffect[] var3 = new CTAlphaBiLevelEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaBiLevelEffect getAlphaBiLevelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaBiLevelEffect var3 = null;
         var3 = (CTAlphaBiLevelEffect)this.get_store().find_element_user(ALPHABILEVEL$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaBiLevelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHABILEVEL$0);
      }
   }

   public void setAlphaBiLevelArray(CTAlphaBiLevelEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHABILEVEL$0);
      }
   }

   public void setAlphaBiLevelArray(int var1, CTAlphaBiLevelEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaBiLevelEffect var4 = null;
         var4 = (CTAlphaBiLevelEffect)this.get_store().find_element_user(ALPHABILEVEL$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaBiLevelEffect insertNewAlphaBiLevel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaBiLevelEffect var3 = null;
         var3 = (CTAlphaBiLevelEffect)this.get_store().insert_element_user(ALPHABILEVEL$0, var1);
         return var3;
      }
   }

   public CTAlphaBiLevelEffect addNewAlphaBiLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaBiLevelEffect var2 = null;
         var2 = (CTAlphaBiLevelEffect)this.get_store().add_element_user(ALPHABILEVEL$0);
         return var2;
      }
   }

   public void removeAlphaBiLevel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHABILEVEL$0, var1);
      }
   }

   public List getAlphaCeilingList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaCeilingList(this);
      }
   }

   public CTAlphaCeilingEffect[] getAlphaCeilingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHACEILING$2, var2);
         CTAlphaCeilingEffect[] var3 = new CTAlphaCeilingEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaCeilingEffect getAlphaCeilingArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaCeilingEffect var3 = null;
         var3 = (CTAlphaCeilingEffect)this.get_store().find_element_user(ALPHACEILING$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaCeilingArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHACEILING$2);
      }
   }

   public void setAlphaCeilingArray(CTAlphaCeilingEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHACEILING$2);
      }
   }

   public void setAlphaCeilingArray(int var1, CTAlphaCeilingEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaCeilingEffect var4 = null;
         var4 = (CTAlphaCeilingEffect)this.get_store().find_element_user(ALPHACEILING$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaCeilingEffect insertNewAlphaCeiling(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaCeilingEffect var3 = null;
         var3 = (CTAlphaCeilingEffect)this.get_store().insert_element_user(ALPHACEILING$2, var1);
         return var3;
      }
   }

   public CTAlphaCeilingEffect addNewAlphaCeiling() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaCeilingEffect var2 = null;
         var2 = (CTAlphaCeilingEffect)this.get_store().add_element_user(ALPHACEILING$2);
         return var2;
      }
   }

   public void removeAlphaCeiling(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHACEILING$2, var1);
      }
   }

   public List getAlphaFloorList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaFloorList(this);
      }
   }

   public CTAlphaFloorEffect[] getAlphaFloorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAFLOOR$4, var2);
         CTAlphaFloorEffect[] var3 = new CTAlphaFloorEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaFloorEffect getAlphaFloorArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaFloorEffect var3 = null;
         var3 = (CTAlphaFloorEffect)this.get_store().find_element_user(ALPHAFLOOR$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaFloorArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHAFLOOR$4);
      }
   }

   public void setAlphaFloorArray(CTAlphaFloorEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAFLOOR$4);
      }
   }

   public void setAlphaFloorArray(int var1, CTAlphaFloorEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaFloorEffect var4 = null;
         var4 = (CTAlphaFloorEffect)this.get_store().find_element_user(ALPHAFLOOR$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaFloorEffect insertNewAlphaFloor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaFloorEffect var3 = null;
         var3 = (CTAlphaFloorEffect)this.get_store().insert_element_user(ALPHAFLOOR$4, var1);
         return var3;
      }
   }

   public CTAlphaFloorEffect addNewAlphaFloor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaFloorEffect var2 = null;
         var2 = (CTAlphaFloorEffect)this.get_store().add_element_user(ALPHAFLOOR$4);
         return var2;
      }
   }

   public void removeAlphaFloor(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAFLOOR$4, var1);
      }
   }

   public List getAlphaInvList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaInvList(this);
      }
   }

   public CTAlphaInverseEffect[] getAlphaInvArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAINV$6, var2);
         CTAlphaInverseEffect[] var3 = new CTAlphaInverseEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaInverseEffect getAlphaInvArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaInverseEffect var3 = null;
         var3 = (CTAlphaInverseEffect)this.get_store().find_element_user(ALPHAINV$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaInvArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHAINV$6);
      }
   }

   public void setAlphaInvArray(CTAlphaInverseEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAINV$6);
      }
   }

   public void setAlphaInvArray(int var1, CTAlphaInverseEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaInverseEffect var4 = null;
         var4 = (CTAlphaInverseEffect)this.get_store().find_element_user(ALPHAINV$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaInverseEffect insertNewAlphaInv(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaInverseEffect var3 = null;
         var3 = (CTAlphaInverseEffect)this.get_store().insert_element_user(ALPHAINV$6, var1);
         return var3;
      }
   }

   public CTAlphaInverseEffect addNewAlphaInv() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaInverseEffect var2 = null;
         var2 = (CTAlphaInverseEffect)this.get_store().add_element_user(ALPHAINV$6);
         return var2;
      }
   }

   public void removeAlphaInv(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAINV$6, var1);
      }
   }

   public List getAlphaModList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaModList(this);
      }
   }

   public CTAlphaModulateEffect[] getAlphaModArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAMOD$8, var2);
         CTAlphaModulateEffect[] var3 = new CTAlphaModulateEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaModulateEffect getAlphaModArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateEffect var3 = null;
         var3 = (CTAlphaModulateEffect)this.get_store().find_element_user(ALPHAMOD$8, var1);
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
         return this.get_store().count_elements(ALPHAMOD$8);
      }
   }

   public void setAlphaModArray(CTAlphaModulateEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAMOD$8);
      }
   }

   public void setAlphaModArray(int var1, CTAlphaModulateEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateEffect var4 = null;
         var4 = (CTAlphaModulateEffect)this.get_store().find_element_user(ALPHAMOD$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaModulateEffect insertNewAlphaMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateEffect var3 = null;
         var3 = (CTAlphaModulateEffect)this.get_store().insert_element_user(ALPHAMOD$8, var1);
         return var3;
      }
   }

   public CTAlphaModulateEffect addNewAlphaMod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateEffect var2 = null;
         var2 = (CTAlphaModulateEffect)this.get_store().add_element_user(ALPHAMOD$8);
         return var2;
      }
   }

   public void removeAlphaMod(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAMOD$8, var1);
      }
   }

   public List getAlphaModFixList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaModFixList(this);
      }
   }

   public CTAlphaModulateFixedEffect[] getAlphaModFixArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAMODFIX$10, var2);
         CTAlphaModulateFixedEffect[] var3 = new CTAlphaModulateFixedEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaModulateFixedEffect getAlphaModFixArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateFixedEffect var3 = null;
         var3 = (CTAlphaModulateFixedEffect)this.get_store().find_element_user(ALPHAMODFIX$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaModFixArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHAMODFIX$10);
      }
   }

   public void setAlphaModFixArray(CTAlphaModulateFixedEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAMODFIX$10);
      }
   }

   public void setAlphaModFixArray(int var1, CTAlphaModulateFixedEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateFixedEffect var4 = null;
         var4 = (CTAlphaModulateFixedEffect)this.get_store().find_element_user(ALPHAMODFIX$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaModulateFixedEffect insertNewAlphaModFix(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateFixedEffect var3 = null;
         var3 = (CTAlphaModulateFixedEffect)this.get_store().insert_element_user(ALPHAMODFIX$10, var1);
         return var3;
      }
   }

   public CTAlphaModulateFixedEffect addNewAlphaModFix() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaModulateFixedEffect var2 = null;
         var2 = (CTAlphaModulateFixedEffect)this.get_store().add_element_user(ALPHAMODFIX$10);
         return var2;
      }
   }

   public void removeAlphaModFix(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAMODFIX$10, var1);
      }
   }

   public List getAlphaReplList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AlphaReplList(this);
      }
   }

   public CTAlphaReplaceEffect[] getAlphaReplArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ALPHAREPL$12, var2);
         CTAlphaReplaceEffect[] var3 = new CTAlphaReplaceEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAlphaReplaceEffect getAlphaReplArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaReplaceEffect var3 = null;
         var3 = (CTAlphaReplaceEffect)this.get_store().find_element_user(ALPHAREPL$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAlphaReplArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALPHAREPL$12);
      }
   }

   public void setAlphaReplArray(CTAlphaReplaceEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ALPHAREPL$12);
      }
   }

   public void setAlphaReplArray(int var1, CTAlphaReplaceEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaReplaceEffect var4 = null;
         var4 = (CTAlphaReplaceEffect)this.get_store().find_element_user(ALPHAREPL$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAlphaReplaceEffect insertNewAlphaRepl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaReplaceEffect var3 = null;
         var3 = (CTAlphaReplaceEffect)this.get_store().insert_element_user(ALPHAREPL$12, var1);
         return var3;
      }
   }

   public CTAlphaReplaceEffect addNewAlphaRepl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAlphaReplaceEffect var2 = null;
         var2 = (CTAlphaReplaceEffect)this.get_store().add_element_user(ALPHAREPL$12);
         return var2;
      }
   }

   public void removeAlphaRepl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALPHAREPL$12, var1);
      }
   }

   public List getBiLevelList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BiLevelList(this);
      }
   }

   public CTBiLevelEffect[] getBiLevelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BILEVEL$14, var2);
         CTBiLevelEffect[] var3 = new CTBiLevelEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBiLevelEffect getBiLevelArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBiLevelEffect var3 = null;
         var3 = (CTBiLevelEffect)this.get_store().find_element_user(BILEVEL$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBiLevelArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BILEVEL$14);
      }
   }

   public void setBiLevelArray(CTBiLevelEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BILEVEL$14);
      }
   }

   public void setBiLevelArray(int var1, CTBiLevelEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBiLevelEffect var4 = null;
         var4 = (CTBiLevelEffect)this.get_store().find_element_user(BILEVEL$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBiLevelEffect insertNewBiLevel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBiLevelEffect var3 = null;
         var3 = (CTBiLevelEffect)this.get_store().insert_element_user(BILEVEL$14, var1);
         return var3;
      }
   }

   public CTBiLevelEffect addNewBiLevel() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBiLevelEffect var2 = null;
         var2 = (CTBiLevelEffect)this.get_store().add_element_user(BILEVEL$14);
         return var2;
      }
   }

   public void removeBiLevel(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BILEVEL$14, var1);
      }
   }

   public List getBlurList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BlurList(this);
      }
   }

   public CTBlurEffect[] getBlurArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BLUR$16, var2);
         CTBlurEffect[] var3 = new CTBlurEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBlurEffect getBlurArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var3 = null;
         var3 = (CTBlurEffect)this.get_store().find_element_user(BLUR$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBlurArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BLUR$16);
      }
   }

   public void setBlurArray(CTBlurEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BLUR$16);
      }
   }

   public void setBlurArray(int var1, CTBlurEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var4 = null;
         var4 = (CTBlurEffect)this.get_store().find_element_user(BLUR$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBlurEffect insertNewBlur(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var3 = null;
         var3 = (CTBlurEffect)this.get_store().insert_element_user(BLUR$16, var1);
         return var3;
      }
   }

   public CTBlurEffect addNewBlur() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBlurEffect var2 = null;
         var2 = (CTBlurEffect)this.get_store().add_element_user(BLUR$16);
         return var2;
      }
   }

   public void removeBlur(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BLUR$16, var1);
      }
   }

   public List getClrChangeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ClrChangeList(this);
      }
   }

   public CTColorChangeEffect[] getClrChangeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLRCHANGE$18, var2);
         CTColorChangeEffect[] var3 = new CTColorChangeEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTColorChangeEffect getClrChangeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorChangeEffect var3 = null;
         var3 = (CTColorChangeEffect)this.get_store().find_element_user(CLRCHANGE$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfClrChangeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLRCHANGE$18);
      }
   }

   public void setClrChangeArray(CTColorChangeEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLRCHANGE$18);
      }
   }

   public void setClrChangeArray(int var1, CTColorChangeEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorChangeEffect var4 = null;
         var4 = (CTColorChangeEffect)this.get_store().find_element_user(CLRCHANGE$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTColorChangeEffect insertNewClrChange(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorChangeEffect var3 = null;
         var3 = (CTColorChangeEffect)this.get_store().insert_element_user(CLRCHANGE$18, var1);
         return var3;
      }
   }

   public CTColorChangeEffect addNewClrChange() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorChangeEffect var2 = null;
         var2 = (CTColorChangeEffect)this.get_store().add_element_user(CLRCHANGE$18);
         return var2;
      }
   }

   public void removeClrChange(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLRCHANGE$18, var1);
      }
   }

   public List getClrReplList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ClrReplList(this);
      }
   }

   public CTColorReplaceEffect[] getClrReplArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLRREPL$20, var2);
         CTColorReplaceEffect[] var3 = new CTColorReplaceEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTColorReplaceEffect getClrReplArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorReplaceEffect var3 = null;
         var3 = (CTColorReplaceEffect)this.get_store().find_element_user(CLRREPL$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfClrReplArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLRREPL$20);
      }
   }

   public void setClrReplArray(CTColorReplaceEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLRREPL$20);
      }
   }

   public void setClrReplArray(int var1, CTColorReplaceEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorReplaceEffect var4 = null;
         var4 = (CTColorReplaceEffect)this.get_store().find_element_user(CLRREPL$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTColorReplaceEffect insertNewClrRepl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorReplaceEffect var3 = null;
         var3 = (CTColorReplaceEffect)this.get_store().insert_element_user(CLRREPL$20, var1);
         return var3;
      }
   }

   public CTColorReplaceEffect addNewClrRepl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorReplaceEffect var2 = null;
         var2 = (CTColorReplaceEffect)this.get_store().add_element_user(CLRREPL$20);
         return var2;
      }
   }

   public void removeClrRepl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLRREPL$20, var1);
      }
   }

   public List getDuotoneList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DuotoneList(this);
      }
   }

   public CTDuotoneEffect[] getDuotoneArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DUOTONE$22, var2);
         CTDuotoneEffect[] var3 = new CTDuotoneEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDuotoneEffect getDuotoneArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDuotoneEffect var3 = null;
         var3 = (CTDuotoneEffect)this.get_store().find_element_user(DUOTONE$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDuotoneArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DUOTONE$22);
      }
   }

   public void setDuotoneArray(CTDuotoneEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DUOTONE$22);
      }
   }

   public void setDuotoneArray(int var1, CTDuotoneEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDuotoneEffect var4 = null;
         var4 = (CTDuotoneEffect)this.get_store().find_element_user(DUOTONE$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDuotoneEffect insertNewDuotone(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDuotoneEffect var3 = null;
         var3 = (CTDuotoneEffect)this.get_store().insert_element_user(DUOTONE$22, var1);
         return var3;
      }
   }

   public CTDuotoneEffect addNewDuotone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDuotoneEffect var2 = null;
         var2 = (CTDuotoneEffect)this.get_store().add_element_user(DUOTONE$22);
         return var2;
      }
   }

   public void removeDuotone(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DUOTONE$22, var1);
      }
   }

   public List getFillOverlayList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FillOverlayList(this);
      }
   }

   public CTFillOverlayEffect[] getFillOverlayArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FILLOVERLAY$24, var2);
         CTFillOverlayEffect[] var3 = new CTFillOverlayEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFillOverlayEffect getFillOverlayArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var3 = null;
         var3 = (CTFillOverlayEffect)this.get_store().find_element_user(FILLOVERLAY$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFillOverlayArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILLOVERLAY$24);
      }
   }

   public void setFillOverlayArray(CTFillOverlayEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FILLOVERLAY$24);
      }
   }

   public void setFillOverlayArray(int var1, CTFillOverlayEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var4 = null;
         var4 = (CTFillOverlayEffect)this.get_store().find_element_user(FILLOVERLAY$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFillOverlayEffect insertNewFillOverlay(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var3 = null;
         var3 = (CTFillOverlayEffect)this.get_store().insert_element_user(FILLOVERLAY$24, var1);
         return var3;
      }
   }

   public CTFillOverlayEffect addNewFillOverlay() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFillOverlayEffect var2 = null;
         var2 = (CTFillOverlayEffect)this.get_store().add_element_user(FILLOVERLAY$24);
         return var2;
      }
   }

   public void removeFillOverlay(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILLOVERLAY$24, var1);
      }
   }

   public List getGraysclList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GraysclList(this);
      }
   }

   public CTGrayscaleEffect[] getGraysclArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GRAYSCL$26, var2);
         CTGrayscaleEffect[] var3 = new CTGrayscaleEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGrayscaleEffect getGraysclArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleEffect var3 = null;
         var3 = (CTGrayscaleEffect)this.get_store().find_element_user(GRAYSCL$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGraysclArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GRAYSCL$26);
      }
   }

   public void setGraysclArray(CTGrayscaleEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GRAYSCL$26);
      }
   }

   public void setGraysclArray(int var1, CTGrayscaleEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleEffect var4 = null;
         var4 = (CTGrayscaleEffect)this.get_store().find_element_user(GRAYSCL$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGrayscaleEffect insertNewGrayscl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleEffect var3 = null;
         var3 = (CTGrayscaleEffect)this.get_store().insert_element_user(GRAYSCL$26, var1);
         return var3;
      }
   }

   public CTGrayscaleEffect addNewGrayscl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGrayscaleEffect var2 = null;
         var2 = (CTGrayscaleEffect)this.get_store().add_element_user(GRAYSCL$26);
         return var2;
      }
   }

   public void removeGrayscl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GRAYSCL$26, var1);
      }
   }

   public List getHslList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HslList(this);
      }
   }

   public CTHSLEffect[] getHslArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HSL$28, var2);
         CTHSLEffect[] var3 = new CTHSLEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHSLEffect getHslArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHSLEffect var3 = null;
         var3 = (CTHSLEffect)this.get_store().find_element_user(HSL$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHslArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HSL$28);
      }
   }

   public void setHslArray(CTHSLEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HSL$28);
      }
   }

   public void setHslArray(int var1, CTHSLEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHSLEffect var4 = null;
         var4 = (CTHSLEffect)this.get_store().find_element_user(HSL$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHSLEffect insertNewHsl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHSLEffect var3 = null;
         var3 = (CTHSLEffect)this.get_store().insert_element_user(HSL$28, var1);
         return var3;
      }
   }

   public CTHSLEffect addNewHsl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHSLEffect var2 = null;
         var2 = (CTHSLEffect)this.get_store().add_element_user(HSL$28);
         return var2;
      }
   }

   public void removeHsl(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HSL$28, var1);
      }
   }

   public List getLumList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LumList(this);
      }
   }

   public CTLuminanceEffect[] getLumArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LUM$30, var2);
         CTLuminanceEffect[] var3 = new CTLuminanceEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLuminanceEffect getLumArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLuminanceEffect var3 = null;
         var3 = (CTLuminanceEffect)this.get_store().find_element_user(LUM$30, var1);
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
         return this.get_store().count_elements(LUM$30);
      }
   }

   public void setLumArray(CTLuminanceEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LUM$30);
      }
   }

   public void setLumArray(int var1, CTLuminanceEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLuminanceEffect var4 = null;
         var4 = (CTLuminanceEffect)this.get_store().find_element_user(LUM$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLuminanceEffect insertNewLum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLuminanceEffect var3 = null;
         var3 = (CTLuminanceEffect)this.get_store().insert_element_user(LUM$30, var1);
         return var3;
      }
   }

   public CTLuminanceEffect addNewLum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLuminanceEffect var2 = null;
         var2 = (CTLuminanceEffect)this.get_store().add_element_user(LUM$30);
         return var2;
      }
   }

   public void removeLum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LUM$30, var1);
      }
   }

   public List getTintList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TintList(this);
      }
   }

   public CTTintEffect[] getTintArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TINT$32, var2);
         CTTintEffect[] var3 = new CTTintEffect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTintEffect getTintArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTintEffect var3 = null;
         var3 = (CTTintEffect)this.get_store().find_element_user(TINT$32, var1);
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
         return this.get_store().count_elements(TINT$32);
      }
   }

   public void setTintArray(CTTintEffect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TINT$32);
      }
   }

   public void setTintArray(int var1, CTTintEffect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTintEffect var4 = null;
         var4 = (CTTintEffect)this.get_store().find_element_user(TINT$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTintEffect insertNewTint(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTintEffect var3 = null;
         var3 = (CTTintEffect)this.get_store().insert_element_user(TINT$32, var1);
         return var3;
      }
   }

   public CTTintEffect addNewTint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTintEffect var2 = null;
         var2 = (CTTintEffect)this.get_store().add_element_user(TINT$32);
         return var2;
      }
   }

   public void removeTint(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TINT$32, var1);
      }
   }

   public CTOfficeArtExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$34) != 0;
      }
   }

   public void setExtLst(CTOfficeArtExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var3 = null;
         var3 = (CTOfficeArtExtensionList)this.get_store().find_element_user(EXTLST$34, 0);
         if(var3 == null) {
            var3 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$34);
         }

         var3.set(var1);
      }
   }

   public CTOfficeArtExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOfficeArtExtensionList var2 = null;
         var2 = (CTOfficeArtExtensionList)this.get_store().add_element_user(EXTLST$34);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$34, 0);
      }
   }

   public String getEmbed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EMBED$36);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EMBED$36);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetEmbed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(EMBED$36);
         if(var2 == null) {
            var2 = (STRelationshipId)this.get_default_attribute_value(EMBED$36);
         }

         return var2;
      }
   }

   public boolean isSetEmbed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EMBED$36) != null;
      }
   }

   public void setEmbed(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EMBED$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EMBED$36);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEmbed(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(EMBED$36);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(EMBED$36);
         }

         var3.set(var1);
      }
   }

   public void unsetEmbed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EMBED$36);
      }
   }

   public String getLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(LINK$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(LINK$38);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public STRelationshipId xgetLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var2 = null;
         var2 = (STRelationshipId)this.get_store().find_attribute_user(LINK$38);
         if(var2 == null) {
            var2 = (STRelationshipId)this.get_default_attribute_value(LINK$38);
         }

         return var2;
      }
   }

   public boolean isSetLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(LINK$38) != null;
      }
   }

   public void setLink(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(LINK$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(LINK$38);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetLink(STRelationshipId var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STRelationshipId var3 = null;
         var3 = (STRelationshipId)this.get_store().find_attribute_user(LINK$38);
         if(var3 == null) {
            var3 = (STRelationshipId)this.get_store().add_attribute_user(LINK$38);
         }

         var3.set(var1);
      }
   }

   public void unsetLink() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(LINK$38);
      }
   }

   public STBlipCompression$Enum getCstate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CSTATE$40);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CSTATE$40);
         }

         return var2 == null?null:(STBlipCompression$Enum)var2.getEnumValue();
      }
   }

   public STBlipCompression xgetCstate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlipCompression var2 = null;
         var2 = (STBlipCompression)this.get_store().find_attribute_user(CSTATE$40);
         if(var2 == null) {
            var2 = (STBlipCompression)this.get_default_attribute_value(CSTATE$40);
         }

         return var2;
      }
   }

   public boolean isSetCstate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CSTATE$40) != null;
      }
   }

   public void setCstate(STBlipCompression$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CSTATE$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CSTATE$40);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCstate(STBlipCompression var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBlipCompression var3 = null;
         var3 = (STBlipCompression)this.get_store().find_attribute_user(CSTATE$40);
         if(var3 == null) {
            var3 = (STBlipCompression)this.get_store().add_attribute_user(CSTATE$40);
         }

         var3.set(var1);
      }
   }

   public void unsetCstate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CSTATE$40);
      }
   }

}
