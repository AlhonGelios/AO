package org.apache.poi.poifs.crypt;

import org.apache.poi.EncryptedDocumentException;

public enum HashAlgorithm {

   none("none", 0, "", 0, "", 0, "", false),
   sha1("sha1", 1, "SHA-1", '\u8004', "SHA1", 20, "HmacSHA1", false),
   sha256("sha256", 2, "SHA-256", '\u800c', "SHA256", 32, "HmacSHA256", false),
   sha384("sha384", 3, "SHA-384", '\u800d', "SHA384", 48, "HmacSHA384", false),
   sha512("sha512", 4, "SHA-512", '\u800e', "SHA512", 64, "HmacSHA512", false),
   md5("md5", 5, "MD5", -1, "MD5", 16, "HmacMD5", false),
   md2("md2", 6, "MD2", -1, "MD2", 16, "Hmac-MD2", true),
   md4("md4", 7, "MD4", -1, "MD4", 16, "Hmac-MD4", true),
   ripemd128("ripemd128", 8, "RipeMD128", -1, "RIPEMD-128", 16, "HMac-RipeMD128", true),
   ripemd160("ripemd160", 9, "RipeMD160", -1, "RIPEMD-160", 20, "HMac-RipeMD160", true),
   whirlpool("whirlpool", 10, "Whirlpool", -1, "WHIRLPOOL", 64, "HMac-Whirlpool", true),
   sha224("sha224", 11, "SHA-224", -1, "SHA224", 28, "HmacSHA224", true);
   public final String jceId;
   public final int ecmaId;
   public final String ecmaString;
   public final int hashSize;
   public final String jceHmacId;
   public final boolean needsBouncyCastle;
   // $FF: synthetic field
   private static final HashAlgorithm[] $VALUES = new HashAlgorithm[]{none, sha1, sha256, sha384, sha512, md5, md2, md4, ripemd128, ripemd160, whirlpool, sha224};


   private HashAlgorithm(String var1, int var2, String jceId, int ecmaId, String ecmaString, int hashSize, String jceHmacId, boolean needsBouncyCastle) {
      this.jceId = jceId;
      this.ecmaId = ecmaId;
      this.ecmaString = ecmaString;
      this.hashSize = hashSize;
      this.jceHmacId = jceHmacId;
      this.needsBouncyCastle = needsBouncyCastle;
   }

   public static HashAlgorithm fromEcmaId(int ecmaId) {
      HashAlgorithm[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         HashAlgorithm ha = arr$[i$];
         if(ha.ecmaId == ecmaId) {
            return ha;
         }
      }

      throw new EncryptedDocumentException("hash algorithm not found");
   }

   public static HashAlgorithm fromEcmaId(String ecmaString) {
      HashAlgorithm[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         HashAlgorithm ha = arr$[i$];
         if(ha.ecmaString.equals(ecmaString)) {
            return ha;
         }
      }

      throw new EncryptedDocumentException("hash algorithm not found");
   }

   public static HashAlgorithm fromString(String string) {
      HashAlgorithm[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         HashAlgorithm ha = arr$[i$];
         if(ha.ecmaString.equalsIgnoreCase(string) || ha.jceId.equalsIgnoreCase(string)) {
            return ha;
         }
      }

      throw new EncryptedDocumentException("hash algorithm not found");
   }

}
