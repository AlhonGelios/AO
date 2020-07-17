package org.apache.xmlbeans.impl.jam.provider;


public interface JamLogger {

   void setVerbose(Class var1);

   boolean isVerbose(Object var1);

   boolean isVerbose(Class var1);

   void setShowWarnings(boolean var1);

   void verbose(String var1, Object var2);

   void verbose(Throwable var1, Object var2);

   void verbose(String var1);

   void verbose(Throwable var1);

   void warning(Throwable var1);

   void warning(String var1);

   void error(Throwable var1);

   void error(String var1);

   boolean isVerbose();
}
