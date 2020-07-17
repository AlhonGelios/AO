package org.openxmlformats.schemas.xpackage.x2006.digitalSignature;

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
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTSignatureTime;
import org.w3c.dom.Node;

public interface SignatureTimeDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignatureTimeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signaturetime9c91doctype");


   CTSignatureTime getSignatureTime();

   void setSignatureTime(CTSignatureTime var1);

   CTSignatureTime addNewSignatureTime();


   public static final class Factory {

      public static SignatureTimeDocument newInstance() {
         return (SignatureTimeDocument)POIXMLTypeLoader.newInstance(SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument newInstance(XmlOptions var0) {
         return (SignatureTimeDocument)POIXMLTypeLoader.newInstance(SignatureTimeDocument.type, var0);
      }

      public static SignatureTimeDocument parse(String var0) throws XmlException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(File var0) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(URL var0) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(InputStream var0) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(Reader var0) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(XMLStreamReader var0) throws XmlException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(Node var0) throws XmlException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static SignatureTimeDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static SignatureTimeDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignatureTimeDocument)POIXMLTypeLoader.parse(var0, SignatureTimeDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureTimeDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureTimeDocument.type, var1);
      }

   }
}
