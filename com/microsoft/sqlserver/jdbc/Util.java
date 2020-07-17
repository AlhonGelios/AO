package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.Encoding;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import com.microsoft.sqlserver.jdbc.SQLServerDriverIntProperty;
import com.microsoft.sqlserver.jdbc.SQLServerDriverStringProperty;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

final class Util {

   static final String SYSTEM_SPEC_VERSION = System.getProperty("java.specification.version");
   static final char[] hexChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   static final String WSIDNotAvailable = "";
   static final String ActivityIdTraceProperty = "com.microsoft.sqlserver.jdbc.traceactivity";
   static final String SYSTEM_JRE = System.getProperty("java.vendor") + " " + System.getProperty("java.version");


   static boolean isIBM() {
      return SYSTEM_JRE.startsWith("IBM");
   }

   static short readShort(byte[] var0, int var1) {
      return (short)(var0[var1] & 255 | (var0[var1 + 1] & 255) << 8);
   }

   static int readUnsignedShort(byte[] var0, int var1) {
      return var0[var1] & 255 | (var0[var1 + 1] & 255) << 8;
   }

   static int readUnsignedShortBigEndian(byte[] var0, int var1) {
      return (var0[var1] & 255) << 8 | var0[var1 + 1] & 255;
   }

   static void writeShort(short var0, byte[] var1, int var2) {
      var1[var2 + 0] = (byte)(var0 >> 0 & 255);
      var1[var2 + 1] = (byte)(var0 >> 8 & 255);
   }

   static void writeShortBigEndian(short var0, byte[] var1, int var2) {
      var1[var2 + 0] = (byte)(var0 >> 8 & 255);
      var1[var2 + 1] = (byte)(var0 >> 0 & 255);
   }

   static int readInt(byte[] var0, int var1) {
      int var2 = var0[var1 + 0] & 255;
      int var3 = (var0[var1 + 1] & 255) << 8;
      int var4 = (var0[var1 + 2] & 255) << 16;
      int var5 = (var0[var1 + 3] & 255) << 24;
      return var5 | var4 | var3 | var2;
   }

   static int readIntBigEndian(byte[] var0, int var1) {
      return (var0[var1 + 3] & 255) << 0 | (var0[var1 + 2] & 255) << 8 | (var0[var1 + 1] & 255) << 16 | (var0[var1 + 0] & 255) << 24;
   }

   static void writeInt(int var0, byte[] var1, int var2) {
      var1[var2 + 0] = (byte)(var0 >> 0 & 255);
      var1[var2 + 1] = (byte)(var0 >> 8 & 255);
      var1[var2 + 2] = (byte)(var0 >> 16 & 255);
      var1[var2 + 3] = (byte)(var0 >> 24 & 255);
   }

   static void writeIntBigEndian(int var0, byte[] var1, int var2) {
      var1[var2 + 0] = (byte)(var0 >> 24 & 255);
      var1[var2 + 1] = (byte)(var0 >> 16 & 255);
      var1[var2 + 2] = (byte)(var0 >> 8 & 255);
      var1[var2 + 3] = (byte)(var0 >> 0 & 255);
   }

   static void writeLongBigEndian(long var0, byte[] var2, int var3) {
      var2[var3 + 0] = (byte)((int)(var0 >> 56 & 255L));
      var2[var3 + 1] = (byte)((int)(var0 >> 48 & 255L));
      var2[var3 + 2] = (byte)((int)(var0 >> 40 & 255L));
      var2[var3 + 3] = (byte)((int)(var0 >> 32 & 255L));
      var2[var3 + 4] = (byte)((int)(var0 >> 24 & 255L));
      var2[var3 + 5] = (byte)((int)(var0 >> 16 & 255L));
      var2[var3 + 6] = (byte)((int)(var0 >> 8 & 255L));
      var2[var3 + 7] = (byte)((int)(var0 >> 0 & 255L));
   }

   static long readLong(byte[] var0, int var1) {
      long var2 = 0L;

      for(int var4 = 7; var4 > 0; --var4) {
         var2 += (long)(var0[var1 + var4] & 255);
         var2 <<= 8;
      }

      return var2 + (long)(var0[var1] & 255);
   }

   static Properties parseUrl(String var0, Logger var1) throws SQLServerException {
      Properties var2 = new Properties();
      String var4 = "jdbc:sqlserver://";
      String var5 = "";
      String var6 = "";
      String var7 = "";
      if(!var0.startsWith(var4)) {
         return null;
      } else {
         String var3 = var0.substring(var4.length());
         boolean var8 = false;
         byte var17 = 0;

         for(int var19 = 0; var19 < var3.length(); ++var19) {
            char var18 = var3.charAt(var19);
            switch(var17) {
            case 0:
               if(var18 == 59) {
                  var17 = 7;
               } else {
                  var5 = var5 + var18;
                  var17 = 1;
               }
               break;
            case 1:
               if(var18 != 59 && var18 != 58 && var18 != 92) {
                  var5 = var5 + var18;
               } else {
                  var5 = var5.trim();
                  if(var5.length() > 0) {
                     var2.put(SQLServerDriverStringProperty.SERVER_NAME.toString(), var5);
                     if(var1.isLoggable(Level.FINE)) {
                        var1.fine("Property:serverName Value:" + var5);
                     }
                  }

                  var5 = "";
                  if(var18 == 59) {
                     var17 = 7;
                  } else if(var18 == 58) {
                     var17 = 2;
                  } else {
                     var17 = 3;
                  }
               }
               break;
            case 2:
               if(var18 == 59) {
                  var5 = var5.trim();
                  if(var1.isLoggable(Level.FINE)) {
                     var1.fine("Property:portNumber Value:" + var5);
                  }

                  var2.put(SQLServerDriverIntProperty.PORT_NUMBER.toString(), var5);
                  var5 = "";
                  var17 = 7;
               } else {
                  var5 = var5 + var18;
               }
               break;
            case 3:
               if(var18 != 59 && var18 != 58) {
                  var5 = var5 + var18;
               } else {
                  var5 = var5.trim();
                  if(var1.isLoggable(Level.FINE)) {
                     var1.fine("Property:instanceName Value:" + var5);
                  }

                  var2.put(SQLServerDriverStringProperty.INSTANCE_NAME.toString(), var5.toLowerCase(Locale.US));
                  var5 = "";
                  if(var18 == 59) {
                     var17 = 7;
                  } else {
                     var17 = 2;
                  }
               }
               break;
            case 4:
               if(var18 == 125) {
                  var6 = SQLServerDriver.getNormalizedPropertyName(var6, var1);
                  if(null != var6) {
                     if(var1.isLoggable(Level.FINE) && !var6.equals(SQLServerDriverStringProperty.USER.toString()) && !var6.equals(SQLServerDriverStringProperty.PASSWORD.toString())) {
                        var1.fine("Property:" + var6 + " Value:" + var7);
                     }

                     var2.put(var6, var7);
                  }

                  var6 = "";
                  var7 = "";
                  var17 = 5;
               } else {
                  var7 = var7 + var18;
               }
               break;
            case 5:
               if(var18 == 59) {
                  var17 = 7;
               } else if(var18 != 32) {
                  SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_errorConnectionString"), (String)null, true);
               }
               break;
            case 6:
               if(var18 == 59) {
                  var7 = var7.trim();
                  var6 = SQLServerDriver.getNormalizedPropertyName(var6, var1);
                  if(null != var6) {
                     if(var1.isLoggable(Level.FINE) && !var6.equals(SQLServerDriverStringProperty.USER.toString()) && !var6.equals(SQLServerDriverStringProperty.PASSWORD.toString())) {
                        var1.fine("Property:" + var6 + " Value:" + var7);
                     }

                     var2.put(var6, var7);
                  }

                  var6 = "";
                  var7 = "";
                  var17 = 7;
               } else if(var18 == 123) {
                  var17 = 4;
                  var7 = var7.trim();
                  if(var7.length() > 0) {
                     SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_errorConnectionString"), (String)null, true);
                  }
               } else {
                  var7 = var7 + var18;
               }
               break;
            case 7:
               if(var18 == 61) {
                  var6 = var6.trim();
                  if(var6.length() <= 0) {
                     SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_errorConnectionString"), (String)null, true);
                  }

                  var17 = 6;
               } else if(var18 == 59) {
                  var6 = var6.trim();
                  if(var6.length() > 0) {
                     SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_errorConnectionString"), (String)null, true);
                  }
               } else {
                  var6 = var6 + var18;
               }
               break;
            default:
               assert false : "parseURL: Invalid state " + var17;
            }
         }

         switch(var17) {
         case 0:
         case 5:
            break;
         case 1:
            var5 = var5.trim();
            if(var5.length() > 0) {
               if(var1.isLoggable(Level.FINE)) {
                  var1.fine("Property:serverName Value:" + var5);
               }

               var2.put(SQLServerDriverStringProperty.SERVER_NAME.toString(), var5);
            }
            break;
         case 2:
            var5 = var5.trim();
            if(var1.isLoggable(Level.FINE)) {
               var1.fine("Property:portNumber Value:" + var5);
            }

            var2.put(SQLServerDriverIntProperty.PORT_NUMBER.toString(), var5);
            break;
         case 3:
            var5 = var5.trim();
            if(var1.isLoggable(Level.FINE)) {
               var1.fine("Property:instanceName Value:" + var5);
            }

            var2.put(SQLServerDriverStringProperty.INSTANCE_NAME.toString(), var5);
            break;
         case 4:
         default:
            SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_errorConnectionString"), (String)null, true);
            break;
         case 6:
            var7 = var7.trim();
            var6 = SQLServerDriver.getNormalizedPropertyName(var6, var1);
            if(null != var6) {
               if(var1.isLoggable(Level.FINE) && !var6.equals(SQLServerDriverStringProperty.USER.toString()) && !var6.equals(SQLServerDriverStringProperty.PASSWORD.toString())) {
                  var1.fine("Property:" + var6 + " Value:" + var7);
               }

               var2.put(var6, var7);
            }
            break;
         case 7:
            var6 = var6.trim();
            if(var6.length() > 0) {
               SQLServerException.makeFromDriverError((SQLServerConnection)null, (Object)null, SQLServerException.getErrString("R_errorConnectionString"), (String)null, true);
            }
         }

         return var2;
      }
   }

   static String escapeSQLId(String var0) {
      StringBuilder var2 = new StringBuilder(var0.length() + 2);
      var2.append('[');

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         char var1 = var0.charAt(var3);
         if(93 == var1) {
            var2.append("]]");
         } else {
            var2.append(var1);
         }
      }

      var2.append(']');
      return var2.toString();
   }

   static String readUnicodeString(byte[] var0, int var1, int var2, SQLServerConnection var3) throws SQLServerException {
      String var5;
      MessageFormat var6;
      Object[] var7;
      try {
         return new String(var0, var1, var2, Encoding.UNICODE.charsetName());
      } catch (UnsupportedEncodingException var8) {
         var5 = SQLServerException.checkAndAppendClientConnId(SQLServerException.getErrString("R_stringReadError"), var3);
         var6 = new MessageFormat(var5);
         var7 = new Object[]{new Integer(var1)};
         throw new SQLServerException((Object)null, var6.format(var7), (String)null, 0, true);
      } catch (IndexOutOfBoundsException var9) {
         var5 = SQLServerException.checkAndAppendClientConnId(SQLServerException.getErrString("R_stringReadError"), var3);
         var6 = new MessageFormat(var5);
         var7 = new Object[]{new Integer(var1)};
         throw new SQLServerException((Object)null, var6.format(var7), (String)null, 0, true);
      }
   }

   static String byteToHexDisplayString(byte[] var0) {
      if(null == var0) {
         return "(null)";
      } else {
         StringBuilder var2 = new StringBuilder(var0.length * 2 + 2);
         var2.append("0x");

         for(int var3 = 0; var3 < var0.length; ++var3) {
            int var1 = var0[var3] & 255;
            var2.append(hexChars[(var1 & 240) >> 4]);
            var2.append(hexChars[var1 & 15]);
         }

         return var2.toString();
      }
   }

   static String bytesToHexString(byte[] var0, int var1) {
      StringBuilder var2 = new StringBuilder(var1 * 2);

      for(int var3 = 0; var3 < var1; ++var3) {
         int var4 = var0[var3] & 255;
         var2.append(hexChars[(var4 & 240) >> 4]);
         var2.append(hexChars[var4 & 15]);
      }

      return var2.toString();
   }

   static String lookupHostName() {
      try {
         InetAddress var0 = InetAddress.getLocalHost();
         if(null != var0) {
            String var1 = var0.getHostName();
            if(null != var1 && var1.length() > 0) {
               return var1;
            }

            var1 = var0.getHostAddress();
            if(null != var1 && var1.length() > 0) {
               return var1;
            }
         }

         return "";
      } catch (UnknownHostException var2) {
         return "";
      }
   }

   static final byte[] asGuidByteArray(UUID var0) {
      long var1 = var0.getMostSignificantBits();
      long var3 = var0.getLeastSignificantBits();
      byte[] var5 = new byte[16];
      writeLongBigEndian(var1, var5, 0);
      writeLongBigEndian(var3, var5, 8);
      byte var6 = var5[0];
      var5[0] = var5[3];
      var5[3] = var6;
      var6 = var5[1];
      var5[1] = var5[2];
      var5[2] = var6;
      var6 = var5[4];
      var5[4] = var5[5];
      var5[5] = var6;
      var6 = var5[6];
      var5[6] = var5[7];
      var5[7] = var6;
      return var5;
   }

   static boolean IsActivityTraceOn() {
      LogManager var0 = LogManager.getLogManager();
      String var1 = var0.getProperty("com.microsoft.sqlserver.jdbc.traceactivity");
      return null != var1 && var1.equalsIgnoreCase("on");
   }

}
