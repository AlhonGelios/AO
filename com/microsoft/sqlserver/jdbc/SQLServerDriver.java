package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ApplicationIntent;
import com.microsoft.sqlserver.jdbc.AuthenticationScheme;
import com.microsoft.sqlserver.jdbc.DriverJDBCVersion;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerDriverBooleanProperty;
import com.microsoft.sqlserver.jdbc.SQLServerDriverIntProperty;
import com.microsoft.sqlserver.jdbc.SQLServerDriverPropertyInfo;
import com.microsoft.sqlserver.jdbc.SQLServerDriverStringProperty;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerPooledConnection;
import com.microsoft.sqlserver.jdbc.Util;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class SQLServerDriver implements Driver {

   static final String PRODUCT_NAME = "Microsoft JDBC Driver 4.2 for SQL Server";
   static final String DEFAULT_APP_NAME = "Microsoft JDBC Driver for SQL Server";
   private static final String[] TRUE_FALSE = new String[]{"true", "false"};
   private static final SQLServerDriverPropertyInfo[] DRIVER_PROPERTIES = new SQLServerDriverPropertyInfo[]{new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.APPLICATION_INTENT.toString(), SQLServerDriverStringProperty.APPLICATION_INTENT.getDefaultValue(), false, new String[]{ApplicationIntent.READ_ONLY.toString(), ApplicationIntent.READ_WRITE.toString()}), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.APPLICATION_NAME.toString(), SQLServerDriverStringProperty.APPLICATION_NAME.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.DATABASE_NAME.toString(), SQLServerDriverStringProperty.DATABASE_NAME.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.DISABLE_STATEMENT_POOLING.toString(), Boolean.toString(SQLServerDriverBooleanProperty.DISABLE_STATEMENT_POOLING.getDefaultValue()), false, new String[]{"true"}), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.ENCRYPT.toString(), Boolean.toString(SQLServerDriverBooleanProperty.ENCRYPT.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.FAILOVER_PARTNER.toString(), SQLServerDriverStringProperty.FAILOVER_PARTNER.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.HOSTNAME_IN_CERTIFICATE.toString(), SQLServerDriverStringProperty.HOSTNAME_IN_CERTIFICATE.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.INSTANCE_NAME.toString(), SQLServerDriverStringProperty.INSTANCE_NAME.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.INTEGRATED_SECURITY.toString(), Boolean.toString(SQLServerDriverBooleanProperty.INTEGRATED_SECURITY.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.LAST_UPDATE_COUNT.toString(), Boolean.toString(SQLServerDriverBooleanProperty.LAST_UPDATE_COUNT.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverIntProperty.LOCK_TIMEOUT.toString(), Integer.toString(SQLServerDriverIntProperty.LOCK_TIMEOUT.getDefaultValue()), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverIntProperty.LOGIN_TIMEOUT.toString(), Integer.toString(SQLServerDriverIntProperty.LOGIN_TIMEOUT.getDefaultValue()), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.MULTI_SUBNET_FAILOVER.toString(), Boolean.toString(SQLServerDriverBooleanProperty.MULTI_SUBNET_FAILOVER.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverIntProperty.PACKET_SIZE.toString(), Integer.toString(SQLServerDriverIntProperty.PACKET_SIZE.getDefaultValue()), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.PASSWORD.toString(), SQLServerDriverStringProperty.PASSWORD.getDefaultValue(), true, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverIntProperty.PORT_NUMBER.toString(), Integer.toString(SQLServerDriverIntProperty.PORT_NUMBER.getDefaultValue()), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.RESPONSE_BUFFERING.toString(), SQLServerDriverStringProperty.RESPONSE_BUFFERING.getDefaultValue(), false, new String[]{"adaptive", "full"}), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.SELECT_METHOD.toString(), SQLServerDriverStringProperty.SELECT_METHOD.getDefaultValue(), false, new String[]{"direct", "cursor"}), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.SEND_STRING_PARAMETERS_AS_UNICODE.toString(), Boolean.toString(SQLServerDriverBooleanProperty.SEND_STRING_PARAMETERS_AS_UNICODE.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.SERVER_NAME.toString(), SQLServerDriverStringProperty.SERVER_NAME.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.SERVER_SPN.toString(), SQLServerDriverStringProperty.SERVER_SPN.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.TRUST_SERVER_CERTIFICATE.toString(), Boolean.toString(SQLServerDriverBooleanProperty.TRUST_SERVER_CERTIFICATE.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.TRUST_STORE.toString(), SQLServerDriverStringProperty.TRUST_STORE.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.TRUST_STORE_PASSWORD.toString(), SQLServerDriverStringProperty.TRUST_STORE_PASSWORD.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.SEND_TIME_AS_DATETIME.toString(), Boolean.toString(SQLServerDriverBooleanProperty.SEND_TIME_AS_DATETIME.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.USER.toString(), SQLServerDriverStringProperty.USER.getDefaultValue(), true, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.WORKSTATION_ID.toString(), SQLServerDriverStringProperty.WORKSTATION_ID.getDefaultValue(), false, (String[])null), new SQLServerDriverPropertyInfo(SQLServerDriverBooleanProperty.XOPEN_STATES.toString(), Boolean.toString(SQLServerDriverBooleanProperty.XOPEN_STATES.getDefaultValue()), false, TRUE_FALSE), new SQLServerDriverPropertyInfo(SQLServerDriverStringProperty.AUTHENTICATION_SCHEME.toString(), SQLServerDriverStringProperty.AUTHENTICATION_SCHEME.getDefaultValue(), false, new String[]{AuthenticationScheme.javaKerberos.toString(), AuthenticationScheme.nativeAuthentication.toString()})};
   private static final String[][] driverPropertiesSynonyms = new String[][]{{"database", SQLServerDriverStringProperty.DATABASE_NAME.toString()}, {"userName", SQLServerDriverStringProperty.USER.toString()}, {"server", SQLServerDriverStringProperty.SERVER_NAME.toString()}, {"port", SQLServerDriverIntProperty.PORT_NUMBER.toString()}};
   private static int baseID = 0;
   private final int instanceID = nextInstanceID();
   private final String traceID;
   private static final Logger loggerExternal = Logger.getLogger("com.microsoft.sqlserver.jdbc.Driver");
   private final String loggingClassName;
   private static final Logger drLogger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.SQLServerDriver");


   private static synchronized int nextInstanceID() {
      ++baseID;
      return baseID;
   }

   public final String toString() {
      return this.traceID;
   }

   String getClassNameLogging() {
      return this.loggingClassName;
   }

   public SQLServerDriver() {
      this.traceID = "SQLServerDriver:" + this.instanceID;
      this.loggingClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver:" + this.instanceID;
   }

   static Properties fixupProperties(Properties var0) throws SQLServerException {
      Properties var1 = new Properties();
      Enumeration var2 = var0.keys();

      while(var2.hasMoreElements()) {
         String var3 = (String)var2.nextElement();
         String var4 = getNormalizedPropertyName(var3, drLogger);
         if(null != var4) {
            String var5 = var0.getProperty(var3);
            if(null == var5) {
               MessageFormat var6 = new MessageFormat(SQLServerException.getErrString("R_invalidpropertyValue"));
               Object[] var7 = new Object[]{var3};
               throw new SQLServerException((Object)null, var6.format(var7), (String)null, 0, false);
            }

            var1.setProperty(var4, var5);
         }
      }

      return var1;
   }

   static Properties mergeURLAndSuppliedProperties(Properties var0, Properties var1) throws SQLServerException {
      if(null == var1) {
         return var0;
      } else if(var1.isEmpty()) {
         return var0;
      } else {
         Properties var2 = fixupProperties(var1);

         for(int var3 = 0; var3 < DRIVER_PROPERTIES.length; ++var3) {
            String var4 = DRIVER_PROPERTIES[var3].getName();
            String var5 = var2.getProperty(var4);
            if(null != var5) {
               var0.put(var4, var5);
            }
         }

         return var0;
      }
   }

   static String getNormalizedPropertyName(String var0, Logger var1) {
      if(null == var0) {
         return var0;
      } else {
         int var2;
         for(var2 = 0; var2 < driverPropertiesSynonyms.length; ++var2) {
            if(driverPropertiesSynonyms[var2][0].equalsIgnoreCase(var0)) {
               return driverPropertiesSynonyms[var2][1];
            }
         }

         for(var2 = 0; var2 < DRIVER_PROPERTIES.length; ++var2) {
            if(DRIVER_PROPERTIES[var2].getName().equalsIgnoreCase(var0)) {
               return DRIVER_PROPERTIES[var2].getName();
            }
         }

         if(var1.isLoggable(Level.FINER)) {
            var1.finer("Unknown property" + var0);
         }

         return null;
      }
   }

   public Connection connect(String var1, Properties var2) throws SQLServerException {
      loggerExternal.entering(this.getClassNameLogging(), "connect", "Arguments not traced.");
      SQLServerConnection var3 = null;
      Properties var4 = this.parseAndMergeProperties(var1, var2);
      if(var4 != null) {
         var3 = new SQLServerConnection(this.toString());
         var3.connect(var4, (SQLServerPooledConnection)null);
      }

      loggerExternal.exiting(this.getClassNameLogging(), "connect", var3);
      return var3;
   }

   private final Properties parseAndMergeProperties(String var1, Properties var2) throws SQLServerException {
      if(var1 == null) {
         throw new SQLServerException((Object)null, SQLServerException.getErrString("R_nullConnection"), (String)null, 0, false);
      } else {
         Properties var3 = Util.parseUrl(var1, drLogger);
         if(var3 == null) {
            return null;
         } else {
            int var4 = DriverManager.getLoginTimeout();
            if(var4 > 0) {
               var3.put(SQLServerDriverIntProperty.LOGIN_TIMEOUT.toString(), (new Integer(var4)).toString());
            }

            var3 = mergeURLAndSuppliedProperties(var3, var2);
            return var3;
         }
      }
   }

   public boolean acceptsURL(String var1) throws SQLServerException {
      loggerExternal.entering(this.getClassNameLogging(), "acceptsURL", "Arguments not traced.");
      if(null == var1) {
         throw new SQLServerException((Object)null, SQLServerException.getErrString("R_nullConnection"), (String)null, 0, false);
      } else {
         boolean var2 = false;

         try {
            var2 = Util.parseUrl(var1, drLogger) != null;
         } catch (SQLServerException var4) {
            var2 = false;
         }

         loggerExternal.exiting(this.getClassNameLogging(), "acceptsURL", Boolean.valueOf(var2));
         return var2;
      }
   }

   public DriverPropertyInfo[] getPropertyInfo(String var1, Properties var2) throws SQLServerException {
      loggerExternal.entering(this.getClassNameLogging(), "getPropertyInfo", "Arguments not traced.");
      Properties var3 = this.parseAndMergeProperties(var1, var2);
      if(null == var3) {
         throw new SQLServerException((Object)null, SQLServerException.getErrString("R_invalidConnection"), (String)null, 0, false);
      } else {
         DriverPropertyInfo[] var4 = getPropertyInfoFromProperties(var3);
         loggerExternal.exiting(this.getClassNameLogging(), "getPropertyInfo");
         return var4;
      }
   }

   static final DriverPropertyInfo[] getPropertyInfoFromProperties(Properties var0) {
      DriverPropertyInfo[] var1 = new DriverPropertyInfo[DRIVER_PROPERTIES.length];

      for(int var2 = 0; var2 < DRIVER_PROPERTIES.length; ++var2) {
         var1[var2] = DRIVER_PROPERTIES[var2].build(var0);
      }

      return var1;
   }

   public int getMajorVersion() {
      loggerExternal.entering(this.getClassNameLogging(), "getMajorVersion");
      loggerExternal.exiting(this.getClassNameLogging(), "getMajorVersion", new Integer(4));
      return 4;
   }

   public int getMinorVersion() {
      loggerExternal.entering(this.getClassNameLogging(), "getMinorVersion");
      loggerExternal.exiting(this.getClassNameLogging(), "getMinorVersion", new Integer(2));
      return 2;
   }

   public Logger getParentLogger() throws SQLFeatureNotSupportedException {
      DriverJDBCVersion.checkSupportsJDBC41();
      throw new SQLFeatureNotSupportedException(SQLServerException.getErrString("R_notSupported"));
   }

   public boolean jdbcCompliant() {
      loggerExternal.entering(this.getClassNameLogging(), "jdbcCompliant");
      loggerExternal.exiting(this.getClassNameLogging(), "jdbcCompliant", Boolean.valueOf(true));
      return true;
   }

   static {
      try {
         DriverManager.registerDriver(new SQLServerDriver());
      } catch (SQLException var1) {
         var1.printStackTrace();
      }

   }
}
