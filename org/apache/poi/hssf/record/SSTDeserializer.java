package org.apache.poi.hssf.record;

import org.apache.poi.hssf.record.RecordInputStream;
import org.apache.poi.hssf.record.common.UnicodeString;
import org.apache.poi.util.IntMapper;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

class SSTDeserializer {

   private static POILogger logger = POILogFactory.getLogger(SSTDeserializer.class);
   private IntMapper strings;


   public SSTDeserializer(IntMapper strings) {
      this.strings = strings;
   }

   public void manufactureStrings(int stringCount, RecordInputStream in) {
      for(int i = 0; i < stringCount; ++i) {
         UnicodeString str;
         if(in.available() == 0 && !in.hasNextRecord()) {
            logger.log(7, new Object[]{"Ran out of data before creating all the strings! String at index " + i + ""});
            str = new UnicodeString("");
         } else {
            str = new UnicodeString(in);
         }

         addToStringTable(this.strings, str);
      }

   }

   public static void addToStringTable(IntMapper strings, UnicodeString string) {
      strings.add(string);
   }

}
