package org.apache.poi.xwpf.usermodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.util.Internal;
import org.apache.poi.xwpf.usermodel.XWPFSDTCell;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHeight;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtCell;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;

public class XWPFTableRow {

   private CTRow ctRow;
   private XWPFTable table;
   private List tableCells;


   public XWPFTableRow(CTRow row, XWPFTable table) {
      this.table = table;
      this.ctRow = row;
      this.getTableCells();
   }

   @Internal
   public CTRow getCtRow() {
      return this.ctRow;
   }

   public XWPFTableCell createCell() {
      XWPFTableCell tableCell = new XWPFTableCell(this.ctRow.addNewTc(), this, this.table.getBody());
      this.tableCells.add(tableCell);
      return tableCell;
   }

   public XWPFTableCell getCell(int pos) {
      return pos >= 0 && pos < this.ctRow.sizeOfTcArray()?(XWPFTableCell)this.getTableCells().get(pos):null;
   }

   public void removeCell(int pos) {
      if(pos >= 0 && pos < this.ctRow.sizeOfTcArray()) {
         this.tableCells.remove(pos);
      }

   }

   public XWPFTableCell addNewTableCell() {
      CTTc cell = this.ctRow.addNewTc();
      XWPFTableCell tableCell = new XWPFTableCell(cell, this, this.table.getBody());
      this.tableCells.add(tableCell);
      return tableCell;
   }

   public int getHeight() {
      CTTrPr properties = this.getTrPr();
      return properties.sizeOfTrHeightArray() == 0?0:properties.getTrHeightArray(0).getVal().intValue();
   }

   public void setHeight(int height) {
      CTTrPr properties = this.getTrPr();
      CTHeight h = properties.sizeOfTrHeightArray() == 0?properties.addNewTrHeight():properties.getTrHeightArray(0);
      h.setVal(new BigInteger("" + height));
   }

   private CTTrPr getTrPr() {
      return this.ctRow.isSetTrPr()?this.ctRow.getTrPr():this.ctRow.addNewTrPr();
   }

   public XWPFTable getTable() {
      return this.table;
   }

   public List getTableICells() {
      ArrayList cells = new ArrayList();
      XmlCursor cursor = this.ctRow.newCursor();
      cursor.selectPath("./*");

      while(cursor.toNextSelection()) {
         XmlObject o = cursor.getObject();
         if(o instanceof CTTc) {
            cells.add(new XWPFTableCell((CTTc)o, this, this.table.getBody()));
         } else if(o instanceof CTSdtCell) {
            cells.add(new XWPFSDTCell((CTSdtCell)o, this, this.table.getBody()));
         }
      }

      cursor.dispose();
      return cells;
   }

   public List getTableCells() {
      if(this.tableCells == null) {
         ArrayList cells = new ArrayList();
         CTTc[] arr$ = this.ctRow.getTcArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTTc tableCell = arr$[i$];
            cells.add(new XWPFTableCell(tableCell, this, this.table.getBody()));
         }

         this.tableCells = cells;
      }

      return this.tableCells;
   }

   public XWPFTableCell getTableCell(CTTc cell) {
      for(int i = 0; i < this.tableCells.size(); ++i) {
         if(((XWPFTableCell)this.tableCells.get(i)).getCTTc() == cell) {
            return (XWPFTableCell)this.tableCells.get(i);
         }
      }

      return null;
   }

   public boolean isCantSplitRow() {
      boolean isCant = false;
      CTTrPr trpr = this.getTrPr();
      if(trpr.sizeOfCantSplitArray() > 0) {
         CTOnOff onoff = trpr.getCantSplitArray(0);
         isCant = onoff.getVal().equals(STOnOff.ON);
      }

      return isCant;
   }

   public void setCantSplitRow(boolean split) {
      CTTrPr trpr = this.getTrPr();
      CTOnOff onoff = trpr.addNewCantSplit();
      onoff.setVal(split?STOnOff.ON:STOnOff.OFF);
   }

   public boolean isRepeatHeader() {
      boolean repeat = false;
      CTTrPr trpr = this.getTrPr();
      if(trpr.sizeOfTblHeaderArray() > 0) {
         CTOnOff rpt = trpr.getTblHeaderArray(0);
         repeat = rpt.getVal().equals(STOnOff.ON);
      }

      return repeat;
   }

   public void setRepeatHeader(boolean repeat) {
      CTTrPr trpr = this.getTrPr();
      CTOnOff onoff = trpr.addNewTblHeader();
      onoff.setVal(repeat?STOnOff.ON:STOnOff.OFF);
   }
}
