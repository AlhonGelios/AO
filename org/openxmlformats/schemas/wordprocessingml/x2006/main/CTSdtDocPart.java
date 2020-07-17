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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.w3c.dom.Node;

public interface CTSdtDocPart extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSdtDocPart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsdtdocpartcea0type");


   CTString getDocPartGallery();

   boolean isSetDocPartGallery();

   void setDocPartGallery(CTString var1);

   CTString addNewDocPartGallery();

   void unsetDocPartGallery();

   CTString getDocPartCategory();

   boolean isSetDocPartCategory();

   void setDocPartCategory(CTString var1);

   CTString addNewDocPartCategory();

   void unsetDocPartCategory();

   CTOnOff getDocPartUnique();

   boolean isSetDocPartUnique();

   void setDocPartUnique(CTOnOff var1);

   CTOnOff addNewDocPartUnique();

   void unsetDocPartUnique();


   public static final class Factory {

      public static CTSdtDocPart newInstance() {
         return (CTSdtDocPart)POIXMLTypeLoader.newInstance(CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart newInstance(XmlOptions var0) {
         return (CTSdtDocPart)POIXMLTypeLoader.newInstance(CTSdtDocPart.type, var0);
      }

      public static CTSdtDocPart parse(String var0) throws XmlException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(File var0) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(URL var0) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(InputStream var0) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(Reader var0) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(XMLStreamReader var0) throws XmlException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(Node var0) throws XmlException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static CTSdtDocPart parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static CTSdtDocPart parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSdtDocPart)POIXMLTypeLoader.parse(var0, CTSdtDocPart.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtDocPart.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtDocPart.type, var1);
      }

   }
}
