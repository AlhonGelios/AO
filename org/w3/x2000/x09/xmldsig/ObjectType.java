package org.w3.x2000.x09.xmldsig;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ObjectType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(ObjectType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078").resolveHandle("objecttypec966type");


   String getId();

   XmlID xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlID var1);

   void unsetId();

   String getMimeType();

   XmlString xgetMimeType();

   boolean isSetMimeType();

   void setMimeType(String var1);

   void xsetMimeType(XmlString var1);

   void unsetMimeType();

   String getEncoding();

   XmlAnyURI xgetEncoding();

   boolean isSetEncoding();

   void setEncoding(String var1);

   void xsetEncoding(XmlAnyURI var1);

   void unsetEncoding();


   public static final class Factory {

      public static ObjectType newInstance() {
         return (ObjectType)POIXMLTypeLoader.newInstance(ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType newInstance(XmlOptions var0) {
         return (ObjectType)POIXMLTypeLoader.newInstance(ObjectType.type, var0);
      }

      public static ObjectType parse(String var0) throws XmlException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(String var0, XmlOptions var1) throws XmlException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(File var0) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(URL var0) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(InputStream var0) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(Reader var0) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(XMLStreamReader var0) throws XmlException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(Node var0) throws XmlException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(Node var0, XmlOptions var1) throws XmlException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static ObjectType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, (XmlOptions)null);
      }

      public static ObjectType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (ObjectType)POIXMLTypeLoader.parse(var0, ObjectType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ObjectType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, ObjectType.type, var1);
      }

   }
}
