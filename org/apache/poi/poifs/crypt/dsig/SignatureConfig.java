package org.apache.poi.poifs.crypt.dsig;

import java.security.PrivateKey;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.poifs.crypt.dsig.OOXMLURIDereferencer;
import org.apache.poi.poifs.crypt.dsig.SignatureMarshalListener;
import org.apache.poi.poifs.crypt.dsig.facets.KeyInfoSignatureFacet;
import org.apache.poi.poifs.crypt.dsig.facets.OOXMLSignatureFacet;
import org.apache.poi.poifs.crypt.dsig.facets.Office2010SignatureFacet;
import org.apache.poi.poifs.crypt.dsig.facets.SignatureFacet;
import org.apache.poi.poifs.crypt.dsig.facets.XAdESSignatureFacet;
import org.apache.poi.poifs.crypt.dsig.services.RevocationDataService;
import org.apache.poi.poifs.crypt.dsig.services.SignaturePolicyService;
import org.apache.poi.poifs.crypt.dsig.services.TSPTimeStampService;
import org.apache.poi.poifs.crypt.dsig.services.TimeStampService;
import org.apache.poi.poifs.crypt.dsig.services.TimeStampServiceValidator;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.w3c.dom.events.EventListener;

public class SignatureConfig {

   private static final POILogger LOG = POILogFactory.getLogger(SignatureConfig.class);
   private ThreadLocal opcPackage = new ThreadLocal();
   private ThreadLocal signatureFactory = new ThreadLocal();
   private ThreadLocal keyInfoFactory = new ThreadLocal();
   private ThreadLocal provider = new ThreadLocal();
   private List signatureFacets = new ArrayList();
   private HashAlgorithm digestAlgo;
   private Date executionTime;
   private PrivateKey key;
   private List signingCertificateChain;
   private SignaturePolicyService signaturePolicyService;
   private URIDereferencer uriDereferencer;
   private String canonicalizationMethod;
   private boolean includeEntireCertificateChain;
   private boolean includeIssuerSerial;
   private boolean includeKeyValue;
   private TimeStampService tspService;
   private String tspUrl;
   private boolean tspOldProtocol;
   private HashAlgorithm tspDigestAlgo;
   private String tspUser;
   private String tspPass;
   private TimeStampServiceValidator tspValidator;
   private String tspRequestPolicy;
   private String userAgent;
   private String proxyUrl;
   private RevocationDataService revocationDataService;
   private HashAlgorithm xadesDigestAlgo;
   private String xadesRole;
   private String xadesSignatureId;
   private boolean xadesSignaturePolicyImplied;
   private String xadesCanonicalizationMethod;
   private boolean xadesIssuerNameNoReverseOrder;
   private String packageSignatureId;
   private String signatureDescription;
   EventListener signatureMarshalListener;
   Map namespacePrefixes;


   public SignatureConfig() {
      this.digestAlgo = HashAlgorithm.sha1;
      this.executionTime = new Date();
      this.uriDereferencer = null;
      this.canonicalizationMethod = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
      this.includeEntireCertificateChain = true;
      this.includeIssuerSerial = false;
      this.includeKeyValue = false;
      this.tspService = new TSPTimeStampService();
      this.tspOldProtocol = false;
      this.tspDigestAlgo = null;
      this.tspRequestPolicy = "1.3.6.1.4.1.13762.3";
      this.userAgent = "POI XmlSign Service TSP Client";
      this.xadesDigestAlgo = null;
      this.xadesRole = null;
      this.xadesSignatureId = "idSignedProperties";
      this.xadesSignaturePolicyImplied = true;
      this.xadesCanonicalizationMethod = "http://www.w3.org/2001/10/xml-exc-c14n#";
      this.xadesIssuerNameNoReverseOrder = true;
      this.packageSignatureId = "idPackageSignature";
      this.signatureDescription = "Office OpenXML Document";
      this.signatureMarshalListener = null;
      this.namespacePrefixes = new HashMap();
   }

   protected void init(boolean onlyValidation) {
      if(this.opcPackage == null) {
         throw new EncryptedDocumentException("opcPackage is null");
      } else {
         if(this.uriDereferencer == null) {
            this.uriDereferencer = new OOXMLURIDereferencer();
         }

         if(this.uriDereferencer instanceof SignatureConfig.SignatureConfigurable) {
            ((SignatureConfig.SignatureConfigurable)this.uriDereferencer).setSignatureConfig(this);
         }

         if(this.namespacePrefixes.isEmpty()) {
            this.namespacePrefixes.put("http://schemas.openxmlformats.org/package/2006/digital-signature", "mdssi");
            this.namespacePrefixes.put("http://uri.etsi.org/01903/v1.3.2#", "xd");
         }

         if(!onlyValidation) {
            if(this.signatureMarshalListener == null) {
               this.signatureMarshalListener = new SignatureMarshalListener();
            }

            if(this.signatureMarshalListener instanceof SignatureConfig.SignatureConfigurable) {
               ((SignatureConfig.SignatureConfigurable)this.signatureMarshalListener).setSignatureConfig(this);
            }

            if(this.tspService != null) {
               this.tspService.setSignatureConfig(this);
            }

            if(this.signatureFacets.isEmpty()) {
               this.addSignatureFacet(new OOXMLSignatureFacet());
               this.addSignatureFacet(new KeyInfoSignatureFacet());
               this.addSignatureFacet(new XAdESSignatureFacet());
               this.addSignatureFacet(new Office2010SignatureFacet());
            }

            Iterator i$ = this.signatureFacets.iterator();

            while(i$.hasNext()) {
               SignatureFacet sf = (SignatureFacet)i$.next();
               sf.setSignatureConfig(this);
            }

         }
      }
   }

   public void addSignatureFacet(SignatureFacet signatureFacet) {
      this.signatureFacets.add(signatureFacet);
   }

   public List getSignatureFacets() {
      return this.signatureFacets;
   }

   public void setSignatureFacets(List signatureFacets) {
      this.signatureFacets = signatureFacets;
   }

   public HashAlgorithm getDigestAlgo() {
      return this.digestAlgo;
   }

   public void setDigestAlgo(HashAlgorithm digestAlgo) {
      this.digestAlgo = digestAlgo;
   }

   public OPCPackage getOpcPackage() {
      return (OPCPackage)this.opcPackage.get();
   }

   public void setOpcPackage(OPCPackage opcPackage) {
      this.opcPackage.set(opcPackage);
   }

   public PrivateKey getKey() {
      return this.key;
   }

   public void setKey(PrivateKey key) {
      this.key = key;
   }

   public List getSigningCertificateChain() {
      return this.signingCertificateChain;
   }

   public void setSigningCertificateChain(List signingCertificateChain) {
      this.signingCertificateChain = signingCertificateChain;
   }

   public Date getExecutionTime() {
      return this.executionTime;
   }

   public void setExecutionTime(Date executionTime) {
      this.executionTime = executionTime;
   }

   public SignaturePolicyService getSignaturePolicyService() {
      return this.signaturePolicyService;
   }

   public void setSignaturePolicyService(SignaturePolicyService signaturePolicyService) {
      this.signaturePolicyService = signaturePolicyService;
   }

   public URIDereferencer getUriDereferencer() {
      return this.uriDereferencer;
   }

   public void setUriDereferencer(URIDereferencer uriDereferencer) {
      this.uriDereferencer = uriDereferencer;
   }

   public String getSignatureDescription() {
      return this.signatureDescription;
   }

   public void setSignatureDescription(String signatureDescription) {
      this.signatureDescription = signatureDescription;
   }

   public String getCanonicalizationMethod() {
      return this.canonicalizationMethod;
   }

   public void setCanonicalizationMethod(String canonicalizationMethod) {
      this.canonicalizationMethod = canonicalizationMethod;
   }

   public String getPackageSignatureId() {
      return this.packageSignatureId;
   }

   public void setPackageSignatureId(String packageSignatureId) {
      this.packageSignatureId = (String)nvl(packageSignatureId, "xmldsig-" + UUID.randomUUID());
   }

   public String getTspUrl() {
      return this.tspUrl;
   }

   public void setTspUrl(String tspUrl) {
      this.tspUrl = tspUrl;
   }

   public boolean isTspOldProtocol() {
      return this.tspOldProtocol;
   }

   public void setTspOldProtocol(boolean tspOldProtocol) {
      this.tspOldProtocol = tspOldProtocol;
   }

   public HashAlgorithm getTspDigestAlgo() {
      return (HashAlgorithm)nvl(this.tspDigestAlgo, this.digestAlgo);
   }

   public void setTspDigestAlgo(HashAlgorithm tspDigestAlgo) {
      this.tspDigestAlgo = tspDigestAlgo;
   }

   public String getProxyUrl() {
      return this.proxyUrl;
   }

   public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
   }

   public TimeStampService getTspService() {
      return this.tspService;
   }

   public void setTspService(TimeStampService tspService) {
      this.tspService = tspService;
   }

   public String getTspUser() {
      return this.tspUser;
   }

   public void setTspUser(String tspUser) {
      this.tspUser = tspUser;
   }

   public String getTspPass() {
      return this.tspPass;
   }

   public void setTspPass(String tspPass) {
      this.tspPass = tspPass;
   }

   public TimeStampServiceValidator getTspValidator() {
      return this.tspValidator;
   }

   public void setTspValidator(TimeStampServiceValidator tspValidator) {
      this.tspValidator = tspValidator;
   }

   public RevocationDataService getRevocationDataService() {
      return this.revocationDataService;
   }

   public void setRevocationDataService(RevocationDataService revocationDataService) {
      this.revocationDataService = revocationDataService;
   }

   public HashAlgorithm getXadesDigestAlgo() {
      return (HashAlgorithm)nvl(this.xadesDigestAlgo, this.digestAlgo);
   }

   public void setXadesDigestAlgo(HashAlgorithm xadesDigestAlgo) {
      this.xadesDigestAlgo = xadesDigestAlgo;
   }

   public String getUserAgent() {
      return this.userAgent;
   }

   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   public String getTspRequestPolicy() {
      return this.tspRequestPolicy;
   }

   public void setTspRequestPolicy(String tspRequestPolicy) {
      this.tspRequestPolicy = tspRequestPolicy;
   }

   public boolean isIncludeEntireCertificateChain() {
      return this.includeEntireCertificateChain;
   }

   public void setIncludeEntireCertificateChain(boolean includeEntireCertificateChain) {
      this.includeEntireCertificateChain = includeEntireCertificateChain;
   }

   public boolean isIncludeIssuerSerial() {
      return this.includeIssuerSerial;
   }

   public void setIncludeIssuerSerial(boolean includeIssuerSerial) {
      this.includeIssuerSerial = includeIssuerSerial;
   }

   public boolean isIncludeKeyValue() {
      return this.includeKeyValue;
   }

   public void setIncludeKeyValue(boolean includeKeyValue) {
      this.includeKeyValue = includeKeyValue;
   }

   public String getXadesRole() {
      return this.xadesRole;
   }

   public void setXadesRole(String xadesRole) {
      this.xadesRole = xadesRole;
   }

   public String getXadesSignatureId() {
      return (String)nvl(this.xadesSignatureId, "idSignedProperties");
   }

   public void setXadesSignatureId(String xadesSignatureId) {
      this.xadesSignatureId = xadesSignatureId;
   }

   public boolean isXadesSignaturePolicyImplied() {
      return this.xadesSignaturePolicyImplied;
   }

   public void setXadesSignaturePolicyImplied(boolean xadesSignaturePolicyImplied) {
      this.xadesSignaturePolicyImplied = xadesSignaturePolicyImplied;
   }

   public boolean isXadesIssuerNameNoReverseOrder() {
      return this.xadesIssuerNameNoReverseOrder;
   }

   public void setXadesIssuerNameNoReverseOrder(boolean xadesIssuerNameNoReverseOrder) {
      this.xadesIssuerNameNoReverseOrder = xadesIssuerNameNoReverseOrder;
   }

   public EventListener getSignatureMarshalListener() {
      return this.signatureMarshalListener;
   }

   public void setSignatureMarshalListener(EventListener signatureMarshalListener) {
      this.signatureMarshalListener = signatureMarshalListener;
   }

   public Map getNamespacePrefixes() {
      return this.namespacePrefixes;
   }

   public void setNamespacePrefixes(Map namespacePrefixes) {
      this.namespacePrefixes = namespacePrefixes;
   }

   protected static Object nvl(Object value, Object defaultValue) {
      return value == null?defaultValue:value;
   }

   public byte[] getHashMagic() {
      byte[] result;
      switch(SignatureConfig.NamelessClass981347423.$SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[this.getDigestAlgo().ordinal()]) {
      case 1:
         result = new byte[]{(byte)48, (byte)31, (byte)48, (byte)7, (byte)6, (byte)5, (byte)43, (byte)14, (byte)3, (byte)2, (byte)26, (byte)4, (byte)20};
         break;
      case 2:
         result = new byte[]{(byte)48, (byte)43, (byte)48, (byte)11, (byte)6, (byte)9, (byte)96, (byte)-122, (byte)72, (byte)1, (byte)101, (byte)3, (byte)4, (byte)2, (byte)4, (byte)4, (byte)28};
         break;
      case 3:
         result = new byte[]{(byte)48, (byte)47, (byte)48, (byte)11, (byte)6, (byte)9, (byte)96, (byte)-122, (byte)72, (byte)1, (byte)101, (byte)3, (byte)4, (byte)2, (byte)1, (byte)4, (byte)32};
         break;
      case 4:
         result = new byte[]{(byte)48, (byte)63, (byte)48, (byte)11, (byte)6, (byte)9, (byte)96, (byte)-122, (byte)72, (byte)1, (byte)101, (byte)3, (byte)4, (byte)2, (byte)2, (byte)4, (byte)48};
         break;
      case 5:
         result = new byte[]{(byte)48, (byte)79, (byte)48, (byte)11, (byte)6, (byte)9, (byte)96, (byte)-122, (byte)72, (byte)1, (byte)101, (byte)3, (byte)4, (byte)2, (byte)3, (byte)4, (byte)64};
         break;
      case 6:
         result = new byte[]{(byte)48, (byte)27, (byte)48, (byte)7, (byte)6, (byte)5, (byte)43, (byte)36, (byte)3, (byte)2, (byte)2, (byte)4, (byte)16};
         break;
      case 7:
         result = new byte[]{(byte)48, (byte)31, (byte)48, (byte)7, (byte)6, (byte)5, (byte)43, (byte)36, (byte)3, (byte)2, (byte)1, (byte)4, (byte)20};
         break;
      default:
         throw new EncryptedDocumentException("Hash algorithm " + this.getDigestAlgo() + " not supported for signing.");
      }

      return result;
   }

   public String getSignatureMethodUri() {
      switch(SignatureConfig.NamelessClass981347423.$SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[this.getDigestAlgo().ordinal()]) {
      case 1:
         return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
      case 2:
         return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha224";
      case 3:
         return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
      case 4:
         return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384";
      case 5:
         return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512";
      case 6:
      default:
         throw new EncryptedDocumentException("Hash algorithm " + this.getDigestAlgo() + " not supported for signing.");
      case 7:
         return "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160";
      }
   }

   public String getDigestMethodUri() {
      return getDigestMethodUri(this.getDigestAlgo());
   }

   public static String getDigestMethodUri(HashAlgorithm digestAlgo) {
      switch(SignatureConfig.NamelessClass981347423.$SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[digestAlgo.ordinal()]) {
      case 1:
         return "http://www.w3.org/2000/09/xmldsig#sha1";
      case 2:
         return "http://www.w3.org/2001/04/xmldsig-more#sha224";
      case 3:
         return "http://www.w3.org/2001/04/xmlenc#sha256";
      case 4:
         return "http://www.w3.org/2001/04/xmldsig-more#sha384";
      case 5:
         return "http://www.w3.org/2001/04/xmlenc#sha512";
      case 6:
      default:
         throw new EncryptedDocumentException("Hash algorithm " + digestAlgo + " not supported for signing.");
      case 7:
         return "http://www.w3.org/2001/04/xmlenc#ripemd160";
      }
   }

   public void setSignatureFactory(XMLSignatureFactory signatureFactory) {
      this.signatureFactory.set(signatureFactory);
   }

   public XMLSignatureFactory getSignatureFactory() {
      XMLSignatureFactory sigFac = (XMLSignatureFactory)this.signatureFactory.get();
      if(sigFac == null) {
         sigFac = XMLSignatureFactory.getInstance("DOM", this.getProvider());
         this.setSignatureFactory(sigFac);
      }

      return sigFac;
   }

   public void setKeyInfoFactory(KeyInfoFactory keyInfoFactory) {
      this.keyInfoFactory.set(keyInfoFactory);
   }

   public KeyInfoFactory getKeyInfoFactory() {
      KeyInfoFactory keyFac = (KeyInfoFactory)this.keyInfoFactory.get();
      if(keyFac == null) {
         keyFac = KeyInfoFactory.getInstance("DOM", this.getProvider());
         this.setKeyInfoFactory(keyFac);
      }

      return keyFac;
   }

   public Provider getProvider() {
      Provider prov = (Provider)this.provider.get();
      if(prov == null) {
         String[] dsigProviderNames = new String[]{System.getProperty("jsr105Provider"), "org.apache.jcp.xml.dsig.internal.dom.XMLDSigRI", "org.jcp.xml.dsig.internal.dom.XMLDSigRI"};
         String[] arr$ = dsigProviderNames;
         int len$ = dsigProviderNames.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            String pn = arr$[i$];
            if(pn != null) {
               try {
                  prov = (Provider)Class.forName(pn).newInstance();
                  break;
               } catch (Exception var8) {
                  LOG.log(1, new Object[]{"XMLDsig-Provider \'" + pn + "\' can\'t be found - trying next."});
               }
            }
         }
      }

      if(prov == null) {
         throw new RuntimeException("JRE doesn\'t support default xml signature provider - set jsr105Provider system property!");
      } else {
         return prov;
      }
   }

   public String getXadesCanonicalizationMethod() {
      return this.xadesCanonicalizationMethod;
   }

   public void setXadesCanonicalizationMethod(String xadesCanonicalizationMethod) {
      this.xadesCanonicalizationMethod = xadesCanonicalizationMethod;
   }


   // $FF: synthetic class
   static class NamelessClass981347423 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm = new int[HashAlgorithm.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.sha1.ordinal()] = 1;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.sha224.ordinal()] = 2;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.sha256.ordinal()] = 3;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.sha384.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.sha512.ordinal()] = 5;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.ripemd128.ordinal()] = 6;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$poifs$crypt$HashAlgorithm[HashAlgorithm.ripemd160.ordinal()] = 7;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public interface SignatureConfigurable {

      void setSignatureConfig(SignatureConfig var1);
   }
}
