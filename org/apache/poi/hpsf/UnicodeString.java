package org.apache.poi.hpsf;

import org.apache.poi.hpsf.IllegalPropertySetDataException;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.StringUtil;

@Internal
class UnicodeString {

   private static final POILogger logger = POILogFactory.getLogger(UnicodeString.class);
   private byte[] _value;


   UnicodeString(byte[] data, int offset) {
      int length = LittleEndian.getInt(data, offset);
      int dataOffset = offset + 4;
      if(!this.validLength(length, data, dataOffset)) {
         boolean valid = false;
         int past4byte = offset % 4;
         if(past4byte != 0) {
            offset += past4byte;
            length = LittleEndian.getInt(data, offset);
            dataOffset = offset + 4;
            valid = this.validLength(length, data, dataOffset);
         }

         if(!valid) {
            throw new IllegalPropertySetDataException("UnicodeString started at offset #" + offset + " is not NULL-terminated");
         }
      }

      if(length == 0) {
         this._value = new byte[0];
      } else {
         this._value = LittleEndian.getByteArray(data, dataOffset, length * 2);
      }
   }

   boolean validLength(int length, byte[] data, int offset) {
      if(length == 0) {
         return true;
      } else {
         int endOffset = offset + length * 2;
         return endOffset <= data.length && data[endOffset - 1] == 0 && data[endOffset - 2] == 0;
      }
   }

   int getSize() {
      return 4 + this._value.length;
   }

   byte[] getValue() {
      return this._value;
   }

   String toJavaString() {
      if(this._value.length == 0) {
         return null;
      } else {
         String result = StringUtil.getFromUnicodeLE(this._value, 0, this._value.length >> 1);
         int terminator = result.indexOf(0);
         if(terminator == -1) {
            logger.log(5, new Object[]{"String terminator (\\0) for UnicodeString property value not found.Continue without trimming and hope for the best."});
            return result;
         } else {
            if(terminator != result.length() - 1) {
               logger.log(5, new Object[]{"String terminator (\\0) for UnicodeString property value occured before the end of string. Trimming and hope for the best."});
            }

            return result.substring(0, terminator);
         }
      }
   }

}
