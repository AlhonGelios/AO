package com.microsoft.sqlserver.jdbc;


enum SQLServerDriverBooleanProperty {

   DISABLE_STATEMENT_POOLING("DISABLE_STATEMENT_POOLING", 0, "disableStatementPooling", true),
   ENCRYPT("ENCRYPT", 1, "encrypt", false),
   INTEGRATED_SECURITY("INTEGRATED_SECURITY", 2, "integratedSecurity", false),
   LAST_UPDATE_COUNT("LAST_UPDATE_COUNT", 3, "lastUpdateCount", true),
   MULTI_SUBNET_FAILOVER("MULTI_SUBNET_FAILOVER", 4, "multiSubnetFailover", false),
   SEND_STRING_PARAMETERS_AS_UNICODE("SEND_STRING_PARAMETERS_AS_UNICODE", 5, "sendStringParametersAsUnicode", true),
   SEND_TIME_AS_DATETIME("SEND_TIME_AS_DATETIME", 6, "sendTimeAsDatetime", true),
   TRUST_SERVER_CERTIFICATE("TRUST_SERVER_CERTIFICATE", 7, "trustServerCertificate", false),
   XOPEN_STATES("XOPEN_STATES", 8, "xopenStates", false);
   private String name;
   private boolean defaultValue;
   // $FF: synthetic field
   private static final SQLServerDriverBooleanProperty[] $VALUES = new SQLServerDriverBooleanProperty[]{DISABLE_STATEMENT_POOLING, ENCRYPT, INTEGRATED_SECURITY, LAST_UPDATE_COUNT, MULTI_SUBNET_FAILOVER, SEND_STRING_PARAMETERS_AS_UNICODE, SEND_TIME_AS_DATETIME, TRUST_SERVER_CERTIFICATE, XOPEN_STATES};


   private SQLServerDriverBooleanProperty(String var1, int var2, String var3, boolean var4) {
      this.name = var3;
      this.defaultValue = var4;
   }

   boolean getDefaultValue() {
      return this.defaultValue;
   }

   public String toString() {
      return this.name;
   }

}
