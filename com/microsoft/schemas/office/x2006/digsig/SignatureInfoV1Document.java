package com.microsoft.schemas.office.x2006.digsig;

import com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1;
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
import org.w3c.dom.Node;

public interface SignatureInfoV1Document extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignatureInfoV1Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signatureinfov14a6bdoctype");


   CTSignatureInfoV1 getSignatureInfoV1();

   void setSignatureInfoV1(CTSignatureInfoV1 var1);

   CTSignatureInfoV1 addNewSignatureInfoV1();


   public static final class Factory {

      public static SignatureInfoV1Document newInstance() {
         return (SignatureInfoV1Document)POIXMLTypeLoader.newInstance(SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document newInstance(XmlOptions var0) {
         return (SignatureInfoV1Document)POIXMLTypeLoader.newInstance(SignatureInfoV1Document.type, var0);
      }

      public static SignatureInfoV1Document parse(String var0) throws XmlException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(String var0, XmlOptions var1) throws XmlException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(File var0) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(URL var0) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(InputStream var0) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(Reader var0) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(XMLStreamReader var0) throws XmlException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(Node var0) throws XmlException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static SignatureInfoV1Document parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static SignatureInfoV1Document parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignatureInfoV1Document)POIXMLTypeLoader.parse(var0, SignatureInfoV1Document.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureInfoV1Document.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureInfoV1Document.type, var1);
      }

   }
}
