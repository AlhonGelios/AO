package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;

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
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector;
import org.w3c.dom.Node;

public interface CTVectorVariant extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTVectorVariant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctvectorvariant9d75type");


   CTVector getVector();

   void setVector(CTVector var1);

   CTVector addNewVector();


   public static final class Factory {

      public static CTVectorVariant newInstance() {
         return (CTVectorVariant)POIXMLTypeLoader.newInstance(CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant newInstance(XmlOptions var0) {
         return (CTVectorVariant)POIXMLTypeLoader.newInstance(CTVectorVariant.type, var0);
      }

      public static CTVectorVariant parse(String var0) throws XmlException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(String var0, XmlOptions var1) throws XmlException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(File var0) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(URL var0) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(InputStream var0) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(Reader var0) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(XMLStreamReader var0) throws XmlException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(Node var0) throws XmlException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static CTVectorVariant parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static CTVectorVariant parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTVectorVariant)POIXMLTypeLoader.parse(var0, CTVectorVariant.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVectorVariant.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVectorVariant.type, var1);
      }

   }
}
