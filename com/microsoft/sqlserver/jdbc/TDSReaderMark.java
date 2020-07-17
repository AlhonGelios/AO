package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.TDSPacket;

final class TDSReaderMark {

   final TDSPacket packet;
   final int payloadOffset;


   TDSReaderMark(TDSPacket var1, int var2) {
      this.packet = var1;
      this.payloadOffset = var2;
   }
}
