package org.apache.poi.poifs.crypt.agile;

import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
import com.microsoft.schemas.office.x2006.encryption.EncryptionDocument;
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor;
import com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.crypt.ChainingMode;
import org.apache.poi.poifs.crypt.CipherAlgorithm;
import org.apache.poi.poifs.crypt.EncryptionVerifier;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.agile.AgileEncryptionInfoBuilder;

public class AgileEncryptionVerifier extends EncryptionVerifier {

   private List certList;


   public AgileEncryptionVerifier(String descriptor) {
      this(AgileEncryptionInfoBuilder.parseDescriptor(descriptor));
   }

   protected AgileEncryptionVerifier(EncryptionDocument ed) {
      this.certList = new ArrayList();
      Iterator encList = ed.getEncryption().getKeyEncryptors().getKeyEncryptorList().iterator();

      CTPasswordKeyEncryptor keyData;
      try {
         keyData = ((CTKeyEncryptor)encList.next()).getEncryptedPasswordKey();
         if(keyData == null) {
            throw new NullPointerException("encryptedKey not set");
         }
      } catch (Exception var13) {
         throw new EncryptedDocumentException("Unable to parse keyData", var13);
      }

      int keyBits = (int)keyData.getKeyBits();
      CipherAlgorithm ca = CipherAlgorithm.fromXmlId(keyData.getCipherAlgorithm().toString(), keyBits);
      this.setCipherAlgorithm(ca);
      int hashSize = keyData.getHashSize();
      HashAlgorithm ha = HashAlgorithm.fromEcmaId(keyData.getHashAlgorithm().toString());
      this.setHashAlgorithm(ha);
      if(this.getHashAlgorithm().hashSize != hashSize) {
         throw new EncryptedDocumentException("Unsupported hash algorithm: " + keyData.getHashAlgorithm() + " @ " + hashSize + " bytes");
      } else {
         this.setSpinCount(keyData.getSpinCount());
         this.setEncryptedVerifier(keyData.getEncryptedVerifierHashInput());
         this.setSalt(keyData.getSaltValue());
         this.setEncryptedKey(keyData.getEncryptedKeyValue());
         this.setEncryptedVerifierHash(keyData.getEncryptedVerifierHashValue());
         int saltSize = keyData.getSaltSize();
         if(saltSize != this.getSalt().length) {
            throw new EncryptedDocumentException("Invalid salt size");
         } else {
            switch(keyData.getCipherChaining().intValue()) {
            case 1:
               this.setChainingMode(ChainingMode.cbc);
               break;
            case 2:
               this.setChainingMode(ChainingMode.cfb);
               break;
            default:
               throw new EncryptedDocumentException("Unsupported chaining mode - " + keyData.getCipherChaining().toString());
            }

            if(encList.hasNext()) {
               try {
                  CertificateFactory e = CertificateFactory.getInstance("X.509");

                  while(encList.hasNext()) {
                     CTCertificateKeyEncryptor certKey = ((CTKeyEncryptor)encList.next()).getEncryptedCertificateKey();
                     AgileEncryptionVerifier.AgileCertificateEntry ace = new AgileEncryptionVerifier.AgileCertificateEntry();
                     ace.certVerifier = certKey.getCertVerifier();
                     ace.encryptedKey = certKey.getEncryptedKeyValue();
                     ace.x509 = (X509Certificate)e.generateCertificate(new ByteArrayInputStream(certKey.getX509Certificate()));
                     this.certList.add(ace);
                  }

               } catch (GeneralSecurityException var12) {
                  throw new EncryptedDocumentException("can\'t parse X509 certificate", var12);
               }
            }
         }
      }
   }

   public AgileEncryptionVerifier(CipherAlgorithm cipherAlgorithm, HashAlgorithm hashAlgorithm, int keyBits, int blockSize, ChainingMode chainingMode) {
      this.certList = new ArrayList();
      this.setCipherAlgorithm(cipherAlgorithm);
      this.setHashAlgorithm(hashAlgorithm);
      this.setChainingMode(chainingMode);
      this.setSpinCount(100000);
   }

   protected void setSalt(byte[] salt) {
      if(salt != null && salt.length == this.getCipherAlgorithm().blockSize) {
         super.setSalt(salt);
      } else {
         throw new EncryptedDocumentException("invalid verifier salt");
      }
   }

   protected void setEncryptedVerifier(byte[] encryptedVerifier) {
      super.setEncryptedVerifier(encryptedVerifier);
   }

   protected void setEncryptedVerifierHash(byte[] encryptedVerifierHash) {
      super.setEncryptedVerifierHash(encryptedVerifierHash);
   }

   protected void setEncryptedKey(byte[] encryptedKey) {
      super.setEncryptedKey(encryptedKey);
   }

   public void addCertificate(X509Certificate x509) {
      AgileEncryptionVerifier.AgileCertificateEntry ace = new AgileEncryptionVerifier.AgileCertificateEntry();
      ace.x509 = x509;
      this.certList.add(ace);
   }

   public List getCertificates() {
      return this.certList;
   }

   public static class AgileCertificateEntry {

      X509Certificate x509;
      byte[] encryptedKey;
      byte[] certVerifier;


   }
}
