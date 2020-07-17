package org.etsi.uri.x01903.v13;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.CertIDType;
import org.w3c.dom.Node;

public interface CertIDListType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CertIDListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("certidlisttype488btype");


   List getCertList();

   CertIDType[] getCertArray();

   CertIDType getCertArray(int var1);

   int sizeOfCertArray();

   void setCertArray(CertIDType[] var1);

   void setCertArray(int var1, CertIDType var2);

   CertIDType insertNewCert(int var1);

   CertIDType addNewCert();

   void removeCert(int var1);


   public static final class Factory {

      public static CertIDListType newInstance() {
         return (CertIDListType)POIXMLTypeLoader.newInstance(CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType newInstance(XmlOptions var0) {
         return (CertIDListType)POIXMLTypeLoader.newInstance(CertIDListType.type, var0);
      }

      public static CertIDListType parse(String var0) throws XmlException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(String var0, XmlOptions var1) throws XmlException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(File var0) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(URL var0) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(InputStream var0) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(Reader var0) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(XMLStreamReader var0) throws XmlException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(Node var0) throws XmlException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(Node var0, XmlOptions var1) throws XmlException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static CertIDListType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static CertIDListType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CertIDListType)POIXMLTypeLoader.parse(var0, CertIDListType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CertIDListType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CertIDListType.type, var1);
      }

   }
}
