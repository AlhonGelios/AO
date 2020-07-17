package org.apache.poi.poifs.crypt.binaryrc4;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChunkedCipherOutputStream;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.DataSpaceMapUtils;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4Decryptor;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionHeader;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionVerifier;
import org.apache.poi.poifs.crypt.standard.EncryptionRecord;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.util.LittleEndianByteArrayOutputStream;

public class BinaryRC4Encryptor extends Encryptor {

   private final BinaryRC4EncryptionInfoBuilder builder;


   protected BinaryRC4Encryptor(BinaryRC4EncryptionInfoBuilder builder) {
      this.builder = builder;
   }

   public void confirmPassword(String password) {
      SecureRandom r = new SecureRandom();
      byte[] salt = new byte[16];
      byte[] verifier = new byte[16];
      r.nextBytes(salt);
      r.nextBytes(verifier);
      this.confirmPassword(password, (byte[])null, (byte[])null, verifier, salt, (byte[])null);
   }

   public void confirmPassword(String password, byte[] keySpec, byte[] keySalt, byte[] verifier, byte[] verifierSalt, byte[] integritySalt) {
      BinaryRC4EncryptionVerifier ver = this.builder.getVerifier();
      ver.setSalt(verifierSalt);
      SecretKey skey = BinaryRC4Decryptor.generateSecretKey(password, ver);
      this.setSecretKey(skey);

      try {
         Cipher e = BinaryRC4Decryptor.initCipherForBlock((Cipher)null, 0, this.builder, skey, 1);
         byte[] encryptedVerifier = new byte[16];
         e.update(verifier, 0, 16, encryptedVerifier);
         ver.setEncryptedVerifier(encryptedVerifier);
         HashAlgorithm hashAlgo = ver.getHashAlgorithm();
         MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
         byte[] calcVerifierHash = hashAlg.digest(verifier);
         byte[] encryptedVerifierHash = e.doFinal(calcVerifierHash);
         ver.setEncryptedVerifierHash(encryptedVerifierHash);
      } catch (GeneralSecurityException var15) {
         throw new EncryptedDocumentException("Password confirmation failed", var15);
      }
   }

   public OutputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      BinaryRC4Encryptor.BinaryRC4CipherOutputStream countStream = new BinaryRC4Encryptor.BinaryRC4CipherOutputStream(dir);
      return countStream;
   }

   protected int getKeySizeInBytes() {
      return this.builder.getHeader().getKeySize() / 8;
   }

   protected void createEncryptionInfoEntry(DirectoryNode dir) throws IOException {
      DataSpaceMapUtils.addDefaultDataSpace(dir);
      final EncryptionInfo info = this.builder.getEncryptionInfo();
      final BinaryRC4EncryptionHeader header = this.builder.getHeader();
      final BinaryRC4EncryptionVerifier verifier = this.builder.getVerifier();
      EncryptionRecord er = new EncryptionRecord() {
         public void write(LittleEndianByteArrayOutputStream bos) {
            bos.writeShort(info.getVersionMajor());
            bos.writeShort(info.getVersionMinor());
            header.write(bos);
            verifier.write(bos);
         }
      };
      DataSpaceMapUtils.createEncryptionEntry(dir, "EncryptionInfo", er);
   }

   protected class BinaryRC4CipherOutputStream extends ChunkedCipherOutputStream {

      protected Cipher initCipherForBlock(Cipher cipher, int block, boolean lastChunk) throws GeneralSecurityException {
         return BinaryRC4Decryptor.initCipherForBlock(cipher, block, BinaryRC4Encryptor.this.builder, BinaryRC4Encryptor.this.getSecretKey(), 1);
      }

      protected void calculateChecksum(File file, int i) {}

      protected void createEncryptionInfoEntry(DirectoryNode dir, File tmpFile) throws IOException, GeneralSecurityException {
         BinaryRC4Encryptor.this.createEncryptionInfoEntry(dir);
      }

      public BinaryRC4CipherOutputStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
         super(dir, 512);
      }
   }
}
