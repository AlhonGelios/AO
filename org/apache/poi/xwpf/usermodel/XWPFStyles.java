package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xwpf.usermodel.XWPFDefaultParagraphStyle;
import org.apache.poi.xwpf.usermodel.XWPFDefaultRunStyle;
import org.apache.poi.xwpf.usermodel.XWPFLatentStyles;
import org.apache.poi.xwpf.usermodel.XWPFStyle;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocDefaults;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.StylesDocument;

public class XWPFStyles extends POIXMLDocumentPart {

   private CTStyles ctStyles;
   private List listStyle;
   private XWPFLatentStyles latentStyles;
   private XWPFDefaultRunStyle defaultRunStyle;
   private XWPFDefaultParagraphStyle defaultParaStyle;


   public XWPFStyles(PackagePart part) throws IOException, OpenXML4JException {
      super(part);
      this.listStyle = new ArrayList();
   }

   @Deprecated
   public XWPFStyles(PackagePart part, PackageRelationship rel) throws IOException, OpenXML4JException {
      this(part);
   }

   public XWPFStyles() {
      this.listStyle = new ArrayList();
   }

   protected void onDocumentRead() throws IOException {
      InputStream is = this.getPackagePart().getInputStream();

      try {
         StylesDocument stylesDoc = StylesDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.setStyles(stylesDoc.getStyles());
         this.latentStyles = new XWPFLatentStyles(this.ctStyles.getLatentStyles(), this);
      } catch (XmlException var7) {
         throw new POIXMLException("Unable to read styles", var7);
      } finally {
         is.close();
      }

   }

   protected void commit() throws IOException {
      if(this.ctStyles == null) {
         throw new IllegalStateException("Unable to write out styles that were never read in!");
      } else {
         XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         xmlOptions.setSaveSyntheticDocumentElement(new QName(CTStyles.type.getName().getNamespaceURI(), "styles"));
         PackagePart part = this.getPackagePart();
         OutputStream out = part.getOutputStream();
         this.ctStyles.save(out, xmlOptions);
         out.close();
      }
   }

   protected void ensureDocDefaults() {
      if(!this.ctStyles.isSetDocDefaults()) {
         this.ctStyles.addNewDocDefaults();
      }

      CTDocDefaults docDefaults = this.ctStyles.getDocDefaults();
      if(!docDefaults.isSetPPrDefault()) {
         docDefaults.addNewPPrDefault();
      }

      if(!docDefaults.isSetRPrDefault()) {
         docDefaults.addNewRPrDefault();
      }

      CTPPrDefault pprd = docDefaults.getPPrDefault();
      CTRPrDefault rprd = docDefaults.getRPrDefault();
      if(!pprd.isSetPPr()) {
         pprd.addNewPPr();
      }

      if(!rprd.isSetRPr()) {
         rprd.addNewRPr();
      }

      this.defaultRunStyle = new XWPFDefaultRunStyle(rprd.getRPr());
      this.defaultParaStyle = new XWPFDefaultParagraphStyle(pprd.getPPr());
   }

   public void setStyles(CTStyles styles) {
      this.ctStyles = styles;
      CTStyle[] docDefaults = this.ctStyles.getStyleArray();
      int len$ = docDefaults.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTStyle style = docDefaults[i$];
         this.listStyle.add(new XWPFStyle(style, this));
      }

      if(this.ctStyles.isSetDocDefaults()) {
         CTDocDefaults var6 = this.ctStyles.getDocDefaults();
         if(var6.isSetRPrDefault() && var6.getRPrDefault().isSetRPr()) {
            this.defaultRunStyle = new XWPFDefaultRunStyle(var6.getRPrDefault().getRPr());
         }

         if(var6.isSetPPrDefault() && var6.getPPrDefault().isSetPPr()) {
            this.defaultParaStyle = new XWPFDefaultParagraphStyle(var6.getPPrDefault().getPPr());
         }
      }

   }

   public boolean styleExist(String styleID) {
      Iterator i$ = this.listStyle.iterator();

      XWPFStyle style;
      do {
         if(!i$.hasNext()) {
            return false;
         }

         style = (XWPFStyle)i$.next();
      } while(!style.getStyleId().equals(styleID));

      return true;
   }

   public void addStyle(XWPFStyle style) {
      this.listStyle.add(style);
      this.ctStyles.addNewStyle();
      int pos = this.ctStyles.sizeOfStyleArray() - 1;
      this.ctStyles.setStyleArray(pos, style.getCTStyle());
   }

   public XWPFStyle getStyle(String styleID) {
      Iterator i$ = this.listStyle.iterator();

      XWPFStyle style;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         style = (XWPFStyle)i$.next();
      } while(!style.getStyleId().equals(styleID));

      return style;
   }

   public int getNumberOfStyles() {
      return this.listStyle.size();
   }

   public List getUsedStyleList(XWPFStyle style) {
      ArrayList usedStyleList = new ArrayList();
      usedStyleList.add(style);
      return this.getUsedStyleList(style, usedStyleList);
   }

   private List getUsedStyleList(XWPFStyle style, List usedStyleList) {
      String basisStyleID = style.getBasisStyleID();
      XWPFStyle basisStyle = this.getStyle(basisStyleID);
      if(basisStyle != null && !usedStyleList.contains(basisStyle)) {
         usedStyleList.add(basisStyle);
         this.getUsedStyleList(basisStyle, usedStyleList);
      }

      String linkStyleID = style.getLinkStyleID();
      XWPFStyle linkStyle = this.getStyle(linkStyleID);
      if(linkStyle != null && !usedStyleList.contains(linkStyle)) {
         usedStyleList.add(linkStyle);
         this.getUsedStyleList(linkStyle, usedStyleList);
      }

      String nextStyleID = style.getNextStyleID();
      XWPFStyle nextStyle = this.getStyle(nextStyleID);
      if(nextStyle != null && !usedStyleList.contains(nextStyle)) {
         usedStyleList.add(linkStyle);
         this.getUsedStyleList(linkStyle, usedStyleList);
      }

      return usedStyleList;
   }

   protected CTLanguage getCTLanguage() {
      this.ensureDocDefaults();
      CTLanguage lang = null;
      if(this.defaultRunStyle.getRPr().isSetLang()) {
         lang = this.defaultRunStyle.getRPr().getLang();
      } else {
         lang = this.defaultRunStyle.getRPr().addNewLang();
      }

      return lang;
   }

   public void setSpellingLanguage(String strSpellingLanguage) {
      CTLanguage lang = this.getCTLanguage();
      lang.setVal(strSpellingLanguage);
      lang.setBidi(strSpellingLanguage);
   }

   public void setEastAsia(String strEastAsia) {
      CTLanguage lang = this.getCTLanguage();
      lang.setEastAsia(strEastAsia);
   }

   public void setDefaultFonts(CTFonts fonts) {
      this.ensureDocDefaults();
      CTRPr runProps = this.defaultRunStyle.getRPr();
      runProps.setRFonts(fonts);
   }

   public XWPFStyle getStyleWithSameName(XWPFStyle style) {
      Iterator i$ = this.listStyle.iterator();

      XWPFStyle ownStyle;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         ownStyle = (XWPFStyle)i$.next();
      } while(!ownStyle.hasSameName(style));

      return ownStyle;
   }

   public XWPFDefaultRunStyle getDefaultRunStyle() {
      this.ensureDocDefaults();
      return this.defaultRunStyle;
   }

   public XWPFDefaultParagraphStyle getDefaultParagraphStyle() {
      this.ensureDocDefaults();
      return this.defaultParaStyle;
   }

   public XWPFLatentStyles getLatentStyles() {
      return this.latentStyles;
   }
}
