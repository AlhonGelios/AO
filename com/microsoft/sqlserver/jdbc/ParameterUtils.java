package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;

final class ParameterUtils {

   static byte[] HexToBin(String var0) throws SQLServerException {
      int var1 = var0.length();
      char[] var2 = var0.toCharArray();
      if(var1 % 2 != 0) {
         SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_stringNotInHex"), (String)null, false);
      }

      byte[] var3 = new byte[var1 / 2];

      for(int var4 = 0; var4 < var1 / 2; ++var4) {
         var3[var4] = (byte)((CharToHex(var2[2 * var4]) << 4) + CharToHex(var2[2 * var4 + 1]));
      }

      return var3;
   }

   static byte CharToHex(char var0) throws SQLServerException {
      byte var1 = 0;
      if(var0 >= 65 && var0 <= 70) {
         var1 = (byte)(var0 - 65 + 10);
      } else if(var0 >= 97 && var0 <= 102) {
         var1 = (byte)(var0 - 97 + 10);
      } else if(var0 >= 48 && var0 <= 57) {
         var1 = (byte)(var0 - 48);
      } else {
         SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_stringNotInHex"), (String)null, false);
      }

      return var1;
   }

   static int scanSQLForChar(char var0, String var1, int var2) {
      int var5 = var1.length();

      label67:
      while(var2 < var5) {
         char var4;
         switch(var4 = var1.charAt(var2++)) {
         case 47:
            if(var2 == var5) {
               break;
            }

            if(var1.charAt(var2) == 42) {
               do {
                  ++var2;
                  if(var2 >= var5) {
                     continue label67;
                  }
               } while(var1.charAt(var2) != 42 || var2 + 1 >= var5 || var1.charAt(var2 + 1) != 47);

               var2 += 2;
               break;
            } else if(var1.charAt(var2) == 45) {
               break;
            }
         case 45:
            if(var1.charAt(var2) == 45) {
               do {
                  ++var2;
                  if(var2 >= var5) {
                     continue label67;
                  }
               } while(var1.charAt(var2) != 10 && var1.charAt(var2) != 13);

               ++var2;
               break;
            }
         case 91:
            var4 = 93;
         case 34:
         case 39:
            char var3 = var4;

            while(true) {
               if(var2 >= var5) {
                  continue label67;
               }

               if(var1.charAt(var2++) == var3) {
                  if(var5 == var2 || var1.charAt(var2) != var3) {
                     continue label67;
                  }

                  ++var2;
               }
            }
         default:
            if(var0 == var4) {
               return var2 - 1;
            }
         }
      }

      return var5;
   }
}
