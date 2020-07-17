package org.apache.poi.poifs.crypt.cryptoapi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionHeader;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.EncryptionVerifier;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionInfoBuilder;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.util.BitField;
import org.apache.poi.util.BitFieldFactory;
import org.apache.poi.util.BoundedInputStream;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.LittleEndianInputStream;
import org.apache.poi.util.StringUtil;

public class CryptoAPIDecryptor extends Decryptor {

   private long _length = -1L;


   protected CryptoAPIDecryptor(CryptoAPIEncryptionInfoBuilder builder) {
      super(builder);
   }

   public boolean verifyPassword(String password) {
      EncryptionVerifier ver = this.builder.getVerifier();
      SecretKey skey = generateSecretKey(password, ver);

      try {
         Cipher e = initCipherForBlock((Cipher)null, 0, this.builder, skey, 2);
         byte[] encryptedVerifier = ver.getEncryptedVerifier();
         byte[] verifier = new byte[encryptedVerifier.length];
         e.update(encryptedVerifier, 0, encryptedVerifier.length, verifier);
         this.setVerifier(verifier);
         byte[] encryptedVerifierHash = ver.getEncryptedVerifierHash();
         byte[] verifierHash = e.doFinal(encryptedVerifierHash);
         HashAlgorithm hashAlgo = ver.getHashAlgorithm();
         MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
         byte[] calcVerifierHash = hashAlg.digest(verifier);
         if(Arrays.equals(calcVerifierHash, verifierHash)) {
            this.setSecretKey(skey);
            return true;
         } else {
            return false;
         }
      } catch (GeneralSecurityException var12) {
         throw new EncryptedDocumentException(var12);
      }
   }

   public Cipher initCipherForBlock(Cipher cipher, int block) throws GeneralSecurityException {
      return initCipherForBlock(cipher, block, this.builder, this.getSecretKey(), 2);
   }

   protected static Cipher initCipherForBlock(Cipher cipher, int block, EncryptionInfoBuilder builder, SecretKey skey, int encryptMode) throws GeneralSecurityException {
      EncryptionVerifier ver = builder.getVerifier();
      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      byte[] blockKey = new byte[4];
      LittleEndian.putUInt(blockKey, 0, (long)block);
      MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
      hashAlg.update(skey.getEncoded());
      byte[] encKey = hashAlg.digest(blockKey);
      EncryptionHeader header = builder.getHeader();
      int keyBits = header.getKeySize();
      encKey = CryptoFunctions.getBlock0(encKey, keyBits / 8);
      if(keyBits == 40) {
         encKey = CryptoFunctions.getBlock0(encKey, 16);
      }

      SecretKeySpec key = new SecretKeySpec(encKey, skey.getAlgorithm());
      if(cipher == null) {
         cipher = CryptoFunctions.getCipher(key, header.getCipherAlgorithm(), (ChainingMode)null, (byte[])null, encryptMode);
      } else {
         cipher.init(encryptMode, key);
      }

      return cipher;
   }

   protected static SecretKey generateSecretKey(String password, EncryptionVerifier ver) {
      if(password.length() > 255) {
         password = password.substring(0, 255);
      }

      HashAlgorithm hashAlgo = ver.getHashAlgorithm();
      MessageDigest hashAlg = CryptoFunctions.getMessageDigest(hashAlgo);
      hashAlg.update(ver.getSalt());
      byte[] hash = hashAlg.digest(StringUtil.getToUnicodeLE(password));
      SecretKeySpec skey = new SecretKeySpec(hash, ver.getCipherAlgorithm().jceId);
      return skey;
   }

   public InputStream getDataStream(DirectoryNode dir) throws IOException, GeneralSecurityException {
      NPOIFSFileSystem fsOut = new NPOIFSFileSystem();
      DocumentNode es = (DocumentNode)dir.getEntry("EncryptedSummary");
      DocumentInputStream dis = dir.createDocumentInputStream((Entry)es);
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      IOUtils.copy(dis, bos);
      dis.close();
      CryptoAPIDecryptor.SeekableByteArrayInputStream sbis = new CryptoAPIDecryptor.SeekableByteArrayInputStream(bos.toByteArray());
      LittleEndianInputStream leis = new LittleEndianInputStream(sbis);
      int streamDescriptorArrayOffset = (int)leis.readUInt();
      leis.readUInt();
      sbis.skip((long)(streamDescriptorArrayOffset - 8));
      sbis.setBlock(0);
      int encryptedStreamDescriptorCount = (int)leis.readUInt();
      CryptoAPIDecryptor.StreamDescriptorEntry[] entries = new CryptoAPIDecryptor.StreamDescriptorEntry[encryptedStreamDescriptorCount];

      int i$;
      for(int bis = 0; bis < encryptedStreamDescriptorCount; ++bis) {
         CryptoAPIDecryptor.StreamDescriptorEntry len$ = new CryptoAPIDecryptor.StreamDescriptorEntry();
         entries[bis] = len$;
         len$.streamOffset = (int)leis.readUInt();
         len$.streamSize = (int)leis.readUInt();
         len$.block = leis.readUShort();
         i$ = leis.readUByte();
         len$.flags = leis.readUByte();
         len$.reserved2 = leis.readInt();
         len$.streamName = StringUtil.readUnicodeLE(leis, i$);
         leis.readShort();

         assert len$.streamName.length() == i$;
      }

      CryptoAPIDecryptor.StreamDescriptorEntry[] var16 = entries;
      int var18 = entries.length;

      for(i$ = 0; i$ < var18; ++i$) {
         CryptoAPIDecryptor.StreamDescriptorEntry entry = var16[i$];
         sbis.seek(entry.streamOffset);
         sbis.setBlock(entry.block);
         BoundedInputStream is = new BoundedInputStream(sbis, (long)entry.streamSize);
         fsOut.createDocument(is, entry.streamName);
         is.close();
      }

      leis.close();
      sbis.close();
      sbis = null;
      bos.reset();
      fsOut.writeFilesystem(bos);
      fsOut.close();
      this._length = (long)bos.size();
      ByteArrayInputStream var17 = new ByteArrayInputStream(bos.toByteArray());
      return var17;
   }

   public long getLength() {
      if(this._length == -1L) {
         throw new IllegalStateException("Decryptor.getDataStream() was not called");
      } else {
         return this._length;
      }
   }


   static class StreamDescriptorEntry {

      static BitField flagStream = BitFieldFactory.getInstance(1);
      int streamOffset;
      int streamSize;
      int block;
      int flags;
      int reserved2;
      String streamName;


   }

   private class SeekableByteArrayInputStream extends ByteArrayInputStream {

      Cipher cipher = CryptoAPIDecryptor.this.initCipherForBlock((Cipher)null, 0);
      byte[] oneByte = new byte[]{(byte)0};


      public void seek(int newpos) {
         if(newpos > this.count) {
            throw new ArrayIndexOutOfBoundsException(newpos);
         } else {
            this.pos = newpos;
            this.mark = newpos;
         }
      }

      public void setBlock(int block) throws GeneralSecurityException {
         this.cipher = CryptoAPIDecryptor.this.initCipherForBlock(this.cipher, block);
      }

      public synchronized int read() {
         int ch = super.read();
         if(ch == -1) {
            return -1;
         } else {
            this.oneByte[0] = (byte)ch;

            try {
               this.cipher.update(this.oneByte, 0, 1, this.oneByte);
            } catch (ShortBufferException var3) {
               throw new EncryptedDocumentException(var3);
            }

            return this.oneByte[0];
         }
      }

      public synchronized int read(byte[] b, int off, int len) {
         int readLen = super.read(b, off, len);
         if(readLen == -1) {
            return -1;
         } else {
            try {
               this.cipher.update(b, off, readLen, b, off);
               return readLen;
            } catch (ShortBufferException var6) {
               throw new EncryptedDocumentException(var6);
            }
         }
      }

      public SeekableByteArrayInputStream(byte[] buf) throws GeneralSecurityException {
         super(buf);
      }
   }
}
