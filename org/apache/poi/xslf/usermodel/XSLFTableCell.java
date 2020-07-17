package org.apache.poi.xslf.usermodel;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import org.apache.poi.sl.draw.DrawPaint;
import org.apache.poi.sl.usermodel.ColorStyle;
import org.apache.poi.sl.usermodel.PaintStyle;
import org.apache.poi.sl.usermodel.StrokeStyle;
import org.apache.poi.sl.usermodel.TableCell;
import org.apache.poi.sl.usermodel.TextShape;
import org.apache.poi.sl.usermodel.VerticalAlignment;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFAutoShape;
import org.apache.poi.xslf.usermodel.XSLFColor;
import org.apache.poi.xslf.usermodel.XSLFPropertiesDelegate;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableStyle;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFontReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineEndProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSchemeColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCell;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTablePartStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleCellStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleTextStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTransform2D;
import org.openxmlformats.schemas.drawingml.x2006.main.STCompoundLine;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineCap;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndLength;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndType;
import org.openxmlformats.schemas.drawingml.x2006.main.STLineEndWidth;
import org.openxmlformats.schemas.drawingml.x2006.main.STPenAlignment;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextAnchoringType;
import org.openxmlformats.schemas.drawingml.x2006.main.STTextVerticalType;

public class XSLFTableCell extends XSLFTextShape implements TableCell {

   private CTTableCellProperties _tcPr = null;
   private final XSLFTable table;
   private int row = 0;
   private int col = 0;
   private Rectangle2D anchor = null;


   XSLFTableCell(CTTableCell cell, XSLFTable table) {
      super(cell, table.getSheet());
      this.table = table;
   }

   protected CTTextBody getTextBody(boolean create) {
      CTTableCell cell = this.getCell();
      CTTextBody txBody = cell.getTxBody();
      if(txBody == null && create) {
         txBody = cell.addNewTxBody();
         XSLFAutoShape.initTextBody(txBody);
      }

      return txBody;
   }

   static CTTableCell prototype() {
      CTTableCell cell = CTTableCell.Factory.newInstance();
      CTTableCellProperties pr = cell.addNewTcPr();
      pr.addNewLnL().addNewNoFill();
      pr.addNewLnR().addNewNoFill();
      pr.addNewLnT().addNewNoFill();
      pr.addNewLnB().addNewNoFill();
      return cell;
   }

   protected CTTableCellProperties getCellProperties(boolean create) {
      if(this._tcPr == null) {
         CTTableCell cell = this.getCell();
         this._tcPr = cell.getTcPr();
         if(this._tcPr == null && create) {
            this._tcPr = cell.addNewTcPr();
         }
      }

      return this._tcPr;
   }

   public void setLeftInset(double margin) {
      CTTableCellProperties pr = this.getCellProperties(true);
      pr.setMarL(Units.toEMU(margin));
   }

   public void setRightInset(double margin) {
      CTTableCellProperties pr = this.getCellProperties(true);
      pr.setMarR(Units.toEMU(margin));
   }

   public void setTopInset(double margin) {
      CTTableCellProperties pr = this.getCellProperties(true);
      pr.setMarT(Units.toEMU(margin));
   }

   public void setBottomInset(double margin) {
      CTTableCellProperties pr = this.getCellProperties(true);
      pr.setMarB(Units.toEMU(margin));
   }

   private CTLineProperties getCTLine(TableCell.BorderEdge edge, boolean create) {
      if(edge == null) {
         throw new IllegalArgumentException("BorderEdge needs to be specified.");
      } else {
         CTTableCellProperties pr = this.getCellProperties(create);
         if(pr == null) {
            return null;
         } else {
            switch(XSLFTableCell.NamelessClass450666552.$SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[edge.ordinal()]) {
            case 1:
               return pr.isSetLnB()?pr.getLnB():(create?pr.addNewLnB():null);
            case 2:
               return pr.isSetLnL()?pr.getLnL():(create?pr.addNewLnL():null);
            case 3:
               return pr.isSetLnT()?pr.getLnT():(create?pr.addNewLnT():null);
            case 4:
               return pr.isSetLnR()?pr.getLnR():(create?pr.addNewLnR():null);
            default:
               return null;
            }
         }
      }
   }

   public void removeBorder(TableCell.BorderEdge edge) {
      CTTableCellProperties pr = this.getCellProperties(false);
      if(pr != null) {
         switch(XSLFTableCell.NamelessClass450666552.$SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[edge.ordinal()]) {
         case 1:
            if(pr.isSetLnB()) {
               pr.unsetLnB();
            }
            break;
         case 2:
            if(pr.isSetLnL()) {
               pr.unsetLnL();
            }
            break;
         case 3:
            if(pr.isSetLnT()) {
               pr.unsetLnT();
            }
            break;
         case 4:
            if(pr.isSetLnR()) {
               pr.unsetLnB();
            }
            break;
         default:
            throw new IllegalArgumentException();
         }

      }
   }

   public StrokeStyle getBorderStyle(final TableCell.BorderEdge edge) {
      final Double width = this.getBorderWidth(edge);
      return width == null?null:new StrokeStyle() {
         public PaintStyle getPaint() {
            return DrawPaint.createSolidPaint(XSLFTableCell.this.getBorderColor(edge));
         }
         public StrokeStyle.LineCap getLineCap() {
            return XSLFTableCell.this.getBorderCap(edge);
         }
         public StrokeStyle.LineDash getLineDash() {
            return XSLFTableCell.this.getBorderDash(edge);
         }
         public StrokeStyle.LineCompound getLineCompound() {
            return XSLFTableCell.this.getBorderCompound(edge);
         }
         public double getLineWidth() {
            return width.doubleValue();
         }
      };
   }

   public void setBorderStyle(TableCell.BorderEdge edge, StrokeStyle style) {
      if(style == null) {
         throw new IllegalArgumentException("StrokeStyle needs to be specified.");
      } else {
         StrokeStyle.LineCap cap = style.getLineCap();
         if(cap != null) {
            this.setBorderCap(edge, cap);
         }

         StrokeStyle.LineCompound compound = style.getLineCompound();
         if(compound != null) {
            this.setBorderCompound(edge, compound);
         }

         StrokeStyle.LineDash dash = style.getLineDash();
         if(dash != null) {
            this.setBorderDash(edge, dash);
         }

         double width = style.getLineWidth();
         this.setBorderWidth(edge, width);
      }
   }

   public Double getBorderWidth(TableCell.BorderEdge edge) {
      CTLineProperties ln = this.getCTLine(edge, false);
      return ln != null && ln.isSetW()?Double.valueOf(Units.toPoints((long)ln.getW())):null;
   }

   public void setBorderWidth(TableCell.BorderEdge edge, double width) {
      CTLineProperties ln = this.getCTLine(edge, true);
      ln.setW(Units.toEMU(width));
   }

   private CTLineProperties setBorderDefaults(TableCell.BorderEdge edge) {
      CTLineProperties ln = this.getCTLine(edge, true);
      if(ln.isSetNoFill()) {
         ln.unsetNoFill();
      }

      if(!ln.isSetPrstDash()) {
         ln.addNewPrstDash().setVal(STPresetLineDashVal.SOLID);
      }

      if(!ln.isSetCmpd()) {
         ln.setCmpd(STCompoundLine.SNG);
      }

      if(!ln.isSetAlgn()) {
         ln.setAlgn(STPenAlignment.CTR);
      }

      if(!ln.isSetCap()) {
         ln.setCap(STLineCap.FLAT);
      }

      if(!ln.isSetRound()) {
         ln.addNewRound();
      }

      CTLineEndProperties tl;
      if(!ln.isSetHeadEnd()) {
         tl = ln.addNewHeadEnd();
         tl.setType(STLineEndType.NONE);
         tl.setW(STLineEndWidth.MED);
         tl.setLen(STLineEndLength.MED);
      }

      if(!ln.isSetTailEnd()) {
         tl = ln.addNewTailEnd();
         tl.setType(STLineEndType.NONE);
         tl.setW(STLineEndWidth.MED);
         tl.setLen(STLineEndLength.MED);
      }

      return ln;
   }

   public void setBorderColor(TableCell.BorderEdge edge, Color color) {
      if(color == null) {
         throw new IllegalArgumentException("Colors need to be specified.");
      } else {
         CTLineProperties ln = this.setBorderDefaults(edge);
         CTSolidColorFillProperties fill = ln.addNewSolidFill();
         XSLFColor c = new XSLFColor(fill, this.getSheet().getTheme(), fill.getSchemeClr());
         c.setColor(color);
      }
   }

   public Color getBorderColor(TableCell.BorderEdge edge) {
      CTLineProperties ln = this.getCTLine(edge, false);
      if(ln != null && !ln.isSetNoFill() && ln.isSetSolidFill()) {
         CTSolidColorFillProperties fill = ln.getSolidFill();
         XSLFColor c = new XSLFColor(fill, this.getSheet().getTheme(), fill.getSchemeClr());
         return c.getColor();
      } else {
         return null;
      }
   }

   public StrokeStyle.LineCompound getBorderCompound(TableCell.BorderEdge edge) {
      CTLineProperties ln = this.getCTLine(edge, false);
      return ln != null && !ln.isSetNoFill() && ln.isSetSolidFill() && ln.isSetCmpd()?StrokeStyle.LineCompound.fromOoxmlId(ln.getCmpd().intValue()):null;
   }

   public void setBorderCompound(TableCell.BorderEdge edge, StrokeStyle.LineCompound compound) {
      if(compound == null) {
         throw new IllegalArgumentException("LineCompound need to be specified.");
      } else {
         CTLineProperties ln = this.setBorderDefaults(edge);
         ln.setCmpd(STCompoundLine.Enum.forInt(compound.ooxmlId));
      }
   }

   public StrokeStyle.LineDash getBorderDash(TableCell.BorderEdge edge) {
      CTLineProperties ln = this.getCTLine(edge, false);
      return ln != null && !ln.isSetNoFill() && ln.isSetSolidFill() && ln.isSetPrstDash()?StrokeStyle.LineDash.fromOoxmlId(ln.getPrstDash().getVal().intValue()):null;
   }

   public void setBorderDash(TableCell.BorderEdge edge, StrokeStyle.LineDash dash) {
      if(dash == null) {
         throw new IllegalArgumentException("LineDash need to be specified.");
      } else {
         CTLineProperties ln = this.setBorderDefaults(edge);
         ln.getPrstDash().setVal(STPresetLineDashVal.Enum.forInt(dash.ooxmlId));
      }
   }

   public StrokeStyle.LineCap getBorderCap(TableCell.BorderEdge edge) {
      CTLineProperties ln = this.getCTLine(edge, false);
      return ln != null && !ln.isSetNoFill() && ln.isSetSolidFill() && ln.isSetCap()?StrokeStyle.LineCap.fromOoxmlId(ln.getCap().intValue()):null;
   }

   public void setBorderCap(TableCell.BorderEdge edge, StrokeStyle.LineCap cap) {
      if(cap == null) {
         throw new IllegalArgumentException("LineCap need to be specified.");
      } else {
         CTLineProperties ln = this.setBorderDefaults(edge);
         ln.setCap(STLineCap.Enum.forInt(cap.ooxmlId));
      }
   }

   public void setFillColor(Color color) {
      CTTableCellProperties spPr = this.getCellProperties(true);
      if(color == null) {
         if(spPr.isSetSolidFill()) {
            spPr.unsetSolidFill();
         }
      } else {
         CTSolidColorFillProperties fill = spPr.isSetSolidFill()?spPr.getSolidFill():spPr.addNewSolidFill();
         XSLFColor c = new XSLFColor(fill, this.getSheet().getTheme(), fill.getSchemeClr());
         c.setColor(color);
      }

   }

   public Color getFillColor() {
      PaintStyle ps = this.getFillPaint();
      if(ps instanceof PaintStyle.SolidPaint) {
         ColorStyle cs = ((PaintStyle.SolidPaint)ps).getSolidColor();
         return DrawPaint.applyColorTransform(cs);
      } else {
         return null;
      }
   }

   public PaintStyle getFillPaint() {
      XSLFSheet sheet = this.getSheet();
      XSLFTheme theme = sheet.getTheme();
      CTTableCellProperties props = this.getCellProperties(false);
      XSLFPropertiesDelegate.XSLFFillProperties fp = XSLFPropertiesDelegate.getFillDelegate(props);
      if(fp != null) {
         PaintStyle tps = selectPaint(fp, (CTSchemeColor)null, sheet.getPackagePart(), theme);
         if(tps != null) {
            return tps;
         }
      }

      CTTablePartStyle tps1 = this.getTablePartStyle((XSLFTableStyle.TablePartStyle)null);
      if(tps1 == null || !tps1.isSetTcStyle()) {
         tps1 = this.getTablePartStyle(XSLFTableStyle.TablePartStyle.wholeTbl);
         if(tps1 == null || !tps1.isSetTcStyle()) {
            return null;
         }
      }

      XMLSlideShow slideShow = sheet.getSlideShow();
      CTTableStyleCellStyle tcStyle = tps1.getTcStyle();
      Object props1;
      if(tcStyle.isSetFill()) {
         props1 = tcStyle.getFill();
      } else {
         if(!tcStyle.isSetFillRef()) {
            return null;
         }

         props1 = tcStyle.getFillRef();
      }

      fp = XSLFPropertiesDelegate.getFillDelegate((XmlObject)props1);
      if(fp != null) {
         PaintStyle paint = XSLFShape.selectPaint(fp, (CTSchemeColor)null, slideShow.getPackagePart(), theme);
         if(paint != null) {
            return paint;
         }
      }

      return null;
   }

   private CTTablePartStyle getTablePartStyle(XSLFTableStyle.TablePartStyle tablePartStyle) {
      CTTable ct = this.table.getCTTable();
      if(!ct.isSetTblPr()) {
         return null;
      } else {
         CTTableProperties pr = ct.getTblPr();
         boolean bandRow = pr.isSetBandRow() && pr.getBandRow();
         boolean firstRow = pr.isSetFirstRow() && pr.getFirstRow();
         boolean lastRow = pr.isSetLastRow() && pr.getLastRow();
         boolean bandCol = pr.isSetBandCol() && pr.getBandCol();
         boolean firstCol = pr.isSetFirstCol() && pr.getFirstCol();
         boolean lastCol = pr.isSetLastCol() && pr.getLastCol();
         XSLFTableStyle.TablePartStyle tps;
         if(tablePartStyle != null) {
            tps = tablePartStyle;
         } else if(this.row == 0 && firstRow) {
            tps = XSLFTableStyle.TablePartStyle.firstRow;
         } else if(this.row == this.table.getNumberOfRows() - 1 && lastRow) {
            tps = XSLFTableStyle.TablePartStyle.lastRow;
         } else if(this.col == 0 && firstCol) {
            tps = XSLFTableStyle.TablePartStyle.firstCol;
         } else if(this.col == this.table.getNumberOfColumns() - 1 && lastCol) {
            tps = XSLFTableStyle.TablePartStyle.lastCol;
         } else {
            tps = XSLFTableStyle.TablePartStyle.wholeTbl;
            int tabStyle = this.row + (firstRow?1:0);
            int part = this.col + (firstCol?1:0);
            if(bandRow && (tabStyle & 1) == 0) {
               tps = XSLFTableStyle.TablePartStyle.band1H;
            } else if(bandCol && (part & 1) == 0) {
               tps = XSLFTableStyle.TablePartStyle.band1V;
            }
         }

         XSLFTableStyle tabStyle1 = this.table.getTableStyle();
         if(tabStyle1 == null) {
            return null;
         } else {
            CTTablePartStyle part1 = tabStyle1.getTablePartStyle(tps);
            return part1 == null?tabStyle1.getTablePartStyle(XSLFTableStyle.TablePartStyle.wholeTbl):part1;
         }
      }
   }

   void setGridSpan(int gridSpan_) {
      this.getCell().setGridSpan(gridSpan_);
   }

   public int getGridSpan() {
      CTTableCell c = this.getCell();
      return c.isSetGridSpan()?c.getGridSpan():1;
   }

   void setRowSpan(int rowSpan_) {
      this.getCell().setRowSpan(rowSpan_);
   }

   public int getRowSpan() {
      CTTableCell c = this.getCell();
      return c.isSetRowSpan()?c.getRowSpan():1;
   }

   void setHMerge(boolean merge_) {
      this.getCell().setHMerge(merge_);
   }

   void setVMerge(boolean merge_) {
      this.getCell().setVMerge(merge_);
   }

   public void setVerticalAlignment(VerticalAlignment anchor) {
      CTTableCellProperties cellProps = this.getCellProperties(true);
      if(anchor == null) {
         if(cellProps.isSetAnchor()) {
            cellProps.unsetAnchor();
         }
      } else {
         cellProps.setAnchor(STTextAnchoringType.Enum.forInt(anchor.ordinal() + 1));
      }

   }

   public VerticalAlignment getVerticalAlignment() {
      CTTableCellProperties cellProps = this.getCellProperties(false);
      VerticalAlignment align = VerticalAlignment.TOP;
      if(cellProps != null && cellProps.isSetAnchor()) {
         int ival = cellProps.getAnchor().intValue();
         align = VerticalAlignment.values()[ival - 1];
      }

      return align;
   }

   public void setTextDirection(TextShape.TextDirection orientation) {
      CTTableCellProperties cellProps = this.getCellProperties(true);
      if(orientation == null) {
         if(cellProps.isSetVert()) {
            cellProps.unsetVert();
         }
      } else {
         STTextVerticalType.Enum vt;
         switch(XSLFTableCell.NamelessClass450666552.$SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextDirection[orientation.ordinal()]) {
         case 1:
         default:
            vt = STTextVerticalType.HORZ;
            break;
         case 2:
            vt = STTextVerticalType.VERT;
            break;
         case 3:
            vt = STTextVerticalType.VERT_270;
            break;
         case 4:
            vt = STTextVerticalType.WORD_ART_VERT;
         }

         cellProps.setVert(vt);
      }

   }

   public TextShape.TextDirection getTextDirection() {
      CTTableCellProperties cellProps = this.getCellProperties(false);
      STTextVerticalType.Enum orientation;
      if(cellProps != null && cellProps.isSetVert()) {
         orientation = cellProps.getVert();
      } else {
         orientation = STTextVerticalType.HORZ;
      }

      switch(orientation.intValue()) {
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

   private CTTableCell getCell() {
      return (CTTableCell)this.getXmlObject();
   }

   void setRowColIndex(int row, int col) {
      this.row = row;
      this.col = col;
   }

   protected CTTransform2D getXfrm() {
      Rectangle2D anc = this.getAnchor();
      CTTransform2D xfrm = CTTransform2D.Factory.newInstance();
      CTPoint2D off = xfrm.addNewOff();
      off.setX((long)Units.toEMU(anc.getX()));
      off.setY((long)Units.toEMU(anc.getY()));
      CTPositiveSize2D size = xfrm.addNewExt();
      size.setCx((long)Units.toEMU(anc.getWidth()));
      size.setCy((long)Units.toEMU(anc.getHeight()));
      return xfrm;
   }

   public void setAnchor(Rectangle2D anchor) {
      if(this.anchor == null) {
         this.anchor = (Rectangle2D)anchor.clone();
      } else {
         this.anchor.setRect(anchor);
      }

   }

   public Rectangle2D getAnchor() {
      if(this.anchor == null) {
         this.table.updateCellAnchor();
      }

      assert this.anchor != null;

      return this.anchor;
   }

   public boolean isMerged() {
      CTTableCell c = this.getCell();
      return c.isSetHMerge() && c.getHMerge() || c.isSetVMerge() && c.getVMerge();
   }

   protected XSLFTableCell.XSLFCellTextParagraph newTextParagraph(CTTextParagraph p) {
      return new XSLFTableCell.XSLFCellTextParagraph(p, this);
   }

   protected XmlObject getShapeProperties() {
      return this.getCellProperties(false);
   }


   // $FF: synthetic class
   static class NamelessClass450666552 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge;
      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextDirection = new int[TextShape.TextDirection.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextDirection[TextShape.TextDirection.HORIZONTAL.ordinal()] = 1;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextDirection[TextShape.TextDirection.VERTICAL.ordinal()] = 2;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextDirection[TextShape.TextDirection.VERTICAL_270.ordinal()] = 3;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TextShape$TextDirection[TextShape.TextDirection.STACKED.ordinal()] = 4;
         } catch (NoSuchFieldError var5) {
            ;
         }

         $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge = new int[TableCell.BorderEdge.values().length];

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.bottom.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.left.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.top.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$TableCell$BorderEdge[TableCell.BorderEdge.right.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   private class XSLFCellTextRun extends XSLFTextRun {

      protected XSLFCellTextRun(CTRegularTextRun r, XSLFTextParagraph p) {
         super(r, p);
      }

      public PaintStyle getFontColor() {
         CTTableStyleTextStyle txStyle = this.getTextStyle();
         if(txStyle == null) {
            return super.getFontColor();
         } else {
            CTSchemeColor phClr = null;
            CTFontReference fontRef = txStyle.getFontRef();
            if(fontRef != null) {
               phClr = fontRef.getSchemeClr();
            }

            XSLFTheme theme = XSLFTableCell.this.getSheet().getTheme();
            XSLFColor c = new XSLFColor(txStyle, theme, phClr);
            return DrawPaint.createSolidPaint(c.getColorStyle());
         }
      }

      public boolean isBold() {
         CTTableStyleTextStyle txStyle = this.getTextStyle();
         return txStyle == null?super.isBold():txStyle.isSetB() && txStyle.getB().intValue() == 1;
      }

      public boolean isItalic() {
         CTTableStyleTextStyle txStyle = this.getTextStyle();
         return txStyle == null?super.isItalic():txStyle.isSetI() && txStyle.getI().intValue() == 1;
      }

      private CTTableStyleTextStyle getTextStyle() {
         CTTablePartStyle tps = XSLFTableCell.this.getTablePartStyle((XSLFTableStyle.TablePartStyle)null);
         if(tps == null || !tps.isSetTcTxStyle()) {
            tps = XSLFTableCell.this.getTablePartStyle(XSLFTableStyle.TablePartStyle.wholeTbl);
         }

         return tps == null?null:tps.getTcTxStyle();
      }
   }

   private class XSLFCellTextParagraph extends XSLFTextParagraph {

      protected XSLFCellTextParagraph(CTTextParagraph p, XSLFTextShape shape) {
         super(p, shape);
      }

      protected XSLFTableCell.XSLFCellTextRun newTextRun(CTRegularTextRun r) {
         return XSLFTableCell.this.new XSLFCellTextRun(r, this);
      }
   }
}
