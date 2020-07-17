package org.apache.poi.poifs.crypt.cryptoapi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.PropertySetFactory;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.DataSpaceMapUtils;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.Encryptor;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIDecryptor;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionHeader;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionVerifier;
import org.apache.poi.poifs.crypt.standard.EncryptionRecord;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.LittleEndianByteArrayOutputStream;
import org.apache.poi.util.StringUtil;

public class CryptoAPIEncryptor extends Encryptor {

   private final CryptoAPIEncryptionInfoBuilder builder;


   protected CryptoAPIEncryptor(CryptoAPIEncryptionInfoBuilder builder) {
      this.builder = builder;
   }

   public void confirmPassword(String password) {
      SecureRandom r = new SecureRandom();
      byte[] salt = new byte[16];
      byte[] verifier = new byte[16];
      r.nextBytes(salt);
      r.nextBytes(verifier);
      this.confirmPassword(password, (byte[])null, (byte[])null, verifier, salt, (byte[])null);
   }

   public void confirmPassword(String password, byte[] keySpec, byte[] keySalt, byte[] verifier, byte[] verifierSalt, byte[] integritySalt) {
      assert verifier != null && verifierSalt != null;

      CryptoAPIEncryptionVerifier ver = this.builder.getVerifier();
      ver.setSalt(verifierSalt);
      SecretKey skey = CryptoAPIDecryptor.generateSecretKey(password, ver);
      this.setSecretKey(skey);

      try {
         Cipher e = this.initCipherForBlock((Cipher)null, 0);
         byte[] encryptedVerifier = new byte[verifier.length];
         e.update(verifier, 0, verifier.length, encryptedVerifier);
         ver.setEncryptedVerifier(encryptedVerifier);
         HashAlgorithm hashAlgo = ver.getHashAlgorithm();
         MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
         byte[] calcVerifierHash = hashAlg.digest(verifier);
         byte[] encryptedVerifierHash = e.doFinal(calcVerifierHash);
         ver.setEncryptedVerifierHash(encryptedVerifierHash);
      } catch (GeneralSecurityException var15) {
         throw new EncryptedDocumentException("Password confirmation failed", var15);
      }
   }

   public Cipher initCipherForBlock(Cipher cipher, int block) throws GeneralSecurityException {
      return CryptoAPIDecryptor.initCipherForBlock(cipher, block, this.builder, this.getSecretKey(), 1);
   }

   public OutputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      CryptoAPIEncryptor.CipherByteArrayOutputStream bos = new CryptoAPIEncryptor.CipherByteArrayOutputStream();
      byte[] buf = new byte[8];
      bos.write(buf, 0, 8);
      String[] entryNames = new String[]{"SummaryInformation", "DocumentSummaryInformation"};
      ArrayList descList = new ArrayList();
      int block = 0;
      String[] streamDescriptorArrayOffset = entryNames;
      int savedSize = entryNames.length;

      int streamDescriptorArraySize;
      for(streamDescriptorArraySize = 0; streamDescriptorArraySize < savedSize; ++streamDescriptorArraySize) {
         String dsi = streamDescriptorArrayOffset[streamDescriptorArraySize];
         if(dir.hasEntry(dsi)) {
            CryptoAPIDecryptor.StreamDescriptorEntry e = new CryptoAPIDecryptor.StreamDescriptorEntry();
            e.block = block;
            e.streamOffset = bos.size();
            e.streamName = dsi;
            e.flags = CryptoAPIDecryptor.StreamDescriptorEntry.flagStream.setValue(0, 1);
            e.reserved2 = 0;
            bos.setBlock(block);
            DocumentInputStream dis = dir.createDocumentInputStream(dsi);
            IOUtils.copy(dis, bos);
            dis.close();
            e.streamSize = bos.size() - e.streamOffset;
            descList.add(e);
            dir.getEntry(dsi).delete();
            ++block;
         }
      }

      int var14 = bos.size();
      bos.setBlock(0);
      LittleEndian.putUInt(buf, 0, (long)descList.size());
      bos.write(buf, 0, 4);
      Iterator var15 = descList.iterator();

      while(var15.hasNext()) {
         CryptoAPIDecryptor.StreamDescriptorEntry var16 = (CryptoAPIDecryptor.StreamDescriptorEntry)var15.next();
         LittleEndian.putUInt(buf, 0, (long)var16.streamOffset);
         bos.write(buf, 0, 4);
         LittleEndian.putUInt(buf, 0, (long)var16.streamSize);
         bos.write(buf, 0, 4);
         LittleEndian.putUShort(buf, 0, var16.block);
         bos.write(buf, 0, 2);
         LittleEndian.putUByte(buf, 0, (short)var16.streamName.length());
         bos.write(buf, 0, 1);
         LittleEndian.putUByte(buf, 0, (short)var16.flags);
         bos.write(buf, 0, 1);
         LittleEndian.putUInt(buf, 0, (long)var16.reserved2);
         bos.write(buf, 0, 4);
         byte[] var17 = StringUtil.getToUnicodeLE(var16.streamName);
         bos.write(var17, 0, var17.length);
         LittleEndian.putShort(buf, 0, (short)0);
         bos.write(buf, 0, 2);
      }

      savedSize = bos.size();
      streamDescriptorArraySize = savedSize - var14;
      LittleEndian.putUInt(buf, 0, (long)var14);
      LittleEndian.putUInt(buf, 4, (long)streamDescriptorArraySize);
      bos.reset();
      bos.setBlock(0);
      bos.write(buf, 0, 8);
      bos.setSize(savedSize);
      dir.createDocument("EncryptedSummary", new ByteArrayInputStream(bos.getBuf(), 0, savedSize));
      DocumentSummaryInformation var18 = PropertySetFactory.newDocumentSummaryInformation();

      try {
         var18.write(dir, "DocumentSummaryInformation");
         return bos;
      } catch (WritingNotSupportedException var13) {
         throw new IOException(var13);
      }
   }

   protected int getKeySizeInBytes() {
      return this.builder.getHeader().getKeySize() / 8;
   }

   protected void createEncryptionInfoEntry(DirectoryNode dir) throws IOException {
      DataSpaceMapUtils.addDefaultDataSpace(dir);
      final EncryptionInfo info = this.builder.getEncryptionInfo();
      final CryptoAPIEncryptionHeader header = this.builder.getHeader();
      final CryptoAPIEncryptionVerifier verifier = this.builder.getVerifier();
      EncryptionRecord er = new EncryptionRecord() {
         public void write(LittleEndianByteArrayOutputStream bos) {
            bos.writeShort(info.getVersionMajor());
            bos.writeShort(info.getVersionMinor());
            header.write(bos);
            verifier.write(bos);
         }
      };
      DataSpaceMapUtils.createEncryptionEntry(dir, "EncryptionInfo", er);
   }


   private class CipherByteArrayOutputStream extends ByteArrayOutputStream {

      Cipher cipher;
      byte[] oneByte = new byte[]{(byte)0};


      public CipherByteArrayOutputStream() throws GeneralSecurityException {
         this.setBlock(0);
      }

      public byte[] getBuf() {
         return this.buf;
      }

      public void setSize(int count) {
         this.count = count;
      }

      public void setBlock(int block) throws GeneralSecurityException {
         this.cipher = CryptoAPIEncryptor.this.initCipherForBlock(this.cipher, block);
      }

      public void write(int b) {
         try {
            this.oneByte[0] = (byte)b;
            this.cipher.update(this.oneByte, 0, 1, this.oneByte, 0);
            super.write(this.oneByte);
         } catch (Exception var3) {
            throw new EncryptedDocumentException(var3);
         }
      }

      public void write(byte[] b, int off, int len) {
         try {
            this.cipher.update(b, off, len, b, off);
            super.write(b, off, len);
         } catch (Exception var5) {
            throw new EncryptedDocumentException(var5);
         }
      }
   }
}
