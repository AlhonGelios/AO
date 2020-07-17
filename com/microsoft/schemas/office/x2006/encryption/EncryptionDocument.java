package com.microsoft.schemas.office.x2006.encryption;

import com.microsoft.schemas.office.x2006.encryption.CTEncryption;
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

public interface EncryptionDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(EncryptionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("encryptione8b3doctype");


   CTEncryption getEncryption();

   void setEncryption(CTEncryption var1);

   CTEncryption addNewEncryption();


   public static final class Factory {

      public static EncryptionDocument newInstance() {
         return (EncryptionDocument)POIXMLTypeLoader.newInstance(EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument newInstance(XmlOptions var0) {
         return (EncryptionDocument)POIXMLTypeLoader.newInstance(EncryptionDocument.type, var0);
      }

      public static EncryptionDocument parse(String var0) throws XmlException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(File var0) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(URL var0) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(InputStream var0) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(Reader var0) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(XMLStreamReader var0) throws XmlException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(Node var0) throws XmlException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static EncryptionDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static EncryptionDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (EncryptionDocument)POIXMLTypeLoader.parse(var0, EncryptionDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, EncryptionDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, EncryptionDocument.type, var1);
      }

   }
}
