package org.apache.poi.util;

import org.apache.poi.util.POILogger;

public class NullLogger extends POILogger {

   public void initialize(String cat) {}

   public void log(int level, Object obj1) {}

   public void log(int level, Object obj1, Throwable exception) {}

   public boolean check(int level) {
      return false;
   }
}
