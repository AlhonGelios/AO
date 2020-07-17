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

public interface STSaltSize extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSaltSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stsaltsizee7a3type");


   int getIntValue();

   void setIntValue(int var1);

   int intValue();

   void set(int var1);


   public static final class Factory {

      public static STSaltSize newValue(Object var0) {
         return (STSaltSize)STSaltSize.type.newValue(var0);
      }

      public static STSaltSize newInstance() {
         return (STSaltSize)POIXMLTypeLoader.newInstance(STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize newInstance(XmlOptions var0) {
         return (STSaltSize)POIXMLTypeLoader.newInstance(STSaltSize.type, var0);
      }

      public static STSaltSize parse(String var0) throws XmlException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(String var0, XmlOptions var1) throws XmlException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(File var0) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(URL var0) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(InputStream var0) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(Reader var0) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(XMLStreamReader var0) throws XmlException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(Node var0) throws XmlException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static STSaltSize parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static STSaltSize parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSaltSize)POIXMLTypeLoader.parse(var0, STSaltSize.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSaltSize.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSaltSize.type, var1);
      }

   }
}
