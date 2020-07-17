package org.apache.xmlbeans.impl.util;


public final class Base64 {

   private static final int BASELENGTH = 255;
   private static final int LOOKUPLENGTH = 64;
   private static final int TWENTYFOURBITGROUP = 24;
   private static final int EIGHTBIT = 8;
   private static final int SIXTEENBIT = 16;
   private static final int FOURBYTE = 4;
   private static final int SIGN = -128;
   private static final byte PAD = 61;
   private static final boolean fDebug = false;
   private static byte[] base64Alphabet = new byte[255];
   private static byte[] lookUpBase64Alphabet = new byte[64];


   protected static boolean isWhiteSpace(byte octect) {
      return octect == 32 || octect == 13 || octect == 10 || octect == 9;
   }

   protected static boolean isPad(byte octect) {
      return octect == 61;
   }

   protected static boolean isData(byte octect) {
      return base64Alphabet[octect] != -1;
   }

   protected static boolean isBase64(byte octect) {
      return isWhiteSpace(octect) || isPad(octect) || isData(octect);
   }

   public static byte[] encode(byte[] binaryData) {
      if(binaryData == null) {
         return null;
      } else {
         int lengthDataBits = binaryData.length * 8;
         int fewerThan24bits = lengthDataBits % 24;
         int numberTriplets = lengthDataBits / 24;
         Object encodedData = null;
         byte[] var16;
         if(fewerThan24bits != 0) {
            var16 = new byte[(numberTriplets + 1) * 4];
         } else {
            var16 = new byte[numberTriplets * 4];
         }

         boolean k = false;
         boolean l = false;
         boolean b1 = false;
         boolean b2 = false;
         boolean b3 = false;
         boolean encodedIndex = false;
         boolean dataIndex = false;
         boolean i = false;

         byte val1;
         byte val2;
         byte var17;
         byte var18;
         byte var19;
         byte var20;
         int var22;
         int var23;
         int var24;
         for(var24 = 0; var24 < numberTriplets; ++var24) {
            var23 = var24 * 3;
            var19 = binaryData[var23];
            var20 = binaryData[var23 + 1];
            byte var21 = binaryData[var23 + 2];
            var18 = (byte)(var20 & 15);
            var17 = (byte)(var19 & 3);
            var22 = var24 * 4;
            val1 = (var19 & -128) == 0?(byte)(var19 >> 2):(byte)(var19 >> 2 ^ 192);
            val2 = (var20 & -128) == 0?(byte)(var20 >> 4):(byte)(var20 >> 4 ^ 240);
            byte val3 = (var21 & -128) == 0?(byte)(var21 >> 6):(byte)(var21 >> 6 ^ 252);
            var16[var22] = lookUpBase64Alphabet[val1];
            var16[var22 + 1] = lookUpBase64Alphabet[val2 | var17 << 4];
            var16[var22 + 2] = lookUpBase64Alphabet[var18 << 2 | val3];
            var16[var22 + 3] = lookUpBase64Alphabet[var21 & 63];
         }

         var23 = var24 * 3;
         var22 = var24 * 4;
         if(fewerThan24bits == 8) {
            var19 = binaryData[var23];
            var17 = (byte)(var19 & 3);
            val1 = (var19 & -128) == 0?(byte)(var19 >> 2):(byte)(var19 >> 2 ^ 192);
            var16[var22] = lookUpBase64Alphabet[val1];
            var16[var22 + 1] = lookUpBase64Alphabet[var17 << 4];
            var16[var22 + 2] = 61;
            var16[var22 + 3] = 61;
         } else if(fewerThan24bits == 16) {
            var19 = binaryData[var23];
            var20 = binaryData[var23 + 1];
            var18 = (byte)(var20 & 15);
            var17 = (byte)(var19 & 3);
            val1 = (var19 & -128) == 0?(byte)(var19 >> 2):(byte)(var19 >> 2 ^ 192);
            val2 = (var20 & -128) == 0?(byte)(var20 >> 4):(byte)(var20 >> 4 ^ 240);
            var16[var22] = lookUpBase64Alphabet[val1];
            var16[var22 + 1] = lookUpBase64Alphabet[val2 | var17 << 4];
            var16[var22 + 2] = lookUpBase64Alphabet[var18 << 2];
            var16[var22 + 3] = 61;
         }

         return var16;
      }
   }

   public static byte[] decode(byte[] base64Data) {
      if(base64Data == null) {
         return null;
      } else {
         base64Data = removeWhiteSpace(base64Data);
         if(base64Data.length % 4 != 0) {
            return null;
         } else {
            int numberQuadruple = base64Data.length / 4;
            if(numberQuadruple == 0) {
               return new byte[0];
            } else {
               Object decodedData = null;
               boolean b1 = false;
               boolean b2 = false;
               boolean b3 = false;
               boolean b4 = false;
               boolean d1 = false;
               boolean d2 = false;
               boolean d3 = false;
               boolean d4 = false;
               int i = 0;
               int encodedIndex = 0;
               int dataIndex = 0;

               byte[] var15;
               byte var16;
               byte var17;
               byte var18;
               byte var19;
               byte var20;
               byte var21;
               byte var22;
               byte var23;
               for(var15 = new byte[numberQuadruple * 3]; i < numberQuadruple - 1; ++i) {
                  if(!isData(var20 = base64Data[dataIndex++]) || !isData(var21 = base64Data[dataIndex++]) || !isData(var22 = base64Data[dataIndex++]) || !isData(var23 = base64Data[dataIndex++])) {
                     return null;
                  }

                  var16 = base64Alphabet[var20];
                  var17 = base64Alphabet[var21];
                  var18 = base64Alphabet[var22];
                  var19 = base64Alphabet[var23];
                  var15[encodedIndex++] = (byte)(var16 << 2 | var17 >> 4);
                  var15[encodedIndex++] = (byte)((var17 & 15) << 4 | var18 >> 2 & 15);
                  var15[encodedIndex++] = (byte)(var18 << 6 | var19);
               }

               if(isData(var20 = base64Data[dataIndex++]) && isData(var21 = base64Data[dataIndex++])) {
                  var16 = base64Alphabet[var20];
                  var17 = base64Alphabet[var21];
                  var22 = base64Data[dataIndex++];
                  var23 = base64Data[dataIndex++];
                  if(isData(var22) && isData(var23)) {
                     var18 = base64Alphabet[var22];
                     var19 = base64Alphabet[var23];
                     var15[encodedIndex++] = (byte)(var16 << 2 | var17 >> 4);
                     var15[encodedIndex++] = (byte)((var17 & 15) << 4 | var18 >> 2 & 15);
                     var15[encodedIndex++] = (byte)(var18 << 6 | var19);
                     return var15;
                  } else {
                     byte[] tmp;
                     if(isPad(var22) && isPad(var23)) {
                        if((var17 & 15) != 0) {
                           return null;
                        } else {
                           tmp = new byte[i * 3 + 1];
                           System.arraycopy(var15, 0, tmp, 0, i * 3);
                           tmp[encodedIndex] = (byte)(var16 << 2 | var17 >> 4);
                           return tmp;
                        }
                     } else if(!isPad(var22) && isPad(var23)) {
                        var18 = base64Alphabet[var22];
                        if((var18 & 3) != 0) {
                           return null;
                        } else {
                           tmp = new byte[i * 3 + 2];
                           System.arraycopy(var15, 0, tmp, 0, i * 3);
                           tmp[encodedIndex++] = (byte)(var16 << 2 | var17 >> 4);
                           tmp[encodedIndex] = (byte)((var17 & 15) << 4 | var18 >> 2 & 15);
                           return tmp;
                        }
                     } else {
                        return null;
                     }
                  }
               } else {
                  return null;
               }
            }
         }
      }
   }

   protected static byte[] removeWhiteSpace(byte[] data) {
      if(data == null) {
         return null;
      } else {
         int newSize = 0;
         int len = data.length;

         for(int newArray = 0; newArray < len; ++newArray) {
            if(!isWhiteSpace(data[newArray])) {
               ++newSize;
            }
         }

         if(newSize == len) {
            return data;
         } else {
            byte[] var6 = new byte[newSize];
            int j = 0;

            for(int i = 0; i < len; ++i) {
               if(!isWhiteSpace(data[i])) {
                  var6[j++] = data[i];
               }
            }

            return var6;
         }
      }
   }

   static {
      int i;
      for(i = 0; i < 255; ++i) {
         base64Alphabet[i] = -1;
      }

      for(i = 90; i >= 65; --i) {
         base64Alphabet[i] = (byte)(i - 65);
      }

      for(i = 122; i >= 97; --i) {
         base64Alphabet[i] = (byte)(i - 97 + 26);
      }

      for(i = 57; i >= 48; --i) {
         base64Alphabet[i] = (byte)(i - 48 + 52);
      }

      base64Alphabet[43] = 62;
      base64Alphabet[47] = 63;

      for(i = 0; i <= 25; ++i) {
         lookUpBase64Alphabet[i] = (byte)(65 + i);
      }

      i = 26;

      int j;
      for(j = 0; i <= 51; ++j) {
         lookUpBase64Alphabet[i] = (byte)(97 + j);
         ++i;
      }

      i = 52;

      for(j = 0; i <= 61; ++j) {
         lookUpBase64Alphabet[i] = (byte)(48 + j);
         ++i;
      }

      lookUpBase64Alphabet[62] = 43;
      lookUpBase64Alphabet[63] = 47;
   }
}
