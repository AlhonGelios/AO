package org.apache.poi.xssf.usermodel;

import org.apache.poi.POIXMLException;
import org.apache.poi.ss.usermodel.PageOrder;
import org.apache.poi.ss.usermodel.PaperSize;
import org.apache.poi.ss.usermodel.PrintCellComments;
import org.apache.poi.ss.usermodel.PrintOrientation;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageMargins;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPageSetup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellComments;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STOrientation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPageOrder;

public class XSSFPrintSetup implements PrintSetup {

   private CTWorksheet ctWorksheet;
   private CTPageSetup pageSetup;
   private CTPageMargins pageMargins;


   protected XSSFPrintSetup(CTWorksheet worksheet) {
      this.ctWorksheet = worksheet;
      if(this.ctWorksheet.isSetPageSetup()) {
         this.pageSetup = this.ctWorksheet.getPageSetup();
      } else {
         this.pageSetup = this.ctWorksheet.addNewPageSetup();
      }

      if(this.ctWorksheet.isSetPageMargins()) {
         this.pageMargins = this.ctWorksheet.getPageMargins();
      } else {
         this.pageMargins = this.ctWorksheet.addNewPageMargins();
      }

   }

   public void setPaperSize(short size) {
      this.pageSetup.setPaperSize((long)size);
   }

   public void setPaperSize(PaperSize size) {
      this.setPaperSize((short)(size.ordinal() + 1));
   }

   public void setScale(short scale) {
      if(scale >= 10 && scale <= 400) {
         this.pageSetup.setScale((long)scale);
      } else {
         throw new POIXMLException("Scale value not accepted: you must choose a value between 10 and 400.");
      }
   }

   public void setPageStart(short start) {
      this.pageSetup.setFirstPageNumber((long)start);
   }

   public void setFitWidth(short width) {
      this.pageSetup.setFitToWidth((long)width);
   }

   public void setFitHeight(short height) {
      this.pageSetup.setFitToHeight((long)height);
   }

   public void setLeftToRight(boolean ltor) {
      if(ltor) {
         this.setPageOrder(PageOrder.OVER_THEN_DOWN);
      } else {
         this.setPageOrder(PageOrder.DOWN_THEN_OVER);
      }

   }

   public void setLandscape(boolean ls) {
      if(ls) {
         this.setOrientation(PrintOrientation.LANDSCAPE);
      } else {
         this.setOrientation(PrintOrientation.PORTRAIT);
      }

   }

   public void setValidSettings(boolean valid) {
      this.pageSetup.setUsePrinterDefaults(valid);
   }

   public void setNoColor(boolean mono) {
      this.pageSetup.setBlackAndWhite(mono);
   }

   public void setDraft(boolean d) {
      this.pageSetup.setDraft(d);
   }

   public void setNotes(boolean printnotes) {
      if(printnotes) {
         this.pageSetup.setCellComments(STCellComments.AS_DISPLAYED);
      }

   }

   public void setNoOrientation(boolean orientation) {
      if(orientation) {
         this.setOrientation(PrintOrientation.DEFAULT);
      }

   }

   public void setUsePage(boolean page) {
      this.pageSetup.setUseFirstPageNumber(page);
   }

   public void setHResolution(short resolution) {
      this.pageSetup.setHorizontalDpi((long)resolution);
   }

   public void setVResolution(short resolution) {
      this.pageSetup.setVerticalDpi((long)resolution);
   }

   public void setHeaderMargin(double headermargin) {
      this.pageMargins.setHeader(headermargin);
   }

   public void setFooterMargin(double footermargin) {
      this.pageMargins.setFooter(footermargin);
   }

   public void setCopies(short copies) {
      this.pageSetup.setCopies((long)copies);
   }

   public void setOrientation(PrintOrientation orientation) {
      STOrientation.Enum v = STOrientation.Enum.forInt(orientation.getValue());
      this.pageSetup.setOrientation(v);
   }

   public PrintOrientation getOrientation() {
      STOrientation.Enum val = this.pageSetup.getOrientation();
      return val == null?PrintOrientation.DEFAULT:PrintOrientation.valueOf(val.intValue());
   }

   public PrintCellComments getCellComment() {
      STCellComments.Enum val = this.pageSetup.getCellComments();
      return val == null?PrintCellComments.NONE:PrintCellComments.valueOf(val.intValue());
   }

   public void setPageOrder(PageOrder pageOrder) {
      STPageOrder.Enum v = STPageOrder.Enum.forInt(pageOrder.getValue());
      this.pageSetup.setPageOrder(v);
   }

   public PageOrder getPageOrder() {
      return this.pageSetup.getPageOrder() == null?null:PageOrder.valueOf(this.pageSetup.getPageOrder().intValue());
   }

   public short getPaperSize() {
      return (short)((int)this.pageSetup.getPaperSize());
   }

   public PaperSize getPaperSizeEnum() {
      return PaperSize.values()[this.getPaperSize() - 1];
   }

   public short getScale() {
      return (short)((int)this.pageSetup.getScale());
   }

   public short getPageStart() {
      return (short)((int)this.pageSetup.getFirstPageNumber());
   }

   public short getFitWidth() {
      return (short)((int)this.pageSetup.getFitToWidth());
   }

   public short getFitHeight() {
      return (short)((int)this.pageSetup.getFitToHeight());
   }

   public boolean getLeftToRight() {
      return this.getPageOrder() == PageOrder.OVER_THEN_DOWN;
   }

   public boolean getLandscape() {
      return this.getOrientation() == PrintOrientation.LANDSCAPE;
   }

   public boolean getValidSettings() {
      return this.pageSetup.getUsePrinterDefaults();
   }

   public boolean getNoColor() {
      return this.pageSetup.getBlackAndWhite();
   }

   public boolean getDraft() {
      return this.pageSetup.getDraft();
   }

   public boolean getNotes() {
      return this.getCellComment() == PrintCellComments.AS_DISPLAYED;
   }

   public boolean getNoOrientation() {
      return this.getOrientation() == PrintOrientation.DEFAULT;
   }

   public boolean getUsePage() {
      return this.pageSetup.getUseFirstPageNumber();
   }

   public short getHResolution() {
      return (short)((int)this.pageSetup.getHorizontalDpi());
   }

   public short getVResolution() {
      return (short)((int)this.pageSetup.getVerticalDpi());
   }

   public double getHeaderMargin() {
      return this.pageMargins.getHeader();
   }

   public double getFooterMargin() {
      return this.pageMargins.getFooter();
   }

   public short getCopies() {
      return (short)((int)this.pageSetup.getCopies());
   }
}
