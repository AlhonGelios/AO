package com.microsoft.schemas.office.x2006.encryption;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STKeyBits extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STKeyBits.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stkeybitse527type");



   public static final class Factory {

      public static STKeyBits newValue(Object var0) {
         return (STKeyBits)STKeyBits.type.newValue(var0);
      }

      public static STKeyBits newInstance() {
         return (STKeyBits)POIXMLTypeLoader.newInstance(STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits newInstance(XmlOptions var0) {
         return (STKeyBits)POIXMLTypeLoader.newInstance(STKeyBits.type, var0);
      }

      public static STKeyBits parse(String var0) throws XmlException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(String var0, XmlOptions var1) throws XmlException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(File var0) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(URL var0) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(InputStream var0) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(Reader var0) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(XMLStreamReader var0) throws XmlException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(Node var0) throws XmlException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(Node var0, XmlOptions var1) throws XmlException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static STKeyBits parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static STKeyBits parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STKeyBits)POIXMLTypeLoader.parse(var0, STKeyBits.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STKeyBits.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STKeyBits.type, var1);
      }

   }
}
