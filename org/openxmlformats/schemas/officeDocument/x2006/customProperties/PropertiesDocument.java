package org.openxmlformats.schemas.officeDocument.x2006.customProperties;

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
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperties;
import org.w3c.dom.Node;

public interface PropertiesDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(PropertiesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("properties288cdoctype");


   CTProperties getProperties();

   void setProperties(CTProperties var1);

   CTProperties addNewProperties();


   public static final class Factory {

      public static PropertiesDocument newInstance() {
         return (PropertiesDocument)POIXMLTypeLoader.newInstance(PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument newInstance(XmlOptions var0) {
         return (PropertiesDocument)POIXMLTypeLoader.newInstance(PropertiesDocument.type, var0);
      }

      public static PropertiesDocument parse(String var0) throws XmlException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(File var0) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(URL var0) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(InputStream var0) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(Reader var0) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(XMLStreamReader var0) throws XmlException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(Node var0) throws XmlException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static PropertiesDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static PropertiesDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (PropertiesDocument)POIXMLTypeLoader.parse(var0, PropertiesDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PropertiesDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, PropertiesDocument.type, var1);
      }

   }
}
