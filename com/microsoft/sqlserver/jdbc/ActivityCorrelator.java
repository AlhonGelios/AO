package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ActivityId;

final class ActivityCorrelator {

   private static ThreadLocal ActivityIdTls = new ThreadLocal() {
      protected ActivityId initialValue() {
         return new ActivityId();
      }
   };


   static ActivityId getCurrent() {
      return (ActivityId)ActivityIdTls.get();
   }

   static ActivityId getNext() {
      ActivityId var0 = getCurrent();
      var0.Increment();
      return var0;
   }

   static void setCurrentActivityIdSentFlag() {
      ActivityId var0 = getCurrent();
      var0.setSentFlag();
   }

}
