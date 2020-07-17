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
import org.etsi.uri.x01903.v13.SignaturePolicyIdType;
import org.w3c.dom.Node;

public interface SignaturePolicyIdentifierType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignaturePolicyIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signaturepolicyidentifiertype80aftype");


   SignaturePolicyIdType getSignaturePolicyId();

   boolean isSetSignaturePolicyId();

   void setSignaturePolicyId(SignaturePolicyIdType var1);

   SignaturePolicyIdType addNewSignaturePolicyId();

   void unsetSignaturePolicyId();

   XmlObject getSignaturePolicyImplied();

   boolean isSetSignaturePolicyImplied();

   void setSignaturePolicyImplied(XmlObject var1);

   XmlObject addNewSignaturePolicyImplied();

   void unsetSignaturePolicyImplied();


   public static final class Factory {

      public static SignaturePolicyIdentifierType newInstance() {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.newInstance(SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType newInstance(XmlOptions var0) {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.newInstance(SignaturePolicyIdentifierType.type, var0);
      }

      public static SignaturePolicyIdentifierType parse(String var0) throws XmlException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(String var0, XmlOptions var1) throws XmlException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(File var0) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(URL var0) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(InputStream var0) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(Reader var0) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(XMLStreamReader var0) throws XmlException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(Node var0) throws XmlException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static SignaturePolicyIdentifierType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static SignaturePolicyIdentifierType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignaturePolicyIdentifierType)POIXMLTypeLoader.parse(var0, SignaturePolicyIdentifierType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignaturePolicyIdentifierType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignaturePolicyIdentifierType.type, var1);
      }

   }
}
