package org.openxmlformats.schemas.presentationml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
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
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSmartTags;
import org.openxmlformats.schemas.presentationml.x2006.main.STBookmarkIdSeed;
import org.w3c.dom.Node;

public interface CTPresentation extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPresentation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpresentation56cbtype");


   CTSlideMasterIdList getSldMasterIdLst();

   boolean isSetSldMasterIdLst();

   void setSldMasterIdLst(CTSlideMasterIdList var1);

   CTSlideMasterIdList addNewSldMasterIdLst();

   void unsetSldMasterIdLst();

   CTNotesMasterIdList getNotesMasterIdLst();

   boolean isSetNotesMasterIdLst();

   void setNotesMasterIdLst(CTNotesMasterIdList var1);

   CTNotesMasterIdList addNewNotesMasterIdLst();

   void unsetNotesMasterIdLst();

   CTHandoutMasterIdList getHandoutMasterIdLst();

   boolean isSetHandoutMasterIdLst();

   void setHandoutMasterIdLst(CTHandoutMasterIdList var1);

   CTHandoutMasterIdList addNewHandoutMasterIdLst();

   void unsetHandoutMasterIdLst();

   CTSlideIdList getSldIdLst();

   boolean isSetSldIdLst();

   void setSldIdLst(CTSlideIdList var1);

   CTSlideIdList addNewSldIdLst();

   void unsetSldIdLst();

   CTSlideSize getSldSz();

   boolean isSetSldSz();

   void setSldSz(CTSlideSize var1);

   CTSlideSize addNewSldSz();

   void unsetSldSz();

   CTPositiveSize2D getNotesSz();

   void setNotesSz(CTPositiveSize2D var1);

   CTPositiveSize2D addNewNotesSz();

   CTSmartTags getSmartTags();

   boolean isSetSmartTags();

   void setSmartTags(CTSmartTags var1);

   CTSmartTags addNewSmartTags();

   void unsetSmartTags();

   CTEmbeddedFontList getEmbeddedFontLst();

   boolean isSetEmbeddedFontLst();

   void setEmbeddedFontLst(CTEmbeddedFontList var1);

   CTEmbeddedFontList addNewEmbeddedFontLst();

   void unsetEmbeddedFontLst();

   CTCustomShowList getCustShowLst();

   boolean isSetCustShowLst();

   void setCustShowLst(CTCustomShowList var1);

   CTCustomShowList addNewCustShowLst();

   void unsetCustShowLst();

   CTPhotoAlbum getPhotoAlbum();

   boolean isSetPhotoAlbum();

   void setPhotoAlbum(CTPhotoAlbum var1);

   CTPhotoAlbum addNewPhotoAlbum();

   void unsetPhotoAlbum();

   CTCustomerDataList getCustDataLst();

   boolean isSetCustDataLst();

   void setCustDataLst(CTCustomerDataList var1);

   CTCustomerDataList addNewCustDataLst();

   void unsetCustDataLst();

   CTKinsoku getKinsoku();

   boolean isSetKinsoku();

   void setKinsoku(CTKinsoku var1);

   CTKinsoku addNewKinsoku();

   void unsetKinsoku();

   CTTextListStyle getDefaultTextStyle();

   boolean isSetDefaultTextStyle();

   void setDefaultTextStyle(CTTextListStyle var1);

   CTTextListStyle addNewDefaultTextStyle();

   void unsetDefaultTextStyle();

   CTModifyVerifier getModifyVerifier();

   boolean isSetModifyVerifier();

   void setModifyVerifier(CTModifyVerifier var1);

   CTModifyVerifier addNewModifyVerifier();

   void unsetModifyVerifier();

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   int getServerZoom();

   STPercentage xgetServerZoom();

   boolean isSetServerZoom();

   void setServerZoom(int var1);

   void xsetServerZoom(STPercentage var1);

   void unsetServerZoom();

   int getFirstSlideNum();

   XmlInt xgetFirstSlideNum();

   boolean isSetFirstSlideNum();

   void setFirstSlideNum(int var1);

   void xsetFirstSlideNum(XmlInt var1);

   void unsetFirstSlideNum();

   boolean getShowSpecialPlsOnTitleSld();

   XmlBoolean xgetShowSpecialPlsOnTitleSld();

   boolean isSetShowSpecialPlsOnTitleSld();

   void setShowSpecialPlsOnTitleSld(boolean var1);

   void xsetShowSpecialPlsOnTitleSld(XmlBoolean var1);

   void unsetShowSpecialPlsOnTitleSld();

   boolean getRtl();

   XmlBoolean xgetRtl();

   boolean isSetRtl();

   void setRtl(boolean var1);

   void xsetRtl(XmlBoolean var1);

   void unsetRtl();

   boolean getRemovePersonalInfoOnSave();

   XmlBoolean xgetRemovePersonalInfoOnSave();

   boolean isSetRemovePersonalInfoOnSave();

   void setRemovePersonalInfoOnSave(boolean var1);

   void xsetRemovePersonalInfoOnSave(XmlBoolean var1);

   void unsetRemovePersonalInfoOnSave();

   boolean getCompatMode();

   XmlBoolean xgetCompatMode();

   boolean isSetCompatMode();

   void setCompatMode(boolean var1);

   void xsetCompatMode(XmlBoolean var1);

   void unsetCompatMode();

   boolean getStrictFirstAndLastChars();

   XmlBoolean xgetStrictFirstAndLastChars();

   boolean isSetStrictFirstAndLastChars();

   void setStrictFirstAndLastChars(boolean var1);

   void xsetStrictFirstAndLastChars(XmlBoolean var1);

   void unsetStrictFirstAndLastChars();

   boolean getEmbedTrueTypeFonts();

   XmlBoolean xgetEmbedTrueTypeFonts();

   boolean isSetEmbedTrueTypeFonts();

   void setEmbedTrueTypeFonts(boolean var1);

   void xsetEmbedTrueTypeFonts(XmlBoolean var1);

   void unsetEmbedTrueTypeFonts();

   boolean getSaveSubsetFonts();

   XmlBoolean xgetSaveSubsetFonts();

   boolean isSetSaveSubsetFonts();

   void setSaveSubsetFonts(boolean var1);

   void xsetSaveSubsetFonts(XmlBoolean var1);

   void unsetSaveSubsetFonts();

   boolean getAutoCompressPictures();

   XmlBoolean xgetAutoCompressPictures();

   boolean isSetAutoCompressPictures();

   void setAutoCompressPictures(boolean var1);

   void xsetAutoCompressPictures(XmlBoolean var1);

   void unsetAutoCompressPictures();

   long getBookmarkIdSeed();

   STBookmarkIdSeed xgetBookmarkIdSeed();

   boolean isSetBookmarkIdSeed();

   void setBookmarkIdSeed(long var1);

   void xsetBookmarkIdSeed(STBookmarkIdSeed var1);

   void unsetBookmarkIdSeed();


   public static final class Factory {

      public static CTPresentation newInstance() {
         return (CTPresentation)POIXMLTypeLoader.newInstance(CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation newInstance(XmlOptions var0) {
         return (CTPresentation)POIXMLTypeLoader.newInstance(CTPresentation.type, var0);
      }

      public static CTPresentation parse(String var0) throws XmlException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(File var0) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(URL var0) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(InputStream var0) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(Reader var0) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(XMLStreamReader var0) throws XmlException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(Node var0) throws XmlException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static CTPresentation parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static CTPresentation parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPresentation)POIXMLTypeLoader.parse(var0, CTPresentation.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPresentation.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPresentation.type, var1);
      }

   }
}
