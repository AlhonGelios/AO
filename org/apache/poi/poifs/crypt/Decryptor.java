package org.apache.poi.poifs.crypt;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public abstract class Decryptor {

   public static final String DEFAULT_PASSWORD = "VelvetSweatshop";
   public static final String DEFAULT_POIFS_ENTRY = "EncryptedPackage";
   protected final EncryptionInfoBuilder builder;
   private SecretKey secretKey;
   private byte[] verifier;
   private byte[] integrityHmacKey;
   private byte[] integrityHmacValue;


   protected Decryptor(EncryptionInfoBuilder builder) {
      this.builder = builder;
   }

   public abstract InputStream getDataStream(DirectoryNode var1) throws IOException, GeneralSecurityException;

   public abstract boolean verifyPassword(String var1) throws GeneralSecurityException;

   public abstract long getLength();

   public static Decryptor getInstance(EncryptionInfo info) {
      Decryptor d = info.getDecryptor();
      if(d == null) {
         throw new EncryptedDocumentException("Unsupported version");
      } else {
         return d;
      }
   }

   public InputStream getDataStream(NPOIFSFileSystem fs) throws IOException, GeneralSecurityException {
      return this.getDataStream(fs.getRoot());
   }

   public InputStream getDataStream(OPOIFSFileSystem fs) throws IOException, GeneralSecurityException {
      return this.getDataStream(fs.getRoot());
   }

   public InputStream getDataStream(POIFSFileSystem fs) throws IOException, GeneralSecurityException {
      return this.getDataStream(fs.getRoot());
   }

   public byte[] getVerifier() {
      return this.verifier;
   }

   public SecretKey getSecretKey() {
      return this.secretKey;
   }

   public byte[] getIntegrityHmacKey() {
      return this.integrityHmacKey;
   }

   public byte[] getIntegrityHmacValue() {
      return this.integrityHmacValue;
   }

   protected void setSecretKey(SecretKey secretKey) {
      this.secretKey = secretKey;
   }

   protected void setVerifier(byte[] verifier) {
      this.verifier = verifier == null?null:(byte[])verifier.clone();
   }

   protected void setIntegrityHmacKey(byte[] integrityHmacKey) {
      this.integrityHmacKey = integrityHmacKey == null?null:(byte[])integrityHmacKey.clone();
   }

   protected void setIntegrityHmacValue(byte[] integrityHmacValue) {
      this.integrityHmacValue = integrityHmacValue == null?null:(byte[])integrityHmacValue.clone();
   }

   protected int getBlockSizeInBytes() {
      return this.builder.getHeader().getBlockSize();
   }

   protected int getKeySizeInBytes() {
      return this.builder.getHeader().getKeySize() / 8;
   }
}
