package org.apache.poi.xslf.usermodel;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLException;
import org.apache.poi.sl.draw.DrawFactory;
import org.apache.poi.sl.draw.DrawTextShape;
import org.apache.poi.sl.usermodel.Insets2D;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.sl.usermodel.TextShape;
import org.apache.poi.sl.usermodel.VerticalAlignment;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.model.TextBodyPropertyFetcher;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextWrappingType;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;

public abstract class XSLFTextShape extends XSLFSimpleShape implements TextShape {

   private final List _paragraphs = new ArrayList();


   XSLFTextShape(XmlObject shape, XSLFSheet sheet) {
      super(shape, sheet);
      CTTextBody txBody = this.getTextBody(false);
      if(txBody != null) {
         CTTextParagraph[] arr$ = txBody.getPArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTTextParagraph p = arr$[i$];
            this._paragraphs.add(this.newTextParagraph(p));
         }
      }

   }

   public Iterator iterator() {
      return this.getTextParagraphs().iterator();
   }

   public String getText() {
      StringBuilder out = new StringBuilder();

      XSLFTextParagraph p;
      for(Iterator i$ = this._paragraphs.iterator(); i$.hasNext(); out.append(p.getText())) {
         p = (XSLFTextParagraph)i$.next();
         if(out.length() > 0) {
            out.append('\n');
         }
      }

      return out.toString();
   }

   public void clearText() {
      this._paragraphs.clear();
      CTTextBody txBody = this.getTextBody(true);
      txBody.setPArray((CTTextParagraph[])null);
   }

   public XSLFTextRun setText(String text) {
      if(!this._paragraphs.isEmpty()) {
         CTTextBody txBody = this.getTextBody(false);
         int cntPs = txBody.sizeOfPArray();

         for(int i = cntPs; i > 1; --i) {
            txBody.removeP(i - 1);
            this._paragraphs.remove(i - 1);
         }

         ((XSLFTextParagraph)this._paragraphs.get(0)).clearButKeepProperties();
      }

      return this.appendText(text, false);
   }

   public XSLFTextRun appendText(String text, boolean newParagraph) {
      if(text == null) {
         return null;
      } else {
         CTTextParagraphProperties otherPPr = null;
         CTTextCharacterProperties otherRPr = null;
         boolean firstPara;
         XSLFTextParagraph para;
         if(this._paragraphs.isEmpty()) {
            firstPara = false;
            para = null;
         } else {
            firstPara = !newParagraph;
            para = (XSLFTextParagraph)this._paragraphs.get(this._paragraphs.size() - 1);
            CTTextParagraph run = para.getXmlObject();
            otherPPr = run.getPPr();
            List arr$ = para.getTextRuns();
            if(!arr$.isEmpty()) {
               XSLFTextRun len$ = (XSLFTextRun)arr$.get(arr$.size() - 1);
               otherRPr = len$.getRPr(false);
               if(otherRPr == null) {
                  otherRPr = run.getEndParaRPr();
               }
            }
         }

         XSLFTextRun var17 = null;
         String[] var18 = text.split("\\r\\n?|\\n");
         int var19 = var18.length;

         for(int i$ = 0; i$ < var19; ++i$) {
            String lineTxt = var18[i$];
            if(!firstPara) {
               if(para != null) {
                  CTTextParagraph firstRun = para.getXmlObject();
                  CTTextCharacterProperties arr$1 = firstRun.getEndParaRPr();
                  if(arr$1 != null && arr$1 != otherRPr) {
                     firstRun.unsetEndParaRPr();
                  }
               }

               para = this.addNewTextParagraph();
               if(otherPPr != null) {
                  para.getXmlObject().setPPr(otherPPr);
               }
            }

            boolean var20 = true;
            String[] var21 = lineTxt.split("[]");
            int len$1 = var21.length;

            for(int i$1 = 0; i$1 < len$1; ++i$1) {
               String runText = var21[i$1];
               if(!var20) {
                  para.addLineBreak();
               }

               var17 = para.addNewTextRun();
               var17.setText(runText);
               if(otherRPr != null) {
                  var17.getRPr(true).set(otherRPr);
               }

               var20 = false;
            }

            firstPara = false;
         }

         assert var17 != null;

         return var17;
      }
   }

   public List getTextParagraphs() {
      return this._paragraphs;
   }

   public XSLFTextParagraph addNewTextParagraph() {
      CTTextBody txBody = this.getTextBody(false);
      CTTextParagraph p;
      if(txBody == null) {
         txBody = this.getTextBody(true);
         p = txBody.getPArray(0);
         p.removeR(0);
      } else {
         p = txBody.addNewP();
      }

      XSLFTextParagraph paragraph = this.newTextParagraph(p);
      this._paragraphs.add(paragraph);
      return paragraph;
   }

   public void setVerticalAlignment(VerticalAlignment anchor) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(anchor == null) {
            if(bodyPr.isSetAnchor()) {
               bodyPr.unsetAnchor();
            }
         } else {
            bodyPr.setAnchor(STTextAnchoringType.Enum.forInt(anchor.ordinal() + 1));
         }
      }

   }

   public VerticalAlignment getVerticalAlignment() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetAnchor()) {
               int val = props.getAnchor().intValue();
               this.setValue(VerticalAlignment.values()[val - 1]);
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?VerticalAlignment.TOP:(VerticalAlignment)fetcher.getValue();
   }

   public void setHorizontalCentered(Boolean isCentered) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(isCentered == null) {
            if(bodyPr.isSetAnchorCtr()) {
               bodyPr.unsetAnchorCtr();
            }
         } else {
            bodyPr.setAnchorCtr(isCentered.booleanValue());
         }
      }

   }

   public boolean isHorizontalCentered() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetAnchorCtr()) {
               this.setValue(Boolean.valueOf(props.getAnchorCtr()));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?false:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setTextDirection(TextShape.TextDirection orientation) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(orientation == null) {
            if(bodyPr.isSetVert()) {
               bodyPr.unsetVert();
            }
         } else {
            bodyPr.setVert(STTextVerticalType.Enum.forInt(orientation.ordinal() + 1));
         }
      }

   }

   public TextShape.TextDirection getTextDirection() {
      CTTextBodyProperties bodyPr = this.getTextBodyPr();
      if(bodyPr != null) {
         STTextVerticalType.Enum val = bodyPr.getVert();
         if(val != null) {
            switch(val.intValue()) {
            case 1:
            default:
               return TextShape.TextDirection.HORIZONTAL;
            case 2:
            case 5:
            case 6:
               return TextShape.TextDirection.VERTICAL;
            case 3:
               return TextShape.TextDirection.VERTICAL_270;
            case 4:
            case 7:
               return TextShape.TextDirection.STACKED;
            }
         }
      }

      return TextShape.TextDirection.HORIZONTAL;
   }

   public Double getTextRotation() {
      CTTextBodyProperties bodyPr = this.getTextBodyPr();
      return bodyPr != null && bodyPr.isSetRot()?Double.valueOf((double)bodyPr.getRot() / 60000.0D):null;
   }

   public void setTextRotation(Double rotation) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         bodyPr.setRot((int)(rotation.doubleValue() * 60000.0D));
      }

   }

   public double getBottomInset() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetBIns()) {
               double val = Units.toPoints((long)props.getBIns());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?3.6D:((Double)fetcher.getValue()).doubleValue();
   }

   public double getLeftInset() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetLIns()) {
               double val = Units.toPoints((long)props.getLIns());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?7.2D:((Double)fetcher.getValue()).doubleValue();
   }

   public double getRightInset() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetRIns()) {
               double val = Units.toPoints((long)props.getRIns());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?7.2D:((Double)fetcher.getValue()).doubleValue();
   }

   public double getTopInset() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetTIns()) {
               double val = Units.toPoints((long)props.getTIns());
               this.setValue(Double.valueOf(val));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?3.6D:((Double)fetcher.getValue()).doubleValue();
   }

   public void setBottomInset(double margin) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(margin == -1.0D) {
            bodyPr.unsetBIns();
         } else {
            bodyPr.setBIns(Units.toEMU(margin));
         }
      }

   }

   public void setLeftInset(double margin) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(margin == -1.0D) {
            bodyPr.unsetLIns();
         } else {
            bodyPr.setLIns(Units.toEMU(margin));
         }
      }

   }

   public void setRightInset(double margin) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(margin == -1.0D) {
            bodyPr.unsetRIns();
         } else {
            bodyPr.setRIns(Units.toEMU(margin));
         }
      }

   }

   public void setTopInset(double margin) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(margin == -1.0D) {
            bodyPr.unsetTIns();
         } else {
            bodyPr.setTIns(Units.toEMU(margin));
         }
      }

   }

   public Insets2D getInsets() {
      Insets2D insets = new Insets2D(this.getTopInset(), this.getLeftInset(), this.getBottomInset(), this.getRightInset());
      return insets;
   }

   public void setInsets(Insets2D insets) {
      this.setTopInset(insets.top);
      this.setLeftInset(insets.left);
      this.setBottomInset(insets.bottom);
      this.setRightInset(insets.right);
   }

   public boolean getWordWrap() {
      TextBodyPropertyFetcher fetcher = new TextBodyPropertyFetcher() {
         public boolean fetch(CTTextBodyProperties props) {
            if(props.isSetWrap()) {
               this.setValue(Boolean.valueOf(props.getWrap() == STTextWrappingType.SQUARE));
               return true;
            } else {
               return false;
            }
         }
      };
      this.fetchShapeProperty(fetcher);
      return fetcher.getValue() == null?true:((Boolean)fetcher.getValue()).booleanValue();
   }

   public void setWordWrap(boolean wrap) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         bodyPr.setWrap(wrap?STTextWrappingType.SQUARE:STTextWrappingType.NONE);
      }

   }

   public void setTextAutofit(TextShape.TextAutofit value) {
      CTTextBodyProperties bodyPr = this.getTextBodyPr(true);
      if(bodyPr != null) {
         if(bodyPr.isSetSpAutoFit()) {
            bodyPr.unsetSpAutoFit();
         }

         if(bodyPr.isSetNoAutofit()) {
            bodyPr.unsetNoAutofit();
         }

         if(bodyPr.isSetNormAutofit()) {
            bodyPr.unsetNormAutofit();
         }

         switch(XSLFTextShape.NamelessClass1828558408.$SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextAutofit[value.ordinal()]) {
         case 1:
            bodyPr.addNewNoAutofit();
            break;
         case 2:
            bodyPr.addNewNormAutofit();
            break;
         case 3:
            bodyPr.addNewSpAutoFit();
         }
      }

   }

   public TextShape.TextAutofit getTextAutofit() {
      CTTextBodyProperties bodyPr = this.getTextBodyPr();
      if(bodyPr != null) {
         if(bodyPr.isSetNoAutofit()) {
            return TextShape.TextAutofit.NONE;
         }

         if(bodyPr.isSetNormAutofit()) {
            return TextShape.TextAutofit.NORMAL;
         }

         if(bodyPr.isSetSpAutoFit()) {
            return TextShape.TextAutofit.SHAPE;
         }
      }

      return TextShape.TextAutofit.NORMAL;
   }

   protected CTTextBodyProperties getTextBodyPr() {
      return this.getTextBodyPr(false);
   }

   protected CTTextBodyProperties getTextBodyPr(boolean create) {
      CTTextBody textBody = this.getTextBody(create);
      if(textBody == null) {
         return null;
      } else {
         CTTextBodyProperties textBodyPr = textBody.getBodyPr();
         if(textBodyPr == null && create) {
            textBodyPr = textBody.addNewBodyPr();
         }

         return textBodyPr;
      }
   }

   protected abstract CTTextBody getTextBody(boolean var1);

   public void setPlaceholder(Placeholder placeholder) {
      super.setPlaceholder(placeholder);
   }

   public Placeholder getTextType() {
      CTPlaceholder ph = this.getCTPlaceholder();
      if(ph == null) {
         return null;
      } else {
         int val = ph.getType().intValue();
         return Placeholder.lookupOoxml(val);
      }
   }

   public double getTextHeight() {
      DrawFactory drawFact = DrawFactory.getInstance((Graphics2D)null);
      DrawTextShape dts = drawFact.getDrawable((TextShape)this);
      return dts.getTextHeight();
   }

   public Rectangle2D resizeToFitText() {
      Rectangle2D anchor = this.getAnchor();
      if(anchor.getWidth() == 0.0D) {
         throw new POIXMLException("Anchor of the shape was not set.");
      } else {
         double height = this.getTextHeight();
         ++height;
         anchor.setRect(anchor.getX(), anchor.getY(), anchor.getWidth(), height);
         this.setAnchor(anchor);
         return anchor;
      }
   }

   void copy(XSLFShape other) {
      super.copy(other);
      XSLFTextShape otherTS = (XSLFTextShape)other;
      CTTextBody otherTB = otherTS.getTextBody(false);
      CTTextBody thisTB = this.getTextBody(true);
      if(otherTB != null) {
         thisTB.setBodyPr((CTTextBodyProperties)otherTB.getBodyPr().copy());
         if(thisTB.isSetLstStyle()) {
            thisTB.unsetLstStyle();
         }

         if(otherTB.isSetLstStyle()) {
            thisTB.setLstStyle((CTTextListStyle)otherTB.getLstStyle().copy());
         }

         boolean srcWordWrap = otherTS.getWordWrap();
         if(srcWordWrap != this.getWordWrap()) {
            this.setWordWrap(srcWordWrap);
         }

         double leftInset = otherTS.getLeftInset();
         if(leftInset != this.getLeftInset()) {
            this.setLeftInset(leftInset);
         }

         double rightInset = otherTS.getRightInset();
         if(rightInset != this.getRightInset()) {
            this.setRightInset(rightInset);
         }

         double topInset = otherTS.getTopInset();
         if(topInset != this.getTopInset()) {
            this.setTopInset(topInset);
         }

         double bottomInset = otherTS.getBottomInset();
         if(bottomInset != this.getBottomInset()) {
            this.setBottomInset(bottomInset);
         }

         VerticalAlignment vAlign = otherTS.getVerticalAlignment();
         if(vAlign != this.getVerticalAlignment()) {
            this.setVerticalAlignment(vAlign);
         }

         this.clearText();
         Iterator i$ = otherTS.getTextParagraphs().iterator();

         while(i$.hasNext()) {
            XSLFTextParagraph srcP = (XSLFTextParagraph)i$.next();
            XSLFTextParagraph tgtP = this.addNewTextParagraph();
            tgtP.copy(srcP);
         }

      }
   }

   public void setTextPlaceholder(TextShape.TextPlaceholder placeholder) {
      switch(XSLFTextShape.NamelessClass1828558408.$SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[placeholder.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      default:
         this.setPlaceholder(Placeholder.BODY);
         break;
      case 5:
         this.setPlaceholder(Placeholder.TITLE);
         break;
      case 6:
         this.setPlaceholder(Placeholder.BODY);
         this.setHorizontalCentered(Boolean.valueOf(true));
         break;
      case 7:
         this.setPlaceholder(Placeholder.CENTERED_TITLE);
         break;
      case 8:
         this.setPlaceholder(Placeholder.CONTENT);
      }

   }

   public TextShape.TextPlaceholder getTextPlaceholder() {
      Placeholder ph = this.getTextType();
      if(ph == null) {
         return TextShape.TextPlaceholder.BODY;
      } else {
         switch(XSLFTextShape.NamelessClass1828558408.$SwitchMap$org$apache$poi$sl$usermodel$Placeholder[ph.ordinal()]) {
         case 1:
            return TextShape.TextPlaceholder.BODY;
         case 2:
            return TextShape.TextPlaceholder.TITLE;
         case 3:
            return TextShape.TextPlaceholder.CENTER_TITLE;
         case 4:
         default:
            return TextShape.TextPlaceholder.OTHER;
         }
      }
   }

   protected XSLFTextParagraph newTextParagraph(CTTextParagraph p) {
      return new XSLFTextParagraph(p, this);
   }


   // $FF: synthetic class
   static class NamelessClass1828558408 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextAutofit;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$Placeholder = new int[Placeholder.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.BODY.ordinal()] = 1;
         } catch (NoSuchFieldError var15) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.TITLE.ordinal()] = 2;
         } catch (NoSuchFieldError var14) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.CENTERED_TITLE.ordinal()] = 3;
         } catch (NoSuchFieldError var13) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.CONTENT.ordinal()] = 4;
         } catch (NoSuchFieldError var12) {
            ;
         }

         $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder = new int[TextShape.TextPlaceholder.values().length];

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.NOTES.ordinal()] = 1;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.HALF_BODY.ordinal()] = 2;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.QUARTER_BODY.ordinal()] = 3;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.BODY.ordinal()] = 4;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.TITLE.ordinal()] = 5;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.CENTER_BODY.ordinal()] = 6;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.CENTER_TITLE.ordinal()] = 7;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextPlaceholder[TextShape.TextPlaceholder.OTHER.ordinal()] = 8;
         } catch (NoSuchFieldError var4) {
            ;
         }

         $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextAutofit = new int[TextShape.TextAutofit.values().length];

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextAutofit[TextShape.TextAutofit.NONE.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextAutofit[TextShape.TextAutofit.NORMAL.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextAutofit[TextShape.TextAutofit.SHAPE.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
