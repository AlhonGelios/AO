package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPane;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotSelection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSelection;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSheetView;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellRef;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSheetViewType$Enum;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSheetViewImpl.1PivotSelectionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.CTSheetViewImpl.1SelectionList;

public class CTSheetViewImpl extends XmlComplexContentImpl implements CTSheetView {

   private static final QName PANE$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pane");
   private static final QName SELECTION$2 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "selection");
   private static final QName PIVOTSELECTION$4 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotSelection");
   private static final QName EXTLST$6 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName WINDOWPROTECTION$8 = new QName("", "windowProtection");
   private static final QName SHOWFORMULAS$10 = new QName("", "showFormulas");
   private static final QName SHOWGRIDLINES$12 = new QName("", "showGridLines");
   private static final QName SHOWROWCOLHEADERS$14 = new QName("", "showRowColHeaders");
   private static final QName SHOWZEROS$16 = new QName("", "showZeros");
   private static final QName RIGHTTOLEFT$18 = new QName("", "rightToLeft");
   private static final QName TABSELECTED$20 = new QName("", "tabSelected");
   private static final QName SHOWRULER$22 = new QName("", "showRuler");
   private static final QName SHOWOUTLINESYMBOLS$24 = new QName("", "showOutlineSymbols");
   private static final QName DEFAULTGRIDCOLOR$26 = new QName("", "defaultGridColor");
   private static final QName SHOWWHITESPACE$28 = new QName("", "showWhiteSpace");
   private static final QName VIEW$30 = new QName("", "view");
   private static final QName TOPLEFTCELL$32 = new QName("", "topLeftCell");
   private static final QName COLORID$34 = new QName("", "colorId");
   private static final QName ZOOMSCALE$36 = new QName("", "zoomScale");
   private static final QName ZOOMSCALENORMAL$38 = new QName("", "zoomScaleNormal");
   private static final QName ZOOMSCALESHEETLAYOUTVIEW$40 = new QName("", "zoomScaleSheetLayoutView");
   private static final QName ZOOMSCALEPAGELAYOUTVIEW$42 = new QName("", "zoomScalePageLayoutView");
   private static final QName WORKBOOKVIEWID$44 = new QName("", "workbookViewId");


   public CTSheetViewImpl(SchemaType var1) {
      super(var1);
   }

   public CTPane getPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPane var2 = null;
         var2 = (CTPane)this.get_store().find_element_user(PANE$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PANE$0) != 0;
      }
   }

   public void setPane(CTPane var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPane var3 = null;
         var3 = (CTPane)this.get_store().find_element_user(PANE$0, 0);
         if(var3 == null) {
            var3 = (CTPane)this.get_store().add_element_user(PANE$0);
         }

         var3.set(var1);
      }
   }

   public CTPane addNewPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPane var2 = null;
         var2 = (CTPane)this.get_store().add_element_user(PANE$0);
         return var2;
      }
   }

   public void unsetPane() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PANE$0, 0);
      }
   }

   public List getSelectionList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SelectionList(this);
      }
   }

   public CTSelection[] getSelectionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SELECTION$2, var2);
         CTSelection[] var3 = new CTSelection[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSelection getSelectionArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSelection var3 = null;
         var3 = (CTSelection)this.get_store().find_element_user(SELECTION$2, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSelectionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SELECTION$2);
      }
   }

   public void setSelectionArray(CTSelection[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SELECTION$2);
      }
   }

   public void setSelectionArray(int var1, CTSelection var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSelection var4 = null;
         var4 = (CTSelection)this.get_store().find_element_user(SELECTION$2, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSelection insertNewSelection(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSelection var3 = null;
         var3 = (CTSelection)this.get_store().insert_element_user(SELECTION$2, var1);
         return var3;
      }
   }

   public CTSelection addNewSelection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSelection var2 = null;
         var2 = (CTSelection)this.get_store().add_element_user(SELECTION$2);
         return var2;
      }
   }

   public void removeSelection(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SELECTION$2, var1);
      }
   }

   public List getPivotSelectionList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1PivotSelectionList(this);
      }
   }

   public CTPivotSelection[] getPivotSelectionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(PIVOTSELECTION$4, var2);
         CTPivotSelection[] var3 = new CTPivotSelection[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTPivotSelection getPivotSelectionArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSelection var3 = null;
         var3 = (CTPivotSelection)this.get_store().find_element_user(PIVOTSELECTION$4, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfPivotSelectionArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PIVOTSELECTION$4);
      }
   }

   public void setPivotSelectionArray(CTPivotSelection[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, PIVOTSELECTION$4);
      }
   }

   public void setPivotSelectionArray(int var1, CTPivotSelection var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSelection var4 = null;
         var4 = (CTPivotSelection)this.get_store().find_element_user(PIVOTSELECTION$4, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTPivotSelection insertNewPivotSelection(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSelection var3 = null;
         var3 = (CTPivotSelection)this.get_store().insert_element_user(PIVOTSELECTION$4, var1);
         return var3;
      }
   }

   public CTPivotSelection addNewPivotSelection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPivotSelection var2 = null;
         var2 = (CTPivotSelection)this.get_store().add_element_user(PIVOTSELECTION$4);
         return var2;
      }
   }

   public void removePivotSelection(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PIVOTSELECTION$4, var1);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$6) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$6, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$6);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$6, 0);
      }
   }

   public boolean getWindowProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WINDOWPROTECTION$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(WINDOWPROTECTION$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetWindowProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(WINDOWPROTECTION$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(WINDOWPROTECTION$8);
         }

         return var2;
      }
   }

   public boolean isSetWindowProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WINDOWPROTECTION$8) != null;
      }
   }

   public void setWindowProtection(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(WINDOWPROTECTION$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(WINDOWPROTECTION$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetWindowProtection(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(WINDOWPROTECTION$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(WINDOWPROTECTION$8);
         }

         var3.set(var1);
      }
   }

   public void unsetWindowProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WINDOWPROTECTION$8);
      }
   }

   public boolean getShowFormulas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWFORMULAS$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWFORMULAS$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowFormulas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWFORMULAS$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWFORMULAS$10);
         }

         return var2;
      }
   }

   public boolean isSetShowFormulas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWFORMULAS$10) != null;
      }
   }

   public void setShowFormulas(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWFORMULAS$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWFORMULAS$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowFormulas(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWFORMULAS$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWFORMULAS$10);
         }

         var3.set(var1);
      }
   }

   public void unsetShowFormulas() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWFORMULAS$10);
      }
   }

   public boolean getShowGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWGRIDLINES$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWGRIDLINES$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWGRIDLINES$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWGRIDLINES$12);
         }

         return var2;
      }
   }

   public boolean isSetShowGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWGRIDLINES$12) != null;
      }
   }

   public void setShowGridLines(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWGRIDLINES$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWGRIDLINES$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowGridLines(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWGRIDLINES$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWGRIDLINES$12);
         }

         var3.set(var1);
      }
   }

   public void unsetShowGridLines() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWGRIDLINES$12);
      }
   }

   public boolean getShowRowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWROWCOLHEADERS$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowRowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWROWCOLHEADERS$14);
         }

         return var2;
      }
   }

   public boolean isSetShowRowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWROWCOLHEADERS$14) != null;
      }
   }

   public void setShowRowColHeaders(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWROWCOLHEADERS$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowRowColHeaders(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWROWCOLHEADERS$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWROWCOLHEADERS$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShowRowColHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWROWCOLHEADERS$14);
      }
   }

   public boolean getShowZeros() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWZEROS$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWZEROS$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowZeros() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWZEROS$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWZEROS$16);
         }

         return var2;
      }
   }

   public boolean isSetShowZeros() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWZEROS$16) != null;
      }
   }

   public void setShowZeros(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWZEROS$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWZEROS$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowZeros(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWZEROS$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWZEROS$16);
         }

         var3.set(var1);
      }
   }

   public void unsetShowZeros() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWZEROS$16);
      }
   }

   public boolean getRightToLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RIGHTTOLEFT$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(RIGHTTOLEFT$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRightToLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(RIGHTTOLEFT$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(RIGHTTOLEFT$18);
         }

         return var2;
      }
   }

   public boolean isSetRightToLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RIGHTTOLEFT$18) != null;
      }
   }

   public void setRightToLeft(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RIGHTTOLEFT$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RIGHTTOLEFT$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRightToLeft(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(RIGHTTOLEFT$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(RIGHTTOLEFT$18);
         }

         var3.set(var1);
      }
   }

   public void unsetRightToLeft() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RIGHTTOLEFT$18);
      }
   }

   public boolean getTabSelected() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TABSELECTED$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TABSELECTED$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetTabSelected() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(TABSELECTED$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(TABSELECTED$20);
         }

         return var2;
      }
   }

   public boolean isSetTabSelected() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TABSELECTED$20) != null;
      }
   }

   public void setTabSelected(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TABSELECTED$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TABSELECTED$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetTabSelected(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(TABSELECTED$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(TABSELECTED$20);
         }

         var3.set(var1);
      }
   }

   public void unsetTabSelected() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TABSELECTED$20);
      }
   }

   public boolean getShowRuler() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWRULER$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWRULER$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowRuler() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWRULER$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWRULER$22);
         }

         return var2;
      }
   }

   public boolean isSetShowRuler() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWRULER$22) != null;
      }
   }

   public void setShowRuler(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWRULER$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWRULER$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowRuler(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWRULER$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWRULER$22);
         }

         var3.set(var1);
      }
   }

   public void unsetShowRuler() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWRULER$22);
      }
   }

   public boolean getShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWOUTLINESYMBOLS$24);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWOUTLINESYMBOLS$24);
         }

         return var2;
      }
   }

   public boolean isSetShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24) != null;
      }
   }

   public void setShowOutlineSymbols(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWOUTLINESYMBOLS$24);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowOutlineSymbols(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWOUTLINESYMBOLS$24);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWOUTLINESYMBOLS$24);
         }

         var3.set(var1);
      }
   }

   public void unsetShowOutlineSymbols() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWOUTLINESYMBOLS$24);
      }
   }

   public boolean getDefaultGridColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(DEFAULTGRIDCOLOR$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetDefaultGridColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(DEFAULTGRIDCOLOR$26);
         }

         return var2;
      }
   }

   public boolean isSetDefaultGridColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTGRIDCOLOR$26) != null;
      }
   }

   public void setDefaultGridColor(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTGRIDCOLOR$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetDefaultGridColor(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(DEFAULTGRIDCOLOR$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(DEFAULTGRIDCOLOR$26);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultGridColor() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTGRIDCOLOR$26);
      }
   }

   public boolean getShowWhiteSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWWHITESPACE$28);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWWHITESPACE$28);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowWhiteSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWWHITESPACE$28);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWWHITESPACE$28);
         }

         return var2;
      }
   }

   public boolean isSetShowWhiteSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWWHITESPACE$28) != null;
      }
   }

   public void setShowWhiteSpace(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWWHITESPACE$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWWHITESPACE$28);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowWhiteSpace(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWWHITESPACE$28);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWWHITESPACE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetShowWhiteSpace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWWHITESPACE$28);
      }
   }

   public STSheetViewType$Enum getView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VIEW$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VIEW$30);
         }

         return var2 == null?null:(STSheetViewType$Enum)var2.getEnumValue();
      }
   }

   public STSheetViewType xgetView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSheetViewType var2 = null;
         var2 = (STSheetViewType)this.get_store().find_attribute_user(VIEW$30);
         if(var2 == null) {
            var2 = (STSheetViewType)this.get_default_attribute_value(VIEW$30);
         }

         return var2;
      }
   }

   public boolean isSetView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VIEW$30) != null;
      }
   }

   public void setView(STSheetViewType$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VIEW$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VIEW$30);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetView(STSheetViewType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSheetViewType var3 = null;
         var3 = (STSheetViewType)this.get_store().find_attribute_user(VIEW$30);
         if(var3 == null) {
            var3 = (STSheetViewType)this.get_store().add_attribute_user(VIEW$30);
         }

         var3.set(var1);
      }
   }

   public void unsetView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VIEW$30);
      }
   }

   public String getTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOPLEFTCELL$32);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STCellRef xgetTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var2 = null;
         var2 = (STCellRef)this.get_store().find_attribute_user(TOPLEFTCELL$32);
         return var2;
      }
   }

   public boolean isSetTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOPLEFTCELL$32) != null;
      }
   }

   public void setTopLeftCell(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TOPLEFTCELL$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TOPLEFTCELL$32);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetTopLeftCell(STCellRef var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCellRef var3 = null;
         var3 = (STCellRef)this.get_store().find_attribute_user(TOPLEFTCELL$32);
         if(var3 == null) {
            var3 = (STCellRef)this.get_store().add_attribute_user(TOPLEFTCELL$32);
         }

         var3.set(var1);
      }
   }

   public void unsetTopLeftCell() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOPLEFTCELL$32);
      }
   }

   public long getColorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COLORID$34);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COLORID$34);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetColorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(COLORID$34);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(COLORID$34);
         }

         return var2;
      }
   }

   public boolean isSetColorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COLORID$34) != null;
      }
   }

   public void setColorId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(COLORID$34);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(COLORID$34);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetColorId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(COLORID$34);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(COLORID$34);
         }

         var3.set(var1);
      }
   }

   public void unsetColorId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COLORID$34);
      }
   }

   public long getZoomScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALE$36);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ZOOMSCALE$36);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetZoomScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALE$36);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ZOOMSCALE$36);
         }

         return var2;
      }
   }

   public boolean isSetZoomScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ZOOMSCALE$36) != null;
      }
   }

   public void setZoomScale(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALE$36);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ZOOMSCALE$36);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetZoomScale(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALE$36);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ZOOMSCALE$36);
         }

         var3.set(var1);
      }
   }

   public void unsetZoomScale() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ZOOMSCALE$36);
      }
   }

   public long getZoomScaleNormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALENORMAL$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ZOOMSCALENORMAL$38);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetZoomScaleNormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALENORMAL$38);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ZOOMSCALENORMAL$38);
         }

         return var2;
      }
   }

   public boolean isSetZoomScaleNormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ZOOMSCALENORMAL$38) != null;
      }
   }

   public void setZoomScaleNormal(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALENORMAL$38);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ZOOMSCALENORMAL$38);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetZoomScaleNormal(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALENORMAL$38);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ZOOMSCALENORMAL$38);
         }

         var3.set(var1);
      }
   }

   public void unsetZoomScaleNormal() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ZOOMSCALENORMAL$38);
      }
   }

   public long getZoomScaleSheetLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ZOOMSCALESHEETLAYOUTVIEW$40);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetZoomScaleSheetLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ZOOMSCALESHEETLAYOUTVIEW$40);
         }

         return var2;
      }
   }

   public boolean isSetZoomScaleSheetLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40) != null;
      }
   }

   public void setZoomScaleSheetLayoutView(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetZoomScaleSheetLayoutView(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ZOOMSCALESHEETLAYOUTVIEW$40);
         }

         var3.set(var1);
      }
   }

   public void unsetZoomScaleSheetLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ZOOMSCALESHEETLAYOUTVIEW$40);
      }
   }

   public long getZoomScalePageLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ZOOMSCALEPAGELAYOUTVIEW$42);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetZoomScalePageLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ZOOMSCALEPAGELAYOUTVIEW$42);
         }

         return var2;
      }
   }

   public boolean isSetZoomScalePageLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42) != null;
      }
   }

   public void setZoomScalePageLayoutView(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetZoomScalePageLayoutView(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ZOOMSCALEPAGELAYOUTVIEW$42);
         }

         var3.set(var1);
      }
   }

   public void unsetZoomScalePageLayoutView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ZOOMSCALEPAGELAYOUTVIEW$42);
      }
   }

   public long getWorkbookViewId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WORKBOOKVIEWID$44);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetWorkbookViewId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(WORKBOOKVIEWID$44);
         return var2;
      }
   }

   public void setWorkbookViewId(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(WORKBOOKVIEWID$44);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(WORKBOOKVIEWID$44);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetWorkbookViewId(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(WORKBOOKVIEWID$44);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(WORKBOOKVIEWID$44);
         }

         var3.set(var1);
      }
   }

}
