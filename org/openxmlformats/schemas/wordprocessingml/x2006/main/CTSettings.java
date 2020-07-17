package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTMathPr;
import org.openxmlformats.schemas.schemaLibrary.x2006.main.CTSchemaLibrary;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCaptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCharacterSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColorSchemeMapping;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTCompat;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocRsids;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocVars;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEdnDocProps;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnDocProps;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTKinsoku;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMailMerge;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProof;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTReadingModeInkLockDown;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSaveThroughXslt;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShapeDefaults;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChangesView;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTView;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWriteProtection;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTWritingStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTZoom;
import org.w3c.dom.Node;

public interface CTSettings extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSettings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsettingsd6a5type");


   CTWriteProtection getWriteProtection();

   boolean isSetWriteProtection();

   void setWriteProtection(CTWriteProtection var1);

   CTWriteProtection addNewWriteProtection();

   void unsetWriteProtection();

   CTView getView();

   boolean isSetView();

   void setView(CTView var1);

   CTView addNewView();

   void unsetView();

   CTZoom getZoom();

   boolean isSetZoom();

   void setZoom(CTZoom var1);

   CTZoom addNewZoom();

   void unsetZoom();

   CTOnOff getRemovePersonalInformation();

   boolean isSetRemovePersonalInformation();

   void setRemovePersonalInformation(CTOnOff var1);

   CTOnOff addNewRemovePersonalInformation();

   void unsetRemovePersonalInformation();

   CTOnOff getRemoveDateAndTime();

   boolean isSetRemoveDateAndTime();

   void setRemoveDateAndTime(CTOnOff var1);

   CTOnOff addNewRemoveDateAndTime();

   void unsetRemoveDateAndTime();

   CTOnOff getDoNotDisplayPageBoundaries();

   boolean isSetDoNotDisplayPageBoundaries();

   void setDoNotDisplayPageBoundaries(CTOnOff var1);

   CTOnOff addNewDoNotDisplayPageBoundaries();

   void unsetDoNotDisplayPageBoundaries();

   CTOnOff getDisplayBackgroundShape();

   boolean isSetDisplayBackgroundShape();

   void setDisplayBackgroundShape(CTOnOff var1);

   CTOnOff addNewDisplayBackgroundShape();

   void unsetDisplayBackgroundShape();

   CTOnOff getPrintPostScriptOverText();

   boolean isSetPrintPostScriptOverText();

   void setPrintPostScriptOverText(CTOnOff var1);

   CTOnOff addNewPrintPostScriptOverText();

   void unsetPrintPostScriptOverText();

   CTOnOff getPrintFractionalCharacterWidth();

   boolean isSetPrintFractionalCharacterWidth();

   void setPrintFractionalCharacterWidth(CTOnOff var1);

   CTOnOff addNewPrintFractionalCharacterWidth();

   void unsetPrintFractionalCharacterWidth();

   CTOnOff getPrintFormsData();

   boolean isSetPrintFormsData();

   void setPrintFormsData(CTOnOff var1);

   CTOnOff addNewPrintFormsData();

   void unsetPrintFormsData();

   CTOnOff getEmbedTrueTypeFonts();

   boolean isSetEmbedTrueTypeFonts();

   void setEmbedTrueTypeFonts(CTOnOff var1);

   CTOnOff addNewEmbedTrueTypeFonts();

   void unsetEmbedTrueTypeFonts();

   CTOnOff getEmbedSystemFonts();

   boolean isSetEmbedSystemFonts();

   void setEmbedSystemFonts(CTOnOff var1);

   CTOnOff addNewEmbedSystemFonts();

   void unsetEmbedSystemFonts();

   CTOnOff getSaveSubsetFonts();

   boolean isSetSaveSubsetFonts();

   void setSaveSubsetFonts(CTOnOff var1);

   CTOnOff addNewSaveSubsetFonts();

   void unsetSaveSubsetFonts();

   CTOnOff getSaveFormsData();

   boolean isSetSaveFormsData();

   void setSaveFormsData(CTOnOff var1);

   CTOnOff addNewSaveFormsData();

   void unsetSaveFormsData();

   CTOnOff getMirrorMargins();

   boolean isSetMirrorMargins();

   void setMirrorMargins(CTOnOff var1);

   CTOnOff addNewMirrorMargins();

   void unsetMirrorMargins();

   CTOnOff getAlignBordersAndEdges();

   boolean isSetAlignBordersAndEdges();

   void setAlignBordersAndEdges(CTOnOff var1);

   CTOnOff addNewAlignBordersAndEdges();

   void unsetAlignBordersAndEdges();

   CTOnOff getBordersDoNotSurroundHeader();

   boolean isSetBordersDoNotSurroundHeader();

   void setBordersDoNotSurroundHeader(CTOnOff var1);

   CTOnOff addNewBordersDoNotSurroundHeader();

   void unsetBordersDoNotSurroundHeader();

   CTOnOff getBordersDoNotSurroundFooter();

   boolean isSetBordersDoNotSurroundFooter();

   void setBordersDoNotSurroundFooter(CTOnOff var1);

   CTOnOff addNewBordersDoNotSurroundFooter();

   void unsetBordersDoNotSurroundFooter();

   CTOnOff getGutterAtTop();

   boolean isSetGutterAtTop();

   void setGutterAtTop(CTOnOff var1);

   CTOnOff addNewGutterAtTop();

   void unsetGutterAtTop();

   CTOnOff getHideSpellingErrors();

   boolean isSetHideSpellingErrors();

   void setHideSpellingErrors(CTOnOff var1);

   CTOnOff addNewHideSpellingErrors();

   void unsetHideSpellingErrors();

   CTOnOff getHideGrammaticalErrors();

   boolean isSetHideGrammaticalErrors();

   void setHideGrammaticalErrors(CTOnOff var1);

   CTOnOff addNewHideGrammaticalErrors();

   void unsetHideGrammaticalErrors();

   List getActiveWritingStyleList();

   CTWritingStyle[] getActiveWritingStyleArray();

   CTWritingStyle getActiveWritingStyleArray(int var1);

   int sizeOfActiveWritingStyleArray();

   void setActiveWritingStyleArray(CTWritingStyle[] var1);

   void setActiveWritingStyleArray(int var1, CTWritingStyle var2);

   CTWritingStyle insertNewActiveWritingStyle(int var1);

   CTWritingStyle addNewActiveWritingStyle();

   void removeActiveWritingStyle(int var1);

   CTProof getProofState();

   boolean isSetProofState();

   void setProofState(CTProof var1);

   CTProof addNewProofState();

   void unsetProofState();

   CTOnOff getFormsDesign();

   boolean isSetFormsDesign();

   void setFormsDesign(CTOnOff var1);

   CTOnOff addNewFormsDesign();

   void unsetFormsDesign();

   CTRel getAttachedTemplate();

   boolean isSetAttachedTemplate();

   void setAttachedTemplate(CTRel var1);

   CTRel addNewAttachedTemplate();

   void unsetAttachedTemplate();

   CTOnOff getLinkStyles();

   boolean isSetLinkStyles();

   void setLinkStyles(CTOnOff var1);

   CTOnOff addNewLinkStyles();

   void unsetLinkStyles();

   CTShortHexNumber getStylePaneFormatFilter();

   boolean isSetStylePaneFormatFilter();

   void setStylePaneFormatFilter(CTShortHexNumber var1);

   CTShortHexNumber addNewStylePaneFormatFilter();

   void unsetStylePaneFormatFilter();

   CTShortHexNumber getStylePaneSortMethod();

   boolean isSetStylePaneSortMethod();

   void setStylePaneSortMethod(CTShortHexNumber var1);

   CTShortHexNumber addNewStylePaneSortMethod();

   void unsetStylePaneSortMethod();

   CTDocType getDocumentType();

   boolean isSetDocumentType();

   void setDocumentType(CTDocType var1);

   CTDocType addNewDocumentType();

   void unsetDocumentType();

   CTMailMerge getMailMerge();

   boolean isSetMailMerge();

   void setMailMerge(CTMailMerge var1);

   CTMailMerge addNewMailMerge();

   void unsetMailMerge();

   CTTrackChangesView getRevisionView();

   boolean isSetRevisionView();

   void setRevisionView(CTTrackChangesView var1);

   CTTrackChangesView addNewRevisionView();

   void unsetRevisionView();

   CTOnOff getTrackRevisions();

   boolean isSetTrackRevisions();

   void setTrackRevisions(CTOnOff var1);

   CTOnOff addNewTrackRevisions();

   void unsetTrackRevisions();

   CTOnOff getDoNotTrackMoves();

   boolean isSetDoNotTrackMoves();

   void setDoNotTrackMoves(CTOnOff var1);

   CTOnOff addNewDoNotTrackMoves();

   void unsetDoNotTrackMoves();

   CTOnOff getDoNotTrackFormatting();

   boolean isSetDoNotTrackFormatting();

   void setDoNotTrackFormatting(CTOnOff var1);

   CTOnOff addNewDoNotTrackFormatting();

   void unsetDoNotTrackFormatting();

   CTDocProtect getDocumentProtection();

   boolean isSetDocumentProtection();

   void setDocumentProtection(CTDocProtect var1);

   CTDocProtect addNewDocumentProtection();

   void unsetDocumentProtection();

   CTOnOff getAutoFormatOverride();

   boolean isSetAutoFormatOverride();

   void setAutoFormatOverride(CTOnOff var1);

   CTOnOff addNewAutoFormatOverride();

   void unsetAutoFormatOverride();

   CTOnOff getStyleLockTheme();

   boolean isSetStyleLockTheme();

   void setStyleLockTheme(CTOnOff var1);

   CTOnOff addNewStyleLockTheme();

   void unsetStyleLockTheme();

   CTOnOff getStyleLockQFSet();

   boolean isSetStyleLockQFSet();

   void setStyleLockQFSet(CTOnOff var1);

   CTOnOff addNewStyleLockQFSet();

   void unsetStyleLockQFSet();

   CTTwipsMeasure getDefaultTabStop();

   boolean isSetDefaultTabStop();

   void setDefaultTabStop(CTTwipsMeasure var1);

   CTTwipsMeasure addNewDefaultTabStop();

   void unsetDefaultTabStop();

   CTOnOff getAutoHyphenation();

   boolean isSetAutoHyphenation();

   void setAutoHyphenation(CTOnOff var1);

   CTOnOff addNewAutoHyphenation();

   void unsetAutoHyphenation();

   CTDecimalNumber getConsecutiveHyphenLimit();

   boolean isSetConsecutiveHyphenLimit();

   void setConsecutiveHyphenLimit(CTDecimalNumber var1);

   CTDecimalNumber addNewConsecutiveHyphenLimit();

   void unsetConsecutiveHyphenLimit();

   CTTwipsMeasure getHyphenationZone();

   boolean isSetHyphenationZone();

   void setHyphenationZone(CTTwipsMeasure var1);

   CTTwipsMeasure addNewHyphenationZone();

   void unsetHyphenationZone();

   CTOnOff getDoNotHyphenateCaps();

   boolean isSetDoNotHyphenateCaps();

   void setDoNotHyphenateCaps(CTOnOff var1);

   CTOnOff addNewDoNotHyphenateCaps();

   void unsetDoNotHyphenateCaps();

   CTOnOff getShowEnvelope();

   boolean isSetShowEnvelope();

   void setShowEnvelope(CTOnOff var1);

   CTOnOff addNewShowEnvelope();

   void unsetShowEnvelope();

   CTDecimalNumber getSummaryLength();

   boolean isSetSummaryLength();

   void setSummaryLength(CTDecimalNumber var1);

   CTDecimalNumber addNewSummaryLength();

   void unsetSummaryLength();

   CTString getClickAndTypeStyle();

   boolean isSetClickAndTypeStyle();

   void setClickAndTypeStyle(CTString var1);

   CTString addNewClickAndTypeStyle();

   void unsetClickAndTypeStyle();

   CTString getDefaultTableStyle();

   boolean isSetDefaultTableStyle();

   void setDefaultTableStyle(CTString var1);

   CTString addNewDefaultTableStyle();

   void unsetDefaultTableStyle();

   CTOnOff getEvenAndOddHeaders();

   boolean isSetEvenAndOddHeaders();

   void setEvenAndOddHeaders(CTOnOff var1);

   CTOnOff addNewEvenAndOddHeaders();

   void unsetEvenAndOddHeaders();

   CTOnOff getBookFoldRevPrinting();

   boolean isSetBookFoldRevPrinting();

   void setBookFoldRevPrinting(CTOnOff var1);

   CTOnOff addNewBookFoldRevPrinting();

   void unsetBookFoldRevPrinting();

   CTOnOff getBookFoldPrinting();

   boolean isSetBookFoldPrinting();

   void setBookFoldPrinting(CTOnOff var1);

   CTOnOff addNewBookFoldPrinting();

   void unsetBookFoldPrinting();

   CTDecimalNumber getBookFoldPrintingSheets();

   boolean isSetBookFoldPrintingSheets();

   void setBookFoldPrintingSheets(CTDecimalNumber var1);

   CTDecimalNumber addNewBookFoldPrintingSheets();

   void unsetBookFoldPrintingSheets();

   CTTwipsMeasure getDrawingGridHorizontalSpacing();

   boolean isSetDrawingGridHorizontalSpacing();

   void setDrawingGridHorizontalSpacing(CTTwipsMeasure var1);

   CTTwipsMeasure addNewDrawingGridHorizontalSpacing();

   void unsetDrawingGridHorizontalSpacing();

   CTTwipsMeasure getDrawingGridVerticalSpacing();

   boolean isSetDrawingGridVerticalSpacing();

   void setDrawingGridVerticalSpacing(CTTwipsMeasure var1);

   CTTwipsMeasure addNewDrawingGridVerticalSpacing();

   void unsetDrawingGridVerticalSpacing();

   CTDecimalNumber getDisplayHorizontalDrawingGridEvery();

   boolean isSetDisplayHorizontalDrawingGridEvery();

   void setDisplayHorizontalDrawingGridEvery(CTDecimalNumber var1);

   CTDecimalNumber addNewDisplayHorizontalDrawingGridEvery();

   void unsetDisplayHorizontalDrawingGridEvery();

   CTDecimalNumber getDisplayVerticalDrawingGridEvery();

   boolean isSetDisplayVerticalDrawingGridEvery();

   void setDisplayVerticalDrawingGridEvery(CTDecimalNumber var1);

   CTDecimalNumber addNewDisplayVerticalDrawingGridEvery();

   void unsetDisplayVerticalDrawingGridEvery();

   CTOnOff getDoNotUseMarginsForDrawingGridOrigin();

   boolean isSetDoNotUseMarginsForDrawingGridOrigin();

   void setDoNotUseMarginsForDrawingGridOrigin(CTOnOff var1);

   CTOnOff addNewDoNotUseMarginsForDrawingGridOrigin();

   void unsetDoNotUseMarginsForDrawingGridOrigin();

   CTTwipsMeasure getDrawingGridHorizontalOrigin();

   boolean isSetDrawingGridHorizontalOrigin();

   void setDrawingGridHorizontalOrigin(CTTwipsMeasure var1);

   CTTwipsMeasure addNewDrawingGridHorizontalOrigin();

   void unsetDrawingGridHorizontalOrigin();

   CTTwipsMeasure getDrawingGridVerticalOrigin();

   boolean isSetDrawingGridVerticalOrigin();

   void setDrawingGridVerticalOrigin(CTTwipsMeasure var1);

   CTTwipsMeasure addNewDrawingGridVerticalOrigin();

   void unsetDrawingGridVerticalOrigin();

   CTOnOff getDoNotShadeFormData();

   boolean isSetDoNotShadeFormData();

   void setDoNotShadeFormData(CTOnOff var1);

   CTOnOff addNewDoNotShadeFormData();

   void unsetDoNotShadeFormData();

   CTOnOff getNoPunctuationKerning();

   boolean isSetNoPunctuationKerning();

   void setNoPunctuationKerning(CTOnOff var1);

   CTOnOff addNewNoPunctuationKerning();

   void unsetNoPunctuationKerning();

   CTCharacterSpacing getCharacterSpacingControl();

   boolean isSetCharacterSpacingControl();

   void setCharacterSpacingControl(CTCharacterSpacing var1);

   CTCharacterSpacing addNewCharacterSpacingControl();

   void unsetCharacterSpacingControl();

   CTOnOff getPrintTwoOnOne();

   boolean isSetPrintTwoOnOne();

   void setPrintTwoOnOne(CTOnOff var1);

   CTOnOff addNewPrintTwoOnOne();

   void unsetPrintTwoOnOne();

   CTOnOff getStrictFirstAndLastChars();

   boolean isSetStrictFirstAndLastChars();

   void setStrictFirstAndLastChars(CTOnOff var1);

   CTOnOff addNewStrictFirstAndLastChars();

   void unsetStrictFirstAndLastChars();

   CTKinsoku getNoLineBreaksAfter();

   boolean isSetNoLineBreaksAfter();

   void setNoLineBreaksAfter(CTKinsoku var1);

   CTKinsoku addNewNoLineBreaksAfter();

   void unsetNoLineBreaksAfter();

   CTKinsoku getNoLineBreaksBefore();

   boolean isSetNoLineBreaksBefore();

   void setNoLineBreaksBefore(CTKinsoku var1);

   CTKinsoku addNewNoLineBreaksBefore();

   void unsetNoLineBreaksBefore();

   CTOnOff getSavePreviewPicture();

   boolean isSetSavePreviewPicture();

   void setSavePreviewPicture(CTOnOff var1);

   CTOnOff addNewSavePreviewPicture();

   void unsetSavePreviewPicture();

   CTOnOff getDoNotValidateAgainstSchema();

   boolean isSetDoNotValidateAgainstSchema();

   void setDoNotValidateAgainstSchema(CTOnOff var1);

   CTOnOff addNewDoNotValidateAgainstSchema();

   void unsetDoNotValidateAgainstSchema();

   CTOnOff getSaveInvalidXml();

   boolean isSetSaveInvalidXml();

   void setSaveInvalidXml(CTOnOff var1);

   CTOnOff addNewSaveInvalidXml();

   void unsetSaveInvalidXml();

   CTOnOff getIgnoreMixedContent();

   boolean isSetIgnoreMixedContent();

   void setIgnoreMixedContent(CTOnOff var1);

   CTOnOff addNewIgnoreMixedContent();

   void unsetIgnoreMixedContent();

   CTOnOff getAlwaysShowPlaceholderText();

   boolean isSetAlwaysShowPlaceholderText();

   void setAlwaysShowPlaceholderText(CTOnOff var1);

   CTOnOff addNewAlwaysShowPlaceholderText();

   void unsetAlwaysShowPlaceholderText();

   CTOnOff getDoNotDemarcateInvalidXml();

   boolean isSetDoNotDemarcateInvalidXml();

   void setDoNotDemarcateInvalidXml(CTOnOff var1);

   CTOnOff addNewDoNotDemarcateInvalidXml();

   void unsetDoNotDemarcateInvalidXml();

   CTOnOff getSaveXmlDataOnly();

   boolean isSetSaveXmlDataOnly();

   void setSaveXmlDataOnly(CTOnOff var1);

   CTOnOff addNewSaveXmlDataOnly();

   void unsetSaveXmlDataOnly();

   CTOnOff getUseXSLTWhenSaving();

   boolean isSetUseXSLTWhenSaving();

   void setUseXSLTWhenSaving(CTOnOff var1);

   CTOnOff addNewUseXSLTWhenSaving();

   void unsetUseXSLTWhenSaving();

   CTSaveThroughXslt getSaveThroughXslt();

   boolean isSetSaveThroughXslt();

   void setSaveThroughXslt(CTSaveThroughXslt var1);

   CTSaveThroughXslt addNewSaveThroughXslt();

   void unsetSaveThroughXslt();

   CTOnOff getShowXMLTags();

   boolean isSetShowXMLTags();

   void setShowXMLTags(CTOnOff var1);

   CTOnOff addNewShowXMLTags();

   void unsetShowXMLTags();

   CTOnOff getAlwaysMergeEmptyNamespace();

   boolean isSetAlwaysMergeEmptyNamespace();

   void setAlwaysMergeEmptyNamespace(CTOnOff var1);

   CTOnOff addNewAlwaysMergeEmptyNamespace();

   void unsetAlwaysMergeEmptyNamespace();

   CTOnOff getUpdateFields();

   boolean isSetUpdateFields();

   void setUpdateFields(CTOnOff var1);

   CTOnOff addNewUpdateFields();

   void unsetUpdateFields();

   CTShapeDefaults getHdrShapeDefaults();

   boolean isSetHdrShapeDefaults();

   void setHdrShapeDefaults(CTShapeDefaults var1);

   CTShapeDefaults addNewHdrShapeDefaults();

   void unsetHdrShapeDefaults();

   CTFtnDocProps getFootnotePr();

   boolean isSetFootnotePr();

   void setFootnotePr(CTFtnDocProps var1);

   CTFtnDocProps addNewFootnotePr();

   void unsetFootnotePr();

   CTEdnDocProps getEndnotePr();

   boolean isSetEndnotePr();

   void setEndnotePr(CTEdnDocProps var1);

   CTEdnDocProps addNewEndnotePr();

   void unsetEndnotePr();

   CTCompat getCompat();

   boolean isSetCompat();

   void setCompat(CTCompat var1);

   CTCompat addNewCompat();

   void unsetCompat();

   CTDocVars getDocVars();

   boolean isSetDocVars();

   void setDocVars(CTDocVars var1);

   CTDocVars addNewDocVars();

   void unsetDocVars();

   CTDocRsids getRsids();

   boolean isSetRsids();

   void setRsids(CTDocRsids var1);

   CTDocRsids addNewRsids();

   void unsetRsids();

   CTMathPr getMathPr();

   boolean isSetMathPr();

   void setMathPr(CTMathPr var1);

   CTMathPr addNewMathPr();

   void unsetMathPr();

   CTOnOff getUiCompat97To2003();

   boolean isSetUiCompat97To2003();

   void setUiCompat97To2003(CTOnOff var1);

   CTOnOff addNewUiCompat97To2003();

   void unsetUiCompat97To2003();

   List getAttachedSchemaList();

   CTString[] getAttachedSchemaArray();

   CTString getAttachedSchemaArray(int var1);

   int sizeOfAttachedSchemaArray();

   void setAttachedSchemaArray(CTString[] var1);

   void setAttachedSchemaArray(int var1, CTString var2);

   CTString insertNewAttachedSchema(int var1);

   CTString addNewAttachedSchema();

   void removeAttachedSchema(int var1);

   CTLanguage getThemeFontLang();

   boolean isSetThemeFontLang();

   void setThemeFontLang(CTLanguage var1);

   CTLanguage addNewThemeFontLang();

   void unsetThemeFontLang();

   CTColorSchemeMapping getClrSchemeMapping();

   boolean isSetClrSchemeMapping();

   void setClrSchemeMapping(CTColorSchemeMapping var1);

   CTColorSchemeMapping addNewClrSchemeMapping();

   void unsetClrSchemeMapping();

   CTOnOff getDoNotIncludeSubdocsInStats();

   boolean isSetDoNotIncludeSubdocsInStats();

   void setDoNotIncludeSubdocsInStats(CTOnOff var1);

   CTOnOff addNewDoNotIncludeSubdocsInStats();

   void unsetDoNotIncludeSubdocsInStats();

   CTOnOff getDoNotAutoCompressPictures();

   boolean isSetDoNotAutoCompressPictures();

   void setDoNotAutoCompressPictures(CTOnOff var1);

   CTOnOff addNewDoNotAutoCompressPictures();

   void unsetDoNotAutoCompressPictures();

   CTEmpty getForceUpgrade();

   boolean isSetForceUpgrade();

   void setForceUpgrade(CTEmpty var1);

   CTEmpty addNewForceUpgrade();

   void unsetForceUpgrade();

   CTCaptions getCaptions();

   boolean isSetCaptions();

   void setCaptions(CTCaptions var1);

   CTCaptions addNewCaptions();

   void unsetCaptions();

   CTReadingModeInkLockDown getReadModeInkLockDown();

   boolean isSetReadModeInkLockDown();

   void setReadModeInkLockDown(CTReadingModeInkLockDown var1);

   CTReadingModeInkLockDown addNewReadModeInkLockDown();

   void unsetReadModeInkLockDown();

   List getSmartTagTypeList();

   CTSmartTagType[] getSmartTagTypeArray();

   CTSmartTagType getSmartTagTypeArray(int var1);

   int sizeOfSmartTagTypeArray();

   void setSmartTagTypeArray(CTSmartTagType[] var1);

   void setSmartTagTypeArray(int var1, CTSmartTagType var2);

   CTSmartTagType insertNewSmartTagType(int var1);

   CTSmartTagType addNewSmartTagType();

   void removeSmartTagType(int var1);

   CTSchemaLibrary getSchemaLibrary();

   boolean isSetSchemaLibrary();

   void setSchemaLibrary(CTSchemaLibrary var1);

   CTSchemaLibrary addNewSchemaLibrary();

   void unsetSchemaLibrary();

   CTShapeDefaults getShapeDefaults();

   boolean isSetShapeDefaults();

   void setShapeDefaults(CTShapeDefaults var1);

   CTShapeDefaults addNewShapeDefaults();

   void unsetShapeDefaults();

   CTOnOff getDoNotEmbedSmartTags();

   boolean isSetDoNotEmbedSmartTags();

   void setDoNotEmbedSmartTags(CTOnOff var1);

   CTOnOff addNewDoNotEmbedSmartTags();

   void unsetDoNotEmbedSmartTags();

   CTString getDecimalSymbol();

   boolean isSetDecimalSymbol();

   void setDecimalSymbol(CTString var1);

   CTString addNewDecimalSymbol();

   void unsetDecimalSymbol();

   CTString getListSeparator();

   boolean isSetListSeparator();

   void setListSeparator(CTString var1);

   CTString addNewListSeparator();

   void unsetListSeparator();


   public static final class Factory {

      public static CTSettings newInstance() {
         return (CTSettings)POIXMLTypeLoader.newInstance(CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings newInstance(XmlOptions var0) {
         return (CTSettings)POIXMLTypeLoader.newInstance(CTSettings.type, var0);
      }

      public static CTSettings parse(String var0) throws XmlException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(File var0) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(URL var0) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(InputStream var0) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(Reader var0) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(XMLStreamReader var0) throws XmlException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(Node var0) throws XmlException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static CTSettings parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, (XmlOptions)null);
      }

      public static CTSettings parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSettings)POIXMLTypeLoader.parse(var0, CTSettings.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSettings.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSettings.type, var1);
      }

   }
}
