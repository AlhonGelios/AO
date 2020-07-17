package org.apache.poi.util;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.util.Internal;
import org.apache.poi.util.NullLogger;
import org.apache.poi.util.POILogger;

@Internal
public final class POILogFactory {

   private static Map _loggers = new HashMap();
   private static final POILogger _nullLogger = new NullLogger();
   static String _loggerClassName = null;


   public static POILogger getLogger(Class theclass) {
      return getLogger(theclass.getName());
   }

   public static POILogger getLogger(String cat) {
      if(_loggerClassName == null) {
         try {
            _loggerClassName = System.getProperty("org.apache.poi.util.POILogger");
         } catch (Exception var4) {
            ;
         }

         if(_loggerClassName == null) {
            _loggerClassName = _nullLogger.getClass().getName();
         }
      }

      if(_loggerClassName.equals(_nullLogger.getClass().getName())) {
         return _nullLogger;
      } else {
         POILogger logger = (POILogger)_loggers.get(cat);
         if(logger == null) {
            try {
               Class e = Class.forName(_loggerClassName);
               logger = (POILogger)e.newInstance();
               logger.initialize(cat);
            } catch (Exception var3) {
               logger = _nullLogger;
               _loggerClassName = _nullLogger.getClass().getName();
            }

            _loggers.put(cat, logger);
         }

         return logger;
      }
   }

}
