package org.openxmlformats.schemas.presentationml.x2006.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomShowList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCustomerDataList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTEmbeddedFontList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTHandoutMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTKinsoku;
import org.openxmlformats.schemas.presentationml.x2006.main.CTModifyVerifier;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPhotoAlbum;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags;
import org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed;

public class CTPresentationImpl extends XmlComplexContentImpl implements CTPresentation {

   private static final QName SLDMASTERIDLST$0 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldMasterIdLst");
   private static final QName NOTESMASTERIDLST$2 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesMasterIdLst");
   private static final QName HANDOUTMASTERIDLST$4 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "handoutMasterIdLst");
   private static final QName SLDIDLST$6 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldIdLst");
   private static final QName SLDSZ$8 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sldSz");
   private static final QName NOTESSZ$10 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesSz");
   private static final QName SMARTTAGS$12 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "smartTags");
   private static final QName EMBEDDEDFONTLST$14 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "embeddedFontLst");
   private static final QName CUSTSHOWLST$16 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custShowLst");
   private static final QName PHOTOALBUM$18 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "photoAlbum");
   private static final QName CUSTDATALST$20 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "custDataLst");
   private static final QName KINSOKU$22 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "kinsoku");
   private static final QName DEFAULTTEXTSTYLE$24 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "defaultTextStyle");
   private static final QName MODIFYVERIFIER$26 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "modifyVerifier");
   private static final QName EXTLST$28 = new QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
   private static final QName SERVERZOOM$30 = new QName("", "serverZoom");
   private static final QName FIRSTSLIDENUM$32 = new QName("", "firstSlideNum");
   private static final QName SHOWSPECIALPLSONTITLESLD$34 = new QName("", "showSpecialPlsOnTitleSld");
   private static final QName RTL$36 = new QName("", "rtl");
   private static final QName REMOVEPERSONALINFOONSAVE$38 = new QName("", "removePersonalInfoOnSave");
   private static final QName COMPATMODE$40 = new QName("", "compatMode");
   private static final QName STRICTFIRSTANDLASTCHARS$42 = new QName("", "strictFirstAndLastChars");
   private static final QName EMBEDTRUETYPEFONTS$44 = new QName("", "embedTrueTypeFonts");
   private static final QName SAVESUBSETFONTS$46 = new QName("", "saveSubsetFonts");
   private static final QName AUTOCOMPRESSPICTURES$48 = new QName("", "autoCompressPictures");
   private static final QName BOOKMARKIDSEED$50 = new QName("", "bookmarkIdSeed");


   public CTPresentationImpl(SchemaType var1) {
      super(var1);
   }

   public CTSlideMasterIdList getSldMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdList var2 = null;
         var2 = (CTSlideMasterIdList)this.get_store().find_element_user(SLDMASTERIDLST$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSldMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLDMASTERIDLST$0) != 0;
      }
   }

   public void setSldMasterIdLst(CTSlideMasterIdList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdList var3 = null;
         var3 = (CTSlideMasterIdList)this.get_store().find_element_user(SLDMASTERIDLST$0, 0);
         if(var3 == null) {
            var3 = (CTSlideMasterIdList)this.get_store().add_element_user(SLDMASTERIDLST$0);
         }

         var3.set(var1);
      }
   }

   public CTSlideMasterIdList addNewSldMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideMasterIdList var2 = null;
         var2 = (CTSlideMasterIdList)this.get_store().add_element_user(SLDMASTERIDLST$0);
         return var2;
      }
   }

   public void unsetSldMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLDMASTERIDLST$0, 0);
      }
   }

   public CTNotesMasterIdList getNotesMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMasterIdList var2 = null;
         var2 = (CTNotesMasterIdList)this.get_store().find_element_user(NOTESMASTERIDLST$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNotesMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOTESMASTERIDLST$2) != 0;
      }
   }

   public void setNotesMasterIdLst(CTNotesMasterIdList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMasterIdList var3 = null;
         var3 = (CTNotesMasterIdList)this.get_store().find_element_user(NOTESMASTERIDLST$2, 0);
         if(var3 == null) {
            var3 = (CTNotesMasterIdList)this.get_store().add_element_user(NOTESMASTERIDLST$2);
         }

         var3.set(var1);
      }
   }

   public CTNotesMasterIdList addNewNotesMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTNotesMasterIdList var2 = null;
         var2 = (CTNotesMasterIdList)this.get_store().add_element_user(NOTESMASTERIDLST$2);
         return var2;
      }
   }

   public void unsetNotesMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOTESMASTERIDLST$2, 0);
      }
   }

   public CTHandoutMasterIdList getHandoutMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandoutMasterIdList var2 = null;
         var2 = (CTHandoutMasterIdList)this.get_store().find_element_user(HANDOUTMASTERIDLST$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHandoutMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HANDOUTMASTERIDLST$4) != 0;
      }
   }

   public void setHandoutMasterIdLst(CTHandoutMasterIdList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandoutMasterIdList var3 = null;
         var3 = (CTHandoutMasterIdList)this.get_store().find_element_user(HANDOUTMASTERIDLST$4, 0);
         if(var3 == null) {
            var3 = (CTHandoutMasterIdList)this.get_store().add_element_user(HANDOUTMASTERIDLST$4);
         }

         var3.set(var1);
      }
   }

   public CTHandoutMasterIdList addNewHandoutMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTHandoutMasterIdList var2 = null;
         var2 = (CTHandoutMasterIdList)this.get_store().add_element_user(HANDOUTMASTERIDLST$4);
         return var2;
      }
   }

   public void unsetHandoutMasterIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HANDOUTMASTERIDLST$4, 0);
      }
   }

   public CTSlideIdList getSldIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdList var2 = null;
         var2 = (CTSlideIdList)this.get_store().find_element_user(SLDIDLST$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSldIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLDIDLST$6) != 0;
      }
   }

   public void setSldIdLst(CTSlideIdList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdList var3 = null;
         var3 = (CTSlideIdList)this.get_store().find_element_user(SLDIDLST$6, 0);
         if(var3 == null) {
            var3 = (CTSlideIdList)this.get_store().add_element_user(SLDIDLST$6);
         }

         var3.set(var1);
      }
   }

   public CTSlideIdList addNewSldIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideIdList var2 = null;
         var2 = (CTSlideIdList)this.get_store().add_element_user(SLDIDLST$6);
         return var2;
      }
   }

   public void unsetSldIdLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLDIDLST$6, 0);
      }
   }

   public CTSlideSize getSldSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideSize var2 = null;
         var2 = (CTSlideSize)this.get_store().find_element_user(SLDSZ$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSldSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SLDSZ$8) != 0;
      }
   }

   public void setSldSz(CTSlideSize var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideSize var3 = null;
         var3 = (CTSlideSize)this.get_store().find_element_user(SLDSZ$8, 0);
         if(var3 == null) {
            var3 = (CTSlideSize)this.get_store().add_element_user(SLDSZ$8);
         }

         var3.set(var1);
      }
   }

   public CTSlideSize addNewSldSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSlideSize var2 = null;
         var2 = (CTSlideSize)this.get_store().add_element_user(SLDSZ$8);
         return var2;
      }
   }

   public void unsetSldSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SLDSZ$8, 0);
      }
   }

   public CTPositiveSize2D getNotesSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().find_element_user(NOTESSZ$10, 0);
         return var2 == null?null:var2;
      }
   }

   public void setNotesSz(CTPositiveSize2D var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var3 = null;
         var3 = (CTPositiveSize2D)this.get_store().find_element_user(NOTESSZ$10, 0);
         if(var3 == null) {
            var3 = (CTPositiveSize2D)this.get_store().add_element_user(NOTESSZ$10);
         }

         var3.set(var1);
      }
   }

   public CTPositiveSize2D addNewNotesSz() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPositiveSize2D var2 = null;
         var2 = (CTPositiveSize2D)this.get_store().add_element_user(NOTESSZ$10);
         return var2;
      }
   }

   public CTSmartTags getSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTags var2 = null;
         var2 = (CTSmartTags)this.get_store().find_element_user(SMARTTAGS$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMARTTAGS$12) != 0;
      }
   }

   public void setSmartTags(CTSmartTags var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTags var3 = null;
         var3 = (CTSmartTags)this.get_store().find_element_user(SMARTTAGS$12, 0);
         if(var3 == null) {
            var3 = (CTSmartTags)this.get_store().add_element_user(SMARTTAGS$12);
         }

         var3.set(var1);
      }
   }

   public CTSmartTags addNewSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTags var2 = null;
         var2 = (CTSmartTags)this.get_store().add_element_user(SMARTTAGS$12);
         return var2;
      }
   }

   public void unsetSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMARTTAGS$12, 0);
      }
   }

   public CTEmbeddedFontList getEmbeddedFontLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedFontList var2 = null;
         var2 = (CTEmbeddedFontList)this.get_store().find_element_user(EMBEDDEDFONTLST$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEmbeddedFontLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EMBEDDEDFONTLST$14) != 0;
      }
   }

   public void setEmbeddedFontLst(CTEmbeddedFontList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedFontList var3 = null;
         var3 = (CTEmbeddedFontList)this.get_store().find_element_user(EMBEDDEDFONTLST$14, 0);
         if(var3 == null) {
            var3 = (CTEmbeddedFontList)this.get_store().add_element_user(EMBEDDEDFONTLST$14);
         }

         var3.set(var1);
      }
   }

   public CTEmbeddedFontList addNewEmbeddedFontLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmbeddedFontList var2 = null;
         var2 = (CTEmbeddedFontList)this.get_store().add_element_user(EMBEDDEDFONTLST$14);
         return var2;
      }
   }

   public void unsetEmbeddedFontLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EMBEDDEDFONTLST$14, 0);
      }
   }

   public CTCustomShowList getCustShowLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomShowList var2 = null;
         var2 = (CTCustomShowList)this.get_store().find_element_user(CUSTSHOWLST$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustShowLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTSHOWLST$16) != 0;
      }
   }

   public void setCustShowLst(CTCustomShowList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomShowList var3 = null;
         var3 = (CTCustomShowList)this.get_store().find_element_user(CUSTSHOWLST$16, 0);
         if(var3 == null) {
            var3 = (CTCustomShowList)this.get_store().add_element_user(CUSTSHOWLST$16);
         }

         var3.set(var1);
      }
   }

   public CTCustomShowList addNewCustShowLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomShowList var2 = null;
         var2 = (CTCustomShowList)this.get_store().add_element_user(CUSTSHOWLST$16);
         return var2;
      }
   }

   public void unsetCustShowLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTSHOWLST$16, 0);
      }
   }

   public CTPhotoAlbum getPhotoAlbum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhotoAlbum var2 = null;
         var2 = (CTPhotoAlbum)this.get_store().find_element_user(PHOTOALBUM$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPhotoAlbum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PHOTOALBUM$18) != 0;
      }
   }

   public void setPhotoAlbum(CTPhotoAlbum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhotoAlbum var3 = null;
         var3 = (CTPhotoAlbum)this.get_store().find_element_user(PHOTOALBUM$18, 0);
         if(var3 == null) {
            var3 = (CTPhotoAlbum)this.get_store().add_element_user(PHOTOALBUM$18);
         }

         var3.set(var1);
      }
   }

   public CTPhotoAlbum addNewPhotoAlbum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTPhotoAlbum var2 = null;
         var2 = (CTPhotoAlbum)this.get_store().add_element_user(PHOTOALBUM$18);
         return var2;
      }
   }

   public void unsetPhotoAlbum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PHOTOALBUM$18, 0);
      }
   }

   public CTCustomerDataList getCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var2 = null;
         var2 = (CTCustomerDataList)this.get_store().find_element_user(CUSTDATALST$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTDATALST$20) != 0;
      }
   }

   public void setCustDataLst(CTCustomerDataList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var3 = null;
         var3 = (CTCustomerDataList)this.get_store().find_element_user(CUSTDATALST$20, 0);
         if(var3 == null) {
            var3 = (CTCustomerDataList)this.get_store().add_element_user(CUSTDATALST$20);
         }

         var3.set(var1);
      }
   }

   public CTCustomerDataList addNewCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCustomerDataList var2 = null;
         var2 = (CTCustomerDataList)this.get_store().add_element_user(CUSTDATALST$20);
         return var2;
      }
   }

   public void unsetCustDataLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTDATALST$20, 0);
      }
   }

   public CTKinsoku getKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var2 = null;
         var2 = (CTKinsoku)this.get_store().find_element_user(KINSOKU$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(KINSOKU$22) != 0;
      }
   }

   public void setKinsoku(CTKinsoku var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var3 = null;
         var3 = (CTKinsoku)this.get_store().find_element_user(KINSOKU$22, 0);
         if(var3 == null) {
            var3 = (CTKinsoku)this.get_store().add_element_user(KINSOKU$22);
         }

         var3.set(var1);
      }
   }

   public CTKinsoku addNewKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var2 = null;
         var2 = (CTKinsoku)this.get_store().add_element_user(KINSOKU$22);
         return var2;
      }
   }

   public void unsetKinsoku() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(KINSOKU$22, 0);
      }
   }

   public CTTextListStyle getDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().find_element_user(DEFAULTTEXTSTYLE$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFAULTTEXTSTYLE$24) != 0;
      }
   }

   public void setDefaultTextStyle(CTTextListStyle var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var3 = null;
         var3 = (CTTextListStyle)this.get_store().find_element_user(DEFAULTTEXTSTYLE$24, 0);
         if(var3 == null) {
            var3 = (CTTextListStyle)this.get_store().add_element_user(DEFAULTTEXTSTYLE$24);
         }

         var3.set(var1);
      }
   }

   public CTTextListStyle addNewDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTextListStyle var2 = null;
         var2 = (CTTextListStyle)this.get_store().add_element_user(DEFAULTTEXTSTYLE$24);
         return var2;
      }
   }

   public void unsetDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFAULTTEXTSTYLE$24, 0);
      }
   }

   public CTModifyVerifier getModifyVerifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTModifyVerifier var2 = null;
         var2 = (CTModifyVerifier)this.get_store().find_element_user(MODIFYVERIFIER$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetModifyVerifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MODIFYVERIFIER$26) != 0;
      }
   }

   public void setModifyVerifier(CTModifyVerifier var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTModifyVerifier var3 = null;
         var3 = (CTModifyVerifier)this.get_store().find_element_user(MODIFYVERIFIER$26, 0);
         if(var3 == null) {
            var3 = (CTModifyVerifier)this.get_store().add_element_user(MODIFYVERIFIER$26);
         }

         var3.set(var1);
      }
   }

   public CTModifyVerifier addNewModifyVerifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTModifyVerifier var2 = null;
         var2 = (CTModifyVerifier)this.get_store().add_element_user(MODIFYVERIFIER$26);
         return var2;
      }
   }

   public void unsetModifyVerifier() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MODIFYVERIFIER$26, 0);
      }
   }

   public CTExtensionList getExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().find_element_user(EXTLST$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EXTLST$28) != 0;
      }
   }

   public void setExtLst(CTExtensionList var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var3 = null;
         var3 = (CTExtensionList)this.get_store().find_element_user(EXTLST$28, 0);
         if(var3 == null) {
            var3 = (CTExtensionList)this.get_store().add_element_user(EXTLST$28);
         }

         var3.set(var1);
      }
   }

   public CTExtensionList addNewExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTExtensionList var2 = null;
         var2 = (CTExtensionList)this.get_store().add_element_user(EXTLST$28);
         return var2;
      }
   }

   public void unsetExtLst() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EXTLST$28, 0);
      }
   }

   public int getServerZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SERVERZOOM$30);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SERVERZOOM$30);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPercentage xgetServerZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var2 = null;
         var2 = (STPercentage)this.get_store().find_attribute_user(SERVERZOOM$30);
         if(var2 == null) {
            var2 = (STPercentage)this.get_default_attribute_value(SERVERZOOM$30);
         }

         return var2;
      }
   }

   public boolean isSetServerZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SERVERZOOM$30) != null;
      }
   }

   public void setServerZoom(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SERVERZOOM$30);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SERVERZOOM$30);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetServerZoom(STPercentage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPercentage var3 = null;
         var3 = (STPercentage)this.get_store().find_attribute_user(SERVERZOOM$30);
         if(var3 == null) {
            var3 = (STPercentage)this.get_store().add_attribute_user(SERVERZOOM$30);
         }

         var3.set(var1);
      }
   }

   public void unsetServerZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SERVERZOOM$30);
      }
   }

   public int getFirstSlideNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FIRSTSLIDENUM$32);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(FIRSTSLIDENUM$32);
         }

         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetFirstSlideNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_attribute_user(FIRSTSLIDENUM$32);
         if(var2 == null) {
            var2 = (XmlInt)this.get_default_attribute_value(FIRSTSLIDENUM$32);
         }

         return var2;
      }
   }

   public boolean isSetFirstSlideNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FIRSTSLIDENUM$32) != null;
      }
   }

   public void setFirstSlideNum(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FIRSTSLIDENUM$32);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FIRSTSLIDENUM$32);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetFirstSlideNum(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_attribute_user(FIRSTSLIDENUM$32);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_attribute_user(FIRSTSLIDENUM$32);
         }

         var3.set(var1);
      }
   }

   public void unsetFirstSlideNum() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FIRSTSLIDENUM$32);
      }
   }

   public boolean getShowSpecialPlsOnTitleSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SHOWSPECIALPLSONTITLESLD$34);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetShowSpecialPlsOnTitleSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SHOWSPECIALPLSONTITLESLD$34);
         }

         return var2;
      }
   }

   public boolean isSetShowSpecialPlsOnTitleSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34) != null;
      }
   }

   public void setShowSpecialPlsOnTitleSld(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetShowSpecialPlsOnTitleSld(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SHOWSPECIALPLSONTITLESLD$34);
         }

         var3.set(var1);
      }
   }

   public void unsetShowSpecialPlsOnTitleSld() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SHOWSPECIALPLSONTITLESLD$34);
      }
   }

   public boolean getRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(RTL$36);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(RTL$36);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(RTL$36);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(RTL$36);
         }

         return var2;
      }
   }

   public boolean isSetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(RTL$36) != null;
      }
   }

   public void setRtl(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(RTL$36);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(RTL$36);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRtl(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(RTL$36);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(RTL$36);
         }

         var3.set(var1);
      }
   }

   public void unsetRtl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(RTL$36);
      }
   }

   public boolean getRemovePersonalInfoOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(REMOVEPERSONALINFOONSAVE$38);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetRemovePersonalInfoOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(REMOVEPERSONALINFOONSAVE$38);
         }

         return var2;
      }
   }

   public boolean isSetRemovePersonalInfoOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38) != null;
      }
   }

   public void setRemovePersonalInfoOnSave(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(REMOVEPERSONALINFOONSAVE$38);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetRemovePersonalInfoOnSave(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(REMOVEPERSONALINFOONSAVE$38);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(REMOVEPERSONALINFOONSAVE$38);
         }

         var3.set(var1);
      }
   }

   public void unsetRemovePersonalInfoOnSave() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(REMOVEPERSONALINFOONSAVE$38);
      }
   }

   public boolean getCompatMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(COMPATMODE$40);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(COMPATMODE$40);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetCompatMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(COMPATMODE$40);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(COMPATMODE$40);
         }

         return var2;
      }
   }

   public boolean isSetCompatMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(COMPATMODE$40) != null;
      }
   }

   public void setCompatMode(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(COMPATMODE$40);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(COMPATMODE$40);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetCompatMode(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(COMPATMODE$40);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(COMPATMODE$40);
         }

         var3.set(var1);
      }
   }

   public void unsetCompatMode() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(COMPATMODE$40);
      }
   }

   public boolean getStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(STRICTFIRSTANDLASTCHARS$42);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(STRICTFIRSTANDLASTCHARS$42);
         }

         return var2;
      }
   }

   public boolean isSetStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42) != null;
      }
   }

   public void setStrictFirstAndLastChars(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(STRICTFIRSTANDLASTCHARS$42);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetStrictFirstAndLastChars(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(STRICTFIRSTANDLASTCHARS$42);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(STRICTFIRSTANDLASTCHARS$42);
         }

         var3.set(var1);
      }
   }

   public void unsetStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(STRICTFIRSTANDLASTCHARS$42);
      }
   }

   public boolean getEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(EMBEDTRUETYPEFONTS$44);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(EMBEDTRUETYPEFONTS$44);
         }

         return var2;
      }
   }

   public boolean isSetEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44) != null;
      }
   }

   public void setEmbedTrueTypeFonts(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EMBEDTRUETYPEFONTS$44);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetEmbedTrueTypeFonts(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(EMBEDTRUETYPEFONTS$44);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(EMBEDTRUETYPEFONTS$44);
         }

         var3.set(var1);
      }
   }

   public void unsetEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EMBEDTRUETYPEFONTS$44);
      }
   }

   public boolean getSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SAVESUBSETFONTS$46);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(SAVESUBSETFONTS$46);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(SAVESUBSETFONTS$46);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(SAVESUBSETFONTS$46);
         }

         return var2;
      }
   }

   public boolean isSetSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SAVESUBSETFONTS$46) != null;
      }
   }

   public void setSaveSubsetFonts(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SAVESUBSETFONTS$46);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SAVESUBSETFONTS$46);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetSaveSubsetFonts(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(SAVESUBSETFONTS$46);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(SAVESUBSETFONTS$46);
         }

         var3.set(var1);
      }
   }

   public void unsetSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SAVESUBSETFONTS$46);
      }
   }

   public boolean getAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(AUTOCOMPRESSPICTURES$48);
         }

         return var2 == null?false:var2.getBooleanValue();
      }
   }

   public XmlBoolean xgetAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var2 = null;
         var2 = (XmlBoolean)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
         if(var2 == null) {
            var2 = (XmlBoolean)this.get_default_attribute_value(AUTOCOMPRESSPICTURES$48);
         }

         return var2;
      }
   }

   public boolean isSetAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48) != null;
      }
   }

   public void setAutoCompressPictures(boolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(AUTOCOMPRESSPICTURES$48);
         }

         var3.setBooleanValue(var1);
      }
   }

   public void xsetAutoCompressPictures(XmlBoolean var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBoolean var3 = null;
         var3 = (XmlBoolean)this.get_store().find_attribute_user(AUTOCOMPRESSPICTURES$48);
         if(var3 == null) {
            var3 = (XmlBoolean)this.get_store().add_attribute_user(AUTOCOMPRESSPICTURES$48);
         }

         var3.set(var1);
      }
   }

   public void unsetAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(AUTOCOMPRESSPICTURES$48);
      }
   }

   public long getBookmarkIdSeed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(BOOKMARKIDSEED$50);
         if(var2 == null) {
            var2 = (SimpleValue)this.get_default_attribute_value(BOOKMARKIDSEED$50);
         }

         return var2 == null?0L:var2.getLongValue();
      }
   }

   public STBookmarkIdSeed xgetBookmarkIdSeed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBookmarkIdSeed var2 = null;
         var2 = (STBookmarkIdSeed)this.get_store().find_attribute_user(BOOKMARKIDSEED$50);
         if(var2 == null) {
            var2 = (STBookmarkIdSeed)this.get_default_attribute_value(BOOKMARKIDSEED$50);
         }

         return var2;
      }
   }

   public boolean isSetBookmarkIdSeed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(BOOKMARKIDSEED$50) != null;
      }
   }

   public void setBookmarkIdSeed(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(BOOKMARKIDSEED$50);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(BOOKMARKIDSEED$50);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetBookmarkIdSeed(STBookmarkIdSeed var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STBookmarkIdSeed var3 = null;
         var3 = (STBookmarkIdSeed)this.get_store().find_attribute_user(BOOKMARKIDSEED$50);
         if(var3 == null) {
            var3 = (STBookmarkIdSeed)this.get_store().add_attribute_user(BOOKMARKIDSEED$50);
         }

         var3.set(var1);
      }
   }

   public void unsetBookmarkIdSeed() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(BOOKMARKIDSEED$50);
      }
   }

}
