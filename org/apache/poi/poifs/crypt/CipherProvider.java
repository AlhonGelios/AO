package org.apache.poi.poifs.crypt;

import org.apache.poi.EncryptedDocumentException;

public enum CipherProvider {

   rc4("rc4", 0, "RC4", 1, "Microsoft Base Cryptographic Provider v1.0"),
   aes("aes", 1, "AES", 24, "Microsoft Enhanced RSA and AES Cryptographic Provider");
   public final String jceId;
   public final int ecmaId;
   public final String cipherProviderName;
   // $FF: synthetic field
   private static final CipherProvider[] $VALUES = new CipherProvider[]{rc4, aes};


   public static CipherProvider fromEcmaId(int ecmaId) {
      CipherProvider[] arr$ = values();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CipherProvider cp = arr$[i$];
         if(cp.ecmaId == ecmaId) {
            return cp;
         }
      }

      throw new EncryptedDocumentException("cipher provider not found");
   }

   private CipherProvider(String var1, int var2, String jceId, int ecmaId, String cipherProviderName) {
      this.jceId = jceId;
      this.ecmaId = ecmaId;
      this.cipherProviderName = cipherProviderName;
   }

}
