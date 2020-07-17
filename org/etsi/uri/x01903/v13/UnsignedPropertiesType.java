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
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.etsi.uri.x01903.v13.UnsignedDataObjectPropertiesType;
import org.etsi.uri.x01903.v13.UnsignedSignaturePropertiesType;
import org.w3c.dom.Node;

public interface UnsignedPropertiesType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(UnsignedPropertiesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("unsignedpropertiestype49d6type");


   UnsignedSignaturePropertiesType getUnsignedSignatureProperties();

   boolean isSetUnsignedSignatureProperties();

   void setUnsignedSignatureProperties(UnsignedSignaturePropertiesType var1);

   UnsignedSignaturePropertiesType addNewUnsignedSignatureProperties();

   void unsetUnsignedSignatureProperties();

   UnsignedDataObjectPropertiesType getUnsignedDataObjectProperties();

   boolean isSetUnsignedDataObjectProperties();

   void setUnsignedDataObjectProperties(UnsignedDataObjectPropertiesType var1);

   UnsignedDataObjectPropertiesType addNewUnsignedDataObjectProperties();

   void unsetUnsignedDataObjectProperties();

   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();


   public static final class Factory {

      public static UnsignedPropertiesType newInstance() {
         return (UnsignedPropertiesType)POIXMLTypeLoader.newInstance(UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType newInstance(XmlOptions var0) {
         return (UnsignedPropertiesType)POIXMLTypeLoader.newInstance(UnsignedPropertiesType.type, var0);
      }

      public static UnsignedPropertiesType parse(String var0) throws XmlException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(String var0, XmlOptions var1) throws XmlException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(File var0) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(URL var0) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(InputStream var0) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(Reader var0) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(XMLStreamReader var0) throws XmlException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(Node var0) throws XmlException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(Node var0, XmlOptions var1) throws XmlException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static UnsignedPropertiesType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static UnsignedPropertiesType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (UnsignedPropertiesType)POIXMLTypeLoader.parse(var0, UnsignedPropertiesType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, UnsignedPropertiesType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, UnsignedPropertiesType.type, var1);
      }

   }
}
