package org.apache.poi.poifs.crypt.agile;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChunkedCipherInputStream;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionHeader;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.EncryptionVerifier;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionHeader;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionVerifier;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.util.LittleEndian;

public class AgileDecryptor extends Decryptor {

   private long _length = -1L;
   protected static final byte[] kVerifierInputBlock = new byte[]{(byte)-2, (byte)-89, (byte)-46, (byte)118, (byte)59, (byte)75, (byte)-98, (byte)121};
   protected static final byte[] kHashedVerifierBlock = new byte[]{(byte)-41, (byte)-86, (byte)15, (byte)109, (byte)48, (byte)97, (byte)52, (byte)78};
   protected static final byte[] kCryptoKeyBlock = new byte[]{(byte)20, (byte)110, (byte)11, (byte)-25, (byte)-85, (byte)-84, (byte)-48, (byte)-42};
   protected static final byte[] kIntegrityKeyBlock = new byte[]{(byte)95, (byte)-78, (byte)-83, (byte)1, (byte)12, (byte)-71, (byte)-31, (byte)-10};
   protected static final byte[] kIntegrityValueBlock = new byte[]{(byte)-96, (byte)103, (byte)127, (byte)2, (byte)-78, (byte)44, (byte)-124, (byte)51};


   protected AgileDecryptor(AgileEncryptionInfoBuilder builder) {
      super(builder);
   }

   public boolean verifyPassword(String password) throws GeneralSecurityException {
      AgileEncryptionVerifier ver = (AgileEncryptionVerifier)this.builder.getVerifier();
      AgileEncryptionHeader header = (AgileEncryptionHeader)this.builder.getHeader();
      HashAlgorithm hashAlgo = header.getHashAlgorithmEx();
      CipherAlgorithm cipherAlgo = header.getCipherAlgorithm();
      int blockSize = header.getBlockSize();
      int keySize = header.getKeySize() / 8;
      byte[] pwHash = CryptoFunctions.hashPassword(password, ver.getHashAlgorithm(), ver.getSalt(), ver.getSpinCount());
      byte[] verfierInputEnc = hashInput(this.builder, pwHash, kVerifierInputBlock, ver.getEncryptedVerifier(), 2);
      this.setVerifier(verfierInputEnc);
      MessageDigest hashMD = CryptoFunctions.getMessageDigest(hashAlgo);
      byte[] verifierHash = hashMD.digest(verfierInputEnc);
      byte[] verifierHashDec = hashInput(this.builder, pwHash, kHashedVerifierBlock, ver.getEncryptedVerifierHash(), 2);
      verifierHashDec = CryptoFunctions.getBlock0(verifierHashDec, hashAlgo.hashSize);
      byte[] keyspec = hashInput(this.builder, pwHash, kCryptoKeyBlock, ver.getEncryptedKey(), 2);
      keyspec = CryptoFunctions.getBlock0(keyspec, keySize);
      SecretKeySpec secretKey = new SecretKeySpec(keyspec, ver.getCipherAlgorithm().jceId);
      byte[] vec = CryptoFunctions.generateIv(hashAlgo, header.getKeySalt(), kIntegrityKeyBlock, blockSize);
      Cipher cipher = CryptoFunctions.getCipher(secretKey, cipherAlgo, ver.getChainingMode(), vec, 2);
      byte[] hmacKey = cipher.doFinal(header.getEncryptedHmacKey());
      hmacKey = CryptoFunctions.getBlock0(hmacKey, hashAlgo.hashSize);
      vec = CryptoFunctions.generateIv(hashAlgo, header.getKeySalt(), kIntegrityValueBlock, blockSize);
      cipher = CryptoFunctions.getCipher(secretKey, cipherAlgo, ver.getChainingMode(), vec, 2);
      byte[] hmacValue = cipher.doFinal(header.getEncryptedHmacValue());
      hmacValue = CryptoFunctions.getBlock0(hmacValue, hashAlgo.hashSize);
      if(Arrays.equals(verifierHashDec, verifierHash)) {
         this.setSecretKey(secretKey);
         this.setIntegrityHmacKey(hmacKey);
         this.setIntegrityHmacValue(hmacValue);
         return true;
      } else {
         return false;
      }
   }

   public boolean verifyPassword(KeyPair keyPair, X509Certificate x509) throws GeneralSecurityException {
      AgileEncryptionVerifier ver = (AgileEncryptionVerifier)this.builder.getVerifier();
      AgileEncryptionHeader header = (AgileEncryptionHeader)this.builder.getHeader();
      HashAlgorithm hashAlgo = header.getHashAlgorithmEx();
      CipherAlgorithm cipherAlgo = header.getCipherAlgorithm();
      int blockSize = header.getBlockSize();
      AgileEncryptionVerifier.AgileCertificateEntry ace = null;
      Iterator cipher = ver.getCertificates().iterator();

      while(cipher.hasNext()) {
         AgileEncryptionVerifier.AgileCertificateEntry keyspec = (AgileEncryptionVerifier.AgileCertificateEntry)cipher.next();
         if(x509.equals(keyspec.x509)) {
            ace = keyspec;
            break;
         }
      }

      if(ace == null) {
         return false;
      } else {
         Cipher cipher1 = Cipher.getInstance("RSA");
         cipher1.init(2, keyPair.getPrivate());
         byte[] keyspec1 = cipher1.doFinal(ace.encryptedKey);
         SecretKeySpec secretKey = new SecretKeySpec(keyspec1, ver.getCipherAlgorithm().jceId);
         Mac x509Hmac = CryptoFunctions.getMac(hashAlgo);
         x509Hmac.init(secretKey);
         byte[] certVerifier = x509Hmac.doFinal(ace.x509.getEncoded());
         byte[] vec = CryptoFunctions.generateIv(hashAlgo, header.getKeySalt(), kIntegrityKeyBlock, blockSize);
         cipher1 = CryptoFunctions.getCipher(secretKey, cipherAlgo, ver.getChainingMode(), vec, 2);
         byte[] hmacKey = cipher1.doFinal(header.getEncryptedHmacKey());
         hmacKey = CryptoFunctions.getBlock0(hmacKey, hashAlgo.hashSize);
         vec = CryptoFunctions.generateIv(hashAlgo, header.getKeySalt(), kIntegrityValueBlock, blockSize);
         cipher1 = CryptoFunctions.getCipher(secretKey, cipherAlgo, ver.getChainingMode(), vec, 2);
         byte[] hmacValue = cipher1.doFinal(header.getEncryptedHmacValue());
         hmacValue = CryptoFunctions.getBlock0(hmacValue, hashAlgo.hashSize);
         if(Arrays.equals(ace.certVerifier, certVerifier)) {
            this.setSecretKey(secretKey);
            this.setIntegrityHmacKey(hmacKey);
            this.setIntegrityHmacValue(hmacValue);
            return true;
         } else {
            return false;
         }
      }
   }

   protected static int getNextBlockSize(int inputLen, int blockSize) {
      int fillSize;
      for(fillSize = blockSize; fillSize < inputLen; fillSize += blockSize) {
         ;
      }

      return fillSize;
   }

   protected static byte[] hashInput(EncryptionInfoBuilder builder, byte[] pwHash, byte[] blockKey, byte[] inputKey, int cipherMode) {
      EncryptionVerifier ver = builder.getVerifier();
      AgileDecryptor dec = (AgileDecryptor)builder.getDecryptor();
      int keySize = dec.getKeySizeInBytes();
      int blockSize = dec.getBlockSizeInBytes();
      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      byte[] salt = ver.getSalt();
      byte[] intermedKey = CryptoFunctions.generateKey(pwHash, hashAlgo, blockKey, keySize);
      SecretKeySpec skey = new SecretKeySpec(intermedKey, ver.getCipherAlgorithm().jceId);
      byte[] iv = CryptoFunctions.generateIv(hashAlgo, salt, (byte[])null, blockSize);
      Cipher cipher = CryptoFunctions.getCipher(skey, ver.getCipherAlgorithm(), ver.getChainingMode(), iv, cipherMode);

      try {
         inputKey = CryptoFunctions.getBlock0(inputKey, getNextBlockSize(inputKey.length, blockSize));
         byte[] hashFinal = cipher.doFinal(inputKey);
         return hashFinal;
      } catch (GeneralSecurityException var17) {
         throw new EncryptedDocumentException(var17);
      }
   }

   public InputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      DocumentInputStream dis = dir.createDocumentInputStream("EncryptedPackage");
      this._length = dis.readLong();
      return new AgileDecryptor.AgileCipherInputStream(dis, this._length);
   }

   public long getLength() {
      if(this._length == -1L) {
         throw new IllegalStateException("EcmaDecryptor.getDataStream() was not called");
      } else {
         return this._length;
      }
   }

   protected static Cipher initCipherForBlock(Cipher existing, int block, boolean lastChunk, EncryptionInfoBuilder builder, SecretKey skey, int encryptionMode) throws GeneralSecurityException {
      EncryptionHeader header = builder.getHeader();
      if(existing == null || lastChunk) {
         String blockKey = lastChunk?"PKCS5Padding":"NoPadding";
         existing = CryptoFunctions.getCipher(skey, header.getCipherAlgorithm(), header.getChainingMode(), header.getKeySalt(), encryptionMode, blockKey);
      }

      byte[] blockKey1 = new byte[4];
      LittleEndian.putInt(blockKey1, 0, block);
      byte[] iv = CryptoFunctions.generateIv(header.getHashAlgorithmEx(), header.getKeySalt(), blockKey1, header.getBlockSize());
      Object aps;
      if(header.getCipherAlgorithm() == CipherAlgorithm.rc2) {
         aps = new RC2ParameterSpec(skey.getEncoded().length * 8, iv);
      } else {
         aps = new IvParameterSpec(iv);
      }

      existing.init(encryptionMode, skey, (AlgorithmParameterSpec)aps);
      return existing;
   }


   private class AgileCipherInputStream extends ChunkedCipherInputStream {

      public AgileCipherInputStream(DocumentInputStream stream, long size) throws GeneralSecurityException {
         super(stream, size, 4096);
      }

      protected Cipher initCipherForBlock(Cipher cipher, int block) throws GeneralSecurityException {
         return AgileDecryptor.initCipherForBlock(cipher, block, false, AgileDecryptor.this.builder, AgileDecryptor.this.getSecretKey(), 2);
      }
   }
}
