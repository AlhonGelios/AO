package org.apache.poi.xslf.usermodel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.usermodel.AutoNumberingScheme;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.TextParagraph;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.model.ParagraphPropertyFetcher;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFColor;
import org.apache.poi.xslf.usermodel.XSLFLineBreak;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextAutonumberBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePercent;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBulletSizePoint;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharBullet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextField;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextFont;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextLineBreak;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextSpacing;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStop;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextTabStopList;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAlignType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAutonumberScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontAlignType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;

public class XSLFTextParagraph implements TextParagraph {

   private final CTTextParagraph _p;
   private final List _runs;
   private final XSLFTextShape _shape;


   XSLFTextParagraph(CTTextParagraph p, XSLFTextShape shape) {
      this._p = p;
      this._runs = new ArrayList();
      this._shape = shape;
      XmlObject[] arr$ = this._p.selectPath("*");
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject ch = arr$[i$];
         if(ch instanceof CTRegularTextRun) {
            CTRegularTextRun f = (CTRegularTextRun)ch;
            this._runs.add(this.newTextRun(f));
         } else {
            CTRegularTextRun r;
            if(ch instanceof CTTextLineBreak) {
               CTTextLineBreak var9 = (CTTextLineBreak)ch;
               r = CTRegularTextRun.Factory.newInstance();
               r.setRPr(var9.getRPr());
               r.setT("\n");
               this._runs.add(this.newTextRun(r));
            } else if(ch instanceof CTTextField) {
               CTTextField var10 = (CTTextField)ch;
               r = CTRegularTextRun.Factory.newInstance();
               r.setRPr(var10.getRPr());
               r.setT(var10.getT());
               this._runs.add(this.newTextRun(r));
            }
         }
      }

   }

   public String getText() {
      StringBuilder out = new StringBuilder();
      Iterator i$ = this._runs.iterator();

      while(i$.hasNext()) {
         XSLFTextRun r = (XSLFTextRun)i$.next();
         out.append(r.getRawText());
      }

      return out.toString();
   }

   String getRenderableText() {
      StringBuilder out = new StringBuilder();
      Iterator i$ = this._runs.iterator();

      while(i$.hasNext()) {
         XSLFTextRun r = (XSLFTextRun)i$.next();
         out.append(r.getRenderableText());
      }

      return out.toString();
   }

   @Internal
   public CTTextParagraph getXmlObject() {
      return this._p;
   }

   public XSLFTextShape getParentShape() {
      return this._shape;
   }

   public List getTextRuns() {
      return this._runs;
   }

   public Iterator iterator() {
      return this._runs.iterator();
   }

   public XSLFTextRun addNewTextRun() {
      CTRegularTextRun r = this._p.addNewR();
      CTTextCharacterProperties rPr = r.addNewRPr();
      rPr.setLang("en-US");
      XSLFTextRun run = this.newTextRun(r);
      this._runs.add(run);
      return run;
   }

   public XSLFTextRun addLineBreak() {
      CTTextLineBreak br = this._p.addNewBr();
      CTTextCharacterProperties brProps = br.addNewRPr();
      if(this._runs.size() > 0) {
         CTTextCharacterProperties r = ((XSLFTextRun)this._runs.get(this._runs.size() - 1)).getRPr(true);
         brProps.set(r);
      }

      CTRegularTextRun r1 = CTRegularTextRun.Factory.newInstance();
      r1.setRPr(brProps);
      r1.setT("\n");
      XSLFLineBreak run = new XSLFLineBreak(r1, this, brProps);
      this._runs.add(run);
      return run;
   }

   public TextParagraph.TextAlign getTextAlign() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetAlgn()) {
               TextParagraph.TextAlign val = TextParagraph.TextAlign.values()[props.getAlgn().intValue() - 1];
               this.setValue(val);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (TextParagraph.TextAlign)fetcher.getValue();
   }

   public void setTextAlign(TextParagraph.TextAlign align) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(align == null) {
         if(pr.isSetAlgn()) {
            pr.unsetAlgn();
         }
      } else {
         pr.setAlgn(STTextAlignType.Enum.forInt(align.ordinal() + 1));
      }

   }

   public TextParagraph.FontAlign getFontAlign() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetFontAlgn()) {
               TextParagraph.FontAlign val = TextParagraph.FontAlign.values()[props.getFontAlgn().intValue() - 1];
               this.setValue(val);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (TextParagraph.FontAlign)fetcher.getValue();
   }

   public void setFontAlign(TextParagraph.FontAlign align) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(align == null) {
         if(pr.isSetFontAlgn()) {
            pr.unsetFontAlgn();
         }
      } else {
         pr.setFontAlgn(STTextFontAlignType.Enum.forInt(align.ordinal() + 1));
      }

   }

   public String getBulletFont() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuFont()) {
               this.setValue(props.getBuFont().getTypeface());
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (String)fetcher.getValue();
   }

   public void setBulletFont(String typeface) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextFont font = pr.isSetBuFont()?pr.getBuFont():pr.addNewBuFont();
      font.setTypeface(typeface);
   }

   public String getBulletCharacter() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuChar()) {
               this.setValue(props.getBuChar().getChar());
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (String)fetcher.getValue();
   }

   public void setBulletCharacter(String str) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextCharBullet c = pr.isSetBuChar()?pr.getBuChar():pr.addNewBuChar();
      c.setChar(str);
   }

   public PaintStyle getBulletFontColor() {
      final XSLFTheme theme = this.getParentShape().getSheet().getTheme();
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuClr()) {
               XSLFColor c = new XSLFColor(props.getBuClr(), theme, (CTSchemeColor)null);
               this.setValue(c.getColor());
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      Color col = (Color)fetcher.getValue();
      return col == null?null:DrawPaint.createSolidPaint(col);
   }

   public void setBulletFontColor(Color color) {
      this.setBulletFontColor((PaintStyle)DrawPaint.createSolidPaint(color));
   }

   public void setBulletFontColor(PaintStyle color) {
      if(!(color instanceof PaintStyle.SolidPaint)) {
         throw new IllegalArgumentException("Currently XSLF only supports SolidPaint");
      } else {
         PaintStyle.SolidPaint sp = (PaintStyle.SolidPaint)color;
         Color col = DrawPaint.applyColorTransform(sp.getSolidColor());
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         CTColor c = pr.isSetBuClr()?pr.getBuClr():pr.addNewBuClr();
         CTSRgbColor clr = c.isSetSrgbClr()?c.getSrgbClr():c.addNewSrgbClr();
         clr.setVal(new byte[]{(byte)col.getRed(), (byte)col.getGreen(), (byte)col.getBlue()});
      }
   }

   public Double getBulletFontSize() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuSzPct()) {
               this.setValue(Double.valueOf((double)props.getBuSzPct().getVal() * 0.001D));
               return true;
            } else if(props.isSetBuSzPts()) {
               this.setValue(Double.valueOf((double)(-props.getBuSzPts().getVal()) * 0.01D));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public void setBulletFontSize(double bulletSize) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(bulletSize >= 0.0D) {
         CTTextBulletSizePercent pt = pr.isSetBuSzPct()?pr.getBuSzPct():pr.addNewBuSzPct();
         pt.setVal((int)(bulletSize * 1000.0D));
         if(pr.isSetBuSzPts()) {
            pr.unsetBuSzPts();
         }
      } else {
         CTTextBulletSizePoint pt1 = pr.isSetBuSzPts()?pr.getBuSzPts():pr.addNewBuSzPts();
         pt1.setVal((int)(-bulletSize * 100.0D));
         if(pr.isSetBuSzPct()) {
            pr.unsetBuSzPct();
         }
      }

   }

   public AutoNumberingScheme getAutoNumberingScheme() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuAutoNum()) {
               AutoNumberingScheme ans = AutoNumberingScheme.forOoxmlID(props.getBuAutoNum().getType().intValue());
               if(ans != null) {
                  this.setValue(ans);
                  return true;
               }
            }

            return false;
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (AutoNumberingScheme)fetcher.getValue();
   }

   public Integer getAutoNumberingStartAt() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuAutoNum() && props.getBuAutoNum().isSetStartAt()) {
               this.setValue(Integer.valueOf(props.getBuAutoNum().getStartAt()));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Integer)fetcher.getValue();
   }

   public void setIndent(Double indent) {
      if(indent != null || this._p.isSetPPr()) {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         if(indent == null) {
            if(pr.isSetIndent()) {
               pr.unsetIndent();
            }
         } else {
            pr.setIndent(Units.toEMU(indent.doubleValue()));
         }

      }
   }

   public Double getIndent() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetIndent()) {
               this.setValue(Double.valueOf(Units.toPoints((long)props.getIndent())));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public void setLeftMargin(Double leftMargin) {
      if(leftMargin != null || this._p.isSetPPr()) {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         if(leftMargin == null) {
            if(pr.isSetMarL()) {
               pr.unsetMarL();
            }
         } else {
            pr.setMarL(Units.toEMU(leftMargin.doubleValue()));
         }

      }
   }

   public Double getLeftMargin() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetMarL()) {
               double val = Units.toPoints((long)props.getMarL());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public void setRightMargin(Double rightMargin) {
      if(rightMargin != null || this._p.isSetPPr()) {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         if(rightMargin == null) {
            if(pr.isSetMarR()) {
               pr.unsetMarR();
            }
         } else {
            pr.setMarR(Units.toEMU(rightMargin.doubleValue()));
         }

      }
   }

   public Double getRightMargin() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetMarR()) {
               double val = Units.toPoints((long)props.getMarR());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public Double getDefaultTabSize() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetDefTabSz()) {
               double val = Units.toPoints((long)props.getDefTabSz());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public double getTabStop(final int idx) {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetTabLst()) {
               CTTextTabStopList tabStops = props.getTabLst();
               if(idx < tabStops.sizeOfTabArray()) {
                  CTTextTabStop ts = tabStops.getTabArray(idx);
                  double val = Units.toPoints((long)ts.getPos());
                  this.setValue(Double.valueOf(val));
                  return true;
               }
            }

            return false;
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public void addTabStop(double value) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextTabStopList tabStops = pr.isSetTabLst()?pr.getTabLst():pr.addNewTabLst();
      tabStops.addNewTab().setPos(Units.toEMU(value));
   }

   public void setLineSpacing(Double lineSpacing) {
      if(lineSpacing != null || this._p.isSetPPr()) {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         if(lineSpacing == null) {
            if(pr.isSetLnSpc()) {
               pr.unsetLnSpc();
            }
         } else {
            CTTextSpacing spc = pr.isSetLnSpc()?pr.getLnSpc():pr.addNewLnSpc();
            if(lineSpacing.doubleValue() >= 0.0D) {
               (spc.isSetSpcPct()?spc.getSpcPct():spc.addNewSpcPct()).setVal((int)(lineSpacing.doubleValue() * 1000.0D));
               if(spc.isSetSpcPts()) {
                  spc.unsetSpcPts();
               }
            } else {
               (spc.isSetSpcPts()?spc.getSpcPts():spc.addNewSpcPts()).setVal((int)(-lineSpacing.doubleValue() * 100.0D));
               if(spc.isSetSpcPct()) {
                  spc.unsetSpcPct();
               }
            }
         }

      }
   }

   public Double getLineSpacing() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetLnSpc()) {
               CTTextSpacing spc = props.getLnSpc();
               if(spc.isSetSpcPct()) {
                  this.setValue(Double.valueOf((double)spc.getSpcPct().getVal() * 0.001D));
               } else if(spc.isSetSpcPts()) {
                  this.setValue(Double.valueOf((double)(-spc.getSpcPts().getVal()) * 0.01D));
               }

               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      Double lnSpc = (Double)fetcher.getValue();
      if(lnSpc != null && lnSpc.doubleValue() > 0.0D) {
         CTTextNormalAutofit normAutofit = this.getParentShape().getTextBodyPr().getNormAutofit();
         if(normAutofit != null) {
            double scale = 1.0D - (double)normAutofit.getLnSpcReduction() / 100000.0D;
            lnSpc = Double.valueOf(lnSpc.doubleValue() * scale);
         }
      }

      return lnSpc;
   }

   public void setSpaceBefore(Double spaceBefore) {
      if(spaceBefore != null || this._p.isSetPPr()) {
         if(spaceBefore == null) {
            if(this._p.getPPr().isSetSpcBef()) {
               this._p.getPPr().unsetSpcBef();
            }

         } else {
            CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
            CTTextSpacing spc = CTTextSpacing.Factory.newInstance();
            if(spaceBefore.doubleValue() >= 0.0D) {
               spc.addNewSpcPct().setVal((int)(spaceBefore.doubleValue() * 1000.0D));
            } else {
               spc.addNewSpcPts().setVal((int)(-spaceBefore.doubleValue() * 100.0D));
            }

            pr.setSpcBef(spc);
         }
      }
   }

   public Double getSpaceBefore() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetSpcBef()) {
               CTTextSpacing spc = props.getSpcBef();
               if(spc.isSetSpcPct()) {
                  this.setValue(Double.valueOf((double)spc.getSpcPct().getVal() * 0.001D));
               } else if(spc.isSetSpcPts()) {
                  this.setValue(Double.valueOf((double)(-spc.getSpcPts().getVal()) * 0.01D));
               }

               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public void setSpaceAfter(Double spaceAfter) {
      if(spaceAfter != null || this._p.isSetPPr()) {
         if(spaceAfter == null) {
            if(this._p.getPPr().isSetSpcAft()) {
               this._p.getPPr().unsetSpcAft();
            }

         } else {
            CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
            CTTextSpacing spc = CTTextSpacing.Factory.newInstance();
            if(spaceAfter.doubleValue() >= 0.0D) {
               spc.addNewSpcPct().setVal((int)(spaceAfter.doubleValue() * 1000.0D));
            } else {
               spc.addNewSpcPts().setVal((int)(-spaceAfter.doubleValue() * 100.0D));
            }

            pr.setSpcAft(spc);
         }
      }
   }

   public Double getSpaceAfter() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetSpcAft()) {
               CTTextSpacing spc = props.getSpcAft();
               if(spc.isSetSpcPct()) {
                  this.setValue(Double.valueOf((double)spc.getSpcPct().getVal() * 0.001D));
               } else if(spc.isSetSpcPts()) {
                  this.setValue(Double.valueOf((double)(-spc.getSpcPts().getVal()) * 0.01D));
               }

               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Double)fetcher.getValue();
   }

   public void setIndentLevel(int level) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      pr.setLvl(level);
   }

   public int getIndentLevel() {
      CTTextParagraphProperties pr = this._p.getPPr();
      return pr != null && pr.isSetLvl()?pr.getLvl():0;
   }

   public boolean isBullet() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getIndentLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuNone()) {
               this.setValue(Boolean.valueOf(false));
               return true;
            } else if(!props.isSetBuFont() && !props.isSetBuChar()) {
               return false;
            } else {
               this.setValue(Boolean.valueOf(true));
               return true;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setBullet(boolean flag) {
      if(this.isBullet() != flag) {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         if(flag) {
            pr.addNewBuFont().setTypeface("Arial");
            pr.addNewBuChar().setChar("•");
         } else {
            if(pr.isSetBuFont()) {
               pr.unsetBuFont();
            }

            if(pr.isSetBuChar()) {
               pr.unsetBuChar();
            }

            if(pr.isSetBuAutoNum()) {
               pr.unsetBuAutoNum();
            }

            if(pr.isSetBuBlip()) {
               pr.unsetBuBlip();
            }

            if(pr.isSetBuClr()) {
               pr.unsetBuClr();
            }

            if(pr.isSetBuClrTx()) {
               pr.unsetBuClrTx();
            }

            if(pr.isSetBuFont()) {
               pr.unsetBuFont();
            }

            if(pr.isSetBuFontTx()) {
               pr.unsetBuFontTx();
            }

            if(pr.isSetBuSzPct()) {
               pr.unsetBuSzPct();
            }

            if(pr.isSetBuSzPts()) {
               pr.unsetBuSzPts();
            }

            if(pr.isSetBuSzTx()) {
               pr.unsetBuSzTx();
            }

            pr.addNewBuNone();
         }

      }
   }

   public void setBulletAutoNumber(AutoNumberingScheme scheme, int startAt) {
      if(startAt < 1) {
         throw new IllegalArgumentException("Start Number must be greater or equal that 1");
      } else {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         CTTextAutonumberBullet lst = pr.isSetBuAutoNum()?pr.getBuAutoNum():pr.addNewBuAutoNum();
         lst.setType(STTextAutonumberScheme.Enum.forInt(scheme.ooxmlId));
         lst.setStartAt(startAt);
      }
   }

   public String toString() {
      return "[" + this.getClass() + "]" + this.getText();
   }

   CTTextParagraphProperties getDefaultMasterStyle() {
      CTPlaceholder ph = this._shape.getCTPlaceholder();
      String defaultStyleSelector;
      switch(ph == null?-1:ph.getType().intValue()) {
      case -1:
      case 5:
      case 6:
      case 7:
         defaultStyleSelector = "otherStyle";
         break;
      case 0:
      case 2:
      case 4:
      default:
         defaultStyleSelector = "bodyStyle";
         break;
      case 1:
      case 3:
         defaultStyleSelector = "titleStyle";
      }

      int level = this.getIndentLevel();
      String nsPML = "http://schemas.openxmlformats.org/presentationml/2006/main";
      String nsDML = "http://schemas.openxmlformats.org/drawingml/2006/main";
      XSLFSheet masterSheet = this._shape.getSheet();

      for(XSLFSheet m = masterSheet; m != null; m = (XSLFSheet)m.getMasterSheet()) {
         XmlObject xo = m.getXmlObject();
         XmlCursor cur = xo.newCursor();

         try {
            cur.push();
            if(cur.toChild("http://schemas.openxmlformats.org/presentationml/2006/main", "txStyles") && cur.toChild("http://schemas.openxmlformats.org/presentationml/2006/main", defaultStyleSelector) || cur.pop() && cur.toChild("http://schemas.openxmlformats.org/presentationml/2006/main", "notesStyle")) {
               while(level >= 0) {
                  cur.push();
                  if(cur.toChild("http://schemas.openxmlformats.org/drawingml/2006/main", "lvl" + (level + 1) + "pPr")) {
                     CTTextParagraphProperties var10 = (CTTextParagraphProperties)cur.getObject();
                     return var10;
                  }

                  cur.pop();
                  --level;
               }
            }
         } finally {
            cur.dispose();
         }
      }

      return null;
   }

   private boolean fetchParagraphProperty(ParagraphPropertyFetcher visitor) {
      boolean ok = false;
      XSLFTextShape shape = this.getParentShape();
      XSLFSheet sheet = shape.getSheet();
      if(this._p.isSetPPr()) {
         ok = visitor.fetch(this._p.getPPr());
      }

      if(ok) {
         return true;
      } else {
         ok = shape.fetchShapeProperty(visitor);
         if(ok) {
            return true;
         } else {
            CTPlaceholder ph = shape.getCTPlaceholder();
            if(ph == null) {
               XMLSlideShow defaultProps = sheet.getSlideShow();
               CTTextParagraphProperties themeProps = defaultProps.getDefaultParagraphStyle(this.getIndentLevel());
               if(themeProps != null) {
                  ok = visitor.fetch(themeProps);
               }
            }

            if(ok) {
               return true;
            } else {
               CTTextParagraphProperties defaultProps1 = this.getDefaultMasterStyle();
               if(defaultProps1 != null) {
                  ok = visitor.fetch(defaultProps1);
               }

               return ok;
            }
         }
      }
   }

   void copy(XSLFTextParagraph other) {
      if(other != this) {
         CTTextParagraph thisP = this.getXmlObject();
         CTTextParagraph otherP = other.getXmlObject();
         if(thisP.isSetPPr()) {
            thisP.unsetPPr();
         }

         if(thisP.isSetEndParaRPr()) {
            thisP.unsetEndParaRPr();
         }

         this._runs.clear();

         int thisC;
         for(thisC = thisP.sizeOfBrArray(); thisC > 0; --thisC) {
            thisP.removeBr(thisC - 1);
         }

         for(thisC = thisP.sizeOfRArray(); thisC > 0; --thisC) {
            thisP.removeR(thisC - 1);
         }

         for(thisC = thisP.sizeOfFldArray(); thisC > 0; --thisC) {
            thisP.removeFld(thisC - 1);
         }

         XmlCursor var15 = thisP.newCursor();
         var15.toEndToken();
         XmlCursor otherC = otherP.newCursor();
         otherC.copyXmlContents(var15);
         otherC.dispose();
         var15.dispose();
         List otherRs = other.getTextRuns();
         int i = 0;
         CTRegularTextRun[] srcAlign = thisP.getRArray();
         int isBullet = srcAlign.length;

         for(int leftMargin = 0; leftMargin < isBullet; ++leftMargin) {
            CTRegularTextRun indent = srcAlign[leftMargin];
            XSLFTextRun spaceAfter = this.newTextRun(indent);
            spaceAfter.copy((XSLFTextRun)otherRs.get(i++));
            this._runs.add(spaceAfter);
         }

         TextParagraph.TextAlign var16 = other.getTextAlign();
         if(var16 != this.getTextAlign()) {
            this.setTextAlign(var16);
         }

         boolean var17 = other.isBullet();
         Double spaceBefore;
         if(var17 != this.isBullet()) {
            this.setBullet(var17);
            if(var17) {
               String var18 = other.getBulletFont();
               if(var18 != null && !var18.equals(this.getBulletFont())) {
                  this.setBulletFont(var18);
               }

               String var20 = other.getBulletCharacter();
               if(var20 != null && !var20.equals(this.getBulletCharacter())) {
                  this.setBulletCharacter(var20);
               }

               PaintStyle var22 = other.getBulletFontColor();
               if(var22 != null && !var22.equals(this.getBulletFontColor())) {
                  this.setBulletFontColor(var22);
               }

               spaceBefore = other.getBulletFontSize();
               if(!doubleEquals(spaceBefore, this.getBulletFontSize())) {
                  this.setBulletFontSize(spaceBefore.doubleValue());
               }
            }
         }

         Double var19 = other.getLeftMargin();
         if(!doubleEquals(var19, this.getLeftMargin())) {
            this.setLeftMargin(var19);
         }

         Double var21 = other.getIndent();
         if(!doubleEquals(var21, this.getIndent())) {
            this.setIndent(var21);
         }

         Double var23 = other.getSpaceAfter();
         if(!doubleEquals(var23, this.getSpaceAfter())) {
            this.setSpaceAfter(var23);
         }

         spaceBefore = other.getSpaceBefore();
         if(!doubleEquals(spaceBefore, this.getSpaceBefore())) {
            this.setSpaceBefore(spaceBefore);
         }

         Double lineSpacing = other.getLineSpacing();
         if(!doubleEquals(lineSpacing, this.getLineSpacing())) {
            this.setLineSpacing(lineSpacing);
         }

      }
   }

   private static boolean doubleEquals(Double d1, Double d2) {
      return d1 == d2 || d1 != null && d1.equals(d2);
   }

   public Double getDefaultFontSize() {
      CTTextCharacterProperties endPr = this._p.getEndParaRPr();
      if(endPr == null || !endPr.isSetSz()) {
         CTTextParagraphProperties masterStyle = this.getDefaultMasterStyle();
         if(masterStyle != null) {
            endPr = masterStyle.getDefRPr();
         }
      }

      return Double.valueOf(endPr != null && endPr.isSetSz()?(double)endPr.getSz() / 100.0D:12.0D);
   }

   public String getDefaultFontFamily() {
      return this._runs.isEmpty()?"Arial":((XSLFTextRun)this._runs.get(0)).getFontFamily();
   }

   public TextParagraph.BulletStyle getBulletStyle() {
      return !this.isBullet()?null:new TextParagraph.BulletStyle() {
         public String getBulletCharacter() {
            return XSLFTextParagraph.this.getBulletCharacter();
         }
         public String getBulletFont() {
            return XSLFTextParagraph.this.getBulletFont();
         }
         public Double getBulletFontSize() {
            return XSLFTextParagraph.this.getBulletFontSize();
         }
         public PaintStyle getBulletFontColor() {
            return XSLFTextParagraph.this.getBulletFontColor();
         }
         public void setBulletFontColor(Color color) {
            this.setBulletFontColor((PaintStyle)DrawPaint.createSolidPaint(color));
         }
         public void setBulletFontColor(PaintStyle color) {
            XSLFTextParagraph.this.setBulletFontColor(color);
         }
         public AutoNumberingScheme getAutoNumberingScheme() {
            return XSLFTextParagraph.this.getAutoNumberingScheme();
         }
         public Integer getAutoNumberingStartAt() {
            return XSLFTextParagraph.this.getAutoNumberingStartAt();
         }
      };
   }

   public void setBulletStyle(Object ... styles) {
      if(styles.length == 0) {
         this.setBullet(false);
      } else {
         this.setBullet(true);
         Object[] arr$ = styles;
         int len$ = styles.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Object ostyle = arr$[i$];
            if(ostyle instanceof Number) {
               this.setBulletFontSize(((Number)ostyle).doubleValue());
            } else if(ostyle instanceof Color) {
               this.setBulletFontColor((Color)ostyle);
            } else if(ostyle instanceof Character) {
               this.setBulletCharacter(ostyle.toString());
            } else if(ostyle instanceof String) {
               this.setBulletFont((String)ostyle);
            } else if(ostyle instanceof AutoNumberingScheme) {
               this.setBulletAutoNumber((AutoNumberingScheme)ostyle, 0);
            }
         }
      }

   }

   void clearButKeepProperties() {
      CTTextParagraph thisP = this.getXmlObject();

      int size;
      for(size = thisP.sizeOfBrArray(); size > 0; --size) {
         thisP.removeBr(size - 1);
      }

      for(size = thisP.sizeOfFldArray(); size > 0; --size) {
         thisP.removeFld(size - 1);
      }

      if(!this._runs.isEmpty()) {
         size = this._runs.size();
         XSLFTextRun lastRun = (XSLFTextRun)this._runs.get(size - 1);
         CTTextCharacterProperties cpOther = lastRun.getRPr(false);
         if(cpOther != null) {
            if(thisP.isSetEndParaRPr()) {
               thisP.unsetEndParaRPr();
            }

            CTTextCharacterProperties i = thisP.addNewEndParaRPr();
            i.set(cpOther);
         }

         for(int var6 = size; var6 > 0; --var6) {
            thisP.removeR(var6 - 1);
         }

         this._runs.clear();
      }

   }

   public boolean isHeaderOrFooter() {
      CTPlaceholder ph = this._shape.getCTPlaceholder();
      int phId = ph == null?-1:ph.getType().intValue();
      switch(phId) {
      case 5:
      case 6:
      case 7:
      case 8:
         return true;
      default:
         return false;
      }
   }

   protected XSLFTextRun newTextRun(CTRegularTextRun r) {
      return new XSLFTextRun(r, this);
   }
}
