package org.apache.poi.xwpf.usermodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.util.Internal;
import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.ISDTContents;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblCellMar;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

public class XWPFTable implements IBodyElement, ISDTContents {

   private static EnumMap xwpfBorderTypeMap = new EnumMap(XWPFTable.XWPFBorderType.class);
   private static HashMap stBorderTypeMap;
   protected StringBuffer text;
   protected List tableRows;
   protected IBody part;
   private CTTbl ctTbl;


   public XWPFTable(CTTbl table, IBody part, int row, int col) {
      this(table, part);

      for(int i = 0; i < row; ++i) {
         XWPFTableRow tabRow = this.getRow(i) == null?this.createRow():this.getRow(i);

         for(int k = 0; k < col; ++k) {
            if(tabRow.getCell(k) == null) {
               tabRow.createCell();
            }
         }
      }

   }

   public XWPFTable(CTTbl table, IBody part) {
      this.text = new StringBuffer();
      this.part = part;
      this.ctTbl = table;
      this.tableRows = new ArrayList();
      if(table.sizeOfTrArray() == 0) {
         this.createEmptyTable(table);
      }

      CTRow[] arr$ = table.getTrArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTRow row = arr$[i$];
         StringBuilder rowText = new StringBuilder();
         XWPFTableRow tabRow = new XWPFTableRow(row, this);
         this.tableRows.add(tabRow);
         CTTc[] arr$1 = row.getTcArray();
         int len$1 = arr$1.length;

         for(int i$1 = 0; i$1 < len$1; ++i$1) {
            CTTc cell = arr$1[i$1];
            CTP[] arr$2 = cell.getPArray();
            int len$2 = arr$2.length;

            for(int i$2 = 0; i$2 < len$2; ++i$2) {
               CTP ctp = arr$2[i$2];
               XWPFParagraph p = new XWPFParagraph(ctp, part);
               if(rowText.length() > 0) {
                  rowText.append('\t');
               }

               rowText.append(p.getText());
            }
         }

         if(rowText.length() > 0) {
            this.text.append(rowText);
            this.text.append('\n');
         }
      }

   }

   private void createEmptyTable(CTTbl table) {
      table.addNewTr().addNewTc().addNewP();
      CTTblPr tblpro = table.addNewTblPr();
      tblpro.addNewTblW().setW(new BigInteger("0"));
      tblpro.getTblW().setType(STTblWidth.AUTO);
      CTTblBorders borders = tblpro.addNewTblBorders();
      borders.addNewBottom().setVal(STBorder.SINGLE);
      borders.addNewInsideH().setVal(STBorder.SINGLE);
      borders.addNewInsideV().setVal(STBorder.SINGLE);
      borders.addNewLeft().setVal(STBorder.SINGLE);
      borders.addNewRight().setVal(STBorder.SINGLE);
      borders.addNewTop().setVal(STBorder.SINGLE);
      this.getRows();
   }

   @Internal
   public CTTbl getCTTbl() {
      return this.ctTbl;
   }

   public String getText() {
      return this.text.toString();
   }

   public void addNewRowBetween(int start, int end) {}

   public void addNewCol() {
      if(this.ctTbl.sizeOfTrArray() == 0) {
         this.createRow();
      }

      for(int i = 0; i < this.ctTbl.sizeOfTrArray(); ++i) {
         XWPFTableRow tabRow = new XWPFTableRow(this.ctTbl.getTrArray(i), this);
         tabRow.createCell();
      }

   }

   public XWPFTableRow createRow() {
      int sizeCol = this.ctTbl.sizeOfTrArray() > 0?this.ctTbl.getTrArray(0).sizeOfTcArray():0;
      XWPFTableRow tabRow = new XWPFTableRow(this.ctTbl.addNewTr(), this);
      this.addColumn(tabRow, sizeCol);
      this.tableRows.add(tabRow);
      return tabRow;
   }

   public XWPFTableRow getRow(int pos) {
      return pos >= 0 && pos < this.ctTbl.sizeOfTrArray()?(XWPFTableRow)this.getRows().get(pos):null;
   }

   public int getWidth() {
      CTTblPr tblPr = this.getTrPr();
      return tblPr.isSetTblW()?tblPr.getTblW().getW().intValue():-1;
   }

   public void setWidth(int width) {
      CTTblPr tblPr = this.getTrPr();
      CTTblWidth tblWidth = tblPr.isSetTblW()?tblPr.getTblW():tblPr.addNewTblW();
      tblWidth.setW(new BigInteger("" + width));
   }

   public int getNumberOfRows() {
      return this.ctTbl.sizeOfTrArray();
   }

   private CTTblPr getTrPr() {
      return this.ctTbl.getTblPr() != null?this.ctTbl.getTblPr():this.ctTbl.addNewTblPr();
   }

   private void addColumn(XWPFTableRow tabRow, int sizeCol) {
      if(sizeCol > 0) {
         for(int i = 0; i < sizeCol; ++i) {
            tabRow.createCell();
         }
      }

   }

   public String getStyleID() {
      String styleId = null;
      CTTblPr tblPr = this.ctTbl.getTblPr();
      if(tblPr != null) {
         CTString styleStr = tblPr.getTblStyle();
         if(styleStr != null) {
            styleId = styleStr.getVal();
         }
      }

      return styleId;
   }

   public void setStyleID(String styleName) {
      CTTblPr tblPr = this.getTrPr();
      CTString styleStr = tblPr.getTblStyle();
      if(styleStr == null) {
         styleStr = tblPr.addNewTblStyle();
      }

      styleStr.setVal(styleName);
   }

   public XWPFTable.XWPFBorderType getInsideHBorderType() {
      XWPFTable.XWPFBorderType bt = null;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideH()) {
            CTBorder border = ctb.getInsideH();
            bt = (XWPFTable.XWPFBorderType)stBorderTypeMap.get(Integer.valueOf(border.getVal().intValue()));
         }
      }

      return bt;
   }

   public int getInsideHBorderSize() {
      int size = -1;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideH()) {
            CTBorder border = ctb.getInsideH();
            size = border.getSz().intValue();
         }
      }

      return size;
   }

   public int getInsideHBorderSpace() {
      int space = -1;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideH()) {
            CTBorder border = ctb.getInsideH();
            space = border.getSpace().intValue();
         }
      }

      return space;
   }

   public String getInsideHBorderColor() {
      String color = null;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideH()) {
            CTBorder border = ctb.getInsideH();
            color = border.xgetColor().getStringValue();
         }
      }

      return color;
   }

   public XWPFTable.XWPFBorderType getInsideVBorderType() {
      XWPFTable.XWPFBorderType bt = null;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideV()) {
            CTBorder border = ctb.getInsideV();
            bt = (XWPFTable.XWPFBorderType)stBorderTypeMap.get(Integer.valueOf(border.getVal().intValue()));
         }
      }

      return bt;
   }

   public int getInsideVBorderSize() {
      int size = -1;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideV()) {
            CTBorder border = ctb.getInsideV();
            size = border.getSz().intValue();
         }
      }

      return size;
   }

   public int getInsideVBorderSpace() {
      int space = -1;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideV()) {
            CTBorder border = ctb.getInsideV();
            space = border.getSpace().intValue();
         }
      }

      return space;
   }

   public String getInsideVBorderColor() {
      String color = null;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblBorders()) {
         CTTblBorders ctb = tblPr.getTblBorders();
         if(ctb.isSetInsideV()) {
            CTBorder border = ctb.getInsideV();
            color = border.xgetColor().getStringValue();
         }
      }

      return color;
   }

   public int getRowBandSize() {
      int size = 0;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblStyleRowBandSize()) {
         CTDecimalNumber rowSize = tblPr.getTblStyleRowBandSize();
         size = rowSize.getVal().intValue();
      }

      return size;
   }

   public void setRowBandSize(int size) {
      CTTblPr tblPr = this.getTrPr();
      CTDecimalNumber rowSize = tblPr.isSetTblStyleRowBandSize()?tblPr.getTblStyleRowBandSize():tblPr.addNewTblStyleRowBandSize();
      rowSize.setVal(BigInteger.valueOf((long)size));
   }

   public int getColBandSize() {
      int size = 0;
      CTTblPr tblPr = this.getTrPr();
      if(tblPr.isSetTblStyleColBandSize()) {
         CTDecimalNumber colSize = tblPr.getTblStyleColBandSize();
         size = colSize.getVal().intValue();
      }

      return size;
   }

   public void setColBandSize(int size) {
      CTTblPr tblPr = this.getTrPr();
      CTDecimalNumber colSize = tblPr.isSetTblStyleColBandSize()?tblPr.getTblStyleColBandSize():tblPr.addNewTblStyleColBandSize();
      colSize.setVal(BigInteger.valueOf((long)size));
   }

   public void setInsideHBorder(XWPFTable.XWPFBorderType type, int size, int space, String rgbColor) {
      CTTblPr tblPr = this.getTrPr();
      CTTblBorders ctb = tblPr.isSetTblBorders()?tblPr.getTblBorders():tblPr.addNewTblBorders();
      CTBorder b = ctb.isSetInsideH()?ctb.getInsideH():ctb.addNewInsideH();
      b.setVal((STBorder.Enum)xwpfBorderTypeMap.get(type));
      b.setSz(BigInteger.valueOf((long)size));
      b.setSpace(BigInteger.valueOf((long)space));
      b.setColor(rgbColor);
   }

   public void setInsideVBorder(XWPFTable.XWPFBorderType type, int size, int space, String rgbColor) {
      CTTblPr tblPr = this.getTrPr();
      CTTblBorders ctb = tblPr.isSetTblBorders()?tblPr.getTblBorders():tblPr.addNewTblBorders();
      CTBorder b = ctb.isSetInsideV()?ctb.getInsideV():ctb.addNewInsideV();
      b.setVal((STBorder.Enum)xwpfBorderTypeMap.get(type));
      b.setSz(BigInteger.valueOf((long)size));
      b.setSpace(BigInteger.valueOf((long)space));
      b.setColor(rgbColor);
   }

   public int getCellMarginTop() {
      int margin = 0;
      CTTblPr tblPr = this.getTrPr();
      CTTblCellMar tcm = tblPr.getTblCellMar();
      if(tcm != null) {
         CTTblWidth tw = tcm.getTop();
         if(tw != null) {
            margin = tw.getW().intValue();
         }
      }

      return margin;
   }

   public int getCellMarginLeft() {
      int margin = 0;
      CTTblPr tblPr = this.getTrPr();
      CTTblCellMar tcm = tblPr.getTblCellMar();
      if(tcm != null) {
         CTTblWidth tw = tcm.getLeft();
         if(tw != null) {
            margin = tw.getW().intValue();
         }
      }

      return margin;
   }

   public int getCellMarginBottom() {
      int margin = 0;
      CTTblPr tblPr = this.getTrPr();
      CTTblCellMar tcm = tblPr.getTblCellMar();
      if(tcm != null) {
         CTTblWidth tw = tcm.getBottom();
         if(tw != null) {
            margin = tw.getW().intValue();
         }
      }

      return margin;
   }

   public int getCellMarginRight() {
      int margin = 0;
      CTTblPr tblPr = this.getTrPr();
      CTTblCellMar tcm = tblPr.getTblCellMar();
      if(tcm != null) {
         CTTblWidth tw = tcm.getRight();
         if(tw != null) {
            margin = tw.getW().intValue();
         }
      }

      return margin;
   }

   public void setCellMargins(int top, int left, int bottom, int right) {
      CTTblPr tblPr = this.getTrPr();
      CTTblCellMar tcm = tblPr.isSetTblCellMar()?tblPr.getTblCellMar():tblPr.addNewTblCellMar();
      CTTblWidth tw = tcm.isSetLeft()?tcm.getLeft():tcm.addNewLeft();
      tw.setType(STTblWidth.DXA);
      tw.setW(BigInteger.valueOf((long)left));
      tw = tcm.isSetTop()?tcm.getTop():tcm.addNewTop();
      tw.setType(STTblWidth.DXA);
      tw.setW(BigInteger.valueOf((long)top));
      tw = tcm.isSetBottom()?tcm.getBottom():tcm.addNewBottom();
      tw.setType(STTblWidth.DXA);
      tw.setW(BigInteger.valueOf((long)bottom));
      tw = tcm.isSetRight()?tcm.getRight():tcm.addNewRight();
      tw.setType(STTblWidth.DXA);
      tw.setW(BigInteger.valueOf((long)right));
   }

   public void addRow(XWPFTableRow row) {
      this.ctTbl.addNewTr();
      this.ctTbl.setTrArray(this.getNumberOfRows() - 1, row.getCtRow());
      this.tableRows.add(row);
   }

   public boolean addRow(XWPFTableRow row, int pos) {
      if(pos >= 0 && pos <= this.tableRows.size()) {
         this.ctTbl.insertNewTr(pos);
         this.ctTbl.setTrArray(pos, row.getCtRow());
         this.tableRows.add(pos, row);
         return true;
      } else {
         return false;
      }
   }

   public XWPFTableRow insertNewTableRow(int pos) {
      if(pos >= 0 && pos <= this.tableRows.size()) {
         CTRow row = this.ctTbl.insertNewTr(pos);
         XWPFTableRow tableRow = new XWPFTableRow(row, this);
         this.tableRows.add(pos, tableRow);
         return tableRow;
      } else {
         return null;
      }
   }

   public boolean removeRow(int pos) throws IndexOutOfBoundsException {
      if(pos >= 0 && pos < this.tableRows.size()) {
         if(this.ctTbl.sizeOfTrArray() > 0) {
            this.ctTbl.removeTr(pos);
         }

         this.tableRows.remove(pos);
         return true;
      } else {
         return false;
      }
   }

   public List getRows() {
      return this.tableRows;
   }

   public BodyElementType getElementType() {
      return BodyElementType.TABLE;
   }

   public IBody getBody() {
      return this.part;
   }

   public POIXMLDocumentPart getPart() {
      return this.part != null?this.part.getPart():null;
   }

   public BodyType getPartType() {
      return this.part.getPartType();
   }

   public XWPFTableRow getRow(CTRow row) {
      for(int i = 0; i < this.getRows().size(); ++i) {
         if(((XWPFTableRow)this.getRows().get(i)).getCtRow() == row) {
            return this.getRow(i);
         }
      }

      return null;
   }

   static {
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.NIL, STBorder.Enum.forInt(1));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.NONE, STBorder.Enum.forInt(2));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.SINGLE, STBorder.Enum.forInt(3));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.THICK, STBorder.Enum.forInt(4));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.DOUBLE, STBorder.Enum.forInt(5));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.DOTTED, STBorder.Enum.forInt(6));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.DASHED, STBorder.Enum.forInt(7));
      xwpfBorderTypeMap.put(XWPFTable.XWPFBorderType.DOT_DASH, STBorder.Enum.forInt(8));
      stBorderTypeMap = new HashMap();
      stBorderTypeMap.put(Integer.valueOf(1), XWPFTable.XWPFBorderType.NIL);
      stBorderTypeMap.put(Integer.valueOf(2), XWPFTable.XWPFBorderType.NONE);
      stBorderTypeMap.put(Integer.valueOf(3), XWPFTable.XWPFBorderType.SINGLE);
      stBorderTypeMap.put(Integer.valueOf(4), XWPFTable.XWPFBorderType.THICK);
      stBorderTypeMap.put(Integer.valueOf(5), XWPFTable.XWPFBorderType.DOUBLE);
      stBorderTypeMap.put(Integer.valueOf(6), XWPFTable.XWPFBorderType.DOTTED);
      stBorderTypeMap.put(Integer.valueOf(7), XWPFTable.XWPFBorderType.DASHED);
      stBorderTypeMap.put(Integer.valueOf(8), XWPFTable.XWPFBorderType.DOT_DASH);
   }

   public static enum XWPFBorderType {

      NIL("NIL", 0),
      NONE("NONE", 1),
      SINGLE("SINGLE", 2),
      THICK("THICK", 3),
      DOUBLE("DOUBLE", 4),
      DOTTED("DOTTED", 5),
      DASHED("DASHED", 6),
      DOT_DASH("DOT_DASH", 7);
      // $FF: synthetic field
      private static final XWPFTable.XWPFBorderType[] $VALUES = new XWPFTable.XWPFBorderType[]{NIL, NONE, SINGLE, THICK, DOUBLE, DOTTED, DASHED, DOT_DASH};


      private XWPFBorderType(String var1, int var2) {}

   }
}
