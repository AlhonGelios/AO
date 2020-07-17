package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTOfficeArtExtension extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTOfficeArtExtension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctofficeartextension8e53type");


   String getUri();

   XmlToken xgetUri();

   boolean isSetUri();

   void setUri(String var1);

   void xsetUri(XmlToken var1);

   void unsetUri();


   public static final class Factory {

      public static CTOfficeArtExtension newInstance() {
         return (CTOfficeArtExtension)POIXMLTypeLoader.newInstance(CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension newInstance(XmlOptions var0) {
         return (CTOfficeArtExtension)POIXMLTypeLoader.newInstance(CTOfficeArtExtension.type, var0);
      }

      public static CTOfficeArtExtension parse(String var0) throws XmlException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(String var0, XmlOptions var1) throws XmlException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(File var0) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(URL var0) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(InputStream var0) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(Reader var0) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(XMLStreamReader var0) throws XmlException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(Node var0) throws XmlException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static CTOfficeArtExtension parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static CTOfficeArtExtension parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTOfficeArtExtension)POIXMLTypeLoader.parse(var0, CTOfficeArtExtension.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOfficeArtExtension.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTOfficeArtExtension.type, var1);
      }

   }
}
