package org.apache.poi.poifs.crypt;

import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.CipherProvider;
import org.apache.poi.poifs.crypt.HashAlgorithm;

public abstract class EncryptionHeader {

   public static final int ALGORITHM_RC4 = CipherAlgorithm.rc4.ecmaId;
   public static final int ALGORITHM_AES_128 = CipherAlgorithm.aes128.ecmaId;
   public static final int ALGORITHM_AES_192 = CipherAlgorithm.aes192.ecmaId;
   public static final int ALGORITHM_AES_256 = CipherAlgorithm.aes256.ecmaId;
   public static final int HASH_NONE = HashAlgorithm.none.ecmaId;
   public static final int HASH_SHA1 = HashAlgorithm.sha1.ecmaId;
   public static final int HASH_SHA256 = HashAlgorithm.sha256.ecmaId;
   public static final int HASH_SHA384 = HashAlgorithm.sha384.ecmaId;
   public static final int HASH_SHA512 = HashAlgorithm.sha512.ecmaId;
   public static final int PROVIDER_RC4 = CipherProvider.rc4.ecmaId;
   public static final int PROVIDER_AES = CipherProvider.aes.ecmaId;
   public static final int MODE_ECB = ChainingMode.ecb.ecmaId;
   public static final int MODE_CBC = ChainingMode.cbc.ecmaId;
   public static final int MODE_CFB = ChainingMode.cfb.ecmaId;
   private int flags;
   private int sizeExtra;
   private CipherAlgorithm cipherAlgorithm;
   private HashAlgorithm hashAlgorithm;
   private int keyBits;
   private int blockSize;
   private CipherProvider providerType;
   private ChainingMode chainingMode;
   private byte[] keySalt;
   private String cspName;


   public ChainingMode getChainingMode() {
      return this.chainingMode;
   }

   protected void setChainingMode(ChainingMode chainingMode) {
      this.chainingMode = chainingMode;
   }

   public int getFlags() {
      return this.flags;
   }

   protected void setFlags(int flags) {
      this.flags = flags;
   }

   public int getSizeExtra() {
      return this.sizeExtra;
   }

   protected void setSizeExtra(int sizeExtra) {
      this.sizeExtra = sizeExtra;
   }

   public CipherAlgorithm getCipherAlgorithm() {
      return this.cipherAlgorithm;
   }

   protected void setCipherAlgorithm(CipherAlgorithm cipherAlgorithm) {
      this.cipherAlgorithm = cipherAlgorithm;
   }

   public HashAlgorithm getHashAlgorithmEx() {
      return this.hashAlgorithm;
   }

   protected void setHashAlgorithm(HashAlgorithm hashAlgorithm) {
      this.hashAlgorithm = hashAlgorithm;
   }

   public int getKeySize() {
      return this.keyBits;
   }

   protected void setKeySize(int keyBits) {
      this.keyBits = keyBits;
   }

   public int getBlockSize() {
      return this.blockSize;
   }

   protected void setBlockSize(int blockSize) {
      this.blockSize = blockSize;
   }

   public byte[] getKeySalt() {
      return this.keySalt;
   }

   protected void setKeySalt(byte[] salt) {
      this.keySalt = salt == null?null:(byte[])salt.clone();
   }

   public CipherProvider getCipherProvider() {
      return this.providerType;
   }

   protected void setCipherProvider(CipherProvider providerType) {
      this.providerType = providerType;
   }

   public String getCspName() {
      return this.cspName;
   }

   protected void setCspName(String cspName) {
      this.cspName = cspName;
   }

}
