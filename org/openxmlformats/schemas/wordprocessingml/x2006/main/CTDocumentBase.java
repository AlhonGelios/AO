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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBackground;
import org.w3c.dom.Node;

public interface CTDocumentBase extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDocumentBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdocumentbasedf5ctype");


   CTBackground getBackground();

   boolean isSetBackground();

   void setBackground(CTBackground var1);

   CTBackground addNewBackground();

   void unsetBackground();


   public static final class Factory {

      public static CTDocumentBase newInstance() {
         return (CTDocumentBase)POIXMLTypeLoader.newInstance(CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase newInstance(XmlOptions var0) {
         return (CTDocumentBase)POIXMLTypeLoader.newInstance(CTDocumentBase.type, var0);
      }

      public static CTDocumentBase parse(String var0) throws XmlException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(File var0) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(URL var0) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(InputStream var0) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(Reader var0) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(XMLStreamReader var0) throws XmlException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(Node var0) throws XmlException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static CTDocumentBase parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static CTDocumentBase parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDocumentBase)POIXMLTypeLoader.parse(var0, CTDocumentBase.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocumentBase.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocumentBase.type, var1);
      }

   }
}
