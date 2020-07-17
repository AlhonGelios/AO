package org.apache.poi.hpsf;

import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

@Internal
class VariantBool {

   private static final POILogger logger = POILogFactory.getLogger(VariantBool.class);
   static final int SIZE = 2;
   private boolean _value;


   VariantBool(byte[] data, int offset) {
      short value = LittleEndian.getShort(data, offset);
      switch(value) {
      case -1:
         this._value = true;
         break;
      case 0:
         this._value = false;
         break;
      default:
         logger.log(5, new Object[]{"VARIANT_BOOL value \'" + value + "\' is incorrect"});
         this._value = true;
      }

   }

   boolean getValue() {
      return this._value;
   }

   void setValue(boolean value) {
      this._value = value;
   }

}
