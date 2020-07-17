package com.microsoft.sqlserver.jdbc;


enum SQLServerDriverIntProperty {

   PACKET_SIZE("PACKET_SIZE", 0, "packetSize", 8000),
   LOCK_TIMEOUT("LOCK_TIMEOUT", 1, "lockTimeout", -1),
   LOGIN_TIMEOUT("LOGIN_TIMEOUT", 2, "loginTimeout", 15),
   PORT_NUMBER("PORT_NUMBER", 3, "portNumber", 1433);
   private String name;
   private int defaultValue;
   // $FF: synthetic field
   private static final SQLServerDriverIntProperty[] $VALUES = new SQLServerDriverIntProperty[]{PACKET_SIZE, LOCK_TIMEOUT, LOGIN_TIMEOUT, PORT_NUMBER};


   private SQLServerDriverIntProperty(String var1, int var2, String var3, int var4) {
      this.name = var3;
      this.defaultValue = var4;
   }

   int getDefaultValue() {
      return this.defaultValue;
   }

   public String toString() {
      return this.name;
   }

}
