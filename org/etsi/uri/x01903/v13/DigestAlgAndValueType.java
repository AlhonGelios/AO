package org.etsi.uri.x01903.v13;

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
import org.w3.x2000.x09.xmldsig.DigestMethodType;
import org.w3.x2000.x09.xmldsig.DigestValueType;
import org.w3c.dom.Node;

public interface DigestAlgAndValueType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DigestAlgAndValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("digestalgandvaluetype234etype");


   DigestMethodType getDigestMethod();

   void setDigestMethod(DigestMethodType var1);

   DigestMethodType addNewDigestMethod();

   byte[] getDigestValue();

   DigestValueType xgetDigestValue();

   void setDigestValue(byte[] var1);

   void xsetDigestValue(DigestValueType var1);


   public static final class Factory {

      public static DigestAlgAndValueType newInstance() {
         return (DigestAlgAndValueType)POIXMLTypeLoader.newInstance(DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType newInstance(XmlOptions var0) {
         return (DigestAlgAndValueType)POIXMLTypeLoader.newInstance(DigestAlgAndValueType.type, var0);
      }

      public static DigestAlgAndValueType parse(String var0) throws XmlException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(String var0, XmlOptions var1) throws XmlException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(File var0) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(URL var0) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(InputStream var0) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(Reader var0) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(XMLStreamReader var0) throws XmlException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(Node var0) throws XmlException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(Node var0, XmlOptions var1) throws XmlException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static DigestAlgAndValueType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static DigestAlgAndValueType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (DigestAlgAndValueType)POIXMLTypeLoader.parse(var0, DigestAlgAndValueType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DigestAlgAndValueType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DigestAlgAndValueType.type, var1);
      }

   }
}
