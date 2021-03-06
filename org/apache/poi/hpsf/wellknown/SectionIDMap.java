package org.apache.poi.hpsf.wellknown;

import java.util.HashMap;
import org.apache.poi.hpsf.wellknown.PropertyIDMap;
import org.apache.poi.util.StringUtil;

public class SectionIDMap extends HashMap {

   public static final byte[] SUMMARY_INFORMATION_ID = new byte[]{(byte)-14, (byte)-97, (byte)-123, (byte)-32, (byte)79, (byte)-7, (byte)16, (byte)104, (byte)-85, (byte)-111, (byte)8, (byte)0, (byte)43, (byte)39, (byte)-77, (byte)-39};
   public static final byte[][] DOCUMENT_SUMMARY_INFORMATION_ID = new byte[][]{{(byte)-43, (byte)-51, (byte)-43, (byte)2, (byte)46, (byte)-100, (byte)16, (byte)27, (byte)-109, (byte)-105, (byte)8, (byte)0, (byte)43, (byte)44, (byte)-7, (byte)-82}, {(byte)-43, (byte)-51, (byte)-43, (byte)5, (byte)46, (byte)-100, (byte)16, (byte)27, (byte)-109, (byte)-105, (byte)8, (byte)0, (byte)43, (byte)44, (byte)-7, (byte)-82}};
   public static final String UNDEFINED = "[undefined]";
   private static SectionIDMap defaultMap;


   public static SectionIDMap getInstance() {
      if(defaultMap == null) {
         SectionIDMap m = new SectionIDMap();
         m.put(SUMMARY_INFORMATION_ID, PropertyIDMap.getSummaryInformationProperties());
         m.put(DOCUMENT_SUMMARY_INFORMATION_ID[0], PropertyIDMap.getDocumentSummaryInformationProperties());
         defaultMap = m;
      }

      return defaultMap;
   }

   public static String getPIDString(byte[] sectionFormatID, long pid) {
      PropertyIDMap m = getInstance().get(sectionFormatID);
      if(m == null) {
         return "[undefined]";
      } else {
         String s = (String)m.get(pid);
         return s == null?"[undefined]":s;
      }
   }

   public PropertyIDMap get(byte[] sectionFormatID) {
      return (PropertyIDMap)super.get(new String(sectionFormatID, StringUtil.UTF8));
   }

   public PropertyIDMap put(byte[] sectionFormatID, PropertyIDMap propertyIDMap) {
      return (PropertyIDMap)super.put(new String(sectionFormatID, StringUtil.UTF8), propertyIDMap);
   }

   protected PropertyIDMap put(String key, PropertyIDMap value) {
      return (PropertyIDMap)super.put(key, value);
   }

}
