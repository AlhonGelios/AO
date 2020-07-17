package org.apache.poi.hpsf;

import org.apache.poi.hpsf.TypedPropertyValue;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;

@Internal
class Vector {

   private final short _type;
   private TypedPropertyValue[] _values;


   Vector(byte[] data, int startOffset, short type) {
      this._type = type;
      this.read(data, startOffset);
   }

   Vector(short type) {
      this._type = type;
   }

   int read(byte[] data, int startOffset) {
      long longLength = LittleEndian.getUInt(data, startOffset);
      int offset = startOffset + 4;
      if(longLength > 2147483647L) {
         throw new UnsupportedOperationException("Vector is too long -- " + longLength);
      } else {
         int length = (int)longLength;
         this._values = new TypedPropertyValue[length];
         int i;
         TypedPropertyValue value;
         if(this._type == 12) {
            for(i = 0; i < length; ++i) {
               value = new TypedPropertyValue();
               offset += value.read(data, offset);
               this._values[i] = value;
            }
         } else {
            for(i = 0; i < length; ++i) {
               value = new TypedPropertyValue(this._type, (Object)null);
               offset += value.readValue(data, offset);
               this._values[i] = value;
            }
         }

         return offset - startOffset;
      }
   }

   TypedPropertyValue[] getValues() {
      return this._values;
   }
}
