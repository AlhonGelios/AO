package com.microsoft.sqlserver.jdbc;


enum SSLenType {

   FIXEDLENTYPE("FIXEDLENTYPE", 0),
   BYTELENTYPE("BYTELENTYPE", 1),
   USHORTLENTYPE("USHORTLENTYPE", 2),
   LONGLENTYPE("LONGLENTYPE", 3),
   PARTLENTYPE("PARTLENTYPE", 4);
   // $FF: synthetic field
   private static final SSLenType[] $VALUES = new SSLenType[]{FIXEDLENTYPE, BYTELENTYPE, USHORTLENTYPE, LONGLENTYPE, PARTLENTYPE};


   private SSLenType(String var1, int var2) {}

}
