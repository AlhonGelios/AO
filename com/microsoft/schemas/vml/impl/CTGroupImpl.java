package com.microsoft.schemas.vml.impl;

import com.microsoft.schemas.office.excel.CTClientData;
import com.microsoft.schemas.office.office.CTCallout;
import com.microsoft.schemas.office.office.CTClipPath;
import com.microsoft.schemas.office.office.CTDiagram;
import com.microsoft.schemas.office.office.CTExtrusion;
import com.microsoft.schemas.office.office.CTLock;
import com.microsoft.schemas.office.office.CTSignatureLine;
import com.microsoft.schemas.office.office.CTSkew;
import com.microsoft.schemas.office.office.STHrAlign;
import com.microsoft.schemas.office.office.STHrAlign$Enum;
import com.microsoft.schemas.office.office.STInsetMode;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
import com.microsoft.schemas.office.powerpoint.CTRel;
import com.microsoft.schemas.office.word.CTAnchorLock;
import com.microsoft.schemas.office.word.CTBorder;
import com.microsoft.schemas.office.word.CTWrap;
import com.microsoft.schemas.vml.CTArc;
import com.microsoft.schemas.vml.CTCurve;
import com.microsoft.schemas.vml.CTFill;
import com.microsoft.schemas.vml.CTFormulas;
import com.microsoft.schemas.vml.CTGroup;
import com.microsoft.schemas.vml.CTHandles;
import com.microsoft.schemas.vml.CTImage;
import com.microsoft.schemas.vml.CTImageData;
import com.microsoft.schemas.vml.CTLine;
import com.microsoft.schemas.vml.CTOval;
import com.microsoft.schemas.vml.CTPath;
import com.microsoft.schemas.vml.CTPolyLine;
import com.microsoft.schemas.vml.CTRect;
import com.microsoft.schemas.vml.CTRoundRect;
import com.microsoft.schemas.vml.CTShadow;
import com.microsoft.schemas.vml.CTShape;
import com.microsoft.schemas.vml.CTShapetype;
import com.microsoft.schemas.vml.CTStroke;
import com.microsoft.schemas.vml.CTTextPath;
import com.microsoft.schemas.vml.CTTextbox;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STEditAs;
import com.microsoft.schemas.vml.STEditAs$Enum;
import com.microsoft.schemas.vml.STTrueFalse;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1AnchorlockList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ArcList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1BorderbottomList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1BorderleftList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1BorderrightList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1BordertopList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1CalloutList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ClientDataList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ClippathList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1CurveList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1DiagramList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ExtrusionList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1FillList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1FormulasList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1GroupList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1HandlesList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ImageList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ImagedataList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1LineList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1LockList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1OvalList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1PathList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1PolylineList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1RectList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1RoundrectList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ShadowList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ShapeList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1ShapetypeList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1SignaturelineList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1SkewList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1StrokeList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1TextboxList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1TextdataList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1TextpathList;
import com.microsoft.schemas.vml.impl.CTGroupImpl.1WrapList;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTGroupImpl extends XmlComplexContentImpl implements CTGroup {

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
   private static final QName GROUP$46 = new QName("urn:schemas-microsoft-com:vml", "group");
   private static final QName SHAPE$48 = new QName("urn:schemas-microsoft-com:vml", "shape");
   private static final QName SHAPETYPE$50 = new QName("urn:schemas-microsoft-com:vml", "shapetype");
   private static final QName ARC$52 = new QName("urn:schemas-microsoft-com:vml", "arc");
   private static final QName CURVE$54 = new QName("urn:schemas-microsoft-com:vml", "curve");
   private static final QName IMAGE$56 = new QName("urn:schemas-microsoft-com:vml", "image");
   private static final QName LINE$58 = new QName("urn:schemas-microsoft-com:vml", "line");
   private static final QName OVAL$60 = new QName("urn:schemas-microsoft-com:vml", "oval");
   private static final QName POLYLINE$62 = new QName("urn:schemas-microsoft-com:vml", "polyline");
   private static final QName RECT$64 = new QName("urn:schemas-microsoft-com:vml", "rect");
   private static final QName ROUNDRECT$66 = new QName("urn:schemas-microsoft-com:vml", "roundrect");
   private static final QName DIAGRAM$68 = new QName("urn:schemas-microsoft-com:office:office", "diagram");
   private static final QName ID$70 = new QName("", "id");
   private static final QName STYLE$72 = new QName("", "style");
   private static final QName HREF$74 = new QName("", "href");
   private static final QName TARGET$76 = new QName("", "target");
   private static final QName CLASS1$78 = new QName("", "class");
   private static final QName TITLE$80 = new QName("", "title");
   private static final QName ALT$82 = new QName("", "alt");
   private static final QName COORDSIZE$84 = new QName("", "coordsize");
   private static final QName COORDORIGIN$86 = new QName("", "coordorigin");
   private static final QName WRAPCOORDS$88 = new QName("", "wrapcoords");
   private static final QName PRINT$90 = new QName("", "print");
   private static final QName SPID$92 = new QName("urn:schemas-microsoft-com:office:office", "spid");
   private static final QName ONED$94 = new QName("urn:schemas-microsoft-com:office:office", "oned");
   private static final QName REGROUPID$96 = new QName("urn:schemas-microsoft-com:office:office", "regroupid");
   private static final QName DOUBLECLICKNOTIFY$98 = new QName("urn:schemas-microsoft-com:office:office", "doubleclicknotify");
   private static final QName BUTTON$100 = new QName("urn:schemas-microsoft-com:office:office", "button");
   private static final QName USERHIDDEN$102 = new QName("urn:schemas-microsoft-com:office:office", "userhidden");
   private static final QName BULLET$104 = new QName("urn:schemas-microsoft-com:office:office", "bullet");
   private static final QName HR$106 = new QName("urn:schemas-microsoft-com:office:office", "hr");
   private static final QName HRSTD$108 = new QName("urn:schemas-microsoft-com:office:office", "hrstd");
   private static final QName HRNOSHADE$110 = new QName("urn:schemas-microsoft-com:office:office", "hrnoshade");
   private static final QName HRPCT$112 = new QName("urn:schemas-microsoft-com:office:office", "hrpct");
   private static final QName HRALIGN$114 = new QName("urn:schemas-microsoft-com:office:office", "hralign");
   private static final QName ALLOWINCELL$116 = new QName("urn:schemas-microsoft-com:office:office", "allowincell");
   private static final QName ALLOWOVERLAP$118 = new QName("urn:schemas-microsoft-com:office:office", "allowoverlap");
   private static final QName USERDRAWN$120 = new QName("urn:schemas-microsoft-com:office:office", "userdrawn");
   private static final QName BORDERTOPCOLOR$122 = new QName("urn:schemas-microsoft-com:office:office", "bordertopcolor");
   private static final QName BORDERLEFTCOLOR$124 = new QName("urn:schemas-microsoft-com:office:office", "borderleftcolor");
   private static final QName BORDERBOTTOMCOLOR$126 = new QName("urn:schemas-microsoft-com:office:office", "borderbottomcolor");
   private static final QName BORDERRIGHTCOLOR$128 = new QName("urn:schemas-microsoft-com:office:office", "borderrightcolor");
   private static final QName DGMLAYOUT$130 = new QName("urn:schemas-microsoft-com:office:office", "dgmlayout");
   private static final QName DGMNODEKIND$132 = new QName("urn:schemas-microsoft-com:office:office", "dgmnodekind");
   private static final QName DGMLAYOUTMRU$134 = new QName("urn:schemas-microsoft-com:office:office", "dgmlayoutmru");
   private static final QName INSETMODE$136 = new QName("urn:schemas-microsoft-com:office:office", "insetmode");
   private static final QName FILLED$138 = new QName("", "filled");
   private static final QName FILLCOLOR$140 = new QName("", "fillcolor");
   private static final QName EDITAS$142 = new QName("", "editas");
   private static final QName TABLEPROPERTIES$144 = new QName("urn:schemas-microsoft-com:office:office", "tableproperties");
   private static final QName TABLELIMITS$146 = new QName("urn:schemas-microsoft-com:office:office", "tablelimits");


   public CTGroupImpl(SchemaType var1) {
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
         return new 1ClientDataList(this);
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

   public List getGroupList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1GroupList(this);
      }
   }

   public CTGroup[] getGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(GROUP$46, var2);
         CTGroup[] var3 = new CTGroup[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTGroup getGroupArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroup var3 = null;
         var3 = (CTGroup)this.get_store().find_element_user(GROUP$46, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfGroupArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GROUP$46);
      }
   }

   public void setGroupArray(CTGroup[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, GROUP$46);
      }
   }

   public void setGroupArray(int var1, CTGroup var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroup var4 = null;
         var4 = (CTGroup)this.get_store().find_element_user(GROUP$46, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTGroup insertNewGroup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroup var3 = null;
         var3 = (CTGroup)this.get_store().insert_element_user(GROUP$46, var1);
         return var3;
      }
   }

   public CTGroup addNewGroup() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTGroup var2 = null;
         var2 = (CTGroup)this.get_store().add_element_user(GROUP$46);
         return var2;
      }
   }

   public void removeGroup(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GROUP$46, var1);
      }
   }

   public List getShapeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShapeList(this);
      }
   }

   public CTShape[] getShapeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHAPE$48, var2);
         CTShape[] var3 = new CTShape[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTShape getShapeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var3 = null;
         var3 = (CTShape)this.get_store().find_element_user(SHAPE$48, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShapeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAPE$48);
      }
   }

   public void setShapeArray(CTShape[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHAPE$48);
      }
   }

   public void setShapeArray(int var1, CTShape var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var4 = null;
         var4 = (CTShape)this.get_store().find_element_user(SHAPE$48, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTShape insertNewShape(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var3 = null;
         var3 = (CTShape)this.get_store().insert_element_user(SHAPE$48, var1);
         return var3;
      }
   }

   public CTShape addNewShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShape var2 = null;
         var2 = (CTShape)this.get_store().add_element_user(SHAPE$48);
         return var2;
      }
   }

   public void removeShape(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAPE$48, var1);
      }
   }

   public List getShapetypeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ShapetypeList(this);
      }
   }

   public CTShapetype[] getShapetypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SHAPETYPE$50, var2);
         CTShapetype[] var3 = new CTShapetype[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTShapetype getShapetypeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapetype var3 = null;
         var3 = (CTShapetype)this.get_store().find_element_user(SHAPETYPE$50, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfShapetypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAPETYPE$50);
      }
   }

   public void setShapetypeArray(CTShapetype[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SHAPETYPE$50);
      }
   }

   public void setShapetypeArray(int var1, CTShapetype var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapetype var4 = null;
         var4 = (CTShapetype)this.get_store().find_element_user(SHAPETYPE$50, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTShapetype insertNewShapetype(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapetype var3 = null;
         var3 = (CTShapetype)this.get_store().insert_element_user(SHAPETYPE$50, var1);
         return var3;
      }
   }

   public CTShapetype addNewShapetype() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapetype var2 = null;
         var2 = (CTShapetype)this.get_store().add_element_user(SHAPETYPE$50);
         return var2;
      }
   }

   public void removeShapetype(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAPETYPE$50, var1);
      }
   }

   public List getArcList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ArcList(this);
      }
   }

   public CTArc[] getArcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ARC$52, var2);
         CTArc[] var3 = new CTArc[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTArc getArcArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArc var3 = null;
         var3 = (CTArc)this.get_store().find_element_user(ARC$52, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfArcArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ARC$52);
      }
   }

   public void setArcArray(CTArc[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ARC$52);
      }
   }

   public void setArcArray(int var1, CTArc var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArc var4 = null;
         var4 = (CTArc)this.get_store().find_element_user(ARC$52, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTArc insertNewArc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArc var3 = null;
         var3 = (CTArc)this.get_store().insert_element_user(ARC$52, var1);
         return var3;
      }
   }

   public CTArc addNewArc() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTArc var2 = null;
         var2 = (CTArc)this.get_store().add_element_user(ARC$52);
         return var2;
      }
   }

   public void removeArc(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ARC$52, var1);
      }
   }

   public List getCurveList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1CurveList(this);
      }
   }

   public CTCurve[] getCurveArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(CURVE$54, var2);
         CTCurve[] var3 = new CTCurve[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTCurve getCurveArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCurve var3 = null;
         var3 = (CTCurve)this.get_store().find_element_user(CURVE$54, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfCurveArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CURVE$54);
      }
   }

   public void setCurveArray(CTCurve[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, CURVE$54);
      }
   }

   public void setCurveArray(int var1, CTCurve var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCurve var4 = null;
         var4 = (CTCurve)this.get_store().find_element_user(CURVE$54, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTCurve insertNewCurve(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCurve var3 = null;
         var3 = (CTCurve)this.get_store().insert_element_user(CURVE$54, var1);
         return var3;
      }
   }

   public CTCurve addNewCurve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCurve var2 = null;
         var2 = (CTCurve)this.get_store().add_element_user(CURVE$54);
         return var2;
      }
   }

   public void removeCurve(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CURVE$54, var1);
      }
   }

   public List getImageList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ImageList(this);
      }
   }

   public CTImage[] getImageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(IMAGE$56, var2);
         CTImage[] var3 = new CTImage[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTImage getImageArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImage var3 = null;
         var3 = (CTImage)this.get_store().find_element_user(IMAGE$56, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfImageArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IMAGE$56);
      }
   }

   public void setImageArray(CTImage[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, IMAGE$56);
      }
   }

   public void setImageArray(int var1, CTImage var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImage var4 = null;
         var4 = (CTImage)this.get_store().find_element_user(IMAGE$56, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTImage insertNewImage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImage var3 = null;
         var3 = (CTImage)this.get_store().insert_element_user(IMAGE$56, var1);
         return var3;
      }
   }

   public CTImage addNewImage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTImage var2 = null;
         var2 = (CTImage)this.get_store().add_element_user(IMAGE$56);
         return var2;
      }
   }

   public void removeImage(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IMAGE$56, var1);
      }
   }

   public List getLineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1LineList(this);
      }
   }

   public CTLine[] getLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(LINE$58, var2);
         CTLine[] var3 = new CTLine[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTLine getLineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine var3 = null;
         var3 = (CTLine)this.get_store().find_element_user(LINE$58, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfLineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINE$58);
      }
   }

   public void setLineArray(CTLine[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, LINE$58);
      }
   }

   public void setLineArray(int var1, CTLine var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine var4 = null;
         var4 = (CTLine)this.get_store().find_element_user(LINE$58, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTLine insertNewLine(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine var3 = null;
         var3 = (CTLine)this.get_store().insert_element_user(LINE$58, var1);
         return var3;
      }
   }

   public CTLine addNewLine() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLine var2 = null;
         var2 = (CTLine)this.get_store().add_element_user(LINE$58);
         return var2;
      }
   }

   public void removeLine(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINE$58, var1);
      }
   }

   public List getOvalList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1OvalList(this);
      }
   }

   public CTOval[] getOvalArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(OVAL$60, var2);
         CTOval[] var3 = new CTOval[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTOval getOvalArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOval var3 = null;
         var3 = (CTOval)this.get_store().find_element_user(OVAL$60, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfOvalArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(OVAL$60);
      }
   }

   public void setOvalArray(CTOval[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, OVAL$60);
      }
   }

   public void setOvalArray(int var1, CTOval var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOval var4 = null;
         var4 = (CTOval)this.get_store().find_element_user(OVAL$60, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTOval insertNewOval(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOval var3 = null;
         var3 = (CTOval)this.get_store().insert_element_user(OVAL$60, var1);
         return var3;
      }
   }

   public CTOval addNewOval() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOval var2 = null;
         var2 = (CTOval)this.get_store().add_element_user(OVAL$60);
         return var2;
      }
   }

   public void removeOval(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(OVAL$60, var1);
      }
   }

   public List getPolylineList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PolylineList(this);
      }
   }

   public CTPolyLine[] getPolylineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(POLYLINE$62, var2);
         CTPolyLine[] var3 = new CTPolyLine[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPolyLine getPolylineArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolyLine var3 = null;
         var3 = (CTPolyLine)this.get_store().find_element_user(POLYLINE$62, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPolylineArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(POLYLINE$62);
      }
   }

   public void setPolylineArray(CTPolyLine[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, POLYLINE$62);
      }
   }

   public void setPolylineArray(int var1, CTPolyLine var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolyLine var4 = null;
         var4 = (CTPolyLine)this.get_store().find_element_user(POLYLINE$62, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPolyLine insertNewPolyline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolyLine var3 = null;
         var3 = (CTPolyLine)this.get_store().insert_element_user(POLYLINE$62, var1);
         return var3;
      }
   }

   public CTPolyLine addNewPolyline() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPolyLine var2 = null;
         var2 = (CTPolyLine)this.get_store().add_element_user(POLYLINE$62);
         return var2;
      }
   }

   public void removePolyline(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(POLYLINE$62, var1);
      }
   }

   public List getRectList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RectList(this);
      }
   }

   public CTRect[] getRectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(RECT$64, var2);
         CTRect[] var3 = new CTRect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRect getRectArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRect var3 = null;
         var3 = (CTRect)this.get_store().find_element_user(RECT$64, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RECT$64);
      }
   }

   public void setRectArray(CTRect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, RECT$64);
      }
   }

   public void setRectArray(int var1, CTRect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRect var4 = null;
         var4 = (CTRect)this.get_store().find_element_user(RECT$64, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRect insertNewRect(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRect var3 = null;
         var3 = (CTRect)this.get_store().insert_element_user(RECT$64, var1);
         return var3;
      }
   }

   public CTRect addNewRect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRect var2 = null;
         var2 = (CTRect)this.get_store().add_element_user(RECT$64);
         return var2;
      }
   }

   public void removeRect(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RECT$64, var1);
      }
   }

   public List getRoundrectList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1RoundrectList(this);
      }
   }

   public CTRoundRect[] getRoundrectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ROUNDRECT$66, var2);
         CTRoundRect[] var3 = new CTRoundRect[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTRoundRect getRoundrectArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRoundRect var3 = null;
         var3 = (CTRoundRect)this.get_store().find_element_user(ROUNDRECT$66, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfRoundrectArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ROUNDRECT$66);
      }
   }

   public void setRoundrectArray(CTRoundRect[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ROUNDRECT$66);
      }
   }

   public void setRoundrectArray(int var1, CTRoundRect var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRoundRect var4 = null;
         var4 = (CTRoundRect)this.get_store().find_element_user(ROUNDRECT$66, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTRoundRect insertNewRoundrect(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRoundRect var3 = null;
         var3 = (CTRoundRect)this.get_store().insert_element_user(ROUNDRECT$66, var1);
         return var3;
      }
   }

   public CTRoundRect addNewRoundrect() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRoundRect var2 = null;
         var2 = (CTRoundRect)this.get_store().add_element_user(ROUNDRECT$66);
         return var2;
      }
   }

   public void removeRoundrect(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ROUNDRECT$66, var1);
      }
   }

   public List getDiagramList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1DiagramList(this);
      }
   }

   public CTDiagram[] getDiagramArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(DIAGRAM$68, var2);
         CTDiagram[] var3 = new CTDiagram[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTDiagram getDiagramArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDiagram var3 = null;
         var3 = (CTDiagram)this.get_store().find_element_user(DIAGRAM$68, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfDiagramArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DIAGRAM$68);
      }
   }

   public void setDiagramArray(CTDiagram[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, DIAGRAM$68);
      }
   }

   public void setDiagramArray(int var1, CTDiagram var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDiagram var4 = null;
         var4 = (CTDiagram)this.get_store().find_element_user(DIAGRAM$68, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTDiagram insertNewDiagram(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDiagram var3 = null;
         var3 = (CTDiagram)this.get_store().insert_element_user(DIAGRAM$68, var1);
         return var3;
      }
   }

   public CTDiagram addNewDiagram() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDiagram var2 = null;
         var2 = (CTDiagram)this.get_store().add_element_user(DIAGRAM$68);
         return var2;
      }
   }

   public void removeDiagram(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DIAGRAM$68, var1);
      }
   }

   public String getId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ID$70);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ID$70);
         return var2;
      }
   }

   public boolean isSetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ID$70) != null;
      }
   }

   public void setId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ID$70);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ID$70);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetId(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ID$70);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ID$70);
         }

         var3.set(var1);
      }
   }

   public void unsetId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ID$70);
      }
   }

   public String getStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STYLE$72);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(STYLE$72);
         return var2;
      }
   }

   public boolean isSetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STYLE$72) != null;
      }
   }

   public void setStyle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STYLE$72);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STYLE$72);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetStyle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(STYLE$72);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(STYLE$72);
         }

         var3.set(var1);
      }
   }

   public void unsetStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STYLE$72);
      }
   }

   public String getHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HREF$74);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(HREF$74);
         return var2;
      }
   }

   public boolean isSetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HREF$74) != null;
      }
   }

   public void setHref(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HREF$74);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HREF$74);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetHref(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(HREF$74);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(HREF$74);
         }

         var3.set(var1);
      }
   }

   public void unsetHref() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HREF$74);
      }
   }

   public String getTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TARGET$76);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TARGET$76);
         return var2;
      }
   }

   public boolean isSetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TARGET$76) != null;
      }
   }

   public void setTarget(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TARGET$76);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TARGET$76);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTarget(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TARGET$76);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TARGET$76);
         }

         var3.set(var1);
      }
   }

   public void unsetTarget() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TARGET$76);
      }
   }

   public String getClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CLASS1$78);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(CLASS1$78);
         return var2;
      }
   }

   public boolean isSetClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CLASS1$78) != null;
      }
   }

   public void setClass1(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CLASS1$78);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CLASS1$78);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetClass1(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(CLASS1$78);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(CLASS1$78);
         }

         var3.set(var1);
      }
   }

   public void unsetClass1() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CLASS1$78);
      }
   }

   public String getTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TITLE$80);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TITLE$80);
         return var2;
      }
   }

   public boolean isSetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TITLE$80) != null;
      }
   }

   public void setTitle(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TITLE$80);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TITLE$80);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTitle(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TITLE$80);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TITLE$80);
         }

         var3.set(var1);
      }
   }

   public void unsetTitle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TITLE$80);
      }
   }

   public String getAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALT$82);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(ALT$82);
         return var2;
      }
   }

   public boolean isSetAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALT$82) != null;
      }
   }

   public void setAlt(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALT$82);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALT$82);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlt(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(ALT$82);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(ALT$82);
         }

         var3.set(var1);
      }
   }

   public void unsetAlt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALT$82);
      }
   }

   public String getCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COORDSIZE$84);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(COORDSIZE$84);
         return var2;
      }
   }

   public boolean isSetCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COORDSIZE$84) != null;
      }
   }

   public void setCoordsize(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COORDSIZE$84);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COORDSIZE$84);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCoordsize(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(COORDSIZE$84);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(COORDSIZE$84);
         }

         var3.set(var1);
      }
   }

   public void unsetCoordsize() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COORDSIZE$84);
      }
   }

   public String getCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COORDORIGIN$86);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(COORDORIGIN$86);
         return var2;
      }
   }

   public boolean isSetCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COORDORIGIN$86) != null;
      }
   }

   public void setCoordorigin(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COORDORIGIN$86);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COORDORIGIN$86);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCoordorigin(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(COORDORIGIN$86);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(COORDORIGIN$86);
         }

         var3.set(var1);
      }
   }

   public void unsetCoordorigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COORDORIGIN$86);
      }
   }

   public String getWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WRAPCOORDS$88);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(WRAPCOORDS$88);
         return var2;
      }
   }

   public boolean isSetWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WRAPCOORDS$88) != null;
      }
   }

   public void setWrapcoords(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WRAPCOORDS$88);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WRAPCOORDS$88);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetWrapcoords(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(WRAPCOORDS$88);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(WRAPCOORDS$88);
         }

         var3.set(var1);
      }
   }

   public void unsetWrapcoords() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WRAPCOORDS$88);
      }
   }

   public STTrueFalse.Enum getPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRINT$90);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(PRINT$90);
         return var2;
      }
   }

   public boolean isSetPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRINT$90) != null;
      }
   }

   public void setPrint(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRINT$90);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRINT$90);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetPrint(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(PRINT$90);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(PRINT$90);
         }

         var3.set(var1);
      }
   }

   public void unsetPrint() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRINT$90);
      }
   }

   public String getSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SPID$92);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(SPID$92);
         return var2;
      }
   }

   public boolean isSetSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SPID$92) != null;
      }
   }

   public void setSpid(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SPID$92);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SPID$92);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSpid(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(SPID$92);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(SPID$92);
         }

         var3.set(var1);
      }
   }

   public void unsetSpid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SPID$92);
      }
   }

   public STTrueFalse$Enum getOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ONED$94);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ONED$94);
         return var2;
      }
   }

   public boolean isSetOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ONED$94) != null;
      }
   }

   public void setOned(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ONED$94);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ONED$94);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetOned(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ONED$94);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(ONED$94);
         }

         var3.set(var1);
      }
   }

   public void unsetOned() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ONED$94);
      }
   }

   public BigInteger getRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REGROUPID$96);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(REGROUPID$96);
         return var2;
      }
   }

   public boolean isSetRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REGROUPID$96) != null;
      }
   }

   public void setRegroupid(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REGROUPID$96);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REGROUPID$96);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetRegroupid(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(REGROUPID$96);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(REGROUPID$96);
         }

         var3.set(var1);
      }
   }

   public void unsetRegroupid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REGROUPID$96);
      }
   }

   public STTrueFalse$Enum getDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
         return var2;
      }
   }

   public boolean isSetDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$98) != null;
      }
   }

   public void setDoubleclicknotify(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DOUBLECLICKNOTIFY$98);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetDoubleclicknotify(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(DOUBLECLICKNOTIFY$98);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(DOUBLECLICKNOTIFY$98);
         }

         var3.set(var1);
      }
   }

   public void unsetDoubleclicknotify() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DOUBLECLICKNOTIFY$98);
      }
   }

   public STTrueFalse$Enum getButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BUTTON$100);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BUTTON$100);
         return var2;
      }
   }

   public boolean isSetButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BUTTON$100) != null;
      }
   }

   public void setButton(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BUTTON$100);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BUTTON$100);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetButton(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BUTTON$100);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(BUTTON$100);
         }

         var3.set(var1);
      }
   }

   public void unsetButton() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BUTTON$100);
      }
   }

   public STTrueFalse$Enum getUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USERHIDDEN$102);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERHIDDEN$102);
         return var2;
      }
   }

   public boolean isSetUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USERHIDDEN$102) != null;
      }
   }

   public void setUserhidden(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USERHIDDEN$102);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USERHIDDEN$102);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUserhidden(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERHIDDEN$102);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(USERHIDDEN$102);
         }

         var3.set(var1);
      }
   }

   public void unsetUserhidden() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USERHIDDEN$102);
      }
   }

   public STTrueFalse$Enum getBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BULLET$104);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BULLET$104);
         return var2;
      }
   }

   public boolean isSetBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BULLET$104) != null;
      }
   }

   public void setBullet(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BULLET$104);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BULLET$104);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetBullet(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(BULLET$104);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(BULLET$104);
         }

         var3.set(var1);
      }
   }

   public void unsetBullet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BULLET$104);
      }
   }

   public STTrueFalse$Enum getHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HR$106);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HR$106);
         return var2;
      }
   }

   public boolean isSetHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HR$106) != null;
      }
   }

   public void setHr(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HR$106);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HR$106);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHr(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HR$106);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(HR$106);
         }

         var3.set(var1);
      }
   }

   public void unsetHr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HR$106);
      }
   }

   public STTrueFalse$Enum getHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRSTD$108);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRSTD$108);
         return var2;
      }
   }

   public boolean isSetHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRSTD$108) != null;
      }
   }

   public void setHrstd(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRSTD$108);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRSTD$108);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHrstd(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRSTD$108);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(HRSTD$108);
         }

         var3.set(var1);
      }
   }

   public void unsetHrstd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRSTD$108);
      }
   }

   public STTrueFalse$Enum getHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRNOSHADE$110);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRNOSHADE$110);
         return var2;
      }
   }

   public boolean isSetHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRNOSHADE$110) != null;
      }
   }

   public void setHrnoshade(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRNOSHADE$110);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRNOSHADE$110);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHrnoshade(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(HRNOSHADE$110);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(HRNOSHADE$110);
         }

         var3.set(var1);
      }
   }

   public void unsetHrnoshade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRNOSHADE$110);
      }
   }

   public float getHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRPCT$112);
         return var2 == null?0.0F:var2.getFloatValue();
      }
   }

   public XmlFloat xgetHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var2 = null;
         var2 = (XmlFloat)this.get_store().find_attribute_user(HRPCT$112);
         return var2;
      }
   }

   public boolean isSetHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRPCT$112) != null;
      }
   }

   public void setHrpct(float var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRPCT$112);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRPCT$112);
         }

         var3.setFloatValue(var1);
      }
   }

   public void xsetHrpct(XmlFloat var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlFloat var3 = null;
         var3 = (XmlFloat)this.get_store().find_attribute_user(HRPCT$112);
         if(var3 == null) {
            var3 = (XmlFloat)this.get_store().add_attribute_user(HRPCT$112);
         }

         var3.set(var1);
      }
   }

   public void unsetHrpct() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRPCT$112);
      }
   }

   public STHrAlign$Enum getHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HRALIGN$114);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(HRALIGN$114);
         }

         return var2 == null?null:(STHrAlign$Enum)var2.getEnumValue();
      }
   }

   public STHrAlign xgetHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHrAlign var2 = null;
         var2 = (STHrAlign)this.get_store().find_attribute_user(HRALIGN$114);
         if(var2 == null) {
            var2 = (STHrAlign)this.get_default_attribute_value(HRALIGN$114);
         }

         return var2;
      }
   }

   public boolean isSetHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HRALIGN$114) != null;
      }
   }

   public void setHralign(STHrAlign$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HRALIGN$114);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HRALIGN$114);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetHralign(STHrAlign var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STHrAlign var3 = null;
         var3 = (STHrAlign)this.get_store().find_attribute_user(HRALIGN$114);
         if(var3 == null) {
            var3 = (STHrAlign)this.get_store().add_attribute_user(HRALIGN$114);
         }

         var3.set(var1);
      }
   }

   public void unsetHralign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HRALIGN$114);
      }
   }

   public STTrueFalse$Enum getAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWINCELL$116);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWINCELL$116);
         return var2;
      }
   }

   public boolean isSetAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLOWINCELL$116) != null;
      }
   }

   public void setAllowincell(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWINCELL$116);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWINCELL$116);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAllowincell(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWINCELL$116);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(ALLOWINCELL$116);
         }

         var3.set(var1);
      }
   }

   public void unsetAllowincell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLOWINCELL$116);
      }
   }

   public STTrueFalse$Enum getAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALLOWOVERLAP$118);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWOVERLAP$118);
         return var2;
      }
   }

   public boolean isSetAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALLOWOVERLAP$118) != null;
      }
   }

   public void setAllowoverlap(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALLOWOVERLAP$118);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALLOWOVERLAP$118);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetAllowoverlap(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(ALLOWOVERLAP$118);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(ALLOWOVERLAP$118);
         }

         var3.set(var1);
      }
   }

   public void unsetAllowoverlap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALLOWOVERLAP$118);
      }
   }

   public STTrueFalse$Enum getUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$120);
         return var2 == null?null:(STTrueFalse$Enum)var2.getEnumValue();
      }
   }

   public com.microsoft.schemas.office.office.STTrueFalse xgetUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var2 = null;
         var2 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERDRAWN$120);
         return var2;
      }
   }

   public boolean isSetUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USERDRAWN$120) != null;
      }
   }

   public void setUserdrawn(STTrueFalse$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$120);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USERDRAWN$120);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetUserdrawn(com.microsoft.schemas.office.office.STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         com.microsoft.schemas.office.office.STTrueFalse var3 = null;
         var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().find_attribute_user(USERDRAWN$120);
         if(var3 == null) {
            var3 = (com.microsoft.schemas.office.office.STTrueFalse)this.get_store().add_attribute_user(USERDRAWN$120);
         }

         var3.set(var1);
      }
   }

   public void unsetUserdrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USERDRAWN$120);
      }
   }

   public String getBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERTOPCOLOR$122);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERTOPCOLOR$122);
         return var2;
      }
   }

   public boolean isSetBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERTOPCOLOR$122) != null;
      }
   }

   public void setBordertopcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERTOPCOLOR$122);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERTOPCOLOR$122);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBordertopcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERTOPCOLOR$122);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERTOPCOLOR$122);
         }

         var3.set(var1);
      }
   }

   public void unsetBordertopcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERTOPCOLOR$122);
      }
   }

   public String getBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERLEFTCOLOR$124);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERLEFTCOLOR$124);
         return var2;
      }
   }

   public boolean isSetBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERLEFTCOLOR$124) != null;
      }
   }

   public void setBorderleftcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERLEFTCOLOR$124);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERLEFTCOLOR$124);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBorderleftcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERLEFTCOLOR$124);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERLEFTCOLOR$124);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderleftcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERLEFTCOLOR$124);
      }
   }

   public String getBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
         return var2;
      }
   }

   public boolean isSetBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$126) != null;
      }
   }

   public void setBorderbottomcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERBOTTOMCOLOR$126);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBorderbottomcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERBOTTOMCOLOR$126);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERBOTTOMCOLOR$126);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderbottomcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERBOTTOMCOLOR$126);
      }
   }

   public String getBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
         return var2;
      }
   }

   public boolean isSetBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BORDERRIGHTCOLOR$128) != null;
      }
   }

   public void setBorderrightcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(BORDERRIGHTCOLOR$128);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetBorderrightcolor(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(BORDERRIGHTCOLOR$128);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(BORDERRIGHTCOLOR$128);
         }

         var3.set(var1);
      }
   }

   public void unsetBorderrightcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BORDERRIGHTCOLOR$128);
      }
   }

   public BigInteger getDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUT$130);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUT$130);
         return var2;
      }
   }

   public boolean isSetDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DGMLAYOUT$130) != null;
      }
   }

   public void setDgmlayout(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUT$130);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DGMLAYOUT$130);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDgmlayout(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUT$130);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(DGMLAYOUT$130);
         }

         var3.set(var1);
      }
   }

   public void unsetDgmlayout() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DGMLAYOUT$130);
      }
   }

   public BigInteger getDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DGMNODEKIND$132);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(DGMNODEKIND$132);
         return var2;
      }
   }

   public boolean isSetDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DGMNODEKIND$132) != null;
      }
   }

   public void setDgmnodekind(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DGMNODEKIND$132);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DGMNODEKIND$132);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDgmnodekind(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(DGMNODEKIND$132);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(DGMNODEKIND$132);
         }

         var3.set(var1);
      }
   }

   public void unsetDgmnodekind() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DGMNODEKIND$132);
      }
   }

   public BigInteger getDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUTMRU$134);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public XmlInteger xgetDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var2 = null;
         var2 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUTMRU$134);
         return var2;
      }
   }

   public boolean isSetDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DGMLAYOUTMRU$134) != null;
      }
   }

   public void setDgmlayoutmru(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DGMLAYOUTMRU$134);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DGMLAYOUTMRU$134);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetDgmlayoutmru(XmlInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInteger var3 = null;
         var3 = (XmlInteger)this.get_store().find_attribute_user(DGMLAYOUTMRU$134);
         if(var3 == null) {
            var3 = (XmlInteger)this.get_store().add_attribute_user(DGMLAYOUTMRU$134);
         }

         var3.set(var1);
      }
   }

   public void unsetDgmlayoutmru() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DGMLAYOUTMRU$134);
      }
   }

   public STInsetMode.Enum getInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(INSETMODE$136);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(INSETMODE$136);
         }

         return var2 == null?null:(STInsetMode.Enum)var2.getEnumValue();
      }
   }

   public STInsetMode xgetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STInsetMode var2 = null;
         var2 = (STInsetMode)this.get_store().find_attribute_user(INSETMODE$136);
         if(var2 == null) {
            var2 = (STInsetMode)this.get_default_attribute_value(INSETMODE$136);
         }

         return var2;
      }
   }

   public boolean isSetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(INSETMODE$136) != null;
      }
   }

   public void setInsetmode(STInsetMode.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(INSETMODE$136);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(INSETMODE$136);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetInsetmode(STInsetMode var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STInsetMode var3 = null;
         var3 = (STInsetMode)this.get_store().find_attribute_user(INSETMODE$136);
         if(var3 == null) {
            var3 = (STInsetMode)this.get_store().add_attribute_user(INSETMODE$136);
         }

         var3.set(var1);
      }
   }

   public void unsetInsetmode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(INSETMODE$136);
      }
   }

   public STTrueFalse.Enum getFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLED$138);
         return var2 == null?null:(STTrueFalse.Enum)var2.getEnumValue();
      }
   }

   public STTrueFalse xgetFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var2 = null;
         var2 = (STTrueFalse)this.get_store().find_attribute_user(FILLED$138);
         return var2;
      }
   }

   public boolean isSetFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLED$138) != null;
      }
   }

   public void setFilled(STTrueFalse.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILLED$138);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILLED$138);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFilled(STTrueFalse var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STTrueFalse var3 = null;
         var3 = (STTrueFalse)this.get_store().find_attribute_user(FILLED$138);
         if(var3 == null) {
            var3 = (STTrueFalse)this.get_store().add_attribute_user(FILLED$138);
         }

         var3.set(var1);
      }
   }

   public void unsetFilled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLED$138);
      }
   }

   public String getFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FILLCOLOR$140);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STColorType xgetFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var2 = null;
         var2 = (STColorType)this.get_store().find_attribute_user(FILLCOLOR$140);
         return var2;
      }
   }

   public boolean isSetFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FILLCOLOR$140) != null;
      }
   }

   public void setFillcolor(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FILLCOLOR$140);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FILLCOLOR$140);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetFillcolor(STColorType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STColorType var3 = null;
         var3 = (STColorType)this.get_store().find_attribute_user(FILLCOLOR$140);
         if(var3 == null) {
            var3 = (STColorType)this.get_store().add_attribute_user(FILLCOLOR$140);
         }

         var3.set(var1);
      }
   }

   public void unsetFillcolor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FILLCOLOR$140);
      }
   }

   public STEditAs$Enum getEditas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EDITAS$142);
         return var2 == null?null:(STEditAs$Enum)var2.getEnumValue();
      }
   }

   public STEditAs xgetEditas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STEditAs var2 = null;
         var2 = (STEditAs)this.get_store().find_attribute_user(EDITAS$142);
         return var2;
      }
   }

   public boolean isSetEditas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EDITAS$142) != null;
      }
   }

   public void setEditas(STEditAs$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EDITAS$142);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EDITAS$142);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEditas(STEditAs var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STEditAs var3 = null;
         var3 = (STEditAs)this.get_store().find_attribute_user(EDITAS$142);
         if(var3 == null) {
            var3 = (STEditAs)this.get_store().add_attribute_user(EDITAS$142);
         }

         var3.set(var1);
      }
   }

   public void unsetEditas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EDITAS$142);
      }
   }

   public String getTableproperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TABLEPROPERTIES$144);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTableproperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TABLEPROPERTIES$144);
         return var2;
      }
   }

   public boolean isSetTableproperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TABLEPROPERTIES$144) != null;
      }
   }

   public void setTableproperties(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TABLEPROPERTIES$144);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TABLEPROPERTIES$144);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTableproperties(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TABLEPROPERTIES$144);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TABLEPROPERTIES$144);
         }

         var3.set(var1);
      }
   }

   public void unsetTableproperties() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TABLEPROPERTIES$144);
      }
   }

   public String getTablelimits() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TABLELIMITS$146);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetTablelimits() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(TABLELIMITS$146);
         return var2;
      }
   }

   public boolean isSetTablelimits() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TABLELIMITS$146) != null;
      }
   }

   public void setTablelimits(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TABLELIMITS$146);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TABLELIMITS$146);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTablelimits(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(TABLELIMITS$146);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(TABLELIMITS$146);
         }

         var3.set(var1);
      }
   }

   public void unsetTablelimits() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TABLELIMITS$146);
      }
   }

}
