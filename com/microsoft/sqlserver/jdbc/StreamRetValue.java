package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamPacket;
import com.microsoft.sqlserver.jdbc.TDSReader;

final class StreamRetValue extends StreamPacket {

   private String paramName;
   private int ordinalOrLength;
   private int status;


   final int getOrdinalOrLength() {
      return this.ordinalOrLength;
   }

   StreamRetValue() {
      super(172);
   }

   void setFromTDS(TDSReader var1) throws SQLServerException {
      assert 172 == var1.readUnsignedByte();

      this.ordinalOrLength = var1.readUnsignedShort();
      this.paramName = var1.readUnicodeString(var1.readUnsignedByte());
      this.status = var1.readUnsignedByte();
   }

}
