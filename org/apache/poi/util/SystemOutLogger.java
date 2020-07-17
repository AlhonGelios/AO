package org.apache.poi.util;

import org.apache.poi.util.POILogger;
import org.apache.poi.util.SuppressForbidden;

public class SystemOutLogger extends POILogger {

   private String _cat;


   public void initialize(String cat) {
      this._cat = cat;
   }

   public void log(int level, Object obj1) {
      this.log(level, obj1, (Throwable)null);
   }

   @SuppressForbidden("uses printStackTrace")
   public void log(int level, Object obj1, Throwable exception) {
      if(this.check(level)) {
         System.out.println("[" + this._cat + "]" + LEVEL_STRINGS_SHORT[Math.min(LEVEL_STRINGS_SHORT.length - 1, level)] + " " + obj1);
         if(exception != null) {
            exception.printStackTrace(System.out);
         }
      }

   }

   public boolean check(int level) {
      int currentLevel;
      try {
         currentLevel = Integer.parseInt(System.getProperty("poi.log.level", "5"));
      } catch (SecurityException var4) {
         currentLevel = 1;
      }

      return level >= currentLevel;
   }
}
