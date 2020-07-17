package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTDocProtect extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDocProtect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdocprotectc611type");


   STDocProtect.Enum getEdit();

   STDocProtect xgetEdit();

   boolean isSetEdit();

   void setEdit(STDocProtect.Enum var1);

   void xsetEdit(STDocProtect var1);

   void unsetEdit();

   STOnOff.Enum getFormatting();

   STOnOff xgetFormatting();

   boolean isSetFormatting();

   void setFormatting(STOnOff.Enum var1);

   void xsetFormatting(STOnOff var1);

   void unsetFormatting();

   STOnOff.Enum getEnforcement();

   STOnOff xgetEnforcement();

   boolean isSetEnforcement();

   void setEnforcement(STOnOff.Enum var1);

   void xsetEnforcement(STOnOff var1);

   void unsetEnforcement();

   STCryptProv.Enum getCryptProviderType();

   STCryptProv xgetCryptProviderType();

   boolean isSetCryptProviderType();

   void setCryptProviderType(STCryptProv.Enum var1);

   void xsetCryptProviderType(STCryptProv var1);

   void unsetCryptProviderType();

   STAlgClass.Enum getCryptAlgorithmClass();

   STAlgClass xgetCryptAlgorithmClass();

   boolean isSetCryptAlgorithmClass();

   void setCryptAlgorithmClass(STAlgClass.Enum var1);

   void xsetCryptAlgorithmClass(STAlgClass var1);

   void unsetCryptAlgorithmClass();

   STAlgType.Enum getCryptAlgorithmType();

   STAlgType xgetCryptAlgorithmType();

   boolean isSetCryptAlgorithmType();

   void setCryptAlgorithmType(STAlgType.Enum var1);

   void xsetCryptAlgorithmType(STAlgType var1);

   void unsetCryptAlgorithmType();

   BigInteger getCryptAlgorithmSid();

   STDecimalNumber xgetCryptAlgorithmSid();

   boolean isSetCryptAlgorithmSid();

   void setCryptAlgorithmSid(BigInteger var1);

   void xsetCryptAlgorithmSid(STDecimalNumber var1);

   void unsetCryptAlgorithmSid();

   BigInteger getCryptSpinCount();

   STDecimalNumber xgetCryptSpinCount();

   boolean isSetCryptSpinCount();

   void setCryptSpinCount(BigInteger var1);

   void xsetCryptSpinCount(STDecimalNumber var1);

   void unsetCryptSpinCount();

   String getCryptProvider();

   STString xgetCryptProvider();

   boolean isSetCryptProvider();

   void setCryptProvider(String var1);

   void xsetCryptProvider(STString var1);

   void unsetCryptProvider();

   byte[] getAlgIdExt();

   STLongHexNumber xgetAlgIdExt();

   boolean isSetAlgIdExt();

   void setAlgIdExt(byte[] var1);

   void xsetAlgIdExt(STLongHexNumber var1);

   void unsetAlgIdExt();

   String getAlgIdExtSource();

   STString xgetAlgIdExtSource();

   boolean isSetAlgIdExtSource();

   void setAlgIdExtSource(String var1);

   void xsetAlgIdExtSource(STString var1);

   void unsetAlgIdExtSource();

   byte[] getCryptProviderTypeExt();

   STLongHexNumber xgetCryptProviderTypeExt();

   boolean isSetCryptProviderTypeExt();

   void setCryptProviderTypeExt(byte[] var1);

   void xsetCryptProviderTypeExt(STLongHexNumber var1);

   void unsetCryptProviderTypeExt();

   String getCryptProviderTypeExtSource();

   STString xgetCryptProviderTypeExtSource();

   boolean isSetCryptProviderTypeExtSource();

   void setCryptProviderTypeExtSource(String var1);

   void xsetCryptProviderTypeExtSource(STString var1);

   void unsetCryptProviderTypeExtSource();

   byte[] getHash();

   XmlBase64Binary xgetHash();

   boolean isSetHash();

   void setHash(byte[] var1);

   void xsetHash(XmlBase64Binary var1);

   void unsetHash();

   byte[] getSalt();

   XmlBase64Binary xgetSalt();

   boolean isSetSalt();

   void setSalt(byte[] var1);

   void xsetSalt(XmlBase64Binary var1);

   void unsetSalt();


   public static final class Factory {

      public static CTDocProtect newInstance() {
         return (CTDocProtect)POIXMLTypeLoader.newInstance(CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect newInstance(XmlOptions var0) {
         return (CTDocProtect)POIXMLTypeLoader.newInstance(CTDocProtect.type, var0);
      }

      public static CTDocProtect parse(String var0) throws XmlException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(File var0) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(URL var0) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(InputStream var0) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(Reader var0) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(XMLStreamReader var0) throws XmlException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(Node var0) throws XmlException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static CTDocProtect parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static CTDocProtect parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDocProtect)POIXMLTypeLoader.parse(var0, CTDocProtect.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocProtect.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocProtect.type, var1);
      }

   }
}
