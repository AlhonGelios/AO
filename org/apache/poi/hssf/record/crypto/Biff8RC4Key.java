package org.apache.poi.hssf.record.crypto;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.crypto.Biff8EncryptionKey;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class Biff8RC4Key extends Biff8EncryptionKey {

   public static final int KEY_DIGEST_LENGTH = 5;
   private static final int PASSWORD_HASH_NUMBER_OF_BYTES_USED = 5;
   private static POILogger log = POILogFactory.getLogger(Biff8RC4Key.class);


   Biff8RC4Key(byte[] keyDigest) {
      if(keyDigest.length != 5) {
         throw new IllegalArgumentException("Expected 5 byte key digest, but got " + HexDump.toHex(keyDigest));
      } else {
         CipherAlgorithm ca = CipherAlgorithm.rc4;
         this._secretKey = new SecretKeySpec((byte[])keyDigest.clone(), ca.jceId);
      }
   }

   public static Biff8RC4Key create(String password, byte[] salt) {
      return new Biff8RC4Key(createKeyDigest(password, salt));
   }

   public boolean validate(byte[] verifier, byte[] verifierHash) {
      check16Bytes(verifier, "verifier");
      check16Bytes(verifierHash, "verifierHash");
      Cipher rc4 = this.getCipher();
      this.initCipherForBlock(rc4, 0);
      byte[] verifierPrime = (byte[])verifier.clone();
      byte[] verifierHashPrime = (byte[])verifierHash.clone();

      try {
         rc4.update(verifierPrime, 0, verifierPrime.length, verifierPrime);
         rc4.update(verifierHashPrime, 0, verifierHashPrime.length, verifierHashPrime);
      } catch (ShortBufferException var9) {
         throw new EncryptedDocumentException("buffer too short", var9);
      }

      MessageDigest md5 = CryptoFunctions.getMessageDigest(HashAlgorithm.md5);
      md5.update(verifierPrime);
      byte[] finalVerifierResult = md5.digest();
      if(log.check(1)) {
         byte[] verifierHashThatWouldWork = xor(verifierHash, xor(verifierHashPrime, finalVerifierResult));
         log.log(1, new Object[]{"valid verifierHash value", HexDump.toHex(verifierHashThatWouldWork)});
      }

      return Arrays.equals(verifierHashPrime, finalVerifierResult);
   }

   Cipher getCipher() {
      CipherAlgorithm ca = CipherAlgorithm.rc4;
      Cipher rc4 = CryptoFunctions.getCipher(this._secretKey, ca, (ChainingMode)null, (byte[])null, 1);
      return rc4;
   }

   static byte[] createKeyDigest(String password, byte[] docIdData) {
      check16Bytes(docIdData, "docId");
      int nChars = Math.min(password.length(), 16);
      byte[] passwordData = new byte[nChars * 2];

      for(int md5 = 0; md5 < nChars; ++md5) {
         char passwordHash = password.charAt(md5);
         passwordData[md5 * 2 + 0] = (byte)(passwordHash << 0 & 255);
         passwordData[md5 * 2 + 1] = (byte)(passwordHash << 8 & 255);
      }

      MessageDigest var7 = CryptoFunctions.getMessageDigest(HashAlgorithm.md5);
      var7.update(passwordData);
      byte[] var8 = var7.digest();
      var7.reset();

      for(int result = 0; result < 16; ++result) {
         var7.update(var8, 0, 5);
         var7.update(docIdData, 0, docIdData.length);
      }

      byte[] var9 = CryptoFunctions.getBlock0(var7.digest(), 5);
      return var9;
   }

   void initCipherForBlock(Cipher rc4, int keyBlockNo) {
      byte[] buf = new byte[4];
      LittleEndian.putInt(buf, 0, keyBlockNo);
      MessageDigest md5 = CryptoFunctions.getMessageDigest(HashAlgorithm.md5);
      md5.update(this._secretKey.getEncoded());
      md5.update(buf);
      SecretKeySpec skeySpec = new SecretKeySpec(md5.digest(), this._secretKey.getAlgorithm());

      try {
         rc4.init(1, skeySpec);
      } catch (GeneralSecurityException var7) {
         throw new EncryptedDocumentException("Can\'t rekey for next block", var7);
      }
   }

   private static byte[] xor(byte[] a, byte[] b) {
      byte[] c = new byte[a.length];

      for(int i = 0; i < c.length; ++i) {
         c[i] = (byte)(a[i] ^ b[i]);
      }

      return c;
   }

   private static void check16Bytes(byte[] data, String argName) {
      if(data.length != 16) {
         throw new IllegalArgumentException("Expected 16 byte " + argName + ", but got " + HexDump.toHex(data));
      }
   }

}
