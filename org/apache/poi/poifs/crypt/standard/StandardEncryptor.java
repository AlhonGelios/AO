package org.apache.poi.poifs.crypt.standard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.DataSpaceMapUtils;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.crypt.standard.EncryptionRecord;
import org.apache.poi.poifs.crypt.standard.StandardDecryptor;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionHeader;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionVerifier;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.POIFSWriterEvent;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LittleEndianByteArrayOutputStream;
import org.apache.poi.util.LittleEndianOutputStream;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.TempFile;

public class StandardEncryptor extends Encryptor {

   private static final POILogger logger = POILogFactory.getLogger(StandardEncryptor.class);
   private final StandardEncryptionInfoBuilder builder;


   protected StandardEncryptor(StandardEncryptionInfoBuilder builder) {
      this.builder = builder;
   }

   public void confirmPassword(String password) {
      SecureRandom r = new SecureRandom();
      byte[] salt = new byte[16];
      byte[] verifier = new byte[16];
      r.nextBytes(salt);
      r.nextBytes(verifier);
      this.confirmPassword(password, (byte[])null, (byte[])null, salt, verifier, (byte[])null);
   }

   public void confirmPassword(String password, byte[] keySpec, byte[] keySalt, byte[] verifier, byte[] verifierSalt, byte[] integritySalt) {
      StandardEncryptionVerifier ver = this.builder.getVerifier();
      ver.setSalt(verifierSalt);
      SecretKey secretKey = StandardDecryptor.generateSecretKey(password, ver, this.getKeySizeInBytes());
      this.setSecretKey(secretKey);
      Cipher cipher = this.getCipher(secretKey, (String)null);

      try {
         byte[] e = cipher.doFinal(verifier);
         MessageDigest hashAlgo = CryptoFunctions.getMessageDigest(ver.getHashAlgorithm());
         byte[] calcVerifierHash = hashAlgo.digest(verifier);
         int encVerHashSize = ver.getCipherAlgorithm().encryptedVerifierHashLength;
         byte[] encryptedVerifierHash = cipher.doFinal(Arrays.copyOf(calcVerifierHash, encVerHashSize));
         ver.setEncryptedVerifier(e);
         ver.setEncryptedVerifierHash(encryptedVerifierHash);
      } catch (GeneralSecurityException var15) {
         throw new EncryptedDocumentException("Password confirmation failed", var15);
      }
   }

   private Cipher getCipher(SecretKey key, String padding) {
      StandardEncryptionVerifier ver = this.builder.getVerifier();
      return CryptoFunctions.getCipher(key, ver.getCipherAlgorithm(), ver.getChainingMode(), (byte[])null, 1, padding);
   }

   public OutputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      this.createEncryptionInfoEntry(dir);
      DataSpaceMapUtils.addDefaultDataSpace(dir);
      StandardEncryptor.StandardCipherOutputStream countStream = new StandardEncryptor.StandardCipherOutputStream(dir);
      return countStream;
   }

   protected int getKeySizeInBytes() {
      return this.builder.getHeader().getKeySize() / 8;
   }

   protected void createEncryptionInfoEntry(DirectoryNode dir) throws IOException {
      final EncryptionInfo info = this.builder.getEncryptionInfo();
      final StandardEncryptionHeader header = this.builder.getHeader();
      final StandardEncryptionVerifier verifier = this.builder.getVerifier();
      EncryptionRecord er = new EncryptionRecord() {
         public void write(LittleEndianByteArrayOutputStream bos) {
            bos.writeShort(info.getVersionMajor());
            bos.writeShort(info.getVersionMinor());
            bos.writeInt(info.getEncryptionFlags());
            header.write(bos);
            verifier.write(bos);
         }
      };
      DataSpaceMapUtils.createEncryptionEntry(dir, "EncryptionInfo", er);
   }


   protected class StandardCipherOutputStream extends FilterOutputStream implements POIFSWriterListener {

      protected long countBytes;
      protected final File fileOut;
      protected final DirectoryNode dir;


      private StandardCipherOutputStream(DirectoryNode dir, File fileOut) throws IOException {
         super(new CipherOutputStream(new FileOutputStream(fileOut), StandardEncryptor.this.getCipher(StandardEncryptor.this.getSecretKey(), "PKCS5Padding")));
         this.fileOut = fileOut;
         this.dir = dir;
      }

      protected StandardCipherOutputStream(DirectoryNode dir) throws IOException {
         this(dir, TempFile.createTempFile("encrypted_package", "crypt"));
      }

      public void write(byte[] b, int off, int len) throws IOException {
         this.out.write(b, off, len);
         this.countBytes += (long)len;
      }

      public void write(int b) throws IOException {
         this.out.write(b);
         ++this.countBytes;
      }

      public void close() throws IOException {
         super.close();
         this.writeToPOIFS();
      }

      void writeToPOIFS() throws IOException {
         int oleStreamSize = (int)(this.fileOut.length() + 8L);
         this.dir.createDocument("EncryptedPackage", oleStreamSize, this);
      }

      public void processPOIFSWriterEvent(POIFSWriterEvent event) {
         try {
            LittleEndianOutputStream e = new LittleEndianOutputStream(event.getStream());
            e.writeLong(this.countBytes);
            FileInputStream fis = new FileInputStream(this.fileOut);
            IOUtils.copy(fis, e);
            fis.close();
            if(!this.fileOut.delete()) {
               StandardEncryptor.logger.log(7, new Object[]{"Can\'t delete temporary encryption file: " + this.fileOut});
            }

            e.close();
         } catch (IOException var4) {
            throw new EncryptedDocumentException(var4);
         }
      }
   }
}
