package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.TDSReader;

abstract class StreamPacket {

   int packetType;


   final int getTokenType() {
      return this.packetType;
   }

   StreamPacket() {
      this.packetType = 0;
   }

   StreamPacket(int var1) {
      this.packetType = var1;
   }

   abstract void setFromTDS(TDSReader var1) throws SQLServerException;
}
