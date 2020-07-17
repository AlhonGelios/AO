package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.text.MessageFormat;
import java.util.logging.Logger;

final class DataTypes {

   static final int SHORT_VARTYPE_MAX_CHARS = 4000;
   static final int SHORT_VARTYPE_MAX_BYTES = 8000;
   static final int NTEXT_MAX_CHARS = 1073741823;
   static final int IMAGE_TEXT_MAX_BYTES = Integer.MAX_VALUE;
   static final int MAX_VARTYPE_MAX_CHARS = 1073741823;
   static final int MAX_VARTYPE_MAX_BYTES = Integer.MAX_VALUE;
   private static Logger stmtDT;
   static final int MAXTYPE_LENGTH = 65535;
   static final int UNKNOWN_STREAM_LENGTH = -1;


   static final void throwConversionError(String var0, String var1) throws SQLServerException {
      MessageFormat var2 = new MessageFormat(SQLServerException.getErrString("R_unsupportedConversionFromTo"));
      Object[] var3 = new Object[]{var0, var1};
      SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var2.format(var3), (String)null, true);
   }

   static final long getCheckedLength(SQLServerConnection var0, JDBCType var1, long var2, boolean var4) throws SQLServerException {
      long var5;
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var1.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
         var5 = 1073741823L;
         break;
      default:
         var5 = 2147483647L;
      }

      if(var2 < (long)(var4?-1:0) || var2 > var5) {
         MessageFormat var7 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
         Object[] var8 = new Object[]{Long.valueOf(var2)};
         SQLServerException.makeFromDriverError(var0, (Object)null, var7.format(var8), (String)null, false);
      }

      return var2;
   }
}
