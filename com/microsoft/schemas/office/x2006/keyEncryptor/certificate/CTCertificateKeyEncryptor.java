package com.microsoft.schemas.office.x2006.keyEncryptor.certificate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTCertificateKeyEncryptor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCertificateKeyEncryptor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctcertificatekeyencryptor1a80type");


   byte[] getEncryptedKeyValue();

   XmlBase64Binary xgetEncryptedKeyValue();

   void setEncryptedKeyValue(byte[] var1);

   void xsetEncryptedKeyValue(XmlBase64Binary var1);

   byte[] getX509Certificate();

   XmlBase64Binary xgetX509Certificate();

   void setX509Certificate(byte[] var1);

   void xsetX509Certificate(XmlBase64Binary var1);

   byte[] getCertVerifier();

   XmlBase64Binary xgetCertVerifier();

   void setCertVerifier(byte[] var1);

   void xsetCertVerifier(XmlBase64Binary var1);


   public static final class Factory {

      public static CTCertificateKeyEncryptor newInstance() {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.newInstance(CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor newInstance(XmlOptions var0) {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.newInstance(CTCertificateKeyEncryptor.type, var0);
      }

      public static CTCertificateKeyEncryptor parse(String var0) throws XmlException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(File var0) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(URL var0) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(InputStream var0) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(Reader var0) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(XMLStreamReader var0) throws XmlException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(Node var0) throws XmlException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static CTCertificateKeyEncryptor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTCertificateKeyEncryptor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCertificateKeyEncryptor)POIXMLTypeLoader.parse(var0, CTCertificateKeyEncryptor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCertificateKeyEncryptor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCertificateKeyEncryptor.type, var1);
      }

   }
}
