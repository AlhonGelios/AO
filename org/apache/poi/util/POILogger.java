package org.apache.poi.util;

import org.apache.poi.util.Internal;

@Internal
public abstract class POILogger {

   public static final int DEBUG = 1;
   public static final int INFO = 3;
   public static final int WARN = 5;
   public static final int ERROR = 7;
   public static final int FATAL = 9;
   protected static final String[] LEVEL_STRINGS_SHORT = new String[]{"?", "D", "?", "I", "?", "W", "?", "E", "?", "F", "?"};
   protected static final String[] LEVEL_STRINGS = new String[]{"?0?", "DEBUG", "?2?", "INFO", "?4?", "WARN", "?6?", "ERROR", "?8?", "FATAL", "?10+?"};


   public abstract void initialize(String var1);

   protected abstract void log(int var1, Object var2);

   protected abstract void log(int var1, Object var2, Throwable var3);

   public abstract boolean check(int var1);

   public void log(int level, Object ... objs) {
      if(this.check(level)) {
         StringBuilder sb = new StringBuilder(32);
         Throwable lastEx = null;

         for(int msg = 0; msg < objs.length; ++msg) {
            if(msg == objs.length - 1 && objs[msg] instanceof Throwable) {
               lastEx = (Throwable)objs[msg];
            } else {
               sb.append(objs[msg]);
            }
         }

         String var6 = sb.toString();
         var6 = var6.replaceAll("[\r\n]+", " ");
         if(lastEx == null) {
            this.log(level, (Object)var6);
         } else {
            this.log(level, var6, lastEx);
         }

      }
   }

}
