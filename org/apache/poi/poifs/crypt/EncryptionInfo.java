package org.apache.poi.poifs.crypt;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionHeader;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.EncryptionMode;
import org.apache.poi.poifs.crypt.EncryptionVerifier;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.LittleEndianInput;

public class EncryptionInfo {

   private final int versionMajor;
   private final int versionMinor;
   private final int encryptionFlags;
   private final EncryptionHeader header;
   private final EncryptionVerifier verifier;
   private final Decryptor decryptor;
   private final Encryptor encryptor;
   public static final BitField flagCryptoAPI = BitFieldFactory.getInstance(4);
   public static final BitField flagDocProps = BitFieldFactory.getInstance(8);
   public static final BitField flagExternal = BitFieldFactory.getInstance(16);
   public static final BitField flagAES = BitFieldFactory.getInstance(32);


   public EncryptionInfo(POIFSFileSystem fs) throws IOException {
      this(fs.getRoot());
   }

   public EncryptionInfo(OPOIFSFileSystem fs) throws IOException {
      this(fs.getRoot());
   }

   public EncryptionInfo(NPOIFSFileSystem fs) throws IOException {
      this(fs.getRoot());
   }

   public EncryptionInfo(DirectoryNode dir) throws IOException {
      this(dir.createDocumentInputStream("EncryptionInfo"), false);
   }

   public EncryptionInfo(LittleEndianInput dis, boolean isCryptoAPI) throws IOException {
      this.versionMajor = dis.readShort();
      this.versionMinor = dis.readShort();
      EncryptionMode encryptionMode;
      if(!isCryptoAPI && this.versionMajor == EncryptionMode.binaryRC4.versionMajor && this.versionMinor == EncryptionMode.binaryRC4.versionMinor) {
         encryptionMode = EncryptionMode.binaryRC4;
         this.encryptionFlags = -1;
      } else if(!isCryptoAPI && this.versionMajor == EncryptionMode.agile.versionMajor && this.versionMinor == EncryptionMode.agile.versionMinor) {
         encryptionMode = EncryptionMode.agile;
         this.encryptionFlags = dis.readInt();
      } else if(!isCryptoAPI && 2 <= this.versionMajor && this.versionMajor <= 4 && this.versionMinor == EncryptionMode.standard.versionMinor) {
         encryptionMode = EncryptionMode.standard;
         this.encryptionFlags = dis.readInt();
      } else {
         if(!isCryptoAPI || 2 > this.versionMajor || this.versionMajor > 4 || this.versionMinor != EncryptionMode.cryptoAPI.versionMinor) {
            this.encryptionFlags = dis.readInt();
            throw new EncryptedDocumentException("Unknown encryption: version major: " + this.versionMajor + " / version minor: " + this.versionMinor + " / fCrypto: " + flagCryptoAPI.isSet(this.encryptionFlags) + " / fExternal: " + flagExternal.isSet(this.encryptionFlags) + " / fDocProps: " + flagDocProps.isSet(this.encryptionFlags) + " / fAES: " + flagAES.isSet(this.encryptionFlags));
         }

         encryptionMode = EncryptionMode.cryptoAPI;
         this.encryptionFlags = dis.readInt();
      }

      EncryptionInfoBuilder eib;
      try {
         eib = getBuilder(encryptionMode);
      } catch (Exception var6) {
         throw new IOException(var6);
      }

      eib.initialize(this, dis);
      this.header = eib.getHeader();
      this.verifier = eib.getVerifier();
      this.decryptor = eib.getDecryptor();
      this.encryptor = eib.getEncryptor();
   }

   public EncryptionInfo(EncryptionMode encryptionMode) {
      this(encryptionMode, (CipherAlgorithm)null, (HashAlgorithm)null, -1, -1, (ChainingMode)null);
   }

   public EncryptionInfo(EncryptionMode encryptionMode, CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.versionMajor = encryptionMode.versionMajor;
      this.versionMinor = encryptionMode.versionMinor;
      this.encryptionFlags = encryptionMode.encryptionFlags;

      EncryptionInfoBuilder eib;
      try {
         eib = getBuilder(encryptionMode);
      } catch (Exception var9) {
         throw new EncryptedDocumentException(var9);
      }

      eib.initialize(this, cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
      this.header = eib.getHeader();
      this.verifier = eib.getVerifier();
      this.decryptor = eib.getDecryptor();
      this.encryptor = eib.getEncryptor();
   }

   protected static EncryptionInfoBuilder getBuilder(EncryptionMode encryptionMode) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
      ClassLoader cl = Thread.currentThread().getContextClassLoader();
      EncryptionInfoBuilder eib = (EncryptionInfoBuilder)cl.loadClass(encryptionMode.builder).newInstance();
      return eib;
   }

   public int getVersionMajor() {
      return this.versionMajor;
   }

   public int getVersionMinor() {
      return this.versionMinor;
   }

   public int getEncryptionFlags() {
      return this.encryptionFlags;
   }

   public EncryptionHeader getHeader() {
      return this.header;
   }

   public EncryptionVerifier getVerifier() {
      return this.verifier;
   }

   public Decryptor getDecryptor() {
      return this.decryptor;
   }

   public Encryptor getEncryptor() {
      return this.encryptor;
   }

}
