package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.Column;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSReaderMark;

final class StreamColInfo extends StreamPacket {

   private TDSReader tdsReader;
   private TDSReaderMark colInfoMark;


   StreamColInfo() {
      super(165);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 165 == var1.readUnsignedByte() : "Not a COLINFO token";

      this.tdsReader = var1;
      int var2 = var1.readUnsignedShort();
      this.colInfoMark = var1.mark();
      var1.skip(var2);
   }

   int applyTo(Column[] var1) throws SQLServerException {
      int var2 = 0;
      TDSReaderMark var3 = this.tdsReader.mark();
      this.tdsReader.reset(this.colInfoMark);

      for(int var4 = 0; var4 < var1.length; ++var4) {
         Column var5 = var1[var4];
         this.tdsReader.readUnsignedByte();
         var5.setTableNum(this.tdsReader.readUnsignedByte());
         if(var5.getTableNum() > var2) {
            var2 = var5.getTableNum();
         }

         var5.setInfoStatus(this.tdsReader.readUnsignedByte());
         if(var5.hasDifferentName()) {
            var5.setBaseColumnName(this.tdsReader.readUnicodeString(this.tdsReader.readUnsignedByte()));
         }
      }

      this.tdsReader.reset(var3);
      return var2;
   }

}
