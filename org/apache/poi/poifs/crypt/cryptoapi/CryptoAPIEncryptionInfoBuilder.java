package org.apache.poi.poifs.crypt.cryptoapi;

import java.io.IOException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIDecryptor;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionHeader;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionVerifier;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptor;
import org.apache.poi.util.LittleEndianInput;

public class CryptoAPIEncryptionInfoBuilder implements EncryptionInfoBuilder {

   EncryptionInfo info;
   CryptoAPIEncryptionHeader header;
   CryptoAPIEncryptionVerifier verifier;
   CryptoAPIDecryptor decryptor;
   CryptoAPIEncryptor encryptor;


   public void initialize(EncryptionInfo info, LittleEndianInput dis) throws IOException {
      this.info = info;
      dis.readInt();
      this.header = new CryptoAPIEncryptionHeader(dis);
      this.verifier = new CryptoAPIEncryptionVerifier(dis, this.header);
      this.decryptor = new CryptoAPIDecryptor(this);
      this.encryptor = new CryptoAPIEncryptor(this);
   }

   public void initialize(EncryptionInfo info, CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.info = info;
      if(cipherAlgorithm == null) {
         cipherAlgorithm = CipherAlgorithm.rc4;
      }

      if(hashAlgorithm == null) {
         hashAlgorithm = HashAlgorithm.sha1;
      }

      if(keyBits == -1) {
         keyBits = 40;
      }

      assert cipherAlgorithm == CipherAlgorithm.rc4 && hashAlgorithm == HashAlgorithm.sha1;

      this.header = new CryptoAPIEncryptionHeader(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
      this.verifier = new CryptoAPIEncryptionVerifier(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
      this.decryptor = new CryptoAPIDecryptor(this);
      this.encryptor = new CryptoAPIEncryptor(this);
   }

   public CryptoAPIEncryptionHeader getHeader() {
      return this.header;
   }

   public CryptoAPIEncryptionVerifier getVerifier() {
      return this.verifier;
   }

   public CryptoAPIDecryptor getDecryptor() {
      return this.decryptor;
   }

   public CryptoAPIEncryptor getEncryptor() {
      return this.encryptor;
   }

   public EncryptionInfo getEncryptionInfo() {
      return this.info;
   }

}
