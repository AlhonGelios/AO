package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamError;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.TDSReader;

final class StreamInfo extends StreamPacket {

   final StreamError msg = new StreamError();


   StreamInfo() {
      super(171);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 171 == var1.readUnsignedByte();

      this.msg.setContentsFromTDS(var1);
   }

}
