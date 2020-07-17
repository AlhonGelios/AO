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
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocumentBase;
import org.w3c.dom.Node;

public interface CTDocument1 extends CTDocumentBase {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdocument64adtype");


   CTBody getBody();

   boolean isSetBody();

   void setBody(CTBody var1);

   CTBody addNewBody();

   void unsetBody();


   public static final class Factory {

      public static CTDocument1 newInstance() {
         return (CTDocument1)POIXMLTypeLoader.newInstance(CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 newInstance(XmlOptions var0) {
         return (CTDocument1)POIXMLTypeLoader.newInstance(CTDocument1.type, var0);
      }

      public static CTDocument1 parse(String var0) throws XmlException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(File var0) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(URL var0) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(InputStream var0) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(Reader var0) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(XMLStreamReader var0) throws XmlException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(Node var0) throws XmlException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static CTDocument1 parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static CTDocument1 parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDocument1)POIXMLTypeLoader.parse(var0, CTDocument1.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocument1.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocument1.type, var1);
      }

   }
}
