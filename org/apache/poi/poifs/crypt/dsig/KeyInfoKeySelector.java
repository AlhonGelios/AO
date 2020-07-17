package org.apache.poi.poifs.crypt.dsig;

import java.security.Key;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.crypto.AlgorithmMethod;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.KeySelectorResult;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.KeySelector.Purpose;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class KeyInfoKeySelector extends KeySelector implements KeySelectorResult {

   private static final POILogger LOG = POILogFactory.getLogger(KeyInfoKeySelector.class);
   private List certChain = new ArrayList();


   public KeySelectorResult select(KeyInfo keyInfo, Purpose purpose, AlgorithmMethod method, XMLCryptoContext context) throws KeySelectorException {
      LOG.log(1, new Object[]{"select key"});
      if(null == keyInfo) {
         throw new KeySelectorException("no ds:KeyInfo present");
      } else {
         List keyInfoContent = keyInfo.getContent();
         this.certChain.clear();
         Iterator i$ = keyInfoContent.iterator();

         while(i$.hasNext()) {
            XMLStructure keyInfoStructure = (XMLStructure)i$.next();
            if(keyInfoStructure instanceof X509Data) {
               X509Data x509Data = (X509Data)keyInfoStructure;
               List x509DataList = x509Data.getContent();
               Iterator i$1 = x509DataList.iterator();

               while(i$1.hasNext()) {
                  Object x509DataObject = i$1.next();
                  if(x509DataObject instanceof X509Certificate) {
                     X509Certificate certificate = (X509Certificate)x509DataObject;
                     LOG.log(1, new Object[]{"certificate", certificate.getSubjectX500Principal()});
                     this.certChain.add(certificate);
                  }
               }
            }
         }

         if(this.certChain.isEmpty()) {
            throw new KeySelectorException("No key found!");
         } else {
            return this;
         }
      }
   }

   public Key getKey() {
      return this.certChain.isEmpty()?null:((X509Certificate)this.certChain.get(0)).getPublicKey();
   }

   public X509Certificate getSigner() {
      return this.certChain.isEmpty()?null:(X509Certificate)this.certChain.get(0);
   }

   public List getCertChain() {
      return this.certChain;
   }

}
