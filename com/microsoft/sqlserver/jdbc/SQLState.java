package com.microsoft.sqlserver.jdbc;


enum SQLState {

   STATEMENT_CANCELED("STATEMENT_CANCELED", 0, "HY008"),
   DATA_EXCEPTION_NOT_SPECIFIC("DATA_EXCEPTION_NOT_SPECIFIC", 1, "22000"),
   DATA_EXCEPTION_DATETIME_FIELD_OVERFLOW("DATA_EXCEPTION_DATETIME_FIELD_OVERFLOW", 2, "22008"),
   DATA_EXCEPTION_LENGTH_MISMATCH("DATA_EXCEPTION_LENGTH_MISMATCH", 3, "22026"),
   COL_NOT_FOUND("COL_NOT_FOUND", 4, "42S22");
   private final String sqlStateCode;
   // $FF: synthetic field
   private static final SQLState[] $VALUES = new SQLState[]{STATEMENT_CANCELED, DATA_EXCEPTION_NOT_SPECIFIC, DATA_EXCEPTION_DATETIME_FIELD_OVERFLOW, DATA_EXCEPTION_LENGTH_MISMATCH, COL_NOT_FOUND};


   final String getSQLStateCode() {
      return this.sqlStateCode;
   }

   private SQLState(String var1, int var2, String var3) {
      this.sqlStateCode = var3;
   }

}
