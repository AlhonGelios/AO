package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.Column;
import com.microsoft.sqlserver.jdbc.SQLIdentifier;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSReaderMark;

final class StreamTabName extends StreamPacket {

   private TDSReader tdsReader;
   private TDSReaderMark tableNamesMark;


   StreamTabName() {
      super(164);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 164 == var1.readUnsignedByte() : "Not a TABNAME token";

      this.tdsReader = var1;
      int var2 = var1.readUnsignedShort();
      this.tableNamesMark = var1.mark();
      var1.skip(var2);
   }

   void applyTo(Column[] var1, int var2) throws SQLServerException {
      TDSReaderMark var3 = this.tdsReader.mark();
      this.tdsReader.reset(this.tableNamesMark);
      SQLIdentifier[] var4 = new SQLIdentifier[var2];

      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var4[var5] = this.tdsReader.readSQLIdentifier();
      }

      for(var5 = 0; var5 < var1.length; ++var5) {
         Column var6 = var1[var5];
         if(var6.getTableNum() > 0) {
            var6.setTableName(var4[var6.getTableNum() - 1]);
         }
      }

      this.tdsReader.reset(var3);
   }

}
