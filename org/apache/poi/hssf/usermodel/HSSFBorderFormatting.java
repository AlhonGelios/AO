package org.apache.poi.hssf.usermodel;

import org.apache.poi.hssf.record.CFRuleBase;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderFormatting;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Color;

public final class HSSFBorderFormatting implements BorderFormatting {

   private final HSSFWorkbook workbook;
   private final CFRuleBase cfRuleRecord;
   private final org.apache.poi.hssf.record.cf.BorderFormatting borderFormatting;


   protected HSSFBorderFormatting(CFRuleBase cfRuleRecord, HSSFWorkbook workbook) {
      this.workbook = workbook;
      this.cfRuleRecord = cfRuleRecord;
      this.borderFormatting = cfRuleRecord.getBorderFormatting();
   }

   protected org.apache.poi.hssf.record.cf.BorderFormatting getBorderFormattingBlock() {
      return this.borderFormatting;
   }

   public short getBorderBottom() {
      return (short)this.borderFormatting.getBorderBottom();
   }

   public BorderStyle getBorderBottomEnum() {
      return BorderStyle.valueOf((short)this.borderFormatting.getBorderBottom());
   }

   public short getBorderDiagonal() {
      return (short)this.borderFormatting.getBorderDiagonal();
   }

   public BorderStyle getBorderDiagonalEnum() {
      return BorderStyle.valueOf((short)this.borderFormatting.getBorderDiagonal());
   }

   public short getBorderLeft() {
      return (short)this.borderFormatting.getBorderLeft();
   }

   public BorderStyle getBorderLeftEnum() {
      return BorderStyle.valueOf((short)this.borderFormatting.getBorderLeft());
   }

   public short getBorderRight() {
      return (short)this.borderFormatting.getBorderRight();
   }

   public BorderStyle getBorderRightEnum() {
      return BorderStyle.valueOf((short)this.borderFormatting.getBorderRight());
   }

   public short getBorderTop() {
      return (short)this.borderFormatting.getBorderTop();
   }

   public BorderStyle getBorderTopEnum() {
      return BorderStyle.valueOf((short)this.borderFormatting.getBorderTop());
   }

   public short getBottomBorderColor() {
      return (short)this.borderFormatting.getBottomBorderColor();
   }

   public HSSFColor getBottomBorderColorColor() {
      return this.workbook.getCustomPalette().getColor(this.borderFormatting.getBottomBorderColor());
   }

   public short getDiagonalBorderColor() {
      return (short)this.borderFormatting.getDiagonalBorderColor();
   }

   public HSSFColor getDiagonalBorderColorColor() {
      return this.workbook.getCustomPalette().getColor(this.borderFormatting.getDiagonalBorderColor());
   }

   public short getLeftBorderColor() {
      return (short)this.borderFormatting.getLeftBorderColor();
   }

   public HSSFColor getLeftBorderColorColor() {
      return this.workbook.getCustomPalette().getColor(this.borderFormatting.getLeftBorderColor());
   }

   public short getRightBorderColor() {
      return (short)this.borderFormatting.getRightBorderColor();
   }

   public HSSFColor getRightBorderColorColor() {
      return this.workbook.getCustomPalette().getColor(this.borderFormatting.getRightBorderColor());
   }

   public short getTopBorderColor() {
      return (short)this.borderFormatting.getTopBorderColor();
   }

   public HSSFColor getTopBorderColorColor() {
      return this.workbook.getCustomPalette().getColor(this.borderFormatting.getTopBorderColor());
   }

   public boolean isBackwardDiagonalOn() {
      return this.borderFormatting.isBackwardDiagonalOn();
   }

   public boolean isForwardDiagonalOn() {
      return this.borderFormatting.isForwardDiagonalOn();
   }

   public void setBackwardDiagonalOn(boolean on) {
      this.borderFormatting.setBackwardDiagonalOn(on);
      if(on) {
         this.cfRuleRecord.setTopLeftBottomRightBorderModified(on);
      }

   }

   public void setForwardDiagonalOn(boolean on) {
      this.borderFormatting.setForwardDiagonalOn(on);
      if(on) {
         this.cfRuleRecord.setBottomLeftTopRightBorderModified(on);
      }

   }

   public void setBorderBottom(short border) {
      this.borderFormatting.setBorderBottom(border);
      if(border != 0) {
         this.cfRuleRecord.setBottomBorderModified(true);
      } else {
         this.cfRuleRecord.setBottomBorderModified(false);
      }

   }

   public void setBorderBottom(BorderStyle border) {
      this.setBorderBottom(border.getCode());
   }

   public void setBorderDiagonal(short border) {
      this.borderFormatting.setBorderDiagonal(border);
      if(border != 0) {
         this.cfRuleRecord.setBottomLeftTopRightBorderModified(true);
         this.cfRuleRecord.setTopLeftBottomRightBorderModified(true);
      } else {
         this.cfRuleRecord.setBottomLeftTopRightBorderModified(false);
         this.cfRuleRecord.setTopLeftBottomRightBorderModified(false);
      }

   }

   public void setBorderDiagonal(BorderStyle border) {
      this.setBorderDiagonal(border.getCode());
   }

   public void setBorderLeft(short border) {
      this.borderFormatting.setBorderLeft(border);
      if(border != 0) {
         this.cfRuleRecord.setLeftBorderModified(true);
      } else {
         this.cfRuleRecord.setLeftBorderModified(false);
      }

   }

   public void setBorderLeft(BorderStyle border) {
      this.setBorderLeft(border.getCode());
   }

   public void setBorderRight(short border) {
      this.borderFormatting.setBorderRight(border);
      if(border != 0) {
         this.cfRuleRecord.setRightBorderModified(true);
      } else {
         this.cfRuleRecord.setRightBorderModified(false);
      }

   }

   public void setBorderRight(BorderStyle border) {
      this.setBorderRight(border.getCode());
   }

   public void setBorderTop(short border) {
      this.borderFormatting.setBorderTop(border);
      if(border != 0) {
         this.cfRuleRecord.setTopBorderModified(true);
      } else {
         this.cfRuleRecord.setTopBorderModified(false);
      }

   }

   public void setBorderTop(BorderStyle border) {
      this.setBorderTop(border.getCode());
   }

   public void setBottomBorderColor(short color) {
      this.borderFormatting.setBottomBorderColor(color);
      if(color != 0) {
         this.cfRuleRecord.setBottomBorderModified(true);
      } else {
         this.cfRuleRecord.setBottomBorderModified(false);
      }

   }

   public void setBottomBorderColor(Color color) {
      HSSFColor hcolor = HSSFColor.toHSSFColor(color);
      if(hcolor == null) {
         this.setBottomBorderColor((short)0);
      } else {
         this.setBottomBorderColor(hcolor.getIndex());
      }

   }

   public void setDiagonalBorderColor(short color) {
      this.borderFormatting.setDiagonalBorderColor(color);
      if(color != 0) {
         this.cfRuleRecord.setBottomLeftTopRightBorderModified(true);
         this.cfRuleRecord.setTopLeftBottomRightBorderModified(true);
      } else {
         this.cfRuleRecord.setBottomLeftTopRightBorderModified(false);
         this.cfRuleRecord.setTopLeftBottomRightBorderModified(false);
      }

   }

   public void setDiagonalBorderColor(Color color) {
      HSSFColor hcolor = HSSFColor.toHSSFColor(color);
      if(hcolor == null) {
         this.setDiagonalBorderColor((short)0);
      } else {
         this.setDiagonalBorderColor(hcolor.getIndex());
      }

   }

   public void setLeftBorderColor(short color) {
      this.borderFormatting.setLeftBorderColor(color);
      if(color != 0) {
         this.cfRuleRecord.setLeftBorderModified(true);
      } else {
         this.cfRuleRecord.setLeftBorderModified(false);
      }

   }

   public void setLeftBorderColor(Color color) {
      HSSFColor hcolor = HSSFColor.toHSSFColor(color);
      if(hcolor == null) {
         this.setLeftBorderColor((short)0);
      } else {
         this.setLeftBorderColor(hcolor.getIndex());
      }

   }

   public void setRightBorderColor(short color) {
      this.borderFormatting.setRightBorderColor(color);
      if(color != 0) {
         this.cfRuleRecord.setRightBorderModified(true);
      } else {
         this.cfRuleRecord.setRightBorderModified(false);
      }

   }

   public void setRightBorderColor(Color color) {
      HSSFColor hcolor = HSSFColor.toHSSFColor(color);
      if(hcolor == null) {
         this.setRightBorderColor((short)0);
      } else {
         this.setRightBorderColor(hcolor.getIndex());
      }

   }

   public void setTopBorderColor(short color) {
      this.borderFormatting.setTopBorderColor(color);
      if(color != 0) {
         this.cfRuleRecord.setTopBorderModified(true);
      } else {
         this.cfRuleRecord.setTopBorderModified(false);
      }

   }

   public void setTopBorderColor(Color color) {
      HSSFColor hcolor = HSSFColor.toHSSFColor(color);
      if(hcolor == null) {
         this.setTopBorderColor((short)0);
      } else {
         this.setTopBorderColor(hcolor.getIndex());
      }

   }
}
