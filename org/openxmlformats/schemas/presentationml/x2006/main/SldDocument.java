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
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.w3c.dom.Node;

public interface SldDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SldDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sld1b98doctype");


   CTSlide getSld();

   void setSld(CTSlide var1);

   CTSlide addNewSld();


   public static final class Factory {

      public static SldDocument newInstance() {
         return (SldDocument)POIXMLTypeLoader.newInstance(SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument newInstance(XmlOptions var0) {
         return (SldDocument)POIXMLTypeLoader.newInstance(SldDocument.type, var0);
      }

      public static SldDocument parse(String var0) throws XmlException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(File var0) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(URL var0) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(InputStream var0) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(Reader var0) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(XMLStreamReader var0) throws XmlException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(Node var0) throws XmlException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static SldDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, (XmlOptions)null);
      }

      public static SldDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SldDocument)POIXMLTypeLoader.parse(var0, SldDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SldDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SldDocument.type, var1);
      }

   }
}
