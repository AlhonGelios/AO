package org.apache.poi.xslf.usermodel;

import java.awt.Color;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.TextRun;
import org.apache.poi.xslf.model.CharacterPropertyFetcher;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFColor;
import org.apache.poi.xslf.usermodel.XSLFHyperlink;
import org.apache.poi.xslf.usermodel.XSLFPropertiesDelegate;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHyperlink;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextStrikeType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextUnderlineType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;

public class XSLFTextRun implements TextRun {

   private final CTRegularTextRun _r;
   private final XSLFTextParagraph _p;


   protected XSLFTextRun(CTRegularTextRun r, XSLFTextParagraph p) {
      this._r = r;
      this._p = p;
   }

   XSLFTextParagraph getParentParagraph() {
      return this._p;
   }

   public String getRawText() {
      return this._r.getT();
   }

   String getRenderableText() {
      String txt = this._r.getT();
      TextRun.TextCap cap = this.getTextCap();
      StringBuffer buf = new StringBuffer();

      for(int i = 0; i < txt.length(); ++i) {
         char c = txt.charAt(i);
         if(c == 9) {
            buf.append("  ");
         } else {
            switch(XSLFTextRun.NamelessClass1388017298.$SwitchMap$org$apache$poi$sl$usermodel$TextRun$TextCap[cap.ordinal()]) {
            case 1:
               buf.append(Character.toUpperCase(c));
               break;
            case 2:
               buf.append(Character.toLowerCase(c));
               break;
            default:
               buf.append(c);
            }
         }
      }

      return buf.toString();
   }

   public void setText(String text) {
      this._r.setT(text);
   }

   public CTRegularTextRun getXmlObject() {
      return this._r;
   }

   public void setFontColor(Color color) {
      this.setFontColor((PaintStyle)DrawPaint.createSolidPaint(color));
   }

   public void setFontColor(PaintStyle color) {
      if(!(color instanceof PaintStyle.SolidPaint)) {
         throw new IllegalArgumentException("Currently only SolidPaint is supported!");
      } else {
         PaintStyle.SolidPaint sp = (PaintStyle.SolidPaint)color;
         Color c = DrawPaint.applyColorTransform(sp.getSolidColor());
         CTTextCharacterProperties rPr = this.getRPr(true);
         CTSolidColorFillProperties fill = rPr.isSetSolidFill()?rPr.getSolidFill():rPr.addNewSolidFill();
         XSLFColor col = new XSLFColor(fill, this.getParentParagraph().getParentShape().getSheet().getTheme(), fill.getSchemeClr());
         col.setColor(c);
      }
   }

   public PaintStyle getFontColor() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props == null) {
               return false;
            } else {
               XSLFTextShape shape = XSLFTextRun.this._p.getParentShape();
               CTShapeStyle style = shape.getSpStyle();
               CTSchemeColor phClr = null;
               if(style != null && style.getFontRef() != null) {
                  phClr = style.getFontRef().getSchemeClr();
               }

               XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(props);
               XSLFSheet sheet = shape.getSheet();
               PackagePart pp = sheet.getPackagePart();
               XSLFTheme theme = sheet.getTheme();
               PaintStyle ps = XSLFShape.selectPaint(fp, phClr, pp, theme);
               if(ps != null) {
                  this.setValue(ps);
                  return true;
               } else {
                  return false;
               }
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return (PaintStyle)fetcher.getValue();
   }

   public void setFontSize(Double fontSize) {
      CTTextCharacterProperties rPr = this.getRPr(true);
      if(fontSize == null) {
         if(rPr.isSetSz()) {
            rPr.unsetSz();
         }
      } else {
         if(fontSize.doubleValue() < 1.0D) {
            throw new IllegalArgumentException("Minimum font size is 1pt but was " + fontSize);
         }

         rPr.setSz((int)(100.0D * fontSize.doubleValue()));
      }

   }

   public Double getFontSize() {
      double scale = 1.0D;
      CTTextNormalAutofit afit = this.getParentParagraph().getParentShape().getTextBodyPr().getNormAutofit();
      if(afit != null) {
         scale = (double)afit.getFontScale() / 100000.0D;
      }

      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetSz()) {
               this.setValue(Double.valueOf((double)props.getSz() * 0.01D));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?null:Double.valueOf(((Double)fetcher.getValue()).doubleValue() * scale);
   }

   public double getCharacterSpacing() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetSpc()) {
               this.setValue(Double.valueOf((double)props.getSpc() * 0.01D));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public void setCharacterSpacing(double spc) {
      CTTextCharacterProperties rPr = this.getRPr(true);
      if(spc == 0.0D) {
         if(rPr.isSetSpc()) {
            rPr.unsetSpc();
         }
      } else {
         rPr.setSpc((int)(100.0D * spc));
      }

   }

   public void setFontFamily(String typeface) {
      this.setFontFamily(typeface, (byte)-1, (byte)-1, false);
   }

   public void setFontFamily(String typeface, byte charset, byte pictAndFamily, boolean isSymbol) {
      CTTextCharacterProperties rPr = this.getRPr(true);
      if(typeface == null) {
         if(rPr.isSetLatin()) {
            rPr.unsetLatin();
         }

         if(rPr.isSetCs()) {
            rPr.unsetCs();
         }

         if(rPr.isSetSym()) {
            rPr.unsetSym();
         }
      } else {
         CTTextFont latin;
         if(isSymbol) {
            latin = rPr.isSetSym()?rPr.getSym():rPr.addNewSym();
            latin.setTypeface(typeface);
         } else {
            latin = rPr.isSetLatin()?rPr.getLatin():rPr.addNewLatin();
            latin.setTypeface(typeface);
            if(charset != -1) {
               latin.setCharset(charset);
            }

            if(pictAndFamily != -1) {
               latin.setPitchFamily(pictAndFamily);
            }
         }
      }

   }

   public String getFontFamily() {
      final XSLFTheme theme = this._p.getParentShape().getSheet().getTheme();
      CharacterPropertyFetcher visitor = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null) {
               CTTextFont font = props.getLatin();
               if(font != null) {
                  String typeface = font.getTypeface();
                  if("+mj-lt".equals(typeface)) {
                     typeface = theme.getMajorFont();
                  } else if("+mn-lt".equals(typeface)) {
                     typeface = theme.getMinorFont();
                  }

                  this.setValue(typeface);
                  return true;
               }
            }

            return false;
         }
      };
      this.fetchCharacterProperty(visitor);
      return (String)visitor.getValue();
   }

   public byte getPitchAndFamily() {
      CharacterPropertyFetcher visitor = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null) {
               CTTextFont font = props.getLatin();
               if(font != null) {
                  this.setValue(Byte.valueOf(font.getPitchFamily()));
                  return true;
               }
            }

            return false;
         }
      };
      this.fetchCharacterProperty(visitor);
      return visitor.getValue() == null?0:((Byte)visitor.getValue()).byteValue();
   }

   public void setStrikethrough(boolean strike) {
      this.getRPr(true).setStrike(strike?STTextStrikeType.SNG_STRIKE:STTextStrikeType.NO_STRIKE);
   }

   public boolean isStrikethrough() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetStrike()) {
               this.setValue(Boolean.valueOf(props.getStrike() != STTextStrikeType.NO_STRIKE));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public boolean isSuperscript() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetBaseline()) {
               this.setValue(Boolean.valueOf(props.getBaseline() > 0));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setBaselineOffset(double baselineOffset) {
      this.getRPr(true).setBaseline((int)baselineOffset * 1000);
   }

   public void setSuperscript(boolean flag) {
      this.setBaselineOffset(flag?30.0D:0.0D);
   }

   public void setSubscript(boolean flag) {
      this.setBaselineOffset(flag?-25.0D:0.0D);
   }

   public boolean isSubscript() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetBaseline()) {
               this.setValue(Boolean.valueOf(props.getBaseline() < 0));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public TextRun.TextCap getTextCap() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetCap()) {
               int idx = props.getCap().intValue() - 1;
               this.setValue(TextRun.TextCap.values()[idx]);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?TextRun.TextCap.NONE:(TextRun.TextCap)fetcher.getValue();
   }

   public void setBold(boolean bold) {
      this.getRPr(true).setB(bold);
   }

   public boolean isBold() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetB()) {
               this.setValue(Boolean.valueOf(props.getB()));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setItalic(boolean italic) {
      this.getRPr(true).setI(italic);
   }

   public boolean isItalic() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetI()) {
               this.setValue(Boolean.valueOf(props.getI()));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setUnderlined(boolean underline) {
      this.getRPr(true).setU(underline?STTextUnderlineType.SNG:STTextUnderlineType.NONE);
   }

   public boolean isUnderlined() {
      CharacterPropertyFetcher fetcher = new CharacterPropertyFetcher(this._p.getIndentLevel()) {
         public boolean fetch(CTTextCharacterProperties props) {
            if(props != null && props.isSetU()) {
               this.setValue(Boolean.valueOf(props.getU() != STTextUnderlineType.NONE));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchCharacterProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   protected CTTextCharacterProperties getRPr(boolean create) {
      return this._r.isSetRPr()?this._r.getRPr():(create?this._r.addNewRPr():null);
   }

   public String toString() {
      return "[" + this.getClass() + "]" + this.getRawText();
   }

   public XSLFHyperlink createHyperlink() {
      XSLFHyperlink hl = this.getHyperlink();
      if(hl == null) {
         hl = new XSLFHyperlink(this._r.getRPr().addNewHlinkClick(), this._p.getParentShape().getSheet());
      }

      return hl;
   }

   public XSLFHyperlink getHyperlink() {
      CTTextCharacterProperties rPr = this._r.getRPr();
      if(rPr == null) {
         return null;
      } else {
         CTHyperlink hl = rPr.getHlinkClick();
         return hl == null?null:new XSLFHyperlink(hl, this._p.getParentShape().getSheet());
      }
   }

   private boolean fetchCharacterProperty(CharacterPropertyFetcher fetcher) {
      XSLFTextShape shape = this._p.getParentShape();
      XSLFSheet sheet = shape.getSheet();
      boolean ok = false;
      if(this._r.isSetRPr()) {
         ok = fetcher.fetch(this.getRPr(false));
      }

      if(ok) {
         return true;
      } else {
         ok = shape.fetchShapeProperty(fetcher);
         if(ok) {
            return true;
         } else {
            CTPlaceholder ph = shape.getCTPlaceholder();
            if(ph == null) {
               XMLSlideShow defaultProps = sheet.getSlideShow();
               CTTextParagraphProperties themeProps = defaultProps.getDefaultParagraphStyle(this._p.getIndentLevel());
               if(themeProps != null) {
                  ok = fetcher.fetch(themeProps);
               }
            }

            if(ok) {
               return true;
            } else {
               CTTextParagraphProperties defaultProps1 = this._p.getDefaultMasterStyle();
               if(defaultProps1 != null) {
                  ok = fetcher.fetch(defaultProps1);
               }

               return ok;
            }
         }
      }
   }

   void copy(XSLFTextRun r) {
      String srcFontFamily = r.getFontFamily();
      if(srcFontFamily != null && !srcFontFamily.equals(this.getFontFamily())) {
         this.setFontFamily(srcFontFamily);
      }

      PaintStyle srcFontColor = r.getFontColor();
      if(srcFontColor != null && !srcFontColor.equals(this.getFontColor())) {
         this.setFontColor(srcFontColor);
      }

      double srcFontSize = r.getFontSize().doubleValue();
      if(srcFontSize != this.getFontSize().doubleValue()) {
         this.setFontSize(Double.valueOf(srcFontSize));
      }

      boolean bold = r.isBold();
      if(bold != this.isBold()) {
         this.setBold(bold);
      }

      boolean italic = r.isItalic();
      if(italic != this.isItalic()) {
         this.setItalic(italic);
      }

      boolean underline = r.isUnderlined();
      if(underline != this.isUnderlined()) {
         this.setUnderlined(underline);
      }

      boolean strike = r.isStrikethrough();
      if(strike != this.isStrikethrough()) {
         this.setStrikethrough(strike);
      }

   }

   // $FF: synthetic class
   static class NamelessClass1388017298 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$TextRun$TextCap = new int[TextRun.TextCap.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextRun$TextCap[TextRun.TextCap.ALL.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextRun$TextCap[TextRun.TextCap.SMALL.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
