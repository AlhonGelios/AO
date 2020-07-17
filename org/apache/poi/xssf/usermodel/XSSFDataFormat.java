package org.apache.poi.xssf.usermodel;

import org.apache.poi.ss.usermodel.BuiltinFormats;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.model.StylesTable;

public class XSSFDataFormat implements DataFormat {

   private final StylesTable stylesSource;


   protected XSSFDataFormat(StylesTable stylesSource) {
      this.stylesSource = stylesSource;
   }

   public short getFormat(String format) {
      int idx = BuiltinFormats.getBuiltinFormat(format);
      if(idx == -1) {
         idx = this.stylesSource.putNumberFormat(format);
      }

      return (short)idx;
   }

   public String getFormat(short index) {
      return this.getFormat(index & '\uffff');
   }

   public String getFormat(int index) {
      String fmt = this.stylesSource.getNumberFormatAt(index);
      if(fmt == null) {
         fmt = BuiltinFormats.getBuiltinFormat(index);
      }

      return fmt;
   }

   public void putFormat(short index, String format) {
      this.stylesSource.putNumberFormat(index, format);
   }
}
