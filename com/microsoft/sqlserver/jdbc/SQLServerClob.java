package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.BaseInputStream;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerClobBase;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.TypeInfo;
import java.io.UnsupportedEncodingException;
import java.sql.Clob;
import java.util.logging.Logger;

public class SQLServerClob extends SQLServerClobBase implements Clob {

   private static final Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.SQLServerClob");


   @Deprecated
   public SQLServerClob(SQLServerConnection var1, String var2) {
      super(var1, var2, null == var1?null:var1.getDatabaseCollation(), logger);
      if(null == var2) {
         throw new NullPointerException(SQLServerException.getErrString("R_cantSetNull"));
      }
   }

   SQLServerClob(SQLServerConnection var1) {
      super(var1, "", var1.getDatabaseCollation(), logger);
   }

   SQLServerClob(BaseInputStream var1, TypeInfo var2) throws SQLServerException, UnsupportedEncodingException {
      super((SQLServerConnection)null, new String(var1.getBytes(), var2.getCharset()), var2.getSQLCollation(), logger);
   }

   final JDBCType getJdbcType() {
      return JDBCType.CLOB;
   }

}
