package org.apache.poi.poifs.crypt;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.SecretKey;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public abstract class Encryptor {

   protected static final String DEFAULT_POIFS_ENTRY = "EncryptedPackage";
   private SecretKey secretKey;


   public abstract OutputStream getDataStream(DirectoryNode var1) throws IOException, GeneralSecurityException;

   public abstract void confirmPassword(String var1, byte[] var2, byte[] var3, byte[] var4, byte[] var5, byte[] var6);

   public abstract void confirmPassword(String var1);

   public static Encryptor getInstance(EncryptionInfo info) {
      return info.getEncryptor();
   }

   public OutputStream getDataStream(NPOIFSFileSystem fs) throws IOException, GeneralSecurityException {
      return this.getDataStream(fs.getRoot());
   }

   public OutputStream getDataStream(OPOIFSFileSystem fs) throws IOException, GeneralSecurityException {
      return this.getDataStream(fs.getRoot());
   }

   public OutputStream getDataStream(POIFSFileSystem fs) throws IOException, GeneralSecurityException {
      return this.getDataStream(fs.getRoot());
   }

   public SecretKey getSecretKey() {
      return this.secretKey;
   }

   protected void setSecretKey(SecretKey secretKey) {
      this.secretKey = secretKey;
   }
}
