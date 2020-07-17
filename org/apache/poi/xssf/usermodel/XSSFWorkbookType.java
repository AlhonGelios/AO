package org.apache.poi.xssf.usermodel;

import org.apache.poi.xssf.usermodel.XSSFRelation;

public enum XSSFWorkbookType {

   XLSX("XLSX", 0, XSSFRelation.WORKBOOK.getContentType(), "xlsx"),
   XLSM("XLSM", 1, XSSFRelation.MACROS_WORKBOOK.getContentType(), "xlsm");
   private final String _contentType;
   private final String _extension;
   // $FF: synthetic field
   private static final XSSFWorkbookType[] $VALUES = new XSSFWorkbookType[]{XLSX, XLSM};


   private XSSFWorkbookType(String var1, int var2, String contentType, String extension) {
      this._contentType = contentType;
      this._extension = extension;
   }

   public String getContentType() {
      return this._contentType;
   }

   public String getExtension() {
      return this._extension;
   }

}
