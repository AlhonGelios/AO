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

public interface HdrDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(HdrDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("hdra530doctype");


   CTHdrFtr getHdr();

   void setHdr(CTHdrFtr var1);

   CTHdrFtr addNewHdr();


   public static final class Factory {

      public static HdrDocument newInstance() {
         return (HdrDocument)POIXMLTypeLoader.newInstance(HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument newInstance(XmlOptions var0) {
         return (HdrDocument)POIXMLTypeLoader.newInstance(HdrDocument.type, var0);
      }

      public static HdrDocument parse(String var0) throws XmlException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(File var0) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(URL var0) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(InputStream var0) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(Reader var0) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(XMLStreamReader var0) throws XmlException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(Node var0) throws XmlException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static HdrDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static HdrDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (HdrDocument)POIXMLTypeLoader.parse(var0, HdrDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, HdrDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, HdrDocument.type, var1);
      }

   }
}
