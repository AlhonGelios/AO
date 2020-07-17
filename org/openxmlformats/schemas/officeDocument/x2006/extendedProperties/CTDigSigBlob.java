package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTDigSigBlob extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDigSigBlob.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdigsigblob73c9type");


   byte[] getBlob();

   XmlBase64Binary xgetBlob();

   void setBlob(byte[] var1);

   void xsetBlob(XmlBase64Binary var1);


   public static final class Factory {

      public static CTDigSigBlob newInstance() {
         return (CTDigSigBlob)POIXMLTypeLoader.newInstance(CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob newInstance(XmlOptions var0) {
         return (CTDigSigBlob)POIXMLTypeLoader.newInstance(CTDigSigBlob.type, var0);
      }

      public static CTDigSigBlob parse(String var0) throws XmlException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(File var0) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(URL var0) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(InputStream var0) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(Reader var0) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(XMLStreamReader var0) throws XmlException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(Node var0) throws XmlException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static CTDigSigBlob parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static CTDigSigBlob parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDigSigBlob)POIXMLTypeLoader.parse(var0, CTDigSigBlob.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDigSigBlob.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDigSigBlob.type, var1);
      }

   }
}
