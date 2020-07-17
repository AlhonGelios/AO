package org.etsi.uri.x01903.v13;

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
import org.etsi.uri.x01903.v13.SignedPropertiesType;
import org.etsi.uri.x01903.v13.UnsignedPropertiesType;
import org.w3c.dom.Node;

public interface QualifyingPropertiesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(QualifyingPropertiesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("qualifyingpropertiestype9e16type");


   SignedPropertiesType getSignedProperties();

   boolean isSetSignedProperties();

   void setSignedProperties(SignedPropertiesType var1);

   SignedPropertiesType addNewSignedProperties();

   void unsetSignedProperties();

   UnsignedPropertiesType getUnsignedProperties();

   boolean isSetUnsignedProperties();

   void setUnsignedProperties(UnsignedPropertiesType var1);

   UnsignedPropertiesType addNewUnsignedProperties();

   void unsetUnsignedProperties();

   String getTarget();

   XmlAnyURI xgetTarget();

   void setTarget(String var1);

   void xsetTarget(XmlAnyURI var1);

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static QualifyingPropertiesType newInstance() {
         return (QualifyingPropertiesType)POIXMLTypeLoader.newInstance(QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType newInstance(XmlOptions var0) {
         return (QualifyingPropertiesType)POIXMLTypeLoader.newInstance(QualifyingPropertiesType.type, var0);
      }

      public static QualifyingPropertiesType parse(String var0) throws XmlException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(String var0, XmlOptions var1) throws XmlException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(File var0) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(URL var0) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(InputStream var0) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(Reader var0) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(XMLStreamReader var0) throws XmlException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(Node var0) throws XmlException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static QualifyingPropertiesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (QualifyingPropertiesType)POIXMLTypeLoader.parse(var0, QualifyingPropertiesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, QualifyingPropertiesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, QualifyingPropertiesType.type, var1);
      }

   }
}
