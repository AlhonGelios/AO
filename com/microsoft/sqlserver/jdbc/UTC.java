package com.microsoft.sqlserver.jdbc;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

enum UTC {

   INSTANCE("INSTANCE", 0);
   static final TimeZone timeZone = new SimpleTimeZone(0, "UTC");
   // $FF: synthetic field
   private static final UTC[] $VALUES = new UTC[]{INSTANCE};


   private UTC(String var1, int var2) {}

}
