package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSettings;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSettingsImpl.1ActiveWritingStyleList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSettingsImpl.1AttachedSchemaList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTSettingsImpl.1SmartTagTypeList;

public class CTSettingsImpl extends XmlComplexContentImpl implements CTSettings {

   private static final QName WRITEPROTECTION$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "writeProtection");
   private static final QName VIEW$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "view");
   private static final QName ZOOM$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "zoom");
   private static final QName REMOVEPERSONALINFORMATION$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "removePersonalInformation");
   private static final QName REMOVEDATEANDTIME$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "removeDateAndTime");
   private static final QName DONOTDISPLAYPAGEBOUNDARIES$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotDisplayPageBoundaries");
   private static final QName DISPLAYBACKGROUNDSHAPE$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displayBackgroundShape");
   private static final QName PRINTPOSTSCRIPTOVERTEXT$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printPostScriptOverText");
   private static final QName PRINTFRACTIONALCHARACTERWIDTH$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printFractionalCharacterWidth");
   private static final QName PRINTFORMSDATA$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printFormsData");
   private static final QName EMBEDTRUETYPEFONTS$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedTrueTypeFonts");
   private static final QName EMBEDSYSTEMFONTS$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "embedSystemFonts");
   private static final QName SAVESUBSETFONTS$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveSubsetFonts");
   private static final QName SAVEFORMSDATA$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveFormsData");
   private static final QName MIRRORMARGINS$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mirrorMargins");
   private static final QName ALIGNBORDERSANDEDGES$30 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alignBordersAndEdges");
   private static final QName BORDERSDONOTSURROUNDHEADER$32 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bordersDoNotSurroundHeader");
   private static final QName BORDERSDONOTSURROUNDFOOTER$34 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bordersDoNotSurroundFooter");
   private static final QName GUTTERATTOP$36 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "gutterAtTop");
   private static final QName HIDESPELLINGERRORS$38 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hideSpellingErrors");
   private static final QName HIDEGRAMMATICALERRORS$40 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hideGrammaticalErrors");
   private static final QName ACTIVEWRITINGSTYLE$42 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "activeWritingStyle");
   private static final QName PROOFSTATE$44 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofState");
   private static final QName FORMSDESIGN$46 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formsDesign");
   private static final QName ATTACHEDTEMPLATE$48 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "attachedTemplate");
   private static final QName LINKSTYLES$50 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "linkStyles");
   private static final QName STYLEPANEFORMATFILTER$52 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "stylePaneFormatFilter");
   private static final QName STYLEPANESORTMETHOD$54 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "stylePaneSortMethod");
   private static final QName DOCUMENTTYPE$56 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "documentType");
   private static final QName MAILMERGE$58 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "mailMerge");
   private static final QName REVISIONVIEW$60 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "revisionView");
   private static final QName TRACKREVISIONS$62 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "trackRevisions");
   private static final QName DONOTTRACKMOVES$64 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotTrackMoves");
   private static final QName DONOTTRACKFORMATTING$66 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotTrackFormatting");
   private static final QName DOCUMENTPROTECTION$68 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "documentProtection");
   private static final QName AUTOFORMATOVERRIDE$70 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoFormatOverride");
   private static final QName STYLELOCKTHEME$72 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleLockTheme");
   private static final QName STYLELOCKQFSET$74 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "styleLockQFSet");
   private static final QName DEFAULTTABSTOP$76 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defaultTabStop");
   private static final QName AUTOHYPHENATION$78 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "autoHyphenation");
   private static final QName CONSECUTIVEHYPHENLIMIT$80 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "consecutiveHyphenLimit");
   private static final QName HYPHENATIONZONE$82 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hyphenationZone");
   private static final QName DONOTHYPHENATECAPS$84 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotHyphenateCaps");
   private static final QName SHOWENVELOPE$86 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "showEnvelope");
   private static final QName SUMMARYLENGTH$88 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "summaryLength");
   private static final QName CLICKANDTYPESTYLE$90 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "clickAndTypeStyle");
   private static final QName DEFAULTTABLESTYLE$92 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "defaultTableStyle");
   private static final QName EVENANDODDHEADERS$94 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "evenAndOddHeaders");
   private static final QName BOOKFOLDREVPRINTING$96 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookFoldRevPrinting");
   private static final QName BOOKFOLDPRINTING$98 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookFoldPrinting");
   private static final QName BOOKFOLDPRINTINGSHEETS$100 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookFoldPrintingSheets");
   private static final QName DRAWINGGRIDHORIZONTALSPACING$102 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridHorizontalSpacing");
   private static final QName DRAWINGGRIDVERTICALSPACING$104 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridVerticalSpacing");
   private static final QName DISPLAYHORIZONTALDRAWINGGRIDEVERY$106 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displayHorizontalDrawingGridEvery");
   private static final QName DISPLAYVERTICALDRAWINGGRIDEVERY$108 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "displayVerticalDrawingGridEvery");
   private static final QName DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotUseMarginsForDrawingGridOrigin");
   private static final QName DRAWINGGRIDHORIZONTALORIGIN$112 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridHorizontalOrigin");
   private static final QName DRAWINGGRIDVERTICALORIGIN$114 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "drawingGridVerticalOrigin");
   private static final QName DONOTSHADEFORMDATA$116 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotShadeFormData");
   private static final QName NOPUNCTUATIONKERNING$118 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noPunctuationKerning");
   private static final QName CHARACTERSPACINGCONTROL$120 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "characterSpacingControl");
   private static final QName PRINTTWOONONE$122 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "printTwoOnOne");
   private static final QName STRICTFIRSTANDLASTCHARS$124 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "strictFirstAndLastChars");
   private static final QName NOLINEBREAKSAFTER$126 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noLineBreaksAfter");
   private static final QName NOLINEBREAKSBEFORE$128 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noLineBreaksBefore");
   private static final QName SAVEPREVIEWPICTURE$130 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "savePreviewPicture");
   private static final QName DONOTVALIDATEAGAINSTSCHEMA$132 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotValidateAgainstSchema");
   private static final QName SAVEINVALIDXML$134 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveInvalidXml");
   private static final QName IGNOREMIXEDCONTENT$136 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ignoreMixedContent");
   private static final QName ALWAYSSHOWPLACEHOLDERTEXT$138 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alwaysShowPlaceholderText");
   private static final QName DONOTDEMARCATEINVALIDXML$140 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotDemarcateInvalidXml");
   private static final QName SAVEXMLDATAONLY$142 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveXmlDataOnly");
   private static final QName USEXSLTWHENSAVING$144 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "useXSLTWhenSaving");
   private static final QName SAVETHROUGHXSLT$146 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "saveThroughXslt");
   private static final QName SHOWXMLTAGS$148 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "showXMLTags");
   private static final QName ALWAYSMERGEEMPTYNAMESPACE$150 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "alwaysMergeEmptyNamespace");
   private static final QName UPDATEFIELDS$152 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "updateFields");
   private static final QName HDRSHAPEDEFAULTS$154 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hdrShapeDefaults");
   private static final QName FOOTNOTEPR$156 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "footnotePr");
   private static final QName ENDNOTEPR$158 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "endnotePr");
   private static final QName COMPAT$160 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "compat");
   private static final QName DOCVARS$162 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "docVars");
   private static final QName RSIDS$164 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rsids");
   private static final QName MATHPR$166 = new QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "mathPr");
   private static final QName UICOMPAT97TO2003$168 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "uiCompat97To2003");
   private static final QName ATTACHEDSCHEMA$170 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "attachedSchema");
   private static final QName THEMEFONTLANG$172 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "themeFontLang");
   private static final QName CLRSCHEMEMAPPING$174 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "clrSchemeMapping");
   private static final QName DONOTINCLUDESUBDOCSINSTATS$176 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotIncludeSubdocsInStats");
   private static final QName DONOTAUTOCOMPRESSPICTURES$178 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotAutoCompressPictures");
   private static final QName FORCEUPGRADE$180 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "forceUpgrade");
   private static final QName CAPTIONS$182 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "captions");
   private static final QName READMODEINKLOCKDOWN$184 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "readModeInkLockDown");
   private static final QName SMARTTAGTYPE$186 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "smartTagType");
   private static final QName SCHEMALIBRARY$188 = new QName("http://schemas.openxmlformats.org/schemaLibrary/2006/main", "schemaLibrary");
   private static final QName SHAPEDEFAULTS$190 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shapeDefaults");
   private static final QName DONOTEMBEDSMARTTAGS$192 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "doNotEmbedSmartTags");
   private static final QName DECIMALSYMBOL$194 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "decimalSymbol");
   private static final QName LISTSEPARATOR$196 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "listSeparator");


   public CTSettingsImpl(SchemaType var1) {
      super(var1);
   }

   public CTWriteProtection getWriteProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWriteProtection var2 = null;
         var2 = (CTWriteProtection)this.get_store().find_element_user(WRITEPROTECTION$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetWriteProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(WRITEPROTECTION$0) != 0;
      }
   }

   public void setWriteProtection(CTWriteProtection var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWriteProtection var3 = null;
         var3 = (CTWriteProtection)this.get_store().find_element_user(WRITEPROTECTION$0, 0);
         if(var3 == null) {
            var3 = (CTWriteProtection)this.get_store().add_element_user(WRITEPROTECTION$0);
         }

         var3.set(var1);
      }
   }

   public CTWriteProtection addNewWriteProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWriteProtection var2 = null;
         var2 = (CTWriteProtection)this.get_store().add_element_user(WRITEPROTECTION$0);
         return var2;
      }
   }

   public void unsetWriteProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(WRITEPROTECTION$0, 0);
      }
   }

   public CTView getView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTView var2 = null;
         var2 = (CTView)this.get_store().find_element_user(VIEW$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(VIEW$2) != 0;
      }
   }

   public void setView(CTView var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTView var3 = null;
         var3 = (CTView)this.get_store().find_element_user(VIEW$2, 0);
         if(var3 == null) {
            var3 = (CTView)this.get_store().add_element_user(VIEW$2);
         }

         var3.set(var1);
      }
   }

   public CTView addNewView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTView var2 = null;
         var2 = (CTView)this.get_store().add_element_user(VIEW$2);
         return var2;
      }
   }

   public void unsetView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(VIEW$2, 0);
      }
   }

   public CTZoom getZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTZoom var2 = null;
         var2 = (CTZoom)this.get_store().find_element_user(ZOOM$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ZOOM$4) != 0;
      }
   }

   public void setZoom(CTZoom var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTZoom var3 = null;
         var3 = (CTZoom)this.get_store().find_element_user(ZOOM$4, 0);
         if(var3 == null) {
            var3 = (CTZoom)this.get_store().add_element_user(ZOOM$4);
         }

         var3.set(var1);
      }
   }

   public CTZoom addNewZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTZoom var2 = null;
         var2 = (CTZoom)this.get_store().add_element_user(ZOOM$4);
         return var2;
      }
   }

   public void unsetZoom() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ZOOM$4, 0);
      }
   }

   public CTOnOff getRemovePersonalInformation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(REMOVEPERSONALINFORMATION$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRemovePersonalInformation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REMOVEPERSONALINFORMATION$6) != 0;
      }
   }

   public void setRemovePersonalInformation(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(REMOVEPERSONALINFORMATION$6, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(REMOVEPERSONALINFORMATION$6);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewRemovePersonalInformation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(REMOVEPERSONALINFORMATION$6);
         return var2;
      }
   }

   public void unsetRemovePersonalInformation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REMOVEPERSONALINFORMATION$6, 0);
      }
   }

   public CTOnOff getRemoveDateAndTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(REMOVEDATEANDTIME$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRemoveDateAndTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REMOVEDATEANDTIME$8) != 0;
      }
   }

   public void setRemoveDateAndTime(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(REMOVEDATEANDTIME$8, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(REMOVEDATEANDTIME$8);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewRemoveDateAndTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(REMOVEDATEANDTIME$8);
         return var2;
      }
   }

   public void unsetRemoveDateAndTime() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REMOVEDATEANDTIME$8, 0);
      }
   }

   public CTOnOff getDoNotDisplayPageBoundaries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTDISPLAYPAGEBOUNDARIES$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotDisplayPageBoundaries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTDISPLAYPAGEBOUNDARIES$10) != 0;
      }
   }

   public void setDoNotDisplayPageBoundaries(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTDISPLAYPAGEBOUNDARIES$10, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTDISPLAYPAGEBOUNDARIES$10);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotDisplayPageBoundaries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTDISPLAYPAGEBOUNDARIES$10);
         return var2;
      }
   }

   public void unsetDoNotDisplayPageBoundaries() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTDISPLAYPAGEBOUNDARIES$10, 0);
      }
   }

   public CTOnOff getDisplayBackgroundShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DISPLAYBACKGROUNDSHAPE$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDisplayBackgroundShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DISPLAYBACKGROUNDSHAPE$12) != 0;
      }
   }

   public void setDisplayBackgroundShape(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DISPLAYBACKGROUNDSHAPE$12, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DISPLAYBACKGROUNDSHAPE$12);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDisplayBackgroundShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DISPLAYBACKGROUNDSHAPE$12);
         return var2;
      }
   }

   public void unsetDisplayBackgroundShape() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DISPLAYBACKGROUNDSHAPE$12, 0);
      }
   }

   public CTOnOff getPrintPostScriptOverText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PRINTPOSTSCRIPTOVERTEXT$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintPostScriptOverText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTPOSTSCRIPTOVERTEXT$14) != 0;
      }
   }

   public void setPrintPostScriptOverText(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PRINTPOSTSCRIPTOVERTEXT$14, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PRINTPOSTSCRIPTOVERTEXT$14);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPrintPostScriptOverText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PRINTPOSTSCRIPTOVERTEXT$14);
         return var2;
      }
   }

   public void unsetPrintPostScriptOverText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTPOSTSCRIPTOVERTEXT$14, 0);
      }
   }

   public CTOnOff getPrintFractionalCharacterWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PRINTFRACTIONALCHARACTERWIDTH$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintFractionalCharacterWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTFRACTIONALCHARACTERWIDTH$16) != 0;
      }
   }

   public void setPrintFractionalCharacterWidth(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PRINTFRACTIONALCHARACTERWIDTH$16, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PRINTFRACTIONALCHARACTERWIDTH$16);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPrintFractionalCharacterWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PRINTFRACTIONALCHARACTERWIDTH$16);
         return var2;
      }
   }

   public void unsetPrintFractionalCharacterWidth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTFRACTIONALCHARACTERWIDTH$16, 0);
      }
   }

   public CTOnOff getPrintFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PRINTFORMSDATA$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTFORMSDATA$18) != 0;
      }
   }

   public void setPrintFormsData(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PRINTFORMSDATA$18, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PRINTFORMSDATA$18);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPrintFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PRINTFORMSDATA$18);
         return var2;
      }
   }

   public void unsetPrintFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTFORMSDATA$18, 0);
      }
   }

   public CTOnOff getEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(EMBEDTRUETYPEFONTS$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EMBEDTRUETYPEFONTS$20) != 0;
      }
   }

   public void setEmbedTrueTypeFonts(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(EMBEDTRUETYPEFONTS$20, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(EMBEDTRUETYPEFONTS$20);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(EMBEDTRUETYPEFONTS$20);
         return var2;
      }
   }

   public void unsetEmbedTrueTypeFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EMBEDTRUETYPEFONTS$20, 0);
      }
   }

   public CTOnOff getEmbedSystemFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(EMBEDSYSTEMFONTS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEmbedSystemFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EMBEDSYSTEMFONTS$22) != 0;
      }
   }

   public void setEmbedSystemFonts(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(EMBEDSYSTEMFONTS$22, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(EMBEDSYSTEMFONTS$22);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewEmbedSystemFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(EMBEDSYSTEMFONTS$22);
         return var2;
      }
   }

   public void unsetEmbedSystemFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EMBEDSYSTEMFONTS$22, 0);
      }
   }

   public CTOnOff getSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SAVESUBSETFONTS$24, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAVESUBSETFONTS$24) != 0;
      }
   }

   public void setSaveSubsetFonts(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SAVESUBSETFONTS$24, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SAVESUBSETFONTS$24);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SAVESUBSETFONTS$24);
         return var2;
      }
   }

   public void unsetSaveSubsetFonts() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAVESUBSETFONTS$24, 0);
      }
   }

   public CTOnOff getSaveFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SAVEFORMSDATA$26, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSaveFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAVEFORMSDATA$26) != 0;
      }
   }

   public void setSaveFormsData(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SAVEFORMSDATA$26, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SAVEFORMSDATA$26);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSaveFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SAVEFORMSDATA$26);
         return var2;
      }
   }

   public void unsetSaveFormsData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAVEFORMSDATA$26, 0);
      }
   }

   public CTOnOff getMirrorMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(MIRRORMARGINS$28, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMirrorMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MIRRORMARGINS$28) != 0;
      }
   }

   public void setMirrorMargins(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(MIRRORMARGINS$28, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(MIRRORMARGINS$28);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewMirrorMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(MIRRORMARGINS$28);
         return var2;
      }
   }

   public void unsetMirrorMargins() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MIRRORMARGINS$28, 0);
      }
   }

   public CTOnOff getAlignBordersAndEdges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(ALIGNBORDERSANDEDGES$30, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAlignBordersAndEdges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALIGNBORDERSANDEDGES$30) != 0;
      }
   }

   public void setAlignBordersAndEdges(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ALIGNBORDERSANDEDGES$30, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(ALIGNBORDERSANDEDGES$30);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAlignBordersAndEdges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ALIGNBORDERSANDEDGES$30);
         return var2;
      }
   }

   public void unsetAlignBordersAndEdges() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALIGNBORDERSANDEDGES$30, 0);
      }
   }

   public CTOnOff getBordersDoNotSurroundHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BORDERSDONOTSURROUNDHEADER$32, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBordersDoNotSurroundHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERSDONOTSURROUNDHEADER$32) != 0;
      }
   }

   public void setBordersDoNotSurroundHeader(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BORDERSDONOTSURROUNDHEADER$32, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BORDERSDONOTSURROUNDHEADER$32);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBordersDoNotSurroundHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BORDERSDONOTSURROUNDHEADER$32);
         return var2;
      }
   }

   public void unsetBordersDoNotSurroundHeader() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERSDONOTSURROUNDHEADER$32, 0);
      }
   }

   public CTOnOff getBordersDoNotSurroundFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BORDERSDONOTSURROUNDFOOTER$34, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBordersDoNotSurroundFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BORDERSDONOTSURROUNDFOOTER$34) != 0;
      }
   }

   public void setBordersDoNotSurroundFooter(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BORDERSDONOTSURROUNDFOOTER$34, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BORDERSDONOTSURROUNDFOOTER$34);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBordersDoNotSurroundFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BORDERSDONOTSURROUNDFOOTER$34);
         return var2;
      }
   }

   public void unsetBordersDoNotSurroundFooter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BORDERSDONOTSURROUNDFOOTER$34, 0);
      }
   }

   public CTOnOff getGutterAtTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(GUTTERATTOP$36, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGutterAtTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GUTTERATTOP$36) != 0;
      }
   }

   public void setGutterAtTop(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(GUTTERATTOP$36, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(GUTTERATTOP$36);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewGutterAtTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(GUTTERATTOP$36);
         return var2;
      }
   }

   public void unsetGutterAtTop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GUTTERATTOP$36, 0);
      }
   }

   public CTOnOff getHideSpellingErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(HIDESPELLINGERRORS$38, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHideSpellingErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIDESPELLINGERRORS$38) != 0;
      }
   }

   public void setHideSpellingErrors(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(HIDESPELLINGERRORS$38, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(HIDESPELLINGERRORS$38);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewHideSpellingErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(HIDESPELLINGERRORS$38);
         return var2;
      }
   }

   public void unsetHideSpellingErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIDESPELLINGERRORS$38, 0);
      }
   }

   public CTOnOff getHideGrammaticalErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(HIDEGRAMMATICALERRORS$40, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHideGrammaticalErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HIDEGRAMMATICALERRORS$40) != 0;
      }
   }

   public void setHideGrammaticalErrors(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(HIDEGRAMMATICALERRORS$40, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(HIDEGRAMMATICALERRORS$40);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewHideGrammaticalErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(HIDEGRAMMATICALERRORS$40);
         return var2;
      }
   }

   public void unsetHideGrammaticalErrors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HIDEGRAMMATICALERRORS$40, 0);
      }
   }

   public List getActiveWritingStyleList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1ActiveWritingStyleList(this);
      }
   }

   public CTWritingStyle[] getActiveWritingStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ACTIVEWRITINGSTYLE$42, var2);
         CTWritingStyle[] var3 = new CTWritingStyle[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTWritingStyle getActiveWritingStyleArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWritingStyle var3 = null;
         var3 = (CTWritingStyle)this.get_store().find_element_user(ACTIVEWRITINGSTYLE$42, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfActiveWritingStyleArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ACTIVEWRITINGSTYLE$42);
      }
   }

   public void setActiveWritingStyleArray(CTWritingStyle[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ACTIVEWRITINGSTYLE$42);
      }
   }

   public void setActiveWritingStyleArray(int var1, CTWritingStyle var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWritingStyle var4 = null;
         var4 = (CTWritingStyle)this.get_store().find_element_user(ACTIVEWRITINGSTYLE$42, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTWritingStyle insertNewActiveWritingStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWritingStyle var3 = null;
         var3 = (CTWritingStyle)this.get_store().insert_element_user(ACTIVEWRITINGSTYLE$42, var1);
         return var3;
      }
   }

   public CTWritingStyle addNewActiveWritingStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTWritingStyle var2 = null;
         var2 = (CTWritingStyle)this.get_store().add_element_user(ACTIVEWRITINGSTYLE$42);
         return var2;
      }
   }

   public void removeActiveWritingStyle(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ACTIVEWRITINGSTYLE$42, var1);
      }
   }

   public CTProof getProofState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProof var2 = null;
         var2 = (CTProof)this.get_store().find_element_user(PROOFSTATE$44, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProofState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROOFSTATE$44) != 0;
      }
   }

   public void setProofState(CTProof var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProof var3 = null;
         var3 = (CTProof)this.get_store().find_element_user(PROOFSTATE$44, 0);
         if(var3 == null) {
            var3 = (CTProof)this.get_store().add_element_user(PROOFSTATE$44);
         }

         var3.set(var1);
      }
   }

   public CTProof addNewProofState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTProof var2 = null;
         var2 = (CTProof)this.get_store().add_element_user(PROOFSTATE$44);
         return var2;
      }
   }

   public void unsetProofState() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROOFSTATE$44, 0);
      }
   }

   public CTOnOff getFormsDesign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(FORMSDESIGN$46, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFormsDesign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORMSDESIGN$46) != 0;
      }
   }

   public void setFormsDesign(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(FORMSDESIGN$46, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(FORMSDESIGN$46);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewFormsDesign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(FORMSDESIGN$46);
         return var2;
      }
   }

   public void unsetFormsDesign() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORMSDESIGN$46, 0);
      }
   }

   public CTRel getAttachedTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().find_element_user(ATTACHEDTEMPLATE$48, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAttachedTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTACHEDTEMPLATE$48) != 0;
      }
   }

   public void setAttachedTemplate(CTRel var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var3 = null;
         var3 = (CTRel)this.get_store().find_element_user(ATTACHEDTEMPLATE$48, 0);
         if(var3 == null) {
            var3 = (CTRel)this.get_store().add_element_user(ATTACHEDTEMPLATE$48);
         }

         var3.set(var1);
      }
   }

   public CTRel addNewAttachedTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTRel var2 = null;
         var2 = (CTRel)this.get_store().add_element_user(ATTACHEDTEMPLATE$48);
         return var2;
      }
   }

   public void unsetAttachedTemplate() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTACHEDTEMPLATE$48, 0);
      }
   }

   public CTOnOff getLinkStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(LINKSTYLES$50, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetLinkStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LINKSTYLES$50) != 0;
      }
   }

   public void setLinkStyles(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(LINKSTYLES$50, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(LINKSTYLES$50);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewLinkStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(LINKSTYLES$50);
         return var2;
      }
   }

   public void unsetLinkStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LINKSTYLES$50, 0);
      }
   }

   public CTShortHexNumber getStylePaneFormatFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().find_element_user(STYLEPANEFORMATFILTER$52, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStylePaneFormatFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLEPANEFORMATFILTER$52) != 0;
      }
   }

   public void setStylePaneFormatFilter(CTShortHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var3 = null;
         var3 = (CTShortHexNumber)this.get_store().find_element_user(STYLEPANEFORMATFILTER$52, 0);
         if(var3 == null) {
            var3 = (CTShortHexNumber)this.get_store().add_element_user(STYLEPANEFORMATFILTER$52);
         }

         var3.set(var1);
      }
   }

   public CTShortHexNumber addNewStylePaneFormatFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().add_element_user(STYLEPANEFORMATFILTER$52);
         return var2;
      }
   }

   public void unsetStylePaneFormatFilter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLEPANEFORMATFILTER$52, 0);
      }
   }

   public CTShortHexNumber getStylePaneSortMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().find_element_user(STYLEPANESORTMETHOD$54, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStylePaneSortMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLEPANESORTMETHOD$54) != 0;
      }
   }

   public void setStylePaneSortMethod(CTShortHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var3 = null;
         var3 = (CTShortHexNumber)this.get_store().find_element_user(STYLEPANESORTMETHOD$54, 0);
         if(var3 == null) {
            var3 = (CTShortHexNumber)this.get_store().add_element_user(STYLEPANESORTMETHOD$54);
         }

         var3.set(var1);
      }
   }

   public CTShortHexNumber addNewStylePaneSortMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShortHexNumber var2 = null;
         var2 = (CTShortHexNumber)this.get_store().add_element_user(STYLEPANESORTMETHOD$54);
         return var2;
      }
   }

   public void unsetStylePaneSortMethod() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLEPANESORTMETHOD$54, 0);
      }
   }

   public CTDocType getDocumentType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocType var2 = null;
         var2 = (CTDocType)this.get_store().find_element_user(DOCUMENTTYPE$56, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocumentType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCUMENTTYPE$56) != 0;
      }
   }

   public void setDocumentType(CTDocType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocType var3 = null;
         var3 = (CTDocType)this.get_store().find_element_user(DOCUMENTTYPE$56, 0);
         if(var3 == null) {
            var3 = (CTDocType)this.get_store().add_element_user(DOCUMENTTYPE$56);
         }

         var3.set(var1);
      }
   }

   public CTDocType addNewDocumentType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocType var2 = null;
         var2 = (CTDocType)this.get_store().add_element_user(DOCUMENTTYPE$56);
         return var2;
      }
   }

   public void unsetDocumentType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCUMENTTYPE$56, 0);
      }
   }

   public CTMailMerge getMailMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMailMerge var2 = null;
         var2 = (CTMailMerge)this.get_store().find_element_user(MAILMERGE$58, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMailMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MAILMERGE$58) != 0;
      }
   }

   public void setMailMerge(CTMailMerge var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMailMerge var3 = null;
         var3 = (CTMailMerge)this.get_store().find_element_user(MAILMERGE$58, 0);
         if(var3 == null) {
            var3 = (CTMailMerge)this.get_store().add_element_user(MAILMERGE$58);
         }

         var3.set(var1);
      }
   }

   public CTMailMerge addNewMailMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMailMerge var2 = null;
         var2 = (CTMailMerge)this.get_store().add_element_user(MAILMERGE$58);
         return var2;
      }
   }

   public void unsetMailMerge() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MAILMERGE$58, 0);
      }
   }

   public CTTrackChangesView getRevisionView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangesView var2 = null;
         var2 = (CTTrackChangesView)this.get_store().find_element_user(REVISIONVIEW$60, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRevisionView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(REVISIONVIEW$60) != 0;
      }
   }

   public void setRevisionView(CTTrackChangesView var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangesView var3 = null;
         var3 = (CTTrackChangesView)this.get_store().find_element_user(REVISIONVIEW$60, 0);
         if(var3 == null) {
            var3 = (CTTrackChangesView)this.get_store().add_element_user(REVISIONVIEW$60);
         }

         var3.set(var1);
      }
   }

   public CTTrackChangesView addNewRevisionView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTrackChangesView var2 = null;
         var2 = (CTTrackChangesView)this.get_store().add_element_user(REVISIONVIEW$60);
         return var2;
      }
   }

   public void unsetRevisionView() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(REVISIONVIEW$60, 0);
      }
   }

   public CTOnOff getTrackRevisions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(TRACKREVISIONS$62, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetTrackRevisions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(TRACKREVISIONS$62) != 0;
      }
   }

   public void setTrackRevisions(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(TRACKREVISIONS$62, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(TRACKREVISIONS$62);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewTrackRevisions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(TRACKREVISIONS$62);
         return var2;
      }
   }

   public void unsetTrackRevisions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(TRACKREVISIONS$62, 0);
      }
   }

   public CTOnOff getDoNotTrackMoves() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTTRACKMOVES$64, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotTrackMoves() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTTRACKMOVES$64) != 0;
      }
   }

   public void setDoNotTrackMoves(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTTRACKMOVES$64, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTTRACKMOVES$64);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotTrackMoves() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTTRACKMOVES$64);
         return var2;
      }
   }

   public void unsetDoNotTrackMoves() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTTRACKMOVES$64, 0);
      }
   }

   public CTOnOff getDoNotTrackFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTTRACKFORMATTING$66, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotTrackFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTTRACKFORMATTING$66) != 0;
      }
   }

   public void setDoNotTrackFormatting(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTTRACKFORMATTING$66, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTTRACKFORMATTING$66);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotTrackFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTTRACKFORMATTING$66);
         return var2;
      }
   }

   public void unsetDoNotTrackFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTTRACKFORMATTING$66, 0);
      }
   }

   public CTDocProtect getDocumentProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocProtect var2 = null;
         var2 = (CTDocProtect)this.get_store().find_element_user(DOCUMENTPROTECTION$68, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocumentProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCUMENTPROTECTION$68) != 0;
      }
   }

   public void setDocumentProtection(CTDocProtect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocProtect var3 = null;
         var3 = (CTDocProtect)this.get_store().find_element_user(DOCUMENTPROTECTION$68, 0);
         if(var3 == null) {
            var3 = (CTDocProtect)this.get_store().add_element_user(DOCUMENTPROTECTION$68);
         }

         var3.set(var1);
      }
   }

   public CTDocProtect addNewDocumentProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocProtect var2 = null;
         var2 = (CTDocProtect)this.get_store().add_element_user(DOCUMENTPROTECTION$68);
         return var2;
      }
   }

   public void unsetDocumentProtection() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCUMENTPROTECTION$68, 0);
      }
   }

   public CTOnOff getAutoFormatOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(AUTOFORMATOVERRIDE$70, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoFormatOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOFORMATOVERRIDE$70) != 0;
      }
   }

   public void setAutoFormatOverride(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(AUTOFORMATOVERRIDE$70, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(AUTOFORMATOVERRIDE$70);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAutoFormatOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(AUTOFORMATOVERRIDE$70);
         return var2;
      }
   }

   public void unsetAutoFormatOverride() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOFORMATOVERRIDE$70, 0);
      }
   }

   public CTOnOff getStyleLockTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(STYLELOCKTHEME$72, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyleLockTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLELOCKTHEME$72) != 0;
      }
   }

   public void setStyleLockTheme(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(STYLELOCKTHEME$72, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(STYLELOCKTHEME$72);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewStyleLockTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(STYLELOCKTHEME$72);
         return var2;
      }
   }

   public void unsetStyleLockTheme() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLELOCKTHEME$72, 0);
      }
   }

   public CTOnOff getStyleLockQFSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(STYLELOCKQFSET$74, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStyleLockQFSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STYLELOCKQFSET$74) != 0;
      }
   }

   public void setStyleLockQFSet(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(STYLELOCKQFSET$74, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(STYLELOCKQFSET$74);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewStyleLockQFSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(STYLELOCKQFSET$74);
         return var2;
      }
   }

   public void unsetStyleLockQFSet() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STYLELOCKQFSET$74, 0);
      }
   }

   public CTTwipsMeasure getDefaultTabStop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().find_element_user(DEFAULTTABSTOP$76, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefaultTabStop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFAULTTABSTOP$76) != 0;
      }
   }

   public void setDefaultTabStop(CTTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var3 = null;
         var3 = (CTTwipsMeasure)this.get_store().find_element_user(DEFAULTTABSTOP$76, 0);
         if(var3 == null) {
            var3 = (CTTwipsMeasure)this.get_store().add_element_user(DEFAULTTABSTOP$76);
         }

         var3.set(var1);
      }
   }

   public CTTwipsMeasure addNewDefaultTabStop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().add_element_user(DEFAULTTABSTOP$76);
         return var2;
      }
   }

   public void unsetDefaultTabStop() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFAULTTABSTOP$76, 0);
      }
   }

   public CTOnOff getAutoHyphenation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(AUTOHYPHENATION$78, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAutoHyphenation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(AUTOHYPHENATION$78) != 0;
      }
   }

   public void setAutoHyphenation(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(AUTOHYPHENATION$78, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(AUTOHYPHENATION$78);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAutoHyphenation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(AUTOHYPHENATION$78);
         return var2;
      }
   }

   public void unsetAutoHyphenation() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(AUTOHYPHENATION$78, 0);
      }
   }

   public CTDecimalNumber getConsecutiveHyphenLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(CONSECUTIVEHYPHENLIMIT$80, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetConsecutiveHyphenLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CONSECUTIVEHYPHENLIMIT$80) != 0;
      }
   }

   public void setConsecutiveHyphenLimit(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(CONSECUTIVEHYPHENLIMIT$80, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(CONSECUTIVEHYPHENLIMIT$80);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewConsecutiveHyphenLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(CONSECUTIVEHYPHENLIMIT$80);
         return var2;
      }
   }

   public void unsetConsecutiveHyphenLimit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CONSECUTIVEHYPHENLIMIT$80, 0);
      }
   }

   public CTTwipsMeasure getHyphenationZone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().find_element_user(HYPHENATIONZONE$82, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHyphenationZone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HYPHENATIONZONE$82) != 0;
      }
   }

   public void setHyphenationZone(CTTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var3 = null;
         var3 = (CTTwipsMeasure)this.get_store().find_element_user(HYPHENATIONZONE$82, 0);
         if(var3 == null) {
            var3 = (CTTwipsMeasure)this.get_store().add_element_user(HYPHENATIONZONE$82);
         }

         var3.set(var1);
      }
   }

   public CTTwipsMeasure addNewHyphenationZone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().add_element_user(HYPHENATIONZONE$82);
         return var2;
      }
   }

   public void unsetHyphenationZone() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HYPHENATIONZONE$82, 0);
      }
   }

   public CTOnOff getDoNotHyphenateCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTHYPHENATECAPS$84, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotHyphenateCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTHYPHENATECAPS$84) != 0;
      }
   }

   public void setDoNotHyphenateCaps(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTHYPHENATECAPS$84, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTHYPHENATECAPS$84);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotHyphenateCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTHYPHENATECAPS$84);
         return var2;
      }
   }

   public void unsetDoNotHyphenateCaps() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTHYPHENATECAPS$84, 0);
      }
   }

   public CTOnOff getShowEnvelope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SHOWENVELOPE$86, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShowEnvelope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHOWENVELOPE$86) != 0;
      }
   }

   public void setShowEnvelope(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SHOWENVELOPE$86, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SHOWENVELOPE$86);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewShowEnvelope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SHOWENVELOPE$86);
         return var2;
      }
   }

   public void unsetShowEnvelope() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHOWENVELOPE$86, 0);
      }
   }

   public CTDecimalNumber getSummaryLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(SUMMARYLENGTH$88, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSummaryLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SUMMARYLENGTH$88) != 0;
      }
   }

   public void setSummaryLength(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(SUMMARYLENGTH$88, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(SUMMARYLENGTH$88);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewSummaryLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(SUMMARYLENGTH$88);
         return var2;
      }
   }

   public void unsetSummaryLength() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SUMMARYLENGTH$88, 0);
      }
   }

   public CTString getClickAndTypeStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(CLICKANDTYPESTYLE$90, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetClickAndTypeStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLICKANDTYPESTYLE$90) != 0;
      }
   }

   public void setClickAndTypeStyle(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(CLICKANDTYPESTYLE$90, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(CLICKANDTYPESTYLE$90);
         }

         var3.set(var1);
      }
   }

   public CTString addNewClickAndTypeStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(CLICKANDTYPESTYLE$90);
         return var2;
      }
   }

   public void unsetClickAndTypeStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLICKANDTYPESTYLE$90, 0);
      }
   }

   public CTString getDefaultTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(DEFAULTTABLESTYLE$92, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDefaultTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DEFAULTTABLESTYLE$92) != 0;
      }
   }

   public void setDefaultTableStyle(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(DEFAULTTABLESTYLE$92, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(DEFAULTTABLESTYLE$92);
         }

         var3.set(var1);
      }
   }

   public CTString addNewDefaultTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(DEFAULTTABLESTYLE$92);
         return var2;
      }
   }

   public void unsetDefaultTableStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DEFAULTTABLESTYLE$92, 0);
      }
   }

   public CTOnOff getEvenAndOddHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(EVENANDODDHEADERS$94, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEvenAndOddHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(EVENANDODDHEADERS$94) != 0;
      }
   }

   public void setEvenAndOddHeaders(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(EVENANDODDHEADERS$94, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(EVENANDODDHEADERS$94);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewEvenAndOddHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(EVENANDODDHEADERS$94);
         return var2;
      }
   }

   public void unsetEvenAndOddHeaders() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(EVENANDODDHEADERS$94, 0);
      }
   }

   public CTOnOff getBookFoldRevPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BOOKFOLDREVPRINTING$96, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBookFoldRevPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOKFOLDREVPRINTING$96) != 0;
      }
   }

   public void setBookFoldRevPrinting(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BOOKFOLDREVPRINTING$96, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BOOKFOLDREVPRINTING$96);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBookFoldRevPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BOOKFOLDREVPRINTING$96);
         return var2;
      }
   }

   public void unsetBookFoldRevPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKFOLDREVPRINTING$96, 0);
      }
   }

   public CTOnOff getBookFoldPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(BOOKFOLDPRINTING$98, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBookFoldPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOKFOLDPRINTING$98) != 0;
      }
   }

   public void setBookFoldPrinting(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(BOOKFOLDPRINTING$98, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(BOOKFOLDPRINTING$98);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewBookFoldPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(BOOKFOLDPRINTING$98);
         return var2;
      }
   }

   public void unsetBookFoldPrinting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKFOLDPRINTING$98, 0);
      }
   }

   public CTDecimalNumber getBookFoldPrintingSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(BOOKFOLDPRINTINGSHEETS$100, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetBookFoldPrintingSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(BOOKFOLDPRINTINGSHEETS$100) != 0;
      }
   }

   public void setBookFoldPrintingSheets(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(BOOKFOLDPRINTINGSHEETS$100, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(BOOKFOLDPRINTINGSHEETS$100);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewBookFoldPrintingSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(BOOKFOLDPRINTINGSHEETS$100);
         return var2;
      }
   }

   public void unsetBookFoldPrintingSheets() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(BOOKFOLDPRINTINGSHEETS$100, 0);
      }
   }

   public CTTwipsMeasure getDrawingGridHorizontalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDHORIZONTALSPACING$102, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDrawingGridHorizontalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWINGGRIDHORIZONTALSPACING$102) != 0;
      }
   }

   public void setDrawingGridHorizontalSpacing(CTTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var3 = null;
         var3 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDHORIZONTALSPACING$102, 0);
         if(var3 == null) {
            var3 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDHORIZONTALSPACING$102);
         }

         var3.set(var1);
      }
   }

   public CTTwipsMeasure addNewDrawingGridHorizontalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDHORIZONTALSPACING$102);
         return var2;
      }
   }

   public void unsetDrawingGridHorizontalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWINGGRIDHORIZONTALSPACING$102, 0);
      }
   }

   public CTTwipsMeasure getDrawingGridVerticalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDVERTICALSPACING$104, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDrawingGridVerticalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWINGGRIDVERTICALSPACING$104) != 0;
      }
   }

   public void setDrawingGridVerticalSpacing(CTTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var3 = null;
         var3 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDVERTICALSPACING$104, 0);
         if(var3 == null) {
            var3 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDVERTICALSPACING$104);
         }

         var3.set(var1);
      }
   }

   public CTTwipsMeasure addNewDrawingGridVerticalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDVERTICALSPACING$104);
         return var2;
      }
   }

   public void unsetDrawingGridVerticalSpacing() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWINGGRIDVERTICALSPACING$104, 0);
      }
   }

   public CTDecimalNumber getDisplayHorizontalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDisplayHorizontalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106) != 0;
      }
   }

   public void setDisplayHorizontalDrawingGridEvery(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewDisplayHorizontalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106);
         return var2;
      }
   }

   public void unsetDisplayHorizontalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DISPLAYHORIZONTALDRAWINGGRIDEVERY$106, 0);
      }
   }

   public CTDecimalNumber getDisplayVerticalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().find_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDisplayVerticalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DISPLAYVERTICALDRAWINGGRIDEVERY$108) != 0;
      }
   }

   public void setDisplayVerticalDrawingGridEvery(CTDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var3 = null;
         var3 = (CTDecimalNumber)this.get_store().find_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108, 0);
         if(var3 == null) {
            var3 = (CTDecimalNumber)this.get_store().add_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108);
         }

         var3.set(var1);
      }
   }

   public CTDecimalNumber addNewDisplayVerticalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDecimalNumber var2 = null;
         var2 = (CTDecimalNumber)this.get_store().add_element_user(DISPLAYVERTICALDRAWINGGRIDEVERY$108);
         return var2;
      }
   }

   public void unsetDisplayVerticalDrawingGridEvery() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DISPLAYVERTICALDRAWINGGRIDEVERY$108, 0);
      }
   }

   public CTOnOff getDoNotUseMarginsForDrawingGridOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotUseMarginsForDrawingGridOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110) != 0;
      }
   }

   public void setDoNotUseMarginsForDrawingGridOrigin(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotUseMarginsForDrawingGridOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110);
         return var2;
      }
   }

   public void unsetDoNotUseMarginsForDrawingGridOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTUSEMARGINSFORDRAWINGGRIDORIGIN$110, 0);
      }
   }

   public CTTwipsMeasure getDrawingGridHorizontalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDHORIZONTALORIGIN$112, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDrawingGridHorizontalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWINGGRIDHORIZONTALORIGIN$112) != 0;
      }
   }

   public void setDrawingGridHorizontalOrigin(CTTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var3 = null;
         var3 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDHORIZONTALORIGIN$112, 0);
         if(var3 == null) {
            var3 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDHORIZONTALORIGIN$112);
         }

         var3.set(var1);
      }
   }

   public CTTwipsMeasure addNewDrawingGridHorizontalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDHORIZONTALORIGIN$112);
         return var2;
      }
   }

   public void unsetDrawingGridHorizontalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWINGGRIDHORIZONTALORIGIN$112, 0);
      }
   }

   public CTTwipsMeasure getDrawingGridVerticalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDVERTICALORIGIN$114, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDrawingGridVerticalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DRAWINGGRIDVERTICALORIGIN$114) != 0;
      }
   }

   public void setDrawingGridVerticalOrigin(CTTwipsMeasure var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var3 = null;
         var3 = (CTTwipsMeasure)this.get_store().find_element_user(DRAWINGGRIDVERTICALORIGIN$114, 0);
         if(var3 == null) {
            var3 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDVERTICALORIGIN$114);
         }

         var3.set(var1);
      }
   }

   public CTTwipsMeasure addNewDrawingGridVerticalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTTwipsMeasure var2 = null;
         var2 = (CTTwipsMeasure)this.get_store().add_element_user(DRAWINGGRIDVERTICALORIGIN$114);
         return var2;
      }
   }

   public void unsetDrawingGridVerticalOrigin() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DRAWINGGRIDVERTICALORIGIN$114, 0);
      }
   }

   public CTOnOff getDoNotShadeFormData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTSHADEFORMDATA$116, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotShadeFormData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTSHADEFORMDATA$116) != 0;
      }
   }

   public void setDoNotShadeFormData(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTSHADEFORMDATA$116, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTSHADEFORMDATA$116);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotShadeFormData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTSHADEFORMDATA$116);
         return var2;
      }
   }

   public void unsetDoNotShadeFormData() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTSHADEFORMDATA$116, 0);
      }
   }

   public CTOnOff getNoPunctuationKerning() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(NOPUNCTUATIONKERNING$118, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoPunctuationKerning() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOPUNCTUATIONKERNING$118) != 0;
      }
   }

   public void setNoPunctuationKerning(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(NOPUNCTUATIONKERNING$118, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(NOPUNCTUATIONKERNING$118);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewNoPunctuationKerning() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(NOPUNCTUATIONKERNING$118);
         return var2;
      }
   }

   public void unsetNoPunctuationKerning() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOPUNCTUATIONKERNING$118, 0);
      }
   }

   public CTCharacterSpacing getCharacterSpacingControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCharacterSpacing var2 = null;
         var2 = (CTCharacterSpacing)this.get_store().find_element_user(CHARACTERSPACINGCONTROL$120, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCharacterSpacingControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CHARACTERSPACINGCONTROL$120) != 0;
      }
   }

   public void setCharacterSpacingControl(CTCharacterSpacing var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCharacterSpacing var3 = null;
         var3 = (CTCharacterSpacing)this.get_store().find_element_user(CHARACTERSPACINGCONTROL$120, 0);
         if(var3 == null) {
            var3 = (CTCharacterSpacing)this.get_store().add_element_user(CHARACTERSPACINGCONTROL$120);
         }

         var3.set(var1);
      }
   }

   public CTCharacterSpacing addNewCharacterSpacingControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCharacterSpacing var2 = null;
         var2 = (CTCharacterSpacing)this.get_store().add_element_user(CHARACTERSPACINGCONTROL$120);
         return var2;
      }
   }

   public void unsetCharacterSpacingControl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CHARACTERSPACINGCONTROL$120, 0);
      }
   }

   public CTOnOff getPrintTwoOnOne() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(PRINTTWOONONE$122, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetPrintTwoOnOne() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PRINTTWOONONE$122) != 0;
      }
   }

   public void setPrintTwoOnOne(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(PRINTTWOONONE$122, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(PRINTTWOONONE$122);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewPrintTwoOnOne() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(PRINTTWOONONE$122);
         return var2;
      }
   }

   public void unsetPrintTwoOnOne() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PRINTTWOONONE$122, 0);
      }
   }

   public CTOnOff getStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(STRICTFIRSTANDLASTCHARS$124, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(STRICTFIRSTANDLASTCHARS$124) != 0;
      }
   }

   public void setStrictFirstAndLastChars(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(STRICTFIRSTANDLASTCHARS$124, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(STRICTFIRSTANDLASTCHARS$124);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(STRICTFIRSTANDLASTCHARS$124);
         return var2;
      }
   }

   public void unsetStrictFirstAndLastChars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(STRICTFIRSTANDLASTCHARS$124, 0);
      }
   }

   public CTKinsoku getNoLineBreaksAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var2 = null;
         var2 = (CTKinsoku)this.get_store().find_element_user(NOLINEBREAKSAFTER$126, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoLineBreaksAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOLINEBREAKSAFTER$126) != 0;
      }
   }

   public void setNoLineBreaksAfter(CTKinsoku var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var3 = null;
         var3 = (CTKinsoku)this.get_store().find_element_user(NOLINEBREAKSAFTER$126, 0);
         if(var3 == null) {
            var3 = (CTKinsoku)this.get_store().add_element_user(NOLINEBREAKSAFTER$126);
         }

         var3.set(var1);
      }
   }

   public CTKinsoku addNewNoLineBreaksAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var2 = null;
         var2 = (CTKinsoku)this.get_store().add_element_user(NOLINEBREAKSAFTER$126);
         return var2;
      }
   }

   public void unsetNoLineBreaksAfter() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOLINEBREAKSAFTER$126, 0);
      }
   }

   public CTKinsoku getNoLineBreaksBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var2 = null;
         var2 = (CTKinsoku)this.get_store().find_element_user(NOLINEBREAKSBEFORE$128, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetNoLineBreaksBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(NOLINEBREAKSBEFORE$128) != 0;
      }
   }

   public void setNoLineBreaksBefore(CTKinsoku var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var3 = null;
         var3 = (CTKinsoku)this.get_store().find_element_user(NOLINEBREAKSBEFORE$128, 0);
         if(var3 == null) {
            var3 = (CTKinsoku)this.get_store().add_element_user(NOLINEBREAKSBEFORE$128);
         }

         var3.set(var1);
      }
   }

   public CTKinsoku addNewNoLineBreaksBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTKinsoku var2 = null;
         var2 = (CTKinsoku)this.get_store().add_element_user(NOLINEBREAKSBEFORE$128);
         return var2;
      }
   }

   public void unsetNoLineBreaksBefore() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(NOLINEBREAKSBEFORE$128, 0);
      }
   }

   public CTOnOff getSavePreviewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SAVEPREVIEWPICTURE$130, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSavePreviewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAVEPREVIEWPICTURE$130) != 0;
      }
   }

   public void setSavePreviewPicture(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SAVEPREVIEWPICTURE$130, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SAVEPREVIEWPICTURE$130);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSavePreviewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SAVEPREVIEWPICTURE$130);
         return var2;
      }
   }

   public void unsetSavePreviewPicture() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAVEPREVIEWPICTURE$130, 0);
      }
   }

   public CTOnOff getDoNotValidateAgainstSchema() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTVALIDATEAGAINSTSCHEMA$132, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotValidateAgainstSchema() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTVALIDATEAGAINSTSCHEMA$132) != 0;
      }
   }

   public void setDoNotValidateAgainstSchema(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTVALIDATEAGAINSTSCHEMA$132, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTVALIDATEAGAINSTSCHEMA$132);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotValidateAgainstSchema() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTVALIDATEAGAINSTSCHEMA$132);
         return var2;
      }
   }

   public void unsetDoNotValidateAgainstSchema() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTVALIDATEAGAINSTSCHEMA$132, 0);
      }
   }

   public CTOnOff getSaveInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SAVEINVALIDXML$134, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSaveInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAVEINVALIDXML$134) != 0;
      }
   }

   public void setSaveInvalidXml(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SAVEINVALIDXML$134, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SAVEINVALIDXML$134);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSaveInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SAVEINVALIDXML$134);
         return var2;
      }
   }

   public void unsetSaveInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAVEINVALIDXML$134, 0);
      }
   }

   public CTOnOff getIgnoreMixedContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(IGNOREMIXEDCONTENT$136, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetIgnoreMixedContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(IGNOREMIXEDCONTENT$136) != 0;
      }
   }

   public void setIgnoreMixedContent(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(IGNOREMIXEDCONTENT$136, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(IGNOREMIXEDCONTENT$136);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewIgnoreMixedContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(IGNOREMIXEDCONTENT$136);
         return var2;
      }
   }

   public void unsetIgnoreMixedContent() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(IGNOREMIXEDCONTENT$136, 0);
      }
   }

   public CTOnOff getAlwaysShowPlaceholderText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAlwaysShowPlaceholderText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALWAYSSHOWPLACEHOLDERTEXT$138) != 0;
      }
   }

   public void setAlwaysShowPlaceholderText(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAlwaysShowPlaceholderText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ALWAYSSHOWPLACEHOLDERTEXT$138);
         return var2;
      }
   }

   public void unsetAlwaysShowPlaceholderText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALWAYSSHOWPLACEHOLDERTEXT$138, 0);
      }
   }

   public CTOnOff getDoNotDemarcateInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTDEMARCATEINVALIDXML$140, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotDemarcateInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTDEMARCATEINVALIDXML$140) != 0;
      }
   }

   public void setDoNotDemarcateInvalidXml(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTDEMARCATEINVALIDXML$140, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTDEMARCATEINVALIDXML$140);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotDemarcateInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTDEMARCATEINVALIDXML$140);
         return var2;
      }
   }

   public void unsetDoNotDemarcateInvalidXml() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTDEMARCATEINVALIDXML$140, 0);
      }
   }

   public CTOnOff getSaveXmlDataOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SAVEXMLDATAONLY$142, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSaveXmlDataOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAVEXMLDATAONLY$142) != 0;
      }
   }

   public void setSaveXmlDataOnly(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SAVEXMLDATAONLY$142, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SAVEXMLDATAONLY$142);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewSaveXmlDataOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SAVEXMLDATAONLY$142);
         return var2;
      }
   }

   public void unsetSaveXmlDataOnly() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAVEXMLDATAONLY$142, 0);
      }
   }

   public CTOnOff getUseXSLTWhenSaving() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(USEXSLTWHENSAVING$144, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUseXSLTWhenSaving() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(USEXSLTWHENSAVING$144) != 0;
      }
   }

   public void setUseXSLTWhenSaving(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(USEXSLTWHENSAVING$144, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(USEXSLTWHENSAVING$144);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewUseXSLTWhenSaving() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(USEXSLTWHENSAVING$144);
         return var2;
      }
   }

   public void unsetUseXSLTWhenSaving() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(USEXSLTWHENSAVING$144, 0);
      }
   }

   public CTSaveThroughXslt getSaveThroughXslt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSaveThroughXslt var2 = null;
         var2 = (CTSaveThroughXslt)this.get_store().find_element_user(SAVETHROUGHXSLT$146, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSaveThroughXslt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SAVETHROUGHXSLT$146) != 0;
      }
   }

   public void setSaveThroughXslt(CTSaveThroughXslt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSaveThroughXslt var3 = null;
         var3 = (CTSaveThroughXslt)this.get_store().find_element_user(SAVETHROUGHXSLT$146, 0);
         if(var3 == null) {
            var3 = (CTSaveThroughXslt)this.get_store().add_element_user(SAVETHROUGHXSLT$146);
         }

         var3.set(var1);
      }
   }

   public CTSaveThroughXslt addNewSaveThroughXslt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSaveThroughXslt var2 = null;
         var2 = (CTSaveThroughXslt)this.get_store().add_element_user(SAVETHROUGHXSLT$146);
         return var2;
      }
   }

   public void unsetSaveThroughXslt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SAVETHROUGHXSLT$146, 0);
      }
   }

   public CTOnOff getShowXMLTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(SHOWXMLTAGS$148, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShowXMLTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHOWXMLTAGS$148) != 0;
      }
   }

   public void setShowXMLTags(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(SHOWXMLTAGS$148, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(SHOWXMLTAGS$148);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewShowXMLTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(SHOWXMLTAGS$148);
         return var2;
      }
   }

   public void unsetShowXMLTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHOWXMLTAGS$148, 0);
      }
   }

   public CTOnOff getAlwaysMergeEmptyNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(ALWAYSMERGEEMPTYNAMESPACE$150, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAlwaysMergeEmptyNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ALWAYSMERGEEMPTYNAMESPACE$150) != 0;
      }
   }

   public void setAlwaysMergeEmptyNamespace(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(ALWAYSMERGEEMPTYNAMESPACE$150, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(ALWAYSMERGEEMPTYNAMESPACE$150);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewAlwaysMergeEmptyNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(ALWAYSMERGEEMPTYNAMESPACE$150);
         return var2;
      }
   }

   public void unsetAlwaysMergeEmptyNamespace() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ALWAYSMERGEEMPTYNAMESPACE$150, 0);
      }
   }

   public CTOnOff getUpdateFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(UPDATEFIELDS$152, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUpdateFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UPDATEFIELDS$152) != 0;
      }
   }

   public void setUpdateFields(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(UPDATEFIELDS$152, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(UPDATEFIELDS$152);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewUpdateFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(UPDATEFIELDS$152);
         return var2;
      }
   }

   public void unsetUpdateFields() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UPDATEFIELDS$152, 0);
      }
   }

   public CTShapeDefaults getHdrShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeDefaults var2 = null;
         var2 = (CTShapeDefaults)this.get_store().find_element_user(HDRSHAPEDEFAULTS$154, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetHdrShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(HDRSHAPEDEFAULTS$154) != 0;
      }
   }

   public void setHdrShapeDefaults(CTShapeDefaults var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeDefaults var3 = null;
         var3 = (CTShapeDefaults)this.get_store().find_element_user(HDRSHAPEDEFAULTS$154, 0);
         if(var3 == null) {
            var3 = (CTShapeDefaults)this.get_store().add_element_user(HDRSHAPEDEFAULTS$154);
         }

         var3.set(var1);
      }
   }

   public CTShapeDefaults addNewHdrShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeDefaults var2 = null;
         var2 = (CTShapeDefaults)this.get_store().add_element_user(HDRSHAPEDEFAULTS$154);
         return var2;
      }
   }

   public void unsetHdrShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(HDRSHAPEDEFAULTS$154, 0);
      }
   }

   public CTFtnDocProps getFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnDocProps var2 = null;
         var2 = (CTFtnDocProps)this.get_store().find_element_user(FOOTNOTEPR$156, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FOOTNOTEPR$156) != 0;
      }
   }

   public void setFootnotePr(CTFtnDocProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnDocProps var3 = null;
         var3 = (CTFtnDocProps)this.get_store().find_element_user(FOOTNOTEPR$156, 0);
         if(var3 == null) {
            var3 = (CTFtnDocProps)this.get_store().add_element_user(FOOTNOTEPR$156);
         }

         var3.set(var1);
      }
   }

   public CTFtnDocProps addNewFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTFtnDocProps var2 = null;
         var2 = (CTFtnDocProps)this.get_store().add_element_user(FOOTNOTEPR$156);
         return var2;
      }
   }

   public void unsetFootnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FOOTNOTEPR$156, 0);
      }
   }

   public CTEdnDocProps getEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEdnDocProps var2 = null;
         var2 = (CTEdnDocProps)this.get_store().find_element_user(ENDNOTEPR$158, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ENDNOTEPR$158) != 0;
      }
   }

   public void setEndnotePr(CTEdnDocProps var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEdnDocProps var3 = null;
         var3 = (CTEdnDocProps)this.get_store().find_element_user(ENDNOTEPR$158, 0);
         if(var3 == null) {
            var3 = (CTEdnDocProps)this.get_store().add_element_user(ENDNOTEPR$158);
         }

         var3.set(var1);
      }
   }

   public CTEdnDocProps addNewEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEdnDocProps var2 = null;
         var2 = (CTEdnDocProps)this.get_store().add_element_user(ENDNOTEPR$158);
         return var2;
      }
   }

   public void unsetEndnotePr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ENDNOTEPR$158, 0);
      }
   }

   public CTCompat getCompat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCompat var2 = null;
         var2 = (CTCompat)this.get_store().find_element_user(COMPAT$160, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCompat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(COMPAT$160) != 0;
      }
   }

   public void setCompat(CTCompat var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCompat var3 = null;
         var3 = (CTCompat)this.get_store().find_element_user(COMPAT$160, 0);
         if(var3 == null) {
            var3 = (CTCompat)this.get_store().add_element_user(COMPAT$160);
         }

         var3.set(var1);
      }
   }

   public CTCompat addNewCompat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCompat var2 = null;
         var2 = (CTCompat)this.get_store().add_element_user(COMPAT$160);
         return var2;
      }
   }

   public void unsetCompat() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(COMPAT$160, 0);
      }
   }

   public CTDocVars getDocVars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocVars var2 = null;
         var2 = (CTDocVars)this.get_store().find_element_user(DOCVARS$162, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDocVars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DOCVARS$162) != 0;
      }
   }

   public void setDocVars(CTDocVars var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocVars var3 = null;
         var3 = (CTDocVars)this.get_store().find_element_user(DOCVARS$162, 0);
         if(var3 == null) {
            var3 = (CTDocVars)this.get_store().add_element_user(DOCVARS$162);
         }

         var3.set(var1);
      }
   }

   public CTDocVars addNewDocVars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocVars var2 = null;
         var2 = (CTDocVars)this.get_store().add_element_user(DOCVARS$162);
         return var2;
      }
   }

   public void unsetDocVars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DOCVARS$162, 0);
      }
   }

   public CTDocRsids getRsids() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocRsids var2 = null;
         var2 = (CTDocRsids)this.get_store().find_element_user(RSIDS$164, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetRsids() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(RSIDS$164) != 0;
      }
   }

   public void setRsids(CTDocRsids var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocRsids var3 = null;
         var3 = (CTDocRsids)this.get_store().find_element_user(RSIDS$164, 0);
         if(var3 == null) {
            var3 = (CTDocRsids)this.get_store().add_element_user(RSIDS$164);
         }

         var3.set(var1);
      }
   }

   public CTDocRsids addNewRsids() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTDocRsids var2 = null;
         var2 = (CTDocRsids)this.get_store().add_element_user(RSIDS$164);
         return var2;
      }
   }

   public void unsetRsids() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(RSIDS$164, 0);
      }
   }

   public CTMathPr getMathPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMathPr var2 = null;
         var2 = (CTMathPr)this.get_store().find_element_user(MATHPR$166, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetMathPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MATHPR$166) != 0;
      }
   }

   public void setMathPr(CTMathPr var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMathPr var3 = null;
         var3 = (CTMathPr)this.get_store().find_element_user(MATHPR$166, 0);
         if(var3 == null) {
            var3 = (CTMathPr)this.get_store().add_element_user(MATHPR$166);
         }

         var3.set(var1);
      }
   }

   public CTMathPr addNewMathPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTMathPr var2 = null;
         var2 = (CTMathPr)this.get_store().add_element_user(MATHPR$166);
         return var2;
      }
   }

   public void unsetMathPr() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MATHPR$166, 0);
      }
   }

   public CTOnOff getUiCompat97To2003() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(UICOMPAT97TO2003$168, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetUiCompat97To2003() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(UICOMPAT97TO2003$168) != 0;
      }
   }

   public void setUiCompat97To2003(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(UICOMPAT97TO2003$168, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(UICOMPAT97TO2003$168);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewUiCompat97To2003() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(UICOMPAT97TO2003$168);
         return var2;
      }
   }

   public void unsetUiCompat97To2003() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(UICOMPAT97TO2003$168, 0);
      }
   }

   public List getAttachedSchemaList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1AttachedSchemaList(this);
      }
   }

   public CTString[] getAttachedSchemaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(ATTACHEDSCHEMA$170, var2);
         CTString[] var3 = new CTString[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTString getAttachedSchemaArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(ATTACHEDSCHEMA$170, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfAttachedSchemaArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTACHEDSCHEMA$170);
      }
   }

   public void setAttachedSchemaArray(CTString[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, ATTACHEDSCHEMA$170);
      }
   }

   public void setAttachedSchemaArray(int var1, CTString var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var4 = null;
         var4 = (CTString)this.get_store().find_element_user(ATTACHEDSCHEMA$170, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTString insertNewAttachedSchema(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().insert_element_user(ATTACHEDSCHEMA$170, var1);
         return var3;
      }
   }

   public CTString addNewAttachedSchema() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(ATTACHEDSCHEMA$170);
         return var2;
      }
   }

   public void removeAttachedSchema(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTACHEDSCHEMA$170, var1);
      }
   }

   public CTLanguage getThemeFontLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLanguage var2 = null;
         var2 = (CTLanguage)this.get_store().find_element_user(THEMEFONTLANG$172, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetThemeFontLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(THEMEFONTLANG$172) != 0;
      }
   }

   public void setThemeFontLang(CTLanguage var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLanguage var3 = null;
         var3 = (CTLanguage)this.get_store().find_element_user(THEMEFONTLANG$172, 0);
         if(var3 == null) {
            var3 = (CTLanguage)this.get_store().add_element_user(THEMEFONTLANG$172);
         }

         var3.set(var1);
      }
   }

   public CTLanguage addNewThemeFontLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTLanguage var2 = null;
         var2 = (CTLanguage)this.get_store().add_element_user(THEMEFONTLANG$172);
         return var2;
      }
   }

   public void unsetThemeFontLang() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(THEMEFONTLANG$172, 0);
      }
   }

   public CTColorSchemeMapping getClrSchemeMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorSchemeMapping var2 = null;
         var2 = (CTColorSchemeMapping)this.get_store().find_element_user(CLRSCHEMEMAPPING$174, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetClrSchemeMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CLRSCHEMEMAPPING$174) != 0;
      }
   }

   public void setClrSchemeMapping(CTColorSchemeMapping var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorSchemeMapping var3 = null;
         var3 = (CTColorSchemeMapping)this.get_store().find_element_user(CLRSCHEMEMAPPING$174, 0);
         if(var3 == null) {
            var3 = (CTColorSchemeMapping)this.get_store().add_element_user(CLRSCHEMEMAPPING$174);
         }

         var3.set(var1);
      }
   }

   public CTColorSchemeMapping addNewClrSchemeMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTColorSchemeMapping var2 = null;
         var2 = (CTColorSchemeMapping)this.get_store().add_element_user(CLRSCHEMEMAPPING$174);
         return var2;
      }
   }

   public void unsetClrSchemeMapping() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CLRSCHEMEMAPPING$174, 0);
      }
   }

   public CTOnOff getDoNotIncludeSubdocsInStats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTINCLUDESUBDOCSINSTATS$176, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotIncludeSubdocsInStats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTINCLUDESUBDOCSINSTATS$176) != 0;
      }
   }

   public void setDoNotIncludeSubdocsInStats(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTINCLUDESUBDOCSINSTATS$176, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTINCLUDESUBDOCSINSTATS$176);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotIncludeSubdocsInStats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTINCLUDESUBDOCSINSTATS$176);
         return var2;
      }
   }

   public void unsetDoNotIncludeSubdocsInStats() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTINCLUDESUBDOCSINSTATS$176, 0);
      }
   }

   public CTOnOff getDoNotAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTAUTOCOMPRESSPICTURES$178, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTAUTOCOMPRESSPICTURES$178) != 0;
      }
   }

   public void setDoNotAutoCompressPictures(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTAUTOCOMPRESSPICTURES$178, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTAUTOCOMPRESSPICTURES$178);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTAUTOCOMPRESSPICTURES$178);
         return var2;
      }
   }

   public void unsetDoNotAutoCompressPictures() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTAUTOCOMPRESSPICTURES$178, 0);
      }
   }

   public CTEmpty getForceUpgrade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().find_element_user(FORCEUPGRADE$180, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetForceUpgrade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(FORCEUPGRADE$180) != 0;
      }
   }

   public void setForceUpgrade(CTEmpty var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var3 = null;
         var3 = (CTEmpty)this.get_store().find_element_user(FORCEUPGRADE$180, 0);
         if(var3 == null) {
            var3 = (CTEmpty)this.get_store().add_element_user(FORCEUPGRADE$180);
         }

         var3.set(var1);
      }
   }

   public CTEmpty addNewForceUpgrade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTEmpty var2 = null;
         var2 = (CTEmpty)this.get_store().add_element_user(FORCEUPGRADE$180);
         return var2;
      }
   }

   public void unsetForceUpgrade() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(FORCEUPGRADE$180, 0);
      }
   }

   public CTCaptions getCaptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCaptions var2 = null;
         var2 = (CTCaptions)this.get_store().find_element_user(CAPTIONS$182, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCaptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CAPTIONS$182) != 0;
      }
   }

   public void setCaptions(CTCaptions var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCaptions var3 = null;
         var3 = (CTCaptions)this.get_store().find_element_user(CAPTIONS$182, 0);
         if(var3 == null) {
            var3 = (CTCaptions)this.get_store().add_element_user(CAPTIONS$182);
         }

         var3.set(var1);
      }
   }

   public CTCaptions addNewCaptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTCaptions var2 = null;
         var2 = (CTCaptions)this.get_store().add_element_user(CAPTIONS$182);
         return var2;
      }
   }

   public void unsetCaptions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CAPTIONS$182, 0);
      }
   }

   public CTReadingModeInkLockDown getReadModeInkLockDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTReadingModeInkLockDown var2 = null;
         var2 = (CTReadingModeInkLockDown)this.get_store().find_element_user(READMODEINKLOCKDOWN$184, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetReadModeInkLockDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(READMODEINKLOCKDOWN$184) != 0;
      }
   }

   public void setReadModeInkLockDown(CTReadingModeInkLockDown var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTReadingModeInkLockDown var3 = null;
         var3 = (CTReadingModeInkLockDown)this.get_store().find_element_user(READMODEINKLOCKDOWN$184, 0);
         if(var3 == null) {
            var3 = (CTReadingModeInkLockDown)this.get_store().add_element_user(READMODEINKLOCKDOWN$184);
         }

         var3.set(var1);
      }
   }

   public CTReadingModeInkLockDown addNewReadModeInkLockDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTReadingModeInkLockDown var2 = null;
         var2 = (CTReadingModeInkLockDown)this.get_store().add_element_user(READMODEINKLOCKDOWN$184);
         return var2;
      }
   }

   public void unsetReadModeInkLockDown() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(READMODEINKLOCKDOWN$184, 0);
      }
   }

   public List getSmartTagTypeList() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return new 1SmartTagTypeList(this);
      }
   }

   public CTSmartTagType[] getSmartTagTypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ArrayList var2 = new ArrayList();
         this.get_store().find_all_element_users(SMARTTAGTYPE$186, var2);
         CTSmartTagType[] var3 = new CTSmartTagType[var2.size()];
         var2.toArray(var3);
         return var3;
      }
   }

   public CTSmartTagType getSmartTagTypeArray(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagType var3 = null;
         var3 = (CTSmartTagType)this.get_store().find_element_user(SMARTTAGTYPE$186, var1);
         if(var3 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3;
         }
      }
   }

   public int sizeOfSmartTagTypeArray() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SMARTTAGTYPE$186);
      }
   }

   public void setSmartTagTypeArray(CTSmartTagType[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.arraySetterHelper(var1, SMARTTAGTYPE$186);
      }
   }

   public void setSmartTagTypeArray(int var1, CTSmartTagType var2) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagType var4 = null;
         var4 = (CTSmartTagType)this.get_store().find_element_user(SMARTTAGTYPE$186, var1);
         if(var4 == null) {
            throw new IndexOutOfBoundsException();
         } else {
            var4.set(var2);
         }
      }
   }

   public CTSmartTagType insertNewSmartTagType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagType var3 = null;
         var3 = (CTSmartTagType)this.get_store().insert_element_user(SMARTTAGTYPE$186, var1);
         return var3;
      }
   }

   public CTSmartTagType addNewSmartTagType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSmartTagType var2 = null;
         var2 = (CTSmartTagType)this.get_store().add_element_user(SMARTTAGTYPE$186);
         return var2;
      }
   }

   public void removeSmartTagType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SMARTTAGTYPE$186, var1);
      }
   }

   public CTSchemaLibrary getSchemaLibrary() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemaLibrary var2 = null;
         var2 = (CTSchemaLibrary)this.get_store().find_element_user(SCHEMALIBRARY$188, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSchemaLibrary() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SCHEMALIBRARY$188) != 0;
      }
   }

   public void setSchemaLibrary(CTSchemaLibrary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemaLibrary var3 = null;
         var3 = (CTSchemaLibrary)this.get_store().find_element_user(SCHEMALIBRARY$188, 0);
         if(var3 == null) {
            var3 = (CTSchemaLibrary)this.get_store().add_element_user(SCHEMALIBRARY$188);
         }

         var3.set(var1);
      }
   }

   public CTSchemaLibrary addNewSchemaLibrary() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTSchemaLibrary var2 = null;
         var2 = (CTSchemaLibrary)this.get_store().add_element_user(SCHEMALIBRARY$188);
         return var2;
      }
   }

   public void unsetSchemaLibrary() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SCHEMALIBRARY$188, 0);
      }
   }

   public CTShapeDefaults getShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeDefaults var2 = null;
         var2 = (CTShapeDefaults)this.get_store().find_element_user(SHAPEDEFAULTS$190, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SHAPEDEFAULTS$190) != 0;
      }
   }

   public void setShapeDefaults(CTShapeDefaults var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeDefaults var3 = null;
         var3 = (CTShapeDefaults)this.get_store().find_element_user(SHAPEDEFAULTS$190, 0);
         if(var3 == null) {
            var3 = (CTShapeDefaults)this.get_store().add_element_user(SHAPEDEFAULTS$190);
         }

         var3.set(var1);
      }
   }

   public CTShapeDefaults addNewShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTShapeDefaults var2 = null;
         var2 = (CTShapeDefaults)this.get_store().add_element_user(SHAPEDEFAULTS$190);
         return var2;
      }
   }

   public void unsetShapeDefaults() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SHAPEDEFAULTS$190, 0);
      }
   }

   public CTOnOff getDoNotEmbedSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().find_element_user(DONOTEMBEDSMARTTAGS$192, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDoNotEmbedSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DONOTEMBEDSMARTTAGS$192) != 0;
      }
   }

   public void setDoNotEmbedSmartTags(CTOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var3 = null;
         var3 = (CTOnOff)this.get_store().find_element_user(DONOTEMBEDSMARTTAGS$192, 0);
         if(var3 == null) {
            var3 = (CTOnOff)this.get_store().add_element_user(DONOTEMBEDSMARTTAGS$192);
         }

         var3.set(var1);
      }
   }

   public CTOnOff addNewDoNotEmbedSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTOnOff var2 = null;
         var2 = (CTOnOff)this.get_store().add_element_user(DONOTEMBEDSMARTTAGS$192);
         return var2;
      }
   }

   public void unsetDoNotEmbedSmartTags() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DONOTEMBEDSMARTTAGS$192, 0);
      }
   }

   public CTString getDecimalSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(DECIMALSYMBOL$194, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDecimalSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DECIMALSYMBOL$194) != 0;
      }
   }

   public void setDecimalSymbol(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(DECIMALSYMBOL$194, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(DECIMALSYMBOL$194);
         }

         var3.set(var1);
      }
   }

   public CTString addNewDecimalSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(DECIMALSYMBOL$194);
         return var2;
      }
   }

   public void unsetDecimalSymbol() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DECIMALSYMBOL$194, 0);
      }
   }

   public CTString getListSeparator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().find_element_user(LISTSEPARATOR$196, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetListSeparator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(LISTSEPARATOR$196) != 0;
      }
   }

   public void setListSeparator(CTString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var3 = null;
         var3 = (CTString)this.get_store().find_element_user(LISTSEPARATOR$196, 0);
         if(var3 == null) {
            var3 = (CTString)this.get_store().add_element_user(LISTSEPARATOR$196);
         }

         var3.set(var1);
      }
   }

   public CTString addNewListSeparator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CTString var2 = null;
         var2 = (CTString)this.get_store().add_element_user(LISTSEPARATOR$196);
         return var2;
      }
   }

   public void unsetListSeparator() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(LISTSEPARATOR$196, 0);
      }
   }

}
