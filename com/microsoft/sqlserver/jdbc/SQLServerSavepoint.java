package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Savepoint;
import java.text.MessageFormat;

public final class SQLServerSavepoint implements Savepoint {

   private final String sName;
   private final int nId;
   private final SQLServerConnection con;


   public SQLServerSavepoint(SQLServerConnection var1, String var2) {
      this.con = var1;
      if(var2 == null) {
         this.nId = var1.getNextSavepointId();
         this.sName = null;
      } else {
         this.sName = var2;
         this.nId = 0;
      }

   }

   public String getSavepointName() throws SQLServerException {
      if(this.sName == null) {
         SQLServerException.makeFromDriverError(this.con, (Object)null, SQLServerException.getErrString("R_savepointNotNamed"), (String)null, false);
      }

      return this.sName;
   }

   public String getLabel() {
      return this.sName == null?"S" + this.nId:this.sName;
   }

   public boolean isNamed() {
      return this.sName != null;
   }

   public int getSavepointId() throws SQLServerException {
      if(this.sName != null) {
         MessageFormat var1 = new MessageFormat(SQLServerException.getErrString("R_savepointNamed"));
         Object[] var2 = new Object[]{new String(this.sName)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var1.format(var2), (String)null, false);
      }

      return this.nId;
   }
}
