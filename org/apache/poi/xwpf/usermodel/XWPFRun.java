package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.DocumentHelper;
import org.apache.poi.util.Internal;
import org.apache.poi.wp.usermodel.CharacterRun;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.IRunBody;
import org.apache.poi.xwpf.usermodel.IRunElement;
import org.apache.poi.xwpf.usermodel.ISDTContents;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeaderFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFPicture;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.impl.values.XmlAnyTypeImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualPictureProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STShapeType;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPicture;
import org.openxmlformats.schemas.drawingml.x2006.picture.CTPictureNonVisual;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTAnchor;
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDrawing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFCheckBox;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFldChar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPTab;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrClear;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STFldCharType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHighlightColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STUnderline;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalAlignRun;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XWPFRun implements ISDTContents, IRunElement, CharacterRun {

   private CTR run;
   private String pictureText;
   private IRunBody parent;
   private List pictures;


   public XWPFRun(CTR r, IRunBody p) {
      this.run = r;
      this.parent = p;
      CTDrawing[] text = r.getDrawingArray();
      int pictTextObjs = text.length;

      int picture;
      for(int i$ = 0; i$ < pictTextObjs; ++i$) {
         CTDrawing o = text[i$];
         CTAnchor[] i$1 = o.getAnchorArray();
         int pict = i$1.length;

         for(picture = 0; picture < pict; ++picture) {
            CTAnchor i$2 = i$1[picture];
            if(i$2.getDocPr() != null) {
               this.getDocument().getDrawingIdManager().reserve(i$2.getDocPr().getId());
            }
         }

         CTInline[] var18 = o.getInlineArray();
         pict = var18.length;

         for(picture = 0; picture < pict; ++picture) {
            CTInline var23 = var18[picture];
            if(var23.getDocPr() != null) {
               this.getDocument().getDrawingIdManager().reserve(var23.getDocPr().getId());
            }
         }
      }

      StringBuilder var14 = new StringBuilder();
      ArrayList var15 = new ArrayList();
      var15.addAll(Arrays.asList(r.getPictArray()));
      var15.addAll(Arrays.asList(r.getDrawingArray()));
      Iterator var16 = var15.iterator();

      XmlObject var17;
      while(var16.hasNext()) {
         var17 = (XmlObject)var16.next();
         XmlObject[] var19 = var17.selectPath("declare namespace w=\'http://schemas.openxmlformats.org/wordprocessingml/2006/main\' .//w:t");
         XmlObject[] var21 = var19;
         picture = var19.length;

         for(int var24 = 0; var24 < picture; ++var24) {
            XmlObject t = var21[var24];
            NodeList kids = t.getDomNode().getChildNodes();

            for(int n = 0; n < kids.getLength(); ++n) {
               if(kids.item(n) instanceof Text) {
                  if(var14.length() > 0) {
                     var14.append("\n");
                  }

                  var14.append(kids.item(n).getNodeValue());
               }
            }
         }
      }

      this.pictureText = var14.toString();
      this.pictures = new ArrayList();
      var16 = var15.iterator();

      while(var16.hasNext()) {
         var17 = (XmlObject)var16.next();
         Iterator var20 = this.getCTPictures(var17).iterator();

         while(var20.hasNext()) {
            CTPicture var22 = (CTPicture)var20.next();
            XWPFPicture var25 = new XWPFPicture(var22, this);
            this.pictures.add(var25);
         }
      }

   }

   public XWPFRun(CTR r, XWPFParagraph p) {
      this(r, (IRunBody)p);
   }

   static void preserveSpaces(XmlString xs) {
      String text = xs.getStringValue();
      if(text != null && (text.startsWith(" ") || text.endsWith(" "))) {
         XmlCursor c = xs.newCursor();
         c.toNextToken();
         c.insertAttributeWithValue(new QName("http://www.w3.org/XML/1998/namespace", "space"), "preserve");
         c.dispose();
      }

   }

   private List getCTPictures(XmlObject o) {
      ArrayList pics = new ArrayList();
      XmlObject[] picts = o.selectPath("declare namespace pic=\'" + CTPicture.type.getName().getNamespaceURI() + "\' .//pic:pic");
      XmlObject[] arr$ = picts;
      int len$ = picts.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         Object pict = arr$[i$];
         if(pict instanceof XmlAnyTypeImpl) {
            try {
               pict = CTPicture.Factory.parse(((XmlObject)pict).toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
            } catch (XmlException var9) {
               throw new POIXMLException(var9);
            }
         }

         if(pict instanceof CTPicture) {
            pics.add((CTPicture)pict);
         }
      }

      return pics;
   }

   @Internal
   public CTR getCTR() {
      return this.run;
   }

   public IRunBody getParent() {
      return this.parent;
   }

   public XWPFParagraph getParagraph() {
      return this.parent instanceof XWPFParagraph?(XWPFParagraph)this.parent:null;
   }

   public XWPFDocument getDocument() {
      return this.parent != null?this.parent.getDocument():null;
   }

   private static boolean isCTOnOff(CTOnOff onoff) {
      if(!onoff.isSetVal()) {
         return true;
      } else {
         STOnOff.Enum val = onoff.getVal();
         return STOnOff.TRUE == val || STOnOff.X_1 == val || STOnOff.ON == val;
      }
   }

   public boolean isBold() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetB()?isCTOnOff(pr.getB()):false;
   }

   public void setBold(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff bold = pr.isSetB()?pr.getB():pr.addNewB();
      bold.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public String getColor() {
      String color = null;
      if(this.run.isSetRPr()) {
         CTRPr pr = this.run.getRPr();
         if(pr.isSetColor()) {
            CTColor clr = pr.getColor();
            color = clr.xgetVal().getStringValue();
         }
      }

      return color;
   }

   public void setColor(String rgbStr) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTColor color = pr.isSetColor()?pr.getColor():pr.addNewColor();
      color.setVal(rgbStr);
   }

   public String getText(int pos) {
      return this.run.sizeOfTArray() == 0?null:this.run.getTArray(pos).getStringValue();
   }

   public String getPictureText() {
      return this.pictureText;
   }

   public void setText(String value) {
      this.setText(value, this.run.sizeOfTArray());
   }

   public void setText(String value, int pos) {
      if(pos > this.run.sizeOfTArray()) {
         throw new ArrayIndexOutOfBoundsException("Value too large for the parameter position in XWPFRun.setText(String value,int pos)");
      } else {
         CTText t = pos < this.run.sizeOfTArray() && pos >= 0?this.run.getTArray(pos):this.run.addNewT();
         t.setStringValue(value);
         preserveSpaces(t);
      }
   }

   public boolean isItalic() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetI()?isCTOnOff(pr.getI()):false;
   }

   public void setItalic(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff italic = pr.isSetI()?pr.getI():pr.addNewI();
      italic.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public UnderlinePatterns getUnderline() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetU() && pr.getU().getVal() != null?UnderlinePatterns.valueOf(pr.getU().getVal().intValue()):UnderlinePatterns.NONE;
   }

   public void setUnderline(UnderlinePatterns value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTUnderline underline = pr.getU() == null?pr.addNewU():pr.getU();
      underline.setVal(STUnderline.Enum.forInt(value.getValue()));
   }

   public boolean isStrikeThrough() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetStrike()?isCTOnOff(pr.getStrike()):false;
   }

   public void setStrikeThrough(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff strike = pr.isSetStrike()?pr.getStrike():pr.addNewStrike();
      strike.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   @Deprecated
   public boolean isStrike() {
      return this.isStrikeThrough();
   }

   @Deprecated
   public void setStrike(boolean value) {
      this.setStrikeThrough(value);
   }

   public boolean isDoubleStrikeThrough() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetDstrike()?isCTOnOff(pr.getDstrike()):false;
   }

   public void setDoubleStrikethrough(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff dstrike = pr.isSetDstrike()?pr.getDstrike():pr.addNewDstrike();
      dstrike.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public boolean isSmallCaps() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetSmallCaps()?isCTOnOff(pr.getSmallCaps()):false;
   }

   public void setSmallCaps(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff caps = pr.isSetSmallCaps()?pr.getSmallCaps():pr.addNewSmallCaps();
      caps.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public boolean isCapitalized() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetCaps()?isCTOnOff(pr.getCaps()):false;
   }

   public void setCapitalized(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff caps = pr.isSetCaps()?pr.getCaps():pr.addNewCaps();
      caps.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public boolean isShadowed() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetShadow()?isCTOnOff(pr.getShadow()):false;
   }

   public void setShadow(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff shadow = pr.isSetShadow()?pr.getShadow():pr.addNewShadow();
      shadow.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public boolean isImprinted() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetImprint()?isCTOnOff(pr.getImprint()):false;
   }

   public void setImprinted(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff imprinted = pr.isSetImprint()?pr.getImprint():pr.addNewImprint();
      imprinted.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public boolean isEmbossed() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetEmboss()?isCTOnOff(pr.getEmboss()):false;
   }

   public void setEmbossed(boolean value) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTOnOff emboss = pr.isSetEmboss()?pr.getEmboss():pr.addNewEmboss();
      emboss.setVal(value?STOnOff.TRUE:STOnOff.FALSE);
   }

   public VerticalAlign getSubscript() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetVertAlign()?VerticalAlign.valueOf(pr.getVertAlign().getVal().intValue()):VerticalAlign.BASELINE;
   }

   public void setSubscript(VerticalAlign valign) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTVerticalAlignRun ctValign = pr.isSetVertAlign()?pr.getVertAlign():pr.addNewVertAlign();
      ctValign.setVal(STVerticalAlignRun.Enum.forInt(valign.getValue()));
   }

   public int getKerning() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetKern()?pr.getKern().getVal().intValue():0;
   }

   public void setKerning(int kern) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTHpsMeasure kernmes = pr.isSetKern()?pr.getKern():pr.addNewKern();
      kernmes.setVal(BigInteger.valueOf((long)kern));
   }

   public boolean isHighlighted() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetHighlight()?pr.getHighlight().getVal() != STHighlightColor.NONE:false;
   }

   public int getCharacterSpacing() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetSpacing()?pr.getSpacing().getVal().intValue():0;
   }

   public void setCharacterSpacing(int twips) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTSignedTwipsMeasure spc = pr.isSetSpacing()?pr.getSpacing():pr.addNewSpacing();
      spc.setVal(BigInteger.valueOf((long)twips));
   }

   public String getFontFamily() {
      return this.getFontFamily((XWPFRun.FontCharRange)null);
   }

   public void setFontFamily(String fontFamily) {
      this.setFontFamily(fontFamily, (XWPFRun.FontCharRange)null);
   }

   public String getFontName() {
      return this.getFontFamily();
   }

   public String getFontFamily(XWPFRun.FontCharRange fcr) {
      CTRPr pr = this.run.getRPr();
      if(pr != null && pr.isSetRFonts()) {
         CTFonts fonts = pr.getRFonts();
         switch(XWPFRun.NamelessClass111431988.$SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange[(fcr == null?XWPFRun.FontCharRange.ascii:fcr).ordinal()]) {
         case 1:
         default:
            return fonts.getAscii();
         case 2:
            return fonts.getCs();
         case 3:
            return fonts.getEastAsia();
         case 4:
            return fonts.getHAnsi();
         }
      } else {
         return null;
      }
   }

   public void setFontFamily(String fontFamily, XWPFRun.FontCharRange fcr) {
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTFonts fonts = pr.isSetRFonts()?pr.getRFonts():pr.addNewRFonts();
      if(fcr == null) {
         fonts.setAscii(fontFamily);
         if(!fonts.isSetHAnsi()) {
            fonts.setHAnsi(fontFamily);
         }

         if(!fonts.isSetCs()) {
            fonts.setCs(fontFamily);
         }

         if(!fonts.isSetEastAsia()) {
            fonts.setEastAsia(fontFamily);
         }
      } else {
         switch(XWPFRun.NamelessClass111431988.$SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange[fcr.ordinal()]) {
         case 1:
            fonts.setAscii(fontFamily);
            break;
         case 2:
            fonts.setCs(fontFamily);
            break;
         case 3:
            fonts.setEastAsia(fontFamily);
            break;
         case 4:
            fonts.setHAnsi(fontFamily);
         }
      }

   }

   public int getFontSize() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetSz()?pr.getSz().getVal().divide(new BigInteger("2")).intValue():-1;
   }

   public void setFontSize(int size) {
      BigInteger bint = new BigInteger("" + size);
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTHpsMeasure ctSize = pr.isSetSz()?pr.getSz():pr.addNewSz();
      ctSize.setVal(bint.multiply(new BigInteger("2")));
   }

   public int getTextPosition() {
      CTRPr pr = this.run.getRPr();
      return pr != null && pr.isSetPosition()?pr.getPosition().getVal().intValue():-1;
   }

   public void setTextPosition(int val) {
      BigInteger bint = new BigInteger("" + val);
      CTRPr pr = this.run.isSetRPr()?this.run.getRPr():this.run.addNewRPr();
      CTSignedHpsMeasure position = pr.isSetPosition()?pr.getPosition():pr.addNewPosition();
      position.setVal(bint);
   }

   public void removeBreak() {}

   public void addBreak() {
      this.run.addNewBr();
   }

   public void addBreak(BreakType type) {
      CTBr br = this.run.addNewBr();
      br.setType(STBrType.Enum.forInt(type.getValue()));
   }

   public void addBreak(BreakClear clear) {
      CTBr br = this.run.addNewBr();
      br.setType(STBrType.Enum.forInt(BreakType.TEXT_WRAPPING.getValue()));
      br.setClear(STBrClear.Enum.forInt(clear.getValue()));
   }

   public void addTab() {
      this.run.addNewTab();
   }

   public void removeTab() {}

   public void addCarriageReturn() {
      this.run.addNewCr();
   }

   public void removeCarriageReturn() {}

   public XWPFPicture addPicture(InputStream pictureData, int pictureType, String filename, int width, int height) throws InvalidFormatException, IOException {
      String relationId;
      XWPFPictureData picData;
      if(this.parent.getPart() instanceof XWPFHeaderFooter) {
         XWPFHeaderFooter e = (XWPFHeaderFooter)this.parent.getPart();
         relationId = e.addPictureData(pictureData, pictureType);
         picData = (XWPFPictureData)e.getRelationById(relationId);
      } else {
         XWPFDocument e1 = this.parent.getDocument();
         relationId = e1.addPictureData(pictureData, pictureType);
         picData = (XWPFPictureData)e1.getRelationById(relationId);
      }

      try {
         CTDrawing e2 = this.run.addNewDrawing();
         CTInline inline = e2.addNewInline();
         String xml = "<a:graphic xmlns:a=\"" + CTGraphicalObject.type.getName().getNamespaceURI() + "\">" + "<a:graphicData uri=\"" + CTPicture.type.getName().getNamespaceURI() + "\">" + "<pic:pic xmlns:pic=\"" + CTPicture.type.getName().getNamespaceURI() + "\" />" + "</a:graphicData>" + "</a:graphic>";
         InputSource is = new InputSource(new StringReader(xml));
         org.w3c.dom.Document doc = DocumentHelper.readDocument(is);
         inline.set(XmlToken.Factory.parse((Node)doc.getDocumentElement(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS));
         inline.setDistT(0L);
         inline.setDistR(0L);
         inline.setDistB(0L);
         inline.setDistL(0L);
         CTNonVisualDrawingProps docPr = inline.addNewDocPr();
         long id = this.getParent().getDocument().getDrawingIdManager().reserveNew();
         docPr.setId(id);
         docPr.setName("Drawing " + id);
         docPr.setDescr(filename);
         CTPositiveSize2D extent = inline.addNewExtent();
         extent.setCx((long)width);
         extent.setCy((long)height);
         CTGraphicalObject graphic = inline.getGraphic();
         CTGraphicalObjectData graphicData = graphic.getGraphicData();
         CTPicture pic = (CTPicture)this.getCTPictures(graphicData).get(0);
         CTPictureNonVisual nvPicPr = pic.addNewNvPicPr();
         CTNonVisualDrawingProps cNvPr = nvPicPr.addNewCNvPr();
         cNvPr.setId(0L);
         cNvPr.setName("Picture " + id);
         cNvPr.setDescr(filename);
         CTNonVisualPictureProperties cNvPicPr = nvPicPr.addNewCNvPicPr();
         cNvPicPr.addNewPicLocks().setNoChangeAspect(true);
         CTBlipFillProperties blipFill = pic.addNewBlipFill();
         CTBlip blip = blipFill.addNewBlip();
         blip.setEmbed(this.parent.getDocument().getRelationId(picData));
         blipFill.addNewStretch().addNewFillRect();
         CTShapeProperties spPr = pic.addNewSpPr();
         CTTransform2D xfrm = spPr.addNewXfrm();
         CTPoint2D off = xfrm.addNewOff();
         off.setX(0L);
         off.setY(0L);
         CTPositiveSize2D ext = xfrm.addNewExt();
         ext.setCx((long)width);
         ext.setCy((long)height);
         CTPresetGeometry2D prstGeom = spPr.addNewPrstGeom();
         prstGeom.setPrst(STShapeType.RECT);
         prstGeom.addNewAvLst();
         XWPFPicture xwpfPicture = new XWPFPicture(pic, this);
         this.pictures.add(xwpfPicture);
         return xwpfPicture;
      } catch (XmlException var31) {
         throw new IllegalStateException(var31);
      } catch (SAXException var32) {
         throw new IllegalStateException(var32);
      }
   }

   public List getEmbeddedPictures() {
      return this.pictures;
   }

   public String toString() {
      return this.text();
   }

   public String text() {
      StringBuffer text = new StringBuffer();
      XmlCursor c = this.run.newCursor();
      c.selectPath("./*");

      while(c.toNextSelection()) {
         XmlObject o = c.getObject();
         String ftn;
         if(o instanceof CTText) {
            ftn = o.getDomNode().getNodeName();
            if(!"w:instrText".equals(ftn)) {
               text.append(((CTText)o).getStringValue());
            }
         }

         if(o instanceof CTFldChar) {
            CTFldChar ftn1 = (CTFldChar)o;
            if(ftn1.getFldCharType() == STFldCharType.BEGIN && ftn1.getFfData() != null) {
               Iterator footnoteRef = ftn1.getFfData().getCheckBoxList().iterator();

               while(footnoteRef.hasNext()) {
                  CTFFCheckBox checkBox = (CTFFCheckBox)footnoteRef.next();
                  if(checkBox.getDefault().getVal() == STOnOff.X_1) {
                     text.append("|X|");
                  } else {
                     text.append("|_|");
                  }
               }
            }
         }

         if(o instanceof CTPTab) {
            text.append("\t");
         }

         if(o instanceof CTBr) {
            text.append("\n");
         }

         if(o instanceof CTEmpty) {
            ftn = o.getDomNode().getNodeName();
            if("w:tab".equals(ftn) || "tab".equals(ftn)) {
               text.append("\t");
            }

            if("w:br".equals(ftn) || "br".equals(ftn)) {
               text.append("\n");
            }

            if("w:cr".equals(ftn) || "cr".equals(ftn)) {
               text.append("\n");
            }
         }

         if(o instanceof CTFtnEdnRef) {
            CTFtnEdnRef ftn2 = (CTFtnEdnRef)o;
            String footnoteRef1 = ftn2.getDomNode().getLocalName().equals("footnoteReference")?"[footnoteRef:" + ftn2.getId().intValue() + "]":"[endnoteRef:" + ftn2.getId().intValue() + "]";
            text.append(footnoteRef1);
         }
      }

      c.dispose();
      if(this.pictureText != null && this.pictureText.length() > 0) {
         text.append("\n").append(this.pictureText);
      }

      return text.toString();
   }

   public static enum FontCharRange {

      ascii("ascii", 0),
      cs("cs", 1),
      eastAsia("eastAsia", 2),
      hAnsi("hAnsi", 3);
      // $FF: synthetic field
      private static final XWPFRun.FontCharRange[] $VALUES = new XWPFRun.FontCharRange[]{ascii, cs, eastAsia, hAnsi};


      private FontCharRange(String var1, int var2) {}

   }

   // $FF: synthetic class
   static class NamelessClass111431988 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange = new int[XWPFRun.FontCharRange.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange[XWPFRun.FontCharRange.ascii.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange[XWPFRun.FontCharRange.cs.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange[XWPFRun.FontCharRange.eastAsia.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xwpf$usermodel$XWPFRun$FontCharRange[XWPFRun.FontCharRange.hAnsi.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
