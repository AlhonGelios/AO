package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHdrFtr;
import org.w3c.dom.Node;

public interface FtrDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FtrDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ftre182doctype");


   CTHdrFtr getFtr();

   void setFtr(CTHdrFtr var1);

   CTHdrFtr addNewFtr();


   public static final class Factory {

      public static FtrDocument newInstance() {
         return (FtrDocument)POIXMLTypeLoader.newInstance(FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument newInstance(XmlOptions var0) {
         return (FtrDocument)POIXMLTypeLoader.newInstance(FtrDocument.type, var0);
      }

      public static FtrDocument parse(String var0) throws XmlException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(File var0) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(URL var0) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(InputStream var0) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(Reader var0) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(XMLStreamReader var0) throws XmlException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(Node var0) throws XmlException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static FtrDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static FtrDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (FtrDocument)POIXMLTypeLoader.parse(var0, FtrDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, FtrDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, FtrDocument.type, var1);
      }

   }
}
