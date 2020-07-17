package org.apache.poi.hssf.record.crypto;

import javax.crypto.SecretKey;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.crypto.Biff8RC4Key;

public abstract class Biff8EncryptionKey {

   protected SecretKey _secretKey;
   private static final ThreadLocal _userPasswordTLS = new ThreadLocal();


   public static Biff8EncryptionKey create(byte[] salt) {
      return Biff8RC4Key.create("VelvetSweatshop", salt);
   }

   public static Biff8EncryptionKey create(String password, byte[] salt) {
      return Biff8RC4Key.create(password, salt);
   }

   public boolean validate(byte[] saltData, byte[] saltHash) {
      throw new EncryptedDocumentException("validate is not supported (in super-class).");
   }

   public static void setCurrentUserPassword(String password) {
      _userPasswordTLS.set(password);
   }

   public static String getCurrentUserPassword() {
      return (String)_userPasswordTLS.get();
   }

}
