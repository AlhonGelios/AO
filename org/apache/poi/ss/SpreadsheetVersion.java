package org.apache.poi.ss;

import org.apache.poi.ss.util.CellReference;

public enum SpreadsheetVersion {

   EXCEL97("EXCEL97", 0, 65536, 256, 30, 3, 4000, 32767),
   EXCEL2007("EXCEL2007", 1, 1048576, 16384, 255, Integer.MAX_VALUE, '\ufa00', 32767);
   private final int _maxRows;
   private final int _maxColumns;
   private final int _maxFunctionArgs;
   private final int _maxCondFormats;
   private final int _maxCellStyles;
   private final int _maxTextLength;
   // $FF: synthetic field
   private static final SpreadsheetVersion[] $VALUES = new SpreadsheetVersion[]{EXCEL97, EXCEL2007};


   private SpreadsheetVersion(String var1, int var2, int maxRows, int maxColumns, int maxFunctionArgs, int maxCondFormats, int maxCellStyles, int maxText) {
      this._maxRows = maxRows;
      this._maxColumns = maxColumns;
      this._maxFunctionArgs = maxFunctionArgs;
      this._maxCondFormats = maxCondFormats;
      this._maxCellStyles = maxCellStyles;
      this._maxTextLength = maxText;
   }

   public int getMaxRows() {
      return this._maxRows;
   }

   public int getLastRowIndex() {
      return this._maxRows - 1;
   }

   public int getMaxColumns() {
      return this._maxColumns;
   }

   public int getLastColumnIndex() {
      return this._maxColumns - 1;
   }

   public int getMaxFunctionArgs() {
      return this._maxFunctionArgs;
   }

   public int getMaxConditionalFormats() {
      return this._maxCondFormats;
   }

   public int getMaxCellStyles() {
      return this._maxCellStyles;
   }

   public String getLastColumnName() {
      return CellReference.convertNumToColString(this.getLastColumnIndex());
   }

   public int getMaxTextLength() {
      return this._maxTextLength;
   }

}
