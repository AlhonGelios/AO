package org.apache.poi.hpsf;

import org.apache.poi.hpsf.IllegalPropertySetDataException;
import org.apache.poi.hpsf.TypedPropertyValue;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;

@Internal
class Array {

   private Array.ArrayHeader _header;
   private TypedPropertyValue[] _values;


   Array() {}

   Array(byte[] data, int offset) {
      this.read(data, offset);
   }

   int read(byte[] data, int startOffset) {
      this._header = new Array.ArrayHeader(data, startOffset);
      int offset = startOffset + this._header.getSize();
      long numberOfScalarsLong = this._header.getNumberOfScalarValues();
      if(numberOfScalarsLong > 2147483647L) {
         throw new UnsupportedOperationException("Sorry, but POI can\'t store array of properties with size of " + numberOfScalarsLong + " in memory");
      } else {
         int numberOfScalars = (int)numberOfScalarsLong;
         this._values = new TypedPropertyValue[numberOfScalars];
         int type = this._header._type;
         int i;
         TypedPropertyValue typedPropertyValue;
         if(type == 12) {
            for(i = 0; i < numberOfScalars; ++i) {
               typedPropertyValue = new TypedPropertyValue();
               offset += typedPropertyValue.read(data, offset);
            }
         } else {
            for(i = 0; i < numberOfScalars; ++i) {
               typedPropertyValue = new TypedPropertyValue(type, (Object)null);
               offset += typedPropertyValue.readValuePadded(data, offset);
            }
         }

         return offset - startOffset;
      }
   }

   static class ArrayDimension {

      static final int SIZE = 8;
      private int _indexOffset;
      private long _size;


      ArrayDimension(byte[] data, int offset) {
         this._size = LittleEndian.getUInt(data, offset);
         this._indexOffset = LittleEndian.getInt(data, offset + 4);
      }
   }

   static class ArrayHeader {

      private Array.ArrayDimension[] _dimensions;
      private int _type;


      ArrayHeader(byte[] data, int startOffset) {
         this._type = LittleEndian.getInt(data, startOffset);
         int offset = startOffset + 4;
         long numDimensionsUnsigned = LittleEndian.getUInt(data, offset);
         offset += 4;
         if(1L <= numDimensionsUnsigned && numDimensionsUnsigned <= 31L) {
            int numDimensions = (int)numDimensionsUnsigned;
            this._dimensions = new Array.ArrayDimension[numDimensions];

            for(int i = 0; i < numDimensions; ++i) {
               this._dimensions[i] = new Array.ArrayDimension(data, offset);
               offset += 8;
            }

         } else {
            throw new IllegalPropertySetDataException("Array dimension number " + numDimensionsUnsigned + " is not in [1; 31] range");
         }
      }

      long getNumberOfScalarValues() {
         long result = 1L;
         Array.ArrayDimension[] arr$ = this._dimensions;
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Array.ArrayDimension dimension = arr$[i$];
            result *= dimension._size;
         }

         return result;
      }

      int getSize() {
         return 8 + this._dimensions.length * 8;
      }

      int getType() {
         return this._type;
      }
   }
}
