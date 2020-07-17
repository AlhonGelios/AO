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

public interface STSpinCount extends XmlUnsignedInt {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSpinCount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("stspincount544ftype");


   int getIntValue();

   void setIntValue(int var1);

   int intValue();

   void set(int var1);


   public static final class Factory {

      public static STSpinCount newValue(Object var0) {
         return (STSpinCount)STSpinCount.type.newValue(var0);
      }

      public static STSpinCount newInstance() {
         return (STSpinCount)POIXMLTypeLoader.newInstance(STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount newInstance(XmlOptions var0) {
         return (STSpinCount)POIXMLTypeLoader.newInstance(STSpinCount.type, var0);
      }

      public static STSpinCount parse(String var0) throws XmlException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(String var0, XmlOptions var1) throws XmlException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(File var0) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(URL var0) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(InputStream var0) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(Reader var0) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(XMLStreamReader var0) throws XmlException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(Node var0) throws XmlException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static STSpinCount parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static STSpinCount parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSpinCount)POIXMLTypeLoader.parse(var0, STSpinCount.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSpinCount.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSpinCount.type, var1);
      }

   }
}
