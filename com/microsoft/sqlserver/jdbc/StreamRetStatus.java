package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.TDSReader;

final class StreamRetStatus extends StreamPacket {

   private int status;


   final int getStatus() {
      return this.status;
   }

   StreamRetStatus() {
      super(121);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 121 == var1.readUnsignedByte();

      this.status = var1.readInt();
   }

}
