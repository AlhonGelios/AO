package org.apache.poi.poifs.crypt.agile;

import com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity;
import com.microsoft.schemas.office.x2006.encryption.CTKeyData;
import com.microsoft.schemas.office.x2006.encryption.EncryptionDocument;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.EncryptionHeader;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionInfoBuilder;

public class AgileEncryptionHeader extends EncryptionHeader {

   private byte[] encryptedHmacKey;
   private byte[] encryptedHmacValue;


   public AgileEncryptionHeader(String descriptor) {
      this(AgileEncryptionInfoBuilder.parseDescriptor(descriptor));
   }

   protected AgileEncryptionHeader(EncryptionDocument ed) {
      CTKeyData keyData;
      try {
         keyData = ed.getEncryption().getKeyData();
         if(keyData == null) {
            throw new NullPointerException("keyData not set");
         }
      } catch (Exception var9) {
         throw new EncryptedDocumentException("Unable to parse keyData");
      }

      this.setKeySize((int)keyData.getKeyBits());
      this.setFlags(0);
      this.setSizeExtra(0);
      this.setCspName((String)null);
      this.setBlockSize(keyData.getBlockSize());
      int keyBits = (int)keyData.getKeyBits();
      CipherAlgorithm ca = CipherAlgorithm.fromXmlId(keyData.getCipherAlgorithm().toString(), keyBits);
      this.setCipherAlgorithm(ca);
      this.setCipherProvider(ca.provider);
      switch(keyData.getCipherChaining().intValue()) {
      case 1:
         this.setChainingMode(ChainingMode.cbc);
         break;
      case 2:
         this.setChainingMode(ChainingMode.cfb);
         break;
      default:
         throw new EncryptedDocumentException("Unsupported chaining mode - " + keyData.getCipherChaining().toString());
      }

      int hashSize = keyData.getHashSize();
      HashAlgorithm ha = HashAlgorithm.fromEcmaId(keyData.getHashAlgorithm().toString());
      this.setHashAlgorithm(ha);
      if(this.getHashAlgorithmEx().hashSize != hashSize) {
         throw new EncryptedDocumentException("Unsupported hash algorithm: " + keyData.getHashAlgorithm() + " @ " + hashSize + " bytes");
      } else {
         int saltLength = keyData.getSaltSize();
         this.setKeySalt(keyData.getSaltValue());
         if(this.getKeySalt().length != saltLength) {
            throw new EncryptedDocumentException("Invalid salt length");
         } else {
            CTDataIntegrity di = ed.getEncryption().getDataIntegrity();
            this.setEncryptedHmacKey(di.getEncryptedHmacKey());
            this.setEncryptedHmacValue(di.getEncryptedHmacValue());
         }
      }
   }

   public AgileEncryptionHeader(CipherAlgorithm algorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.setCipherAlgorithm(algorithm);
      this.setHashAlgorithm(hashAlgorithm);
      this.setKeySize(keyBits);
      this.setBlockSize(blockSize);
      this.setChainingMode(chainingMode);
   }

   protected void setKeySalt(byte[] salt) {
      if(salt != null && salt.length == this.getBlockSize()) {
         super.setKeySalt(salt);
      } else {
         throw new EncryptedDocumentException("invalid verifier salt");
      }
   }

   public byte[] getEncryptedHmacKey() {
      return this.encryptedHmacKey;
   }

   protected void setEncryptedHmacKey(byte[] encryptedHmacKey) {
      this.encryptedHmacKey = encryptedHmacKey == null?null:(byte[])encryptedHmacKey.clone();
   }

   public byte[] getEncryptedHmacValue() {
      return this.encryptedHmacValue;
   }

   protected void setEncryptedHmacValue(byte[] encryptedHmacValue) {
      this.encryptedHmacValue = encryptedHmacValue == null?null:(byte[])encryptedHmacValue.clone();
   }
}
