package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.BorderFormatting;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorderPr;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STBorderStyle;

public class XSSFBorderFormatting implements BorderFormatting {

   CTBorder _border;


   XSSFBorderFormatting(CTBorder border) {
      this._border = border;
   }

   public short getBorderBottom() {
      return this.getBorderBottomEnum().getCode();
   }

   public BorderStyle getBorderBottomEnum() {
      STBorderStyle.Enum ptrn = this._border.isSetBottom()?this._border.getBottom().getStyle():null;
      return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
   }

   public short getBorderDiagonal() {
      return this.getBorderDiagonalEnum().getCode();
   }

   public BorderStyle getBorderDiagonalEnum() {
      STBorderStyle.Enum ptrn = this._border.isSetDiagonal()?this._border.getDiagonal().getStyle():null;
      return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
   }

   public short getBorderLeft() {
      return this.getBorderLeftEnum().getCode();
   }

   public BorderStyle getBorderLeftEnum() {
      STBorderStyle.Enum ptrn = this._border.isSetLeft()?this._border.getLeft().getStyle():null;
      return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
   }

   public short getBorderRight() {
      return this.getBorderRightEnum().getCode();
   }

   public BorderStyle getBorderRightEnum() {
      STBorderStyle.Enum ptrn = this._border.isSetRight()?this._border.getRight().getStyle():null;
      return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
   }

   public short getBorderTop() {
      return this.getBorderTopEnum().getCode();
   }

   public BorderStyle getBorderTopEnum() {
      STBorderStyle.Enum ptrn = this._border.isSetTop()?this._border.getTop().getStyle():null;
      return ptrn == null?BorderStyle.NONE:BorderStyle.valueOf((short)(ptrn.intValue() - 1));
   }

   public XSSFColor getBottomBorderColorColor() {
      if(!this._border.isSetBottom()) {
         return null;
      } else {
         CTBorderPr pr = this._border.getBottom();
         return new XSSFColor(pr.getColor());
      }
   }

   public short getBottomBorderColor() {
      XSSFColor color = this.getBottomBorderColorColor();
      return color == null?0:color.getIndexed();
   }

   public XSSFColor getDiagonalBorderColorColor() {
      if(!this._border.isSetDiagonal()) {
         return null;
      } else {
         CTBorderPr pr = this._border.getDiagonal();
         return new XSSFColor(pr.getColor());
      }
   }

   public short getDiagonalBorderColor() {
      XSSFColor color = this.getDiagonalBorderColorColor();
      return color == null?0:color.getIndexed();
   }

   public XSSFColor getLeftBorderColorColor() {
      if(!this._border.isSetLeft()) {
         return null;
      } else {
         CTBorderPr pr = this._border.getLeft();
         return new XSSFColor(pr.getColor());
      }
   }

   public short getLeftBorderColor() {
      XSSFColor color = this.getLeftBorderColorColor();
      return color == null?0:color.getIndexed();
   }

   public XSSFColor getRightBorderColorColor() {
      if(!this._border.isSetRight()) {
         return null;
      } else {
         CTBorderPr pr = this._border.getRight();
         return new XSSFColor(pr.getColor());
      }
   }

   public short getRightBorderColor() {
      XSSFColor color = this.getRightBorderColorColor();
      return color == null?0:color.getIndexed();
   }

   public XSSFColor getTopBorderColorColor() {
      if(!this._border.isSetTop()) {
         return null;
      } else {
         CTBorderPr pr = this._border.getTop();
         return new XSSFColor(pr.getColor());
      }
   }

   public short getTopBorderColor() {
      XSSFColor color = this.getRightBorderColorColor();
      return color == null?0:color.getIndexed();
   }

   public void setBorderBottom(short border) {
      this.setBorderBottom(BorderStyle.valueOf(border));
   }

   public void setBorderBottom(BorderStyle border) {
      CTBorderPr pr = this._border.isSetBottom()?this._border.getBottom():this._border.addNewBottom();
      if(border == BorderStyle.NONE) {
         this._border.unsetBottom();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

   }

   public void setBorderDiagonal(short border) {
      this.setBorderDiagonal(BorderStyle.valueOf(border));
   }

   public void setBorderDiagonal(BorderStyle border) {
      CTBorderPr pr = this._border.isSetDiagonal()?this._border.getDiagonal():this._border.addNewDiagonal();
      if(border == BorderStyle.NONE) {
         this._border.unsetDiagonal();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

   }

   public void setBorderLeft(short border) {
      this.setBorderLeft(BorderStyle.valueOf(border));
   }

   public void setBorderLeft(BorderStyle border) {
      CTBorderPr pr = this._border.isSetLeft()?this._border.getLeft():this._border.addNewLeft();
      if(border == BorderStyle.NONE) {
         this._border.unsetLeft();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

   }

   public void setBorderRight(short border) {
      this.setBorderRight(BorderStyle.valueOf(border));
   }

   public void setBorderRight(BorderStyle border) {
      CTBorderPr pr = this._border.isSetRight()?this._border.getRight():this._border.addNewRight();
      if(border == BorderStyle.NONE) {
         this._border.unsetRight();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

   }

   public void setBorderTop(short border) {
      this.setBorderTop(BorderStyle.valueOf(border));
   }

   public void setBorderTop(BorderStyle border) {
      CTBorderPr pr = this._border.isSetTop()?this._border.getTop():this._border.addNewTop();
      if(border == BorderStyle.NONE) {
         this._border.unsetTop();
      } else {
         pr.setStyle(STBorderStyle.Enum.forInt(border.getCode() + 1));
      }

   }

   public void setBottomBorderColor(Color color) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(color);
      if(xcolor == null) {
         this.setBottomBorderColor((CTColor)null);
      } else {
         this.setBottomBorderColor(xcolor.getCTColor());
      }

   }

   public void setBottomBorderColor(short color) {
      CTColor ctColor = CTColor.Factory.newInstance();
      ctColor.setIndexed((long)color);
      this.setBottomBorderColor(ctColor);
   }

   public void setBottomBorderColor(CTColor color) {
      CTBorderPr pr = this._border.isSetBottom()?this._border.getBottom():this._border.addNewBottom();
      if(color == null) {
         pr.unsetColor();
      } else {
         pr.setColor(color);
      }

   }

   public void setDiagonalBorderColor(Color color) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(color);
      if(xcolor == null) {
         this.setDiagonalBorderColor((CTColor)null);
      } else {
         this.setDiagonalBorderColor(xcolor.getCTColor());
      }

   }

   public void setDiagonalBorderColor(short color) {
      CTColor ctColor = CTColor.Factory.newInstance();
      ctColor.setIndexed((long)color);
      this.setDiagonalBorderColor(ctColor);
   }

   public void setDiagonalBorderColor(CTColor color) {
      CTBorderPr pr = this._border.isSetDiagonal()?this._border.getDiagonal():this._border.addNewDiagonal();
      if(color == null) {
         pr.unsetColor();
      } else {
         pr.setColor(color);
      }

   }

   public void setLeftBorderColor(Color color) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(color);
      if(xcolor == null) {
         this.setLeftBorderColor((CTColor)null);
      } else {
         this.setLeftBorderColor(xcolor.getCTColor());
      }

   }

   public void setLeftBorderColor(short color) {
      CTColor ctColor = CTColor.Factory.newInstance();
      ctColor.setIndexed((long)color);
      this.setLeftBorderColor(ctColor);
   }

   public void setLeftBorderColor(CTColor color) {
      CTBorderPr pr = this._border.isSetLeft()?this._border.getLeft():this._border.addNewLeft();
      if(color == null) {
         pr.unsetColor();
      } else {
         pr.setColor(color);
      }

   }

   public void setRightBorderColor(Color color) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(color);
      if(xcolor == null) {
         this.setRightBorderColor((CTColor)null);
      } else {
         this.setRightBorderColor(xcolor.getCTColor());
      }

   }

   public void setRightBorderColor(short color) {
      CTColor ctColor = CTColor.Factory.newInstance();
      ctColor.setIndexed((long)color);
      this.setRightBorderColor(ctColor);
   }

   public void setRightBorderColor(CTColor color) {
      CTBorderPr pr = this._border.isSetRight()?this._border.getRight():this._border.addNewRight();
      if(color == null) {
         pr.unsetColor();
      } else {
         pr.setColor(color);
      }

   }

   public void setTopBorderColor(Color color) {
      XSSFColor xcolor = XSSFColor.toXSSFColor(color);
      if(xcolor == null) {
         this.setTopBorderColor((CTColor)null);
      } else {
         this.setTopBorderColor(xcolor.getCTColor());
      }

   }

   public void setTopBorderColor(short color) {
      CTColor ctColor = CTColor.Factory.newInstance();
      ctColor.setIndexed((long)color);
      this.setTopBorderColor(ctColor);
   }

   public void setTopBorderColor(CTColor color) {
      CTBorderPr pr = this._border.isSetTop()?this._border.getTop():this._border.addNewTop();
      if(color == null) {
         pr.unsetColor();
      } else {
         pr.setColor(color);
      }

   }
}
