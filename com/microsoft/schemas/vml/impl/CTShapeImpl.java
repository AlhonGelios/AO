package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.office.excel.CTClientData;
import com.microsoft.schemas.office.office.CTCallout;
import com.microsoft.schemas.office.office.CTClipPath;
import com.microsoft.schemas.office.office.CTExtrusion;
import com.microsoft.schemas.office.office.CTInk;
import com.microsoft.schemas.office.office.CTLock;
import com.microsoft.schemas.office.office.CTSignatureLine;
import com.microsoft.schemas.office.office.CTSkew;
import com.microsoft.schemas.office.office.STBWMode;
import com.microsoft.schemas.office.office.STBWMode$Enum;
import com.microsoft.schemas.office.office.STConnectorType;
import com.microsoft.schemas.office.office.STConnectorType$Enum;
import com.microsoft.schemas.office.office.STHrAlign;
import com.microsoft.schemas.office.office.STHrAlign$Enum;
import com.microsoft.schemas.office.office.STInsetMode;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.office.office.STTrueFalseBlank;
import com.microsoft.schemas.office.office.STTrueFalseBlank$Enum;
import com.microsoft.schemas.office.powerpoint.CTEmpty;
import com.microsoft.schemas.office.powerpoint.CTRel;
import com.microsoft.schemas.office.word.CTAnchorLock;
import com.microsoft.schemas.office.word.CTBorder;
import com.microsoft.schemas.office.word.CTWrap;
import com.microsoft.schemas.vml.CTFill;
import com.microsoft.schemas.vml.CTFormulas;
import com.microsoft.schemas.vml.CTHandles;
import com.microsoft.schemas.vml.CTImageData;
import com.microsoft.schemas.vml.CTPath;
import com.microsoft.schemas.vml.CTShadow;
import com.microsoft.schemas.vml.CTShape;
import com.microsoft.schemas.vml.CTStroke;
import com.microsoft.schemas.vml.CTTextPath;
import com.microsoft.schemas.vml.CTTextbox;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STTrueFalse;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1AnchorlockList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1BorderbottomList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1BorderleftList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1BorderrightList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1BordertopList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1CalloutList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1ClippathList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1ExtrusionList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1FillList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1FormulasList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1HandlesList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1ImagedataList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1InkList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1IscommentList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1LockList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1PathList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1ShadowList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1SignaturelineList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1SkewList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1StrokeList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1TextboxList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1TextdataList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1TextpathList;
import com.microsoft.schemas.vml.impl.CTShapeImpl.1WrapList;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTShapeImpl extends XmlComplexContentImpl implements CTShape {

   private static final QName PATH$0 = new QName("urn:schemas-microsoft-com:vml", "path");
   private static final QName FORMULAS$2 = new QName("urn:schemas-microsoft-com:vml", "formulas");
   private static final QName HANDLES$4 = new QName("urn:schemas-microsoft-com:vml", "handles");
   private static final QName FILL$6 = new QName("urn:schemas-microsoft-com:vml", "fill");
   private static final QName STROKE$8 = new QName("urn:schemas-microsoft-com:vml", "stroke");
   private static final QName SHADOW$10 = new QName("urn:schemas-microsoft-com:vml", "shadow");
   private static final QName TEXTBOX$12 = new QName("urn:schemas-microsoft-com:vml", "textbox");
   private static final QName TEXTPATH$14 = new QName("urn:schemas-microsoft-com:vml", "textpath");
   private static final QName IMAGEDATA$16 = new QName("urn:schemas-microsoft-com:vml", "imagedata");
   private static final QName SKEW$18 = new QName("urn:schemas-microsoft-com:office:office", "skew");
   private static final QName EXTRUSION$20 = new QName("urn:schemas-microsoft-com:office:office", "extrusion");
   private static final QName CALLOUT$22 = new QName("urn:schemas-microsoft-com:office:office", "callout");
   private static final QName LOCK$24 = new QName("urn:schemas-microsoft-com:office:office", "lock");
   private static final QName CLIPPATH$26 = new QName("urn:schemas-microsoft-com:office:office", "clippath");
   private static final QName SIGNATURELINE$28 = new QName("urn:schemas-microsoft-com:office:office", "signatureline");
   private static final QName WRAP$30 = new QName("urn:schemas-microsoft-com:office:word", "wrap");
   private static final QName ANCHORLOCK$32 = new QName("urn:schemas-microsoft-com:office:word", "anchorlock");
   private static final QName BORDERTOP$34 = new QName("urn:schemas-microsoft-com:office:word", "bordertop");
   private static final QName BORDERBOTTOM$36 = new QName("urn:schemas-microsoft-com:office:word", "borderbottom");
   private static final QName BORDERLEFT$38 = new QName("urn:schemas-microsoft-com:office:word", "borderleft");
   private static final QName BORDERRIGHT$40 = new QName("urn:schemas-microsoft-com:office:word", "borderright");
   private static final QName CLIENTDATA$42 = new QName("urn:schemas-microsoft-com:office:excel", "ClientData");
   private static final QName TEXTDATA$44 = new QName("urn:schemas-microsoft-com:office:powerpoint", "textdata");
   private static final QName INK$46 = new QName("urn:schemas-microsoft-com:office:office", "ink");
   private static final QName ISCOMMENT$48 = new QName("urn:schemas-microsoft-com:office:powerpoint", "iscomment");
   private static final QName ID$50 = new QName("", "id");
   private static final QName STYLE$52 = new QName("", "style");
   private static final QName HREF$54 = new QName("", "href");
   private static final QName TARGET$56 = new QName("", "target");
   private static final QName CLASS1$58 = new QName("", "class");
   private static final QName TITLE$60 = new QName("", "title");
   private static final QName ALT$62 = new QName("", "alt");
   private static final QName COORDSIZE$64 = new QName("", "coordsize");
   private static final QName COORDORIGIN$66 = new QName("", "coordorigin");
   private static final QName WRAPCOORDS$68 = new QName("", "wrapcoords");
   private static final QName PRINT$70 = new QName("", "print");
   private static final QName SPID$72 = new QName("urn:schemas-microsoft-com:office:office", "spid");
   private static final QName ONED$74 = new QName("urn:schemas-microsoft-com:office:office", "oned");
   private static final QName REGROUPID$76 = new QName("urn:schemas-microsoft-com:office:office", "regroupid");
   private static final QName DOUBLECLICKNOTIFY$78 = new QName("urn:schemas-microsoft-com:office:office", "doubleclicknotify");
   private static final QName BUTTON$80 = new QName("urn:schemas-microsoft-com:office:office", "button");
   private static final QName USERHIDDEN$82 = new QName("urn:schemas-microsoft-com:office:office", "userhidden");
   private static final QName BULLET$84 = new QName("urn:schemas-microsoft-com:office:office", "bullet");
   private static final QName HR$86 = new QName("urn:schemas-microsoft-com:office:office", "hr");
   private static final QName HRSTD$88 = new QName("urn:schemas-microsoft-com:office:office", "hrstd");
   private static final QName HRNOSHADE$90 = new QName("urn:schemas-microsoft-com:office:office", "hrnoshade");
   private static final QName HRPCT$92 = new QName("urn:schemas-microsoft-com:office:office", "hrpct");
   private static final QName HRALIGN$94 = new QName("urn:schemas-microsoft-com:office:office", "hralign");
   private static final QName ALLOWINCELL$96 = new QName("urn:schemas-microsoft-com:office:office", "allowincell");
   private static final QName ALLOWOVERLAP$98 = new QName("urn:schemas-microsoft-com:office:office", "allowoverlap");
   private static final QName USERDRAWN$100 = new QName("urn:schemas-microsoft-com:office:office", "userdrawn");
   private static final QName BORDERTOPCOLOR$102 = new QName("urn:schemas-microsoft-com:office:office", "bordertopcolor");
   private static final QName BORDERLEFTCOLOR$104 = new QName("urn:schemas-microsoft-com:office:office", "borderleftcolor");
   private static final QName BORDERBOTTOMCOLOR$106 = new QName("urn:schemas-microsoft-com:office:office", "borderbottomcolor");
   private static final QName BORDERRIGHTCOLOR$108 = new QName("urn:schemas-microsoft-com:office:office", "borderrightcolor");
   private static final QName DGMLAYOUT$110 = new QName("urn:schemas-microsoft-com:office:office", "dgmlayout");
   private static final QName DGMNODEKIND$112 = new QName("urn:schemas-microsoft-com:office:office", "dgmnodekind");
   private static final QName DGMLAYOUTMRU$114 = new QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru");
   private static final QName INSETMODE$116 = new QName("urn:schemas-microsoft-com:office:office", "insetmode");
   private static final QName CHROMAKEY$118 = new QName("", "chromakey");
   private static final QName FILLED$120 = new QName("", "filled");
   private static final QName FILLCOLOR$122 = new QName("", "fillcolor");
   private static final QName OPACITY$124 = new QName("", "opacity");
   private static final QName STROKED$126 = new QName("", "stroked");
   private static final QName STROKECOLOR$128 = new QName("", "strokecolor");
   private static final QName STROKEWEIGHT$130 = new QName("", "strokeweight");
   private static final QName INSETPEN$132 = new QName("", "insetpen");
   private static final QName SPT$134 = new QName("urn:schemas-microsoft-com:office:office", "spt");
   private static final QName CONNECTORTYPE$136 = new QName("urn:schemas-microsoft-com:office:office", "connectortype");
   private static final QName BWMODE$138 = new QName("urn:schemas-microsoft-com:office:office", "bwmode");
   private static final QName BWPURE$140 = new QName("urn:schemas-microsoft-com:office:office", "bwpure");
   private static final QName BWNORMAL$142 = new QName("urn:schemas-microsoft-com:office:office", "bwnormal");
   private static final QName FORCEDASH$144 = new QName("urn:schemas-microsoft-com:office:office", "forcedash");
   private static final QName OLEICON$146 = new QName("urn:schemas-microsoft-com:office:office", "oleicon");
   private static final QName OLE$148 = new QName("urn:schemas-microsoft-com:office:office", "ole");
   private static final QName PREFERRELATIVE$150 = new QName("urn:schemas-microsoft-com:office:office", "preferrelative");
   private static final QName CLIPTOWRAP$152 = new QName("urn:schemas-microsoft-com:office:office", "cliptowrap");
   private static final QName CLIP$154 = new QName("urn:schemas-microsoft-com:office:office", "clip");
   private static final QName TYPE$156 = new QName("", "type");
   private static final QName ADJ$158 = new QName("", "adj");
   private static final QName PATH2$160 = new QName("", "path");
   private static final QName GFXDATA$162 = new QName("urn:schemas-microsoft-com:office:office", "gfxdata");
   private static final QName EQUATIONXML$164 = new QName("", "equationxml");


   public CTShapeImpl(SchemaType var1) {
      super(var1);
   }

   public List getPathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PathList(this);
      }
   }

   public CTPath[] getPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PATH$0, var2);
         CTPath[] var3 = new CTPath[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPath getPathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath var3 = null;
         var3 = (CTPath)this.get_store().find_element_user(PATH$0, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PATH$0);
      }
   }

   public void setPathArray(CTPath[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PATH$0);
      }
   }

   public void setPathArray(int var1, CTPath var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath var4 = null;
         var4 = (CTPath)this.get_store().find_element_user(PATH$0, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPath insertNewPath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath var3 = null;
         var3 = (CTPath)this.get_store().insert_element_user(PATH$0, var1);
         return var3;
      }
   }

   public CTPath addNewPath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPath var2 = null;
         var2 = (CTPath)this.get_store().add_element_user(PATH$0);
         return var2;
      }
   }

   public void removePath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PATH$0, var1);
      }
   }

   public List getFormulasList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FormulasList(this);
      }
   }

   public CTFormulas[] getFormulasArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FORMULAS$2, var2);
         CTFormulas[] var3 = new CTFormulas[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFormulas getFormulasArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormulas var3 = null;
         var3 = (CTFormulas)this.get_store().find_element_user(FORMULAS$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFormulasArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMULAS$2);
      }
   }

   public void setFormulasArray(CTFormulas[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FORMULAS$2);
      }
   }

   public void setFormulasArray(int var1, CTFormulas var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormulas var4 = null;
         var4 = (CTFormulas)this.get_store().find_element_user(FORMULAS$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFormulas insertNewFormulas(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormulas var3 = null;
         var3 = (CTFormulas)this.get_store().insert_element_user(FORMULAS$2, var1);
         return var3;
      }
   }

   public CTFormulas addNewFormulas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFormulas var2 = null;
         var2 = (CTFormulas)this.get_store().add_element_user(FORMULAS$2);
         return var2;
      }
   }

   public void removeFormulas(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMULAS$2, var1);
      }
   }

   public List getHandlesList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1HandlesList(this);
      }
   }

   public CTHandles[] getHandlesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(HANDLES$4, var2);
         CTHandles[] var3 = new CTHandles[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTHandles getHandlesArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandles var3 = null;
         var3 = (CTHandles)this.get_store().find_element_user(HANDLES$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfHandlesArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HANDLES$4);
      }
   }

   public void setHandlesArray(CTHandles[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, HANDLES$4);
      }
   }

   public void setHandlesArray(int var1, CTHandles var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandles var4 = null;
         var4 = (CTHandles)this.get_store().find_element_user(HANDLES$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTHandles insertNewHandles(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandles var3 = null;
         var3 = (CTHandles)this.get_store().insert_element_user(HANDLES$4, var1);
         return var3;
      }
   }

   public CTHandles addNewHandles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandles var2 = null;
         var2 = (CTHandles)this.get_store().add_element_user(HANDLES$4);
         return var2;
      }
   }

   public void removeHandles(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HANDLES$4, var1);
      }
   }

   public List getFillList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1FillList(this);
      }
   }

   public CTFill[] getFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(FILL$6, var2);
         CTFill[] var3 = new CTFill[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTFill getFillArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var3 = null;
         var3 = (CTFill)this.get_store().find_element_user(FILL$6, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfFillArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FILL$6);
      }
   }

   public void setFillArray(CTFill[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, FILL$6);
      }
   }

   public void setFillArray(int var1, CTFill var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var4 = null;
         var4 = (CTFill)this.get_store().find_element_user(FILL$6, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTFill insertNewFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var3 = null;
         var3 = (CTFill)this.get_store().insert_element_user(FILL$6, var1);
         return var3;
      }
   }

   public CTFill addNewFill() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFill var2 = null;
         var2 = (CTFill)this.get_store().add_element_user(FILL$6);
         return var2;
      }
   }

   public void removeFill(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FILL$6, var1);
      }
   }

   public List getStrokeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1StrokeList(this);
      }
   }

   public CTStroke[] getStrokeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(STROKE$8, var2);
         CTStroke[] var3 = new CTStroke[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTStroke getStrokeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStroke var3 = null;
         var3 = (CTStroke)this.get_store().find_element_user(STROKE$8, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfStrokeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STROKE$8);
      }
   }

   public void setStrokeArray(CTStroke[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, STROKE$8);
      }
   }

   public void setStrokeArray(int var1, CTStroke var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStroke var4 = null;
         var4 = (CTStroke)this.get_store().find_element_user(STROKE$8, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTStroke insertNewStroke(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStroke var3 = null;
         var3 = (CTStroke)this.get_store().insert_element_user(STROKE$8, var1);
         return var3;
      }
   }

   public CTStroke addNewStroke() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTStroke var2 = null;
         var2 = (CTStroke)this.get_store().add_element_user(STROKE$8);
         return var2;
      }
   }

   public void removeStroke(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STROKE$8, var1);
      }
   }

   public List getShadowList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShadowList(this);
      }
   }

   public CTShadow[] getShadowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHADOW$10, var2);
         CTShadow[] var3 = new CTShadow[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTShadow getShadowArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShadow var3 = null;
         var3 = (CTShadow)this.get_store().find_element_user(SHADOW$10, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShadowArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHADOW$10);
      }
   }

   public void setShadowArray(CTShadow[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHADOW$10);
      }
   }

   public void setShadowArray(int var1, CTShadow var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShadow var4 = null;
         var4 = (CTShadow)this.get_store().find_element_user(SHADOW$10, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTShadow insertNewShadow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShadow var3 = null;
         var3 = (CTShadow)this.get_store().insert_element_user(SHADOW$10, var1);
         return var3;
      }
   }

   public CTShadow addNewShadow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShadow var2 = null;
         var2 = (CTShadow)this.get_store().add_element_user(SHADOW$10);
         return var2;
      }
   }

   public void removeShadow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHADOW$10, var1);
      }
   }

   public List getTextboxList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextboxList(this);
      }
   }

   public CTTextbox[] getTextboxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTBOX$12, var2);
         CTTextbox[] var3 = new CTTextbox[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTextbox getTextboxArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextbox var3 = null;
         var3 = (CTTextbox)this.get_store().find_element_user(TEXTBOX$12, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextboxArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTBOX$12);
      }
   }

   public void setTextboxArray(CTTextbox[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTBOX$12);
      }
   }

   public void setTextboxArray(int var1, CTTextbox var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextbox var4 = null;
         var4 = (CTTextbox)this.get_store().find_element_user(TEXTBOX$12, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTextbox insertNewTextbox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextbox var3 = null;
         var3 = (CTTextbox)this.get_store().insert_element_user(TEXTBOX$12, var1);
         return var3;
      }
   }

   public CTTextbox addNewTextbox() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextbox var2 = null;
         var2 = (CTTextbox)this.get_store().add_element_user(TEXTBOX$12);
         return var2;
      }
   }

   public void removeTextbox(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTBOX$12, var1);
      }
   }

   public List getTextpathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextpathList(this);
      }
   }

   public CTTextPath[] getTextpathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTPATH$14, var2);
         CTTextPath[] var3 = new CTTextPath[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTTextPath getTextpathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextPath var3 = null;
         var3 = (CTTextPath)this.get_store().find_element_user(TEXTPATH$14, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextpathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTPATH$14);
      }
   }

   public void setTextpathArray(CTTextPath[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTPATH$14);
      }
   }

   public void setTextpathArray(int var1, CTTextPath var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextPath var4 = null;
         var4 = (CTTextPath)this.get_store().find_element_user(TEXTPATH$14, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTTextPath insertNewTextpath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextPath var3 = null;
         var3 = (CTTextPath)this.get_store().insert_element_user(TEXTPATH$14, var1);
         return var3;
      }
   }

   public CTTextPath addNewTextpath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextPath var2 = null;
         var2 = (CTTextPath)this.get_store().add_element_user(TEXTPATH$14);
         return var2;
      }
   }

   public void removeTextpath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTPATH$14, var1);
      }
   }

   public List getImagedataList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ImagedataList(this);
      }
   }

   public CTImageData[] getImagedataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(IMAGEDATA$16, var2);
         CTImageData[] var3 = new CTImageData[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTImageData getImagedataArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImageData var3 = null;
         var3 = (CTImageData)this.get_store().find_element_user(IMAGEDATA$16, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfImagedataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IMAGEDATA$16);
      }
   }

   public void setImagedataArray(CTImageData[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, IMAGEDATA$16);
      }
   }

   public void setImagedataArray(int var1, CTImageData var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImageData var4 = null;
         var4 = (CTImageData)this.get_store().find_element_user(IMAGEDATA$16, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTImageData insertNewImagedata(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImageData var3 = null;
         var3 = (CTImageData)this.get_store().insert_element_user(IMAGEDATA$16, var1);
         return var3;
      }
   }

   public CTImageData addNewImagedata() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImageData var2 = null;
         var2 = (CTImageData)this.get_store().add_element_user(IMAGEDATA$16);
         return var2;
      }
   }

   public void removeImagedata(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IMAGEDATA$16, var1);
      }
   }

   public List getSkewList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SkewList(this);
      }
   }

   public CTSkew[] getSkewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SKEW$18, var2);
         CTSkew[] var3 = new CTSkew[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSkew getSkewArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkew var3 = null;
         var3 = (CTSkew)this.get_store().find_element_user(SKEW$18, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSkewArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SKEW$18);
      }
   }

   public void setSkewArray(CTSkew[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SKEW$18);
      }
   }

   public void setSkewArray(int var1, CTSkew var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkew var4 = null;
         var4 = (CTSkew)this.get_store().find_element_user(SKEW$18, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSkew insertNewSkew(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkew var3 = null;
         var3 = (CTSkew)this.get_store().insert_element_user(SKEW$18, var1);
         return var3;
      }
   }

   public CTSkew addNewSkew() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSkew var2 = null;
         var2 = (CTSkew)this.get_store().add_element_user(SKEW$18);
         return var2;
      }
   }

   public void removeSkew(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SKEW$18, var1);
      }
   }

   public List getExtrusionList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ExtrusionList(this);
      }
   }

   public CTExtrusion[] getExtrusionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(EXTRUSION$20, var2);
         CTExtrusion[] var3 = new CTExtrusion[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTExtrusion getExtrusionArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtrusion var3 = null;
         var3 = (CTExtrusion)this.get_store().find_element_user(EXTRUSION$20, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfExtrusionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTRUSION$20);
      }
   }

   public void setExtrusionArray(CTExtrusion[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, EXTRUSION$20);
      }
   }

   public void setExtrusionArray(int var1, CTExtrusion var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtrusion var4 = null;
         var4 = (CTExtrusion)this.get_store().find_element_user(EXTRUSION$20, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTExtrusion insertNewExtrusion(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtrusion var3 = null;
         var3 = (CTExtrusion)this.get_store().insert_element_user(EXTRUSION$20, var1);
         return var3;
      }
   }

   public CTExtrusion addNewExtrusion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtrusion var2 = null;
         var2 = (CTExtrusion)this.get_store().add_element_user(EXTRUSION$20);
         return var2;
      }
   }

   public void removeExtrusion(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTRUSION$20, var1);
      }
   }

   public List getCalloutList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CalloutList(this);
      }
   }

   public CTCallout[] getCalloutArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CALLOUT$22, var2);
         CTCallout[] var3 = new CTCallout[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCallout getCalloutArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCallout var3 = null;
         var3 = (CTCallout)this.get_store().find_element_user(CALLOUT$22, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCalloutArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CALLOUT$22);
      }
   }

   public void setCalloutArray(CTCallout[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CALLOUT$22);
      }
   }

   public void setCalloutArray(int var1, CTCallout var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCallout var4 = null;
         var4 = (CTCallout)this.get_store().find_element_user(CALLOUT$22, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCallout insertNewCallout(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCallout var3 = null;
         var3 = (CTCallout)this.get_store().insert_element_user(CALLOUT$22, var1);
         return var3;
      }
   }

   public CTCallout addNewCallout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCallout var2 = null;
         var2 = (CTCallout)this.get_store().add_element_user(CALLOUT$22);
         return var2;
      }
   }

   public void removeCallout(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CALLOUT$22, var1);
      }
   }

   public List getLockList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LockList(this);
      }
   }

   public CTLock[] getLockArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LOCK$24, var2);
         CTLock[] var3 = new CTLock[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLock getLockArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var3 = null;
         var3 = (CTLock)this.get_store().find_element_user(LOCK$24, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLockArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LOCK$24);
      }
   }

   public void setLockArray(CTLock[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LOCK$24);
      }
   }

   public void setLockArray(int var1, CTLock var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var4 = null;
         var4 = (CTLock)this.get_store().find_element_user(LOCK$24, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLock insertNewLock(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var3 = null;
         var3 = (CTLock)this.get_store().insert_element_user(LOCK$24, var1);
         return var3;
      }
   }

   public CTLock addNewLock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLock var2 = null;
         var2 = (CTLock)this.get_store().add_element_user(LOCK$24);
         return var2;
      }
   }

   public void removeLock(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LOCK$24, var1);
      }
   }

   public List getClippathList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ClippathList(this);
      }
   }

   public CTClipPath[] getClippathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLIPPATH$26, var2);
         CTClipPath[] var3 = new CTClipPath[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTClipPath getClippathArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClipPath var3 = null;
         var3 = (CTClipPath)this.get_store().find_element_user(CLIPPATH$26, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfClippathArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLIPPATH$26);
      }
   }

   public void setClippathArray(CTClipPath[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLIPPATH$26);
      }
   }

   public void setClippathArray(int var1, CTClipPath var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClipPath var4 = null;
         var4 = (CTClipPath)this.get_store().find_element_user(CLIPPATH$26, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTClipPath insertNewClippath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClipPath var3 = null;
         var3 = (CTClipPath)this.get_store().insert_element_user(CLIPPATH$26, var1);
         return var3;
      }
   }

   public CTClipPath addNewClippath() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClipPath var2 = null;
         var2 = (CTClipPath)this.get_store().add_element_user(CLIPPATH$26);
         return var2;
      }
   }

   public void removeClippath(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLIPPATH$26, var1);
      }
   }

   public List getSignaturelineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SignaturelineList(this);
      }
   }

   public CTSignatureLine[] getSignaturelineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SIGNATURELINE$28, var2);
         CTSignatureLine[] var3 = new CTSignatureLine[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSignatureLine getSignaturelineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureLine var3 = null;
         var3 = (CTSignatureLine)this.get_store().find_element_user(SIGNATURELINE$28, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSignaturelineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SIGNATURELINE$28);
      }
   }

   public void setSignaturelineArray(CTSignatureLine[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SIGNATURELINE$28);
      }
   }

   public void setSignaturelineArray(int var1, CTSignatureLine var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureLine var4 = null;
         var4 = (CTSignatureLine)this.get_store().find_element_user(SIGNATURELINE$28, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSignatureLine insertNewSignatureline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureLine var3 = null;
         var3 = (CTSignatureLine)this.get_store().insert_element_user(SIGNATURELINE$28, var1);
         return var3;
      }
   }

   public CTSignatureLine addNewSignatureline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSignatureLine var2 = null;
         var2 = (CTSignatureLine)this.get_store().add_element_user(SIGNATURELINE$28);
         return var2;
      }
   }

   public void removeSignatureline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SIGNATURELINE$28, var1);
      }
   }

   public List getWrapList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1WrapList(this);
      }
   }

   public CTWrap[] getWrapArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(WRAP$30, var2);
         CTWrap[] var3 = new CTWrap[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTWrap getWrapArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrap var3 = null;
         var3 = (CTWrap)this.get_store().find_element_user(WRAP$30, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfWrapArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRAP$30);
      }
   }

   public void setWrapArray(CTWrap[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, WRAP$30);
      }
   }

   public void setWrapArray(int var1, CTWrap var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrap var4 = null;
         var4 = (CTWrap)this.get_store().find_element_user(WRAP$30, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTWrap insertNewWrap(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrap var3 = null;
         var3 = (CTWrap)this.get_store().insert_element_user(WRAP$30, var1);
         return var3;
      }
   }

   public CTWrap addNewWrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWrap var2 = null;
         var2 = (CTWrap)this.get_store().add_element_user(WRAP$30);
         return var2;
      }
   }

   public void removeWrap(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRAP$30, var1);
      }
   }

   public List getAnchorlockList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AnchorlockList(this);
      }
   }

   public CTAnchorLock[] getAnchorlockArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ANCHORLOCK$32, var2);
         CTAnchorLock[] var3 = new CTAnchorLock[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTAnchorLock getAnchorlockArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorLock var3 = null;
         var3 = (CTAnchorLock)this.get_store().find_element_user(ANCHORLOCK$32, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAnchorlockArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ANCHORLOCK$32);
      }
   }

   public void setAnchorlockArray(CTAnchorLock[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ANCHORLOCK$32);
      }
   }

   public void setAnchorlockArray(int var1, CTAnchorLock var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorLock var4 = null;
         var4 = (CTAnchorLock)this.get_store().find_element_user(ANCHORLOCK$32, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTAnchorLock insertNewAnchorlock(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorLock var3 = null;
         var3 = (CTAnchorLock)this.get_store().insert_element_user(ANCHORLOCK$32, var1);
         return var3;
      }
   }

   public CTAnchorLock addNewAnchorlock() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAnchorLock var2 = null;
         var2 = (CTAnchorLock)this.get_store().add_element_user(ANCHORLOCK$32);
         return var2;
      }
   }

   public void removeAnchorlock(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ANCHORLOCK$32, var1);
      }
   }

   public List getBordertopList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BordertopList(this);
      }
   }

   public CTBorder[] getBordertopArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BORDERTOP$34, var2);
         CTBorder[] var3 = new CTBorder[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBorder getBordertopArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BORDERTOP$34, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBordertopArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERTOP$34);
      }
   }

   public void setBordertopArray(CTBorder[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BORDERTOP$34);
      }
   }

   public void setBordertopArray(int var1, CTBorder var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var4 = null;
         var4 = (CTBorder)this.get_store().find_element_user(BORDERTOP$34, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBorder insertNewBordertop(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().insert_element_user(BORDERTOP$34, var1);
         return var3;
      }
   }

   public CTBorder addNewBordertop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BORDERTOP$34);
         return var2;
      }
   }

   public void removeBordertop(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERTOP$34, var1);
      }
   }

   public List getBorderbottomList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BorderbottomList(this);
      }
   }

   public CTBorder[] getBorderbottomArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BORDERBOTTOM$36, var2);
         CTBorder[] var3 = new CTBorder[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBorder getBorderbottomArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BORDERBOTTOM$36, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBorderbottomArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERBOTTOM$36);
      }
   }

   public void setBorderbottomArray(CTBorder[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BORDERBOTTOM$36);
      }
   }

   public void setBorderbottomArray(int var1, CTBorder var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var4 = null;
         var4 = (CTBorder)this.get_store().find_element_user(BORDERBOTTOM$36, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBorder insertNewBorderbottom(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().insert_element_user(BORDERBOTTOM$36, var1);
         return var3;
      }
   }

   public CTBorder addNewBorderbottom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BORDERBOTTOM$36);
         return var2;
      }
   }

   public void removeBorderbottom(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERBOTTOM$36, var1);
      }
   }

   public List getBorderleftList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BorderleftList(this);
      }
   }

   public CTBorder[] getBorderleftArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BORDERLEFT$38, var2);
         CTBorder[] var3 = new CTBorder[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBorder getBorderleftArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BORDERLEFT$38, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBorderleftArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERLEFT$38);
      }
   }

   public void setBorderleftArray(CTBorder[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BORDERLEFT$38);
      }
   }

   public void setBorderleftArray(int var1, CTBorder var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var4 = null;
         var4 = (CTBorder)this.get_store().find_element_user(BORDERLEFT$38, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBorder insertNewBorderleft(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().insert_element_user(BORDERLEFT$38, var1);
         return var3;
      }
   }

   public CTBorder addNewBorderleft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BORDERLEFT$38);
         return var2;
      }
   }

   public void removeBorderleft(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERLEFT$38, var1);
      }
   }

   public List getBorderrightList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1BorderrightList(this);
      }
   }

   public CTBorder[] getBorderrightArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(BORDERRIGHT$40, var2);
         CTBorder[] var3 = new CTBorder[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTBorder getBorderrightArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().find_element_user(BORDERRIGHT$40, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfBorderrightArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERRIGHT$40);
      }
   }

   public void setBorderrightArray(CTBorder[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, BORDERRIGHT$40);
      }
   }

   public void setBorderrightArray(int var1, CTBorder var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var4 = null;
         var4 = (CTBorder)this.get_store().find_element_user(BORDERRIGHT$40, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTBorder insertNewBorderright(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var3 = null;
         var3 = (CTBorder)this.get_store().insert_element_user(BORDERRIGHT$40, var1);
         return var3;
      }
   }

   public CTBorder addNewBorderright() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTBorder var2 = null;
         var2 = (CTBorder)this.get_store().add_element_user(BORDERRIGHT$40);
         return var2;
      }
   }

   public void removeBorderright(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERRIGHT$40, var1);
      }
   }

   public List getClientDataList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         final class ClientDataList extends AbstractList {

            public CTClientData get(int var1) {
               return CTShapeImpl.this.getClientDataArray(var1);
            }

            public CTClientData set(int var1, CTClientData var2) {
               CTClientData var3 = CTShapeImpl.this.getClientDataArray(var1);
               CTShapeImpl.this.setClientDataArray(var1, var2);
               return var3;
            }

            public void add(int var1, CTClientData var2) {
               CTShapeImpl.this.insertNewClientData(var1).set(var2);
            }

            public CTClientData remove(int var1) {
               CTClientData var2 = CTShapeImpl.this.getClientDataArray(var1);
               CTShapeImpl.this.removeClientData(var1);
               return var2;
            }

            public int size() {
               return CTShapeImpl.this.sizeOfClientDataArray();
            }
         }

         return new ClientDataList();
      }
   }

   public CTClientData[] getClientDataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CLIENTDATA$42, var2);
         CTClientData[] var3 = new CTClientData[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTClientData getClientDataArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClientData var3 = null;
         var3 = (CTClientData)this.get_store().find_element_user(CLIENTDATA$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfClientDataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLIENTDATA$42);
      }
   }

   public void setClientDataArray(CTClientData[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CLIENTDATA$42);
      }
   }

   public void setClientDataArray(int var1, CTClientData var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClientData var4 = null;
         var4 = (CTClientData)this.get_store().find_element_user(CLIENTDATA$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTClientData insertNewClientData(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClientData var3 = null;
         var3 = (CTClientData)this.get_store().insert_element_user(CLIENTDATA$42, var1);
         return var3;
      }
   }

   public CTClientData addNewClientData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTClientData var2 = null;
         var2 = (CTClientData)this.get_store().add_element_user(CLIENTDATA$42);
         return var2;
      }
   }

   public void removeClientData(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLIENTDATA$42, var1);
      }
   }

   public List getTextdataList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1TextdataList(this);
      }
   }

   public CTRel[] getTextdataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(TEXTDATA$44, var2);
         CTRel[] var3 = new CTRel[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRel getTextdataArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().find_element_user(TEXTDATA$44, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfTextdataArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TEXTDATA$44);
      }
   }

   public void setTextdataArray(CTRel[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, TEXTDATA$44);
      }
   }

   public void setTextdataArray(int var1, CTRel var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var4 = null;
         var4 = (CTRel)this.get_store().find_element_user(TEXTDATA$44, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRel insertNewTextdata(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().insert_element_user(TEXTDATA$44, var1);
         return var3;
      }
   }

   public CTRel addNewTextdata() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().add_element_user(TEXTDATA$44);
         return var2;
      }
   }

   public void removeTextdata(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TEXTDATA$44, var1);
      }
   }

   public List getInkList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1InkList(this);
      }
   }

   public CTInk[] getInkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(INK$46, var2);
         CTInk[] var3 = new CTInk[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTInk getInkArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInk var3 = null;
         var3 = (CTInk)this.get_store().find_element_user(INK$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfInkArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(INK$46);
      }
   }

   public void setInkArray(CTInk[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, INK$46);
      }
   }

   public void setInkArray(int var1, CTInk var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInk var4 = null;
         var4 = (CTInk)this.get_store().find_element_user(INK$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTInk insertNewInk(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInk var3 = null;
         var3 = (CTInk)this.get_store().insert_element_user(INK$46, var1);
         return var3;
      }
   }

   public CTInk addNewInk() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTInk var2 = null;
         var2 = (CTInk)this.get_store().add_element_user(INK$46);
         return var2;
      }
   }

   public void removeInk(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(INK$46, var1);
      }
   }

   public List getIscommentList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1IscommentList(this);
      }
   }

   public CTEmpty[] getIscommentArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ISCOMMENT$48, var2);
         CTEmpty[] var3 = new CTEmpty[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTEmpty getIscommentArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(ISCOMMENT$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfIscommentArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ISCOMMENT$48);
      }
   }

   public void setIscommentArray(CTEmpty[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ISCOMMENT$48);
      }
   }

   public void setIscommentArray(int var1, CTEmpty var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var4 = null;
         var4 = (CTEmpty)this.get_store().find_element_user(ISCOMMENT$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTEmpty insertNewIscomment(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().insert_element_user(ISCOMMENT$48, var1);
         return var3;
      }
   }

   public CTEmpty addNewIscomment() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(ISCOMMENT$48);
         return var2;
      }
   }

   public void removeIscomment(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ISCOMMENT$48, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$50);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$50);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$50) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$50);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$50);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$50);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$50);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$50);
      }
   }

   public String getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLE$52);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STYLE$52);
         return var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLE$52) != null;
      }
   }

   public void setStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLE$52);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLE$52);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STYLE$52);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STYLE$52);
         }

         var3.set(var1);
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLE$52);
      }
   }

   public String getHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HREF$54);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(HREF$54);
         return var2;
      }
   }

   public boolean isSetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HREF$54) != null;
      }
   }

   public void setHref(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HREF$54);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HREF$54);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHref(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(HREF$54);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(HREF$54);
         }

         var3.set(var1);
      }
   }

   public void unsetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HREF$54);
      }
   }

   public String getTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TARGET$56);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TARGET$56);
         return var2;
      }
   }

   public boolean isSetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TARGET$56) != null;
      }
   }

   public void setTarget(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TARGET$56);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TARGET$56);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTarget(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TARGET$56);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TARGET$56);
         }

         var3.set(var1);
      }
   }

   public void unsetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TARGET$56);
      }
   }

   public String getClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CLASS1$58);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CLASS1$58);
         return var2;
      }
   }

   public boolean isSetClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CLASS1$58) != null;
      }
   }

   public void setClass1(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CLASS1$58);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CLASS1$58);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetClass1(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CLASS1$58);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CLASS1$58);
         }

         var3.set(var1);
      }
   }

   public void unsetClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CLASS1$58);
      }
   }

   public String getTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TITLE$60);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TITLE$60);
         return var2;
      }
   }

   public boolean isSetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TITLE$60) != null;
      }
   }

   public void setTitle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TITLE$60);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TITLE$60);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTitle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TITLE$60);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TITLE$60);
         }

         var3.set(var1);
      }
   }

   public void unsetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TITLE$60);
      }
   }

   public String getAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALT$62);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ALT$62);
         return var2;
      }
   }

   public boolean isSetAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALT$62) != null;
      }
   }

   public void setAlt(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALT$62);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALT$62);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlt(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ALT$62);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ALT$62);
         }

         var3.set(var1);
      }
   }

   public void unsetAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALT$62);
      }
   }

   public String getCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COORDSIZE$64);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(COORDSIZE$64);
         return var2;
      }
   }

   public boolean isSetCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COORDSIZE$64) != null;
      }
   }

   public void setCoordsize(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COORDSIZE$64);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COORDSIZE$64);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCoordsize(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(COORDSIZE$64);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(COORDSIZE$64);
         }

         var3.set(var1);
      }
   }

   public void unsetCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COORDSIZE$64);
      }
   }

   public String getCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COORDORIGIN$66);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(COORDORIGIN$66);
         return var2;
      }
   }

   public boolean isSetCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COORDORIGIN$66) != null;
      }
   }

   public void setCoordorigin(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COORDORIGIN$66);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COORDORIGIN$66);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCoordorigin(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(COORDORIGIN$66);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(COORDORIGIN$66);
         }

         var3.set(var1);
      }
   }

   public void unsetCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COORDORIGIN$66);
      }
   }

   public String getWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WRAPCOORDS$68);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(WRAPCOORDS$68);
         return var2;
      }
   }

   public boolean isSetWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WRAPCOORDS$68) != null;
      }
   }

   public void setWrapcoords(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WRAPCOORDS$68);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WRAPCOORDS$68);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetWrapcoords(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(WRAPCOORDS$68);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(WRAPCOORDS$68);
         }

         var3.set(var1);
      }
   }

   public void unsetWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WRAPCOORDS$68);
      }
   }

   public STTrueFalse.Enum getPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRINT$70);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(PRINT$70);
         return var2;
      }
   }

   public boolean isSetPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRINT$70) != null;
      }
   }

   public void setPrint(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRINT$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRINT$70);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPrint(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(PRINT$70);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(PRINT$70);
         }

         var3.set(var1);
      }
   }

   public void unsetPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRINT$70);
      }
   }

   public String getSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPID$72);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SPID$72);
         return var2;
      }
   }

   public boolean isSetSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPID$72) != null;
      }
   }

   public void setSpid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPID$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPID$72);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSpid(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SPID$72);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SPID$72);
         }

         var3.set(var1);
      }
   }

   public void unsetSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPID$72);
      }
   }

   public STTrueFalse$Enum getOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ONED$74);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ONED$74);
         return var2;
      }
   }

   public boolean isSetOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ONED$74) != null;
      }
   }

   public void setOned(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ONED$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ONED$74);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOned(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ONED$74);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(ONED$74);
         }

         var3.set(var1);
      }
   }

   public void unsetOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ONED$74);
      }
   }

   public BigInteger getRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REGROUPID$76);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(REGROUPID$76);
         return var2;
      }
   }

   public boolean isSetRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REGROUPID$76) != null;
      }
   }

   public void setRegroupid(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REGROUPID$76);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REGROUPID$76);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetRegroupid(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(REGROUPID$76);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(REGROUPID$76);
         }

         var3.set(var1);
      }
   }

   public void unsetRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REGROUPID$76);
      }
   }

   public STTrueFalse$Enum getDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$78);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$78);
         return var2;
      }
   }

   public boolean isSetDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$78) != null;
      }
   }

   public void setDoubleclicknotify(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$78);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DOUBLECLICKNOTIFY$78);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDoubleclicknotify(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$78);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(DOUBLECLICKNOTIFY$78);
         }

         var3.set(var1);
      }
   }

   public void unsetDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DOUBLECLICKNOTIFY$78);
      }
   }

   public STTrueFalse$Enum getButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BUTTON$80);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BUTTON$80);
         return var2;
      }
   }

   public boolean isSetButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BUTTON$80) != null;
      }
   }

   public void setButton(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BUTTON$80);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BUTTON$80);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetButton(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BUTTON$80);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(BUTTON$80);
         }

         var3.set(var1);
      }
   }

   public void unsetButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BUTTON$80);
      }
   }

   public STTrueFalse$Enum getUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USERHIDDEN$82);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERHIDDEN$82);
         return var2;
      }
   }

   public boolean isSetUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USERHIDDEN$82) != null;
      }
   }

   public void setUserhidden(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USERHIDDEN$82);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USERHIDDEN$82);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUserhidden(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERHIDDEN$82);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(USERHIDDEN$82);
         }

         var3.set(var1);
      }
   }

   public void unsetUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USERHIDDEN$82);
      }
   }

   public STTrueFalse$Enum getBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BULLET$84);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BULLET$84);
         return var2;
      }
   }

   public boolean isSetBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BULLET$84) != null;
      }
   }

   public void setBullet(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BULLET$84);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BULLET$84);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBullet(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BULLET$84);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(BULLET$84);
         }

         var3.set(var1);
      }
   }

   public void unsetBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BULLET$84);
      }
   }

   public STTrueFalse$Enum getHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HR$86);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HR$86);
         return var2;
      }
   }

   public boolean isSetHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HR$86) != null;
      }
   }

   public void setHr(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HR$86);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HR$86);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHr(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HR$86);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(HR$86);
         }

         var3.set(var1);
      }
   }

   public void unsetHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HR$86);
      }
   }

   public STTrueFalse$Enum getHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRSTD$88);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRSTD$88);
         return var2;
      }
   }

   public boolean isSetHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRSTD$88) != null;
      }
   }

   public void setHrstd(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRSTD$88);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRSTD$88);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHrstd(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRSTD$88);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(HRSTD$88);
         }

         var3.set(var1);
      }
   }

   public void unsetHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRSTD$88);
      }
   }

   public STTrueFalse$Enum getHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRNOSHADE$90);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRNOSHADE$90);
         return var2;
      }
   }

   public boolean isSetHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRNOSHADE$90) != null;
      }
   }

   public void setHrnoshade(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRNOSHADE$90);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRNOSHADE$90);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHrnoshade(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRNOSHADE$90);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(HRNOSHADE$90);
         }

         var3.set(var1);
      }
   }

   public void unsetHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRNOSHADE$90);
      }
   }

   public float getHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRPCT$92);
         return var2 == null?0.0F:var2.getFloatValue();
      }
   }

   public XmlFloat xgetHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var2 = null;
         var2 = (XmlFloat)this.get_store().find_attribute_user(HRPCT$92);
         return var2;
      }
   }

   public boolean isSetHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRPCT$92) != null;
      }
   }

   public void setHrpct(float var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRPCT$92);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRPCT$92);
         }

         var3.setFloatValue(var1);
      }
   }

   public void xsetHrpct(XmlFloat var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var3 = null;
         var3 = (XmlFloat)this.get_store().find_attribute_user(HRPCT$92);
         if(var3 == null) {
            var3 = (XmlFloat)this.get_store().add_attribute_user(HRPCT$92);
         }

         var3.set(var1);
      }
   }

   public void unsetHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRPCT$92);
      }
   }

   public STHrAlign$Enum getHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRALIGN$94);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HRALIGN$94);
         }

         return var2 == null?null:(STHrAlign$Enum)var2.getEnumValue();
      }
   }

   public STHrAlign xgetHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHrAlign var2 = null;
         var2 = (STHrAlign)this.get_store().find_attribute_user(HRALIGN$94);
         if(var2 == null) {
            var2 = (STHrAlign)this.get_default_attribute_value(HRALIGN$94);
         }

         return var2;
      }
   }

   public boolean isSetHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRALIGN$94) != null;
      }
   }

   public void setHralign(STHrAlign$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRALIGN$94);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRALIGN$94);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHralign(STHrAlign var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHrAlign var3 = null;
         var3 = (STHrAlign)this.get_store().find_attribute_user(HRALIGN$94);
         if(var3 == null) {
            var3 = (STHrAlign)this.get_store().add_attribute_user(HRALIGN$94);
         }

         var3.set(var1);
      }
   }

   public void unsetHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRALIGN$94);
      }
   }

   public STTrueFalse$Enum getAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWINCELL$96);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWINCELL$96);
         return var2;
      }
   }

   public boolean isSetAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLOWINCELL$96) != null;
      }
   }

   public void setAllowincell(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWINCELL$96);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWINCELL$96);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAllowincell(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWINCELL$96);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(ALLOWINCELL$96);
         }

         var3.set(var1);
      }
   }

   public void unsetAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLOWINCELL$96);
      }
   }

   public STTrueFalse$Enum getAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWOVERLAP$98);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWOVERLAP$98);
         return var2;
      }
   }

   public boolean isSetAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLOWOVERLAP$98) != null;
      }
   }

   public void setAllowoverlap(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWOVERLAP$98);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWOVERLAP$98);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAllowoverlap(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWOVERLAP$98);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(ALLOWOVERLAP$98);
         }

         var3.set(var1);
      }
   }

   public void unsetAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLOWOVERLAP$98);
      }
   }

   public STTrueFalse$Enum getUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$100);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERDRAWN$100);
         return var2;
      }
   }

   public boolean isSetUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USERDRAWN$100) != null;
      }
   }

   public void setUserdrawn(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$100);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USERDRAWN$100);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUserdrawn(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERDRAWN$100);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(USERDRAWN$100);
         }

         var3.set(var1);
      }
   }

   public void unsetUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USERDRAWN$100);
      }
   }

   public String getBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERTOPCOLOR$102);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERTOPCOLOR$102);
         return var2;
      }
   }

   public boolean isSetBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERTOPCOLOR$102) != null;
      }
   }

   public void setBordertopcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERTOPCOLOR$102);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERTOPCOLOR$102);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBordertopcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERTOPCOLOR$102);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERTOPCOLOR$102);
         }

         var3.set(var1);
      }
   }

   public void unsetBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERTOPCOLOR$102);
      }
   }

   public String getBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERLEFTCOLOR$104);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERLEFTCOLOR$104);
         return var2;
      }
   }

   public boolean isSetBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERLEFTCOLOR$104) != null;
      }
   }

   public void setBorderleftcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERLEFTCOLOR$104);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERLEFTCOLOR$104);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBorderleftcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERLEFTCOLOR$104);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERLEFTCOLOR$104);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERLEFTCOLOR$104);
      }
   }

   public String getBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$106);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$106);
         return var2;
      }
   }

   public boolean isSetBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$106) != null;
      }
   }

   public void setBorderbottomcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$106);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERBOTTOMCOLOR$106);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBorderbottomcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$106);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERBOTTOMCOLOR$106);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERBOTTOMCOLOR$106);
      }
   }

   public String getBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$108);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$108);
         return var2;
      }
   }

   public boolean isSetBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERRIGHTCOLOR$108) != null;
      }
   }

   public void setBorderrightcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$108);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERRIGHTCOLOR$108);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBorderrightcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$108);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERRIGHTCOLOR$108);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERRIGHTCOLOR$108);
      }
   }

   public BigInteger getDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUT$110);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUT$110);
         return var2;
      }
   }

   public boolean isSetDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DGMLAYOUT$110) != null;
      }
   }

   public void setDgmlayout(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUT$110);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DGMLAYOUT$110);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDgmlayout(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUT$110);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(DGMLAYOUT$110);
         }

         var3.set(var1);
      }
   }

   public void unsetDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DGMLAYOUT$110);
      }
   }

   public BigInteger getDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DGMNODEKIND$112);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(DGMNODEKIND$112);
         return var2;
      }
   }

   public boolean isSetDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DGMNODEKIND$112) != null;
      }
   }

   public void setDgmnodekind(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DGMNODEKIND$112);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DGMNODEKIND$112);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDgmnodekind(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(DGMNODEKIND$112);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(DGMNODEKIND$112);
         }

         var3.set(var1);
      }
   }

   public void unsetDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DGMNODEKIND$112);
      }
   }

   public BigInteger getDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUTMRU$114);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUTMRU$114);
         return var2;
      }
   }

   public boolean isSetDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DGMLAYOUTMRU$114) != null;
      }
   }

   public void setDgmlayoutmru(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUTMRU$114);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DGMLAYOUTMRU$114);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDgmlayoutmru(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUTMRU$114);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(DGMLAYOUTMRU$114);
         }

         var3.set(var1);
      }
   }

   public void unsetDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DGMLAYOUTMRU$114);
      }
   }

   public STInsetMode.Enum getInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSETMODE$116);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSETMODE$116);
         }

         return var2 == null?null:(STInsetMode.Enum)var2.getEnumValue();
      }
   }

   public STInsetMode xgetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STInsetMode var2 = null;
         var2 = (STInsetMode)this.get_store().find_attribute_user(INSETMODE$116);
         if(var2 == null) {
            var2 = (STInsetMode)this.get_default_attribute_value(INSETMODE$116);
         }

         return var2;
      }
   }

   public boolean isSetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSETMODE$116) != null;
      }
   }

   public void setInsetmode(STInsetMode.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSETMODE$116);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSETMODE$116);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInsetmode(STInsetMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STInsetMode var3 = null;
         var3 = (STInsetMode)this.get_store().find_attribute_user(INSETMODE$116);
         if(var3 == null) {
            var3 = (STInsetMode)this.get_store().add_attribute_user(INSETMODE$116);
         }

         var3.set(var1);
      }
   }

   public void unsetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSETMODE$116);
      }
   }

   public String getChromakey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CHROMAKEY$118);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetChromakey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(CHROMAKEY$118);
         return var2;
      }
   }

   public boolean isSetChromakey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CHROMAKEY$118) != null;
      }
   }

   public void setChromakey(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CHROMAKEY$118);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CHROMAKEY$118);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetChromakey(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(CHROMAKEY$118);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(CHROMAKEY$118);
         }

         var3.set(var1);
      }
   }

   public void unsetChromakey() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CHROMAKEY$118);
      }
   }

   public STTrueFalse.Enum getFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLED$120);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(FILLED$120);
         return var2;
      }
   }

   public boolean isSetFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLED$120) != null;
      }
   }

   public void setFilled(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILLED$120);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILLED$120);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFilled(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(FILLED$120);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(FILLED$120);
         }

         var3.set(var1);
      }
   }

   public void unsetFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLED$120);
      }
   }

   public String getFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLCOLOR$122);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(FILLCOLOR$122);
         return var2;
      }
   }

   public boolean isSetFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLCOLOR$122) != null;
      }
   }

   public void setFillcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILLCOLOR$122);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILLCOLOR$122);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFillcolor(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(FILLCOLOR$122);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(FILLCOLOR$122);
         }

         var3.set(var1);
      }
   }

   public void unsetFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLCOLOR$122);
      }
   }

   public String getOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OPACITY$124);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(OPACITY$124);
         return var2;
      }
   }

   public boolean isSetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OPACITY$124) != null;
      }
   }

   public void setOpacity(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OPACITY$124);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OPACITY$124);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOpacity(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(OPACITY$124);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(OPACITY$124);
         }

         var3.set(var1);
      }
   }

   public void unsetOpacity() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OPACITY$124);
      }
   }

   public STTrueFalse.Enum getStroked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STROKED$126);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetStroked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(STROKED$126);
         return var2;
      }
   }

   public boolean isSetStroked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STROKED$126) != null;
      }
   }

   public void setStroked(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STROKED$126);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STROKED$126);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetStroked(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(STROKED$126);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(STROKED$126);
         }

         var3.set(var1);
      }
   }

   public void unsetStroked() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STROKED$126);
      }
   }

   public String getStrokecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STROKECOLOR$128);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetStrokecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(STROKECOLOR$128);
         return var2;
      }
   }

   public boolean isSetStrokecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STROKECOLOR$128) != null;
      }
   }

   public void setStrokecolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STROKECOLOR$128);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STROKECOLOR$128);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStrokecolor(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(STROKECOLOR$128);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(STROKECOLOR$128);
         }

         var3.set(var1);
      }
   }

   public void unsetStrokecolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STROKECOLOR$128);
      }
   }

   public String getStrokeweight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STROKEWEIGHT$130);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetStrokeweight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STROKEWEIGHT$130);
         return var2;
      }
   }

   public boolean isSetStrokeweight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STROKEWEIGHT$130) != null;
      }
   }

   public void setStrokeweight(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STROKEWEIGHT$130);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STROKEWEIGHT$130);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStrokeweight(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STROKEWEIGHT$130);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STROKEWEIGHT$130);
         }

         var3.set(var1);
      }
   }

   public void unsetStrokeweight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STROKEWEIGHT$130);
      }
   }

   public STTrueFalse.Enum getInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSETPEN$132);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(INSETPEN$132);
         return var2;
      }
   }

   public boolean isSetInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSETPEN$132) != null;
      }
   }

   public void setInsetpen(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSETPEN$132);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSETPEN$132);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInsetpen(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(INSETPEN$132);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(INSETPEN$132);
         }

         var3.set(var1);
      }
   }

   public void unsetInsetpen() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSETPEN$132);
      }
   }

   public float getSpt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPT$134);
         return var2 == null?0.0F:var2.getFloatValue();
      }
   }

   public XmlFloat xgetSpt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var2 = null;
         var2 = (XmlFloat)this.get_store().find_attribute_user(SPT$134);
         return var2;
      }
   }

   public boolean isSetSpt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPT$134) != null;
      }
   }

   public void setSpt(float var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPT$134);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPT$134);
         }

         var3.setFloatValue(var1);
      }
   }

   public void xsetSpt(XmlFloat var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var3 = null;
         var3 = (XmlFloat)this.get_store().find_attribute_user(SPT$134);
         if(var3 == null) {
            var3 = (XmlFloat)this.get_store().add_attribute_user(SPT$134);
         }

         var3.set(var1);
      }
   }

   public void unsetSpt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPT$134);
      }
   }

   public STConnectorType$Enum getConnectortype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CONNECTORTYPE$136);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(CONNECTORTYPE$136);
         }

         return var2 == null?null:(STConnectorType$Enum)var2.getEnumValue();
      }
   }

   public STConnectorType xgetConnectortype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STConnectorType var2 = null;
         var2 = (STConnectorType)this.get_store().find_attribute_user(CONNECTORTYPE$136);
         if(var2 == null) {
            var2 = (STConnectorType)this.get_default_attribute_value(CONNECTORTYPE$136);
         }

         return var2;
      }
   }

   public boolean isSetConnectortype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CONNECTORTYPE$136) != null;
      }
   }

   public void setConnectortype(STConnectorType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CONNECTORTYPE$136);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CONNECTORTYPE$136);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetConnectortype(STConnectorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STConnectorType var3 = null;
         var3 = (STConnectorType)this.get_store().find_attribute_user(CONNECTORTYPE$136);
         if(var3 == null) {
            var3 = (STConnectorType)this.get_store().add_attribute_user(CONNECTORTYPE$136);
         }

         var3.set(var1);
      }
   }

   public void unsetConnectortype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CONNECTORTYPE$136);
      }
   }

   public STBWMode$Enum getBwmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$138);
         return var2 == null?null:(STBWMode$Enum)var2.getEnumValue();
      }
   }

   public STBWMode xgetBwmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBWMode var2 = null;
         var2 = (STBWMode)this.get_store().find_attribute_user(BWMODE$138);
         return var2;
      }
   }

   public boolean isSetBwmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BWMODE$138) != null;
      }
   }

   public void setBwmode(STBWMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BWMODE$138);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BWMODE$138);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBwmode(STBWMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBWMode var3 = null;
         var3 = (STBWMode)this.get_store().find_attribute_user(BWMODE$138);
         if(var3 == null) {
            var3 = (STBWMode)this.get_store().add_attribute_user(BWMODE$138);
         }

         var3.set(var1);
      }
   }

   public void unsetBwmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BWMODE$138);
      }
   }

   public STBWMode$Enum getBwpure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BWPURE$140);
         return var2 == null?null:(STBWMode$Enum)var2.getEnumValue();
      }
   }

   public STBWMode xgetBwpure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBWMode var2 = null;
         var2 = (STBWMode)this.get_store().find_attribute_user(BWPURE$140);
         return var2;
      }
   }

   public boolean isSetBwpure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BWPURE$140) != null;
      }
   }

   public void setBwpure(STBWMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BWPURE$140);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BWPURE$140);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBwpure(STBWMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBWMode var3 = null;
         var3 = (STBWMode)this.get_store().find_attribute_user(BWPURE$140);
         if(var3 == null) {
            var3 = (STBWMode)this.get_store().add_attribute_user(BWPURE$140);
         }

         var3.set(var1);
      }
   }

   public void unsetBwpure() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BWPURE$140);
      }
   }

   public STBWMode$Enum getBwnormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BWNORMAL$142);
         return var2 == null?null:(STBWMode$Enum)var2.getEnumValue();
      }
   }

   public STBWMode xgetBwnormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBWMode var2 = null;
         var2 = (STBWMode)this.get_store().find_attribute_user(BWNORMAL$142);
         return var2;
      }
   }

   public boolean isSetBwnormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BWNORMAL$142) != null;
      }
   }

   public void setBwnormal(STBWMode$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BWNORMAL$142);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BWNORMAL$142);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBwnormal(STBWMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBWMode var3 = null;
         var3 = (STBWMode)this.get_store().find_attribute_user(BWNORMAL$142);
         if(var3 == null) {
            var3 = (STBWMode)this.get_store().add_attribute_user(BWNORMAL$142);
         }

         var3.set(var1);
      }
   }

   public void unsetBwnormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BWNORMAL$142);
      }
   }

   public STTrueFalse$Enum getForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORCEDASH$144);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(FORCEDASH$144);
         return var2;
      }
   }

   public boolean isSetForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORCEDASH$144) != null;
      }
   }

   public void setForcedash(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORCEDASH$144);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORCEDASH$144);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetForcedash(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(FORCEDASH$144);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(FORCEDASH$144);
         }

         var3.set(var1);
      }
   }

   public void unsetForcedash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORCEDASH$144);
      }
   }

   public STTrueFalse$Enum getOleicon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OLEICON$146);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetOleicon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(OLEICON$146);
         return var2;
      }
   }

   public boolean isSetOleicon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OLEICON$146) != null;
      }
   }

   public void setOleicon(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OLEICON$146);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OLEICON$146);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOleicon(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(OLEICON$146);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(OLEICON$146);
         }

         var3.set(var1);
      }
   }

   public void unsetOleicon() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OLEICON$146);
      }
   }

   public STTrueFalseBlank$Enum getOle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(OLE$148);
         return var2 == null?null:(STTrueFalseBlank$Enum)var2.getEnumValue();
      }
   }

   public STTrueFalseBlank xgetOle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var2 = null;
         var2 = (STTrueFalseBlank)this.get_store().find_attribute_user(OLE$148);
         return var2;
      }
   }

   public boolean isSetOle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(OLE$148) != null;
      }
   }

   public void setOle(STTrueFalseBlank$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(OLE$148);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(OLE$148);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOle(STTrueFalseBlank var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalseBlank var3 = null;
         var3 = (STTrueFalseBlank)this.get_store().find_attribute_user(OLE$148);
         if(var3 == null) {
            var3 = (STTrueFalseBlank)this.get_store().add_attribute_user(OLE$148);
         }

         var3.set(var1);
      }
   }

   public void unsetOle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(OLE$148);
      }
   }

   public STTrueFalse$Enum getPreferrelative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PREFERRELATIVE$150);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetPreferrelative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(PREFERRELATIVE$150);
         return var2;
      }
   }

   public boolean isSetPreferrelative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PREFERRELATIVE$150) != null;
      }
   }

   public void setPreferrelative(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PREFERRELATIVE$150);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PREFERRELATIVE$150);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPreferrelative(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(PREFERRELATIVE$150);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(PREFERRELATIVE$150);
         }

         var3.set(var1);
      }
   }

   public void unsetPreferrelative() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PREFERRELATIVE$150);
      }
   }

   public STTrueFalse$Enum getCliptowrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CLIPTOWRAP$152);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetCliptowrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(CLIPTOWRAP$152);
         return var2;
      }
   }

   public boolean isSetCliptowrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CLIPTOWRAP$152) != null;
      }
   }

   public void setCliptowrap(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CLIPTOWRAP$152);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CLIPTOWRAP$152);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCliptowrap(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(CLIPTOWRAP$152);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(CLIPTOWRAP$152);
         }

         var3.set(var1);
      }
   }

   public void unsetCliptowrap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CLIPTOWRAP$152);
      }
   }

   public STTrueFalse$Enum getClip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CLIP$154);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetClip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(CLIP$154);
         return var2;
      }
   }

   public boolean isSetClip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CLIP$154) != null;
      }
   }

   public void setClip(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CLIP$154);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CLIP$154);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetClip(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(CLIP$154);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(CLIP$154);
         }

         var3.set(var1);
      }
   }

   public void unsetClip() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CLIP$154);
      }
   }

   public String getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$156);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TYPE$156);
         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$156) != null;
      }
   }

   public void setType(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$156);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$156);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetType(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TYPE$156);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TYPE$156);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$156);
      }
   }

   public String getAdj() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ADJ$158);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAdj() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ADJ$158);
         return var2;
      }
   }

   public boolean isSetAdj() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ADJ$158) != null;
      }
   }

   public void setAdj(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ADJ$158);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ADJ$158);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAdj(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ADJ$158);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ADJ$158);
         }

         var3.set(var1);
      }
   }

   public void unsetAdj() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ADJ$158);
      }
   }

   public String getPath2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PATH2$160);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetPath2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(PATH2$160);
         return var2;
      }
   }

   public boolean isSetPath2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PATH2$160) != null;
      }
   }

   public void setPath2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PATH2$160);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PATH2$160);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetPath2(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(PATH2$160);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(PATH2$160);
         }

         var3.set(var1);
      }
   }

   public void unsetPath2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PATH2$160);
      }
   }

   public byte[] getGfxdata() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(GFXDATA$162);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetGfxdata() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(GFXDATA$162);
         return var2;
      }
   }

   public boolean isSetGfxdata() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(GFXDATA$162) != null;
      }
   }

   public void setGfxdata(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(GFXDATA$162);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(GFXDATA$162);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetGfxdata(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(GFXDATA$162);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(GFXDATA$162);
         }

         var3.set(var1);
      }
   }

   public void unsetGfxdata() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(GFXDATA$162);
      }
   }

   public String getEquationxml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EQUATIONXML$164);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetEquationxml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(EQUATIONXML$164);
         return var2;
      }
   }

   public boolean isSetEquationxml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EQUATIONXML$164) != null;
      }
   }

   public void setEquationxml(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EQUATIONXML$164);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EQUATIONXML$164);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetEquationxml(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(EQUATIONXML$164);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(EQUATIONXML$164);
         }

         var3.set(var1);
      }
   }

   public void unsetEquationxml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EQUATIONXML$164);
      }
   }

}
