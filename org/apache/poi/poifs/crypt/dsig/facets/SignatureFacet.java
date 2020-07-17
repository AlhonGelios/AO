package org.apache.poi.poifs.crypt.dsig.facets;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.apache.jcp.xml.dsig.internal.dom.DOMDigestMethod;
import org.apache.jcp.xml.dsig.internal.dom.DOMReference;
import org.apache.poi.poifs.crypt.dsig.SignatureConfig;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.SuppressForbidden;
import org.w3c.dom.Document;

public abstract class SignatureFacet implements SignatureConfig.SignatureConfigurable {

   private static final POILogger LOG = POILogFactory.getLogger(SignatureFacet.class);
   public static final String XML_NS = "http://www.w3.org/2000/xmlns/";
   public static final String XML_DIGSIG_NS = "http://www.w3.org/2000/09/xmldsig#";
   public static final String OO_DIGSIG_NS = "http://schemas.openxmlformats.org/package/2006/digital-signature";
   public static final String MS_DIGSIG_NS = "http://schemas.microsoft.com/office/2006/digsig";
   public static final String XADES_132_NS = "http://uri.etsi.org/01903/v1.3.2#";
   public static final String XADES_141_NS = "http://uri.etsi.org/01903/v1.4.1#";
   protected SignatureConfig signatureConfig;


   public void setSignatureConfig(SignatureConfig signatureConfig) {
      this.signatureConfig = signatureConfig;
   }

   public void preSign(Document document, List references, List objects) throws XMLSignatureException {}

   public void postSign(Document document) throws MarshalException {}

   protected XMLSignatureFactory getSignatureFactory() {
      return this.signatureConfig.getSignatureFactory();
   }

   protected Transform newTransform(String canonicalizationMethod) throws XMLSignatureException {
      return this.newTransform(canonicalizationMethod, (TransformParameterSpec)null);
   }

   protected Transform newTransform(String canonicalizationMethod, TransformParameterSpec paramSpec) throws XMLSignatureException {
      try {
         return this.getSignatureFactory().newTransform(canonicalizationMethod, paramSpec);
      } catch (GeneralSecurityException var4) {
         throw new XMLSignatureException("unknown canonicalization method: " + canonicalizationMethod, var4);
      }
   }

   protected Reference newReference(String uri, List transforms, String type, String id, byte[] digestValue) throws XMLSignatureException {
      return newReference(uri, transforms, type, id, digestValue, this.signatureConfig);
   }

   public static Reference newReference(String uri, List transforms, String type, String id, byte[] digestValue, SignatureConfig signatureConfig) throws XMLSignatureException {
      String digestMethodUri = signatureConfig.getDigestMethodUri();
      XMLSignatureFactory sigFac = signatureConfig.getSignatureFactory();

      DigestMethod digestMethod;
      try {
         digestMethod = sigFac.newDigestMethod(digestMethodUri, (DigestMethodParameterSpec)null);
      } catch (GeneralSecurityException var10) {
         throw new XMLSignatureException("unknown digest method uri: " + digestMethodUri, var10);
      }

      Reference reference;
      if(digestValue == null) {
         reference = sigFac.newReference(uri, digestMethod, transforms, type, id);
      } else {
         reference = sigFac.newReference(uri, digestMethod, transforms, type, id, digestValue);
      }

      brokenJvmWorkaround(reference);
      return reference;
   }

   public static void brokenJvmWorkaround(final Reference reference) {
      final DigestMethod digestMethod = reference.getDigestMethod();
      String digestMethodUri = digestMethod.getAlgorithm();
      final Provider bcProv = Security.getProvider("BC");
      if(bcProv != null && !"http://www.w3.org/2000/09/xmldsig#sha1".equals(digestMethodUri)) {
         AccessController.doPrivileged(new PrivilegedAction() {
            @SuppressForbidden("Workaround for a bug, needs access to private JDK members (may fail in Java 9): https://bugzilla.redhat.com/show_bug.cgi?id=1155012")
            public Void run() {
               try {
                  Method e = DOMDigestMethod.class.getDeclaredMethod("getMessageDigestAlgorithm", new Class[0]);
                  e.setAccessible(true);
                  String mdAlgo = (String)e.invoke(digestMethod, new Object[0]);
                  MessageDigest md = MessageDigest.getInstance(mdAlgo, bcProv);
                  Field f = DOMReference.class.getDeclaredField("md");
                  f.setAccessible(true);
                  f.set(reference, md);
               } catch (Exception var5) {
                  SignatureFacet.LOG.log(5, new Object[]{"Can\'t overwrite message digest (workaround for https://bugzilla.redhat.com/show_bug.cgi?id=1155012)", var5});
               }

               return null;
            }
         });
      }

   }

}
