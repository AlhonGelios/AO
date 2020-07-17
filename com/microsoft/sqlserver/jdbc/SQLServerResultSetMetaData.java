package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.DriverJDBCVersion;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.TypeInfo;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class SQLServerResultSetMetaData implements ResultSetMetaData {

   private SQLServerConnection con;
   private final SQLServerResultSet rs;
   public int nBeforeExecuteCols;
   private static final Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.SQLServerResultSetMetaData");
   private static int baseID = 0;
   private final String traceID = " SQLServerResultSetMetaData:" + nextInstanceID();


   private static synchronized int nextInstanceID() {
      ++baseID;
      return baseID;
   }

   public final String toString() {
      return this.traceID;
   }

   SQLServerResultSetMetaData(SQLServerConnection var1, SQLServerResultSet var2) {
      this.con = var1;
      this.rs = var2;

      assert var2 != null;

      if(logger.isLoggable(Level.FINE)) {
         logger.fine(this.toString() + " created by (" + var2.toString() + ")");
      }

   }

   private void checkClosed() throws SQLServerException {
      this.rs.checkClosed();
   }

   public boolean isWrapperFor(Class var1) throws SQLException {
      DriverJDBCVersion.checkSupportsJDBC4();
      return false;
   }

   public Object unwrap(Class var1) throws SQLException {
      DriverJDBCVersion.checkSupportsJDBC4();
      throw new SQLFeatureNotSupportedException(SQLServerException.getErrString("R_notSupported"));
   }

   public String getCatalogName(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTableName().getDatabaseName();
   }

   public int getColumnCount() throws SQLServerException {
      this.checkClosed();
      return this.rs == null?0:this.rs.getColumnCount();
   }

   public int getColumnDisplaySize(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().getDisplaySize();
   }

   public String getColumnLabel(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getColumnName();
   }

   public String getColumnName(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getColumnName();
   }

   public int getColumnType(int var1) throws SQLServerException {
      this.checkClosed();
      TypeInfo var2 = this.rs.getColumn(var1).getTypeInfo();
      JDBCType var3 = var2.getSSType().getJDBCType();
      int var4 = var3.asJavaSqlType();
      if(this.con.isKatmaiOrLater()) {
         SSType var5 = var2.getSSType();
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[var5.ordinal()]) {
         case 1:
            var4 = SSType.VARCHAR.getJDBCType().asJavaSqlType();
            break;
         case 2:
            var4 = SSType.NVARCHAR.getJDBCType().asJavaSqlType();
            break;
         case 3:
            var4 = SSType.VARBINARY.getJDBCType().asJavaSqlType();
         }
      }

      return var4;
   }

   public String getColumnTypeName(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().getSSTypeName();
   }

   public int getPrecision(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().getPrecision();
   }

   public int getScale(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().getScale();
   }

   public String getSchemaName(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTableName().getSchemaName();
   }

   public String getTableName(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTableName().getObjectName();
   }

   public boolean isAutoIncrement(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().isIdentity();
   }

   public boolean isCaseSensitive(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().isCaseSensitive();
   }

   public boolean isCurrency(int var1) throws SQLServerException {
      this.checkClosed();
      SSType var2 = this.rs.getColumn(var1).getTypeInfo().getSSType();
      return SSType.MONEY == var2 || SSType.SMALLMONEY == var2;
   }

   public boolean isDefinitelyWritable(int var1) throws SQLServerException {
      this.checkClosed();
      return TypeInfo.UPDATABLE_READ_WRITE == this.rs.getColumn(var1).getTypeInfo().getUpdatability();
   }

   public int isNullable(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().isNullable()?1:0;
   }

   public boolean isReadOnly(int var1) throws SQLServerException {
      this.checkClosed();
      return TypeInfo.UPDATABLE_READ_ONLY == this.rs.getColumn(var1).getTypeInfo().getUpdatability();
   }

   public boolean isSearchable(int var1) throws SQLServerException {
      this.checkClosed();
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[this.rs.getColumn(var1).getTypeInfo().getSSType().ordinal()]) {
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
         return false;
      default:
         return true;
      }
   }

   public boolean isSigned(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().getSSType().getJDBCType().isSigned();
   }

   public boolean isSparseColumnSet(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().isSparseColumnSet();
   }

   public boolean isWritable(int var1) throws SQLServerException {
      this.checkClosed();
      int var2 = this.rs.getColumn(var1).getTypeInfo().getUpdatability();
      return TypeInfo.UPDATABLE_READ_WRITE == var2 || TypeInfo.UPDATABLE_UNKNOWN == var2;
   }

   public String getColumnClassName(int var1) throws SQLServerException {
      this.checkClosed();
      return this.rs.getColumn(var1).getTypeInfo().getSSType().getJDBCType().className();
   }

}
