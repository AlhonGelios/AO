package com.microsoft.sqlserver.jdbc;


enum DriverError {

   NOT_SET("NOT_SET", 0, 0);
   private final int errorCode;
   // $FF: synthetic field
   private static final DriverError[] $VALUES = new DriverError[]{NOT_SET};


   final int getErrorCode() {
      return this.errorCode;
   }

   private DriverError(String var1, int var2, int var3) {
      this.errorCode = var3;
   }

}
