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
import org.etsi.uri.x01903.v13.CRLIdentifierType;
import org.etsi.uri.x01903.v13.DigestAlgAndValueType;
import org.w3c.dom.Node;

public interface CRLRefType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CRLRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("crlreftype4444type");


   DigestAlgAndValueType getDigestAlgAndValue();

   void setDigestAlgAndValue(DigestAlgAndValueType var1);

   DigestAlgAndValueType addNewDigestAlgAndValue();

   CRLIdentifierType getCRLIdentifier();

   boolean isSetCRLIdentifier();

   void setCRLIdentifier(CRLIdentifierType var1);

   CRLIdentifierType addNewCRLIdentifier();

   void unsetCRLIdentifier();


   public static final class Factory {

      public static CRLRefType newInstance() {
         return (CRLRefType)POIXMLTypeLoader.newInstance(CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType newInstance(XmlOptions var0) {
         return (CRLRefType)POIXMLTypeLoader.newInstance(CRLRefType.type, var0);
      }

      public static CRLRefType parse(String var0) throws XmlException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(String var0, XmlOptions var1) throws XmlException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(File var0) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(URL var0) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(InputStream var0) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(Reader var0) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(XMLStreamReader var0) throws XmlException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(Node var0) throws XmlException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static CRLRefType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static CRLRefType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CRLRefType)POIXMLTypeLoader.parse(var0, CRLRefType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLRefType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CRLRefType.type, var1);
      }

   }
}
