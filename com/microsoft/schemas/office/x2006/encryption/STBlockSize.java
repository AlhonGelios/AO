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

public interface STBlockSize extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STBlockSize.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stblocksize2e10type");


   int getIntValue();

   void setIntValue(int var1);

   int intValue();

   void set(int var1);


   public static final class Factory {

      public static STBlockSize newValue(Object var0) {
         return (STBlockSize)STBlockSize.type.newValue(var0);
      }

      public static STBlockSize newInstance() {
         return (STBlockSize)POIXMLTypeLoader.newInstance(STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize newInstance(XmlOptions var0) {
         return (STBlockSize)POIXMLTypeLoader.newInstance(STBlockSize.type, var0);
      }

      public static STBlockSize parse(String var0) throws XmlException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(String var0, XmlOptions var1) throws XmlException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(File var0) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(URL var0) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(InputStream var0) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(Reader var0) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(XMLStreamReader var0) throws XmlException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(Node var0) throws XmlException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(Node var0, XmlOptions var1) throws XmlException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static STBlockSize parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static STBlockSize parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STBlockSize)POIXMLTypeLoader.parse(var0, STBlockSize.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBlockSize.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STBlockSize.type, var1);
      }

   }
}
