package com.microsoft.schemas.office.x2006.keyEncryptor.password;

import com.microsoft.schemas.office.x2006.encryption.STBlockSize;
import com.microsoft.schemas.office.x2006.encryption.STCipherAlgorithm;
import com.microsoft.schemas.office.x2006.encryption.STCipherChaining;
import com.microsoft.schemas.office.x2006.encryption.STHashAlgorithm;
import com.microsoft.schemas.office.x2006.encryption.STHashSize;
import com.microsoft.schemas.office.x2006.encryption.STKeyBits;
import com.microsoft.schemas.office.x2006.encryption.STSaltSize;
import com.microsoft.schemas.office.x2006.encryption.STSpinCount;
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

public interface CTPasswordKeyEncryptor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPasswordKeyEncryptor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("ctpasswordkeyencryptorde24type");


   int getSaltSize();

   STSaltSize xgetSaltSize();

   void setSaltSize(int var1);

   void xsetSaltSize(STSaltSize var1);

   int getBlockSize();

   STBlockSize xgetBlockSize();

   void setBlockSize(int var1);

   void xsetBlockSize(STBlockSize var1);

   long getKeyBits();

   STKeyBits xgetKeyBits();

   void setKeyBits(long var1);

   void xsetKeyBits(STKeyBits var1);

   int getHashSize();

   STHashSize xgetHashSize();

   void setHashSize(int var1);

   void xsetHashSize(STHashSize var1);

   STCipherAlgorithm.Enum getCipherAlgorithm();

   STCipherAlgorithm xgetCipherAlgorithm();

   void setCipherAlgorithm(STCipherAlgorithm.Enum var1);

   void xsetCipherAlgorithm(STCipherAlgorithm var1);

   STCipherChaining.Enum getCipherChaining();

   STCipherChaining xgetCipherChaining();

   void setCipherChaining(STCipherChaining.Enum var1);

   void xsetCipherChaining(STCipherChaining var1);

   STHashAlgorithm.Enum getHashAlgorithm();

   STHashAlgorithm xgetHashAlgorithm();

   void setHashAlgorithm(STHashAlgorithm.Enum var1);

   void xsetHashAlgorithm(STHashAlgorithm var1);

   byte[] getSaltValue();

   XmlBase64Binary xgetSaltValue();

   void setSaltValue(byte[] var1);

   void xsetSaltValue(XmlBase64Binary var1);

   int getSpinCount();

   STSpinCount xgetSpinCount();

   void setSpinCount(int var1);

   void xsetSpinCount(STSpinCount var1);

   byte[] getEncryptedVerifierHashInput();

   XmlBase64Binary xgetEncryptedVerifierHashInput();

   void setEncryptedVerifierHashInput(byte[] var1);

   void xsetEncryptedVerifierHashInput(XmlBase64Binary var1);

   byte[] getEncryptedVerifierHashValue();

   XmlBase64Binary xgetEncryptedVerifierHashValue();

   void setEncryptedVerifierHashValue(byte[] var1);

   void xsetEncryptedVerifierHashValue(XmlBase64Binary var1);

   byte[] getEncryptedKeyValue();

   XmlBase64Binary xgetEncryptedKeyValue();

   void setEncryptedKeyValue(byte[] var1);

   void xsetEncryptedKeyValue(XmlBase64Binary var1);


   public static final class Factory {

      public static CTPasswordKeyEncryptor newInstance() {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.newInstance(CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor newInstance(XmlOptions var0) {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.newInstance(CTPasswordKeyEncryptor.type, var0);
      }

      public static CTPasswordKeyEncryptor parse(String var0) throws XmlException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(File var0) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(URL var0) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(InputStream var0) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(Reader var0) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(XMLStreamReader var0) throws XmlException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(Node var0) throws XmlException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static CTPasswordKeyEncryptor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static CTPasswordKeyEncryptor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPasswordKeyEncryptor)POIXMLTypeLoader.parse(var0, CTPasswordKeyEncryptor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPasswordKeyEncryptor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPasswordKeyEncryptor.type, var1);
      }

   }
}
