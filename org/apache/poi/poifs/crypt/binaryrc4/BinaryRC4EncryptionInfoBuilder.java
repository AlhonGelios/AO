package org.apache.poi.poifs.crypt.binaryrc4;

import java.io.IOException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4Decryptor;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionHeader;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionVerifier;
import org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4Encryptor;
import org.apache.poi.util.LittleEndianInput;

public class BinaryRC4EncryptionInfoBuilder implements EncryptionInfoBuilder {

   EncryptionInfo info;
   BinaryRC4EncryptionHeader header;
   BinaryRC4EncryptionVerifier verifier;
   BinaryRC4Decryptor decryptor;
   BinaryRC4Encryptor encryptor;


   public void initialize(EncryptionInfo info, LittleEndianInput dis) throws IOException {
      this.info = info;
      int vMajor = info.getVersionMajor();
      int vMinor = info.getVersionMinor();

      assert vMajor == 1 && vMinor == 1;

      this.header = new BinaryRC4EncryptionHeader();
      this.verifier = new BinaryRC4EncryptionVerifier(dis);
      this.decryptor = new BinaryRC4Decryptor(this);
      this.encryptor = new BinaryRC4Encryptor(this);
   }

   public void initialize(EncryptionInfo info, CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.info = info;
      this.header = new BinaryRC4EncryptionHeader();
      this.verifier = new BinaryRC4EncryptionVerifier();
      this.decryptor = new BinaryRC4Decryptor(this);
      this.encryptor = new BinaryRC4Encryptor(this);
   }

   public BinaryRC4EncryptionHeader getHeader() {
      return this.header;
   }

   public BinaryRC4EncryptionVerifier getVerifier() {
      return this.verifier;
   }

   public BinaryRC4Decryptor getDecryptor() {
      return this.decryptor;
   }

   public BinaryRC4Encryptor getEncryptor() {
      return this.encryptor;
   }

   public EncryptionInfo getEncryptionInfo() {
      return this.info;
   }

}
