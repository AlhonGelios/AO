package org.etsi.uri.x01903.v13;

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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ResponderIDType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ResponderIDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("responderidtype55b9type");


   String getByName();

   XmlString xgetByName();

   boolean isSetByName();

   void setByName(String var1);

   void xsetByName(XmlString var1);

   void unsetByName();

   byte[] getByKey();

   XmlBase64Binary xgetByKey();

   boolean isSetByKey();

   void setByKey(byte[] var1);

   void xsetByKey(XmlBase64Binary var1);

   void unsetByKey();


   public static final class Factory {

      public static ResponderIDType newInstance() {
         return (ResponderIDType)POIXMLTypeLoader.newInstance(ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType newInstance(XmlOptions var0) {
         return (ResponderIDType)POIXMLTypeLoader.newInstance(ResponderIDType.type, var0);
      }

      public static ResponderIDType parse(String var0) throws XmlException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(String var0, XmlOptions var1) throws XmlException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(File var0) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(URL var0) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(InputStream var0) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(Reader var0) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(XMLStreamReader var0) throws XmlException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(Node var0) throws XmlException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(Node var0, XmlOptions var1) throws XmlException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static ResponderIDType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static ResponderIDType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ResponderIDType)POIXMLTypeLoader.parse(var0, ResponderIDType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ResponderIDType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ResponderIDType.type, var1);
      }

   }
}
