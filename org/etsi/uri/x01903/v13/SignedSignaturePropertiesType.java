package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.etsi.uri.x01903.v13.SignaturePolicyIdentifierType;
import org.etsi.uri.x01903.v13.SignatureProductionPlaceType;
import org.etsi.uri.x01903.v13.SignerRoleType;
import org.w3c.dom.Node;

public interface SignedSignaturePropertiesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignedSignaturePropertiesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signedsignaturepropertiestype06abtype");


   Calendar getSigningTime();

   XmlDateTime xgetSigningTime();

   boolean isSetSigningTime();

   void setSigningTime(Calendar var1);

   void xsetSigningTime(XmlDateTime var1);

   void unsetSigningTime();

   CertIDListType getSigningCertificate();

   boolean isSetSigningCertificate();

   void setSigningCertificate(CertIDListType var1);

   CertIDListType addNewSigningCertificate();

   void unsetSigningCertificate();

   SignaturePolicyIdentifierType getSignaturePolicyIdentifier();

   boolean isSetSignaturePolicyIdentifier();

   void setSignaturePolicyIdentifier(SignaturePolicyIdentifierType var1);

   SignaturePolicyIdentifierType addNewSignaturePolicyIdentifier();

   void unsetSignaturePolicyIdentifier();

   SignatureProductionPlaceType getSignatureProductionPlace();

   boolean isSetSignatureProductionPlace();

   void setSignatureProductionPlace(SignatureProductionPlaceType var1);

   SignatureProductionPlaceType addNewSignatureProductionPlace();

   void unsetSignatureProductionPlace();

   SignerRoleType getSignerRole();

   boolean isSetSignerRole();

   void setSignerRole(SignerRoleType var1);

   SignerRoleType addNewSignerRole();

   void unsetSignerRole();

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static SignedSignaturePropertiesType newInstance() {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.newInstance(SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType newInstance(XmlOptions var0) {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.newInstance(SignedSignaturePropertiesType.type, var0);
      }

      public static SignedSignaturePropertiesType parse(String var0) throws XmlException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(String var0, XmlOptions var1) throws XmlException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(File var0) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(URL var0) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(InputStream var0) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(Reader var0) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(XMLStreamReader var0) throws XmlException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(Node var0) throws XmlException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static SignedSignaturePropertiesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static SignedSignaturePropertiesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignedSignaturePropertiesType)POIXMLTypeLoader.parse(var0, SignedSignaturePropertiesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignedSignaturePropertiesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignedSignaturePropertiesType.type, var1);
      }

   }
}
