package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.StreamDone;
import com.microsoft.sqlserver.jdbc.StreamError;
import com.microsoft.sqlserver.jdbc.StreamRetStatus;
import com.microsoft.sqlserver.jdbc.TDSParser;
import com.microsoft.sqlserver.jdbc.TDSReader;

class TDSTokenHandler {

   final String logContext;
   private StreamError databaseError;


   final StreamError getDatabaseError() {
      return this.databaseError;
   }

   TDSTokenHandler(String var1) {
      this.logContext = var1;
   }

   boolean onSSPI(TDSReader var1) throws SQLServerException {
      TDSParser.throwUnexpectedTokenException(var1, this.logContext);
      return false;
   }

   boolean onLoginAck(TDSReader var1) throws SQLServerException {
      TDSParser.throwUnexpectedTokenException(var1, this.logContext);
      return false;
   }

   boolean onEnvChange(TDSReader var1) throws SQLServerException {
      var1.getConnection().processEnvChange(var1);
      return true;
   }

   boolean onRetStatus(TDSReader var1) throws SQLServerException {
      (new StreamRetStatus()).setFromTDS(var1);
      return true;
   }

   boolean onRetValue(TDSReader var1) throws SQLServerException {
      TDSParser.throwUnexpectedTokenException(var1, this.logContext);
      return false;
   }

   boolean onDone(TDSReader var1) throws SQLServerException {
      StreamDone var2 = new StreamDone();
      var2.setFromTDS(var1);
      return true;
   }

   boolean onError(TDSReader var1) throws SQLServerException {
      if(null == this.databaseError) {
         this.databaseError = new StreamError();
         this.databaseError.setFromTDS(var1);
      } else {
         (new StreamError()).setFromTDS(var1);
      }

      return true;
   }

   boolean onInfo(TDSReader var1) throws SQLServerException {
      TDSParser.ignoreLengthPrefixedToken(var1);
      return true;
   }

   boolean onOrder(TDSReader var1) throws SQLServerException {
      TDSParser.ignoreLengthPrefixedToken(var1);
      return true;
   }

   boolean onColMetaData(TDSReader var1) throws SQLServerException {
      TDSParser.throwUnexpectedTokenException(var1, this.logContext);
      return false;
   }

   boolean onRow(TDSReader var1) throws SQLServerException {
      TDSParser.throwUnexpectedTokenException(var1, this.logContext);
      return false;
   }

   boolean onNBCRow(TDSReader var1) throws SQLServerException {
      TDSParser.throwUnexpectedTokenException(var1, this.logContext);
      return false;
   }

   boolean onColInfo(TDSReader var1) throws SQLServerException {
      TDSParser.ignoreLengthPrefixedToken(var1);
      return true;
   }

   boolean onTabName(TDSReader var1) throws SQLServerException {
      TDSParser.ignoreLengthPrefixedToken(var1);
      return true;
   }

   void onEOF(TDSReader var1) throws SQLServerException {
      if(null != this.getDatabaseError()) {
         SQLServerException.makeFromDatabaseError(var1.getConnection(), (Object)null, this.getDatabaseError().getMessage(), this.getDatabaseError(), false);
      }

   }
}
