package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.etsi.uri.x01903.v13.OCSPIdentifierType;
import org.w3c.dom.Node;

public interface OCSPRefType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(OCSPRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ocspreftype089etype");


   OCSPIdentifierType getOCSPIdentifier();

   void setOCSPIdentifier(OCSPIdentifierType var1);

   OCSPIdentifierType addNewOCSPIdentifier();

   DigestAlgAndValueType getDigestAlgAndValue();

   boolean isSetDigestAlgAndValue();

   void setDigestAlgAndValue(DigestAlgAndValueType var1);

   DigestAlgAndValueType addNewDigestAlgAndValue();

   void unsetDigestAlgAndValue();


   public static final class Factory {

      public static OCSPRefType newInstance() {
         return (OCSPRefType)POIXMLTypeLoader.newInstance(OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType newInstance(XmlOptions var0) {
         return (OCSPRefType)POIXMLTypeLoader.newInstance(OCSPRefType.type, var0);
      }

      public static OCSPRefType parse(String var0) throws XmlException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(String var0, XmlOptions var1) throws XmlException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(File var0) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(URL var0) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(InputStream var0) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(Reader var0) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(XMLStreamReader var0) throws XmlException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(Node var0) throws XmlException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(Node var0, XmlOptions var1) throws XmlException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static OCSPRefType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static OCSPRefType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (OCSPRefType)POIXMLTypeLoader.parse(var0, OCSPRefType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPRefType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, OCSPRefType.type, var1);
      }

   }
}
