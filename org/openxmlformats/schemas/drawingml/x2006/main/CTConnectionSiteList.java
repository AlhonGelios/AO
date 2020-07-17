package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTConnectionSite;
import org.w3c.dom.Node;

public interface CTConnectionSiteList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTConnectionSiteList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctconnectionsitelistab9etype");


   List getCxnList();

   CTConnectionSite[] getCxnArray();

   CTConnectionSite getCxnArray(int var1);

   int sizeOfCxnArray();

   void setCxnArray(CTConnectionSite[] var1);

   void setCxnArray(int var1, CTConnectionSite var2);

   CTConnectionSite insertNewCxn(int var1);

   CTConnectionSite addNewCxn();

   void removeCxn(int var1);


   public static final class Factory {

      public static CTConnectionSiteList newInstance() {
         return (CTConnectionSiteList)POIXMLTypeLoader.newInstance(CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList newInstance(XmlOptions var0) {
         return (CTConnectionSiteList)POIXMLTypeLoader.newInstance(CTConnectionSiteList.type, var0);
      }

      public static CTConnectionSiteList parse(String var0) throws XmlException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(File var0) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(URL var0) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(InputStream var0) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(Reader var0) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(XMLStreamReader var0) throws XmlException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(Node var0) throws XmlException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static CTConnectionSiteList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static CTConnectionSiteList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTConnectionSiteList)POIXMLTypeLoader.parse(var0, CTConnectionSiteList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnectionSiteList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTConnectionSiteList.type, var1);
      }

   }
}
