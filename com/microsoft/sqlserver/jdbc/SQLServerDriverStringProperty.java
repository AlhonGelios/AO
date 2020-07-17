package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ApplicationIntent;
import com.microsoft.sqlserver.jdbc.AuthenticationScheme;

enum SQLServerDriverStringProperty {

   APPLICATION_INTENT("APPLICATION_INTENT", 0, "applicationIntent", ApplicationIntent.READ_WRITE.toString()),
   APPLICATION_NAME("APPLICATION_NAME", 1, "applicationName", "Microsoft JDBC Driver for SQL Server"),
   DATABASE_NAME("DATABASE_NAME", 2, "databaseName", ""),
   FAILOVER_PARTNER("FAILOVER_PARTNER", 3, "failoverPartner", ""),
   HOSTNAME_IN_CERTIFICATE("HOSTNAME_IN_CERTIFICATE", 4, "hostNameInCertificate", ""),
   INSTANCE_NAME("INSTANCE_NAME", 5, "instanceName", ""),
   PASSWORD("PASSWORD", 6, "password", ""),
   RESPONSE_BUFFERING("RESPONSE_BUFFERING", 7, "responseBuffering", "adaptive"),
   SELECT_METHOD("SELECT_METHOD", 8, "selectMethod", "direct"),
   SERVER_NAME("SERVER_NAME", 9, "serverName", ""),
   SERVER_SPN("SERVER_SPN", 10, "serverSpn", ""),
   TRUST_STORE("TRUST_STORE", 11, "trustStore", ""),
   TRUST_STORE_PASSWORD("TRUST_STORE_PASSWORD", 12, "trustStorePassword", ""),
   USER("USER", 13, "user", ""),
   WORKSTATION_ID("WORKSTATION_ID", 14, "workstationID", ""),
   AUTHENTICATION_SCHEME("AUTHENTICATION_SCHEME", 15, "authenticationScheme", AuthenticationScheme.nativeAuthentication.toString());
   private String name;
   private String defaultValue;
   // $FF: synthetic field
   private static final SQLServerDriverStringProperty[] $VALUES = new SQLServerDriverStringProperty[]{APPLICATION_INTENT, APPLICATION_NAME, DATABASE_NAME, FAILOVER_PARTNER, HOSTNAME_IN_CERTIFICATE, INSTANCE_NAME, PASSWORD, RESPONSE_BUFFERING, SELECT_METHOD, SERVER_NAME, SERVER_SPN, TRUST_STORE, TRUST_STORE_PASSWORD, USER, WORKSTATION_ID, AUTHENTICATION_SCHEME};


   private SQLServerDriverStringProperty(String var1, int var2, String var3, String var4) {
      this.name = var3;
      this.defaultValue = var4;
   }

   String getDefaultValue() {
      return this.defaultValue;
   }

   public String toString() {
      return this.name;
   }

}
