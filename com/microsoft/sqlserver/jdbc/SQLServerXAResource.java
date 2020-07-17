package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerCallableStatement;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerDriverIntProperty;
import com.microsoft.sqlserver.jdbc.SQLServerDriverStringProperty;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;
import com.microsoft.sqlserver.jdbc.Util;
import com.microsoft.sqlserver.jdbc.XAReturnValue;
import com.microsoft.sqlserver.jdbc.XidImpl;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.xa.XAException;
import javax.transaction.xa.XAResource;
import javax.transaction.xa.Xid;

public final class SQLServerXAResource implements XAResource {

   private int timeoutSeconds;
   static final int XA_START = 0;
   static final int XA_END = 1;
   static final int XA_PREPARE = 2;
   static final int XA_COMMIT = 3;
   static final int XA_ROLLBACK = 4;
   static final int XA_FORGET = 5;
   static final int XA_RECOVER = 6;
   static final int XA_PREPARE_EX = 7;
   static final int XA_ROLLBACK_EX = 8;
   static final int XA_FORGET_EX = 9;
   static final int XA_INIT = 10;
   private SQLServerConnection controlConnection;
   private SQLServerConnection con;
   private boolean serverInfoRetrieved;
   private String version;
   private String instanceName;
   private int ArchitectureMSSQL;
   private int ArchitectureOS;
   private static boolean xaInitDone;
   private static Integer xaInitLock = new Integer(0);
   private String sResourceManagerId;
   private int enlistedTransactionCount;
   private final Logger xaLogger;
   private static int baseResourceID = 0;
   private int tightlyCoupled = 0;
   private int isTransacrionTimeoutSet = 0;
   public static final int SSTRANSTIGHTLYCPLD = 32768;
   private SQLServerCallableStatement[] xaStatements = new SQLServerCallableStatement[]{null, null, null, null, null, null, null, null, null, null};
   private final String traceID = " XAResourceID:" + nextResourceID();


   public String toString() {
      return this.traceID;
   }

   SQLServerXAResource(SQLServerConnection var1, SQLServerConnection var2, String var3) {
      this.xaLogger = SQLServerXADataSource.xaLogger;
      this.controlConnection = var2;
      this.con = var1;
      Properties var4 = var1.activeConnectionProperties;
      if(var4 == null) {
         this.sResourceManagerId = "";
      } else {
         this.sResourceManagerId = var4.getProperty(SQLServerDriverStringProperty.SERVER_NAME.toString()) + "." + var4.getProperty(SQLServerDriverStringProperty.DATABASE_NAME.toString()) + "." + var4.getProperty(SQLServerDriverIntProperty.PORT_NUMBER.toString());
      }

      if(this.xaLogger.isLoggable(Level.FINE)) {
         this.xaLogger.fine(this.toString() + " created by (" + var3 + ")");
      }

      this.serverInfoRetrieved = false;
      this.version = "0";
      this.instanceName = "";
      this.ArchitectureMSSQL = 0;
      this.ArchitectureOS = 0;
   }

   private synchronized SQLServerCallableStatement getXACallableStatementHandle(int var1) throws SQLServerException {
      assert var1 >= 0 && var1 <= 9;

      assert var1 < this.xaStatements.length;

      if(null != this.xaStatements[var1]) {
         return this.xaStatements[var1];
      } else {
         CallableStatement var2 = null;
         switch(var1) {
         case 0:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_start(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            break;
         case 1:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_end(?, ?, ?, ?, ?, ?, ?)}");
            break;
         case 2:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_prepare(?, ?, ?, ?, ?)}");
            break;
         case 3:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_commit(?, ?, ?, ?, ?, ?)}");
            break;
         case 4:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_rollback(?, ?, ?, ?, ?)}");
            break;
         case 5:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_forget(?, ?, ?, ?, ?)}");
            break;
         case 6:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_recover(?, ?, ?, ?)}");
            break;
         case 7:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_prepare_ex(?, ?, ?, ?, ?, ?)}");
            break;
         case 8:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_rollback_ex(?, ?, ?, ?, ?, ?)}");
            break;
         case 9:
            var2 = this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_forget_ex(?, ?, ?, ?, ?, ?)}");
            break;
         default:
            assert false : "Bad handle request:" + var1;
         }

         this.xaStatements[var1] = (SQLServerCallableStatement)var2;
         return this.xaStatements[var1];
      }
   }

   private synchronized void closeXAStatements() throws SQLServerException {
      for(int var1 = 0; var1 < this.xaStatements.length; ++var1) {
         if(null != this.xaStatements[var1]) {
            this.xaStatements[var1].close();
            this.xaStatements[var1] = null;
         }
      }

   }

   final synchronized void close() throws SQLServerException {
      try {
         this.closeXAStatements();
      } catch (Exception var2) {
         if(this.xaLogger.isLoggable(Level.WARNING)) {
            this.xaLogger.warning(this.toString() + "Closing exception ignored: " + var2);
         }
      }

      if(null != this.controlConnection) {
         this.controlConnection.close();
      }

   }

   private String flagsDisplay(int var1) {
      if(0 == var1) {
         return "TMNOFLAGS";
      } else {
         StringBuilder var2 = new StringBuilder(100);
         if(0 != (8388608 & var1)) {
            var2.append("TMENDRSCAN");
         }

         if(0 != (536870912 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMFAIL");
         }

         if(0 != (2097152 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMJOIN");
         }

         if(0 != (1073741824 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMONEPHASE");
         }

         if(0 != (134217728 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMRESUME");
         }

         if(0 != (16777216 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMSTARTRSCAN");
         }

         if(0 != (67108864 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMSUCCESS");
         }

         if(0 != (33554432 & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("TMSUSPEND");
         }

         if(0 != ('\u8000' & var1)) {
            if(var2.length() > 0) {
               var2.append("|");
            }

            var2.append("SSTRANSTIGHTLYCPLD");
         }

         return var2.toString();
      }
   }

   private String cookieDisplay(byte[] var1) {
      return Util.byteToHexDisplayString(var1);
   }

   private String typeDisplay(int var1) {
      switch(var1) {
      case 0:
         return "XA_START";
      case 1:
         return "XA_END";
      case 2:
         return "XA_PREPARE";
      case 3:
         return "XA_COMMIT";
      case 4:
         return "XA_ROLLBACK";
      case 5:
         return "XA_FORGET";
      case 6:
         return "XA_RECOVER";
      default:
         return "UNKNOWN" + var1;
      }
   }

   private final XAReturnValue DTC_XA_Interface(int var1, Xid var2, int var3) throws XAException {
      if(this.xaLogger.isLoggable(Level.FINER)) {
         this.xaLogger.finer(this.toString() + " Calling XA function for type:" + this.typeDisplay(var1) + " flags:" + this.flagsDisplay(var3) + " xid:" + XidImpl.xidDisplay(var2));
      }

      int var4 = 0;
      byte[] var5 = null;
      byte[] var6 = null;
      if(var2 != null) {
         var4 = var2.getFormatId();
         var5 = var2.getGlobalTransactionId();
         var6 = var2.getBranchQualifier();
      }

      String var7 = "DTC_XA_";
      byte var8 = 1;
      boolean var9 = false;
      XAReturnValue var10 = new XAReturnValue();
      SQLServerCallableStatement var11 = null;

      int var35;
      try {
         MessageFormat var14;
         Object[] var15;
         synchronized(this) {
            if(this.controlConnection == null) {
               try {
                  Integer var36 = xaInitLock;
                  synchronized(xaInitLock) {
                     if(!xaInitDone) {
                        var14 = null;
                        SQLServerCallableStatement var40 = (SQLServerCallableStatement)this.controlConnection.prepareCall("{call master..xp_sqljdbc_xa_init_ex(?, ?,?)}");
                        var40.registerOutParameter(1, 4);
                        var40.registerOutParameter(2, 1);
                        var40.registerOutParameter(3, 1);

                        try {
                           var40.execute();
                        } catch (SQLServerException var29) {
                           try {
                              var40.close();
                              this.controlConnection.close();
                           } catch (SQLException var28) {
                              if(this.xaLogger.isLoggable(Level.FINER)) {
                                 this.xaLogger.finer(this.toString() + " Ignoring exception when closing failed execution. exception:" + var28);
                              }
                           }

                           if(this.xaLogger.isLoggable(Level.FINER)) {
                              this.xaLogger.finer(this.toString() + " exception:" + var29);
                           }

                           throw var29;
                        }

                        int var44 = var40.getInt(1);
                        String var16 = var40.getString(2);
                        String var17 = var40.getString(3);
                        if(this.xaLogger.isLoggable(Level.FINE)) {
                           this.xaLogger.fine(this.toString() + " Server XA DLL version:" + var17);
                        }

                        var40.close();
                        if(0 != var44) {
                           assert null != var16 && var16.length() > 1;

                           this.controlConnection.close();
                           MessageFormat var18 = new MessageFormat(SQLServerException.getErrString("R_failedToInitializeXA"));
                           Object[] var19 = new Object[]{String.valueOf(var44), var16};
                           XAException var20 = new XAException(var18.format(var19));
                           var20.errorCode = var44;
                           if(this.xaLogger.isLoggable(Level.FINER)) {
                              this.xaLogger.finer(this.toString() + " exception:" + var20);
                           }

                           throw var20;
                        }

                        xaInitDone = true;
                     }
                  }
               } catch (SQLServerException var31) {
                  var14 = new MessageFormat(SQLServerException.getErrString("R_failedToCreateXAConnection"));
                  var15 = new Object[]{new String(var31.getMessage())};
                  if(this.xaLogger.isLoggable(Level.FINER)) {
                     this.xaLogger.finer(this.toString() + " exception:" + var14.format(var15));
                  }

                  SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var14.format(var15), (String)null, true);
               }
            }
         }

         String var12;
         int var34;
         switch(var1) {
         case 0:
            if(!this.serverInfoRetrieved) {
               try {
                  this.serverInfoRetrieved = true;
                  var12 = "select convert(varchar(100), SERVERPROPERTY(\'Edition\'))as edition,  convert(varchar(100), SERVERPROPERTY(\'InstanceName\'))as instance, convert(varchar(100), SERVERPROPERTY(\'ProductVersion\')) as version";
                  Statement var37 = this.controlConnection.createStatement();
                  ResultSet var42 = var37.executeQuery(var12);
                  var42.next();
                  String var45 = var42.getString(1);
                  this.ArchitectureMSSQL = null != var45 && var45.contains("(64-bit)")?64:32;
                  this.instanceName = var42.getString(2) == null?"MSSQLSERVER":var42.getString(2);
                  this.version = var42.getString(3);
                  if(null == this.version) {
                     this.version = "0";
                  } else if(-1 != this.version.indexOf(46)) {
                     this.version = this.version.substring(0, this.version.indexOf(46));
                  }

                  var12 = "SELECT SUBSTRING(@@VERSION, CHARINDEX(\'<\', @@VERSION)+2, 2)";
                  var42 = var37.executeQuery(var12);
                  var42.next();
                  this.ArchitectureOS = Integer.parseInt(var42.getString(1));
                  var42.close();
                  var37.close();
               } catch (Exception var27) {
                  if(this.xaLogger.isLoggable(Level.WARNING)) {
                     this.xaLogger.warning(this.toString() + " Cannot retrieve server information: :" + var27.getMessage());
                  }
               }
            }

            var7 = "START:";
            var11 = this.getXACallableStatementHandle(0);
            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setBytes(var34++, var5);
            var11.setBytes(var34++, var6);
            var11.setInt(var34++, var3);
            var11.registerOutParameter(var34++, -2);
            var11.setInt(var34++, this.timeoutSeconds);
            var11.setInt(var34++, var4);
            var11.registerOutParameter(var34++, 1);
            var11.setInt(var34++, Integer.parseInt(this.version));
            var11.setInt(var34++, this.instanceName.length());
            var11.setBytes(var34++, this.instanceName.getBytes());
            var11.setInt(var34++, this.ArchitectureMSSQL);
            var11.setInt(var34++, this.ArchitectureOS);
            var11.setInt(var34++, this.isTransacrionTimeoutSet);
            var11.registerOutParameter(var34++, -2);
            break;
         case 1:
            var7 = "END:";
            var11 = this.getXACallableStatementHandle(1);
            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setBytes(var34++, var5);
            var11.setBytes(var34++, var6);
            var11.setInt(var34++, var3);
            var11.setInt(var34++, var4);
            var11.registerOutParameter(var34++, -2);
            break;
         case 2:
            var7 = "PREPARE:";
            if(('\u8000' & var3) == '\u8000') {
               var11 = this.getXACallableStatementHandle(7);
            } else {
               var11 = this.getXACallableStatementHandle(2);
            }

            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setBytes(var34++, var5);
            var11.setBytes(var34++, var6);
            if(('\u8000' & var3) == '\u8000') {
               var11.setInt(var34++, var3);
            }

            var11.setInt(var34++, var4);
            break;
         case 3:
            var7 = "COMMIT:";
            var11 = this.getXACallableStatementHandle(3);
            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setBytes(var34++, var5);
            var11.setBytes(var34++, var6);
            var11.setInt(var34++, var3);
            var11.setInt(var34++, var4);
            break;
         case 4:
            var7 = "ROLLBACK:";
            if(('\u8000' & var3) == '\u8000') {
               var11 = this.getXACallableStatementHandle(8);
            } else {
               var11 = this.getXACallableStatementHandle(4);
            }

            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setBytes(var34++, var5);
            var11.setBytes(var34++, var6);
            if(('\u8000' & var3) == '\u8000') {
               var11.setInt(var34++, var3);
            }

            var11.setInt(var34++, var4);
            break;
         case 5:
            var7 = "FORGET:";
            if(('\u8000' & var3) == '\u8000') {
               var11 = this.getXACallableStatementHandle(9);
            } else {
               var11 = this.getXACallableStatementHandle(5);
            }

            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setBytes(var34++, var5);
            var11.setBytes(var34++, var6);
            if(('\u8000' & var3) == '\u8000') {
               var11.setInt(var34++, var3);
            }

            var11.setInt(var34++, var4);
            break;
         case 6:
            var7 = "RECOVER:";
            var11 = this.getXACallableStatementHandle(6);
            var34 = var8 + 1;
            var11.registerOutParameter(var8, 4);
            var11.registerOutParameter(var34++, 1);
            var11.setInt(var34++, var3);
            var11.registerOutParameter(var34++, -2);
            break;
         default:
            assert false : "Unknown execution type:" + var1;
         }

         var11.execute();
         var35 = var11.getInt(1);
         var12 = var11.getString(2);
         if(var1 == 0) {
            String var38 = var11.getString(9);
            if(this.xaLogger.isLoggable(Level.FINE)) {
               this.xaLogger.fine(this.toString() + " Server XA DLL version:" + var38);
               if(null != var11.getString(16)) {
                  StringBuffer var46 = new StringBuffer(var11.getString(16));
                  var46.insert(20, '-');
                  var46.insert(16, '-');
                  var46.insert(12, '-');
                  var46.insert(8, '-');
                  this.xaLogger.fine(this.toString() + " XID to UoW mapping for XA type:XA_START XID: " + XidImpl.xidDisplay(var2) + " UoW: " + var46.toString());
               }
            }
         }

         if(var1 == 1 && this.xaLogger.isLoggable(Level.FINE) && null != var11.getString(7)) {
            StringBuffer var39 = new StringBuffer(var11.getString(7));
            var39.insert(20, '-');
            var39.insert(16, '-');
            var39.insert(12, '-');
            var39.insert(8, '-');
            this.xaLogger.fine(this.toString() + " XID to UoW mapping for XA type:XA_END XID: " + XidImpl.xidDisplay(var2) + " UoW: " + var39.toString());
         }

         if(3 == var35 && 1 != var1 && 2 != var1 || 0 != var35 && 3 != var35) {
            assert null != var12 && var12.length() > 1;

            MessageFormat var43 = new MessageFormat(SQLServerException.getErrString("R_failedFunctionXA"));
            Object[] var49 = new Object[]{var7, String.valueOf(var35), var12};
            XAException var50 = new XAException(var43.format(var49));
            var50.errorCode = var35;
            if(var1 == 1 && -7 == var35) {
               try {
                  if(this.xaLogger.isLoggable(Level.FINER)) {
                     this.xaLogger.finer(this.toString() + " Begin un-enlist, enlisted count:" + this.enlistedTransactionCount);
                  }

                  this.con.JTAUnenlistConnection();
                  --this.enlistedTransactionCount;
                  if(this.xaLogger.isLoggable(Level.FINER)) {
                     this.xaLogger.finer(this.toString() + " End un-enlist, enlisted count:" + this.enlistedTransactionCount);
                  }
               } catch (SQLServerException var26) {
                  if(this.xaLogger.isLoggable(Level.FINER)) {
                     this.xaLogger.finer(this.toString() + " Ignoring exception:" + var26);
                  }
               }
            }

            throw var50;
         }

         if(var1 == 0) {
            byte[] var41 = var11.getBytes(6);
            if(var41 == null) {
               var14 = new MessageFormat(SQLServerException.getErrString("R_noTransactionCookie"));
               var15 = new Object[]{var7};
               SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var14.format(var15), (String)null, true);
            } else {
               try {
                  if(this.xaLogger.isLoggable(Level.FINER)) {
                     this.xaLogger.finer(this.toString() + " Begin enlisting, cookie:" + this.cookieDisplay(var41) + " enlisted count:" + this.enlistedTransactionCount);
                  }

                  this.con.JTAEnlistConnection(var41);
                  ++this.enlistedTransactionCount;
                  if(this.xaLogger.isLoggable(Level.FINER)) {
                     this.xaLogger.finer(this.toString() + " End enlisting, cookie:" + this.cookieDisplay(var41) + " enlisted count:" + this.enlistedTransactionCount);
                  }
               } catch (SQLServerException var25) {
                  MessageFormat var47 = new MessageFormat(SQLServerException.getErrString("R_failedToEnlist"));
                  Object[] var48 = new Object[]{var25.getMessage()};
                  SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var47.format(var48), (String)null, true);
               }
            }
         }

         if(var1 == 1) {
            try {
               if(this.xaLogger.isLoggable(Level.FINER)) {
                  this.xaLogger.finer(this.toString() + " Begin un-enlist, enlisted count:" + this.enlistedTransactionCount);
               }

               this.con.JTAUnenlistConnection();
               --this.enlistedTransactionCount;
               if(this.xaLogger.isLoggable(Level.FINER)) {
                  this.xaLogger.finer(this.toString() + " End un-enlist, enlisted count:" + this.enlistedTransactionCount);
               }
            } catch (SQLServerException var24) {
               var14 = new MessageFormat(SQLServerException.getErrString("R_failedToUnEnlist"));
               var15 = new Object[]{var24.getMessage()};
               SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var14.format(var15), (String)null, true);
            }
         }

         if(var1 == 6) {
            try {
               var10.bData = var11.getBytes(4);
            } catch (SQLServerException var23) {
               var14 = new MessageFormat(SQLServerException.getErrString("R_failedToReadRecoveryXIDs"));
               var15 = new Object[]{var23.getMessage()};
               SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, var14.format(var15), (String)null, true);
            }
         }
      } catch (SQLServerException var33) {
         if(this.xaLogger.isLoggable(Level.FINER)) {
            this.xaLogger.finer(this.toString() + " exception:" + var33);
         }

         XAException var13 = new XAException(var33.toString());
         var13.errorCode = -3;
         throw var13;
      }

      if(this.xaLogger.isLoggable(Level.FINER)) {
         this.xaLogger.finer(this.toString() + " Status:" + var35);
      }

      var10.nStatus = var35;
      return var10;
   }

   public void start(Xid var1, int var2) throws XAException {
      this.tightlyCoupled = var2 & '\u8000';
      this.DTC_XA_Interface(0, var1, var2);
   }

   public void end(Xid var1, int var2) throws XAException {
      this.DTC_XA_Interface(1, var1, var2 | this.tightlyCoupled);
   }

   public int prepare(Xid var1) throws XAException {
      boolean var2 = false;
      XAReturnValue var3 = this.DTC_XA_Interface(2, var1, this.tightlyCoupled);
      int var4 = var3.nStatus;
      return var4;
   }

   public void commit(Xid var1, boolean var2) throws XAException {
      this.DTC_XA_Interface(3, var1, (var2?1073741824:0) | this.tightlyCoupled);
   }

   public void rollback(Xid var1) throws XAException {
      this.DTC_XA_Interface(4, var1, this.tightlyCoupled);
   }

   public void forget(Xid var1) throws XAException {
      this.DTC_XA_Interface(5, var1, this.tightlyCoupled);
   }

   public Xid[] recover(int var1) throws XAException {
      XAReturnValue var2 = this.DTC_XA_Interface(6, (Xid)null, var1 | this.tightlyCoupled);
      int var3 = 0;
      Vector var4 = new Vector();
      if(null == var2.bData) {
         return new XidImpl[0];
      } else {
         int var6;
         while(var3 < var2.bData.length) {
            int var5 = 1;
            var6 = 0;

            int var7;
            int var8;
            for(var7 = 0; var7 < 4; ++var7) {
               var8 = var2.bData[var3 + var7] & 255;
               var8 *= var5;
               var6 += var8;
               var5 *= 256;
            }

            var3 += 4;
            var7 = var2.bData[var3++] & 255;
            var8 = var2.bData[var3++] & 255;
            byte[] var9 = new byte[var7];
            byte[] var10 = new byte[var8];
            System.arraycopy(var2.bData, var3, var9, 0, var7);
            var3 += var7;
            System.arraycopy(var2.bData, var3, var10, 0, var8);
            var3 += var8;
            XidImpl var11 = new XidImpl(var6, var9, var10);
            var4.add(var11);
         }

         XidImpl[] var12 = new XidImpl[var4.size()];

         for(var6 = 0; var6 < var4.size(); ++var6) {
            var12[var6] = (XidImpl)var4.elementAt(var6);
            if(this.xaLogger.isLoggable(Level.FINER)) {
               this.xaLogger.finer(this.toString() + var12[var6].toString());
            }
         }

         return var12;
      }
   }

   public boolean isSameRM(XAResource var1) throws XAException {
      if(this.xaLogger.isLoggable(Level.FINER)) {
         this.xaLogger.finer(this.toString() + " xares:" + var1);
      }

      if(!(var1 instanceof SQLServerXAResource)) {
         return false;
      } else {
         SQLServerXAResource var2 = (SQLServerXAResource)var1;
         return var2.sResourceManagerId.equals(this.sResourceManagerId);
      }
   }

   public boolean setTransactionTimeout(int var1) throws XAException {
      this.isTransacrionTimeoutSet = 1;
      this.timeoutSeconds = var1;
      if(this.xaLogger.isLoggable(Level.FINER)) {
         this.xaLogger.finer(this.toString() + " TransactionTimeout:" + var1);
      }

      return true;
   }

   public int getTransactionTimeout() throws XAException {
      return this.timeoutSeconds;
   }

   private static synchronized int nextResourceID() {
      ++baseResourceID;
      return baseResourceID;
   }

}
