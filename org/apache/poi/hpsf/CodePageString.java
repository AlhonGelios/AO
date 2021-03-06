package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.apache.poi.util.CodePageUtil;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.StringUtil;

@Internal
class CodePageString {

   private static final POILogger logger = POILogFactory.getLogger(CodePageString.class);
   private byte[] _value;


   CodePageString(byte[] data, int startOffset) {
      int size = LittleEndian.getInt(data, startOffset);
      int offset = startOffset + 4;
      this._value = LittleEndian.getByteArray(data, offset, size);
      if(size != 0 && this._value[size - 1] != 0) {
         logger.log(5, new Object[]{"CodePageString started at offset #" + offset + " is not NULL-terminated"});
      }

   }

   CodePageString(String string, int codepage) throws UnsupportedEncodingException {
      this.setJavaValue(string, codepage);
   }

   String getJavaValue(int codepage) throws UnsupportedEncodingException {
      String result;
      if(codepage == -1) {
         result = new String(this._value, StringUtil.UTF8);
      } else {
         result = CodePageUtil.getStringFromCodePage(this._value, codepage);
      }

      int terminator = result.indexOf(0);
      if(terminator == -1) {
         logger.log(5, new Object[]{"String terminator (\\0) for CodePageString property value not found.Continue without trimming and hope for the best."});
         return result;
      } else {
         if(terminator != result.length() - 1) {
            logger.log(5, new Object[]{"String terminator (\\0) for CodePageString property value occured before the end of string. Trimming and hope for the best."});
         }

         return result.substring(0, terminator);
      }
   }

   int getSize() {
      return 4 + this._value.length;
   }

   void setJavaValue(String string, int codepage) throws UnsupportedEncodingException {
      String stringNT = string + " ";
      if(codepage == -1) {
         this._value = stringNT.getBytes(StringUtil.UTF8);
      } else {
         this._value = CodePageUtil.getBytesInCodePage(stringNT, codepage);
      }

   }

   int write(OutputStream out) throws IOException {
      LittleEndian.putInt(this._value.length, out);
      out.write(this._value);
      return 4 + this._value.length;
   }

}
