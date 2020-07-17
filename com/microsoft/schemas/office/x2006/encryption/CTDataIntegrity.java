package com.microsoft.schemas.office.x2006.encryption;

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

public interface CTDataIntegrity extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDataIntegrity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctdataintegrity6eb5type");


   byte[] getEncryptedHmacKey();

   XmlBase64Binary xgetEncryptedHmacKey();

   void setEncryptedHmacKey(byte[] var1);

   void xsetEncryptedHmacKey(XmlBase64Binary var1);

   byte[] getEncryptedHmacValue();

   XmlBase64Binary xgetEncryptedHmacValue();

   void setEncryptedHmacValue(byte[] var1);

   void xsetEncryptedHmacValue(XmlBase64Binary var1);


   public static final class Factory {

      public static CTDataIntegrity newInstance() {
         return (CTDataIntegrity)POIXMLTypeLoader.newInstance(CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity newInstance(XmlOptions var0) {
         return (CTDataIntegrity)POIXMLTypeLoader.newInstance(CTDataIntegrity.type, var0);
      }

      public static CTDataIntegrity parse(String var0) throws XmlException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(File var0) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(URL var0) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(InputStream var0) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(Reader var0) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(XMLStreamReader var0) throws XmlException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(Node var0) throws XmlException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static CTDataIntegrity parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static CTDataIntegrity parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDataIntegrity)POIXMLTypeLoader.parse(var0, CTDataIntegrity.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataIntegrity.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataIntegrity.type, var1);
      }

   }
}
