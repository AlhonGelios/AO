package org.apache.poi.poifs.crypt.binaryrc4;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.ChunkedCipherInputStream;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionHeader;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.EncryptionVerifier;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionInfoBuilder;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.StringUtil;

public class BinaryRC4Decryptor extends Decryptor {

   private long _length = -1L;


   protected BinaryRC4Decryptor(BinaryRC4EncryptionInfoBuilder builder) {
      super(builder);
   }

   public boolean verifyPassword(String password) {
      EncryptionVerifier ver = this.builder.getVerifier();
      SecretKey skey = generateSecretKey(password, ver);

      try {
         Cipher e = initCipherForBlock((Cipher)null, 0, this.builder, skey, 2);
         byte[] encryptedVerifier = ver.getEncryptedVerifier();
         byte[] verifier = new byte[encryptedVerifier.length];
         e.update(encryptedVerifier, 0, encryptedVerifier.length, verifier);
         this.setVerifier(verifier);
         byte[] encryptedVerifierHash = ver.getEncryptedVerifierHash();
         byte[] verifierHash = e.doFinal(encryptedVerifierHash);
         HashAlgorithm hashAlgo = ver.getHashAlgorithm();
         MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
         byte[] calcVerifierHash = hashAlg.digest(verifier);
         if(Arrays.equals(calcVerifierHash, verifierHash)) {
            this.setSecretKey(skey);
            return true;
         } else {
            return false;
         }
      } catch (GeneralSecurityException var12) {
         throw new EncryptedDocumentException(var12);
      }
   }

   protected static Cipher initCipherForBlock(Cipher cipher, int block, EncryptionInfoBuilder builder, SecretKey skey, int encryptMode) throws GeneralSecurityException {
      EncryptionVerifier ver = builder.getVerifier();
      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      byte[] blockKey = new byte[4];
      LittleEndian.putUInt(blockKey, 0, (long)block);
      byte[] encKey = CryptoFunctions.generateKey(skey.getEncoded(), hashAlgo, blockKey, 16);
      SecretKeySpec key = new SecretKeySpec(encKey, skey.getAlgorithm());
      if(cipher == null) {
         EncryptionHeader em = builder.getHeader();
         cipher = CryptoFunctions.getCipher(key, em.getCipherAlgorithm(), (ChainingMode)null, (byte[])null, encryptMode);
      } else {
         cipher.init(encryptMode, key);
      }

      return cipher;
   }

   protected static SecretKey generateSecretKey(String password, EncryptionVerifier ver) {
      if(password.length() > 255) {
         password = password.substring(0, 255);
      }

      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
      byte[] hash = hashAlg.digest(StringUtil.getToUnicodeLE(password));
      byte[] salt = ver.getSalt();
      hashAlg.reset();

      for(int skey = 0; skey < 16; ++skey) {
         hashAlg.update(hash, 0, 5);
         hashAlg.update(salt);
      }

      hash = new byte[5];
      System.arraycopy(hashAlg.digest(), 0, hash, 0, 5);
      SecretKeySpec var7 = new SecretKeySpec(hash, ver.getCipherAlgorithm().jceId);
      return var7;
   }

   public InputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      DocumentInputStream dis = dir.createDocumentInputStream("EncryptedPackage");
      this._length = dis.readLong();
      BinaryRC4Decryptor.BinaryRC4CipherInputStream cipherStream = new BinaryRC4Decryptor.BinaryRC4CipherInputStream(dis, this._length);
      return cipherStream;
   }

   public long getLength() {
      if(this._length == -1L) {
         throw new IllegalStateException("Decryptor.getDataStream() was not called");
      } else {
         return this._length;
      }
   }

   private class BinaryRC4CipherInputStream extends ChunkedCipherInputStream {

      protected Cipher initCipherForBlock(Cipher existing, int block) throws GeneralSecurityException {
         return BinaryRC4Decryptor.initCipherForBlock(existing, block, BinaryRC4Decryptor.this.builder, BinaryRC4Decryptor.this.getSecretKey(), 2);
      }

      public BinaryRC4CipherInputStream(DocumentInputStream stream, long size) throws GeneralSecurityException {
         super(stream, size, 512);
      }
   }
}
