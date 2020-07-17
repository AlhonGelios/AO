package org.etsi.uri.x01903.v14;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.CertificateValuesType;
import org.etsi.uri.x01903.v13.RevocationValuesType;
import org.w3c.dom.Node;

public interface ValidationDataType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ValidationDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("validationdatatype2c11type");


   CertificateValuesType getCertificateValues();

   boolean isSetCertificateValues();

   void setCertificateValues(CertificateValuesType var1);

   CertificateValuesType addNewCertificateValues();

   void unsetCertificateValues();

   RevocationValuesType getRevocationValues();

   boolean isSetRevocationValues();

   void setRevocationValues(RevocationValuesType var1);

   RevocationValuesType addNewRevocationValues();

   void unsetRevocationValues();

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();

   String getURI();

   XmlAnyURI xgetURI();

   boolean isSetURI();

   void setURI(String var1);

   void xsetURI(XmlAnyURI var1);

   void unsetURI();


   public static final class Factory {

      public static ValidationDataType newInstance() {
         return (ValidationDataType)POIXMLTypeLoader.newInstance(ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType newInstance(XmlOptions var0) {
         return (ValidationDataType)POIXMLTypeLoader.newInstance(ValidationDataType.type, var0);
      }

      public static ValidationDataType parse(String var0) throws XmlException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(String var0, XmlOptions var1) throws XmlException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(File var0) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(URL var0) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(InputStream var0) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(Reader var0) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(XMLStreamReader var0) throws XmlException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(Node var0) throws XmlException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(Node var0, XmlOptions var1) throws XmlException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static ValidationDataType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static ValidationDataType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ValidationDataType)POIXMLTypeLoader.parse(var0, ValidationDataType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ValidationDataType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ValidationDataType.type, var1);
      }

   }
}
