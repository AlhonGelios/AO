package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.MastersType;
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
import org.w3c.dom.Node;

public interface MastersDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(MastersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("masters0341doctype");


   MastersType getMasters();

   void setMasters(MastersType var1);

   MastersType addNewMasters();


   public static final class Factory {

      public static MastersDocument newInstance() {
         return (MastersDocument)POIXMLTypeLoader.newInstance(MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument newInstance(XmlOptions var0) {
         return (MastersDocument)POIXMLTypeLoader.newInstance(MastersDocument.type, var0);
      }

      public static MastersDocument parse(String var0) throws XmlException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(File var0) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(URL var0) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(InputStream var0) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(Reader var0) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(XMLStreamReader var0) throws XmlException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(Node var0) throws XmlException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static MastersDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static MastersDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (MastersDocument)POIXMLTypeLoader.parse(var0, MastersDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MastersDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MastersDocument.type, var1);
      }

   }
}
