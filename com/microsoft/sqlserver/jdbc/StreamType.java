package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.TypeInfo;

enum StreamType {

   NONE("NONE", 0, JDBCType.UNKNOWN, "None"),
   ASCII("ASCII", 1, JDBCType.LONGVARCHAR, "AsciiStream"),
   BINARY("BINARY", 2, JDBCType.LONGVARBINARY, "BinaryStream"),
   CHARACTER("CHARACTER", 3, JDBCType.LONGVARCHAR, "CharacterStream"),
   NCHARACTER("NCHARACTER", 4, JDBCType.LONGNVARCHAR, "NCharacterStream"),
   SQLXML("SQLXML", 5, JDBCType.SQLXML, "SQLXML");
   private final JDBCType jdbcType;
   private final String name;
   // $FF: synthetic field
   private static final StreamType[] $VALUES = new StreamType[]{NONE, ASCII, BINARY, CHARACTER, NCHARACTER, SQLXML};


   JDBCType getJDBCType() {
      return this.jdbcType;
   }

   private StreamType(String var1, int var2, JDBCType var3, String var4) {
      this.jdbcType = var3;
      this.name = var4;
   }

   public String toString() {
      return this.name;
   }

   boolean convertsFrom(TypeInfo var1) {
      if(ASCII == this) {
         if(SSType.XML == var1.getSSType()) {
            return false;
         }

         if(null != var1.getSQLCollation() && !var1.getSQLCollation().supportsAsciiConversion()) {
            return false;
         }
      }

      return var1.getSSType().convertsTo(this.jdbcType);
   }

   boolean convertsTo(TypeInfo var1) {
      if(ASCII == this) {
         if(SSType.XML == var1.getSSType()) {
            return false;
         }

         if(null != var1.getSQLCollation() && !var1.getSQLCollation().supportsAsciiConversion()) {
            return false;
         }
      }

      return this.jdbcType.convertsTo(var1.getSSType());
   }

}
