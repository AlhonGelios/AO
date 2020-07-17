package org.apache.poi.poifs.crypt.dsig.facets;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import javax.xml.crypto.MarshalException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.poifs.crypt.dsig.facets.SignatureFacet;
import org.apache.poi.poifs.crypt.dsig.facets.XAdESSignatureFacet;
import org.apache.poi.poifs.crypt.dsig.services.RevocationData;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xmlbeans.XmlException;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.cert.ocsp.BasicOCSPResp;
import org.bouncycastle.cert.ocsp.OCSPResp;
import org.bouncycastle.cert.ocsp.RespID;
import org.etsi.uri.x01903.v13.CRLIdentifierType;
import org.etsi.uri.x01903.v13.CRLRefType;
import org.etsi.uri.x01903.v13.CRLRefsType;
import org.etsi.uri.x01903.v13.CRLValuesType;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.etsi.uri.x01903.v13.CertIDType;
import org.etsi.uri.x01903.v13.CertificateValuesType;
import org.etsi.uri.x01903.v13.CompleteCertificateRefsType;
import org.etsi.uri.x01903.v13.CompleteRevocationRefsType;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.etsi.uri.x01903.v13.EncapsulatedPKIDataType;
import org.etsi.uri.x01903.v13.OCSPIdentifierType;
import org.etsi.uri.x01903.v13.OCSPRefType;
import org.etsi.uri.x01903.v13.OCSPRefsType;
import org.etsi.uri.x01903.v13.OCSPValuesType;
import org.etsi.uri.x01903.v13.QualifyingPropertiesDocument;
import org.etsi.uri.x01903.v13.QualifyingPropertiesType;
import org.etsi.uri.x01903.v13.ResponderIDType;
import org.etsi.uri.x01903.v13.RevocationValuesType;
import org.etsi.uri.x01903.v13.UnsignedPropertiesType;
import org.etsi.uri.x01903.v13.UnsignedSignaturePropertiesType;
import org.etsi.uri.x01903.v13.XAdESTimeStampType;
import org.etsi.uri.x01903.v14.ValidationDataType;
import org.w3.x2000.x09.xmldsig.CanonicalizationMethodType;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XAdESXLSignatureFacet extends SignatureFacet {

   private static final POILogger LOG = POILogFactory.getLogger(XAdESXLSignatureFacet.class);
   private final CertificateFactory certificateFactory;


   public XAdESXLSignatureFacet() {
      try {
         this.certificateFactory = CertificateFactory.getInstance("X.509");
      } catch (CertificateException var2) {
         throw new RuntimeException("X509 JCA error: " + var2.getMessage(), var2);
      }
   }

   public void postSign(Document document) throws MarshalException {
      LOG.log(1, new Object[]{"XAdES-X-L post sign phase"});
      QualifyingPropertiesDocument qualDoc = null;
      QualifyingPropertiesType qualProps = null;
      NodeList qualNl = document.getElementsByTagNameNS("http://uri.etsi.org/01903/v1.3.2#", "QualifyingProperties");
      if(qualNl.getLength() == 1) {
         try {
            qualDoc = QualifyingPropertiesDocument.Factory.parse(qualNl.item(0), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         } catch (XmlException var34) {
            throw new MarshalException(var34);
         }

         qualProps = qualDoc.getQualifyingProperties();
         UnsignedPropertiesType unsignedProps = qualProps.getUnsignedProperties();
         if(unsignedProps == null) {
            unsignedProps = qualProps.addNewUnsignedProperties();
         }

         UnsignedSignaturePropertiesType unsignedSigProps = unsignedProps.getUnsignedSignatureProperties();
         if(unsignedSigProps == null) {
            unsignedSigProps = unsignedProps.addNewUnsignedSignatureProperties();
         }

         NodeList nlSigVal = document.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
         if(nlSigVal.getLength() != 1) {
            throw new IllegalArgumentException("SignatureValue is not set.");
         } else {
            RevocationData tsaRevocationDataXadesT = new RevocationData();
            LOG.log(1, new Object[]{"creating XAdES-T time-stamp"});
            XAdESTimeStampType signatureTimeStamp = this.createXAdESTimeStamp(Collections.singletonList(nlSigVal.item(0)), tsaRevocationDataXadesT);
            unsignedSigProps.addNewSignatureTimeStamp().set(signatureTimeStamp);
            if(tsaRevocationDataXadesT.hasRevocationDataEntries()) {
               ValidationDataType completeCertificateRefs = this.createValidationData(tsaRevocationDataXadesT);
               XAdESSignatureFacet.insertXChild(unsignedSigProps, completeCertificateRefs);
            }

            if(this.signatureConfig.getRevocationDataService() != null) {
               CompleteCertificateRefsType completeCertificateRefs1 = unsignedSigProps.addNewCompleteCertificateRefs();
               CertIDListType certIdList = completeCertificateRefs1.addNewCertRefs();
               List certChain = this.signatureConfig.getSigningCertificateChain();
               int chainSize = certChain.size();
               if(chainSize > 1) {
                  Iterator completeRevocationRefs = certChain.subList(1, chainSize).iterator();

                  while(completeRevocationRefs.hasNext()) {
                     X509Certificate revocationData = (X509Certificate)completeRevocationRefs.next();
                     CertIDType timeStampNodesXadesX1 = certIdList.addNewCert();
                     XAdESSignatureFacet.setCertID(timeStampNodesXadesX1, this.signatureConfig, false, revocationData);
                  }
               }

               CompleteRevocationRefsType completeRevocationRefs1 = unsignedSigProps.addNewCompleteRevocationRefs();
               RevocationData revocationData1 = this.signatureConfig.getRevocationDataService().getRevocationData(certChain);
               Iterator tsaRevocationDataXadesX1;
               byte[] timeStampXadesX1;
               if(revocationData1.hasCRLs()) {
                  CRLRefsType timeStampNodesXadesX11 = completeRevocationRefs1.addNewCRLRefs();
                  completeRevocationRefs1.setCRLRefs(timeStampNodesXadesX11);
                  tsaRevocationDataXadesX1 = revocationData1.getCRLs().iterator();

                  while(tsaRevocationDataXadesX1.hasNext()) {
                     timeStampXadesX1 = (byte[])tsaRevocationDataXadesX1.next();
                     CRLRefType certificateValues = timeStampNodesXadesX11.addNewCRLRef();

                     X509CRL revocationValues;
                     try {
                        revocationValues = (X509CRL)this.certificateFactory.generateCRL(new ByteArrayInputStream(timeStampXadesX1));
                     } catch (CRLException var33) {
                        throw new RuntimeException("CRL parse error: " + var33.getMessage(), var33);
                     }

                     CRLIdentifierType n = certificateValues.addNewCRLIdentifier();
                     String encapsulatedPKIDataType = revocationValues.getIssuerDN().getName().replace(",", ", ");
                     n.setIssuer(encapsulatedPKIDataType);
                     Calendar e = Calendar.getInstance(TimeZone.getTimeZone("Z"), Locale.ROOT);
                     e.setTime(revocationValues.getThisUpdate());
                     n.setIssueTime(e);
                     n.setNumber(this.getCrlNumber(revocationValues));
                     DigestAlgAndValueType cal = certificateValues.addNewDigestAlgAndValue();
                     XAdESSignatureFacet.setDigestAlgAndValue(cal, timeStampXadesX1, this.signatureConfig.getDigestAlgo());
                  }
               }

               if(revocationData1.hasOCSPs()) {
                  OCSPRefsType timeStampNodesXadesX12 = completeRevocationRefs1.addNewOCSPRefs();
                  tsaRevocationDataXadesX1 = revocationData1.getOCSPs().iterator();

                  while(tsaRevocationDataXadesX1.hasNext()) {
                     timeStampXadesX1 = (byte[])tsaRevocationDataXadesX1.next();

                     try {
                        OCSPRefType certificateValues1 = timeStampNodesXadesX12.addNewOCSPRef();
                        DigestAlgAndValueType revocationValues1 = certificateValues1.addNewDigestAlgAndValue();
                        XAdESSignatureFacet.setDigestAlgAndValue(revocationValues1, timeStampXadesX1, this.signatureConfig.getDigestAlgo());
                        OCSPIdentifierType n1 = certificateValues1.addNewOCSPIdentifier();
                        OCSPResp encapsulatedPKIDataType1 = new OCSPResp(timeStampXadesX1);
                        BasicOCSPResp e1 = (BasicOCSPResp)encapsulatedPKIDataType1.getResponseObject();
                        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("Z"), Locale.ROOT);
                        cal1.setTime(e1.getProducedAt());
                        n1.setProducedAt(cal1);
                        ResponderIDType responderId = n1.addNewResponderID();
                        RespID respId = e1.getResponderId();
                        ResponderID ocspResponderId = respId.toASN1Primitive();
                        DERTaggedObject derTaggedObject = (DERTaggedObject)ocspResponderId.toASN1Primitive();
                        if(2 == derTaggedObject.getTagNo()) {
                           ASN1OctetString name = (ASN1OctetString)derTaggedObject.getObject();
                           byte[] nameStr = name.getOctets();
                           responderId.setByKey(nameStr);
                        } else {
                           X500Name name1 = X500Name.getInstance(derTaggedObject.getObject());
                           String nameStr1 = name1.toString();
                           responderId.setByName(nameStr1);
                        }
                     } catch (Exception var32) {
                        throw new RuntimeException("OCSP decoding error: " + var32.getMessage(), var32);
                     }
                  }
               }

               ArrayList timeStampNodesXadesX13 = new ArrayList();
               timeStampNodesXadesX13.add(nlSigVal.item(0));
               timeStampNodesXadesX13.add(signatureTimeStamp.getDomNode());
               timeStampNodesXadesX13.add(completeCertificateRefs1.getDomNode());
               timeStampNodesXadesX13.add(completeRevocationRefs1.getDomNode());
               RevocationData tsaRevocationDataXadesX11 = new RevocationData();
               LOG.log(1, new Object[]{"creating XAdES-X time-stamp"});
               XAdESTimeStampType timeStampXadesX11 = this.createXAdESTimeStamp((List)timeStampNodesXadesX13, tsaRevocationDataXadesX11);
               if(tsaRevocationDataXadesX11.hasRevocationDataEntries()) {
                  ValidationDataType certificateValues2 = this.createValidationData(tsaRevocationDataXadesX11);
                  XAdESSignatureFacet.insertXChild(unsignedSigProps, certificateValues2);
               }

               unsignedSigProps.addNewSigAndRefsTimeStamp().set(timeStampXadesX11);
               CertificateValuesType certificateValues3 = unsignedSigProps.addNewCertificateValues();
               Iterator revocationValues2 = certChain.iterator();

               while(revocationValues2.hasNext()) {
                  X509Certificate n2 = (X509Certificate)revocationValues2.next();
                  EncapsulatedPKIDataType encapsulatedPKIDataType2 = certificateValues3.addNewEncapsulatedX509Certificate();

                  try {
                     encapsulatedPKIDataType2.setByteArrayValue(n2.getEncoded());
                  } catch (CertificateEncodingException var31) {
                     throw new RuntimeException("certificate encoding error: " + var31.getMessage(), var31);
                  }
               }

               RevocationValuesType revocationValues3 = unsignedSigProps.addNewRevocationValues();
               this.createRevocationValues(revocationValues3, revocationData1);
               Node n3 = document.importNode(qualProps.getDomNode(), true);
               qualNl.item(0).getParentNode().replaceChild(n3, qualNl.item(0));
            }
         }
      } else {
         throw new MarshalException("no XAdES-BES extension present");
      }
   }

   public static byte[] getC14nValue(List nodeList, String c14nAlgoId) {
      ByteArrayOutputStream c14nValue = new ByteArrayOutputStream();

      try {
         Iterator e = nodeList.iterator();

         while(e.hasNext()) {
            Node node = (Node)e.next();
            Canonicalizer c14n = Canonicalizer.getInstance(c14nAlgoId);
            c14nValue.write(c14n.canonicalizeSubtree(node));
         }
      } catch (RuntimeException var6) {
         throw var6;
      } catch (Exception var7) {
         throw new RuntimeException("c14n error: " + var7.getMessage(), var7);
      }

      return c14nValue.toByteArray();
   }

   private BigInteger getCrlNumber(X509CRL crl) {
      byte[] crlNumberExtensionValue = crl.getExtensionValue(Extension.cRLNumber.getId());
      if(null == crlNumberExtensionValue) {
         return null;
      } else {
         try {
            ASN1InputStream e = null;
            ASN1InputStream asn1IS2 = null;

            BigInteger var8;
            try {
               e = new ASN1InputStream(crlNumberExtensionValue);
               ASN1OctetString octetString = (ASN1OctetString)e.readObject();
               byte[] octets = octetString.getOctets();
               asn1IS2 = new ASN1InputStream(octets);
               ASN1Integer integer = (ASN1Integer)asn1IS2.readObject();
               var8 = integer.getPositiveValue();
            } finally {
               asn1IS2.close();
               e.close();
            }

            return var8;
         } catch (IOException var13) {
            throw new RuntimeException("I/O error: " + var13.getMessage(), var13);
         }
      }
   }

   private XAdESTimeStampType createXAdESTimeStamp(List nodeList, RevocationData revocationData) {
      byte[] c14nSignatureValueElement = getC14nValue(nodeList, this.signatureConfig.getXadesCanonicalizationMethod());
      return this.createXAdESTimeStamp(c14nSignatureValueElement, revocationData);
   }

   private XAdESTimeStampType createXAdESTimeStamp(byte[] data, RevocationData revocationData) {
      byte[] timeStampToken;
      try {
         timeStampToken = this.signatureConfig.getTspService().timeStamp(data, revocationData);
      } catch (Exception var7) {
         throw new RuntimeException("error while creating a time-stamp: " + var7.getMessage(), var7);
      }

      XAdESTimeStampType xadesTimeStamp = XAdESTimeStampType.Factory.newInstance();
      xadesTimeStamp.setId("time-stamp-" + UUID.randomUUID().toString());
      CanonicalizationMethodType c14nMethod = xadesTimeStamp.addNewCanonicalizationMethod();
      c14nMethod.setAlgorithm(this.signatureConfig.getXadesCanonicalizationMethod());
      EncapsulatedPKIDataType encapsulatedTimeStamp = xadesTimeStamp.addNewEncapsulatedTimeStamp();
      encapsulatedTimeStamp.setByteArrayValue(timeStampToken);
      encapsulatedTimeStamp.setId("time-stamp-token-" + UUID.randomUUID().toString());
      return xadesTimeStamp;
   }

   private ValidationDataType createValidationData(RevocationData revocationData) {
      ValidationDataType validationData = ValidationDataType.Factory.newInstance();
      RevocationValuesType revocationValues = validationData.addNewRevocationValues();
      this.createRevocationValues(revocationValues, revocationData);
      return validationData;
   }

   private void createRevocationValues(RevocationValuesType revocationValues, RevocationData revocationData) {
      Iterator i$;
      byte[] ocsp;
      EncapsulatedPKIDataType encapsulatedOcspValue;
      if(revocationData.hasCRLs()) {
         CRLValuesType ocspValues = revocationValues.addNewCRLValues();
         i$ = revocationData.getCRLs().iterator();

         while(i$.hasNext()) {
            ocsp = (byte[])i$.next();
            encapsulatedOcspValue = ocspValues.addNewEncapsulatedCRLValue();
            encapsulatedOcspValue.setByteArrayValue(ocsp);
         }
      }

      if(revocationData.hasOCSPs()) {
         OCSPValuesType ocspValues1 = revocationValues.addNewOCSPValues();
         i$ = revocationData.getOCSPs().iterator();

         while(i$.hasNext()) {
            ocsp = (byte[])i$.next();
            encapsulatedOcspValue = ocspValues1.addNewEncapsulatedOCSPValue();
            encapsulatedOcspValue.setByteArrayValue(ocsp);
         }
      }

   }

}
