package com.microsoft.schemas.office.x2006.encryption;

import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor;
import com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTKeyEncryptor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTKeyEncryptor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctkeyencryptor1205type");


   CTPasswordKeyEncryptor getEncryptedPasswordKey();

   boolean isSetEncryptedPasswordKey();

   void setEncryptedPasswordKey(CTPasswordKeyEncryptor var1);

   CTPasswordKeyEncryptor addNewEncryptedPasswordKey();

   void unsetEncryptedPasswordKey();

   CTCertificateKeyEncryptor getEncryptedCertificateKey();

   boolean isSetEncryptedCertificateKey();

   void setEncryptedCertificateKey(CTCertificateKeyEncryptor var1);

   CTCertificateKeyEncryptor addNewEncryptedCertificateKey();

   void unsetEncryptedCertificateKey();

   CTKeyEncryptor.Uri.Enum getUri();

   CTKeyEncryptor.Uri xgetUri();

   boolean isSetUri();

   void setUri(CTKeyEncryptor.Uri.Enum var1);

   void xsetUri(CTKeyEncryptor.Uri var1);

   void unsetUri();


   public interface Uri extends XmlToken {

      SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTKeyEncryptor.Uri.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("uribad9attrtype");
      CTKeyEncryptor.Uri.Enum HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_PASSWORD = CTKeyEncryptor.Uri.Enum.forString("http://schemas.microsoft.com/office/2006/keyEncryptor/password");
      CTKeyEncryptor.Uri.Enum HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_CERTIFICATE = CTKeyEncryptor.Uri.Enum.forString("http://schemas.microsoft.com/office/2006/keyEncryptor/certificate");
      int INT_HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_PASSWORD = 1;
      int INT_HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_CERTIFICATE = 2;


      StringEnumAbstractBase enumValue();

      void set(StringEnumAbstractBase var1);


      public static final class Factory {

         public static CTKeyEncryptor.Uri newValue(Object var0) {
            return (CTKeyEncryptor.Uri)CTKeyEncryptor.Uri.type.newValue(var0);
         }

         public static CTKeyEncryptor.Uri newInstance() {
            return (CTKeyEncryptor.Uri)POIXMLTypeLoader.newInstance(CTKeyEncryptor.Uri.type, (XmlOptions)null);
         }

         public static CTKeyEncryptor.Uri newInstance(XmlOptions var0) {
            return (CTKeyEncryptor.Uri)POIXMLTypeLoader.newInstance(CTKeyEncryptor.Uri.type, var0);
         }

      }

      public static final class Enum extends StringEnumAbstractBase {

         static final int INT_HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_PASSWORD = 1;
         static final int INT_HTTP_SCHEMAS_MICROSOFT_COM_OFFICE_2006_KEY_ENCRYPTOR_CERTIFICATE = 2;
         public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new CTKeyEncryptor.Uri.Enum[]{new CTKeyEncryptor.Uri.Enum("http://schemas.microsoft.com/office/2006/keyEncryptor/password", 1), new CTKeyEncryptor.Uri.Enum("http://schemas.microsoft.com/office/2006/keyEncryptor/certificate", 2)});
         private static final long serialVersionUID = 1L;


         public static CTKeyEncryptor.Uri.Enum forString(String var0) {
            return (CTKeyEncryptor.Uri.Enum)table.forString(var0);
         }

         public static CTKeyEncryptor.Uri.Enum forInt(int var0) {
            return (CTKeyEncryptor.Uri.Enum)table.forInt(var0);
         }

         private Enum(String var1, int var2) {
            super(var1, var2);
         }

         private Object readResolve() {
            return forInt(this.intValue());
         }

      }
   }

   public static final class Factory {

      public static CTKeyEncryptor newInstance() {
         return (CTKeyEncryptor)POIXMLTypeLoader.newInstance(CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor newInstance(XmlOptions var0) {
         return (CTKeyEncryptor)POIXMLTypeLoader.newInstance(CTKeyEncryptor.type, var0);
      }

      public static CTKeyEncryptor parse(String var0) throws XmlException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(File var0) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(URL var0) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(InputStream var0) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(Reader var0) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(XMLStreamReader var0) throws XmlException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(Node var0) throws XmlException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static CTKeyEncryptor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTKeyEncryptor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTKeyEncryptor)POIXMLTypeLoader.parse(var0, CTKeyEncryptor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTKeyEncryptor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTKeyEncryptor.type, var1);
      }

   }
}
