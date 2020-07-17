package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ColumnFilter;
import com.microsoft.sqlserver.jdbc.DTV;
import com.microsoft.sqlserver.jdbc.DataTypes;
import com.microsoft.sqlserver.jdbc.DriverError;
import com.microsoft.sqlserver.jdbc.InputStreamGetterArgs;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.JavaType;
import com.microsoft.sqlserver.jdbc.SQLIdentifier;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLState;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.StreamSetterArgs;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSWriter;
import com.microsoft.sqlserver.jdbc.TypeInfo;
import java.util.Calendar;

final class Column {

   private TypeInfo typeInfo;
   private DTV updaterDTV;
   private final DTV getterDTV = new DTV();
   private String columnName;
   private String baseColumnName;
   private int tableNum;
   private int infoStatus;
   private SQLIdentifier tableName;
   ColumnFilter filter;


   final TypeInfo getTypeInfo() {
      return this.typeInfo;
   }

   final void setColumnName(String var1) {
      this.columnName = var1;
   }

   final String getColumnName() {
      return this.columnName;
   }

   final void setBaseColumnName(String var1) {
      this.baseColumnName = var1;
   }

   final String getBaseColumnName() {
      return this.baseColumnName;
   }

   final void setTableNum(int var1) {
      this.tableNum = var1;
   }

   final int getTableNum() {
      return this.tableNum;
   }

   final void setInfoStatus(int var1) {
      this.infoStatus = var1;
   }

   final boolean hasDifferentName() {
      return 0 != (this.infoStatus & 32);
   }

   final boolean isHidden() {
      return 0 != (this.infoStatus & 16);
   }

   final boolean isKey() {
      return 0 != (this.infoStatus & 8);
   }

   final boolean isExpression() {
      return 0 != (this.infoStatus & 4);
   }

   final boolean isUpdatable() {
      return !this.isExpression() && !this.isHidden() && this.tableName.getObjectName().length() > 0;
   }

   final void setTableName(SQLIdentifier var1) {
      this.tableName = var1;
   }

   final SQLIdentifier getTableName() {
      return this.tableName;
   }

   Column(TypeInfo var1, String var2, SQLIdentifier var3) {
      this.typeInfo = var1;
      this.columnName = var2;
      this.baseColumnName = var2;
      this.tableName = var3;
   }

   final void clear() {
      this.getterDTV.clear();
   }

   final void skipValue(TDSReader var1, boolean var2) throws SQLServerException {
      this.getterDTV.skipValue(this.typeInfo, var1, var2);
   }

   final void initFromCompressedNull() {
      this.getterDTV.initFromCompressedNull();
   }

   void setFilter(ColumnFilter var1) {
      this.filter = var1;
   }

   final boolean isNull() {
      return this.getterDTV.isNull();
   }

   final boolean isInitialized() {
      return this.getterDTV.isInitialized();
   }

   Object getValue(JDBCType var1, InputStreamGetterArgs var2, Calendar var3, TDSReader var4) throws SQLServerException {
      Object var5 = this.getterDTV.getValue(var1, this.typeInfo.getScale(), var2, var3, this.typeInfo, var4);
      return null != this.filter?this.filter.apply(var5, var1):var5;
   }

   int getInt(TDSReader var1) throws SQLServerException {
      return ((Integer)this.getValue(JDBCType.INTEGER, (InputStreamGetterArgs)null, (Calendar)null, var1)).intValue();
   }

   void updateValue(JDBCType var1, Object var2, JavaType var3, StreamSetterArgs var4, Calendar var5, Integer var6, SQLServerConnection var7) throws SQLServerException {
      SSType var8 = this.typeInfo.getSSType();
      if(null != var4) {
         if(!var4.streamType.convertsTo(this.typeInfo)) {
            DataTypes.throwConversionError(var4.streamType.toString(), var8.toString());
         }
      } else if(!var1.convertsTo(var8)) {
         DataTypes.throwConversionError(var1.toString(), var8.toString());
      }

      if((JDBCType.DATETIMEOFFSET == var1 || JavaType.DATETIMEOFFSET == var3) && !var7.isKatmaiOrLater()) {
         throw new SQLServerException(SQLServerException.getErrString("R_notSupported"), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET, (Throwable)null);
      } else {
         if((SSType.NCHAR == var8 || SSType.NVARCHAR == var8 || SSType.NVARCHARMAX == var8 || SSType.NTEXT == var8 || SSType.XML == var8) && (JDBCType.CHAR == var1 || JDBCType.VARCHAR == var1 || JDBCType.LONGVARCHAR == var1 || JDBCType.CLOB == var1)) {
            var1 = JDBCType.CLOB == var1?JDBCType.NCLOB:JDBCType.NVARCHAR;
         } else if((SSType.BINARY == var8 || SSType.VARBINARY == var8 || SSType.VARBINARYMAX == var8 || SSType.IMAGE == var8 || SSType.UDT == var8) && (JDBCType.CHAR == var1 || JDBCType.VARCHAR == var1 || JDBCType.LONGVARCHAR == var1)) {
            var1 = JDBCType.VARBINARY;
         } else if((JDBCType.TIMESTAMP == var1 || JDBCType.DATE == var1 || JDBCType.TIME == var1) && (SSType.CHAR == var8 || SSType.VARCHAR == var8 || SSType.VARCHARMAX == var8 || SSType.TEXT == var8 || SSType.NCHAR == var8 || SSType.NVARCHAR == var8 || SSType.NVARCHARMAX == var8 || SSType.NTEXT == var8)) {
            var1 = JDBCType.NCHAR;
         }

         if(null == this.updaterDTV) {
            this.updaterDTV = new DTV();
         }

         this.updaterDTV.setValue(this.typeInfo.getSQLCollation(), var1, var2, var3, var4, var5, var6, var7);
      }
   }

   boolean hasUpdates() {
      return null != this.updaterDTV;
   }

   void cancelUpdates() {
      this.updaterDTV = null;
   }

   void sendByRPC(TDSWriter var1, SQLServerConnection var2) throws SQLServerException {
      if(null != this.updaterDTV) {
         this.updaterDTV.sendByRPC(this.baseColumnName, this.typeInfo, this.typeInfo.getSQLCollation(), this.typeInfo.getScale(), false, var1, var2);
      }
   }
}
