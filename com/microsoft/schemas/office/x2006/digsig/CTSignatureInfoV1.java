package com.microsoft.schemas.office.x2006.digsig;

import com.microsoft.schemas.office.x2006.digsig.STPositiveInteger;
import com.microsoft.schemas.office.x2006.digsig.STSignatureComments;
import com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl;
import com.microsoft.schemas.office.x2006.digsig.STSignatureText;
import com.microsoft.schemas.office.x2006.digsig.STSignatureType;
import com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces;
import com.microsoft.schemas.office.x2006.digsig.STVersion;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTSignatureInfoV1 extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSignatureInfoV1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctsignatureinfov13a5ftype");


   String getSetupID();

   STUniqueIdentifierWithBraces xgetSetupID();

   void setSetupID(String var1);

   void xsetSetupID(STUniqueIdentifierWithBraces var1);

   String getSignatureText();

   STSignatureText xgetSignatureText();

   void setSignatureText(String var1);

   void xsetSignatureText(STSignatureText var1);

   byte[] getSignatureImage();

   XmlBase64Binary xgetSignatureImage();

   void setSignatureImage(byte[] var1);

   void xsetSignatureImage(XmlBase64Binary var1);

   String getSignatureComments();

   STSignatureComments xgetSignatureComments();

   void setSignatureComments(String var1);

   void xsetSignatureComments(STSignatureComments var1);

   String getWindowsVersion();

   STVersion xgetWindowsVersion();

   void setWindowsVersion(String var1);

   void xsetWindowsVersion(STVersion var1);

   String getOfficeVersion();

   STVersion xgetOfficeVersion();

   void setOfficeVersion(String var1);

   void xsetOfficeVersion(STVersion var1);

   String getApplicationVersion();

   STVersion xgetApplicationVersion();

   void setApplicationVersion(String var1);

   void xsetApplicationVersion(STVersion var1);

   int getMonitors();

   STPositiveInteger xgetMonitors();

   void setMonitors(int var1);

   void xsetMonitors(STPositiveInteger var1);

   int getHorizontalResolution();

   STPositiveInteger xgetHorizontalResolution();

   void setHorizontalResolution(int var1);

   void xsetHorizontalResolution(STPositiveInteger var1);

   int getVerticalResolution();

   STPositiveInteger xgetVerticalResolution();

   void setVerticalResolution(int var1);

   void xsetVerticalResolution(STPositiveInteger var1);

   int getColorDepth();

   STPositiveInteger xgetColorDepth();

   void setColorDepth(int var1);

   void xsetColorDepth(STPositiveInteger var1);

   String getSignatureProviderId();

   STUniqueIdentifierWithBraces xgetSignatureProviderId();

   void setSignatureProviderId(String var1);

   void xsetSignatureProviderId(STUniqueIdentifierWithBraces var1);

   String getSignatureProviderUrl();

   STSignatureProviderUrl xgetSignatureProviderUrl();

   void setSignatureProviderUrl(String var1);

   void xsetSignatureProviderUrl(STSignatureProviderUrl var1);

   int getSignatureProviderDetails();

   XmlInt xgetSignatureProviderDetails();

   void setSignatureProviderDetails(int var1);

   void xsetSignatureProviderDetails(XmlInt var1);

   int getSignatureType();

   STSignatureType xgetSignatureType();

   void setSignatureType(int var1);

   void xsetSignatureType(STSignatureType var1);

   String getDelegateSuggestedSigner();

   XmlString xgetDelegateSuggestedSigner();

   boolean isSetDelegateSuggestedSigner();

   void setDelegateSuggestedSigner(String var1);

   void xsetDelegateSuggestedSigner(XmlString var1);

   void unsetDelegateSuggestedSigner();

   String getDelegateSuggestedSigner2();

   XmlString xgetDelegateSuggestedSigner2();

   boolean isSetDelegateSuggestedSigner2();

   void setDelegateSuggestedSigner2(String var1);

   void xsetDelegateSuggestedSigner2(XmlString var1);

   void unsetDelegateSuggestedSigner2();

   String getDelegateSuggestedSignerEmail();

   XmlString xgetDelegateSuggestedSignerEmail();

   boolean isSetDelegateSuggestedSignerEmail();

   void setDelegateSuggestedSignerEmail(String var1);

   void xsetDelegateSuggestedSignerEmail(XmlString var1);

   void unsetDelegateSuggestedSignerEmail();

   String getManifestHashAlgorithm();

   XmlAnyURI xgetManifestHashAlgorithm();

   boolean isSetManifestHashAlgorithm();

   void setManifestHashAlgorithm(String var1);

   void xsetManifestHashAlgorithm(XmlAnyURI var1);

   void unsetManifestHashAlgorithm();


   public static final class Factory {

      public static CTSignatureInfoV1 newInstance() {
         return (CTSignatureInfoV1)POIXMLTypeLoader.newInstance(CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 newInstance(XmlOptions var0) {
         return (CTSignatureInfoV1)POIXMLTypeLoader.newInstance(CTSignatureInfoV1.type, var0);
      }

      public static CTSignatureInfoV1 parse(String var0) throws XmlException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(File var0) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(URL var0) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(InputStream var0) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(Reader var0) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(XMLStreamReader var0) throws XmlException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(Node var0) throws XmlException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static CTSignatureInfoV1 parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static CTSignatureInfoV1 parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSignatureInfoV1)POIXMLTypeLoader.parse(var0, CTSignatureInfoV1.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSignatureInfoV1.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSignatureInfoV1.type, var1);
      }

   }
}
