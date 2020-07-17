package org.w3.x2000.x09.xmldsig;

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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface DigestValueType extends XmlBase64Binary {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(DigestValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("digestvaluetype010atype");



   public static final class Factory {

      public static DigestValueType newValue(Object var0) {
         return (DigestValueType)DigestValueType.type.newValue(var0);
      }

      public static DigestValueType newInstance() {
         return (DigestValueType)POIXMLTypeLoader.newInstance(DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType newInstance(XmlOptions var0) {
         return (DigestValueType)POIXMLTypeLoader.newInstance(DigestValueType.type, var0);
      }

      public static DigestValueType parse(String var0) throws XmlException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(String var0, XmlOptions var1) throws XmlException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(File var0) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(URL var0) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(InputStream var0) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(Reader var0) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(XMLStreamReader var0) throws XmlException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(Node var0) throws XmlException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(Node var0, XmlOptions var1) throws XmlException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static DigestValueType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static DigestValueType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (DigestValueType)POIXMLTypeLoader.parse(var0, DigestValueType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DigestValueType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, DigestValueType.type, var1);
      }

   }
}
