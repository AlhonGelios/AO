package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.TDSReader;

final class StreamSSPI extends StreamPacket {

   byte[] sspiBlob;


   StreamSSPI() {
      super(237);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 237 == var1.readUnsignedByte();

      int var2 = var1.readUnsignedShort();
      this.sspiBlob = new byte[var2];
      var1.readBytes(this.sspiBlob, 0, var2);
   }

}
