package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition;

public class CTSlideImpl extends XmlComplexContentImpl implements CTSlide {

   private static final QName CSLD$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
   private static final QName CLRMAPOVR$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMapOvr");
   private static final QName TRANSITION$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "transition");
   private static final QName TIMING$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "timing");
   private static final QName EXTLST$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName SHOWMASTERSP$10 = new QName("", "showMasterSp");
   private static final QName SHOWMASTERPHANIM$12 = new QName("", "showMasterPhAnim");
   private static final QName SHOW$14 = new QName("", "show");


   public CTSlideImpl(SchemaType var1) {
      super(var1);
   }

   public CTCommonSlideData getCSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommonSlideData var2 = null;
         var2 = (CTCommonSlideData)this.get_store().find_element_user(CSLD$0, 0);
         return var2 == null?null:var2;
      }
   }

   public void setCSld(CTCommonSlideData var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommonSlideData var3 = null;
         var3 = (CTCommonSlideData)this.get_store().find_element_user(CSLD$0, 0);
         if(var3 == null) {
            var3 = (CTCommonSlideData)this.get_store().add_element_user(CSLD$0);
         }

         var3.set(var1);
      }
   }

   public CTCommonSlideData addNewCSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCommonSlideData var2 = null;
         var2 = (CTCommonSlideData)this.get_store().add_element_user(CSLD$0);
         return var2;
      }
   }

   public CTColorMappingOverride getClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMappingOverride var2 = null;
         var2 = (CTColorMappingOverride)this.get_store().find_element_user(CLRMAPOVR$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLRMAPOVR$2) != 0;
      }
   }

   public void setClrMapOvr(CTColorMappingOverride var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMappingOverride var3 = null;
         var3 = (CTColorMappingOverride)this.get_store().find_element_user(CLRMAPOVR$2, 0);
         if(var3 == null) {
            var3 = (CTColorMappingOverride)this.get_store().add_element_user(CLRMAPOVR$2);
         }

         var3.set(var1);
      }
   }

   public CTColorMappingOverride addNewClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMappingOverride var2 = null;
         var2 = (CTColorMappingOverride)this.get_store().add_element_user(CLRMAPOVR$2);
         return var2;
      }
   }

   public void unsetClrMapOvr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLRMAPOVR$2, 0);
      }
   }

   public CTSlideTransition getTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTransition var2 = null;
         var2 = (CTSlideTransition)this.get_store().find_element_user(TRANSITION$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRANSITION$4) != 0;
      }
   }

   public void setTransition(CTSlideTransition var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTransition var3 = null;
         var3 = (CTSlideTransition)this.get_store().find_element_user(TRANSITION$4, 0);
         if(var3 == null) {
            var3 = (CTSlideTransition)this.get_store().add_element_user(TRANSITION$4);
         }

         var3.set(var1);
      }
   }

   public CTSlideTransition addNewTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTransition var2 = null;
         var2 = (CTSlideTransition)this.get_store().add_element_user(TRANSITION$4);
         return var2;
      }
   }

   public void unsetTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRANSITION$4, 0);
      }
   }

   public CTSlideTiming getTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTiming var2 = null;
         var2 = (CTSlideTiming)this.get_store().find_element_user(TIMING$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TIMING$6) != 0;
      }
   }

   public void setTiming(CTSlideTiming var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTiming var3 = null;
         var3 = (CTSlideTiming)this.get_store().find_element_user(TIMING$6, 0);
         if(var3 == null) {
            var3 = (CTSlideTiming)this.get_store().add_element_user(TIMING$6);
         }

         var3.set(var1);
      }
   }

   public CTSlideTiming addNewTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTiming var2 = null;
         var2 = (CTSlideTiming)this.get_store().add_element_user(TIMING$6);
         return var2;
      }
   }

   public void unsetTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TIMING$6, 0);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$8) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$8, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$8);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$8);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$8, 0);
      }
   }

   public boolean getShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERSP$10);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMASTERSP$10);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERSP$10);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMASTERSP$10);
         }

         return var2;
      }
   }

   public boolean isSetShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMASTERSP$10) != null;
      }
   }

   public void setShowMasterSp(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERSP$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMASTERSP$10);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMasterSp(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERSP$10);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMASTERSP$10);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMASTERSP$10);
      }
   }

   public boolean getShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERPHANIM$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMASTERPHANIM$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERPHANIM$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMASTERPHANIM$12);
         }

         return var2;
      }
   }

   public boolean isSetShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMASTERPHANIM$12) != null;
      }
   }

   public void setShowMasterPhAnim(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERPHANIM$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMASTERPHANIM$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMasterPhAnim(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERPHANIM$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMASTERPHANIM$12);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMASTERPHANIM$12);
      }
   }

   public boolean getShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOW$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOW$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOW$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOW$14);
         }

         return var2;
      }
   }

   public boolean isSetShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOW$14) != null;
      }
   }

   public void setShow(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOW$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOW$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShow(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOW$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOW$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShow() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOW$14);
      }
   }

}
