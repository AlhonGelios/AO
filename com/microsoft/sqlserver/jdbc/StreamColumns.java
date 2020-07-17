package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.Column;
import com.microsoft.sqlserver.jdbc.SQLIdentifier;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.StreamColInfo;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.StreamTabName;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TypeInfo;

final class StreamColumns extends StreamPacket {

   private Column[] columns;


   StreamColumns() {
      super(129);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 129 == var1.readUnsignedByte();

      int var2 = var1.readUnsignedShort();
      if('\uffff' != var2) {
         this.columns = new Column[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            TypeInfo var4 = TypeInfo.getInstance(var1);
            SQLIdentifier var5 = new SQLIdentifier();
            if(SSType.TEXT == var4.getSSType() || SSType.NTEXT == var4.getSSType() || SSType.IMAGE == var4.getSSType()) {
               var5 = var1.readSQLIdentifier();
            }

            String var6 = var1.readUnicodeString(var1.readUnsignedByte());
            this.columns[var3] = new Column(var4, var6, var5);
         }

      }
   }

   Column[] buildColumns(StreamColInfo var1, StreamTabName var2) throws SQLServerException {
      if(null != var1 && null != var2) {
         var2.applyTo(this.columns, var1.applyTo(this.columns));
      }

      return this.columns;
   }

}
