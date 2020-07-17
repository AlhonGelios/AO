package com.microsoft.schemas.office.x2006.encryption;

import com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity;
import com.microsoft.schemas.office.x2006.encryption.CTKeyData;
import com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptors;
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

public interface CTEncryption extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEncryption.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctencryption365ftype");


   CTKeyData getKeyData();

   void setKeyData(CTKeyData var1);

   CTKeyData addNewKeyData();

   CTDataIntegrity getDataIntegrity();

   void setDataIntegrity(CTDataIntegrity var1);

   CTDataIntegrity addNewDataIntegrity();

   CTKeyEncryptors getKeyEncryptors();

   void setKeyEncryptors(CTKeyEncryptors var1);

   CTKeyEncryptors addNewKeyEncryptors();


   public static final class Factory {

      public static CTEncryption newInstance() {
         return (CTEncryption)POIXMLTypeLoader.newInstance(CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption newInstance(XmlOptions var0) {
         return (CTEncryption)POIXMLTypeLoader.newInstance(CTEncryption.type, var0);
      }

      public static CTEncryption parse(String var0) throws XmlException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(File var0) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(URL var0) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(InputStream var0) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(Reader var0) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(XMLStreamReader var0) throws XmlException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(Node var0) throws XmlException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static CTEncryption parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static CTEncryption parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEncryption)POIXMLTypeLoader.parse(var0, CTEncryption.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEncryption.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEncryption.type, var1);
      }

   }
}
