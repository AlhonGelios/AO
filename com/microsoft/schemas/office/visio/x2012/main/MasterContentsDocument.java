package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.PageContentsType;
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

public interface MasterContentsDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(MasterContentsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("mastercontentscb9edoctype");


   PageContentsType getMasterContents();

   void setMasterContents(PageContentsType var1);

   PageContentsType addNewMasterContents();


   public static final class Factory {

      public static MasterContentsDocument newInstance() {
         return (MasterContentsDocument)POIXMLTypeLoader.newInstance(MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument newInstance(XmlOptions var0) {
         return (MasterContentsDocument)POIXMLTypeLoader.newInstance(MasterContentsDocument.type, var0);
      }

      public static MasterContentsDocument parse(String var0) throws XmlException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(File var0) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(URL var0) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(InputStream var0) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(Reader var0) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(XMLStreamReader var0) throws XmlException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(Node var0) throws XmlException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static MasterContentsDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static MasterContentsDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (MasterContentsDocument)POIXMLTypeLoader.parse(var0, MasterContentsDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MasterContentsDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MasterContentsDocument.type, var1);
      }

   }
}
