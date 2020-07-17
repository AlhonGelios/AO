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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPrDefault;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPrDefault;
import org.w3c.dom.Node;

public interface CTDocDefaults extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDocDefaults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdocdefaults2ea8type");


   CTRPrDefault getRPrDefault();

   boolean isSetRPrDefault();

   void setRPrDefault(CTRPrDefault var1);

   CTRPrDefault addNewRPrDefault();

   void unsetRPrDefault();

   CTPPrDefault getPPrDefault();

   boolean isSetPPrDefault();

   void setPPrDefault(CTPPrDefault var1);

   CTPPrDefault addNewPPrDefault();

   void unsetPPrDefault();


   public static final class Factory {

      public static CTDocDefaults newInstance() {
         return (CTDocDefaults)POIXMLTypeLoader.newInstance(CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults newInstance(XmlOptions var0) {
         return (CTDocDefaults)POIXMLTypeLoader.newInstance(CTDocDefaults.type, var0);
      }

      public static CTDocDefaults parse(String var0) throws XmlException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(File var0) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(URL var0) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(InputStream var0) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(Reader var0) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(XMLStreamReader var0) throws XmlException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(Node var0) throws XmlException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static CTDocDefaults parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static CTDocDefaults parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDocDefaults)POIXMLTypeLoader.parse(var0, CTDocDefaults.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocDefaults.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDocDefaults.type, var1);
      }

   }
}
