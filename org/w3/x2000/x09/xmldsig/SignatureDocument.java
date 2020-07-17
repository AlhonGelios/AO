package org.w3.x2000.x09.xmldsig;

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
import org.w3.x2000.x09.xmldsig.SignatureType;
import org.w3c.dom.Node;

public interface SignatureDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignatureDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signature5269doctype");


   SignatureType getSignature();

   void setSignature(SignatureType var1);

   SignatureType addNewSignature();


   public static final class Factory {

      public static SignatureDocument newInstance() {
         return (SignatureDocument)POIXMLTypeLoader.newInstance(SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument newInstance(XmlOptions var0) {
         return (SignatureDocument)POIXMLTypeLoader.newInstance(SignatureDocument.type, var0);
      }

      public static SignatureDocument parse(String var0) throws XmlException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(File var0) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(URL var0) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(InputStream var0) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(Reader var0) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(XMLStreamReader var0) throws XmlException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(Node var0) throws XmlException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static SignatureDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static SignatureDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignatureDocument)POIXMLTypeLoader.parse(var0, SignatureDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureDocument.type, var1);
      }

   }
}
