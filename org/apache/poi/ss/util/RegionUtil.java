package org.apache.poi.ss.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellUtil;

public final class RegionUtil {

   public static void setBorderLeft(int border, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setBorderLeft(border, region, sheet);
   }

   public static void setBorderLeft(int border, CellRangeAddress region, Sheet sheet) {
      int rowStart = region.getFirstRow();
      int rowEnd = region.getLastRow();
      int column = region.getFirstColumn();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("borderLeft", border);

      for(int i = rowStart; i <= rowEnd; ++i) {
         cps.setProperty(CellUtil.getRow(i, sheet), column);
      }

   }

   public static void setLeftBorderColor(int color, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setLeftBorderColor(color, region, sheet);
   }

   public static void setLeftBorderColor(int color, CellRangeAddress region, Sheet sheet) {
      int rowStart = region.getFirstRow();
      int rowEnd = region.getLastRow();
      int column = region.getFirstColumn();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("leftBorderColor", color);

      for(int i = rowStart; i <= rowEnd; ++i) {
         cps.setProperty(CellUtil.getRow(i, sheet), column);
      }

   }

   public static void setBorderRight(int border, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setBorderRight(border, region, sheet);
   }

   public static void setBorderRight(int border, CellRangeAddress region, Sheet sheet) {
      int rowStart = region.getFirstRow();
      int rowEnd = region.getLastRow();
      int column = region.getLastColumn();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("borderRight", border);

      for(int i = rowStart; i <= rowEnd; ++i) {
         cps.setProperty(CellUtil.getRow(i, sheet), column);
      }

   }

   public static void setRightBorderColor(int color, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setRightBorderColor(color, region, sheet);
   }

   public static void setRightBorderColor(int color, CellRangeAddress region, Sheet sheet) {
      int rowStart = region.getFirstRow();
      int rowEnd = region.getLastRow();
      int column = region.getLastColumn();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("rightBorderColor", color);

      for(int i = rowStart; i <= rowEnd; ++i) {
         cps.setProperty(CellUtil.getRow(i, sheet), column);
      }

   }

   public static void setBorderBottom(int border, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setBorderBottom(border, region, sheet);
   }

   public static void setBorderBottom(int border, CellRangeAddress region, Sheet sheet) {
      int colStart = region.getFirstColumn();
      int colEnd = region.getLastColumn();
      int rowIndex = region.getLastRow();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("borderBottom", border);
      Row row = CellUtil.getRow(rowIndex, sheet);

      for(int i = colStart; i <= colEnd; ++i) {
         cps.setProperty(row, i);
      }

   }

   public static void setBottomBorderColor(int color, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setBottomBorderColor(color, region, sheet);
   }

   public static void setBottomBorderColor(int color, CellRangeAddress region, Sheet sheet) {
      int colStart = region.getFirstColumn();
      int colEnd = region.getLastColumn();
      int rowIndex = region.getLastRow();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("bottomBorderColor", color);
      Row row = CellUtil.getRow(rowIndex, sheet);

      for(int i = colStart; i <= colEnd; ++i) {
         cps.setProperty(row, i);
      }

   }

   public static void setBorderTop(int border, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setBorderTop(border, region, sheet);
   }

   public static void setBorderTop(int border, CellRangeAddress region, Sheet sheet) {
      int colStart = region.getFirstColumn();
      int colEnd = region.getLastColumn();
      int rowIndex = region.getFirstRow();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("borderTop", border);
      Row row = CellUtil.getRow(rowIndex, sheet);

      for(int i = colStart; i <= colEnd; ++i) {
         cps.setProperty(row, i);
      }

   }

   public static void setTopBorderColor(int color, CellRangeAddress region, Sheet sheet, Workbook workbook) {
      setTopBorderColor(color, region, sheet);
   }

   public static void setTopBorderColor(int color, CellRangeAddress region, Sheet sheet) {
      int colStart = region.getFirstColumn();
      int colEnd = region.getLastColumn();
      int rowIndex = region.getFirstRow();
      RegionUtil.CellPropertySetter cps = new RegionUtil.CellPropertySetter("topBorderColor", color);
      Row row = CellUtil.getRow(rowIndex, sheet);

      for(int i = colStart; i <= colEnd; ++i) {
         cps.setProperty(row, i);
      }

   }

   private static final class CellPropertySetter {

      private final String _propertyName;
      private final Short _propertyValue;


      public CellPropertySetter(String propertyName, int value) {
         this._propertyName = propertyName;
         this._propertyValue = Short.valueOf((short)value);
      }

      public void setProperty(Row row, int column) {
         Cell cell = CellUtil.getCell(row, column);
         CellUtil.setCellStyleProperty(cell, this._propertyName, this._propertyValue);
      }
   }
}
