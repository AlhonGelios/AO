package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHeaderFooter;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayoutIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterTextStyles;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTiming;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideTransition;

public class CTSlideMasterImpl extends XmlComplexContentImpl implements CTSlideMaster {

   private static final QName CSLD$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cSld");
   private static final QName CLRMAP$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrMap");
   private static final QName SLDLAYOUTIDLST$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldLayoutIdLst");
   private static final QName TRANSITION$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "transition");
   private static final QName TIMING$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "timing");
   private static final QName HF$10 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "hf");
   private static final QName TXSTYLES$12 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "txStyles");
   private static final QName EXTLST$14 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName PRESERVE$16 = new QName("", "preserve");


   public CTSlideMasterImpl(SchemaType var1) {
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

   public CTColorMapping getClrMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().find_element_user(CLRMAP$2, 0);
         return var2 == null?null:var2;
      }
   }

   public void setClrMap(CTColorMapping var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var3 = null;
         var3 = (CTColorMapping)this.get_store().find_element_user(CLRMAP$2, 0);
         if(var3 == null) {
            var3 = (CTColorMapping)this.get_store().add_element_user(CLRMAP$2);
         }

         var3.set(var1);
      }
   }

   public CTColorMapping addNewClrMap() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorMapping var2 = null;
         var2 = (CTColorMapping)this.get_store().add_element_user(CLRMAP$2);
         return var2;
      }
   }

   public CTSlideLayoutIdList getSldLayoutIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideLayoutIdList var2 = null;
         var2 = (CTSlideLayoutIdList)this.get_store().find_element_user(SLDLAYOUTIDLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSldLayoutIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLDLAYOUTIDLST$4) != 0;
      }
   }

   public void setSldLayoutIdLst(CTSlideLayoutIdList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideLayoutIdList var3 = null;
         var3 = (CTSlideLayoutIdList)this.get_store().find_element_user(SLDLAYOUTIDLST$4, 0);
         if(var3 == null) {
            var3 = (CTSlideLayoutIdList)this.get_store().add_element_user(SLDLAYOUTIDLST$4);
         }

         var3.set(var1);
      }
   }

   public CTSlideLayoutIdList addNewSldLayoutIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideLayoutIdList var2 = null;
         var2 = (CTSlideLayoutIdList)this.get_store().add_element_user(SLDLAYOUTIDLST$4);
         return var2;
      }
   }

   public void unsetSldLayoutIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLDLAYOUTIDLST$4, 0);
      }
   }

   public CTSlideTransition getTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTransition var2 = null;
         var2 = (CTSlideTransition)this.get_store().find_element_user(TRANSITION$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRANSITION$6) != 0;
      }
   }

   public void setTransition(CTSlideTransition var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTransition var3 = null;
         var3 = (CTSlideTransition)this.get_store().find_element_user(TRANSITION$6, 0);
         if(var3 == null) {
            var3 = (CTSlideTransition)this.get_store().add_element_user(TRANSITION$6);
         }

         var3.set(var1);
      }
   }

   public CTSlideTransition addNewTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTransition var2 = null;
         var2 = (CTSlideTransition)this.get_store().add_element_user(TRANSITION$6);
         return var2;
      }
   }

   public void unsetTransition() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRANSITION$6, 0);
      }
   }

   public CTSlideTiming getTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTiming var2 = null;
         var2 = (CTSlideTiming)this.get_store().find_element_user(TIMING$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TIMING$8) != 0;
      }
   }

   public void setTiming(CTSlideTiming var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTiming var3 = null;
         var3 = (CTSlideTiming)this.get_store().find_element_user(TIMING$8, 0);
         if(var3 == null) {
            var3 = (CTSlideTiming)this.get_store().add_element_user(TIMING$8);
         }

         var3.set(var1);
      }
   }

   public CTSlideTiming addNewTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideTiming var2 = null;
         var2 = (CTSlideTiming)this.get_store().add_element_user(TIMING$8);
         return var2;
      }
   }

   public void unsetTiming() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TIMING$8, 0);
      }
   }

   public CTHeaderFooter getHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().find_element_user(HF$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HF$10) != 0;
      }
   }

   public void setHf(CTHeaderFooter var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var3 = null;
         var3 = (CTHeaderFooter)this.get_store().find_element_user(HF$10, 0);
         if(var3 == null) {
            var3 = (CTHeaderFooter)this.get_store().add_element_user(HF$10);
         }

         var3.set(var1);
      }
   }

   public CTHeaderFooter addNewHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHeaderFooter var2 = null;
         var2 = (CTHeaderFooter)this.get_store().add_element_user(HF$10);
         return var2;
      }
   }

   public void unsetHf() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HF$10, 0);
      }
   }

   public CTSlideMasterTextStyles getTxStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterTextStyles var2 = null;
         var2 = (CTSlideMasterTextStyles)this.get_store().find_element_user(TXSTYLES$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTxStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TXSTYLES$12) != 0;
      }
   }

   public void setTxStyles(CTSlideMasterTextStyles var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterTextStyles var3 = null;
         var3 = (CTSlideMasterTextStyles)this.get_store().find_element_user(TXSTYLES$12, 0);
         if(var3 == null) {
            var3 = (CTSlideMasterTextStyles)this.get_store().add_element_user(TXSTYLES$12);
         }

         var3.set(var1);
      }
   }

   public CTSlideMasterTextStyles addNewTxStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterTextStyles var2 = null;
         var2 = (CTSlideMasterTextStyles)this.get_store().add_element_user(TXSTYLES$12);
         return var2;
      }
   }

   public void unsetTxStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TXSTYLES$12, 0);
      }
   }

   public CTExtensionListModify getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$14) != 0;
      }
   }

   public void setExtLst(CTExtensionListModify var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var3 = null;
         var3 = (CTExtensionListModify)this.get_store().find_element_user(EXTLST$14, 0);
         if(var3 == null) {
            var3 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTExtensionListModify addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionListModify var2 = null;
         var2 = (CTExtensionListModify)this.get_store().add_element_user(EXTLST$14);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$14, 0);
      }
   }

   public boolean getPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(PRESERVE$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(PRESERVE$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVE$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(PRESERVE$16);
         }

         return var2;
      }
   }

   public boolean isSetPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(PRESERVE$16) != null;
      }
   }

   public void setPreserve(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(PRESERVE$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(PRESERVE$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetPreserve(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(PRESERVE$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(PRESERVE$16);
         }

         var3.set(var1);
      }
   }

   public void unsetPreserve() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(PRESERVE$16);
      }
   }

}
