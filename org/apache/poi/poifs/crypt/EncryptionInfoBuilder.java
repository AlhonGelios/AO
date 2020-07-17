package org.apache.poi.poifs.crypt;

import java.io.IOException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionHeader;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionVerifier;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.util.LittleEndianInput;

public interface EncryptionInfoBuilder {

   void initialize(EncryptionInfo var1, LittleEndianInput var2) throws IOException;

   void initialize(EncryptionInfo var1, CipherAlgorithm var2, HashAlgorithm var3, int var4, int var5, ChainingMode var6);

   EncryptionHeader getHeader();

   EncryptionVerifier getVerifier();

   Decryptor getDecryptor();

   Encryptor getEncryptor();
}
