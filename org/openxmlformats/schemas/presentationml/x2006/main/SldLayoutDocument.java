package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout;
import org.w3c.dom.Node;

public interface SldLayoutDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SldLayoutDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sldlayout638edoctype");


   CTSlideLayout getSldLayout();

   void setSldLayout(CTSlideLayout var1);

   CTSlideLayout addNewSldLayout();


   public static final class Factory {

      public static SldLayoutDocument newInstance() {
         return (SldLayoutDocument)POIXMLTypeLoader.newInstance(SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument newInstance(XmlOptions var0) {
         return (SldLayoutDocument)POIXMLTypeLoader.newInstance(SldLayoutDocument.type, var0);
      }

      public static SldLayoutDocument parse(String var0) throws XmlException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(File var0) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(URL var0) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(InputStream var0) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(Reader var0) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(XMLStreamReader var0) throws XmlException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(Node var0) throws XmlException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static SldLayoutDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static SldLayoutDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SldLayoutDocument)POIXMLTypeLoader.parse(var0, SldLayoutDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SldLayoutDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SldLayoutDocument.type, var1);
      }

   }
}
