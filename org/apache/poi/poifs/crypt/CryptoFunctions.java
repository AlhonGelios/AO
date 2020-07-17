package org.apache.poi.poifs.crypt;

import java.nio.charset.Charset;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.StringUtil;

@Internal
public class CryptoFunctions {

   private static final int[] INITIAL_CODE_ARRAY = new int[]{'\ue1f0', 7439, '\ucc9c', '\u84c0', 4364, 3600, '\uf1ce', 12606, 6258, '\ue139', '\ud40f', '\u84f9', 10252, '\ua96a', 20163};
   private static final byte[] PAD_ARRAY = new byte[]{(byte)-69, (byte)-1, (byte)-1, (byte)-70, (byte)-1, (byte)-1, (byte)-71, (byte)-128, (byte)0, (byte)-66, (byte)15, (byte)0, (byte)-65, (byte)15, (byte)0};
   private static final int[][] ENCRYPTION_MATRIX = new int[][]{{'\uaefc', 19929, '\u9bb2', 10053, 20106, '\u9d14', 10761}, {31585, '\uf6c2', '\ufda5', '\ueb6b', '\uc6f7', '\u9dcf', 11199}, {17763, '\u8ac6', 1453, 2906, 5812, 11624, 23248}, {885, 1770, 3540, 7080, 14160, 28320, '\udd40'}, {'\ud849', '\ua0b3', 20807, '\ua28e', 21821, '\uaa7a', 17621}, {28485, '\ude8a', '\uad35', 19019, '\u9496', 14605, 29210}, {'\ueb23', '\uc667', '\u9cef', 10751, 21502, '\ua7fc', 24537}, {18387, '\u8fa6', 3949, 7898, 15796, 31592, '\uf6d0'}, {'\ub861', 24803, '\uc1c6', '\u93ad', 14203, 28406, '\uddec'}, {17824, '\u8b40', 1697, 3394, 6788, 13576, 27152}, {'\uaa51', 17539, '\u8906', 557, 1114, 2228, 4456}, {30388, '\ued68', '\ucaf1', '\u85c3', 7079, 14158, 28316}, {14128, 28256, '\udcc0', '\ua9a1', 17251, '\u86c6', 7597}, {13105, 26210, '\uccc4', '\u89a9', 883, 1766, 3532}, {4129, 8258, 16516, '\u8108', 4657, 9314, 18628}};


   public static byte[] hashPassword(String password, HashAlgorithm hashAlgorithm, byte[] salt, int spinCount) {
      return hashPassword(password, hashAlgorithm, salt, spinCount, true);
   }

   public static byte[] hashPassword(String password, HashAlgorithm hashAlgorithm, byte[] salt, int spinCount, boolean iteratorFirst) {
      if(password == null) {
         password = "VelvetSweatshop";
      }

      MessageDigest hashAlg = getMessageDigest(hashAlgorithm);
      hashAlg.update(salt);
      byte[] hash = hashAlg.digest(StringUtil.getToUnicodeLE(password));
      byte[] iterator = new byte[4];
      byte[] first = iteratorFirst?iterator:hash;
      byte[] second = iteratorFirst?hash:iterator;

      try {
         for(int e = 0; e < spinCount; ++e) {
            LittleEndian.putInt(iterator, 0, e);
            hashAlg.reset();
            hashAlg.update(first);
            hashAlg.update(second);
            hashAlg.digest(hash, 0, hash.length);
         }

         return hash;
      } catch (DigestException var11) {
         throw new EncryptedDocumentException("error in password hashing");
      }
   }

   public static byte[] generateIv(HashAlgorithm hashAlgorithm, byte[] salt, byte[] blockKey, int blockSize) {
      byte[] iv = salt;
      if(blockKey != null) {
         MessageDigest hashAlgo = getMessageDigest(hashAlgorithm);
         hashAlgo.update(salt);
         iv = hashAlgo.digest(blockKey);
      }

      return getBlock36(iv, blockSize);
   }

   public static byte[] generateKey(byte[] passwordHash, HashAlgorithm hashAlgorithm, byte[] blockKey, int keySize) {
      MessageDigest hashAlgo = getMessageDigest(hashAlgorithm);
      hashAlgo.update(passwordHash);
      byte[] key = hashAlgo.digest(blockKey);
      return getBlock36(key, keySize);
   }

   public static Cipher getCipher(SecretKey key, CipherAlgorithm cipherAlgorithm, ChainingMode chain, byte[] vec, int cipherMode) {
      return getCipher(key, cipherAlgorithm, chain, vec, cipherMode, (String)null);
   }

   public static Cipher getCipher(Key key, CipherAlgorithm cipherAlgorithm, ChainingMode chain, byte[] vec, int cipherMode, String padding) {
      int keySizeInBytes = key.getEncoded().length;
      if(padding == null) {
         padding = "NoPadding";
      }

      try {
         if(Cipher.getMaxAllowedKeyLength(cipherAlgorithm.jceId) < keySizeInBytes * 8) {
            throw new EncryptedDocumentException("Export Restrictions in place - please install JCE Unlimited Strength Jurisdiction Policy files");
         } else {
            Cipher e;
            if(cipherAlgorithm == CipherAlgorithm.rc4) {
               e = Cipher.getInstance(cipherAlgorithm.jceId);
            } else if(cipherAlgorithm.needsBouncyCastle) {
               registerBouncyCastle();
               e = Cipher.getInstance(cipherAlgorithm.jceId + "/" + chain.jceId + "/" + padding, "BC");
            } else {
               e = Cipher.getInstance(cipherAlgorithm.jceId + "/" + chain.jceId + "/" + padding);
            }

            if(vec == null) {
               e.init(cipherMode, key);
            } else {
               Object aps;
               if(cipherAlgorithm == CipherAlgorithm.rc2) {
                  aps = new RC2ParameterSpec(key.getEncoded().length * 8, vec);
               } else {
                  aps = new IvParameterSpec(vec);
               }

               e.init(cipherMode, key, (AlgorithmParameterSpec)aps);
            }

            return e;
         }
      } catch (GeneralSecurityException var9) {
         throw new EncryptedDocumentException(var9);
      }
   }

   private static byte[] getBlock36(byte[] hash, int size) {
      return getBlockX(hash, size, (byte)54);
   }

   public static byte[] getBlock0(byte[] hash, int size) {
      return getBlockX(hash, size, (byte)0);
   }

   private static byte[] getBlockX(byte[] hash, int size, byte fill) {
      if(hash.length == size) {
         return hash;
      } else {
         byte[] result = new byte[size];
         Arrays.fill(result, fill);
         System.arraycopy(hash, 0, result, 0, Math.min(result.length, hash.length));
         return result;
      }
   }

   public static MessageDigest getMessageDigest(HashAlgorithm hashAlgorithm) {
      try {
         if(hashAlgorithm.needsBouncyCastle) {
            registerBouncyCastle();
            return MessageDigest.getInstance(hashAlgorithm.jceId, "BC");
         } else {
            return MessageDigest.getInstance(hashAlgorithm.jceId);
         }
      } catch (GeneralSecurityException var2) {
         throw new EncryptedDocumentException("hash algo not supported", var2);
      }
   }

   public static Mac getMac(HashAlgorithm hashAlgorithm) {
      try {
         if(hashAlgorithm.needsBouncyCastle) {
            registerBouncyCastle();
            return Mac.getInstance(hashAlgorithm.jceHmacId, "BC");
         } else {
            return Mac.getInstance(hashAlgorithm.jceHmacId);
         }
      } catch (GeneralSecurityException var2) {
         throw new EncryptedDocumentException("hmac algo not supported", var2);
      }
   }

   public static void registerBouncyCastle() {
      if(Security.getProvider("BC") == null) {
         try {
            ClassLoader e = Thread.currentThread().getContextClassLoader();
            String bcProviderName = "org.bouncycastle.jce.provider.BouncyCastleProvider";
            Class clazz = e.loadClass(bcProviderName);
            Security.addProvider((Provider)clazz.newInstance());
         } catch (Exception var3) {
            throw new EncryptedDocumentException("Only the BouncyCastle provider supports your encryption settings - please add it to the classpath.", var3);
         }
      }
   }

   public static int createXorVerifier1(String password) {
      byte[] arrByteChars = toAnsiPassword(password);
      short verifier = 0;
      if(!"".equals(password)) {
         for(int i = arrByteChars.length - 1; i >= 0; --i) {
            verifier = rotateLeftBase15Bit(verifier);
            verifier = (short)(verifier ^ arrByteChars[i]);
         }

         verifier = rotateLeftBase15Bit(verifier);
         verifier = (short)(verifier ^ arrByteChars.length);
         verifier = (short)(verifier ^ '\uce4b');
      }

      return verifier & '\uffff';
   }

   public static int createXorVerifier2(String password) {
      byte[] generatedKey = new byte[4];
      boolean maxPasswordLength = true;
      if(!"".equals(password)) {
         password = password.substring(0, Math.min(password.length(), 15));
         byte[] arrByteChars = toAnsiPassword(password);
         int highOrderWord = INITIAL_CODE_ARRAY[arrByteChars.length - 1];

         int verifier;
         for(verifier = 0; verifier < arrByteChars.length; ++verifier) {
            int tmp = 15 - arrByteChars.length + verifier;

            for(int intBit = 0; intBit < 7; ++intBit) {
               if((arrByteChars[verifier] & 1 << intBit) != 0) {
                  highOrderWord ^= ENCRYPTION_MATRIX[tmp][intBit];
               }
            }
         }

         verifier = createXorVerifier1(password);
         LittleEndian.putShort(generatedKey, 0, (short)verifier);
         LittleEndian.putShort(generatedKey, 2, (short)highOrderWord);
      }

      return LittleEndian.getInt(generatedKey);
   }

   public static String xorHashPassword(String password) {
      int hashedPassword = createXorVerifier2(password);
      return String.format(Locale.ROOT, "%1$08X", new Object[]{Integer.valueOf(hashedPassword)});
   }

   public static String xorHashPasswordReversed(String password) {
      int hashedPassword = createXorVerifier2(password);
      return String.format(Locale.ROOT, "%1$02X%2$02X%3$02X%4$02X", new Object[]{Integer.valueOf(hashedPassword >>> 0 & 255), Integer.valueOf(hashedPassword >>> 8 & 255), Integer.valueOf(hashedPassword >>> 16 & 255), Integer.valueOf(hashedPassword >>> 24 & 255)});
   }

   public static int createXorKey1(String password) {
      return createXorVerifier2(password) >>> 16;
   }

   public static byte[] createXorArray1(String password) {
      if(password.length() > 15) {
         password = password.substring(0, 15);
      }

      byte[] passBytes = password.getBytes(Charset.forName("ASCII"));
      byte[] obfuscationArray = new byte[16];
      System.arraycopy(passBytes, 0, obfuscationArray, 0, passBytes.length);
      System.arraycopy(PAD_ARRAY, 0, obfuscationArray, passBytes.length, PAD_ARRAY.length - passBytes.length + 1);
      int xorKey = createXorKey1(password);
      byte nRotateSize = 2;
      byte[] baseKeyLE = new byte[]{(byte)(xorKey & 255), (byte)(xorKey >>> 8 & 255)};

      for(int i = 0; i < obfuscationArray.length; ++i) {
         obfuscationArray[i] ^= baseKeyLE[i & 1];
         obfuscationArray[i] = rotateLeft(obfuscationArray[i], nRotateSize);
      }

      return obfuscationArray;
   }

   private static byte[] toAnsiPassword(String password) {
      byte[] arrByteChars = new byte[password.length()];

      for(int i = 0; i < password.length(); ++i) {
         char intTemp = password.charAt(i);
         byte lowByte = (byte)(intTemp & 255);
         byte highByte = (byte)(intTemp >>> 8 & 255);
         arrByteChars[i] = lowByte != 0?lowByte:highByte;
      }

      return arrByteChars;
   }

   private static byte rotateLeft(byte bits, int shift) {
      return (byte)((bits & 255) << shift | (bits & 255) >>> 8 - shift);
   }

   private static short rotateLeftBase15Bit(short verifier) {
      short intermediate1 = (short)((verifier & 16384) == 0?0:1);
      short intermediate2 = (short)(verifier << 1 & 32767);
      short intermediate3 = (short)(intermediate1 | intermediate2);
      return intermediate3;
   }

}
