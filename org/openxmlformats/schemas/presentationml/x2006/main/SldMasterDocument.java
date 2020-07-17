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
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMaster;
import org.w3c.dom.Node;

public interface SldMasterDocument extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(SldMasterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("sldmaster5156doctype");


   CTSlideMaster getSldMaster();

   void setSldMaster(CTSlideMaster var1);

   CTSlideMaster addNewSldMaster();


   public static final class Factory {

      public static SldMasterDocument newInstance() {
         return (SldMasterDocument)POIXMLTypeLoader.newInstance(SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument newInstance(XmlOptions var0) {
         return (SldMasterDocument)POIXMLTypeLoader.newInstance(SldMasterDocument.type, var0);
      }

      public static SldMasterDocument parse(String var0) throws XmlException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(String var0, XmlOptions var1) throws XmlException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(File var0) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(URL var0) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(InputStream var0) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(Reader var0) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(XMLStreamReader var0) throws XmlException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(Node var0) throws XmlException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(Node var0, XmlOptions var1) throws XmlException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static SldMasterDocument parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static SldMasterDocument parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (SldMasterDocument)POIXMLTypeLoader.parse(var0, SldMasterDocument.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SldMasterDocument.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, SldMasterDocument.type, var1);
      }

   }
}
