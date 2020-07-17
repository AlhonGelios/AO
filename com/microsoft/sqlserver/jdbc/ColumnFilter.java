package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerException;

abstract class ColumnFilter {

   abstract Object apply(Object var1, JDBCType var2) throws SQLServerException;
}
