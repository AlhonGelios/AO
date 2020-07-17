package org.apache.poi.poifs.crypt.agile;

import com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity;
import com.microsoft.schemas.office.x2006.encryption.CTEncryption;
import com.microsoft.schemas.office.x2006.encryption.CTKeyData;
import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptors;
import com.microsoft.schemas.office.x2006.encryption.EncryptionDocument;
import com.microsoft.schemas.office.x2006.encryption.STCipherAlgorithm;
import com.microsoft.schemas.office.x2006.encryption.STCipherChaining;
import com.microsoft.schemas.office.x2006.encryption.STHashAlgorithm;
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor;
import com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.ChunkedCipherOutputStream;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.DataSpaceMapUtils;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.agile.AgileDecryptor;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionHeader;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionVerifier;
import org.apache.poi.poifs.crypt.standard.EncryptionRecord;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.LittleEndianByteArrayOutputStream;
import org.apache.xmlbeans.XmlOptions;

public class AgileEncryptor extends Encryptor {

   private final AgileEncryptionInfoBuilder builder;
   private byte[] integritySalt;
   private byte[] pwHash;
   private final CTKeyEncryptor.Uri.Enum passwordUri;
   private final CTKeyEncryptor.Uri.Enum certificateUri;


   protected AgileEncryptor(AgileEncryptionInfoBuilder builder) {
      this.passwordUri = CTKeyEncryptor.Uri.HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_PASSWORD;
      this.certificateUri = CTKeyEncryptor.Uri.HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_CERTIFICATE;
      this.builder = builder;
   }

   public void confirmPassword(String password) {
      SecureRandom r = new SecureRandom();
      int blockSize = this.builder.getHeader().getBlockSize();
      int keySize = this.builder.getHeader().getKeySize() / 8;
      int hashSize = this.builder.getHeader().getHashAlgorithmEx().hashSize;
      byte[] newVerifierSalt = new byte[blockSize];
      byte[] newVerifier = new byte[blockSize];
      byte[] newKeySalt = new byte[blockSize];
      byte[] newKeySpec = new byte[keySize];
      byte[] newIntegritySalt = new byte[hashSize];
      r.nextBytes(newVerifierSalt);
      r.nextBytes(newVerifier);
      r.nextBytes(newKeySalt);
      r.nextBytes(newKeySpec);
      r.nextBytes(newIntegritySalt);
      this.confirmPassword(password, newKeySpec, newKeySalt, newVerifierSalt, newVerifier, newIntegritySalt);
   }

   public void confirmPassword(String password, byte[] keySpec, byte[] keySalt, byte[] verifier, byte[] verifierSalt, byte[] integritySalt) {
      AgileEncryptionVerifier ver = this.builder.getVerifier();
      ver.setSalt(verifierSalt);
      AgileEncryptionHeader header = this.builder.getHeader();
      header.setKeySalt(keySalt);
      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      int blockSize = header.getBlockSize();
      this.pwHash = CryptoFunctions.hashPassword(password, hashAlgo, verifierSalt, ver.getSpinCount());
      byte[] encryptedVerifier = AgileDecryptor.hashInput(this.builder, this.pwHash, AgileDecryptor.kVerifierInputBlock, verifier, 1);
      ver.setEncryptedVerifier(encryptedVerifier);
      MessageDigest hashMD = CryptoFunctions.getMessageDigest(hashAlgo);
      byte[] hashedVerifier = hashMD.digest(verifier);
      byte[] encryptedVerifierHash = AgileDecryptor.hashInput(this.builder, this.pwHash, AgileDecryptor.kHashedVerifierBlock, hashedVerifier, 1);
      ver.setEncryptedVerifierHash(encryptedVerifierHash);
      byte[] encryptedKey = AgileDecryptor.hashInput(this.builder, this.pwHash, AgileDecryptor.kCryptoKeyBlock, keySpec, 1);
      ver.setEncryptedKey(encryptedKey);
      SecretKeySpec secretKey = new SecretKeySpec(keySpec, ver.getCipherAlgorithm().jceId);
      this.setSecretKey(secretKey);
      this.integritySalt = (byte[])integritySalt.clone();

      try {
         byte[] e = CryptoFunctions.generateIv(hashAlgo, header.getKeySalt(), AgileDecryptor.kIntegrityKeyBlock, header.getBlockSize());
         Cipher cipher = CryptoFunctions.getCipher(secretKey, ver.getCipherAlgorithm(), ver.getChainingMode(), e, 1);
         byte[] filledSalt = CryptoFunctions.getBlock0(this.integritySalt, AgileDecryptor.getNextBlockSize(this.integritySalt.length, blockSize));
         byte[] encryptedHmacKey = cipher.doFinal(filledSalt);
         header.setEncryptedHmacKey(encryptedHmacKey);
         cipher = Cipher.getInstance("RSA");

         AgileEncryptionVerifier.AgileCertificateEntry ace;
         Mac x509Hmac;
         for(Iterator i$ = ver.getCertificates().iterator(); i$.hasNext(); ace.certVerifier = x509Hmac.doFinal(ace.x509.getEncoded())) {
            ace = (AgileEncryptionVerifier.AgileCertificateEntry)i$.next();
            cipher.init(1, ace.x509.getPublicKey());
            ace.encryptedKey = cipher.doFinal(this.getSecretKey().getEncoded());
            x509Hmac = CryptoFunctions.getMac(hashAlgo);
            x509Hmac.init(this.getSecretKey());
         }

      } catch (GeneralSecurityException var24) {
         throw new EncryptedDocumentException(var24);
      }
   }

   public OutputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      AgileEncryptor.AgileCipherOutputStream countStream = new AgileEncryptor.AgileCipherOutputStream(dir);
      return countStream;
   }

   protected void updateIntegrityHMAC(File tmpFile, int oleStreamSize) throws GeneralSecurityException, IOException {
      AgileEncryptionVerifier ver = this.builder.getVerifier();
      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      Mac integrityMD = CryptoFunctions.getMac(hashAlgo);
      integrityMD.init(new SecretKeySpec(this.integritySalt, hashAlgo.jceHmacId));
      byte[] buf = new byte[1024];
      LittleEndian.putLong(buf, 0, (long)oleStreamSize);
      integrityMD.update(buf, 0, 8);
      FileInputStream fis = new FileInputStream(tmpFile);

      int hmacValue;
      try {
         while((hmacValue = fis.read(buf)) != -1) {
            integrityMD.update(buf, 0, hmacValue);
         }
      } finally {
         fis.close();
      }

      byte[] hmacValue1 = integrityMD.doFinal();
      AgileEncryptionHeader header = this.builder.getHeader();
      int blockSize = header.getBlockSize();
      byte[] iv = CryptoFunctions.generateIv(header.getHashAlgorithmEx(), header.getKeySalt(), AgileDecryptor.kIntegrityValueBlock, blockSize);
      Cipher cipher = CryptoFunctions.getCipher(this.getSecretKey(), header.getCipherAlgorithm(), header.getChainingMode(), iv, 1);
      byte[] hmacValueFilled = CryptoFunctions.getBlock0(hmacValue1, AgileDecryptor.getNextBlockSize(hmacValue1.length, blockSize));
      byte[] encryptedHmacValue = cipher.doFinal(hmacValueFilled);
      header.setEncryptedHmacValue(encryptedHmacValue);
   }

   protected EncryptionDocument createEncryptionDocument() {
      AgileEncryptionVerifier ver = this.builder.getVerifier();
      AgileEncryptionHeader header = this.builder.getHeader();
      EncryptionDocument ed = EncryptionDocument.Factory.newInstance();
      CTEncryption edRoot = ed.addNewEncryption();
      CTKeyData keyData = edRoot.addNewKeyData();
      CTKeyEncryptors keyEncList = edRoot.addNewKeyEncryptors();
      CTKeyEncryptor keyEnc = keyEncList.addNewKeyEncryptor();
      keyEnc.setUri(this.passwordUri);
      CTPasswordKeyEncryptor keyPass = keyEnc.addNewEncryptedPasswordKey();
      keyPass.setSpinCount(ver.getSpinCount());
      keyData.setSaltSize(header.getBlockSize());
      keyPass.setSaltSize(header.getBlockSize());
      keyData.setBlockSize(header.getBlockSize());
      keyPass.setBlockSize(header.getBlockSize());
      keyData.setKeyBits((long)header.getKeySize());
      keyPass.setKeyBits((long)header.getKeySize());
      HashAlgorithm hashAlgo = header.getHashAlgorithmEx();
      keyData.setHashSize(hashAlgo.hashSize);
      keyPass.setHashSize(hashAlgo.hashSize);
      STCipherAlgorithm.Enum xmlCipherAlgo = STCipherAlgorithm.Enum.forString(header.getCipherAlgorithm().xmlId);
      if(xmlCipherAlgo == null) {
         throw new EncryptedDocumentException("CipherAlgorithm " + header.getCipherAlgorithm() + " not supported.");
      } else {
         keyData.setCipherAlgorithm(xmlCipherAlgo);
         keyPass.setCipherAlgorithm(xmlCipherAlgo);
         switch(AgileEncryptor.NamelessClass1488624554.$SwitchMap$org$apache$poi$poifs$crypt$ChainingMode[header.getChainingMode().ordinal()]) {
         case 1:
            keyData.setCipherChaining(STCipherChaining.CHAINING_MODE_CBC);
            keyPass.setCipherChaining(STCipherChaining.CHAINING_MODE_CBC);
            break;
         case 2:
            keyData.setCipherChaining(STCipherChaining.CHAINING_MODE_CFB);
            keyPass.setCipherChaining(STCipherChaining.CHAINING_MODE_CFB);
            break;
         default:
            throw new EncryptedDocumentException("ChainingMode " + header.getChainingMode() + " not supported.");
         }

         STHashAlgorithm.Enum xmlHashAlgo = STHashAlgorithm.Enum.forString(hashAlgo.ecmaString);
         if(xmlHashAlgo == null) {
            throw new EncryptedDocumentException("HashAlgorithm " + hashAlgo + " not supported.");
         } else {
            keyData.setHashAlgorithm(xmlHashAlgo);
            keyPass.setHashAlgorithm(xmlHashAlgo);
            keyData.setSaltValue(header.getKeySalt());
            keyPass.setSaltValue(ver.getSalt());
            keyPass.setEncryptedVerifierHashInput(ver.getEncryptedVerifier());
            keyPass.setEncryptedVerifierHashValue(ver.getEncryptedVerifierHash());
            keyPass.setEncryptedKeyValue(ver.getEncryptedKey());
            CTDataIntegrity hmacData = edRoot.addNewDataIntegrity();
            hmacData.setEncryptedHmacKey(header.getEncryptedHmacKey());
            hmacData.setEncryptedHmacValue(header.getEncryptedHmacValue());
            Iterator i$ = ver.getCertificates().iterator();

            while(i$.hasNext()) {
               AgileEncryptionVerifier.AgileCertificateEntry ace = (AgileEncryptionVerifier.AgileCertificateEntry)i$.next();
               keyEnc = keyEncList.addNewKeyEncryptor();
               keyEnc.setUri(this.certificateUri);
               CTCertificateKeyEncryptor certData = keyEnc.addNewEncryptedCertificateKey();

               try {
                  certData.setX509Certificate(ace.x509.getEncoded());
               } catch (CertificateEncodingException var17) {
                  throw new EncryptedDocumentException(var17);
               }

               certData.setEncryptedKeyValue(ace.encryptedKey);
               certData.setCertVerifier(ace.certVerifier);
            }

            return ed;
         }
      }
   }

   protected void marshallEncryptionDocument(EncryptionDocument ed, LittleEndianByteArrayOutputStream os) {
      XmlOptions xo = new XmlOptions();
      xo.setCharacterEncoding("UTF-8");
      HashMap nsMap = new HashMap();
      nsMap.put(this.passwordUri.toString(), "p");
      nsMap.put(this.certificateUri.toString(), "c");
      xo.setUseDefaultNamespace();
      xo.setSaveSuggestedPrefixes(nsMap);
      xo.setSaveNamespacesFirst();
      xo.setSaveAggressiveNamespaces();
      xo.setSaveNoXmlDecl();
      ByteArrayOutputStream bos = new ByteArrayOutputStream();

      try {
         bos.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n".getBytes("UTF-8"));
         ed.save(bos, xo);
         os.write(bos.toByteArray());
      } catch (IOException var7) {
         throw new EncryptedDocumentException("error marshalling encryption info document", var7);
      }
   }

   protected void createEncryptionInfoEntry(DirectoryNode dir, File tmpFile) throws IOException, GeneralSecurityException {
      DataSpaceMapUtils.addDefaultDataSpace(dir);
      final EncryptionInfo info = this.builder.getInfo();
      EncryptionRecord er = new EncryptionRecord() {
         public void write(LittleEndianByteArrayOutputStream bos) {
            bos.writeShort(info.getVersionMajor());
            bos.writeShort(info.getVersionMinor());
            bos.writeInt(info.getEncryptionFlags());
            EncryptionDocument ed = AgileEncryptor.this.createEncryptionDocument();
            AgileEncryptor.this.marshallEncryptionDocument(ed, bos);
         }
      };
      DataSpaceMapUtils.createEncryptionEntry(dir, "EncryptionInfo", er);
   }

   private class AgileCipherOutputStream extends ChunkedCipherOutputStream {

      public AgileCipherOutputStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
         super(dir, 4096);
      }

      protected Cipher initCipherForBlock(Cipher existing, int block, boolean lastChunk) throws GeneralSecurityException {
         return AgileDecryptor.initCipherForBlock(existing, block, lastChunk, AgileEncryptor.this.builder, AgileEncryptor.this.getSecretKey(), 1);
      }

      protected void calculateChecksum(File fileOut, int oleStreamSize) throws GeneralSecurityException, IOException {
         AgileEncryptor.this.updateIntegrityHMAC(fileOut, oleStreamSize);
      }

      protected void createEncryptionInfoEntry(DirectoryNode dir, File tmpFile) throws IOException, GeneralSecurityException {
         AgileEncryptor.this.createEncryptionInfoEntry(dir, tmpFile);
      }
   }

   // $FF: synthetic class
   static class NamelessClass1488624554 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$poifs$crypt$ChainingMode = new int[ChainingMode.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$poifs$crypt$ChainingMode[ChainingMode.cbc.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$ChainingMode[ChainingMode.cfb.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
