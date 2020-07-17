package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.text.MessageFormat;
import java.util.Locale;

enum AuthenticationScheme {

   nativeAuthentication("nativeAuthentication", 0),
   javaKerberos("javaKerberos", 1);
   // $FF: synthetic field
   private static final AuthenticationScheme[] $VALUES = new AuthenticationScheme[]{nativeAuthentication, javaKerberos};


   private AuthenticationScheme(String var1, int var2) {}

   static AuthenticationScheme valueOfString(String var0) throws SQLServerException {
      AuthenticationScheme var1;
      if(var0.toLowerCase(Locale.US).equalsIgnoreCase(javaKerberos.toString())) {
         var1 = javaKerberos;
      } else {
         if(!var0.toLowerCase(Locale.US).equalsIgnoreCase(nativeAuthentication.toString())) {
            MessageFormat var2 = new MessageFormat(SQLServerException.getErrString("R_invalidAuthenticationScheme"));
            Object[] var3 = new Object[]{var0};
            throw new SQLServerException((Object)null, var2.format(var3), (String)null, 0, false);
         }

         var1 = nativeAuthentication;
      }

      return var1;
   }

}
