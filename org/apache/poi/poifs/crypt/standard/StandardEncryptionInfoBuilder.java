package org.apache.poi.poifs.crypt.standard;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.standard.StandardDecryptor;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionHeader;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionVerifier;
import org.apache.poi.poifs.crypt.standard.StandardEncryptor;
import org.apache.poi.util.LittleEndianInput;

public class StandardEncryptionInfoBuilder implements EncryptionInfoBuilder {

   EncryptionInfo info;
   StandardEncryptionHeader header;
   StandardEncryptionVerifier verifier;
   StandardDecryptor decryptor;
   StandardEncryptor encryptor;


   public void initialize(EncryptionInfo info, LittleEndianInput dis) throws IOException {
      this.info = info;
      dis.readInt();
      this.header = new StandardEncryptionHeader(dis);
      this.verifier = new StandardEncryptionVerifier(dis, this.header);
      if(info.getVersionMinor() == 2 && (info.getVersionMajor() == 3 || info.getVersionMajor() == 4)) {
         this.decryptor = new StandardDecryptor(this);
      }

   }

   public void initialize(EncryptionInfo info, CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.info = info;
      if(cipherAlgorithm == null) {
         cipherAlgorithm = CipherAlgorithm.aes128;
      }

      if(cipherAlgorithm != CipherAlgorithm.aes128 && cipherAlgorithm != CipherAlgorithm.aes192 && cipherAlgorithm != CipherAlgorithm.aes256) {
         throw new EncryptedDocumentException("Standard encryption only supports AES128/192/256.");
      } else {
         if(hashAlgorithm == null) {
            hashAlgorithm = HashAlgorithm.sha1;
         }

         if(hashAlgorithm != HashAlgorithm.sha1) {
            throw new EncryptedDocumentException("Standard encryption only supports SHA-1.");
         } else {
            if(chainingMode == null) {
               chainingMode = ChainingMode.ecb;
            }

            if(chainingMode != ChainingMode.ecb) {
               throw new EncryptedDocumentException("Standard encryption only supports ECB chaining.");
            } else {
               if(keyBits == -1) {
                  keyBits = cipherAlgorithm.defaultKeySize;
               }

               if(blockSize == -1) {
                  blockSize = cipherAlgorithm.blockSize;
               }

               boolean found = false;
               int[] arr$ = cipherAlgorithm.allowedKeySize;
               int len$ = arr$.length;

               for(int i$ = 0; i$ < len$; ++i$) {
                  int ks = arr$[i$];
                  found |= ks == keyBits;
               }

               if(!found) {
                  throw new EncryptedDocumentException("KeySize " + keyBits + " not allowed for Cipher " + cipherAlgorithm.toString());
               } else {
                  this.header = new StandardEncryptionHeader(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
                  this.verifier = new StandardEncryptionVerifier(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
                  this.decryptor = new StandardDecryptor(this);
                  this.encryptor = new StandardEncryptor(this);
               }
            }
         }
      }
   }

   public StandardEncryptionHeader getHeader() {
      return this.header;
   }

   public StandardEncryptionVerifier getVerifier() {
      return this.verifier;
   }

   public StandardDecryptor getDecryptor() {
      return this.decryptor;
   }

   public StandardEncryptor getEncryptor() {
      return this.encryptor;
   }

   public EncryptionInfo getEncryptionInfo() {
      return this.info;
   }
}
