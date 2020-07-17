package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSst;
import org.w3c.dom.Node;

public interface SstDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SstDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sstf81fdoctype");


   CTSst getSst();

   void setSst(CTSst var1);

   CTSst addNewSst();


   public static final class Factory {

      public static SstDocument newInstance() {
         return (SstDocument)POIXMLTypeLoader.newInstance(SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument newInstance(XmlOptions var0) {
         return (SstDocument)POIXMLTypeLoader.newInstance(SstDocument.type, var0);
      }

      public static SstDocument parse(String var0) throws XmlException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(File var0) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(URL var0) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(InputStream var0) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(Reader var0) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(XMLStreamReader var0) throws XmlException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(Node var0) throws XmlException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static SstDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, (XmlOptions)null);
      }

      public static SstDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SstDocument)POIXMLTypeLoader.parse(var0, SstDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SstDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SstDocument.type, var1);
      }

   }
}
