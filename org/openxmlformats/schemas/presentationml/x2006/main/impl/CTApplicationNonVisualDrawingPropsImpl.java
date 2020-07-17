package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAudioCD;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAudioFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEmbeddedWAVAudioFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTQuickTimeFile;
import org.openxmlformats.schemas.drawingml.x2006.main.CTVideoFile;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;

public class CTApplicationNonVisualDrawingPropsImpl extends XmlComplexContentImpl implements CTApplicationNonVisualDrawingProps {

   private static final QName PH$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "ph");
   private static final QName AUDIOCD$2 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "audioCd");
   private static final QName WAVAUDIOFILE$4 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "wavAudioFile");
   private static final QName AUDIOFILE$6 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "audioFile");
   private static final QName VIDEOFILE$8 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "videoFile");
   private static final QName QUICKTIMEFILE$10 = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "quickTimeFile");
   private static final QName CUSTDATALST$12 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custDataLst");
   private static final QName EXTLST$14 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName ISPHOTO$16 = new QName("", "isPhoto");
   private static final QName USERDRAWN$18 = new QName("", "userDrawn");


   public CTApplicationNonVisualDrawingPropsImpl(SchemaType var1) {
      super(var1);
   }

   public CTPlaceholder getPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var2 = null;
         var2 = (CTPlaceholder)this.get_store().find_element_user(PH$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PH$0) != 0;
      }
   }

   public void setPh(CTPlaceholder var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var3 = null;
         var3 = (CTPlaceholder)this.get_store().find_element_user(PH$0, 0);
         if(var3 == null) {
            var3 = (CTPlaceholder)this.get_store().add_element_user(PH$0);
         }

         var3.set(var1);
      }
   }

   public CTPlaceholder addNewPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPlaceholder var2 = null;
         var2 = (CTPlaceholder)this.get_store().add_element_user(PH$0);
         return var2;
      }
   }

   public void unsetPh() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PH$0, 0);
      }
   }

   public CTAudioCD getAudioCd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAudioCD var2 = null;
         var2 = (CTAudioCD)this.get_store().find_element_user(AUDIOCD$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAudioCd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUDIOCD$2) != 0;
      }
   }

   public void setAudioCd(CTAudioCD var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAudioCD var3 = null;
         var3 = (CTAudioCD)this.get_store().find_element_user(AUDIOCD$2, 0);
         if(var3 == null) {
            var3 = (CTAudioCD)this.get_store().add_element_user(AUDIOCD$2);
         }

         var3.set(var1);
      }
   }

   public CTAudioCD addNewAudioCd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAudioCD var2 = null;
         var2 = (CTAudioCD)this.get_store().add_element_user(AUDIOCD$2);
         return var2;
      }
   }

   public void unsetAudioCd() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUDIOCD$2, 0);
      }
   }

   public CTEmbeddedWAVAudioFile getWavAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedWAVAudioFile var2 = null;
         var2 = (CTEmbeddedWAVAudioFile)this.get_store().find_element_user(WAVAUDIOFILE$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWavAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WAVAUDIOFILE$4) != 0;
      }
   }

   public void setWavAudioFile(CTEmbeddedWAVAudioFile var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedWAVAudioFile var3 = null;
         var3 = (CTEmbeddedWAVAudioFile)this.get_store().find_element_user(WAVAUDIOFILE$4, 0);
         if(var3 == null) {
            var3 = (CTEmbeddedWAVAudioFile)this.get_store().add_element_user(WAVAUDIOFILE$4);
         }

         var3.set(var1);
      }
   }

   public CTEmbeddedWAVAudioFile addNewWavAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedWAVAudioFile var2 = null;
         var2 = (CTEmbeddedWAVAudioFile)this.get_store().add_element_user(WAVAUDIOFILE$4);
         return var2;
      }
   }

   public void unsetWavAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WAVAUDIOFILE$4, 0);
      }
   }

   public CTAudioFile getAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAudioFile var2 = null;
         var2 = (CTAudioFile)this.get_store().find_element_user(AUDIOFILE$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUDIOFILE$6) != 0;
      }
   }

   public void setAudioFile(CTAudioFile var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAudioFile var3 = null;
         var3 = (CTAudioFile)this.get_store().find_element_user(AUDIOFILE$6, 0);
         if(var3 == null) {
            var3 = (CTAudioFile)this.get_store().add_element_user(AUDIOFILE$6);
         }

         var3.set(var1);
      }
   }

   public CTAudioFile addNewAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTAudioFile var2 = null;
         var2 = (CTAudioFile)this.get_store().add_element_user(AUDIOFILE$6);
         return var2;
      }
   }

   public void unsetAudioFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUDIOFILE$6, 0);
      }
   }

   public CTVideoFile getVideoFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVideoFile var2 = null;
         var2 = (CTVideoFile)this.get_store().find_element_user(VIDEOFILE$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetVideoFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VIDEOFILE$8) != 0;
      }
   }

   public void setVideoFile(CTVideoFile var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVideoFile var3 = null;
         var3 = (CTVideoFile)this.get_store().find_element_user(VIDEOFILE$8, 0);
         if(var3 == null) {
            var3 = (CTVideoFile)this.get_store().add_element_user(VIDEOFILE$8);
         }

         var3.set(var1);
      }
   }

   public CTVideoFile addNewVideoFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTVideoFile var2 = null;
         var2 = (CTVideoFile)this.get_store().add_element_user(VIDEOFILE$8);
         return var2;
      }
   }

   public void unsetVideoFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VIDEOFILE$8, 0);
      }
   }

   public CTQuickTimeFile getQuickTimeFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTQuickTimeFile var2 = null;
         var2 = (CTQuickTimeFile)this.get_store().find_element_user(QUICKTIMEFILE$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetQuickTimeFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(QUICKTIMEFILE$10) != 0;
      }
   }

   public void setQuickTimeFile(CTQuickTimeFile var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTQuickTimeFile var3 = null;
         var3 = (CTQuickTimeFile)this.get_store().find_element_user(QUICKTIMEFILE$10, 0);
         if(var3 == null) {
            var3 = (CTQuickTimeFile)this.get_store().add_element_user(QUICKTIMEFILE$10);
         }

         var3.set(var1);
      }
   }

   public CTQuickTimeFile addNewQuickTimeFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTQuickTimeFile var2 = null;
         var2 = (CTQuickTimeFile)this.get_store().add_element_user(QUICKTIMEFILE$10);
         return var2;
      }
   }

   public void unsetQuickTimeFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(QUICKTIMEFILE$10, 0);
      }
   }

   public CTCustomerDataList getCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var2 = null;
         var2 = (CTCustomerDataList)this.get_store().find_element_user(CUSTDATALST$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTDATALST$12) != 0;
      }
   }

   public void setCustDataLst(CTCustomerDataList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var3 = null;
         var3 = (CTCustomerDataList)this.get_store().find_element_user(CUSTDATALST$12, 0);
         if(var3 == null) {
            var3 = (CTCustomerDataList)this.get_store().add_element_user(CUSTDATALST$12);
         }

         var3.set(var1);
      }
   }

   public CTCustomerDataList addNewCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var2 = null;
         var2 = (CTCustomerDataList)this.get_store().add_element_user(CUSTDATALST$12);
         return var2;
      }
   }

   public void unsetCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTDATALST$12, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$14) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$14, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$14);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$14, 0);
      }
   }

   public boolean getIsPhoto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ISPHOTO$16);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(ISPHOTO$16);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetIsPhoto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(ISPHOTO$16);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(ISPHOTO$16);
         }

         return var2;
      }
   }

   public boolean isSetIsPhoto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ISPHOTO$16) != null;
      }
   }

   public void setIsPhoto(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ISPHOTO$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ISPHOTO$16);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetIsPhoto(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(ISPHOTO$16);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(ISPHOTO$16);
         }

         var3.set(var1);
      }
   }

   public void unsetIsPhoto() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ISPHOTO$16);
      }
   }

   public boolean getUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$18);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(USERDRAWN$18);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(USERDRAWN$18);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(USERDRAWN$18);
         }

         return var2;
      }
   }

   public boolean isSetUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(USERDRAWN$18) != null;
      }
   }

   public void setUserDrawn(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(USERDRAWN$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(USERDRAWN$18);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetUserDrawn(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(USERDRAWN$18);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(USERDRAWN$18);
         }

         var3.set(var1);
      }
   }

   public void unsetUserDrawn() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(USERDRAWN$18);
      }
   }

}
