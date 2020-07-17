package org.apache.poi.xssf.usermodel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Units;
import org.apache.poi.xssf.model.ParagraphPropertyFetcher;
import org.apache.poi.xssf.usermodel.ListAutoNumber;
import org.apache.poi.xssf.usermodel.TextAlign;
import org.apache.poi.xssf.usermodel.TextFontAlign;
import org.apache.poi.xssf.usermodel.XSSFLineBreak;
import org.apache.poi.xssf.usermodel.XSSFTextRun;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
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
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTShape;

public class XSSFTextParagraph implements Iterable {

   private final CTTextParagraph _p;
   private final CTShape _shape;
   private final List _runs;


   XSSFTextParagraph(CTTextParagraph p, CTShape ctShape) {
      this._p = p;
      this._shape = ctShape;
      this._runs = new ArrayList();
      XmlObject[] arr$ = this._p.selectPath("*");
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject ch = arr$[i$];
         if(ch instanceof CTRegularTextRun) {
            CTRegularTextRun f = (CTRegularTextRun)ch;
            this._runs.add(new XSSFTextRun(f, this));
         } else {
            CTRegularTextRun r;
            if(ch instanceof CTTextLineBreak) {
               CTTextLineBreak var9 = (CTTextLineBreak)ch;
               r = CTRegularTextRun.Factory.newInstance();
               r.setRPr(var9.getRPr());
               r.setT("\n");
               this._runs.add(new XSSFTextRun(r, this));
            } else if(ch instanceof CTTextField) {
               CTTextField var10 = (CTTextField)ch;
               r = CTRegularTextRun.Factory.newInstance();
               r.setRPr(var10.getRPr());
               r.setT(var10.getT());
               this._runs.add(new XSSFTextRun(r, this));
            }
         }
      }

   }

   public String getText() {
      StringBuilder out = new StringBuilder();
      Iterator i$ = this._runs.iterator();

      while(i$.hasNext()) {
         XSSFTextRun r = (XSSFTextRun)i$.next();
         out.append(r.getText());
      }

      return out.toString();
   }

   @Internal
   public CTTextParagraph getXmlObject() {
      return this._p;
   }

   @Internal
   public CTShape getParentShape() {
      return this._shape;
   }

   public List getTextRuns() {
      return this._runs;
   }

   public Iterator iterator() {
      return this._runs.iterator();
   }

   public XSSFTextRun addNewTextRun() {
      CTRegularTextRun r = this._p.addNewR();
      CTTextCharacterProperties rPr = r.addNewRPr();
      rPr.setLang("en-US");
      XSSFTextRun run = new XSSFTextRun(r, this);
      this._runs.add(run);
      return run;
   }

   public XSSFTextRun addLineBreak() {
      CTTextLineBreak br = this._p.addNewBr();
      CTTextCharacterProperties brProps = br.addNewRPr();
      if(this._runs.size() > 0) {
         CTTextCharacterProperties r = ((XSSFTextRun)this._runs.get(this._runs.size() - 1)).getRPr();
         brProps.set(r);
      }

      CTRegularTextRun r1 = CTRegularTextRun.Factory.newInstance();
      r1.setRPr(brProps);
      r1.setT("\n");
      XSSFLineBreak run = new XSSFLineBreak(r1, this, brProps);
      this._runs.add(run);
      return run;
   }

   public TextAlign getTextAlign() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetAlgn()) {
               TextAlign val = TextAlign.values()[props.getAlgn().intValue() - 1];
               this.setValue(val);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?TextAlign.LEFT:(TextAlign)fetcher.getValue();
   }

   public void setTextAlign(TextAlign align) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(align == null) {
         if(pr.isSetAlgn()) {
            pr.unsetAlgn();
         }
      } else {
         pr.setAlgn(STTextAlignType.Enum.forInt(align.ordinal() + 1));
      }

   }

   public TextFontAlign getTextFontAlign() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetFontAlgn()) {
               TextFontAlign val = TextFontAlign.values()[props.getFontAlgn().intValue() - 1];
               this.setValue(val);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?TextFontAlign.BASELINE:(TextFontAlign)fetcher.getValue();
   }

   public void setTextFontAlign(TextFontAlign align) {
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
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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

   public Color getBulletFontColor() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuClr() && props.getBuClr().isSetSrgbClr()) {
               CTSRgbColor clr = props.getBuClr().getSrgbClr();
               byte[] rgb = clr.getVal();
               this.setValue(new Color(255 & rgb[0], 255 & rgb[1], 255 & rgb[2]));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return (Color)fetcher.getValue();
   }

   public void setBulletFontColor(Color color) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTColor c = pr.isSetBuClr()?pr.getBuClr():pr.addNewBuClr();
      CTSRgbColor clr = c.isSetSrgbClr()?c.getSrgbClr():c.addNewSrgbClr();
      clr.setVal(new byte[]{(byte)color.getRed(), (byte)color.getGreen(), (byte)color.getBlue()});
   }

   public double getBulletFontSize() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?100.0D:((Double)fetcher.getValue()).doubleValue();
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

   public void setIndent(double value) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(value == -1.0D) {
         if(pr.isSetIndent()) {
            pr.unsetIndent();
         }
      } else {
         pr.setIndent(Units.toEMU(value));
      }

   }

   public double getIndent() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public void setLeftMargin(double value) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(value == -1.0D) {
         if(pr.isSetMarL()) {
            pr.unsetMarL();
         }
      } else {
         pr.setMarL(Units.toEMU(value));
      }

   }

   public double getLeftMargin() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public void setRightMargin(double value) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      if(value == -1.0D) {
         if(pr.isSetMarR()) {
            pr.unsetMarR();
         }
      } else {
         pr.setMarR(Units.toEMU(value));
      }

   }

   public double getRightMargin() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public double getDefaultTabSize() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public double getTabStop(final int idx) {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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

   public void setLineSpacing(double linespacing) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextSpacing spc = CTTextSpacing.Factory.newInstance();
      if(linespacing >= 0.0D) {
         spc.addNewSpcPct().setVal((int)(linespacing * 1000.0D));
      } else {
         spc.addNewSpcPts().setVal((int)(-linespacing * 100.0D));
      }

      pr.setLnSpc(spc);
   }

   public double getLineSpacing() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      double lnSpc = fetcher.getValue() == null?100.0D:((Double)fetcher.getValue()).doubleValue();
      if(lnSpc > 0.0D) {
         CTTextNormalAutofit normAutofit = this._shape.getTxBody().getBodyPr().getNormAutofit();
         if(normAutofit != null) {
            double scale = 1.0D - (double)normAutofit.getLnSpcReduction() / 100000.0D;
            lnSpc *= scale;
         }
      }

      return lnSpc;
   }

   public void setSpaceBefore(double spaceBefore) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextSpacing spc = CTTextSpacing.Factory.newInstance();
      if(spaceBefore >= 0.0D) {
         spc.addNewSpcPct().setVal((int)(spaceBefore * 1000.0D));
      } else {
         spc.addNewSpcPts().setVal((int)(-spaceBefore * 100.0D));
      }

      pr.setSpcBef(spc);
   }

   public double getSpaceBefore() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      double spcBef = fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
      return spcBef;
   }

   public void setSpaceAfter(double spaceAfter) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextSpacing spc = CTTextSpacing.Factory.newInstance();
      if(spaceAfter >= 0.0D) {
         spc.addNewSpcPct().setVal((int)(spaceAfter * 1000.0D));
      } else {
         spc.addNewSpcPts().setVal((int)(-spaceAfter * 100.0D));
      }

      pr.setSpcAft(spc);
   }

   public double getSpaceAfter() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?0.0D:((Double)fetcher.getValue()).doubleValue();
   }

   public void setLevel(int level) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      pr.setLvl(level);
   }

   public int getLevel() {
      CTTextParagraphProperties pr = this._p.getPPr();
      return pr == null?0:pr.getLvl();
   }

   public boolean isBullet() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuNone()) {
               this.setValue(Boolean.valueOf(false));
               return true;
            } else if(props.isSetBuFont() && (props.isSetBuChar() || props.isSetBuAutoNum())) {
               this.setValue(Boolean.valueOf(true));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setBullet(boolean flag) {
      if(this.isBullet() != flag) {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         if(!flag) {
            pr.addNewBuNone();
            if(pr.isSetBuAutoNum()) {
               pr.unsetBuAutoNum();
            }

            if(pr.isSetBuBlip()) {
               pr.unsetBuBlip();
            }

            if(pr.isSetBuChar()) {
               pr.unsetBuChar();
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
         } else {
            if(pr.isSetBuNone()) {
               pr.unsetBuNone();
            }

            if(!pr.isSetBuFont()) {
               pr.addNewBuFont().setTypeface("Arial");
            }

            if(!pr.isSetBuAutoNum()) {
               pr.addNewBuChar().setChar("•");
            }
         }

      }
   }

   public void setBullet(ListAutoNumber scheme, int startAt) {
      if(startAt < 1) {
         throw new IllegalArgumentException("Start Number must be greater or equal that 1");
      } else {
         CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
         CTTextAutonumberBullet lst = pr.isSetBuAutoNum()?pr.getBuAutoNum():pr.addNewBuAutoNum();
         lst.setType(STTextAutonumberScheme.Enum.forInt(scheme.ordinal() + 1));
         lst.setStartAt(startAt);
         if(!pr.isSetBuFont()) {
            pr.addNewBuFont().setTypeface("Arial");
         }

         if(pr.isSetBuNone()) {
            pr.unsetBuNone();
         }

         if(pr.isSetBuBlip()) {
            pr.unsetBuBlip();
         }

         if(pr.isSetBuChar()) {
            pr.unsetBuChar();
         }

      }
   }

   public void setBullet(ListAutoNumber scheme) {
      CTTextParagraphProperties pr = this._p.isSetPPr()?this._p.getPPr():this._p.addNewPPr();
      CTTextAutonumberBullet lst = pr.isSetBuAutoNum()?pr.getBuAutoNum():pr.addNewBuAutoNum();
      lst.setType(STTextAutonumberScheme.Enum.forInt(scheme.ordinal() + 1));
      if(!pr.isSetBuFont()) {
         pr.addNewBuFont().setTypeface("Arial");
      }

      if(pr.isSetBuNone()) {
         pr.unsetBuNone();
      }

      if(pr.isSetBuBlip()) {
         pr.unsetBuBlip();
      }

      if(pr.isSetBuChar()) {
         pr.unsetBuChar();
      }

   }

   public boolean isBulletAutoNumber() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuAutoNum()) {
               this.setValue(Boolean.valueOf(true));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public int getBulletAutoNumberStart() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
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
      return fetcher.getValue() == null?0:((Integer)fetcher.getValue()).intValue();
   }

   public ListAutoNumber getBulletAutoNumberScheme() {
      ParagraphPropertyFetcher fetcher = new ParagraphPropertyFetcher(this.getLevel()) {
         public boolean fetch(CTTextParagraphProperties props) {
            if(props.isSetBuAutoNum()) {
               this.setValue(ListAutoNumber.values()[props.getBuAutoNum().getType().intValue() - 1]);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchParagraphProperty(fetcher);
      return fetcher.getValue() == null?ListAutoNumber.ARABIC_PLAIN:(ListAutoNumber)fetcher.getValue();
   }

   private boolean fetchParagraphProperty(ParagraphPropertyFetcher visitor) {
      boolean ok = false;
      if(this._p.isSetPPr()) {
         ok = visitor.fetch(this._p.getPPr());
      }

      if(!ok) {
         ok = visitor.fetch(this._shape);
      }

      return ok;
   }

   public String toString() {
      return "[" + this.getClass() + "]" + this.getText();
   }
}
