package org.apache.poi.poifs.crypt;

import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.HashAlgorithm;

public abstract class EncryptionVerifier {

   private byte[] salt;
   private byte[] encryptedVerifier;
   private byte[] encryptedVerifierHash;
   private byte[] encryptedKey;
   private int spinCount;
   private CipherAlgorithm cipherAlgorithm;
   private ChainingMode chainingMode;
   private HashAlgorithm hashAlgorithm;


   public byte[] getSalt() {
      return this.salt;
   }

   public byte[] getEncryptedVerifier() {
      return this.encryptedVerifier;
   }

   public byte[] getEncryptedVerifierHash() {
      return this.encryptedVerifierHash;
   }

   public int getSpinCount() {
      return this.spinCount;
   }

   public int getCipherMode() {
      return this.chainingMode.ecmaId;
   }

   public int getAlgorithm() {
      return this.cipherAlgorithm.ecmaId;
   }

   public byte[] getEncryptedKey() {
      return this.encryptedKey;
   }

   public CipherAlgorithm getCipherAlgorithm() {
      return this.cipherAlgorithm;
   }

   public HashAlgorithm getHashAlgorithm() {
      return this.hashAlgorithm;
   }

   public ChainingMode getChainingMode() {
      return this.chainingMode;
   }

   protected void setSalt(byte[] salt) {
      this.salt = salt == null?null:(byte[])salt.clone();
   }

   protected void setEncryptedVerifier(byte[] encryptedVerifier) {
      this.encryptedVerifier = encryptedVerifier == null?null:(byte[])encryptedVerifier.clone();
   }

   protected void setEncryptedVerifierHash(byte[] encryptedVerifierHash) {
      this.encryptedVerifierHash = encryptedVerifierHash == null?null:(byte[])encryptedVerifierHash.clone();
   }

   protected void setEncryptedKey(byte[] encryptedKey) {
      this.encryptedKey = encryptedKey == null?null:(byte[])encryptedKey.clone();
   }

   protected void setSpinCount(int spinCount) {
      this.spinCount = spinCount;
   }

   protected void setCipherAlgorithm(CipherAlgorithm cipherAlgorithm) {
      this.cipherAlgorithm = cipherAlgorithm;
   }

   protected void setChainingMode(ChainingMode chainingMode) {
      this.chainingMode = chainingMode;
   }

   protected void setHashAlgorithm(HashAlgorithm hashAlgorithm) {
      this.hashAlgorithm = hashAlgorithm;
   }
}
