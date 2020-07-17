package org.openxmlformats.schemas.officeDocument.x2006.customProperties;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;
import org.w3c.dom.Node;

public interface CTProperties extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctproperties2c18type");


   List getPropertyList();

   CTProperty[] getPropertyArray();

   CTProperty getPropertyArray(int var1);

   int sizeOfPropertyArray();

   void setPropertyArray(CTProperty[] var1);

   void setPropertyArray(int var1, CTProperty var2);

   CTProperty insertNewProperty(int var1);

   CTProperty addNewProperty();

   void removeProperty(int var1);


   public static final class Factory {

      public static CTProperties newInstance() {
         return (CTProperties)POIXMLTypeLoader.newInstance(CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties newInstance(XmlOptions var0) {
         return (CTProperties)POIXMLTypeLoader.newInstance(CTProperties.type, var0);
      }

      public static CTProperties parse(String var0) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(String var0, XmlOptions var1) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(File var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(URL var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(InputStream var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(Reader var0) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(XMLStreamReader var0) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(Node var0) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static CTProperties parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, (XmlOptions)null);
      }

      public static CTProperties parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTProperties)POIXMLTypeLoader.parse(var0, CTProperties.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProperties.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProperties.type, var1);
      }

   }
}
