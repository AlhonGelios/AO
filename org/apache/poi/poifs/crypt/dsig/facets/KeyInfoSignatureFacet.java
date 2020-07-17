package org.apache.poi.poifs.crypt.dsig.facets;

import java.security.Key;
import java.security.KeyException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import org.apache.jcp.xml.dsig.internal.dom.DOMKeyInfo;
import org.apache.poi.poifs.crypt.dsig.facets.SignatureFacet;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class KeyInfoSignatureFacet extends SignatureFacet {

   private static final POILogger LOG = POILogFactory.getLogger(KeyInfoSignatureFacet.class);


   public void postSign(Document document) throws MarshalException {
      LOG.log(1, new Object[]{"postSign"});
      NodeList nl = document.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Object");
      Node nextSibling = nl.getLength() == 0?null:nl.item(0);
      KeyInfoFactory keyInfoFactory = this.signatureConfig.getKeyInfoFactory();
      ArrayList x509DataObjects = new ArrayList();
      X509Certificate signingCertificate = (X509Certificate)this.signatureConfig.getSigningCertificateChain().get(0);
      ArrayList keyInfoContent = new ArrayList();
      if(this.signatureConfig.isIncludeKeyValue()) {
         KeyValue keyInfo;
         try {
            keyInfo = keyInfoFactory.newKeyValue(signingCertificate.getPublicKey());
         } catch (KeyException var15) {
            throw new RuntimeException("key exception: " + var15.getMessage(), var15);
         }

         keyInfoContent.add(keyInfo);
      }

      if(this.signatureConfig.isIncludeIssuerSerial()) {
         x509DataObjects.add(keyInfoFactory.newX509IssuerSerial(signingCertificate.getIssuerX500Principal().toString(), signingCertificate.getSerialNumber()));
      }

      if(this.signatureConfig.isIncludeEntireCertificateChain()) {
         x509DataObjects.addAll(this.signatureConfig.getSigningCertificateChain());
      } else {
         x509DataObjects.add(signingCertificate);
      }

      if(!x509DataObjects.isEmpty()) {
         X509Data keyInfo1 = keyInfoFactory.newX509Data(x509DataObjects);
         keyInfoContent.add(keyInfo1);
      }

      KeyInfo keyInfo2 = keyInfoFactory.newKeyInfo(keyInfoContent);
      DOMKeyInfo domKeyInfo = (DOMKeyInfo)keyInfo2;
      Key key = new Key() {

         private static final long serialVersionUID = 1L;

         public String getAlgorithm() {
            return null;
         }
         public byte[] getEncoded() {
            return null;
         }
         public String getFormat() {
            return null;
         }
      };
      Element n = document.getDocumentElement();
      DOMSignContext domSignContext = nextSibling == null?new DOMSignContext(key, n):new DOMSignContext(key, n, nextSibling);
      Iterator domStructure = this.signatureConfig.getNamespacePrefixes().entrySet().iterator();

      while(domStructure.hasNext()) {
         Entry kiNl = (Entry)domStructure.next();
         domSignContext.putNamespacePrefix((String)kiNl.getKey(), (String)kiNl.getValue());
      }

      DOMStructure domStructure1 = new DOMStructure(n);
      domKeyInfo.marshal(domStructure1, domSignContext);
      if(nextSibling != null) {
         NodeList kiNl1 = document.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
         if(kiNl1.getLength() != 1) {
            throw new RuntimeException("KeyInfo wasn\'t set");
         }

         nextSibling.getParentNode().insertBefore(kiNl1.item(0), nextSibling);
      }

   }

}
