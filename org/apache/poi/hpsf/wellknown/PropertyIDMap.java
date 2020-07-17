package org.apache.poi.hpsf.wellknown;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PropertyIDMap extends HashMap {

   public static final int PID_TITLE = 2;
   public static final int PID_SUBJECT = 3;
   public static final int PID_AUTHOR = 4;
   public static final int PID_KEYWORDS = 5;
   public static final int PID_COMMENTS = 6;
   public static final int PID_TEMPLATE = 7;
   public static final int PID_LASTAUTHOR = 8;
   public static final int PID_REVNUMBER = 9;
   public static final int PID_EDITTIME = 10;
   public static final int PID_LASTPRINTED = 11;
   public static final int PID_CREATE_DTM = 12;
   public static final int PID_LASTSAVE_DTM = 13;
   public static final int PID_PAGECOUNT = 14;
   public static final int PID_WORDCOUNT = 15;
   public static final int PID_CHARCOUNT = 16;
   public static final int PID_THUMBNAIL = 17;
   public static final int PID_APPNAME = 18;
   public static final int PID_SECURITY = 19;
   public static final int PID_DICTIONARY = 0;
   public static final int PID_CODEPAGE = 1;
   public static final int PID_CATEGORY = 2;
   public static final int PID_PRESFORMAT = 3;
   public static final int PID_BYTECOUNT = 4;
   public static final int PID_LINECOUNT = 5;
   public static final int PID_PARCOUNT = 6;
   public static final int PID_SLIDECOUNT = 7;
   public static final int PID_NOTECOUNT = 8;
   public static final int PID_HIDDENCOUNT = 9;
   public static final int PID_MMCLIPCOUNT = 10;
   public static final int PID_SCALE = 11;
   public static final int PID_HEADINGPAIR = 12;
   public static final int PID_DOCPARTS = 13;
   public static final int PID_MANAGER = 14;
   public static final int PID_COMPANY = 15;
   public static final int PID_LINKSDIRTY = 16;
   public static final int PID_CCHWITHSPACES = 17;
   public static final int PID_HYPERLINKSCHANGED = 22;
   public static final int PID_VERSION = 23;
   public static final int PID_DIGSIG = 24;
   public static final int PID_CONTENTTYPE = 26;
   public static final int PID_CONTENTSTATUS = 27;
   public static final int PID_LANGUAGE = 28;
   public static final int PID_DOCVERSION = 29;
   public static final int PID_MAX = 31;
   private static PropertyIDMap summaryInformationProperties;
   private static PropertyIDMap documentSummaryInformationProperties;


   public PropertyIDMap(int initialCapacity, float loadFactor) {
      super(initialCapacity, loadFactor);
   }

   public PropertyIDMap(Map map) {
      super(map);
   }

   public Object put(long id, String idString) {
      return this.put(Long.valueOf(id), idString);
   }

   public Object get(long id) {
      return this.get(Long.valueOf(id));
   }

   public static PropertyIDMap getSummaryInformationProperties() {
      if(summaryInformationProperties == null) {
         PropertyIDMap m = new PropertyIDMap(18, 1.0F);
         m.put(2L, "PID_TITLE");
         m.put(3L, "PID_SUBJECT");
         m.put(4L, "PID_AUTHOR");
         m.put(5L, "PID_KEYWORDS");
         m.put(6L, "PID_COMMENTS");
         m.put(7L, "PID_TEMPLATE");
         m.put(8L, "PID_LASTAUTHOR");
         m.put(9L, "PID_REVNUMBER");
         m.put(10L, "PID_EDITTIME");
         m.put(11L, "PID_LASTPRINTED");
         m.put(12L, "PID_CREATE_DTM");
         m.put(13L, "PID_LASTSAVE_DTM");
         m.put(14L, "PID_PAGECOUNT");
         m.put(15L, "PID_WORDCOUNT");
         m.put(16L, "PID_CHARCOUNT");
         m.put(17L, "PID_THUMBNAIL");
         m.put(18L, "PID_APPNAME");
         m.put(19L, "PID_SECURITY");
         summaryInformationProperties = new PropertyIDMap(Collections.unmodifiableMap(m));
      }

      return summaryInformationProperties;
   }

   public static PropertyIDMap getDocumentSummaryInformationProperties() {
      if(documentSummaryInformationProperties == null) {
         PropertyIDMap m = new PropertyIDMap(17, 1.0F);
         m.put(0L, "PID_DICTIONARY");
         m.put(1L, "PID_CODEPAGE");
         m.put(2L, "PID_CATEGORY");
         m.put(3L, "PID_PRESFORMAT");
         m.put(4L, "PID_BYTECOUNT");
         m.put(5L, "PID_LINECOUNT");
         m.put(6L, "PID_PARCOUNT");
         m.put(7L, "PID_SLIDECOUNT");
         m.put(8L, "PID_NOTECOUNT");
         m.put(9L, "PID_HIDDENCOUNT");
         m.put(10L, "PID_MMCLIPCOUNT");
         m.put(11L, "PID_SCALE");
         m.put(12L, "PID_HEADINGPAIR");
         m.put(13L, "PID_DOCPARTS");
         m.put(14L, "PID_MANAGER");
         m.put(15L, "PID_COMPANY");
         m.put(16L, "PID_LINKSDIRTY");
         documentSummaryInformationProperties = new PropertyIDMap(Collections.unmodifiableMap(m));
      }

      return documentSummaryInformationProperties;
   }

   public static void main(String[] args) {
      PropertyIDMap s1 = getSummaryInformationProperties();
      PropertyIDMap s2 = getDocumentSummaryInformationProperties();
      System.out.println("s1: " + s1);
      System.out.println("s2: " + s2);
   }
}
