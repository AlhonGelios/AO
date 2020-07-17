package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.Set;

public interface ISQLServerBulkRecord {

   Set getColumnOrdinals();

   String getColumnName(int var1);

   int getColumnType(int var1);

   int getPrecision(int var1);

   int getScale(int var1);

   boolean isAutoIncrement(int var1);

   Object[] getRowData() throws SQLServerException;

   boolean next() throws SQLServerException;
}
