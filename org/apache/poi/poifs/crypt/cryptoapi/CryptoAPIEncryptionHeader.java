package org.apache.poi.poifs.crypt.cryptoapi;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.CipherProvider;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionHeader;
import org.apache.poi.util.LittleEndianInput;

public class CryptoAPIEncryptionHeader extends StandardEncryptionHeader {

   public CryptoAPIEncryptionHeader(LittleEndianInput is) throws IOException {
      super(is);
   }

   protected CryptoAPIEncryptionHeader(CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      super(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
   }

   public void setKeySize(int keyBits) {
      boolean found = false;
      int[] arr$ = this.getCipherAlgorithm().allowedKeySize;
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         int size = arr$[i$];
         if(size == keyBits) {
            found = true;
            break;
         }
      }

      if(!found) {
         throw new EncryptedDocumentException("invalid keysize " + keyBits + " for cipher algorithm " + this.getCipherAlgorithm());
      } else {
         super.setKeySize(keyBits);
         if(keyBits > 40) {
            this.setCspName("Microsoft Enhanced Cryptographic Provider v1.0");
         } else {
            this.setCspName(CipherProvider.rc4.cipherProviderName);
         }

      }
   }
}
