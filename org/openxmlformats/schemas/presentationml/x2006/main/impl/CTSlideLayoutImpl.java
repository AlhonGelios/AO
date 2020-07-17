package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMappingOverride;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition;
import org.openxmlformats.schemas.presentationml.x2006.main.STSlideLayoutType;

public class CTSlideLayoutImpl extends XmlComplexContentImpl implements CTSlideLayout {

   private static final QName CSLD$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
   private static final QName CLRMAPOVR$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMapOvr");
   private static final QName TRANSITION$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "transition");
   private static final QName TIMING$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "timing");
   private static final QName HF$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hf");
   private static final QName EXTLST$10 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName SHOWMASTERSP$12 = new QName("", "showMasterSp");
   private static final QName SHOWMASTERPHANIM$14 = new QName("", "showMasterPhAnim");
   private static final QName MATCHINGNAME$16 = new QName("", "matchingName");
   private static final QName TYPE$18 = new QName("", "type");
   private static final QName PRESERVE$20 = new QName("", "preserve");
   private static final QName USERDRAWN$22 = new QName("", "userDrawn");


   public CTSlideLayoutImpl(SchemaType var1) {
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

   public CTHeaderFooter getHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HF$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HF$8) != 0;
      }
   }

   public void setHf(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HF$8, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HF$8);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HF$8);
         return var2;
      }
   }

   public void unsetHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HF$8, 0);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$10) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$10, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$10);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$10);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$10, 0);
      }
   }

   public boolean getShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERSP$12);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMASTERSP$12);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERSP$12);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMASTERSP$12);
         }

         return var2;
      }
   }

   public boolean isSetShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMASTERSP$12) != null;
      }
   }

   public void setShowMasterSp(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERSP$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMASTERSP$12);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMasterSp(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERSP$12);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMASTERSP$12);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMasterSp() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMASTERSP$12);
      }
   }

   public boolean getShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERPHANIM$14);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWMASTERPHANIM$14);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERPHANIM$14);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWMASTERPHANIM$14);
         }

         return var2;
      }
   }

   public boolean isSetShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWMASTERPHANIM$14) != null;
      }
   }

   public void setShowMasterPhAnim(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWMASTERPHANIM$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWMASTERPHANIM$14);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowMasterPhAnim(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWMASTERPHANIM$14);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWMASTERPHANIM$14);
         }

         var3.set(var1);
      }
   }

   public void unsetShowMasterPhAnim() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWMASTERPHANIM$14);
      }
   }

   public String getMatchingName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(MATCHINGNAME$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(MATCHINGNAME$16);
         }

         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetMatchingName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_attribute_user(MATCHINGNAME$16);
         if(var2 == null) {
            var2 = (XmlString)this.get_default_attribute_value(MATCHINGNAME$16);
         }

         return var2;
      }
   }

   public boolean isSetMatchingName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(MATCHINGNAME$16) != null;
      }
   }

   public void setMatchingName(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(MATCHINGNAME$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(MATCHINGNAME$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetMatchingName(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_attribute_user(MATCHINGNAME$16);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_attribute_user(MATCHINGNAME$16);
         }

         var3.set(var1);
      }
   }

   public void unsetMatchingName() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(MATCHINGNAME$16);
      }
   }

   public STSlideLayoutType.Enum getType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TYPE$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(TYPE$18);
         }

         return var2 == null?null:(STSlideLayoutType.Enum)var2.getEnumValue();
      }
   }

   public STSlideLayoutType xgetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideLayoutType var2 = null;
         var2 = (STSlideLayoutType)this.get_store().find_attribute_user(TYPE$18);
         if(var2 == null) {
            var2 = (STSlideLayoutType)this.get_default_attribute_value(TYPE$18);
         }

         return var2;
      }
   }

   public boolean isSetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TYPE$18) != null;
      }
   }

   public void setType(STSlideLayoutType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(TYPE$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(TYPE$18);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetType(STSlideLayoutType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSlideLayoutType var3 = null;
         var3 = (STSlideLayoutType)this.get_store().find_attribute_user(TYPE$18);
         if(var3 == null) {
            var3 = (STSlideLayoutType)this.get_store().add_attribute_user(TYPE$18);
         }

         var3.set(var1);
      }
   }

   public void unsetType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TYPE$18);
      }
   }

   public boolean getPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRESERVE$20);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PRESERVE$20);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVE$20);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PRESERVE$20);
         }

         return var2;
      }
   }

   public boolean isSetPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRESERVE$20) != null;
      }
   }

   public void setPreserve(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRESERVE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRESERVE$20);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPreserve(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVE$20);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRESERVE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRESERVE$20);
      }
   }

   public boolean getUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$22);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USERDRAWN$22);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USERDRAWN$22);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USERDRAWN$22);
         }

         return var2;
      }
   }

   public boolean isSetUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USERDRAWN$22) != null;
      }
   }

   public void setUserDrawn(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USERDRAWN$22);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUserDrawn(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USERDRAWN$22);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USERDRAWN$22);
         }

         var3.set(var1);
      }
   }

   public void unsetUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USERDRAWN$22);
      }
   }

}
