package org.apache.poi.hssf.usermodel;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.record.FormatRecord;
import org.apache.poi.ss.usermodel.BuiltinFormats;
import org.apache.poi.ss.usermodel.DataFormat;

public final class HSSFDataFormat implements DataFormat {

   private static final String[] _builtinFormats = BuiltinFormats.getAll();
   private final Vector _formats = new Vector();
   private final InternalWorkbook _workbook;
   private boolean _movedBuiltins = false;


   HSSFDataFormat(InternalWorkbook workbook) {
      this._workbook = workbook;
      Iterator i = workbook.getFormats().iterator();

      while(i.hasNext()) {
         FormatRecord r = (FormatRecord)i.next();
         this.ensureFormatsSize(r.getIndexCode());
         this._formats.set(r.getIndexCode(), r.getFormatString());
      }

   }

   public static List getBuiltinFormats() {
      return Arrays.asList(_builtinFormats);
   }

   public static short getBuiltinFormat(String format) {
      return (short)BuiltinFormats.getBuiltinFormat(format);
   }

   public short getFormat(String pFormat) {
      String format;
      if(pFormat.toUpperCase(Locale.ROOT).equals("TEXT")) {
         format = "@";
      } else {
         format = pFormat;
      }

      int index;
      if(!this._movedBuiltins) {
         for(index = 0; index < _builtinFormats.length; ++index) {
            this.ensureFormatsSize(index);
            if(this._formats.get(index) == null) {
               this._formats.set(index, _builtinFormats[index]);
            }
         }

         this._movedBuiltins = true;
      }

      for(index = 0; index < this._formats.size(); ++index) {
         if(format.equals(this._formats.get(index))) {
            return (short)index;
         }
      }

      short var4 = this._workbook.getFormat(format, true);
      this.ensureFormatsSize(var4);
      this._formats.set(var4, format);
      return var4;
   }

   public String getFormat(short index) {
      if(this._movedBuiltins) {
         return (String)this._formats.get(index);
      } else if(index == -1) {
         return null;
      } else {
         String fmt = this._formats.size() > index?(String)this._formats.get(index):null;
         return _builtinFormats.length > index && _builtinFormats[index] != null?(fmt != null?fmt:_builtinFormats[index]):fmt;
      }
   }

   public static String getBuiltinFormat(short index) {
      return BuiltinFormats.getBuiltinFormat(index);
   }

   public static int getNumberOfBuiltinBuiltinFormats() {
      return _builtinFormats.length;
   }

   private void ensureFormatsSize(int index) {
      if(this._formats.size() <= index) {
         this._formats.setSize(index + 1);
      }

   }

}
