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
import org.etsi.uri.x01903.v13.QualifyingPropertiesType;
import org.w3c.dom.Node;

public interface QualifyingPropertiesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(QualifyingPropertiesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("qualifyingproperties53ccdoctype");


   QualifyingPropertiesType getQualifyingProperties();

   void setQualifyingProperties(QualifyingPropertiesType var1);

   QualifyingPropertiesType addNewQualifyingProperties();


   public static final class Factory {

      public static QualifyingPropertiesDocument newInstance() {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.newInstance(QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument newInstance(XmlOptions var0) {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.newInstance(QualifyingPropertiesDocument.type, var0);
      }

      public static QualifyingPropertiesDocument parse(String var0) throws XmlException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(File var0) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(URL var0) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(InputStream var0) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(Reader var0) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(XMLStreamReader var0) throws XmlException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(Node var0) throws XmlException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static QualifyingPropertiesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static QualifyingPropertiesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (QualifyingPropertiesDocument)POIXMLTypeLoader.parse(var0, QualifyingPropertiesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, QualifyingPropertiesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, QualifyingPropertiesDocument.type, var1);
      }

   }
}
