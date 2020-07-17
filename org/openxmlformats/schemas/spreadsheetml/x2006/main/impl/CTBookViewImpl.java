package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBookView;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STVisibility$Enum;

public class CTBookViewImpl extends XmlComplexContentImpl implements CTBookView {

   private static final QName EXTLST$0 = new QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
   private static final QName VISIBILITY$2 = new QName("", "visibility");
   private static final QName MINIMIZED$4 = new QName("", "minimized");
   private static final QName SHOWHORIZONTALSCROLL$6 = new QName("", "showHorizontalScroll");
   private static final QName SHOWVERTICALSCROLL$8 = new QName("", "showVerticalScroll");
   private static final QName SHOWSHEETTABS$10 = new QName("", "showSheetTabs");
   private static final QName XWINDOW$12 = new QName("", "xWindow");
   private static final QName YWINDOW$14 = new QName("", "yWindow");
   private static final QName WINDOWWIDTH$16 = new QName("", "windowWidth");
   private static final QName WINDOWHEIGHT$18 = new QName("", "windowHeight");
   private static final QName TABRATIO$20 = new QName("", "tabRatio");
   private static final QName FIRSTSHEET$22 = new QName("", "firstSheet");
   private static final QName ACTIVETAB$24 = new QName("", "activeTab");
   private static final QName AUTOFILTERDATEGROUPING$26 = new QName("", "autoFilterDateGrouping");


   public CTBookViewImpl(SchemaType var1) {
      super(var1);
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$0) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$0, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$0);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$0, 0);
      }
   }

   public STVisibility$Enum getVisibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(VISIBILITY$2);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(VISIBILITY$2);
         }

         return var2 == null?null:(STVisibility$Enum)var2.getEnumValue();
      }
   }

   public STVisibility xgetVisibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVisibility var2 = null;
         var2 = (STVisibility)this.get_store().find_attribute_user(VISIBILITY$2);
         if(var2 == null) {
            var2 = (STVisibility)this.get_default_attribute_value(VISIBILITY$2);
         }

         return var2;
      }
   }

   public boolean isSetVisibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(VISIBILITY$2) != null;
      }
   }

   public void setVisibility(STVisibility$Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(VISIBILITY$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(VISIBILITY$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetVisibility(STVisibility var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVisibility var3 = null;
         var3 = (STVisibility)this.get_store().find_attribute_user(VISIBILITY$2);
         if(var3 == null) {
            var3 = (STVisibility)this.get_store().add_attribute_user(VISIBILITY$2);
         }

         var3.set(var1);
      }
   }

   public void unsetVisibility() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(VISIBILITY$2);
      }
   }

   public boolean getMinimized() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MINIMIZED$4);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MINIMIZED$4);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetMinimized() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(MINIMIZED$4);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(MINIMIZED$4);
         }

         return var2;
      }
   }

   public boolean isSetMinimized() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MINIMIZED$4) != null;
      }
   }

   public void setMinimized(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MINIMIZED$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MINIMIZED$4);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetMinimized(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(MINIMIZED$4);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(MINIMIZED$4);
         }

         var3.set(var1);
      }
   }

   public void unsetMinimized() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MINIMIZED$4);
      }
   }

   public boolean getShowHorizontalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWHORIZONTALSCROLL$6);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowHorizontalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWHORIZONTALSCROLL$6);
         }

         return var2;
      }
   }

   public boolean isSetShowHorizontalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6) != null;
      }
   }

   public void setShowHorizontalScroll(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWHORIZONTALSCROLL$6);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowHorizontalScroll(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWHORIZONTALSCROLL$6);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWHORIZONTALSCROLL$6);
         }

         var3.set(var1);
      }
   }

   public void unsetShowHorizontalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWHORIZONTALSCROLL$6);
      }
   }

   public boolean getShowVerticalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWVERTICALSCROLL$8);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowVerticalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWVERTICALSCROLL$8);
         }

         return var2;
      }
   }

   public boolean isSetShowVerticalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWVERTICALSCROLL$8) != null;
      }
   }

   public void setShowVerticalScroll(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWVERTICALSCROLL$8);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowVerticalScroll(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWVERTICALSCROLL$8);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWVERTICALSCROLL$8);
         }

         var3.set(var1);
      }
   }

   public void unsetShowVerticalScroll() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWVERTICALSCROLL$8);
      }
   }

   public boolean getShowSheetTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWSHEETTABS$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWSHEETTABS$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowSheetTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWSHEETTABS$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWSHEETTABS$10);
         }

         return var2;
      }
   }

   public boolean isSetShowSheetTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWSHEETTABS$10) != null;
      }
   }

   public void setShowSheetTabs(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWSHEETTABS$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWSHEETTABS$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowSheetTabs(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWSHEETTABS$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWSHEETTABS$10);
         }

         var3.set(var1);
      }
   }

   public void unsetShowSheetTabs() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWSHEETTABS$10);
      }
   }

   public int getXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(XWINDOW$12);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(XWINDOW$12);
         return var2;
      }
   }

   public boolean isSetXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(XWINDOW$12) != null;
      }
   }

   public void setXWindow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(XWINDOW$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(XWINDOW$12);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetXWindow(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(XWINDOW$12);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(XWINDOW$12);
         }

         var3.set(var1);
      }
   }

   public void unsetXWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(XWINDOW$12);
      }
   }

   public int getYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(YWINDOW$14);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(YWINDOW$14);
         return var2;
      }
   }

   public boolean isSetYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(YWINDOW$14) != null;
      }
   }

   public void setYWindow(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(YWINDOW$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(YWINDOW$14);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetYWindow(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(YWINDOW$14);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(YWINDOW$14);
         }

         var3.set(var1);
      }
   }

   public void unsetYWindow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(YWINDOW$14);
      }
   }

   public long getWindowWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WINDOWWIDTH$16);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetWindowWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(WINDOWWIDTH$16);
         return var2;
      }
   }

   public boolean isSetWindowWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WINDOWWIDTH$16) != null;
      }
   }

   public void setWindowWidth(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(WINDOWWIDTH$16);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(WINDOWWIDTH$16);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetWindowWidth(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(WINDOWWIDTH$16);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(WINDOWWIDTH$16);
         }

         var3.set(var1);
      }
   }

   public void unsetWindowWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WINDOWWIDTH$16);
      }
   }

   public long getWindowHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(WINDOWHEIGHT$18);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetWindowHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(WINDOWHEIGHT$18);
         return var2;
      }
   }

   public boolean isSetWindowHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(WINDOWHEIGHT$18) != null;
      }
   }

   public void setWindowHeight(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(WINDOWHEIGHT$18);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(WINDOWHEIGHT$18);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetWindowHeight(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(WINDOWHEIGHT$18);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(WINDOWHEIGHT$18);
         }

         var3.set(var1);
      }
   }

   public void unsetWindowHeight() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(WINDOWHEIGHT$18);
      }
   }

   public long getTabRatio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TABRATIO$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TABRATIO$20);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetTabRatio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(TABRATIO$20);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(TABRATIO$20);
         }

         return var2;
      }
   }

   public boolean isSetTabRatio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TABRATIO$20) != null;
      }
   }

   public void setTabRatio(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TABRATIO$20);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TABRATIO$20);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTabRatio(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(TABRATIO$20);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(TABRATIO$20);
         }

         var3.set(var1);
      }
   }

   public void unsetTabRatio() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TABRATIO$20);
      }
   }

   public long getFirstSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTSHEET$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIRSTSHEET$22);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetFirstSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTSHEET$22);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(FIRSTSHEET$22);
         }

         return var2;
      }
   }

   public boolean isSetFirstSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTSHEET$22) != null;
      }
   }

   public void setFirstSheet(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(FIRSTSHEET$22);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(FIRSTSHEET$22);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetFirstSheet(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(FIRSTSHEET$22);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(FIRSTSHEET$22);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstSheet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTSHEET$22);
      }
   }

   public long getActiveTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ACTIVETAB$24);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ACTIVETAB$24);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetActiveTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(ACTIVETAB$24);
         if(var2 == null) {
            var2 = (XmlUnsignedInt)this.get_default_attribute_value(ACTIVETAB$24);
         }

         return var2;
      }
   }

   public boolean isSetActiveTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ACTIVETAB$24) != null;
      }
   }

   public void setActiveTab(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(ACTIVETAB$24);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(ACTIVETAB$24);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetActiveTab(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(ACTIVETAB$24);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(ACTIVETAB$24);
         }

         var3.set(var1);
      }
   }

   public void unsetActiveTab() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ACTIVETAB$24);
      }
   }

   public boolean getAutoFilterDateGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AUTOFILTERDATEGROUPING$26);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoFilterDateGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AUTOFILTERDATEGROUPING$26);
         }

         return var2;
      }
   }

   public boolean isSetAutoFilterDateGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26) != null;
      }
   }

   public void setAutoFilterDateGrouping(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOFILTERDATEGROUPING$26);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoFilterDateGrouping(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOFILTERDATEGROUPING$26);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOFILTERDATEGROUPING$26);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoFilterDateGrouping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOFILTERDATEGROUPING$26);
      }
   }

}
