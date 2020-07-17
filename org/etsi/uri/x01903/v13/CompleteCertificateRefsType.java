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
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.CertIDListType;
import org.w3c.dom.Node;

public interface CompleteCertificateRefsType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CompleteCertificateRefsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("completecertificaterefstype07datype");


   CertIDListType getCertRefs();

   void setCertRefs(CertIDListType var1);

   CertIDListType addNewCertRefs();

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static CompleteCertificateRefsType newInstance() {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.newInstance(CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType newInstance(XmlOptions var0) {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.newInstance(CompleteCertificateRefsType.type, var0);
      }

      public static CompleteCertificateRefsType parse(String var0) throws XmlException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(String var0, XmlOptions var1) throws XmlException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(File var0) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(URL var0) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(InputStream var0) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(Reader var0) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(XMLStreamReader var0) throws XmlException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(Node var0) throws XmlException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static CompleteCertificateRefsType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static CompleteCertificateRefsType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CompleteCertificateRefsType)POIXMLTypeLoader.parse(var0, CompleteCertificateRefsType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CompleteCertificateRefsType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CompleteCertificateRefsType.type, var1);
      }

   }
}
