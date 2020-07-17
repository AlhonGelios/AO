package org.apache.poi.poifs.crypt.dsig.facets;

import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.Map.Entry;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignatureException;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.dsig.SignatureConfig;
import org.apache.poi.poifs.crypt.dsig.facets.SignatureFacet;
import org.apache.poi.poifs.crypt.dsig.services.SignaturePolicyService;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.etsi.uri.x01903.v13.AnyType;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.etsi.uri.x01903.v13.CertIDType;
import org.etsi.uri.x01903.v13.ClaimedRolesListType;
import org.etsi.uri.x01903.v13.DataObjectFormatType;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.etsi.uri.x01903.v13.IdentifierType;
import org.etsi.uri.x01903.v13.ObjectIdentifierType;
import org.etsi.uri.x01903.v13.QualifyingPropertiesDocument;
import org.etsi.uri.x01903.v13.QualifyingPropertiesType;
import org.etsi.uri.x01903.v13.SigPolicyQualifiersListType;
import org.etsi.uri.x01903.v13.SignaturePolicyIdType;
import org.etsi.uri.x01903.v13.SignaturePolicyIdentifierType;
import org.etsi.uri.x01903.v13.SignedDataObjectPropertiesType;
import org.etsi.uri.x01903.v13.SignedPropertiesType;
import org.etsi.uri.x01903.v13.SignedSignaturePropertiesType;
import org.etsi.uri.x01903.v13.SignerRoleType;
import org.etsi.uri.x01903.v13.DataObjectFormatType.Factory;
import org.w3.x2000.x09.xmldsig.DigestMethodType;
import org.w3.x2000.x09.xmldsig.X509IssuerSerialType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XAdESSignatureFacet extends SignatureFacet {

   private static final POILogger LOG = POILogFactory.getLogger(XAdESSignatureFacet.class);
   private static final String XADES_TYPE = "http://uri.etsi.org/01903#SignedProperties";
   private Map dataObjectFormatMimeTypes = new HashMap();


   public void preSign(Document document, List references, List objects) throws XMLSignatureException {
      LOG.log(1, new Object[]{"preSign"});
      QualifyingPropertiesDocument qualDoc = QualifyingPropertiesDocument.Factory.newInstance();
      QualifyingPropertiesType qualifyingProperties = qualDoc.addNewQualifyingProperties();
      qualifyingProperties.setTarget("#" + this.signatureConfig.getPackageSignatureId());
      SignedPropertiesType signedProperties = qualifyingProperties.addNewSignedProperties();
      signedProperties.setId(this.signatureConfig.getXadesSignatureId());
      SignedSignaturePropertiesType signedSignatureProperties = signedProperties.addNewSignedSignatureProperties();
      Calendar xmlGregorianCalendar = Calendar.getInstance(TimeZone.getTimeZone("Z"), Locale.ROOT);
      xmlGregorianCalendar.setTime(this.signatureConfig.getExecutionTime());
      xmlGregorianCalendar.clear(14);
      signedSignatureProperties.setSigningTime(xmlGregorianCalendar);
      if(this.signatureConfig.getSigningCertificateChain() != null && !this.signatureConfig.getSigningCertificateChain().isEmpty()) {
         CertIDListType signingCertificates = signedSignatureProperties.addNewSigningCertificate();
         CertIDType certId = signingCertificates.addNewCert();
         X509Certificate certificate = (X509Certificate)this.signatureConfig.getSigningCertificateChain().get(0);
         setCertID(certId, this.signatureConfig, this.signatureConfig.isXadesIssuerNameNoReverseOrder(), certificate);
         String role = this.signatureConfig.getXadesRole();
         if(role != null && !role.isEmpty()) {
            SignerRoleType policyService = signedSignatureProperties.addNewSignerRole();
            signedSignatureProperties.setSignerRole(policyService);
            ClaimedRolesListType xadesObjectContent = policyService.addNewClaimedRoles();
            AnyType qualDocElSrc = xadesObjectContent.addNewClaimedRole();
            XmlString qualDocEl = XmlString.Factory.newInstance();
            qualDocEl.setStringValue(role);
            insertXChild(qualDocElSrc, qualDocEl);
         }

         SignaturePolicyService policyService1 = this.signatureConfig.getSignaturePolicyService();
         SignaturePolicyIdentifierType xadesObjectContent1;
         if(policyService1 != null) {
            xadesObjectContent1 = signedSignatureProperties.addNewSignaturePolicyIdentifier();
            SignaturePolicyIdType qualDocElSrc1 = xadesObjectContent1.addNewSignaturePolicyId();
            ObjectIdentifierType qualDocEl1 = qualDocElSrc1.addNewSigPolicyId();
            qualDocEl1.setDescription(policyService1.getSignaturePolicyDescription());
            IdentifierType xadesObject = qualDocEl1.addNewIdentifier();
            xadesObject.setStringValue(policyService1.getSignaturePolicyIdentifier());
            byte[] transforms = policyService1.getSignaturePolicyDocument();
            DigestAlgAndValueType exclusiveTransform = qualDocElSrc1.addNewSigPolicyHash();
            setDigestAlgAndValue(exclusiveTransform, transforms, this.signatureConfig.getDigestAlgo());
            String reference = policyService1.getSignaturePolicyDownloadUrl();
            if(null != reference) {
               SigPolicyQualifiersListType sigPolicyQualifiers = qualDocElSrc1.addNewSigPolicyQualifiers();
               AnyType sigPolicyQualifier = sigPolicyQualifiers.addNewSigPolicyQualifier();
               XmlString spUriElement = XmlString.Factory.newInstance();
               spUriElement.setStringValue(reference);
               insertXChild(sigPolicyQualifier, spUriElement);
            }
         } else if(this.signatureConfig.isXadesSignaturePolicyImplied()) {
            xadesObjectContent1 = signedSignatureProperties.addNewSignaturePolicyIdentifier();
            xadesObjectContent1.addNewSignaturePolicyImplied();
         }

         if(!this.dataObjectFormatMimeTypes.isEmpty()) {
            SignedDataObjectPropertiesType xadesObjectContent2 = signedProperties.addNewSignedDataObjectProperties();
            List qualDocElSrc2 = xadesObjectContent2.getDataObjectFormatList();
            Iterator qualDocEl2 = this.dataObjectFormatMimeTypes.entrySet().iterator();

            while(qualDocEl2.hasNext()) {
               Entry xadesObject1 = (Entry)qualDocEl2.next();
               DataObjectFormatType transforms1 = Factory.newInstance();
               transforms1.setObjectReference("#" + (String)xadesObject1.getKey());
               transforms1.setMimeType((String)xadesObject1.getValue());
               qualDocElSrc2.add(transforms1);
            }
         }

         ArrayList xadesObjectContent3 = new ArrayList();
         Element qualDocElSrc3 = (Element)qualifyingProperties.getDomNode();
         Element qualDocEl3 = (Element)document.importNode(qualDocElSrc3, true);
         xadesObjectContent3.add(new DOMStructure(qualDocEl3));
         XMLObject xadesObject2 = this.getSignatureFactory().newXMLObject(xadesObjectContent3, (String)null, (String)null, (String)null);
         objects.add(xadesObject2);
         ArrayList transforms2 = new ArrayList();
         Transform exclusiveTransform1 = this.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
         transforms2.add(exclusiveTransform1);
         Reference reference1 = this.newReference("#" + this.signatureConfig.getXadesSignatureId(), transforms2, "http://uri.etsi.org/01903#SignedProperties", (String)null, (byte[])null);
         references.add(reference1);
      } else {
         throw new RuntimeException("no signing certificate chain available");
      }
   }

   protected static void setDigestAlgAndValue(DigestAlgAndValueType digestAlgAndValue, byte[] data, HashAlgorithm digestAlgo) {
      DigestMethodType digestMethod = digestAlgAndValue.addNewDigestMethod();
      digestMethod.setAlgorithm(SignatureConfig.getDigestMethodUri(digestAlgo));
      MessageDigest messageDigest = CryptoFunctions.getMessageDigest(digestAlgo);
      byte[] digestValue = messageDigest.digest(data);
      digestAlgAndValue.setDigestValue(digestValue);
   }

   protected static void setCertID(CertIDType certId, SignatureConfig signatureConfig, boolean issuerNameNoReverseOrder, X509Certificate certificate) {
      X509IssuerSerialType issuerSerial = certId.addNewIssuerSerial();
      String issuerName;
      if(issuerNameNoReverseOrder) {
         issuerName = certificate.getIssuerDN().getName().replace(",", ", ");
      } else {
         issuerName = certificate.getIssuerX500Principal().toString();
      }

      issuerSerial.setX509IssuerName(issuerName);
      issuerSerial.setX509SerialNumber(certificate.getSerialNumber());

      byte[] encodedCertificate;
      try {
         encodedCertificate = certificate.getEncoded();
      } catch (CertificateEncodingException var8) {
         throw new RuntimeException("certificate encoding error: " + var8.getMessage(), var8);
      }

      DigestAlgAndValueType certDigest = certId.addNewCertDigest();
      setDigestAlgAndValue(certDigest, encodedCertificate, signatureConfig.getXadesDigestAlgo());
   }

   public void addMimeType(String dsReferenceUri, String mimetype) {
      this.dataObjectFormatMimeTypes.put(dsReferenceUri, mimetype);
   }

   protected static void insertXChild(XmlObject root, XmlObject child) {
      XmlCursor rootCursor = root.newCursor();
      rootCursor.toEndToken();
      XmlCursor childCursor = child.newCursor();
      childCursor.toNextToken();
      childCursor.moveXml(rootCursor);
      childCursor.dispose();
      rootCursor.dispose();
   }

}
