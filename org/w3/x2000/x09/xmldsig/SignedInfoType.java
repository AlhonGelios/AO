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
import org.w3.x2000.x09.xmldsig.CanonicalizationMethodType;
import org.w3.x2000.x09.xmldsig.ReferenceType;
import org.w3.x2000.x09.xmldsig.SignatureMethodType;
import org.w3c.dom.Node;

public interface SignedInfoType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SignedInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("signedinfotype54dbtype");


   CanonicalizationMethodType getCanonicalizationMethod();

   void setCanonicalizationMethod(CanonicalizationMethodType var1);

   CanonicalizationMethodType addNewCanonicalizationMethod();

   SignatureMethodType getSignatureMethod();

   void setSignatureMethod(SignatureMethodType var1);

   SignatureMethodType addNewSignatureMethod();

   List getReferenceList();

   ReferenceType[] getReferenceArray();

   ReferenceType getReferenceArray(int var1);

   int sizeOfReferenceArray();

   void setReferenceArray(ReferenceType[] var1);

   void setReferenceArray(int var1, ReferenceType var2);

   ReferenceType insertNewReference(int var1);

   ReferenceType addNewReference();

   void removeReference(int var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static SignedInfoType newInstance() {
         return (SignedInfoType)POIXMLTypeLoader.newInstance(SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType newInstance(XmlOptions var0) {
         return (SignedInfoType)POIXMLTypeLoader.newInstance(SignedInfoType.type, var0);
      }

      public static SignedInfoType parse(String var0) throws XmlException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(String var0, XmlOptions var1) throws XmlException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(File var0) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(URL var0) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(InputStream var0) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(Reader var0) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(XMLStreamReader var0) throws XmlException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(Node var0) throws XmlException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(Node var0, XmlOptions var1) throws XmlException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static SignedInfoType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static SignedInfoType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SignedInfoType)POIXMLTypeLoader.parse(var0, SignedInfoType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignedInfoType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SignedInfoType.type, var1);
      }

   }
}
