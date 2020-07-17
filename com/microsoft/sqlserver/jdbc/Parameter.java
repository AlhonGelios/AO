package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.DTV;
import com.microsoft.sqlserver.jdbc.DTVExecuteOp;
import com.microsoft.sqlserver.jdbc.DriverError;
import com.microsoft.sqlserver.jdbc.InputStreamGetterArgs;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.JavaType;
import com.microsoft.sqlserver.jdbc.SQLCollation;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerSQLXML;
import com.microsoft.sqlserver.jdbc.SQLState;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.StreamRetValue;
import com.microsoft.sqlserver.jdbc.StreamSetterArgs;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSWriter;
import com.microsoft.sqlserver.jdbc.TypeInfo;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Calendar;
import microsoft.sql.DateTimeOffset;

final class Parameter {

   private TypeInfo typeInfo;
   private String typeDefinition = null;
   private int outScale = 4;
   private String name;
   private DTV getterDTV;
   private DTV registeredOutDTV = null;
   private DTV setterDTV = null;
   private DTV inputDTV = null;


   TypeInfo getTypeInfo() {
      return this.typeInfo;
   }

   boolean isOutput() {
      return null != this.registeredOutDTV;
   }

   JDBCType getJdbcType() throws SQLServerException {
      return null != this.inputDTV?this.inputDTV.getJdbcType():JDBCType.UNKNOWN;
   }

   private static JDBCType getSSPAUJDBCType(JDBCType var0) {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var0.ordinal()]) {
      case 1:
         return JDBCType.NCHAR;
      case 2:
         return JDBCType.NVARCHAR;
      case 3:
         return JDBCType.LONGNVARCHAR;
      case 4:
         return JDBCType.NCLOB;
      default:
         return var0;
      }
   }

   void registerForOutput(JDBCType var1, SQLServerConnection var2) throws SQLServerException {
      if(JDBCType.DATETIMEOFFSET == var1 && !var2.isKatmaiOrLater()) {
         throw new SQLServerException(SQLServerException.getErrString("R_notSupported"), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET, (Throwable)null);
      } else {
         if(var2.sendStringParametersAsUnicode()) {
            var1 = getSSPAUJDBCType(var1);
         }

         this.registeredOutDTV = new DTV();
         this.registeredOutDTV.setJdbcType(var1);
         if(null == this.setterDTV) {
            this.inputDTV = this.registeredOutDTV;
         }

         this.resetOutputValue();
      }
   }

   int getOutScale() {
      return this.outScale;
   }

   void setOutScale(int var1) {
      this.outScale = var1;
   }

   final Parameter cloneForBatch() {
      Parameter var1 = new Parameter();
      var1.typeInfo = this.typeInfo;
      var1.typeDefinition = this.typeDefinition;
      var1.outScale = this.outScale;
      var1.name = this.name;
      var1.getterDTV = this.getterDTV;
      var1.registeredOutDTV = this.registeredOutDTV;
      var1.setterDTV = this.setterDTV;
      var1.inputDTV = this.inputDTV;
      return var1;
   }

   final void skipValue(TDSReader var1, boolean var2) throws SQLServerException {
      if(null == this.getterDTV) {
         this.getterDTV = new DTV();
      }

      this.deriveTypeInfo(var1);
      this.getterDTV.skipValue(this.typeInfo, var1, var2);
   }

   final void skipRetValStatus(TDSReader var1) throws SQLServerException {
      StreamRetValue var2 = new StreamRetValue();
      var2.setFromTDS(var1);
   }

   void clearInputValue() {
      this.setterDTV = null;
      this.inputDTV = this.registeredOutDTV;
   }

   void resetOutputValue() {
      this.getterDTV = null;
      this.typeInfo = null;
   }

   void deriveTypeInfo(TDSReader var1) throws SQLServerException {
      if(null == this.typeInfo) {
         this.typeInfo = TypeInfo.getInstance(var1);
      }

   }

   void setFromReturnStatus(int var1, SQLServerConnection var2) throws SQLServerException {
      if(null == this.getterDTV) {
         this.getterDTV = new DTV();
      }

      this.getterDTV.setValue((SQLCollation)null, JDBCType.INTEGER, new Integer(var1), JavaType.INTEGER, (StreamSetterArgs)null, (Calendar)null, (Integer)null, var2);
   }

   void setValue(JDBCType var1, Object var2, JavaType var3, StreamSetterArgs var4, Calendar var5, Integer var6, SQLServerConnection var7) throws SQLServerException {
      if((JDBCType.DATETIMEOFFSET == var1 || JavaType.DATETIMEOFFSET == var3) && !var7.isKatmaiOrLater()) {
         throw new SQLServerException(SQLServerException.getErrString("R_notSupported"), SQLState.DATA_EXCEPTION_NOT_SPECIFIC, DriverError.NOT_SET, (Throwable)null);
      } else {
         if(var7.sendStringParametersAsUnicode() && (JavaType.STRING == var3 || JavaType.READER == var3 || JavaType.CLOB == var3)) {
            var1 = getSSPAUJDBCType(var1);
         }

         DTV var8 = new DTV();
         var8.setValue(var7.getDatabaseCollation(), var1, var2, var3, var4, var5, var6, var7);
         this.inputDTV = this.setterDTV = var8;
      }
   }

   boolean isNull() {
      return null != this.getterDTV?this.getterDTV.isNull():false;
   }

   boolean isValueGotten() {
      return null != this.getterDTV;
   }

   Object getValue(JDBCType var1, InputStreamGetterArgs var2, Calendar var3, TDSReader var4) throws SQLServerException {
      if(null == this.getterDTV) {
         this.getterDTV = new DTV();
      }

      this.deriveTypeInfo(var4);
      return this.getterDTV.getValue(var1, this.outScale, var2, var3, this.typeInfo, var4);
   }

   int getInt(TDSReader var1) throws SQLServerException {
      Integer var2 = (Integer)this.getValue(JDBCType.INTEGER, (InputStreamGetterArgs)null, (Calendar)null, var1);
      return null != var2?var2.intValue():0;
   }

   String getTypeDefinition(SQLServerConnection var1, TDSReader var2) throws SQLServerException {
      if(null == this.inputDTV) {
         return null;
      } else {
         this.inputDTV.executeOp(new Parameter.GetTypeDefinitionOp(this, var1));
         return this.typeDefinition;
      }
   }

   void sendByRPC(TDSWriter var1, SQLServerConnection var2) throws SQLServerException {
      assert null != this.inputDTV : "Parameter was neither set nor registered";

      this.inputDTV.sendByRPC(this.name, (TypeInfo)null, var2.getDatabaseCollation(), this.outScale, this.isOutput(), var1, var2);
      if(JavaType.INPUTSTREAM == this.inputDTV.getJavaType() || JavaType.READER == this.inputDTV.getJavaType()) {
         this.inputDTV = this.setterDTV = null;
      }

   }


   final class GetTypeDefinitionOp extends DTVExecuteOp {

      private static final String NVARCHAR_MAX = "nvarchar(max)";
      private static final String NVARCHAR_4K = "nvarchar(4000)";
      private static final String NTEXT = "ntext";
      private static final String VARCHAR_MAX = "varchar(max)";
      private static final String VARCHAR_8K = "varchar(8000)";
      private static final String TEXT = "text";
      private static final String VARBINARY_MAX = "varbinary(max)";
      private static final String VARBINARY_8K = "varbinary(8000)";
      private static final String IMAGE = "image";
      private final Parameter param;
      private final SQLServerConnection con;
      int scale = 0;
      // $FF: synthetic field
      static final boolean $assertionsDisabled = !Parameter.class.desiredAssertionStatus();


      GetTypeDefinitionOp(Parameter var2, SQLServerConnection var3) {
         this.param = var2;
         this.con = var3;
      }

      private void setTypeDefinition(DTV var1) {
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var1.getJdbcType().ordinal()]) {
         case 1:
         case 2:
            if("varchar(max)" != this.param.typeDefinition && "text" != this.param.typeDefinition) {
               this.param.typeDefinition = "varchar(8000)";
            }
            break;
         case 3:
         case 4:
            this.param.typeDefinition = "varchar(max)";
            break;
         case 5:
            this.param.typeDefinition = SSType.TINYINT.toString();
            break;
         case 6:
            this.param.typeDefinition = SSType.SMALLINT.toString();
            break;
         case 7:
            this.param.typeDefinition = SSType.INTEGER.toString();
            break;
         case 8:
            this.param.typeDefinition = SSType.BIGINT.toString();
            break;
         case 9:
         case 10:
         case 11:
            this.param.typeDefinition = SSType.FLOAT.toString();
            break;
         case 12:
         case 13:
            if(this.scale > 38) {
               this.scale = 38;
            }

            Integer var2 = var1.getScale();
            if(null != var2 && this.scale < var2.intValue()) {
               this.scale = var2.intValue();
            }

            if(this.param.isOutput() && this.scale < this.param.getOutScale()) {
               this.scale = this.param.getOutScale();
            }

            this.param.typeDefinition = "decimal(38," + this.scale + ")";
            break;
         case 14:
         case 15:
            this.param.typeDefinition = SSType.BIT.toString();
            break;
         case 16:
         case 17:
            this.param.typeDefinition = "varbinary(max)";
            break;
         case 18:
         case 19:
            if("varbinary(max)" != this.param.typeDefinition && "image" != this.param.typeDefinition) {
               this.param.typeDefinition = "varbinary(8000)";
            }
            break;
         case 20:
            this.param.typeDefinition = this.con.isKatmaiOrLater()?SSType.DATE.toString():SSType.DATETIME.toString();
            break;
         case 21:
            this.param.typeDefinition = this.con.sendTimeAsDatetime()?SSType.DATETIME.toString():SSType.TIME.toString();
            break;
         case 22:
            this.param.typeDefinition = this.con.isKatmaiOrLater()?SSType.DATETIME2.toString():SSType.DATETIME.toString();
            break;
         case 23:
         case 24:
         case 25:
            this.param.typeDefinition = SSType.DATETIMEOFFSET.toString();
            break;
         case 26:
         case 27:
            this.param.typeDefinition = "nvarchar(max)";
            break;
         case 28:
         case 29:
            if("nvarchar(max)" != this.param.typeDefinition && "ntext" != this.param.typeDefinition) {
               this.param.typeDefinition = "nvarchar(4000)";
            }
            break;
         case 30:
            this.param.typeDefinition = SSType.XML.toString();
            break;
         default:
            if(!$assertionsDisabled) {
               throw new AssertionError("Unexpected JDBC type " + var1.getJdbcType());
            }
         }

      }

      void execute(DTV var1, String var2) throws SQLServerException {
         if(null != var2 && var2.length() > 4000) {
            var1.setJdbcType(JDBCType.LONGNVARCHAR);
         }

         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Clob var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Byte var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Integer var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Time var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Date var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Timestamp var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, java.util.Date var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Calendar var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, LocalDate var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, LocalTime var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, LocalDateTime var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, OffsetTime var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, OffsetDateTime var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, DateTimeOffset var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Float var2) throws SQLServerException {
         this.scale = 4;
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Double var2) throws SQLServerException {
         this.scale = 4;
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, BigDecimal var2) throws SQLServerException {
         if(null != var2) {
            this.scale = var2.scale();
            if(this.scale < 0) {
               this.scale = 0;
            }
         }

         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Long var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, BigInteger var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Short var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Boolean var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, byte[] var2) throws SQLServerException {
         if(null != var2 && var2.length > 8000) {
            var1.setJdbcType(var1.getJdbcType().isBinary()?JDBCType.LONGVARBINARY:JDBCType.LONGVARCHAR);
         }

         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Blob var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, InputStream var2) throws SQLServerException {
         StreamSetterArgs var3 = var1.getStreamSetterArgs();
         JDBCType var4 = var1.getJdbcType();
         if(JDBCType.CHAR == var4 || JDBCType.VARCHAR == var4 || JDBCType.BINARY == var4 || JDBCType.VARBINARY == var4) {
            if(var3.getLength() > 8000L) {
               var1.setJdbcType(var4.isBinary()?JDBCType.LONGVARBINARY:JDBCType.LONGVARCHAR);
            } else if(-1L == var3.getLength()) {
               byte[] var5 = new byte[8001];
               BufferedInputStream var6 = new BufferedInputStream(var2, var5.length);
               int var7 = 0;

               try {
                  var6.mark(var5.length);
                  var7 = var6.read(var5, 0, var5.length);
                  if(-1 == var7) {
                     var7 = 0;
                  }

                  var6.reset();
               } catch (IOException var11) {
                  MessageFormat var9 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                  Object[] var10 = new Object[]{var11.toString()};
                  SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var9.format(var10), "", true);
               }

               var1.setValue(var6, JavaType.INPUTSTREAM);
               if(var7 > 8000) {
                  var1.setJdbcType(var4.isBinary()?JDBCType.LONGVARBINARY:JDBCType.LONGVARCHAR);
               } else {
                  var3.setLength((long)var7);
               }
            }
         }

         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, Reader var2) throws SQLServerException {
         if(JDBCType.NCHAR == var1.getJdbcType() || JDBCType.NVARCHAR == var1.getJdbcType()) {
            StreamSetterArgs var3 = var1.getStreamSetterArgs();
            if(var3.getLength() > 4000L) {
               var1.setJdbcType(JDBCType.LONGNVARCHAR);
            } else if(-1L == var3.getLength()) {
               char[] var4 = new char[4001];
               BufferedReader var5 = new BufferedReader(var2, var4.length);
               int var6 = 0;

               try {
                  var5.mark(var4.length);
                  var6 = var5.read(var4, 0, var4.length);
                  if(-1 == var6) {
                     var6 = 0;
                  }

                  var5.reset();
               } catch (IOException var10) {
                  MessageFormat var8 = new MessageFormat(SQLServerException.getErrString("R_errorReadingStream"));
                  Object[] var9 = new Object[]{var10.toString()};
                  SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var8.format(var9), "", true);
               }

               var1.setValue(var5, JavaType.READER);
               if(var6 > 4000) {
                  var1.setJdbcType(JDBCType.LONGNVARCHAR);
               } else {
                  var3.setLength((long)var6);
               }
            }
         }

         this.setTypeDefinition(var1);
      }

      void execute(DTV var1, SQLServerSQLXML var2) throws SQLServerException {
         this.setTypeDefinition(var1);
      }

   }
}
