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
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface EncapsulatedPKIDataType extends XmlBase64Binary {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(EncapsulatedPKIDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("encapsulatedpkidatatype4081type");


   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();

   String getEncoding();

   XmlAnyURI xgetEncoding();

   boolean isSetEncoding();

   void setEncoding(String var1);

   void xsetEncoding(XmlAnyURI var1);

   void unsetEncoding();


   public static final class Factory {

      public static EncapsulatedPKIDataType newInstance() {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.newInstance(EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType newInstance(XmlOptions var0) {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.newInstance(EncapsulatedPKIDataType.type, var0);
      }

      public static EncapsulatedPKIDataType parse(String var0) throws XmlException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(String var0, XmlOptions var1) throws XmlException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(File var0) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(URL var0) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(InputStream var0) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(Reader var0) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(XMLStreamReader var0) throws XmlException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(Node var0) throws XmlException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(Node var0, XmlOptions var1) throws XmlException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static EncapsulatedPKIDataType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static EncapsulatedPKIDataType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (EncapsulatedPKIDataType)POIXMLTypeLoader.parse(var0, EncapsulatedPKIDataType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, EncapsulatedPKIDataType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, EncapsulatedPKIDataType.type, var1);
      }

   }
}
