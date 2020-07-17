package org.w3.x2000.x09.xmldsig;

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
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3.x2000.x09.xmldsig.KeyInfoType;
import org.w3.x2000.x09.xmldsig.ObjectType;
import org.w3.x2000.x09.xmldsig.SignatureValueType;
import org.w3.x2000.x09.xmldsig.SignedInfoType;
import org.w3c.dom.Node;

public interface SignatureType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignatureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signaturetype0a3ftype");


   SignedInfoType getSignedInfo();

   void setSignedInfo(SignedInfoType var1);

   SignedInfoType addNewSignedInfo();

   SignatureValueType getSignatureValue();

   void setSignatureValue(SignatureValueType var1);

   SignatureValueType addNewSignatureValue();

   KeyInfoType getKeyInfo();

   boolean isSetKeyInfo();

   void setKeyInfo(KeyInfoType var1);

   KeyInfoType addNewKeyInfo();

   void unsetKeyInfo();

   List getObjectList();

   ObjectType[] getObjectArray();

   ObjectType getObjectArray(int var1);

   int sizeOfObjectArray();

   void setObjectArray(ObjectType[] var1);

   void setObjectArray(int var1, ObjectType var2);

   ObjectType insertNewObject(int var1);

   ObjectType addNewObject();

   void removeObject(int var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static SignatureType newInstance() {
         return (SignatureType)POIXMLTypeLoader.newInstance(SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType newInstance(XmlOptions var0) {
         return (SignatureType)POIXMLTypeLoader.newInstance(SignatureType.type, var0);
      }

      public static SignatureType parse(String var0) throws XmlException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(String var0, XmlOptions var1) throws XmlException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(File var0) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(URL var0) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(InputStream var0) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(Reader var0) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(XMLStreamReader var0) throws XmlException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(Node var0) throws XmlException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static SignatureType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, (XmlOptions)null);
      }

      public static SignatureType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignatureType)POIXMLTypeLoader.parse(var0, SignatureType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignatureType.type, var1);
      }

   }
}
