package com.microsoft.schemas.office.x2006.encryption;

import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor;
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
import org.w3c.dom.Node;

public interface CTKeyEncryptors extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTKeyEncryptors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctkeyencryptorsa09ctype");


   List getKeyEncryptorList();

   CTKeyEncryptor[] getKeyEncryptorArray();

   CTKeyEncryptor getKeyEncryptorArray(int var1);

   int sizeOfKeyEncryptorArray();

   void setKeyEncryptorArray(CTKeyEncryptor[] var1);

   void setKeyEncryptorArray(int var1, CTKeyEncryptor var2);

   CTKeyEncryptor insertNewKeyEncryptor(int var1);

   CTKeyEncryptor addNewKeyEncryptor();

   void removeKeyEncryptor(int var1);


   public static final class Factory {

      public static CTKeyEncryptors newInstance() {
         return (CTKeyEncryptors)POIXMLTypeLoader.newInstance(CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors newInstance(XmlOptions var0) {
         return (CTKeyEncryptors)POIXMLTypeLoader.newInstance(CTKeyEncryptors.type, var0);
      }

      public static CTKeyEncryptors parse(String var0) throws XmlException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(String var0, XmlOptions var1) throws XmlException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(File var0) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(URL var0) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(InputStream var0) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(Reader var0) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(XMLStreamReader var0) throws XmlException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(Node var0) throws XmlException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static CTKeyEncryptors parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static CTKeyEncryptors parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTKeyEncryptors)POIXMLTypeLoader.parse(var0, CTKeyEncryptors.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTKeyEncryptors.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTKeyEncryptors.type, var1);
      }

   }
}
