package org.apache.poi.hpsf;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

@Internal
class ClipboardData {

   private static final POILogger logger = POILogFactory.getLogger(ClipboardData.class);
   private int _format;
   private byte[] _value;


   ClipboardData(byte[] data, int offset) {
      int size = LittleEndian.getInt(data, offset);
      if(size < 4) {
         logger.log(5, new Object[]{"ClipboardData at offset ", Integer.valueOf(offset), " size less than 4 bytes (doesn\'t even have format field!). Setting to format == 0 and hope for the best"});
         this._format = 0;
         this._value = new byte[0];
      } else {
         this._format = LittleEndian.getInt(data, offset + 4);
         this._value = LittleEndian.getByteArray(data, offset + 8, size - 4);
      }
   }

   int getSize() {
      return 8 + this._value.length;
   }

   byte[] getValue() {
      return this._value;
   }

   byte[] toByteArray() {
      byte[] result = new byte[this.getSize()];
      LittleEndian.putInt(result, 0, 4 + this._value.length);
      LittleEndian.putInt(result, 4, this._format);
      System.arraycopy(this._value, 0, result, 8, this._value.length);
      return result;
   }

   int write(OutputStream out) throws IOException {
      LittleEndian.putInt(4 + this._value.length, out);
      LittleEndian.putInt(this._format, out);
      out.write(this._value);
      return 8 + this._value.length;
   }

}
