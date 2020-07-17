package org.apache.poi.xwpf.usermodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.util.Internal;
import org.apache.poi.wp.usermodel.Paragraph;
import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.IRunBody;
import org.apache.poi.xwpf.usermodel.IRunElement;
import org.apache.poi.xwpf.usermodel.ISDTContents;
import org.apache.poi.xwpf.usermodel.LineSpacingRule;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.PositionInParagraph;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.TextSegement;
import org.apache.poi.xwpf.usermodel.XWPFAbstractNum;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFFieldRun;
import org.apache.poi.xwpf.usermodel.XWPFFootnote;
import org.apache.poi.xwpf.usermodel.XWPFHyperlinkRun;
import org.apache.poi.xwpf.usermodel.XWPFNum;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdnRef;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTInd;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumLvl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPBdr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSmartTagRun;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextAlignment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTextAlignment;

public class XWPFParagraph implements IBodyElement, IRunBody, ISDTContents, Paragraph {

   private final CTP paragraph;
   protected IBody part;
   protected XWPFDocument document;
   protected List runs;
   protected List iruns;
   private StringBuffer footnoteText = new StringBuffer();


   public XWPFParagraph(CTP prgrph, IBody part) {
      this.paragraph = prgrph;
      this.part = part;
      this.document = part.getXWPFDocument();
      if(this.document == null) {
         throw new NullPointerException();
      } else {
         this.runs = new ArrayList();
         this.iruns = new ArrayList();
         this.buildRunsInOrderFromXml(this.paragraph);
         Iterator i$ = this.runs.iterator();

         while(i$.hasNext()) {
            XWPFRun run = (XWPFRun)i$.next();
            CTR r = run.getCTR();
            XmlCursor c = r.newCursor();
            c.selectPath("child::*");

            while(c.toNextSelection()) {
               XmlObject o = c.getObject();
               if(o instanceof CTFtnEdnRef) {
                  CTFtnEdnRef ftn = (CTFtnEdnRef)o;
                  this.footnoteText.append(" [").append(ftn.getId()).append(": ");
                  XWPFFootnote footnote = ftn.getDomNode().getLocalName().equals("footnoteReference")?this.document.getFootnoteByID(ftn.getId().intValue()):this.document.getEndnoteByID(ftn.getId().intValue());
                  boolean first = true;

                  XWPFParagraph p;
                  for(Iterator i$1 = footnote.getParagraphs().iterator(); i$1.hasNext(); this.footnoteText.append(p.getText())) {
                     p = (XWPFParagraph)i$1.next();
                     if(!first) {
                        this.footnoteText.append("\n");
                        first = false;
                     }
                  }

                  this.footnoteText.append("] ");
               }
            }

            c.dispose();
         }

      }
   }

   private void buildRunsInOrderFromXml(XmlObject object) {
      XmlCursor c = object.newCursor();
      c.selectPath("child::*");

      while(c.toNextSelection()) {
         XmlObject o = c.getObject();
         if(o instanceof CTR) {
            XWPFRun arr$ = new XWPFRun((CTR)o, this);
            this.runs.add(arr$);
            this.iruns.add(arr$);
         }

         CTR[] len$;
         int i$;
         int r;
         CTR cr;
         if(o instanceof CTHyperlink) {
            CTHyperlink var10 = (CTHyperlink)o;
            len$ = var10.getRArray();
            i$ = len$.length;

            for(r = 0; r < i$; ++r) {
               cr = len$[r];
               XWPFHyperlinkRun fr = new XWPFHyperlinkRun(var10, cr, this);
               this.runs.add(fr);
               this.iruns.add(fr);
            }
         }

         if(o instanceof CTSimpleField) {
            CTSimpleField var11 = (CTSimpleField)o;
            len$ = var11.getRArray();
            i$ = len$.length;

            for(r = 0; r < i$; ++r) {
               cr = len$[r];
               XWPFFieldRun var17 = new XWPFFieldRun(var11, cr, this);
               this.runs.add(var17);
               this.iruns.add(var17);
            }
         }

         XWPFSDT var12;
         if(o instanceof CTSdtBlock) {
            var12 = new XWPFSDT((CTSdtBlock)o, this.part);
            this.iruns.add(var12);
         }

         if(o instanceof CTSdtRun) {
            var12 = new XWPFSDT((CTSdtRun)o, this.part);
            this.iruns.add(var12);
         }

         if(o instanceof CTRunTrackChange) {
            CTR[] var13 = ((CTRunTrackChange)o).getRArray();
            int var14 = var13.length;

            for(i$ = 0; i$ < var14; ++i$) {
               CTR var15 = var13[i$];
               XWPFRun var16 = new XWPFRun(var15, this);
               this.runs.add(var16);
               this.iruns.add(var16);
            }
         }

         if(o instanceof CTSmartTagRun) {
            this.buildRunsInOrderFromXml(o);
         }
      }

      c.dispose();
   }

   @Internal
   public CTP getCTP() {
      return this.paragraph;
   }

   public List getRuns() {
      return Collections.unmodifiableList(this.runs);
   }

   public List getIRuns() {
      return Collections.unmodifiableList(this.iruns);
   }

   public boolean isEmpty() {
      return !this.paragraph.getDomNode().hasChildNodes();
   }

   public XWPFDocument getDocument() {
      return this.document;
   }

   public String getText() {
      StringBuffer out = new StringBuffer();
      Iterator i$ = this.iruns.iterator();

      while(i$.hasNext()) {
         IRunElement run = (IRunElement)i$.next();
         if(run instanceof XWPFRun) {
            XWPFRun xRun = (XWPFRun)run;
            if(!xRun.getCTR().isSetRsidDel()) {
               out.append(xRun.toString());
            }
         } else if(run instanceof XWPFSDT) {
            out.append(((XWPFSDT)run).getContent().getText());
         } else {
            out.append(run.toString());
         }
      }

      out.append(this.footnoteText);
      return out.toString();
   }

   public String getStyleID() {
      return this.paragraph.getPPr() != null && this.paragraph.getPPr().getPStyle() != null && this.paragraph.getPPr().getPStyle().getVal() != null?this.paragraph.getPPr().getPStyle().getVal():null;
   }

   public BigInteger getNumID() {
      return this.paragraph.getPPr() != null && this.paragraph.getPPr().getNumPr() != null && this.paragraph.getPPr().getNumPr().getNumId() != null?this.paragraph.getPPr().getNumPr().getNumId().getVal():null;
   }

   public void setNumID(BigInteger numPos) {
      if(this.paragraph.getPPr() == null) {
         this.paragraph.addNewPPr();
      }

      if(this.paragraph.getPPr().getNumPr() == null) {
         this.paragraph.getPPr().addNewNumPr();
      }

      if(this.paragraph.getPPr().getNumPr().getNumId() == null) {
         this.paragraph.getPPr().getNumPr().addNewNumId();
      }

      this.paragraph.getPPr().getNumPr().getNumId().setVal(numPos);
   }

   public BigInteger getNumIlvl() {
      return this.paragraph.getPPr() != null && this.paragraph.getPPr().getNumPr() != null && this.paragraph.getPPr().getNumPr().getIlvl() != null?this.paragraph.getPPr().getNumPr().getIlvl().getVal():null;
   }

   public String getNumFmt() {
      BigInteger numID = this.getNumID();
      XWPFNumbering numbering = this.document.getNumbering();
      if(numID != null && numbering != null) {
         XWPFNum num = numbering.getNum(numID);
         if(num != null) {
            BigInteger ilvl = this.getNumIlvl();
            BigInteger abstractNumId = num.getCTNum().getAbstractNumId().getVal();
            CTAbstractNum anum = numbering.getAbstractNum(abstractNumId).getAbstractNum();
            CTLvl level = null;

            for(int i = 0; i < anum.sizeOfLvlArray(); ++i) {
               CTLvl lvl = anum.getLvlArray(i);
               if(lvl.getIlvl().equals(ilvl)) {
                  level = lvl;
                  break;
               }
            }

            if(level != null && level.getNumFmt() != null && level.getNumFmt().getVal() != null) {
               return level.getNumFmt().getVal().toString();
            }
         }
      }

      return null;
   }

   public String getNumLevelText() {
      BigInteger numID = this.getNumID();
      XWPFNumbering numbering = this.document.getNumbering();
      if(numID != null && numbering != null) {
         XWPFNum num = numbering.getNum(numID);
         if(num != null) {
            BigInteger ilvl = this.getNumIlvl();
            CTNum ctNum = num.getCTNum();
            if(ctNum == null) {
               return null;
            }

            CTDecimalNumber ctDecimalNumber = ctNum.getAbstractNumId();
            if(ctDecimalNumber == null) {
               return null;
            }

            BigInteger abstractNumId = ctDecimalNumber.getVal();
            if(abstractNumId == null) {
               return null;
            }

            XWPFAbstractNum xwpfAbstractNum = numbering.getAbstractNum(abstractNumId);
            if(xwpfAbstractNum == null) {
               return null;
            }

            CTAbstractNum anum = xwpfAbstractNum.getCTAbstractNum();
            if(anum == null) {
               return null;
            }

            CTLvl level = null;

            for(int i = 0; i < anum.sizeOfLvlArray(); ++i) {
               CTLvl lvl = anum.getLvlArray(i);
               if(lvl != null && lvl.getIlvl() != null && lvl.getIlvl().equals(ilvl)) {
                  level = lvl;
                  break;
               }
            }

            if(level != null && level.getLvlText() != null && level.getLvlText().getVal() != null) {
               return level.getLvlText().getVal().toString();
            }
         }
      }

      return null;
   }

   public BigInteger getNumStartOverride() {
      BigInteger numID = this.getNumID();
      XWPFNumbering numbering = this.document.getNumbering();
      if(numID != null && numbering != null) {
         XWPFNum num = numbering.getNum(numID);
         if(num != null) {
            CTNum ctNum = num.getCTNum();
            if(ctNum == null) {
               return null;
            }

            BigInteger ilvl = this.getNumIlvl();
            CTNumLvl level = null;

            for(int i = 0; i < ctNum.sizeOfLvlOverrideArray(); ++i) {
               CTNumLvl ctNumLvl = ctNum.getLvlOverrideArray(i);
               if(ctNumLvl != null && ctNumLvl.getIlvl() != null && ctNumLvl.getIlvl().equals(ilvl)) {
                  level = ctNumLvl;
                  break;
               }
            }

            if(level != null && level.getStartOverride() != null) {
               return level.getStartOverride().getVal();
            }
         }
      }

      return null;
   }

   public String getParagraphText() {
      StringBuffer out = new StringBuffer();
      Iterator i$ = this.runs.iterator();

      while(i$.hasNext()) {
         XWPFRun run = (XWPFRun)i$.next();
         out.append(run.toString());
      }

      return out.toString();
   }

   public String getPictureText() {
      StringBuffer out = new StringBuffer();
      Iterator i$ = this.runs.iterator();

      while(i$.hasNext()) {
         XWPFRun run = (XWPFRun)i$.next();
         out.append(run.getPictureText());
      }

      return out.toString();
   }

   public String getFootnoteText() {
      return this.footnoteText.toString();
   }

   public ParagraphAlignment getAlignment() {
      CTPPr pr = this.getCTPPr();
      return pr != null && pr.isSetJc()?ParagraphAlignment.valueOf(pr.getJc().getVal().intValue()):ParagraphAlignment.LEFT;
   }

   public void setAlignment(ParagraphAlignment align) {
      CTPPr pr = this.getCTPPr();
      CTJc jc = pr.isSetJc()?pr.getJc():pr.addNewJc();
      STJc.Enum en = STJc.Enum.forInt(align.getValue());
      jc.setVal(en);
   }

   public int getFontAlignment() {
      return this.getAlignment().getValue();
   }

   public void setFontAlignment(int align) {
      ParagraphAlignment pAlign = ParagraphAlignment.valueOf(align);
      this.setAlignment(pAlign);
   }

   public TextAlignment getVerticalAlignment() {
      CTPPr pr = this.getCTPPr();
      return pr != null && pr.isSetTextAlignment()?TextAlignment.valueOf(pr.getTextAlignment().getVal().intValue()):TextAlignment.AUTO;
   }

   public void setVerticalAlignment(TextAlignment valign) {
      CTPPr pr = this.getCTPPr();
      CTTextAlignment textAlignment = pr.isSetTextAlignment()?pr.getTextAlignment():pr.addNewTextAlignment();
      STTextAlignment.Enum en = STTextAlignment.Enum.forInt(valign.getValue());
      textAlignment.setVal(en);
   }

   public Borders getBorderTop() {
      CTPBdr border = this.getCTPBrd(false);
      CTBorder ct = null;
      if(border != null) {
         ct = border.getTop();
      }

      STBorder.Enum ptrn = ct != null?ct.getVal():STBorder.NONE;
      return Borders.valueOf(ptrn.intValue());
   }

   public void setBorderTop(Borders border) {
      CTPBdr ct = this.getCTPBrd(true);
      if(ct == null) {
         throw new RuntimeException("invalid paragraph state");
      } else {
         CTBorder pr = ct.isSetTop()?ct.getTop():ct.addNewTop();
         if(border.getValue() == Borders.NONE.getValue()) {
            ct.unsetTop();
         } else {
            pr.setVal(STBorder.Enum.forInt(border.getValue()));
         }

      }
   }

   public Borders getBorderBottom() {
      CTPBdr border = this.getCTPBrd(false);
      CTBorder ct = null;
      if(border != null) {
         ct = border.getBottom();
      }

      STBorder.Enum ptrn = ct != null?ct.getVal():STBorder.NONE;
      return Borders.valueOf(ptrn.intValue());
   }

   public void setBorderBottom(Borders border) {
      CTPBdr ct = this.getCTPBrd(true);
      CTBorder pr = ct.isSetBottom()?ct.getBottom():ct.addNewBottom();
      if(border.getValue() == Borders.NONE.getValue()) {
         ct.unsetBottom();
      } else {
         pr.setVal(STBorder.Enum.forInt(border.getValue()));
      }

   }

   public Borders getBorderLeft() {
      CTPBdr border = this.getCTPBrd(false);
      CTBorder ct = null;
      if(border != null) {
         ct = border.getLeft();
      }

      STBorder.Enum ptrn = ct != null?ct.getVal():STBorder.NONE;
      return Borders.valueOf(ptrn.intValue());
   }

   public void setBorderLeft(Borders border) {
      CTPBdr ct = this.getCTPBrd(true);
      CTBorder pr = ct.isSetLeft()?ct.getLeft():ct.addNewLeft();
      if(border.getValue() == Borders.NONE.getValue()) {
         ct.unsetLeft();
      } else {
         pr.setVal(STBorder.Enum.forInt(border.getValue()));
      }

   }

   public Borders getBorderRight() {
      CTPBdr border = this.getCTPBrd(false);
      CTBorder ct = null;
      if(border != null) {
         ct = border.getRight();
      }

      STBorder.Enum ptrn = ct != null?ct.getVal():STBorder.NONE;
      return Borders.valueOf(ptrn.intValue());
   }

   public void setBorderRight(Borders border) {
      CTPBdr ct = this.getCTPBrd(true);
      CTBorder pr = ct.isSetRight()?ct.getRight():ct.addNewRight();
      if(border.getValue() == Borders.NONE.getValue()) {
         ct.unsetRight();
      } else {
         pr.setVal(STBorder.Enum.forInt(border.getValue()));
      }

   }

   public Borders getBorderBetween() {
      CTPBdr border = this.getCTPBrd(false);
      CTBorder ct = null;
      if(border != null) {
         ct = border.getBetween();
      }

      STBorder.Enum ptrn = ct != null?ct.getVal():STBorder.NONE;
      return Borders.valueOf(ptrn.intValue());
   }

   public void setBorderBetween(Borders border) {
      CTPBdr ct = this.getCTPBrd(true);
      CTBorder pr = ct.isSetBetween()?ct.getBetween():ct.addNewBetween();
      if(border.getValue() == Borders.NONE.getValue()) {
         ct.unsetBetween();
      } else {
         pr.setVal(STBorder.Enum.forInt(border.getValue()));
      }

   }

   public boolean isPageBreak() {
      CTPPr ppr = this.getCTPPr();
      CTOnOff ct_pageBreak = ppr.isSetPageBreakBefore()?ppr.getPageBreakBefore():null;
      return ct_pageBreak != null && ct_pageBreak.getVal().intValue() == 1;
   }

   public void setPageBreak(boolean pageBreak) {
      CTPPr ppr = this.getCTPPr();
      CTOnOff ct_pageBreak = ppr.isSetPageBreakBefore()?ppr.getPageBreakBefore():ppr.addNewPageBreakBefore();
      if(pageBreak) {
         ct_pageBreak.setVal(STOnOff.TRUE);
      } else {
         ct_pageBreak.setVal(STOnOff.FALSE);
      }

   }

   public int getSpacingAfter() {
      CTSpacing spacing = this.getCTSpacing(false);
      return spacing != null && spacing.isSetAfter()?spacing.getAfter().intValue():-1;
   }

   public void setSpacingAfter(int spaces) {
      CTSpacing spacing = this.getCTSpacing(true);
      if(spacing != null) {
         BigInteger bi = new BigInteger("" + spaces);
         spacing.setAfter(bi);
      }

   }

   public int getSpacingAfterLines() {
      CTSpacing spacing = this.getCTSpacing(false);
      return spacing != null && spacing.isSetAfterLines()?spacing.getAfterLines().intValue():-1;
   }

   public void setSpacingAfterLines(int spaces) {
      CTSpacing spacing = this.getCTSpacing(true);
      BigInteger bi = new BigInteger("" + spaces);
      spacing.setAfterLines(bi);
   }

   public int getSpacingBefore() {
      CTSpacing spacing = this.getCTSpacing(false);
      return spacing != null && spacing.isSetBefore()?spacing.getBefore().intValue():-1;
   }

   public void setSpacingBefore(int spaces) {
      CTSpacing spacing = this.getCTSpacing(true);
      BigInteger bi = new BigInteger("" + spaces);
      spacing.setBefore(bi);
   }

   public int getSpacingBeforeLines() {
      CTSpacing spacing = this.getCTSpacing(false);
      return spacing != null && spacing.isSetBeforeLines()?spacing.getBeforeLines().intValue():-1;
   }

   public void setSpacingBeforeLines(int spaces) {
      CTSpacing spacing = this.getCTSpacing(true);
      BigInteger bi = new BigInteger("" + spaces);
      spacing.setBeforeLines(bi);
   }

   public LineSpacingRule getSpacingLineRule() {
      CTSpacing spacing = this.getCTSpacing(false);
      return spacing != null && spacing.isSetLineRule()?LineSpacingRule.valueOf(spacing.getLineRule().intValue()):LineSpacingRule.AUTO;
   }

   public void setSpacingLineRule(LineSpacingRule rule) {
      CTSpacing spacing = this.getCTSpacing(true);
      spacing.setLineRule(STLineSpacingRule.Enum.forInt(rule.getValue()));
   }

   public int getIndentationLeft() {
      CTInd indentation = this.getCTInd(false);
      return indentation != null && indentation.isSetLeft()?indentation.getLeft().intValue():-1;
   }

   public void setIndentationLeft(int indentation) {
      CTInd indent = this.getCTInd(true);
      BigInteger bi = new BigInteger("" + indentation);
      indent.setLeft(bi);
   }

   public int getIndentationRight() {
      CTInd indentation = this.getCTInd(false);
      return indentation != null && indentation.isSetRight()?indentation.getRight().intValue():-1;
   }

   public void setIndentationRight(int indentation) {
      CTInd indent = this.getCTInd(true);
      BigInteger bi = new BigInteger("" + indentation);
      indent.setRight(bi);
   }

   public int getIndentationHanging() {
      CTInd indentation = this.getCTInd(false);
      return indentation != null && indentation.isSetHanging()?indentation.getHanging().intValue():-1;
   }

   public void setIndentationHanging(int indentation) {
      CTInd indent = this.getCTInd(true);
      BigInteger bi = new BigInteger("" + indentation);
      indent.setHanging(bi);
   }

   public int getIndentationFirstLine() {
      CTInd indentation = this.getCTInd(false);
      return indentation != null && indentation.isSetFirstLine()?indentation.getFirstLine().intValue():-1;
   }

   public void setIndentationFirstLine(int indentation) {
      CTInd indent = this.getCTInd(true);
      BigInteger bi = new BigInteger("" + indentation);
      indent.setFirstLine(bi);
   }

   public int getIndentFromLeft() {
      return this.getIndentationLeft();
   }

   public void setIndentFromLeft(int dxaLeft) {
      this.setIndentationLeft(dxaLeft);
   }

   public int getIndentFromRight() {
      return this.getIndentationRight();
   }

   public void setIndentFromRight(int dxaRight) {
      this.setIndentationRight(dxaRight);
   }

   public int getFirstLineIndent() {
      return this.getIndentationFirstLine();
   }

   public void setFirstLineIndent(int first) {
      this.setIndentationFirstLine(first);
   }

   public boolean isWordWrapped() {
      CTOnOff wordWrap = this.getCTPPr().isSetWordWrap()?this.getCTPPr().getWordWrap():null;
      return wordWrap == null?false:wordWrap.getVal() == STOnOff.ON || wordWrap.getVal() == STOnOff.TRUE || wordWrap.getVal() == STOnOff.X_1;
   }

   public void setWordWrapped(boolean wrap) {
      CTOnOff wordWrap = this.getCTPPr().isSetWordWrap()?this.getCTPPr().getWordWrap():this.getCTPPr().addNewWordWrap();
      if(wrap) {
         wordWrap.setVal(STOnOff.TRUE);
      } else {
         wordWrap.unsetVal();
      }

   }

   public boolean isWordWrap() {
      return this.isWordWrapped();
   }

   @Deprecated
   public void setWordWrap(boolean wrap) {
      this.setWordWrapped(wrap);
   }

   public String getStyle() {
      CTPPr pr = this.getCTPPr();
      CTString style = pr.isSetPStyle()?pr.getPStyle():null;
      return style != null?style.getVal():null;
   }

   public void setStyle(String newStyle) {
      CTPPr pr = this.getCTPPr();
      CTString style = pr.getPStyle() != null?pr.getPStyle():pr.addNewPStyle();
      style.setVal(newStyle);
   }

   private CTPBdr getCTPBrd(boolean create) {
      CTPPr pr = this.getCTPPr();
      CTPBdr ct = pr.isSetPBdr()?pr.getPBdr():null;
      if(create && ct == null) {
         ct = pr.addNewPBdr();
      }

      return ct;
   }

   private CTSpacing getCTSpacing(boolean create) {
      CTPPr pr = this.getCTPPr();
      CTSpacing ct = pr.getSpacing() == null?null:pr.getSpacing();
      if(create && ct == null) {
         ct = pr.addNewSpacing();
      }

      return ct;
   }

   private CTInd getCTInd(boolean create) {
      CTPPr pr = this.getCTPPr();
      CTInd ct = pr.getInd() == null?null:pr.getInd();
      if(create && ct == null) {
         ct = pr.addNewInd();
      }

      return ct;
   }

   private CTPPr getCTPPr() {
      CTPPr pr = this.paragraph.getPPr() == null?this.paragraph.addNewPPr():this.paragraph.getPPr();
      return pr;
   }

   protected void addRun(CTR run) {
      int pos = this.paragraph.sizeOfRArray();
      this.paragraph.addNewR();
      this.paragraph.setRArray(pos, run);
   }

   public XWPFRun createRun() {
      XWPFRun xwpfRun = new XWPFRun(this.paragraph.addNewR(), this);
      this.runs.add(xwpfRun);
      this.iruns.add(xwpfRun);
      return xwpfRun;
   }

   public XWPFRun insertNewRun(int pos) {
      if(pos >= 0 && pos <= this.runs.size()) {
         int rPos = 0;

         XWPFRun newRun;
         for(int ctRun = 0; ctRun < pos; ++ctRun) {
            newRun = (XWPFRun)this.runs.get(ctRun);
            if(!(newRun instanceof XWPFHyperlinkRun) && !(newRun instanceof XWPFFieldRun)) {
               ++rPos;
            }
         }

         CTR var8 = this.paragraph.insertNewR(rPos);
         newRun = new XWPFRun(var8, this);
         int iPos = this.iruns.size();
         if(pos < this.runs.size()) {
            XWPFRun oldAtPos = (XWPFRun)this.runs.get(pos);
            int oldAt = this.iruns.indexOf(oldAtPos);
            if(oldAt != -1) {
               iPos = oldAt;
            }
         }

         this.iruns.add(iPos, newRun);
         this.runs.add(pos, newRun);
         return newRun;
      } else {
         return null;
      }
   }

   public TextSegement searchText(String searched, PositionInParagraph startPos) {
      int startRun = startPos.getRun();
      int startText = startPos.getText();
      int startChar = startPos.getChar();
      int beginRunPos = 0;
      int candCharPos = 0;
      boolean newList = false;
      CTR[] rArray = this.paragraph.getRArray();

      for(int runPos = startRun; runPos < rArray.length; ++runPos) {
         int beginTextPos = 0;
         int beginCharPos = 0;
         int textPos = 0;
         boolean charPos = false;
         CTR ctRun = rArray[runPos];
         XmlCursor c = ctRun.newCursor();
         c.selectPath("./*");

         try {
            while(c.toNextSelection()) {
               XmlObject o = c.getObject();
               if(!(o instanceof CTText)) {
                  if(o instanceof CTProofErr) {
                     c.removeXml();
                  } else if(!(o instanceof CTRPr)) {
                     candCharPos = 0;
                  }
               } else {
                  if(textPos >= startText) {
                     String candidate = ((CTText)o).getStringValue();
                     int var24;
                     if(runPos == startRun) {
                        var24 = startChar;
                     } else {
                        var24 = 0;
                     }

                     for(; var24 < candidate.length(); ++var24) {
                        if(candidate.charAt(var24) == searched.charAt(0) && candCharPos == 0) {
                           beginTextPos = textPos;
                           beginCharPos = var24;
                           beginRunPos = runPos;
                           newList = true;
                        }

                        if(candidate.charAt(var24) == searched.charAt(candCharPos)) {
                           if(candCharPos + 1 < searched.length()) {
                              ++candCharPos;
                           } else if(newList) {
                              TextSegement segement = new TextSegement();
                              segement.setBeginRun(beginRunPos);
                              segement.setBeginText(beginTextPos);
                              segement.setBeginChar(beginCharPos);
                              segement.setEndRun(runPos);
                              segement.setEndText(textPos);
                              segement.setEndChar(var24);
                              TextSegement var20 = segement;
                              return var20;
                           }
                        } else {
                           candCharPos = 0;
                        }
                     }
                  }

                  ++textPos;
               }
            }
         } finally {
            c.dispose();
         }
      }

      return null;
   }

   public String getText(TextSegement segment) {
      int runBegin = segment.getBeginRun();
      int textBegin = segment.getBeginText();
      int charBegin = segment.getBeginChar();
      int runEnd = segment.getEndRun();
      int textEnd = segment.getEndText();
      int charEnd = segment.getEndChar();
      StringBuilder out = new StringBuilder();
      CTR[] rArray = this.paragraph.getRArray();

      for(int i = runBegin; i <= runEnd; ++i) {
         CTText[] tArray = rArray[i].getTArray();
         int startText = 0;
         int endText = tArray.length - 1;
         if(i == runBegin) {
            startText = textBegin;
         }

         if(i == runEnd) {
            endText = textEnd;
         }

         for(int j = startText; j <= endText; ++j) {
            String tmpText = tArray[j].getStringValue();
            int startChar = 0;
            int endChar = tmpText.length() - 1;
            if(j == textBegin && i == runBegin) {
               startChar = charBegin;
            }

            if(j == textEnd && i == runEnd) {
               endChar = charEnd;
            }

            out.append(tmpText.substring(startChar, endChar + 1));
         }
      }

      return out.toString();
   }

   public boolean removeRun(int pos) {
      if(pos >= 0 && pos < this.runs.size()) {
         XWPFRun run = (XWPFRun)this.runs.get(pos);
         if(!(run instanceof XWPFHyperlinkRun) && !(run instanceof XWPFFieldRun)) {
            this.runs.remove(pos);
            this.iruns.remove(run);
            int rPos = 0;

            for(int i = 0; i < pos; ++i) {
               XWPFRun currRun = (XWPFRun)this.runs.get(i);
               if(!(currRun instanceof XWPFHyperlinkRun) && !(currRun instanceof XWPFFieldRun)) {
                  ++rPos;
               }
            }

            this.getCTP().removeR(rPos);
            return true;
         } else {
            throw new IllegalArgumentException("Removing Field or Hyperlink runs not yet supported");
         }
      } else {
         return false;
      }
   }

   public BodyElementType getElementType() {
      return BodyElementType.PARAGRAPH;
   }

   public IBody getBody() {
      return this.part;
   }

   public POIXMLDocumentPart getPart() {
      return this.part != null?this.part.getPart():null;
   }

   public BodyType getPartType() {
      return this.part.getPartType();
   }

   public void addRun(XWPFRun r) {
      if(!this.runs.contains(r)) {
         this.runs.add(r);
      }

   }

   public XWPFRun getRun(CTR r) {
      for(int i = 0; i < this.getRuns().size(); ++i) {
         if(((XWPFRun)this.getRuns().get(i)).getCTR() == r) {
            return (XWPFRun)this.getRuns().get(i);
         }
      }

      return null;
   }
}
