package org.apache.poi.xssf.usermodel;

import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellFill;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellAlignment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPatternFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType;

public class XSSFCellStyle implements CellStyle {

   private int _cellXfId;
   private final StylesTable _stylesSource;
   private CTXf _cellXf;
   private final CTXf _cellStyleXf;
   private XSSFFont _font;
   private XSSFCellAlignment _cellAlignment;
   private ThemesTable _theme;


   public XSSFCellStyle(int cellXfId, int cellStyleXfId, StylesTable stylesSource, ThemesTable theme) {
      this._cellXfId = cellXfId;
      this._stylesSource = stylesSource;
      this._cellXf = stylesSource.getCellXfAt(this._cellXfId);
      this._cellStyleXf = cellStyleXfId == -1?null:stylesSource.getCellStyleXfAt(cellStyleXfId);
      this._theme = theme;
   }

   @Internal
   public CTXf getCoreXf() {
      return this._cellXf;
   }

   @Internal
   public CTXf getStyleXf() {
      return this._cellStyleXf;
   }

   public XSSFCellStyle(StylesTable stylesSource) {
      this._stylesSource = stylesSource;
      this._cellXf = CTXf.Factory.newInstance();
      this._cellStyleXf = null;
   }

   public void verifyBelongsToStylesSource(StylesTable src) {
      if(this._stylesSource != src) {
         throw new IllegalArgumentException("This Style does not belong to the supplied Workbook Stlyes Source. Are you trying to assign a style from one workbook to the cell of a differnt workbook?");
      }
   }

   public void cloneStyleFrom(CellStyle source) {
      if(!(source instanceof XSSFCellStyle)) {
         throw new IllegalArgumentException("Can only clone from one XSSFCellStyle to another, not between HSSFCellStyle and XSSFCellStyle");
      } else {
         XSSFCellStyle src = (XSSFCellStyle)source;
         if(src._stylesSource == this._stylesSource) {
            this._cellXf.set(src.getCoreXf());
            this._cellStyleXf.set(src.getStyleXf());
         } else {
            try {
               if(this._cellXf.isSetAlignment()) {
                  this._cellXf.unsetAlignment();
               }

               if(this._cellXf.isSetExtLst()) {
                  this._cellXf.unsetExtLst();
               }

               this._cellXf = CTXf.Factory.parse(src.getCoreXf().toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               CTFill fmt = CTFill.Factory.parse(src.getCTFill().toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               this.addFill(fmt);
               CTBorder e = CTBorder.Factory.parse(src.getCTBorder().toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               this.addBorder(e);
               this._stylesSource.replaceCellXfAt(this._cellXfId, this._cellXf);
            } catch (XmlException var7) {
               throw new POIXMLException(var7);
            }

            String fmt1 = src.getDataFormatString();
            this.setDataFormat((new XSSFDataFormat(this._stylesSource)).getFormat(fmt1));

            try {
               CTFont e1 = CTFont.Factory.parse(src.getFont().getCTFont().toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               XSSFFont font = new XSSFFont(e1);
               font.registerTo(this._stylesSource);
               this.setFont(font);
            } catch (XmlException var6) {
               throw new POIXMLException(var6);
            }
         }

         this._font = null;
         this._cellAlignment = null;
      }
   }

   private void addFill(CTFill fill) {
      int idx = this._stylesSource.putFill(new XSSFCellFill(fill));
      this._cellXf.setFillId((long)idx);
      this._cellXf.setApplyFill(true);
   }

   private void addBorder(CTBorder border) {
      int idx = this._stylesSource.putBorder(new XSSFCellBorder(border, this._theme));
      this._cellXf.setBorderId((long)idx);
      this._cellXf.setApplyBorder(true);
   }

   public short getAlignment() {
      return this.getAlignmentEnum().getCode();
   }

   public HorizontalAlignment getAlignmentEnum() {
      CTCellAlignment align = this._cellXf.getAlignment();
      return align != null && align.isSetHorizontal()?HorizontalAlignment.forInt(align.getHorizontal().intValue() - 1):HorizontalAlignment.GENERAL;
   }

   public BorderStyle getBorderBottomEnum() {
      if(!this._cellXf.getApplyBorder()) {
         return BorderStyle.NONE;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         CTBorder ct = this._stylesSource.getBorderAt(idx).getCTBorder();
         STBorderStyle.Enum ptrn = ct.isSetBottom()?ct.getBottom().getStyle():null;
         return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
      }
   }

   public short getBorderBottom() {
      return this.getBorderBottomEnum().getCode();
   }

   public BorderStyle getBorderLeftEnum() {
      if(!this._cellXf.getApplyBorder()) {
         return BorderStyle.NONE;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         CTBorder ct = this._stylesSource.getBorderAt(idx).getCTBorder();
         STBorderStyle.Enum ptrn = ct.isSetLeft()?ct.getLeft().getStyle():null;
         return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
      }
   }

   public short getBorderLeft() {
      return this.getBorderLeftEnum().getCode();
   }

   public BorderStyle getBorderRightEnum() {
      if(!this._cellXf.getApplyBorder()) {
         return BorderStyle.NONE;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         CTBorder ct = this._stylesSource.getBorderAt(idx).getCTBorder();
         STBorderStyle.Enum ptrn = ct.isSetRight()?ct.getRight().getStyle():null;
         return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
      }
   }

   public short getBorderRight() {
      return this.getBorderRightEnum().getCode();
   }

   public BorderStyle getBorderTopEnum() {
      if(!this._cellXf.getApplyBorder()) {
         return BorderStyle.NONE;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         CTBorder ct = this._stylesSource.getBorderAt(idx).getCTBorder();
         STBorderStyle.Enum ptrn = ct.isSetTop()?ct.getTop().getStyle():null;
         return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
      }
   }

   public short getBorderTop() {
      return this.getBorderTopEnum().getCode();
   }

   public short getBottomBorderColor() {
      XSSFColor clr = this.getBottomBorderXSSFColor();
      return clr == null?IndexedColors.BLACK.getIndex():clr.getIndexed();
   }

   public XSSFColor getBottomBorderXSSFColor() {
      if(!this._cellXf.getApplyBorder()) {
         return null;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         XSSFCellBorder border = this._stylesSource.getBorderAt(idx);
         return border.getBorderColor(XSSFCellBorder.BorderSide.BOTTOM);
      }
   }

   public short getDataFormat() {
      return (short)((int)this._cellXf.getNumFmtId());
   }

   public String getDataFormatString() {
      short idx = this.getDataFormat();
      return (new XSSFDataFormat(this._stylesSource)).getFormat((short)idx);
   }

   public short getFillBackgroundColor() {
      XSSFColor clr = this.getFillBackgroundXSSFColor();
      return clr == null?IndexedColors.AUTOMATIC.getIndex():clr.getIndexed();
   }

   public XSSFColor getFillBackgroundColorColor() {
      return this.getFillBackgroundXSSFColor();
   }

   public XSSFColor getFillBackgroundXSSFColor() {
      if(this._cellXf.isSetApplyFill() && !this._cellXf.getApplyFill()) {
         return null;
      } else {
         int fillIndex = (int)this._cellXf.getFillId();
         XSSFCellFill fg = this._stylesSource.getFillAt(fillIndex);
         XSSFColor fillBackgroundColor = fg.getFillBackgroundColor();
         if(fillBackgroundColor != null && this._theme != null) {
            this._theme.inheritFromThemeAsRequired(fillBackgroundColor);
         }

         return fillBackgroundColor;
      }
   }

   public short getFillForegroundColor() {
      XSSFColor clr = this.getFillForegroundXSSFColor();
      return clr == null?IndexedColors.AUTOMATIC.getIndex():clr.getIndexed();
   }

   public XSSFColor getFillForegroundColorColor() {
      return this.getFillForegroundXSSFColor();
   }

   public XSSFColor getFillForegroundXSSFColor() {
      if(this._cellXf.isSetApplyFill() && !this._cellXf.getApplyFill()) {
         return null;
      } else {
         int fillIndex = (int)this._cellXf.getFillId();
         XSSFCellFill fg = this._stylesSource.getFillAt(fillIndex);
         XSSFColor fillForegroundColor = fg.getFillForegroundColor();
         if(fillForegroundColor != null && this._theme != null) {
            this._theme.inheritFromThemeAsRequired(fillForegroundColor);
         }

         return fillForegroundColor;
      }
   }

   public short getFillPattern() {
      return this.getFillPatternEnum().getCode();
   }

   public FillPatternType getFillPatternEnum() {
      if(this._cellXf.isSetApplyFill() && !this._cellXf.getApplyFill()) {
         return FillPatternType.NO_FILL;
      } else {
         int fillIndex = (int)this._cellXf.getFillId();
         XSSFCellFill fill = this._stylesSource.getFillAt(fillIndex);
         STPatternType.Enum ptrn = fill.getPatternType();
         return ptrn == null?FillPatternType.NO_FILL:FillPatternType.forInt(ptrn.intValue() - 1);
      }
   }

   public XSSFFont getFont() {
      if(this._font == null) {
         this._font = this._stylesSource.getFontAt(this.getFontId());
      }

      return this._font;
   }

   public short getFontIndex() {
      return (short)this.getFontId();
   }

   public boolean getHidden() {
      return this._cellXf.isSetProtection() && this._cellXf.getProtection().isSetHidden()?this._cellXf.getProtection().getHidden():false;
   }

   public short getIndention() {
      CTCellAlignment align = this._cellXf.getAlignment();
      return (short)((int)(align == null?0L:align.getIndent()));
   }

   public short getIndex() {
      return (short)this._cellXfId;
   }

   protected int getUIndex() {
      return this._cellXfId;
   }

   public short getLeftBorderColor() {
      XSSFColor clr = this.getLeftBorderXSSFColor();
      return clr == null?IndexedColors.BLACK.getIndex():clr.getIndexed();
   }

   public XSSFColor getLeftBorderXSSFColor() {
      if(!this._cellXf.getApplyBorder()) {
         return null;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         XSSFCellBorder border = this._stylesSource.getBorderAt(idx);
         return border.getBorderColor(XSSFCellBorder.BorderSide.LEFT);
      }
   }

   public boolean getLocked() {
      return this._cellXf.isSetProtection() && this._cellXf.getProtection().isSetLocked()?this._cellXf.getProtection().getLocked():true;
   }

   public short getRightBorderColor() {
      XSSFColor clr = this.getRightBorderXSSFColor();
      return clr == null?IndexedColors.BLACK.getIndex():clr.getIndexed();
   }

   public XSSFColor getRightBorderXSSFColor() {
      if(!this._cellXf.getApplyBorder()) {
         return null;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         XSSFCellBorder border = this._stylesSource.getBorderAt(idx);
         return border.getBorderColor(XSSFCellBorder.BorderSide.RIGHT);
      }
   }

   public short getRotation() {
      CTCellAlignment align = this._cellXf.getAlignment();
      return (short)((int)(align == null?0L:align.getTextRotation()));
   }

   public boolean getShrinkToFit() {
      CTCellAlignment align = this._cellXf.getAlignment();
      return align != null && align.getShrinkToFit();
   }

   public short getTopBorderColor() {
      XSSFColor clr = this.getTopBorderXSSFColor();
      return clr == null?IndexedColors.BLACK.getIndex():clr.getIndexed();
   }

   public XSSFColor getTopBorderXSSFColor() {
      if(!this._cellXf.getApplyBorder()) {
         return null;
      } else {
         int idx = (int)this._cellXf.getBorderId();
         XSSFCellBorder border = this._stylesSource.getBorderAt(idx);
         return border.getBorderColor(XSSFCellBorder.BorderSide.TOP);
      }
   }

   public short getVerticalAlignment() {
      return this.getVerticalAlignmentEnum().getCode();
   }

   public VerticalAlignment getVerticalAlignmentEnum() {
      CTCellAlignment align = this._cellXf.getAlignment();
      return align != null && align.isSetVertical()?VerticalAlignment.forInt(align.getVertical().intValue() - 1):VerticalAlignment.BOTTOM;
   }

   public boolean getWrapText() {
      CTCellAlignment align = this._cellXf.getAlignment();
      return align != null && align.getWrapText();
   }

   @Removal(
      version = "3.17"
   )
   public void setAlignment(short align) {
      this.setAlignment(HorizontalAlignment.forInt(align));
   }

   public void setAlignment(HorizontalAlignment align) {
      this.getCellAlignment().setHorizontal(align);
   }

   @Removal(
      version = "3.17"
   )
   public void setBorderBottom(short border) {
      this.setBorderBottom(BorderStyle.valueOf(border));
   }

   public void setBorderBottom(BorderStyle border) {
      CTBorder ct = this.getCTBorder();
      CTBorderPr pr = ct.isSetBottom()?ct.getBottom():ct.addNewBottom();
      if(border == BorderStyle.NONE) {
         ct.unsetBottom();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

      int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
      this._cellXf.setBorderId((long)idx);
      this._cellXf.setApplyBorder(true);
   }

   @Removal(
      version = "3.17"
   )
   public void setBorderLeft(short border) {
      this.setBorderLeft(BorderStyle.valueOf(border));
   }

   public void setBorderLeft(BorderStyle border) {
      CTBorder ct = this.getCTBorder();
      CTBorderPr pr = ct.isSetLeft()?ct.getLeft():ct.addNewLeft();
      if(border == BorderStyle.NONE) {
         ct.unsetLeft();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

      int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
      this._cellXf.setBorderId((long)idx);
      this._cellXf.setApplyBorder(true);
   }

   @Removal(
      version = "3.17"
   )
   public void setBorderRight(short border) {
      this.setBorderRight(BorderStyle.valueOf(border));
   }

   public void setBorderRight(BorderStyle border) {
      CTBorder ct = this.getCTBorder();
      CTBorderPr pr = ct.isSetRight()?ct.getRight():ct.addNewRight();
      if(border == BorderStyle.NONE) {
         ct.unsetRight();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

      int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
      this._cellXf.setBorderId((long)idx);
      this._cellXf.setApplyBorder(true);
   }

   @Removal(
      version = "3.17"
   )
   public void setBorderTop(short border) {
      this.setBorderTop(BorderStyle.valueOf(border));
   }

   public void setBorderTop(BorderStyle border) {
      CTBorder ct = this.getCTBorder();
      CTBorderPr pr = ct.isSetTop()?ct.getTop():ct.addNewTop();
      if(border == BorderStyle.NONE) {
         ct.unsetTop();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

      int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
      this._cellXf.setBorderId((long)idx);
      this._cellXf.setApplyBorder(true);
   }

   public void setBottomBorderColor(short color) {
      XSSFColor clr = new XSSFColor();
      clr.setIndexed(color);
      this.setBottomBorderColor(clr);
   }

   public void setBottomBorderColor(XSSFColor color) {
      CTBorder ct = this.getCTBorder();
      if(color != null || ct.isSetBottom()) {
         CTBorderPr pr = ct.isSetBottom()?ct.getBottom():ct.addNewBottom();
         if(color != null) {
            pr.setColor(color.getCTColor());
         } else {
            pr.unsetColor();
         }

         int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
         this._cellXf.setBorderId((long)idx);
         this._cellXf.setApplyBorder(true);
      }
   }

   public void setDataFormat(short fmt) {
      this.setDataFormat(fmt & '\uffff');
   }

   public void setDataFormat(int fmt) {
      this._cellXf.setApplyNumberFormat(true);
      this._cellXf.setNumFmtId((long)fmt);
   }

   public void setFillBackgroundColor(XSSFColor color) {
      CTFill ct = this.getCTFill();
      CTPatternFill ptrn = ct.getPatternFill();
      if(color == null) {
         if(ptrn != null && ptrn.isSetBgColor()) {
            ptrn.unsetBgColor();
         }
      } else {
         if(ptrn == null) {
            ptrn = ct.addNewPatternFill();
         }

         ptrn.setBgColor(color.getCTColor());
      }

      this.addFill(ct);
   }

   public void setFillBackgroundColor(short bg) {
      XSSFColor clr = new XSSFColor();
      clr.setIndexed(bg);
      this.setFillBackgroundColor(clr);
   }

   public void setFillForegroundColor(XSSFColor color) {
      CTFill ct = this.getCTFill();
      CTPatternFill ptrn = ct.getPatternFill();
      if(color == null) {
         if(ptrn != null && ptrn.isSetFgColor()) {
            ptrn.unsetFgColor();
         }
      } else {
         if(ptrn == null) {
            ptrn = ct.addNewPatternFill();
         }

         ptrn.setFgColor(color.getCTColor());
      }

      this.addFill(ct);
   }

   public void setFillForegroundColor(short fg) {
      XSSFColor clr = new XSSFColor();
      clr.setIndexed(fg);
      this.setFillForegroundColor(clr);
   }

   private CTFill getCTFill() {
      CTFill ct;
      if(this._cellXf.isSetApplyFill() && !this._cellXf.getApplyFill()) {
         ct = CTFill.Factory.newInstance();
      } else {
         int fillIndex = (int)this._cellXf.getFillId();
         XSSFCellFill cf = this._stylesSource.getFillAt(fillIndex);
         ct = (CTFill)cf.getCTFill().copy();
      }

      return ct;
   }

   private CTBorder getCTBorder() {
      CTBorder ct;
      if(this._cellXf.getApplyBorder()) {
         int idx = (int)this._cellXf.getBorderId();
         XSSFCellBorder cf = this._stylesSource.getBorderAt(idx);
         ct = (CTBorder)cf.getCTBorder().copy();
      } else {
         ct = CTBorder.Factory.newInstance();
      }

      return ct;
   }

   @Removal(
      version = "3.17"
   )
   public void setFillPattern(short fp) {
      this.setFillPattern(FillPatternType.forInt(fp));
   }

   public void setFillPattern(FillPatternType pattern) {
      CTFill ct = this.getCTFill();
      CTPatternFill ctptrn = ct.isSetPatternFill()?ct.getPatternFill():ct.addNewPatternFill();
      if(pattern == FillPatternType.NO_FILL && ctptrn.isSetPatternType()) {
         ctptrn.unsetPatternType();
      } else {
         ctptrn.setPatternType(STPatternType.Enum.forInt(pattern.getCode() + 1));
      }

      this.addFill(ct);
   }

   public void setFont(Font font) {
      if(font != null) {
         long index = (long)font.getIndex();
         this._cellXf.setFontId(index);
         this._cellXf.setApplyFont(true);
      } else {
         this._cellXf.setApplyFont(false);
      }

   }

   public void setHidden(boolean hidden) {
      if(!this._cellXf.isSetProtection()) {
         this._cellXf.addNewProtection();
      }

      this._cellXf.getProtection().setHidden(hidden);
   }

   public void setIndention(short indent) {
      this.getCellAlignment().setIndent((long)indent);
   }

   public void setLeftBorderColor(short color) {
      XSSFColor clr = new XSSFColor();
      clr.setIndexed(color);
      this.setLeftBorderColor(clr);
   }

   public void setLeftBorderColor(XSSFColor color) {
      CTBorder ct = this.getCTBorder();
      if(color != null || ct.isSetLeft()) {
         CTBorderPr pr = ct.isSetLeft()?ct.getLeft():ct.addNewLeft();
         if(color != null) {
            pr.setColor(color.getCTColor());
         } else {
            pr.unsetColor();
         }

         int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
         this._cellXf.setBorderId((long)idx);
         this._cellXf.setApplyBorder(true);
      }
   }

   public void setLocked(boolean locked) {
      if(!this._cellXf.isSetProtection()) {
         this._cellXf.addNewProtection();
      }

      this._cellXf.getProtection().setLocked(locked);
   }

   public void setRightBorderColor(short color) {
      XSSFColor clr = new XSSFColor();
      clr.setIndexed(color);
      this.setRightBorderColor(clr);
   }

   public void setRightBorderColor(XSSFColor color) {
      CTBorder ct = this.getCTBorder();
      if(color != null || ct.isSetRight()) {
         CTBorderPr pr = ct.isSetRight()?ct.getRight():ct.addNewRight();
         if(color != null) {
            pr.setColor(color.getCTColor());
         } else {
            pr.unsetColor();
         }

         int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
         this._cellXf.setBorderId((long)idx);
         this._cellXf.setApplyBorder(true);
      }
   }

   public void setRotation(short rotation) {
      this.getCellAlignment().setTextRotation((long)rotation);
   }

   public void setTopBorderColor(short color) {
      XSSFColor clr = new XSSFColor();
      clr.setIndexed(color);
      this.setTopBorderColor(clr);
   }

   public void setTopBorderColor(XSSFColor color) {
      CTBorder ct = this.getCTBorder();
      if(color != null || ct.isSetTop()) {
         CTBorderPr pr = ct.isSetTop()?ct.getTop():ct.addNewTop();
         if(color != null) {
            pr.setColor(color.getCTColor());
         } else {
            pr.unsetColor();
         }

         int idx = this._stylesSource.putBorder(new XSSFCellBorder(ct, this._theme));
         this._cellXf.setBorderId((long)idx);
         this._cellXf.setApplyBorder(true);
      }
   }

   @Removal(
      version = "3.17"
   )
   public void setVerticalAlignment(short align) {
      this.setVerticalAlignment(VerticalAlignment.forInt(align));
   }

   public void setVerticalAlignment(VerticalAlignment align) {
      this.getCellAlignment().setVertical(align);
   }

   public void setWrapText(boolean wrapped) {
      this.getCellAlignment().setWrapText(wrapped);
   }

   public XSSFColor getBorderColor(XSSFCellBorder.BorderSide side) {
      switch(XSSFCellStyle.NamelessClass2087442596.$SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[side.ordinal()]) {
      case 1:
         return this.getBottomBorderXSSFColor();
      case 2:
         return this.getRightBorderXSSFColor();
      case 3:
         return this.getTopBorderXSSFColor();
      case 4:
         return this.getLeftBorderXSSFColor();
      default:
         throw new IllegalArgumentException("Unknown border: " + side);
      }
   }

   public void setBorderColor(XSSFCellBorder.BorderSide side, XSSFColor color) {
      switch(XSSFCellStyle.NamelessClass2087442596.$SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[side.ordinal()]) {
      case 1:
         this.setBottomBorderColor(color);
         break;
      case 2:
         this.setRightBorderColor(color);
         break;
      case 3:
         this.setTopBorderColor(color);
         break;
      case 4:
         this.setLeftBorderColor(color);
      }

   }

   public void setShrinkToFit(boolean shrinkToFit) {
      this.getCellAlignment().setShrinkToFit(shrinkToFit);
   }

   private int getFontId() {
      return this._cellXf.isSetFontId()?(int)this._cellXf.getFontId():(int)this._cellStyleXf.getFontId();
   }

   protected XSSFCellAlignment getCellAlignment() {
      if(this._cellAlignment == null) {
         this._cellAlignment = new XSSFCellAlignment(this.getCTCellAlignment());
      }

      return this._cellAlignment;
   }

   private CTCellAlignment getCTCellAlignment() {
      if(this._cellXf.getAlignment() == null) {
         this._cellXf.setAlignment(CTCellAlignment.Factory.newInstance());
      }

      return this._cellXf.getAlignment();
   }

   public int hashCode() {
      return this._cellXf.toString().hashCode();
   }

   public boolean equals(Object o) {
      if(o != null && o instanceof XSSFCellStyle) {
         XSSFCellStyle cf = (XSSFCellStyle)o;
         return this._cellXf.toString().equals(cf.getCoreXf().toString());
      } else {
         return false;
      }
   }

   public Object clone() {
      CTXf xf = (CTXf)this._cellXf.copy();
      int xfSize = this._stylesSource._getStyleXfsSize();
      int indexXf = this._stylesSource.putCellXf(xf);
      return new XSSFCellStyle(indexXf - 1, xfSize - 1, this._stylesSource, this._theme);
   }

   // $FF: synthetic class
   static class NamelessClass2087442596 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide = new int[XSSFCellBorder.BorderSide.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.BOTTOM.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.RIGHT.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.TOP.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$xssf$usermodel$extensions$XSSFCellBorder$BorderSide[XSSFCellBorder.BorderSide.LEFT.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
