package com.microsoft.sqlserver.jdbc;


enum RowType {

   ROW("ROW", 0),
   NBCROW("NBCROW", 1),
   UNKNOWN("UNKNOWN", 2);
   // $FF: synthetic field
   private static final RowType[] $VALUES = new RowType[]{ROW, NBCROW, UNKNOWN};


   private RowType(String var1, int var2) {}

}
