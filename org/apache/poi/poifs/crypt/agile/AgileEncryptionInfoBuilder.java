package org.apache.poi.poifs.crypt.agile;

import com.microsoft.schemas.office.x2006.encryption.EncryptionDocument;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.crypt.EncryptionInfoBuilder;
import org.apache.poi.poifs.crypt.EncryptionMode;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.agile.AgileDecryptor;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionHeader;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionVerifier;
import org.apache.poi.poifs.crypt.agile.AgileEncryptor;
import org.apache.poi.util.LittleEndianInput;
import org.apache.xmlbeans.XmlException;

public class AgileEncryptionInfoBuilder implements EncryptionInfoBuilder {

   EncryptionInfo info;
   AgileEncryptionHeader header;
   AgileEncryptionVerifier verifier;
   AgileDecryptor decryptor;
   AgileEncryptor encryptor;


   public void initialize(EncryptionInfo ei, LittleEndianInput dis) throws IOException {
      this.info = ei;
      EncryptionDocument ed = parseDescriptor((InputStream)dis);
      this.header = new AgileEncryptionHeader(ed);
      this.verifier = new AgileEncryptionVerifier(ed);
      if(ei.getVersionMajor() == EncryptionMode.agile.versionMajor && ei.getVersionMinor() == EncryptionMode.agile.versionMinor) {
         this.decryptor = new AgileDecryptor(this);
         this.encryptor = new AgileEncryptor(this);
      }

   }

   public void initialize(EncryptionInfo ei, CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.info = ei;
      if(cipherAlgorithm == null) {
         cipherAlgorithm = CipherAlgorithm.aes128;
      }

      if(cipherAlgorithm == CipherAlgorithm.rc4) {
         throw new EncryptedDocumentException("RC4 must not be used with agile encryption.");
      } else {
         if(hashAlgorithm == null) {
            hashAlgorithm = HashAlgorithm.sha1;
         }

         if(chainingMode == null) {
            chainingMode = ChainingMode.cbc;
         }

         if(chainingMode != ChainingMode.cbc && chainingMode != ChainingMode.cfb) {
            throw new EncryptedDocumentException("Agile encryption only supports CBC/CFB chaining.");
         } else {
            if(keyBits == -1) {
               keyBits = cipherAlgorithm.defaultKeySize;
            }

            if(blockSize == -1) {
               blockSize = cipherAlgorithm.blockSize;
            }

            boolean found = false;
            int[] arr$ = cipherAlgorithm.allowedKeySize;
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               int ks = arr$[i$];
               found |= ks == keyBits;
            }

            if(!found) {
               throw new EncryptedDocumentException("KeySize " + keyBits + " not allowed for Cipher " + cipherAlgorithm.toString());
            } else {
               this.header = new AgileEncryptionHeader(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
               this.verifier = new AgileEncryptionVerifier(cipherAlgorithm, hashAlgorithm, keyBits, blockSize, chainingMode);
               this.decryptor = new AgileDecryptor(this);
               this.encryptor = new AgileEncryptor(this);
            }
         }
      }
   }

   public AgileEncryptionHeader getHeader() {
      return this.header;
   }

   public AgileEncryptionVerifier getVerifier() {
      return this.verifier;
   }

   public AgileDecryptor getDecryptor() {
      return this.decryptor;
   }

   public AgileEncryptor getEncryptor() {
      return this.encryptor;
   }

   protected EncryptionInfo getInfo() {
      return this.info;
   }

   protected static EncryptionDocument parseDescriptor(String descriptor) {
      try {
         return EncryptionDocument.Factory.parse(descriptor, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      } catch (XmlException var2) {
         throw new EncryptedDocumentException("Unable to parse encryption descriptor", var2);
      }
   }

   protected static EncryptionDocument parseDescriptor(InputStream descriptor) {
      try {
         return EncryptionDocument.Factory.parse(descriptor, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      } catch (Exception var2) {
         throw new EncryptedDocumentException("Unable to parse encryption descriptor", var2);
      }
   }
}
