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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.GenericTimeStampType;
import org.w3c.dom.Node;

public interface XAdESTimeStampType extends GenericTimeStampType {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(XAdESTimeStampType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("xadestimestamptypeaedbtype");



   public static final class Factory {

      public static XAdESTimeStampType newInstance() {
         return (XAdESTimeStampType)POIXMLTypeLoader.newInstance(XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType newInstance(XmlOptions var0) {
         return (XAdESTimeStampType)POIXMLTypeLoader.newInstance(XAdESTimeStampType.type, var0);
      }

      public static XAdESTimeStampType parse(String var0) throws XmlException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(String var0, XmlOptions var1) throws XmlException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(File var0) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(URL var0) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(InputStream var0) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(Reader var0) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(XMLStreamReader var0) throws XmlException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(Node var0) throws XmlException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(Node var0, XmlOptions var1) throws XmlException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XAdESTimeStampType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XAdESTimeStampType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (XAdESTimeStampType)POIXMLTypeLoader.parse(var0, XAdESTimeStampType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, XAdESTimeStampType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, XAdESTimeStampType.type, var1);
      }

   }
}
